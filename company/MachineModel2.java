package com.company;

public class MachineModel2 extends MachineModel1 implements CoffeMachineNew {
    protected int milkTank;

    public MachineModel2(int coffeTank, int waterTank, int milkTank, int tankVolume) {
        this.coffeTank = coffeTank;
        this.waterTank = waterTank;
        this.milkTank = milkTank;
        this.tankVolume = tankVolume;
    }

    public MachineModel2(int coffeTank, int waterTank, int tankVolume) {
        this.coffeTank = coffeTank;
        this.waterTank = waterTank;
        this.tankVolume = tankVolume;
    }

    public MachineModel2() {
    }

    private boolean Check(int water, int milk) {
        boolean errorCheck = true;
        if (state == false) {
            errorCheck = false;
        } else if (coffeTank < CoffeMachine.coffe) {
            CoffeMachine.absentCoffe();
            errorCheck = false;
        } else if (waterTank < water) {
            CoffeMachine.absentWater();
            errorCheck = false;
        } else if (tankTrash >= tankVolume) {
            CoffeMachine.tankIsFull();
            errorCheck = false;
        } else if (milkTank < milk) {
            CoffeMachineNew.absentMilk();
            errorCheck = false;
        }
        return errorCheck;
    }



    @Override
    public void latte(int pouredMilk) {
        if (Check(CoffeMachine.waterEspresso, pouredMilk) == true) {
            System.out.println("Латте готово");
            this.coffeTank -= CoffeMachine.coffe;
            this.waterTank -= CoffeMachine.waterEspresso;
            this.tankTrash += CoffeMachine.coffe;
            this.milkTank -= pouredMilk;
        }
    }

    @Override
    public void cappuchino(int pouredMilk) {
        if (Check(CoffeMachine.waterEspresso, pouredMilk) == true) {
            System.out.println("Капучино готово");
            this.coffeTank -= CoffeMachine.coffe;
            this.waterTank -= CoffeMachine.waterEspresso;
            this.tankTrash += CoffeMachine.coffe;
            this.milkTank -= pouredMilk;
        }
    }
}
