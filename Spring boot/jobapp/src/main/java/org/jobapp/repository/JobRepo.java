package org.jobapp.repository;

import org.jobapp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Frontend Developer", "Must have 4-5 years of experience", 4, Arrays.asList( new String("JavaScript"), new String("React"))),
            new JobPost(2, "Backend Developer", "Must have 7-8 years of experience", 7, Arrays.asList( new String("Java"), new String("Spring"))),
            new JobPost(3, "ML Developer", "Must have 3-4 years of experience", 3, Arrays.asList( new String("Python"), new String("ML"))),
            new JobPost(4, "Frontend Developer", "Must have 4-5 years of experience", 3, Arrays.asList( new String("JavaScript"), new String("React"))),
            new JobPost(5, "Frontend Developer", "Must have 4-5 years of experience", 3, Arrays.asList( new String("JavaScript"), new String("React")))
    ));

    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public void addJob(JobPost jobPost) {
        jobs.add(jobPost);
        System.out.println(jobs);
    }
}
