public class ArrayReverse {
    public static void main(String args[]) {
// declaration and instantiation of an array
        String[] city = new String[5];
//initializing elements
        city[0] = "Delhi";
        city[1] = "Jaipur";
        city[2] = "Gujarat";
        city[3] = "Mumbai";
        city[4] = "Agartala";
        for (int i = 0; i < city.length / 2; i++) {
            String temp = city[i];
            int pos = city.length - 1 - i;
            city[i] = city[pos];
            city[pos] = temp;
        }
//traversing over array using for-each loop
        for (String str : city) {
            System.out.print(str + ". ");
        }
    }
}