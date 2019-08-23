public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Enum getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        return 21;
    }

    public String getInfo() {
        return "Age: " + getAge() + "\n" + " Color: " + getColor() + "\n" + " Name of Shelter: " + getShelter().getName()
                + "\n" + " Shelter Address: " + getShelter().getAddress();
    }
}
