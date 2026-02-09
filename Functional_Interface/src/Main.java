import java.util.Scanner;
@FunctionalInterface
interface intTask {
    public void run(int value);
}
@FunctionalInterface
interface  intReturnTask{
    public int run(int value);
}
@FunctionalInterface
interface intAddTask{
    public int run(int value1, int value2,int value3);
}
public class Main {
    public static void main(String[] args) {
        InterfaceImplementation.execute(20, (intTask) n->System.out.println(n));
       int value= InterfaceImplementation.execute(10,(intReturnTask) n-> {int N=n; for(int i=1; i<=10; i++) System.out.println(N); return N+n;});
       value=InterfaceImplementation.execute(10,n->{return n;});
       System.out.println(value);
       int value2=InterfaceImplementation.execute(23,n-> {int k[]=new int[n]; for(int i=0;i<n;i++) k[i]=i+1; return k[2];});
       System.out.println(value2+"value 2");
       int value3=InterfaceImplementation.execute(0,1,21,(x,y,z)->{int fnext=0; while(fnext<=z){System.out.println(fnext); x=y; y=fnext; fnext=x+y;} return 0;});
       System.out.println(value3+"value 3");
       //int value4=InterfaceImplementation.execute(12,13,14,(x,y,z)->)
      InterfaceImplementation.execute(2,(intTask) n->{System.out.println(n);});
      InterfaceImplementation.execute(10,(intTask) n->{int found=n;int j=6;
          while(found>0)
          {
              int sum=0;
              for(int i=1;i<j;i++){
                  if(j%i==0)
                  { sum=sum+i; }
              } if(sum==j)
              {
                  System.out.println("found "+sum);
                  found--;
              }
              j++;
          }});
       InterfaceImplementation.execute(6, (intTask) n->{
           Scanner sc =new Scanner(System.in);
            System.out.println("Enter The string of more than 10 characters");
             char[] charArray = sc.nextLine().toCharArray();
             for( int i=0; i<charArray.length; i++){
                 if(i<n)
                 {
                     System.out.print(charArray[i]);
                 }
             }
             int N=n;
             int sum=0;
                 for( int i=1; i<N; i++){
                     if(N%i==0)
                     {
                         sum+=i;
                     }
                 }
                 if(sum==N)
                 {
                     System.out.println("\n"+sum+"It is a perfect Number ");
                 }
        });
        System.out.println();

    }
}
