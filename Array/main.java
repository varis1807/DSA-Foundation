import java.util.Scanner;


public class main {
      public static Scanner scn = new Scanner(System.in);

      public static void input() {
            System.out.print("Number of Patient : ");
            int n = scn.nextInt();
            int[] arr = new int[3];
            int Local_patients = 0;
                  int Outstation_patients = 0;
            for (int i = 0; i < n; i++) {
                  System.out.print("Patient : ");
                  arr[i] = scn.nextInt();
                  System.out.println();
                  System.out.print("Name : ");
                  String Name = scn.next();
                  System.out.println();
                  System.out.print("Place : ");
                  String Place = scn.next();
                  System.out.println();
                  System.out.print("Age : ");
                  int Age = scn.nextInt();
                  System.out.println("---------");
                  String str1 = "Bangalore";
                  if (Place.equals(str1))
                        Local_patients++;
                  else
                        Outstation_patients++;
            }
            System.out.println("Local Patients: " + Local_patients);
            System.out.println("Outstation Patients: " + Outstation_patients);
      }

      public static void main(String[] args) {
            input();
      }
}
