package org.example.presentation;
import org.example.dao.Etudiant;
import org.example.dao.EtudiantDAO;
import org.example.dao.EtudiantDAODictionary;
import org.example.dao.EtudiantDAOInterface;
import org.example.factory.EtudiantDAOFactory;
import org.example.metier.EutdiantManager;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Presentation {
    public static void main(String[] args) {

        //EtudiantDAOInterface etudiantDAO = EtudiantDAOFactory.getEtudiantDAO("list");

         EtudiantDAOInterface etudiantDAO = EtudiantDAOFactory.getEtudiantDAO("list");



//        EtudiantDAODictionary etudiantDAO = new EtudiantDAODictionary();

        EutdiantManager etudiantManager = new EutdiantManager(etudiantDAO);


        Etudiant etudiant1 = new Etudiant(1, "Dupont", "Jean", "jean.dupont@mail.com");
        Etudiant etudiant2 = new Etudiant(2, "Durand", "Marie", "marie.durand@mail.com");
        Etudiant etudiant3 = new Etudiant(3, "Martin", "Luc", "luc.martin@mail.com");
        Etudiant etudiant4 = new Etudiant(4, "Bernard", "Sophie", "sophie.bernard@mail.com");


        etudiantManager.addEtudiant(etudiant1);
        etudiantManager.addEtudiant(etudiant2);
        etudiantManager.addEtudiant(etudiant3);
        etudiantManager.addEtudiant(etudiant4);

        Etudiant etudiantDoublon = new Etudiant(5, "Robert", "Paul", "jean.dupont@mail.com");
        etudiantManager.addEtudiant(etudiantDoublon);

        // Récupérer et afficher tous les étudiants
        List<Etudiant> etudiants = etudiantManager.getAllEtudiants();
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }
    }
}