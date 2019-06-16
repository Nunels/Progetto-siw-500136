package it.uniroma3.siw.silphspa.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Album {

	@Id
	@GeneratedValue
	private Long id;

	private List<Fotografia> fotografieAlbum;

	private Fotografo fotografoAlbum;

	public Long getIdAlbum() {
		return id;
	}

	public void setIdAlbum(Long idAlbum) {
		this.id = idAlbum;
	}

}
