package Lab2.DoublyLinkedList;

public class WRM {
    Patient dh;

    //The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        // To Do
        Patient p = new Patient(id, name, age, bloodgroup, null, null);
        if (dh.next == dh) {
            dh.next = p;
            dh.prev = p;
            p.next = dh;
            p.prev = dh;
            System.out.println("Registered Successfully");
        } else {
            Patient temp = dh.next;
            while (temp.next.id != null) {
                temp = temp.next;
            }
            temp.next = p;
            dh.prev = temp;
            p.next = dh;
            p.prev = temp;
            System.out.println("Registered Successfully");
        }
    }

    public void servePatient() {
        // To do
        Patient temp=dh.next;
        for (int i = 0; i < 1; i++) {
            temp=temp.next;
            temp.prev=dh;
            dh.next=temp;
        }
        System.out.println("Served patient");
    }

    public void showAllPatient() {
        // To Do
        Patient temp = dh.next;
        System.out.println("Patient id(s): ");
        while (temp.id != null) {
            System.out.print(temp.id + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public boolean canDoctorGoHome() {
        // To Do
        if(dh.next==dh){
            return true;
        }
        return false; // Delete this line once you're ready
    }

    public void cancelAll() {
        // To Do
        dh.next=dh;
        dh.prev=dh;
        System.out.println("Waiting room cleared");
    }


    public void reverseTheLine() {
        // To Do
        Patient tempNext= dh.next;
        dh.next= dh.prev;
        dh.prev=tempNext;
    }

}