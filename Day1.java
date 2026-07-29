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
public static void main(String[] args){
    int[] arr={1,2,3,4,5};
    int sum=0;

    for(int i=0; i<arr.length; i++){
        sum=sum+arr[i];
    }
    System.out.println(sum);
}
