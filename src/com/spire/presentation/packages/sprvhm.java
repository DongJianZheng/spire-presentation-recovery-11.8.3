/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvqfa;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.util.Enumeration;

public class sprvhm
extends sprqqe {
    private sprddm cfr_renamed_3;
    private sprgbf cfr_renamed_4;

    public sprxgf cfr_renamed_1227() throws IOException {
        return sprxgf.cfr_renamed_184(this.cfr_renamed_4.cfr_renamed_186());
    }

    /*
     * WARNING - void declaration
     */
    public sprvhm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprvqfa.cfr_renamed_9("'3\u0001r\u00167\u0014'\u0000<\u00067E!\f(\u0000hE")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        sprvhm sprvhm2 = this;
        sprvhm2.cfr_renamed_3 = sprddm.cfr_renamed_23(enumeration.nextElement());
        sprvhm2.cfr_renamed_4 = sprgbf.cfr_renamed_23(enumeration.nextElement());
    }

    public sprgbf cfr_renamed_2314() {
        return this.cfr_renamed_4;
    }

    public sprddm cfr_renamed_1473() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprvhm(sprddm sprddm2, byte[] byArray) {
        void arg1;
        sprvhm sprvhm2 = this;
        this.cfr_renamed_4 = new sprdye((byte[])arg1);
        this.cfr_renamed_3 = sprddm2;
    }

    public sprddm cfr_renamed_593() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprvhm(sprddm sprddm2, sprco sprco2) throws IOException {
        void arg1;
        sprvhm sprvhm2 = this;
        this.cfr_renamed_4 = new sprdye((sprco)arg1);
        this.cfr_renamed_3 = sprddm2;
    }

    public static sprvhm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvhm) {
            return (sprvhm)arg0;
        }
        if (arg0 != null) {
            return new sprvhm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprxgf cfr_renamed_1157() throws IOException {
        return sprxgf.cfr_renamed_184(this.cfr_renamed_4.cfr_renamed_186());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    public static sprvhm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprvhm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }
}

