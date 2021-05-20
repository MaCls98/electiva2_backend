package demo.models

import javax.persistence.*

@Entity
@Table(name = "COURSE")
data class CourseModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    val id: Long,

    @Column(unique = true, nullable = false)
    var name: String,

    @Column(nullable = false)
    var description: String,

    @OneToMany
    var jobList: MutableList<JobModel> = mutableListOf()
){
    fun addJobToCourse(newJob: JobModel){
        jobList.add(newJob)
    }
}
