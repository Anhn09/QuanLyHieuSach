package quanlyhieusach;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnhTN
 */
public class Sach implements Serializable{
    private String maSach;
    private  String tenSach;
    private String tenTacGia;
    private String nhaXB;
    private int soLuong;
    private double giaTien;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String tenTacGia, String nhaXB, int soLuong, double giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.nhaXB = nhaXB;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) throws Exception {
        if(maSach.trim().equals("")){
            throw new Exception("Mã sách không được để trống");
        }
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) throws Exception {
        if(tenSach.trim().equals("")){
            throw new Exception("Tên sách không được để trống");
        }
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) throws Exception {
        if(tenTacGia.trim().equals("")){
            throw new Exception("Tên tác giả không được để trống");
        }
        this.tenTacGia = tenTacGia;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) throws Exception {
        if(nhaXB.trim().equals("")){
            throw new Exception("Nhà xuất bản không được để trống");
        }
        this.nhaXB = nhaXB;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) throws Exception {
        if(soLuong<=0){
            throw new Exception("Số lượng phải lớn hơn 0");
        }
        this.soLuong = soLuong;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien)throws Exception {
//        if(giaTien){
//            throw new Exception("Giá tiền không được để trống");
//        }
        this.giaTien = giaTien;
    }
}
