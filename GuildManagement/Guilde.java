import java.util.ArrayList;

public class Guilde {
    // private Hero[] heros;
    private double montant;
    private int nbArmures;

    public Guilde(double montant, int nbArmures) {
        this.montant = montant;
        this.nbArmures = nbArmures;
    }

    public double getMontant() {
        return montant;
    }

    public int getNbArmures() {
        return nbArmures;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setNbArmures(int nbArmures) {
        this.nbArmures = nbArmures;
    }

    // public String toString() {
    // return "Guild Bank account: " + montant + " gold & " + nbArmures + " armours
    // ";
    // }

    // public void Guilde(){
    // this.heros = heros;
    // }

    // methode qui envoie un hero qui correspond aux exigences de la quete
    // ca serait bien de trier la liste de heros selon leur categorie
    // et ensuite selon leur lifePoints
    // public Hero getHeroQuete (int category, double costLifePoint){
    // for (int i = 0; i < heros.lenght; i++ ){
    // if (category == heros[i].category and heros[i].lifePoints >= costLifePoint){
    // return heros[i]
    // }
    // }
    // }
}
