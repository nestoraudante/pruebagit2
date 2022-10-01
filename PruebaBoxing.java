package boxing;

public class PruebaBoxing {
    public static void main(String[] args) {

        double number = Double.parseDouble("12.05");

        Double number2 = number;
        System.out.println("number2.byteValue(): "+number2.byteValue());

        String hexValue = Integer.toHexString(42);
        Integer iValue = Integer.valueOf("123");
        double dValue = new Integer("243").doubleValue();


        System.out.println("number: "+number);
        System.out.println("hexValue: "+hexValue);
        System.out.println("iValue: "+iValue);
        System.out.println("dValue: "+dValue);

        System.out.println();
    }
}
