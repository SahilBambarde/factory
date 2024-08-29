package org.example1;

public class CarFactory {
    public Car getCar(String carType){
        if(carType==null){
            return null;
        }
        if(carType.equalsIgnoreCase("SUV")){
            return new SUV();
        }
        else if(carType.equalsIgnoreCase("Sedan")){
            return new Sedan();
        }
        else if(carType.equalsIgnoreCase("Mini")){
            return new Mini();
        }
        return null;
    }
}
