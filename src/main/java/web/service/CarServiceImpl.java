package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.dao.CarDAOImpl;
import web.models.Car;

import java.util.List;

/**
 * @author Ali Veliev 01.11.2021
 */
@Component
public class CarServiceImpl implements CarService {
    private CarDAO carDAO = new CarDAOImpl();

    @Override
    public List<Car> carList(Integer count) {
        return carDAO.carList(count);
    }
}
