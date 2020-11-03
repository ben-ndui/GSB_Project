/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.time.LocalDate;


/**
 *
 * @author gueddoura
 */
public class Visiteur {
   private String vis_id;
   private String vis_nom;
   private String vis_prenom;
   private String vis_login;
   private String vis_mdp;
   private String vis_adresse;
   private String vis_cp;
   private String vis_ville;
   private LocalDate vis_dateEmbauche;
    
    public Visiteur (String id, String nom, String prenom, String login, String mdp, String adresse, String cp, String ville, String dateEmbauche ){
        this.vis_id = id;
        this.vis_nom = nom;
        this.vis_prenom = prenom;
        this.vis_login = login;
        this.vis_mdp = mdp;
        this.vis_adresse = adresse; 
        this.vis_cp = cp;
        this.vis_ville = ville;

        String[] ladate = dateEmbauche.split("/");
        int yy= Integer.parseInt(ladate[0]);
        int mm=Integer.parseInt(ladate[1]);
        int dd= Integer.parseInt(ladate[2]);
        try{
            this.vis_dateEmbauche = LocalDate.of(yy, mm, dd);
        }
        catch(Exception e){
            System.out.println("La date n'est pas valide Format yyyy,mm,dd");
        }
                 
    }
    public Visiteur(String id, String nom, String login, String mdp, String adresse, String cp, String ville){
        this.vis_id = id;
        this.vis_nom = nom;
        this.vis_login = login;
        this.vis_mdp = mdp;
        this.vis_adresse = adresse; 
        this.vis_cp = cp;
        this.vis_ville = ville;
    }

    public String getVis_id() {
        return vis_id;
    }

    public void setVis_id(String vis_id) {
        this.vis_id = vis_id;
    }

    public String getVis_nom() {
        return vis_nom;
    }

    public void setVis_nom(String vis_nom) {
        this.vis_nom = vis_nom;
    }

    public String getVis_login() {
        return vis_login;
    }

    public void setVis_login(String vis_login) {
        this.vis_login = vis_login;
    }

    public String getVis_mdp() {
        return vis_mdp;
    }

    public void setVis_mdp(String vis_mdp) {
        this.vis_mdp = vis_mdp;
    }

    public String getVis_adresse() {
        return vis_adresse;
    }

    public void setVis_adresse(String vis_adresse) {
        this.vis_adresse = vis_adresse;
    }

    public String getVis_cp() {
        return vis_cp;
    }

    public void setVis_cp(String vis_cp) {
        this.vis_cp = vis_cp;
    }

    public String getVis_ville() {
        return vis_ville;
    }

    public void setVis_ville(String vis_ville) {
        this.vis_ville = vis_ville;
    }

    public LocalDate getVis_dateEmbauche() {
        return vis_dateEmbauche;
    }

    public void setVis_dateEmbauche(LocalDate vis_dateEmbauche) {
        this.vis_dateEmbauche = vis_dateEmbauche;
    }
    public String toString(){
        return this.vis_nom + " " + this.vis_prenom; 
    }
}
