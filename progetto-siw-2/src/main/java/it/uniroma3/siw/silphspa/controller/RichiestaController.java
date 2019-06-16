package it.uniroma3.siw.silphspa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.uniroma3.siw.silphspa.model.Richiesta;
import it.uniroma3.siw.silphspa.service.RichiestaService;

@RestController
@RequestMapping("richieste")
public class RichiestaController {
	@Autowired
	RichiestaService richiestaService;

	@GetMapping
	public List<Richiesta> elencoRichieste() {
		return richiestaService.tutte();
	}
}
