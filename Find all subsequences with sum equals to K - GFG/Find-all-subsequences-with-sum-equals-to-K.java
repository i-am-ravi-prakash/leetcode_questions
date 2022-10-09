public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        int k = 3;
        
        List<Integer> list = new ArrayList<>();
        
        printSubsequences(arr, arr.length, list, 0, k, 0);
    }
    
    public static void printSubsequences(int[] arr, int n, List<Integer> list, int index, int K, int sum){
        if(index == n){
            if(sum == K){
                printList(list);
            }
            return;
        }
        
        list.add(arr[index]);
        sum += arr[index];
        printSubsequences(arr, n, list, index + 1, K, sum);
        list.remove(list.size() - 1);
        sum -= arr[index];
        printSubsequences(arr, n, list, index + 1, K, sum);
    }
    
    public static void printList(List<Integer> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
