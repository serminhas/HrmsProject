package javacamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name="SystemPersonnels")
@AllArgsConstructor
@NoArgsConstructor
public class SystemPersonnel extends User{

	@Column(name="Id") 
	private int id;

	@Column(name="Firstname") 
	private String firstName;
	
	@Column(name="Lastname") 
	private String lastName;
	
	@Column(name="Adminrole") 
	private boolean adminRole;
	
	@Column(name="PersonnelId") 
	private int personnelId;

}
