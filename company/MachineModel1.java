package com.company;

public class MachineModel1 implements CoffeMachine {
    protected boolean state = false;
    protected int coffeTank;
    protected int waterTank;
    protected int tankVolume;
    protected int tankTrash;

    public MachineModel1(int coffeTank, int waterTank, int tankVolume) {
        this.coffeTank = coffeTank;
        this.waterTank = waterTank;
        this.tankVolume = tankVolume;
    }

    public MachineModel1() {
    }


    private boolean Check(int water) {
        boolean errorCheck = true;
        if (state == false) {
            errorCheck = false;
        } else if (coffeTank < CoffeMachine.coffe) {
            CoffeMachine.absentCoffe();
            errorCheck = false;
        } else if (waterTank < water) {
            CoffeMachine.absentWater();
            errorCheck = false;
        } else if (tankTrash == tankVolume) {
            CoffeMachine.tankIsFull();
            errorCheck = false;
        }
        return errorCheck;
    }

    @Override
    public void cookEspresso() {
        if (Check(CoffeMachine.waterEspresso) == true) {
            System.out.println("Эспрессо готово");
            this.coffeTank-=CoffeMachine.coffe;
            this.waterTank-=CoffeMachine.waterEspresso;
            this.tankTrash+=CoffeMachine.coffe;
        }
    }

    @Override
    public void cookAmericano() {
        if (Check(CoffeMachine.waterAmericano) == true) {
            System.out.println("Американо готово");
            this.coffeTank-=CoffeMachine.coffe;
            this.waterTank-=CoffeMachine.waterAmericano;
            this.tankTrash+=CoffeMachine.coffe;
        }
    }

    @Override
    public boolean enable() {
        return state = true;
    }

    @Override
    public boolean disable() {
        return state = false;
    }

    @Override
    public void clearTanks() {
        this.tankTrash = 0;
    }


}
