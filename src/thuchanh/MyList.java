package thuchanh;

import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size, Object[] elements) {
        this.size = size;
        this.elements = elements;
    }
    // Tăng gấp đôi kích thước mảng chứa các phần tử
    public void ensureCapa(){
        int newSize = elements.length*2;
        // tạo một bản sao của mảng elements với kích thước mới là newSize
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}
