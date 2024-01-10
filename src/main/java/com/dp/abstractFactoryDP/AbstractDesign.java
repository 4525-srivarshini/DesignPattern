package com.dp.abstractFactoryDP;

public class AbstractDesign {
    public static void main(String[] args)
    {
        System.out.println(CarFactory.buildCar(CarFactory.CarType.MICRO));
        System.out.println(CarFactory.buildCar(CarFactory.CarType.MINI));
        System.out.println(CarFactory.buildCar(CarFactory.CarType.LUXURY));
    }
}
