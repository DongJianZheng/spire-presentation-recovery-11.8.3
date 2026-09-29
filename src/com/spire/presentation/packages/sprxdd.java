/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprchm;
import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.spronb;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprqk;
import com.spire.presentation.packages.sprt;

public class sprxdd {
    public boolean cfr_renamed_91;
    public boolean cfr_renamed_0;
    public boolean cfr_renamed_1;
    public sprff cfr_renamed_2;
    public int cfr_renamed_3;
    public byte[] cfr_renamed_4;

    public int cfr_renamed_1202(int arg0) {
        return arg0 + this.cfr_renamed_3;
    }

    public sprxdd() {
    }

    /*
     * WARNING - void declaration
     */
    public sprxdd(sprff sprff2) {
        void arg0;
        sprxdd sprxdd2 = this;
        sprxdd sprxdd3 = this;
        sprxdd3.cfr_renamed_2 = arg0;
        sprxdd3.cfr_renamed_4 = new byte[arg0.cfr_renamed_1195()];
        sprxdd2.cfr_renamed_3 = 0;
        String string = sprff2.cfr_renamed_1315();
        int n = string.indexOf(47) + 1;
        boolean bl = sprxdd2.cfr_renamed_1 = n > 0 && string.startsWith(spronb.cfr_renamed_9("s\"s"), n);
        if (this.cfr_renamed_1 || arg0 instanceof sprqk) {
            this.cfr_renamed_0 = true;
            return;
        }
        this.cfr_renamed_0 = n > 0 && string.startsWith(sprchm.cfr_renamed_9(">d\u0014z!S!"), n);
    }

    public void cfr_renamed_41() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            this.cfr_renamed_4[n++] = 0;
            n2 = n;
        }
        this.cfr_renamed_3 = 0;
        this.cfr_renamed_2.cfr_renamed_41();
    }

    public sprff cfr_renamed_2349() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprjkd, IllegalStateException, sprpjd {
        try {
            int n = 0;
            if (arg1 + this.cfr_renamed_3 > arg0.length) {
                throw new spreid(spronb.cfr_renamed_9("L\u0010W\u0015V\u0011\u0003\u0007V\u0003E\u0000QEW\nLEP\rL\u0017WEE\nQEG\ne\fM\u0004OM\n"));
            }
            if (this.cfr_renamed_3 != 0) {
                if (!this.cfr_renamed_0) {
                    throw new sprjkd(sprchm.cfr_renamed_9("\u0015u\u0005uQz\u001e`Qv\u001d{\u0012\u007fQg\u0018n\u00144\u0010x\u0018s\u001fq\u0015"));
                }
                sprxdd sprxdd2 = this;
                sprxdd2.cfr_renamed_2.cfr_renamed_3064(sprxdd2.cfr_renamed_4, 0, this.cfr_renamed_4, 0);
                sprxdd sprxdd3 = this;
                n = sprxdd3.cfr_renamed_3;
                sprxdd3.cfr_renamed_3 = 0;
                System.arraycopy(sprxdd3.cfr_renamed_4, 0, arg0, arg1, n);
            }
            int n2 = n;
            return n2;
        }
        finally {
            this.cfr_renamed_41();
        }
    }

    public int cfr_renamed_1195() {
        return this.cfr_renamed_2.cfr_renamed_1195();
    }

    public void cfr_renamed_1217(boolean arg0, sprt arg1) throws IllegalArgumentException {
        sprxdd sprxdd2 = this;
        sprxdd2.cfr_renamed_91 = arg0;
        sprxdd2.cfr_renamed_41();
        sprxdd2.cfr_renamed_2.cfr_renamed_1217(arg0, arg1);
    }

    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprjkd, IllegalStateException {
        int n = 0;
        this.cfr_renamed_4[this.cfr_renamed_3++] = arg0;
        sprxdd sprxdd2 = this;
        if (sprxdd2.cfr_renamed_3 == sprxdd2.cfr_renamed_4.length) {
            n = this.cfr_renamed_2.cfr_renamed_3064(this.cfr_renamed_4, 0, arg1, arg2);
            this.cfr_renamed_3 = 0;
        }
        return n;
    }

    public int cfr_renamed_2345(int arg0) {
        int n;
        int n2;
        int n3 = arg0 + this.cfr_renamed_3;
        if (this.cfr_renamed_1) {
            n2 = n3 % this.cfr_renamed_4.length - (this.cfr_renamed_2.cfr_renamed_1195() + 2);
            n = n3;
        } else {
            n2 = n3 % this.cfr_renamed_4.length;
            n = n3;
        }
        return n - n2;
    }

    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprjkd, IllegalStateException {
        if (arg2 < 0) {
            throw new IllegalArgumentException(spronb.cfr_renamed_9("`\u0004MBWEK\u0004U\u0000\u0003\u0004\u0003\u000bF\u0002B\u0011J\u0013FEJ\u000bS\u0010WEO\u0000M\u0002W\r\u0002"));
        }
        sprxdd sprxdd2 = this;
        int n = sprxdd2.cfr_renamed_1195();
        int n2 = sprxdd2.cfr_renamed_2345(arg2);
        if (n2 > 0 && arg4 + n2 > arg3.length) {
            throw new spreid(sprchm.cfr_renamed_9("\u001ea\u0005d\u0004`Qv\u0004r\u0017q\u00034\u0005{\u001e4\u0002|\u001ef\u0005"));
        }
        int n3 = 0;
        int n4 = this.cfr_renamed_4.length - this.cfr_renamed_3;
        if (arg2 > n4) {
            sprxdd sprxdd3 = this;
            System.arraycopy(arg0, arg1, sprxdd3.cfr_renamed_4, sprxdd3.cfr_renamed_3, n4);
            n3 += this.cfr_renamed_2.cfr_renamed_3064(this.cfr_renamed_4, 0, arg3, arg4);
            this.cfr_renamed_3 = 0;
            arg1 += n4;
            int n5 = arg2 -= n4;
            while (n5 > this.cfr_renamed_4.length) {
                n3 += this.cfr_renamed_2.cfr_renamed_3064(arg0, arg1, arg3, arg4 + n3);
                arg1 += n;
                n5 = arg2 -= n;
            }
        }
        sprxdd sprxdd4 = this;
        System.arraycopy(arg0, arg1, sprxdd4.cfr_renamed_4, sprxdd4.cfr_renamed_3, arg2);
        sprxdd sprxdd5 = this;
        sprxdd5.cfr_renamed_3 += arg2;
        if (sprxdd5.cfr_renamed_3 == this.cfr_renamed_4.length) {
            sprxdd sprxdd6 = this;
            n3 += sprxdd6.cfr_renamed_2.cfr_renamed_3064(sprxdd6.cfr_renamed_4, 0, arg3, arg4 + n3);
            this.cfr_renamed_3 = 0;
        }
        return n3;
    }
}

