/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjta;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprmpa;
import com.spire.presentation.packages.sprxta;
import java.security.spec.KeySpec;

public class spruna
implements KeySpec {
    private sprxta[] cfr_renamed_86;
    private sprkqa cfr_renamed_152;
    private int cfr_renamed_112;
    private sprkqa cfr_renamed_119;
    private int cfr_renamed_91;
    private sprmpa cfr_renamed_0;
    private sprxta cfr_renamed_1;
    private sprjta cfr_renamed_2;
    private sprjta cfr_renamed_3;
    private String cfr_renamed_4;

    public sprxta cfr_renamed_1147() {
        return this.cfr_renamed_1;
    }

    public sprxta[] cfr_renamed_1148() {
        return this.cfr_renamed_86;
    }

    /*
     * WARNING - void declaration
     */
    public spruna(String string, int n, int n2, sprmpa sprmpa2, sprxta sprxta2, sprjta sprjta2, sprkqa sprkqa2, sprkqa sprkqa3, sprjta sprjta3, sprxta[] sprxtaArray) {
        void arg8;
        void arg7;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg1;
        void arg2;
        void arg0;
        spruna spruna2 = this;
        spruna spruna3 = this;
        spruna spruna4 = this;
        spruna spruna5 = this;
        spruna spruna6 = this;
        spruna6.cfr_renamed_4 = arg0;
        spruna6.cfr_renamed_112 = arg2;
        spruna5.cfr_renamed_91 = arg1;
        spruna5.cfr_renamed_0 = arg3;
        spruna4.cfr_renamed_1 = arg4;
        spruna4.cfr_renamed_3 = arg5;
        spruna3.cfr_renamed_152 = arg6;
        spruna3.cfr_renamed_119 = arg7;
        spruna2.cfr_renamed_2 = arg8;
        spruna2.cfr_renamed_86 = sprxtaArray;
    }

    /*
     * WARNING - void declaration
     */
    public spruna(String string, int n, int n2, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4, byte[] byArray5, byte[] byArray6, byte[][] byArray7) {
        void arg9;
        int n3;
        void arg8;
        void arg7;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        spruna spruna2 = this;
        spruna spruna3 = this;
        spruna spruna4 = this;
        this.cfr_renamed_4 = arg0;
        spruna4.cfr_renamed_91 = arg1;
        spruna4.cfr_renamed_112 = arg2;
        spruna spruna5 = this;
        spruna3.cfr_renamed_0 = new sprmpa((byte[])arg3);
        spruna5.cfr_renamed_1 = new sprxta(this.cfr_renamed_0, (byte[])arg4);
        spruna3.cfr_renamed_3 = new sprjta((byte[])arg5);
        spruna3.cfr_renamed_152 = new sprkqa((byte[])arg6);
        spruna2.cfr_renamed_119 = new sprkqa((byte[])arg7);
        spruna2.cfr_renamed_2 = new sprjta((byte[])arg8);
        spruna2.cfr_renamed_86 = new sprxta[byArray7.length];
        int n4 = n3 = 0;
        while (n4 < ((void)arg9).length) {
            int n5 = n3;
            sprxta sprxta2 = new sprxta(this.cfr_renamed_0, (byte[])arg9[n3]);
            this.cfr_renamed_86[n5] = sprxta2;
            n4 = ++n3;
        }
    }

    public sprjta cfr_renamed_1149() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_112;
    }

    public sprmpa cfr_renamed_845() {
        return this.cfr_renamed_0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 ^ 5;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (3 << 2 ^ 3);
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

    public int cfr_renamed_1146() {
        return this.cfr_renamed_91;
    }

    public String cfr_renamed_1143() {
        return this.cfr_renamed_4;
    }

    public sprkqa cfr_renamed_1151() {
        return this.cfr_renamed_119;
    }

    public sprkqa cfr_renamed_1152() {
        return this.cfr_renamed_152;
    }

    public sprjta cfr_renamed_1153() {
        return this.cfr_renamed_2;
    }
}

