# Operasi-Database-MySQL

# 📚 Aplikasi Perpustakaan Java (Koneksi MySQL)

Sebuah aplikasi sederhana berbasis Java yang terhubung dengan database MySQL untuk mengelola data buku di perpustakaan. Dibuat dengan fokus pada kemudahan penggunaan, konektivitas database, dan pengelolaan data yang efisien. 🚀

---

## 🛠️ Fitur Utama

✨ **1. Tampilkan Semua Buku**  
Menampilkan seluruh daftar buku dari database langsung ke terminal.

📝 **2. Tambah Buku Baru**  
Input data buku seperti judul, pengarang, penerbit, dan tahun terbit lalu simpan ke database.

🚪 **3. Keluar Aplikasi**  
Keluar dari menu interaktif dengan aman.

---

## 🗃️ Struktur Database (Tabel `buku`)

```sql
CREATE TABLE buku (
    id INT PRIMARY KEY AUTO_INCREMENT,
    judul VARCHAR(100) NOT NULL,
    pengarang VARCHAR(100) NOT NULL,
    penerbit VARCHAR(100) NOT NULL,
    tahun_terbit INT NOT NULL
);


💻 Teknologi yang Digunakan
☕ Java With Ant

🛢️ MySQL Database

🔗 JDBC (MySQL Connector)

🧠 NetBeans IDE


Tentang
Dibuat oleh Kayla Puspita Khairiyah
Sebagai latihan pemrograman Java dan integrasi dengan MySQL
👩‍💻 Mahasiswa Teknik Informatika - Universitas Nusa Putra
