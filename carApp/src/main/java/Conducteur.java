public class Conducteur {
    private String nom;
    private int age;

    public Conducteur(String name, int years) {
        this.nom = name;
        this.age = years;
    }

    public boolean estAdulte() {
        return age >= 10;
    }

    public String getNom() { return nom; }

}
