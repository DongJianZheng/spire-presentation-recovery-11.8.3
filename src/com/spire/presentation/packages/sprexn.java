/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraco;
import com.spire.presentation.packages.sprbvn;
import com.spire.presentation.packages.sprdun;
import com.spire.presentation.packages.sprfmp;
import com.spire.presentation.packages.sprfwn;
import com.spire.presentation.packages.sprgdp;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprghp;
import com.spire.presentation.packages.sprgvn;
import com.spire.presentation.packages.sprhbo;
import com.spire.presentation.packages.sprhlp;
import com.spire.presentation.packages.spriwn;
import com.spire.presentation.packages.sprkjo;
import com.spire.presentation.packages.sprlfja;
import com.spire.presentation.packages.sprlrn;
import com.spire.presentation.packages.sprpip;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprqsn;
import com.spire.presentation.packages.sprrjo;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvun;
import com.spire.presentation.packages.sprvyo;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxvo;
import com.spire.presentation.packages.sprxwn;
import com.spire.presentation.packages.spryyn;

@sprtea
public class sprexn {
    private spryyn cfr_renamed_3;
    private sprgeja cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_15056(sprpln arg0) throws Exception {
        if (sprexn.cfr_renamed_14464(arg0)) {
            return;
        }
        this.cfr_renamed_3.cfr_renamed_15198().cfr_renamed_15179(true);
        this.cfr_renamed_15058(arg0, false);
    }

