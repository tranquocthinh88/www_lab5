package vn.edu.iuh.fit.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.enums.SkillLevel;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "job_skill")
public class JobSkill {
    @Enumerated
    private SkillLevel skillLevel;
    @Id
    @JoinColumn(name = "job_id")
    @ManyToOne
    private Job job;
    @Column(name = "more_infos", columnDefinition = "varchar(1000)")
    private String moreInfo;
    @Id
    @JoinColumn(name = "skill_id")
    @ManyToOne
    private Skill skill;

}
