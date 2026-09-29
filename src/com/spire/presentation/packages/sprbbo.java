/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprczn;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprjun;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprbbo
extends sprjun {
    private sprpdja cfr_renamed_132;
    private byte[] cfr_renamed_102;
    private static final int cfr_renamed_93 = 12;
    private static final int cfr_renamed_86 = 257;
    private int[] cfr_renamed_152;
    private sprczn cfr_renamed_112;
    private int[] cfr_renamed_119;
    private static final int cfr_renamed_91 = 256;
    private static final int cfr_renamed_0 = 5021;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private static final int cfr_renamed_3 = -1;
    private int cfr_renamed_4;

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_14257() {
        var3_1 = 258;
        var2_2 = this.cfr_renamed_132.cfr_renamed_12137();
        if (var2_2 == -1) {
            var2_2 = 257;
        }
        this.cfr_renamed_14911(256);
        while ((var1_3 = this.cfr_renamed_132.cfr_renamed_12137()) != -1) {
            var4_4 = this.cfr_renamed_14912(var2_2, var1_3);
            if (var3_1 != 1 << this.cfr_renamed_4) ** GOTO lbl18
            if (this.cfr_renamed_4 < 12) {
                v0 = this;
                v1 = v0;
                ++v0.cfr_renamed_4;
            } else {
                var3_1 = 258;
                this.cfr_renamed_14913();
                this.cfr_renamed_14911(256);
                this.cfr_renamed_4 = 9;
lbl18:
                // 2 sources

                v1 = this;
            }
            if (v1.cfr_renamed_152[var4_4] != -1) {
                var2_2 = this.cfr_renamed_152[var4_4];
                continue;
            }
            v2 = this;
            v2.cfr_renamed_152[var4_4] = var3_1++;
            v2.cfr_renamed_119[var4_4] = var2_2;
            v2.cfr_renamed_102[var4_4] = (byte)var1_3;
            v2.cfr_renamed_14911(var2_2);
            var2_2 = var1_3;
        }
        v3 = this;
        v3.cfr_renamed_14911(var2_2);
        v3.cfr_renamed_14911(257);
        this.cfr_renamed_14914();
    }

    /*
     * WARNING - void declaration
     */
    public sprbbo(spreen spreen2, int n, int n2, int n3, int n4) {
        this((spreen)arg0);
        void arg0;
        if (n != 1) {
            void arg4;
            void arg3;
            void arg2;
            void arg1;
            sprbbo sprbbo2 = this;
            sprbbo2.cfr_renamed_112 = new sprczn((int)arg1, (int)arg2, (int)arg3, (int)arg4);
            return;
        }
        this.cfr_renamed_112 = null;
    }

    private /* synthetic */ void cfr_renamed_14915() {
        sprbbo sprbbo2 = this;
        this.cfr_renamed_1 = 0;
        sprbbo2.cfr_renamed_2 = 128;
        sprbbo2.cfr_renamed_4 = 9;
    }

    private /* synthetic */ int cfr_renamed_14912(int arg0, int arg1) {
        int n = arg1 << this.cfr_renamed_4 - 8 ^ arg0;
        int n2 = n == 0 ? 1 : 5021 - n;
        block0: while (true) {
            sprbbo sprbbo2 = this;
            while (true) {
                if (sprbbo2.cfr_renamed_152[n] == -1 || this.cfr_renamed_119[n] == arg0 && this.cfr_renamed_102[n] == (byte)arg1) {
                    return n;
                }
                if ((n -= n2) >= 0) continue block0;
                sprbbo2 = this;
                n += 5021;
            }
            break;
        }
    }

    private /* synthetic */ void cfr_renamed_14913() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_152.length) {
            this.cfr_renamed_152[n++] = -1;
            n2 = n;
        }
    }

    private /* synthetic */ void cfr_renamed_14914() {
        if (this.cfr_renamed_2 != 128) {
            super.cfr_renamed_470().cfr_renamed_11594((byte)this.cfr_renamed_1);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprbbo(spreen spreen2) {
        void arg0;
        sprbbo sprbbo2 = this;
        super((spreen)arg0);
        this.cfr_renamed_152 = new int[5021];
        sprbbo2.cfr_renamed_119 = new int[5021];
        sprbbo2.cfr_renamed_102 = new byte[5021];
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_14911(int n) {
        int n2;
        int n3 = n2 = 1 << this.cfr_renamed_4 - 1;
        while (n3 != 0) {
            void arg0;
            this.cfr_renamed_14916((n2 & arg0) != 0);
            n3 = n2 >> 1;
        }
    }

    @Override
    public void cfr_renamed_4924(byte[] arg0, int arg1, int arg2) {
        sprbbo sprbbo2;
        if (this.cfr_renamed_112 != null) {
            sprbbo sprbbo3 = this;
            sprbbo2 = sprbbo3;
            sprbbo3.cfr_renamed_132 = sprbbo3.cfr_renamed_112.cfr_renamed_14907(new sprpdja(arg0, arg1, arg2));
            sprbbo3.cfr_renamed_132.cfr_renamed_11548(0L);
        } else {
            sprbbo2 = this;
            this.cfr_renamed_132 = new sprpdja(arg0, arg1, arg2);
        }
        sprbbo2.cfr_renamed_14915();
        sprbbo sprbbo4 = this;
        sprbbo4.cfr_renamed_14913();
        sprbbo4.cfr_renamed_14257();
    }

    private /* synthetic */ void cfr_renamed_14916(boolean arg0) {
        if (arg0) {
            this.cfr_renamed_1 |= this.cfr_renamed_2;
        }
        sprbbo sprbbo2 = this;
        sprbbo2.cfr_renamed_2 >>= 1;
        if (sprbbo2.cfr_renamed_2 == 0) {
            sprbbo sprbbo3 = this;
            super.cfr_renamed_470().cfr_renamed_11594((byte)this.cfr_renamed_1);
            sprbbo3.cfr_renamed_1 = 0;
            sprbbo3.cfr_renamed_2 = 128;
        }
    }
}

