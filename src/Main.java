public class Main {

    public static int y = 10;

    public static void main(String[] args) {

//        int x = 10;
//        System.out.println("x = " + x);
//        x = changeX(x);
//        System.out.println("x = " + x);
//
//        while(true){
//            System.out.println(x++);
//        }
//        recursion(1.0);
        int[] arr1 = {1,2,3,4};
        int[] arr2 = arr1;
        arr2.clone();

        changeX(5);



//        arr1[0] = 100;
//        System.out.println(arr2[0]);

//        Main main = new Main();
//        main.start();


        Container container1 = new Container();
        System.out.println(container1.getInitial());
        container1.setInitial("B");
        System.out.println(container1.getInitial());
        Container container2 = container1;
        Container container3 = new Container();
        System.out.println("address 1 = " + container1);
        System.out.println("address 2 = " + container2);
        System.out.println("address 3 = " + container3);



//        changeInt(number);
//        changeArr(numbers);
//
//        System.out.println("number after = " + number);
//        System.out.println("numbers[0] after = " + numbers[0]);

    }

    public void start(){
        String last = "Z";
        Container container = new Container();
        container.setInitial("C");
        another(container,last);
        System.out.println(container.getInitial());
    }

    public void another(Container initialHolder, String newInitial){
        newInitial.toLowerCase();
        initialHolder.setInitial("B");
        Container initial2 = new Container();
        initialHolder = initial2;
        System.out.println(initialHolder.getInitial());
        System.out.println(newInitial);
    }

    public static void changeInt(int number){
        number = number * 2;
        System.out.println("number in function = " + number);
    }

    public static void changeArr(int[] numbers){
        numbers[0] = numbers[0] * 2;
        System.out.println("numbers[0] in function = " + numbers[0]);
    }

    public static void printArrayAddress(int[] arr){
        int[] newnew = arr;
        System.out.println(newnew);
    }

    public static int changeX(int x){
        return x*10;
    }

    public static int recursion(int number){
        System.out.println(number);
        return recursion(++number);
    }

    public static int recursion(double number){
        System.out.println(number);
        return recursion(++number);
    }
}
