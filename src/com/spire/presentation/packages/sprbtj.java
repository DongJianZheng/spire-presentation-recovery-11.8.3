/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfjo;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprjv;
import com.spire.presentation.packages.sprmdi;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrcaa;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprydn;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.PublicKey;

public class sprbtj
implements PublicKey {
    private final byte[] cfr_renamed_2;
    private final sprddm cfr_renamed_3;
    private final sprigm cfr_renamed_4;

    @Override
    public String getAlgorithm() {
        return sprrcaa.cfr_renamed_9("/^\u001eC\u0018H\u000bJ!C\u0013");
    }

    public sprbtj(PublicKey arg0, sprigm arg1, MessageDigest arg2) {
        this(arg1, sprmdi.cfr_renamed_5708(arg2.getAlgorithm()), arg2.digest(arg0.getEncoded()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprbtj sprbtj2 = this;
            return new sprvhm(new sprddm(sprjv.cfr_renamed_728), new sprydn(sprbtj2.cfr_renamed_4, sprbtj2.cfr_renamed_3, this.cfr_renamed_2)).cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprfjo.cfr_renamed_9("@@TLYK\u0015ZZ\u000eP@VAQK\u0015MZCEAFGAK\u0015EPW\u000f\u000e")).append(iOException.getMessage()).toString());
        }
    }

    @Override
    public String getFormat() {
        return sprrcaa.cfr_renamed_9("2\b_\u0016S");
    }

    /*
     * WARNING - void declaration
     */
    public sprbtj(sprigm sprigm2, sprddm sprddm2, byte[] byArray) {
        void arg1;
        void arg0;
        sprbtj sprbtj2 = this;
        this.cfr_renamed_4 = arg0;
        sprbtj2.cfr_renamed_3 = arg1;
        sprbtj2.cfr_renamed_2 = sproze.cfr_renamed_158(byArray);
    }

    public sprbtj(sprydn arg0) {
        this(arg0.cfr_renamed_9494(), arg0.cfr_renamed_4881(), arg0.cfr_renamed_4882().cfr_renamed_81());
    }
}

