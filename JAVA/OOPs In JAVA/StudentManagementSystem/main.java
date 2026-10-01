public class main{
    public static void main(String args[]){
        student student1 = new student("Samyam", 21, 101, 85);
        student student2 = new student("Alex", 21, 102, 84);
        student student3 = new student("Ram", 22, 102, 84);


        student1.displayStudent();
        student2.displayStudent();
        student3.displayStudent();
        
        System.out.println(student1.getGrades());
    }
}
