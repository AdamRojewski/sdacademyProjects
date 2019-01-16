package pl.sda.javastart.day5;

public class OOP2 {
    public static void main(String[] args) {
        equalsExample();
        referenceExample();
        staticFinal();
        TestPerson person1 = new TestPerson("Kowalski", "Janusz");
        System.out.println(person1.getIdentity());


    }

    private static void staticFinal() {
        TestPerson person1 = new TestPerson();
        TestPerson person2 = new TestPerson(); // jak zrobic by zaczynac od 1 ??? TODO
        System.out.println(person1.getIdentity());
        System.out.println(person2.getIdentity());
        System.out.println("Ludzi na swiecie jest " + TestPerson.counter);

        CalculatorUtils utils = new CalculatorUtils();
        System.out.println(utils.add(1, 2));
        System.out.println(CalculatorUtils.adding(1,2));
        person1.setFirstName("Ola");
        ExperimentalObject eo = new ExperimentalObject(1,2, person1);
        eo.setNotFinalImmutable(6);
        TestPerson personFromEo = eo.getFinalMutable();
        personFromEo.setFirstName("Anna");
    }

    private static void referenceExample() {
        String s1 = "napis";
        String s2 = "napis";
        String s3 = new String("napis");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println();

        Long firstNumber = 127L;
        Long secondNumber = 127L;
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber.equals(secondNumber));
        System.out.println();

        Long thirdNumber = 128L;
        Long fourthNumber = 128L;
        System.out.println(thirdNumber == fourthNumber);
        System.out.println(thirdNumber.equals(fourthNumber));
    }

    public static void equalsExample() {
        TestPerson person1 = new TestPerson();
        TestPerson person2 = new TestPerson();
        person1.setFirstName("Anna");
        person2.setFirstName("Anna");
        person1.setIdentity(123);
        person2.setIdentity(123);
        person1.setSurname("Nowak");
        person1.setSurname("Nowak");
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode() == person2.hashCode());
        System.out.println();

        TestPerson person3 = new TestPerson("Anna", "Nowak", 123);
        person3.setIdentity(111);
        System.out.println(person1.equals(person3));

        String a = "A"; // immutable
        String b = a + "!";

        Long aLong = new Long(123L);

    }
}
