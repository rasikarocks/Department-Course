package mappingexample177;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int facultyCode;
	String facultyName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "facultyCode")
	List<FacultySubject> listFacultySub;

	public int getFacultyCode() {
		return facultyCode;
	}

	public void setFacultyCode(int facultyCode) {
		this.facultyCode = facultyCode;
	}

	public List<FacultySubject> getListFacultySub() {
		return listFacultySub;
	}

	public void setListFacultySub(List<FacultySubject> listFacultySub) {
		this.listFacultySub = listFacultySub;
	}

	public Faculty(String facultyName) {
		super();
		this.facultyName = facultyName;
	}

	public int getFaultyCode() {
		return facultyCode;
	}

	public void setFaultyCode(int faultyCode) {
		this.facultyCode = faultyCode;
	}

	@Override
	public String toString() {
		return "Faculty [faultyCode=" + facultyCode + ", facultyName=" + facultyName + "]";
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public Faculty(int faultyCode, String facultyName) {
		super();
		this.facultyCode = faultyCode;
		this.facultyName = facultyName;
	}

	public Faculty() {
		super();
	}

}
