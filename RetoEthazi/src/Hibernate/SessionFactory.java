package Hibernate;

import java.io.File;

public class SessionFactory {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory()

	{

	try {

	// Crear el SessionFactory desde el archivo de configuracion

	return new AnnotationConfiguration().configure(

	new File("hibernate.cgf.xml")).buildSessionFactory();

	} catch (Throwable ex) {

	System.err.println("Initial SessionFactory creation failed." + ex);

	throw new ExceptionInInitializerError(ex);

	}

	}

	public static SessionFactory getSessionFactory() {

	return sessionFactory;

	}

	public static void shutdown() {

	getSessionFactory().close();

	}

}

