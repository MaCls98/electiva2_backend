package demo.controllers

import demo.models.CourseModel
import demo.services.CourseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
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
}