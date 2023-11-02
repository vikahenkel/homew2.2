public class RavenclawStudent extends HogwartsStudent{
    private int smart;
    private int wise;
    private int wit;
    private int creativity;

    public RavenclawStudent(String name, int magicPower, int transgressionDistance, int smart, int wise, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.wit = wit;
        this.creativity = creativity;
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

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    private int sumOfProperties() {
        return smart + wise + wit + creativity;
    }
    public void compareStudents (RavenclawStudent ravenclawStudent){
        int sumOfProperties1 = sumOfProperties();
        int sumOfProperties2 = ravenclawStudent.sumOfProperties();
        if (sumOfProperties1>sumOfProperties2){
            System.out.println("Когтевранец " + getName() + " лучше когтевранца " + ravenclawStudent.getName() + " ");
        } else if (sumOfProperties1 < sumOfProperties2){
            System.out.println("Когтевранец" + ravenclawStudent.getName() + "лучше когтевранца" + getName() + " ");
        } else {
            System.out.println("Когтевранец" + getName() + " равен когтевранцу" + ravenclawStudent.getName() + " ");
        }
    }
    public String toString() {
        return "Когтевранец";
        super(toString());
    }
}

