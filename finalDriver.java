public class finalDriver{
  public static void main(String[] args){
    /*Everything that is commented out has been written specifically to
    throw an error and has successfully done so. It has then been commented
    out so the rest of the code will run*/
    SuperArray b = new SuperArray(5);
    try {
      SuperArray a = new SuperArray(-5);
    }
    catch(IllegalArgumentException e){
      System.out.println(e);
      System.out.println("fix length");
    }
    //System.out.println(b);

    b.add("1");
    b.add("2");
    b.add("3");

    try{
      b.add(6, "1");
    }
    catch(IndexOutOfBoundsException f){
      System.out.println(f);
      System.out.println("fix index");
    }

    try{
      b.remove(6);
    }
    catch(IndexOutOfBoundsException e){
      System.out.println(e);
      System.out.println("fix index");
    }


    try{
      b.set(6, "45");
    }
    catch(IndexOutOfBoundsException e){
      System.out.println(e);
      System.out.println("fix index");
    }

    try{
      b.get(8);
    }
    catch(IndexOutOfBoundsException e){
      System.out.println(e);
      System.out.println("fix index");
    }
  }
}
