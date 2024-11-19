package edu.iset.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.iset.Utilisateur;
import edu.iset.Repository.UtilisateurServiceImpl;
import edu.iset.Services.UtilisateurService;

import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/Utilisateur")
public class UtilisateurController {
	@Autowired
	private UtilisateurServiceImpl utilisateurServiceImpl;
	@Autowired 
	UtilisateurService utilisateurService;
	@GetMapping (path="/getAllUtilisateurs")
	public List<Utilisateur> getAllUtilisateurs() {
		return utilisateurServiceImpl.getAllUtilisateur();
	}
	
	@PutMapping(path="/updateUtilisateur")
	public Utilisateur updateUtilisateur( int id,@RequestBody Utilisateur utilisateur) {
		return utilisateurServiceImpl.updateUtilisateur(id,utilisateur);
	}
	@PostMapping(path="/createUtilisateur")
	public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur) {
		return utilisateurServiceImpl.addUtilisateur(utilisateur);
	}
	@DeleteMapping(path="/deleteUtilisateur/{id}")
	public void deleteUtilisateur(@PathVariable int id) {
		utilisateurServiceImpl.deleletUtilisateur(id);
	}
}
