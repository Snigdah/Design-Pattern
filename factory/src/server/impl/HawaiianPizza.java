package server.impl;

import server.Pizza;

public class HawaiianPizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing Hawaiian Pizza");
    }
    public void bake() {
        System.out.println("Baking Hawaiian Pizza");
    }
    public void cut() {
        System.out.println("Cutting Hawaiian Pizza");
    }
    public void box() {
        System.out.println("Boxing Hawaiian Pizza");
    }
}
