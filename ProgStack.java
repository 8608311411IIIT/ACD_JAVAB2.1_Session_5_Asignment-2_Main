/*A simple program in which we apply the property of stack i.e. LIFO(last in first out) by array implementation.here we define two class FixedStack 
 and VariableStack .we define size of array in both class by constructor...but if number of elements to pop exceeds then arraysize then FixedStack  
 class, push method gives warning stack overflow whereas VariableStack class resizes its array size.*/
import java.util.*;

interface Stack{
   
      void push(int i);
      void pop();
}

class FixedStack implements Stack{//FixedStack class implements interface Stack
       int []a; 
       int i,top=-1;
       public FixedStack(int len){//constructor which defines size of Stack array
            a = new int[len];
       }
          public void push(int i){//overrides push method of interface Stack
               if(top>=(a.length-1))
                      System.out.println("Fixed stack:Stack overflow");
                   else
                       a[++top]=i;
          }
      
             public void pop(){//overrides pop method of interface Stack
                  if(top==-1)
                        System.out.println("Fixed stack:Stack is empty");
                 
                      else{
                          top--;
                          System.out.println("Fixed stack:pop successful");
                      }
                  
              }
        
                 public void show(){//function which displays elements in stack
                     if(top==-1)
                        System.out.println("Fixed stack:Stack is empty");
                     
                        else{
                            System.out.print("Fixed stack: ");
                            for(i=0;i<=top;i++)
                               System.out.print(" "+a[i]);
                            System.out.println(" ");
                           
                        }
                 }
     
}

class VariableStack implements Stack{//VariableStack class implements interface Stack
       int []b; 
       int i,top=-1;
       public VariableStack(int len){//constructor which defines size of Stack array
            b = new int[len];
       }
          public void push(int i){//overrides push method of interface Stack
               if(top==(b.length-1))
                      b= Arrays.copyOf(b, b.length + 5);//resizing array size by arraysize+5 whenevr no of elements in stack exceeds arraysize
               b[++top]=i;
          }
      
             public void pop(){//overrides pop method of interface Stack
                  if(top==-1)
                        System.out.println("variable stack:Stack is empty");
                 
                      else{
                          top--;
                          System.out.println("variable stack:pop successful");
                      }
                  
              }
        
                 public void show(){//function which displays elements in stack
                     if(top==-1)
                        System.out.println("variable stack:Stack is empty");
                     
                        else{
                             System.out.print("variable stack: ");
                            for(i=0;i<=top;i++)
                               System.out.print(" "+b[i]);
                            System.out.println(" ");
                           
                        }
                 }
     
}


public class ProgStack{

    public static void main(String []args){
            int x,choice;
            Scanner sc=new Scanner(System.in);
            FixedStack fStk=new FixedStack(3);
            VariableStack vStk=new VariableStack(3);
            while(true){
                 System.out.println("Enter your choice.  1.push   2.pop   3.show    4.Exit");
                 choice=sc.nextInt();
                  
                 if(choice==1){
                         System.out.println("Enter number");
                         x=sc.nextInt();
                         fStk.push(x);
                         vStk.push(x);

                 }
                     
                     else if(choice==2){
                           fStk.pop();
                           vStk.pop();
                     }

                         else if(choice==3){
                               fStk.show();
                               vStk.show();
                         }

                             else if(choice==4){
                                   System.exit(0);
                             }
                         
                                 else{
                                     System.out.println("Invalid Entry.plz Enter correct choice");    
                                 }
                 
            }
            

    }
}
