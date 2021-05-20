package demo.models

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "job")
data class JobModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    val id: Long,

    @Column(nullable = false)
    val title: String,

    @Column(nullable = false)
    val description: String,

    @Column(nullable = false)
    val dueDate: Date,

    @OneToOne
    var gradeModel: GradeModel?
)
