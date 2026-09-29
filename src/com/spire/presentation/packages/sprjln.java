/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprffp;
import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprjcp;
import com.spire.presentation.packages.sprkjn;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprphn;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxhn;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxnn;
import com.spire.presentation.packages.spryxp;

@sprtea
public class sprjln
extends sprsmn {
    private sprffp cfr_renamed_0;
    private static float[] cfr_renamed_1;
    private sprxln cfr_renamed_2;
    private static sprphja[][] cfr_renamed_3;
    private sprlsn cfr_renamed_4;

    private /* synthetic */ int cfr_renamed_14029(boolean arg0) {
        if (arg0) {
            return this.cfr_renamed_0.cfr_renamed_13942().cfr_renamed_1942();
        }
        return this.cfr_renamed_0.cfr_renamed_13943().cfr_renamed_1942();
    }

    private static /* synthetic */ sprsuja cfr_renamed_14030(sprsuja arg0, sprsuja arg1, float arg2) {
        sprsuja sprsuja2 = arg1;
        double d = sprsuja2.cfr_renamed_1980() - arg0.cfr_renamed_1980();
        double d2 = sprsuja2.spr\u3181() - arg0.spr\u3181();
        double d3 = sprrgga.cfr_renamed_12687(sprjln.cfr_renamed_14031(d) + sprjln.cfr_renamed_14031(d2));
        double d4 = 0.0;
        if (d3 != 0.0) {
            d4 = (double)arg2 / d3;
        }
        return new sprsuja((float)((double)arg0.cfr_renamed_1980() + d * d4), (float)((double)arg0.spr\u3181() + d2 * d4));
    }

    private /* synthetic */ int cfr_renamed_14032(boolean arg0) {
        if (arg0) {
            return this.cfr_renamed_0.cfr_renamed_13942().cfr_renamed_324();
        }
        return this.cfr_renamed_0.cfr_renamed_13943().cfr_renamed_324();
    }

    private /* synthetic */ sprfqn cfr_renamed_14033(float arg0, sprfqn arg1, int arg2, sprsuja arg3, sprsuja arg4, boolean arg5) {
        boolean bl;
        sprsuja sprsuja2;
        block3: {
            sprjcp sprjcp2;
            sprsuja2 = sprjln.cfr_renamed_14030(arg3, arg4, arg0);
            sprjcp sprjcp3 = sprjcp2 = new sprjcp(arg4, sprsuja2).cfr_renamed_14034(sprsuja2, false);
            boolean bl2 = sprjcp3.cfr_renamed_14035(arg3);
            boolean bl3 = sprjcp3.cfr_renamed_14035(arg3);
            int n = arg2;
            boolean bl4 = bl3;
            while (bl4 == bl2) {
                if (arg1.cfr_renamed_13187().cfr_renamed_11861() == 1) {
                    bl = arg5;
                    break block3;
                }
                arg1.cfr_renamed_13187().cfr_renamed_12148(n);
                bl4 = sprjcp2.cfr_renamed_14035(arg1.cfr_renamed_13187().cfr_renamed_576(n += arg5 ? 0 : -1));
            }
            bl = arg5;
        }
        if (bl) {
            sprfqn sprfqn2 = arg1;
            sprfqn2.cfr_renamed_13187().cfr_renamed_14036(0, sprsuja2);
            return sprfqn2;
        }
        sprfqn sprfqn3 = arg1;
        sprfqn3.cfr_renamed_13187().cfr_renamed_13516(sprsuja2);
        return sprfqn3;
    }

    static {
        float[] fArray = new float[3];
        fArray[0] = 0.65f;
        fArray[1] = 1.0f;
        fArray[2] = 1.68f;
        cfr_renamed_1 = fArray;
        sprphja[][] sprphjaArrayArray = new sprphja[3][];
        sprphja[] sprphjaArray = new sprphja[3];
        sprphjaArray[0] = new sprphja(0.7f, 0.75f);
        sprphjaArray[1] = new sprphja(0.7f, 1.1f);
        sprphjaArray[2] = new sprphja(0.7f, 1.63f);
        sprphjaArrayArray[0] = sprphjaArray;
        sprphja[] sprphjaArray2 = new sprphja[3];
        sprphjaArray2[0] = new sprphja(1.0f, 0.67f);
        sprphjaArray2[1] = new sprphja(0.97f, 1.0f);
        sprphjaArray2[2] = new sprphja(1.0f, 1.5f);
        sprphjaArrayArray[1] = sprphjaArray2;
        sprphja[] sprphjaArray3 = new sprphja[3];
        sprphjaArray3[0] = new sprphja(1.4f, 0.65f);
        sprphjaArray3[1] = new sprphja(1.4f, 0.97f);
        sprphjaArray3[2] = new sprphja(1.4f, 1.4f);
        sprphjaArrayArray[2] = sprphjaArray3;
        cfr_renamed_3 = sprphjaArrayArray;
    }

    private static /* synthetic */ double cfr_renamed_14031(double arg0) {
        double d = arg0;
        return d * d;
    }

    @Override
    public void cfr_renamed_13175(sprxnn arg0) {
        sprjln sprjln2 = this;
        arg0 = sprjln2.cfr_renamed_14037(arg0, true);
        arg0 = sprjln2.cfr_renamed_14037(arg0, false);
        sprjln2.cfr_renamed_4.cfr_renamed_12507(arg0);
    }

    @Override
    public void cfr_renamed_13173(sprlsn arg0) {
        sprjln sprjln2 = this;
        sprjln2.cfr_renamed_2.cfr_renamed_12507(sprjln2.cfr_renamed_4);
        super.cfr_renamed_13173(arg0);
    }

    private /* synthetic */ int cfr_renamed_14038(boolean arg0) {
        if (arg0) {
            return this.cfr_renamed_0.cfr_renamed_13942().cfr_renamed_806();
        }
        return this.cfr_renamed_0.cfr_renamed_13943().cfr_renamed_806();
    }

    @Override
    public void cfr_renamed_13186(sprfqn arg0) {
        if (arg0.cfr_renamed_13187().cfr_renamed_11861() < 2) {
            return;
        }
        sprjln sprjln2 = this;
        arg0 = sprjln2.cfr_renamed_14039(arg0, true);
        arg0 = sprjln2.cfr_renamed_14039(arg0, false);
        sprjln2.cfr_renamed_4.cfr_renamed_12507(arg0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprxln cfr_renamed_14040(sprxln sprxln2, sprffp sprffp2) {
        void arg0;
        void arg1;
        this.cfr_renamed_0 = arg1;
        sprxln sprxln3 = sprxln2.cfr_renamed_12099();
        sprjln sprjln2 = this;
        this.cfr_renamed_2 = new sprxln(arg0.cfr_renamed_12571());
        sprxln3.cfr_renamed_13121(this);
        return this.cfr_renamed_2;
    }

    private /* synthetic */ float cfr_renamed_14041(boolean arg0) {
        sprkjn sprkjn2 = arg0 ? this.cfr_renamed_0.cfr_renamed_13942().cfr_renamed_13961() : this.cfr_renamed_0.cfr_renamed_13943().cfr_renamed_13961();
        sprxhn sprxhn2 = spresca.cfr_renamed_11777(sprkjn2, sprxhn.class);
        if (sprxhn2 != null) {
            return sprxhn2.cfr_renamed_13870();
        }
        return 0.0f;
    }

    private /* synthetic */ sprfqn cfr_renamed_14039(sprfqn arg0, boolean arg1) {
        float f = this.cfr_renamed_14042(arg1);
        if (spryxp.cfr_renamed_13464(f)) {
            return arg0;
        }
        if (f < 0.0f && this.cfr_renamed_14032(arg1) != 6) {
            return arg0;
        }
        int n = sprphn.cfr_renamed_13944(arg0, arg1);
        if (n == -1) {
            return arg0;
        }
        sprfqn sprfqn2 = arg0;
        sprsuja sprsuja2 = sprfqn2.cfr_renamed_13187().cfr_renamed_576(n);
        sprsuja sprsuja3 = sprfqn2.cfr_renamed_13187().cfr_renamed_576(n + (arg1 ? 1 : -1));
        if (arg1) {
            int n2 = n;
            while (n2 > 0) {
                arg0.cfr_renamed_13187().cfr_renamed_12148(0);
                n2 = --n;
            }
        } else {
            int n3;
            int n4 = n3 = arg0.cfr_renamed_13187().cfr_renamed_11861() - 1;
            while (n4 > n) {
                arg0.cfr_renamed_13187().cfr_renamed_12148(n3--);
                n4 = n3;
            }
        }
        return this.cfr_renamed_14033(f, arg0, n, sprsuja2, sprsuja3, arg1);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ float cfr_renamed_14042(boolean arg0) {
        sprjln sprjln2 = this;
        int n = sprjln2.cfr_renamed_14032(arg0);
        int n2 = sprjln2.cfr_renamed_14029(arg0);
        int n3 = sprjln2.cfr_renamed_14038(arg0);
        switch (n) {
            case 1: 
            case 2: {
                return 1.5f * this.cfr_renamed_0.cfr_renamed_1942() * cfr_renamed_1[n3];
            }
            case 5: {
                sprphja sprphja2 = cfr_renamed_3[n2][n3];
                float f = this.cfr_renamed_0.cfr_renamed_1942() * sprphja2.cfr_renamed_1452();
                if (n3 != 2) return f *= 1.3f;
                if (n2 != 0) return f *= 1.3f;
                return f *= 1.5f;
            }
            case 3: 
            case 4: {
                return 0.0f;
            }
            case 6: {
                return this.cfr_renamed_0.cfr_renamed_1942() * this.cfr_renamed_14041(arg0);
            }
        }
        return 0.0f;
    }

    private /* synthetic */ sprxnn cfr_renamed_14037(sprxnn arg0, boolean arg1) {
        sprjln sprjln2;
        sprsuja sprsuja2;
        sprsuja sprsuja3;
        float f;
        float f2 = this.cfr_renamed_14042(arg1);
        if (f <= 0.0f) {
            return arg0;
        }
        if (arg1) {
            sprxnn sprxnn2 = arg0;
            sprsuja3 = sprxnn2.cfr_renamed_13167();
            sprsuja2 = sprxnn2.cfr_renamed_13169();
            sprjln2 = this;
        } else {
            sprxnn sprxnn3 = arg0;
            sprsuja3 = sprxnn3.cfr_renamed_13171();
            sprsuja2 = sprxnn3.cfr_renamed_13170();
            sprjln2 = this;
        }
        return sprjln2.cfr_renamed_14043(f2, arg0, sprsuja3, sprsuja2, arg1);
    }

    private /* synthetic */ sprxnn cfr_renamed_14043(float arg0, sprxnn arg1, sprsuja arg2, sprsuja arg3, boolean arg4) {
        arg1.cfr_renamed_13183(arg4 ? sprjln.cfr_renamed_14030(arg2, arg3, arg0) : arg1.cfr_renamed_13167());
        arg1.cfr_renamed_13621(arg4 ? arg1.cfr_renamed_13171() : sprjln.cfr_renamed_14030(arg2, arg3, arg0));
        return arg1;
    }

    @Override
    public void cfr_renamed_13178(sprlsn sprlsn2) {
        sprjln sprjln2 = this;
        this.cfr_renamed_4 = new sprlsn();
        super.cfr_renamed_13178(sprlsn2);
    }

    public static sprxln cfr_renamed_14044(sprxln arg0, sprffp arg1) {
        if (arg1 == null) {
            return arg0;
        }
        return new sprjln().cfr_renamed_14040(arg0, arg1);
    }
}

