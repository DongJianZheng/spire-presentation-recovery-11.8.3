/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprdrh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprlsh;

public class sprvnh
extends sprdrh {
    @Override
    public spreuh cfr_renamed_8652(spreuh arg0) {
        if (this.cfr_renamed_1952()) {
            return arg0;
        }
        if (arg0.cfr_renamed_1952()) {
            return this.cfr_renamed_1774();
        }
        sprvnh sprvnh2 = this;
        sprgxh sprgxh2 = sprvnh2.cfr_renamed_1769();
        sprlsh sprlsh2 = sprvnh2.cfr_renamed_3;
        if (sprlsh2.cfr_renamed_805()) {
            return arg0;
        }
        spreuh spreuh2 = arg0;
        sprlsh sprlsh3 = spreuh2.cfr_renamed_1953();
        sprlsh sprlsh4 = spreuh2.cfr_renamed_1964(0);
        if (sprlsh3.cfr_renamed_805() || !sprlsh4.cfr_renamed_287()) {
            return this.cfr_renamed_1774().cfr_renamed_8630(arg0);
        }
        sprvnh sprvnh3 = this;
        sprlsh sprlsh5 = sprvnh3.cfr_renamed_4;
        sprlsh sprlsh6 = sprvnh3.cfr_renamed_1[0];
        sprlsh sprlsh7 = arg0.cfr_renamed_1954();
        sprlsh sprlsh8 = sprlsh2.cfr_renamed_1048();
        sprlsh sprlsh9 = sprlsh5;
        sprlsh sprlsh10 = sprlsh9.cfr_renamed_1048();
        sprlsh sprlsh11 = sprlsh6;
        sprlsh sprlsh12 = sprlsh11.cfr_renamed_1048();
        sprlsh sprlsh13 = sprlsh9.cfr_renamed_8682(sprlsh11);
        sprlsh sprlsh14 = sprlsh10.cfr_renamed_8663(sprlsh13);
        sprlsh sprlsh15 = sprlsh7.cfr_renamed_1908();
        sprlsh sprlsh16 = sprlsh15.cfr_renamed_8682(sprlsh12).cfr_renamed_8663(sprlsh10).cfr_renamed_8932(sprlsh14, sprlsh8, sprlsh12);
        sprlsh sprlsh17 = sprlsh3.cfr_renamed_8682(sprlsh12);
        sprlsh sprlsh18 = sprlsh17.cfr_renamed_8663(sprlsh14).cfr_renamed_1048();
        if (sprlsh18.cfr_renamed_805()) {
            if (sprlsh16.cfr_renamed_805()) {
                return arg0.cfr_renamed_1774();
            }
            return sprgxh2.cfr_renamed_1770();
        }
        if (sprlsh16.cfr_renamed_805()) {
            sprgxh sprgxh3 = sprgxh2;
            return new sprvnh(sprgxh3, sprlsh16, sprgxh3.cfr_renamed_1997());
        }
        sprlsh sprlsh19 = sprlsh16;
        sprlsh sprlsh20 = sprlsh19.cfr_renamed_1048().cfr_renamed_8682(sprlsh17);
        sprlsh sprlsh21 = sprlsh19.cfr_renamed_8682(sprlsh18).cfr_renamed_8682(sprlsh12);
        sprlsh sprlsh22 = sprlsh19.cfr_renamed_8663(sprlsh18).cfr_renamed_1048().cfr_renamed_8932(sprlsh14, sprlsh15, sprlsh21);
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = sprlsh21;
        return new sprvnh(sprgxh2, sprlsh20, sprlsh22, sprlshArray);
    }

    public sprvnh(sprgxh arg0, sprlsh arg1, sprlsh arg2) {
        super(arg0, arg1, arg2);
    }

    @Override
    public spreuh cfr_renamed_1773() {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprlsh sprlsh2 = this.cfr_renamed_3;
        if (sprlsh2.cfr_renamed_805()) {
            return this;
        }
        sprvnh sprvnh2 = this;
        sprlsh sprlsh3 = sprvnh2.cfr_renamed_4;
        sprlsh sprlsh4 = sprvnh2.cfr_renamed_1[0];
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = sprlsh4;
        return new sprvnh(this.cfr_renamed_0, sprlsh2, sprlsh3.cfr_renamed_8663(sprlsh4), sprlshArray);
    }

    @Override
    public spreuh cfr_renamed_1977() {
        return new sprvnh(null, this.cfr_renamed_1969(), this.cfr_renamed_1973());
    }

    public sprvnh(sprgxh arg0, sprlsh arg1, sprlsh arg2, sprlsh[] arg3) {
        super(arg0, arg1, arg2, arg3);
    }

    @Override
    public spreuh cfr_renamed_1774() {
        sprlsh sprlsh2;
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprvnh sprvnh2 = this;
        sprgxh sprgxh2 = sprvnh2.cfr_renamed_1769();
        sprlsh sprlsh3 = sprvnh2.cfr_renamed_3;
        if (sprlsh3.cfr_renamed_805()) {
            return sprgxh2.cfr_renamed_1770();
        }
        sprvnh sprvnh3 = this;
        sprlsh sprlsh4 = sprvnh3.cfr_renamed_4;
        sprlsh sprlsh5 = sprvnh3.cfr_renamed_1[0];
        boolean bl = sprlsh5.cfr_renamed_287();
        sprlsh sprlsh6 = bl ? sprlsh5 : sprlsh5.cfr_renamed_1048();
        sprlsh sprlsh7 = sprlsh4;
        if ((bl ? (sprlsh2 = sprlsh7.cfr_renamed_1048().cfr_renamed_8663(sprlsh4)) : (sprlsh2 = sprlsh7.cfr_renamed_8663(sprlsh5).cfr_renamed_8682(sprlsh4))).cfr_renamed_805()) {
            sprgxh sprgxh3 = sprgxh2;
            return new sprvnh(sprgxh3, sprlsh2, sprgxh3.cfr_renamed_1997());
        }
        sprlsh sprlsh8 = sprlsh2.cfr_renamed_1048();
        sprlsh sprlsh9 = bl ? sprlsh2 : sprlsh2.cfr_renamed_8682(sprlsh6);
        sprlsh sprlsh10 = sprlsh4.cfr_renamed_8663(sprlsh3).cfr_renamed_1048();
        sprlsh sprlsh11 = bl ? sprlsh5 : sprlsh6.cfr_renamed_1048();
        sprlsh sprlsh12 = sprlsh10.cfr_renamed_8663(sprlsh2).cfr_renamed_8663(sprlsh6).cfr_renamed_8682(sprlsh10).cfr_renamed_8663(sprlsh11).cfr_renamed_8663(sprlsh8).cfr_renamed_8663(sprlsh9);
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = sprlsh9;
        return new sprvnh(sprgxh2, sprlsh8, sprlsh12, sprlshArray);
    }

    @Override
    public sprlsh cfr_renamed_1831() {
        sprvnh sprvnh2 = this;
        sprlsh sprlsh2 = sprvnh2.cfr_renamed_3;
        sprlsh sprlsh3 = sprvnh2.cfr_renamed_4;
        if (sprvnh2.cfr_renamed_1952() || sprlsh2.cfr_renamed_805()) {
            return sprlsh3;
        }
        sprlsh sprlsh4 = sprlsh3.cfr_renamed_8663(sprlsh2).cfr_renamed_8682(sprlsh2);
        sprlsh sprlsh5 = this.cfr_renamed_1[0];
        if (!sprlsh5.cfr_renamed_287()) {
            sprlsh4 = sprlsh4.cfr_renamed_8936(sprlsh5);
        }
        return sprlsh4;
    }

    @Override
    public spreuh cfr_renamed_8630(spreuh arg0) {
        sprlsh sprlsh2;
        sprlsh sprlsh3;
        sprlsh sprlsh4;
        if (this.cfr_renamed_1952()) {
            return arg0;
        }
        if (arg0.cfr_renamed_1952()) {
            return this;
        }
        sprvnh sprvnh2 = this;
        sprgxh sprgxh2 = sprvnh2.cfr_renamed_1769();
        sprlsh sprlsh5 = sprvnh2.cfr_renamed_3;
        sprlsh sprlsh6 = arg0.cfr_renamed_1953();
        if (sprlsh5.cfr_renamed_805()) {
            if (sprlsh6.cfr_renamed_805()) {
                return sprgxh2.cfr_renamed_1770();
            }
            return arg0.cfr_renamed_8630(this);
        }
        sprvnh sprvnh3 = this;
        sprlsh sprlsh7 = sprvnh3.cfr_renamed_4;
        sprlsh sprlsh8 = sprvnh3.cfr_renamed_1[0];
        spreuh spreuh2 = arg0;
        sprlsh sprlsh9 = spreuh2.cfr_renamed_1954();
        sprlsh sprlsh10 = spreuh2.cfr_renamed_1964(0);
        boolean bl = sprlsh8.cfr_renamed_287();
        sprlsh sprlsh11 = sprlsh6;
        sprlsh sprlsh12 = sprlsh9;
        if (!bl) {
            sprlsh11 = sprlsh11.cfr_renamed_8682(sprlsh8);
            sprlsh12 = sprlsh12.cfr_renamed_8682(sprlsh8);
        }
        boolean bl2 = sprlsh10.cfr_renamed_287();
        sprlsh sprlsh13 = sprlsh5;
        sprlsh sprlsh14 = sprlsh7;
        if (!bl2) {
            sprlsh13 = sprlsh13.cfr_renamed_8682(sprlsh10);
            sprlsh14 = sprlsh14.cfr_renamed_8682(sprlsh10);
        }
        sprlsh sprlsh15 = sprlsh14.cfr_renamed_8663(sprlsh12);
        sprlsh sprlsh16 = sprlsh13.cfr_renamed_8663(sprlsh11);
        if (sprlsh16.cfr_renamed_805()) {
            if (sprlsh15.cfr_renamed_805()) {
                return this.cfr_renamed_1774();
            }
            return sprgxh2.cfr_renamed_1770();
        }
        if (sprlsh6.cfr_renamed_805()) {
            sprlsh sprlsh17;
            spreuh spreuh3 = this.cfr_renamed_1775();
            sprlsh5 = spreuh3.cfr_renamed_1832();
            sprlsh sprlsh18 = spreuh3.cfr_renamed_1831();
            sprlsh sprlsh19 = sprlsh18.cfr_renamed_8663(sprlsh17 = sprlsh9).cfr_renamed_8936(sprlsh5);
            sprlsh4 = sprlsh19.cfr_renamed_1048().cfr_renamed_8663(sprlsh19).cfr_renamed_8663(sprlsh5);
            if (sprlsh4.cfr_renamed_805()) {
                sprgxh sprgxh3 = sprgxh2;
                return new sprvnh(sprgxh3, sprlsh4, sprgxh3.cfr_renamed_1997());
            }
            sprlsh3 = sprlsh19.cfr_renamed_8682(sprlsh5.cfr_renamed_8663(sprlsh4)).cfr_renamed_8663(sprlsh4).cfr_renamed_8663(sprlsh18).cfr_renamed_8936(sprlsh4).cfr_renamed_8663(sprlsh4);
            sprlsh2 = sprgxh2.cfr_renamed_1652(sprck.cfr_renamed_4);
        } else {
            sprlsh sprlsh20;
            sprlsh16 = sprlsh16.cfr_renamed_1048();
            sprlsh sprlsh21 = sprlsh15;
            sprlsh sprlsh22 = sprlsh21.cfr_renamed_8682(sprlsh13);
            sprlsh4 = sprlsh22.cfr_renamed_8682(sprlsh20 = sprlsh21.cfr_renamed_8682(sprlsh11));
            if (sprlsh4.cfr_renamed_805()) {
                sprgxh sprgxh4 = sprgxh2;
                return new sprvnh(sprgxh4, sprlsh4, sprgxh4.cfr_renamed_1997());
            }
            sprlsh sprlsh23 = sprlsh15.cfr_renamed_8682(sprlsh16);
            if (!bl2) {
                sprlsh23 = sprlsh23.cfr_renamed_8682(sprlsh10);
            }
            sprlsh3 = sprlsh20.cfr_renamed_8663(sprlsh16).cfr_renamed_8931(sprlsh23, sprlsh7.cfr_renamed_8663(sprlsh8));
            sprlsh2 = sprlsh23;
            if (!bl) {
                sprlsh2 = sprlsh2.cfr_renamed_8682(sprlsh8);
            }
        }
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = sprlsh2;
        return new sprvnh(sprgxh2, sprlsh4, sprlsh3, sprlshArray);
    }

    @Override
    public boolean cfr_renamed_1956() {
        sprlsh sprlsh2 = this.cfr_renamed_1953();
        if (sprlsh2.cfr_renamed_805()) {
            return false;
        }
        return this.cfr_renamed_1954().cfr_renamed_1930() != sprlsh2.cfr_renamed_1930();
    }
}

