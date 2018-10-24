public class driver{
  public static void main(String[] args){
    SuperArray a = new SuperArray();
    System.out.println(a.add("office UK"));
    System.out.println(a.add("parks&rec"));
    System.out.println(a.size());
    System.out.println(a.get(0));
    a.set(0, "office US");
    System.out.println(a.get(0));
    System.out.println(a);
    System.out.println(a.toStringDebug());

    //System.out.println(a);
  }
}
