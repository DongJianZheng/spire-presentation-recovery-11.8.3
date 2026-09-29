/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraoe;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmqfa;
import com.spire.presentation.packages.sprnpe;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprywh;

public class sprsje
extends sprkra
implements sprkj {
    public static final int cfr_renamed_1 = 2;
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 1;
    private spryte cfr_renamed_4;

    public int cfr_renamed_324() {
        return this.cfr_renamed_4.cfr_renamed_312();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprsje(spryte spryte2) {
        void arg0;
        if (spryte2.cfr_renamed_312() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprywh.cfr_renamed_9("\u0005{#:3{ :)o*x\"h}:")).append(arg0.cfr_renamed_312()).toString());
        }
        this.cfr_renamed_4 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprsje(int n) {
        void arg0;
        sprsje sprsje2 = this;
        sprsje2.cfr_renamed_4 = new sprhse(0 != 0, 0, new sprooe((long)arg0));
    }

    public int cfr_renamed_4630() {
        if (this.cfr_renamed_4.cfr_renamed_312() != 0) {
            return -1;
        }
        return sprooe.cfr_renamed_341(this.cfr_renamed_4, false).cfr_renamed_97().intValue();
    }

    /*
     * WARNING - void declaration
     */
    public sprsje(sprrpe sprrpe2) {
        void arg0;
        sprsje sprsje2 = this;
        sprsje2.cfr_renamed_4 = new sprhse(false, 2, (spra)arg0);
    }

    public sprrpe cfr_renamed_4478() {
        if (this.cfr_renamed_4.cfr_renamed_312() != 2) {
            return null;
        }
        return sprrpe.cfr_renamed_341(this.cfr_renamed_4, false);
    }

    /*
     * WARNING - void declaration
     */
    public sprsje(boolean bl, String string) {
        sprlre sprlre2;
        void arg1;
        void arg0;
        if (string.length() > 2) {
            throw new IllegalArgumentException(sprmqfa.cfr_renamed_9("\u001fi\th\bt\u0005&\u001fg\u0012&\u0013h\u0010\u007f\\d\u0019&N&\u001fn\u001dt\u001de\bc\u000eu"));
        }
        if (arg0 != false) {
            sprsje sprsje2 = this;
            sprsje2.cfr_renamed_4 = new sprhse(false, 1, new sprpse(new spraoe((String)arg1, true)));
            return;
        }
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(sprnpe.cfr_renamed_3);
        sprlre3.cfr_renamed_49(new spraoe((String)arg1, true));
        this.cfr_renamed_4 = new sprhse(false, 1, new sprpse(sprlre2));
    }

    public static sprsje cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprsje) {
            return (sprsje)arg0;
        }
        if (arg0 instanceof spryte) {
            return new sprsje((spryte)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprywh.cfr_renamed_9("s+v\"}&vgu%p\"y3:.tg}\"n\u000et4n&t$\u007f}:")).append(arg0.getClass().getName()).toString());
    }

    public sprbne cfr_renamed_4631() {
        if (this.cfr_renamed_4.cfr_renamed_312() != 1) {
            return null;
        }
        return sprbne.cfr_renamed_341(this.cfr_renamed_4, false);
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }
}

