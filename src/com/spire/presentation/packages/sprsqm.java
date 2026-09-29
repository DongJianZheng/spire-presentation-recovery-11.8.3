/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqad;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprspq;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtp;
import com.spire.presentation.packages.sprvkm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxom;
import java.util.Enumeration;

public class sprsqm
extends sprqqe
implements sprtp {
    private sprddm cfr_renamed_0;
    public static final int cfr_renamed_1 = 16;
    private sprvkm[] cfr_renamed_2;
    private sprktm cfr_renamed_3;
    private sprxom cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprsqm(sprszm sprszm2) {
        int n;
        Enumeration enumeration;
        void arg0;
        sprsqm sprsqm2 = this;
        sprsqm2.cfr_renamed_3 = new sprktm(0L);
        if (sprszm2 == null || arg0.cfr_renamed_84() == 0) {
            throw new IllegalArgumentException(sprqad.cfr_renamed_9("J\u0012H\u000b\u0004\bVGA\nT\u0013]GW\u0002U\u0012A\tG\u0002\u0004\u0017E\u0014W\u0002@I"));
        }
        Enumeration enumeration2 = enumeration = arg0.cfr_renamed_329();
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(enumeration2.nextElement());
        this.cfr_renamed_0 = sprddm.cfr_renamed_23(enumeration2.nextElement());
        sprszm sprszm3 = sprszm.cfr_renamed_23(enumeration.nextElement());
        if (this.cfr_renamed_3.cfr_renamed_7241(1)) {
            this.cfr_renamed_4 = sprxom.cfr_renamed_23(enumeration.nextElement());
        }
        sprszm sprszm4 = sprszm3;
        this.cfr_renamed_4641(sprszm4.cfr_renamed_84());
        this.cfr_renamed_2 = new sprvkm[sprszm4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < sprszm3.cfr_renamed_84()) {
            int n3 = n++;
            this.cfr_renamed_2[n3] = sprvkm.cfr_renamed_23(sprszm3.cfr_renamed_85(n3));
            n2 = n;
        }
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_3.cfr_renamed_5023();
    }

    public sprxom cfr_renamed_4642() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprsqm(sprddm sprddm2, sprvkm[] sprvkmArray, sprxom sprxom2) {
        void arg2;
        void arg1;
        void arg0;
        sprsqm sprsqm2 = this;
        this.cfr_renamed_3 = new sprktm(0L);
        sprsqm2.cfr_renamed_3 = new sprktm(1L);
        this.cfr_renamed_0 = arg0;
        this.cfr_renamed_2 = this.cfr_renamed_11223((sprvkm[])arg1);
        this.cfr_renamed_4 = arg2;
        this.cfr_renamed_4641(sprvkmArray.length);
    }

    private /* synthetic */ void cfr_renamed_4641(int arg0) {
        if (arg0 < 2 || arg0 > 16) {
            throw new IllegalArgumentException(sprspq.cfr_renamed_9("\f]\u0014A\u001c\u000f\bF\u0001J[F\u0015\u000f?N\u000fN<]\u0014Z\u000bg\u001a\\\u0013y\u001aC\u000eJ\b\u000fA\u000f\u0015@\u000f\u000f\u0012A[\u0007I\u0001U\u001eM\u0006"));
        }
    }

    private /* synthetic */ sprvkm[] cfr_renamed_11223(sprvkm[] arg0) {
        sprvkm[] sprvkmArray = new sprvkm[arg0.length];
        System.arraycopy(arg0, 0, sprvkmArray, 0, sprvkmArray.length);
        return sprvkmArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprsqm(sprddm sprddm2, sprvkm[] sprvkmArray) {
        void arg1;
        void arg0;
        sprsqm sprsqm2 = this;
        sprsqm sprsqm3 = this;
        sprsqm sprsqm4 = this;
        sprsqm3.cfr_renamed_3 = new sprktm(0L);
        sprsqm3.cfr_renamed_3 = new sprktm(0L);
        sprsqm3.cfr_renamed_0 = arg0;
        sprsqm2.cfr_renamed_2 = sprsqm2.cfr_renamed_11223((sprvkm[])arg1);
        sprsqm2.cfr_renamed_4641(sprvkmArray.length);
    }

    public sprddm cfr_renamed_1479() {
        return this.cfr_renamed_0;
    }

    public static sprsqm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsqm) {
            return (sprsqm)arg0;
        }
        if (arg0 != null) {
            return new sprsqm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprvkm[] cfr_renamed_4643() {
        sprsqm sprsqm2 = this;
        return sprsqm2.cfr_renamed_11223(sprsqm2.cfr_renamed_2);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        sprsqm sprsqm2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(sprsqm2.cfr_renamed_0);
        sprrvm sprrvm3 = sprrvm2;
        sprrvm2.cfr_renamed_5004(new sprcen(this.cfr_renamed_2));
        if (sprsqm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }
}

