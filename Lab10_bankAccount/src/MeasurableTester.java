//import java.util.ArrayList;
import org.omg.CORBA.CODESET_INCOMPATIBLE;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Comparable;
import java.util.Collections;

/**
 This program demonstrates the measurable BankAccount and Country classes.
 */
public class MeasurableTester
{
    public static void main(String[] args)
    {
        Measurable[] accounts = new Measurable[3];
        accounts[0] = new BankAccount(0);
        accounts[1] = new BankAccount(10000);
        accounts[2] = new BankAccount(2000);


        double averageBalance = Data.average(accounts);
        System.out.println("Average balance: " + averageBalance);
        System.out.println("Expected: 4000");

        Measurable[] countries = new Measurable[3];
        countries[0] = new Country("Uruguay", 176220);
        countries[1] = new Country("Thailand", 513120);
        countries[2] = new Country("Belgium", 30510);

        double averageArea = Data.average(countries);
        System.out.println("Average area: " + averageArea);
        System.out.println("Expected: 239950");

        ArrayList<Person> personList = new ArrayList<Person>();
        Person A = new Person();
        Person B = new Person("Adam", "Smith", 25);
        Person C = new Person("Bob", "Snow", 35);
        Person D = new Person("Jackie", "Chan", 45);
        Person E = new Person("Stan", "Lee", 57);
        Person F = new Person("Oprah", "Win", 48);
        Person G = new Person("Witcher", "The", 40);

        Measurable[] personlist2 = new Measurable[] {A, B , C, D, E, F,G};
        System.out.println("array before" + personlist2);
        Arrays.sort(personlist2);
        System.out.println("array after sort" + personlist2);


        personList.add(A);
        personList.add(B);
        personList.add(C);
        personList.add(D);
        personList.add(E);
        personList.add(F);
        personList.add(G);


        System.out.println("before" + personList);
        Collections.sort(personList);
        System.out.println("after sort" + personList);

       /* System.out.println("this is the youngest person: " + Data.smallestAge(personList));*/

    }


}
