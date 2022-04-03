public class Single_Inheritance extends one{
    String SecondWord = "World";
    public static void main(String[] args) {
        Single_Inheritance t = new Single_Inheritance();
        System.out.println(t.FirstWord + t.SecondWord);
    }
}

class one
{
 String FirstWord = "Hello";
}
