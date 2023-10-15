class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m + n];
        int left = 0;
        int right = 0;
        int index = 0;

        while (left < m && right < n) {
            if (nums1[left] <= nums2[right]) {
                arr[index] = nums1[left];
                left++;
            } else {
                arr[index] = nums2[right];
                right++;
            }
            index++;
        }

        while (left < m) {
            arr[index] = nums1[left];
            left++;
            index++;
        }

        while (right < n) {
            arr[index] = nums2[right];
            right++;
            index++;
        }

        for (int i = 0; i < n + m; i++) {
            nums1[i] = arr[i];
        }
    }
}


__________________________________________________________________________________________________________-
  
