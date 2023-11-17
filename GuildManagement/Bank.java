public class Bank {

    private double gold;
    private int armours;

    public Bank(double gold, int armours) {
        this.armours = armours;
        this.gold = gold;
    }

    public boolean buyHero(double costGold, int costArmours) {
        if (costGold <= gold && costArmours <= armours) {
            this.actualiseGold(costGold);
            this.acualiseArmours(costArmours);
            return true;
        } else {
            return false;
        }
    }

    public void trainHero(String nom, Heroes heroesList) {

        Hero hero;

        for (int i = 0; i < heroesList.getsize(); i++) {

            hero = heroesList.getHero(i);

            System.out.println(hero.getNom());
            System.out.println(nom);

            // TODO : methode qui trouve un hero apres

            if (hero.getNom().equals(nom)) {

                System.out.println("ok");

                if (hero.getCategory() == 4) {
                    break;
                }

                double cost = Math.log(hero.getCategory() + 10);
                double trainCostGold = 20 * cost;
                double trainCostArmours = Math.ceil(cost);

                if (trainCostGold <= gold && trainCostArmours <= armours) {
                    hero.setCategory(hero.getCategory() + 1);
                    gold -= trainCostGold;
                    armours -= trainCostArmours;
                }
                break;
            }

        }

    }

    public void doQuest(Quete quete, Heroes heroesList) {
        // choisir l'hero si la liste n'est pas vide
        if (heroesList.getsize() != 0) {

            System.out.println(heroesList.getsize());
            Hero hero = this.choseHero(quete.getCategory(), heroesList);
            Double newLifePointsHero = hero.getLifePoints() - quete.getCostLifePoint();

            // faire la transation
            // si reussie prendre les recompenses
            if (newLifePointsHero >= 0) {

                hero.setLifePoints(newLifePointsHero);

                gold += quete.getGoldReward();
                armours += quete.getAmoursReward();

            } else {
                // si echoue remove l'hero de la liste
                heroesList.removeHero(hero.getNom());
            }
        }

    }

    private Hero choseHero(int categorie, Heroes heroesList) {
        Hero hero = heroesList.getHero(0);
        for (int i = 0; i < heroesList.getsize(); i++) {
            // suppose ici une liste trie dheros
            hero = heroesList.getHero(i);
            if (hero.getCategory() == categorie) {
                return hero;
            }
            if (hero.getCategory() > categorie) {
                return hero;
            }
        }
        return hero;
    }

    private void actualiseGold(double costGold) {
        gold = gold - costGold;
    }

    private void acualiseArmours(int costArmours) {
        armours = armours - costArmours;
    }

    public String toString() {
        return "Guild Bank account: " + gold + " gold & " + armours + " armours ";
    }

}
