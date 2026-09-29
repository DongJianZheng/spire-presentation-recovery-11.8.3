/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraaea;
import com.spire.presentation.packages.sprctg;
import com.spire.presentation.packages.sprdlh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfnh;
import com.spire.presentation.packages.sprfuy;
import com.spire.presentation.packages.sprgfh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprhr;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlfm;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprqmh;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprxrk;
import com.spire.presentation.packages.sprxwj;
import com.spire.presentation.packages.sprynm;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.spryzg;

public class sprgck
extends sprxwj {
    public sprgck(sprctg arg0) {
        super(arg0);
    }

    public static sprctg cfr_renamed_9614(sprnzk arg0) {
        sprlem sprlem2 = ((sprxrk)arg0.cfr_renamed_284()).cfr_renamed_313();
        spreuh spreuh2 = arg0.cfr_renamed_1604();
        if (sprlem2.cfr_renamed_5078(sprhr.cfr_renamed_1)) {
            return new sprctg(0, sprgfh.cfr_renamed_8405(sprfnh.cfr_renamed_7843().cfr_renamed_8401(spreuh2.cfr_renamed_1969().cfr_renamed_1779()).cfr_renamed_8402(spreuh2.cfr_renamed_1973().cfr_renamed_1779()).cfr_renamed_8403()));
        }
        if (sprlem2.cfr_renamed_5078(spris.cfr_renamed_96)) {
            return new sprctg(1, sprgfh.cfr_renamed_8405(sprfnh.cfr_renamed_7843().cfr_renamed_8401(spreuh2.cfr_renamed_1969().cfr_renamed_1779()).cfr_renamed_8402(spreuh2.cfr_renamed_1973().cfr_renamed_1779()).cfr_renamed_8403()));
        }
        if (sprlem2.cfr_renamed_5078(spris.cfr_renamed_93)) {
            return new sprctg(2, sprdlh.cfr_renamed_8394(spryzg.cfr_renamed_7843().cfr_renamed_8401(spreuh2.cfr_renamed_1969().cfr_renamed_1779()).cfr_renamed_8402(spreuh2.cfr_renamed_1973().cfr_renamed_1779()).cfr_renamed_9531()));
        }
        throw new IllegalArgumentException(spraaea.cfr_renamed_9("3\u0007-\u0007)\u001e(I%\u001c4\u001f#I/\u0007f\u00193\u000b*\u0000%I#\u0007%\u001b?\u00192\u0000)\u0007f\u0002#\u0010"));
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
        switch (this.cfr_renamed_4.cfr_renamed_8227()) {
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
            case 2: {
                sprlem2 = spris.cfr_renamed_93;
                sprhfm2 = sprhfm3 = sprlfm.cfr_renamed_7994(spris.cfr_renamed_93);
                break;
            }
            default: {
                throw new IllegalStateException(sprfuy.cfr_renamed_9(".'0'4>5i0,\"i/0+,"));
            }
        }
        sprgxh sprgxh3 = sprhfm2.cfr_renamed_1769();
        if (!(this.cfr_renamed_4.cfr_renamed_8367() instanceof sprqmh)) throw new IllegalStateException(spraaea.cfr_renamed_9("#\u00112\f(\u001a/\u0006(I2\u0006f\u00193\u000b*\u0000%I0\f4\u0000 \u0000%\b2\u0000)\u0007f\u0002#\u0010f\u0007)\u001df\u001a3\u00196\u00064\u001d#\r"));
        sprqmh sprqmh2 = (sprqmh)this.cfr_renamed_4.cfr_renamed_8367();
        sprqmh sprqmh3 = sprqmh2;
        if (sprqmh2 instanceof sprgfh) {
            byArray = sprqmh3.cfr_renamed_7976();
            sprgxh2 = sprgxh3;
            spreuh2 = sprgxh2.cfr_renamed_2002(byArray).cfr_renamed_1775();
            return new sprnzk(spreuh2, (sprqxk)new sprxrk(sprlem2, sprhfm3));
        }
        if (!(sprqmh3 instanceof sprdlh)) throw new IllegalStateException(sprfuy.cfr_renamed_9(".'0'4>5i0,\"i/0+,"));
        byArray = sprqmh2.cfr_renamed_7976();
        sprgxh2 = sprgxh3;
        spreuh2 = sprgxh2.cfr_renamed_2002(byArray).cfr_renamed_1775();
        return new sprnzk(spreuh2, (sprqxk)new sprxrk(sprlem2, sprhfm3));
    }

    public sprgck(spryye arg0) {
        super(sprgck.cfr_renamed_9614((sprnzk)arg0));
    }
}

