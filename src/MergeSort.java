import java.util.*;
public class MergeSort {


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
        public static void main(String[] args) throws Exception {


            // Write your code here
            Scanner s = new Scanner(System.in);
            int N = s.nextInt();

            int[] A = new int[N];
            for (int i =0; i<N; i++){
                A[i]=s.nextInt();
            }

            merge_sort(A, 0, N-1);

            for (int a: A ) {
                System.out.println(a);
            }


        }

        public static void merge_sort(int[] a, int start, int end){

            if (start<end){
                int mid = (start+end) /2;

                merge_sort(a,start,mid);
                merge_sort(a,mid+1,end);

                merge(a, start, mid, end);
            }

        }

        public static void merge (int[] A, int start, int mid, int end){

            //stores the starting position of both parts in temporary variables.
            int p = start ,q = mid+1;

            int i1 = end - start + 1;
            int[] Arr = new int[i1];
            int k=0;

            for(int i = start ;i <= end ;i++) {
                if(p > mid)      //checks if first part comes to an end or not .
                    Arr[ k++ ] = A[ q++] ;

                else if ( q > end)   //checks if second part comes to an end or not
                    Arr[ k++ ] = A[ p++ ];

                else if( A[ p ] < A[ q ])     //checks which part has smaller element.
                    Arr[ k++ ] = A[ p++ ];

                else
                    Arr[ k++ ] = A[ q++];
            }
            for (int x=0 ; x< k ;x ++) {
   /* Now the real array has elements in sorted manner including both
        parts.*/
                A[ start++ ] = Arr[ x ] ;
            }

        }



}
