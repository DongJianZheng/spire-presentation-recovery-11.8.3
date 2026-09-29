/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqg;
import com.spire.presentation.packages.spraye;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbn;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprefd;
import com.spire.presentation.packages.sprhff;
import com.spire.presentation.packages.spricf;
import com.spire.presentation.packages.sprmvr;
import com.spire.presentation.packages.sprnhf;
import com.spire.presentation.packages.sprwff;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.security.PrivateKey;

public class spralf
implements sprbj,
PrivateKey {
    private sprhff cfr_renamed_3;
    private static final long cfr_renamed_4 = 1L;

    @Override
    public String getFormat() {
        return sprefd.cfr_renamed_9("vAeY\u00052");
    }

    public sprnhf cfr_renamed_845() {
        return this.cfr_renamed_3.cfr_renamed_845();
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_3.cfr_renamed_1150();
    }

    @Override
    public String getAlgorithm() {
        return sprmvr.cfr_renamed_9("[\u0000S\u000f\u007f\u0006u\u0006");
    }

    public spraye cfr_renamed_1153() {
        return this.cfr_renamed_3.cfr_renamed_1153();
    }

    public sprwff cfr_renamed_1152() {
        return this.cfr_renamed_3.cfr_renamed_1152();
    }

    public spricf cfr_renamed_1147() {
        return this.cfr_renamed_3.cfr_renamed_1147();
    }

    public spraye cfr_renamed_1149() {
        return this.cfr_renamed_3.cfr_renamed_1149();
    }

    public spryye cfr_renamed_5650() {
        return this.cfr_renamed_3;
    }

    public sprwff cfr_renamed_1151() {
        return this.cfr_renamed_3.cfr_renamed_1151();
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_3.cfr_renamed_1146();
    }

    public spralf(sprhff sprhff2) {
        this.cfr_renamed_3 = sprhff2;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof spralf)) {
            return false;
        }
        spralf spralf2 = (spralf)arg0;
        return this.cfr_renamed_1146() == spralf2.cfr_renamed_1146() && this.cfr_renamed_1150() == spralf2.cfr_renamed_1150() && this.cfr_renamed_845().equals(spralf2.cfr_renamed_845()) && this.cfr_renamed_1147().equals(spralf2.cfr_renamed_1147()) && this.cfr_renamed_1149().equals(spralf2.cfr_renamed_1149()) && this.cfr_renamed_1152().equals(spralf2.cfr_renamed_1152()) && this.cfr_renamed_1151().equals(spralf2.cfr_renamed_1151());
    }

    public spricf[] cfr_renamed_1148() {
        return this.cfr_renamed_3.cfr_renamed_1148();
    }

    public int hashCode() {
        int n = this.cfr_renamed_3.cfr_renamed_1150();
        n = n * 37 + this.cfr_renamed_3.cfr_renamed_1146();
        n = n * 37 + this.cfr_renamed_3.cfr_renamed_845().hashCode();
        n = n * 37 + this.cfr_renamed_3.cfr_renamed_1147().hashCode();
        n = n * 37 + this.cfr_renamed_3.cfr_renamed_1152().hashCode();
        n = n * 37 + this.cfr_renamed_3.cfr_renamed_1151().hashCode();
        return n * 37 + this.cfr_renamed_3.cfr_renamed_1149().hashCode();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        spraqg spraqg2 = new spraqg(this.cfr_renamed_3.cfr_renamed_1146(), this.cfr_renamed_3.cfr_renamed_1150(), this.cfr_renamed_3.cfr_renamed_845(), this.cfr_renamed_3.cfr_renamed_1147(), this.cfr_renamed_3.cfr_renamed_1152(), this.cfr_renamed_3.cfr_renamed_1151(), this.cfr_renamed_3.cfr_renamed_1149());
        try {
            sprddm sprddm2 = new sprddm(sprbn.cfr_renamed_112);
            sprcom sprcom2 = new sprcom(sprddm2, spraqg2);
            return (sprddm)sprcom2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }
}

