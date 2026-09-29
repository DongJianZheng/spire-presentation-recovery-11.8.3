/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrz;
import com.spire.presentation.packages.sprnnp;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqvg;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprwum
extends sprqqe {
    public static final sprwum cfr_renamed_0;
    public static final sprwum cfr_renamed_1;
    private sprqvg cfr_renamed_2;
    public static final sprwum cfr_renamed_3;
    public static final sprwum cfr_renamed_4;

    public BigInteger cfr_renamed_97() {
        return this.cfr_renamed_2.cfr_renamed_97();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_2;
    }

    static {
        cfr_renamed_1 = new sprwum(1);
        cfr_renamed_4 = new sprwum(2);
        cfr_renamed_0 = new sprwum(3);
        cfr_renamed_3 = new sprwum(4);
    }

    public static sprwum cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwum) {
            return (sprwum)arg0;
        }
        if (arg0 != null) {
            return new sprwum(sprqvg.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprwum(sprqvg sprqvg2) {
        this.cfr_renamed_2 = sprqvg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprwum(int n) {
        void arg0;
        sprwum sprwum2 = this;
        sprwum2.cfr_renamed_2 = new sprqvg((int)arg0);
    }

    public String toString() {
        int n = this.cfr_renamed_2.cfr_renamed_5023();
        return new StringBuilder().insert(0, "").append(n).append(n == sprwum.cfr_renamed_1.cfr_renamed_2.cfr_renamed_5023() ? sprnnp.cfr_renamed_9("`\u001d\u0018\u001aa") : (n == sprwum.cfr_renamed_4.cfr_renamed_2.cfr_renamed_5023() ? sprbrz.cfr_renamed_9("\u0013:h(\u0012") : (n == sprwum.cfr_renamed_0.cfr_renamed_2.cfr_renamed_5023() ? sprnnp.cfr_renamed_9("v\u001e\u000e\u0003\u001da") : (n == sprwum.cfr_renamed_3.cfr_renamed_2.cfr_renamed_5023() ? sprbrz.cfr_renamed_9("Dx/k(\u0012") : sprnnp.cfr_renamed_9("w"))))).toString();
    }

    public static sprwum cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprwum.cfr_renamed_23(sprqvg.cfr_renamed_5085(arg0, arg1));
    }
}

