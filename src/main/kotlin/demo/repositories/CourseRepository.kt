package demo.repositories

import demo.models.CourseModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CourseRepository: CrudRepository<CourseModel, Long>