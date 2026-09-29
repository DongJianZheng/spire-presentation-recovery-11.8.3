/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprctk;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhml;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.sprjas;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprkro;
import com.spire.presentation.packages.sprook;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprpyk;
import com.spire.presentation.packages.sprrs;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtrk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprut;
import com.spire.presentation.packages.spruy;
import com.spire.presentation.packages.spryye;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

public class sprvsk {
    public sprtrk cfr_renamed_132;
    private sprrs cfr_renamed_102;
    public sprbj cfr_renamed_93;
    private sprpyk cfr_renamed_86;
    public byte[] cfr_renamed_152;
    public boolean cfr_renamed_112;
    public spruy cfr_renamed_119;
    public sprjs cfr_renamed_91;
    public byte[] cfr_renamed_0;
    public spraq cfr_renamed_1;
    private byte[] cfr_renamed_2;
    public sprbj cfr_renamed_3;
    public sprirk cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_9427(boolean bl, sprbj sprbj2, sprbj sprbj3, sprbj sprbj4) {
        void arg2;
        void arg1;
        void arg0;
        sprvsk sprvsk2 = this;
        this.cfr_renamed_112 = arg0;
        sprvsk2.cfr_renamed_3 = arg1;
        sprvsk2.cfr_renamed_93 = arg2;
        this.cfr_renamed_152 = new byte[0];
        this.cfr_renamed_10373(sprbj4);
    }

    public byte[] cfr_renamed_10353(byte[] arg0) {
        byte[] byArray = new byte[8];
        if (arg0 != null) {
            sprpxe.cfr_renamed_450((long)arg0.length * 8L, byArray, 0);
        }
        return byArray;
    }

    public spraq cfr_renamed_1472() {
        return this.cfr_renamed_1;
    }

    public sprirk cfr_renamed_2471() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_9428(spryye spryye2, sprbj sprbj2, sprpyk sprpyk2) {
        void arg2;
        void arg0;
        sprvsk sprvsk2 = this;
        sprvsk2.cfr_renamed_112 = true;
        sprvsk2.cfr_renamed_93 = arg0;
        this.cfr_renamed_86 = arg2;
        this.cfr_renamed_10373(sprbj2);
    }

