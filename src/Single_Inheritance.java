import java.util.Scanner;

public class Single_Inheritance {

    public static void main(String[] args) {
        studentdetail sd = new studentdetail(); // class two
        sd.getdata(); // getting the input from student class
        sd.putdata(); // printing the output from student detail class
    }
}

// class one
class student {
    Scanner sc = new Scanner(System.in);
    int rollno;
    String name;

    void getdata()
    {
        System.out.println("Enter Roll Number : ");
        rollno = sc.nextInt();

        System.out.println("Enter Name : ");
        name = sc.next();
    }
}

// class two extends with class one
class studentdetail extends student{
    void putdata()
    {        
        System.out.println("Roll Number : " +rollno);
        System.out.println("Name : " +name);
    }
}
