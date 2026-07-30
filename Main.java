//print all elements in an array
// public static void main(String[] args) {
//     int[] arr={1,4,6,7};
//     for(int i=0; i<arr.length; i++){
//         System.out.println(arr[i]);
//     }
// }


//find max in an array
// public static void main(String[] args){
//     int[] arr={1,5,7,25,9};
//     int max=arr[0];
//     for(int i=1; i<arr.length; i++){
//         if(arr[i]>max){
//             max=arr[i];
//         }
//     }
//     System.out.println("Max element in the array is: "+max);
// }


//find min element in an array
// public static void main(String[] args){
//     int[] arr={1,3,7,-4,-10};
//     int min=arr[0];
//     for(int i=0; i<arr.length; i++){
//         if(arr[i]<min){
//             min=arr[i];
//         }
//     }
//     System.out.println(min);
// }


//find sum of all elements in an array
// public static void main(String[] args){
//     int[] arr={1,2,3,4,5};
//     int sum=0;

//     for(int i=0; i<arr.length; i++){
//         sum=sum+arr[i];
//     }
//     System.out.println(sum);
// }


//find average of all elements
// public static void main(String[] args){
//     int[] arr={1,2,3,4,5};
//     int sum=0;

//     for(int i=0; i<arr.length; i++){
//         sum=sum+arr[i];
//     }
//     System.out.println(sum/arr.length);
// }


//count odd and even in an array
// public static void main(String[] args){

//     int[] arr={1,2,3,5,7,5,6,3,4,8,9,123};

//     int even=0;
//     int odd=0;

//     for(int i=0;i<arr.length; i++){
//         if(arr[i]%2==0){
//             even++;
//             System.out.print(arr[i]);
//         }else{
//             odd++;
//         }
//     }
//     System.out.println(even);
//     System.out.print(odd);
// }

//find an element in an array
// public static void main(String[] args){
//     int[] arr={1,2,3,4,5,6,7,8,9};
//     int target=15;

//     for(int i=0; i<arr.length; i++){
//         if(arr[i]==target){
//             System.out.println("Element found at index: "+i);
//         }
//     }
// }


//reverse an array
// public static void main(String[] args){
//     int[] arr={2,5,7,3,1,4,7};

//     for(int i=arr.length-1; i>=0; i--){
//         System.out.println(arr[i]);
//     }
// }

//copy one array to another
// public static void main(String[] args){
//     int[] arr={1,2,3,4,5};
//     int[] arr2= new int[arr.length];

//     for(int i=0; i<arr.length; i++){
//         arr2[i]=arr[i];
//     }
//     for(int i=0; i<arr2.length; i++){
//         System.out.println(arr2[i]);
//     }
// }


//find second largest element in an array

// public static void main(String[] args){
//     int[] arr={1,2,3,4,5};
//     int largest=arr[0];
//     int secondLargest=Integer.MIN_VALUE;

//     for(int i=0; i<arr.length; i++){
//         if(arr[i]>largest){
//             secondLargest=largest;
//             largest=arr[i];
//         }else if(arr[i]>secondLargest && arr[i]!=largest){
//             secondLargest=arr[i];
//         }
//     }
//     System.out.println("Second largest element is: "+secondLargest);
// }


//check if an array is sorted or not
// public static void main(String[] args){
//     int[] arr={1,2,3,4,5};
//     boolean isSorted=true;

//     for(int i=0; i<arr.length-1; i++){
//         if(arr[i]>arr[i+1]){
//             isSorted=false;
//             break;
//         }
//     }
//     if(isSorted){
//         System.out.println("Array is sorted");
//     }else{
//         System.out.println("Array is not sorted");
//     }
// }


//palindrome
// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {121, 123, 454, 567, 99};

//         for (int num : arr) {
//             int original = num;
//             int reverse = 0;

//             while (num > 0) {
//                 int digit = num % 10;
//                 reverse = reverse * 10 + digit;
//                 num /= 10;
//             }

//             if (original == reverse) {
//                 System.out.println(original);
//             }
//         }
//     }
// }


//check the largest and smallest in one traversal
public class Main{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};

        int max=arr[0];
        int min=arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
                max++;
            }else if(arr[i]<min){
                min=arr[i];
                min--;
            }

        }
                    System.out.println("Max: "+max);
            System.out.println("Min: "+min);
    }
}
