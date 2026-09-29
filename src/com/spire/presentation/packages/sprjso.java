/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbnja;
import com.spire.presentation.packages.sprero;
import com.spire.presentation.packages.sprfrja;
import com.spire.presentation.packages.sprlqo;
import com.spire.presentation.packages.sprnro;
import com.spire.presentation.packages.sprpeja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtlia;
import com.spire.presentation.packages.sprvkja;

@sprtea
public class sprjso {
    private static final int cfr_renamed_3 = 500;
    private boolean cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_18065(sprnro arg0, sprlqo arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_1942()) {
            boolean bl;
            int n3 = (arg0.cfr_renamed_81()[arg2] & 0xFF) + (arg0.cfr_renamed_81()[arg2 + 1] & 0xFF) + (arg0.cfr_renamed_81()[arg2 + 2] & 0xFF);
            boolean bl2 = this.cfr_renamed_4 ? n3 > 500 : (bl = n3 < 500);
            if (bl) {
                arg1.cfr_renamed_14895();
            }
            arg1.cfr_renamed_14896();
            n2 = ++n;
            arg2 += 4;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprvkja cfr_renamed_17655(sprvkja sprvkja2) {
        void arg0;
        this.cfr_renamed_4 = true;
        sprnro sprnro2 = sprjso.cfr_renamed_18066(sprvkja2);
        sprvkja sprvkja3 = new sprvkja(arg0.cfr_renamed_1942(), arg0.cfr_renamed_1452(), 196865);
        sprvkja3.cfr_renamed_17665(arg0.cfr_renamed_14217(), arg0.cfr_renamed_14218());
        sprbnja sprbnja2 = sprvkja3.cfr_renamed_17877(new sprpeja(0, 0, sprvkja3.cfr_renamed_1942(), sprvkja3.cfr_renamed_1452()), 2, 196865);
        byte[] byArray = this.cfr_renamed_18067(sprnro2, sprbnja2.cfr_renamed_17880());
        sprtlia.cfr_renamed_17890(byArray, 0, sprbnja2.cfr_renamed_17881(), byArray.length);
        sprvkja sprvkja4 = sprvkja3;
        sprvkja4.cfr_renamed_17886(sprbnja2);
        return sprvkja4;
    }

    public byte[] cfr_renamed_17891(sprvkja arg0) {
        sprnro sprnro2 = sprjso.cfr_renamed_18066(arg0);
        int n = sprnro2.cfr_renamed_1942() / 8 + (sprnro2.cfr_renamed_1942() % 8 > 0 ? 1 : 0);
        return this.cfr_renamed_18067(sprnro2, n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public static sprnro cfr_renamed_18066(sprvkja arg0) {
        sprvkja sprvkja2 = null;
        try {
            Object object;
            if (arg0.cfr_renamed_17654() != 2498570) {
                sprvkja2 = new sprvkja(arg0.cfr_renamed_1942(), arg0.cfr_renamed_1452(), 2498570);
                sprvkja2.cfr_renamed_17665(arg0.cfr_renamed_14217(), arg0.cfr_renamed_14218());
                object = sprero.cfr_renamed_17666(sprvkja2);
                try {
                    ((sprfrja)object).cfr_renamed_17667(arg0, 0, 0);
                }
                finally {
                    if (object != null) {
                        ((sprfrja)object).dispose();
                    }
                }
            } else {
                sprvkja2 = arg0;
            }
            sprvkja sprvkja3 = sprvkja2;
            object = sprvkja3.cfr_renamed_17877(new sprpeja(0, 0, sprvkja2.cfr_renamed_1942(), sprvkja2.cfr_renamed_1452()), 1, 2498570);
            sprnro sprnro2 = new sprnro((sprbnja)object);
            sprvkja3.cfr_renamed_17886((sprbnja)object);
            sprnro sprnro3 = sprnro2;
            return sprnro3;
        }
        finally {
            if (sprvkja2 != arg0 && sprvkja2 != null) {
                sprvkja2.dispose();
            }
        }
    }

    private /* synthetic */ byte[] cfr_renamed_18067(sprnro arg0, int arg1) {
        int n;
        byte[] byArray = new byte[arg1 * arg0.cfr_renamed_1452()];
        sprlqo sprlqo2 = new sprlqo(byArray);
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_1452()) {
            int n3 = n * arg0.cfr_renamed_17880();
            sprlqo2.cfr_renamed_6601(n * arg1);
            this.cfr_renamed_18065(arg0, sprlqo2, n3);
            n2 = ++n;
        }
        sprlqo2.cfr_renamed_2947();
        return byArray;
    }
}

