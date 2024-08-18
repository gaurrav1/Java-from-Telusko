package org.jobapp;

import org.jobapp.model.JobPost;
import org.jobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping({"/", "home"})
    public String home() {
        return "home";
    }

    @RequestMapping("addjob")
    public String addjob() {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){ //DTO -DData Transfer Object
        jobService.addJob(jobPost);
        return "success";
    }

    @RequestMapping("viewalljobs")
    public String viewJobs(Model m) {
        List<JobPost> jobs = jobService.getAllJobs();
        m.addAttribute("jobPosts", jobs);
        return "viewalljobs";
    }

}
