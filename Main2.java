//1
public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }
}
//2
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "892312313", 40000, 35);
        employees[2] = new Employee("Sidorov Sidr", "Technician", "sidorov@mailbox.com", "892312314", 25000, 28);
        employees[3] = new Employee("Kuznetsov Kuzma", "Developer", "kuznetsov@mailbox.com", "892312315", 45000, 32);
        employees[4] = new Employee("Smirnov Smirn", "Analyst", "smirnov@mailbox.com", "892312316", 35000, 29);

        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println();
        }
    }
}
//3
public class Park {
    private Attraction[] attractions;
    private int count;

    public Park(int size) {
        attractions = new Attraction[size];
        count = 0;
    }

    public void addAttraction(String name, String workingHours, double cost) {
        if (count < attractions.length) {
            attractions[count++] = new Attraction(name, workingHours, cost);
        } else {
            System.out.println("Парк переполнен.");
        }
    }

    public void printAttractions() {
        for (int i = 0; i < count; i++) {
            attractions[i].printInfo();
        }
    }

    private class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Attraction: " + name);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Cost: " + cost);
        }
    }

    public static void main(String[] args) {
        Park park = new Park(3);
        park.addAttraction("Диснейленд", "10:00 - 18:00", 500.50);
        park.addAttraction("Колесо обозрения", "09:00 - 21:00", 150.50);
        park.addAttraction("Дом с приведениями", "11:00 - 20:00", 1275);

        park.printAttractions();
    }
}
