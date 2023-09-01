package org.szczynk.spring_mvc_demo.service;


// ## Service
//
// ### Service Layer
//
// - Di awal kita belajar tentang MVC (Model View Controller)
// - Di bahasa pemrograman atau framework lain, biasanya orang menambahkan
//   kode yang berhubungan dengan bisnis logic di Controller Layer, namun
//   berbeda dengan programmer Java
// - Untuk programmer Java, sebenarnya kebiasaan atau best practice-nya
//   akan membuat layer khusus untuk kode bisnis logic, bernama Service Layer
// - Service Layer di Spring memiliki annotation khusus, yaitu `@Service`
// - Saat kita menambahkan `@Service`, secara otomatis juga class tersebut
//   akan di registrasikan sebagai bean
//
// ### Interface
//
// - Salah satu best practice di Spring adalah, saat kita membuat Service Layer,
//   kita akan buat dalam bentuk Interface
// - Lalu kita akan buat class implementasi yang diregistrasikan sebagai Spring Bean
// - Sedangkan class yang membutuhkan Service Layer tersebut, akan menggunakan Interface-nya,
//   bukan class implementasinya
// - Salah satu keuntungan mengekspos Interface dibanding Class adalah, kita bisa mengubah
//   atau mengganti isi dari class implementasi, tanpa berdampak pada class lain yang menggunakan
//   interface nya
public interface AddService {
    int add(int i, int j);
}
