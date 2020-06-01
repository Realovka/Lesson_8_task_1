package Engine;

import Engine.Engine;

public class DiselEngine extends Engine {

    public DiselEngine(int power) {
        super(power);
    }

    public void start() {
        System.out.println("Качаю салярку...");
        System.out.println("Накаливаю свечи");
        System.out.println("Дизельный двигатель мощностью " + getPower() + " л/с завёлся");
    }
}
