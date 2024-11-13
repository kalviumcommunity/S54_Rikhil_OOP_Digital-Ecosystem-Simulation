package organisms;

public class Herb extends Plant {
    public Herb(){
        super();
    }

    @Override
    public void setGrowthRate(int growthRate) {
        super.setGrowthRate(growthRate+1);
    }
}
