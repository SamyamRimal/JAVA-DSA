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

String getGrades(){
    if(marks>=90 && marks<=100){
        return "A+";
    }
    else if(marks>=80){
        return "A";
    }
    else if(marks>=70){
        return "B+";
    }
    else if(marks>=60){
        return "B";
    }
    else if(marks>=50){
        return "C+";
    }
    else if(marks>=0 && marks<50){
        return "Fail";
    }
    else{
        return "Enter a valid number";
    }
}
}