public class Parametrized {
    public static void main(String[] args) {
        B in = new B(100);
        // in.show();
    }
}

class B{
    B(int a){
        System.out.println("Hello"+" "+a);
    }
    
}