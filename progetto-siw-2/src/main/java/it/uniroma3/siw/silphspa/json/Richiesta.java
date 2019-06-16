package it.uniroma3.siw.silphspa.json;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Richiesta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3769545415917190396L;

	@Id
	@GeneratedValue
	@JsonProperty("id")
	private Long idLong;

	@JsonProperty("nome")
	private String nome;
	@JsonProperty("cognome")
	private String cognome;
	@JsonProperty("email")
	private String email;

//	@ManyToMany(mappedBy = "richieste")
//	@JsonProperty("fotoRichieste")
//	private List<Fotografia> fotoRichieste;

	public Long getIdLong() {
		return idLong;
	}

	public void setIdLong(Long idLong) {
		this.idLong = idLong;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public List<Fotografia> getFotoRichieste() {
//		return fotoRichieste;
//	}
//
//	public void setFotoRichieste(List<Fotografia> fotoRichieste) {
//		this.fotoRichieste = fotoRichieste;
//	}

//	@Override
//	public String toString() {
//		return "Richiesta [idLong=" + idLong + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email
//				+ ", fotoRichieste=" + fotoRichieste + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
//		result = prime * result + ((email == null) ? 0 : email.hashCode());
//		result = prime * result + ((fotoRichieste == null) ? 0 : fotoRichieste.hashCode());
//		result = prime * result + ((idLong == null) ? 0 : idLong.hashCode());
//		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Richiesta other = (Richiesta) obj;
//		if (cognome == null) {
//			if (other.cognome != null)
//				return false;
//		} else if (!cognome.equals(other.cognome))
//			return false;
//		if (email == null) {
//			if (other.email != null)
//				return false;
//		} else if (!email.equals(other.email))
//			return false;
//		if (fotoRichieste == null) {
//			if (other.fotoRichieste != null)
//				return false;
//		} else if (!fotoRichieste.equals(other.fotoRichieste))
//			return false;
//		if (idLong == null) {
//			if (other.idLong != null)
//				return false;
//		} else if (!idLong.equals(other.idLong))
//			return false;
//		if (nome == null) {
//			if (other.nome != null)
//				return false;
//		} else if (!nome.equals(other.nome))
//			return false;
//		return true;
//	}

}
