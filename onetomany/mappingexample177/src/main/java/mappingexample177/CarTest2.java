package mappingexample177;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CarTest2 {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();// be default hibernate.cfg.xml
		configuration.addAnnotatedClass(Car.class);
		configuration.addAnnotatedClass(Accident.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Car car = new Car("maruti");
		Accident acc= new Accident("pune");
		car.setAccident(acc);

		session.save(car);
		transaction.commit();
	}
}




