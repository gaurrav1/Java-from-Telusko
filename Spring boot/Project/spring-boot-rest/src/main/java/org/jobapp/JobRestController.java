package org.jobapp;

import org.jobapp.model.JobPost;
import org.jobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("/jobs")
    public List<JobPost> getAllJobs() {
        List<JobPost> jobs = jobService.getAllJobs();
        return jobs;
    }

    @GetMapping(path = "/job/{postId}", produces = {"application/xml"})
    public JobPost getJob(@PathVariable("postId") int postId) {
        return jobService.getJob(postId);
    }

    @PostMapping(path = "/job", consumes = {"application/xml"})
    public void addJob(@RequestBody JobPost jobPost) {
        jobService.addJob(jobPost);
    }

    @PutMapping("/job")
    public void updateJob(@RequestBody JobPost jobPost) {
        jobService.updateJob(jobPost);
    }

    @DeleteMapping("/job/{postId}")
    public void deleteJob(@PathVariable int postId){
        jobService.deleteJob(postId);
    }

    @GetMapping("/load")
    public String loadData() {
        jobService.loadData();
        return "Loaded";
    }

}
