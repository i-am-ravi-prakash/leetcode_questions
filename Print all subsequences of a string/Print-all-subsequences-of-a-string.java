public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        
        List<Integer> list = new ArrayList<>();
        
        printSubsequences(arr, arr.length, list, 0);
    }
    
    public static void printSubsequences(int[] arr, int n, List<Integer> list, int index){
        if(index == n){
            printList(list);
            return;
        }
        
        list.add(arr[index]);
        printSubsequences(arr, n, list, index + 1);
        list.remove(list.size() - 1);
        printSubsequences(arr, n, list, index + 1);
    }
    
    public static void printList(List<Integer> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
