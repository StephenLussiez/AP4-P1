/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javacrud.control;

import javacrud.model.Commune;
import java.util.HashMap;
/**
 *
 * @author s.lussiez
 */
public interface VilleDAOInterface {
    HashMap<Integer, Commune> villesPourCp(String codePostal);
}
