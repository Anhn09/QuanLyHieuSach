package quanlyhieusach;

import java.util.ArrayList;
import java.util.Vector;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AnhTN
 */
public class QuanLySach extends javax.swing.JFrame {

    DBEngine db = new DBEngine();
    private static ArrayList<Sach> listSach = new ArrayList<Sach>();
    private static DefaultTableModel tblModel = new DefaultTableModel();
    private static Sach sach = new Sach();

    /**
     * Creates new form QuanLySach
     */
    public QuanLySach() {
        initComponents();
        db.docFile(listSach, "Sach.dat");
        listSach = new ArrayList<>();
        tblModel = (DefaultTableModel) tblSach.getModel();

        fillTable();//Đổ dữ liệu từ list vào bảng

    }

    private void fillTable() {
        tblModel.setRowCount(0);//reset nd trong bang ve 0
        int i = 0;
        for (Sach sach : listSach) {
            tblModel.addRow(new Object[]{i++, sach.getMaSach(), sach.getTenSach(), sach.getTenTacGia(), sach.getNhaXB(), sach.getGiaTien(), sach.getSoLuong()});
        }

        tblModel.fireTableDataChanged();//Cập nhật dữ liệu hiển thị lên bảng
    }

    private void initTable() {
        String[] colums = new String[]{};
        tblModel.setColumnIdentifiers(colums);
        tblSach.setModel(tblModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        sapxep_Tang = new javax.swing.JRadioButton();
        txtTenSach = new javax.swing.JTextField();
        txtTenTG = new javax.swing.JTextField();
        txtNhaXB = new javax.swing.JTextField();
        txtMaSach = new javax.swing.JTextField();
        sapxep_Giam = new javax.swing.JRadioButton();
        LamMoi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bntThoat_ = new javax.swing.JButton();
        txtGiaTien = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnThemMoi_ = new javax.swing.JButton();
        btnSua_ = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnXoa.setBackground(new java.awt.Color(255, 51, 51));
        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xoá");

        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã sách", "Tên sách", "tên tác giả", "Nhà xuất bản", "Giá tiền", "Số lượng"
            }
        ));
        tblSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSach);

        jLabel8.setText("Tìm kiếm");

        btnTim.setText("Tìm");

        jLabel9.setText("Sắp xếp");

        sapxep_Tang.setText("Giá từ tăng dần");

        txtTenSach.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenSachFocusLost(evt);
            }
        });

        txtTenTG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenTGFocusLost(evt);
            }
        });
        txtTenTG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenTGActionPerformed(evt);
            }
        });

        txtNhaXB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNhaXBFocusLost(evt);
            }
        });
        txtNhaXB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNhaXBActionPerformed(evt);
            }
        });

        txtMaSach.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaSachFocusLost(evt);
            }
        });
        txtMaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSachActionPerformed(evt);
            }
        });

        sapxep_Giam.setText("Giá giảm dần");

        LamMoi.setForeground(new java.awt.Color(0, 0, 255));
        LamMoi.setText("Làm mới");
        LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamMoiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý sản phẩm");

        txtSoLuong.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        txtSoLuong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSoLuongFocusLost(evt);
            }
        });

        jLabel2.setText("Tên sách");

        jLabel3.setText("Mã sách");

        bntThoat_.setText("Thoát");
        bntThoat_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntThoat_ActionPerformed(evt);
            }
        });

        txtGiaTien.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGiaTienFocusLost(evt);
            }
        });
        txtGiaTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaTienActionPerformed(evt);
            }
        });

        jLabel4.setText("Tên tác giả");

        jLabel5.setText("Giá tiền");

        jLabel6.setText("Nhà xuất bản");

        jLabel7.setText("Số lượng");

        btnThemMoi_.setBackground(new java.awt.Color(51, 153, 255));
        btnThemMoi_.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThemMoi_.setForeground(new java.awt.Color(255, 255, 255));
        btnThemMoi_.setText("Thêm mới");
        btnThemMoi_.setVerifyInputWhenFocusTarget(false);
        btnThemMoi_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoi_ActionPerformed(evt);
            }
        });

        btnSua_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSua_.setText("Sửa");
        btnSua_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_ActionPerformed(evt);
            }
        });

        jButton1.setText("Lưu file Excel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(273, 273, 273))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LamMoi)
                        .addGap(95, 95, 95))))
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel1)
                .addGap(0, 459, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMaSach)
                                .addComponent(txtTenTG)
                                .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(55, 55, 55)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNhaXB, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(109, 109, 109)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnThemMoi_)
                                            .addGap(29, 29, 29)
                                            .addComponent(btnSua_))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnXoa)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnTim)
                                            .addGap(54, 54, 54)
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(sapxep_Tang)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(sapxep_Giam))))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(334, 334, 334)
                            .addComponent(bntThoat_))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(122, 122, 122)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(228, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(105, 105, 105)
                .addComponent(LamMoi)
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addContainerGap(259, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(21, 21, 21)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtTenTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNhaXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThemMoi_)
                        .addComponent(btnSua_)
                        .addComponent(btnXoa))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTim)
                        .addComponent(jLabel9)
                        .addComponent(sapxep_Tang)
                        .addComponent(sapxep_Giam))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                    .addComponent(bntThoat_)
                    .addGap(28, 28, 28)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenTGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenTGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenTGActionPerformed

    private void txtNhaXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNhaXBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNhaXBActionPerformed

    private void txtMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSachActionPerformed

    private void bntThoat_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntThoat_ActionPerformed
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_bntThoat_ActionPerformed

    private void txtGiaTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaTienActionPerformed

    private void btnThemMoi_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoi_ActionPerformed
        StringBuilder sb = new StringBuilder();//Sd để lưu các thông báo lỗi

        try {
            Sach sach = new Sach();
            sach.setMaSach(txtMaSach.getText());

            sach.setTenSach(txtTenSach.getText());
            sach.setNhaXB(txtNhaXB.getText());
            sach.setTenTacGia(txtTenTG.getText());
            try {
                sach.setGiaTien(Float.parseFloat(txtGiaTien.getText()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Giá tiền phải nhập số");
            }
            sach.setSoLuong((int) (txtSoLuong.getValue()));
//            int filterSize = listSach.stream().filter(obj -> obj.getTenSach() == "1" && obj.getMaSach() == "1").collect(Collectors.toList()).size();
//            if (filterSize > 0) {
            if (listSach.contains(sach)) {
                JOptionPane.showMessageDialog(QuanLySach.this, "Sản phẩm đã tồn tại", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                listSach.add(sach);
                JOptionPane.showMessageDialog(QuanLySach.this, "Thêm sản phẩm thành công", "", JOptionPane.INFORMATION_MESSAGE);

                fillTable();//Hiển thị ra table
                db.ghiFile(listSach, "Sach.dat");
            }
//        } catch (NullPointerException e) {
//            JOptionPane.showMessageDialog(QuanLySach.this, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(QuanLySach.this, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnThemMoi_ActionPerformed

    private void tblSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSachMouseClicked

    private void btnSua_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSua_ActionPerformed

    private void LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamMoiActionPerformed
        // TODO add your handling code here:
        txtMaSach.setText("");
        txtTenSach.setText("");
        txtNhaXB.setText("");
        txtSoLuong.setValue(0);
        txtGiaTien.setText("");
        txtTenTG.setText("");
    }//GEN-LAST:event_LamMoiActionPerformed

    private void txtMaSachFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaSachFocusLost
        if (txtMaSach.getText().length() > 0) {

        } else {
            JOptionPane.showMessageDialog(rootPane, "Mã sách không được để trống");
        }
    }//GEN-LAST:event_txtMaSachFocusLost

    private void txtTenSachFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenSachFocusLost
        if (txtTenSach.getText().length() > 0) {

        } else {
            JOptionPane.showMessageDialog(rootPane, "Tên sách không được để trống");
        }
    }//GEN-LAST:event_txtTenSachFocusLost

    private void txtTenTGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenTGFocusLost
        if (txtTenTG.getText().length() > 0) {

        } else {
            JOptionPane.showMessageDialog(rootPane, "Tên tác giả không được để trống");
        }
    }//GEN-LAST:event_txtTenTGFocusLost

    private void txtNhaXBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNhaXBFocusLost
        if (txtNhaXB.getText().length() > 0) {

        } else {
            JOptionPane.showMessageDialog(rootPane, "Nhà xuất bản không được để trống");
        }
    }//GEN-LAST:event_txtNhaXBFocusLost

    private void txtGiaTienFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGiaTienFocusLost
        if (txtGiaTien.getText().length() > 0) {

        } else {
            JOptionPane.showMessageDialog(rootPane, "Giá tiền không được để trống");
        }
    }//GEN-LAST:event_txtGiaTienFocusLost

    private void txtSoLuongFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSoLuongFocusLost
        if (txtSoLuong.equals(0)) {
            JOptionPane.showMessageDialog(rootPane, "Số lượng phải lớn hơn 0");
        }
    }//GEN-LAST:event_txtSoLuongFocusLost

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLySach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LamMoi;
    private javax.swing.JButton bntThoat_;
    private javax.swing.JButton btnSua_;
    private javax.swing.JButton btnThemMoi_;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JRadioButton sapxep_Giam;
    private javax.swing.JRadioButton sapxep_Tang;
    private javax.swing.JTable tblSach;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtNhaXB;
    private javax.swing.JSpinner txtSoLuong;
    private javax.swing.JTextField txtTenSach;
    private javax.swing.JTextField txtTenTG;
    // End of variables declaration//GEN-END:variables
}