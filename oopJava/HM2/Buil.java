public class Building implements HasHealthPoint {

    private final int maxHealthPoint;
    private int currentHealthPoint;
    private int percentHealthPoint;

    public Building(int maxHealthPoint, int currentHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = currentHealthPoint;
        this.percentHealthPoint = currentHealthPoint*100/maxHealthPoint;
    }

    @Override
    public int getMaxHealthPoint() {
        return maxHealthPoint;
    }

    @Override
    public int getCurrentHealthPoint() {
        return currentHealthPoint;
    }

    @Override
    public int getPercentHealthPoint() {
        return percentHealthPoint;
    }
    

}
