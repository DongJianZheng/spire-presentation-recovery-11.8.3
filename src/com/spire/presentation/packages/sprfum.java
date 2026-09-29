/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdpm;
import com.spire.presentation.packages.sprdtm;
import com.spire.presentation.packages.spreum;
import com.spire.presentation.packages.sprhkm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsva;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycb;
import com.spire.presentation.packages.sprycn;

public class sprfum
extends sprqqe {
    private spreum cfr_renamed_2;
    private sprdtm cfr_renamed_3;
    private final sprdpm cfr_renamed_4;

    public sprfum(sprdpm arg0) {
        this(arg0, (sprdtm)null, null);
    }

    public static sprfum cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfum) {
            return (sprfum)arg0;
        }
        if (arg0 != null) {
            return new sprfum(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprfum(sprdpm sprdpm2, sprdtm sprdtm2, spreum spreum2) {
        void arg2;
        void arg1;
        void arg0;
        if (sprdpm2 == null) {
            throw new IllegalArgumentException(sprycb.cfr_renamed_9("BX\u0000I\u0011t\u0017~\u000bX&^\u0017OB\u001b\u0006Z\u000bU\nOEY\u0000\u001b\u000bN\tW"));
        }
        sprfum sprfum2 = this;
        sprfum2.cfr_renamed_4 = arg0;
        sprfum2.cfr_renamed_3 = arg1;
        this.cfr_renamed_2 = arg2;
    }

    private /* synthetic */ sprfum(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_4 = sprdpm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        if (sprszm2.cfr_renamed_84() >= 2) {
            if (arg0.cfr_renamed_84() == 2) {
                sprnvm sprnvm2 = sprnvm.cfr_renamed_6501(arg0.cfr_renamed_85(1), 128);
                if (sprnvm2.cfr_renamed_312() == 0) {
                    this.cfr_renamed_3 = sprdtm.cfr_renamed_23(sprnvm2.cfr_renamed_8225());
                    return;
                }
                this.cfr_renamed_2 = spreum.cfr_renamed_23(sprnvm2.cfr_renamed_8225());
                return;
            }
            sprszm sprszm3 = arg0;
            this.cfr_renamed_3 = sprdtm.cfr_renamed_23(sprnvm.cfr_renamed_6501(sprszm3.cfr_renamed_85(1), 128).cfr_renamed_8225());
            this.cfr_renamed_2 = spreum.cfr_renamed_23(sprnvm.cfr_renamed_6501(sprszm3.cfr_renamed_85(2), 128).cfr_renamed_8225());
        }
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprfum sprfum2 = this;
        sprrvm2.cfr_renamed_5004(sprfum2.cfr_renamed_4);
        if (sprfum2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_3));
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_2));
        }
        return new sprcen(sprrvm2);
    }

    public sprdtm cfr_renamed_1369() {
        return this.cfr_renamed_3;
    }

    public sprdpm cfr_renamed_4899() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprfum(sprdpm sprdpm2, sprhkm sprhkm2, spreum spreum2) {
        void arg2;
        void arg1;
        void arg0;
        if (sprdpm2 == null) {
            throw new IllegalArgumentException(sprsva.cfr_renamed_9("@\u001f\u0002\u000e\u00133\u00159\t\u001f$\u0019\u0015\b@\\\u0004\u001d\t\u0012\b\bG\u001e\u0002\\\t\t\u000b\u0010"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = arg1 != null ? new sprdtm((sprhkm)arg1) : null;
        this.cfr_renamed_2 = arg2;
    }

    public spreum cfr_renamed_4898() {
        return this.cfr_renamed_2;
    }
}

