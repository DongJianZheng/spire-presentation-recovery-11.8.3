/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprktp;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxnn;
import com.spire.presentation.packages.spryxp;

@sprtea
public class spresn
extends sprsmn {
    private sprxln cfr_renamed_0;
    private sprlsn cfr_renamed_1;
    private float cfr_renamed_2;
    private sprlsn cfr_renamed_3;
    private sprlsn cfr_renamed_4;

    private static /* synthetic */ sprsuja cfr_renamed_13625(sprvjn arg0) {
        sprfqn sprfqn2 = spresca.cfr_renamed_11777(arg0, sprfqn.class);
        if (sprfqn2 != null) {
            return sprfqn2.cfr_renamed_13187().cfr_renamed_576(sprfqn2.cfr_renamed_13187().cfr_renamed_11861() - 1);
        }
        sprxnn sprxnn2 = spresca.cfr_renamed_11777(arg0, sprxnn.class);
        if (sprxnn2 != null) {
            return sprxnn2.cfr_renamed_13171();
        }
        return sprsuja.cfr_renamed_13377();
    }

    @Override
    public void cfr_renamed_13175(sprxnn arg0) {
        sprktp sprktp2;
        spresn spresn2 = this;
        sprsuja sprsuja2 = spresn2.cfr_renamed_13626(arg0);
        sprsuja sprsuja3 = spresn2.cfr_renamed_13627(arg0);
        sprktp sprktp3 = sprktp2 = new sprktp();
        sprxnn sprxnn2 = arg0;
        sprktp2.cfr_renamed_13516(arg0.cfr_renamed_13167());
        sprktp2.cfr_renamed_13516(sprxnn2.cfr_renamed_13169());
        sprktp3.cfr_renamed_13516(sprxnn2.cfr_renamed_13170());
        sprktp3.cfr_renamed_13516(arg0.cfr_renamed_13171());
        sprsuja[] sprsujaArray = null;
        sprsuja[] sprsujaArray2 = null;
        sprsuja[][] sprsujaArray3 = new sprsuja[1][];
        sprsujaArray3[0] = sprsujaArray;
        sprsuja[][] sprsujaArray4 = sprsujaArray3;
        sprsuja[][] sprsujaArray5 = new sprsuja[1][];
        sprsujaArray5[0] = sprsujaArray2;
        sprsuja[][] sprsujaArray6 = sprsujaArray5;
        spresn spresn3 = this;
        spresn3.cfr_renamed_13628(sprktp2, sprsuja2, sprsuja3, sprsujaArray4, sprsujaArray6);
        sprsujaArray = sprsujaArray4[0];
        sprsujaArray2 = sprsujaArray6[0];
        sprxnn sprxnn3 = new sprxnn(sprsujaArray);
        sprxnn sprxnn4 = new sprxnn(sprsujaArray2);
        spresn3.cfr_renamed_13629(sprxnn3, sprxnn4);
    }

    private /* synthetic */ void cfr_renamed_13628(sprktp arg0, sprsuja arg1, sprsuja arg2, sprsuja[][] arg3, sprsuja[][] arg4) {
        int n;
        arg3[0] = new sprsuja[arg0.cfr_renamed_11861()];
        arg4[0] = new sprsuja[arg0.cfr_renamed_11861()];
        sprsuja sprsuja2 = arg1;
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_11861()) {
            sprsuja sprsuja3 = arg0.cfr_renamed_576(n);
            sprsuja sprsuja4 = n < arg0.cfr_renamed_11861() - 1 ? arg0.cfr_renamed_576(n + 1) : arg2;
            sprsuja[] sprsujaArray = spresn.cfr_renamed_13630(sprsuja2, sprsuja3, sprsuja4, this.cfr_renamed_2);
            arg3[0][n] = sprsujaArray[0];
            int n3 = this.cfr_renamed_4.cfr_renamed_13174() ? n : arg4[0].length - n - 1;
            arg4[0][n3] = sprsujaArray[1];
            sprsuja2 = sprsuja3;
            n2 = ++n;
        }
    }

    private /* synthetic */ sprsuja cfr_renamed_13627(sprvjn arg0) {
        int n = this.cfr_renamed_4.cfr_renamed_13530(arg0) + 1;
        if (n < this.cfr_renamed_4.cfr_renamed_11861()) {
            return spresn.cfr_renamed_13631(this.cfr_renamed_4.cfr_renamed_576(n));
        }
        if (this.cfr_renamed_4.cfr_renamed_13174()) {
            return spresn.cfr_renamed_13631(this.cfr_renamed_4.cfr_renamed_576(0));
        }
        return spresn.cfr_renamed_13625(arg0);
    }

    private /* synthetic */ void cfr_renamed_13629(sprvjn arg0, sprvjn arg1) {
        spresn spresn2 = this;
        spresn2.cfr_renamed_1.cfr_renamed_12507(arg0);
        if (spresn2.cfr_renamed_4.cfr_renamed_13174()) {
            this.cfr_renamed_3.cfr_renamed_12507(arg1);
            return;
        }
        this.cfr_renamed_3.cfr_renamed_13531(0, arg1);
    }

    public static sprxln cfr_renamed_13519(sprxln arg0) {
        spresn spresn2;
        if (arg0.cfr_renamed_12571() == null) {
            return arg0;
        }
        spresn spresn3 = spresn2 = new spresn(arg0.cfr_renamed_12571().cfr_renamed_1942());
        arg0.cfr_renamed_13121(spresn3);
        return spresn3.cfr_renamed_0;
    }

    private static /* synthetic */ sprsuja[] cfr_renamed_13632(sprsuja arg0, sprsuja arg1, float arg2) {
        double d = sprrgga.cfr_renamed_13633(arg0.spr\u3181() - arg1.spr\u3181(), arg0.cfr_renamed_1980() - arg1.cfr_renamed_1980());
        float f = arg2 * (float)sprrgga.cfr_renamed_13634(d);
        float f2 = -arg2 * (float)sprrgga.cfr_renamed_13635(d);
        sprsuja[] sprsujaArray = new sprsuja[2];
        sprsujaArray[0] = new sprsuja(arg0.cfr_renamed_1980() + f, arg0.spr\u3181() + f2);
        sprsujaArray[1] = new sprsuja(arg1.cfr_renamed_1980() + f, arg1.spr\u3181() + f2);
        return sprsujaArray;
    }

    @Override
    public void cfr_renamed_13186(sprfqn arg0) {
        spresn spresn2 = this;
        sprsuja sprsuja2 = spresn2.cfr_renamed_13626(arg0);
        sprsuja sprsuja3 = spresn2.cfr_renamed_13627(arg0);
        sprsuja[] sprsujaArray = null;
        sprsuja[] sprsujaArray2 = null;
        sprsuja[][] sprsujaArray3 = new sprsuja[1][];
        sprsujaArray3[0] = sprsujaArray;
        sprsuja[][] sprsujaArray4 = sprsujaArray3;
        sprsuja[][] sprsujaArray5 = new sprsuja[1][];
        sprsujaArray5[0] = sprsujaArray2;
        sprsuja[][] sprsujaArray6 = sprsujaArray5;
        spresn spresn3 = this;
        spresn3.cfr_renamed_13628(arg0.cfr_renamed_13187(), sprsuja2, sprsuja3, sprsujaArray4, sprsujaArray6);
        sprsujaArray = sprsujaArray4[0];
        sprsujaArray2 = sprsujaArray6[0];
        sprfqn sprfqn2 = new sprfqn(sprsujaArray, false);
        sprfqn sprfqn3 = new sprfqn(sprsujaArray2, false);
        spresn3.cfr_renamed_13629(sprfqn2, sprfqn3);
    }

    @Override
    public void cfr_renamed_13173(sprlsn arg0) {
        if (arg0.cfr_renamed_13174()) {
            spresn spresn2 = this;
            spresn2.cfr_renamed_1.cfr_renamed_12625(true);
            spresn2.cfr_renamed_3.cfr_renamed_12625(true);
            spresn2.cfr_renamed_0.cfr_renamed_12507(this.cfr_renamed_1);
            spresn spresn3 = this;
            spresn3.cfr_renamed_0.cfr_renamed_12507(spresn3.cfr_renamed_3);
            return;
        }
        spresn spresn4 = this;
        spresn spresn5 = this;
        spresn.cfr_renamed_13636(spresn4.cfr_renamed_1, spresn5.cfr_renamed_3);
        spresn5.cfr_renamed_1.cfr_renamed_12625(true);
        spresn4.cfr_renamed_0.cfr_renamed_12507(this.cfr_renamed_1);
    }

    private /* synthetic */ sprsuja cfr_renamed_13626(sprvjn arg0) {
        int n = this.cfr_renamed_4.cfr_renamed_13530(arg0) - 1;
        if (n >= 0) {
            return spresn.cfr_renamed_13625(this.cfr_renamed_4.cfr_renamed_576(n));
        }
        if (this.cfr_renamed_4.cfr_renamed_13174()) {
            spresn spresn2 = this;
            return spresn.cfr_renamed_13625(spresn2.cfr_renamed_4.cfr_renamed_576(spresn2.cfr_renamed_4.cfr_renamed_11861() - 1));
        }
        return spresn.cfr_renamed_13631(arg0);
    }

    private /* synthetic */ spresn(float f) {
        this.cfr_renamed_2 = f;
        spresn spresn2 = this;
        this.cfr_renamed_0 = new sprxln();
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ sprsuja cfr_renamed_13637(sprsuja sprsuja2, sprsuja sprsuja3, sprsuja sprsuja4, sprsuja sprsuja5) {
        void arg3;
        void arg2;
        void arg1;
        sprsuja arg0;
        sprsuja sprsuja6 = arg0;
        float f = arg1.spr\u3181() - sprsuja6.spr\u3181();
        float f2 = sprsuja6.cfr_renamed_1980() - arg1.cfr_renamed_1980();
        float f3 = f * arg0.cfr_renamed_1980() + f2 * arg0.spr\u3181();
        void v1 = arg2;
        float f4 = sprsuja5.spr\u3181() - v1.spr\u3181();
        float f5 = v1.cfr_renamed_1980() - arg3.cfr_renamed_1980();
        float f6 = f4 * arg2.cfr_renamed_1980() + f5 * arg2.spr\u3181();
        float f7 = f * f5 - f4 * f2;
        if (spryxp.cfr_renamed_13464(f7)) {
            return arg1;
        }
        return new sprsuja((f5 * f3 - f2 * f6) / f7, (f * f6 - f4 * f3) / f7);
    }

    private static /* synthetic */ sprsuja[] cfr_renamed_13630(sprsuja arg0, sprsuja arg1, sprsuja arg2, float arg3) {
        sprsuja sprsuja2;
        sprsuja sprsuja3;
        float f = arg3 / 2.0f;
        sprsuja sprsuja4 = arg0;
        sprsuja[] sprsujaArray = spresn.cfr_renamed_13632(sprsuja4, arg1, f);
        sprsuja sprsuja5 = arg1;
        sprsuja[] sprsujaArray2 = spresn.cfr_renamed_13632(sprsuja5, arg2, f);
        sprsuja[] sprsujaArray3 = spresn.cfr_renamed_13632(sprsuja4, sprsuja5, -f);
        sprsuja sprsuja6 = arg1;
        sprsuja[] sprsujaArray4 = spresn.cfr_renamed_13632(sprsuja6, arg2, -f);
        if (sprsuja.cfr_renamed_13638(sprsuja4, sprsuja6)) {
            sprsuja3 = sprsujaArray2[0];
            sprsuja2 = sprsujaArray4[0];
        } else if (sprsuja.cfr_renamed_13638(arg1, arg2)) {
            sprsuja3 = sprsujaArray[1];
            sprsuja2 = sprsujaArray3[1];
        } else {
            sprsuja3 = spresn.cfr_renamed_13637(sprsujaArray[0], sprsujaArray[1], sprsujaArray2[0], sprsujaArray2[1]);
            sprsuja2 = spresn.cfr_renamed_13637(sprsujaArray3[0], sprsujaArray3[1], sprsujaArray4[0], sprsujaArray4[1]);
        }
        sprsuja[] sprsujaArray5 = new sprsuja[2];
        sprsujaArray5[0] = sprsuja3;
        sprsujaArray5[1] = sprsuja2;
        return sprsujaArray5;
    }

    private static /* synthetic */ void cfr_renamed_13636(sprlsn arg0, sprlsn arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg1.cfr_renamed_11861()) {
            arg0.cfr_renamed_12507(arg1.cfr_renamed_576(n++).cfr_renamed_13616());
            n2 = n;
        }
    }

    @Override
    public void cfr_renamed_13178(sprlsn sprlsn2) {
        spresn spresn2 = this;
        spresn2.cfr_renamed_4 = sprlsn2;
        spresn spresn3 = this;
        spresn2.cfr_renamed_1 = new sprlsn();
        spresn3.cfr_renamed_3 = new sprlsn();
    }

    private static /* synthetic */ sprsuja cfr_renamed_13631(sprvjn arg0) {
        sprfqn sprfqn2 = spresca.cfr_renamed_11777(arg0, sprfqn.class);
        if (sprfqn2 != null) {
            return sprfqn2.cfr_renamed_13187().cfr_renamed_576(0);
        }
        sprxnn sprxnn2 = spresca.cfr_renamed_11777(arg0, sprxnn.class);
        if (sprxnn2 != null) {
            return sprxnn2.cfr_renamed_13167();
        }
        return sprsuja.cfr_renamed_13377();
    }
}

