package it.uniroma3.siw.silphspa.controller;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.annotation.MultipartConfig;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import it.uniroma3.siw.silphspa.json.FotografiaJson;
import it.uniroma3.siw.silphspa.model.Fotografia;
import it.uniroma3.siw.silphspa.service.FotografiaService;

@RestController
@RequestMapping("fotografie")
@MultipartConfig(maxFileSize = 1024 * 1024 * 1024, maxRequestSize = 1024 * 1024 * 1024)

public class FotografiaController {

	@Autowired
	FotografiaService fotografiaService;

	private static final DozerBeanMapper mapper = new DozerBeanMapper();

	@CrossOrigin
	@GetMapping
	public List<FotografiaJson> elencoFotografie() {
		List<Fotografia> fotografie = fotografiaService.tutte();

		return fotografie.stream().map(f -> mapper.map(f, FotografiaJson.class)).collect(Collectors.toList());
	}

	@CrossOrigin
	@PostMapping
	public FotografiaJson salvaFotografia(@RequestParam MultipartFile img) throws IOException {
		Fotografia fotografia = new Fotografia();
		fotografia.setNome(img.getName());
		fotografia.setImg(img.getBytes());
		fotografia = fotografiaService.inserisciFotografia(fotografia);
		return mapper.map(fotografia, FotografiaJson.class);

	}

}
