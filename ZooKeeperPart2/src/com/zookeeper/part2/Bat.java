package com.zookeeper.part2;

public class Bat extends Mammal {

    public Bat(){
        this.setEnergyLevel(300);
    }

    public void fly(){
        System.out.println("sound a bat taking off \n");
        int newEnergy = this.getEnergyLevel() - 50;
        this.setEnergyLevel(newEnergy);
    }

    public void eatHumans(){
        System.out.println("so- well, never mind \n");
        int newEnergy = this.getEnergyLevel() + 25;
        this.setEnergyLevel(newEnergy);
    }

    public void attackTown(){
        System.out.println("sound of a town on fire \n");
        int newEnergy = this.getEnergyLevel() - 100;
        this.setEnergyLevel(newEnergy);
    }
}
