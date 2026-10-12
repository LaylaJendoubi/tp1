package tn.esprit.tp1.service.interfaces;

import tn.esprit.tp1.entities.Agence;

import java.util.List;

public interface IAgenceService {
    public List<Agence> retrieveAllAgences();
    public Agence retrieveAgence(Long idAgence);
    public Agence addAgence(Agence agence);
    public void removeAgence(Long idAgence);
    public Agence modifyAgence(Agence agence);

}
