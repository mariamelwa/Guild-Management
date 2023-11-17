public class Quete {
    private int category;
    private double costLifePoint;
    private int goldReward;
    private int amoursReward;

    public Quete(int category, double costLifePoint, int goldReward, int amoursReward) {
        this.category = category;
        this.costLifePoint = costLifePoint;
        this.goldReward = goldReward;
        this.amoursReward = amoursReward;
    }

    public int getCategory() {
        return category;
    }

    public double getCostLifePoint() {
        return costLifePoint;
    }

    public double getGoldReward() {
        return goldReward;
    }

    public double getAmoursReward() {
        return amoursReward;
    }
}
