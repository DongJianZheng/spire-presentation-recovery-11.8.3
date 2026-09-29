/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprmis;
import com.spire.presentation.packages.sprped;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spryno;
import java.security.AccessController;
import java.security.SecureRandom;

public class sprpmd
implements sprh {
    public static final String cfr_renamed_152 = "org.bouncycastle.pkcs1.strict";
    private static final int cfr_renamed_112 = 10;
    private byte[] cfr_renamed_119;
    private boolean cfr_renamed_91;
    private int cfr_renamed_0;
    private boolean cfr_renamed_1;
    private sprh cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private boolean cfr_renamed_4;

    public sprh cfr_renamed_2349() {
        return this.cfr_renamed_2;
    }

    private /* synthetic */ byte[] cfr_renamed_3736(byte[] arg0, int arg1, int arg2) throws sprpjd {
        int n;
        byte[] byArray;
        if (!this.cfr_renamed_1) {
            throw new sprpjd(sprmis.cfr_renamed_9("\u001b3\u001a.\u0011pH(\u00005\u001b|\u00059\u001c4\u00078H5\u001b|\u00072\u0004%H:\u0007.H8\r?\u001a%\u0018(\u00013\u0006pH2\u0007(H:\u0007.H/\u0001;\u00065\u0006;"));
        }
        sprpmd sprpmd2 = this;
        byte[] byArray2 = sprpmd2.cfr_renamed_2.cfr_renamed_1337(arg0, arg1, arg2);
        byte[] byArray3 = null;
        if (sprpmd2.cfr_renamed_119 == null) {
            sprpmd sprpmd3 = this;
            byArray3 = new byte[sprpmd3.cfr_renamed_0];
            sprpmd3.cfr_renamed_3.nextBytes(byArray3);
            byArray = byArray2;
        } else {
            byArray3 = this.cfr_renamed_119;
            byArray = byArray2;
        }
        if (byArray.length < this.cfr_renamed_1339()) {
            throw new sprpjd(spryno.cfr_renamed_9("$\u007f)p-32a3}%r2v\""));
        }
        if (this.cfr_renamed_4 && byArray2.length != this.cfr_renamed_2.cfr_renamed_1339()) {
            throw new sprpjd(sprmis.cfr_renamed_9("\n0\u0007?\u0003|\u00012\u000b3\u001a.\r?\u001c|\u001b5\u00129"));
        }
        int n2 = sprpmd.cfr_renamed_3737(byArray2, this.cfr_renamed_0);
        byte[] byArray4 = new byte[this.cfr_renamed_0];
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_0) {
            int n4 = n;
            byte by = (byte)(byArray2[n4 + (byArray2.length - this.cfr_renamed_0)] & ~n2 | byArray3[n] & n2);
            byArray4[n4] = by;
            n3 = ++n;
        }
        return byArray4;
    }

    /*
     * WARNING - void declaration
     */
    public sprpmd(sprh sprh2, int n) {
        void arg0;
        sprpmd sprpmd2 = this;
        this.cfr_renamed_0 = -1;
        sprpmd2.cfr_renamed_119 = null;
        sprpmd2.cfr_renamed_2 = arg0;
        this.cfr_renamed_4 = this.cfr_renamed_3738();
        this.cfr_renamed_0 = n;
    }

    /*
     * WARNING - void declaration
     */
    public sprpmd(sprh sprh2, byte[] byArray) {
        void arg1;
        void arg0;
        sprpmd sprpmd2 = this;
        sprpmd sprpmd3 = this;
        this.cfr_renamed_0 = -1;
        this.cfr_renamed_119 = null;
        sprpmd3.cfr_renamed_2 = arg0;
        sprpmd3.cfr_renamed_4 = this.cfr_renamed_3738();
        sprpmd2.cfr_renamed_119 = arg1;
        sprpmd2.cfr_renamed_0 = byArray.length;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        sprpmd sprpmd2;
        sprhgb sprhgb2;
        if (arg1 instanceof spraed) {
            spraed spraed2;
            spraed spraed3 = spraed2 = (spraed)arg1;
            this.cfr_renamed_3 = spraed3.cfr_renamed_1295();
            sprhgb2 = (sprhgb)spraed3.cfr_renamed_284();
            sprpmd2 = this;
        } else {
            this.cfr_renamed_3 = new SecureRandom();
            sprhgb2 = (sprhgb)arg1;
            sprpmd2 = this;
        }
        sprpmd2.cfr_renamed_2.cfr_renamed_1217(arg0, arg1);
        sprpmd sprpmd3 = this;
        sprpmd3.cfr_renamed_1 = sprhgb2.cfr_renamed_1352();
        sprpmd3.cfr_renamed_91 = arg0;
    }

    private static /* synthetic */ int cfr_renamed_3737(byte[] arg0, int arg1) {
        int n;
        int n2 = 0;
        n2 = 0 | arg0[0] ^ 2;
        int n3 = arg0.length - (arg1 + 1);
        int n4 = n = 1;
        while (n4 < n3) {
            int n5 = arg0[n];
            n5 |= n5 >> 1;
            n5 |= n5 >> 2;
            n5 |= n5 >> 4;
            n2 |= (n5 & 1) - 1;
            n4 = ++n;
        }
        n2 |= arg0[arg0.length - (arg1 + 1)];
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        return ~((n2 & 1) - 1);
    }

    public sprpmd(sprh arg0) {
        sprpmd sprpmd2 = this;
        this.cfr_renamed_0 = -1;
        this.cfr_renamed_119 = null;
        sprpmd2.cfr_renamed_2 = arg0;
        sprpmd2.cfr_renamed_4 = this.cfr_renamed_3738();
    }

    private /* synthetic */ byte[] cfr_renamed_3739(byte[] arg0, int arg1, int arg2) throws sprpjd {
        byte by;
        int n;
        if (this.cfr_renamed_0 != -1) {
            return this.cfr_renamed_3736(arg0, arg1, arg2);
        }
        byte[] byArray = this.cfr_renamed_2.cfr_renamed_1337(arg0, arg1, arg2);
        if (byArray.length < this.cfr_renamed_1339()) {
            throw new sprpjd(spryno.cfr_renamed_9("$\u007f)p-32a3}%r2v\""));
        }
        byte by2 = byArray[0];
        if (this.cfr_renamed_1) {
            if (by2 != 2) {
                throw new sprpjd(sprmis.cfr_renamed_9("\u001d2\u00032\u0007+\u0006|\n0\u0007?\u0003|\u001c%\u00189"));
            }
        } else if (by2 != 1) {
            throw new sprpjd(spryno.cfr_renamed_9("f(x(|1}fq*|%xfg?c#"));
        }
        if (this.cfr_renamed_4 && byArray.length != this.cfr_renamed_2.cfr_renamed_1339()) {
            throw new sprpjd(sprmis.cfr_renamed_9("\n0\u0007?\u0003|\u00012\u000b3\u001a.\r?\u001c|\u001b5\u00129"));
        }
        int n2 = n = 1;
        while (n2 != byArray.length && (by = byArray[n]) != 0) {
            if (by2 == 1 && by != -1) {
                throw new sprpjd(spryno.cfr_renamed_9("$\u007f)p-36r\"w/}!3/}%|4a#p2"));
            }
            n2 = ++n;
        }
        if (++n > byArray.length || n < 10) {
            throw new sprpjd(sprmis.cfr_renamed_9("\u00063H8\t(\t|\u00012H>\u00043\u000b7"));
        }
        byte[] byArray2 = new byte[byArray.length - n];
        System.arraycopy(byArray, n, byArray2, 0, byArray2.length);
        return byArray2;
    }

    private /* synthetic */ byte[] cfr_renamed_3740(byte[] arg0, int arg1, int arg2) throws sprpjd {
        if (arg2 > this.cfr_renamed_1344()) {
            throw new IllegalArgumentException(spryno.cfr_renamed_9("z(c3gfw'g'32|)3*r4t#"));
        }
        sprpmd sprpmd2 = this;
        byte[] byArray = new byte[sprpmd2.cfr_renamed_2.cfr_renamed_1344()];
        if (sprpmd2.cfr_renamed_1) {
            int n;
            byArray[0] = 1;
            int n2 = n = 1;
            while (n2 != byArray.length - arg2 - 1) {
                byArray[n++] = -1;
                n2 = n;
            }
        } else {
            int n;
            this.cfr_renamed_3.nextBytes(byArray);
            byArray[0] = 2;
            int n3 = n = 1;
            while (n3 != byArray.length - arg2 - 1) {
                byte[] byArray2 = byArray;
                while (byArray2[n] == 0) {
                    byArray2 = byArray;
                    byArray[n] = (byte)this.cfr_renamed_3.nextInt();
                }
                n3 = ++n;
            }
        }
        byArray[byArray.length - arg2 - 1] = 0;
        System.arraycopy(arg0, arg1, byArray, byArray.length - arg2, arg2);
        return this.cfr_renamed_2.cfr_renamed_1337(byArray, 0, byArray.length);
    }

    private /* synthetic */ boolean cfr_renamed_3738() {
        String string = (String)AccessController.doPrivileged(new sprped(this));
        return string == null || string.equals("true");
    }

    @Override
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) throws sprpjd {
        if (this.cfr_renamed_91) {
            return this.cfr_renamed_3740(arg0, arg1, arg2);
        }
        return this.cfr_renamed_3739(arg0, arg1, arg2);
    }

    @Override
    public int cfr_renamed_1344() {
        sprpmd sprpmd2 = this;
        int n = sprpmd2.cfr_renamed_2.cfr_renamed_1344();
        if (sprpmd2.cfr_renamed_91) {
            return n - 10;
        }
        return n;
    }

    @Override
    public int cfr_renamed_1339() {
        sprpmd sprpmd2 = this;
        int n = sprpmd2.cfr_renamed_2.cfr_renamed_1339();
        if (sprpmd2.cfr_renamed_91) {
            return n;
        }
        return n - 10;
    }
}

