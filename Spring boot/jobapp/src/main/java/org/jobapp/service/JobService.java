package org.jobapp.service;

import org.jobapp.model.JobPost;
import org.jobapp.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public void addJob(JobPost jobPost){

        jobRepo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs() {

        List<JobPost> jobPost = jobRepo.getAllJobs();
        return jobPost;
    }

}

