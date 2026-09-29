/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbko;
import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.spremn;
import com.spire.presentation.packages.sprfdp;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprhsp;
import com.spire.presentation.packages.sprjzo;
import com.spire.presentation.packages.sprpon;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprqjn;
import com.spire.presentation.packages.sprrpp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;
import com.spire.presentation.packages.sprvqo;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxsp;
import com.spire.presentation.packages.sprxxy;
import java.util.Iterator;

@sprtea
public final class sprxhp {
    private boolean cfr_renamed_0;
    private boolean cfr_renamed_1;
    private sprtvp cfr_renamed_2;
    private sprhhp cfr_renamed_3;
    private sprrpp cfr_renamed_4;

    public sprxln cfr_renamed_19026(int arg0) {
        sprxhp sprxhp2 = this;
        return sprxhp2.cfr_renamed_16985(sprxhp.cfr_renamed_19027(sprxhp2.cfr_renamed_3.cfr_renamed_13261(), arg0));
    }

    private static /* synthetic */ sprhhp cfr_renamed_19028(sprfzo arg0, float arg1) {
        return new sprhhp(arg1, arg0.cfr_renamed_13303(), arg0);
    }

    public sprxhp(sprhhp arg0, sprpon[] arg1, boolean arg2, boolean arg3) {
        this(arg0, sprxhp.cfr_renamed_19029(arg1), arg2, arg3);
    }

    private /* synthetic */ sprrpp cfr_renamed_19030() {
        sprrpp sprrpp2 = null;
        sprxhp sprxhp2 = this;
        if (!sprxhp2.cfr_renamed_19031(sprxhp2.cfr_renamed_3.cfr_renamed_13261())) {
            sprxhp sprxhp3 = this;
            sprrpp2 = sprxhp3.cfr_renamed_19032(sprfdp.cfr_renamed_19033(this.cfr_renamed_3, sprxhp3.cfr_renamed_13030()));
        }
        if (sprrpp2 == null) {
            sprrpp2 = this.cfr_renamed_19034();
        }
        return sprrpp2;
    }

    public sprxhp(sprfzo arg0, float arg1, sprtvp arg2, boolean arg3, boolean arg4) {
        this(sprxhp.cfr_renamed_19028(arg0, arg1), arg2, arg3, arg4);
    }

