package com.example.demo.controller;

import com.example.demo.service.CityService;
import com.example.demo.service.CountyService;
import com.example.demo.service.ProvinceService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CityController {
    @Autowired
    private CityService cityService;
    @Autowired
    private ProvinceService provinceService;
    @Autowired
    private UserService userService;
    @Autowired
    private CountyService countyService;
    @RequestMapping(value = "allCity",method = RequestMethod.GET)
    public String allCity(Model model){
        model.addAttribute("allCity",cityService.getAllCity());
        return "index";
    }
    @GetMapping(value = "allProvince")
    public String allProvince(Model model){
        model.addAttribute("allProvince",provinceService.getAllProvince());
        return "index";
    }
    @GetMapping(value = "allUser")
    public String allUser(Model model, HttpServletRequest request){
        request.getSession().setAttribute("yebing","yebing");
        model.addAttribute("allUser",userService.getAllUser());
        System.out.println(request.getSession().getAttribute("yebing"));
        return "index";
    }
    @GetMapping(value = "allCounty")
    public String allCounty(Model model){
        model.addAttribute("allCounty",countyService.findByCountyName("梅县区"));
        return "index";
    }
    @GetMapping(value = "message")
    public String message(@RequestParam(name="message", required=false, defaultValue="World") String message, Model model){
        message = countyService.findByCountyName("梅县区").toString();
        model.addAttribute("message",message);
        return "index";
    }
}
