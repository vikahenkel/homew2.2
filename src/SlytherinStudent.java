public class SlytherinStudent extends HogwartsStudent{

    private int cunning;
    private int determination;
    private int ambition;
    private int resourceful;
    private int thirstForPower;

    public SlytherinStudent(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourceful, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourceful = resourceful;
        this.thirstForPower = thirstForPower;
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

    public int getResourceful() {
        return resourceful;
    }

    public void setResourceful(int resourceful) {
        this.resourceful = resourceful;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }



    private int sumOfProperties() {
        return cunning + determination + ambition + resourceful + thirstForPower;
    }
    public void compareStudents (SlytherinStudent slytherinStudent){
        int sumOfProperties1 = sumOfProperties();
        int sumOfProperties2 = slytherinStudent.sumOfProperties();
        if (sumOfProperties1>sumOfProperties2){
            System.out.println("Слизеринец " + getName() + " лучше cлизеринца " + slytherinStudent.getName() + " ");
        } else if (sumOfProperties1 < sumOfProperties2){
            System.out.println("Слизеринец " + slytherinStudent.getName() + " лучше cлизеринца " + getName() + " ");
        } else {
            System.out.println("Слизеринец " + getName() + " равен cлизеринцу " + slytherinStudent.getName() + " ");
        }
    }
    @Override
    public String toString() {
        return "Студент" + getName() + ", magicPower= " + getMagicPower() + ", transgressionDistance= " + getTransgressionDistance();
    }
}

