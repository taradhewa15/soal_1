package soal_1;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;  
import java.text.SimpleDateFormat; 

/**
 *
 * @author Tara SSD
 */
public class MainProgram {
    
    double harga1, harga2, harga3, barang1, barang2, barang3, total, Tanggal;
    int pil, jumlah;
    
    
    double hitungTotal(int jml){
        jumlah = jml;
        switch(pil){
            case 0:
                System.exit(0);
                break;
            case 1:
                harga1 = 5000;
                total = total+(harga1*jml);
                break;
            case 2:
                harga2 = 10000;
                total = total+(harga2*jml);
                break;
            case 3:
                harga3 = 5000;
                total = total+(harga3*jml);
                break;
            case 9:        
                break;
            default:
                System.out.println("Error: Input yang anda masukkan salah !");
        }
        return total;
    }
    
    void viewTotal (){
         MainProgram tgl = new MainProgram(); 
         System.out.println("     Warung Makan Sederhana   ");
         System.out.println("Tanggal :   "+tgl.getTanggal()+tgl.getWaktu());
         System.out.println("Nama Kasir :        Tara Dhewa");
         System.out.println("==============================");
         System.out.println("Nasi...............Rp"+harga1);
         System.out.println("Lauk...............Rp"+harga2);
         System.out.println("Minum..............Rp"+harga3);
         
         
         System.out.println("\nTotal..............Rp"+total);
         
    }
     
     private String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }  
     private String getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
        Date date = new Date();  
        return dateFormat.format(date);  
    } 
    public static void main(String[] args) {
        MainProgram tgl = new MainProgram();  
        
        Scanner input = new Scanner(System.in);
        MainProgram in = new MainProgram();
        
        System.out.println("     Warung Makan Sederhana   ");
        System.out.println("Tanggal :   "+tgl.getTanggal()+tgl.getWaktu());
        System.out.println("Nama Kasir :        Tara Dhewa");
        System.out.println("==============================");
        do {
            System.out.println("Menu:");
            System.out.println("1. Nasi................Rp5.000");
            System.out.println("2. Lauk...............Rp10.000");
            System.out.println("3. Minum...............Rp5.000");
            System.out.println("\n9. Total");
            System.out.println("0. Keluar Program");
            System.out.println("------------------------------");
            System.out.println("Masukkan Pilihan Menu: ");
            in.pil = input.nextInt();
            if(in.pil>=1 && in.pil<=3){
                System.out.println("Masukkan Jumlah Beli: ");
                in.jumlah = input.nextInt();
            }else {               
            }
            in.hitungTotal(in.jumlah);
        }while(in.pil!=9);
        in.viewTotal();
       
    }
    
}
