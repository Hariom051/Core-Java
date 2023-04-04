class Default{

public static void main(String[] args) {
    A defcons= new A();
    defcons.show();
}
}
class A{
       int a ;      // instance variable
       String b;    // instance variable
       A(){               // default constructor(it does not have any parameter that's why it is called default constructor)
        a=100; 
        b="Hariom Arya";

       }
       void show(){
        System.out.println(a+" "+b);
       }
}