public class Reference {

  
  public static void main (String [] args) {
  
    int a = 1;
    Reference rf = new Reference();
    System.out.println("Before modify() a = " + a);
    rf.modify(a);
    System.out.println("After modify( a = " + a);
  
  }
  void modify(int number){
    number = number + 1;
    System.out.println("number = " + number);
    
  }

}
