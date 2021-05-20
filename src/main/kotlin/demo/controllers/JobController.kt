package demo.controllers

import demo.models.JobModel
import demo.services.JobService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["*"])
@RequestMapping("/jobs")
class JobController {

    @Autowired
    private lateinit var jobService: JobService

    @GetMapping("get-all-jobs")
    fun getAllJobs(): MutableIterable<JobModel>
        = jobService.getAllJobs()
}