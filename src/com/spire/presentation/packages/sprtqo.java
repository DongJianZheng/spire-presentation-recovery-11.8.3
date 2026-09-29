/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprlup;
import com.spire.presentation.packages.sprpeja;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprsfp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvyo;
import com.spire.presentation.packages.sprwgp;
import com.spire.presentation.packages.spryxp;

@sprtea
public class sprtqo {
    private double cfr_renamed_1;
    private double cfr_renamed_2;
    private double cfr_renamed_3;
    private double cfr_renamed_4;

    public boolean cfr_renamed_29() {
        return this.cfr_renamed_4 == 0.0 && this.cfr_renamed_2 == 0.0 && this.cfr_renamed_3 == 0.0 && this.cfr_renamed_1 == 0.0;
    }

    public boolean cfr_renamed_18006() {
        return this.cfr_renamed_4 < 0.0 || this.cfr_renamed_2 < 0.0 || this.cfr_renamed_3 < 0.0 || this.cfr_renamed_1 < 0.0;
    }

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_13319(byte[] byArray, sprtqo sprtqo2) {
        void arg1;
        byte[] arg0;
        int n = sprsfp.cfr_renamed_15042(arg0).hashCode();
        int n2 = sprtqo2 != null && arg1.cfr_renamed_14231() ? arg1.hashCode() : 0;
        return n ^ n2;
    }

    public sprgeja cfr_renamed_13893(sprgeja arg0) {
        sprgeja sprgeja2 = arg0;
        double d = (double)sprgeja2.cfr_renamed_13430() + (double)arg0.cfr_renamed_1942() * this.cfr_renamed_4;
        sprgeja sprgeja3 = arg0;
        double d2 = (double)sprgeja2.cfr_renamed_13430() + (double)sprgeja3.cfr_renamed_1942() * (1.0 - this.cfr_renamed_2);
        double d3 = (double)sprgeja3.cfr_renamed_13342() + (double)arg0.cfr_renamed_1452() * this.cfr_renamed_3;
        double d4 = (double)sprgeja2.cfr_renamed_13342() + (double)arg0.cfr_renamed_1452() * (1.0 - this.cfr_renamed_1);
        return sprgeja.cfr_renamed_14827((float)d, (float)d3, (float)d2, (float)d4);
    }

    /*
     * WARNING - void declaration
     */
    public static int cfr_renamed_18007(byte[] byArray, sprtqo sprtqo2, sprwgp sprwgp2) {
        void arg1;
        byte[] arg0;
        int n = sprtqo.cfr_renamed_13319(arg0, (sprtqo)arg1);
        if (sprwgp2 != null) {
            void arg2;
            n = n * 397 ^ arg2.hashCode();
        }
        return n;
    }

    public sprpeja cfr_renamed_14232(sprpeja arg0) {
        sprpeja sprpeja2 = arg0;
        double d = (double)sprpeja2.cfr_renamed_13430() + (double)arg0.cfr_renamed_1942() * sprrgga.cfr_renamed_17056(0.0, this.cfr_renamed_4);
        sprpeja sprpeja3 = arg0;
        double d2 = (double)sprpeja2.cfr_renamed_13430() + (double)sprpeja3.cfr_renamed_1942() * (1.0 - sprrgga.cfr_renamed_17056(0.0, this.cfr_renamed_2));
        double d3 = (double)sprpeja3.cfr_renamed_13342() + (double)arg0.cfr_renamed_1452() * sprrgga.cfr_renamed_17056(0.0, this.cfr_renamed_3);
        double d4 = (double)sprpeja2.cfr_renamed_13342() + (double)arg0.cfr_renamed_1452() * (1.0 - sprrgga.cfr_renamed_17056(0.0, this.cfr_renamed_1));
        return sprpeja.cfr_renamed_16817(spryxp.cfr_renamed_13526(d), spryxp.cfr_renamed_13526(d3), spryxp.cfr_renamed_13526(d2), spryxp.cfr_renamed_13526(d4));
    }

    public static boolean cfr_renamed_13345(sprtqo arg0) {
        return arg0 == null || arg0.cfr_renamed_29();
    }

    public boolean cfr_renamed_14231() {
        return this.cfr_renamed_4 > 0.0 || this.cfr_renamed_2 > 0.0 || this.cfr_renamed_3 > 0.0 || this.cfr_renamed_1 > 0.0;
    }

    public int hashCode() {
        return sprlup.cfr_renamed_18008(this.cfr_renamed_4) >> 1 ^ sprlup.cfr_renamed_18008(this.cfr_renamed_2) << 3 ^ sprlup.cfr_renamed_18008(this.cfr_renamed_3) << 1 ^ sprlup.cfr_renamed_18008(this.cfr_renamed_1) >> 3;
    }

    public sprgeja cfr_renamed_13346(sprgeja arg0) {
        double d = 1.0 / (1.0 - sprrgga.cfr_renamed_13846(0.0, this.cfr_renamed_4 + this.cfr_renamed_2));
        double d2 = 1.0 / (1.0 - sprrgga.cfr_renamed_13846(0.0, this.cfr_renamed_3 + this.cfr_renamed_1));
        double d3 = -sprrgga.cfr_renamed_13846(0.0, this.cfr_renamed_4);
        double d4 = -sprrgga.cfr_renamed_13846(0.0, this.cfr_renamed_2);
        double d5 = -sprrgga.cfr_renamed_13846(0.0, this.cfr_renamed_3);
        double d6 = -sprrgga.cfr_renamed_13846(0.0, this.cfr_renamed_1);
        sprgeja sprgeja2 = arg0;
        double d7 = (double)sprgeja2.cfr_renamed_13430() + (double)arg0.cfr_renamed_1942() * d3 * d;
        sprgeja sprgeja3 = arg0;
        double d8 = (double)sprgeja2.cfr_renamed_13430() + (double)sprgeja3.cfr_renamed_1942() * (1.0 - d4 * d);
        double d9 = (double)sprgeja3.cfr_renamed_13342() + (double)arg0.cfr_renamed_1452() * d5 * d2;
        double d10 = (double)sprgeja2.cfr_renamed_13342() + (double)arg0.cfr_renamed_1452() * (1.0 - d6 * d2);
        return sprgeja.cfr_renamed_14827((float)d7, (float)d9, (float)d8, (float)d10);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprvyo cfr_renamed_15047(byte[] arg0) {
        sprvyo sprvyo2 = new sprvyo(arg0);
        try {
            sprpeja sprpeja2 = this.cfr_renamed_14232(new sprpeja(0, 0, sprvyo2.cfr_renamed_1942(), sprvyo2.cfr_renamed_1452()));
            sprvyo sprvyo3 = sprvyo2.cfr_renamed_13996(sprpeja2);
            return sprvyo3;
        }
        finally {
            if (sprvyo2 != null) {
                sprvyo2.cfr_renamed_11665();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprtqo(double d, double d2, double d3, double d4) {
        void arg2;
        void arg1;
        void arg0;
        sprtqo sprtqo2 = this;
        sprtqo sprtqo3 = this;
        sprtqo3.cfr_renamed_4 = arg0;
        sprtqo3.cfr_renamed_2 = arg1;
        sprtqo2.cfr_renamed_3 = arg2;
        sprtqo2.cfr_renamed_1 = d4;
    }
}

