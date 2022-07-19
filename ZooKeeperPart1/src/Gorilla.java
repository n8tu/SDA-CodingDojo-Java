public class Gorilla extends Mammal {

    public void throwSomething(){
        System.out.println("Gorilla has thrown something \n");
        int newEnergy = this.getEnergyLevel() - 5;
        if(newEnergy < this.getMin_energy_level()){
            newEnergy = this.getMin_energy_level();
        }
        this.setEnergyLevel(newEnergy);
    }

    public void eatBananas(){
        System.out.println("Gorilla's Energy recovered 10 by eating a banana \n");
        int newEnergy = this.getEnergyLevel() + 10;
        if(newEnergy > this.getMax_energy_level()){
            newEnergy = this.getMax_energy_level();
        }
        this.setEnergyLevel(newEnergy);
    }

    public void climb(){
        System.out.println("Gorilla has climbed a tree \n");
        int newEnergy = this.getEnergyLevel() - 10;
        if(newEnergy < this.getMin_energy_level()){
            newEnergy = this.getMin_energy_level();
        }
        this.setEnergyLevel(newEnergy);

    }


}
