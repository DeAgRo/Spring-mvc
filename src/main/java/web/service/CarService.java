package web.service;

import web.models.Car;

import java.util.List;

/**
 * @author Ali Veliev 01.11.2021
 */

public interface CarService {
    List<Car> carList(Integer count);
}