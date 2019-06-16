package it.uniroma3.siw.silphspa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.uniroma3.siw.silphspa.model.Fotografo;
import it.uniroma3.siw.silphspa.service.FotografoService;

@RestController
@RequestMapping("fotografi")
public class FotografoController {

	@Autowired
	FotografoService fotografoService;

	@GetMapping
	public List<Fotografo> elencoFotografi() {
		return fotografoService.tutti();
	}
}
