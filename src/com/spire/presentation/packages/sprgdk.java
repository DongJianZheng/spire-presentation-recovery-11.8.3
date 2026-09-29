/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragj;
import com.spire.presentation.packages.sprdlh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfjs;
import com.spire.presentation.packages.sprgfh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprhr;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprjvj;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlfm;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprqmh;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrah;
import com.spire.presentation.packages.sprxmh;
import com.spire.presentation.packages.sprxrk;
import com.spire.presentation.packages.spryjh;
import com.spire.presentation.packages.sprynm;
import com.spire.presentation.packages.sprywg;
import com.spire.presentation.packages.spryye;

public class sprgdk
extends sprjvj {
    public sprgdk(sprywg arg0) {
        super(arg0);
    }

    public sprgdk(spryye arg0) {
        super(sprgdk.cfr_renamed_9614((sprnzk)arg0));
    }

    public static sprywg cfr_renamed_9614(sprnzk arg0) {
        sprlem sprlem2 = ((sprxrk)arg0.cfr_renamed_284()).cfr_renamed_313();
        spreuh spreuh2 = arg0.cfr_renamed_1604();
        if (sprlem2.cfr_renamed_5078(sprhr.cfr_renamed_1)) {
            return new sprywg(sprrah.cfr_renamed_4, new spryjh().cfr_renamed_9521(0).cfr_renamed_9522(sprgfh.cfr_renamed_8400(spreuh2.cfr_renamed_1969().cfr_renamed_1779(), spreuh2.cfr_renamed_1973().cfr_renamed_1779())).cfr_renamed_9523());
        }
        if (sprlem2.cfr_renamed_5078(spris.cfr_renamed_96)) {
            return new sprywg(sprrah.cfr_renamed_4, new spryjh().cfr_renamed_9521(1).cfr_renamed_9522(sprgfh.cfr_renamed_8400(spreuh2.cfr_renamed_1969().cfr_renamed_1779(), spreuh2.cfr_renamed_1973().cfr_renamed_1779())).cfr_renamed_9523());
        }
        throw new IllegalArgumentException(spragj.cfr_renamed_9("&J8J<S=\u00040Q!R6\u0004:JsT&F?M0\u00046J0V*T'M<JsO6]"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public spryye cfr_renamed_1521() {
        spreuh spreuh2;
        sprgxh sprgxh2;
        byte[] byArray;
        sprhfm sprhfm2;
        sprhfm sprhfm3;
        sprlem sprlem2;
        sprxmh sprxmh2 = this.cfr_renamed_4.cfr_renamed_1157();
        switch (sprxmh2.cfr_renamed_8227()) {
            case 0: {
                sprlem2 = sprhr.cfr_renamed_1;
                sprhfm2 = sprhfm3 = sprynm.cfr_renamed_7994(sprhr.cfr_renamed_1);
                break;
            }
            case 1: {
                sprlem2 = spris.cfr_renamed_96;
                sprhfm2 = sprhfm3 = sprlfm.cfr_renamed_7994(spris.cfr_renamed_96);
                break;
            }
            default: {
                throw new IllegalStateException(sprfjs.cfr_renamed_9(")h7h3q2&7c%&(\u007f,c"));
            }
        }
        sprgxh sprgxh3 = sprhfm2.cfr_renamed_1769();
        if (!(this.cfr_renamed_4.cfr_renamed_1157().cfr_renamed_8423() instanceof sprqmh)) throw new IllegalStateException(spragj.cfr_renamed_9("6\\'A=W:K=\u0004'KsT&F?M0\u0004%A!M5M0E'M<JsO6]sJ<PsW&T#K!P6@"));
        sprqmh sprqmh2 = (sprqmh)sprxmh2.cfr_renamed_8423();
        sprqmh sprqmh3 = sprqmh2;
        if (sprqmh2 instanceof sprgfh) {
            byArray = sprqmh3.cfr_renamed_7976();
            sprgxh2 = sprgxh3;
            spreuh2 = sprgxh2.cfr_renamed_2002(byArray).cfr_renamed_1775();
            return new sprnzk(spreuh2, (sprqxk)new sprxrk(sprlem2, sprhfm3));
        }
        if (!(sprqmh3 instanceof sprdlh)) throw new IllegalStateException(sprfjs.cfr_renamed_9(")h7h3q2&7c%&(\u007f,c"));
        byArray = sprqmh2.cfr_renamed_7976();
        sprgxh2 = sprgxh3;
        spreuh2 = sprgxh2.cfr_renamed_2002(byArray).cfr_renamed_1775();
        return new sprnzk(spreuh2, (sprqxk)new sprxrk(sprlem2, sprhfm3));
    }
}

