package Engine;

import Engine.Engine;

public class GasEngine extends Engine {


    public GasEngine(int power) {
        super(power);

    }

    public void start() {
        System.out.println("Качаю бензин...");
        System.out.println("Даю искру");
        System.out.println("Бензиновый двигатель мощностью " + getPower() + " л/с завёлся");
    }
}
