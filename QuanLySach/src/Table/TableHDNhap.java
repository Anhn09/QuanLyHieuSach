/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import Lop.HoaDonNhap;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HP
 */
public class TableHDNhap extends AbstractTableModel {
    private String name[] = {"Mã hóa đơn nhập","Mã sách","Mã nhân viên","Ngày nhập","Đơn giá nhập","Số lượng nhập","Thành tiền"};
    private Class classes[] = {String.class, String.class, String.class, String.class, Float.class, Integer.class,Float.class};
    
    private ArrayList<HoaDonNhap> list = new ArrayList<HoaDonNhap>();
    
    public TableHDNhap(ArrayList<HoaDonNhap> ds){
        this.list = ds;
    } 
    @Override
    public int getRowCount() {
        return this.list.size(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String getColumnName(int i){
        return this.name[i];
    }
    @Override
    public int getColumnCount() {
        return this.name.length;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch(col){
            case 0: return list.get(row).getMaHDN();
            case 1: return list.get(row).getMaSach();
            case 2: return list.get(row).getMaNV();
            case 3: return list.get(row).getNgayNhap();
            case 4: return list.get(row).getDonGiaN();
            case 5: return list.get(row).getSoLuong();
            case 6: return list.get(row).getThanhTien();
            default: return false;
        }
    }
}
