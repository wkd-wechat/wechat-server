package com.wkd.wechat.service;

import com.wkd.wechat.dao.CarDao;
import com.wkd.wechat.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarDao carDao;
    public List<Car> findAll(){
        return carDao.findAll();
    }
}
