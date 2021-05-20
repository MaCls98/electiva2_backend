package demo.services

import demo.models.CourseModel
import demo.repositories.CourseRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CourseService {

    @Autowired
    private lateinit var courseRepository: CourseRepository

    fun addCourse(course: CourseModel): CourseModel
        = courseRepository.save(course)

    fun getAllCourses(): MutableIterable<CourseModel>
        = courseRepository.findAll()
}