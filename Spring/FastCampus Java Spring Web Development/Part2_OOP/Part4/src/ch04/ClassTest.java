package ch04;

import java.lang.reflect.Constructor;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class personClass = Class.forName("ch04.Person");

        Person person = (Person)personClass.newInstance();
        person.setName("hello");
        System.out.println(person.toString());


        Class personClass2 = person.getClass();
        Person person1 = (Person)personClass2.newInstance();
        System.out.println(person1.toString());

        Class[] paramterTypes = {String.class, int.class};
        Constructor cons = personClass2.getConstructor(paramterTypes);

        Object[] initargs = {"Kim"};
        Person kim = (Person)cons.newInstance(initargs);
        System.out.println(kim);

    }

}
