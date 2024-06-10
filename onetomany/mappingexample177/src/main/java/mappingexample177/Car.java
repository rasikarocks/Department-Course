package mappingexample177;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int cid;
	String cname;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aid")
	Accident accident;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Accident getAccident() {
		return accident;
	}

	public void setAccident(Accident accident) {
		this.accident = accident;
	}

	int accId;

	public Car(int cid, String cname, int accId) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.accId = accId;
	}

	public Car(String cname) {
		super();
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", cname=" + cname + ", accId=" + accId + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

}
