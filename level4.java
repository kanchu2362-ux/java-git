class Student {

    
    void display(String name) {
        System.out.println("Student Name: " + name);
    
    void display(String name, int rollNo) {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }

    
    void display(String name, int rollNo, String department) {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.display("Kanchana");
        System.out.println();

        s.display("Kanchana", 101);
        System.out.println();

        s.display("Kanchana", 101, "Information Technology");
    }
}