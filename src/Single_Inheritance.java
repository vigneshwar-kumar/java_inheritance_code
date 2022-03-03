public class Single_Inheritance {
    public static void main(String[] args) {
        two t = new two();
        t.print_hello();
        t.print_world();
    }
}

class one{
    public void print_hello(){
        System.out.print("Hello");
    }
}
class two extends one{
    public void print_world(){
        System.out.println(" World");
    }
}
