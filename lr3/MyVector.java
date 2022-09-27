@SuppressWarnings("unchecked")

public class MyVector<T>{
    T[] arr;
    private int len;
    private int capacity;

    public MyVector(){
        this.arr = (T[])new Object[1];
        this.len = 0;
        this.capacity = 1;
    }

    public MyVector(int _capacity){
        this.arr = (T[])new Object[_capacity];
        this.capacity = _capacity;
        this.len = 0;
    }

    private MyVector(T[] _array, int _lenght, int _capacity){
        this.arr = _array;
        this.len = _lenght;
        this.capacity = _capacity;
    }

    public MyVector(MyVector<T> _vec){
        this(_vec.arr, _vec.len, _vec.capacity);
    }

    private void resize(){
        T[] new_arr = (T[])new Object[2*this.capacity + 10];
        for (int i = 0; i < this.capacity; i++){
            new_arr[i] = this.arr[i];
        }
        this.arr = new_arr;
        this.capacity = 2*this.capacity + 10;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getLen(){
        return this.len;
    }

    public void push(T _element){
        if (this.len == this.capacity){
            resize();
        }
        this.arr[len] = _element;
        this.len++;
    }

    public T pop() throws Exception{
        if (this.len == 0){
            throw new Exception("Error: nothing to pop");
        }
        this.len--;
        return this.arr[len];
    }

    public T get(int _index) throws Exception{
        if (_index > this.len || _index < 0){
            throw new Exception("Bad Index");
        }
        return this.arr[_index];
    }

    public void insert(T _element, int _index) throws Exception{
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
        this.arr = (T[])new Object[1];
        this.capacity = 1;
        this.len = 0;
    }

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