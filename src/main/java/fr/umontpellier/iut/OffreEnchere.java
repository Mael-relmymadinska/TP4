package fr.umontpellier.iut;
import java.time.LocalDate;
import java.time.localTime;


public class OffreEnchere{
    private LocalDate date;
    private LocalTime heure;
    private float prixencours;
    private float prixmaxauto;

    public OffreEnchere(float prixencours, float prixmaxauto){
        this.date=LocalDate.now();
        this.heure=LocalTime.now();
        this.prixencours=prixencours;
        this.prixmaxauto=prixmaxauto;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "OffreEnchere{" +
                "date=" + date +
                ", heure=" + heure +
                ", prixencours=" + prixencours +
                ", prixmaxauto=" + prixmaxauto +
                '}';
    }

    public float getPrixencours() {
        return prixencours;
    }

    public float getPrixmaxauto() {
        return prixmaxauto;
    }

    public void setPrixencours(float prixencours) {
        this.prixencours = prixencours;
    }

}