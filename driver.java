public class driver{
  public static void main(String[] args){
    SuperArray a = new SuperArray();
    System.out.println(a.size());
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
    System.out.println(a);
    System.out.println(a.indexOf("ozark"));
    a.set(a.size() - 1, "parks&rec");
    System.out.println(a.lastIndexOf("parks&rec"));
    a.remove(1);
    System.out.println(a);
    System.out.println(a.remove(400));
    a.remove("parks&rec");
    a.remove("urmom");
    System.out.println(a.toStringDebug());
    a.clear();
    System.out.println(a.toStringDebug());



  }
}
