package demo.controllers

import demo.models.CourseModel
import demo.models.JobModel
import demo.services.CourseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.query.Param
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["*"])
@RequestMapping("/courses")
class CourseController{

    @Autowired
    private lateinit var courseService: CourseService

    @PostMapping("add-course")
    fun addCourse(@RequestBody newCourse: CourseModel): CourseModel
        = courseService.addCourse(newCourse)

    @GetMapping("get-all-courses")
    fun getAllCourses(): MutableIterable<CourseModel>
        = courseService.getAllCourses()

    @PostMapping("add-job-to-course")
    fun addJobToCourse(
        @Param("courseId") courseId: Long,
        @RequestBody job: JobModel
    ): CourseModel?
        = courseService.addJobToCourse(courseId, job)
}