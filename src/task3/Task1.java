package task3;

import java.util.Arrays;
import java.util.Objects;

public class Task1 {
    private int digit1;
    private  int digit2;

    public Task1(int digit1, int digit2) {
        this.digit1 = digit1;
        this.digit2 = digit2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task1 task1 = (Task1) o;
        return (digit1 == task1.digit1 && digit2 == task1.digit2)
                ||(digit1 == task1.digit2 && digit2 == task1.digit1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(digit1 *digit2, digit1+ digit2);
    }

    @Override
    public String toString() {
        return String.format ("%s * %s =%n", digit1, digit2 ) ;

    }
}
