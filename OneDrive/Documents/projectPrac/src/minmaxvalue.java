public class minmaxvalue {
    public static void main(String[] args) {
       int numbers[] = new int[]{8, 2, 7, 1, 4, 9, 5};
       int min = numbers[0];
       int max = numbers[0];
       for(int i = 1; i< numbers.length; i++) {
          if(numbers[i] > max)max = numbers[i];
          else if (numbers[i] < min)min = numbers[i];
       }
       System.out.println("Largest Number is : " + max);
       System.out.println("Smallest Number is : " + min);
    }
 }