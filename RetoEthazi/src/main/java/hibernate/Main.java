package hibernate;

import org.hibernate.Session;

public class Main {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		// Añadir un nuevo objeto alumno
		mapeo alum = new mapeo();
		alum.setId(1);
		alum.setNombre("demo");
		alum.setApellido("user");
		alum.setEdad(1);
		session.save(alum);
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
}
