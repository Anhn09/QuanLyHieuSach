/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lop;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

/**
 *
 * @author HP
 */
public class HoaDonNhap {

    private String maHDN, maSach, maNV, ngayNhap;
    private int soLuongN;
    private float donGiaN;
    private float thanhTien;

    public HoaDonNhap(String maHDN, String maSach, String maNV, String ngayNhap, int soLuongN, float donGiaN, float thanhTien) {
        this.maHDN = maHDN;
        this.maSach = maSach;
        this.maNV = maNV;
        this.ngayNhap = ngayNhap;
        this.soLuongN = soLuongN;
        this.donGiaN = donGiaN;
        this.thanhTien = thanhTien;
    }

    public HoaDonNhap() {
    }
    
    

    public float thanhTien() {
        return soLuongN * donGiaN;
    }

    public String getMaHDN() {
        return maHDN;
    }

    public void setMaHD(String maHDN) throws Exception {
        if (maHDN.equals("")) {
            throw new Exception("Mã hóa đơn không được để trống!");
        }
        this.maHDN = maHDN;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) throws Exception {
        if (maSach.equals("")) {
            throw new Exception("Mã sách không được để trống!");
        }
        this.maSach = maSach;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) throws Exception {
        if (maNV.equals("")) {
            throw new Exception("Mã nhân viên không được để trống!");
        }
        this.maNV = maNV;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayLap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return soLuongN;
    }

    public void setSoLuongN(int soLuongN) throws Exception {
        if (soLuongN < 0) {
            throw new Exception("Số lượng không được là số âm");
        }
        this.soLuongN = soLuongN;
    }

    public float getDonGiaN() {
        return donGiaN;
    }

    public void setDonGiaN(float donGiaN) {
        this.donGiaN = donGiaN;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

}
