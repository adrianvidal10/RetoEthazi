package hibernate;

import org.hibernate.Session;

public class Main {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		// A�adir un nuevo objeto alumno
		mapeo alum = new mapeo();
		alum.setId(6);
		alum.setNombre("demo");
		alum.setApellido("user");
		alum.setEdad(1);
		session.save(alum);

		
		Alberg�e alb = new Alberg�e();
		alb.setId(6);
		alb.setNombre("Primer Alberg�e");		
		session.save(alb);		


		Alojamiento alo = new Alojamiento();
		alo.setId(6);
		alo.setNombre("Primer Alojamiento");		
		session.save(alo);

		
		Camping cam = new Camping();
		cam.setId(6);
		cam.setNombre("Primer Camping");		
		session.save(cam);
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
}
