
class Patient {
    String patientName;
    int patientAge;
    String doa;
    String disease;
    Information information;
    Payment payment;

    public Patient(String patientName, int patientAge, String doa, String disease, Information information,
            Payment payment) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.doa = doa;
        this.disease = disease;
        this.information = information;
        this.payment = payment;
    }

    public void patientDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Age: " + patientAge);
        System.out.println("Date of Arrival: " + doa);
        System.out.println("Disease: " + disease);
        System.out.println("Block No: " + information.blockNo);
        System.out.println("Floor No: " + information.floorNo);
        System.out.println("Room No: " + information.roomNo);
        System.out.println("Bed No: " + information.bedNo);
        System.out.println("Admission Fees: " + payment.admFees);
        System.out.println("Registration Fees: " + payment.regFees);
        System.out.println("Balance Amount: " + payment.balAmt);
    }
}

class Information {
    int blockNo;
    int floorNo;
    int roomNo;
    int bedNo;

    public Information(int blockNo, int floorNo, int roomNo, int bedNo) {
        this.blockNo = blockNo;
        this.floorNo = floorNo;
        this.roomNo = roomNo;
        this.bedNo = bedNo;
    }
}

class Payment {
    double admFees;
    double regFees;
    double balAmt;

    public Payment(double admFees, double regFees, double balAmt) {
        this.admFees = admFees;
        this.regFees = regFees;
        this.balAmt = balAmt;
    }
}

public class Main {
    public static void main(String[] args) {

        Information information = new Information(1, 3, 101, 2);

        Payment payment = new Payment(25000, 5000, 30000);

        Patient patient = new Patient("kshitij", 21, "2002-01-15", "SARS-COVID-19", information, payment);

        patient.patientDetails();
    }
}
