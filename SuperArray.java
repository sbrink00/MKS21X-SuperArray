public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
  }

  public SuperArray(int len){
    if (len < 0) throw new IllegalArgumentException("len can't be negative");
    else data = new String[len];
  }

  public void clear(){
    data = new String[data.length];
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

  public String get(int index){
    if (index < 0 ||index >= this.size()) throw new IllegalArgumentException("index must be > -1 and < size");
    else return data[index];
  }

  public String set(int index, String element){
    if (index < 0 ||index >= this.size()) throw new IllegalArgumentException("index must be > -1 and < size");
    else {
      String output = data[index];
      data[index] = element;
      return output;
    }
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
    else throw new IllegalArgumentException("index must be > -1 and < size");
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

  public String remove(int index){
    if (index > -1 && index < size){
      String output = data[index];
      for (int idx = index; idx < this.size(); idx ++){
        data[idx] = data[idx + 1];
      }
      size -= 1;
      return output;
    }
    else{ throw new IllegalArgumentException("index must be > -1 and < size");
    }
  }

  private void resize(){
    String[] output = new String[size * 2 + 1];
    for (int idx = 0; idx < size; idx ++){
      output[idx] = this.get(idx);
    }
    data = output;
  }
  //[ab, cd, ef, gh, ij, kl, mn, op, qr, st]
  public boolean remove(String element){
    for (int idx = 0; idx < size; idx ++){
      if (data[idx].equals(element)) {
        this.remove(idx);
        return true;
      }
    }
    return false;
  }














}
