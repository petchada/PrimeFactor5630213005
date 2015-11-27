package primefactor5630213005;

import java.util.Scanner;

public class PrimeFactor5630213005 {

public static void main(String[] args) {
Scanner number = new Scanner(System.in);

int i =1;
while(i==1){
System.out.print("Input a number: ");
int numbers = number.nextInt();
int primeFactor=2;

while(numbers>1){
if(numbers%primeFactor == 0) {
System.out.println(primeFactor+" ");
numbers=numbers/primeFactor;
}
else
primeFactor++;
}
}
System.out.println(" ");
}

}
