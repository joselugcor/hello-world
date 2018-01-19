package mx.tusoft.market.intermediary.pojos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class TUsuario implements Serializable {

	private static final long serialVersionUID = -7241853164633119923L;

	private Long idUsuario;
	private String nombreUsuario;
	private String email;
	private String contrasenia;
	
	private Set<TUsuarioRol> tUsuarioRol = new HashSet<>(0);
	
	public Long getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Set<TUsuarioRol> gettUsuarioRol() {
		return tUsuarioRol;
	}
	
	public void settUsuarioRol(Set<TUsuarioRol> tUsuarioRol) {
		this.tUsuarioRol = tUsuarioRol;
	}
}