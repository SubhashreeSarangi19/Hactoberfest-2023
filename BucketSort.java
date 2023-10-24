import java.util.*;  
public class BucketSortExample1   
{  
private static void binSort(int[] array, int bucketSize)  
{  
List<Integer>[] buckets = new List[bktSize];  
for(int i = 0; i < bktSize; i++)  
{  
  buckets[i] = new LinkedList<>();  
}  
for(int num : array)  
{  
  buckets[hash(num, bktSize)].add(num);  
}  
  for(List<Integer> bucket : buckets)  
{    
    Collections.sort(bucket);  
}  
      int index = 0;  
for(List<Integer> bucket : buckets)  
{  
  for(int num : bucket)  
{  
    array[index++] = num;  
}  
}  
}  
private static int hash(int num, int bucketSize)  
{  
  return num/bucketSize;  
}  
public static void main(String args[])   
{        
    int[] array = {22, 45, 12, 8, 10, 6, 72, 81, 33, 18, 50, 14, 55, 0, 12, 55};  
    System.out.println("Unsorted Array: " + Arrays.toString(array));  
    binSort(array, 10);  
    System.out.println("Sorted Array: " + Arrays.toString(array));  
}  
}  
