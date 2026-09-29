/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcz;
import com.spire.presentation.packages.sprjsn;
import com.spire.presentation.packages.sprktp;
import com.spire.presentation.packages.sprlw;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprzlp;

@sprtea
public class sprfqn
extends sprjsn
implements sprlw,
sprcz {
    private sprktp cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprfqn(sprsuja[] sprsujaArray, boolean bl) {
        void arg1;
        void arg0;
        sprfqn sprfqn2 = this;
        sprfqn2.cfr_renamed_4 = new sprktp((sprsuja[])arg0, (boolean)arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprfqn(sprktp sprktp2, boolean bl) {
        void arg0;
        this.cfr_renamed_4 = bl ? new sprktp((sprktp)arg0) : arg0;
    }

    @Override
    public void cfr_renamed_12624(sprqgp arg0) {
        arg0.cfr_renamed_13613(this.cfr_renamed_4);
    }

    public void cfr_renamed_13614(boolean arg0) {
        if (arg0 != sprzlp.cfr_renamed_13615(this.cfr_renamed_4)) {
            this.cfr_renamed_4.cfr_renamed_9979();
        }
    }

    @Override
    public sprvjn cfr_renamed_13616() {
        return this.cfr_renamed_12099();
    }

    public sprfqn(sprsuja arg0, sprsuja arg1) {
        sprfqn sprfqn2 = this;
        sprfqn2.cfr_renamed_4 = new sprktp(2);
        this.cfr_renamed_4.cfr_renamed_13516(arg0);
        sprfqn2.cfr_renamed_4.cfr_renamed_13516(arg1);
    }

    public sprktp cfr_renamed_13187() {
        return this.cfr_renamed_4;
    }

    public boolean cfr_renamed_13617(sprsuja arg0) {
        return sprzlp.cfr_renamed_13618(arg0, this.cfr_renamed_4, null);
    }

    public void cfr_renamed_13619(boolean arg0) {
        int n = 0;
        int n2 = 2;
        while (arg0 && n < this.cfr_renamed_4.cfr_renamed_11861() || !arg0 && n < this.cfr_renamed_4.cfr_renamed_11861() - 1 && this.cfr_renamed_4.cfr_renamed_11861() > n2) {
            sprsuja sprsuja2;
            int n3 = n < this.cfr_renamed_4.cfr_renamed_11861() - 1 ? n + 1 : 0;
            sprfqn sprfqn2 = this;
            sprsuja sprsuja3 = sprfqn2.cfr_renamed_4.cfr_renamed_576(n);
            if (sprzlp.cfr_renamed_13620(sprsuja3, sprsuja2 = sprfqn2.cfr_renamed_4.cfr_renamed_576(n3))) {
                this.cfr_renamed_4.cfr_renamed_12148(n);
                continue;
            }
            ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprfqn(float[] fArray) {
        int n;
        int n2 = fArray.length / 2;
        sprfqn sprfqn2 = this;
        sprfqn2.cfr_renamed_4 = new sprktp(n2);
        int n3 = n = 0;
        while (n3 < n2) {
            void arg0;
            void v2 = arg0[n * 2];
            int n4 = n * 2 + 1;
            this.cfr_renamed_4.cfr_renamed_13516(new sprsuja((float)v2, (float)arg0[n4]));
            n3 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfqn(int n) {
        void arg0;
        sprfqn sprfqn2 = this;
        sprfqn2.cfr_renamed_4 = new sprktp((int)arg0);
    }

    @Override
    public void cfr_renamed_13121(sprsmn arg0) {
        arg0.cfr_renamed_13186(this);
    }

    @Override
    public sprvjn cfr_renamed_12099() {
        int n;
        sprfqn sprfqn2 = new sprfqn(this.cfr_renamed_4.cfr_renamed_11861());
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.cfr_renamed_11861()) {
            sprsuja sprsuja2 = this.cfr_renamed_4.cfr_renamed_576(n);
            sprfqn2.cfr_renamed_4.cfr_renamed_13516(new sprsuja(sprsuja2.cfr_renamed_1980(), sprsuja2.spr\u3181()));
            n2 = ++n;
        }
        return sprfqn2;
    }

    public sprfqn() {
        sprfqn sprfqn2 = this;
        sprfqn2.cfr_renamed_4 = new sprktp();
    }

    @Override
    public void cfr_renamed_13569() {
        this.cfr_renamed_13187().cfr_renamed_9979();
    }
}

