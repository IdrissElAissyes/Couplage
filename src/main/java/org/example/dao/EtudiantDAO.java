package org.example.dao;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO implements EtudiantDAOInterface {

        private List<Etudiant> etudiants;
    public EtudiantDAO() {
        etudiants = new ArrayList<>();
    }
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        return etudiant;
    }
    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }
    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        for (int i = 0; i < etudiants.size(); i++) {
            if (etudiants.get(i).getId() == etudiant.getId()) {
                etudiants.set(i, etudiant);
                return etudiant;
            }
        }
        return null;
    }
}

