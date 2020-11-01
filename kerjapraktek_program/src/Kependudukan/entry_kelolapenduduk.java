package Kependudukan;
import Kependudukan.koneksi;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.table.TableColumn;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class entry_kelolapenduduk extends javax.swing.JDialog {
    DefaultTableModel tabel = new DefaultTableModel();
    DefaultTableModel tabel2 = new DefaultTableModel();

    public entry_kelolapenduduk(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
   //     tampil_tb_penduduk();
        disableForm();
        getTable();
        lebarKolom();
        loadData();
    }

   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonnew = new javax.swing.JButton();
        jButtonedit = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();
        jButtonsimpanB = new javax.swing.JButton();
        jButtonbatal = new javax.swing.JButton();
        jButtonkembali = new javax.swing.JButton();
        jButtonsimpanA = new javax.swing.JButton();
        txt_cari_penduduk = new javax.swing.JTextField();
        btn_cari_penduduk = new javax.swing.JButton();
        btn_edit_buku1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jnokk = new javax.swing.JTextField();
        jnik = new javax.swing.JTextField();
        jnamalengkap = new javax.swing.JTextField();
        cmbjk = new javax.swing.JComboBox();
        cmbstatusmerital = new javax.swing.JComboBox();
        jtempatlahir = new javax.swing.JTextField();
        jDateChoosertanggallahir = new com.toedter.calendar.JDateChooser();
        jumur = new javax.swing.JTextField();
        jpendidikanterakhir = new javax.swing.JTextField();
        jpekerjaan = new javax.swing.JTextField();
        cmbstatusdalamkeluarga = new javax.swing.JComboBox();
        cmbrt = new javax.swing.JComboBox();
        cmbstatuspenduduk = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No. KK", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonnew.setText("Tambah");
        jButtonnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnewActionPerformed(evt);
            }
        });

        jButtonedit.setText("Edit");
        jButtonedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoneditActionPerformed(evt);
            }
        });

        jButtondelete.setText("Delete");
        jButtondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeleteActionPerformed(evt);
            }
        });

        jButtonsimpanB.setText("Simpan");
        jButtonsimpanB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsimpanBActionPerformed(evt);
            }
        });

        jButtonbatal.setText("Batal");
        jButtonbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbatalActionPerformed(evt);
            }
        });

        jButtonkembali.setText("Kembali");
        jButtonkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonkembaliActionPerformed(evt);
            }
        });

        jButtonsimpanA.setText("Simpan");
        jButtonsimpanA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsimpanAActionPerformed(evt);
            }
        });

        txt_cari_penduduk.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_cari_penduduk.setToolTipText("Cari Penduduk");
        txt_cari_penduduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cari_pendudukActionPerformed(evt);
            }
        });

        btn_cari_penduduk.setText("Cari");
        btn_cari_penduduk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cari_penduduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cari_pendudukMouseClicked(evt);
            }
        });
        btn_cari_penduduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cari_pendudukActionPerformed(evt);
            }
        });

        btn_edit_buku1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Uparrow2.png"))); // NOI18N
        btn_edit_buku1.setText("  Segarkan Tabel");
        btn_edit_buku1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_edit_buku1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_buku1ActionPerformed(evt);
            }
        });

        jLabel1.setText("No KK");

        jLabel2.setText("NIK");

        jLabel3.setText("Nama Lengkap");

        jLabel4.setText("Jenis Kelamin");

        jLabel10.setText("Status Merital");

        jLabel11.setText("Tempat Lahir");

        jLabel5.setText("Tanggal Lahir");

        jLabel6.setText("Umur");

        jLabel12.setText("Pendidikan Terakhir");

        jLabel8.setText("Pekerjaan");

        jLabel7.setText("Status dalam Keluarga");

        jLabel9.setText("RT");

        jLabel14.setText("Status Penduduk");

        jnokk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnokkActionPerformed(evt);
            }
        });

        jnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnikActionPerformed(evt);
            }
        });

        cmbjk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "L", "P" }));

        cmbstatusmerital.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Belum Menikah", "Menikah", "Duda", "Janda" }));
        cmbstatusmerital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbstatusmeritalActionPerformed(evt);
            }
        });

        jtempatlahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtempatlahirActionPerformed(evt);
            }
        });

        jumur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumurActionPerformed(evt);
            }
        });

        cmbstatusdalamkeluarga.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KK", "Istri", "Anak" }));

        cmbrt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        cmbrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbrtActionPerformed(evt);
            }
        });

        cmbstatuspenduduk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aktif", "Pasif" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbjk, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtempatlahir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChoosertanggallahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbstatusmerital, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jnamalengkap)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jnik)
                            .addComponent(jnokk)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpendidikanterakhir, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jumur, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(cmbstatusdalamkeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbrt, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbstatuspenduduk, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jnokk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jnamalengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbjk, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbstatusmerital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jtempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(jDateChoosertanggallahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpendidikanterakhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(cmbrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbstatuspenduduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbstatusdalamkeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)))
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel13.setText("TAMBAH PENDUDUK BARU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(519, 519, 519)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonnew)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonedit)
                                .addGap(18, 18, 18)
                                .addComponent(jButtondelete))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jButtonsimpanB, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonsimpanA, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_cari_penduduk)
                                .addGap(1, 1, 1)
                                .addComponent(txt_cari_penduduk, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_edit_buku1))
                                .addGap(50, 50, 50))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 977, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtondelete)
                                    .addComponent(jButtonedit)
                                    .addComponent(jButtonnew)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(433, 433, 433)
                        .addComponent(btn_edit_buku1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonbatal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonkembali))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cari_penduduk)
                            .addComponent(txt_cari_penduduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonsimpanB)
                            .addComponent(jButtonsimpanA))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        //    if(evt.getClickCount()==1){
            //        try {
                //            jDateChooserttl.setDate(getTanggalFromTable(jTable1,5));
                //        } catch (ParseException ex) {
                //            Logger.getLogger(form_entry_penduduk.class.getName()).log(Level.SEVERE, null, ex);
                //        }
            //    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MousePressed

    private void jButtonnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnewActionPerformed

            jButtonsimpanB.setEnabled(true);
            jButtonnew.setEnabled(false);
            jButtondelete.setEnabled(false);
            
            jnokk.setEditable(true);
            
            jnik.setEditable(true);
            jnamalengkap.setEditable(true);
            cmbjk.setEnabled(true);
            cmbstatusmerital.setEnabled(true);
            jtempatlahir.setEditable(true);
            jDateChoosertanggallahir.setVisible(true);
            jumur.setEditable(true);
            jpendidikanterakhir.setEditable(true);
            jpekerjaan.setEditable(true);
            cmbstatusdalamkeluarga.setEnabled(true);
            cmbrt.setEnabled(true);
            cmbstatuspenduduk.setEnabled(true);

            jButtonsimpanB.setVisible(true);
            jButtonsimpanA.setVisible(false);
            jButtonkembali.setVisible(true);
            jButtonbatal.setVisible(true);
        //        AutoNumber();
    }//GEN-LAST:event_jButtonnewActionPerformed

    private void jButtoneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneditActionPerformed
        try {
            klik();
            jButtonsimpanB.setEnabled(true);
            jButtonnew.setEnabled(false);
            jButtondelete.setEnabled(false);
            
            jnokk.setEditable(false);
            
            jnik.setEditable(true);
            jnamalengkap.setEditable(true);
            cmbjk.setEnabled(true);
            cmbstatusmerital.setEnabled(true);
            jtempatlahir.setEditable(true);
            jDateChoosertanggallahir.setVisible(true);
            jumur.setEditable(true);
            jpendidikanterakhir.setEditable(true);
            jpekerjaan.setEditable(true);
            cmbstatusdalamkeluarga.setEnabled(true);
            cmbrt.setEnabled(true);
            cmbstatuspenduduk.setEnabled(true);

            jButtonsimpanB.setVisible(true);
            jButtonsimpanA.setVisible(false);
            jButtonkembali.setVisible(true);
            jButtonbatal.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tidak ada data yang dipilih !");
        }
    }//GEN-LAST:event_jButtoneditActionPerformed

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
        JOptionPane.showConfirmDialog(rootPane, "Anda ingin menghapus ?");
        hapus();
        loadData();
    }//GEN-LAST:event_jButtondeleteActionPerformed

    private void jButtonsimpanBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsimpanBActionPerformed
        if (jnokk.getText().equals("") || jnik.getText().equals("") || jnamalengkap.getText().equals("") || cmbjk.getSelectedItem().equals("") || cmbstatusmerital.getSelectedItem().equals("")|| jtempatlahir.getText().equals("")|| jDateChoosertanggallahir.getDate().equals("") || jumur.getText().equals("") || jpendidikanterakhir.getText().equals("")|| jpekerjaan.getText().equals("")|| cmbstatusdalamkeluarga.getSelectedItem().equals("")|| cmbrt.getSelectedItem().equals("")|| cmbstatuspenduduk.getSelectedItem().equals("") ) {
            JOptionPane.showMessageDialog(rootPane, "Data tidak boleh ada yang kosong", "Pemberitahuan", JOptionPane.WARNING_MESSAGE);
        } else {
            ubah_data();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan !");

            //            SimpleDateFormat sdf;
            //            sdf=new SimpleDateFormat("yyyy-MM-dd");
            //            String getDate = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
            //            jDateChooserttl.getDate();
            //            AutoNumber();
        }
        loadData();
        jnokk.setText("");
        jnik.setText("");
        jnamalengkap.setText("");
        jtempatlahir.setText("");
        jumur.setText("");
        jpendidikanterakhir.setText("");
        jpekerjaan.setText("");
        //    rbstatus.setSelected(null, rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButtonsimpanBActionPerformed

    private void jButtonbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbatalActionPerformed
        disableForm();

    }//GEN-LAST:event_jButtonbatalActionPerformed

    private void jButtonkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonkembaliActionPerformed
    //new Frm_Home(this, rootPaneCheckingEnabled).setVisible(true);
    this.dispose();
        loadData();
    }//GEN-LAST:event_jButtonkembaliActionPerformed

    private void jButtonsimpanAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsimpanAActionPerformed
