public class Voiture {
    public static final int VITESSE_MAX = 120;
    public static final int INTERVAL = 10;
    public static final int VITESSE_MIN = 0;
    private String modele;
    private String couleur;
    private int vitesse;

    public Voiture(String model, String color) {
        this.modele = model;
        this.couleur = color;
        this.vitesse = 0;
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public void accelerer() {
        if (vitesse + INTERVAL <= VITESSE_MAX) {
            vitesse += INTERVAL;
            // afficher détails
            System.out.println("Modèle : " + modele);
            System.out.println("Couleur : " + couleur);
            System.out.println("Vitesse actuelle : " + vitesse);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void ralentir() {
        if (vitesse - INTERVAL >= VITESSE_MIN) {
            vitesse -= INTERVAL;
            // afficher détails
            System.out.println("Modèle : " + modele);
            System.out.println("Couleur : " + couleur);
            System.out.println("Vitesse actuelle : " + vitesse);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    public void demarrerVoiture(Conducteur conducteur) {
        if (conducteur.estAdulte()) {
            System.out.println(conducteur.getNom() + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void arreterVoiture(Conducteur conducteur) {
        System.out.println(conducteur.getNom() + " arrête la voiture.");
    }

    public void changerVitesse(int nouvelleVitesse, Conducteur conducteur) {
        System.out.println(conducteur.getNom() + " change la vitesse de la voiture à " + nouvelleVitesse);
        int vitesseActuelle;

        if (getVitesse() >= nouvelleVitesse) {
            while (getVitesse() > nouvelleVitesse) {
                ralentir();
            }
        } else  {
            while (getVitesse() < nouvelleVitesse) {
                accelerer();
            }
        }
    }
}

