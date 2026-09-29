/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfum;
import com.spire.presentation.packages.sprhmm;
import com.spire.presentation.packages.sprjaaa;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxpm;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class sprgsm
extends sprqqe {
    private final sprhmm cfr_renamed_1;
    private sprszm cfr_renamed_2;
    private sprxpm cfr_renamed_3;
    private sprszm cfr_renamed_4;

    public sprfum[] cfr_renamed_4883() {
        int n;
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        sprfum[] sprfumArray = new sprfum[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprfumArray.length) {
            int n3 = n++;
            sprfumArray[n3] = sprfum.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprfumArray;
    }

    public sprhmm cfr_renamed_648() {
        return this.cfr_renamed_1;
    }

    public static sprgsm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgsm) {
            return (sprgsm)arg0;
        }
        if (arg0 != null) {
            return new sprgsm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprxpm cfr_renamed_4885() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_11316(sprrvm arg0, int arg1, sprco arg2) {
        if (arg2 != null) {
            arg0.cfr_renamed_5004(new sprycn(true, arg1, arg2));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprgsm(sprszm sprszm2) {
        sprnvm sprnvm2;
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_1 = sprhmm.cfr_renamed_23(enumeration.nextElement());
        block5: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            sprnvm2 = sprnvm.cfr_renamed_6501(enumeration.nextElement(), 128);
            switch (sprnvm2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_3 = sprxpm.cfr_renamed_23(sprnvm2.cfr_renamed_8225());
                    continue block5;
                }
                case 1: {
                    this.cfr_renamed_2 = sprszm.cfr_renamed_23(sprnvm2.cfr_renamed_8225());
                    continue block5;
                }
                case 2: {
                    this.cfr_renamed_4 = sprszm.cfr_renamed_23(sprnvm2.cfr_renamed_8225());
                    continue block5;
                }
            }
            break;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjaaa.cfr_renamed_9(":\u000f$\u000f \u0016!A;\u0000(A!\u0014\"\u0003*\u0013uA")).append(sprnvm2.cfr_renamed_312()).toString());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        sprgsm sprgsm2 = this;
        sprrvm2.cfr_renamed_5004(sprgsm2.cfr_renamed_1);
        sprgsm sprgsm3 = this;
        sprgsm3.cfr_renamed_11316(sprrvm2, 0, this.cfr_renamed_3);
        sprgsm3.cfr_renamed_11316(sprrvm2, 1, this.cfr_renamed_2);
        sprgsm2.cfr_renamed_11316(sprrvm2, 2, this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    public sprxpm[] cfr_renamed_4884() {
        int n;
        if (this.cfr_renamed_2 == null) {
            return null;
        }
        sprxpm[] sprxpmArray = new sprxpm[this.cfr_renamed_2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprxpmArray.length) {
            int n3 = n++;
            sprxpmArray[n3] = sprxpm.cfr_renamed_23(this.cfr_renamed_2.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprxpmArray;
    }
}

