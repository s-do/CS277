public class Person implements Measurable, Comparable {
    private int age;
    private String firstName;
    private String lastName;

    public Person() {
        firstName = "Jane";
        lastName = "Doe";
        age = 30;
    }

    public Person(String fName, String lName, int userAge){
        firstName = fName;
        lastName = lName;
        age = userAge;
    }

    @Override
    public double getMeasure() {
        return age;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return this.firstName.compareTo(p.firstName);
    }

    public String toString(){
        return firstName + " " + lastName;
    }
}
