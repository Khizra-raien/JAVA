package test;
class Calculator{
  void add(int a,int b){
    int sum=a+b;
    System.out.println("addition is "+sum);}
  void sub(int a, int b){
    int s=a-b;
    System.out.println("subtraction is "+s);}}
public class Calculator extends Calculation{
  void mul(int a, int b){
    int m=a*b;
    System.out.println("multiplication is "+m);}
  void div(int a, int b){
int d=a/b;
  system.out.println("division is "+d);}
  public Static void main(String[] args){
    Calculator t=new Calculator();
    t.add(5,6);
    t.sub(6,4);
    t.mul(2,4):
      t.div(4,2):}}
    
