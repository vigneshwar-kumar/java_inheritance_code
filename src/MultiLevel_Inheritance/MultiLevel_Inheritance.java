package MultiLevel_Inheritance;

import java.util.Scanner;

public class MultiLevel_Inheritance {
    public static void main(String[] args) {
    result r = new result();
        r.getData();
        r.getMark();
        r.getTotal();
        r.getAverage();
        r.putAverage();
    }
}

class student
{
    Scanner sc = new Scanner(System.in);
    int rollno;
    String name;

    void getData()
    {
        System.out.println("Enter Roll Number : ");
        rollno = sc.nextInt();

        System.out.println("Enter Name : ");
        name = sc.next();
    }
}

class mark extends student
{
    int sub1,sub2,sub3,total = 0;

    void getMark()
    {
        System.out.println("Enter Sub1 Mark : ");
        sub1 = sc.nextInt();
        System.out.println("Enter Sub2 Mark : ");
        sub2 = sc.nextInt();
        System.out.println("Enter Sub3 Mark : ");
        sub3 = sc.nextInt();
    }

    void getTotal()
    {
        total = sub1+sub2+sub3;
    }
}

class result extends mark
{
    int avg;

    void getAverage()
    {
        avg = (total / 3);
    }

    void putAverage()
    {
        System.out.println("Student " +name+" Scored "+total+" and the average "+avg+"%");
    }

}