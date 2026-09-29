/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spriy;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprcno
implements Cloneable {
    private spriy cfr_renamed_0;
    private int cfr_renamed_1;
    private boolean cfr_renamed_2;
    private int cfr_renamed_3;
    private boolean cfr_renamed_4;

    public spriy cfr_renamed_13400() {
        return this.cfr_renamed_0;
    }

    public sprcno() {
        sprcno sprcno2 = this;
        sprcno sprcno3 = this;
        sprcno3.cfr_renamed_1 = 0;
        sprcno3.cfr_renamed_3 = 0;
        sprcno2.cfr_renamed_4 = true;
        sprcno2.cfr_renamed_2 = true;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 5;
        int cfr_ignored_0 = 2 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ (3 ^ 5);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public int cfr_renamed_12682() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public boolean cfr_renamed_16788() {
        return this.cfr_renamed_12682() == 0;
    }

    public void cfr_renamed_12727(int arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @sprtea
    public sprcno cfr_renamed_12099() {
        return (sprcno)this.cfr_renamed_12100();
    }

    public void cfr_renamed_16700(boolean arg0) {
        this.cfr_renamed_2 = arg0;
    }

    @sprtea
    public boolean cfr_renamed_16818() {
        return this.cfr_renamed_16819() == 0 || this.cfr_renamed_16819() == 1;
    }

    @sprtea
    public boolean cfr_renamed_16820() {
        return this.cfr_renamed_16819() == 0;
    }

    @sprtea
    public boolean cfr_renamed_16821() {
        return this.cfr_renamed_12682() == 0 || this.cfr_renamed_12682() == 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object cfr_renamed_12100() {
        try {
            return this.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException(cloneNotSupportedException);
        }
    }

    public boolean cfr_renamed_16227() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_16819() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_16822(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public sprcno(spriy spriy2) {
        sprcno sprcno2 = this;
        sprcno sprcno3 = this;
        this.cfr_renamed_1 = 0;
        sprcno3.cfr_renamed_3 = 0;
        sprcno3.cfr_renamed_4 = true;
        sprcno2.cfr_renamed_2 = true;
        sprcno2.cfr_renamed_0 = spriy2;
    }

    public void cfr_renamed_16699(int arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public boolean cfr_renamed_16786() {
        return this.cfr_renamed_4;
    }
}

