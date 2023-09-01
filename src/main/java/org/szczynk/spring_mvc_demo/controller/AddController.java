package org.szczynk.spring_mvc_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.szczynk.spring_mvc_demo.service.AddService;

// ## Controller
//
// - Untuk membuat Controller di Spring, kita bisa menggunakan annotation `@Controller`
// - Di annotation `@Controller` sendiri, sebenarnya terdapat annotation `@Component`,
//   hal ini membuat class yang kita tambahkan annotation `@Controller`,
//   akan secara otomatis teregistrasi sebagai Bean
// - `@Controller` adalah sebuah stereotype, dimana bertujuan mengkategorisasikan
//   Component-component
@Controller
public class AddController {
    // @Autowired
    //
    // - Spring awalnya hanya mendukung satu konstruktor untuk
    //   Constructor-based Dependency Injection.
    // - Namun, untuk multiple constructors, gunakan annotation `@Autowired`
    //   untuk menandai konstruktor yang akan digunakan oleh Spring.
    @Autowired
    private AddService addService;

    // ## Request Mapping
    //
    // - Saat kita belajar menggunakan Servlet, untuk membuat Routing pada Servlet kita
    //   menggunakan annotation `@WebServlet`
    // - Di Spring WebMVC, untuk menambahkan Routing, kita bisa menggunakan annotation
    //   `@RequestMapping` pada method yang ingin kita jadikan sebagai Controller Handler nya
    //
    // ## @RequestParam
    //
    // - Seperti pernah kita bahas di materi Java Servlet,
    //   untuk mendapatkan data Form Request, dengan mendapatkan data di Query Parameter
    // - Begitu pula di Spring Web MVC,
    //   Untuk mendapatkan data di Form Request, kita bisa menggunakan annotation `@RequestParam`
    // - Secara otomatis Spring Web MVC juga akan mengambil data dari Form Request atau Query Parameter

    @RequestMapping(path = "/add")
    public ModelAndView add(
            @RequestParam("i") int i,
            @RequestParam("j") int j
            // HttpServletRequest request,
            // HttpServletResponse response
    ) {
        // int i = Integer.parseInt(request.getParameter("i"));
        // int j = Integer.parseInt(request.getParameter("j"));

        int result = addService.add(i, j);

        // ## Model And View
        //
        // - Untuk menampilkan View, kita bisa mengembalikan return object ModelAndView
        //   pada Controller Method
        // - Dalam ModelAndView, kita bisa memasukkan data template yang dipilih untuk
        //   View, dan juga Model yang akan ditampilkan di View
        ModelAndView mv = new ModelAndView();
        mv.setViewName("display.jsp");
        mv.addObject("result", result);

        return mv;
    }
}
