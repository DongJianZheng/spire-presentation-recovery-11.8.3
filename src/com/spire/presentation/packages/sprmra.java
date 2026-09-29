/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbsa;
import com.spire.presentation.packages.sprbtm;
import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.spreqy;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzra;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class sprmra
extends sprvva
implements sprx {
    public byte[] cfr_renamed_2;
    private static final char[] cfr_renamed_3;
    public int cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public String cfr_renamed_314() {
        int n;
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprope sprope2 = new sprope(byteArrayOutputStream);
        try {
            sprope2.cfr_renamed_2149(this);
        }
        catch (IOException iOException) {
            throw new RuntimeException(sprbtm.cfr_renamed_9("\f:\u00111\u0017:\u00048E1\u0017&\n&E1\u000b7\n0\f:\u0002t'=\u0011\u0007\u0011&\f:\u0002"));
        }
        byte[] byArray = byteArrayOutputStream.toByteArray();
        int n2 = n = 0;
        while (n2 != byArray.length) {
            stringBuffer.append(cfr_renamed_3[byArray[n] >>> 4 & 0xF]);
            int n3 = byArray[n] & 0xF;
            stringBuffer.append(cfr_renamed_3[n3]);
            n2 = ++n;
        }
        return stringBuffer.toString();
    }

    public static sprmra cfr_renamed_4806(int arg0, InputStream arg1) throws IOException {
        if (arg0 < 1) {
            throw new IllegalArgumentException(spreqy.cfr_renamed_9("XHYTO[X_H\u001ansx\u001a\u007fn~sb}\f^INIYX_H"));
        }
        int n = arg1.read();
        byte[] byArray = new byte[arg0 - 1];
        if (byArray.length != 0 && sprbsa.cfr_renamed_476(arg1, byArray) != byArray.length) {
            throw new EOFException(sprbtm.cfr_renamed_9(" \u001b#t\u0000:\u0006;\u0010:\u00111\u00171\u0001t\f:E9\f0\u00018\u0000t\n2E\u0016,\u0000E\u00071\u0006,\u001a\""));
        }
        return new sprmra(byArray, n);
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    public sprmra(byte[] arg0) {
        this(arg0, 0);
    }

    @Override
    public int hashCode() {
        sprmra sprmra2 = this;
        return sprmra2.cfr_renamed_4 ^ sprzra.cfr_renamed_95(sprmra2.cfr_renamed_2);
    }

    public int cfr_renamed_1868() {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 != this.cfr_renamed_2.length && n != 4) {
            int n4 = this.cfr_renamed_2[n] & 0xFF;
            int n5 = 8 * n;
            n2 |= n4 << n5;
            n3 = ++n;
        }
        return n2;
    }

    public static byte[] cfr_renamed_4491(int arg0) {
        int n;
        int n2;
        int n3;
        block3: {
            int n4;
            n3 = 4;
            int n5 = n4 = 3;
            while (n5 >= 1) {
                if ((arg0 & 255 << n4 * 8) != 0) {
                    n2 = n3;
                    break block3;
                }
                --n3;
                n5 = --n4;
            }
            n2 = n3;
        }
        byte[] byArray = new byte[n2];
        int n6 = n = 0;
        while (n6 < n3) {
            int n7 = n++;
            byArray[n7] = (byte)(arg0 >> n7 * 8 & 0xFF);
            n6 = n;
        }
        return byArray;
    }

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        byte[] byArray = new byte[this.cfr_renamed_81().length + 1];
        byte[] byArray2 = byArray;
        sprmra sprmra2 = this;
        byArray[0] = (byte)sprmra2.cfr_renamed_106();
        System.arraycopy(sprmra2.cfr_renamed_81(), 0, byArray2, 1, byArray2.length - 1);
        arg0.cfr_renamed_4614(3, byArray2);
    }

    @Override
    public boolean cfr_renamed_4575() {
        return false;
    }

    public int cfr_renamed_106() {
        return this.cfr_renamed_4;
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprmra)) {
            return false;
        }
        sprmra sprmra2 = (sprmra)arg0;
        return this.cfr_renamed_4 == sprmra2.cfr_renamed_4 && sprzra.cfr_renamed_92(this.cfr_renamed_2, sprmra2.cfr_renamed_2);
    }

    public static sprmra cfr_renamed_341(spryte arg0, boolean arg1) {
        sprvva sprvva2 = arg0.cfr_renamed_2456();
        if (arg1 || sprvva2 instanceof sprmra) {
            return sprmra.cfr_renamed_23(sprvva2);
        }
        return sprmra.cfr_renamed_4807(((sprxue)sprvva2).cfr_renamed_186());
    }

    public byte[] cfr_renamed_81() {
        return this.cfr_renamed_2;
    }

    public static int cfr_renamed_4492(int arg0) {
        int n;
        int n2;
        int n3;
        block7: {
            n3 = 0;
            int n4 = n2 = 3;
            while (n4 >= 0) {
                if (n2 != 0) {
                    if (arg0 >> n2 * 8 != 0) {
                        n = n3 = arg0 >> n2 * 8 & 0xFF;
                        break block7;
                    }
                } else if (arg0 != 0) {
                    n = n3 = arg0 & 0xFF;
                    break block7;
                }
                n4 = --n2;
            }
            n = n3;
        }
        if (n == 0) {
            return 7;
        }
        n2 = 1;
        int n5 = n3;
        while (((n3 = n5 << 1) & 0xFF) != 0) {
            n5 = n3;
            ++n2;
        }
        return 8 - n2;
    }

    static {
        char[] cArray = new char[16];
        cArray[0] = 48;
        cArray[1] = 49;
        cArray[2] = 50;
        cArray[3] = 51;
        cArray[4] = 52;
        cArray[5] = 53;
        cArray[6] = 54;
        cArray[7] = 55;
        cArray[8] = 56;
        cArray[9] = 57;
        cArray[10] = 65;
        cArray[11] = 66;
        cArray[12] = 67;
        cArray[13] = 68;
        cArray[14] = 69;
        cArray[15] = 70;
        cfr_renamed_3 = cArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprmra(byte by, int n) {
        void arg0;
        this.cfr_renamed_2 = new byte[1];
        this.cfr_renamed_2[0] = arg0;
        this.cfr_renamed_4 = n;
    }

    /*
     * WARNING - void declaration
     */
    public sprmra(int n) {
        void arg0;
        sprmra sprmra2 = this;
        sprmra2.cfr_renamed_2 = sprmra.cfr_renamed_4491((int)arg0);
        sprmra2.cfr_renamed_4 = sprmra.cfr_renamed_4492(n);
    }

    public static sprmra cfr_renamed_4807(byte[] arg0) {
        if (arg0.length < 1) {
            throw new IllegalArgumentException(spreqy.cfr_renamed_9("XHYTO[X_H\u001ansx\u001a\u007fn~sb}\f^INIYX_H"));
        }
        byte by = arg0[0];
        byte[] byArray = new byte[arg0.length - 1];
        if (byArray.length != 0) {
            System.arraycopy(arg0, 1, byArray, 0, arg0.length - 1);
        }
        return new sprmra(byArray, (int)by);
    }

    /*
     * WARNING - void declaration
     */
    public sprmra(byte[] byArray, int n) {
        void arg0;
        sprmra sprmra2 = this;
        sprmra2.cfr_renamed_2 = arg0;
        sprmra2.cfr_renamed_4 = n;
    }

    @Override
    public int cfr_renamed_4616() {
        return 1 + sprcme.cfr_renamed_4586(this.cfr_renamed_2.length + 1) + this.cfr_renamed_2.length + 1;
    }

    /*
     * WARNING - void declaration
     */
    public sprmra(spra spra2) throws IOException {
        void arg0;
        sprmra sprmra2 = this;
        sprmra2.cfr_renamed_2 = arg0.cfr_renamed_119().cfr_renamed_104("DER");
        sprmra2.cfr_renamed_4 = 0;
    }

    public static sprmra cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprmra) {
            return (sprmra)arg0;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprbtm.cfr_renamed_9("\f8\t1\u00025\tt\n6\u000f1\u0006 E=\u000bt\u00021\u0011\u001d\u000b'\u00115\u000b7\u0000nE")).append(arg0.getClass().getName()).toString());
    }
}

