package demo.services

import demo.models.CourseModel
import demo.models.JobModel
import demo.repositories.CourseRepository
import demo.repositories.JobRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CourseService {

    @Autowired
    private lateinit var courseRepository: CourseRepository
    @Autowired
    private lateinit var jobRepository: JobRepository

    fun addJobToCourse(courseId: Long, newJob: JobModel): CourseModel?{
        val course = courseRepository.findById(courseId)
        if (course.isPresent){
            val job = jobRepository.save(newJob)
            course.get().addJobToCourse(job)
        }
        return course.get()
    }

    fun addCourse(course: CourseModel): CourseModel
        = courseRepository.save(course)

    fun getAllCourses(): MutableIterable<CourseModel>
        = courseRepository.findAll()
}