package Opgave5;

public class Main {
    public static void main(String[] args) {

        // Opret udviklere
        Developer dev1 = new Developer("Anders");
        Developer dev2 = new Developer("Maria");
        Developer dev3 = new Developer("Jonas");

        // Tilføj kompetencer
        dev1.addSkill("Java", 7);
        dev1.addSkill("SQL", 5);
        dev1.addSkill("Git", 1);

        dev2.addSkill("Java", 9);
        dev2.addSkill("Python", 6);
        dev2.addSkill("Git", 5);

        dev3.addSkill("Java", 4);
        dev3.addSkill("SQL", 8);
        dev3.addSkill("Cooking", 10);

        // Opret team
        Team team = new Team("Backend Team");

        // Tilføj udviklere til team
        team.addDeveloper(dev1);
        team.addDeveloper(dev2);
        team.addDeveloper(dev3);

        // Udskriv hele teamet
        System.out.println("=== Team oversigt ===");
        team.printTeamOverview();

        // Find bedste Java-udvikler
        Developer bestJavaDev = team.findBestDeveloper("Java");
        System.out.println("Bedste Java-udvikler:");
        System.out.println(bestJavaDev);

        // Opdatér kompetence
        dev3.updateSkillLevel("Java", 6);

        // Find udviklere med Java >= 6
        System.out.println("Udviklere med Java niveau >= 6:");
        for (Developer d : team.findDevelopersWithSkills("Java", 6)) {
            System.out.println(d.getName());
        }
    }

}
