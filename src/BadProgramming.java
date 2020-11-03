public class BadProgramming {
    public static void main(String[] args) {
        int[] mySmallArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.println(mySmallArray[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
                System.out.print("End of the Array");

            }

        }
    }
