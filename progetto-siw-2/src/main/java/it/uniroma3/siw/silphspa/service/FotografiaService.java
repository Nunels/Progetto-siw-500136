package it.uniroma3.siw.silphspa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.siw.silphspa.model.Fotografia;
import it.uniroma3.siw.silphspa.repository.FotografiaRepository;

@Service
public class FotografiaService {

	@Autowired
	FotografiaRepository fotografiaRepository;

	@Transactional
	public Fotografia inserisciFotografia(Fotografia f) {
		return fotografiaRepository.save(f);
	}

	public List<Fotografia> tutte() {
		return (List<Fotografia>) fotografiaRepository.findAll();
	}
}
