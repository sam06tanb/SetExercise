import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> GroupA = new HashSet<>();
        Set<Integer> GroupB = new HashSet<>();
        Set<Integer> GroupC = new HashSet<>();

        System.out.print("How many students for course A?");
        int numberA = sc.nextInt();
        for ( int i=0; i<numberA; i++ ) {
            int number = sc.nextInt();
            GroupA.add(number);
        }
        System.out.print("How many students for course B?");
        int numberB = sc.nextInt();
        for ( int i=0; i<numberB; i++) {
            int number = sc.nextInt();
            GroupB.add(number);
        }
        System.out.print("How many students for course C?");
        int numberC = sc.nextInt();
        for ( int i=0; i<numberC; i++) {
            int number = sc.nextInt();
            GroupC.add(number);
        }

        Set<Integer> total = new HashSet<>(GroupA);
        total.addAll(GroupB);
        total.addAll(GroupC);

        System.out.println("Total students: " + total.size());

        sc.close();


    }
    }
