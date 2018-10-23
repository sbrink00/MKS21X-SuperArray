public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
  }
  public void clear(){
    size = 0;
  }

  public int size(){
    return this.size;
  }

  public boolean add(String element){
    for (int idx = 0; idx < this.size(); idx ++){
      if (data[idx] == null) {
        data[idx] = element;
        return true;
      }
    }
    return true;
  }

  public String toString(){
    String output = "[";
    for (int idx = 0; idx < this.size(); idx ++){
      output += data[idx] + ", ";
    }
  }
    return output.substring()
}
