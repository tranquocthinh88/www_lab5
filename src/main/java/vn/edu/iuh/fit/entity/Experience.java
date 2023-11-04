package vn.edu.iuh.fit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "experience")
public class Experience {
    @Id
    @Column(name = "exp_id", columnDefinition = "bigint(20)")
    private long id;
    @Column(name = "to_date", columnDefinition = "date")
    private LocalDate toDate;
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;
    @Column(name = "from_date", columnDefinition = "date")
    private LocalDate fromDate;
    @Column(name = "company", columnDefinition = "varchar(120)")
    private String companyName;
    @Column(name = "role", columnDefinition = "varchar(100)")
    private String role;
    @Column(name = "work_desc")
    private String workDescription;
}
