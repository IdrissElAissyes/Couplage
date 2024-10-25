package org.example.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EtudiantDAODictionary implements EtudiantDAOInterface
{
    private Map<String, Etudiant> etudiantsMap;

    public EtudiantDAODictionary() {
        etudiantsMap = new HashMap<>();
    }

@Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiantsMap.put(String.valueOf(etudiant.getId()), etudiant);
        return etudiant;
    }
    @Override
    public List<Etudiant> getAllEtudiants() {
        return new ArrayList<>(etudiantsMap.values());
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        etudiantsMap.put(String.valueOf(etudiant.getId()), etudiant);
        return etudiant;
    }
}
