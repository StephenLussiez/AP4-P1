/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacrud.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author g.viney
 */

public class Utilisateur {
    
    private String utPseudo, utNom, utPrenom, utMp, utMail, utPhrase, utAdr1, utAdr2, utCdpost, utNumpost, utCommune;

    public static void affichage() {
        Connection con;
        String url = "jdbc:mysql://localhost:3306/gestion_utilisateur";
        String user = "root";
        String pass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            String rqSql = "SELECT * FROM utilisateur";
            PreparedStatement ps = con.prepareStatement(rqSql);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                System.out.print(result.getString("ut_prenom") + " "
                        + result.getString("ut_pseudo") + " " + result.getString("ut_nom") + "\n");
            }
        } catch (ClassNotFoundException | SQLException e) {

        }
        System.out.print("test");

    }
    
    public Utilisateur(String utPseudo, String utNom, String utPrenom, String utMp, String utMail, String utPhrase, String utAdr1, String utAdr2, String utCdpost, String utNumpost, String utCommune){
        this.utPseudo = utPseudo;
        this.utNom = utNom;
        this.utPrenom = utPrenom;
        this.utMp = utMp;
        this.utMail = utMail;
        this.utPhrase = utPhrase;
        this.utAdr1 = utAdr1;
        this.utAdr2 = utAdr2;
        this.utCdpost = utCdpost;
        this.utNumpost = utNumpost;
        this.utCommune = utCommune;
    }
    
    public String updateMp(String utMp){
        if(utMp != this.utMp){
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(BCryptPasswordEncoder.BCryptVersion.$2B, 12);
            this.utMp = utMp;
            this.utPhrase = encoder.encode(utMp);
        }
        
        return this.utPhrase;
    }
    
    public Utilisateur(){        
    }
    
    //SETTERS
    
    public void setUtPseudo(String utPseudo) {
        this.utPseudo = utPseudo;
    }

    public void setUtNom(String utNom) {
        this.utNom = utNom;
    }

    public void setUtPrenom(String utPrenom) {
        this.utPrenom = utPrenom;
    }

    public void setUtMp(String utMp) {
        this.utMp = utMp;
    }

    public void setUtMail(String utMail) {
        this.utMail = utMail;
    }

    public void setUtPhrase(String utPhrase) {
        this.utPhrase = utPhrase;
    }

    public void setUtAdr1(String utAdr1) {
        this.utAdr1 = utAdr1;
    }

    public void setUtAdr2(String utAdr2) {
        this.utAdr2 = utAdr2;
    }

    public void setUtCdpost(String utCdpost) {
        this.utCdpost = utCdpost;
    }

    public void setUtCommune(String utCommune) {
        this.utCommune = utCommune;
    }

    public void setUtNumpost(String utNumpost) {
        this.utNumpost = utNumpost;
    }

    

 
    
    //GETTERS

    public String getUtNumpost() {
        return utNumpost;
    }
    
    public String getUtPseudo() {
        return utPseudo;
    }

    public String getUtNom() {
        return utNom;
    }

    public String getUtPrenom() {
        return utPrenom;
    }

    public String getUtMp() {
        return utMp;
    }

    public String getUtMail() {
        return utMail;
    }

    public String getUtPhrase() {
        return utPhrase;
    }

    public String getUtAdr1() {
        return utAdr1;
    }

    public String getUtAdr2() {
        return utAdr2;
    }

    public String getUtCdpost() {
        return utCdpost;
    }

    public String getUtCommune() {
        return utCommune;
    }

 
    

    
}

