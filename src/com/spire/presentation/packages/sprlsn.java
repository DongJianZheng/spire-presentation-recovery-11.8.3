/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcz;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprhjn;
import com.spire.presentation.packages.sprikn;
import com.spire.presentation.packages.sprkmn;
import com.spire.presentation.packages.sprktp;
import com.spire.presentation.packages.sprlw;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprxnn;

@sprtea
public class sprlsn
extends sprkmn {
    private sprsuja cfr_renamed_2 = sprsuja.cfr_renamed_13377();
    private boolean cfr_renamed_3;
    private boolean cfr_renamed_4;

    public sprsuja cfr_renamed_13639() {
        return this.cfr_renamed_13640(false);
    }

    public static sprlsn cfr_renamed_13120(sprsuja arg0, sprsuja arg1) {
        sprlsn sprlsn2 = new sprlsn();
        sprlsn2.cfr_renamed_13641(arg0, arg1);
        return sprlsn2;
    }

    public static sprlsn cfr_renamed_13642(sprsuja[] arg0) {
        sprlsn sprlsn2;
        sprlsn sprlsn3 = sprlsn2 = new sprlsn();
        sprlsn3.cfr_renamed_12625(false);
        sprlsn3.cfr_renamed_13643(arg0);
        return sprlsn3;
    }

    public void cfr_renamed_13643(sprsuja[] arg0) {
        int n;
        int n2 = arg0.length;
        int n3 = n = 0;
        while (n3 < n2 - 3) {
            n += 3;
            this.cfr_renamed_12507(new sprxnn(arg0[n], arg0[n + 1], arg0[n + 2], arg0[n]));
            n3 = n;
        }
    }

    public sprlsn cfr_renamed_12099() {
        int n;
        sprlsn sprlsn2 = new sprlsn();
        sprlsn2.cfr_renamed_3 = this.cfr_renamed_3;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_11861()) {
            sprcz sprcz2 = (sprcz)((Object)this.cfr_renamed_576(n));
            sprlsn2.cfr_renamed_12507(sprcz2.cfr_renamed_12099());
            n2 = ++n;
        }
        return sprlsn2;
    }

    public static sprlsn cfr_renamed_13644(sprsuja[] arg0, boolean arg1, boolean arg2) {
        sprlsn sprlsn2;
        sprlsn sprlsn3 = sprlsn2 = new sprlsn();
        sprlsn3.cfr_renamed_12625(arg2);
        sprlsn3.cfr_renamed_13645(arg0, arg1);
        return sprlsn3;
    }

    public static sprlsn cfr_renamed_13646(sprktp arg0, boolean arg1, boolean arg2) {
        sprlsn sprlsn2;
        sprlsn sprlsn3 = sprlsn2 = new sprlsn();
        sprlsn3.cfr_renamed_12625(arg2);
        sprlsn3.cfr_renamed_13647(arg0, arg1);
        return sprlsn3;
    }

    private /* synthetic */ sprsuja cfr_renamed_13640(boolean arg0) {
        if (this.cfr_renamed_11861() == 0) {
            return sprsuja.cfr_renamed_13377();
        }
        sprvjn sprvjn2 = this.cfr_renamed_576(arg0 ? 0 : this.cfr_renamed_11861() - 1);
        sprfqn sprfqn2 = spresca.cfr_renamed_11777(sprvjn2, sprfqn.class);
        if (sprfqn2 != null) {
            if (sprfqn2.cfr_renamed_13187().cfr_renamed_11861() == 0) {
                return sprsuja.cfr_renamed_13377();
            }
            return sprfqn2.cfr_renamed_13187().cfr_renamed_576(arg0 ? 0 : sprfqn2.cfr_renamed_13187().cfr_renamed_11861() - 1);
        }
        sprxnn sprxnn2 = spresca.cfr_renamed_11777(sprvjn2, sprxnn.class);
        if (sprxnn2 != null) {
            sprxnn sprxnn3 = sprxnn2;
            if (arg0) {
                return sprxnn3.cfr_renamed_13167();
            }
            return sprxnn3.cfr_renamed_13171();
        }
        return sprsuja.cfr_renamed_13377();
    }

    public void cfr_renamed_13641(sprsuja arg0, sprsuja arg1) {
        sprfqn sprfqn2;
        sprfqn sprfqn3 = sprfqn2 = new sprfqn();
        sprfqn3.cfr_renamed_13187().cfr_renamed_13516(arg0);
        sprfqn3.cfr_renamed_13187().cfr_renamed_13516(arg1);
        this.cfr_renamed_12507(sprfqn3);
    }

    public void cfr_renamed_12625(boolean arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public void cfr_renamed_13183(sprsuja arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public void cfr_renamed_12624(sprqgp arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_11861()) {
            sprvjn sprvjn2 = this.cfr_renamed_576(n);
            ((sprlw)((Object)sprvjn2)).cfr_renamed_12624(arg0);
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13121(sprsmn sprsmn2) {
        void arg0;
        sprlsn sprlsn2 = this;
        void v1 = arg0;
        v1.cfr_renamed_13178(this);
        super.cfr_renamed_13121((sprsmn)arg0);
        v1.cfr_renamed_13173(sprlsn2);
    }

    public void cfr_renamed_13645(sprsuja[] arg0, boolean arg1) {
        sprfqn sprfqn2 = new sprfqn(arg0, arg1);
        this.cfr_renamed_12507(sprfqn2);
    }

    public boolean cfr_renamed_13648() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_13649(sprikn arg0) {
        int n;
        sprhjn sprhjn2 = arg0.cfr_renamed_13165();
        int n2 = n = 0;
        while (n2 < sprhjn2.cfr_renamed_11861()) {
            this.cfr_renamed_12507(new sprxnn(sprhjn2, n++));
            n2 = n;
        }
    }

    public static sprlsn cfr_renamed_13253(sprgeja arg0) {
        sprlsn sprlsn2;
        sprlsn sprlsn3 = sprlsn2 = new sprlsn();
        sprlsn3.cfr_renamed_12625(true);
        sprlsn3.cfr_renamed_13650(arg0);
        return sprlsn3;
    }

    public void cfr_renamed_13651(sprktp arg0) {
        int n;
        int n2 = arg0.cfr_renamed_11861();
        int n3 = n = 0;
        while (n3 < n2 - 3) {
            n += 3;
            this.cfr_renamed_12507(new sprxnn(arg0.cfr_renamed_576(n), arg0.cfr_renamed_576(n + 1), arg0.cfr_renamed_576(n + 2), arg0.cfr_renamed_576(n)));
            n3 = n;
        }
    }

    public boolean cfr_renamed_13174() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_13650(sprgeja arg0) {
        sprfqn sprfqn2;
        sprfqn sprfqn3 = sprfqn2 = new sprfqn();
        sprfqn3.cfr_renamed_13187().cfr_renamed_13516(new sprsuja(arg0.cfr_renamed_13430(), arg0.cfr_renamed_13342()));
        sprfqn3.cfr_renamed_13187().cfr_renamed_13516(new sprsuja(arg0.cfr_renamed_13341(), arg0.cfr_renamed_13342()));
        sprfqn3.cfr_renamed_13187().cfr_renamed_13516(new sprsuja(arg0.cfr_renamed_13341(), arg0.cfr_renamed_13429()));
        sprfqn3.cfr_renamed_13187().cfr_renamed_13516(new sprsuja(arg0.cfr_renamed_13430(), arg0.cfr_renamed_13429()));
        this.cfr_renamed_12507(sprfqn3);
    }

    public void cfr_renamed_13652(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public sprsuja cfr_renamed_13249() {
        return this.cfr_renamed_13640(true);
    }

    public sprsuja cfr_renamed_13167() {
        if (this.cfr_renamed_2.cfr_renamed_29()) {
            return this.cfr_renamed_13249();
        }
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_13647(sprktp arg0, boolean arg1) {
        sprfqn sprfqn2 = new sprfqn(arg0, arg1);
        this.cfr_renamed_12507(sprfqn2);
    }
}

