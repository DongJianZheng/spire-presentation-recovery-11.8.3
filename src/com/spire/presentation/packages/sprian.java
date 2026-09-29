/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprebz;
import com.spire.presentation.packages.sprgxm;
import com.spire.presentation.packages.sprizm;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprtza;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public abstract class sprian
extends sprxgf
implements sprml {
    public final byte[] cfr_renamed_2;
    public static final sprqbn cfr_renamed_3 = new sprgxm(sprian.class, 28);
    private static final char[] cfr_renamed_4;

    public final byte[] cfr_renamed_186() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    public static sprian cfr_renamed_23(Object arg0) {
        sprxgf sprxgf2;
        if (arg0 == null || arg0 instanceof sprian) {
            return (sprian)arg0;
        }
        if (arg0 instanceof sprco && (sprxgf2 = ((sprco)arg0).cfr_renamed_119()) instanceof sprian) {
            return (sprian)sprxgf2;
        }
        if (arg0 instanceof byte[]) {
            try {
                return (sprian)cfr_renamed_3.cfr_renamed_184((byte[])arg0);
            }
            catch (Exception exception) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprtza.cfr_renamed_9("u8s9t?~103b$\u007f$01u\"Y8c\"q8s3*v")).append(exception.toString()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprebz.cfr_renamed_9("\u0010]\u0015T\u001eP\u0015\u0011\u0016S\u0013T\u001aEYX\u0017\u0011\u001eT\rx\u0017B\rP\u0017R\u001c\u000bY")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public final void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 28, this.cfr_renamed_2);
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

    public static sprian cfr_renamed_11295(byte[] arg0) {
        return new sprizm(arg0, false);
    }

    @Override
    public final boolean cfr_renamed_11277() {
        return false;
    }

    @Override
    public final boolean cfr_renamed_11432(sprxgf arg0) {
        if (!(arg0 instanceof sprian)) {
            return false;
        }
        sprian sprian2 = (sprian)arg0;
        return sproze.cfr_renamed_92(this.cfr_renamed_2, sprian2.cfr_renamed_2);
    }

    private static /* synthetic */ void cfr_renamed_11475(StringBuffer arg0, int arg1) {
        arg0.append(cfr_renamed_4[arg1 >>> 4 & 0xF]);
        arg0.append(cfr_renamed_4[arg1 & 0xF]);
    }

    /*
     * WARNING - void declaration
     */
    public sprian(byte[] byArray, boolean bl) {
        void arg0;
        this.cfr_renamed_2 = (byte[])(bl ? sproze.cfr_renamed_158((byte[])arg0) : arg0);
    }

    private static /* synthetic */ void cfr_renamed_11476(StringBuffer arg0, int arg1) {
        if (arg1 < 128) {
            sprian.cfr_renamed_11475(arg0, arg1);
            return;
        }
        byte[] byArray = new byte[5];
        int n = 5;
        do {
            byArray[--n] = (byte)arg1;
        } while ((arg1 >>>= 8) != 0);
        int n2 = byArray.length - n--;
        byArray[n] = (byte)(0x80 | n2);
        do {
            sprian.cfr_renamed_11475(arg0, byArray[n]);
        } while (++n < byArray.length);
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    @Override
    public final String cfr_renamed_314() {
        int n = this.cfr_renamed_2.length;
        StringBuffer stringBuffer = new StringBuffer(3 + 2 * (sproen.cfr_renamed_11275(n) + n));
        stringBuffer.append(sprtza.cfr_renamed_9("u!\u0015"));
        sprian.cfr_renamed_11476(stringBuffer, n);
        int n2 = 0;
        int n3 = n2;
        while (n3 < n) {
            sprian.cfr_renamed_11475(stringBuffer, this.cfr_renamed_2[n2++]);
            n3 = n2;
        }
        return stringBuffer.toString();
    }

    public static sprian cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprian)cfr_renamed_3.cfr_renamed_11433(arg0, arg1);
    }

    @Override
    public final int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_2);
    }

    @Override
    public final int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_2.length);
    }
}

