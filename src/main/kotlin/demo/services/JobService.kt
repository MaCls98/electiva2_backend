package demo.services

import demo.models.JobModel
import demo.repositories.JobRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class JobService{

    @Autowired
    private lateinit var jobRepository: JobRepository

    fun getAllJobs(): MutableIterable<JobModel>
        = jobRepository.findAll()
}
