package it.uniroma3.siw.silphspa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.siw.silphspa.model.Richiesta;
import it.uniroma3.siw.silphspa.repository.RichiestaRepository;

@Service
public class RichiestaService {

	@Autowired
	RichiestaRepository richiestaRepository;

	@Transactional
	public Richiesta inserisciRichiesta(Richiesta r) {
		return richiestaRepository.save(r);
	}

	@Transactional
	public List<Richiesta> tutte() {
		return (List<Richiesta>) richiestaRepository.findAll();

	}
}
