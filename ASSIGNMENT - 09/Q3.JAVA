class Person {
    String firstName, lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    private String employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Ayush", "Goud", "CSE095", "Senior Developer");
        System.out.println("Employee ID : " + emp.getEmployeeId());
        System.out.println("First Name : " + emp.getFirstName());
        System.out.println("Last Name : " + emp.getLastName());
    }
}