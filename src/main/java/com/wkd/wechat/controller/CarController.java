package com.wkd.wechat.controller;

import com.wkd.wechat.entity.Car;
import com.wkd.wechat.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;
    @GetMapping("/findAll")
    public List<Car> findAll(){
        return carService.findAll();
    }
}
