/**
 * oops_2
 */

class Employe{    //This is a employee class
    String name;
    int employ_id;
    int employ_age;
    double salary;

    public void show(){                       //This is a method
        System.out.println("Employe details: ");
    }

    public void diaplay(){                    //This is also a method
        System.out.print(this.name+" ");
        System.out.print(this.employ_id+" ");
        System.out.print(this.employ_age+" ");
        System.out.print(this.salary+"\n");

    }

    //Let us create a constructor
    Employe(String name, int employ_id, int employ_age, double salary){
        this.name = name;
        this.employ_id = employ_id;
        this.employ_age = employ_age;
        this.salary = salary;
    }
    
}
public class oops_2 {

    public static void main(String[] args) {

        //Lets create a object now
        Employe e1 = new Employe("Riya",23,21,200000);
        Employe e2 = new Employe("Aman",45,43,300000);
        Employe e3 = new Employe("Priya",33,86,400000);
        Employe e4 = new Employe("Jiya",99,77,500000);


        // e1.name = "Riya";
        // e1.employ_id = 23;
        // e1.employ_age = 21;
        // e1.salary = 200000;

        e1.show();
        e1.diaplay();
        e2.diaplay();
        e3.diaplay();
        e4.diaplay();


        
    }
}


