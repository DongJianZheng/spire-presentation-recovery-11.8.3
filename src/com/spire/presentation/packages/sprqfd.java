/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgo;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprgnd;
import com.spire.presentation.packages.sprigd;
import com.spire.presentation.packages.sprlsa;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruc;

public class sprqfd
implements spruc {
    private byte[] cfr_renamed_93;
    private static final byte cfr_renamed_86 = -121;
    private byte[] cfr_renamed_152;
    private int cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private static final byte cfr_renamed_91 = 27;
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private sprff cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public void cfr_renamed_3481(sprt arg0) {
        if (arg0 != null && !(arg0 instanceof sprnld)) {
            throw new IllegalArgumentException(sprlsa.cfr_renamed_9("\u0001\u000e# b.-''c--.:b3'1/*60b(':b7-c &b0'7l"));
        }
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprbgo.cfr_renamed_9("z<WzM}Q<O8\u0019<\u00193\\:X)P+\\}P3I(M}U8W:M5\u0018"));
        }
        int n = this.cfr_renamed_2.cfr_renamed_1195();
        int n2 = n - this.cfr_renamed_0;
        if (arg2 > n2) {
            sprqfd sprqfd2 = this;
            System.arraycopy(arg0, arg1, sprqfd2.cfr_renamed_4, this.cfr_renamed_0, n2);
            sprqfd2.cfr_renamed_2.cfr_renamed_3064(this.cfr_renamed_4, 0, this.cfr_renamed_93, 0);
            this.cfr_renamed_0 = 0;
            arg1 += n2;
            int n3 = arg2 -= n2;
            while (n3 > n) {
                this.cfr_renamed_2.cfr_renamed_3064(arg0, arg1, this.cfr_renamed_93, 0);
                arg1 += n;
                n3 = arg2 -= n;
            }
        }
        sprqfd sprqfd3 = this;
        System.arraycopy(arg0, arg1, sprqfd3.cfr_renamed_4, sprqfd3.cfr_renamed_0, arg2);
        this.cfr_renamed_0 += arg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprqfd(sprff sprff2, int n) {
        void arg0;
        void arg1;
        if (n % 8 != 0) {
            throw new IllegalArgumentException(sprlsa.cfr_renamed_9("\u000e\u0003\u0000b0+9'c/617b!'c/6.7+3.&b,$cz"));
        }
        if (arg1 > arg0.cfr_renamed_1195() * 8) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprbgo.cfr_renamed_9("\u0010x\u001e\u0019.P'\\}T(J)\u0019?\\}U8J.\u00192K}\\,L<U}M2\u0019")).append(arg0.cfr_renamed_1195() * 8).toString());
        }
        if (arg0.cfr_renamed_1195() != 8 && arg0.cfr_renamed_1195() != 16) {
            throw new IllegalArgumentException(sprlsa.cfr_renamed_9("\u0001.,!(b0+9'c/617b!'c'*6+'1buvc-1brp{b!+71"));
        }
        sprqfd sprqfd2 = this;
        void v1 = arg0;
        sprqfd sprqfd3 = this;
        sprqfd3.cfr_renamed_2 = new sprgnd((sprff)arg0);
        sprqfd3.cfr_renamed_112 = arg1 / 8;
        this.cfr_renamed_93 = new byte[v1.cfr_renamed_1195()];
        sprqfd2.cfr_renamed_4 = new byte[v1.cfr_renamed_1195()];
        sprqfd2.cfr_renamed_3 = new byte[arg0.cfr_renamed_1195()];
        this.cfr_renamed_0 = 0;
    }

    public sprqfd(sprff arg0) {
        sprff sprff2 = arg0;
        this(sprff2, sprff2.cfr_renamed_1195() * 8);
    }

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_2.cfr_renamed_1315();
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            this.cfr_renamed_4[n++] = 0;
            n2 = n;
        }
        this.cfr_renamed_0 = 0;
        this.cfr_renamed_2.cfr_renamed_41();
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        int n;
        byte[] byArray;
        sprqfd sprqfd2 = this;
        int n2 = sprqfd2.cfr_renamed_2.cfr_renamed_1195();
        if (sprqfd2.cfr_renamed_0 == n2) {
            byArray = this.cfr_renamed_152;
        } else {
            sprqfd sprqfd3 = this;
            new sprigd().cfr_renamed_3210(sprqfd3.cfr_renamed_4, sprqfd3.cfr_renamed_0);
            byArray = this.cfr_renamed_1;
        }
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_93.length) {
            int n4 = n;
            byte by = (byte)(this.cfr_renamed_4[n4] ^ byArray[n]);
            this.cfr_renamed_4[n4] = by;
            n3 = ++n;
        }
        sprqfd sprqfd4 = this;
        sprqfd4.cfr_renamed_2.cfr_renamed_3064(sprqfd4.cfr_renamed_4, 0, this.cfr_renamed_93, 0);
        sprqfd sprqfd5 = this;
        System.arraycopy(sprqfd5.cfr_renamed_93, 0, arg0, arg1, this.cfr_renamed_112);
        sprqfd5.cfr_renamed_41();
        return sprqfd4.cfr_renamed_112;
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_112;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        sprqfd sprqfd2 = this;
        if (sprqfd2.cfr_renamed_0 == sprqfd2.cfr_renamed_4.length) {
            sprqfd sprqfd3 = this;
            sprqfd3.cfr_renamed_2.cfr_renamed_3064(sprqfd3.cfr_renamed_4, 0, this.cfr_renamed_93, 0);
            this.cfr_renamed_0 = 0;
        }
        this.cfr_renamed_4[this.cfr_renamed_0++] = arg0;
    }

    private static /* synthetic */ byte[] cfr_renamed_3482(byte[] arg0) {
        byte[] byArray = new byte[arg0.length];
        int n = sprqfd.cfr_renamed_3403(arg0, byArray);
        int n2 = 0xFF & (arg0.length == 16 ? -121 : 27);
        int n3 = arg0.length - 1;
        byArray[n3] = (byte)(byArray[n3] ^ n2 >>> (1 - n << 3));
        return byArray;
    }

    private static /* synthetic */ int cfr_renamed_3403(byte[] arg0, byte[] arg1) {
        int n = arg0.length;
        int n2 = 0;
        while (--n >= 0) {
            int n3 = arg0[n] & 0xFF;
            arg1[n] = (byte)(n3 << 1 | n2);
            n2 = n3 >>> 7 & 1;
        }
        return n2;
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) {
        sprqfd sprqfd2 = this;
        sprqfd2.cfr_renamed_3481(arg0);
        sprqfd2.cfr_renamed_2.cfr_renamed_1217(true, arg0);
        sprqfd2.cfr_renamed_119 = new byte[sprqfd2.cfr_renamed_3.length];
        sprqfd sprqfd3 = this;
        sprqfd3.cfr_renamed_2.cfr_renamed_3064(sprqfd3.cfr_renamed_3, 0, this.cfr_renamed_119, 0);
        sprqfd sprqfd4 = this;
        sprqfd4.cfr_renamed_152 = sprqfd.cfr_renamed_3482(sprqfd4.cfr_renamed_119);
        sprqfd4.cfr_renamed_1 = sprqfd.cfr_renamed_3482(sprqfd4.cfr_renamed_152);
        sprqfd4.cfr_renamed_41();
    }
}

