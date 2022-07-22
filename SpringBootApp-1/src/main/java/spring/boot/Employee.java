package spring.boot;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Repository;

@Repository
@Entity
public class Employee {

	private String name;
	@Id
	private int emplId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmplId() {
		return emplId;
	}
	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}
	
	
}
