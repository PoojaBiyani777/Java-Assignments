package Interfaces;
interface Interface1{
    void method1();
    void method2();
}
interface Interface2{
    void method3();
    void method4();
}
interface Interface3{
    void method5();
    void method6();
}
interface Interface4 extends Interface1, Interface2, Interface3{
    void method7();
}
class SuperClass{
    void method8(){
        System.out.println("SuperClass.method8()");
    }
}
public class Interfaces extends SuperClass implements Interface4{
    public void method1(){
        System.out.println("Interface1.method1()");
    }
    public void method2(){
        System.out.println("Interface1.method2()");
    }
    public void method3(){
        System.out.println("Interface2.method3()");
    }
    public void method4(){
        System.out.println("Interface2.method4()");
    }
    public void method5(){
        System.out.println("Interface3.method5()");
    }
    public void method6(){
        System.out.println("Interface3.method6()");
    }
    public void method7(){
        System.out.println("Interface4.method7()");
    }

    public static void interface1(Interface1 a){
        a.method2();
    }
    public static void interface2(Interface2 a){
        a.method4();
    }
    public static void interface3(Interface3 a){
        a.method5();
    }
    public static void interface4(Interface4 a){
        a.method4();
        a.method7();
    }
    public static void main(String[] args) {
        Interfaces obj= new Interfaces();
        interface1(obj);
        interface2(obj);
        interface3(obj);
        interface4(obj);

    }
}
