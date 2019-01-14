public class ExceptionClass {

    public void exceptionsMethod()
    {
        int a=10,b=0;
        String str=null;
        int array[]=new int[4];

        try {
            int result = a / b; //throw new ArithmeticException();
            System.out.println("String is : " + str); //throw new NullPointerException();
            int value = array[4];// throw new ArrayIndexOutOfBoundsException();

        }
        catch(Exception e){
            System.out.println("Exceptions occured!!! "+ e);
        }
        finally{
            System.out.println("This is finally block!");
        }
    }

    public static void main(String args[]){
        ExceptionClass object=new ExceptionClass();
        object.exceptionsMethod();
    }

}
