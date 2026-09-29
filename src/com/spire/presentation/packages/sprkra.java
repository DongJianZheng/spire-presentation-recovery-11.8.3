/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbcq;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprpve;
import com.spire.presentation.packages.sprrnr;
import com.spire.presentation.packages.sprrqe;
import com.spire.presentation.packages.sprvva;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public abstract class sprkra
implements spra {
    public static boolean cfr_renamed_4659(Object arg0, int arg1) {
        return arg0 instanceof byte[] && ((byte[])arg0)[0] == arg1;
    }

    public int hashCode() {
        return this.cfr_renamed_119().hashCode();
    }

    public byte[] cfr_renamed_91() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new sprope(byteArrayOutputStream).cfr_renamed_2149(this);
        return byteArrayOutputStream.toByteArray();
    }

    @Override
    public abstract sprvva cfr_renamed_119();

    public sprvva cfr_renamed_94() {
        return this.cfr_renamed_119();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprkra cfr_renamed_184(byte[] arg0) throws Exception {
        try {
            sprgle sprgle2 = new sprgle(arg0);
            return sprgle2.cfr_renamed_24();
        }
        catch (ClassCastException classCastException) {
            throw new IOException(sprbcq.cfr_renamed_9("\u00141\u0019>\u0018$W\"\u00123\u00187\u00199\u00045W?\u0015:\u00123\u0003p\u001e>W2\u000e$\u0012p\u0016\"\u00051\u000e"));
        }
    }

    public byte[] cfr_renamed_104(String arg0) throws IOException {
        if (arg0.equals("DER")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            sprpve sprpve2 = new sprpve(byteArrayOutputStream);
            sprpve2.cfr_renamed_2149(this);
            return byteArrayOutputStream.toByteArray();
        }
        if (arg0.equals("DL")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            sprrqe sprrqe2 = new sprrqe(byteArrayOutputStream);
            sprrqe2.cfr_renamed_2149(this);
            return byteArrayOutputStream.toByteArray();
        }
        return this.cfr_renamed_91();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprkra cfr_renamed_4930(spreen arg0) throws Exception {
        try {
            return new sprgle(arg0.cfr_renamed_4931()).cfr_renamed_24();
        }
        catch (ClassCastException classCastException) {
            throw new IOException(sprrnr.cfr_renamed_9("&O+@*Ze\\ M*I+G6KeA'D M1\u000e,@e]1\\ O("));
        }
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (!(arg0 instanceof spra)) {
            return false;
        }
        spra spra2 = (spra)arg0;
        return this.cfr_renamed_119().equals(spra2.cfr_renamed_119());
    }
}

