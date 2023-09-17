public class RavenclawStudents extends HogvartsStudents{
    int intelligence;
    int wisdom;
    int wit;
    int creativity;

    public RavenclawStudents(String name, String surname, int powerOfMagic, int distanceOfTransgression, int intelligence, int wisdom, int wit, int creativity) {
        super(name, surname, powerOfMagic, distanceOfTransgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
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
    @Override
    public String toString() {
        return super.toString() +
                "; ум - " + getIntelligence() +
                "; мудрость - " + getWisdom() +
                "; остроумие - " + getWit() +
                "; творческий потенциал - " + getCreativity();

    }
    public void whosBetterRavenclaw (RavenclawStudents student) {
        if (this.intelligence +
                this.wisdom +
                this.wit +
                this.creativity >
                student.intelligence +
                        student.wisdom +
                        student.wit +
                        student.creativity) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + student.getName());
        } else if (this.intelligence +
                this.wisdom +
                this.wit +
                this.creativity ==
                student.intelligence +
                        student.wisdom +
                        student.wit +
                        student.creativity) {
            System.out.println("Эти студенты одинаково хорошие Когтевранцы");
        } else {
            System.out.println(student.getName() + " лучший Когтевранец, чем " + this.getName());
        }
    }

}
