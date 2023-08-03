public class MyList<T>{
    private Object[] array;
    private int size;
    private int capacity;

    // Boş constructor
    public MyList() {
        this(10);
    }

    // Constructor
    public MyList(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    // Eleman sayısını verir
    public int size() {
        return size;
    }

    // Dizinin kapasite değerini verir
    public int getCapacity() {
        return capacity;
    }

    // Sınıfa ait diziye eleman ekler
    public void add(T data) {
        if (size == capacity) {
            // Dizi boyutunu 2 katına çıkart
            int newCapacity = capacity * 2;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
            capacity = newCapacity;
        }
        array[size++] = data;
    }

    // Dizi elemanlarını göstermek için toString metodu
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(array[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
