package web.dao;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ali Veliev 01.11.2021
 */

public class CarDAOImpl implements CarDAO {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 3, 280));
        cars.add(new Car("Mercedes", 4, 220));
        cars.add(new Car("Jaguar", 5, 240));
        cars.add(new Car("Hundai", 6, 260));
        cars.add(new Car("Mazda", 7, 300));
        cars.add(new Car("Opel", 8, 320));
        cars.add(new Car("Kia", 9, 340));
    }

    @Override
    public List<Car> carList(Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
