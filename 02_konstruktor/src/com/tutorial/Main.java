package com.tutorial;

class polos {
    String dataString;
    int dataInteger;
}

//class dengan konstruktor
class Mahasiswa {
    String nama;
    String nim;
    String prodi;

// // Membuat konstruktor
// mahasiswa (){     
//   System.out.printIn("ini adalah konstruktor");

//membuat konstruktor dengan parameter
  Mahasiswa (String inputNama, String inputNim, String inputProdi){
     nama = inputNama;
     nim = inputNim;
     prodi = inputProdi;

     System.out.println("Nama :" + nama);
     System.out.println("NIM :" + nim);
     System.out.println("Prodi :"+ prodi);

    }
}


public class Main {
    public static void main(String[] args) {
        // //instalasi objek dari class polos
        // polos pls= new polos();
    
        // //isi ciri pada objek pls


        // pls.dataString = "POLOS"
        // pls.dataString = 10;
    
        // //cetak data
        // System.out.printIn("isi data string:"+ pls.dataString);
        // System.out.printIn("isi data string:" pls.dataInteger);
    
        Mahasiswa mhs1 = new Mahasiswa("emil ", "22241046", "PTI");
        
    }
}

    
