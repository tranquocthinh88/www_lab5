package vn.edu.iuh.fit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.enums.SkillType;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "skill")
public class Skill {
    @Enumerated
    private SkillType skillType;
    @Column(name = "skill_name", columnDefinition = "varchar(150)")
    private String skillName;
    @Column(name = "skill_desc", columnDefinition = "varchar(300)")
    private String skillDescription;
    @Id
    @Column(name = "skill_id", columnDefinition = "bigint(20)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany(mappedBy = "skill")
    private List<JobSkill> jobSkills;
}
