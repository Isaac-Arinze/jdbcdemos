package week3;



public class EncapsulationDemoTest {
    public static void main(String[] args) {

        EncapsulationDemo demo = new EncapsulationDemo("Encapsulated",
                29, "Protected", "Default", "Public");

        demo.publicString = "Modified Public String";
        System.out.println(demo.getEncapsulatedAge());
        System.out.println(demo.getEncapsulatedName());
        System.out.println(demo);

    }
}