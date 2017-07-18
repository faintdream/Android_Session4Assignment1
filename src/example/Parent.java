/*
 * Program to demonstrate inhertiance , method overriding
 * and Access Specifier
 */
package example;                                                                //package example created                                        

public class Parent {                                                           // Parent class created

    private void method1(){                                                     // since this is a private method - method1
                                                                                // it can only be called by object of Parent class
                                                                                // the classes inheriting Parent won't have access to it
        System.out.println("Parent's method1()");
    }
    
    public void method2(){                                                      // this is a public method declaration - method2
                                                                                // any class that inherits Parent, can call it
        System.out.println("Parent's method2()");                   
        method1();
    }
    
}   

class Child extends Parent{                                                     //class Child created and inherits Parent
    
    public void method1(){                                                      // public method - method1 declared
        System.out.println("Child's method1()");
    }
    
    public static void main(String[] args) {                                    // main section
        Parent p =new Child();                                                  //object P of type Class Parent created
                                                                                // Object P also initializes default constructor of Child class
                                                                                // this simply means, hypothetically if we have mentioned
                                                                                // any initialization code, that would have executed, however in this case 
                                                                                // nothing is being done, the implicit default constructor is being called
        
        p.method2();                                                            //since p is method of class Parent, it calls Parent class's method2
        
        
    }
    
}