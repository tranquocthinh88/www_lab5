package vn.edu.iuh.fit.enums;

import lombok.Getter;

@Getter
public enum SkillLevel {
    MASTER("m"),
    BEGINER("b"),
    ADVANCEDM("a"),
    PROFESSIONAL("p"),
    IMTERMEDIATE("i");

    private final String skill;

    SkillLevel(String skill) {
        this.skill = skill;
    }
}
