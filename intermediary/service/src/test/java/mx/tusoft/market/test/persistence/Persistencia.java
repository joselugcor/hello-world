package mx.tusoft.market.test.persistence;

import java.util.List;

import org.hibernate.Session;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mx.tusoft.market.intermediary.pojos.TUsuario;
import mx.tusoft.market.intermediary.pojos.TUsuarioRol;
import mx.tusoft.market.intservice.config.AppConfig;
import mx.tusoft.market.intservice.dao.DaoPruebas;

@ContextConfiguration(classes = {AppConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class Persistencia {

	@Autowired
	private DaoPruebas daoPruebas;
	@Autowired
	private LocalSessionFactoryBean localSessionFactoryBean;
	
	@Test
	public void testPersistenciaConfig() {
		Session session = null;
		try {
			session = localSessionFactoryBean.getObject().openSession();
			daoPruebas.getAllRoles(session);
			List<TUsuario> usuarios = daoPruebas.getAllUsers(session);
			for(TUsuario usu : usuarios) {
				System.out.println("______________________________________");
				System.out.println("Usuario: "+usu.getEmail());
				for(TUsuarioRol rol : usu.gettUsuarioRol()) {
					System.out.println("Rol: "+rol.gettRol().getNombre());
				}
				System.out.println("______________________________________");
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			if(session != null)
				session.close();
		}
	}
}