/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.spreza;
import com.spire.presentation.packages.sprfcb;
import com.spire.presentation.packages.sprjta;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprlhb;
import com.spire.presentation.packages.sprmpa;
import com.spire.presentation.packages.sprqra;
import com.spire.presentation.packages.sprroa;
import com.spire.presentation.packages.sprspa;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.sprxta;
import com.spire.presentation.packages.spry;
import com.spire.presentation.packages.sprzcb;
import java.security.SecureRandom;

public class sprocb
implements spry {
    private int cfr_renamed_112;
    private SecureRandom cfr_renamed_119;
    private boolean cfr_renamed_91 = false;
    public static final String cfr_renamed_0 = "1.3.6.1.4.1.8301.3.1.3.4.2";
    private spreza cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public sprwnd cfr_renamed_1223() {
        if (!this.cfr_renamed_91) {
            this.cfr_renamed_1303();
        }
        sprocb sprocb2 = this;
        sprmpa sprmpa2 = new sprmpa(sprocb2.cfr_renamed_3, sprocb2.cfr_renamed_112);
        sprxta sprxta2 = new sprxta(sprmpa2, this.cfr_renamed_2, 'I', this.cfr_renamed_119);
        sprxta[] sprxtaArray = new sprspa(sprmpa2, sprxta2).cfr_renamed_812();
        sprjta sprjta2 = sprqra.cfr_renamed_950(sprmpa2, sprxta2);
        sprroa sprroa2 = sprqra.cfr_renamed_944(sprjta2, this.cfr_renamed_119);
        sprjta sprjta3 = sprroa2.cfr_renamed_1363();
        sprkqa sprkqa2 = sprroa2.cfr_renamed_1364();
        sprjta sprjta4 = (sprjta)sprjta3.cfr_renamed_1090();
        int n = sprjta4.cfr_renamed_884();
        sprocb sprocb3 = this;
        sprzcb sprzcb2 = new sprzcb(cfr_renamed_0, sprocb3.cfr_renamed_4, sprocb3.cfr_renamed_2, sprjta4, this.cfr_renamed_1.cfr_renamed_284());
        sprlhb sprlhb2 = new sprlhb(cfr_renamed_0, this.cfr_renamed_4, n, sprmpa2, sprxta2, sprkqa2, sprjta2, sprxtaArray, this.cfr_renamed_1.cfr_renamed_284());
        return new sprwnd(sprzcb2, sprlhb2);
    }

    private /* synthetic */ void cfr_renamed_1303() {
        spreza spreza2 = new spreza(new SecureRandom(), new sprfcb());
        this.cfr_renamed_1222(spreza2);
    }

    @Override
    public void cfr_renamed_1222(sprccb arg0) {
        this.cfr_renamed_1 = (spreza)arg0;
        sprocb sprocb2 = this;
        sprocb2.cfr_renamed_119 = new SecureRandom();
        sprocb2.cfr_renamed_3 = this.cfr_renamed_1.cfr_renamed_284().cfr_renamed_1186();
        sprocb2.cfr_renamed_4 = sprocb2.cfr_renamed_1.cfr_renamed_284().cfr_renamed_1146();
        sprocb2.cfr_renamed_2 = sprocb2.cfr_renamed_1.cfr_renamed_284().cfr_renamed_1144();
        this.cfr_renamed_112 = this.cfr_renamed_1.cfr_renamed_284().cfr_renamed_1185();
        this.cfr_renamed_91 = true;
    }
}

