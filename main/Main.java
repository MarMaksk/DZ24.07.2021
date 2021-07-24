package com.main;


import com.company.MachineModel1;
import com.company.MachineModel2;
import com.company.MachineModel3;

public class Main {

    public static void main(String[] args)  {
        MachineModel1 model1 = new MachineModel1(110, 500, 110);
       model1.enable();
        model1.cookEspresso();
        model1.cookEspresso();
        model1.cookEspresso();
        model1.cookEspresso();
        model1.cookEspresso();
        model1.cookEspresso();
        model1.cookEspresso();
        MachineModel2 model2 = new MachineModel2(110, 500, 110, 500);
        model2.enable();
        model2.cappuchino(50);
        model2.latte(20);
        model2.cookEspresso();
        MachineModel3 model3 = new MachineModel3(110, 500, 110, 500, 50);
        model3.enable();
        model3.latte(50);
        model3.cookAmericano();
    }
}
