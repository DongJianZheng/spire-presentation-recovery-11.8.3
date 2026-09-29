/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcog;
import com.spire.presentation.packages.sprdvm;
import com.spire.presentation.packages.sprgvm;
import com.spire.presentation.packages.spripl;
import com.spire.presentation.packages.sprnkea;
import com.spire.presentation.packages.spromm;
import com.spire.presentation.packages.sprve;

public class sproxl {
    private sprve cfr_renamed_3;
    private sprgvm cfr_renamed_4;

    public sprgvm cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sproxl(sprgvm sprgvm2, sprve sprve2) {
        void arg1;
        sproxl sproxl2 = this;
        sproxl2.cfr_renamed_3 = arg1;
        sproxl2.cfr_renamed_4 = sprgvm2;
    }

    public sproxl(sprgvm arg0) {
        this(arg0, new sprcog());
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean cfr_renamed_11016(int arg0) {
        switch (arg0) {
            case 24: {
                return true;
            }
        }
        return false;
    }

    public static sproxl cfr_renamed_10997(sprdvm sprdvm2) {
        sprdvm arg0;
        return sproxl.cfr_renamed_11031(arg0, new sprcog());
    }

    public static sproxl cfr_renamed_11031(sprdvm arg0, sprve arg1) {
        if (!sproxl.cfr_renamed_11016(arg0.cfr_renamed_324())) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprnkea.cfr_renamed_9("\u0011k\u001cp\u0017j\u0006$\u001dbRT9M0k\u0016}Rs\u0000k\u001ccRp\u000bt\u0017>R")).append(arg0.cfr_renamed_324()).toString());
        }
        return new sproxl(sprgvm.cfr_renamed_23(arg0.cfr_renamed_480()), arg1);
    }

    public spripl[] cfr_renamed_4425() {
        int n;
        spromm[] sprommArray = this.cfr_renamed_4.cfr_renamed_4426();
        spripl[] spriplArray = new spripl[sprommArray.length];
        int n2 = n = 0;
        while (n2 != spriplArray.length) {
            int n3 = n;
            spripl spripl2 = new spripl(this.cfr_renamed_3, sprommArray[n]);
            spriplArray[n3] = spripl2;
            n2 = ++n;
        }
        return spriplArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (2 ^ 5);
        int cfr_ignored_0 = 4 << 4;
        int n4 = n2;
        int n5 = 4 << 3 ^ 2;
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
}

