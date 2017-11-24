public class Refrigerator {
private int ID;
private String company;
private int numOfProduct;
private Product[] productlist;
public Refrigerator(int id, String c,int size){
ID=id;
company=c;
numOfProduct=0;
productlist=new Product[size];}

public boolean addProduct(Product P){
if (numOfProduct<productlist.length){
productlist[numOfProduct++]=P;
return true;}
return false;}

public Product[] expiredproducts(int today){
Product[] list;
int count=0;
int counter=0;
for (int i=0;i<numOfProduct;i++){
if (productlist[i].getExp()<today)
count++;}
list=new Product[count];
for (int f=0;f<numOfProduct;f++){
if (productlist[f].getExp()<today)
list[counter++]=productlist[f];}
return list;}
}