/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaanapp;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class BukuService {
    public static List<Buku> getAllBuku() {
        List<Buku> list = new ArrayList<>();
        try (Connection conn = Database.getConnection()) {
            String sql = "SELECT * FROM buku";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                list.add(new Buku(
                    rs.getInt("id"),
                    rs.getString("judul"),
                    rs.getString("pengarang"),
                    rs.getString("penerbit"),
                    rs.getInt("tahun_terbit")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Gagal menampilkan data: " + e.getMessage());
        }
        return list;
    }

    public static void tambahBuku(String judul, String pengarang, String penerbit, int tahunTerbit) {
        try (Connection conn = Database.getConnection()) {
            String sql = "INSERT INTO buku (judul, pengarang, penerbit, tahun_terbit) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, judul);
            ps.setString(2, pengarang);
            ps.setString(3, penerbit);
            ps.setInt(4, tahunTerbit);
            ps.executeUpdate();
            System.out.println("Buku berhasil ditambahkan.");
        } catch (SQLException e) {
            System.out.println("Gagal menambahkan buku: " + e.getMessage());
        }
    }
}


