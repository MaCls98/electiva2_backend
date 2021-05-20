package demo.controllers

import demo.models.CourseModel
import demo.models.StudentModel
import demo.services.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.query.Param
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
class StudentController {

    @Autowired
    private lateinit var studentService: StudentService

    @PostMapping("add-student")
    fun addStudent(@RequestBody newStudent: StudentModel): StudentModel
        = studentService.addStudent(newStudent)

    @PostMapping("add-course-to-student")
    fun addCourseToStudent(
        @Param("studentId") studentId: Long,
        @RequestBody course: CourseModel
    ): StudentModel?
        = studentService.addCourseToStudent(studentId, course)

    @GetMapping("get-all-students")
    fun getAllStudents(): MutableIterable<StudentModel>
        = studentService.getAllStudents()
}