public class GryffindorStudent extends HogwartsStudent{

    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudent(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
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

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    private int sumOfProperties() {
        return nobility + honor + bravery;
    }
    public void compareStudents (GryffindorStudent gryffindorStudent){
        int sumOfProperties1 = sumOfProperties();
        int sumOfProperties2 = gryffindorStudent.sumOfProperties();
        if (sumOfProperties1>sumOfProperties2){
            System.out.print("Гриффиндорец " + getName() + " лучше гриффендорца " + gryffindorStudent.getName() + " ");
        } else if (sumOfProperties1 < sumOfProperties2){
            System.out.print("Гриффиндорец " + gryffindorStudent.getName() + " лучше гриффендорца" + getName() + " ");
        } else {
            System.out.print("Гриффиндорец " + getName() + " равен гриффендорцу" + gryffindorStudent.getName() + " ");
        }
    }
    @Override
    public String toString() {
        return "Студент" + getName() + ", magicPower= " + getMagicPower() + ", transgressionDistance= " + getTransgressionDistance();
    }
}
