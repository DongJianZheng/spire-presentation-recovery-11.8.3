/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprajd;
import com.spire.presentation.packages.sprdlg;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprta;
import com.spire.presentation.packages.sprvmd;
import java.security.SecureRandom;

public class sprqzc
implements sprta {
    private int cfr_renamed_132;
    private sprh cfr_renamed_102;
    private byte[] cfr_renamed_93;
    private int cfr_renamed_86;
    private sprlc cfr_renamed_152;
    private int cfr_renamed_112;
    private sprlc cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private SecureRandom cfr_renamed_0;
    public static final byte cfr_renamed_1 = -68;
    private int cfr_renamed_2;
    private byte cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        sprqzc sprqzc2;
        sprqzc sprqzc3;
        sprt sprt2;
        sprt sprt3;
        if (arg1 instanceof spraed) {
            sprt3 = (spraed)arg1;
            sprt2 = ((spraed)sprt3).cfr_renamed_284();
            sprqzc3 = this;
            this.cfr_renamed_0 = ((spraed)sprt3).cfr_renamed_1295();
        } else {
            sprt2 = arg1;
            if (arg0) {
                sprqzc sprqzc4 = this;
                sprqzc4.cfr_renamed_0 = new SecureRandom();
            }
            sprqzc3 = this;
        }
        sprqzc3.cfr_renamed_102.cfr_renamed_1217(arg0, sprt2);
        if (sprt2 instanceof sprajd) {
            sprt3 = ((sprajd)sprt2).cfr_renamed_1157();
            sprqzc2 = this;
        } else {
            sprt3 = (sprmtc)sprt2;
            sprqzc2 = this;
        }
        sprqzc2.cfr_renamed_2 = ((sprmtc)sprt3).cfr_renamed_2295().bitLength() - 1;
        if (this.cfr_renamed_2 < 8 * this.cfr_renamed_132 + 8 * this.cfr_renamed_112 + 9) {
            throw new IllegalArgumentException(sprdlg.cfr_renamed_9("mw\u007f2r}i2u\u007fg~j2`}t2ubcqotowb2nsuz&shv&ag~r2jwhurzu"));
        }
        sprqzc sprqzc5 = this;
        sprqzc5.cfr_renamed_93 = new byte[(sprqzc5.cfr_renamed_2 + 7) / 8];
        sprqzc5.cfr_renamed_41();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        int n;
        int n2;
        byte[] byArray;
        sprqzc sprqzc2 = this;
        sprqzc2.cfr_renamed_119.cfr_renamed_1219(sprqzc2.cfr_renamed_4, this.cfr_renamed_4.length - this.cfr_renamed_132 - this.cfr_renamed_112);
        try {
            byArray = this.cfr_renamed_102.cfr_renamed_1337(arg0, 0, arg0.length);
            sprqzc sprqzc3 = this;
            System.arraycopy(byArray, 0, sprqzc3.cfr_renamed_93, sprqzc3.cfr_renamed_93.length - byArray.length, byArray.length);
        }
        catch (Exception exception) {
            return false;
        }
        if (this.cfr_renamed_93[this.cfr_renamed_93.length - 1] != this.cfr_renamed_3) {
            sprqzc sprqzc4 = this;
            sprqzc4.cfr_renamed_3277(sprqzc4.cfr_renamed_93);
            return false;
        }
        sprqzc sprqzc5 = this;
        sprqzc sprqzc6 = this;
        byArray = sprqzc5.cfr_renamed_3278(sprqzc5.cfr_renamed_93, sprqzc5.cfr_renamed_93.length - this.cfr_renamed_132 - 1, sprqzc6.cfr_renamed_132, sprqzc6.cfr_renamed_93.length - this.cfr_renamed_132 - 1);
        int n3 = n2 = 0;
        while (n3 != byArray.length) {
            int n4 = n2;
            byte by = (byte)(this.cfr_renamed_93[n4] ^ byArray[n2]);
            this.cfr_renamed_93[n4] = by;
            n3 = ++n2;
        }
        this.cfr_renamed_93[0] = (byte)(this.cfr_renamed_93[0] & 255 >> this.cfr_renamed_93.length * 8 - this.cfr_renamed_2);
        int n5 = n2 = 0;
        while (n5 != this.cfr_renamed_93.length - this.cfr_renamed_132 - this.cfr_renamed_112 - 2) {
            if (this.cfr_renamed_93[n2] != 0) {
                sprqzc sprqzc7 = this;
                sprqzc7.cfr_renamed_3277(sprqzc7.cfr_renamed_93);
                return false;
            }
            n5 = ++n2;
        }
        sprqzc sprqzc8 = this;
        if (sprqzc8.cfr_renamed_93[sprqzc8.cfr_renamed_93.length - this.cfr_renamed_132 - this.cfr_renamed_112 - 2] != 1) {
            sprqzc sprqzc9 = this;
            sprqzc9.cfr_renamed_3277(sprqzc9.cfr_renamed_93);
            return false;
        }
        sprqzc sprqzc10 = this;
        sprqzc sprqzc11 = this;
        System.arraycopy(sprqzc10.cfr_renamed_93, sprqzc10.cfr_renamed_93.length - this.cfr_renamed_112 - this.cfr_renamed_132 - 1, sprqzc11.cfr_renamed_4, sprqzc11.cfr_renamed_4.length - this.cfr_renamed_112, this.cfr_renamed_112);
        sprqzc sprqzc12 = this;
        sprqzc12.cfr_renamed_119.cfr_renamed_1197(sprqzc12.cfr_renamed_4, 0, this.cfr_renamed_4.length);
        sprqzc sprqzc13 = this;
        sprqzc13.cfr_renamed_119.cfr_renamed_1219(sprqzc13.cfr_renamed_4, this.cfr_renamed_4.length - this.cfr_renamed_132);
        n2 = this.cfr_renamed_93.length - this.cfr_renamed_132 - 1;
        int n6 = n = this.cfr_renamed_4.length - this.cfr_renamed_132;
        while (true) {
            if (n6 == this.cfr_renamed_4.length) {
                sprqzc sprqzc14 = this;
                sprqzc14.cfr_renamed_3277(sprqzc14.cfr_renamed_4);
                sprqzc14.cfr_renamed_3277(sprqzc14.cfr_renamed_93);
                return true;
            }
            if ((this.cfr_renamed_93[n2] ^ this.cfr_renamed_4[n]) != 0) {
                sprqzc sprqzc15 = this;
                sprqzc15.cfr_renamed_3277(sprqzc15.cfr_renamed_4);
                sprqzc15.cfr_renamed_3277(sprqzc15.cfr_renamed_93);
                return false;
            }
            ++n2;
            n6 = ++n;
        }
    }

    public sprqzc(sprh arg0, sprlc arg1, sprlc arg2, int arg3) {
        this(arg0, arg1, arg2, arg3, -68);
    }

    /*
     * WARNING - void declaration
     */
    public sprqzc(sprh sprh2, sprlc sprlc2, sprlc sprlc3, int n, byte by) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprqzc sprqzc2 = this;
        sprqzc sprqzc3 = this;
        sprqzc sprqzc4 = this;
        sprqzc sprqzc5 = this;
        this.cfr_renamed_102 = arg0;
        sprqzc5.cfr_renamed_119 = arg1;
        sprqzc5.cfr_renamed_152 = arg2;
        sprqzc4.cfr_renamed_132 = arg1.cfr_renamed_1218();
        sprqzc4.cfr_renamed_86 = arg2.cfr_renamed_1218();
        sprqzc3.cfr_renamed_112 = arg3;
        sprqzc3.cfr_renamed_91 = new byte[arg3];
        sprqzc2.cfr_renamed_4 = new byte[8 + arg3 + this.cfr_renamed_132];
        sprqzc2.cfr_renamed_3 = by;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3279(int n, byte[] byArray) {
        void arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        v1[0] = (byte)(arg0 >>> 24);
        v1[1] = (byte)(arg0 >>> 16);
        v0[2] = (byte)(arg0 >>> 8);
        v0[3] = (byte)(arg0 >>> 0);
    }

    private /* synthetic */ byte[] cfr_renamed_3278(byte[] arg0, int arg1, int arg2, int arg3) {
        byte[] byArray = new byte[arg3];
        sprqzc sprqzc2 = this;
        byte[] byArray2 = new byte[sprqzc2.cfr_renamed_86];
        byte[] byArray3 = new byte[4];
        int n = 0;
        sprqzc2.cfr_renamed_152.cfr_renamed_41();
        int n2 = n;
        while (n2 < arg3 / this.cfr_renamed_86) {
            sprqzc sprqzc3 = this;
            sprqzc3.cfr_renamed_3279(n, byArray3);
            sprqzc3.cfr_renamed_152.cfr_renamed_1197(arg0, arg1, arg2);
            sprqzc3.cfr_renamed_152.cfr_renamed_1197(byArray3, 0, byArray3.length);
            this.cfr_renamed_152.cfr_renamed_1219(byArray2, 0);
            int n3 = n * this.cfr_renamed_86;
            System.arraycopy(byArray2, 0, byArray, n3, this.cfr_renamed_86);
            n2 = ++n;
        }
        if (n * this.cfr_renamed_86 < arg3) {
            sprqzc sprqzc4 = this;
            sprqzc4.cfr_renamed_3279(n, byArray3);
            sprqzc4.cfr_renamed_152.cfr_renamed_1197(arg0, arg1, arg2);
            sprqzc4.cfr_renamed_152.cfr_renamed_1197(byArray3, 0, byArray3.length);
            this.cfr_renamed_152.cfr_renamed_1219(byArray2, 0);
            System.arraycopy(byArray2, 0, byArray, n * this.cfr_renamed_86, byArray.length - n * this.cfr_renamed_86);
        }
        return byArray;
    }

    public sprqzc(sprh arg0, sprlc arg1, int arg2) {
        this(arg0, arg1, arg2, -68);
    }

    public sprqzc(sprh arg0, sprlc arg1, int arg2, byte arg3) {
        sprlc sprlc2 = arg1;
        this(arg0, sprlc2, sprlc2, arg2, arg3);
    }

    @Override
    public byte[] cfr_renamed_1329() throws sprvmd, sprjkd {
        int n;
        sprqzc sprqzc2 = this;
        sprqzc2.cfr_renamed_119.cfr_renamed_1219(sprqzc2.cfr_renamed_4, this.cfr_renamed_4.length - this.cfr_renamed_132 - this.cfr_renamed_112);
        if (this.cfr_renamed_112 != 0) {
            sprqzc sprqzc3 = this;
            this.cfr_renamed_0.nextBytes(sprqzc3.cfr_renamed_91);
            sprqzc sprqzc4 = this;
            System.arraycopy(sprqzc3.cfr_renamed_91, 0, sprqzc4.cfr_renamed_4, sprqzc4.cfr_renamed_4.length - this.cfr_renamed_112, this.cfr_renamed_112);
        }
        sprqzc sprqzc5 = this;
        byte[] byArray = new byte[sprqzc5.cfr_renamed_132];
        sprqzc5.cfr_renamed_119.cfr_renamed_1197(this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
        sprqzc sprqzc6 = this;
        sprqzc6.cfr_renamed_119.cfr_renamed_1219(byArray, 0);
        sprqzc6.cfr_renamed_93[this.cfr_renamed_93.length - this.cfr_renamed_112 - 1 - this.cfr_renamed_132 - 1] = 1;
        sprqzc sprqzc7 = this;
        System.arraycopy(this.cfr_renamed_91, 0, sprqzc7.cfr_renamed_93, sprqzc7.cfr_renamed_93.length - this.cfr_renamed_112 - this.cfr_renamed_132 - 1, this.cfr_renamed_112);
        byte[] byArray2 = this.cfr_renamed_3278(byArray, 0, byArray.length, this.cfr_renamed_93.length - this.cfr_renamed_132 - 1);
        int n2 = n = 0;
        while (n2 != byArray2.length) {
            int n3 = n;
            byte by = (byte)(this.cfr_renamed_93[n3] ^ byArray2[n]);
            this.cfr_renamed_93[n3] = by;
            n2 = ++n;
        }
        this.cfr_renamed_93[0] = (byte)(this.cfr_renamed_93[0] & 255 >> this.cfr_renamed_93.length * 8 - this.cfr_renamed_2);
        sprqzc sprqzc8 = this;
        System.arraycopy(byArray, 0, sprqzc8.cfr_renamed_93, sprqzc8.cfr_renamed_93.length - this.cfr_renamed_132 - 1, this.cfr_renamed_132);
        sprqzc sprqzc9 = this;
        sprqzc9.cfr_renamed_93[sprqzc9.cfr_renamed_93.length - 1] = this.cfr_renamed_3;
        sprqzc sprqzc10 = this;
        byte[] byArray3 = sprqzc10.cfr_renamed_102.cfr_renamed_1337(sprqzc10.cfr_renamed_93, 0, this.cfr_renamed_93.length);
        sprqzc sprqzc11 = this;
        sprqzc11.cfr_renamed_3277(sprqzc11.cfr_renamed_93);
        return byArray3;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_119.cfr_renamed_1221(arg0);
    }

    private /* synthetic */ void cfr_renamed_3277(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 != arg0.length) {
            arg0[n++] = 0;
            n2 = n;
        }
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_119.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_119.cfr_renamed_1197(arg0, arg1, arg2);
    }
}

