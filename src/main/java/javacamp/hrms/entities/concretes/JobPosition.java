package javacamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	
}
