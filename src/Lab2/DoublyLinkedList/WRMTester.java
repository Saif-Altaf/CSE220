package Lab2.DoublyLinkedList;

import java.util.Scanner;

public class WRMTester {
    public static void main(String[] args) {
        System.out.println("** Welcome to Waiting Room Management System **");
        Scanner sc = new Scanner(System.in);
        WRM patient = new WRM();

        while (true) {
            System.out.println("==choose an option==");
            System.out.println("1. Register patient");
            System.out.println("2. Serve patient");
            System.out.println("3. Cancel all");
            System.out.println("4. Can doctor go home");
            System.out.println("5. Show all patient");
            System.out.println("6. Reverse the waiting line");
            System.out.println("7. exit");
            System.out.println("===================");
            System.out.print("enter your choice: ");
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println("Registering...");
                System.out.print("Enter ID: ");
                int i = sc.nextInt();
                System.out.print("Enter name: ");
                String name = sc.next();
                System.out.print("Enter age: ");
                int a = sc.nextInt();
                System.out.print("Enter blood group: ");
                String b = sc.next();
                patient.registerPatient(i, name, a, b);
            }
            else if (n == 2) {
                patient.servePatient();
            }
            else if (n == 3) {
                patient.cancelAll();
            }
            else if (n == 4) {
                System.out.println(patient.canDoctorGoHome());
            }
            else if (n == 5) {
                patient.showAllPatient();
            }
            else if (n==6) {
                patient.reverseTheLine();
            } else if (n == 7) {
                System.out.println("Exited");
                break;
            }else{
                System.out.println("no such option");
            }
        }
    }
}
