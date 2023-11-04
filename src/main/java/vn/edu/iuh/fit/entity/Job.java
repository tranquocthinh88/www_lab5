package vn.edu.iuh.fit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "job")
public class Job {
    @Id
    @Column(name = "job_id", columnDefinition = "bigint(20)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "job_name", columnDefinition = "varchar(255)")
    private String name;
    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;
    @OneToMany(mappedBy = "job")
    private List<JobSkill> jobSkills;
    @Column(name = "job_desc", columnDefinition = "varchar(2000)")
    private String description;

}
