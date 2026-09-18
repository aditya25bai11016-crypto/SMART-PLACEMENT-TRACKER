public class Skill {

    private String name;
    private int level;

    // Constructor
    public Skill(String name, int level) {
        this.name = name;
        this.level = level;
    }

    // Get skill name
    public String getName() {
        return name;
    }

    // Get skill level
    public int getLevel() {
        return level;
    }

    // Update skill level
    public void setLevel(int level) {
        this.level = level;
    }

    // Display skill
    public void displaySkill() {
        System.out.println(name + " : " + level + "%");
    }
}