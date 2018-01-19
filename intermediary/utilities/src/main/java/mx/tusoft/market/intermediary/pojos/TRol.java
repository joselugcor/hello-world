package mx.tusoft.market.intermediary.pojos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class TRol implements Serializable {

	private static final long serialVersionUID = 2472825815945859527L;

	private Long idRol;
	private String nombre;
	
	private Set<TUsuarioRol> tUsuarioRol = new HashSet<>(0);
	
	public Long getIdRol() {
		return idRol;
	}
	
	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<TUsuarioRol> gettUsuarioRol() {
		return tUsuarioRol;
	}
	
	public void settUsuarioRol(Set<TUsuarioRol> tUsuarioRol) {
		this.tUsuarioRol = tUsuarioRol;
	}
}