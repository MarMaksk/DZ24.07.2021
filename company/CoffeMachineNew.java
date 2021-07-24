package com.company;

public interface CoffeMachineNew extends CoffeMachine{

    void latte(int pouredMilk);

    void cappuchino(int pouredMilk);

    static void absentMilk() {
        System.out.println("Отсутсвует молоко");
    }
}
