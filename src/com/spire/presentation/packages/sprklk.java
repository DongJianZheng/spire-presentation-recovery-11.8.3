/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprjn;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public abstract class sprklk
implements sprjn {
    public abstract void cfr_renamed_11038(sprjah var1) throws IOException;

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        sprjah sprjah2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprjah sprjah3 = sprjah2 = new sprjah(byteArrayOutputStream);
        sprjah3.cfr_renamed_7759(this);
        sprjah3.close();
        return byteArrayOutputStream.toByteArray();
    }
}

