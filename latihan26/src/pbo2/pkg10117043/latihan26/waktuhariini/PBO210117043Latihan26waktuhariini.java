/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117043.latihan26.waktuhariini;


import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat; 
/**
 *NAMA                 : Yusrizal Falahan
 * Kelas                : PBO-2 
 * NIM                  : 10117043
 * Deskripsi Program    : Program ini berisi perintah untuk menampilkan waktu 
 *                        saat ini
 * @author Acer
 */
public class PBO210117043Latihan26waktuhariini {

    private String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("E/dd/MM/yyyy");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }  
    
    private String getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
        Date date = new Date();  
        return dateFormat.format(date);  
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PBO210117043Latihan26waktuhariini tgl = new PBO210117043Latihan26waktuhariini();  
        System.out.println("hari ini adalah hari : "+tgl.getTanggal()); 
        System.out.println("Waktu sekarang : "+tgl.getWaktu());
    }  
}  
    
    