    private /* synthetic */ byte[] cfr_renamed_3653(byte[] arg0, int arg1, int arg2) throws sprull {
        sprvsk sprvsk2;
        int n;
        byte[] byArray = null;
        byte[] byArray2 = null;
        byte[] byArray3 = null;
        byte[] byArray4 = null;
        if (this.cfr_renamed_4 == null) {
            int n2;
            int n3;
            byArray3 = new byte[arg2];
            byArray4 = new byte[this.cfr_renamed_132.cfr_renamed_2100() / 8];
            byArray2 = new byte[byArray3.length + byArray4.length];
            this.cfr_renamed_91.cfr_renamed_2341(byArray2, 0, byArray2.length);
            if (this.cfr_renamed_152.length != 0) {
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
            sprvsk2 = this;
        } else {
            sprvsk sprvsk3;
            byArray3 = new byte[((sprctk)this.cfr_renamed_132).cfr_renamed_2098() / 8];
            byArray4 = new byte[this.cfr_renamed_132.cfr_renamed_2100() / 8];
            byArray2 = new byte[byArray3.length + byArray4.length];
            this.cfr_renamed_91.cfr_renamed_2341(byArray2, 0, byArray2.length);
            System.arraycopy(byArray2, 0, byArray3, 0, byArray3.length);
            System.arraycopy(byArray2, byArray3.length, byArray4, 0, byArray4.length);
            sprvsk sprvsk4 = this;
            if (this.cfr_renamed_2 != null) {
                sprvsk4.cfr_renamed_4.cfr_renamed_5535(true, new sprkpk(new sprtpk(byArray3), this.cfr_renamed_2));
                sprvsk3 = this;
            } else {
                sprvsk4.cfr_renamed_4.cfr_renamed_5535(true, new sprtpk(byArray3));
                sprvsk3 = this;
            }
            byArray = new byte[sprvsk3.cfr_renamed_4.cfr_renamed_1202(arg2)];
            n = this.cfr_renamed_4.cfr_renamed_505(arg0, arg1, arg2, byArray, 0);
            sprvsk sprvsk5 = this;
            sprvsk2 = sprvsk5;
            n += sprvsk5.cfr_renamed_4.cfr_renamed_1219(byArray, n);
        }
        byte[] byArray5 = sprvsk2.cfr_renamed_132.cfr_renamed_2099();
        byte[] byArray6 = null;
        if (this.cfr_renamed_152.length != 0) {
            byArray6 = this.cfr_renamed_10353(byArray5);
        }
        sprvsk sprvsk6 = this;
        byte[] byArray7 = new byte[sprvsk6.cfr_renamed_1.cfr_renamed_2404()];
        sprvsk6.cfr_renamed_1.cfr_renamed_5692(new sprtpk(byArray4));
        sprvsk6.cfr_renamed_1.cfr_renamed_1197(byArray, 0, byArray.length);
        if (byArray5 != null) {
            this.cfr_renamed_1.cfr_renamed_1197(byArray5, 0, byArray5.length);
        }
        if (this.cfr_renamed_152.length != 0) {
            this.cfr_renamed_1.cfr_renamed_1197(byArray6, 0, byArray6.length);
        }
        sprvsk sprvsk7 = this;
        sprvsk7.cfr_renamed_1.cfr_renamed_1219(byArray7, 0);
        byte[] byArray8 = new byte[sprvsk7.cfr_renamed_152.length + n + byArray7.length];
        System.arraycopy(this.cfr_renamed_152, 0, byArray8, 0, this.cfr_renamed_152.length);
        System.arraycopy(byArray, 0, byArray8, this.cfr_renamed_152.length, n);
        System.arraycopy(byArray7, 0, byArray8, this.cfr_renamed_152.length + n, byArray7.length);
        return byArray8;
    }

    private /* synthetic */ void cfr_renamed_10373(sprbj arg0) {
        if (arg0 instanceof sprkpk) {
            this.cfr_renamed_2 = ((sprkpk)arg0).cfr_renamed_1205();
            this.cfr_renamed_132 = (sprtrk)((sprkpk)arg0).cfr_renamed_284();
            return;
        }
        this.cfr_renamed_2 = null;
        this.cfr_renamed_132 = (sprtrk)arg0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) throws sprull {
        Object object;
        Object object2;
        sprvsk sprvsk2;
        block10: {
            block9: {
                block8: {
                    if (!this.cfr_renamed_112) break block8;
                    if (this.cfr_renamed_86 == null) break block9;
                    sprvsk sprvsk3 = this;
                    sprvsk2 = sprvsk3;
                    object2 = sprvsk3.cfr_renamed_86.cfr_renamed_31();
                    sprvsk3.cfr_renamed_3 = ((sprhml)object2).cfr_renamed_3537().cfr_renamed_1225();
                    sprvsk3.cfr_renamed_152 = ((sprhml)object2).cfr_renamed_3536();
                    break block10;
                }
                if (this.cfr_renamed_102 != null) {
                    object2 = new ByteArrayInputStream(arg0, arg1, arg2);
                    try {
                        this.cfr_renamed_93 = this.cfr_renamed_102.cfr_renamed_3338((InputStream)object2);
                    }
                    catch (IOException iOException) {
                        throw new sprull(new StringBuilder().insert(0, sprkro.cfr_renamed_9("UMAALF\u0000WO\u0003RFCLVFR\u0003ESHFMFRBL\u0003PVBOI@\u0000HEZ\u001a\u0003")).append(iOException.getMessage()).toString(), iOException);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw new sprull(new StringBuilder().insert(0, sprjas.cfr_renamed_9("vKbGo@#Ql\u0005q@`Ju@q\u0005fUk@n@qDo\u0005sPaIjF#Nf\\9\u0005")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
                    }
                    int n = arg2 - ((ByteArrayInputStream)object2).available();
                    int n2 = arg1;
                    this.cfr_renamed_152 = sproze.cfr_renamed_533(arg0, n2, n2 + n);
                }
            }
            sprvsk2 = this;
        }
        sprvsk2.cfr_renamed_119.cfr_renamed_5692(this.cfr_renamed_3);
        sprvsk sprvsk4 = this;
        sprvsk sprvsk5 = this;
        object2 = sprvsk4.cfr_renamed_119.cfr_renamed_5695(sprvsk5.cfr_renamed_93);
        byte[] byArray = sprhdf.cfr_renamed_512(sprvsk4.cfr_renamed_119.cfr_renamed_1938(), (BigInteger)object2);
        if (sprvsk5.cfr_renamed_152.length != 0) {
            object = sproze.cfr_renamed_543(this.cfr_renamed_152, byArray);
            sproze.cfr_renamed_492(byArray, (byte)0);
            byArray = object;
        }
        try {
            object = new sprook(byArray, this.cfr_renamed_132.cfr_renamed_2097());
            sprvsk sprvsk6 = this;
            sprvsk6.cfr_renamed_91.cfr_renamed_5671((sprut)object);
            sprvsk sprvsk7 = this;
            byte[] byArray2 = sprvsk6.cfr_renamed_112 ? sprvsk7.cfr_renamed_3653(arg0, arg1, arg2) : sprvsk7.cfr_renamed_3655(arg0, arg1, arg2);
            return byArray2;
        }
        finally {
            sproze.cfr_renamed_492(byArray, (byte)0);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprvsk(spruy spruy2, sprjs sprjs2, spraq spraq2, sprirk sprirk2) {
        void arg2;
        void arg1;
        void arg0;
        sprvsk sprvsk2 = this;
        sprvsk sprvsk3 = this;
        sprvsk3.cfr_renamed_119 = arg0;
        sprvsk3.cfr_renamed_91 = arg1;
        this.cfr_renamed_1 = arg2;
        sprvsk2.cfr_renamed_0 = new byte[this.cfr_renamed_1.cfr_renamed_2404()];
        sprvsk2.cfr_renamed_4 = sprirk2;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_9429(spryye spryye2, sprbj sprbj2, sprrs sprrs2) {
        void arg2;
        void arg0;
        sprvsk sprvsk2 = this;
        sprvsk2.cfr_renamed_112 = false;
        sprvsk2.cfr_renamed_3 = arg0;
        this.cfr_renamed_102 = arg2;
        this.cfr_renamed_10373(sprbj2);
    }

    private /* synthetic */ byte[] cfr_renamed_3655(byte[] arg0, int arg1, int arg2) throws sprull {
        byte[] byArray;
        byte[] byArray2;
        int n = 0;
        if (arg2 < this.cfr_renamed_152.length + this.cfr_renamed_1.cfr_renamed_2404()) {
            throw new sprull(sprkro.cfr_renamed_9("oEMGWH\u0003OE\u0000JNSUW\u0000NUPT\u0003BF\u0000DRFAWEQ\u0000WHBN\u0003TKE\u0003mbc\u0003AMD\u0003v\u0003CLMAIMEG"));
        }
        if (this.cfr_renamed_4 == null) {
            int n2;
            byte[] byArray3;
            byte[] byArray4 = new byte[arg2 - this.cfr_renamed_152.length - this.cfr_renamed_1.cfr_renamed_2404()];
            byArray2 = new byte[this.cfr_renamed_132.cfr_renamed_2100() / 8];
            byte[] byArray5 = new byte[byArray4.length + byArray2.length];
            this.cfr_renamed_91.cfr_renamed_2341(byArray5, 0, byArray5.length);
            if (this.cfr_renamed_152.length != 0) {
                System.arraycopy(byArray5, 0, byArray2, 0, byArray2.length);
                System.arraycopy(byArray5, byArray2.length, byArray4, 0, byArray4.length);
                byArray3 = byArray4;
            } else {
                System.arraycopy(byArray5, 0, byArray4, 0, byArray4.length);
                System.arraycopy(byArray5, byArray4.length, byArray2, 0, byArray2.length);
                byArray3 = byArray4;
            }
            byArray = new byte[byArray3.length];
            int n3 = n2 = 0;
            while (n3 != byArray4.length) {
                int n4 = n2;
                byte by = (byte)(arg0[arg1 + this.cfr_renamed_152.length + n2] ^ byArray4[n2]);
                byArray[n4] = by;
                n3 = ++n2;
            }
        } else {
            byte[] byArray6 = new byte[((sprctk)this.cfr_renamed_132).cfr_renamed_2098() / 8];
            byArray2 = new byte[this.cfr_renamed_132.cfr_renamed_2100() / 8];
            byte[] byArray7 = new byte[byArray6.length + byArray2.length];
            this.cfr_renamed_91.cfr_renamed_2341(byArray7, 0, byArray7.length);
            System.arraycopy(byArray7, 0, byArray6, 0, byArray6.length);
            System.arraycopy(byArray7, byArray6.length, byArray2, 0, byArray2.length);
            sprbj sprbj2 = new sprtpk(byArray6);
            if (this.cfr_renamed_2 != null) {
                sprbj2 = new sprkpk(sprbj2, this.cfr_renamed_2);
            }
            sprvsk sprvsk2 = this;
            sprvsk2.cfr_renamed_4.cfr_renamed_5535(false, sprbj2);
            byArray = new byte[sprvsk2.cfr_renamed_4.cfr_renamed_1202(arg2 - this.cfr_renamed_152.length - this.cfr_renamed_1.cfr_renamed_2404())];
            n = this.cfr_renamed_4.cfr_renamed_505(arg0, arg1 + this.cfr_renamed_152.length, arg2 - this.cfr_renamed_152.length - this.cfr_renamed_1.cfr_renamed_2404(), byArray, 0);
        }
        sprvsk sprvsk3 = this;
        byte[] byArray8 = sprvsk3.cfr_renamed_132.cfr_renamed_2099();
        byte[] byArray9 = null;
        if (sprvsk3.cfr_renamed_152.length != 0) {
            byArray9 = this.cfr_renamed_10353(byArray8);
        }
        int n5 = arg1 + arg2;
        byte[] byArray10 = sproze.cfr_renamed_533(arg0, n5 - this.cfr_renamed_1.cfr_renamed_2404(), n5);
        byte[] byArray11 = new byte[byArray10.length];
        sprvsk sprvsk4 = this;
        sprvsk4.cfr_renamed_1.cfr_renamed_5692(new sprtpk(byArray2));
        sprvsk4.cfr_renamed_1.cfr_renamed_1197(arg0, arg1 + this.cfr_renamed_152.length, arg2 - this.cfr_renamed_152.length - byArray11.length);
        if (byArray8 != null) {
            this.cfr_renamed_1.cfr_renamed_1197(byArray8, 0, byArray8.length);
        }
        if (this.cfr_renamed_152.length != 0) {
            this.cfr_renamed_1.cfr_renamed_1197(byArray9, 0, byArray9.length);
        }
        this.cfr_renamed_1.cfr_renamed_1219(byArray11, 0);
        if (!sproze.cfr_renamed_559(byArray10, byArray11)) {
            throw new sprull(sprjas.cfr_renamed_9("LmSbIjA#hBf"));
        }
        if (this.cfr_renamed_4 == null) {
            return byArray;
        }
        n += this.cfr_renamed_4.cfr_renamed_1219(byArray, n);
        return sproze.cfr_renamed_533(byArray, 0, n);
    }

    /*
     * WARNING - void declaration
     */
    public sprvsk(spruy spruy2, sprjs sprjs2, spraq spraq2) {
        void arg2;
        void arg1;
        void arg0;
        sprvsk sprvsk2 = this;
        sprvsk sprvsk3 = this;
        sprvsk3.cfr_renamed_119 = arg0;
        sprvsk3.cfr_renamed_91 = arg1;
        this.cfr_renamed_1 = arg2;
        sprvsk2.cfr_renamed_0 = new byte[this.cfr_renamed_1.cfr_renamed_2404()];
        sprvsk2.cfr_renamed_4 = null;
    }
}

