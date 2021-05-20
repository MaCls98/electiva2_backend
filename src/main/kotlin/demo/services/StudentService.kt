package demo.services

import demo.models.CourseModel
import demo.models.StudentModel
import demo.repositories.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService {

    @Autowired
    private lateinit var studentRepository: StudentRepository

    fun addStudent(student: StudentModel)
        = studentRepository.save(student)

    fun getAllStudents(): MutableIterable<StudentModel>
        = studentRepository.findAll()

    fun addCourseToStudent(studentId: Long, course: CourseModel): StudentModel? {
        val student = studentRepository.findById(studentId)
        if (student.isPresent)
            student.get().addCourseToList(course)
        return studentRepository.save(student.get())
    }
}