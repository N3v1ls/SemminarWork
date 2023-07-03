public class Hero implements HasHealthPoint, Tiredness {

    private final int maxHealthPoint;
    private int currentHealthPoint;
    private int percentHealthPoint;
    private final int maxEnergy;
    private int currentEnergy;
    private int percentEnergy;

    public Hero(int maxHealthPoint, int currentHealthPoint, int maxEnergy, int currentEnergy) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = currentHealthPoint;
        this.percentHealthPoint = currentHealthPoint * 100 / maxHealthPoint;

        this.maxEnergy = maxEnergy;
        this.currentEnergy = currentEnergy;
        this.percentEnergy = currentEnergy*100/ maxEnergy;
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

    @Override
    public int getMaxEnergy() {
        return maxEnergy;
    }

    @Override
    public int getCurrentEnergy() {
        return currentEnergy;
    }

    @Override
    public int getPercentEnergy() {
        return percentEnergy;
    }

}
