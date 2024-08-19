package org.jobapp.repository;

import org.jobapp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    private final JobPost jobPost;
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Frontend Developer", "Must have 4-5 years of experience", 4, Arrays.asList( new String("JavaScript"), new String("React"))),
            new JobPost(2, "Backend Developer", "Must have 7-8 years of experience", 7, Arrays.asList( new String("Java"), new String("Spring"))),
            new JobPost(3, "ML Developer", "Must have 3-4 years of experience", 3, Arrays.asList( new String("Python"), new String("ML"))),
            new JobPost(4, "Frontend Developer", "Must have 4-5 years of experience", 3, Arrays.asList( new String("JavaScript"), new String("React"))),
            new JobPost(5, "Frontend Developer", "Must have 4-5 years of experience", 3, Arrays.asList( new String("JavaScript"), new String("React")))
    ));

    public JobRepo(JobPost jobPost) {
        this.jobPost = jobPost;
    }

    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public void addJob(JobPost jobPost) {
        jobs.add(jobPost);
        System.out.println(jobs);
    }

    public JobPost getJob(int postId) {
        for (JobPost jobPost : jobs) {
            if (jobPost.getPostId() == postId) {
                return jobPost;
            }
        }
        return null;
    }

    public void updateJob(JobPost jobPost) {
        for (JobPost jobPost1 : jobs) {
            if (jobPost1.getPostId() == jobPost.getPostId()) {

                jobPost1.setPostProfile(jobPost.getPostProfile());
                jobPost1.setPostDesc(jobPost.getPostDesc());
                jobPost1.setReqExperience(jobPost.getReqExperience());
                jobPost1.setPostTechStack(jobPost.getPostTechStack());
            }
        }
    }

    public void deleteJob(int postId) {
        for (JobPost jobPost: jobs) {
            if (jobPost.getPostId() == postId) {
                jobs.remove(jobPost);
                break;
            }
        }
    }
}
