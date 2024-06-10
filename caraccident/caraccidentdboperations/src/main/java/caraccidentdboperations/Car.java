package caraccidentdboperations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Car {

	@Id
	int cid;

	String company;

	@Column(name = "carowner")
	String ownername;

	String cost;

	public Car(String company, String ownername, String cost) {
		super();
		this.company = company;
		this.ownername = ownername;
		this.cost = cost;
	}

	public Car() {
		super();
	}

	public Car(int cid, String company, String ownername, String cost) {
		super();
		this.cid = cid;
		this.company = company;
		this.ownername = ownername;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", company=" + company + ", ownername=" + ownername + ", cost=" + cost + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

}
