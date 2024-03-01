class ArrayUtlitly {
  public static int[] inputArray() {
     Scanner input =vnew Scanner(System.in);
    System.out.println("Please enter the no of element: ");
    int size = input.nextInt();
    int[] nums = new int[size];
    int i = 0;
    while(i < size) {
      System.out.print("Please enter element no." + (i+1) + ": ");
      nums[i] = input.nextInt();
      i++ ;
    }
    return nums;
  }
}
