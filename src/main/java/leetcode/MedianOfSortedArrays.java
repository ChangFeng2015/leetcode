package leetcode;

public class MedianOfSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Double result = 0.0,
                nums1Md = 0.0,
                nums2Md = 0.0;

        //find nums1's md
        nums1Md = getArrayMd(nums1);
        //find nums2's md
        nums2Md = getArrayMd(nums2);

        if(!nums1Md.isNaN()){
            if(!nums2Md.isNaN()){
                result = (nums1Md + nums2Md)/2;
            }else {
                result = nums1Md;
            }
        }else {
            if(!nums2Md.isNaN()){
                result = nums2Md;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {1};

        MedianOfSortedArrays medianOfSortedArrays = new MedianOfSortedArrays();
        System.out.println(medianOfSortedArrays.findMedianSortedArrays(nums1,nums2));
    }

    private double getArrayMd(int[] array){
        double md = 0.0;
        if(array != null && array.length > 0){
            Integer nums1Len = array.length;
            if(nums1Len % 2 == 0){
                Integer sum = array[nums1Len/2 - 1] + array[nums1Len/2];
                md = (sum.doubleValue()/2);
            }else {
                md = array[(nums1Len + 1)/2 - 1];
            }
        }else {
            md = Double.NaN;
        }
        return md;
    }
}
