/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spripe;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprrica;
import com.spire.presentation.packages.sprwj;

public class sprrgk {
    private static final int cfr_renamed_93 = 4096;
    private static final long cfr_renamed_86 = 32768L;
    private final byte[] cfr_renamed_152;
    private final sprmr cfr_renamed_112;
    private static final long cfr_renamed_119 = 0x800000L;
    private static final int cfr_renamed_91 = 262144;
    private final byte[] cfr_renamed_0;
    private long cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private final sprwj cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_9955(byte[] arg0) {
        int n;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            int n3 = n--;
            arg0[n3] = (byte)(arg0[n3] + 1);
            if (arg0[n3] != 0) {
                return;
            }
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprrgk(sprmr sprmr2, byte[] byArray, sprwj sprwj2) {
        void arg2;
        void arg0;
        sprrgk sprrgk2 = this;
        sprrgk sprrgk3 = this;
        sprrgk3.cfr_renamed_1 = 1L;
        sprrgk3.cfr_renamed_112 = arg0;
        sprrgk2.cfr_renamed_3 = arg2;
        sprrgk2.cfr_renamed_152 = new byte[arg0.cfr_renamed_1195()];
        System.arraycopy(byArray, 0, this.cfr_renamed_152, 0, this.cfr_renamed_152.length);
        sprrgk sprrgk4 = this;
        sprrgk4.cfr_renamed_4 = new byte[arg0.cfr_renamed_1195()];
        sprrgk4.cfr_renamed_0 = new byte[arg0.cfr_renamed_1195()];
    }

    public sprwj cfr_renamed_9952() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_9954() {
        sprrgk sprrgk2 = this;
        sprrgk2.cfr_renamed_2 = sprrgk2.cfr_renamed_3.cfr_renamed_3300();
        if (sprrgk2.cfr_renamed_2.length != this.cfr_renamed_112.cfr_renamed_1195()) {
            throw new IllegalStateException(sprrica.cfr_renamed_9("k3Q(D;K>K8L)\u00028L)P2R$\u0002/G)W/L8F"));
        }
        this.cfr_renamed_1 = 1L;
    }

    private static /* synthetic */ boolean cfr_renamed_3306(byte[] arg0, int arg1) {
        return arg0 != null && arg0.length > arg1;
    }

    private /* synthetic */ void cfr_renamed_9956(byte[] arg0, byte[] arg1, byte[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = n;
            byte by = (byte)(arg1[n] ^ arg2[n3]);
            arg0[n3] = by;
            n2 = ++n;
        }
        this.cfr_renamed_112.cfr_renamed_3064(arg0, 0, arg0, 0);
    }

    public int cfr_renamed_9953(byte[] arg0, boolean arg1) {
        int n;
        if (this.cfr_renamed_0.length == 8) {
            if (this.cfr_renamed_1 > 32768L) {
                return -1;
            }
            if (sprrgk.cfr_renamed_3306(arg0, 512)) {
                throw new IllegalArgumentException(spripe.cfr_renamed_9("v>U)]9\u0018$^kZ\"L8\u0018;]9\u00189]:M.K?\u0018'Q&Q?]/\u0018?Wk\f{\u0001}"));
            }
        } else {
            if (this.cfr_renamed_1 > 0x800000L) {
                return -1;
            }
            if (sprrgk.cfr_renamed_3306(arg0, 32768)) {
                throw new IllegalArgumentException(sprrica.cfr_renamed_9("\u0013W0@8P}M;\u0002?K)Q}R8P}P8S(G.V}N4O4V8F}V2\u0002o\u0014o\u0013i\u0016"));
            }
        }
        if (arg1 || this.cfr_renamed_2 == null) {
            sprrgk sprrgk2 = this;
            sprrgk2.cfr_renamed_2 = sprrgk2.cfr_renamed_3.cfr_renamed_3300();
            if (sprrgk2.cfr_renamed_2.length != this.cfr_renamed_112.cfr_renamed_1195()) {
                throw new IllegalStateException(spripe.cfr_renamed_9("\u0002V8M-^\"[\"]%Lk]%L9W;AkJ.L>J%]/"));
            }
        }
        int n2 = arg0.length / this.cfr_renamed_0.length;
        int n3 = n = 0;
        while (n3 < n2) {
            sprrgk sprrgk3 = this;
            sprrgk sprrgk4 = this;
            sprrgk3.cfr_renamed_112.cfr_renamed_3064(sprrgk3.cfr_renamed_152, 0, this.cfr_renamed_4, 0);
            sprrgk sprrgk5 = this;
            sprrgk sprrgk6 = this;
            sprrgk6.cfr_renamed_9956(sprrgk5.cfr_renamed_0, sprrgk5.cfr_renamed_4, sprrgk6.cfr_renamed_2);
            sprrgk sprrgk7 = this;
            sprrgk4.cfr_renamed_9956(sprrgk4.cfr_renamed_2, sprrgk7.cfr_renamed_0, sprrgk7.cfr_renamed_4);
            System.arraycopy(sprrgk4.cfr_renamed_0, 0, arg0, n * this.cfr_renamed_0.length, this.cfr_renamed_0.length);
            sprrgk sprrgk8 = this;
            sprrgk8.cfr_renamed_9955(sprrgk8.cfr_renamed_152);
            n3 = ++n;
        }
        n = arg0.length - n2 * this.cfr_renamed_0.length;
        if (n > 0) {
            sprrgk sprrgk9 = this;
            sprrgk sprrgk10 = this;
            sprrgk9.cfr_renamed_112.cfr_renamed_3064(sprrgk9.cfr_renamed_152, 0, this.cfr_renamed_4, 0);
            sprrgk sprrgk11 = this;
            sprrgk sprrgk12 = this;
            sprrgk12.cfr_renamed_9956(sprrgk11.cfr_renamed_0, sprrgk11.cfr_renamed_4, sprrgk12.cfr_renamed_2);
            sprrgk sprrgk13 = this;
            sprrgk10.cfr_renamed_9956(sprrgk10.cfr_renamed_2, sprrgk13.cfr_renamed_0, sprrgk13.cfr_renamed_4);
            System.arraycopy(sprrgk10.cfr_renamed_0, 0, arg0, n2 * this.cfr_renamed_0.length, n);
            sprrgk sprrgk14 = this;
            sprrgk14.cfr_renamed_9955(sprrgk14.cfr_renamed_152);
        }
        ++this.cfr_renamed_1;
        return arg0.length * 8;
    }
}

