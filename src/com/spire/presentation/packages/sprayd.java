/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbwe;
import com.spire.presentation.packages.spreoe;
import com.spire.presentation.packages.sprerd;
import com.spire.presentation.packages.sprfa;
import com.spire.presentation.packages.sprhvd;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprpjc;
import com.spire.presentation.packages.sprtoba;
import com.spire.presentation.packages.sprua;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class sprayd {
    private sprbwe cfr_renamed_3;
    private sprnte cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprayd(sprnte sprnte2) {
        void arg0;
        sprayd sprayd2 = this;
        sprayd2.cfr_renamed_4 = arg0;
        sprayd2.cfr_renamed_3 = sprbwe.cfr_renamed_23(sprnte2.cfr_renamed_480());
    }

    public sprnte cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprhvd cfr_renamed_4179(sprua arg0) throws sprlqd {
        try {
            spreoe spreoe2 = this.cfr_renamed_3.cfr_renamed_4172();
            sprfa sprfa2 = arg0.cfr_renamed_578(spreoe2.cfr_renamed_4173());
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(spreoe2.cfr_renamed_4178().cfr_renamed_186());
            return new sprhvd(spreoe2.cfr_renamed_696(), sprfa2.cfr_renamed_1447(byteArrayInputStream));
        }
        catch (Exception exception) {
            throw new sprlqd(new StringBuilder().insert(0, sprtoba.cfr_renamed_9("!a5m8jt{;/7}1n jt| }1n95t")).append(exception.getMessage()).toString(), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_1450(sprua arg0) throws sprlqd {
        try {
            return sprerd.cfr_renamed_4002(this.cfr_renamed_4179(arg0).cfr_renamed_4004());
        }
        catch (IOException iOException) {
            throw new sprlqd(new StringBuilder().insert(0, sprpjc.cfr_renamed_9("\rK\u0019G\u0014@XQ\u0017\u0005\bD\nV\u001d\u0005\u0011K\f@\nK\u0019IXV\fW\u001dD\u0015\u001fX")).append(iOException.getMessage()).toString(), iOException);
        }
    }
}

