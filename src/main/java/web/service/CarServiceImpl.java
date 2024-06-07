package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;
import web.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRep;

    @Override
    public List<Car> showCar(Integer count) {
        if (count <= 4 && count >= 1) {
            return carRep.getCars().stream().limit(count).collect(Collectors.toList());
        } else {
            return carRep.getCars();
        }
    }
}
