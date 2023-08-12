public class Exercise110 {
    public static boolean isPowerOfFour(int num) {
      return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0x55555555) == num);
    }
    
    public static void main(String[] args) {
      int num = 16;
      System.out.println(isPowerOfFour(    num));
    }
  }