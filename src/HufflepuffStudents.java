public class HufflepuffStudents extends HogvartsStudents{
    int honesty;
    int loyalty;
    int diligence;

    public HufflepuffStudents(String name, String surname, int powerOfMagic, int distanceOfTransgression, int honesty, int loyalty, int diligence) {
        super(name, surname, powerOfMagic, distanceOfTransgression);
        this.honesty = honesty;
        this.loyalty = loyalty;
        this.diligence = diligence;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    @Override
    public String toString() {
        return super.toString() +
                "; честность - " + getHonesty() +
                "; верность - " + getLoyalty() +
                "; трудолюбие - " + getDiligence();
    }
    public void whosBetterHufflepuff (HufflepuffStudents student) {
        if (this.honesty +
        this.loyalty +
        this.diligence >
                student.honesty +
                        student.loyalty +
                        student.diligence) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + student.getName());
        } else if (this.honesty +
                this.loyalty +
                this.diligence ==
                student.honesty +
                        student.loyalty +
                        student.diligence) {
            System.out.println("Эти студенты одинаково хорошие Пуффендуйцы");
        } else {
            System.out.println(student.getName() + " лучший Пуффендуец, чем " + this.getName());
        }
    }
}
