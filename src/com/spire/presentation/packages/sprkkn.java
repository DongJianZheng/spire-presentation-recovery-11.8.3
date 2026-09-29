/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxo;
import com.spire.presentation.packages.sprcno;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.spriy;
import com.spire.presentation.packages.sprkmn;
import com.spire.presentation.packages.sprlmo;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtqo;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwrn;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprzeo;
import com.spire.presentation.packages.sprzon;

@sprtea
public class sprkkn {
    private sprcno cfr_renamed_0;
    private boolean cfr_renamed_1;
    private float cfr_renamed_2;
    private spraxo cfr_renamed_3;
    private static final float cfr_renamed_4 = 1296.0f;

    public spriy cfr_renamed_13400() {
        return this.cfr_renamed_0.cfr_renamed_13400();
    }

    public sprkkn(sprcno arg0) {
        this(arg0, false, 0.0f);
    }

    public sprmrn cfr_renamed_13701(sprson arg0, sprlmo arg1) {
        Object object;
        Object object2;
        Object object3;
        int n = 1000;
        if (!this.cfr_renamed_3.cfr_renamed_13889(arg0.cfr_renamed_12510(), null)) {
            object3 = arg0.cfr_renamed_12510();
            object2 = new sprphja(n, n);
            object = sprzeo.cfr_renamed_13890((byte[])object3, arg1);
            sprmrn sprmrn2 = ((sprzeo)object).cfr_renamed_13891((sprphja)object2, this.cfr_renamed_0);
            sprkkn sprkkn2 = this;
            sprkkn2.cfr_renamed_13892(sprmrn2);
            sprkkn2.cfr_renamed_3.cfr_renamed_13502(arg0.cfr_renamed_12510(), null, sprmrn2);
        }
        sprmrn sprmrn3 = (sprmrn)this.cfr_renamed_3.cfr_renamed_13501(arg0.cfr_renamed_12510(), null);
        object3 = sprmrn3;
        if (sprmrn3 == null) {
            return null;
        }
        object3 = (sprmrn)((sprmrn)object3).cfr_renamed_13616();
        object2 = new sprmrn();
        ((sprkmn)object2).cfr_renamed_12507((sprvjn)object3);
        object = new sprgeja(0.0f, 0.0f, n, n);
        if (!sprtqo.cfr_renamed_13345(arg0.cfr_renamed_13240())) {
            object = arg0.cfr_renamed_13240().cfr_renamed_13893((sprgeja)object);
        }
        Object object4 = object2;
        ((sprmrn)object4).cfr_renamed_12545(sprxln.cfr_renamed_13253((sprgeja)object));
        ((sprmrn)object4).cfr_renamed_12511(new sprqgp());
        ((sprmrn)object2).cfr_renamed_13094().cfr_renamed_13466(arg0.cfr_renamed_13110().cfr_renamed_1980(), arg0.cfr_renamed_13110().spr\u3181(), 0);
        ((sprmrn)object4).cfr_renamed_13094().cfr_renamed_13255(arg0.cfr_renamed_2773().cfr_renamed_1942() / ((sprgeja)object).cfr_renamed_1942(), arg0.cfr_renamed_2773().cfr_renamed_1452() / ((sprgeja)object).cfr_renamed_1452(), 0);
        ((sprmrn)object4).cfr_renamed_13094().cfr_renamed_13466(-((sprgeja)object).cfr_renamed_1980(), -((sprgeja)object).spr\u3181(), 0);
        return object4;
    }

    private /* synthetic */ float cfr_renamed_13894(sprmrn arg0) {
        sprwrn sprwrn2;
        sprwrn sprwrn3 = sprwrn2 = new sprwrn();
        sprwrn3.cfr_renamed_13544(arg0);
        float f = 1.0f;
        if (sprwrn3.cfr_renamed_13555() >= this.cfr_renamed_2) {
            f = (this.cfr_renamed_2 - 1.0f) / sprwrn2.cfr_renamed_13555();
        }
        float f2 = 1.0f;
        if (sprwrn2.cfr_renamed_13561() >= 1296.0f) {
            f2 = 1296.0f / sprwrn2.cfr_renamed_13561();
        }
        return sprrgga.cfr_renamed_13820(f, f2);
    }

    /*
     * WARNING - void declaration
     */
    public sprkkn(sprcno sprcno2, boolean bl, float f) {
        void arg1;
        void arg0;
        sprkkn sprkkn2 = this;
        sprkkn sprkkn3 = this;
        this.cfr_renamed_3 = new spraxo();
        this.cfr_renamed_0 = arg0;
        sprkkn2.cfr_renamed_1 = arg1;
        sprkkn2.cfr_renamed_2 = f;
    }

    private /* synthetic */ void cfr_renamed_13892(sprmrn arg0) {
        float f;
        if (!this.cfr_renamed_1) {
            return;
        }
        if (arg0 == null) {
            return;
        }
        float f2 = this.cfr_renamed_13894(arg0);
        if (f >= 1.0f) {
            return;
        }
        sprzon sprzon2 = new sprzon();
        sprmrn sprmrn2 = arg0;
        sprzon2.cfr_renamed_13574(true);
        sprzon2.cfr_renamed_13507(sprmrn2, f2);
        if (sprmrn2.cfr_renamed_13094() == null) {
            arg0.cfr_renamed_12511(new sprqgp());
        }
        arg0.cfr_renamed_13094().cfr_renamed_13255(1.0f / f2, 1.0f / f2, 0);
    }
}

