package CyclesFactory;
/*Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle.
 * Create factories for each type of Cycle, and code that uses these factories.
 */
interface Cycle{
    void ride();
}
interface CycleFactory{
    Cycle getCycle();
}

class Unicycle implements Cycle{
    public void ride(){
        System.out.println("Riding Unicycle");
    }
}
class UnicycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Unicycle();
    }
}

class Bicycle implements Cycle{
    public void ride(){
        System.out.println("Riding Bicycle");
    }
}
class BicycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Bicycle();
    }
}

class Tricycle implements Cycle{
    public void ride(){
        System.out.println("Riding Tricycle");
    }
}
class TricycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Tricycle();
    }
}

public class CyclesFactory {
    public static void ride(CycleFactory type){
        Cycle c = type.getCycle();
        c.ride();
    }
    public static void main(String[] args) {
        ride(new UnicycleFactory());
        ride(new BicycleFactory());
        ride(new TricycleFactory());
    }
}
