public class Hero {
    private String nom;
    private int category;
    private double lifePoints;

    public Hero(String nom, int category, double lifePoints) {
        this.nom = nom;
        this.category = category;
        this.lifePoints = lifePoints;
    }

    public String getNom() {
        return nom;
    }

    public int getCategory() {
        return category;
    }

    public double getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(double lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void doQuest(int category, double costLifePoint) {// }, int goldReward, int amoursReward){

        this.lifePoints = lifePoints - costLifePoint;

    }
}
