/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprjle;
import com.spire.presentation.packages.sprmb;
import com.spire.presentation.packages.sprrob;
import com.spire.presentation.packages.sprsme;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprudz;
import com.spire.presentation.packages.sprwse;
import java.security.spec.AlgorithmParameterSpec;

public class sprnnb
implements AlgorithmParameterSpec,
sprmb {
    private String cfr_renamed_1;
    private String cfr_renamed_2;
    private String cfr_renamed_3;
    private sprrob cfr_renamed_4;

    @Override
    public String cfr_renamed_2101() {
        return this.cfr_renamed_3;
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode() ^ this.cfr_renamed_1.hashCode() ^ (this.cfr_renamed_3 != null ? this.cfr_renamed_3.hashCode() : 0);
    }

    /*
     * WARNING - void declaration
     */
    public sprnnb(sprrob sprrob2) {
        void arg0;
        sprnnb sprnnb2 = this;
        sprnnb2.cfr_renamed_4 = arg0;
        sprnnb2.cfr_renamed_1 = sprji.cfr_renamed_105.cfr_renamed_19();
        sprnnb2.cfr_renamed_3 = null;
    }

    public boolean equals(Object arg0) {
        if (arg0 instanceof sprnnb) {
            sprnnb sprnnb2 = (sprnnb)arg0;
            return this.cfr_renamed_4.equals(sprnnb2.cfr_renamed_4) && this.cfr_renamed_1.equals(sprnnb2.cfr_renamed_1) && (this.cfr_renamed_3 == sprnnb2.cfr_renamed_3 || this.cfr_renamed_3 != null && this.cfr_renamed_3.equals(sprnnb2.cfr_renamed_3));
        }
        return false;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprnnb(String string, String string2, String string3) {
        void arg2;
        void arg1;
        sprjle sprjle2;
        String arg0;
        sprjle sprjle3 = null;
        try {
            sprjle2 = sprjle3 = sprwse.cfr_renamed_2102(new sprtzd(arg0));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            sprtzd sprtzd2 = sprwse.cfr_renamed_2103(arg0);
            if (sprtzd2 != null) {
                sprtzd sprtzd3 = sprtzd2;
                arg0 = sprtzd3.cfr_renamed_19();
                sprjle3 = sprwse.cfr_renamed_2102(sprtzd3);
            }
            sprjle2 = sprjle3;
        }
        if (sprjle2 == null) {
            throw new IllegalArgumentException(sprudz.cfr_renamed_9("Ib\u0007fBt\u0007}F\u007fF`ByB\u007f\u0007~By\u0007kH\u007f\u0007}F~ThC-Nc\u0007cF`B\"hDc#"));
        }
        sprnnb sprnnb2 = this;
        this.cfr_renamed_4 = new sprrob(sprjle3.cfr_renamed_1155(), sprjle3.cfr_renamed_1604(), sprjle3.cfr_renamed_1778());
        sprnnb2.cfr_renamed_2 = arg0;
        sprnnb2.cfr_renamed_1 = arg1;
        this.cfr_renamed_3 = arg2;
    }

    @Override
    public sprrob cfr_renamed_130() {
        return this.cfr_renamed_4;
    }

    public static sprnnb cfr_renamed_2104(sprsme arg0) {
        if (arg0.cfr_renamed_2105() != null) {
            return new sprnnb(arg0.cfr_renamed_2106().cfr_renamed_19(), arg0.cfr_renamed_2107().cfr_renamed_19(), arg0.cfr_renamed_2105().cfr_renamed_19());
        }
        return new sprnnb(arg0.cfr_renamed_2106().cfr_renamed_19(), arg0.cfr_renamed_2107().cfr_renamed_19());
    }

    public sprnnb(String arg0) {
        this(arg0, sprji.cfr_renamed_105.cfr_renamed_19(), null);
    }

    @Override
    public String cfr_renamed_2108() {
        return this.cfr_renamed_1;
    }

    public sprnnb(String arg0, String arg1) {
        this(arg0, arg1, null);
    }

    @Override
    public String cfr_renamed_2109() {
        return this.cfr_renamed_2;
    }
}

