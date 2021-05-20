package demo.repositories

import demo.models.GradeModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface GradeRepository: CrudRepository<GradeModel, Long>