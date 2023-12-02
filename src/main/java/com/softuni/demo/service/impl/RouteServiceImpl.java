package com.softuni.demo.service.impl;

import com.softuni.demo.model.dto.AddRouteBindingModel;
import com.softuni.demo.model.entity.Category;
import com.softuni.demo.model.entity.Route;
import com.softuni.demo.model.entity.User;
import com.softuni.demo.repository.CategoryRepository;
import com.softuni.demo.repository.RouteRepository;
import com.softuni.demo.service.RouteService;
import com.softuni.demo.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RouteServiceImpl implements RouteService {
    private final RouteRepository routeRepository;
    private final CategoryRepository categoryRepository;
    private final UserService userService;
    private final ModelMapper modelMapper;

    public RouteServiceImpl(RouteRepository routeRepository, CategoryRepository categoryRepository, UserService userService, ModelMapper modelMapper) {
        this.routeRepository = routeRepository;
        this.categoryRepository = categoryRepository;
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @Override
    public void add(AddRouteBindingModel addRouteBindingModel) {
        Route route = modelMapper.map(addRouteBindingModel, Route.class);
        route.getCategories().clear();

        Set<Category> categories = categoryRepository.findByNameIn(addRouteBindingModel.getCategories());
        route.addCategories(categories);

        User user = userService.getLoggedUser();
        route.setAuthor(user);

        routeRepository.save(route);
    }
}
