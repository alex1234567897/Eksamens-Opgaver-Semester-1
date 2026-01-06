package Opgave5;

import java.util.ArrayList;
import java.util.List;

public class Developer {



    private String name;
    private List<Skill> skills;

    public Developer(String name) {
        this.skills = new ArrayList<>();
        this.name = name;
    }

    public void addSkill(String skillName, int level){

        if(level < 1 || level > 10){
            return;
        }

        for(Skill skill : skills){
            if(skill.getName().equalsIgnoreCase(skillName)){
                skill.setLevel(level);
                return;
            }

        }

        skills.add(new Skill(skillName, level));

    }

    public void updateSkillLevel(String skillName, int newLevel){

        if(newLevel < 1 || newLevel > 10){
            return;
        }

        for (Skill skill: skills) {
            if(skill.getName().equalsIgnoreCase(skillName)){
                skill.setLevel(newLevel);
                return;
            }
        }
        System.out.println("Skill not found");

    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Udvikler: ").append(name).append("\n");

        for (Skill skill : skills) {
            sb.append("  - ")
                    .append(skill.getName())
                    .append(" (niveau ")
                    .append(skill.getLevel())
                    .append(")\n");
        }

        return sb.toString();
    }

}
