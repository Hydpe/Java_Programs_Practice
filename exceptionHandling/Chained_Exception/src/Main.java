package exceptionHandling.Chained_Exception.src;

public class Main {
    static void m4()
    {
        int b=10/0;
        throw new ArithmeticException("exception occuyred");
    }
    static void m3()
    {
        m4();
    }
    static void  m2()
    {
        m3();
    }
    static void m1()
    {
        try {
            m2();
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


    }
    public static void main(String[] args) {
          try
          {
              m2();
              NumberFormatException exception = new NumberFormatException("Primary Exception");
              exception.initCause(new NullPointerException("Secondary Exception Root Cause exception"));
              throw exception;

          }
          catch (NumberFormatException e)
          {
              System.out.println(e.getMessage());
             // System.out.println(e.getLocalizedMessage());
              System.out.println(e.getCause());
          }
          try {
              int arr[]=new int[5];
              arr[0]=1;
              arr[1]=2;
              arr[2]=3;
              arr[3]=4;
              arr[4]=5;
              int divisor=0;
              for(int i=0;i<5;i++)
              {
                   arr[i]=arr[i]/divisor;

                   System.out.println(arr[i]);
              }
          }
          catch (ArithmeticException e)
          {
              e.printStackTrace();
              throw new ArithmeticException("Division by zero");
              //e.printStackTrace();
          }
    }
}