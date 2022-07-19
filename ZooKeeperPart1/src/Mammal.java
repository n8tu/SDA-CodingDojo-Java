public class Mammal {
    private int energyLevel;
    private final int max_energy_level = 100;
    private final int min_energy_level = 0;

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

    public int getMax_energy_level() {
        return max_energy_level;
    }

    public int getMin_energy_level() {
        return min_energy_level;
    }
}
