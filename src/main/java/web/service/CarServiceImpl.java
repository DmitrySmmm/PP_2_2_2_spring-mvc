package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.repository.CarRepository;
import java.util.List;
import java.util.stream.Collectors;

@Service
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
        }
        return carRep.getAll();
    }
}
