package com.company;

public interface CoffeMachine {
    int coffe = 22;
    int waterEspresso = 30;
    int waterAmericano = 100;

    void cookEspresso();

    void cookAmericano();

    boolean enable();

    boolean disable();

    void clearTanks();


    static void absentWater() {
        System.out.println("Отсутсвует вода");
    }

    static void absentCoffe() {
        System.out.println("Отсутствует кофе");
    }

    static void tankIsFull() {
        System.out.println("Бак для отходов заполнен");
    }

}
