/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poly.edu;

import poly.edu.service.KhachHangService;
import poly.edu.view.ViewKhachHang;

/**
 *
 * @author user
 */
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
//        SELECT TOP (1000) [id]
//      ,[ten]
//      ,[dia_chi]
//      ,[email]
//      ,[tuoi]
//      ,[gioi_tinh]
//  FROM [su22b2_sof203].[dbo].[khach_hang]


   new ViewKhachHang().setVisible(true);
    }
}
