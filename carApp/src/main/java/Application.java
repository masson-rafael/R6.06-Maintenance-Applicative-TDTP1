public class Application {

    public static final int AGE = 20;
    public static final int NOUVELLE_VITESSE_1 = 80;
    public static final int NOUVELLE_VITESSE_2 = 30;


    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("Sedan", "Bleu");
        Conducteur moi = new Conducteur("John", AGE);

        maVoiture.demarrerVoiture(moi);
        maVoiture.accelerer();
        moi.changerVitesse(maVoiture, NOUVELLE_VITESSE_1);
        maVoiture.ralentir();
        moi.changerVitesse(maVoiture, NOUVELLE_VITESSE_2);
        moi.arreterVoiture(maVoiture);
        System.out.println("fini");
    }
}
