public class finalDriver{
  public static void main(String[] args){
    /*Everything that is commented out has been written specifically to
    throw an error and has successfully done so. It has then been commented
    out so the rest of the code will run*/
    SuperArray b = new SuperArray(5);
    //SuperArray a = new SuperArray(-5);
    System.out.println(b);
    b.add("1");
    b.add("2");
    b.add("3");
    //b.add(6, "4");
    //b.remove(6);
    //b.set(6, "45");
    //b.get(8);
  }
}
