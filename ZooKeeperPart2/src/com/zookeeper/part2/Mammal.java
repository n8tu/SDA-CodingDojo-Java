package com.zookeeper.part2;

public class Mammal {
    private int energyLevel;
    public Mammal(){
        this.energyLevel = 100;
    }

    public int displayEnergy(){
        System.out.printf("Energy Level is: %d\n\n",energyLevel);
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

}
