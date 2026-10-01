public class student {
    String name;
    int age;
    int id;
    double marks;

    student(String name, int age, int id, double marks){
        this.name = name;
        this.age = age;
        this.id = id;
        this.marks = marks;
    }
    void displayStudent(){
    System.out.println("Name: "+name);
    System.out.println("Age:"+age);
    System.out.println("ID:"+id);
    System.out.println("Marks:"+marks);
}
}