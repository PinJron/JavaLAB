package lr5_sdacha;

@SuppressWarnings("unchecked")

public class MyVector<T extends Comparable<T>>{
    public T[] arr;
    private int len;
    private int capacity;

    public MyVector(){
        this.arr = (T[])new Comparable[0];
        this.len = 0;
        this.capacity = 1;
    }

    public MyVector(int _capacity){
        this.arr = (T[])new Comparable[_capacity];
        this.capacity = _capacity;
        this.len = 0;
    }

    public MyVector(MyVector<T> _vec){
        this.arr = _vec.arr;
        this.len = _vec.len;
        this.capacity = _vec.capacity;
    }

    public void resize(){
        T[] new_arr = (T[])new Comparable[2*this.capacity + 10];
        for (int i = 0; i < this.capacity; i++){
            new_arr[i] = this.arr[i];
        }
        this.arr = new_arr;
        this.capacity = 2*this.capacity + 10;
    }
    
    public T[] getArr(){
        return this.arr;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getLen(){
        return this.len;
    }

    public void addLast(T _element){
        if (this.len == this.capacity){
            resize();
        }
        this.arr[len] = _element;
        this.len++;
    }

    public T removeLast() throws Exception{
        if (this.len == 0){
            throw new Exception("Error: nothing to remove");
        }
        this.len--;
        return this.arr[len];
    }

    public T getByIndex(int _index) throws Exception{
        if (_index > this.len || _index < 0){
            throw new Exception("Bad Index");
        }
        return this.arr[_index];
    }

    public void insertByIndex(T _element, int _index) throws Exception{
        if (_index > this.len || _index < 0){
            throw new Exception("Bad Index");
        }

        if (this.len == this.capacity) {
            resize();
        }
        len++;

        for (int i = len-1; i > _index; i--) {
            this.arr[i] = arr[i-1];
        }
        arr[_index] = _element;
    }

    public void deleteByIndex(int _index) throws Exception{
        if (_index > this.len || _index < 0) {
            throw new Exception("Bad Index");
        }

        for (int i = _index; i < len-1; i++) {
            this.arr[i] = arr[i+1];
        }
        len--;
    }

    public void deleteByValue(T _value) throws Exception{
        for (int i = 0; i < len-1; i++) {
            if (this.arr[i] == _value){
                deleteByIndex(i);
                return;
            }
        }
        throw new Exception("Error: Value not found (method deleteByValue)");
    }

    public void clear(){
        this.arr = null;
        this.capacity = 0;
        this.len = 0;
    }

    public T[] sortInsert(String a, int left, int right) {
      switch(a) {
        case("ubivanie"):
          for (int i = left + 1; i < right + 1; i++) {
            T element = arr[i];
            int j = i - 1;
            while (j >= left && arr[j].compareTo(element) < 0) {
              arr[j + 1] = arr[j];
              j--;
            }
            arr[j + 1] = element;
          }
          return arr;

        case("vozrastanie"):
          for (int i = left + 1; i < right + 1; i++) {
            T element = arr[i];
            int j = i - 1;
            while (j >= left && arr[j].compareTo(element) > 0) {
              arr[j + 1] = arr[j];
              j--;
            }
            arr[j + 1] = element;
          }
        return arr;
      }
      
      
      for (int i = left + 1; i < right + 1; i++) {
        T element = arr[i];
        int j = i - 1;
        while (j >= left && arr[j].compareTo(element) > 0) {
          arr[j + 1] = arr[j];
          j--;
        }
        arr[j + 1] = element;
      }
      return arr;
    }
  
    // public static <T extends Comparable<T>> T[] sortInsert() {
    //   return sortInsert(0, arr.getLen - 1);
    // }

    //method for debug
    @Override
    public String toString(){
        String res = " ";
        for (int i = 0; i < this.len; i++)
        {
            res+=(this.arr[i]+" ");
        }
        return res;
    }
}
