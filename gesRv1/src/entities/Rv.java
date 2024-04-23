package entities;

public class Rv {
    private String id;
    private String date;
    private String heure;
    private String specialite;
    private String etat;

    // Getters et setters pour id, date, heure, specialite, etat

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Rv{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", heure='" + heure + '\'' +
                ", specialite='" + specialite + '\'' +
                ", etat='" + etat + '\'' +
                '}';
    }
}
