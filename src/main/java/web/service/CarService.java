package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CarService implements CarServ {

    private List<Car> cars;

    public CarService() {
        this.cars = Stream.of(
               new Car("Toyota", "Camry", 2020),
                new Car("Honda", "Accord", 2019),
                new Car("Ford", "Mustang", 2021),
                new Car("Chevrolet", "Malibu", 2018),
                new Car("BMW", "3 Series", 2022)
        ).collect(Collectors.toList());
    }

   @Override
    public List<Car> getCars(Integer count) {
        if(count == null || count>4) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
   }
}
