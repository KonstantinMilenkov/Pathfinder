package com.softuni.demo.controller;

import com.softuni.demo.model.dto.AddRouteBindingModel;
import com.softuni.demo.model.enums.CategoryNames;
import com.softuni.demo.model.enums.Level;
import com.softuni.demo.service.RouteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/routes")
public class RouteController {
    private RouteService routeService;

    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping("/add")
    public ModelAndView addRoute(){
        ModelAndView modelAndView = new ModelAndView("add-route");

        modelAndView.addObject("levels", Level.values());
        modelAndView.addObject("categories", CategoryNames.values());

        return modelAndView;
    }
    @PostMapping("/add")
    public ModelAndView addRoute(AddRouteBindingModel addRouteBindingModel){

        routeService.add(addRouteBindingModel);

        return new ModelAndView("redirect:/");
    }
}
