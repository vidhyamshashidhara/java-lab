class Instance{
int i=20;
public void instant(){
System.out.println("The value is "+i);
}
public static void main(String args[]){
int var=30;
System.out.println("The value is "+var);
Instance I=new Instance();
I.instant();
}
}