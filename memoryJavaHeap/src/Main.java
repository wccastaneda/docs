public class Main {
    public static void main(String[] args) {

        MyObject firstObject = new MyObject("camilo", 32, "cra-1");
        MyObject secondOject = firstObject;

        secondOject.setEdad(35);
        System.out.println(firstObject.getEdad());
    }
}