import java.util.ArrayList;

public class Heroes {
    private ArrayList<Hero> heroes;

    public Heroes() {
        this.heroes = new ArrayList<Hero>();
    }

    public void addHero(String nom, int category, double lifePoints) {
        switch (category) {
            case 0 -> {
                Hero hero = new CommonHero(nom, category, lifePoints);
                heroes.add(hero);
            }
            case 1 -> {
                Hero hero = new UncommonHero(nom, category, lifePoints);
                heroes.add(hero);
            }
            case 2 -> {
                Hero hero = new RareHero(nom, category, lifePoints);
                heroes.add(hero);
            }
            case 3 -> {
                Hero hero = new EpicHero(nom, category, lifePoints);
                heroes.add(hero);
            }
            case 4 -> {
                Hero hero = new LegendaryHero(nom, category, lifePoints);
                heroes.add(hero);
            }

            // faire un else erreur
        }
    }

    public Hero getHero(int i) {
        return heroes.get(i);
    }

    public void removeHero(String nom) {

        // int indexRemove = heroes.findName(nom);
        for (int i = 0; i < heroes.size(); i++) {
            if (heroes.get(i).getNom() == nom) {
                heroes.remove(i);
                // break
            }
        }

        // // this hero is not in the list
        // return -1;

        // if(indexRemove >= 0 && indexRemove < heroes.size()){
        // heroes.remove(indexRemove);
        // }
        // else erreur

    }

    // private int findName(String nom) {
    // for (int i = 0; i < heroes.size(); i++) {
    // if (heroes.get(i).getNom() == nom) {
    // return i; v
    // }
    // }
    // // this hero is not in the list
    // return -1;
    // }

    public int getsize() {
        return heroes.size();
    }

    public String toString() {
        String string = "Heroes: \n";
        for (int i = 0; i < heroes.size(); i++) {

            Hero hero = heroes.get(i);

            String nom = hero.getNom();
            int level = hero.getCategory();
            Double hp = hero.getLifePoints();

            string += "-" + nom + ": level=" + level + ", HP=" + hp + "\n";
        }

        return string;
    }
}
