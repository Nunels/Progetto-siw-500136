package it.uniroma3.siw.silphspa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.uniroma3.siw.silphspa.model.Fotografo;
import it.uniroma3.siw.silphspa.repository.FotografoRepository;

@Service
public class FotografoService {

	@Autowired
	FotografoRepository fotografoRepository;

	@Transactional
	public Fotografo inserisciFotografo(Fotografo f) {
		return fotografoRepository.save(f);
	}

	@Transactional
	public List<Fotografo> tutti() {
		return (List<Fotografo>) fotografoRepository.findAll();
	}
}
