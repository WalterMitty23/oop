public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name,int skill,int distance,int hardworking,int loyal,int honest) {
        super(name,skill,distance);
        this.hardworking = hardworking;
        this.loyal=loyal;
        this.honest=honest;
    }
    public int getHardworking() {
        return hardworking;
    }
    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }
    public int getLoyal() {
        return loyal;
    }
    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }
    public int getHonest() {
        return honest;
    }
    public void setHonest(int honest) {
        this.honest = honest;
    }
    private int sum() {
        return hardworking+loyal+honest;
    }
    public void compare(Hufflepuff other) {
 int thisPower= sum();
 int otherPower= other.sum();
 if (thisPower>otherPower){
     System.out.println(getName()+ "Лучший Пуффендуец, чем "+ other.getName());
 }else {
     System.out.println(other.getName()+ "Лучший Пуффендуец, чем "+ getName() );
 }
    }

    @Override
    public String toString() {
        return "Hufflepuff." +super.toString()+
                ",hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest;

    }
}
