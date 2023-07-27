public class Main {
    public static void main(String[] args) {
        System.out.println("La feuille est-elle plus forte que les ciseaux ?");
        System.out.println(Chifoumi.FEUILLE.bats(Chifoumi.CISEAU) ? "Oui" : "Non");

        System.out.println("Les ciseaux est-elle plus forte que les feuille ?");
        System.out.println(Chifoumi.CISEAU.bats(Chifoumi.FEUILLE) ? "Oui" : "Non");

        System.out.println("La ciseaux est-elle plus forte que les pierre ?");
        System.out.println(Chifoumi.CISEAU.bats(Chifoumi.PIERRE) ? "Oui" : "Non");

        System.out.println("La feuille est-elle plus forte que les pierre ?");
        System.out.println(Chifoumi.FEUILLE.bats(Chifoumi.PIERRE) ? "Oui" : "Non");
    }
}