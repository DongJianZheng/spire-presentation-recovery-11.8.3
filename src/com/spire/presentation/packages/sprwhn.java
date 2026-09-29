/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprikn;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryxp;

@sprtea
public class sprwhn {
    private static /* synthetic */ double cfr_renamed_13835(double arg0, double arg1, int arg2) {
        double d = sprwhn.cfr_renamed_13836(arg0, arg1, arg2);
        if (d == 0.0) {
            return 360.0;
        }
        if (arg2 == 2) {
            d = sprwhn.cfr_renamed_13837(d);
        }
        return spryxp.cfr_renamed_13838(d);
    }

    public static sprikn cfr_renamed_13839(sprgeja arg0, sprsuja arg1, sprsuja arg2) {
        return sprwhn.cfr_renamed_13840(arg0, arg1, arg2, 2);
    }

    private /* synthetic */ sprwhn() {
    }

    public static sprikn cfr_renamed_13840(sprgeja arg0, sprsuja arg1, sprsuja arg2, int arg3) {
        sprphja sprphja2 = new sprphja(arg0.cfr_renamed_1942() / 2.0f, arg0.cfr_renamed_1452() / 2.0f);
        sprsuja sprsuja2 = new sprsuja(arg0.cfr_renamed_1980() + sprphja2.cfr_renamed_1942(), arg0.spr\u3181() + sprphja2.cfr_renamed_1452());
        double d = sprrgga.cfr_renamed_13633(arg1.spr\u3181() - sprsuja2.spr\u3181(), arg1.cfr_renamed_1980() - sprsuja2.cfr_renamed_1980());
        double d2 = sprrgga.cfr_renamed_13633(arg2.spr\u3181() - sprsuja2.spr\u3181(), arg2.cfr_renamed_1980() - sprsuja2.cfr_renamed_1980());
        double d3 = sprwhn.cfr_renamed_13835(d, d2, arg3);
        d = spryxp.cfr_renamed_13838(d);
        return new sprikn(arg0, d, d3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ double cfr_renamed_13836(double arg0, double arg1, int arg2) {
        double d;
        switch (arg2) {
            case 0: {
                if (!(arg1 < arg0)) break;
                d = arg1 = arg1 + Math.PI * 2;
                return d - arg0;
            }
            case 1: {
                if (!(arg1 > arg0)) break;
                arg0 += Math.PI * 2;
            }
        }
        d = arg1;
        return d - arg0;
    }

    private static /* synthetic */ double cfr_renamed_13837(double arg0) {
        if (arg0 > Math.PI) {
            return arg0 -= Math.PI * 2;
        }
        if (arg0 < -Math.PI) {
            arg0 += Math.PI * 2;
        }
        return arg0;
    }
}

