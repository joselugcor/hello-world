package mx.tusoft.market.intermediary.pojos;

import java.io.Serializable;

public class TUsuarioRol implements Serializable {

	private static final long serialVersionUID = -1307240561773554234L;
	
	private TUsuarioRolPK tUsuarioRolPK;
	
	private TUsuario tUsuario;
	private TRol tRol;
	
	public TUsuarioRolPK gettUsuarioRolPK() {
		return tUsuarioRolPK;
	}
	
	public void settUsuarioRolPK(TUsuarioRolPK tUsuarioRolPK) {
		this.tUsuarioRolPK = tUsuarioRolPK;
	}

	public TUsuario gettUsuario() {
		return tUsuario;
	}

	public void settUsuario(TUsuario tUsuario) {
		this.tUsuario = tUsuario;
	}

	public TRol gettRol() {
		return tRol;
	}

	public void settRol(TRol tRol) {
		this.tRol = tRol;
	}
}