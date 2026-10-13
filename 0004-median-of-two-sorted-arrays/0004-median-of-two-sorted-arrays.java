class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] arr=new int[n+m];
        for(int i=0;i<n;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            arr[i+n]=nums2[i];
        }
        for(int i=0;i<n+m;i++){
            for(int j=i+1;j<m+n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int l=m+n;
        if(l%2==1){
            return arr[l/2];
        }

        return ((double) arr[l/2-1] +arr[l/2])/2;
    }
}