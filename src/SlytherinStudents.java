public class SlytherinStudents extends HogvartsStudents{
    int cunning;
    int determination;
    int ambition;
    int resourcefulness;
    int lustForPower;

    public SlytherinStudents(String name, String surname, int powerOfMagic, int distanceOfTransgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, powerOfMagic, distanceOfTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
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

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    @Override
    public String toString() {
        return super.toString() +
                "; хитрость - " + getCunning() +
                "; решительсность - " + getDetermination() +
                "; амбициозность - " + getAmbition() +
                "; находчивость - " + getResourcefulness() +
                "; жажда власти - " + getLustForPower();

    }
    public void whosBetterSlytherin (SlytherinStudents student) {
        if (this.cunning +
                this.determination +
                this.ambition +
                this.resourcefulness +
                this.lustForPower >
                student.lustForPower +
                        student.cunning +
                        student.determination +
                        student.ambition +
                        student.resourcefulness) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + student.getName());
        } else if (this.cunning +
                this.determination +
                this.ambition +
                this.resourcefulness +
                this.lustForPower ==
                student.lustForPower +
                        student.cunning +
                        student.determination +
                        student.ambition +
                        student.resourcefulness) {
            System.out.println("Эти студенты одинаково хорошие Слизеринцы");
        } else {
            System.out.println(student.getName() + " лучший Слизеринец, чем " + this.getName());
        }
    }
}
