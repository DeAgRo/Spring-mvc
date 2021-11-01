package web.dao;

import web.models.Car;

import java.util.List;

/**
 * @author Ali Veliev 01.11.2021
 */

public interface CarDAO {
    List<Car> carList(Integer count);
}
