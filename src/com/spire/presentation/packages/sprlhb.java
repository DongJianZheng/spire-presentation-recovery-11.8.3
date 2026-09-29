/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcza;
import com.spire.presentation.packages.sprfcb;
import com.spire.presentation.packages.sprjta;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprmpa;
import com.spire.presentation.packages.sprxta;

public class sprlhb
extends sprcza {
    private sprmpa cfr_renamed_112;
    private sprkqa cfr_renamed_119;
    private sprxta[] cfr_renamed_91;
    private sprxta cfr_renamed_0;
    private String cfr_renamed_1;
    private int cfr_renamed_2;
    private sprjta cfr_renamed_3;
    private int cfr_renamed_4;

    public sprxta cfr_renamed_1147() {
        return this.cfr_renamed_0;
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_2;
    }

    public sprxta[] cfr_renamed_1148() {
        return this.cfr_renamed_91;
    }

    public sprjta cfr_renamed_1153() {
        return this.cfr_renamed_3;
    }

    public sprmpa cfr_renamed_845() {
        return this.cfr_renamed_112;
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_4;
    }

    public sprkqa cfr_renamed_1155() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sprlhb(String string, int n, int n2, sprmpa sprmpa2, sprxta sprxta2, sprkqa sprkqa2, sprjta sprjta2, sprxta[] sprxtaArray, sprfcb sprfcb2) {
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        void arg8;
        sprlhb sprlhb2 = this;
        sprlhb sprlhb3 = this;
        sprlhb sprlhb4 = this;
        sprlhb sprlhb5 = this;
        super(true, (sprfcb)arg8);
        sprlhb5.cfr_renamed_1 = arg0;
        sprlhb5.cfr_renamed_2 = arg1;
        sprlhb4.cfr_renamed_4 = arg2;
        sprlhb4.cfr_renamed_112 = arg3;
        sprlhb3.cfr_renamed_0 = arg4;
        sprlhb3.cfr_renamed_119 = arg5;
        sprlhb2.cfr_renamed_3 = arg6;
        sprlhb2.cfr_renamed_91 = sprxtaArray;
    }

    public String cfr_renamed_1143() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprlhb(String string, int n, int n2, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4, byte[][] byArray5, sprfcb sprfcb2) {
        void arg7;
        int n3;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        void arg8;
        sprlhb sprlhb2 = this;
        sprlhb sprlhb3 = this;
        super(true, (sprfcb)arg8);
        this.cfr_renamed_1 = arg0;
        sprlhb3.cfr_renamed_2 = arg1;
        sprlhb3.cfr_renamed_4 = arg2;
        sprlhb sprlhb4 = this;
        sprlhb3.cfr_renamed_112 = new sprmpa((byte[])arg3);
        sprlhb4.cfr_renamed_0 = new sprxta(this.cfr_renamed_112, (byte[])arg4);
        sprlhb2.cfr_renamed_119 = new sprkqa((byte[])arg5);
        sprlhb2.cfr_renamed_3 = new sprjta((byte[])arg6);
        sprlhb2.cfr_renamed_91 = new sprxta[byArray5.length];
        int n4 = n3 = 0;
        while (n4 < ((void)arg7).length) {
            int n5 = n3;
            sprxta sprxta2 = new sprxta(this.cfr_renamed_112, (byte[])arg7[n3]);
            this.cfr_renamed_91[n5] = sprxta2;
            n4 = ++n3;
        }
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_0.cfr_renamed_813();
    }
}

