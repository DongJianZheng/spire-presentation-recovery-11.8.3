/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraye;
import com.spire.presentation.packages.sprbn;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdmp;
import com.spire.presentation.packages.sprhao;
import com.spire.presentation.packages.sprppg;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxxe;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.security.PublicKey;

public class sprjif
implements PublicKey {
    private static final long cfr_renamed_3 = 1L;
    private sprxxe cfr_renamed_4;

    public sprjif(sprxxe sprxxe2) {
        this.cfr_renamed_4 = sprxxe2;
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_4.cfr_renamed_1144();
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_4.cfr_renamed_1146();
    }

    public int hashCode() {
        return 37 * (this.cfr_renamed_4.cfr_renamed_1146() + 37 * this.cfr_renamed_4.cfr_renamed_1144()) + this.cfr_renamed_4.cfr_renamed_1145().hashCode();
    }

    public spraye cfr_renamed_1145() {
        return this.cfr_renamed_4.cfr_renamed_1145();
    }

    @Override
    public String getAlgorithm() {
        return sprhao.cfr_renamed_9("XjPe|lvl");
    }

    public String toString() {
        String string = sprdmp.cfr_renamed_9("\u001d`\u0015o9f3f\u0000v2o9`\u001bf)9Z");
        string = new StringBuilder().insert(0, string).append(sprhao.cfr_renamed_9("5epgr}})zo5}}l5jzmp)5)5)5)5)/)")).append(this.cfr_renamed_4.cfr_renamed_1146()).append("\n").toString();
        string = new StringBuilder().insert(0, string).append(sprdmp.cfr_renamed_9("#5q\"l\"#3l\"q5`$j?mp`1s1a9o9w)9p")).append(this.cfr_renamed_4.cfr_renamed_1144()).append("\n").toString();
        string = new StringBuilder().insert(0, string).append(sprhao.cfr_renamed_9("5npgp{t}z{5dt}g`m)5)5)5)5)5)/)")).append(this.cfr_renamed_4.cfr_renamed_1145()).toString();
        return string;
    }

    public spryye cfr_renamed_5650() {
        return this.cfr_renamed_4;
    }

    @Override
    public String getFormat() {
        return sprdmp.cfr_renamed_9("\b-e3i");
    }

    public boolean equals(Object arg0) {
        if (arg0 instanceof sprjif) {
            sprjif sprjif2 = (sprjif)arg0;
            return this.cfr_renamed_4.cfr_renamed_1146() == sprjif2.cfr_renamed_1146() && this.cfr_renamed_4.cfr_renamed_1144() == sprjif2.cfr_renamed_1144() && this.cfr_renamed_4.cfr_renamed_1145().equals(sprjif2.cfr_renamed_1145());
        }
        return false;
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_4.cfr_renamed_1150();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        sprppg sprppg2 = new sprppg(this.cfr_renamed_4.cfr_renamed_1146(), this.cfr_renamed_4.cfr_renamed_1144(), this.cfr_renamed_4.cfr_renamed_1145());
        sprddm sprddm2 = new sprddm(sprbn.cfr_renamed_112);
        try {
            sprvhm sprvhm2 = new sprvhm(sprddm2, sprppg2);
            return sprvhm2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }
}

