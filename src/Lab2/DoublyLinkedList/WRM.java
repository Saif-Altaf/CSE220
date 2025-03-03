package Lab2.DoublyLinkedList;

public class WRM {
    Patient dh;

    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
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
        if(canDoctorGoHome()){
            System.out.println("No patient to be served");
            return;
        }
        Patient temp=dh.next;
        for (int i = 0; i < 1; i++) {
            temp=temp.next;
            temp.prev=dh;
            dh.next=temp;
        }
        System.out.println("Served patient");
    }

    public void showAllPatient() {
        if(canDoctorGoHome()){
            System.out.println("No patient in the WRM");
            return;
        }
        Patient temp = dh.next;
        System.out.println("Patient id(s): ");
        while (temp.id != null) {
            System.out.print(temp.id + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public boolean canDoctorGoHome() {
        if(dh.next==dh){
            return true;
        }
        return false;
    }

    public void cancelAll() {
        dh.next=dh;
        dh.prev=dh;
        System.out.println("Waiting room cleared");
    }


    public void reverseTheLine() {
        if (dh.next == dh || dh.next.next == dh) {
            System.out.println("Not enough patients to reverse.");
            return;
        }

        Patient current = dh;
        Patient temp = null;

        while (true) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;

            if (current == dh){
                break;
            }
        }
        dh.next = temp.prev;
        System.out.println("Patient order reversed successfully.");
    }

}