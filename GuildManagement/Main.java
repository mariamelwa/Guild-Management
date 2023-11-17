
// 
import java.util.*;

// UTILIZER LE PACKAGE AVANT SOUBMETTRE
public class Main {
    /**
     * Args: array with
     * <ol>
     * <li>guild:&lt;montant initial&gt;,&lt;armures initiales&gt;</li>
     * </ol>
     *
     * @param args
     */
    public static void main(String[] args) {
        GuildCommandSystem guildCommandSystem = new GuildCommandSystem(args);

        Guilde maGuilde = makeGuilde(guildCommandSystem.actualCommand());

        Heroes mesHeroes = new Heroes();

        Bank maBanque = new Bank(maGuilde.getMontant(), maGuilde.getNbArmures());

        while (guildCommandSystem.hasNextCommand()) {
            GuildCommand command = guildCommandSystem.nextCommand();
            // System.out.print(command.getName());
            switch (command.getName()) {
                case "buy-hero" -> {
                    // TODO
                    String nomHero = command.nextString();
                    int categorieHero = command.nextInt();
                    Double coutArgent = command.nextDouble();
                    int coutArmures = command.nextInt();
                    Double pointsVie = command.nextDouble();

                    Boolean achat = maBanque.buyHero(coutArgent, coutArmures);
                    if (achat) {
                        mesHeroes.addHero(nomHero, categorieHero, pointsVie);

                    } else {
                        System.out.println("Argent pas suffisant pour acheter");
                    }

                }
                case "buy-armor" -> {
                    // TODO
                }
                case "do-quest" -> {
                    // TODO
                    Quete quest = new Quete(command.nextInt(), command.nextDouble(), command.nextInt(),
                            command.nextInt());

                    maBanque.doQuest(quest, mesHeroes);
                }
                case "train-hero" -> {
                    // TODO
                    String nomHero = command.nextString();
                    // System.out.println(mesHeroes.getHero(0).getNom());
                    // System.out.println(mesHeroes.getHero(1).getNom());

                    maBanque.trainHero(nomHero, mesHeroes);
                }
            }
        }

        System.out.println(maBanque);

        System.out.println(mesHeroes);

    }

    public static Guilde makeGuilde(GuildCommand command) {
        double montantInitial = command.nextDouble();
        int nbArmures = command.nextInt();
        return new Guilde(montantInitial, nbArmures);
    }
}