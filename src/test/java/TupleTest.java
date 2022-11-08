import org.example.Tuple;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TupleTest {
    @Test
    public void verificationForCreationByVariousParametersAndTypes() {
        Tuple tupleNone = Tuple.of();
        assertNull(tupleNone.getItem1());
        assertNull(tupleNone.getItem2());

        String line = "Qwerty";
        Tuple tupleOneParam = Tuple.of(line);
        assertEquals(line, tupleOneParam.getItem1());
        assertNull(tupleOneParam.getItem2());

        int number = 120;
        Tuple tupleTwoParam = Tuple.of(line, number);
        assertEquals(line, tupleTwoParam.getItem1());
        assertEquals(number, tupleTwoParam.getItem2());

        Person person = new Person("Bob", 50);
        Fish fish = new Fish("Korop", 10.50, 220.45);
        Tuple tuplePersonFish = Tuple.of(person, fish);
        assertEquals(person, tuplePersonFish.getItem1());
        assertEquals(fish, tuplePersonFish.getItem2());
        Person newPerson = (Person) tuplePersonFish.getItem1();
        assertEquals(person.getName(), newPerson.getName());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' + "\n";
    }
}

class Fish {
    private String name;
    private double weight;
    private double price;

    public Fish(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}' + "\n";
    }
}
