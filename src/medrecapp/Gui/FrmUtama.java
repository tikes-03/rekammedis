/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmUtama.java
 *
 * Created on Dec 19, 2013, 11:15:55 AM
 */

package medrecapp.Gui;

import java.awt.Dimension;

/**
 *
 * @author Fachrul Pralienka BM
 */
public class FrmUtama extends javax.swing.JFrame {

    /** Creates new form FrmUtama */
    public FrmUtama() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenuItem();
        menuMaster = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        menuDokter = new javax.swing.JMenuItem();
        menuPerawat = new javax.swing.JMenuItem();
        menuStaf = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuSpesialis = new javax.swing.JMenuItem();
        menuJaminan = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuPasien = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuObat = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menuPendaftaranPasLama = new javax.swing.JMenuItem();
        menuPendaftaranPasBaru = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuPoliDalam = new javax.swing.JMenuItem();
        menuPoliJantung = new javax.swing.JMenuItem();
        menuPoliParu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(127, 208, 215));

        menuFile.setText("File");

        menuExit.setText("Exit");
        menuFile.add(menuExit);

        jMenuBar1.add(menuFile);

        menuMaster.setText("Data Master");

        jMenu1.setText("SDM");

        menuDokter.setText("Data Dokter");
        menuDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDokterActionPerformed(evt);
            }
        });
        jMenu1.add(menuDokter);

        menuPerawat.setText("Data Perawat");
        menuPerawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPerawatActionPerformed(evt);
            }
        });
        jMenu1.add(menuPerawat);

        menuStaf.setText("Data Staf");
        menuStaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuStafActionPerformed(evt);
            }
        });
        jMenu1.add(menuStaf);

        menuMaster.add(jMenu1);
        menuMaster.add(jSeparator3);

        menuSpesialis.setText("Data Spesialis");
        menuSpesialis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSpesialisActionPerformed(evt);
            }
        });
        menuMaster.add(menuSpesialis);

        menuJaminan.setText("Data Jaminan");
        menuJaminan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuJaminanActionPerformed(evt);
            }
        });
        menuMaster.add(menuJaminan);
        menuMaster.add(jSeparator1);

        menuPasien.setText("Data Pasien");
        menuPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPasienActionPerformed(evt);
            }
        });
        menuMaster.add(menuPasien);
        menuMaster.add(jSeparator2);

        menuObat.setText("Data Obat");
        menuObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuObatActionPerformed(evt);
            }
        });
        menuMaster.add(menuObat);

        jMenuBar1.add(menuMaster);

        jMenu2.setText("Pendaftaran");

        jMenu3.setText("Registrasi Pasien");

        menuPendaftaranPasLama.setText("Pasien Lama");
        jMenu3.add(menuPendaftaranPasLama);

        menuPendaftaranPasBaru.setText("Pasien Baru");
        menuPendaftaranPasBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPendaftaranPasBaruActionPerformed(evt);
            }
        });
        jMenu3.add(menuPendaftaranPasBaru);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Poliklinik");

        menuPoliDalam.setText("Poliklinik Penyakit Dalam");
        jMenu4.add(menuPoliDalam);

        menuPoliJantung.setText("Poliklinik Penyakit Jantung");
        jMenu4.add(menuPoliJantung);

        menuPoliParu.setText("Poliklinik Penyakit Paru-paru");
        jMenu4.add(menuPoliParu);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSpesialisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSpesialisActionPerformed
        // TODO add your handling code here:
        /*
        FrmIntSpesialis fis = new FrmIntSpesialis();
        Dimension parentSize = jDesktopPane1.getSize();
        Dimension childSize = fis.getSize();
        fis.setLocation((parentSize.width - childSize.width) / 2, (parentSize.height - childSize.height) / 2);
        jDesktopPane1.add(fis);
        fis.show();
        fis.toFront();
        */
    }//GEN-LAST:event_menuSpesialisActionPerformed

    private void menuPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPasienActionPerformed
        // TODO add your handling code here:
        
        //FrmIntDataPasien fip = new FrmIntDataPasien();
        //fip.setSize(jDesktopPane1.getSize());        /**************** MAXIMIZE Internal Frame *****************/
        //Dimension parentSize = jDesktopPane1.getSize();
        //Dimension childSize = fip.getSize();
        //fip.setLocation((parentSize.width - childSize.width)/2, (parentSize.height - childSize.height)/2);
        //jDesktopPane1.add(fip);
        //fip.show();
        //fip.toFront();
    }//GEN-LAST:event_menuPasienActionPerformed

    private void menuJaminanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJaminanActionPerformed
        // TODO add your handling code here:
        FrmIntJaminan fis = new FrmIntJaminan();
        Dimension parentSize = jDesktopPane1.getSize();
        Dimension childSize = fis.getSize();
        fis.setLocation((parentSize.width - childSize.width) / 2, (parentSize.height - childSize.height) / 2);
        jDesktopPane1.add(fis);
        fis.show();
        fis.toFront();
    }//GEN-LAST:event_menuJaminanActionPerformed

    private void menuObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuObatActionPerformed
        // TODO add your handling code here:
        FrmIntObat fis = new FrmIntObat();
        Dimension parentSize = jDesktopPane1.getSize();
        Dimension childSize = fis.getSize();
        fis.setLocation((parentSize.width - childSize.width) / 2, (parentSize.height - childSize.height) / 2);
        jDesktopPane1.add(fis);
        fis.show();
        fis.toFront();
    }//GEN-LAST:event_menuObatActionPerformed

    private void menuDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDokterActionPerformed
        // TODO add your handling code here:
        FrmIntDokter fis = new FrmIntDokter();
        Dimension parentSize = jDesktopPane1.getSize();
        Dimension childSize = fis.getSize();
        fis.setLocation((parentSize.width - childSize.width) / 2, (parentSize.height - childSize.height) / 2);
        jDesktopPane1.add(fis);
        fis.show();
        fis.toFront();
    }//GEN-LAST:event_menuDokterActionPerformed

    private void menuPerawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPerawatActionPerformed
        // TODO add your handling code here:
        FrmIntPerawat fis = new FrmIntPerawat();
        Dimension parentSize = jDesktopPane1.getSize();
        Dimension childSize = fis.getSize();
        fis.setLocation((parentSize.width - childSize.width) / 2, (parentSize.height - childSize.height) / 2);
        jDesktopPane1.add(fis);
        fis.show();
        fis.toFront();
    }//GEN-LAST:event_menuPerawatActionPerformed

    private void menuStafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuStafActionPerformed
        // TODO add your handling code here:
        FrmIntStaf fis = new FrmIntStaf();
        Dimension parentSize = jDesktopPane1.getSize();
        Dimension childSize = fis.getSize();
        fis.setLocation((parentSize.width - childSize.width) / 2, (parentSize.height - childSize.height) / 2);
        jDesktopPane1.add(fis);
        fis.show();
        fis.toFront();
    }//GEN-LAST:event_menuStafActionPerformed

    private void menuPendaftaranPasBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPendaftaranPasBaruActionPerformed
        // TODO add your handling code here:
        /*
        FrmIntPasien fis = new FrmIntPasien();
        Dimension parentSize = jDesktopPane1.getSize();
        Dimension childSize = fis.getSize();
        fis.setLocation((parentSize.width - childSize.width) / 2, (parentSize.height - childSize.height) / 2);
        jDesktopPane1.add(fis);
        fis.show();
        fis.toFront();
        */
    }//GEN-LAST:event_menuPendaftaranPasBaruActionPerformed

    /**
    * @param args the command line arguments
    */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmUtama().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem menuDokter;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuJaminan;
    private javax.swing.JMenu menuMaster;
    private javax.swing.JMenuItem menuObat;
    private javax.swing.JMenuItem menuPasien;
    private javax.swing.JMenuItem menuPendaftaranPasBaru;
    private javax.swing.JMenuItem menuPendaftaranPasLama;
    private javax.swing.JMenuItem menuPerawat;
    private javax.swing.JMenuItem menuPoliDalam;
    private javax.swing.JMenuItem menuPoliJantung;
    private javax.swing.JMenuItem menuPoliParu;
    private javax.swing.JMenuItem menuSpesialis;
    private javax.swing.JMenuItem menuStaf;
    // End of variables declaration//GEN-END:variables

}
