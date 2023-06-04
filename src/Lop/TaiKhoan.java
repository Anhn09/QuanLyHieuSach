/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lop;

/**
 *
 * @author HP
 */
public class TaiKhoan {
    private String maNV,tenNV,diaChi,sdt,email;

    public TaiKhoan(String maNV, String tenNV, String diaChi, String sdt, String email) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
    }

    public TaiKhoan(){
        
    }
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) throws Exception{
        if(maNV.equals(""))
            throw new Exception("Mã nhân viên không được để trống!");
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV)  throws Exception{
        if(tenNV.equals(""))
            throw new Exception("Tên nhân viên không được để trống!");
        this.tenNV = tenNV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi)  throws Exception{
        if(diaChi.equals(""))
            throw new Exception("Địa chỉ không được để trống!");
        this.diaChi=diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) throws Exception{
        if(sdt.equals(""))
            throw new Exception("Địa chỉ không được để trống!");
        this.sdt=sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception{
        if(email.equals(""))
            throw new Exception("Email không được để trống!");
        this.email=email;
    }
    
}
