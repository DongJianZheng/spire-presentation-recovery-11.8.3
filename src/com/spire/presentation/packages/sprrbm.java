/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.spretc;
import com.spire.presentation.packages.sprmfka;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class sprrbm
extends sprqqe {
    private sprndm cfr_renamed_3;
    private sprndm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0, this.cfr_renamed_3));
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(1, this.cfr_renamed_4));
        }
        return new sprcen(sprrvm2);
    }

    public sprndm cfr_renamed_178() {
        return this.cfr_renamed_4;
    }

    public sprndm cfr_renamed_177() {
        return this.cfr_renamed_3;
    }

    public static sprrbm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprrbm) {
            return (sprrbm)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprrbm((sprszm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprmfka.cfr_renamed_9("\\VY_R[Y\u001aZX__VN\u0015S[\u001aR_As[IA[[YP\u0000\u0015")).append(arg0.getClass().getName()).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprrbm(sprndm sprndm2, sprndm sprndm3) {
        void arg0;
        sprrbm sprrbm2 = this;
        sprrbm2.cfr_renamed_3 = arg0;
        sprrbm2.cfr_renamed_4 = sprndm3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprrbm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 1 && arg0.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spretc.cfr_renamed_9("!x\u00079\u0010|\u0012l\u0006w\u0000|Cj\nc\u0006#C")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_23(enumeration.nextElement());
            if (sprnvm2.cfr_renamed_312() == 0) {
                this.cfr_renamed_3 = sprndm.cfr_renamed_5085(sprnvm2, true);
                continue;
            }
            if (sprnvm2.cfr_renamed_312() == 1) {
                this.cfr_renamed_4 = sprndm.cfr_renamed_5085(sprnvm2, true);
                continue;
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmfka.cfr_renamed_9("xT^\u0015NT]\u0015T@WW_G\u0000\u0015")).append(sprnvm2.cfr_renamed_312()).toString());
        }
    }
}

