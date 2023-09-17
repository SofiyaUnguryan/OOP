public class GryffindorStudents extends HogvartsStudents{
    int generosity;
    int honor;
    int courage;

    public GryffindorStudents(String name, String surname, int powerOfMagic, int distanceOfTransgression, int generosity, int honor, int courage) {
        super(name, surname, powerOfMagic, distanceOfTransgression);
        this.generosity = generosity;
        this.honor = honor;
        this.courage = courage;
    }

    public int getGenerosity() {
        return generosity;
    }

    public void setGenerosity(int generosity) {
        this.generosity = generosity;
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
    @Override
    public String toString() {
        return super.toString() +
                "; благородство - " + getGenerosity() +
                "; честь - " + getHonor() +
                "; храбрость - " + getCourage();

    }
    public void whosBetterGryffindor (GryffindorStudents student) {
        if (this.generosity +
                this.honor +
                this.courage >
                student.generosity +
                        student.honor +
                        student.courage) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + student.getName());
        } else if (this.generosity +
                this.honor +
                this.courage ==
                student.generosity +
                        student.honor +
                        student.courage) {
            System.out.println("Эти студенты одинаково хорошие Гриффиндорцы");
        } else {
            System.out.println(student.getName() + " лучший Гриффиндорец, чем " + this.getName());
        }
    }
}
