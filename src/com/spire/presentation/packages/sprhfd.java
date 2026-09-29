/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbmd;
import com.spire.presentation.packages.sprejd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprib;
import com.spire.presentation.packages.sprnhl;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprond;
import com.spire.presentation.packages.sprpi;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.spruc;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.sprxcd;
import com.spire.presentation.packages.sprxdd;
import com.spire.presentation.packages.sprxed;
import com.spire.presentation.packages.sprxvr;
import com.spire.presentation.packages.sprzf;
import com.spire.presentation.packages.sprzra;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

public class sprhfd {
    public byte[] cfr_renamed_132;
    public spruc cfr_renamed_102;
    public sprt cfr_renamed_93;
    public sprbmd cfr_renamed_86;
    public sprxdd cfr_renamed_152;
    public sprt cfr_renamed_112;
    public sprzf cfr_renamed_119;
    public boolean cfr_renamed_91;
    public sprib cfr_renamed_0;
    private sprpi cfr_renamed_1;
    private sprejd cfr_renamed_2;
    public byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    private /* synthetic */ byte[] cfr_renamed_3653(byte[] arg0, int arg1, int arg2) throws sprpjd {
        sprhfd sprhfd2;
        int n;
        byte[] byArray = null;
        byte[] byArray2 = null;
        byte[] byArray3 = null;
        byte[] byArray4 = null;
        if (this.cfr_renamed_152 == null) {
            int n2;
            int n3;
            byArray3 = new byte[arg2];
            byArray4 = new byte[this.cfr_renamed_86.cfr_renamed_2100() / 8];
            byArray2 = new byte[byArray3.length + byArray4.length];
            this.cfr_renamed_0.cfr_renamed_2341(byArray2, 0, byArray2.length);
            if (this.cfr_renamed_132.length != 0) {
                System.arraycopy(byArray2, 0, byArray4, 0, byArray4.length);
                System.arraycopy(byArray2, byArray4.length, byArray3, 0, byArray3.length);
                n3 = arg2;
            } else {
                System.arraycopy(byArray2, 0, byArray3, 0, byArray3.length);
                System.arraycopy(byArray2, arg2, byArray4, 0, byArray4.length);
                n3 = arg2;
            }
            byArray = new byte[n3];
            int n4 = n2 = 0;
            while (n4 != arg2) {
                int n5 = n2;
                byte by = (byte)(arg0[arg1 + n5] ^ byArray3[n2]);
                byArray[n5] = by;
                n4 = ++n2;
            }
            n = arg2;
            sprhfd2 = this;
        } else {
            sprhfd sprhfd3;
            byArray3 = new byte[((sprxcd)this.cfr_renamed_86).cfr_renamed_2098() / 8];
            byArray4 = new byte[this.cfr_renamed_86.cfr_renamed_2100() / 8];
            byArray2 = new byte[byArray3.length + byArray4.length];
            this.cfr_renamed_0.cfr_renamed_2341(byArray2, 0, byArray2.length);
            System.arraycopy(byArray2, 0, byArray3, 0, byArray3.length);
            System.arraycopy(byArray2, byArray3.length, byArray4, 0, byArray4.length);
            sprhfd sprhfd4 = this;
            if (this.cfr_renamed_4 != null) {
                sprhfd4.cfr_renamed_152.cfr_renamed_1217(true, new sprnjd(new sprnld(byArray3), this.cfr_renamed_4));
                sprhfd3 = this;
            } else {
                sprhfd4.cfr_renamed_152.cfr_renamed_1217(true, new sprnld(byArray3));
                sprhfd3 = this;
            }
            byArray = new byte[sprhfd3.cfr_renamed_152.cfr_renamed_1202(arg2)];
            n = this.cfr_renamed_152.cfr_renamed_505(arg0, arg1, arg2, byArray, 0);
            sprhfd sprhfd5 = this;
            sprhfd2 = sprhfd5;
            n += sprhfd5.cfr_renamed_152.cfr_renamed_1219(byArray, n);
        }
        byte[] byArray5 = sprhfd2.cfr_renamed_86.cfr_renamed_2099();
        byte[] byArray6 = new byte[4];
        if (this.cfr_renamed_132.length != 0 && byArray5 != null) {
            sprtsa.cfr_renamed_442(byArray5.length * 8, byArray6, 0);
        }
        sprhfd sprhfd6 = this;
        byte[] byArray7 = new byte[sprhfd6.cfr_renamed_102.cfr_renamed_2404()];
        sprhfd6.cfr_renamed_102.cfr_renamed_1524(new sprnld(byArray4));
        sprhfd6.cfr_renamed_102.cfr_renamed_1197(byArray, 0, byArray.length);
        if (byArray5 != null) {
            this.cfr_renamed_102.cfr_renamed_1197(byArray5, 0, byArray5.length);
        }
        if (this.cfr_renamed_132.length != 0) {
            this.cfr_renamed_102.cfr_renamed_1197(byArray6, 0, byArray6.length);
        }
        sprhfd sprhfd7 = this;
        sprhfd7.cfr_renamed_102.cfr_renamed_1219(byArray7, 0);
        byte[] byArray8 = new byte[sprhfd7.cfr_renamed_132.length + n + byArray7.length];
        System.arraycopy(this.cfr_renamed_132, 0, byArray8, 0, this.cfr_renamed_132.length);
        System.arraycopy(byArray, 0, byArray8, this.cfr_renamed_132.length, n);
        System.arraycopy(byArray7, 0, byArray8, this.cfr_renamed_132.length + n, byArray7.length);
        return byArray8;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_2502(sprhgb sprhgb2, sprt sprt2, sprejd sprejd2) {
        void arg2;
        void arg0;
        sprhfd sprhfd2 = this;
        sprhfd2.cfr_renamed_91 = true;
        sprhfd2.cfr_renamed_112 = arg0;
        this.cfr_renamed_2 = arg2;
        this.cfr_renamed_3654(sprt2);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_2489(boolean bl, sprt sprt2, sprt sprt3, sprt sprt4) {
        void arg2;
        void arg1;
        void arg0;
        sprhfd sprhfd2 = this;
        this.cfr_renamed_91 = arg0;
        sprhfd2.cfr_renamed_93 = arg1;
        sprhfd2.cfr_renamed_112 = arg2;
        this.cfr_renamed_132 = new byte[0];
        this.cfr_renamed_3654(sprt4);
    }

    public sprxdd cfr_renamed_2471() {
        return this.cfr_renamed_152;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) throws sprpjd {
        byte[] byArray;
        Object object;
        sprhfd sprhfd2;
        block8: {
            block7: {
                block6: {
                    if (!this.cfr_renamed_91) break block6;
                    if (this.cfr_renamed_2 == null) break block7;
                    sprhfd sprhfd3 = this;
                    sprhfd2 = sprhfd3;
                    object = sprhfd3.cfr_renamed_2.cfr_renamed_31();
                    sprhfd3.cfr_renamed_93 = ((sprond)object).cfr_renamed_3537().cfr_renamed_1225();
                    sprhfd3.cfr_renamed_132 = ((sprond)object).cfr_renamed_3536();
                    break block8;
                }
                if (this.cfr_renamed_1 != null) {
                    object = new ByteArrayInputStream(arg0, arg1, arg2);
                    try {
                        this.cfr_renamed_112 = this.cfr_renamed_1.cfr_renamed_3338((InputStream)object);
                    }
                    catch (IOException iOException) {
                        throw new sprpjd(new StringBuilder().insert(0, sprxvr.cfr_renamed_9("H\u0003\\\u000fQ\b\u001d\u0019RMO\b^\u0002K\bOMX\u001dU\bP\bO\fQMM\u0018_\u0001T\u000e\u001d\u0006X\u0014\u0007M")).append(iOException.getMessage()).toString(), iOException);
                    }
                    int n = arg2 - ((ByteArrayInputStream)object).available();
                    int n2 = arg1;
                    this.cfr_renamed_132 = sprzra.cfr_renamed_533(arg0, n2, n2 + n);
                }
            }
            sprhfd2 = this;
        }
        sprhfd2.cfr_renamed_119.cfr_renamed_1524(this.cfr_renamed_93);
        sprhfd sprhfd4 = this;
        sprhfd sprhfd5 = this;
        object = sprhfd4.cfr_renamed_119.cfr_renamed_2501(sprhfd5.cfr_renamed_112);
        byte[] byArray2 = sprvpa.cfr_renamed_512(sprhfd4.cfr_renamed_119.cfr_renamed_1938(), (BigInteger)object);
        if (sprhfd5.cfr_renamed_132.length != 0) {
            byArray = new byte[this.cfr_renamed_132.length + byArray2.length];
            System.arraycopy(this.cfr_renamed_132, 0, byArray, 0, this.cfr_renamed_132.length);
            System.arraycopy(byArray2, 0, byArray, this.cfr_renamed_132.length, byArray2.length);
        } else {
            byArray = byArray2;
        }
        sprxed sprxed2 = new sprxed(byArray, this.cfr_renamed_86.cfr_renamed_2097());
        sprhfd sprhfd6 = this;
        sprhfd6.cfr_renamed_0.cfr_renamed_2342(sprxed2);
        sprhfd sprhfd7 = this;
        if (sprhfd6.cfr_renamed_91) {
            return sprhfd7.cfr_renamed_3653(arg0, arg1, arg2);
        }
        return sprhfd7.cfr_renamed_3655(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprhfd(sprzf sprzf2, sprib sprib2, spruc spruc2) {
        void arg2;
        void arg1;
        void arg0;
        sprhfd sprhfd2 = this;
        sprhfd sprhfd3 = this;
        sprhfd3.cfr_renamed_119 = arg0;
        sprhfd3.cfr_renamed_0 = arg1;
        this.cfr_renamed_102 = arg2;
        sprhfd2.cfr_renamed_3 = new byte[this.cfr_renamed_102.cfr_renamed_2404()];
        sprhfd2.cfr_renamed_152 = null;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ 4;
        int cfr_ignored_0 = 4 << 4 ^ 5;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 4 << 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_2503(sprhgb sprhgb2, sprt sprt2, sprpi sprpi2) {
        void arg2;
        void arg0;
        sprhfd sprhfd2 = this;
        sprhfd2.cfr_renamed_91 = false;
        sprhfd2.cfr_renamed_93 = arg0;
        this.cfr_renamed_1 = arg2;
        this.cfr_renamed_3654(sprt2);
    }

    public spruc cfr_renamed_1472() {
        return this.cfr_renamed_102;
    }

    private /* synthetic */ byte[] cfr_renamed_3655(byte[] arg0, int arg1, int arg2) throws sprpjd {
        sprhfd sprhfd2;
        int n;
        byte[] byArray = null;
        byte[] byArray2 = null;
        byte[] byArray3 = null;
        byte[] byArray4 = null;
        if (arg2 <= this.cfr_renamed_86.cfr_renamed_2100() / 8) {
            throw new sprpjd(sprnhl.cfr_renamed_9("\u0015}7\u007f-pyw?80v)m-84m*lyz<8>j<y-}+8-p8vyl1}yU\u0018["));
        }
        if (this.cfr_renamed_152 == null) {
            int n2;
            byte[] byArray5;
            byArray3 = new byte[arg2 - this.cfr_renamed_132.length - this.cfr_renamed_102.cfr_renamed_2404()];
            byArray4 = new byte[this.cfr_renamed_86.cfr_renamed_2100() / 8];
            byArray2 = new byte[byArray3.length + byArray4.length];
            this.cfr_renamed_0.cfr_renamed_2341(byArray2, 0, byArray2.length);
            if (this.cfr_renamed_132.length != 0) {
                System.arraycopy(byArray2, 0, byArray4, 0, byArray4.length);
                System.arraycopy(byArray2, byArray4.length, byArray3, 0, byArray3.length);
                byArray5 = byArray3;
            } else {
                System.arraycopy(byArray2, 0, byArray3, 0, byArray3.length);
                System.arraycopy(byArray2, byArray3.length, byArray4, 0, byArray4.length);
                byArray5 = byArray3;
            }
            byArray = new byte[byArray5.length];
            int n3 = n2 = 0;
            while (n3 != byArray3.length) {
                int n4 = n2;
                byte by = (byte)(arg0[arg1 + this.cfr_renamed_132.length + n2] ^ byArray3[n2]);
                byArray[n4] = by;
                n3 = ++n2;
            }
            n = byArray3.length;
            sprhfd2 = this;
        } else {
            sprhfd sprhfd3;
            byArray3 = new byte[((sprxcd)this.cfr_renamed_86).cfr_renamed_2098() / 8];
            byArray4 = new byte[this.cfr_renamed_86.cfr_renamed_2100() / 8];
            byArray2 = new byte[byArray3.length + byArray4.length];
            this.cfr_renamed_0.cfr_renamed_2341(byArray2, 0, byArray2.length);
            System.arraycopy(byArray2, 0, byArray3, 0, byArray3.length);
            System.arraycopy(byArray2, byArray3.length, byArray4, 0, byArray4.length);
            sprhfd sprhfd4 = this;
            if (this.cfr_renamed_4 != null) {
                sprhfd4.cfr_renamed_152.cfr_renamed_1217(false, new sprnjd(new sprnld(byArray3), this.cfr_renamed_4));
                sprhfd3 = this;
            } else {
                sprhfd4.cfr_renamed_152.cfr_renamed_1217(false, new sprnld(byArray3));
                sprhfd3 = this;
            }
            byArray = new byte[sprhfd3.cfr_renamed_152.cfr_renamed_1202(arg2 - this.cfr_renamed_132.length - this.cfr_renamed_102.cfr_renamed_2404())];
            int n5 = n = this.cfr_renamed_152.cfr_renamed_505(arg0, arg1 + this.cfr_renamed_132.length, arg2 - this.cfr_renamed_132.length - this.cfr_renamed_102.cfr_renamed_2404(), byArray, 0);
            n = n5 + this.cfr_renamed_152.cfr_renamed_1219(byArray, n5);
            sprhfd2 = this;
        }
        byte[] byArray6 = sprhfd2.cfr_renamed_86.cfr_renamed_2099();
        byte[] byArray7 = new byte[4];
        if (this.cfr_renamed_132.length != 0 && byArray6 != null) {
            sprtsa.cfr_renamed_442(byArray6.length * 8, byArray7, 0);
        }
        int n6 = arg1 + arg2;
        byte[] byArray8 = sprzra.cfr_renamed_533(arg0, n6 - this.cfr_renamed_102.cfr_renamed_2404(), n6);
        byte[] byArray9 = new byte[byArray8.length];
        sprhfd sprhfd5 = this;
        sprhfd5.cfr_renamed_102.cfr_renamed_1524(new sprnld(byArray4));
        sprhfd5.cfr_renamed_102.cfr_renamed_1197(arg0, arg1 + this.cfr_renamed_132.length, arg2 - this.cfr_renamed_132.length - byArray9.length);
        if (byArray6 != null) {
            this.cfr_renamed_102.cfr_renamed_1197(byArray6, 0, byArray6.length);
        }
        if (this.cfr_renamed_132.length != 0) {
            this.cfr_renamed_102.cfr_renamed_1197(byArray7, 0, byArray7.length);
        }
        this.cfr_renamed_102.cfr_renamed_1219(byArray9, 0);
        if (!sprzra.cfr_renamed_559(byArray8, byArray9)) {
            throw new sprpjd(sprxvr.cfr_renamed_9("t\u0003K\fQ\u0004YMp,~C"));
        }
        return sprzra.cfr_renamed_533(byArray, 0, n);
    }

    /*
     * WARNING - void declaration
     */
    public sprhfd(sprzf sprzf2, sprib sprib2, spruc spruc2, sprxdd sprxdd2) {
        void arg2;
        void arg1;
        void arg0;
        sprhfd sprhfd2 = this;
        sprhfd sprhfd3 = this;
        sprhfd3.cfr_renamed_119 = arg0;
        sprhfd3.cfr_renamed_0 = arg1;
        this.cfr_renamed_102 = arg2;
        sprhfd2.cfr_renamed_3 = new byte[this.cfr_renamed_102.cfr_renamed_2404()];
        sprhfd2.cfr_renamed_152 = sprxdd2;
    }

    private /* synthetic */ void cfr_renamed_3654(sprt arg0) {
        if (arg0 instanceof sprnjd) {
            this.cfr_renamed_4 = ((sprnjd)arg0).cfr_renamed_1205();
            this.cfr_renamed_86 = (sprbmd)((sprnjd)arg0).cfr_renamed_284();
            return;
        }
        this.cfr_renamed_4 = null;
        this.cfr_renamed_86 = (sprbmd)arg0;
    }
}

