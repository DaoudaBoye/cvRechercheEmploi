package sn.esmt.employe.model;

public class CvEntities {

    private int id;
    private String prenom;
    private String nom;
    private  int age;
    private String adresse;
    private String email;
    private String telephone;
    private String specialite;
    private String niveauEtude;
    private String experienceProfessionnelle;

    public int getId(){return id;}
    public void setId(int id){this.id = this.id;}
    public String getprenom(){return prenom;}
    public void setprenom(String nom){this.prenom = prenom;}
    public String getnom(){return nom;}
    public void setnom(String nom){this.nom = this.nom;}
    public int getage(){return age;}
    public void setage(int age){this.age = this.age;}
    public String getadresse(){return adresse;}
    public void setadresse(String adresse){this.adresse = this.adresse;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String gettelephone(){return telephone;}
    public void settelephone(){this.telephone = telephone;}
    public String getspecialite(){return specialite;}
    public void setspecialite(){this.specialite = specialite;}
    public String getniveauEtude(){return niveauEtude;}
    public void setniveauEtude(String niveauEtude){this.niveauEtude = this.niveauEtude;}
    public String getexperienceProfessionnelle(){return experienceProfessionnelle;}
    public void setexperienceProfessionnelle(String experienceProfessionnelle){this.experienceProfessionnelle = this.experienceProfessionnelle;}

    @Override
    public String toString() {
        return "CvEntities{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                ", adresse='" + adresse + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", specialite='" + specialite + '\'' +
                ", niveauEtude='" + niveauEtude + '\'' +
                ", experienceProfessionnelle='" + experienceProfessionnelle + '\'' +
                '}';
    }
}




