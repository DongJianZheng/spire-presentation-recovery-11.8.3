/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprigm;
import java.util.Vector;

public class sprmcm {
    private Vector cfr_renamed_4;

    public sprmcm cfr_renamed_11143(sprigm arg0) {
        sprmcm sprmcm2 = this;
        sprmcm2.cfr_renamed_4.addElement(arg0);
        return sprmcm2;
    }

    public spraem cfr_renamed_1451() {
        int n;
        sprigm[] sprigmArray = new sprigm[this.cfr_renamed_4.size()];
        int n2 = n = 0;
        while (n2 != sprigmArray.length) {
            int n3 = n++;
            sprigmArray[n3] = (sprigm)this.cfr_renamed_4.elementAt(n3);
            n2 = n;
        }
        return new spraem(sprigmArray);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 4 << 4 ^ 5;
        int n4 = n2;
        int n5 = (2 ^ 5) << 3;
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

    public sprmcm() {
        sprmcm sprmcm2 = this;
        sprmcm2.cfr_renamed_4 = new Vector();
    }

    public sprmcm cfr_renamed_11144(spraem arg0) {
        int n;
        sprigm[] sprigmArray = arg0.cfr_renamed_289();
        int n2 = n = 0;
        while (n2 != sprigmArray.length) {
            this.cfr_renamed_4.addElement(sprigmArray[n++]);
            n2 = n;
        }
        return this;
    }
}

