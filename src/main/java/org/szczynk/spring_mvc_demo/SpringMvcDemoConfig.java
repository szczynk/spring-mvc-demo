package org.szczynk.spring_mvc_demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// ## Configuration
//
// - Untuk membuat ApplicationContext dengan Annotation, perlu dibuat Configuration class.
// - Configuration Class adalah class untuk mengkonfigurasi bean dan komponen aplikasi
//   yang ditandai dengan anotasi `@Configuration`.
//
// ## Component Scan
//
// - Spring memiliki fitur "component scan" yang memungkinkan mengimpor otomatis semua
//   Configuration class dari satu package dan subpackage yang ditentukan.
// - Annotation `@ComponentScan` digunakan untuk mengaktifkan fitur "component scan".
// - Dalam kode, annotation `@ComponentScan` diikuti dengan `basePackages` yang berisi
//   package yang ingin di-scan.
// - Fitur "component scan" memudahkan pengelompokan dan mengatur berbagai
//   konfigurasi tanpa perlu impor satu per satu.
//
// ## @EnableWebMvc
//
// - @EnableWebMvc adalah anotasi yang digunakan untuk mengaktifkan fitur MVC
//   dalam framework Spring
// - @EnableWebMvc menghidupkan fitur-fitur seperti pengelolaan URL,
//   pengubahan format data request dan response HTTP, serta manajemen exception.
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.szczynk"})
public class SpringMvcDemoConfig implements WebMvcConfigurer {
    // di video, beliau mengubah view resolver ke folder /WEB-INF/
    // dan file ekstensi .jsp
    // @Bean
    // public InternalResourceViewResolver viewResolver() {
    //     InternalResourceViewResolver vr = new InternalResourceViewResolver();
    //     vr.setPrefix("/WEB-INF/");
    //     vr.setSuffix(".jsp");
    //     return vr;
    // }
}
