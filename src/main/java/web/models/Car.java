package web.models;

/**
 * @author Ali Veliev 31.10.2021
 */

public class Car {

    private String model;
    private int serie;
    private int speed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car(String model, int serie, int speed) {
        this.model = model;
        this.serie = serie;
        this.speed = speed;
    }
}