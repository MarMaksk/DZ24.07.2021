package com.company;

public class MachineModel3 extends MachineModel2 implements CoffeMachineNewNew {
    protected int grainsTank;

    public MachineModel3(int coffeTank, int waterTank, int milkTank, int tankVolume, int grainsTank) {
        this.coffeTank = coffeTank;
        this.waterTank = waterTank;
        this.milkTank = milkTank;
        this.tankVolume = tankVolume;
        this.grainsTank = grainsTank;
    }

    public MachineModel3(int coffeTank, int waterTank, int milkTank, int tankVolume) {
        this.coffeTank = coffeTank;
        this.waterTank = waterTank;
        this.milkTank = milkTank;
        this.tankVolume = tankVolume;
    }

    public MachineModel3(int coffeTank, int waterTank, int tankVolume) {
        this.coffeTank = coffeTank;
        this.waterTank = waterTank;
        this.tankVolume = tankVolume;
    }

    public MachineModel3() {
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
        } else if (tankTrash == tankVolume) {
            CoffeMachine.tankIsFull();
            errorCheck = false;
        } else if (milkTank < milk) {
            CoffeMachineNew.absentMilk();
            errorCheck = false;
        } else if (grainsTank < CoffeMachine.coffe){
            CoffeMachineNewNew.absentGrains();
            errorCheck = false;
        } else if (coffeTank < CoffeMachine.coffe && grainsTank >= (CoffeMachine.coffe-coffeTank)){
            grainCoffee(CoffeMachine.coffe-coffeTank);
        }
        return errorCheck;
    }



    @Deprecated
    public void cookEspresso() {
    }


    @Deprecated
    public void clearTanks() {

    }


    @Deprecated
    public void cappuchino(int pouredMilk) {

    }

    @Override
    public void grainCoffee(int grains) {
        grainsTank-=grains;
        tankVolume+=grains;
    }
}
