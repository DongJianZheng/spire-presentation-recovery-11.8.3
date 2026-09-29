/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprktp;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprxnn;

public class sprahn {
    private double[] cfr_renamed_3 = new double[4];
    private int cfr_renamed_4;

    private static /* synthetic */ double cfr_renamed_13814(double arg0, double arg1, double arg2) {
        return sprrgga.cfr_renamed_13815(arg1, 2.0) - 4.0 * arg0 * arg2;
    }

    private /* synthetic */ void cfr_renamed_13816(double arg0) {
        if (arg0 < 0.0 || 1.0 < arg0) {
            return;
        }
        sprahn sprahn2 = this;
        sprahn2.cfr_renamed_3[sprahn2.cfr_renamed_4] = arg0;
        ++sprahn2.cfr_renamed_4;
    }

    private static /* synthetic */ double cfr_renamed_13817(double arg0, double arg1, double arg2, boolean arg3) {
        double d = sprahn.cfr_renamed_13814(arg0, arg1, arg2);
        return (-arg1 + sprrgga.cfr_renamed_12687(d) * (arg3 ? 1.0 : -1.0)) / (2.0 * arg0);
    }

    private static /* synthetic */ double cfr_renamed_13818(double arg0, double arg1) {
        return 3.0 * arg1 - 3.0 * arg0;
    }

    private static /* synthetic */ sprgeja cfr_renamed_13819(sprktp arg0) {
        int n;
        float f = Float.MAX_VALUE;
        float f2 = Float.MAX_VALUE;
        float f3 = -3.4028235E38f;
        float f4 = -3.4028235E38f;
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_11861()) {
            sprsuja sprsuja2 = arg0.cfr_renamed_576(n);
            f = sprrgga.cfr_renamed_13820(sprsuja2.cfr_renamed_1980(), f);
            f2 = sprrgga.cfr_renamed_13820(sprsuja2.spr\u3181(), f2);
            f3 = sprrgga.cfr_renamed_13566(sprsuja2.cfr_renamed_1980(), f3);
            f4 = sprrgga.cfr_renamed_13566(sprsuja2.spr\u3181(), f4);
            n2 = ++n;
        }
        float f5 = f;
        return new sprgeja(f5, f2, f3 - f5, f4 - f2);
    }

    private static /* synthetic */ double cfr_renamed_13821(double arg0, double arg1, double arg2, double arg3) {
        return 3.0 * arg3 - 9.0 * arg2 + 9.0 * arg1 - 3.0 * arg0;
    }

    public sprgeja cfr_renamed_13787(sprxnn arg0) {
        if (arg0 == null) {
            return sprgeja.cfr_renamed_4;
        }
        return this.cfr_renamed_13822(arg0.cfr_renamed_13167(), arg0.cfr_renamed_13169(), arg0.cfr_renamed_13170(), arg0.cfr_renamed_13171());
    }

    private /* synthetic */ sprktp cfr_renamed_13823(sprsuja arg0, sprsuja arg1, sprsuja arg2, sprsuja arg3) {
        int n;
        sprktp sprktp2;
        sprktp sprktp3 = sprktp2 = new sprktp();
        sprktp3.cfr_renamed_13516(arg0);
        sprktp3.cfr_renamed_13516(arg3);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            double d = this.cfr_renamed_3[n];
            double d2 = sprahn.cfr_renamed_13824(arg0.cfr_renamed_1980(), arg1.cfr_renamed_1980(), arg2.cfr_renamed_1980(), arg3.cfr_renamed_1980(), d);
            double d3 = sprahn.cfr_renamed_13824(arg0.spr\u3181(), arg1.spr\u3181(), arg2.spr\u3181(), arg3.spr\u3181(), d);
            sprsuja sprsuja2 = new sprsuja((float)d2, (float)d3);
            sprktp2.cfr_renamed_13516(sprsuja2);
            n2 = ++n;
        }
        return sprktp2;
    }

    private /* synthetic */ void cfr_renamed_13825(sprsuja arg0, sprsuja arg1, sprsuja arg2, sprsuja arg3) {
        sprsuja sprsuja2 = arg0;
        double d = sprahn.cfr_renamed_13821(sprsuja2.cfr_renamed_1980(), arg1.cfr_renamed_1980(), arg2.cfr_renamed_1980(), arg3.cfr_renamed_1980());
        double d2 = sprahn.cfr_renamed_13826(sprsuja2.cfr_renamed_1980(), arg1.cfr_renamed_1980(), arg2.cfr_renamed_1980());
        double d3 = sprahn.cfr_renamed_13818(sprsuja2.cfr_renamed_1980(), arg1.cfr_renamed_1980());
        double d4 = sprahn.cfr_renamed_13821(sprsuja2.spr\u3181(), arg1.spr\u3181(), arg2.spr\u3181(), arg3.spr\u3181());
        double d5 = sprahn.cfr_renamed_13826(sprsuja2.spr\u3181(), arg1.spr\u3181(), arg2.spr\u3181());
        double d6 = sprahn.cfr_renamed_13818(sprsuja2.spr\u3181(), arg1.spr\u3181());
        sprahn sprahn2 = this;
        sprahn2.cfr_renamed_13827(d, d2, d3);
        sprahn2.cfr_renamed_13827(d4, d5, d6);
    }

    private static /* synthetic */ double cfr_renamed_13826(double arg0, double arg1, double arg2) {
        return 6.0 * arg2 - 12.0 * arg1 + 6.0 * arg0;
    }

    public sprgeja cfr_renamed_13822(sprsuja arg0, sprsuja arg1, sprsuja arg2, sprsuja arg3) {
        if (sprsuja.cfr_renamed_13638(arg0, arg1) && sprsuja.cfr_renamed_13638(arg0, arg2) && sprsuja.cfr_renamed_13638(arg0, arg3)) {
            return new sprgeja(arg0, sprphja.cfr_renamed_4);
        }
        sprsuja sprsuja2 = arg0;
        this.cfr_renamed_4 = 0;
        this.cfr_renamed_13825(sprsuja2, arg1, arg2, arg3);
        return sprahn.cfr_renamed_13819(this.cfr_renamed_13823(sprsuja2, arg1, arg2, arg3));
    }

    private static /* synthetic */ double cfr_renamed_13824(double arg0, double arg1, double arg2, double arg3, double arg4) {
        return (arg3 - 3.0 * arg2 + 3.0 * arg1 - arg0) * sprrgga.cfr_renamed_13815(arg4, 3.0) + (3.0 * arg2 - 6.0 * arg1 + 3.0 * arg0) * sprrgga.cfr_renamed_13815(arg4, 2.0) + (3.0 * arg1 - 3.0 * arg0) * arg4 + arg0;
    }

    private /* synthetic */ void cfr_renamed_13827(double arg0, double arg1, double arg2) {
        double d;
        double d2 = sprahn.cfr_renamed_13814(arg0, arg1, arg2);
        if (d < 0.0) {
            return;
        }
        if (arg0 == 0.0) {
            if (arg1 != 0.0) {
                this.cfr_renamed_13816(-arg2 / arg1);
            }
            return;
        }
        sprahn sprahn2 = this;
        if (d2 == 0.0) {
            sprahn2.cfr_renamed_13816(sprahn.cfr_renamed_13817(arg0, arg1, arg2, true));
            return;
        }
        sprahn2.cfr_renamed_13816(sprahn.cfr_renamed_13817(arg0, arg1, arg2, true));
        this.cfr_renamed_13816(sprahn.cfr_renamed_13817(arg0, arg1, arg2, false));
    }
}

