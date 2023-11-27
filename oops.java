/**
 * oops
 */
class Student{                                          //Class
    String name;
    int age;
    int roll_no;
    int percentage;

    public void display(){                             //Method
        System.out.println("name age roll %");
    }

    public void printinfo(){                           //Method
        System.out.print(this.name+" ");
        System.out.print(this.age+"   ");
        System.out.print(this.roll_no+"  ");
        System.out.println(this.percentage);
    }

    Student(String n,int a, int roll, int percent){    //Constructor
        this.name = n;
        this.age = a;
        this.roll_no = roll;
        this.percentage = percent;
    }


}

public class oops {
    public static void main(String[] args) {
        Student s1 = new Student("Aman",23,28,95);      //An object is created
        Student s2 = new Student("Maya",32,45,56);
        Student s3 = new Student("Sita",42,56,98);
        // s1.name = "Aman";
        // s1.age = 24;
        // s1.roll_no = 31;
        // s1.percentage = 55;
        
        s1.display();
        s1.printinfo();
        s2.printinfo();
        s3.printinfo();
        
    }
    
}