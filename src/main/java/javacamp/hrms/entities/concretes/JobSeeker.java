package javacamp.hrms.entities.concretes;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;;

@Data
@Entity
@Table(name="JobSeekers")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker extends User {
	
	@NotNull
	@Column(name="Id") 
	private int id;
	
	@NotNull
	@Column(name="JobSeekerId") 
	private int jobSeekerId;
	
	@NotNull
	@Column(name="Firstname") 
	private String firstName;
	
	@NotNull
	@Column(name="Lastname") 
	private String lastName;
	
	@NotNull
	@Column(name="NationalId") 
	private String nationalId;
	
	@NotNull
	@Column(name="Birthyear") 
	private LocalDate birthYear;
	
	@NotNull
	@Column(name="PositionId") 
	private int positionId;
	
	
}
