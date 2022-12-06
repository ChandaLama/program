public class Ifelseif
{
	public class static void main (String [] args)
	{
		  //defining an 'age' variable  
    int age=20;  
    //checking the age  
    if(age>18){  
        System.out.print("Age is greater than 18");  
    }  
}  
}  
ifelse
  //defining a variable  
    int number=13;  
    //Check if the number is divisible by 2 or not  
    if(number%2==0){  
        System.out.println("even number");  
    }else{  
        System.out.println("odd number");  
    }  
}  
}  
public class LeapYearExample {    
public static void main(String[] args) {    
    int year=2020;    
    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
        System.out.println("LEAP YEAR");  
    }  
    else{  
        System.out.println("COMMON YEAR");  
    }  
}    
}    
//Java Program to demonstrate the use of If else-if ladder.  
//It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+.  
public class IfElseIfExample {  
public static void main(String[] args) {  
    int marks=65;  
      
    if(marks<50){  
        System.out.println("fail");  
    }  
    else if(marks>=50 && marks<60){  
        System.out.println("D grade");  
    }  
    else if(marks>=60 && marks<70){  
        System.out.println("C grade");  
    }  
    else if(marks>=70 && marks<80){  
        System.out.println("B grade");  
    }  
    else if(marks>=80 && marks<90){  
        System.out.println("A grade");  
    }else if(marks>=90 && marks<100){  
        System.out.println("A+ grade");  
    }else{  
        System.out.println("Invalid!");  
    }  
}  
}  
Output:

C grade
Program to check POSITIVE, NEGATIVE or ZERO:


public class PositiveNegativeExample {    
public static void main(String[] args) {    
    int number=-13;    
    if(number>0){  
    System.out.println("POSITIVE");  
    }else if(number<0){  
    System.out.println("NEGATIVE");  
    }else{  
    System.out.println("ZERO");  
   }  
}    
}    
Output:

NEGATIVE
//Java Program to demonstrate the use of Nested If Statement.  
public class JavaNestedIfExample {    
public static void main(String[] args) {    
    //Creating two variables for age and weight  
    int age=20;  
    int weight=80;    
    //applying condition on age and weight  
    if(age>=18){    
        if(weight>50){  
            System.out.println("You are eligible to donate blood");  
        }    
    }    
}}  public class DoWhileExample {    
public static void main(String[] args) {    
    int i=1;    
    do{    
        System.out.println(i);    
    i++;    
    }while(i<=10);    
}    
}    public class DoWhileExample2 {  
public static void main(String[] args) {  
    do{  
        System.out.println("infinitive do while loop");  
    }while(true);  
