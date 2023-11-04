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
@Table(name = "candidate_skill")
public class CandidateSkill {
    @Column(name = "skill_level", columnDefinition = "tinyint(4)")
    private SkillLevel skillLevel;
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;
    @Column(name = "more_infos", columnDefinition = "varchar(1000)")
    private String moreInfo;
}
