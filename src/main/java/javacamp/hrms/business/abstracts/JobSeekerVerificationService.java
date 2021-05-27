package javacamp.hrms.business.abstracts;

import javacamp.hrms.entities.concretes.JobSeeker;

public interface JobSeekerVerificationService {
	boolean CheckIfRealPerson(JobSeeker jobSeeker);
}
