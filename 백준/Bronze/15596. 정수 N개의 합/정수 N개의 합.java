public class Test {
    long sum(int[] a) {
        long ans = 0;
        int len = a.length;
        for(int i=0; i<len; i++) {
            ans += a[i];
        }
        return ans;
    }
}
