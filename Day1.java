//print all elements in an array
// public static void main(String[] args) {
//     int[] arr={1,4,6,7};
//     for(int i=0; i<arr.length; i++){
//         System.out.println(arr[i]);
//     }
// }

//find max in an array
public static void main(String[] args){
    int[] arr={1,5,7,25,9};
    int max=arr[0];

    for(int i=1; i<arr.length; i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    System.out.println("Max element in the array is: "+max);
}
