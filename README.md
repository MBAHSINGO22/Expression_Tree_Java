# 📝 Expression Tree Java

Implementasi Pohon Ekspresi (Expression Tree) dengan Java
Proyek Java yang membangun pohon ekspresi dari notasi infix dan menampilkan traversal prefix, infix, dan postfix.

---

## 📖 Deskripsi Proyek

**Expression_Tree_Java** adalah proyek Java yang mengimplementasikan pohon ekspresi untuk mengevaluasi ekspresi matematika sederhana. Proyek ini berfokus pada:

* 📊 **TreeNode.java**: Kelas dasar untuk node pohon dengan data karakter, left node, dan right node.
* 🔍 **Tree.java**: Kelas utama untuk membangun pohon ekspresi dari notasi infix menggunakan stack, serta traversal (prefix, infix, postfix).
* 🛠️ **MainTree.java**: Kelas utama untuk menguji pohon ekspresi dengan contoh ekspresi `(a+b)*(c-d)`.

Proyek ini terdiri dari tiga file Java (**MainTree.java**, **Tree.java**, **TreeNode.java**) dalam paket `LATIHAN`. 🟢

---

## 🧠 Teknologi

* Java

---

## 📂 Struktur File

```
Expression_Tree_Java/
├── src/LATIHAN/
├── MainTree.java            # 🛠️ Kelas utama untuk pengujian
├── Tree.java                # 🔍 Kelas untuk pohon ekspresi dan traversal
├── TreeNode.java            # 📊 Kelas node pohon
```

---

## 🟢 Catatan

* Program menerima ekspresi infix dengan tanda kurung dan operator dasar (+, -, \*, /).
* Traversals mencetak hasil dengan spasi, sesuai dengan struktur pohon yang dibangun.

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
