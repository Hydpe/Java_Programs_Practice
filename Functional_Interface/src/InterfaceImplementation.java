public class InterfaceImplementation{
       public static void execute(int value, intTask action)
       {
           action.run(value);
       }
       public  static  int execute(int value, intReturnTask action)
       {
           return action.run(value);
       }
       public static int execute(int val1,int val2,int val3, intAddTask action)
       {
           return action.run(val1,val2,val3);
       }
}
