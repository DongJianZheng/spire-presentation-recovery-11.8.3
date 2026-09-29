/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprdcb;
import com.spire.presentation.packages.sprgeb;
import com.spire.presentation.packages.sprjta;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprmpa;
import com.spire.presentation.packages.sprqeb;
import com.spire.presentation.packages.sprqra;
import com.spire.presentation.packages.sprroa;
import com.spire.presentation.packages.sprspa;
import com.spire.presentation.packages.spruhb;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.sprxta;
import com.spire.presentation.packages.spry;
import java.security.SecureRandom;

public class sprrgb
implements spry {
    private int cfr_renamed_112;
    private static final String cfr_renamed_119 = "1.3.6.1.4.1.8301.3.1.3.4.1";
    private sprqeb cfr_renamed_91;
    private boolean cfr_renamed_0 = false;
    private int cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    private /* synthetic */ sprwnd cfr_renamed_1297() {
        if (!this.cfr_renamed_0) {
            this.cfr_renamed_1303();
        }
        sprrgb sprrgb2 = this;
        sprmpa sprmpa2 = new sprmpa(sprrgb2.cfr_renamed_1, sprrgb2.cfr_renamed_3);
        sprxta sprxta2 = new sprxta(sprmpa2, this.cfr_renamed_4, 'I', this.cfr_renamed_2);
        sprxta[] sprxtaArray = new sprspa(sprmpa2, sprxta2).cfr_renamed_812();
        sprjta sprjta2 = sprqra.cfr_renamed_950(sprmpa2, sprxta2);
        sprroa sprroa2 = sprqra.cfr_renamed_944(sprjta2, this.cfr_renamed_2);
        sprjta sprjta3 = sprroa2.cfr_renamed_1363();
        sprkqa sprkqa2 = sprroa2.cfr_renamed_1364();
        sprjta sprjta4 = (sprjta)sprjta3.cfr_renamed_1090();
        sprjta sprjta5 = sprjta4.cfr_renamed_1096();
        int n = sprjta4.cfr_renamed_884();
        sprjta[] sprjtaArray = sprjta.cfr_renamed_1104(n, this.cfr_renamed_2);
        sprrgb sprrgb3 = this;
        sprkqa sprkqa3 = new sprkqa(sprrgb3.cfr_renamed_112, sprrgb3.cfr_renamed_2);
        sprjta sprjta6 = (sprjta)sprjtaArray[0].cfr_renamed_882(sprjta5);
        sprjta6 = (sprjta)sprjta6.cfr_renamed_879(sprkqa3);
        sprrgb sprrgb4 = this;
        sprgeb sprgeb2 = new sprgeb(cfr_renamed_119, sprrgb4.cfr_renamed_112, sprrgb4.cfr_renamed_4, sprjta6, this.cfr_renamed_91.cfr_renamed_284());
        spruhb spruhb2 = new spruhb(cfr_renamed_119, this.cfr_renamed_112, n, sprmpa2, sprxta2, sprjtaArray[1], sprkqa2, sprkqa3, sprjta2, sprxtaArray, this.cfr_renamed_91.cfr_renamed_284());
        return new sprwnd(sprgeb2, spruhb2);
    }

    @Override
    public void cfr_renamed_1222(sprccb arg0) {
        this.cfr_renamed_1304(arg0);
    }

    @Override
    public sprwnd cfr_renamed_1223() {
        return this.cfr_renamed_1297();
    }

    private /* synthetic */ void cfr_renamed_1304(sprccb arg0) {
        this.cfr_renamed_91 = (sprqeb)arg0;
        sprrgb sprrgb2 = this;
        sprrgb2.cfr_renamed_2 = new SecureRandom();
        sprrgb2.cfr_renamed_1 = this.cfr_renamed_91.cfr_renamed_284().cfr_renamed_1186();
        sprrgb2.cfr_renamed_112 = sprrgb2.cfr_renamed_91.cfr_renamed_284().cfr_renamed_1146();
        sprrgb2.cfr_renamed_4 = sprrgb2.cfr_renamed_91.cfr_renamed_284().cfr_renamed_1144();
        this.cfr_renamed_3 = this.cfr_renamed_91.cfr_renamed_284().cfr_renamed_1185();
        this.cfr_renamed_0 = true;
    }

    private /* synthetic */ void cfr_renamed_1303() {
        sprqeb sprqeb2 = new sprqeb(new SecureRandom(), new sprdcb());
        this.cfr_renamed_1304(sprqeb2);
    }
}

