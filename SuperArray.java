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
    if (size() == data.length) this.resize();
    data[size] = element;
    size += 1;
    return true;
  }

  public String toString(){
    if (size == 0) return "[]";
    String output = "[";
    for (int idx = 0; idx < this.size(); idx ++){
      output += data[idx] + ", ";
    }
    return output.substring(0, output.length() - 2) + "]";
  }

  public String toStringDebug(){
    String output = "[";
    for (int idx = 0; idx < data.length; idx ++){
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

  private void resize(){
    String[] output = new String[size * 2 + 1];
    for (int idx = 0; idx < size; idx ++){
      output[idx] = this.get(idx);
    }
    data = output;
  }


  public String remove(int index){
    if (index > -1 && index < size){
      String output = data[index];
      for (int idx = index; idx < this.size() - 1; idx ++){
        data[idx] = data[idx + 1];
      }
      data[this.size() - 1] = null;
      size -= 1;
      return output;
    }
    else return "index out of range";
  }

  public boolean remove(String target){
    for (int idx = 0; idx < size; idx ++){
      if (data[idx].equals(target)) this.remove(idx);
    }
    return true;
  }

  public boolean contains(String target){
    for (int idx =0; idx < size(); idx ++){
      if (this.get(idx).equals(target)) return true;
    }
    return false;
  }

  public void add(int index, String element){
    if (index > -1 && index < data.length){
      if (data.length == size()) this.resize();
      for (int idx = size(); idx > index; idx -= 1){
        data[idx] = data[idx - 1];
      }
      data[index] = element;
      size ++;
    }
    else System.out.println("index out of range");
  }

  public int indexOf(String target){
    for (int idx = 0; idx < size(); idx ++){
      if (data[idx].equals(target)) return idx;
    }
    return -1;
  }

  public int lastIndexOf(String target){
    for (int idx = size() - 1; idx >= 0; idx --){
      if (data[idx].equals(target)) return idx;
    }
    return -1;
  }
}
