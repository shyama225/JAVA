import java.util.Scanner;

class Employee {
    int Empid;
    String Name;
    double Salary;
    String Address;

    Employee(int id, String name, double salary, String address) {
        Empid = id;
        Name = name;
        Salary = salary;
        Address = address;
    }
}

class Teacher extends Employee {
    String Department;
    String Subject;

    Teacher(int id, String name, double salary, String address, String dept, String subj) {
        // Manually assigning values
        Empid = id;
        Name = name;
        Salary = salary;
        Address = address;
        Department = dept;
        Subject = subj;
    }

    void display() {
        System.out.println("ID: " + Empid + ", Name: " + Name + ", Salary: " + Salary +
                ", Address: " + Address + ", Dept: " + Department + ", Subject: " + Subject);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1));
            System.out.print("Empid: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("Department: ");
            String dept = sc.nextLine();
            System.out.print("Subject: ");
            String subject = sc.nextLine();

            teachers[i] = new Teacher(id, name, salary, address, dept, subject);
        }

        System.out.println("\n--- Teacher Details ---");
        for (Teacher t : teachers) {
            t.display();
        }
    }
}

