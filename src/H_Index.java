
public class H_Index {

    public static void main(String[] args){

        int[] citations = {0};

        H_Index solver = new H_Index();
        int retValue = solver.hIndex(citations);
        System.out.println(retValue);
    }
    public int hIndex(int[] citations) {

        sort(citations, 0, citations.length - 1);

        for (int i = 0; i < citations.length; i++){
            //find the last position where f[x] is greater than or equal to the position(h)
            if (citations[i] < i + 1)
                return i;
        }
        //then the position is the number of all publications
        return citations.length;

    }
    private void sort(int[] s, int lo, int hi){
        if (hi - lo >= 1) {
            int r = partition(s, lo, hi);

            sort(s, lo, r-1);
            sort(s, r+1, hi);
        }
    }
    private int partition(int[] s, int lo, int hi){
        //after partition, [p...r-1]<s[r];[r+1...q]>s[r]
        //以hi为pivot，初始时i指向lo-1，j从lo开始扫描到hi-1；最后交换i+1和hi位置处的元素
        int i = lo-1;
        for (int j = lo; j < hi; j++){
            if (s[j] > s[hi])
            {
                swap(s, j, ++i);
            }
        }
        swap(s, hi, i+1);
        return i+1;
    }
    private void swap(int[] s, int l, int r){
        int c = s[l] ^ s[r];
        s[l] = c ^ s[l];
        s[r] = c ^ s[l];
    }
}
