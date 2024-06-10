package mappingexample177;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Accident {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int aid;

	@Override
	public String toString() {
		return "Accident [aid=" + aid + ", accPlace=" + accPlace + "]";
	}

	public Accident() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Accident(String accPlace) {
		super();
		this.accPlace = accPlace;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAccPlace() {
		return accPlace;
	}

	public void setAccPlace(String accPlace) {
		this.accPlace = accPlace;
	}

	String accPlace;
}
