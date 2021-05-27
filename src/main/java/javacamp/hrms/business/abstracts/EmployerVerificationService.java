package javacamp.hrms.business.abstracts;

import javacamp.hrms.entities.concretes.Employer;
import javacamp.hrms.entities.concretes.JobSeeker;

public interface EmployerVerificationService {
	boolean CheckIfRealCompany(Employer employer);
}
