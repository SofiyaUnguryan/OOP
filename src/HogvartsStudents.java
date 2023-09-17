public abstract class HogvartsStudents {
    private final String name;
    private final String surname;
    private int powerOfMagic;
    private int distanceOfTransgression;

    public HogvartsStudents(String name, String surname, int powerOfMagic, int distanceOfTransgression) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    @Override
    public String toString() {
        return "Имя - " + getName() +
                ", Фамилия - " + getSurname() +
                "; мощность магии равна " + getPowerOfMagic() +
                "; расстояние трансгрессии равно " + getDistanceOfTransgression();
    }
    public void whosBetter (HogvartsStudents student) {
        if (this.powerOfMagic > student.powerOfMagic) {
            System.out.println("Мощность магии " + student.getName() + " меньше, чем у " + this.getName());
        } else if (this.powerOfMagic == student.powerOfMagic){
            System.out.println("Мощность магии " + student.getName() + " равна мощности магии " + this.getName());
        } else {
            System.out.println("Мощность магии " + student.getName() + " больше, чем у " + this.getName());
        }
        if (this.distanceOfTransgression > student.distanceOfTransgression) {
            System.out.println("Дальность трансгрессии " + student.getName() + " меньше, чем у " + this.getName());
        } else if (this.distanceOfTransgression == student.distanceOfTransgression){
            System.out.println("Дальность трансгрессии " + student.getName() + " равна дальности трансгрессии " + this.getName());
        } else {
            System.out.println("Дальность трансгрессии " + student.getName() + " больше, чем у " + this.getName());
        }
    }
}
