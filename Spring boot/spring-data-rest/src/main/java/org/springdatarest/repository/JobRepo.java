package org.springdatarest.repository;

import org.springdatarest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

//    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);

}
