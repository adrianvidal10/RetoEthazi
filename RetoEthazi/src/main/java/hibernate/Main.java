package hibernate;

import org.hibernate.Session;

public class Main {
	static Session session = HibernateUtil.getSessionFactory().openSession();
	public static void main(String[] args) {
		insertarAlumno();
		insertarAlojamientos();
		insertarAlbergues();
		insertarCamping();
		

		
		Albergue alb = new Albergue();
		alb.setId(6);
		alb.setNombre("Primer Albergüe");		
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
	private static void insertarCamping() {
		// TODO Auto-generated method stub
		
	}
	private static void insertarAlbergues() {
		// TODO Auto-generated method stub
		
	}
	private static void insertarAlojamientos() {
		// TODO Auto-generated method stub
		
	}
	public static void insertarAlumno() {
		session.beginTransaction();
		// Añadir un nuevo objeto alumno
		mapeo alum = new mapeo();
		alum.setId(6);
		alum.setNombre("demo");
		alum.setApellido("user");
		alum.setEdad(1);
		session.save(alum);
	}
}
