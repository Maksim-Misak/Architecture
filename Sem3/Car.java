package Sem3;

import java.awt.*;

enum TypeCar {
    SEDAN,
    PICKUP,
}

enum TypeFuel {
    GASOLINE,
    DIESEL,
}

enum TypeGear {
    MT,
    AT,
}

abstract class Car {
    private String brand;
    private String model;
    private Color color;
    private TypeCar type;
    private int numberOfWheels;
    private TypeFuel fuelType;
    private TypeGear gearboxType;
    private double engineCapacity;

    public void movement() {
    }

    public void maintenance() {
    }

    public void gearShift() {
    }

    public boolean switchHeadLights() {
        return true;
    }

    public boolean switchWipers() {
        return true;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeCar getType() {
        return type;
    }

    public void setType(TypeCar type) {
        this.type = type;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public TypeGear getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(TypeGear gearboxType) {
        this.gearboxType = gearboxType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

}

class Pickup extends Car implements Refueling, Wiping {
    private int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void refuel() {
    }

    @Override
    public void wipeHeadlights() {
    }

    @Override
    public void wipeWindshield() {
    }

    @Override
    public void wipeMirrors() {
    }

}

class FutureCar extends Car {
    public FutureCar() {
        this.setNumberOfWheels(3);
    }

    @Override
    public void movement() {
        fly();
    }

    private void fly() {
    }
}

