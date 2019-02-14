package fr.umontpellier.iut;

public class Compte{
    private String pseudo;
    private String email;
    private String adresse;
    private float soldedecompte;
    private float prixcourant;
    private float prixmax;
    private Array<Liste> listenchere;


    public Compte (String pseudo, String email, String adresse, float soldecompte){
        this.pseudo=pseudo;
        this.email=email;
        this.adresse=adresse;
        this.soldedecompte=soldecompte;

    }
public void crediter(float somme){
        this.soldedecompte=this.soldedecompte+somme;


}

    @java.lang.Override
    public java.lang.String toString() {
        return "Compte{" +
                "pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                ", soldedecompte=" + soldedecompte +
                '}';
    }

    public void creerOffre(Produit produit, float prixcourant, float prixmax){
    Liste

    }
}