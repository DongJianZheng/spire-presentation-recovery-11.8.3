/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprlbd;
import com.spire.presentation.packages.sprnil;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrgl;

public class sproel
extends sprnil {
    private static final byte[] cfr_renamed_3 = new byte[100];
    private final byte[] cfr_renamed_4;

    @Override
    public int cfr_renamed_6410(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_4 != null) {
            if (this.cfr_renamed_4 == false) {
                this.cfr_renamed_10486(0, 2);
            }
            this.cfr_renamed_3800(arg0, arg1, (long)arg2 * 8L);
            return arg2;
        }
        return super.cfr_renamed_6410(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sproel(sproel sproel2) {
        super((sprnil)arg0);
        void arg0;
        this.cfr_renamed_4 = sproze.cfr_renamed_158(sproel2.cfr_renamed_4);
    }

    private /* synthetic */ void cfr_renamed_10532() {
        sproel sproel2 = this;
        int n = sproel2.cfr_renamed_0 / 8;
        sproel sproel3 = this;
        sproel3.cfr_renamed_10507(sproel2.cfr_renamed_4, 0, sproel3.cfr_renamed_4.length);
        int n2 = this.cfr_renamed_4.length % n;
        if (n2 != 0) {
            int n3;
            int n4 = n3 = n - n2;
            while (n4 > cfr_renamed_3.length) {
                this.cfr_renamed_10507(cfr_renamed_3, 0, cfr_renamed_3.length);
                n4 = n3 - cfr_renamed_3.length;
            }
            this.cfr_renamed_10507(cfr_renamed_3, 0, n3);
        }
    }

    private /* synthetic */ byte[] cfr_renamed_10533(byte[] arg0) {
        if (arg0 == null || arg0.length == 0) {
            return sprrgl.cfr_renamed_10114(0L);
        }
        return sproze.cfr_renamed_543(sprrgl.cfr_renamed_10114((long)arg0.length * 8L), arg0);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, sprlbd.cfr_renamed_9("\u0007%\f7\u000f3")).append(this.cfr_renamed_1).toString();
    }

    /*
     * WARNING - void declaration
     */
    public sproel(int n, spriil spriil2, byte[] byArray, byte[] byArray2) {
        super((int)arg0, (spriil)arg1);
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        if (!(byArray != null && ((void)arg2).length != 0 || arg3 != null && ((void)arg3).length != 0)) {
            this.cfr_renamed_4 = null;
            return;
        }
        sproel sproel2 = this;
        this.cfr_renamed_4 = sproze.cfr_renamed_527(sprrgl.cfr_renamed_10114(sproel2.cfr_renamed_0 / 8), this.cfr_renamed_10533((byte[])arg2), this.cfr_renamed_10533((byte[])arg3));
        sproel2.cfr_renamed_10532();
    }

    public sproel(int arg0, byte[] arg1, byte[] arg2) {
        this(arg0, spriil.cfr_renamed_0, arg1, arg2);
    }

    @Override
    public void cfr_renamed_41() {
        sproel sproel2 = this;
        super.cfr_renamed_41();
        if (sproel2.cfr_renamed_4 != null) {
            this.cfr_renamed_10532();
        }
    }
}

