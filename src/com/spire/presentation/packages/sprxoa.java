/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjta;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprmpa;
import com.spire.presentation.packages.sprxta;
import java.security.spec.KeySpec;

public class sprxoa
implements KeySpec {
    private sprkqa cfr_renamed_112;
    private int cfr_renamed_119;
    private sprmpa cfr_renamed_91;
    private sprxta[] cfr_renamed_0;
    private int cfr_renamed_1;
    private String cfr_renamed_2;
    private sprjta cfr_renamed_3;
    private sprxta cfr_renamed_4;

    public sprxta[] cfr_renamed_1148() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprxoa(String string, int n, int n2, sprmpa sprmpa2, sprxta sprxta2, sprkqa sprkqa2, sprjta sprjta2, sprxta[] sprxtaArray) {
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprxoa sprxoa2 = this;
        sprxoa sprxoa3 = this;
        sprxoa sprxoa4 = this;
        sprxoa sprxoa5 = this;
        sprxoa5.cfr_renamed_2 = arg0;
        sprxoa5.cfr_renamed_119 = arg1;
        sprxoa4.cfr_renamed_1 = arg2;
        sprxoa4.cfr_renamed_91 = arg3;
        sprxoa3.cfr_renamed_4 = arg4;
        sprxoa3.cfr_renamed_112 = arg5;
        sprxoa2.cfr_renamed_3 = arg6;
        sprxoa2.cfr_renamed_0 = sprxtaArray;
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_119;
    }

    public sprjta cfr_renamed_1153() {
        return this.cfr_renamed_3;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 << 2 ^ 1);
        int cfr_ignored_0 = 5 << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 1;
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

    public sprkqa cfr_renamed_1155() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    public sprxoa(String string, int n, int n2, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4, byte[][] byArray5) {
        void arg7;
        int n3;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprxoa sprxoa2 = this;
        sprxoa sprxoa3 = this;
        this.cfr_renamed_2 = arg0;
        sprxoa3.cfr_renamed_119 = arg1;
        sprxoa3.cfr_renamed_1 = arg2;
        sprxoa sprxoa4 = this;
        sprxoa3.cfr_renamed_91 = new sprmpa((byte[])arg3);
        sprxoa4.cfr_renamed_4 = new sprxta(this.cfr_renamed_91, (byte[])arg4);
        sprxoa2.cfr_renamed_112 = new sprkqa((byte[])arg5);
        sprxoa2.cfr_renamed_3 = new sprjta((byte[])arg6);
        sprxoa2.cfr_renamed_0 = new sprxta[byArray5.length];
        int n4 = n3 = 0;
        while (n4 < ((void)arg7).length) {
            int n5 = n3;
            sprxta sprxta2 = new sprxta(this.cfr_renamed_91, (byte[])arg7[n3]);
            this.cfr_renamed_0[n5] = sprxta2;
            n4 = ++n3;
        }
    }

    public sprmpa cfr_renamed_845() {
        return this.cfr_renamed_91;
    }

    public sprxta cfr_renamed_1147() {
        return this.cfr_renamed_4;
    }

    public String cfr_renamed_1143() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_1;
    }
}

