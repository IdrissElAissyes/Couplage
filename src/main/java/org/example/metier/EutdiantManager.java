package org.example.metier;

import org.example.dao.Etudiant;
import org.example.dao.EtudiantDAO;
import org.example.dao.EtudiantDAODictionary;
import org.example.dao.EtudiantDAOInterface;

import java.util.List;

public class EutdiantManager {
//    public EtudiantDAO etudiantDAO;
public EtudiantDAOInterface etudiantDAO;


    public EutdiantManager(EtudiantDAOInterface etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }
    public Etudiant addEtudiant(Etudiant etudiant) {
        // Vérifier si l'email est déjà utilisé
        for (Etudiant e : etudiantDAO.getAllEtudiants()) {
            if (e.getEmail().equals(etudiant.getEmail())) {
                System.out.println("Erreur : Un étudiant avec cet email existe déjà.");
                return null;
            }
        }
        return etudiantDAO.addEtudiant(etudiant);
    }
    public List<Etudiant> getAllEtudiants() {
        return etudiantDAO.getAllEtudiants();
    }
    // Nouvelle méthode pour mettre à jour les informations d'un étudiant
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantDAO.updateEtudiant(etudiant);
    }
}
