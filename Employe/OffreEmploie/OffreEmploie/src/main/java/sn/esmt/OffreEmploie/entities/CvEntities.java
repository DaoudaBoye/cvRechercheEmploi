package sn.esmt.OffreEmploie.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//
@Entity
@Table (name = "cvuser")

public class CvEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (length = 100, nullable = false)
    private String prenom;

    @Column (length = 100, nullable = false)
    private String nom;

    private  int age;

    @Column (length = 200, nullable = false)
    private String adresse;

    @Column (length = 200, nullable = false)
    private String email;

    @Column (length = 200, nullable = false)
    private String telephone;

    @Column (length = 200, nullable = false)
    private String specialite;

    @Column (length = 200, nullable = false)
    private String niveauEtude;
    @Column (length = 1000, nullable = false)
    private String experienceProfessionnelle;




}




