package it.uniroma3.siw.silphspa.json;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Fotografo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6765195240609780964L;

	@Id
	@GeneratedValue
	@JsonProperty("id")
	private Long id;

	@JsonProperty("nome")
	private String nome;

	@JsonProperty("cognome")
	private String cognome;

//	@JsonProperty("fotografie")
//	@OneToMany(mappedBy = "fotografo", fetch = FetchType.LAZY)
//	private List<Fotografia> fotografie;

	public Long getIdFotografo() {
		return id;
	}

	public void setIdFotografo(Long idFotografo) {
		this.id = idFotografo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public List<Fotografia> getFotografie() {
//		return fotografie;
//	}
//
//	public void setFotografie(List<Fotografia> fotografie) {
//		this.fotografie = fotografie;
//	}

}
