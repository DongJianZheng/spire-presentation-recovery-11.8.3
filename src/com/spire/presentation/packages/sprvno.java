/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcep;
import com.spire.presentation.packages.sprcno;
import com.spire.presentation.packages.sprczo;
import com.spire.presentation.packages.sprepn;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprjeka;
import com.spire.presentation.packages.sprkkn;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprnmp;
import com.spire.presentation.packages.sprpip;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprxln;

@sprtea
public class sprvno
extends sprsmn {
    private sprjeka cfr_renamed_0;
    private sprepn cfr_renamed_1;
    private sprjeka cfr_renamed_2;
    private static final int cfr_renamed_3 = 0x800000;
    private sprkkn cfr_renamed_4;

    @Override
    public void cfr_renamed_13092(sprmrn arg0) {
        this.cfr_renamed_13762(arg0);
    }

    private /* synthetic */ sprmrn cfr_renamed_13668() {
        return (sprmrn)this.cfr_renamed_2.cfr_renamed_12398();
    }

    private /* synthetic */ void cfr_renamed_13763(sprqgp arg0) {
        sprqgp sprqgp2 = this.cfr_renamed_13761().cfr_renamed_12099();
        if (arg0 != null) {
            sprqgp2.cfr_renamed_12634(arg0, 0);
        }
        this.cfr_renamed_0.cfr_renamed_12516(sprqgp2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13108(sprthn sprthn2) {
        boolean bl;
        sprthn sprthn3;
        float f;
        void arg0;
        sprvno sprvno2 = this;
        sprvno2.cfr_renamed_13763(arg0.cfr_renamed_13094());
        sprvno2.cfr_renamed_13761().cfr_renamed_12629(arg0.cfr_renamed_13110().cfr_renamed_1980(), arg0.cfr_renamed_13110().spr\u3181());
        float f2 = f = 1.3333334f;
        sprvno2.cfr_renamed_13761().cfr_renamed_13255(f2, f2, 1);
        sprthn sprthn4 = sprthn3 = (sprthn)sprthn2.cfr_renamed_13616();
        sprthn4.cfr_renamed_12511(this.cfr_renamed_13761());
        sprthn4.cfr_renamed_13109(sprsuja.cfr_renamed_13377());
        sprthn4.cfr_renamed_13257().cfr_renamed_13572(1.0f / f);
        if (sprcep.cfr_renamed_9("wnxfv}}").equals(arg0.cfr_renamed_13257().cfr_renamed_13460().toLowerCase())) {
            sprthn3.cfr_renamed_13257().cfr_renamed_13572(0.8f);
        }
        boolean bl2 = bl = arg0.cfr_renamed_12590() != null;
        if (bl) {
            sprmrn sprmrn2;
            sprmrn sprmrn3 = sprmrn2 = new sprmrn();
            sprmrn3.cfr_renamed_12545(sprthn3.cfr_renamed_12590());
            this.cfr_renamed_13762(sprmrn3);
            sprthn3.cfr_renamed_12545(null);
        }
        this.cfr_renamed_13668().cfr_renamed_12507(sprthn3);
        if (bl) {
            this.cfr_renamed_13674();
        }
        this.cfr_renamed_13765();
    }

    @Override
    public void cfr_renamed_13122(sprson arg0) {
        sprvno sprvno2 = this;
        if (arg0.cfr_renamed_13123(sprvno2, sprvno2.cfr_renamed_4) == null) {
            return;
        }
        sprson sprson2 = arg0;
        sprxln sprxln2 = sprxln.cfr_renamed_13253(sprson2.cfr_renamed_8505());
        sprxln2.cfr_renamed_12624(this.cfr_renamed_13761());
        sprpip sprpip2 = new sprpip(arg0.cfr_renamed_12510(), 4);
        sprxln2.cfr_renamed_12550(sprpip2);
        sprczo sprczo2 = sprsto.cfr_renamed_13321(sprson2.cfr_renamed_12510());
        float f = (float)sprnmp.cfr_renamed_16525(sprczo2.cfr_renamed_1942(), 96.0);
        float f2 = (float)sprnmp.cfr_renamed_16525(sprczo2.cfr_renamed_1452(), 96.0);
        sprqgp sprqgp2 = sprqgp.cfr_renamed_16234(new sprgeja(0.0f, 0.0f, f, f2), new sprgeja(0.0f, 0.0f, arg0.cfr_renamed_8505().cfr_renamed_1942(), arg0.cfr_renamed_8505().cfr_renamed_1452()));
        sprvno sprvno3 = this;
        sprqgp2.cfr_renamed_12634(sprvno3.cfr_renamed_13761(), 1);
        float f3 = 1.3333334f;
        sprpip2.cfr_renamed_12643(new sprqgp(sprqgp2.cfr_renamed_12595(), sprqgp2.cfr_renamed_12596(), sprqgp2.cfr_renamed_12597(), sprqgp2.cfr_renamed_12598(), sprqgp2.cfr_renamed_12599() * f3, sprqgp2.cfr_renamed_12600() * f3));
        sprvno3.cfr_renamed_13668().cfr_renamed_12507(sprxln2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13098(sprxln sprxln2) {
        sprxln sprxln3;
        void arg0;
        sprvno sprvno2 = this;
        sprvno2.cfr_renamed_13763(arg0.cfr_renamed_13094());
        sprxln sprxln4 = sprxln3 = sprxln2.cfr_renamed_13655(true);
        sprxln sprxln5 = sprxln3;
        sprxln5.cfr_renamed_12511(null);
        sprxln4.cfr_renamed_12545(this.cfr_renamed_13760(sprxln5.cfr_renamed_12590()));
        sprxln4.cfr_renamed_12624(this.cfr_renamed_13761());
        sprvno2.cfr_renamed_13668().cfr_renamed_12507(sprxln3);
    }

    private /* synthetic */ sprxln cfr_renamed_13760(sprxln arg0) {
        sprgeja sprgeja2;
        if (arg0 == null) {
            return null;
        }
        sprxln sprxln2 = arg0.cfr_renamed_13655(true);
        sprvno sprvno2 = this;
        sprxln2.cfr_renamed_12624(sprvno2.cfr_renamed_13761());
        sprgeja sprgeja3 = sprvno2.cfr_renamed_1.cfr_renamed_13544(sprxln2);
        if (sprgeja2.cfr_renamed_1942() * sprgeja3.cfr_renamed_1452() * 4.0f > 8388608.0f) {
            return null;
        }
        return sprxln2;
    }

    private /* synthetic */ sprvno(sprcno sprcno2) {
        sprvno sprvno2 = this;
        sprvno sprvno3 = this;
        this.cfr_renamed_2 = new sprjeka();
        sprvno3.cfr_renamed_0 = new sprjeka();
        this.cfr_renamed_1 = new sprepn();
        sprvno2.cfr_renamed_0.cfr_renamed_12516(new sprqgp());
        sprvno2.cfr_renamed_2.cfr_renamed_12516(new sprmrn());
        sprcno sprcno3 = sprcno2.cfr_renamed_12099();
        sprcno3.cfr_renamed_12727(1);
        sprvno2.cfr_renamed_4 = new sprkkn(sprcno3);
    }

    private /* synthetic */ sprqgp cfr_renamed_13761() {
        return (sprqgp)this.cfr_renamed_0.cfr_renamed_12398();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_13762(sprmrn sprmrn2) {
        void arg0;
        this.cfr_renamed_13763(sprmrn2.cfr_renamed_13094());
        sprmrn sprmrn3 = new sprmrn();
        sprvno sprvno2 = this;
        sprmrn3.cfr_renamed_12545(sprvno2.cfr_renamed_13760(arg0.cfr_renamed_12590()));
        sprvno2.cfr_renamed_13668().cfr_renamed_12507(sprmrn3);
        this.cfr_renamed_2.cfr_renamed_12516(sprmrn3);
    }

    @Override
    public void cfr_renamed_13107(sprxln arg0) {
        this.cfr_renamed_13765();
    }

    @Override
    public void cfr_renamed_13101(sprmrn arg0) {
        this.cfr_renamed_13674();
    }

    @sprtea
    public static sprvjn cfr_renamed_16993(sprvjn arg0, sprcno arg1) {
        sprvno sprvno2;
        sprvno sprvno3 = sprvno2 = new sprvno(arg1);
        arg0.cfr_renamed_13121(sprvno3);
        return sprvno3.cfr_renamed_13668();
    }

    private /* synthetic */ void cfr_renamed_13674() {
        this.cfr_renamed_2.cfr_renamed_12514();
        this.cfr_renamed_0.cfr_renamed_12514();
    }

    private /* synthetic */ void cfr_renamed_13765() {
        this.cfr_renamed_0.cfr_renamed_12514();
    }
}

