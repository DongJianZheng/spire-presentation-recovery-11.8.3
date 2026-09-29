/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahe;
import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprmwy;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzra;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class sprbqe
extends sprvva
implements sprx {
    private byte[] cfr_renamed_3;
    private static final char[] cfr_renamed_4;

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        arg0.cfr_renamed_4614(28, this.cfr_renamed_186());
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprbqe)) {
            return false;
        }
        return sprzra.cfr_renamed_92(this.cfr_renamed_3, ((sprbqe)arg0).cfr_renamed_3);
    }

    @Override
    public boolean cfr_renamed_4575() {
        return false;
    }

    @Override
    public int cfr_renamed_4616() {
        return 1 + sprcme.cfr_renamed_4586(this.cfr_renamed_3.length) + this.cfr_renamed_3.length;
    }

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
            throw new RuntimeException(sprahe.cfr_renamed_9("31.:(1;3z:(-5-z:4<5;31=\u007f\u00186.\f.-31="));
        }
        byte[] byArray = byteArrayOutputStream.toByteArray();
        int n2 = n = 0;
        while (n2 != byArray.length) {
            stringBuffer.append(cfr_renamed_4[byArray[n] >>> 4 & 0xF]);
            int n3 = byArray[n] & 0xF;
            stringBuffer.append(cfr_renamed_4[n3]);
            n2 = ++n;
        }
        return stringBuffer.toString();
    }

    public sprbqe(byte[] byArray) {
        this.cfr_renamed_3 = byArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprbqe cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprbqe) {
            return (sprbqe)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprahe.cfr_renamed_9("336:=>6\u007f5=0:9+z64\u007f=:.\u00164,.>4<?ez")).append(arg0.getClass().getName()).toString());
        }
        try {
            return (sprbqe)sprbqe.cfr_renamed_184((byte[])arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmwy.cfr_renamed_9("\u0002I\u0004H\u0003N\t@GB\u0015U\bUG@\u0002S.I\u0014S\u0006I\u0004B]\u0007")).append(exception.toString()).toString());
        }
    }

    @Override
    public int hashCode() {
        return sprzra.cfr_renamed_95(this.cfr_renamed_3);
    }

    public String toString() {
        return this.cfr_renamed_314();
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
        cfr_renamed_4 = cArray;
    }

    public byte[] cfr_renamed_186() {
        return this.cfr_renamed_3;
    }

    public static sprbqe cfr_renamed_341(spryte arg0, boolean arg1) {
        sprvva sprvva2 = arg0.cfr_renamed_2456();
        if (arg1 || sprvva2 instanceof sprbqe) {
            return sprbqe.cfr_renamed_23(sprvva2);
        }
        return new sprbqe(((sprxue)sprvva2).cfr_renamed_186());
    }
}

