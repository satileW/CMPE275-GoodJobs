package rest.repo;

import org.springframework.data.repository.CrudRepository;


import rest.module.JobSeeker;

public interface JobSeekerRepo extends CrudRepository<JobSeeker, Long>{
	
	JobSeeker findBysID(Long sID);
	JobSeeker findByemail(String email);
}
