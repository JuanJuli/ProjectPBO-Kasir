package kasir;

import gui.formkasir;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Kasir {
    
    public static void main(String[] args) {
        
        
//        Scanner scan = new Scanner(System.in);
//        Menu :
//        System.out.println("Pilih Menu");
//        System.out.println("1.Masukan Produk Makanan");
//        System.out.println("2.Masukan Proudk Minuman");
//        System.out.print("Pilihan : ");
//        int cari= scan.nextInt();
//        if(cari==1){
//            System.out.println("Masukan Data");
//            System.out.print("Nama Produk : ");
//            String txtNama = scan.next();
//            System.out.print("Kode Produk : ");
//            String txtKode = scan.next();
//            System.out.print("Harga : ");
//            int txtHarga = scan.nextInt();
//            System.out.print("Berat : ");
//            int txtBerat = scan.nextInt();
//
//            Produk produk = new Makanan(txtNama, txtKode, txtHarga);
//            ((Makanan)produk).setUkuran(txtBerat);
//            ((Makanan)produk).showMakanan();
//        }else if (cari==2){
//            System.out.print("Kode Produk : ");
//            String txtKode = scan.next();
//            System.out.print("Nama Produk : ");
//            String txtNama = scan.next();
//            System.out.print("Harga : ");
//            int txtHarga = scan.nextInt();
//            System.out.print("Berat : ");
//            int txtBerat = scan.nextInt();
//
//            Produk produk = new Minuman(txtNama, txtKode, txtHarga);
//            ((Minuman)produk).setUkuran(txtBerat);
//            ((Minuman)produk).showMinuman();
            
//        }   
            
            java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                                
                new formkasir().setVisible(true);                
            }
        });
    }    
}
