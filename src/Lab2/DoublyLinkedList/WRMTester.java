package Lab2.DoublyLinkedList;

import java.util.Scanner;

public class WRMTester {
    public static void main(String[] args) {
        System.out.println("** Welcome to Waiting Room Management System **");
        // To Do
        // Create WRM Object and call the necessary methods
        Scanner sc = new Scanner(System.in);
        WRM patient = new WRM();
        patient.registerPatient(10,"saif",22,"A+");
        patient.registerPatient(20,"s",22,"A+");
        patient.registerPatient(30,"s",22,"A+");
        patient.showAllPatient();
        patient.reverseTheLine();
        patient.showAllPatient();
//        patient.servePatient();
//        patient.showAllPatient();
//        patient.servePatient();
//        patient.showAllPatient();
//        System.out.println(patient.canDoctorGoHome());
//        patient.servePatient();
//        System.out.println(patient.canDoctorGoHome());


//        while (true) {
//            System.out.println("==choose an option==");
//            System.out.println("1. Register patient");
//            System.out.println("2. Serve patient");
//            System.out.println("3. Cancel all");
//            System.out.println("4. Can doctor go home");
//            System.out.println("5. Show all patient");
//            System.out.println("6. Reverse the waiting line");
//            System.out.println("7. exit");
//            System.out.println("===================");
//            System.out.print("enter your choice: ");
//            int n = sc.nextInt();
//
//            if (n == 1) {
//                System.out.println("Registering...");
//                System.out.print("Enter ID: ");
//                int i = sc.nextInt();
//                System.out.print("Enter name: ");
//                String name = sc.next();
//                System.out.print("Enter age: ");
//                int a = sc.nextInt();
//                System.out.print("Enter blood group: ");
//                String b = sc.next();
//                patient.registerPatient(i, name, a, b);
//            }
//            if (n == 2) {
//                patient.servePatient();
//            }
//            if (n == 3) {
//                patient.cancelAll();
//            }
//            if (n == 4) {
//                System.out.println(patient.canDoctorGoHome());
//            }
//            if (n == 5) {
//                patient.showAllPatient();
//            }
//            if (n == 7) {
//                System.out.println("Exited");
//                break;
//            }
//
//        }
    }
}
