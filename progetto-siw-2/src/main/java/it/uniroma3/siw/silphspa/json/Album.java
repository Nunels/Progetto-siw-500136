package it.uniroma3.siw.silphspa.json;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Album {

	@Id
	@GeneratedValue
	private Long id;

	private List<FotografiaJson> fotografieAlbum;

	private Fotografo fotografoAlbum;

	public Long getIdAlbum() {
		return id;
	}

	public void setIdAlbum(Long idAlbum) {
		this.id = idAlbum;
	}

}
