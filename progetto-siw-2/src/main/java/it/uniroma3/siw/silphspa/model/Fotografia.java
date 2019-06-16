package it.uniroma3.siw.silphspa.model;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Fotografia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1887954780274388635L;

	@Id
	@GeneratedValue
	private Long id;

	private String nome;

	private byte[] img;

	@ManyToOne(fetch = FetchType.LAZY)
	private Fotografo fotografo;

	private Blob foto;

	/*
	 * @ManyToMany
	 * 
	 * @JsonProperty("richieste") private List<Richiesta> richieste;
	 */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	public Fotografo getFotografo() {
		return fotografo;
	}

	public void setFotografo(Fotografo fotografo) {
		this.fotografo = fotografo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fotografia other = (Fotografia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fotografia [id=" + id + ", nome=" + nome + ", img=" + Arrays.toString(img) + ", fotografo=" + fotografo
				+ "]";
	}

	public Blob getFoto() {
		return foto;
	}

	public void setFoto(Blob foto) {
		this.foto = foto;
	}

//	public List<Richiesta> getRichieste() {
//		return richieste;
//	}
//
//	public void setRichieste(List<Richiesta> richieste) {
//		this.richieste = richieste;
//	}

}
