package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;
import web.repository.CarRepository;
import web.repository.CarRepositoryImpl;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    CarRepository carRep;
    @Autowired
    public CarServiceImpl(CarRepository carRep) {
        this.carRep = carRep;
    }

    @Override
    public List<Car> getByCount(Integer count) {
        if (count <= 4 && count >= 1) {
            return carRep.getAll().stream().limit(count).collect(Collectors.toList());
        } else {
            return carRep.getAll();
        }
    }
}