    private static /* synthetic */ sprtvp cfr_renamed_19035(sprvqo arg0) {
        int n;
        sprtvp sprtvp2 = new sprtvp(arg0.cfr_renamed_13323().cfr_renamed_11861());
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_13323().cfr_renamed_11861()) {
            sprtvp2.cfr_renamed_12819(arg0.cfr_renamed_13323().cfr_renamed_7861(n++));
            n2 = n;
        }
        return sprtvp2;
    }

    private /* synthetic */ sprrpp cfr_renamed_19032(sprrpp arg0) {
        sprhsp sprhsp2;
        if (arg0 == null) {
            return null;
        }
        sprrpp sprrpp2 = new sprrpp(arg0.cfr_renamed_11861());
        sprhsp sprhsp3 = sprhsp2 = arg0.cfr_renamed_12162();
        while (sprhsp3.cfr_renamed_15064()) {
            sprxln sprxln2 = (sprxln)sprhsp2.cfr_renamed_15066();
            int n = sprhsp2.cfr_renamed_15065();
            int n2 = sprxhp.cfr_renamed_19027(this.cfr_renamed_3.cfr_renamed_13261(), n);
            if (this.cfr_renamed_0) {
                sprxln2 = spremn.cfr_renamed_13859(sprxln2, false);
            }
            if (this.cfr_renamed_1) {
                sprxln2 = sprbko.cfr_renamed_16994(sprxln2);
            }
            sprrpp2.cfr_renamed_12962(n2, sprxln2);
            sprhsp3 = sprhsp2;
        }
        return sprrpp2;
    }

    private /* synthetic */ sprxhp(sprhhp arg0, sprtvp arg1, boolean arg2, boolean arg3) {
        sprxhp sprxhp2 = this;
        sprxhp sprxhp3 = this;
        sprxhp3.cfr_renamed_3 = arg0;
        sprxhp3.cfr_renamed_0 = arg2;
        this.cfr_renamed_1 = arg3;
        sprxhp2.cfr_renamed_2 = arg1;
        sprxhp2.cfr_renamed_4 = this.cfr_renamed_19030();
    }

    private /* synthetic */ String cfr_renamed_13030() {
        StringBuilder stringBuilder = new StringBuilder(this.cfr_renamed_2.cfr_renamed_11861());
        int n = 0;
        int n2 = this.cfr_renamed_2.cfr_renamed_11861();
        int n3 = n;
        while (n3 < n2) {
            int n4 = this.cfr_renamed_2.cfr_renamed_576(n);
            sprxhp sprxhp2 = this;
            sprghha.cfr_renamed_12279(stringBuilder, sprxsp.cfr_renamed_12396(sprxhp2.cfr_renamed_19036(sprxhp2.cfr_renamed_3.cfr_renamed_13261(), n4)));
            n3 = ++n;
        }
        return stringBuilder.toString();
    }

    private /* synthetic */ int cfr_renamed_19036(sprfzo arg0, int arg1) {
        return arg0.cfr_renamed_13027().cfr_renamed_14372(arg1).cfr_renamed_12561();
    }

    public sprxhp(sprfzo arg0, float arg1, String arg2, boolean arg3, boolean arg4) {
        this(sprxhp.cfr_renamed_19028(arg0, arg1), sprxhp.cfr_renamed_19037(arg0, arg2), arg3, arg4);
    }

    private static /* synthetic */ sprtvp cfr_renamed_19037(sprfzo arg0, String arg1) {
        sprtvp sprtvp2 = new sprtvp(arg1.length());
        Iterator iterator = new sprcop(arg1).iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            int n2 = sprxhp.cfr_renamed_19027(arg0, n);
            if (sprtvp2.cfr_renamed_18332(n2)) continue;
            sprtvp2.cfr_renamed_12819(n2);
        }
        return sprtvp2;
    }

    private static /* synthetic */ int cfr_renamed_19027(sprfzo arg0, int arg1) {
        return arg0.cfr_renamed_13027().cfr_renamed_13469(arg1).cfr_renamed_13076();
    }

    private /* synthetic */ void cfr_renamed_19038(sprxln arg0, float arg1) {
        float f = 20480.0f;
        sprqgp sprqgp2 = new sprqgp();
        float f2 = arg1 / f;
        sprqgp sprqgp3 = sprqgp2;
        float f3 = f2;
        sprqgp3.cfr_renamed_13534(f3, f3);
        arg0.cfr_renamed_12624(sprqgp3);
    }

    private /* synthetic */ boolean cfr_renamed_19031(sprfzo arg0) {
        return !sprxxy.cfr_renamed_9("X\u0010W7u{O\u0014").equals(arg0.cfr_renamed_13460());
    }

    private static /* synthetic */ sprtvp cfr_renamed_19029(sprpon[] arg0) {
        int n;
        sprtvp sprtvp2 = new sprtvp(arg0.length);
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            sprqjn[] sprqjnArray = arg0[n].cfr_renamed_13027();
            int n4 = sprqjnArray.length;
            int n5 = n3 = 0;
            while (n5 < n4) {
                sprqjn sprqjn2 = sprqjnArray[n3];
                if (!sprtvp2.cfr_renamed_18332(sprqjn2.cfr_renamed_13072())) {
                    sprtvp2.cfr_renamed_12819(sprqjn2.cfr_renamed_13072());
                }
                n5 = ++n3;
            }
            n2 = ++n;
        }
        return sprtvp2;
    }

    private /* synthetic */ sprrpp cfr_renamed_19034() {
        sprrpp sprrpp2 = new sprjzo().cfr_renamed_18477(this.cfr_renamed_3.cfr_renamed_13261(), this.cfr_renamed_2);
        int n = 0;
        int n2 = this.cfr_renamed_2.cfr_renamed_11861();
        int n3 = n;
        while (n3 < n2) {
            int n4 = this.cfr_renamed_2.cfr_renamed_576(n);
            if (sprrpp2.cfr_renamed_14000(n4)) {
                sprxln sprxln2 = (sprxln)sprrpp2.cfr_renamed_576(n4);
                if (this.cfr_renamed_0) {
                    sprxln2 = spremn.cfr_renamed_13859(sprxln2, false);
                }
                if (this.cfr_renamed_1) {
                    sprxln2 = sprbko.cfr_renamed_16994(sprxln2);
                }
                this.cfr_renamed_19038(sprxln2, this.cfr_renamed_3.cfr_renamed_13265());
                sprrpp2.cfr_renamed_12962(n4, sprxln2);
            }
            n3 = ++n;
        }
        return sprrpp2;
    }

    public sprxhp(sprhhp arg0, String arg1, boolean arg2, boolean arg3) {
        sprhhp sprhhp2 = arg0;
        this(sprhhp2, sprxhp.cfr_renamed_19037(sprhhp2.cfr_renamed_13261(), arg1), arg2, arg3);
    }

    public sprxln cfr_renamed_16985(int arg0) {
        sprxln sprxln2 = (sprxln)this.cfr_renamed_4.cfr_renamed_576(arg0);
        if (sprxln2 == null) {
            return null;
        }
        return sprxln2.cfr_renamed_12099();
    }

    public sprxhp(sprvqo arg0, float arg1, boolean arg2, boolean arg3) {
        this(sprxhp.cfr_renamed_19028(arg0.cfr_renamed_13261(), arg1), sprxhp.cfr_renamed_19035(arg0), arg2, arg3);
    }
}

