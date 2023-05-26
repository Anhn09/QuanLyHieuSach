package quanlyhieusach;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnhTN
 */
public class DBEngine {
    public void ghiFile(Object obj, String nameFile){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(nameFile);
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(obj);
        }catch(FileNotFoundException e){
        }catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(oos!=null){
                    oos.close();
                }
                if(fos!=null){
                    fos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void docFile(Object obj, String nameFile){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(nameFile);
            ois = new ObjectInputStream(fis);
            obj = (List<Sach>) ois.readObject();
        }catch(FileNotFoundException e){
        }catch (Exception e) {
            e.printStackTrace();
        }finally{
            try { 
                if(ois!=null){
                    ois.close();
                }
                if(fis!=null){
                    fis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
