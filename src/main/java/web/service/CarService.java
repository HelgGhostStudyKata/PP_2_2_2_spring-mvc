package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    private Car[] cars = {  new Car("Bugatti", 2, "red"),
            new Car("Ferrari", 1, "blue"),
            new Car("Alfa-romeo", 4, "white"),
            new Car("BMV", 1, "greeen"),
            new Car("Khodro", 1, "grey")};
    public List<Car> getListCarCount(Integer count) {
        count = (count == null) ? cars.length : (count < 0) ? 0 : count;
        List<Car> listCars= new ArrayList<>(Arrays.asList(cars));
        return listCars.subList(0, count);
    }
}
