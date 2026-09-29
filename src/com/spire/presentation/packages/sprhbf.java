/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraye;
import com.spire.presentation.packages.sprbgf;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.spricf;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprmef;
import com.spire.presentation.packages.sprnhf;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprtef;
import com.spire.presentation.packages.sprvef;
import com.spire.presentation.packages.sprwff;
import com.spire.presentation.packages.sprwxe;
import com.spire.presentation.packages.sprzwe;
import java.security.SecureRandom;

public class sprhbf
implements sprii {
    private int cfr_renamed_112;
    private SecureRandom cfr_renamed_119;
    private boolean cfr_renamed_91 = false;
    private sprbgf cfr_renamed_0;
    private int cfr_renamed_1;
    public static final String cfr_renamed_2 = "1.3.6.1.4.1.8301.3.1.3.4.2";
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_1303() {
        sprbgf sprbgf2 = new sprbgf(null, new sprzwe());
        this.cfr_renamed_5536(sprbgf2);
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_0 = (sprbgf)arg0;
        sprhbf sprhbf2 = this;
        sprhbf2.cfr_renamed_119 = arg0.cfr_renamed_1295();
        sprhbf2.cfr_renamed_112 = sprhbf2.cfr_renamed_0.cfr_renamed_284().cfr_renamed_1186();
        sprhbf2.cfr_renamed_4 = sprhbf2.cfr_renamed_0.cfr_renamed_284().cfr_renamed_1146();
        sprhbf2.cfr_renamed_1 = sprhbf2.cfr_renamed_0.cfr_renamed_284().cfr_renamed_1144();
        this.cfr_renamed_3 = this.cfr_renamed_0.cfr_renamed_284().cfr_renamed_1185();
        this.cfr_renamed_91 = true;
    }

    @Override
    public sprsil cfr_renamed_1223() {
        if (!this.cfr_renamed_91) {
            this.cfr_renamed_1303();
        }
        sprhbf sprhbf2 = this;
        sprnhf sprnhf2 = new sprnhf(sprhbf2.cfr_renamed_112, sprhbf2.cfr_renamed_3);
        spricf spricf2 = new spricf(sprnhf2, this.cfr_renamed_1, 'I', this.cfr_renamed_119);
        sprmef sprmef2 = sprtef.cfr_renamed_5487(sprtef.cfr_renamed_5488(sprnhf2, spricf2), this.cfr_renamed_119);
        spraye spraye2 = sprmef2.cfr_renamed_1363();
        sprwff sprwff2 = sprmef2.cfr_renamed_1364();
        spraye spraye3 = (spraye)spraye2.cfr_renamed_1090();
        int n = spraye3.cfr_renamed_884();
        sprhbf sprhbf3 = this;
        sprvef sprvef2 = new sprvef(sprhbf3.cfr_renamed_4, sprhbf3.cfr_renamed_1, spraye3, this.cfr_renamed_0.cfr_renamed_284().cfr_renamed_580());
        sprwxe sprwxe2 = new sprwxe(this.cfr_renamed_4, n, sprnhf2, spricf2, sprwff2, this.cfr_renamed_0.cfr_renamed_284().cfr_renamed_580());
        return new sprsil(sprvef2, sprwxe2);
    }
}

