// Search an element in an array. 

import java.util.Scanner;

class Program2{

    public static void main(String args[]){

        int number, search , i;

        boolean found = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array : ");
        number = scanner.nextInt();

        int arr[] = new int[number];

        System.out.printf("Enter %d numbers : ",number);

        for(i = 0; i < number; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter th enumber to search : ");
        search = scanner.nextInt();

        for(i = 0; i < number; i++){
            if(arr[i] == search){
                found = true;
                break;             
            }
        }

        if(!found) System.out.printf("%d not present in array\n",search);
        else System.out.printf("%d found at position %d\n",search,i+1);

        scanner.close();
        
    }

}
