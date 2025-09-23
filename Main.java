/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author iputu
 */
import java.util.Scanner;
import java.util.ArrayList;

class pesanan{
    String barang;
    int harga;
    int jumlah;
    
    public pesanan(String barang, int harga, int jumlah){
        this.barang = barang;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    public int hitungTotal(){
        return harga * jumlah;
    }
    
    public void tampilkan(){
        System.out.println(barang + "x" + jumlah + "=" + hitungTotal());
    }
}

public class Main {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<pesanan> daftarPesanan = new ArrayList<>();
            
            while(true){
                System.out.print("Masukan nama barang atau 'Selesai' jika tidak ada barang: ");
                String barang = input.nextLine();
                
                if(barang.equalsIgnoreCase("Selesai")){
                    break;
                }
                
                System.out.println("Masukan harga barang: ");
                int harga = Integer.parseInt(input.nextLine());
                
                System.out.println("Masukan jumlah barang: ");
                int jumlah = Integer.parseInt(input.nextLine());
                
                pesanan baru = new pesanan(barang,harga,jumlah);
                daftarPesanan.add(baru);
                
                System.out.println("Barang sudah dimasukan");
            }
            
            System.out.println("\n===== Daftar pesanan =====");
            int total = 0;
            for(int i = 0; i<daftarPesanan.size(); i++){
                System.out.print("Barang "+ (i+1));
                daftarPesanan.get(i).tampilkan();
                total = total + daftarPesanan.get(i).hitungTotal();
            }
            System.out.println("Total harga : " + total);
        }
        catch(Exception e){
            System.out.println("System error mohon beri tau operator atau teknisi!");
        }
    }
}
