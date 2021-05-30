package javacamp.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="JobPositions")
@AllArgsConstructor
@NoArgsConstructor
public class JobPosition {
	
	@Id
	@Column(name="PositionId") 
	private int positionId;
	
	@Column(name="Positionname") 
	private String positionName;
	
	@Column(name="PositionDescription") 
	private String positionDescription;
	
	@OneToMany(mappedBy="jobPosition")
	private List<Employer> Employers;
	
	@OneToMany(mappedBy="jobPosition")
	private List<JobAdvert> JobAdverts;
	
}
