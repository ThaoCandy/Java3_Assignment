/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import poly.edu.model.KhachHang;
import poly.edu.repository.KhachHangRepository;


/**
 *
 * @author user
 */
public class KhachHangService extends KhachHangRepository{
    
   public String them(KhachHang kh){
       String val = validate(kh);
       if(!val.equals("")){
           return val;
       }
       if(reInsert(kh)){
           return "Thêm thành công";
       }else{
           return "Thêm thất bại";
       }
   }
   
   public String sua(KhachHang kh){
       String val = validate(kh);
       if(!val.equals("")){
           return val;
       }
       
       if(reUpdate(kh)){
           return "Sửa thành công";
       }else{
           return "Sửa thất bại";
       }
   }
   
   public  String xoa(String ma){
       if(reDelete(ma)){
           return "Xóa thành công";
       }else{
           return "Xóa thất bại";
       }
   }
   
   private String validate(KhachHang kh){
       if(kh.getTen().isEmpty() || String.valueOf(kh.getTuoi()).isEmpty() || kh.getDiaChi().isEmpty() || kh.getEmail().isEmpty()){
           return "Không trường nào được trống";
       }
       
       if(kh.getTuoi() < 0){
           return "Tuổi phải là số nguyên lớn hơn 0!";
       }
       
       if(!kh.getEmail().matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
           return "Email không đùng định dạng!";
       }
       return "";
   }
}
