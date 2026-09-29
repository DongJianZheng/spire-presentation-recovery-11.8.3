/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprggf;
import com.spire.presentation.packages.sprjhb;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprohf;
import com.spire.presentation.packages.sprrgo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class sprxdf
extends sprggf {
    private final File cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprxdf(File file) throws FileNotFoundException {
        void arg0;
        if (file.isDirectory()) {
            throw new IllegalArgumentException(sprjhb.cfr_renamed_9("H`^lO}C{U)BfX)Me@f[lH)Mz\fL~Zj`@lhhXh"));
        }
        if (!arg0.exists()) {
            throw new FileNotFoundException(new StringBuilder().insert(0, arg0.getAbsolutePath()).append(sprrgo.cfr_renamed_9("\u0017BXCD\u0006YIC\u0006R^^UC")).toString());
        }
        if (!arg0.canRead()) {
            throw new FileNotFoundException(new StringBuilder().insert(0, arg0.getAbsolutePath()).append(sprjhb.cfr_renamed_9("\f`_)BfX)^lMmMk@l")).toString());
        }
        this.cfr_renamed_4 = arg0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_5328(sprjj arg0, byte[] arg1) {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.cfr_renamed_4);
            byte[] byArray = sprohf.cfr_renamed_5316(arg0, fileInputStream);
            ((InputStream)fileInputStream).close();
            if (arg1 == null) return byArray;
            return sprohf.cfr_renamed_5323(arg0, arg1, byArray);
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprrgo.cfr_renamed_9("SYGUJR\u0006CI\u0017VEITCDU\u0017")).append(this.cfr_renamed_4.getAbsolutePath()).toString());
        }
    }
}

