public abstract class HogwartsStudent {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
    private int sumOfProperties(){
        return magicPower + transgressionDistance;
    }
    public void print(){
        System.out.println(this.toString());
    }
    public void compareStudents (HogwartsStudent hogwartsStudent){
        int sumOfProperties1 = sumOfProperties();
        int sumOfProperties2 = hogwartsStudent.sumOfProperties();
        if (sumOfProperties1>sumOfProperties2){
            System.out.println("Студент " + name + " лучше студента" + hogwartsStudent.name + " ");
        } else if (sumOfProperties1 < sumOfProperties2){
                System.out.println("Студент " + hogwartsStudent.name + " лучше студента" + name + " ");
        } else {
            System.out.println("Студент " + name + " равен студенту" + hogwartsStudent.name + " ");
        }
    }

    @Override
    public String toString() {
        return "Студент  " + name + ", magicPower= " + magicPower + ", transgressionDistance= " + transgressionDistance;
    }
}
