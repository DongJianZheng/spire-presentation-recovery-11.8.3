/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.spromp;
import com.spire.presentation.packages.sproup;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwso;

@sprtea
public class sprquo {
    private static final int cfr_renamed_1 = 2;
    private static final int cfr_renamed_2 = 1;
    private spromp cfr_renamed_3;
    private static final int cfr_renamed_4 = 4;

    public sprquo(spromp spromp2) {
        this.cfr_renamed_3 = spromp2;
    }

    public static sprquo cfr_renamed_15088(sprmzo arg0) {
        arg0.cfr_renamed_13218();
        int n = arg0.cfr_renamed_13218() & 0xFFFF;
        spromp spromp2 = new spromp();
        int n2 = 0;
        int n3 = n2;
        while (n3 < n) {
            sprmzo sprmzo2 = arg0;
            long l = sprmzo2.cfr_renamed_14060().cfr_renamed_3274();
            sprmzo2.cfr_renamed_13218();
            sprmzo sprmzo3 = arg0;
            int n4 = sprmzo3.cfr_renamed_13218() & 0xFFFF;
            int n5 = sprmzo3.cfr_renamed_13218() & 0xFFFF;
            boolean bl = sproup.cfr_renamed_18576(n5, 1);
            boolean bl2 = sproup.cfr_renamed_18576(n5, 2);
            boolean bl3 = sproup.cfr_renamed_18576(n5, 4);
            if ((n5 & 0xFF00) >> 8 == 0 && bl && !bl2 && !bl3) {
                sprquo.cfr_renamed_18577(arg0, spromp2);
            }
            arg0.cfr_renamed_14060().cfr_renamed_11548(l + (long)n4);
            n3 = ++n2;
        }
        return new sprquo(spromp2);
    }

    public sprquo() {
        this(new spromp());
    }

    private static /* synthetic */ void cfr_renamed_18577(sprmzo arg0, spromp arg1) {
        sprmzo sprmzo2 = arg0;
        int n = sprmzo2.cfr_renamed_13218() & 0xFFFF;
        sprmzo2.cfr_renamed_13218();
        arg0.cfr_renamed_13218();
        arg0.cfr_renamed_13218();
        int n2 = 0;
        int n3 = n2;
        while (n3 < n) {
            sprmzo sprmzo3 = arg0;
            int n4 = sprmzo3.cfr_renamed_13218() & 0xFFFF;
            int n5 = sprmzo3.cfr_renamed_13218() & 0xFFFF;
            short s = sprmzo3.cfr_renamed_12254();
            arg1.cfr_renamed_18017(new sprwso(n4, n5), s);
            n3 = ++n2;
        }
    }

    public spromp cfr_renamed_18423() {
        return this.cfr_renamed_3;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 4;
        int cfr_ignored_0 = 4 << 4;
        int n4 = n2;
        int n5 = 5 << 3 ^ (2 ^ 5);
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

