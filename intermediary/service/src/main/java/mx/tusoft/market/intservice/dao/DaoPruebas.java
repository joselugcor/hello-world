package mx.tusoft.market.intservice.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import mx.tusoft.market.intermediary.pojos.TRol;
import mx.tusoft.market.intermediary.pojos.TUsuario;

@Component
public class DaoPruebas {
	
	@SuppressWarnings("unchecked")
	public List<TRol> getAllRoles(Session session) {
		String hql = "from TRol";
		Query query = session.createQuery(hql);
		List<TRol> roles = (List<TRol>) query.list();
		return roles;
	}
	
	@SuppressWarnings("unchecked")
	public List<TUsuario> getAllUsers(Session session) {
		String hql = "from TUsuario";
		Query query = session.createQuery(hql);
		return (List<TUsuario>) query.list();
	}
}