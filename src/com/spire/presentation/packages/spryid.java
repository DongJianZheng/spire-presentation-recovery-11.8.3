/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprbjy;
import com.spire.presentation.packages.sprcmf;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprlid;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprt;
import java.security.SecureRandom;

public class spryid
implements sprh {
    private sprlc cfr_renamed_0;
    private SecureRandom cfr_renamed_1;
    private boolean cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private sprh cfr_renamed_4;

    public spryid(sprh arg0) {
        this(arg0, new sprlid(), null);
    }

    public byte[] cfr_renamed_3739(byte[] arg0, int arg1, int arg2) throws sprpjd {
        int n;
        int n2;
        byte[] byArray;
        block11: {
            int n3;
            byte[] byArray2;
            byte[] byArray3 = this.cfr_renamed_4.cfr_renamed_1337(arg0, arg1, arg2);
            if (byArray3.length < this.cfr_renamed_4.cfr_renamed_1339()) {
                byArray = new byte[this.cfr_renamed_4.cfr_renamed_1339()];
                System.arraycopy(byArray3, 0, byArray, byArray.length - byArray3.length, byArray3.length);
                byArray2 = byArray;
            } else {
                byArray2 = byArray = byArray3;
            }
            if (byArray2.length < 2 * this.cfr_renamed_3.length + 1) {
                throw new sprpjd(sprcmf.cfr_renamed_9("YrIr\u001dgR|\u001d`U|Og"));
            }
            byte[] byArray4 = this.cfr_renamed_3278(byArray, this.cfr_renamed_3.length, byArray.length - this.cfr_renamed_3.length, this.cfr_renamed_3.length);
            int n4 = n3 = 0;
            while (n4 != this.cfr_renamed_3.length) {
                int n5 = n3;
                byte by = (byte)(byArray[n5] ^ byArray4[n3]);
                byArray[n5] = by;
                n4 = ++n3;
            }
            byArray4 = this.cfr_renamed_3278(byArray, 0, this.cfr_renamed_3.length, byArray.length - this.cfr_renamed_3.length);
            int n6 = n3 = this.cfr_renamed_3.length;
            while (n6 != byArray.length) {
                int n7 = n3;
                byte by = (byte)(byArray[n7] ^ byArray4[n3 - this.cfr_renamed_3.length]);
                byArray[n7] = by;
                n6 = ++n3;
            }
            n3 = 0;
            int n8 = n2 = 0;
            while (n8 != this.cfr_renamed_3.length) {
                if (this.cfr_renamed_3[n2] != byArray[this.cfr_renamed_3.length + n2]) {
                    n3 = 1;
                }
                n8 = ++n2;
            }
            if (n3 != 0) {
                throw new sprpjd(sprbjy.cfr_renamed_9(")[9[mR,I%\u001a:H\"T*"));
            }
            int n9 = n2 = 2 * this.cfr_renamed_3.length;
            while (n9 != byArray.length) {
                if (byArray[n2] != 0) {
                    n = n2;
                    break block11;
                }
                n9 = ++n2;
            }
            n = n2;
        }
        if (n >= byArray.length - 1 || byArray[n2] != 1) {
            throw new sprpjd(new StringBuilder().insert(0, sprcmf.cfr_renamed_9("w\\g\\3Ng\\aI3JaR}Z3")).append(n2).toString());
        }
        byte[] byArray5 = new byte[byArray.length - ++n2];
        System.arraycopy(byArray, n2, byArray5, 0, byArray5.length);
        return byArray5;
    }

    public sprh cfr_renamed_2349() {
        return this.cfr_renamed_4;
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

    @Override
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) throws sprpjd {
        if (this.cfr_renamed_2) {
            return this.cfr_renamed_3740(arg0, arg1, arg2);
        }
        return this.cfr_renamed_3739(arg0, arg1, arg2);
    }

    public spryid(sprh arg0, sprlc arg1) {
        this(arg0, arg1, null);
    }

    @Override
    public int cfr_renamed_1344() {
        spryid spryid2 = this;
        int n = spryid2.cfr_renamed_4.cfr_renamed_1344();
        if (spryid2.cfr_renamed_2) {
            return n - 1 - 2 * this.cfr_renamed_3.length;
        }
        return n;
    }

    public spryid(sprh arg0, sprlc arg1, byte[] arg2) {
        sprlc sprlc2 = arg1;
        this(arg0, sprlc2, sprlc2, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public spryid(sprh sprh2, sprlc sprlc2, sprlc sprlc3, byte[] byArray) {
        void arg2;
        void arg0;
        void arg1;
        void v0 = arg1;
        spryid spryid2 = this;
        spryid2.cfr_renamed_4 = arg0;
        spryid2.cfr_renamed_0 = arg2;
        this.cfr_renamed_3 = new byte[v0.cfr_renamed_1218()];
        v0.cfr_renamed_41();
        if (byArray != null) {
            void arg3;
            void v2 = arg3;
            arg1.cfr_renamed_1197((byte[])v2, 0, ((void)v2).length);
        }
        arg1.cfr_renamed_1219(this.cfr_renamed_3, 0);
    }

    private /* synthetic */ byte[] cfr_renamed_3278(byte[] arg0, int arg1, int arg2, int arg3) {
        byte[] byArray = new byte[arg3];
        spryid spryid2 = this;
        byte[] byArray2 = new byte[spryid2.cfr_renamed_0.cfr_renamed_1218()];
        byte[] byArray3 = new byte[4];
        int n = 0;
        spryid2.cfr_renamed_0.cfr_renamed_41();
        int n2 = n;
        while (n2 < arg3 / byArray2.length) {
            spryid spryid3 = this;
            spryid3.cfr_renamed_3279(n, byArray3);
            spryid3.cfr_renamed_0.cfr_renamed_1197(arg0, arg1, arg2);
            spryid3.cfr_renamed_0.cfr_renamed_1197(byArray3, 0, byArray3.length);
            this.cfr_renamed_0.cfr_renamed_1219(byArray2, 0);
            int n3 = n * byArray2.length;
            System.arraycopy(byArray2, 0, byArray, n3, byArray2.length);
            n2 = ++n;
        }
        if (n * byArray2.length < arg3) {
            spryid spryid4 = this;
            spryid4.cfr_renamed_3279(n, byArray3);
            spryid4.cfr_renamed_0.cfr_renamed_1197(arg0, arg1, arg2);
            spryid4.cfr_renamed_0.cfr_renamed_1197(byArray3, 0, byArray3.length);
            this.cfr_renamed_0.cfr_renamed_1219(byArray2, 0);
            System.arraycopy(byArray2, 0, byArray, n * byArray2.length, byArray.length - n * byArray2.length);
        }
        return byArray;
    }

    @Override
    public int cfr_renamed_1339() {
        spryid spryid2 = this;
        int n = spryid2.cfr_renamed_4.cfr_renamed_1339();
        if (spryid2.cfr_renamed_2) {
            return n;
        }
        return n - 1 - 2 * this.cfr_renamed_3.length;
    }

    public byte[] cfr_renamed_3740(byte[] arg0, int arg1, int arg2) throws sprpjd {
        int n;
        byte[] byArray = new byte[this.cfr_renamed_1344() + 1 + 2 * this.cfr_renamed_3.length];
        System.arraycopy(arg0, arg1, byArray, byArray.length - arg2, arg2);
        byArray[byArray.length - arg2 - 1] = 1;
        System.arraycopy(this.cfr_renamed_3, 0, byArray, this.cfr_renamed_3.length, this.cfr_renamed_3.length);
        byte[] byArray2 = new byte[this.cfr_renamed_3.length];
        spryid spryid2 = this;
        spryid2.cfr_renamed_1.nextBytes(byArray2);
        byte[] byArray3 = spryid2.cfr_renamed_3278(byArray2, 0, byArray2.length, byArray.length - this.cfr_renamed_3.length);
        int n2 = n = this.cfr_renamed_3.length;
        while (n2 != byArray.length) {
            int n3 = n;
            byte by = (byte)(byArray[n3] ^ byArray3[n - this.cfr_renamed_3.length]);
            byArray[n3] = by;
            n2 = ++n;
        }
        System.arraycopy(byArray2, 0, byArray, 0, this.cfr_renamed_3.length);
        spryid spryid3 = this;
        byArray3 = spryid3.cfr_renamed_3278(byArray, spryid3.cfr_renamed_3.length, byArray.length - this.cfr_renamed_3.length, this.cfr_renamed_3.length);
        int n4 = n = 0;
        while (n4 != this.cfr_renamed_3.length) {
            int n5 = n;
            byte by = (byte)(byArray[n5] ^ byArray3[n]);
            byArray[n5] = by;
            n4 = ++n;
        }
        return this.cfr_renamed_4.cfr_renamed_1337(byArray, 0, byArray.length);
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        spryid spryid2;
        if (arg1 instanceof spraed) {
            spraed spraed2 = (spraed)arg1;
            spryid2 = this;
            this.cfr_renamed_1 = spraed2.cfr_renamed_1295();
        } else {
            spryid2 = this;
            this.cfr_renamed_1 = new SecureRandom();
        }
        spryid2.cfr_renamed_4.cfr_renamed_1217(arg0, arg1);
        this.cfr_renamed_2 = arg0;
    }
}

