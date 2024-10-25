package org.example.factory;

import org.example.dao.EtudiantDAO;
import org.example.dao.EtudiantDAODictionary;
import org.example.dao.EtudiantDAOInterface;
public class EtudiantDAOFactory {
    // Méthode qui retourne une instance de EtudiantDAOInterface
    public static EtudiantDAOInterface getEtudiantDAO(String type) {
        if (type.equalsIgnoreCase("list")) {
            return new EtudiantDAO(); // Retourne une instance qui utilise la liste
        } else if (type.equalsIgnoreCase("map")) {
            return new EtudiantDAODictionary(); // Retourne une instance qui utilise le dictionnaire
        }
        return null; // Si le type n'est pas reconnu, retourne null
    }
}