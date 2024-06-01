package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Controller
public class Cars {

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<String> cars = new ArrayList<>();
        cars.add("Volkswagen");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Seat");
        cars.add("Skoda");
        cars.add("Mercedes");
        cars.add("Toyota");
        cars.add("MINI");
        cars.add("Porsche");

        List<String> ncars = new ArrayList<>();
        if(count > 0 && count <= 4) {
            for (int i = 0; i < count; i++) {
                ncars.add(cars.get(i));
            }
            model.addAttribute("message", ncars);
        } else {
            model.addAttribute("message", cars);
        }
        return "cars/model";
    }
}
