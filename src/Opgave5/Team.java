package Opgave5;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Developer> developers;

    public Team(String name) {
        this.name = name;
        this.developers = new ArrayList<>();
    }

    public void addDeveloper(Developer developer){
        if (!developers.contains(developer)){
            developers.add(developer);
        }

    }

    public void removeDeveloper(String developerName){

    }

    public Developer findDeveloper(String developerName){
        for(Developer developer : developers){
            if(developer.getName().equalsIgnoreCase(developerName)){
                return developer;
            }
        }
        return null;

    }

    public void printTeamOverview(){
        for(Developer developer : developers){
            System.out.println(developer);
        }

    }

    public Developer findBestDeveloper(String skillName){
        Developer bestDeveloper = null;
        int highestLevel = -1;

        for(Developer developer : developers){
            for (Skill skill : developer.getSkills()){
                if(skill.getName().equalsIgnoreCase(skillName)){
                    if(skill.getLevel() > highestLevel){
                        highestLevel = skill.getLevel();
                        bestDeveloper = developer;
                    }
                }
            }
        }
        return bestDeveloper;

    }

    public List<Developer> findDevelopersWithSkills(String skillName, int minLevel) {
        List<Developer> result = new ArrayList<>();

        for (Developer developer : developers) {
            for (Skill skill : developer.getSkills()) {
                if (skill.getName().equalsIgnoreCase(skillName) &&
                        skill.getLevel() >= minLevel) {
                    result.add(developer);
                    break;
                }
            }
        }
        return result;
    }


}
