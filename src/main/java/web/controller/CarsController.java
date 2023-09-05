package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false) Integer count,
                               ModelMap model) {
        Car[] cars = {  new Car("Bugatti", 2, "red"),
                        new Car("Ferrari", 1, "blue"),
                        new Car("Alfa-romeo", 4, "white"),
                        new Car("BMV", 1, "greeen"),
                        new Car("Khodro", 1, "grey")};
        if (count == null) {
            count = cars.length;
        }
        List<String> messages = new ArrayList<>();
        for (int i = 0; (i < count) && (i < cars.length); i++) {
            messages.add(cars[i].toString());
        }
        model.addAttribute("messages", messages);
        return "index";
    }

}