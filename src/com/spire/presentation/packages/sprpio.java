/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprggo;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryxp;

@sprtea
public class sprpio {
    private int cfr_renamed_152;
    private sprfzo cfr_renamed_112;
    private String cfr_renamed_119;
    private boolean cfr_renamed_91;
    private float cfr_renamed_0;
    private sprggo cfr_renamed_1;
    private int cfr_renamed_2;
    private sprhhp cfr_renamed_3;
    private float cfr_renamed_4;

    public boolean cfr_renamed_16709() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprpio(float f, int n, int n2, String string, sprggo sprggo2) {
        void arg2;
        void arg4;
        void arg3;
        void arg1;
        void arg0;
        sprpio sprpio2 = this;
        sprpio sprpio3 = this;
        this.cfr_renamed_4 = arg0;
        sprpio3.cfr_renamed_152 = arg1;
        sprpio3.cfr_renamed_119 = arg3;
        sprpio2.cfr_renamed_1 = arg4;
        sprpio2.cfr_renamed_91 = (n2 & 4) != 0;
        this.cfr_renamed_2 = arg2 & 0xFFFFFFFB;
    }

    /*
     * WARNING - void declaration
     */
    public sprhhp cfr_renamed_16630(sprggo sprggo2) {
        void arg0;
        float f = arg0.cfr_renamed_16100().cfr_renamed_16573().cfr_renamed_16710();
        if (this.cfr_renamed_3 != null && this.cfr_renamed_16711(f)) {
            return this.cfr_renamed_3;
        }
        sprpio sprpio2 = this;
        float f2 = sprpio2.cfr_renamed_16712((sprggo)arg0);
        sprpio sprpio3 = this;
        sprpio2.cfr_renamed_3 = new sprhhp(f2, this.cfr_renamed_2, this.cfr_renamed_16713());
        sprpio3.cfr_renamed_0 = f;
        return sprpio2.cfr_renamed_3;
    }

    private /* synthetic */ boolean cfr_renamed_16711(float arg0) {
        if (this.cfr_renamed_152 == 2) {
            return true;
        }
        return spryxp.cfr_renamed_13682(arg0, this.cfr_renamed_0);
    }

    private /* synthetic */ float cfr_renamed_16712(sprggo arg0) {
        if (this.cfr_renamed_152 == 2) {
            return this.cfr_renamed_4;
        }
        return (float)arg0.cfr_renamed_16559().cfr_renamed_16520(this.cfr_renamed_4, this.cfr_renamed_152) / arg0.cfr_renamed_16100().cfr_renamed_16573().cfr_renamed_16710();
    }

    private /* synthetic */ sprfzo cfr_renamed_16713() {
        if (this.cfr_renamed_112 == null) {
            this.cfr_renamed_112 = this.cfr_renamed_1.cfr_renamed_13400().cfr_renamed_16270(this.cfr_renamed_119, this.cfr_renamed_2);
        }
        return this.cfr_renamed_112;
    }
}

