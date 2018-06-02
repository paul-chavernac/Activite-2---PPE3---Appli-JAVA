/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_pro;

/**
 *
 * @author d.poncet
 */
public class Employe extends Personne{
    private String login;
    private String mot_de_passe;
    
//constructeur
    public Employe() {
    }
//constructeur avec paramètres
    public Employe(String login, String mot_de_passe) {
        this.login = login;
        this.mot_de_passe = mot_de_passe;
    }
    
    //accesseurs
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }
}
