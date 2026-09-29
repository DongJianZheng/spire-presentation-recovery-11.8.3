/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfgja;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprup;

@sprtea
public class sprtcn
implements sprup {
    private int cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public int cfr_renamed_1452() {
        return this.cfr_renamed_4;
    }

    public sprtcn(int arg0, int arg1, int arg2) {
        int n = arg1;
        sprtcn sprtcn2 = this;
        sprtcn sprtcn3 = this;
        this.cfr_renamed_2 = 54;
        sprtcn3.cfr_renamed_1 = 96;
        sprtcn3.cfr_renamed_4 = arg0;
        sprtcn2.cfr_renamed_91 = arg1;
        sprtcn2.cfr_renamed_112 = (4 - 3 * arg1 % 4) % 4;
        this.cfr_renamed_3 = n * arg0 * 3 + arg0 * this.cfr_renamed_112;
        this.cfr_renamed_0 = n * arg0 * 3 + arg0 * this.cfr_renamed_112 + this.cfr_renamed_2;
        this.cfr_renamed_1 = arg2;
        this.cfr_renamed_119 = new byte[this.cfr_renamed_0];
        this.cfr_renamed_12758();
    }

    @Override
    public byte[] cfr_renamed_12759() {
        return this.cfr_renamed_119;
    }

    public sprtcn(int arg0, int arg1) {
        this(arg0, arg1, 96);
    }

    public void cfr_renamed_12760(int arg0, int arg1, byte arg2, byte arg3, byte arg4) {
        int n = (arg1 * this.cfr_renamed_91 + arg0) * 3 + arg1 * this.cfr_renamed_112 + this.cfr_renamed_2;
        sprtcn sprtcn2 = this;
        sprtcn2.cfr_renamed_119[n] = arg2;
        sprtcn2.cfr_renamed_119[n + 1] = arg3;
        sprtcn2.cfr_renamed_119[n + 2] = arg4;
    }

    @Override
    public int cfr_renamed_1942() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_12758() {
        sprpdja sprpdja2 = new sprpdja(this.cfr_renamed_119);
        sprfgja sprfgja2 = new sprfgja(sprpdja2);
        try {
            short s = 0;
            int n = 0;
            sprfgja sprfgja3 = sprfgja2;
            sprfgja sprfgja4 = sprfgja2;
            sprfgja sprfgja5 = sprfgja2;
            sprfgja sprfgja6 = sprfgja2;
            sprfgja sprfgja7 = sprfgja2;
            sprfgja sprfgja8 = sprfgja2;
            sprfgja2.cfr_renamed_11594((byte)66);
            sprfgja8.cfr_renamed_11594((byte)77);
            n = this.cfr_renamed_0;
            sprfgja7.cfr_renamed_12761(n);
            n = 0;
            sprfgja8.cfr_renamed_12761(0);
            n = 54;
            sprfgja7.cfr_renamed_12761(54);
            n = 40;
            sprfgja7.cfr_renamed_12761(40);
            n = this.cfr_renamed_1942();
            sprfgja6.cfr_renamed_12761(n);
            n = this.cfr_renamed_1452();
            sprfgja5.cfr_renamed_12761(-n);
            s = 1;
            sprfgja6.cfr_renamed_12762((short)1);
            s = 24;
            sprfgja5.cfr_renamed_12762((short)24);
            n = 0;
            sprfgja5.cfr_renamed_12761(0);
            n = this.cfr_renamed_3;
            sprfgja4.cfr_renamed_12761(n);
            int n2 = this.cfr_renamed_1;
            n = (int)((double)(100 * n2) / 2.54);
            sprfgja3.cfr_renamed_12761(n);
            n = (int)((double)(100 * n2) / 2.54);
            sprfgja4.cfr_renamed_12761(n);
            n = 0;
            sprfgja3.cfr_renamed_12761(0);
            n = 0;
            sprfgja3.cfr_renamed_12761(0);
            if (sprfgja2 == null) return;
            sprfgja2.cfr_renamed_2637();
            return;
        }
        catch (Throwable throwable) {
            if (sprfgja2 == null) throw throwable;
            sprfgja2.cfr_renamed_2637();
            throw throwable;
        }
    }
}

