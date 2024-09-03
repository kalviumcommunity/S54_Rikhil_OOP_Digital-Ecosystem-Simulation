package organisms;

public class Plant extends Organism {
    private int growthRate;

    // Constructor
    public Plant(String species, int x, int y, int energy, int maxAge, int reproductiveAge, int growthRate) {
        super(species, x, y, energy, maxAge, reproductiveAge);
        this.growthRate = growthRate;
    }

    @Override
    public void move() {
        // Plants don't move
    }

    // Getters and setters for Plant-specific attributes
    public int getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(int growthRate) {
        this.growthRate = growthRate;
    }
}
