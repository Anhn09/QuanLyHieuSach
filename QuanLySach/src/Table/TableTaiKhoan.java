/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import Lop.Sach;
import Lop.TaiKhoan;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author HP
 */
public class TableTaiKhoan extends AbstractTableModel {
     private String name[] = {"Mã nhân viên","Tên nhân viên","Địa chỉ","Số điện thoại","Email"};
    private Class classes[] = {String.class, String.class, String.class, String.class, String.class};
    
    private ArrayList<TaiKhoan> list = new ArrayList<TaiKhoan>();
    
    public TableTaiKhoan(ArrayList<TaiKhoan> ds){
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
            case 0: return list.get(row).getMaNV();
            case 1: return list.get(row).getTenNV();
            case 2: return list.get(row).getDiaChi();
            case 3: return list.get(row).getSdt();
            case 4: return list.get(row).getEmail();
            default: return false;
        }
    }
}