    private /* synthetic */ void cfr_renamed_15272(sprwbp arg0, boolean arg1) {
        if (arg1) {
            this.cfr_renamed_3.cfr_renamed_15198().cfr_renamed_15273(spraco.cfr_renamed_15142(arg0));
            return;
        }
        this.cfr_renamed_3.cfr_renamed_15198().cfr_renamed_15180(spraco.cfr_renamed_15142(arg0));
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_14360(sprwbp sprwbp2, boolean bl) throws Exception {
        void arg1;
        void arg0;
        this.cfr_renamed_15058(new sprghp((sprwbp)arg0), (boolean)arg1);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_15274(sprpln arg0, boolean arg1) throws Exception {
        switch (arg0.cfr_renamed_13338()) {
            case 0: {
                this.cfr_renamed_15272(((sprghp)arg0).cfr_renamed_12553(), arg1);
                return;
            }
            case 2: {
                this.cfr_renamed_15275((sprpip)arg0, arg1);
                return;
            }
            case 1: {
                this.cfr_renamed_15276((sprhlp)arg0, arg1);
                return;
            }
            case 3: {
                this.cfr_renamed_15277((sprgdp)arg0, arg1);
                return;
            }
            case 4: {
                this.cfr_renamed_15278((sprlrn)arg0, arg1);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprexn(spryyn spryyn2, sprgeja sprgeja2) {
        void arg0;
        sprexn sprexn2 = this;
        sprexn2.cfr_renamed_3 = arg0;
        sprexn2.cfr_renamed_4 = sprgeja2;
    }

    private /* synthetic */ void cfr_renamed_15277(sprgdp arg0, boolean arg1) {
        Object object;
        sprgvn sprgvn2 = new sprgvn();
        sprgdp sprgdp2 = arg0;
        sprsuja sprsuja2 = sprgdp2.cfr_renamed_13167();
        sprsuja sprsuja3 = sprgdp2.cfr_renamed_13171();
        if (sprgdp2.cfr_renamed_12672() != null) {
            sprgdp sprgdp3 = arg0;
            sprsuja2 = sprgdp3.cfr_renamed_12672().cfr_renamed_13791(sprsuja2);
            sprsuja3 = sprgdp3.cfr_renamed_12672().cfr_renamed_13791(sprsuja3);
        }
        sprsuja2 = new sprsuja(sprsuja2.cfr_renamed_1980() - this.cfr_renamed_4.cfr_renamed_1980(), this.cfr_renamed_3.cfr_renamed_15212() - sprsuja2.spr\u3181() - this.cfr_renamed_4.spr\u3181());
        sprsuja3 = new sprsuja(sprsuja3.cfr_renamed_1980() - this.cfr_renamed_4.cfr_renamed_1980(), this.cfr_renamed_3.cfr_renamed_15212() - sprsuja3.spr\u3181() - this.cfr_renamed_4.spr\u3181());
        sprgvn2.cfr_renamed_15279(new sprkjo(this.cfr_renamed_3.cfr_renamed_15161().cfr_renamed_15162()));
        sprgvn2.cfr_renamed_15280(spraco.cfr_renamed_15141(sprsuja2));
        sprgvn2.cfr_renamed_15281(spraco.cfr_renamed_15141(sprsuja3));
        if (null != arg0.cfr_renamed_12779()) {
            int n;
            object = arg0.cfr_renamed_12779();
            int n2 = ((sprfmp[])object).length;
            int n3 = n = 0;
            while (n3 < n2) {
                Object object2 = object[n];
                sprxwn sprxwn2 = new sprxwn(Double.valueOf(((sprfmp)object2).cfr_renamed_3274()), spraco.cfr_renamed_15142(((sprfmp)object2).cfr_renamed_12553()));
                sprgvn2.cfr_renamed_15282(sprxwn2);
                n3 = ++n;
            }
        }
        object = new sprqsn();
        ((sprqsn)object).cfr_renamed_15283(sprgvn2);
        if (arg1) {
            this.cfr_renamed_3.cfr_renamed_15198().cfr_renamed_15273((sprqsn)object);
            return;
        }
        this.cfr_renamed_3.cfr_renamed_15198().cfr_renamed_15180((sprqsn)object);
    }

    private /* synthetic */ void cfr_renamed_15284(boolean arg0) {
    }

    private /* synthetic */ void cfr_renamed_15276(sprhlp arg0, boolean arg1) {
        byte[] byArray = sprxvo.cfr_renamed_13333(arg0);
    }

    private /* synthetic */ void cfr_renamed_15058(sprpln arg0, boolean arg1) throws Exception {
        this.cfr_renamed_15274(arg0, arg1);
    }

    private static /* synthetic */ boolean cfr_renamed_14466(sprtbp arg0) {
        return arg0 == null || sprexn.cfr_renamed_14464(arg0.cfr_renamed_12551());
    }

    private /* synthetic */ sprson cfr_renamed_15285(byte[] arg0) {
        sprvyo sprvyo2 = new sprvyo(arg0);
        sprson sprson2 = new sprson(sprsuja.cfr_renamed_13377(), sprlfja.cfr_renamed_15060(new sprlfja(sprvyo2.cfr_renamed_1942(), sprvyo2.cfr_renamed_1452())), arg0);
        sprvyo2.cfr_renamed_11665();
        return sprson2;
    }

    private /* synthetic */ void cfr_renamed_15278(sprlrn arg0, boolean arg1) {
        Object object;
        spriwn spriwn2 = new spriwn();
        spriwn2.cfr_renamed_15279(new sprkjo(this.cfr_renamed_3.cfr_renamed_15161().cfr_renamed_15162()));
        spriwn2.cfr_renamed_15280(spraco.cfr_renamed_15141(arg0.cfr_renamed_13552()));
        if (null != arg0.cfr_renamed_13868()) {
            int n;
            object = arg0.cfr_renamed_13868();
            int n2 = ((sprwbp[])object).length;
            int n3 = n = 0;
            while (n3 < n2) {
                Object object2 = object[n];
                sprxwn sprxwn2 = new sprxwn(spraco.cfr_renamed_15142((sprwbp)object2));
                spriwn2.cfr_renamed_15282(sprxwn2);
                n3 = ++n;
            }
        }
        object = new sprqsn();
        ((sprqsn)object).cfr_renamed_15283(spriwn2);
        if (arg1) {
            this.cfr_renamed_3.cfr_renamed_15198().cfr_renamed_15273((sprqsn)object);
            return;
        }
        this.cfr_renamed_3.cfr_renamed_15198().cfr_renamed_15180((sprqsn)object);
    }

    private static /* synthetic */ boolean cfr_renamed_14464(sprpln arg0) {
        return arg0 == null || arg0.cfr_renamed_29();
    }

    private /* synthetic */ void cfr_renamed_15059(sprtbp arg0) {
        sprtbp sprtbp2 = arg0;
        this.cfr_renamed_3.cfr_renamed_15198().cfr_renamed_15286(Double.valueOf(spraco.cfr_renamed_15139(arg0.cfr_renamed_1942())));
        this.cfr_renamed_3.cfr_renamed_15198().cfr_renamed_15287(spraco.cfr_renamed_13150(sprtbp2.cfr_renamed_13151()));
        this.cfr_renamed_3.cfr_renamed_15198().cfr_renamed_15288(spraco.cfr_renamed_13148(arg0.cfr_renamed_12576()));
        if (sprtbp2.cfr_renamed_12576() == 0 || arg0.cfr_renamed_12576() == 3) {
            this.cfr_renamed_3.cfr_renamed_15198().cfr_renamed_15289(Double.valueOf(spraco.cfr_renamed_15139(arg0.cfr_renamed_13149())));
        }
        if (arg0.cfr_renamed_13153() != 0) {
            this.cfr_renamed_3.cfr_renamed_15198().cfr_renamed_15290(Double.valueOf(spraco.cfr_renamed_15139(arg0.cfr_renamed_13154())));
            this.cfr_renamed_3.cfr_renamed_15198().cfr_renamed_15291(spraco.cfr_renamed_15140(arg0.cfr_renamed_13157(), arg0.cfr_renamed_1942()));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_15275(sprpip sprpip2, boolean bl) throws Exception {
        void arg0;
        sprqgp sprqgp2;
        sprson sprson2 = this.cfr_renamed_15285(sprpip2.cfr_renamed_12510());
        sprexn sprexn2 = this;
        sprrjo sprrjo2 = new sprbvn().cfr_renamed_15268(sprexn2.cfr_renamed_3, sprson2);
        sprdun sprdun2 = new sprdun();
        sprdun2.cfr_renamed_15197(sprrjo2);
        (sprexn2.cfr_renamed_3.cfr_renamed_13093() ? (sprqgp2 = new sprqgp(1.0f, 0.0f, 0.0f, -1.0f, -this.cfr_renamed_4.cfr_renamed_1980(), this.cfr_renamed_3.cfr_renamed_15212() - this.cfr_renamed_4.spr\u3181())) : (sprqgp2 = new sprqgp(1.0f, 0.0f, 0.0f, 1.0f, this.cfr_renamed_4.cfr_renamed_1980(), this.cfr_renamed_4.spr\u3181()))).cfr_renamed_12593(arg0.cfr_renamed_12672());
        sprvun sprvun2 = new sprvun().cfr_renamed_15292(sprdun2).cfr_renamed_15171(spraco.cfr_renamed_15148(sprqgp2)).cfr_renamed_15293(Double.valueOf(spraco.cfr_renamed_15139(sprson2.cfr_renamed_2773().cfr_renamed_1452()))).cfr_renamed_15294(Double.valueOf(spraco.cfr_renamed_15139(sprson2.cfr_renamed_2773().cfr_renamed_1942()))).cfr_renamed_15295(sprfwn.cfr_renamed_2);
        sprqsn sprqsn2 = new sprqsn().cfr_renamed_15296(sprvun2);
        this.cfr_renamed_3.cfr_renamed_15198().cfr_renamed_15180(sprqsn2);
    }

    private /* synthetic */ void cfr_renamed_15057(sprtbp arg0) throws Exception {
        if (sprexn.cfr_renamed_14466(arg0)) {
            this.cfr_renamed_3.cfr_renamed_15198().cfr_renamed_15215(false);
            return;
        }
        sprexn sprexn2 = this;
        sprtbp sprtbp2 = arg0;
        sprexn2.cfr_renamed_15059(sprtbp2);
        sprexn2.cfr_renamed_15058(sprtbp2.cfr_renamed_12551(), true);
    }

    @sprtea
    public void cfr_renamed_15021(sprxln arg0) throws Exception {
        if (arg0.cfr_renamed_12609() == 0) {
            this.cfr_renamed_3.cfr_renamed_15198().cfr_renamed_15297(sprhbo.cfr_renamed_1);
        }
        sprexn sprexn2 = this;
        sprxln sprxln2 = arg0;
        sprexn2.cfr_renamed_15056(sprxln2.cfr_renamed_12551());
        sprexn2.cfr_renamed_15057(sprxln2.cfr_renamed_12571());
    }
}

