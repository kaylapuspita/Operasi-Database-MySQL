/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaanapp;
import java.util.List;
import java.util.Scanner;



public class BukuApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tampilkan semua buku");
            System.out.println("2. Tambah buku");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = input.nextInt();
            input.nextLine(); // buang newline

            if (pilih == 1) {
                List<Buku> daftar = BukuService.getAllBuku();
                System.out.println("\n--- DAFTAR BUKU ---");
                for (Buku b : daftar) {
                    System.out.println(b);
                }
            } else if (pilih == 2) {
                System.out.print("Judul: ");
                String judul = input.nextLine();
                System.out.print("Pengarang: ");
                String pengarang = input.nextLine();
                System.out.print("Penerbit: ");
                String penerbit = input.nextLine();
                System.out.print("Tahun Terbit: ");
                int tahun = input.nextInt();
                input.nextLine(); // buang newline
                BukuService.tambahBuku(judul, pengarang, penerbit, tahun);
            } else if (pilih == 3) {
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}


