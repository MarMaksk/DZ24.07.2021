package com.company;

public interface CoffeMachineNewNew extends CoffeMachineNew {

    void grainCoffee(int grains);

    static void absentGrains() {
        System.out.println("Отсутсвует зерновой кофе");
    }
}
