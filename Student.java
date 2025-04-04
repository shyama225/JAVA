public class Student {
    String name;
    int mark;
    int roll;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "anu";
        s1.roll = 23;
        s1.mark = 90;

        Student s2 = new Student();
        s2.name = "arun";
        s2.roll = 34; 
        s2.mark = 80;

        Student[] students = new Student[2];
        students[0] = s1;
        students[1] = s2; 

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].name + ":" + students[i].mark);
            } else {
                System.out.println("No student at index " + i);
            }
        }
    }
}

