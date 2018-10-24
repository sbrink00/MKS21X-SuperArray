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

  public boolean isEmpty(){
    return this.size() == 0;
  }

  public boolean add(String element){
    data[size] = element;
    String output = data[size];
    size += 1;
    return true;
  }

  public String toString(){
    String output = "[";
    for (int idx = 0; idx < this.size(); idx ++){
      output += data[idx] + ", ";
    }
    return output.substring(0, output.length() - 2) + "]";
  }

  public String toStringDebug(){
    String output = "[";
    for (int idx = 0; idx < 10; idx ++){
      output += data[idx] + ", ";
    }
    return output.substring(0, output.length() - 2) + "]";
  }

  public String get(int index){
    if (index > -1 && index < this.size()){
      return data[index];
    }
    else return "if the index is out of range, that is when: (index < 0 || index >= size())";
  }

  public String set(int index, String element){
    String output = data[index];
    if (index > -1 && index < this.size()){
      data[index] = element;
    }
    else return "if the index is out of range, that is when: (index < 0 || index >= size())";
    return output;
  }

  /*private void resize(){
    SuperArray output = new SuperArray[data.length + 1];
  }
  */


}
