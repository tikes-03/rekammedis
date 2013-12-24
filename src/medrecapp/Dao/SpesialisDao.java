/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import medrecapp.Entity.Spesialis;
import medrecapp.Interfaces.SpesialisInterface;

/**
 *
 * @author Fachrul Pralienka BM
 */
public class SpesialisDao implements SpesialisInterface{
    
    private Connection connection;

    // Query standar untuk CRUD
    private final String insertSpesialis = "INSERT INTO spesialis VALUES(?,?,?)";
    private final String updateSpesialis = "UPDATE spesialis SET nm_spesialis=?, tarif_konsul=? WHERE id_spesialis=?";
    private final String deleteSpesialis = "DELETE FROM spesialis WHERE id_spesialis=?";
    private final String getAllSpesialis = "SELECT * FROM spesialis";

    // Query untuk mengambil nilai ID dari JComboBox by nama
    private final String getIDSpesialis = "SELECT * FROM spesialis WHERE nm_spesialis=?";

    // Query untuk mengambil nama spesialis dari tabel by id
    private final String getNmSpesialis = "SELECT * FROM spesialis WHERE id_spesialis=?";

    public SpesialisDao(Connection connection) {
        this.connection = connection;
    }

    public void insertSpesialis(Spesialis s) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(insertSpesialis);
            ps.setString(1, s.getIdSpesialis());
            ps.setString(2, s.getNmSpesialis());
            ps.setInt(3, s.getTarifKonsul());       
            ps.executeUpdate();
            ps.close();
            //JOptionPane.showMessageDialog(null, "Data spesialis berhasil ditambah!", "Insert Spesialis", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Insert spesialis berhasil <--");
        }catch(SQLException se){
            //JOptionPane.showMessageDialog(null, se.getMessage(),"Insert Spesialis Gagal!",JOptionPane.ERROR_MESSAGE);
            System.out.println("Insert spesialis gagal");
        }
    }

    public void updateSpesialis(Spesialis s, String idSpesialis) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(updateSpesialis);
            ps.setString(1, s.getNmSpesialis());
            ps.setInt(2, s.getTarifKonsul());
            ps.setString(3, idSpesialis);
            ps.executeUpdate();
            ps.close();
            //JOptionPane.showMessageDialog(null, "Data spesialis berhasil diubah!", "Update Spesialis", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Update spesialis berhasil <--");
        }catch(SQLException se){
            //JOptionPane.showMessageDialog(null, se.getMessage(),"Update Spesialis Gagal!",JOptionPane.ERROR_MESSAGE);
            System.out.println("Update spesialis gagal");
        }
    }

    public void deleteSpesialis(String idSpesialis) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(deleteSpesialis);
            ps.setString(1, idSpesialis);
            ps.executeUpdate();
            ps.close();
            //JOptionPane.showMessageDialog(null, "Data spesialis berhasil dihapus!","Delete Spesialis",JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Delete spesialis berhasil <--");
        }catch(SQLException se){
            //JOptionPane.showMessageDialog(null, se.getMessage(),"Delete Spesialis Gagal!",JOptionPane.ERROR_MESSAGE);
            System.out.println("Delete spesialis gagal");
        }
    }

    public List getAllSpesialis() throws SQLException {
        try{
            List list = new ArrayList();
            Statement s = (Statement) connection.createStatement();
            ResultSet rs = s.executeQuery(getAllSpesialis);
            while(rs.next()){
                Spesialis sp = new Spesialis();
                sp.setIdSpesialis(rs.getString("id_spesialis"));
                sp.setNmSpesialis(rs.getString("nm_spesialis"));
                sp.setTarifKonsul(rs.getInt("tarif_konsul"));
                list.add(sp);
            }
            rs.close();
            s.close();
            return list;
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Get All Spesialis Gagal!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String[] getAllNmSpesialis(int row) throws SQLException {
        try{
            String[] data = new String[row];
            Statement st = (Statement) connection.createStatement();
            ResultSet rs = st.executeQuery(getAllSpesialis);
            Spesialis sp = new Spesialis();
            while(rs.next()){
                sp.setNmSpesialis (rs.getString("nm_spesialis"));
                String nmSpesialis = sp.getNmSpesialis();
                data[rs.getRow()-1] = nmSpesialis;
            }
            st.close();
            rs.close();
            return data;
        }catch(Throwable t){
            JOptionPane.showMessageDialog(null, t.getMessage(), "Error - Get Nama Spesialis", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String getIDSpesialis(String nama) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(getIDSpesialis);
            ps.setString(1, nama);
            ResultSet rs = ps.executeQuery();
            Spesialis sp = new Spesialis();
            String pop = null;
            while(rs.next()){
                sp.setIdSpesialis (rs.getString("id_spesialis"));
                pop = sp.getIdSpesialis();
            }
            ps.close();
            rs.close();
            return pop;
        }catch(Throwable t){
            JOptionPane.showMessageDialog(null, t.getMessage(), "Error - Get ID Spesialis", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public String getNmSpesialis(String id) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(getNmSpesialis);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            Spesialis sp = new Spesialis();
            String pop = null;
            while(rs.next()){
                sp.setIdSpesialis (rs.getString("nm_spesialis"));
                pop = sp.getIdSpesialis();
            }
            ps.close();
            rs.close();
            return pop;
        }catch(Throwable t){
            JOptionPane.showMessageDialog(null, t.getMessage(), "Error - Get ID Spesialis", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }



}
