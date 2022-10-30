package task3_2;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class PasportSet {
    static final Set<Pasport> pasports = new HashSet<>();
   public static void addPasport(Pasport pasport){
        pasports.add(pasport);
    }
    public static Pasport findByNumber(int number){
        for (Pasport pasport : pasports) {
            if (pasport.getNumber()==number){
                return pasport;
            }
        }
        return null;

    }
    public static void main(String[] args) {
        Pasport pasport1 = new Pasport(121212,"Ivanov", "Ivan", "Ivanovich", LocalDate.of(1992, 8,24));
        Pasport pasport2 = new Pasport(121213,"Petrov", "Petr", "Petrovich", LocalDate.of(1990, 7,30));
    addPasport(pasport1);
    addPasport(pasport2);
        System.out.println(pasports);

        System.out.println(findByNumber(12122));
    }



}
