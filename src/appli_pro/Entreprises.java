/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_pro;

/** La classe qui a les attribus de nom, adresse et contact et contient leurs Geteurs et Seteurs
 *
 * @author nc
 */
public class Entreprises {
    private String nom;
   
    private String adresse;
    private Personne contact;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Personne getContact() {
        return contact;
    }

    public void setContact(Personne contact) {
        this.contact = contact;
    }
    
}
