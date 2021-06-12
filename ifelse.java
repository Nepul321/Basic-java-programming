public class ifelse {
    public static void main(String[] args) {
        int firstnumber = 23;
        int secondnumber = 45;

        if (firstnumber > secondnumber) {
            System.out.println("First number is higher than the second");
        } else if(firstnumber == secondnumber) {
            System.out.println("Two numbers are equal");
        } else if (firstnumber < secondnumber) {
            System.out.println("Second number is higher than the first");
        }
        
        System.out.println(firstnumber > secondnumber);
        System.out.println(firstnumber < secondnumber);
        System.out.println(firstnumber == secondnumber);

    }
}
