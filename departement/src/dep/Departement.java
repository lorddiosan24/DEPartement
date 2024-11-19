package dep;
public class Departement {
    private int id;
    private String nom;
    private int nombreEmployes;

    // Constructors
    public Departement() {}

    public Departement(int id, String nom, int nombreEmployes) {
        this.id = id;
        this.nom = nom;
        this.nombreEmployes = nombreEmployes;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public int getNombreEmployes() { return nombreEmployes; }
    public void setNombreEmployes(int nombreEmployes) { this.nombreEmployes = nombreEmployes; }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Departement that = (Departement) obj;
        return id == that.id && nom.equals(that.nom);
    }

    // Override toString method
    @Override
    public String toString() {
        return "Departement{" + "id=" + id + ", nom='" + nom + '\'' + ", nombreEmployes=" + nombreEmployes + '}';
    }
}
