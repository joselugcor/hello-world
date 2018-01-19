package mx.tusoft.market.intermediary.pojos;

import java.io.Serializable;

public class TUsuarioRolPK implements Serializable {

	private static final long serialVersionUID = -7140087454232351603L;

	private Long idUsuario;
	private Long idRol;
	
	public Long getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public Long getIdRol() {
		return idRol;
	}
	
	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}
}