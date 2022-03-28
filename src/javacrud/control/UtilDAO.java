/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javacrud.control;

import javacrud.model.Utilisateur;
import java.util.TreeMap;
/**
 *
 * @author s.lussiez
 */
public interface UtilDAO {
    public void create(Utilisateur utilisateur);
    public void update(Utilisateur utilisateur);
    public void delete(Utilisateur utilisateur);
    public Utilisateur get(String pseudo);
    public TreeMap<String, Utilisateur> list();
}
