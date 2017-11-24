public class Product {
private int pNum;
private String pName;
private int quantity;
private int expDate;

public Product (int num,String n,int q,int exp) throws OutOfRangeException{
pNum=num;
pName=n;
expDate=exp;
if (1<=q && q<=10)
quantity=q;
else
throw new OutOfRangeException("Invalid quanitity");}

public int getExp(){
return expDate;}

public String toString(){
return "Product number: "+pNum+"\nPoduct name: "+pName+"\nQuanitity: "+quantity+"\nExpiration date: "+expDate;}}