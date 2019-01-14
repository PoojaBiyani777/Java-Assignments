package OuterInner;
/*Create a class with an inner class that has a non-default constructor (one that takes arguments).
 * Create a second class with an inner class that inherits from the first inner class.
 */
class Outer{
    Outer(){
        System.out.println("Outer");
    }
    class Inner{
        int n;
        Inner(int n){
            this.n=n;
            System.out.println("Outer.Inner " + n);
        }
    }
}

class Outer2 {
    class Inner2 extends Outer.Inner{
        Inner2(Outer x){
            x.super(0);
            System.out.println("Inner2 ");
        }
        Inner2(Outer x, int n){
            x.super(n);
            System.out.println("Inner 2");
        }

    }

    // public Inner2 inner() { return new Inner2(); }
    // public Inner2 inner(int n) { return new Inner2(n); }
}
public class OuterInner{
    public static void main(String[] args) {
        Outer o1 = new Outer();
        // Question5.Inner2 x = out.inner();
        // Question5.Inner2 y = out.inner(5);
        // Inner2 n = out.inner(5);
        Outer2.Inner2 x= new Outer2().new Inner2(o1);
        Outer2.Inner2 y= new Outer2().new Inner2(o1,7);
    }
}
