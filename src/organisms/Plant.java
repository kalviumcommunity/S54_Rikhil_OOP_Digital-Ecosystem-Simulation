package organisms;

public class Plant extends Organism {
    private int growthRate;
    private static int totalPlants;

    // Constructor
    public Plant(){
        super();
        this.growthRate = 1;
        Plant.totalPlants++;
    }
    public Plant(String species, int x, int y, int energy, int maxAge, int reproductiveAge, int growthRate) {
        super(species, x, y, energy, maxAge, reproductiveAge);
        this.growthRate = growthRate;
        Plant.totalPlants++;
    }

    @Override
    public void age() {
        this.age += 1;
        if (this.age > this.maxAge) {
            die();
        }
    }

    @Override
    public void die() {
        this.energy = 0;
        System.out.println(this.species + " has died.");
    }

    // Getters and setters for Plant-specific attributes
    public int getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(int growthRate) {
        this.growthRate = growthRate;
    }

    public static int getTotalPlants() {
        return totalPlants;
    }
}
