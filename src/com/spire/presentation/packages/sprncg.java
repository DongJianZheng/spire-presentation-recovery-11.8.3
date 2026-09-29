/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcwf;
import com.spire.presentation.packages.sprpsd;
import com.spire.presentation.packages.sprvzaa;
import com.spire.presentation.packages.sprydg;

public abstract class sprncg {
    public final int cfr_renamed_132;
    public final int cfr_renamed_102;
    public final int cfr_renamed_93;
    public final int cfr_renamed_86;
    public final int cfr_renamed_152;
    public final int cfr_renamed_112;
    public final int cfr_renamed_119;
    public final int cfr_renamed_91;
    public final int cfr_renamed_0;
    public final boolean cfr_renamed_1;
    public final int cfr_renamed_2;
    public final int cfr_renamed_3;
    public final int cfr_renamed_4;

    public abstract void cfr_renamed_148(byte[] var1);

    public abstract byte[] cfr_renamed_5993(byte[] var1, sprydg var2, byte[] var3);

    public abstract sprcwf cfr_renamed_5998(byte[] var1, byte[] var2, byte[] var3, byte[] var4);

    public abstract byte[] cfr_renamed_5991(byte[] var1, byte[] var2, sprydg var3);

    public abstract byte[] cfr_renamed_6009(byte[] var1, sprydg var2, byte[] var3, byte[] var4);

    public abstract byte[] cfr_renamed_6003(byte[] var1, byte[] var2, byte[] var3);

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public sprncg(boolean bl, int n, int n2, int n3, int n4, int n5, int n6) {
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg0;
        void arg2;
        sprncg sprncg2;
        void arg1;
        this.cfr_renamed_112 = arg1;
        if (n2 == 16) {
            this.cfr_renamed_3 = 4;
            this.cfr_renamed_4 = 8 * this.cfr_renamed_112 / this.cfr_renamed_3;
            if (this.cfr_renamed_112 <= 8) {
                sprncg2 = this;
                this.cfr_renamed_132 = 2;
            } else if (this.cfr_renamed_112 <= 136) {
                sprncg2 = this;
                this.cfr_renamed_132 = 3;
            } else {
                if (this.cfr_renamed_112 > 256) throw new IllegalArgumentException(sprpsd.cfr_renamed_9(";S6\\7FxB*W;]5B-F=\u0012\u000bb\u0000m\u000f}\fa\u0007~\u001d|j\u0012>]*\u00126\u00127G,A1V=\u0012#\u0000t\u0012v\u001ct\u0012j\u0007nO"));
                sprncg2 = this;
                this.cfr_renamed_132 = 4;
            }
        } else {
            if (arg2 != 256) throw new IllegalArgumentException(sprpsd.cfr_renamed_9("/],A\u0007ExS+A-_=Vx\u0003n\u00127@x\u0000m\u0004"));
            this.cfr_renamed_3 = 8;
            this.cfr_renamed_4 = 8 * this.cfr_renamed_112 / this.cfr_renamed_3;
            if (this.cfr_renamed_112 <= 1) {
                sprncg2 = this;
                this.cfr_renamed_132 = 1;
            } else {
                if (this.cfr_renamed_112 > 256) throw new IllegalArgumentException(sprvzaa.cfr_renamed_9("yTt[uA:EhPyZwEoA\u007f\u0015IeBjMzNfEy_{(\u0015|Zh\u0015t\u0015u@nFsQ\u007f\u0015a\u00076\u00154\u001b6\u0015(\u0000,H"));
                sprncg2 = this;
                this.cfr_renamed_132 = 2;
            }
        }
        sprncg2.cfr_renamed_119 = arg2;
        sprncg sprncg3 = this;
        sprncg sprncg4 = this;
        sprncg sprncg5 = this;
        this.cfr_renamed_2 = this.cfr_renamed_4 + this.cfr_renamed_132;
        sprncg5.cfr_renamed_1 = arg0;
        sprncg5.cfr_renamed_0 = arg3;
        sprncg4.cfr_renamed_93 = arg4;
        sprncg4.cfr_renamed_152 = arg5;
        this.cfr_renamed_91 = arg6;
        sprncg3.cfr_renamed_102 = this.cfr_renamed_91 / arg3;
        sprncg3.cfr_renamed_86 = 1 << arg4;
    }

    public abstract byte[] cfr_renamed_5994(byte[] var1, sprydg var2, byte[] var3);
}

