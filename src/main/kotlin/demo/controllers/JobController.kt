package demo.controllers

import demo.models.GradeModel
import demo.models.JobModel
import demo.services.JobService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.query.Param
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["*"])
@RequestMapping("/jobs")
class JobController {

    @Autowired
    private lateinit var jobService: JobService

    @GetMapping("get-all-jobs")
    fun getAllJobs(): MutableIterable<JobModel>
        = jobService.getAllJobs()

    @PostMapping("add-grade-to-job")
    fun addGradeToJob(
        @Param("jobId") jobId: Long,
        @RequestBody grade: GradeModel
    ): JobModel?
        = jobService.addGradeToJob(jobId, grade)
}