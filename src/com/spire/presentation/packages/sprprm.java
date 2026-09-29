/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruuia;
import com.spire.presentation.packages.sprvzy;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxpm;
import com.spire.presentation.packages.sprycn;
import java.util.Iterator;

public class sprprm
extends sprqqe {
    private final sprxpm cfr_renamed_2;
    private final sprxpm cfr_renamed_3;
    private final sprxpm cfr_renamed_4;

    public sprxpm cfr_renamed_4900() {
        return this.cfr_renamed_2;
    }

    public sprxpm cfr_renamed_4901() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprprm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 3) {
            throw new IllegalArgumentException(sprvzy.cfr_renamed_9("K{^fMwKg\u000epKr[f@`K#Ae\u000e2\u000ewA#\u001d#KoKnKmZp\u000el@oW"));
        }
        sprxpm sprxpm2 = null;
        sprxpm sprxpm3 = null;
        Iterator<sprco> iterator = arg0.iterator();
        sprxpm sprxpm4 = sprxpm.cfr_renamed_23(iterator.next());
        while (iterator.hasNext()) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_23(iterator.next());
            if (sprnvm2.cfr_renamed_312() == 0) {
                sprxpm2 = sprxpm.cfr_renamed_5085(sprnvm2, true);
                continue;
            }
            if (sprnvm2.cfr_renamed_312() != 1) continue;
            sprxpm3 = sprxpm.cfr_renamed_5085(sprnvm2, true);
        }
        sprprm sprprm2 = this;
        sprprm2.cfr_renamed_2 = sprxpm4;
        sprprm2.cfr_renamed_4 = sprxpm2;
        this.cfr_renamed_3 = sprxpm3;
    }

    public static sprprm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprprm) {
            return (sprprm)arg0;
        }
        if (arg0 != null) {
            return new sprprm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprprm sprprm2 = this;
        sprrvm2.cfr_renamed_5004(sprprm2.cfr_renamed_2);
        if (sprprm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_4));
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_3));
        }
        return new sprcen(sprrvm2);
    }

    public sprxpm cfr_renamed_4902() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprprm(sprxpm sprxpm2, sprxpm sprxpm3, sprxpm sprxpm4) {
        void arg2;
        void arg1;
        void arg0;
        if (sprxpm2 == null) {
            throw new NullPointerException(spruuia.cfr_renamed_9("\n;H\"z<Y=c0Zr\r6L;C:YuO0\r;X9A"));
        }
        sprprm sprprm2 = this;
        sprprm2.cfr_renamed_2 = arg0;
        sprprm2.cfr_renamed_4 = arg1;
        this.cfr_renamed_3 = arg2;
    }
}

