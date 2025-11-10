import java.util.Objects;

public class Human implements Comparable<Human> {
    public String firstName;
    public String lastName;
    public int age;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int compareTo(Human other) {
        int ageCmp = Integer.compare(this.age, other.age);
        if (ageCmp != 0) return ageCmp;
        int lnCmp = this.lastName.compareTo(other.lastName);
        if (lnCmp != 0) return lnCmp;
        return this.firstName.compareTo(other.firstName);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human h = (Human) o;
        return age == h.age && Objects.equals(firstName, h.firstName) && Objects.equals(lastName, h.lastName);
    }

    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    public String toString() {
        return firstName + " " + lastName + "---" + age;
    }
}