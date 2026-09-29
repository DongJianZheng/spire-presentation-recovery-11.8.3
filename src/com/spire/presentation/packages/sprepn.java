/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahn;
import com.spire.presentation.packages.sprann;
import com.spire.presentation.packages.sprdmn;
import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprgqn;
import com.spire.presentation.packages.sprgs;
import com.spire.presentation.packages.sprisp;
import com.spire.presentation.packages.sprkup;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprpin;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprqon;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwln;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxnn;
import com.spire.presentation.packages.sprzlp;
import com.spire.presentation.packages.sprzmn;

@sprtea
public class sprepn
extends sprsmn {
    private sprwvn cfr_renamed_119;
    private sprisp cfr_renamed_91;
    private int cfr_renamed_0;
    private sprahn cfr_renamed_1;
    private sprkup cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprgeja cfr_renamed_4 = sprgeja.cfr_renamed_4;

    @Override
    public void cfr_renamed_13115(sprwln arg0) {
        this.cfr_renamed_13771(arg0.cfr_renamed_13110());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13108(sprthn sprthn2) {
        void arg0;
        sprepn sprepn2 = this;
        sprepn2.cfr_renamed_13772((sprgs)arg0);
        sprepn2.cfr_renamed_13773(sprthn2.cfr_renamed_8505());
        sprepn2.cfr_renamed_12514();
    }

    private /* synthetic */ void cfr_renamed_13765() {
        if (this.cfr_renamed_0 > 0) {
            sprepn sprepn2 = this;
            sprepn2.cfr_renamed_119.remove(sprepn2.cfr_renamed_0 - 1);
        }
    }

    private /* synthetic */ sprgeja cfr_renamed_13774(sprgeja arg0, int arg1) {
        sprgeja sprgeja2 = this.cfr_renamed_91.cfr_renamed_576(arg1);
        if (!sprgeja.cfr_renamed_13775(sprgeja2, sprgeja.cfr_renamed_4)) {
            arg0 = sprgeja.cfr_renamed_13776(arg0, sprgeja2);
        }
        sprqgp sprqgp2 = (sprqgp)this.cfr_renamed_119.get(arg1);
        arg0 = sprzlp.cfr_renamed_13777(arg0, sprqgp2);
        return arg0;
    }

    @Override
    public void cfr_renamed_13107(sprxln sprxln2) {
        sprepn sprepn2 = this;
        this.cfr_renamed_2.cfr_renamed_12148(sprepn2.cfr_renamed_2.cfr_renamed_11861() - 1);
        sprepn2.cfr_renamed_12514();
    }

    private /* synthetic */ void cfr_renamed_12513() {
        if (this.cfr_renamed_0 > 0) {
            sprepn sprepn2 = this;
            sprepn2.cfr_renamed_91.cfr_renamed_12148(sprepn2.cfr_renamed_0 - 1);
        }
    }

    @Override
    public void cfr_renamed_13553(sprzmn arg0) {
        this.cfr_renamed_13773(arg0.cfr_renamed_13550());
    }

    @Override
    public void cfr_renamed_13186(sprfqn arg0) {
        this.cfr_renamed_13773(sprzlp.cfr_renamed_13778(arg0.cfr_renamed_13187()));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_13772(sprgs sprgs2) {
        void arg0;
        sprepn sprepn2 = this;
        sprepn2.cfr_renamed_13779((sprgs)arg0);
        sprepn2.cfr_renamed_13780(sprgs2);
        ++sprepn2.cfr_renamed_0;
    }

    @Override
    public void cfr_renamed_13549(sprdmn arg0) {
        this.cfr_renamed_13773(arg0.cfr_renamed_13550());
    }

    private /* synthetic */ void cfr_renamed_13781(sprgeja arg0) {
        int n;
        int n2 = n = this.cfr_renamed_0 - 1;
        while (n2 >= 0) {
            arg0 = this.cfr_renamed_13774(arg0, n--);
            n2 = n;
        }
        if (this.cfr_renamed_3) {
            if (sprgeja.cfr_renamed_13775(this.cfr_renamed_4, sprgeja.cfr_renamed_4)) {
                this.cfr_renamed_4 = arg0;
                return;
            }
            if (!sprgeja.cfr_renamed_13775(arg0, sprgeja.cfr_renamed_4)) {
                this.cfr_renamed_4 = sprgeja.cfr_renamed_13782(this.cfr_renamed_4, arg0);
                return;
            }
        } else {
            this.cfr_renamed_4 = arg0;
            this.cfr_renamed_3 = true;
        }
    }

    public sprgeja cfr_renamed_13783(sprvjn[] arg0) {
        int n;
        sprgeja sprgeja2 = sprgeja.cfr_renamed_4;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            if (n == 0) {
                sprgeja2 = this.cfr_renamed_13544(arg0[n]);
            }
            sprvjn sprvjn2 = arg0[n];
            sprgeja2 = sprgeja.cfr_renamed_13782(sprgeja2, this.cfr_renamed_13544(sprvjn2));
            n2 = ++n;
        }
        return sprgeja2;
    }

    @Override
    public void cfr_renamed_13098(sprxln arg0) {
        sprxln sprxln2 = arg0;
        this.cfr_renamed_13772(sprxln2);
        if (sprxln2.cfr_renamed_12571() != null) {
            this.cfr_renamed_2.cfr_renamed_13784(arg0.cfr_renamed_12571().cfr_renamed_1942() / 2.0f);
            return;
        }
        this.cfr_renamed_2.cfr_renamed_13784(0.0f);
    }

    private /* synthetic */ void cfr_renamed_12514() {
        sprepn sprepn2 = this;
        sprepn2.cfr_renamed_12513();
        sprepn2.cfr_renamed_13765();
        --sprepn2.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprgeja cfr_renamed_13544(sprvjn sprvjn2) {
        void arg0;
        sprepn sprepn2 = this;
        sprepn2.cfr_renamed_4 = sprgeja.cfr_renamed_4;
        sprepn2.cfr_renamed_3 = false;
        if (sprvjn2 == null) {
            return sprgeja.cfr_renamed_4;
        }
        arg0.cfr_renamed_13121(this);
        return this.cfr_renamed_4;
    }

    public sprepn() {
        sprepn sprepn2 = this;
        sprepn2.cfr_renamed_2 = new sprkup();
        this.cfr_renamed_119 = new sprwvn();
        this.cfr_renamed_91 = new sprisp();
    }

    public sprgeja cfr_renamed_13687(sprgeja arg0, float arg1) {
        float f = arg1;
        arg0 = sprgeja.cfr_renamed_13688(arg0, f, f);
        return arg0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_13771(sprsuja sprsuja2) {
        void arg0;
        this.cfr_renamed_13773(new sprgeja((sprsuja)arg0, sprphja.cfr_renamed_4));
    }

    private /* synthetic */ sprahn cfr_renamed_13785() {
        if (this.cfr_renamed_1 == null) {
            sprepn sprepn2 = this;
            sprepn2.cfr_renamed_1 = new sprahn();
        }
        return this.cfr_renamed_1;
    }

    private /* synthetic */ void cfr_renamed_13779(sprgs arg0) {
        sprepn sprepn2 = new sprepn();
        sprgeja sprgeja2 = arg0.cfr_renamed_12590() == null ? sprgeja.cfr_renamed_4 : sprepn2.cfr_renamed_13544(arg0.cfr_renamed_12590());
        this.cfr_renamed_91.cfr_renamed_13786(sprgeja2);
    }

    private /* synthetic */ void cfr_renamed_13780(sprgs arg0) {
        sprqgp sprqgp2 = arg0.cfr_renamed_13094();
        if (sprqgp2 == null) {
            sprqgp2 = new sprqgp();
        }
        sprovja.cfr_renamed_11658(this.cfr_renamed_119, sprqgp2);
    }

    @Override
    public void cfr_renamed_13559(sprpin arg0) {
        this.cfr_renamed_13773(arg0.cfr_renamed_13550());
    }

    @Override
    public void cfr_renamed_13560(sprann arg0) {
        this.cfr_renamed_13773(arg0.cfr_renamed_13550());
    }

    @Override
    public void cfr_renamed_13101(sprmrn arg0) {
        this.cfr_renamed_12514();
    }

    @Override
    public void cfr_renamed_13122(sprson arg0) {
        this.cfr_renamed_13773(arg0.cfr_renamed_8505());
    }

    @Override
    public boolean cfr_renamed_13568(sprqon arg0) {
        return true;
    }

    private /* synthetic */ void cfr_renamed_13773(sprgeja arg0) {
        if (this.cfr_renamed_2.cfr_renamed_11861() > 0) {
            sprepn sprepn2 = this;
            arg0 = sprepn2.cfr_renamed_13687(arg0, this.cfr_renamed_2.cfr_renamed_576(sprepn2.cfr_renamed_2.cfr_renamed_11861() - 1));
        }
        this.cfr_renamed_13781(arg0);
    }

    @Override
    public void cfr_renamed_13175(sprxnn arg0) {
        sprepn sprepn2 = this;
        sprepn2.cfr_renamed_13773(sprepn2.cfr_renamed_13785().cfr_renamed_13787(arg0));
    }

    @Override
    public void cfr_renamed_13117(sprgqn arg0) {
        this.cfr_renamed_13771(arg0.cfr_renamed_13110());
    }

    @Override
    public void cfr_renamed_13092(sprmrn arg0) {
        this.cfr_renamed_13772(arg0);
    }
}

