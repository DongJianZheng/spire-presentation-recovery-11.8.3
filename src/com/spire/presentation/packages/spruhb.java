/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdcb;
import com.spire.presentation.packages.sprfbb;
import com.spire.presentation.packages.sprjta;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprmpa;
import com.spire.presentation.packages.sprxta;

public class spruhb
extends sprfbb {
    private sprjta cfr_renamed_86;
    private int cfr_renamed_152;
    private sprmpa cfr_renamed_112;
    private sprxta cfr_renamed_119;
    private sprkqa cfr_renamed_91;
    private sprxta[] cfr_renamed_0;
    private String cfr_renamed_1;
    private sprjta cfr_renamed_2;
    private sprkqa cfr_renamed_3;
    private int cfr_renamed_4;

    public sprmpa cfr_renamed_845() {
        return this.cfr_renamed_112;
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_4;
    }

    public sprkqa cfr_renamed_1152() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public spruhb(String string, int n, int n2, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4, byte[] byArray5, byte[] byArray6, byte[][] byArray7, sprdcb sprdcb2) {
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
        void arg10;
        spruhb spruhb2 = this;
        spruhb spruhb3 = this;
        spruhb spruhb4 = this;
        super(true, (sprdcb)arg10);
        this.cfr_renamed_1 = arg0;
        spruhb4.cfr_renamed_152 = arg1;
        spruhb4.cfr_renamed_4 = arg2;
        spruhb spruhb5 = this;
        spruhb3.cfr_renamed_112 = new sprmpa((byte[])arg3);
        spruhb5.cfr_renamed_119 = new sprxta(this.cfr_renamed_112, (byte[])arg4);
        spruhb3.cfr_renamed_86 = new sprjta((byte[])arg5);
        spruhb3.cfr_renamed_91 = new sprkqa((byte[])arg6);
        spruhb2.cfr_renamed_3 = new sprkqa((byte[])arg7);
        spruhb2.cfr_renamed_2 = new sprjta((byte[])arg8);
        spruhb2.cfr_renamed_0 = new sprxta[byArray7.length];
        int n4 = n3 = 0;
        while (n4 < ((void)arg9).length) {
            int n5 = n3;
            sprxta sprxta2 = new sprxta(this.cfr_renamed_112, (byte[])arg9[n3]);
            this.cfr_renamed_0[n5] = sprxta2;
            n4 = ++n3;
        }
    }

    public sprkqa cfr_renamed_1151() {
        return this.cfr_renamed_3;
    }

    public String cfr_renamed_1143() {
        return this.cfr_renamed_1;
    }

    public sprjta cfr_renamed_1153() {
        return this.cfr_renamed_2;
    }

    public sprjta cfr_renamed_1149() {
        return this.cfr_renamed_86;
    }

    /*
     * WARNING - void declaration
     */
    public spruhb(String string, int n, int n2, sprmpa sprmpa2, sprxta sprxta2, sprjta sprjta2, sprkqa sprkqa2, sprkqa sprkqa3, sprjta sprjta3, sprxta[] sprxtaArray, sprdcb sprdcb2) {
        void arg8;
        void arg7;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg1;
        void arg2;
        void arg0;
        void arg10;
        spruhb spruhb2 = this;
        spruhb spruhb3 = this;
        spruhb spruhb4 = this;
        spruhb spruhb5 = this;
        spruhb spruhb6 = this;
        super(true, (sprdcb)arg10);
        spruhb6.cfr_renamed_1 = arg0;
        spruhb6.cfr_renamed_4 = arg2;
        spruhb5.cfr_renamed_152 = arg1;
        spruhb5.cfr_renamed_112 = arg3;
        spruhb4.cfr_renamed_119 = arg4;
        spruhb4.cfr_renamed_86 = arg5;
        spruhb3.cfr_renamed_91 = arg6;
        spruhb3.cfr_renamed_3 = arg7;
        spruhb2.cfr_renamed_2 = arg8;
        spruhb2.cfr_renamed_0 = sprxtaArray;
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_152;
    }

    public sprxta cfr_renamed_1147() {
        return this.cfr_renamed_119;
    }

    public sprxta[] cfr_renamed_1148() {
        return this.cfr_renamed_0;
    }
}

