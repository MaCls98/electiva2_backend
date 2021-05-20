package demo.services

import demo.models.GradeModel
import demo.models.JobModel
import demo.repositories.GradeRepository
import demo.repositories.JobRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class JobService{

    @Autowired
    private lateinit var jobRepository: JobRepository
    @Autowired
    private lateinit var gradeRepository: GradeRepository

    fun getAllJobs(): MutableIterable<JobModel>
        = jobRepository.findAll()

    fun addGradeToJob(jobId: Long, gradeModel: GradeModel): JobModel?{
        val job = jobRepository.findById(jobId)
        if (job.isPresent){
            val grade = gradeRepository.save(gradeModel)
            job.get().gradeModel = grade
            jobRepository.save(job.get())
        }
        return job.get()
    }
}
