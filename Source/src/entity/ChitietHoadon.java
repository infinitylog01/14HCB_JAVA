package entity;
// Generated 26-Mar-2016 11:54:59 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * ChitietHoadon generated by hbm2java
 */
public class ChitietHoadon  implements java.io.Serializable {


     private int id;
     private String tenmonan;
     private Integer soluong;
     private Float gia;
     private Date ngaythang;
     private String ghichu;

    public ChitietHoadon() {
    }

	
    public ChitietHoadon(int id) {
        this.id = id;
    }
    public ChitietHoadon(int id, String tenmonan, Integer soluong, Float gia, Date ngaythang, String ghichu) {
       this.id = id;
       this.tenmonan = tenmonan;
       this.soluong = soluong;
       this.gia = gia;
       this.ngaythang = ngaythang;
       this.ghichu = ghichu;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getTenmonan() {
        return this.tenmonan;
    }
    
    public void setTenmonan(String tenmonan) {
        this.tenmonan = tenmonan;
    }
    public Integer getSoluong() {
        return this.soluong;
    }
    
    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }
    public Float getGia() {
        return this.gia;
    }
    
    public void setGia(Float gia) {
        this.gia = gia;
    }
    public Date getNgaythang() {
        return this.ngaythang;
    }
    
    public void setNgaythang(Date ngaythang) {
        this.ngaythang = ngaythang;
    }
    public String getGhichu() {
        return this.ghichu;
    }
    
    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }




}

