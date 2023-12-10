public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;
    public Gryffindor(String name,int skill,int distance,int nobility, int honor, int courage){
        super(name,skill,distance);
        this.nobility=nobility;
        this.honor=honor;
        this.courage=courage;
    }
    public int getNobility() {
        return nobility;
    }
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public int getHonor() {
        return honor;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }
    public int getCourage() {
        return courage;
    }
    public void setCourage(int courage) {
        this.courage = courage;
    }
    private int sum() {
        return nobility+ honor+courage;
    }
    public void compare(Gryffindor other) {
        int thisPower= sum();
        int otherPower= other.sum();
        if (thisPower>otherPower){
            System.out.println(getName()+ "Лучший Гриффиндорцец, чем "+ other.getName());
        }else {
            System.out.println(other.getName()+ "Лучший Гриффиндорец, чем "+ getName() );
        }

    }

    @Override
    public String toString() {
        return "Gryffindor." +super.toString()+
                ",nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage ;

    }
}

