package web.service;

import web.model.Car;

import java.util.List;

public interface CarServ {
    List<Car> getCars(Integer count);
}
