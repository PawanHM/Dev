package com.ds;

public class Test extends InsertionSort{
    public static void main(String[] args) {
        int[] a = {36, 19, 29, 12, 5};
        int temp,j;
        for (int i=1;i<a.length;i++) {
            temp = a[i];
            j=i;
            while (j>0 && a[j-1] > temp) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = temp;
        }

        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }

    public String toString() {
        return getClass().getName() + "&" + Integer.toHexString(hashCode());
    }
}
