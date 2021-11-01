package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

/**
 * @author Ali Veliev 31.10.2021
 */
@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String carInfo(@RequestParam(value = "count", defaultValue = "999999") Integer count, Model model){
        if (count < 5) {
            model.addAttribute("cars", carService.carList(count));
        } else {
            model.addAttribute("cars", carService.carList(999999));
        }
        return "cars";
    }
}
