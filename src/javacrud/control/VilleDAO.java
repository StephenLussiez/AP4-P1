/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacrud.control;

import javacrud.tech.UtilDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javacrud.model.Commune;

public class VilleDAO implements VilleDAOInterface { //W! créez VilleDAO
  public HashMap<Integer, Commune> villesPourCp(String codePostal) {
    HashMap<Integer, Commune> listVilles = new HashMap<>();
    try {
      Connection con = UtilDB.getConnect();
      String sql = 
        "SELECT * FROM codes_postaux WHERE Code_Postal= ? ORDER BY Nom_Commune;";
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setString(1, codePostal.toString());
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        Commune uneVille = new Commune(codePostal.toString(), 
        rs.getString("Num_Postal"),
        rs.getString("Nom_Commune"));
        listVilles.put(rs.getInt("Num_Postal"), uneVille);
      }
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "DB : Erreur au chargement des communes");
    }
    return listVilles;
  }
}
