/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprioo;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprufo;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.spryxp;

@sprtea
public class sprxoo {
    private boolean cfr_renamed_0;
    private sprlsn cfr_renamed_1;
    private sprxln cfr_renamed_2;
    private sprioo cfr_renamed_3;
    private sprxln cfr_renamed_4;

    public void cfr_renamed_16327(sprsuja[] arg0) {
        sprxoo sprxoo2 = this;
        sprsuja[] sprsujaArray = sprxoo2.cfr_renamed_16328(arg0);
        sprxoo2.cfr_renamed_16329(sprsujaArray[0]);
        sprxoo2.cfr_renamed_1.cfr_renamed_13645(sprsujaArray, false);
    }

    private /* synthetic */ void cfr_renamed_16329(sprsuja arg0) {
        if (this.cfr_renamed_1.cfr_renamed_11861() != 0) {
            sprxoo sprxoo2 = this;
            if (!sprxoo2.cfr_renamed_16330(sprxoo2.cfr_renamed_1.cfr_renamed_13639(), arg0)) {
                sprxoo sprxoo3 = this;
                sprxoo3.cfr_renamed_4.cfr_renamed_12507(sprxoo3.cfr_renamed_1);
                sprxoo sprxoo4 = this;
                sprxoo4.cfr_renamed_1 = new sprlsn();
            }
        }
    }

    private /* synthetic */ boolean cfr_renamed_16330(sprsuja arg0, sprsuja arg1) {
        return spryxp.cfr_renamed_13682(arg0.cfr_renamed_1980(), arg1.cfr_renamed_1980()) && spryxp.cfr_renamed_13682(arg0.spr\u3181(), arg1.spr\u3181());
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_16331(sprufo sprufo2) {
        void arg0;
        sprxoo sprxoo2 = this;
        void v1 = arg0;
        this.cfr_renamed_0 = arg0.cfr_renamed_16321();
        this.cfr_renamed_1 = v1.cfr_renamed_16324();
        sprxoo2.cfr_renamed_4 = v1.cfr_renamed_12669();
        sprxoo2.cfr_renamed_2 = sprufo2.cfr_renamed_16325();
    }

    public void cfr_renamed_13643(sprsuja[] arg0) {
        sprxoo sprxoo2 = this;
        sprsuja[] sprsujaArray = sprxoo2.cfr_renamed_16328(arg0);
        sprxoo2.cfr_renamed_16329(sprsujaArray[0]);
        sprxoo2.cfr_renamed_1.cfr_renamed_13643(sprsujaArray);
    }

    public boolean cfr_renamed_16321() {
        return this.cfr_renamed_0;
    }

    public void cfr_renamed_16332() {
        this.cfr_renamed_2 = null;
    }

    public void cfr_renamed_16333() {
        sprxoo sprxoo2 = this;
        this.cfr_renamed_2 = null;
        sprxoo2.cfr_renamed_0 = false;
        sprxoo2.cfr_renamed_4 = null;
    }

    public void cfr_renamed_12699() {
        sprxoo sprxoo2 = this;
        sprxoo sprxoo3 = this;
        sprxoo3.cfr_renamed_16334();
        sprxoo3.cfr_renamed_2 = sprxoo3.cfr_renamed_4;
        sprxoo2.cfr_renamed_0 = false;
        sprxoo2.cfr_renamed_4 = null;
    }

    public void cfr_renamed_16335() {
        int n;
        if (this.cfr_renamed_2 == null) {
            return;
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2.cfr_renamed_11861()) {
            sprvjn sprvjn2 = this.cfr_renamed_2.cfr_renamed_576(n);
            ((sprlsn)sprvjn2).cfr_renamed_12625(true);
            n2 = ++n;
        }
    }

    public void cfr_renamed_16336() {
        sprxoo sprxoo2 = this;
        sprxoo2.cfr_renamed_2 = null;
        sprxoo2.cfr_renamed_0 = true;
        sprxoo sprxoo3 = this;
        sprxoo2.cfr_renamed_4 = new sprxln();
        sprxoo3.cfr_renamed_1 = new sprlsn();
    }

    public sprufo cfr_renamed_16317() {
        sprufo sprufo2;
        sprufo sprufo3 = sprufo2 = new sprufo();
        sprufo3.cfr_renamed_16323(this.cfr_renamed_0);
        sprufo3.cfr_renamed_16326(this.cfr_renamed_1 != null ? this.cfr_renamed_1.cfr_renamed_12099() : null);
        sprufo2.cfr_renamed_16320(this.cfr_renamed_4 != null ? this.cfr_renamed_4.cfr_renamed_12099() : null);
        sprufo2.cfr_renamed_16322(this.cfr_renamed_2 != null ? this.cfr_renamed_2.cfr_renamed_12099() : null);
        return sprufo2;
    }

    public void cfr_renamed_16334() {
        if (!this.cfr_renamed_16321()) {
            return;
        }
        if (this.cfr_renamed_1.cfr_renamed_11861() == 0) {
            return;
        }
        sprxoo sprxoo2 = this;
        sprxoo2.cfr_renamed_4.cfr_renamed_12507(sprxoo2.cfr_renamed_1);
        sprxoo sprxoo3 = this;
        sprxoo3.cfr_renamed_1 = new sprlsn();
    }

    private /* synthetic */ sprsuja[] cfr_renamed_16328(sprsuja[] arg0) {
        sprsuja[] sprsujaArray = new sprsuja[arg0.length];
        System.arraycopy(arg0, 0, sprsujaArray, 0, arg0.length);
        this.cfr_renamed_3.cfr_renamed_16112().cfr_renamed_13184(sprsujaArray);
        return sprsujaArray;
    }

    public void cfr_renamed_16337() {
        if (!this.cfr_renamed_16321()) {
            return;
        }
        if (this.cfr_renamed_1.cfr_renamed_11861() == 0) {
            return;
        }
        sprxoo sprxoo2 = this;
        sprxoo2.cfr_renamed_1.cfr_renamed_12625(true);
        sprxoo2.cfr_renamed_16334();
    }

    public sprxoo(sprioo sprioo2) {
        sprxoo sprxoo2 = this;
        sprxoo sprxoo3 = this;
        sprxoo2.cfr_renamed_4 = new sprxln();
        sprxoo2.cfr_renamed_1 = new sprlsn();
        sprxoo2.cfr_renamed_3 = sprioo2;
    }

    public sprxln cfr_renamed_16325() {
        return this.cfr_renamed_2;
    }
}

