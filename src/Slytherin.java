public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slytherin(String name,int skill,int distance,int cunning,int determination,
                     int ambition,int resourcefulness,int power) {
        super(name,skill,distance);
        this.cunning = cunning;
        this.determination=determination;
        this.ambition=ambition;
        this.resourcefulness=resourcefulness;
        this.power=power;
    }
    public int getCunning() {
        return cunning;
    }
    public void setCunning(int cunning) {
        this.cunning = cunning;
    }
    public int getDetermination() {
        return determination;
    }
    public void setDetermination(int determination) {
        this.determination = determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    private int sum() {
        return cunning+determination+ambition+resourcefulness+power;
    }
    public void compare(Slytherin other) {
        int thisPower= sum();
        int otherPower= other.sum();
        if (thisPower>otherPower){
            System.out.println(getName()+ "Лучший Слизерин, чем "+ other.getName());
        }else {
            System.out.println(other.getName()+ "Лучший Слизерин, чем "+ getName() );
        }
    }


    @Override
    public String toString() {
        return "Slytherin." +super.toString()+
                ",cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", power=" + power ;

    }
}




