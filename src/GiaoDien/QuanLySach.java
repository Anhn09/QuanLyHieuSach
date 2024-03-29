package GiaoDien;

import Lop.Sach;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import static java.util.Collections.sort;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.util.Comparator;
import java.util.List;
import javax.swing.JSpinner;

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

    public static ArrayList<Sach> listSach = docFile();
    DefaultTableModel tblModel = new DefaultTableModel();
    Sach sach = new Sach();

    /**
     * Creates new form QuanLySach
     */
    public QuanLySach() {
        initComponents();
        clearInputForm();
        fillTable(listSach);

    }

    public static List<String> getData() {
        List<String> data = new ArrayList<>();
        for (Sach s : listSach) {
            String maSach = s.getMaSach();
            data.add(maSach);
        }
        return data;
    }

    public void clearInputForm() {
        this.txtMaSach.setText("");
        this.txtMaSach.setEditable(true);
        this.txtTenSach.setText("");
        this.txtNhaXB.setText("");
        this.txtTenTG.setText("");
        this.txtGiaTien.setText("");
        this.txtSoLuong.setValue(0);

    }

    private void fillTable(List<Sach> listSachInput) {
        tblModel = (DefaultTableModel) tblQuanLySach.getModel();
        tblModel.setRowCount(0);//reset nd trong bang ve 0

        for (Sach sachs : listSachInput) {
            tblModel.addRow(new Object[]{sachs.getMaSach(), sachs.getTenSach(), sachs.getTenTacGia(), sachs.getNhaXB(), sachs.getSoLuong(), sachs.getGiaTien()});
        }
    }

    public static ArrayList<Sach> docFile() {
        ArrayList<Sach> listSachActual = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("Sach.dat");
            objectInputStream = new ObjectInputStream(fileInputStream);
            listSachActual = (ArrayList<Sach>) objectInputStream.readObject();

        } catch (FileNotFoundException e) {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return listSachActual;
    }

    private void ghiFile() {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Sach.dat");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(listSach);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (Exception e) {
            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuanLySach = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtTim = new javax.swing.JTextField();
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
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 51, 51));
        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tblQuanLySach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "tên tác giả", "Nhà xuất bản", "Số lượng", "Giá tiền"
            }
        ));
        tblQuanLySach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuanLySachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQuanLySach);

        jLabel8.setText("Tìm kiếm");

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        jLabel9.setText("Sắp xếp");

        buttonGroup1.add(sapxep_Tang);
        sapxep_Tang.setText("Giá tăng dần");
        sapxep_Tang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sapxep_TangActionPerformed(evt);
            }
        });

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

        buttonGroup1.add(sapxep_Giam);
        sapxep_Giam.setText("Giá giảm dần");
        sapxep_Giam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sapxep_GiamActionPerformed(evt);
            }
        });

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

        jButton2.setText("LoadTable");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel1)
                .addGap(0, 274, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LamMoi)
                .addGap(146, 146, 146))
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(bntThoat_)
                .addGap(52, 52, 52)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                            .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addGap(122, 122, 122)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(43, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(113, 113, 113)
                .addComponent(LamMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntThoat_)
                    .addComponent(jButton2))
                .addGap(21, 21, 21))
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
                        .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTim)
                        .addComponent(jLabel9)
                        .addComponent(sapxep_Tang)
                        .addComponent(sapxep_Giam))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addGap(69, 69, 69)))
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
        int confirmed = JOptionPane.showConfirmDialog(QuanLySach.this, "Bạn có muốn thoát không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (confirmed == JOptionPane.YES_OPTION) {
            ghiFile();
            dispose();
        }
    }//GEN-LAST:event_bntThoat_ActionPerformed

    private void txtGiaTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaTienActionPerformed
    public JTextField setTxtMaSach() throws Exception {
        if (txtMaSach.getText().trim().equals("")) {
            throw new Exception("Mã sách không được để trống");
        }
        return txtMaSach;
    }

    public JTextField setTxtTenSach() throws Exception {
        if (txtTenSach.getText().trim().equals("")) {
            throw new Exception("Tên sách không được để trống");
        }
        return txtTenSach;
    }

    public JTextField setTxtTenTacGia() throws Exception {
        if (txtTenTG.getText().trim().equals("")) {
            throw new Exception("Tên tác giả không được để trống");
        }
        return txtTenTG;
    }

    public JTextField setTxtNhaXB() throws Exception {
        if (txtNhaXB.getText().trim().equals("")) {
            throw new Exception("Nhà xuất bản không được để trống");
        }
        return txtNhaXB;
    }

    public JTextField setTxtGiaTien() throws Exception {
        if (txtGiaTien.getText().equals("")) {
            throw new Exception("Giá tiền không được để trống");
        } else {
            if (Double.parseDouble(txtGiaTien.getText()) <= 0) {
                throw new Exception("Giá tiền phải lớn hơn 0");
            }
        }

        return txtGiaTien;
    }

    public JSpinner setTxtSoLuong() throws Exception {
        boolean check = true;
        if (txtSoLuong.getValue().equals(0)) {
            throw new Exception("Số lượng phải lớn hơn 0");
        }
        return txtSoLuong;
    }

    private void tblQuanLySachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanLySachMouseClicked
        // TODO add your handling code here:
        tblModel = (DefaultTableModel) tblQuanLySach.getModel();
        int index = tblQuanLySach.getSelectedRow();//kích vào dòng thứ index trên bảng
        if (index == -1) {//không tương tác với bảng
            return;
        }
        String masach = tblModel.getValueAt(index, 0).toString();
        String ten = tblModel.getValueAt(index, 1).toString();
        String tenTG = tblModel.getValueAt(index, 2).toString();
        String nhaXB = tblModel.getValueAt(index, 3).toString();
        Object sl = tblModel.getValueAt(index, 4);
        String gia = tblModel.getValueAt(index, 5).toString();

        txtMaSach.setText(masach);
        txtMaSach.setEditable(false);
        txtTenSach.setText(ten);
        txtNhaXB.setText(nhaXB);
        txtTenTG.setText(tenTG);
        txtGiaTien.setText(gia);
        txtSoLuong.setValue(sl);
    }//GEN-LAST:event_tblQuanLySachMouseClicked

    private void btnSua_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_ActionPerformed
        tblModel = (DefaultTableModel) tblQuanLySach.getModel();
        int index = tblQuanLySach.getSelectedRow();//kích vào dòng thứ index trên bảng
        if (index != -1) {
            try {
                Sach suaSach = new Sach();
                suaSach.setMaSach(setTxtMaSach().getText());
                suaSach.setTenSach(setTxtTenSach().getText());
                suaSach.setTenTacGia(setTxtTenTacGia().getText());
                suaSach.setNhaXB(setTxtNhaXB().getText());
                suaSach.setGiaTien(Double.parseDouble(setTxtGiaTien().getText()));
                suaSach.setSoLuong((int) setTxtSoLuong().getValue());
                //boolean isExist = listSach.contains(suaSach);
                if (listSach.contains(suaSach)) {
                    JOptionPane.showMessageDialog(QuanLySach.this, "Sách đã tồn tại", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    listSach.set(index, suaSach);
                    JOptionPane.showMessageDialog(QuanLySach.this, "Sửa sách thành công", "", JOptionPane.INFORMATION_MESSAGE);

                    fillTable(listSach);//Hiển thị ra table
                    this.clearInputForm();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(QuanLySach.this, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(QuanLySach.this, "Vui lòng chọn sách muốn sửa", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnSua_ActionPerformed

    private void LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamMoiActionPerformed
        clearInputForm();
//        txtMaSach.setText("");
//        txtTenSach.setText("");
//        txtNhaXB.setText("");
//        txtSoLuong.setValue(0);
//        txtGiaTien.setText("");
//        txtTenTG.setText("");
    }//GEN-LAST:event_LamMoiActionPerformed

    private void txtMaSachFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaSachFocusLost

    }//GEN-LAST:event_txtMaSachFocusLost

    private void txtTenSachFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenSachFocusLost

    }//GEN-LAST:event_txtTenSachFocusLost

    private void txtTenTGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenTGFocusLost

    }//GEN-LAST:event_txtTenTGFocusLost

    private void txtNhaXBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNhaXBFocusLost

    }//GEN-LAST:event_txtNhaXBFocusLost

    private void txtGiaTienFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGiaTienFocusLost

    }//GEN-LAST:event_txtGiaTienFocusLost

    private void txtSoLuongFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSoLuongFocusLost

    }//GEN-LAST:event_txtSoLuongFocusLost

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            tblModel = (DefaultTableModel) tblQuanLySach.getModel();
            int indext = tblQuanLySach.getSelectedRow();
            if (indext != -1) {
                int xacNhan = JOptionPane.showConfirmDialog(QuanLySach.this,
                        "Bạn có muốn xoá sản phẩm này?", "Xác nhận",
                        JOptionPane.YES_NO_OPTION);
                if (xacNhan == JOptionPane.YES_OPTION) {
                    listSach.remove(indext);
                    fillTable(listSach);
                    JOptionPane.showMessageDialog(rootPane, "Xoá thành công");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn sách muốn xoá", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        tblModel = (DefaultTableModel) tblQuanLySach.getModel();
        ArrayList<Sach> dsTim = new ArrayList<>();
        String inputSearch = txtTim.getText().trim().toLowerCase();
        for (Sach sach : listSach) {
            if (sach.getTenSach().toLowerCase().contains(inputSearch) || sach.getNhaXB().toLowerCase().contains(inputSearch) || sach.getTenTacGia().toLowerCase().contains(inputSearch)) {
                dsTim.add(sach);
            }
        }
        fillTable(dsTim);
    }//GEN-LAST:event_btnTimActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
//        fillTable(listSach);
//        clearInputForm();
//        sapxep_Tang.setText("");
//        sapxep_Giam.setText("");

    }//GEN-LAST:event_jButton2MouseClicked

    private void sapxep_TangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sapxep_TangActionPerformed
        Comparator<Sach> tang = new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return Double.compare(o1.getGiaTien(), o2.getGiaTien());
            }
        };
        List<Sach> listSachTmp = new ArrayList<Sach>(listSach);
        sort(listSachTmp, tang);
        fillTable(listSachTmp);
    }//GEN-LAST:event_sapxep_TangActionPerformed


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        fillTable(listSach);
        clearInputForm();
        sapxep_Tang.setSelected(true);
        sapxep_Giam.setSelected(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int confirm = JOptionPane.showConfirmDialog(QuanLySach.this, "Bạn có muốn thoát không", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            ghiFile();
            dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void sapxep_GiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sapxep_GiamActionPerformed
        Comparator<Sach> tang = new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return Double.compare(o1.getGiaTien(), o2.getGiaTien());
            }
        };
        List<Sach> listSachTmp = new ArrayList<Sach>(listSach);
        sort(listSachTmp, tang.reversed());
        fillTable(listSachTmp);
    }//GEN-LAST:event_sapxep_GiamActionPerformed

    private void btnThemMoi_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoi_ActionPerformed

        //StringBuilder sb = new StringBuilder();//Sd để lưu các thông báo lỗi
        //txtMaSach.setText("H00" + listSach.size());
        boolean b = true;
        try {

            sach = new Sach((setTxtMaSach().getText()), setTxtTenSach().getText(),
                    setTxtTenTacGia().getText(), setTxtNhaXB().getText(),
                    (int) setTxtSoLuong().getValue(),
                    Float.parseFloat(setTxtGiaTien().getText())
            );
            for (Sach sach1 : listSach) {
                if (sach1.getMaSach().equals(setTxtMaSach().getText())) {
                    b = false;
                    break;
                }
            }

            if (b == false) {
                JOptionPane.showMessageDialog(QuanLySach.this, "Sản phẩm đã tồn tại", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                listSach.add(sach);
                JOptionPane.showMessageDialog(QuanLySach.this, "Thêm sản phẩm thành công", "", JOptionPane.INFORMATION_MESSAGE);

                fillTable(listSach);//Hiển thị ra table
                this.clearInputForm();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(QuanLySach.this, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnThemMoi_ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JRadioButton sapxep_Giam;
    private javax.swing.JRadioButton sapxep_Tang;
    private javax.swing.JTable tblQuanLySach;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtNhaXB;
    private javax.swing.JSpinner txtSoLuong;
    private javax.swing.JTextField txtTenSach;
    private javax.swing.JTextField txtTenTG;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}
