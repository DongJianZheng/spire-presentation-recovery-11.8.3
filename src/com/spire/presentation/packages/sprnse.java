/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.spriae;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnpe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqad;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwsia;
import com.spire.presentation.packages.spryte;

public class sprnse
extends sprkra {
    private boolean cfr_renamed_1;
    private boolean cfr_renamed_2;
    private spriae[] cfr_renamed_3;
    private boolean cfr_renamed_4;

    public String toString() {
        return new StringBuilder().insert(0, sprqad.cfr_renamed_9("t\u0006P\u000ft\u0015K\u0004m\tT\u0012P]\u0004\u001c.\u0006G\u0004A\u0017P\u0006F\u000bA7K\u000bM\u0004]4A\u0013\u001eG")).append(this.cfr_renamed_3).append("\n").append(sprwsia.cfr_renamed_9("{(z/p/f\u0016}*{%k\u000bs6b/|!(f")).append(this.cfr_renamed_2).append("\n").append(sprqad.cfr_renamed_9("A\u001fT\u000bM\u0004M\u0013t\bH\u000eG\u001ev\u0002U\u0003\u001eG")).append(this.cfr_renamed_1).append("\n").append(sprwsia.cfr_renamed_9("{(z/p/f\u0007|?B)~/q?(f")).append(this.cfr_renamed_4).append("\n").append(sprqad.cfr_renamed_9("Ym")).toString();
    }

    public boolean cfr_renamed_4755() {
        return this.cfr_renamed_1;
    }

    public boolean cfr_renamed_4756() {
        return this.cfr_renamed_4;
    }

    public boolean cfr_renamed_4757() {
        return this.cfr_renamed_2;
    }

    public static sprnse cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprnse.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    private static /* synthetic */ spriae[] cfr_renamed_4758(sprbne arg0) {
        int n;
        spriae[] spriaeArray = new spriae[arg0.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != spriaeArray.length) {
            int n3 = n++;
            spriaeArray[n3] = spriae.cfr_renamed_23(arg0.cfr_renamed_85(n3));
            n2 = n;
        }
        return spriaeArray;
    }

    public spriae[] cfr_renamed_4759() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        int n;
        sprlre sprlre2 = new sprlre();
        sprlre sprlre3 = new sprlre();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.length) {
            sprlre3.cfr_renamed_49(this.cfr_renamed_3[n++]);
            n2 = n;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre3));
        if (this.cfr_renamed_2) {
            sprlre2.cfr_renamed_49(new sprnpe(this.cfr_renamed_2));
        }
        if (this.cfr_renamed_1) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, new sprnpe(this.cfr_renamed_1)));
        }
        if (this.cfr_renamed_4) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, new sprnpe(this.cfr_renamed_4)));
        }
        return new sprpse(sprlre2);
    }

    private /* synthetic */ void cfr_renamed_4760(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }

    private /* synthetic */ void cfr_renamed_4761(boolean arg0) {
        this.cfr_renamed_1 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprnse(spriae[] spriaeArray, boolean bl, boolean bl2, boolean bl3) {
        void arg2;
        void arg1;
        void arg0;
        sprnse sprnse2 = this;
        sprnse sprnse3 = this;
        sprnse sprnse4 = this;
        this.cfr_renamed_2 = false;
        sprnse4.cfr_renamed_1 = false;
        sprnse4.cfr_renamed_4 = false;
        sprnse3.cfr_renamed_3 = arg0;
        sprnse3.cfr_renamed_2 = arg1;
        sprnse2.cfr_renamed_1 = arg2;
        sprnse2.cfr_renamed_4 = bl3;
    }

    public static sprnse cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnse) {
            return (sprnse)arg0;
        }
        if (arg0 != null) {
            int n;
            sprbne sprbne2 = sprbne.cfr_renamed_23(arg0);
            sprbne sprbne3 = sprbne.cfr_renamed_23(sprbne2.cfr_renamed_85(0));
            sprnse sprnse2 = new sprnse(sprnse.cfr_renamed_4758(sprbne3));
            int n2 = n = 1;
            while (n2 < sprbne2.cfr_renamed_84()) {
                sprvva sprvva2;
                spra spra2 = sprbne2.cfr_renamed_85(n);
                if (spra2 instanceof sprnpe) {
                    sprvva2 = sprnpe.cfr_renamed_23(spra2);
                    sprnse2.cfr_renamed_4762(sprvva2.cfr_renamed_587());
                } else if (spra2 instanceof spryte) {
                    sprvva2 = spryte.cfr_renamed_23(spra2);
                    switch (((spryte)sprvva2).cfr_renamed_312()) {
                        case 0: {
                            while (false) {
                            }
                            sprnpe sprnpe2 = sprnpe.cfr_renamed_341((spryte)sprvva2, false);
                            sprnse2.cfr_renamed_4761(sprnpe2.cfr_renamed_587());
                            break;
                        }
                        case 1: {
                            sprnpe sprnpe2 = sprnpe.cfr_renamed_341((spryte)sprvva2, false);
                            sprnse2.cfr_renamed_4760(sprnpe2.cfr_renamed_587());
                        }
                    }
                }
                n2 = ++n;
            }
            return sprnse2;
        }
        return null;
    }

    private /* synthetic */ void cfr_renamed_4762(boolean arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public sprnse(spriae[] spriaeArray) {
        sprnse sprnse2 = this;
        sprnse sprnse3 = this;
        sprnse3.cfr_renamed_2 = false;
        sprnse3.cfr_renamed_1 = false;
        sprnse2.cfr_renamed_4 = false;
        sprnse2.cfr_renamed_3 = spriaeArray;
    }
}

