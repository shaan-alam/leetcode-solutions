package hard;
import java.util.ArrayList;
import java.util.Collections;

class Median_of_Two_Sorted_Arrays {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    double median = 0;

    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int x : nums1) {
      list.add(x);
    }

    for (int x : nums2) {
      list.add(x);
    }

    Collections.sort(list);

    if (list.size() % 2 == 0) {
      int mid = (list.size() / 2) - 1;
      median = (list.get(mid) + list.get(mid + 1)) / 2.0;

    } else {
      int mid = (int) Math.ceil(list.size() / 2.0) - 1;
      median = list.get(mid);
    }

    return median;
  }
}