package org.SpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/alien")
    public String alien() {
        return "alien";
    }

//    ModelAndView object
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("fnum") int num1, @RequestParam("snum") int snum, ModelAndView modelAndView) {

        int result = num1 + snum;
        modelAndView.addObject("result", result);
        modelAndView.setViewName("result");
        return modelAndView;
    }

    //    Using @ModelAttribute
    @RequestMapping("addAlien")
    public String addAlien(Alien alien) {
        return "resAlien";
    }

    @ModelAttribute("course")
    public String courseName(){
        String cname = "Java-Spring";
        return cname;
    }

    //        -------------Servlet way of handling request---------------
//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session) {
//        Integer num1 = Integer.parseInt(req.getParameter("fnum"));
//        Integer num2 = Integer.parseInt(req.getParameter("snum"));
//        int result = num1 + num2;
//
//        session.setAttribute("result", result);
//
//        return "result.jsp";
//    }

//    --------------Spring way to handling request-------------------
//    @RequestMapping("add")
//    public String add(@RequestParam("fnum") int num1, int snum, HttpSession session) {
//
//        int result = num1 + snum;
//        session.setAttribute("result", result);
//        return "result.jsp";
//    }
//}

//    Model Object to pass data between Controller and View
//    @RequestMapping("add")
//    public String add(@RequestParam("fnum") int num1, int snum, Model model) {
//
//        int result = num1 + snum;
//        model.addAttribute("result", result);
//        return "result";
//    }


//        Need of @ModelAttribute -- You dont want to fetch request params and set it  on object one by one
//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int id, @RequestParam("aname") String name, ModelAndView modelAndView) {
//
//        Alien alien = new Alien();
//        alien.setAid(id);
//        alien.setAname(name);
//
//        modelAndView.addObject("alien", alien);
//        modelAndView.setViewName("resAlien");
//        return modelAndView;
//    }



}