package Demo1;

// 1. Parent Class: Staff
class Staff {
    protected String employeeId;
    protected String name;
    protected String address;
    protected String contactInfo;

    public Staff(String employeeId, String name, String address, String contactInfo) {
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
    }

    // Common method to display staff details
    public void displayDetails() {
        System.out.println("--- Staff Details ---");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact Info: " + contactInfo);
    }

    // Common action that all staff might theoretically perform
    public void attendMeeting() {
        System.out.println(name + " is attending a general staff meeting.");
    }

    // Getters
    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    // ... other getters
}

// 2. Subclass: Doctor
class Doctor extends Staff {
    private String specialization;

    public Doctor(String employeeId, String name, String address, String contactInfo, String specialization) {
        super(employeeId, name, address, contactInfo); // Call parent class constructor
        this.specialization = specialization;
    }

    public void diagnose() {
        System.out.println(name + " (Doctor, " + specialization + ") is performing a diagnosis.");
    }

    // Override to add specialization details to the display
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call parent's displayDetails
        System.out.println("Specialization: " + specialization);
    }

    // Doctor-specific meeting
    @Override
    public void attendMeeting() {
        System.out.println(name + " (Doctor) is attending a medical conference.");
    }

    public String getSpecialization() { return specialization; }
}

// 2. Subclass: Nurse
class Nurse extends Staff {
    private String ward;

    public Nurse(String employeeId, String name, String address, String contactInfo, String ward) {
        super(employeeId, name, address, contactInfo);
        this.ward = ward;
    }

    public void administerMedication() {
        System.out.println(name + " (Nurse, Ward " + ward + ") is administering medication.");
    }

    // Override to add ward details to the display
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Assigned Ward: " + ward);
    }

    // Nurse-specific meeting
    @Override
    public void attendMeeting() {
        System.out.println(name + " (Nurse) is attending a ward briefing.");
    }

    public String getWard() { return ward; }
}

// 2. Subclass: Administrator
class Administrator extends Staff {
    // For simplicity, no new attributes for Administrator in this example, but could add 'department'
    public Administrator(String employeeId, String name, String address, String contactInfo) {
        super(employeeId, name, address, contactInfo);
    }

    public void manageFinances() {
        System.out.println(name + " (Administrator) is managing hospital finances.");
    }

    public void schedule() {
        System.out.println(name + " (Administrator) is handling hospital scheduling.");
    }

    // Administrator-specific meeting
    @Override
    public void attendMeeting() {
        System.out.println(name + " (Administrator) is attending a board meeting.");
    }
}

// Main class to demonstrate the inheritance structure
public class HospitalStaffInheritanceOnly {
    public static void main(String[] args) {
        System.out.println("--- Demonstrating Staff Member ---");
        Staff generalStaff = new Staff("S000", "Mr. Generic Staff", "404 No Where", "generic@hms.com");
        generalStaff.displayDetails();
        generalStaff.attendMeeting();
        System.out.println("\n");

        System.out.println("--- Demonstrating Doctor (Inheritance & Override) ---");
        Doctor doc1 = new Doctor("D001", "Dr. Anya Sharma", "101 Doctor's Lane", "anya.s@hms.com", "Pediatrics");
        doc1.displayDetails(); // Calls overridden method
        doc1.diagnose();       // Calls Doctor-specific method
        doc1.attendMeeting();  // Calls overridden method
        System.out.println("\n");

        System.out.println("--- Demonstrating Nurse (Inheritance & Override) ---");
        Nurse nurse1 = new Nurse("N002", "Nurse Ben Carter", "202 Nurse's Quarters", "ben.c@hms.com", "Emergency");
        nurse1.displayDetails();       // Calls overridden method
        nurse1.administerMedication(); // Calls Nurse-specific method
        nurse1.attendMeeting();        // Calls overridden method
        System.out.println("\n");

        System.out.println("--- Demonstrating Administrator (Inheritance & Override) ---");
        Administrator admin1 = new Administrator("A003", "Ms. Chloe Davis", "303 Admin Building", "chloe.d@hms.com");
        admin1.displayDetails(); // Calls inherited method (not overridden for additional display info)
        admin1.manageFinances(); // Calls Administrator-specific method
        admin1.schedule();       // Calls Administrator-specific method
        admin1.attendMeeting();  // Calls overridden method
        System.out.println("\n");

        // --- Extensibility Note (Conceptual) ---
        System.out.println("This structure makes it easy to add new staff types like 'Technician'.");
        System.out.println("class Technician extends Staff { /* unique attributes and methods */ }");
    }
}
