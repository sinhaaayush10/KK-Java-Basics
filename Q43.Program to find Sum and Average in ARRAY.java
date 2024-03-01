class ArraySumAverage {
  public static void main{
    System.out.print("Welcome to Array Sum and Average");
    int[] numArray = ArrayUtility.inputArray();
    long sum = sum(numArray);
    long avg = average(numArray);
    System.out.print("sum of nos is: " + sum);
    System.out.print("avg of nos is: " + avg);
  }
  public static long sum(int[] numArray) {
    long sum = 0;
    int i = 0;
    while(i < numArray.length){
      sum += numArray[i];
      i++ ; 
    }
    return sum;
  }
  public static int average(int[] numArray){
long sum = sum(numArray);
    return(int)(sum/numArray.length);
  }
}
