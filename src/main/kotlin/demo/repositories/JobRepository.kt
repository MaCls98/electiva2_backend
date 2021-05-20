package demo.repositories

import demo.models.JobModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface JobRepository: CrudRepository<JobModel, Long>