package com.sda.tasks.mikhail;

import java.util.ArrayList;

public class ArraysEasyTask {
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else return false;
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) return true;
        else return false;
    }

    public int[] makePi() {
        int[] pi = {3, 1, 4};
        return pi;
    }

    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) return true;
        else return false;
    }

    public int sum3(int[] nums) {
        int summ = 0;
        for (int i = 0; i < nums.length; i++) {
            summ += nums[i];
        }
        return summ;
    }

    public int[] rotateLeft3(int[] nums) {
        int temp = nums[2];
        int temp1 = nums[1];
        nums[2] = nums[0];
        nums[0] = temp1;
        nums[1] = temp;
        return nums;
    }

    public String everyNth(String str, int n) {
        String a = "";
        for (int i = 0; i < str.length(); i += n) {
            a += str.charAt(i);
        }
        return a;
    }

    public int[] reverse3(int[] nums) {
        int temp = nums[2];
        nums[2] = nums[0];
        nums[0] = temp;
        return nums;
    }

    public int[] maxEnd3(int[] nums) {
        int max;
        if (nums[0] >= nums[nums.length - 1]) max = nums[0];
        else max = nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = max;
        }
        return nums;
    }

    public int sum2(int[] nums) {
        int summ = 0;
        for (int i = 0; i < nums.length; i++) {
            summ += nums[i];
            if (i > 1) break;
        }
        return summ;
    }

    public int[] middleWay(int[] a, int[] b) {
        int[] c = {a[1], b[1]};
        return c;
    }

    public int[] makeEnds(int[] nums) {
        if (nums.length < 1) {
            int[] a = {nums[0]};
            return a;
        } else {
            int[] a = {nums[0], nums[nums.length - 1]};
            return a;
        }
    }

    public boolean has23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) return true;
        }
        return false;
    }

    public boolean no23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) return false;
        }
        return true;
    }

    public int[] makeLast(int[] nums) {
        int[] a = new int[nums.length * 2];
        a[a.length - 1] = nums[nums.length - 1];
        return a;
    }

    public boolean double23(int[] nums) {
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) count2++;
            else if (nums[i] == 3) count3++;
        }
        if (count2 >= 2 || count3 >= 2) return true;
        else return false;
    }

    public int[] fix23(int[] nums) {
        for (int a = 0; a < nums.length; a++) {
            if (a >= 1 && nums[a - 1] == 2 && nums[a] == 3) nums[a] = 0;
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length >= 1 && a[0] == 1) count++;
        if (b.length >= 1 && b[0] == 1) count++;
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int asum = 0;
        int bsum = 0;
        for (int c = 0; c < a.length; c++) {
            asum += a[c];
        }
        for (int d = 0; d < b.length; d++) {
            bsum += b[d];
        }
        if (asum >= bsum) return a;
        else return b;
    }

    public int[] makeMiddle(int[] nums) {
        int temp = nums.length / 2;
        int[] a = {nums[temp - 1], nums[temp]};
        return a;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] c = {a[0], a[1], b[0], b[1]};
        return c;
    }

    public int[] swapEnds(int[] nums) {
        if (nums.length > 1) {
            int temp = nums[0];
            nums[0] = nums[nums.length - 1];
            nums[nums.length - 1] = temp;
        }
        return nums;
    }

    public int[] midThree(int[] nums) {
        if (nums.length > 3) {
            int mid = (nums.length + 1) / 2;
            int[] a = {nums[mid - 2], nums[mid - 1], nums[mid]};
            return a;
        }
        return nums;
    }

    public int maxTriple(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            if (nums[0] >= nums[1]) return nums[0];
            else return nums[1];
        } else {
            int mid = (nums.length + 1) / 2;
            int[] a = {nums[0], nums[mid - 1], nums[nums.length - 1]};
            int max = a[0];
            for (int i = 1; i < a.length; i++) {
                if (a[i] >= max) max = a[i];
            }
            return max;
        }
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            int[] a = new int[2];
            for (int i = 0; i < 2; i++) {
                a[i] = nums[i];
            }
            return a;
        } else return nums;
    }

    public int[] make2(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        if (a.length >= 1) {
            for (int i = 0; i < a.length; i++) {
                list.add(a[i]);
            }
        }
        if (b.length >= 1) {
            for (int i = 0; i < b.length; i++) {
                list.add(b[i]);
            }
        }
        int[] arr = new int[2];
        for (int i = 0; i < 2; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public int[] front11(int[] a, int[] b) {
        int[] arr;
        if (a.length > 0 && b.length > 0) {
            arr = new int[2];
            arr[0] = a[0];
            arr[1] = b[0];
        } else if (a.length == 0 && b.length != 0) {
            arr = new int[1];
            arr[0] = b[0];
        } else if (b.length == 0 && a.length != 0) {
            arr = new int[1];
            arr[0] = a[0];
        } else arr = new int[0];
        return arr;
    }

    public boolean unlucky1(int[] nums) {
        if (nums.length == 2) {
            if (nums[0] == 1 && nums[1] == 3) return true;
        } else if (nums.length > 2) {
            if (nums[0] == 1 && nums[1] == 3) return true;
            else if (nums[1] == 1 && nums[2] == 3) return true;
            else if (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) return true;
        }
        return false;
    }
}