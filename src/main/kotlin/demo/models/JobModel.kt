package demo.models

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "JOB")
data class JobModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    val id: Long,

    @Column(unique = true, nullable = false)
    val title: String,

    @Column(nullable = false)
    val description: String,

    @Column(nullable = false)
    val dueDate: Date,

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    var courseModel: CourseModel?
)
