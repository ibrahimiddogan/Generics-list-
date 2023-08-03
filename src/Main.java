public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        System.out.println("Initial Capacity: " + myList.getCapacity());

        for (int i = 0; i < 15; i++) {
            myList.add(i);
            System.out.println("Element added: " + i + ", New Size: " + myList.size() + ", New Capacity: " + myList.getCapacity());
        }

        System.out.println("MyList: " + myList);
    }

}