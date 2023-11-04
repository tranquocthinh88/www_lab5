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
@Table(name = "company")
public class Company {
    @Id
    @Column(name = "com_id", columnDefinition = "bigint(20)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "comp_name", columnDefinition = "varchar(255)")
    private String name;
    @Column(name = "about", columnDefinition = "varchar(2000)")
    private String about;
    @OneToOne
    @JoinColumn(name = "address")
    private Address address;
    @Column(name = "phone", columnDefinition = "varchar(255)")
    private String phone;
    @Column(name = "web_url", columnDefinition = "varchar(255)")
    private String webURL;
    @OneToMany(mappedBy = "company")
    private List<Job>jops;
    @Column(name = "email", columnDefinition = "varchar(255)")
    private String email;
}
