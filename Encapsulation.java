
package encapsulation;


public class Encapsulation {

    
    public static void main(String[] args) {
       
        A a1 = new A();
        B b1 = new B();
        A a2 = b1;
        // B b2 = a1; compile time error 
       B b2 = (B)a1;
        A a3 = new B();
        a1.m1();
        b1.m3();
        a2.m3();
        a3.m1();
        a3.m3();
        
        A a4 = create();
        
    }
 
}
