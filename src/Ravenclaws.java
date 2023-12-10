public class Ravenclaws extends Hogwarts {
 private int smart;
 private int wise;
 private int creativy;

 public Ravenclaws(String name, int skill, int distance, int smart, int wise, int creativy) {
  super(name, skill, distance);
  this.smart = smart;
  this.wise = wise;
  this.creativy = creativy;
 }

 public int getSmart() {
  return smart;
 }

 public void setSmart(int smart) {
  this.smart = smart;
 }

 public int getWise() {
  return wise;
 }

 public void setWise(int wise) {
  this.wise = wise;
 }

 public int getCreativy() {
  return creativy;
 }

 public void setCreativy(int creativy) {
  this.creativy = creativy;
 }

 private int sum() {
  return smart + wise + creativy;
 }

 public void compare(Ravenclaws other) {
  int thisPower = sum();
  int otherPower = other.sum();
  if (thisPower > otherPower) {
   System.out.println(getName() + "Лучший Когтеврановец, чем " + other.getName());
  } else {
   System.out.println(other.getName() + "Лучший Когтеврановец, чем " + getName());
  }
 }


 @Override
 public String toString() {
  return  "Ravenclaws. " + super.toString() +
          ",smart=" + smart +
          ", wise=" + wise +
          ", creativy=" + creativy ;

 }
}

