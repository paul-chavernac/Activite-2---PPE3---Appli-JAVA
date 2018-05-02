/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_pro;

/**
 *
 * @author nc
 */
public class Personne {
    private String nom;
    private String prenom;
    private String adresse_rue;
    private String adresse_cp;
    private String adresse_ville;
    private String tel_perso;
    private String tel_pro;
    private String mail;

    public Personne() {
    }

    public Personne(String nom, String prenom, String adresse_rue, String adresse_cp, String adresse_ville, String tel_perso, String tel_pro, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse_rue = adresse_rue;
        this.adresse_cp = adresse_cp;
        this.adresse_ville = adresse_ville;
        this.tel_perso = tel_perso;
        this.tel_pro = tel_pro;
        this.mail = mail;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse_rue() {
        return adresse_rue;
    }

    public void setAdresse_rue(String adresse_rue) {
        this.adresse_rue = adresse_rue;
    }

    public String getAdresse_cp() {
        return adresse_cp;
    }

    public void setAdresse_cp(String adresse_cp) {
        this.adresse_cp = adresse_cp;
    }

    public String getAdresse_ville() {
        return adresse_ville;
    }

    public void setAdresse_ville(String adresse_ville) {
        this.adresse_ville = adresse_ville;
    }

    public String getTel_perso() {
        return tel_perso;
    }

    public void setTel_perso(String tel_perso) {
        this.tel_perso = tel_perso;
    }

    public String getTel_pro() {
        return tel_pro;
    }

    public void setTel_pro(String tel_pro) {
        this.tel_pro = tel_pro;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
