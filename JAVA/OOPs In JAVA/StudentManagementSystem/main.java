public class main{
    public static void main(String args[]){
        student student1 = new student("Samyam", 21, 101, 85);
        student student2 = new student("Alex", 21, 102, 84);
        student student3 = new student("Ram", 22, 102, 84);

        // System.out.println("Student1");
        // System.out.println("Name:"+student1.name);
        // System.out.println("Id:"+student1.id);
        // System.out.println("Age:"+student1.age);
        // System.out.println("Marks:"+student1.marks);

        // System.out.println("Student2");
        // System.out.println("Name:"+student2.name);
        // System.out.println("Id:"+student2.id);
        // System.out.println("Age:"+student2.age);
        // System.out.println("Marks:"+student2.marks);

        // System.out.println("Student3");
        // System.out.println("Name:"+student3.name);
        // System.out.println("Id:"+student3.id);
        // System.out.println("Age:"+student3.age);
        // System.out.println("Marks:"+student3.marks);

        //instead of printing all the details one by one we use constructor
        student1.displayStudent();
        student2.displayStudent();
        student3.displayStudent();
        
    }
}
