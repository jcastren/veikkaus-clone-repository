package fi.joonas.veikkaus.jpaentity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Status {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private int statusNumber;

    private String description;
    
    public Status() {}

	public Status(int statusNumber, String description) {
		this.statusNumber = statusNumber;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public int getStatusNumber() {
		return statusNumber;
	}

	public void setStatusNumber(int statusNumber) {
		this.statusNumber = statusNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}

