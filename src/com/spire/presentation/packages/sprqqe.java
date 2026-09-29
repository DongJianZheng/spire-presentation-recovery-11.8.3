/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprxgf;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public abstract class sprqqe
implements sprco,
sprjn {
    public byte[] cfr_renamed_104(String arg0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        this.cfr_renamed_119().cfr_renamed_8489(byteArrayOutputStream2, arg0);
        return byteArrayOutputStream2.toByteArray();
    }

    public static boolean cfr_renamed_4659(Object arg0, int arg1) {
        return arg0 instanceof byte[] && ((byte[])arg0)[0] == arg1;
    }

    @Override
    public abstract sprxgf cfr_renamed_119();

    public void cfr_renamed_8489(OutputStream arg0, String arg1) throws IOException {
        this.cfr_renamed_119().cfr_renamed_8489(arg0, arg1);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (!(arg0 instanceof sprco)) {
            return false;
        }
        sprco sprco2 = (sprco)arg0;
        return this.cfr_renamed_119().cfr_renamed_5078(sprco2.cfr_renamed_119());
    }

    public void cfr_renamed_3257(OutputStream arg0) throws IOException {
        this.cfr_renamed_119().cfr_renamed_3257(arg0);
    }

    public int hashCode() {
        return this.cfr_renamed_119().hashCode();
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        this.cfr_renamed_119().cfr_renamed_3257(byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }
}

