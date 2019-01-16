package pl.sda.javastart.day6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OOP3 {
    public static void main(String[] args) {
        //Person person1 = new Person();
        //Worker worker1 = new Worker();

        Worker worker = new Worker("Adam", "Nowak", 123, 50, BigDecimal.valueOf(1300));
        Student student = new Student("Kasia", "Kowalska", 321, 20, 320, BigDecimal.valueOf(500));
        Pensioner pensioner = new Pensioner("Janusz", "Kwiatkowski", 456, 35, BigDecimal.valueOf(750));

        Person[] people = new Person[]{worker, student, pensioner};
        Object[] objects = new Object[]{worker, student, pensioner}; // tablica Person / Object zamiennie (dziedziczenie)

        List<Person> peopleList = new ArrayList<>();
        peopleList.add(worker);
        peopleList.add(student);
        peopleList.add(pensioner);

        printSomeDataLegacyMode(worker, student, pensioner);
        printDataNewMode(peopleList);

        List<NameHolder> nameHolders = new ArrayList<>();
        nameHolders.add(worker);
        nameHolders.add(student);
//      nameHolders.add(pensioner); - nie mozna, poniewaz pensioner nie ma zaimplementowanego interfejsu
        printNames(nameHolders);

    }

    private static void printNames(List<NameHolder> nameHolders) {
        for (NameHolder nameHolder : nameHolders) {
            System.out.println(nameHolder.showYourName());
        }
    }

    private static void printSomeDataLegacyMode(Worker worker, Student student, Pensioner pensioner) {
        System.out.println(worker.showIncome());
        System.out.println(student.showIncome());
        System.out.println(pensioner.showIncome());
        worker.introduceInner();
        pensioner.introduceInner();
        student.introduceInner();
    }

    private static void printDataNewMode(List<Person> peopleInfo) {
        for (Person person : peopleInfo) {
            System.out.println(person.showIncome());
            if (person instanceof Worker) {
                ((Worker) person).introduceInner();
            } else if (person instanceof Student) {
                ((Student) person).introduceInner();
            } else {
                ((Pensioner) person).introduceInner();
            }


        }
    }
}
