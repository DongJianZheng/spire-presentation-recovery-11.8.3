/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfgja;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprup;

@sprtea
public class sprobn
implements sprup {
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public int cfr_renamed_1942() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_12758() {
        sprpdja sprpdja2 = new sprpdja(this.cfr_renamed_3);
        sprfgja sprfgja2 = new sprfgja(sprpdja2);
        try {
            short s = 0;
            int n = 0;
            sprfgja sprfgja3 = sprfgja2;
            sprfgja sprfgja4 = sprfgja2;
            sprfgja sprfgja5 = sprfgja2;
            sprfgja sprfgja6 = sprfgja2;
            sprfgja2.cfr_renamed_11594((byte)66);
            sprfgja6.cfr_renamed_11594((byte)77);
            n = this.cfr_renamed_2;
            sprfgja5.cfr_renamed_12761(n);
            n = 0;
            sprfgja6.cfr_renamed_12761(0);
            n = 54;
            sprfgja5.cfr_renamed_12761(54);
            n = 40;
            sprfgja5.cfr_renamed_12761(40);
            n = this.cfr_renamed_1942();
            sprfgja4.cfr_renamed_12761(n);
            n = this.cfr_renamed_1452();
            sprfgja3.cfr_renamed_12761(-n);
            s = 1;
            sprfgja4.cfr_renamed_12762((short)1);
            s = 32;
            sprfgja3.cfr_renamed_12762((short)32);
            n = 0;
            sprfgja3.cfr_renamed_12761(0);
            n = 0;
            sprfgja3.cfr_renamed_12761(0);
            sprfgja3.cfr_renamed_12761(n);
            sprfgja3.cfr_renamed_12761(n);
            sprfgja3.cfr_renamed_12761(n);
            sprfgja3.cfr_renamed_12761(n);
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

    public sprobn(int arg0, int arg1) {
        sprobn sprobn2 = this;
        sprobn sprobn3 = this;
        sprobn3.cfr_renamed_1 = arg0;
        sprobn3.cfr_renamed_4 = arg1;
        this.cfr_renamed_2 = sprobn2.cfr_renamed_1942() * this.cfr_renamed_1452() * 4 + 54;
        sprobn2.cfr_renamed_3 = new byte[sprobn2.cfr_renamed_2];
        sprobn2.cfr_renamed_12758();
    }

    @Override
    public int cfr_renamed_1452() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_12760(int arg0, int arg1, byte arg2, byte arg3, byte arg4) {
        int n = (arg1 * this.cfr_renamed_4 + arg0) * 4 + 54;
        sprobn sprobn2 = this;
        sprobn2.cfr_renamed_3[n] = arg2;
        sprobn2.cfr_renamed_3[n + 1] = arg3;
        sprobn2.cfr_renamed_3[n + 2] = arg4;
        sprobn2.cfr_renamed_3[n + 3] = -1;
    }

    @Override
    public byte[] cfr_renamed_12759() {
        return this.cfr_renamed_3;
    }
}

