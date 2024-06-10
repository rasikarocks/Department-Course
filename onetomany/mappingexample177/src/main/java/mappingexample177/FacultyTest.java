package mappingexample177;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FacultyTest {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();// be default hibernate.cfg.xml
		configuration.addAnnotatedClass(Faculty.class);
		configuration.addAnnotatedClass(FacultySubject.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Faculty faculty = new Faculty("tka");
		FacultySubject facultySubject1 = new FacultySubject("java");
		FacultySubject facultySubject2 = new FacultySubject("python");
		ArrayList<FacultySubject> listFS = new ArrayList<>();
		listFS.add(facultySubject1);
		listFS.add(facultySubject2);
		faculty.setListFacultySub(listFS);

		session.save(faculty);
		transaction.commit();
	}
}
