/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaanapp;





public class Buku {
    int id;
    String judul;
    String pengarang;
    String penerbit;
    int tahunTerbit;

    public Buku(int id, String judul, String pengarang, String penerbit, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    public String toString() {
        return id + ". " + judul + " - " + pengarang + ", " + penerbit + " (" + tahunTerbit + ")";
    }
}


