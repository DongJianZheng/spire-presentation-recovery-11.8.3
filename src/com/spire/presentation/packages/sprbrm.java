/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprehga;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprbrm
extends sprqqe {
    private final sprlem cfr_renamed_3;
    private final sprco cfr_renamed_4;

    public static sprbrm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbrm) {
            return (sprbrm)arg0;
        }
        if (arg0 instanceof sprco) {
            sprxgf sprxgf2 = ((sprco)arg0).cfr_renamed_119();
            if (sprxgf2 instanceof sprszm) {
                return new sprbrm((sprszm)sprxgf2);
            }
        } else if (arg0 instanceof byte[]) {
            return sprbrm.cfr_renamed_23(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbrm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprehga.cfr_renamed_9("\bB*R>I8B{J.T/\u00079B{\u0015{B7B6B5S(\t"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprlem.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = v0.cfr_renamed_85(1);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = this.cfr_renamed_4;
        return new sprcen(sprcoArray);
    }

    public sprlem cfr_renamed_11398() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprbrm(sprlem sprlem2, sprco sprco2) {
        void arg0;
        sprbrm sprbrm2 = this;
        sprbrm2.cfr_renamed_3 = arg0;
        sprbrm2.cfr_renamed_4 = sprco2;
    }

    public sprco cfr_renamed_11399() {
        return this.cfr_renamed_4;
    }
}

