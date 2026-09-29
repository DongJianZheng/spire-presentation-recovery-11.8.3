/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprnkea;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqhm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxlh;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class sprpmm
extends sprqqe {
    private sprqhm cfr_renamed_2;
    private sprqhm cfr_renamed_3;
    private sprszm cfr_renamed_4;

    public sprpmm(sprqhm arg0, sprqhm arg1, sprqhm[] arg2) {
        this(arg0, arg1, (sprszm)new sprcen(arg2));
    }

    public spraen cfr_renamed_4655() {
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        return new spraen(this.cfr_renamed_4624().cfr_renamed_314());
    }

    public sprqhm[] cfr_renamed_11228() {
        int n;
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        sprqhm[] sprqhmArray = new sprqhm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprqhmArray.length) {
            int n3 = n++;
            sprqhmArray[n3] = sprqhm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprqhmArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_3));
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_2));
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 2, (sprco)this.cfr_renamed_4));
        }
        return new sprcen(sprrvm2);
    }

    public spraen cfr_renamed_4656() {
        if (this.cfr_renamed_2 == null) {
            return null;
        }
        return new spraen(this.cfr_renamed_11229().cfr_renamed_314());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprpmm(sprqhm sprqhm2, sprqhm sprqhm3, sprszm sprszm2) {
        void arg1;
        void arg0;
        void arg2;
        if (sprszm2 != null && arg2.cfr_renamed_84() > 6) {
            throw new IllegalArgumentException(sprxlh.cfr_renamed_9("\u0017\u0003\u0014\u0018\u0006\u0000G\r\u0003\b\u0015\t\u0014\u001fG\u0001\u0012\u001f\u0013L\u0004\u0003\t\u0018\u0006\u0005\tL\u000b\t\u0014\u001fG\u0018\u000f\r\tLQL\u0014\u0018\u0015\u0005\t\u000b\u0014"));
        }
        sprpmm sprpmm2 = this;
        sprpmm2.cfr_renamed_3 = arg0;
        sprpmm2.cfr_renamed_2 = arg1;
        this.cfr_renamed_4 = arg2;
    }

    public sprqhm cfr_renamed_4624() {
        return this.cfr_renamed_3;
    }

    public static sprpmm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprpmm) {
            return (sprpmm)arg0;
        }
        return new sprpmm(sprszm.cfr_renamed_23(arg0));
    }

    public sprqhm cfr_renamed_11229() {
        return this.cfr_renamed_2;
    }

    public sprszm cfr_renamed_4479() {
        return this.cfr_renamed_4;
    }

    public sprpmm(sprkgn arg0, sprkgn arg1, sprszm arg2) {
        this(sprqhm.cfr_renamed_23(arg0), sprqhm.cfr_renamed_23(arg1), arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private /* synthetic */ sprpmm(sprszm sprszm2) {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        block5: while (enumeration.hasMoreElements()) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_6501(enumeration.nextElement(), 128);
            switch (sprnvm2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_3 = sprqhm.cfr_renamed_5085(sprnvm2, true);
                    continue block5;
                }
                case 1: {
                    this.cfr_renamed_2 = sprqhm.cfr_renamed_5085(sprnvm2, true);
                    continue block5;
                }
                case 2: {
                    sprpmm sprpmm2;
                    sprpmm sprpmm3 = this;
                    if (sprnvm2.cfr_renamed_4567()) {
                        sprpmm3.cfr_renamed_4 = sprszm.cfr_renamed_5085(sprnvm2, true);
                        sprpmm2 = this;
                    } else {
                        sprpmm3.cfr_renamed_4 = sprszm.cfr_renamed_5085(sprnvm2, false);
                        sprpmm2 = this;
                    }
                    if (sprpmm2.cfr_renamed_4 != null && this.cfr_renamed_4.cfr_renamed_84() > 6) throw new IllegalArgumentException(sprnkea.cfr_renamed_9("\u0002k\u0001p\u0013hRe\u0016`\u0000a\u0001wRi\u0007w\u0006$\u0011k\u001cp\u0013m\u001c$\u001ea\u0001wRp\u001ae\u001c$D$\u0001p\u0000m\u001cc\u0001"));
                    continue block5;
                }
            }
        }
        return;
        throw new IllegalArgumentException(sprxlh.cfr_renamed_9("\u000e\u0000\u000b\t\u0000\r\u000bL\u0013\r\u0000"));
    }
}

