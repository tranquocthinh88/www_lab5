package vn.edu.iuh.fit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "candidate")
public class Candidate {
    @Column(name = "phone", columnDefinition = "varchar(15)")
    private String phone;
    @Id
    @Column(name = "can_id", columnDefinition = "bigint(20)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "dob", columnDefinition = "date")
    private LocalDate dob;
    @Column(name = "email", columnDefinition = "varchar(255)")
    private String email;
    @Column(name = "full_name", columnDefinition = "varchar(255)")
    private String fullName;
    @OneToOne
    @JoinColumn(name = "address")
    private Address address;
    @OneToMany(mappedBy = "candidate")
    private List<CandidateSkill>candidateSkills;
    @OneToMany(mappedBy = "candidate")
    private List<Experience> experiences;
}
