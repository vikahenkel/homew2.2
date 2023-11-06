public class HufflepuffStudent extends HogwartsStudent {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, int magicPower, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int sumOfProperties() {
        return industriousness + loyalty + honesty;
    }

    public void compareStudents(HufflepuffStudent hufflepuffStudent) {
        int sumOfProperties1 = sumOfProperties();
        int sumOfProperties2 = hufflepuffStudent.sumOfProperties();
        if (sumOfProperties1 > sumOfProperties2) {
            System.out.println("Пуффендуец " + getName() + " лучше пуффендуйца " + hufflepuffStudent.getName() + " ");
        } else if (sumOfProperties1 < sumOfProperties2) {
            System.out.println("Пуффендуец " + hufflepuffStudent.getName() + " лучше пуффендуйца " + getName() + " ");
        } else {
            System.out.println("Пуффендуец " + getName() + " равен пуффендуйцу " + hufflepuffStudent.getName() + " ");
        }
    }

    @Override
    public String toString() {
        return "Студент" + getName() + ", magicPower= " + getMagicPower() + ", transgressionDistance= " + getTransgressionDistance();
    }
}
