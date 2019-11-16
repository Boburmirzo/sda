package com.sda.tasks.common.junit;

public class In1020 {
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
        // Could be written as: return ((temp1 < 0 && ...));
    }
}
