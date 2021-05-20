package demo.repositories

import demo.models.StudentModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository: CrudRepository<StudentModel, Long>