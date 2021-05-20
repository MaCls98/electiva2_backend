package demo.services

import demo.models.CourseModel
import demo.models.JobModel
import demo.repositories.CourseRepository
import demo.repositories.JobRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.orm.jpa.EntityManagerFactoryUtils
import org.springframework.stereotype.Service
import javax.persistence.EntityManager

@Service
class CourseService {

    @Autowired
    private lateinit var courseRepository: CourseRepository

    fun addJobToCourse(courseId: Long, newJob: JobModel): CourseModel?{
        val course = courseRepository.findById(courseId)
        if (course.isPresent){
            course.get().addJobToCourse(newJob)
            courseRepository.save(course.get())
        }
        return course.get()
    }

    fun addCourse(course: CourseModel): CourseModel
        = courseRepository.save(course)

    fun getAllCourses(): MutableIterable<CourseModel>
        = courseRepository.findAll()
}