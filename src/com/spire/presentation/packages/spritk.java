/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcma;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprut;
import com.spire.presentation.packages.spryoy;

public final class spritk
implements sprut {
    private final byte[] cfr_renamed_91;
    private final byte[] cfr_renamed_0;
    private final boolean cfr_renamed_1;
    private final int cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private static final int cfr_renamed_4 = -1;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spritk(byte[] byArray, byte[] byArray2, byte[] byArray3, int n, boolean bl) {
        void arg4;
        spritk spritk2;
        void arg1;
        void arg3;
        spritk spritk3;
        void arg2;
        void arg0;
        if (byArray == null) {
            throw new IllegalArgumentException(sprcma.cfr_renamed_9("\u0006Z\f>\u0001Z5\u001f6\u000f.\b\"\tg1.Zo\u001bg\t\"\u001f#Sg\u001b4Z.\u00147\u000f3"));
        }
        this.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg0);
        if (arg2 == null) {
            spritk3 = this;
            this.cfr_renamed_91 = new byte[0];
        } else {
            spritk3 = this;
            this.cfr_renamed_91 = sproze.cfr_renamed_158((byte[])arg2);
        }
        spritk3.cfr_renamed_2 = arg3;
        if (arg1 == null) {
            spritk2 = this;
            this.cfr_renamed_0 = new byte[0];
        } else {
            spritk2 = this;
            this.cfr_renamed_0 = sproze.cfr_renamed_158((byte[])arg1);
        }
        spritk2.cfr_renamed_1 = arg4;
    }

    public int cfr_renamed_3353() {
        return this.cfr_renamed_2;
    }

    public static spritk cfr_renamed_3352(byte[] arg0, byte[] arg1, byte[] arg2, int arg3) {
        if (arg3 != 8 && arg3 != 16 && arg3 != 24 && arg3 != 32) {
            throw new IllegalArgumentException(spryoy.cfr_renamed_9("\u0016l4n.azf<)9f/g.l())a5|6mzk?)b%z8l%z;n)5{z:h"));
        }
        return new spritk(arg0, arg1, arg2, arg3, true);
    }

    public byte[] cfr_renamed_3356() {
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_1205() {
        return this.cfr_renamed_0;
    }

    public static spritk cfr_renamed_3354(byte[] arg0, byte[] arg1, byte[] arg2) {
        return new spritk(arg0, arg1, arg2, -1, false);
    }

    public boolean cfr_renamed_3355() {
        return this.cfr_renamed_1;
    }

    public byte[] cfr_renamed_3357() {
        return sproze.cfr_renamed_158(this.cfr_renamed_91);
    }
}

