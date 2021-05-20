package demo.models

import javax.persistence.*

@Entity
@Table(name = "course")
data class CourseModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    val id: Long,

    @Column(unique = true, nullable = false)
    var name: String,

    @Column(nullable = false)
    var description: String,

    @OneToMany(cascade = [CascadeType.ALL])
    var jobList: MutableList<JobModel> = mutableListOf()
){
    fun addJobToCourse(newJob: JobModel){
        jobList.add(newJob)
    }
}
