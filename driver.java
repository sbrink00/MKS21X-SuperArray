public class driver{
  public static void main(String[] args){
    SuperArray a = new SuperArray();
    a.add("parks&rec");
    a.add("office UK");
    a.add("breakingBad");
    a.add("ozark");
    a.add("scarface");
    System.out.println(a);
    System.out.println(a.size());
    System.out.println(a.get(0));
    System.out.println(a.set(1, "office US"));
    System.out.println(a);
    a.add("godfather");
    System.out.println(a);
    System.out.println(a.contains("godfather"));
    System.out.println(a.contains("watermelon"));
    a.add(2, "groundhog day");
    System.out.println(a.toStringDebug());


  }
}
