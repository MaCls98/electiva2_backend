package demo.models

import javax.persistence.*

@Entity
@Table(name = "grade")
data class GradeModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    val id: Long,

    @Column(nullable = false)
    val grade: String,

    @Column(nullable = true)
    val description: String?
)
