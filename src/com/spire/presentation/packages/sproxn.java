/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvqo;

@sprtea
public abstract class sproxn {
    private sprvqo cfr_renamed_3;
    private sprdsp cfr_renamed_4;

    public abstract sprdsp cfr_renamed_14855();

    public sprdsp cfr_renamed_13907() {
        return this.cfr_renamed_4;
    }

    public sproxn(sprvqo sprvqo2) {
        sproxn sproxn2 = this;
        this.cfr_renamed_4 = new sprdsp();
        this.cfr_renamed_3 = sprvqo2;
    }

    public void cfr_renamed_14863(int arg0) {
        this.cfr_renamed_14856().cfr_renamed_13308(arg0);
        sproxn sproxn2 = this;
        sproxn2.cfr_renamed_14864(sproxn2.cfr_renamed_14856().cfr_renamed_13261().cfr_renamed_13027().cfr_renamed_13469(arg0).cfr_renamed_13076(), arg0);
    }

    public void cfr_renamed_14865(int arg0, int arg1) {
        int n = this.cfr_renamed_14856().cfr_renamed_13325(arg0);
        if (arg1 != 0) {
            sproxn sproxn2 = this;
            sproxn2.cfr_renamed_14856().cfr_renamed_13326(arg1, n);
            sproxn2.cfr_renamed_14864(arg0, arg1);
        }
    }

    public void cfr_renamed_14864(int arg0, int arg1) {
        int[] nArray = new int[1];
        nArray[0] = arg1;
        this.cfr_renamed_14866(arg0, nArray);
    }

    public abstract sprdsp cfr_renamed_13484();

    public abstract int cfr_renamed_14862(int var1);

    public sprvqo cfr_renamed_14856() {
        return this.cfr_renamed_3;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 1;
        int cfr_ignored_0 = 5 << 3 ^ 3;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 3;
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

    public void cfr_renamed_14866(int arg0, int[] arg1) {
        sproxn sproxn2 = this;
        int n = sproxn2.cfr_renamed_14862(arg0);
        if (!sproxn2.cfr_renamed_4.cfr_renamed_14000(n)) {
            this.cfr_renamed_4.cfr_renamed_12962(n, arg1);
        }
    }

    public boolean cfr_renamed_14867() {
        return this.cfr_renamed_3.cfr_renamed_14867();
    }

    public boolean cfr_renamed_14132() {
        return this.cfr_renamed_3.cfr_renamed_13261().cfr_renamed_14132();
    }

    public void cfr_renamed_14868() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_14856().cfr_renamed_13484().cfr_renamed_11861()) {
            sproxn sproxn2 = this;
            int n3 = sproxn2.cfr_renamed_14856().cfr_renamed_13484().cfr_renamed_7861(n);
            int n4 = (Integer)sproxn2.cfr_renamed_14856().cfr_renamed_13484().cfr_renamed_13485(n);
            this.cfr_renamed_14864(n4, n3);
            n2 = ++n;
        }
    }

    public void cfr_renamed_13227(spreen arg0) {
        this.cfr_renamed_3.cfr_renamed_13227(arg0);
    }
}

