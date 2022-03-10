import java.util.Scanner;
import java.util.*;

public class m {
      public static Scanner scn = new Scanner(System.in);
      public static String Place;

      public static void input() {
            int n = scn.nextInt();
            int[] arr = new int[3];
            for (int i = 0; i < n; i++) {
                  System.out.println("Patient : ");
                  arr[i] = scn.nextInt();
                  System.out.println("Name : ");
                  String Name = scn.next();
                  System.out.println("Place : ");
                  String Place = scn.next();
                  System.out.println("Age : ");
                  int Age = scn.nextInt();
            }
      }

      public static void output(String Place) {
            int Local_patients = 0;
            int Outstation_patients = 0;
            String str1 = "Bangalore";
            if (Place.equals(str1))
                  Local_patients++;
            else
                  Outstation_patients++;
            System.out.println("Local Patients: " + Local_patients);
            System.out.println("Outstation Patients: " + Outstation_patients);
      }

      public static void main(String[] args) {
            input();

      }
}
