package javacamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="Employers")
@AllArgsConstructor
@NoArgsConstructor
public class Employer extends User {
	
	@NotNull
	@Column(name="Id")
	private int id;
		
	@NotNull
	@Column(name="EmployerId") 
	private int employerId;
	
	@NotNull
	@Column(name="CompanyName")
	private String companyName;
	
	@NotNull
	@Column(name="Website")
	private String website;
	
	@NotNull
	@Column(name="Phone")
	private String phone;
	
	@NotNull
	@Column(name="PositionId")
	private int positionId;

	
}
