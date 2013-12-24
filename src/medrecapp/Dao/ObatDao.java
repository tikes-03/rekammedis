/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import medrecapp.Entity.Obat;
import medrecapp.Interfaces.ObatInterface;

/**
 *
 * @author Yuan
 */
public class ObatDao implements ObatInterface{
    
    private Connection connection;
    
    private final String insertObat = "INSERT INTO obat VALUES(?,?)";
    private final String updateObat = "UPDATE obat SET ket_obat=? WHERE id_obat=?";
    private final String deleteObat = "DELETE FROM obat WHERE id_obat=?";
    private final String getAllObat = "SELECT * FROM obat";
    
    public ObatDao(Connection connection){
        this.connection = connection;
    }

    public void insertObat(Obat ob) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(insertObat);
            ps.setString(1, ob.getIdObat());
            ps.setString(2, ob.getKetObat());
            ps.executeUpdate();
            ps.close();
            //JOptionPane.showMessageDialog(null, "Data obat berhasil ditambah","Insert Obat", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Insert obat berhasil <--");
        }catch(SQLException se){
            //JOptionPane.showMessageDialog(null, se.getMessage(),"Insert Obat Gagal", JOptionPane.ERROR_MESSAGE);
            System.out.println("Insert obat gagal");
        }
    }

    public void updateObat(Obat ob, String idObat) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(updateObat);
            ps.setString(1, ob.getKetObat());
            ps.setString(2, idObat);
            ps.executeUpdate();
            ps.close();
            //JOptionPane.showMessageDialog(null, "Data obat berhasil diubah","Update Obat",JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Update obat berhasil <--");
        }catch(SQLException se){
            //JOptionPane.showMessageDialog(null, se.getMessage(),"Update Obat Gagal",JOptionPane.ERROR_MESSAGE);
            System.out.println("Update obat gagal");
        }
    }

    public void deleteObat(String idObat) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(deleteObat);
            ps.setString(1, idObat);
            ps.executeUpdate();
            ps.close();
            //JOptionPane.showMessageDialog(null, "Data Obat Berhasil dihapus","Delete Obat",JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Delete obat berhasil <--");
        }catch(SQLException se){
            //JOptionPane.showMessageDialog(null, se.getMessage(),"Delete Obat Gagal",JOptionPane.ERROR_MESSAGE);
            System.out.println("Delete obat gagal");
        }
    }

    public List getAllObat() throws SQLException {
        try{
            List list = new ArrayList();
            Statement s = (Statement) connection.createStatement();
            ResultSet rs = s.executeQuery(getAllObat);
            while(rs.next()){
                Obat ob = new Obat();
                ob.setIdObat(rs.getString("id_obat"));
                ob.setKetObat(rs.getString("ket_obat"));
                list.add(ob);
            }
            rs.close();
            s.close();
            return list;
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Get All Dokter Gagal!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
}
