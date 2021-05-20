package demo.models

import javax.persistence.*

@Entity
@Table(name = "COURSE")
data class CourseModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    val id: Long,

    @Column(nullable = false)
    var courseName: String,

    @Column(nullable = false)
    var courseDescription: String
)
