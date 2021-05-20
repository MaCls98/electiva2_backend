package demo.models

import javax.persistence.*

@Entity
@Table(name = "STUDENT")
data class StudentModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    val id: Long,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var lastname: String,

    @Column(unique = true, nullable = false)
    var document: String,

    @OneToMany
    var courseList: MutableList<CourseModel> = mutableListOf()
){
    fun addCourseToList(newCourse: CourseModel){
        courseList.add(newCourse)
    }
}
