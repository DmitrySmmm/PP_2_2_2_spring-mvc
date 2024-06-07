package web.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepositoryImpl implements CarRepository {

    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Volkswagen", "Golf", 1.8));
        cars.add(new Car("Audi", "A6", 3.0));
        cars.add(new Car("BMW", "3", 2.0));
        cars.add(new Car("Seat","Freetrack",2.0));
        cars.add(new Car("Skoda","Octavia",1.8));
        cars.add(new Car("Mercedes","E-Klasse",3.5));
        cars.add(new Car("Toyota","Corolla", 1.6));
        cars.add(new Car("MINI","Countryman", 2.0));
        cars.add(new Car("Porsche","Cayenne", 4.0));
    }

    @Override
    public List<Car> getAll() {
        return cars;
    }
}
