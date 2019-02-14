package fr.umontpellier.iut;
import java.time.LocalDate;
import java.time.LocalTime;


public class Produit {
    private int numero;
    private  String description;
    private float prixcourant;
    private LocalDate datededebut;
    private LocalTime heurededebut;
    private float montantdupasmin;
    private float coutdeparticipation;
    private boolean enchereencours;
    private Array<Liste> listoffre;

public Produit (int numero, String description, float prixcourant, float coutparticipation){
this.numero=numero;
this.description=description;
this.prixcourant=prixcourant;
this.coutdeparticipation=coutparticipation;
}
public void setPasmin(float pasmin){
    this.montantdupasmin=pasmin;

}
public void demarrerEnchere(float pas){
    setPasmin(pas);
    this.datededebut=LocalDate.now();
    this.heurededebut=localTime.now();
    this.enchereencours=true;


}
public void arreterEnchere(){
    this.enchereencours=false;

}

    @java.lang.Override
    public java.lang.String toString() {
        return "Produit{" +
                "numero=" + numero +
                ", description='" + description + '\'' +
                ", prixcourant=" + prixcourant +
                ", datededebut=" + datededebut +
                ", heurededebut=" + heurededebut +
                ", montantdupasmin=" + montantdupasmin +
                ", coutdeparticipation=" + coutdeparticipation +
                ", enchereencours=" + enchereencours +
                '}';
    }
public void ajouterOffre(Offre offrenchere){
    if(){

    }
}

}