package io.github.bayu1993.cardgallery;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 3/29/18.
 */

public class Car {
    private int id;
    private int year;
    private String merk;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public static List<Car> generateData(){
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            Car car = new Car();
            car.setId(i);
            car.setMerk("Toyota "+i);
            car.setYear(2000 + i);

            cars.add(car);
        }
        return cars;
    }
}