public class Hogwarts {

    private String name;

    private int skill;
    private int distance;
    public Hogwarts(String name, int skill, int distance){
        this.name=name;
        this.skill=skill;
        this.distance=distance;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public int getSkill() {

        return skill;
    }
    public void setSkill(int skill) {

        this.skill = skill;
    }

    public int getDistance() {

        return distance;
    }

    public void setDistance(int distance) {

        this.distance = distance;
    }
    private int sum(){
        return skill+ distance;
    }
    public void compareHogwarts(Hogwarts other) {
        if (sum()> other.sum()) {
            System.out.println(name +"обладает бoльшей мощностью магии, чем"+" " + other.name);
        }else {
            System.out.println(other.name+"обладает бoльшей мощностью магии, чем"+" "  + name);
        }
    }
    @Override
    public String toString() {
        return name + ": " +
                " skill=" + skill +
                ", distance=" + distance ;

    }
}
