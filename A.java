
package encapsulation;


public class A {
    
     public void m1(){
         
        System.out.println("m1 hello from A ");
    
    }
     
     public void m3(){
     System.out.println("m3 hello from A ");
     
     }
     
      public A create(){
          A a4 = new B();
          return a4;
      
      }
    
}
