import java.security.spec.RSAOtherPrimeInfo;
import java.util.PriorityQueue;

public class PriorityQueueRunner {
    public static void main(String[] args) {
        Person person1 = new Person("Sam", "Smith");
        Person person2 = new Person("Charlie", "Black");
        Person person3 = new Person("Betty", "Brown");
        Person person4 = new Person("Jessica", "Stewart");
        Person person5 = new Person("John", "Friday");
        Person person6 = new Person("Frank", "Foley");

        PriorityQueue<Person> nameList = new PriorityQueue<Person>();

        nameList.add(person1);
        nameList.add(person2);
        nameList.add(person3);
        nameList.add(person4);
        nameList.add(person5);
        nameList.add(person6);

        for (Person person : nameList) {
            System.out.println(person);
        }

        System.out.println("");
        System.out.println("Polling: ");
        while (!nameList.isEmpty()){
            System.out.println(nameList.poll());
        }
    }
}
