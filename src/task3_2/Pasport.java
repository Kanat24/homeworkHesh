package task3_2;

import java.time.LocalDate;
import java.util.Objects;

public class Pasport {
    private final int number;
    private final String lastName;
    private final String name;
    private final String middleName;
    private final LocalDate localDate;

    public Pasport(int number, String lastName, String name, String middleName, LocalDate localDate) {
        if (number==0){
            throw new IllegalArgumentException ("неправильный ввод");
        } else {
        this.number = number;
        }
        if (lastName==null && lastName.isBlank()){
            throw new IllegalArgumentException ("неправильный ввод");
        }
        else {
        this.lastName = lastName;
        }
        if (name==null&& name.isEmpty() && name.isBlank()){
            throw new IllegalArgumentException ("неправильный ввод");
        }else {
        this.name = name;
        }
        if (middleName==null&& middleName.isEmpty() && middleName.isBlank()){
            throw new IllegalArgumentException ("неправильный ввод");
        }else {
            this.middleName = middleName;
        }
        this.localDate = localDate;
    }

    public int getNumber() {
        return number;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasport pasport = (Pasport) o;
        return number == pasport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Pasport{" +
                "number=" + number +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
