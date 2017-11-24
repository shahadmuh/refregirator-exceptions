import java.util.*;
public class test {
static Scanner console=new Scanner (System.in);
public static void main(String[] args){

Refrigerator obj=new Refrigerator(50301,"LG",30);
int num,q,exp;
String name;
boolean add,repeat;

for (int i=0;i<3;i++){
repeat=true;

while(repeat){
try{
System.out.println("Enter the product number:");
num=console.nextInt();
System.out.println("Enter the product name:");
name=console.next();
System.out.println("Enter the product quanitity:");
q=console.nextInt();
System.out.println("Enter the product expiration date:");
exp=console.nextInt();
Product p=new Product(num,name,q,exp);
repeat=false;
add=obj.addProduct(p);} 

catch (OutOfRangeException e){
System.out.println(e);}
catch (InputMismatchException e){
System.out.println("Invalid input!! please try again");
console.next();}}}

System.out.println("to see all the expired products in the refrigerator");

System.out.println("Enter the today's date:");
int date=console.nextInt();

System.out.println("All the expired products in the refrigerator are:");

Product[] arr=obj.expiredproducts(date);
for (int s=0;s<arr.length;s++)
System.out.println(arr[s].toString());}}



