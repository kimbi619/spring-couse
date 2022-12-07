package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private String brand;
    private String imei;
    private int power;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", imei='" + imei + '\'' +
                ", power=" + power +
                '}';
    }
}
