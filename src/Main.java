import Engine.Engine;
import Engine.DiselEngine;
import Engine.GasEngine;
import Transmition.Automatic;
import Transmition.Manual;
import Transmition.Robot;
import Transmition.Transmission;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new GasEngine(200);
        Engine engine2 = new DiselEngine(300);
        Transmission transmission1 = new Manual();
        Transmission transmission2 = new Automatic();
        Transmission transmission3 = new Robot();


        Car car = new Car("Audi", 2700, engine1, transmission1);
        car.start();
        System.out.println();
        Car car1 = new Car("BMV", 3500, engine2, transmission2);
        car1.start();
        System.out.println();
        Car car3 = new Car("Peugeot", 10000, engine2, transmission3);
        car3.start();
    }
}
