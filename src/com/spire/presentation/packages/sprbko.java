/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprngp;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxnn;

@sprtea
public class sprbko
extends sprsmn {
    private sprsuja cfr_renamed_0;
    private sprxln cfr_renamed_1;
    private sprlsn cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprsuja cfr_renamed_4 = sprsuja.cfr_renamed_13377();

    @sprtea
    public static sprxln cfr_renamed_16994(sprxln arg0) {
        return new sprbko().cfr_renamed_16995(arg0);
    }

    private /* synthetic */ sprxnn cfr_renamed_16996(sprsuja arg0, sprsuja arg1) {
        sprsuja sprsuja2;
        sprngp sprngp2;
        sprngp sprngp3 = sprngp2 = new sprngp(arg0, arg1);
        sprsuja sprsuja3 = sprsuja2 = sprngp3.cfr_renamed_16997(0.5f * sprngp3.cfr_renamed_806());
        return new sprxnn(arg0, sprsuja3, sprsuja3, arg1);
    }

    @Override
    public void cfr_renamed_13175(sprxnn arg0) {
        if (!this.cfr_renamed_3) {
            sprbko sprbko2 = this;
            sprbko2.cfr_renamed_4 = arg0.cfr_renamed_13167();
            sprbko2.cfr_renamed_3 = true;
        }
        this.cfr_renamed_2.cfr_renamed_12507(arg0);
        this.cfr_renamed_0 = arg0.cfr_renamed_13171();
        super.cfr_renamed_13175(arg0);
    }

    @Override
    public void cfr_renamed_13173(sprlsn arg0) {
        if (this.cfr_renamed_2.cfr_renamed_13174() && this.cfr_renamed_3) {
            sprbko sprbko2 = this;
            sprbko sprbko3 = this;
            sprbko2.cfr_renamed_2.cfr_renamed_12507(sprbko3.cfr_renamed_16996(sprbko2.cfr_renamed_0, sprbko3.cfr_renamed_4));
        }
        sprbko sprbko4 = this;
        sprbko4.cfr_renamed_1.cfr_renamed_12507(sprbko4.cfr_renamed_2);
        super.cfr_renamed_13173(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13178(sprlsn sprlsn2) {
        void arg0;
        this.cfr_renamed_2 = new sprlsn();
        this.cfr_renamed_2.cfr_renamed_12625(arg0.cfr_renamed_13174());
        this.cfr_renamed_3 = false;
        super.cfr_renamed_13178(sprlsn2);
    }

    @Override
    public void cfr_renamed_13186(sprfqn arg0) {
        int n;
        if (arg0.cfr_renamed_13187().cfr_renamed_11861() == 0) {
            return;
        }
        sprsuja sprsuja2 = arg0.cfr_renamed_13187().cfr_renamed_576(0);
        if (!this.cfr_renamed_3) {
            sprbko sprbko2 = this;
            sprbko2.cfr_renamed_4 = sprsuja2;
            sprbko2.cfr_renamed_3 = true;
        }
        int n2 = n = 1;
        while (n2 < arg0.cfr_renamed_13187().cfr_renamed_11861()) {
            sprsuja sprsuja3 = arg0.cfr_renamed_13187().cfr_renamed_576(n);
            this.cfr_renamed_2.cfr_renamed_12507(this.cfr_renamed_16996(sprsuja2, sprsuja3));
            sprsuja2 = sprsuja3;
            n2 = ++n;
        }
        this.cfr_renamed_0 = sprsuja2;
        super.cfr_renamed_13186(arg0);
    }

    private /* synthetic */ sprxln cfr_renamed_16995(sprxln arg0) {
        sprbko sprbko2 = this;
        sprbko sprbko3 = this;
        sprbko sprbko4 = this;
        sprbko4.cfr_renamed_1 = new sprxln();
        arg0.cfr_renamed_13121(sprbko3);
        sprbko2.cfr_renamed_1.cfr_renamed_12505(arg0.cfr_renamed_12571());
        sprbko3.cfr_renamed_1.cfr_renamed_12550(arg0.cfr_renamed_12551());
        return sprbko2.cfr_renamed_1;
    }

    public sprbko() {
        this.cfr_renamed_0 = sprsuja.cfr_renamed_13377();
    }
}

