/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkro;
import com.spire.presentation.packages.sprpnl;
import com.spire.presentation.packages.sprsjo;
import java.io.ByteArrayOutputStream;

public class sprpzl
extends sprpnl {
    public static final int cfr_renamed_1 = 2;
    public static final int cfr_renamed_2 = 4;
    public static final int cfr_renamed_3 = 2;

    public sprpzl(boolean arg0, boolean arg1, String arg2, String arg3) {
        super(20, arg0, false, sprpzl.cfr_renamed_11063(arg1, arg2, arg3));
    }

    private static /* synthetic */ byte[] cfr_renamed_11063(boolean arg0, String arg1, String arg2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(arg0 ? 128 : 0);
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
        byteArrayOutputStream.write(0);
        byteArrayOutputStream2.write(0);
        byteArrayOutputStream2.write(0);
        byte[] byArray = null;
        byte[] byArray2 = sprkoe.cfr_renamed_431(arg1);
        int n = Math.min(byArray2.length, 65535);
        if (n != byArray2.length) {
            throw new IllegalArgumentException(sprkro.cfr_renamed_9("NLTBTJOMnBMF\u0000FX@EFDP\u0000NA[INUN\u0000OEMGWH\r"));
        }
        byArray = sprkoe.cfr_renamed_431(arg2);
        int n2 = Math.min(byArray.length, 65535);
        if (n2 != byArray.length) {
            throw new IllegalArgumentException(sprsjo.cfr_renamed_9("c#y-y%b\"[-a9hlh4n)h(~l`-u%`9`la)c+y$#"));
        }
        ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream5 = byteArrayOutputStream;
        byteArrayOutputStream5.write(n >>> 8 & 0xFF);
        byteArrayOutputStream5.write(n >>> 0 & 0xFF);
        byteArrayOutputStream4.write(n2 >>> 8 & 0xFF);
        byteArrayOutputStream4.write(n2 >>> 0 & 0xFF);
        byteArrayOutputStream3.write(byArray2, 0, n);
        byteArrayOutputStream3.write(byArray, 0, n2);
        return byteArrayOutputStream.toByteArray();
    }

    public String cfr_renamed_8079() {
        return sprkoe.cfr_renamed_427(this.cfr_renamed_11064());
    }

    public byte[] cfr_renamed_11064() {
        sprpzl sprpzl2 = this;
        sprpzl sprpzl3 = this;
        int n = ((sprpzl2.cfr_renamed_2[4] & 0xFF) << 8) + (sprpzl3.cfr_renamed_2[5] & 0xFF);
        int n2 = ((sprpzl2.cfr_renamed_2[6] & 0xFF) << 8) + (this.cfr_renamed_2[7] & 0xFF);
        byte[] byArray = new byte[n2];
        System.arraycopy(sprpzl3.cfr_renamed_2, 8 + n, byArray, 0, n2);
        return byArray;
    }

    public boolean cfr_renamed_11065() {
        return this.cfr_renamed_2[0] == -128;
    }

    public sprpzl(boolean arg0, boolean arg1, byte[] arg2) {
        super(20, arg0, arg1, arg2);
    }

    public String cfr_renamed_7626() {
        sprpzl sprpzl2 = this;
        int n = ((this.cfr_renamed_2[4] & 0xFF) << 8) + (sprpzl2.cfr_renamed_2[5] & 0xFF);
        byte[] byArray = new byte[n];
        System.arraycopy(sprpzl2.cfr_renamed_2, 8, byArray, 0, n);
        return sprkoe.cfr_renamed_427(byArray);
    }
}

