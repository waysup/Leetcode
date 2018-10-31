public class First_Bad_Version {

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        if (isBadVersion(1)) return 1;
        if (!isBadVersion(n)) return -1;

        int mid = 0;
        while (left <= right){
//            !!avoid integer OVERFLOW
            mid = left + (right - left) / 2;
            // mid is bad
            if (isBadVersion(mid)) {
                if (!isBadVersion(mid - 1))
                    return mid;
                right = mid - 1;
            }
            // mid is good
            else {
                if (isBadVersion(mid + 1))
                    return mid + 1;
                left = mid + 1;
            }
        }
//        should never be here
        return -1;
    }

    public boolean isBadVersion(int n){
        return false;
    }
}
