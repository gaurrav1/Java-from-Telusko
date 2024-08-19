package org.jobapp.service;

import org.jobapp.model.JobPost;
import org.jobapp.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public void addJob(JobPost jobPost){

        jobRepo.save(jobPost);
    }

    public List<JobPost> getAllJobs() {

        List<JobPost> jobPost = jobRepo.findAll();
        return jobPost;
    }

    public JobPost getJob(int postId) {
        return jobRepo.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        jobRepo.save(jobPost);
    }

    public void deleteJob(int postId) {
        jobRepo.deleteById(postId);
    }

    public void loadData() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(1, "Frontend Developer", "Must have 4-5 years of experience", 4, Arrays.asList( new String("JavaScript"), new String("React"))),
                new JobPost(2, "Backend Developer", "Must have 7-8 years of experience", 7, Arrays.asList( new String("Java"), new String("Spring"))),
                new JobPost(3, "ML Developer", "Must have 3-4 years of experience", 3, Arrays.asList( new String("Python"), new String("ML"))),
                new JobPost(4, "Frontend Developer", "Must have 4-5 years of experience", 3, Arrays.asList( new String("JavaScript"), new String("React"))),
                new JobPost(5, "Frontend Developer", "Must have 4-5 years of experience", 3, Arrays.asList( new String("JavaScript"), new String("React")))
        ));
        jobRepo.saveAll(jobs);
    }


//    public void addJob(JobPost jobPost){
//
//        jobRepo.addJob(jobPost);
//    }
//
//    public List<JobPost> getAllJobs() {
//
//        List<JobPost> jobPost = jobRepo.getAllJobs();
//        return jobPost;
//    }
//
//    public JobPost getJob(int postId) {
//        return jobRepo.getJob(postId);
//    }
//
//    public void updateJob(JobPost jobPost) {
//        jobRepo.updateJob(jobPost);
//    }
//
//    public void deleteJob(int postId) {
//        jobRepo.deleteJob(postId);
//    }
}

