# 📝 Expression Tree\_Java

Implementasi Pohon Ekspresi (Expression Tree) dengan Java
Proyek pembelajaran Java yang membangun pohon ekspresi dari notasi infix dan menampilkan traversal prefix, infix, dan postfix.

---

## 📖 Deskripsi Proyek

**Expression\_Tree\_Java** adalah proyek pembelajaran Java yang mengimplementasikan pohon ekspresi untuk mengevaluasi ekspresi matematika sederhana. Proyek ini berfokus pada:

* 📊 **TreeNode.java**: Kelas dasar untuk node pohon dengan data karakter, left node, dan right node.
* 🔍 **Tree.java**: Kelas utama untuk membangun pohon ekspresi dari notasi infix menggunakan stack, serta traversal (prefix, infix, postfix).
* 🛠️ **MainTree.java**: Kelas utama untuk menguji pohon ekspresi dengan contoh ekspresi `(a+b)*(c-d)`.

Proyek ini terdiri dari tiga file Java (**MainTree.java**, **Tree.java**, **TreeNode.java**) dalam paket `LATIHAN`. Cocok untuk pemula yang ingin mempelajari struktur data pohon dan algoritma traversal. 🟢

---

## 🧠 Teknologi

* Java

---

## 📂 Struktur File

```
Expression_Tree_Java/
├── src/LATIHAN/
│   ├── MainTree.java            # 🛠️ Kelas utama untuk pengujian
│   ├── Tree.java                # 🔍 Kelas untuk pohon ekspresi dan traversal
│   ├── TreeNode.java            # 📊 Kelas node pohon
├── README.md                    # 📖 Dokumentasi proyek
```

---

## ▶️ Menjalankan Program

### 1. Kloning Repositori

```bash
git clone https://github.com/MBAHSINGO22/Expression_Tree_Java.git
cd Expression_Tree_Java
```

### 2. Pastikan Java Terinstal

```bash
java -version
```

Jika belum terinstal, unduh dari [java.com](https://www.java.com).

### 3. Kompilasi dan Jalankan Kode

Pastikan struktur paket dipertahankan.

**Kompilasi:**

```bash
javac -d bin src/LATIHAN/*.java
```

**Jalankan:**

```bash
java -cp bin LATIHAN.MainTree
```

---

## 🟢 Catatan

* Pastikan Anda memiliki Java Development Kit (JDK) yang terinstal.
* Program menerima ekspresi infix dengan tanda kurung dan operator dasar (+, -, \*, /).
* Traversals mencetak hasil dengan spasi, sesuai dengan struktur pohon yang dibangun.
* Tidak ada dependensi eksternal; gunakan pustaka standar Java.

---

## 📈 Contoh Output

**MainTree.java**

```
Prefix Traversal:
* + a b - c d

Infix Traversal:
((a + b )* (c - d ))

Postfix Traversal:
a b + c d - *
```

---

## 👨‍💻 Pengembang

**MBAHSINGO22**
🔗 [GitHub](https://github.com/MBAHSINGO22)
