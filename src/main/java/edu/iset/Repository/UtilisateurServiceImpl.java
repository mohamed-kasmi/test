package edu.iset.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.iset.Utilisateur;
import edu.iset.Services.UtilisateurService;
 @Service
public class UtilisateurServiceImpl implements UtilisateurService{
	
	@Autowired
	private UtilisateurRepository utilisateurRepo;
	@Override
	public List<Utilisateur> getAllUtilisateur() {
	return utilisateurRepo.findAll();
	}
	@Override
	public Utilisateur findUtilisateurById(int id) {
		return utilisateurRepo.findById(id).orElse(null);
	}
	@Override
	public Utilisateur addUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepo.save(utilisateur);
	}

	@Override
	public Utilisateur updateUtilisateur(int id, Utilisateur utilisateur) {
	    return utilisateurRepo.findById(id).map(existingUtilisateur -> {
	        existingUtilisateur.setFirstName(utilisateur.getFirstName());
	        existingUtilisateur.setLastName(utilisateur.getLastName());
	        existingUtilisateur.setEmail(utilisateur.getEmail());
	        existingUtilisateur.setPassword(utilisateur.getPassword());
	        existingUtilisateur.setStarterDate(utilisateur.getStarterDate());
	        existingUtilisateur.setAge(utilisateur.getAge());
	        existingUtilisateur.setActive(utilisateur.getActive());
	        return utilisateurRepo.save(existingUtilisateur);
	    }).orElse(null); 
	}

	@Override
	public void deleletUtilisateur(int id) {
		utilisateurRepo.deleteById(id);
	}
}
