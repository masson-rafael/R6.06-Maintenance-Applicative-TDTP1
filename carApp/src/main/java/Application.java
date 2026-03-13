public class Application {

    public static final int AGE = 20;
    public static final int NOUVELLE_VITESSE_1 = 80;
    public static final int NOUVELLE_VITESSE_2 = 30;


    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("Sedan", "Bleu");
        Conducteur moi = new Conducteur("John", AGE);

        maVoiture.demarrerVoiture(moi);
        maVoiture.accelerer();
        maVoiture.changerVitesse(NOUVELLE_VITESSE_1, moi);
        maVoiture.ralentir();
        maVoiture.changerVitesse(NOUVELLE_VITESSE_2, moi);
        maVoiture.arreterVoiture(moi);
        System.out.println("fini");
    }
}