if (jnokk.getText().equals("") || jnik.getText().equals("") || jnamalengkap.getText().equals("") || cmbjk.getSelectedItem().equals("") || cmbstatusmerital.getSelectedItem().equals("")|| jtempatlahir.getText().equals("")|| jDateChoosertanggallahir.getDate().equals("") || jumur.getText().equals("") || jpendidikanterakhir.getText().equals("")|| jpekerjaan.getText().equals("")|| cmbstatusdalamkeluarga.getSelectedItem().equals("")|| cmbrt.getSelectedItem().equals("")|| cmbstatuspenduduk.getSelectedItem().equals("") ) {
            JOptionPane.showMessageDialog(rootPane, "Data tidak boleh ada yang kosong", "Pemberitahuan", JOptionPane.WARNING_MESSAGE);
        } else {
            simpan();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan !");
        }
        loadData();
        jnokk.setText("");
        jnamalengkap.setText("");
        jtempatlahir.setText("");
        jumur.setText("");
        jpendidikanterakhir.setText("");
        jpekerjaan.setText("");

    }//GEN-LAST:event_jButtonsimpanAActionPerformed

    private void txt_cari_pendudukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cari_pendudukActionPerformed
        pencarian_penduduk();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cari_pendudukActionPerformed

    private void btn_cari_pendudukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cari_pendudukMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cari_pendudukMouseClicked

    private void btn_cari_pendudukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cari_pendudukActionPerformed
        pencarian_penduduk();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cari_pendudukActionPerformed

    private void btn_edit_buku1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_buku1ActionPerformed
    
        loadData();
     txt_cari_penduduk.setText("");        // TODO add your handling code here:
       
    }//GEN-LAST:event_btn_edit_buku1ActionPerformed

    private void cmbrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbrtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbrtActionPerformed

    private void jumurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumurActionPerformed

    private void jtempatlahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtempatlahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtempatlahirActionPerformed

    private void cmbstatusmeritalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbstatusmeritalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbstatusmeritalActionPerformed

    private void jnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnikActionPerformed

    private void jnokkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnokkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnokkActionPerformed
 private void disableForm() {
        jButtonsimpanB.setEnabled(true);
        jButtonnew.setEnabled(true);
        jButtonedit.setEnabled(true);
        jButtondelete.setEnabled(true);
        
        jnokk.setEditable(false);
        jnik.setEditable(false);
        jnamalengkap.setEditable(false);
        cmbjk.setEnabled(false);
        cmbstatusmerital.setEnabled(false);
        jtempatlahir.setEditable(false);
        jDateChoosertanggallahir.setDate(null);
        jumur.setEditable(false);
        jpendidikanterakhir.setEditable(false);
        jpekerjaan.setEditable(false);
        cmbstatusdalamkeluarga.setEnabled(false);
        cmbrt.setEnabled(false);
        cmbstatuspenduduk.setEnabled(false);
        
        
        jButtonbatal.setVisible(false);
        jButtonsimpanA.setVisible(false);
        jButtonsimpanB.setVisible(false);
        
        jnokk.setText("");
        jnamalengkap.setText("");
        jtempatlahir.setText("");
        jumur.setText("");
        jpendidikanterakhir.setText("");
        jpekerjaan.setText("");
    }

    private void getTable() {
        tabel.addColumn("No. KK");
        tabel.addColumn("NIK");
        tabel.addColumn("Nama Lengkap");
        tabel.addColumn("JK");
        tabel.addColumn("Status Merital");
        tabel.addColumn("Tempat Lahir");
        tabel.addColumn("Tanggal Lahir");
        tabel.addColumn("Umur");
        tabel.addColumn("Pendidikan");
        tabel.addColumn("Pekerjaan");
        tabel.addColumn("Status dlm Keluarga");
        tabel.addColumn("RT"); 
        tabel.addColumn("Status"); 
        
        jTable1.setModel(tabel);
    }

    private void lebarKolom() {
        TableColumn lebar_kolom;

        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);

        lebar_kolom = jTable1.getColumnModel().getColumn(0); //nokk
        lebar_kolom.setPreferredWidth(100);
        lebar_kolom = jTable1.getColumnModel().getColumn(1); //nik
        lebar_kolom.setPreferredWidth(100);
        lebar_kolom = jTable1.getColumnModel().getColumn(2); //namalengkap
        lebar_kolom.setPreferredWidth(100);
        lebar_kolom = jTable1.getColumnModel().getColumn(3); //jk
        lebar_kolom.setPreferredWidth(30);
        lebar_kolom = jTable1.getColumnModel().getColumn(4); //statusmerital
        lebar_kolom.setPreferredWidth(100);
        lebar_kolom = jTable1.getColumnModel().getColumn(5); //tempatlahir
        lebar_kolom.setPreferredWidth(70);
        lebar_kolom = jTable1.getColumnModel().getColumn(6); //tanggallahir
        lebar_kolom.setPreferredWidth(70);
        lebar_kolom = jTable1.getColumnModel().getColumn(7); //umur
        lebar_kolom.setPreferredWidth(45);
        lebar_kolom = jTable1.getColumnModel().getColumn(8); //pendidikanterakhir
        lebar_kolom.setPreferredWidth(80);
        lebar_kolom = jTable1.getColumnModel().getColumn(9); //pekerjaan
        lebar_kolom.setPreferredWidth(100);
        lebar_kolom = jTable1.getColumnModel().getColumn(10); //statuskeluarga
        lebar_kolom.setPreferredWidth(100);
        lebar_kolom = jTable1.getColumnModel().getColumn(11); //rt
        lebar_kolom.setPreferredWidth(30);
        lebar_kolom = jTable1.getColumnModel().getColumn(12); //statuspenduduk
        lebar_kolom.setPreferredWidth(60);
    }

    private void loadData() {
        tabel.getDataVector().removeAllElements();
        tabel.fireTableDataChanged();
        try {
//            java.sql.Connection line_konek = new koneksi_2().getConnection();
            java.sql.Connection line_konek = (Connection) si_pergudangan.koneksi.konekDB.getDB();
            java.sql.Statement line_statemen = line_konek.createStatement();
            String query_bukaTabel = "select * from datapenduduk";
            java.sql.ResultSet line_result = line_statemen.executeQuery(query_bukaTabel);
            while (line_result.next()) {
                Object[] getO = new Object[13];
                getO[0] = line_result.getString("nokk");
                getO[1] = line_result.getString("nik");
                getO[2] = line_result.getString("namalengkap");
                getO[3] = line_result.getString("jk");
                getO[4] = line_result.getString("statusmerital");
                getO[5] = line_result.getString("tempatlahir");
                getO[6] = line_result.getString("tanggallahir");
                getO[7] = line_result.getString("umur");
                getO[8] = line_result.getString("pendidikanterakhir");
                getO[9] = line_result.getString("pekerjaan");
                getO[10] = line_result.getString("statusdalamkeluarga");
                getO[11] = line_result.getString("rt");
                getO[12] = line_result.getString("statuspenduduk");
                tabel.addRow(getO);
            }
            line_result.close();
            line_statemen.close();
        } catch (Exception e) {
        }
    }

    private void simpan() {
        String nokk = jnokk.getText();
        String nik = jnik.getText();
        String namalengkap = jnamalengkap.getText();
        String jk = cmbjk.getSelectedItem().toString();
        String statusmerital = cmbstatusmerital.getSelectedItem().toString();
        String tempatlahir = jtempatlahir.getText();
        java.sql.Date tanggallahir= new java.sql.Date(jDateChoosertanggallahir.getDate().getTime());
        String umur = jumur.getText();
        String pendidikanterakhir = jpendidikanterakhir.getText();
        String pekerjaan = jpekerjaan.getText();
        //ButtonModel status= rbstatus.getSelection();
        String statusdalamkeluarga = cmbstatusdalamkeluarga.getSelectedItem().toString();
        String rt = cmbrt.getSelectedItem().toString();
        String statuspenduduk = cmbstatuspenduduk.getSelectedItem().toString();
        
        try {
            Connection sql_query_koneksi = (Connection) si_pergudangan.koneksi.konekDB.getDB();
            java.sql.Statement sql_statement = sql_query_koneksi.createStatement();
            String query_input = "insert into datapenduduk values ('" + nokk + "','" + nik + "','" + namalengkap + "','" + jk + "','" + statusmerital + "','" + tempatlahir + "','" + tanggallahir+ "','" + umur + "','" + pendidikanterakhir + "','" + pekerjaan+ "','" + statusdalamkeluarga + "','" + rt + "','" + statuspenduduk + "')";
            
            sql_statement.executeUpdate(query_input);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal Memasukkan Data !", "Peringatan", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    private void ubah_data() {
        try {
        String nokk = jnokk.getText();
        String nik = jnik.getText();
        String namalengkap = jnamalengkap.getText();
        String jk = cmbjk.getSelectedItem().toString();
        String statusmerital = cmbstatusmerital.getSelectedItem().toString();
        String tempatlahir = jtempatlahir.getText();
        java.sql.Date tanggallahir= new java.sql.Date(jDateChoosertanggallahir.getDate().getTime());
        String umur = jumur.getText();
        String pendidikanterakhir = jpendidikanterakhir.getText();
        String pekerjaan = jpekerjaan.getText();
        //ButtonModel status= rbstatus.getSelection();
        String statusdalamkeluarga = cmbstatusdalamkeluarga.getSelectedItem().toString();
        String rt = cmbrt.getSelectedItem().toString();
        String statuspenduduk = cmbstatuspenduduk.getSelectedItem().toString();

            Connection sql_query_koneksi = (Connection) si_pergudangan.koneksi.konekDB.getDB();
            String sql_query_update = "update datapenduduk set namalengkap='" + namalengkap + "', jk='" + jk + "',statusmerital='" + statusmerital + "', tempatlahir='" + tempatlahir + "',tanggallahir ='" + tanggallahir+ "',umur ='" + umur+ "',pendidikanterakhir ='" + pendidikanterakhir+ "',pekerjaan ='" + pekerjaan+ "',statusdalamkeluarga ='" + statusdalamkeluarga+ "',rt ='" + rt+ "', statuspenduduk ='" + statuspenduduk+ "' where nik='" + nik + "'";
            com.mysql.jdbc.PreparedStatement query_prepare = (PreparedStatement) sql_query_koneksi.prepareStatement(sql_query_update);
            query_prepare.execute();

        }  catch (Exception e) {
        }finally {
            loadData();
        }
    }

    private void hapus() {
        int s_row = jTable1.getSelectedRow();
        if (s_row == -1) {
            return;
        }
        String get_dataDelete = (String) jTable1.getValueAt(s_row, 0);
        try {
            Connection sql_query_konek = (Connection) si_pergudangan.koneksi.konekDB.getDB();
            String query_delete = "delete from datapenduduk where nokk=?";
            PreparedStatement sql_statemen = (PreparedStatement) sql_query_konek.prepareStatement(query_delete);
            sql_statemen.setString(1, get_dataDelete);
            sql_statemen.executeUpdate();
            sql_statemen.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tidak bisa menghapus data", "Hapus Data", JOptionPane.WARNING_MESSAGE);
        } finally {
            loadData();
        }
    }
    
        private void klik() {
        String getNokk = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String getNik = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String getNamalengkap = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String getJk = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String getStatusmerital = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String getTempatlahir = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();
        String getTanggallahir = jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString();
        String getUmur = jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString();
        String getPendidikanterakhir = jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString();
        String getPekerjaan = jTable1.getValueAt(jTable1.getSelectedRow(), 9).toString();
        String getStatusdalamkeluarga = jTable1.getValueAt(jTable1.getSelectedRow(), 10).toString();
        String getRt = jTable1.getValueAt(jTable1.getSelectedRow(), 11).toString();
        String getStatuspenduduk = jTable1.getValueAt(jTable1.getSelectedRow(), 12).toString();
        
        jnokk.setText(getNokk);
        jnik.setText(getNik);
        jnamalengkap.setText(getNamalengkap);
        cmbjk.setSelectedItem(getJk);
        cmbstatusmerital.setSelectedItem(getStatusmerital);
        jtempatlahir.setText(getTempatlahir);
        jDateChoosertanggallahir.getDate();
        //jDateChooserttl.getCalendar();
     //   jDateChooserttl.setDateFormatString(getTtl);
        jumur.setText(getUmur);
        jpendidikanterakhir.setText(getPendidikanterakhir);
        jpekerjaan.setText(getPekerjaan);
        cmbstatusdalamkeluarga.setSelectedItem(getStatusdalamkeluarga);
        cmbrt.setSelectedItem(getRt);
        cmbstatuspenduduk.setSelectedItem(getStatuspenduduk);
    }
        
    private DefaultTableModel tabmode;
    public void pencarian_penduduk(){
        String cari = txt_cari_penduduk.getText();
        Object[] Baris={"No.KK","NIK","Nama Lengkap","JK","Status Merital","Tempat Lahir","Tanggal Lahir","Umur","Pendidikan Terakhir","Pekerjaan","Status Keluarga","RT","Status"};
        tabmode = new DefaultTableModel(null, Baris);
        jTable1.setModel(tabmode);

        java.sql.Connection koneksi = new koneksi().getConnection();
        try{
          String sql="Select * from datapenduduk where nokk like '%"+cari+"%' or nik like '%"+cari+"%' or nik like '%"+cari+"%' or namalengkap like '%"+cari+"%' or jk like '%"+cari+"%' or statusmerital like '%"+cari+"%' or tempatlahir like '%"+cari+"%' or tanggallahir like '%"+cari+"%' or umur like '%"+cari+"% or pendidikanterakhir like '%"+cari+"%' or pekerjaan like '%"+cari+"%' or statusdalamkeluarga like '%"+cari+"%' or rt like '%"+cari+"%' or statuspenduduk like '%"+cari+"%'    order by nokk asc";
       //     String sql="Select * from penduduk where nokk like '%"+cari+"%' or nik like '%"+cari+"%' or namalengkap like '%"+cari+"%' or jk like '%"+cari+"%' or ttl like '%"+cari+"%' or alamat like '%"+cari+"%' or statuskeluarga like '%"+cari+"%' or namaibu like '%"+cari+"%' or rt like '%"+cari+"%' order by nokk asc";
            java.sql.Statement stmt=koneksi.createStatement();
            java.sql.ResultSet rslt=stmt.executeQuery(sql);
            while(rslt.next()){
                String nokk = rslt.getString("nokk");
                String nik = rslt.getString("nik");
                String namalengkap = rslt.getString("namalengkap");
                String jk = rslt.getString("jk");
                String statusmerital = rslt.getString("statusmerital");
                String tempatlahir = rslt.getString("tempatlahir");
                String tanggallahir = rslt.getString("tanggallahir");
                String umur = rslt.getString("umur");
                String pendidikanterakhir = rslt.getString("pendidikanterakhir");
                String pekerjaan = rslt.getString("pekerjaan");
                String statusdalamkeluarga = rslt.getString("statusdalamkeluarga");
                String rt = rslt.getString("rt");
                String statuspenduduk = rslt.getString("statuspenduduk");
                
               String[] dataField = {nokk, nik, namalengkap, jk, statusmerital, tempatlahir, tanggallahir, umur, pendidikanterakhir, pekerjaan, statusdalamkeluarga, rt, statuspenduduk};
                tabmode.addRow(dataField);
            }
        } catch(Exception ex){
        }
       
    }
    //private DefaultTableModel tabmode1;
//    private void tampil_tb_penduduk1(){
//        Object []baris = {"nokk","nik","nama","jk","ttl","alamat","statuskeluarga"};
//        tabmode1 = new DefaultTableModel(null, baris);
//        jTable1.setModel(tabmode1);
//        java.sql.Connection con = new koneksi_2().getConnection();
//        try {
//            String sql = "select * from penduduk";
//            java.sql.Statement stat = con.createStatement();
//            java.sql.ResultSet hasil = stat.executeQuery(sql);
//            while (hasil.next()){
//                String nokk = hasil.getString("nokk");
//                String nik = hasil.getString("nik");
//                String nama = hasil.getString("nama");
//                String jk = hasil.getString("jk");
//                String ttl = hasil.getString("ttl");
//                String alamat = hasil.getString("alamat");
//                String statuskeluarga = hasil.getString("statuskeluarga");
//                String[] data = {nokk, nik, nama, jk, ttl, alamat, statuskeluarga};
//                tabmode.addRow(data);
//            }
//        } catch (Exception e) {            
//        }
//    }
    
    
    //reset 
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(entry_kelolapenduduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entry_kelolapenduduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entry_kelolapenduduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entry_kelolapenduduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                entry_kelolapenduduk dialog = new entry_kelolapenduduk(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari_penduduk;
    private javax.swing.JButton btn_edit_buku1;
    private javax.swing.JComboBox cmbjk;
    private javax.swing.JComboBox cmbrt;
    private javax.swing.JComboBox cmbstatusdalamkeluarga;
    private javax.swing.JComboBox cmbstatusmerital;
    private javax.swing.JComboBox cmbstatuspenduduk;
    private javax.swing.JButton jButtonbatal;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtonedit;
    private javax.swing.JButton jButtonkembali;
    private javax.swing.JButton jButtonnew;
    private javax.swing.JButton jButtonsimpanA;
    private javax.swing.JButton jButtonsimpanB;
    private com.toedter.calendar.JDateChooser jDateChoosertanggallahir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jnamalengkap;
    private javax.swing.JTextField jnik;
    private javax.swing.JTextField jnokk;
    private javax.swing.JTextField jpekerjaan;
    private javax.swing.JTextField jpendidikanterakhir;
    private javax.swing.JTextField jtempatlahir;
    private javax.swing.JTextField jumur;
    private javax.swing.JTextField txt_cari_penduduk;
    // End of variables declaration//GEN-END:variables

    private void Reload() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  

    }
}
