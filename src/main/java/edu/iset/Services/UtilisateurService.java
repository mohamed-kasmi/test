package edu.iset.Services;

import java.util.List;

import edu.iset.Utilisateur;

public interface UtilisateurService {
	public List<Utilisateur> getAllUtilisateur();
	public Utilisateur findUtilisateurById(int id);
	public Utilisateur addUtilisateur(Utilisateur utilisateur);
	public Utilisateur updateUtilisateur(int id,Utilisateur utilisateur);
	public void deleletUtilisateur(int id);
}
