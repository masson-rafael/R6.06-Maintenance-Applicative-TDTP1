public class Conducteur {
    public static final int AGE_MINIMAL = 10;
    private String nom;
    private int age;

    public Conducteur(String name, int years) {
        this.nom = name;
        this.age = years;
    }

    public boolean estAdulte() {
        return age >= AGE_MINIMAL;
    }

    public String getNom() {
        return nom;
    }

}
