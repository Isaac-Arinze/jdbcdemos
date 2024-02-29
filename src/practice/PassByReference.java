package practice;

public class PassByReference {

//    static String name;


    int oneToZero (int arg[]){
        int count = 0;

        for (int i = 0; i< arg.length; i++){
            if(arg[i] == 1){
                count ++;
                arg[i] = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 1, 1, 9, 1, 1, 1, 2};

        PassByReference test = new PassByReference();
//        PassByReference.name= "Sunday";
        int numOnes;

        System.out.println("Values of the array: [ ");

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println(" ] ");

        numOnes = test.oneToZero(arr);
        System.out.println("Number of ones = " + numOnes);
        System.out.println("New values of the array: [ ");
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println(" ] ");
    }
}
