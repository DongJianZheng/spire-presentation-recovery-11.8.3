/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprgs;
import com.spire.presentation.packages.sprkmn;
import com.spire.presentation.packages.sprktp;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.spryxp;

@sprtea
public class sprxln
extends sprkmn
implements sprgs {
    private int cfr_renamed_0;
    private sprpln cfr_renamed_1;
    private sprqgp cfr_renamed_2;
    private sprxln cfr_renamed_3;
    private sprtbp cfr_renamed_4;

    public sprpln cfr_renamed_12551() {
        return this.cfr_renamed_1;
    }

    public sprxln cfr_renamed_13532() {
        int n;
        sprxln sprxln2 = new sprxln();
        if (this.cfr_renamed_3 != null) {
            sprxln2.cfr_renamed_3 = this.cfr_renamed_3.cfr_renamed_13532();
        }
        if (this.cfr_renamed_2 != null) {
            sprxln2.cfr_renamed_2 = this.cfr_renamed_2.cfr_renamed_12099();
        }
        sprxln2.cfr_renamed_12591(this.cfr_renamed_0);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_11861()) {
            sprlsn sprlsn2 = (sprlsn)this.cfr_renamed_576(n);
            sprxln2.cfr_renamed_12507(sprlsn2.cfr_renamed_12099());
            n2 = ++n;
        }
        return sprxln2;
    }

    public static sprxln cfr_renamed_13653(sprsuja[] arg0, boolean arg1) {
        sprxln sprxln2 = new sprxln();
        sprxln2.cfr_renamed_12507(sprlsn.cfr_renamed_13644(arg0, true, arg1));
        return sprxln2;
    }

    public void cfr_renamed_12505(sprtbp arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_12550(sprpln arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public boolean cfr_renamed_29() {
        boolean bl;
        boolean bl2 = bl = this.cfr_renamed_4 == null || spryxp.cfr_renamed_13464(this.cfr_renamed_4.cfr_renamed_1942());
        if (!bl) {
            boolean bl3 = bl = this.cfr_renamed_4.cfr_renamed_12551() == null || this.cfr_renamed_4.cfr_renamed_12551().cfr_renamed_29();
        }
        if (bl) {
            bl = this.cfr_renamed_1 == null || this.cfr_renamed_1.cfr_renamed_29();
        }
        return bl;
    }

    public void cfr_renamed_12545(sprxln arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public static sprxln cfr_renamed_13646(sprktp arg0, boolean arg1, boolean arg2) {
        sprxln sprxln2 = new sprxln();
        sprxln2.cfr_renamed_12507(sprlsn.cfr_renamed_13646(arg0, arg1, arg2));
        return sprxln2;
    }

    public static sprxln cfr_renamed_13654(sprgeja arg0, sprtbp arg1) {
        sprxln sprxln2 = sprxln.cfr_renamed_13253(arg0);
        sprxln2.cfr_renamed_12505(arg1);
        return sprxln2;
    }

    public sprxln cfr_renamed_13655(boolean arg0) {
        sprxln sprxln2 = new sprxln();
        if (this.cfr_renamed_4 != null) {
            sprxln2.cfr_renamed_4 = this.cfr_renamed_4.cfr_renamed_12099();
        }
        if (this.cfr_renamed_1 != null) {
            sprxln2.cfr_renamed_1 = this.cfr_renamed_1.cfr_renamed_12099();
        }
        if (this.cfr_renamed_3 != null) {
            sprxln2.cfr_renamed_3 = this.cfr_renamed_3.cfr_renamed_13532();
        }
        if (this.cfr_renamed_2 != null) {
            sprxln2.cfr_renamed_2 = this.cfr_renamed_2.cfr_renamed_12099();
        }
        sprxln2.cfr_renamed_12591(this.cfr_renamed_0);
        if (arg0) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_11861()) {
                sprlsn sprlsn2 = (sprlsn)this.cfr_renamed_576(n);
                sprxln2.cfr_renamed_12507(sprlsn2.cfr_renamed_12099());
                n2 = ++n;
            }
        }
        return sprxln2;
    }

    public void cfr_renamed_12511(sprqgp arg0) {
        this.cfr_renamed_2 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13121(sprsmn sprsmn2) {
        void arg0;
        sprxln sprxln2 = this;
        void v1 = arg0;
        v1.cfr_renamed_13098(this);
        super.cfr_renamed_13121((sprsmn)arg0);
        v1.cfr_renamed_13107(sprxln2);
    }

    public void cfr_renamed_12624(sprqgp arg0) {
        int n;
        if (arg0.cfr_renamed_13656()) {
            return;
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_11861()) {
            sprvjn sprvjn2 = this.cfr_renamed_576(n);
            ((sprlsn)sprvjn2).cfr_renamed_12624(arg0);
            n2 = ++n;
        }
    }

    @Override
    public sprxln cfr_renamed_12590() {
        return this.cfr_renamed_3;
    }

    public static sprxln cfr_renamed_13644(sprsuja[] arg0, boolean arg1, boolean arg2) {
        sprxln sprxln2 = new sprxln();
        sprxln2.cfr_renamed_12507(sprlsn.cfr_renamed_13644(arg0, arg1, arg2));
        return sprxln2;
    }

    @Override
    public sprvjn cfr_renamed_13616() {
        return this.cfr_renamed_12099();
    }

    public sprxln() {
        this.cfr_renamed_0 = 0;
    }

    public boolean cfr_renamed_13657() {
        sprlsn sprlsn2;
        sprlsn sprlsn3;
        if (this.cfr_renamed_11861() > 0) {
            sprxln sprxln2 = this;
            sprlsn3 = (sprlsn)sprxln2.cfr_renamed_576(sprxln2.cfr_renamed_11861() - 1);
        } else {
            sprlsn3 = sprlsn2 = null;
        }
        return sprlsn2 != null && sprlsn2.cfr_renamed_13174();
    }

    public static sprxln cfr_renamed_13253(sprgeja arg0) {
        sprxln sprxln2 = new sprxln();
        sprxln2.cfr_renamed_12507(sprlsn.cfr_renamed_13253(arg0));
        return sprxln2;
    }

    public static sprxln cfr_renamed_13658(sprsuja arg0, sprtbp arg1) {
        sprxln sprxln2 = sprxln.cfr_renamed_13253(new sprgeja(arg0.cfr_renamed_1980() - 1.0f, arg0.spr\u3181() - 1.0f, 2.0f, 2.0f));
        sprxln2.cfr_renamed_12505(arg1);
        return sprxln2;
    }

    public void cfr_renamed_12591(int arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public static sprxln cfr_renamed_13120(sprsuja arg0, sprsuja arg1) {
        sprxln sprxln2 = new sprxln();
        sprxln2.cfr_renamed_12507(sprlsn.cfr_renamed_13120(arg0, arg1));
        return sprxln2;
    }

    public sprxln cfr_renamed_12099() {
        return this.cfr_renamed_13655(true);
    }

    public int cfr_renamed_12609() {
        return this.cfr_renamed_0;
    }

    @Override
    public sprqgp cfr_renamed_13094() {
        return this.cfr_renamed_2;
    }

    public sprtbp cfr_renamed_12571() {
        return this.cfr_renamed_4;
    }

    public sprxln(sprtbp sprtbp2) {
        sprxln sprxln2 = this;
        sprxln2.cfr_renamed_0 = 0;
        sprxln2.cfr_renamed_4 = sprtbp2;
    }
}

