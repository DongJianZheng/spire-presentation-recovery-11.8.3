/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprczo;
import com.spire.presentation.packages.sprdfo;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprghp;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprioo;
import com.spire.presentation.packages.spriy;
import com.spire.presentation.packages.sprkho;
import com.spire.presentation.packages.sprktp;
import com.spire.presentation.packages.sprlfja;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprmko;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprndo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpeo;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprqoo;
import com.spire.presentation.packages.sprqso;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprvrb;
import com.spire.presentation.packages.sprvyo;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxsp;
import com.spire.presentation.packages.spryxp;
import com.spire.presentation.packages.sprzlp;
import com.spire.presentation.packages.sprznp;
import java.util.Iterator;

@sprtea
public class sprqmo
extends sprmko {
    @Override
    @sprtea
    public void cfr_renamed_16085(sprpeo arg0, sprtbp arg1, sprpln arg2) {
        int n;
        sprxln sprxln2 = new sprxln();
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_16223().cfr_renamed_11861()) {
            sprxln2.cfr_renamed_12507(sprlsn.cfr_renamed_13253(arg0.cfr_renamed_16223().cfr_renamed_576(n++)));
            n2 = n;
        }
        this.cfr_renamed_16391(sprxln2, arg1, arg2);
    }

    @Override
    @sprtea
    public void cfr_renamed_16097(sprgeja arg0, sprgeja arg1, byte[] arg2) {
        this.cfr_renamed_16116(arg0, arg1, new sprqgp(), arg2);
    }

    private static /* synthetic */ sprphja cfr_renamed_16392(sprktp arg0) {
        int n;
        float f = 0.0f;
        float f2 = 0.0f;
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_11861()) {
            sprsuja sprsuja2 = arg0.cfr_renamed_576(n);
            f += sprsuja2.cfr_renamed_1980();
            f2 += sprsuja2.spr\u3181();
            n2 = ++n;
        }
        return new sprphja(f, f2);
    }

    private /* synthetic */ sprphja cfr_renamed_16393(sprphja arg0) {
        return new sprphja(arg0.cfr_renamed_1942(), arg0.cfr_renamed_1452() + this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_13257().cfr_renamed_15164());
    }

    @Override
    @sprtea
    public void cfr_renamed_16111(sprsuja[] arg0) {
        if (arg0.length > 0) {
            if (this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16321()) {
                this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_13643(arg0);
                return;
            }
            sprxln sprxln2 = sprqoo.cfr_renamed_16389(arg0);
            this.cfr_renamed_16394(sprxln2, true, false);
        }
    }

    private /* synthetic */ sprlfja cfr_renamed_16395(sprgeja arg0) {
        sprlfja sprlfja2;
        int n = 1000;
        int n2 = 50;
        sprlfja sprlfja3 = sprlfja2 = sprlfja.cfr_renamed_16396(arg0.cfr_renamed_2773());
        while (sprlfja3.cfr_renamed_1942() > n || sprlfja2.cfr_renamed_1452() > n) {
            int n3 = sprlfja2.cfr_renamed_1942() > n2 ? sprlfja2.cfr_renamed_1942() / 2 : sprlfja2.cfr_renamed_1942();
            int n4 = sprlfja2.cfr_renamed_1452() > n2 ? sprlfja2.cfr_renamed_1452() / 2 : sprlfja2.cfr_renamed_1452();
            sprlfja3 = new sprlfja(n3, n4);
        }
        return sprlfja2;
    }

    private /* synthetic */ void cfr_renamed_16394(sprxln arg0, boolean arg1, boolean arg2) {
        this.cfr_renamed_16397(arg0, arg1, arg2, false);
    }

    @Override
    @sprtea
    public void cfr_renamed_16123(sprgeja arg0) {
        sprxln sprxln2 = sprxln.cfr_renamed_13253(arg0);
        this.cfr_renamed_16394(sprxln2, false, true);
    }

    @Override
    @sprtea
    public void cfr_renamed_16098(sprgeja arg0) {
        if (this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16321()) {
            sprsuja[] sprsujaArray = new sprsuja[4];
            sprsujaArray[0] = new sprsuja(arg0.cfr_renamed_13430(), arg0.cfr_renamed_13342());
            sprsujaArray[1] = new sprsuja(arg0.cfr_renamed_13341(), arg0.cfr_renamed_13342());
            sprsujaArray[2] = new sprsuja(arg0.cfr_renamed_13341(), arg0.cfr_renamed_13429());
            sprsujaArray[3] = new sprsuja(arg0.cfr_renamed_13430(), arg0.cfr_renamed_13429());
            this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16327(sprsujaArray);
            return;
        }
        sprxln sprxln2 = sprxln.cfr_renamed_13253(arg0);
        this.cfr_renamed_16394(sprxln2, true, true);
    }

    private /* synthetic */ sprhhp cfr_renamed_16398(sprhhp arg0, int arg1) {
        sprfzo sprfzo2 = this.cfr_renamed_2820().cfr_renamed_13400().cfr_renamed_16270(sprvrb.cfr_renamed_9("Pvnlvq"), arg0.cfr_renamed_13303());
        if (sprfzo2 == null || !sprfzo2.cfr_renamed_16399(arg1)) {
            sprfzo2 = this.cfr_renamed_2820().cfr_renamed_13400().cfr_renamed_16270("Arial Unicode MS", arg0.cfr_renamed_13303());
        }
        if (sprfzo2 != null) {
            return new sprhhp(arg0.cfr_renamed_13265(), arg0.cfr_renamed_16400(), sprfzo2);
        }
        return arg0;
    }

    @Override
    @sprtea
    public void cfr_renamed_16110() {
        sprqmo sprqmo2 = this;
        sprpln sprpln2 = sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_12551();
        if (sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16325() == null || sprpln2 == null) {
            return;
        }
        sprqmo sprqmo3 = this;
        sprqmo3.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16335();
        sprqmo3.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16325().cfr_renamed_12550(sprpln2);
        sprqmo3.cfr_renamed_16401();
    }

    @Override
    @sprtea
    public void cfr_renamed_16103() {
        sprqmo sprqmo2 = this;
        sprtbp sprtbp2 = sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_12571();
        if (sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16325() == null || sprtbp2 == null) {
            return;
        }
        sprqmo sprqmo3 = this;
        sprqmo3.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16325().cfr_renamed_12505(sprtbp2);
        sprqmo3.cfr_renamed_16401();
    }

    @Override
    @sprtea
    public void cfr_renamed_13168(sprsuja arg0) {
        if (this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16321()) {
            sprsuja[] sprsujaArray = new sprsuja[]{this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16115(), arg0};
            this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16327(sprsujaArray);
            return;
        }
        sprqmo sprqmo2 = this;
        sprxln sprxln2 = sprxln.cfr_renamed_13120(sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16115(), arg0);
        sprqmo2.cfr_renamed_16394(sprxln2, true, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean cfr_renamed_16402(int arg0) {
        switch (arg0) {
            case 4457256: 
            case 0x660046: 
            case 8913094: 
            case 12255782: 
            case 15597702: {
                return true;
            }
        }
        return false;
    }

    private /* synthetic */ sprktp cfr_renamed_16403(String arg0) {
        Iterator iterator;
        sprktp sprktp2 = new sprktp();
        Iterator iterator2 = iterator = new sprcop(arg0).iterator();
        while (iterator2.hasNext()) {
            int n = (Integer)iterator.next();
            sprhhp sprhhp2 = this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_13257();
            if (!sprhhp2.cfr_renamed_13261().cfr_renamed_16399(n)) {
                sprhhp2 = this.cfr_renamed_16398(sprhhp2, n);
            }
            String string = sprxsp.cfr_renamed_12396(n);
            sprphja sprphja2 = sprhhp2.cfr_renamed_13729(string);
            sprphja sprphja3 = new sprphja(sprphja2.cfr_renamed_1942() + (float)(sprcop.cfr_renamed_16374(string) * this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16348()), sprphja2.cfr_renamed_1452());
            iterator2 = iterator;
            float f = this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16131().cfr_renamed_16266(sprhhp2);
            sprktp2.cfr_renamed_13516(new sprsuja(sprphja3.cfr_renamed_1942() * f, 0.0f));
        }
        return sprktp2;
    }

    private /* synthetic */ void cfr_renamed_16401() {
        sprqmo sprqmo2 = this;
        sprqmo sprqmo3 = this;
        sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16325().cfr_renamed_12591(sprkho.cfr_renamed_16340(sprqmo3.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_12609()));
        sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16325().cfr_renamed_12624(this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16112().cfr_renamed_16312().cfr_renamed_14487());
        sprqmo3.cfr_renamed_2820().cfr_renamed_16404(this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16325());
        sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16332();
    }

    private /* synthetic */ sprxln cfr_renamed_16405(sprsuja arg0, sprphja arg1) {
        return sprxln.cfr_renamed_13253(new sprgeja(new sprsuja(arg0.cfr_renamed_1980(), arg0.spr\u3181() - this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_13257().cfr_renamed_13746()), arg1));
    }

    @Override
    @sprtea
    public void cfr_renamed_16094(sprsuja[] arg0) {
        if (arg0.length > 0) {
            if (this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16321()) {
                this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16327(arg0);
                return;
            }
            sprxln sprxln2 = sprqoo.cfr_renamed_16388(arg0, false);
            this.cfr_renamed_16394(sprxln2, true, false);
        }
    }

    public void cfr_renamed_16406() {
        this.cfr_renamed_2820().cfr_renamed_16407();
    }

    @sprtea
    public sprmrn cfr_renamed_16203() {
        return this.cfr_renamed_2820().cfr_renamed_16408().cfr_renamed_16203();
    }

    @Override
    @sprtea
    public void cfr_renamed_16118(sprsuja arg0, String arg1, sprktp arg2, int arg3, float arg4, float arg5, sprxln arg6) {
        sprioo sprioo2;
        if (spryxp.cfr_renamed_13464(arg4)) {
            arg4 = 1.0f;
        }
        if (spryxp.cfr_renamed_13464(arg5)) {
            arg5 = 1.0f;
        }
        boolean bl = ((sprioo2 = this.cfr_renamed_2820().cfr_renamed_16100()).cfr_renamed_16343() & 1) != 0;
        arg1 = sprqmo.cfr_renamed_16409(arg1);
        if (arg2 == null) {
            arg2 = this.cfr_renamed_16403(arg1);
        }
        sprphja sprphja2 = sprqmo.cfr_renamed_16392(arg2);
        sprphja sprphja3 = this.cfr_renamed_16393(sprphja2);
        if (bl) {
            sprioo sprioo3 = sprioo2;
            arg0 = sprioo3.cfr_renamed_16115();
            sprioo3.cfr_renamed_16198(sprzlp.cfr_renamed_16318(arg0, sprphja2));
        }
        sprqgp sprqgp2 = sprioo2.cfr_renamed_16120(arg0, sprphja3, arg3, arg4, arg5);
        if (arg6 != null) {
            arg6.cfr_renamed_12624(sprioo2.cfr_renamed_16112().cfr_renamed_16312());
        }
        sprmrn sprmrn2 = new sprmrn();
        sprmrn2.cfr_renamed_12545(arg6);
        sprmrn sprmrn3 = new sprmrn();
        sprmrn3.cfr_renamed_12511(sprqgp2);
        sprmrn2.cfr_renamed_12507(sprmrn3);
        sprqmo sprqmo2 = this;
        sprqmo2.cfr_renamed_16410(sprmrn3, sprphja3);
        sprqmo2.cfr_renamed_16411(sprmrn3, arg1, arg2, arg3, arg4, arg5);
        sprqmo2.cfr_renamed_2820().cfr_renamed_16412(sprmrn2);
    }

    @Override
    @sprtea
    public void cfr_renamed_16088(sprgeja arg0) {
        sprxln sprxln2 = sprxln.cfr_renamed_13253(arg0);
        this.cfr_renamed_16397(sprxln2, false, true, true);
    }

    @Override
    @sprtea
    public void cfr_renamed_16089(sprsuja[] arg0) {
        if (arg0.length > 0) {
            if (this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16321()) {
                sprqmo sprqmo2 = this;
                sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16327(arg0);
                sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16337();
                return;
            }
            sprxln sprxln2 = sprqoo.cfr_renamed_16388(arg0, true);
            this.cfr_renamed_16394(sprxln2, true, true);
        }
    }

    @Override
    @sprtea
    public void cfr_renamed_16124(int arg0) {
        if (this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16325() == null) {
            return;
        }
        sprqmo sprqmo2 = this;
        sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16335();
        sprqmo sprqmo3 = this;
        sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16325().cfr_renamed_12591(sprkho.cfr_renamed_16340(sprqmo3.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_12609()));
        sprqmo3.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16357(this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16325(), arg0);
        sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16332();
    }

    private static /* synthetic */ sprgeja cfr_renamed_16413(sprgeja arg0) {
        float f;
        float f2;
        sprgeja sprgeja2 = arg0;
        float f3 = sprgeja2.cfr_renamed_1980();
        float f4 = sprgeja2.cfr_renamed_1942();
        if (f2 < 0.0f) {
            f3 += f4;
            f4 = -f4;
        }
        sprgeja sprgeja3 = arg0;
        float f5 = sprgeja3.spr\u3181();
        float f6 = sprgeja3.cfr_renamed_1452();
        if (f < 0.0f) {
            f5 += f6;
            f6 = -f6;
        }
        return new sprgeja(f3, f5, f4, f6);
    }

    @Override
    @sprtea
    public void cfr_renamed_16113(sprsuja[][] arg0) {
        if (arg0.length > 0) {
            if (this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16321()) {
                int n;
                sprsuja[][] sprsujaArray = arg0;
                int n2 = arg0.length;
                int n3 = n = 0;
                while (n3 < n2) {
                    sprsuja[] sprsujaArray2 = sprsujaArray[n];
                    sprqmo sprqmo2 = this;
                    sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16327(sprsujaArray2);
                    sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16337();
                    n3 = ++n;
                }
            } else {
                sprxln sprxln2 = sprqoo.cfr_renamed_16382(arg0, true);
                this.cfr_renamed_16394(sprxln2, true, true);
            }
        }
    }

    @Override
    @sprtea
    public void cfr_renamed_16096(sprgeja arg0, sprsuja arg1, sprsuja arg2) {
        if (arg0.cfr_renamed_29()) {
            return;
        }
        sprxln sprxln2 = sprqoo.cfr_renamed_16379(arg0, arg1, arg2);
        this.cfr_renamed_16394(sprxln2, true, true);
    }

    @Override
    @sprtea
    public void cfr_renamed_16114(sprsuja arg0, sprwbp arg1) {
        sprxln sprxln2;
        sprsuja sprsuja2 = arg0;
        sprxln sprxln3 = sprxln2 = sprxln.cfr_renamed_13120(sprsuja2, sprsuja2);
        sprxln3.cfr_renamed_12505(new sprtbp(arg1));
        this.cfr_renamed_16394(sprxln3, false, false);
    }

    @Override
    @sprtea
    public void cfr_renamed_16092(sprgeja arg0, sprsuja arg1, sprsuja arg2) {
        sprxln sprxln2 = sprqoo.cfr_renamed_16390(arg0, arg1, arg2);
        this.cfr_renamed_16394(sprxln2, true, true);
    }

    private static /* synthetic */ String cfr_renamed_16409(String arg0) {
        Iterator iterator;
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator2 = iterator = new sprcop(arg0).iterator();
        while (iterator2.hasNext()) {
            int n = (Integer)iterator.next();
            sprghha.cfr_renamed_12279(stringBuilder, sprqmo.cfr_renamed_16414(n) ? " " : sprxsp.cfr_renamed_12396(n));
            iterator2 = iterator;
        }
        return stringBuilder.toString();
    }

    @Override
    @sprtea
    public void cfr_renamed_16099(sprgeja arg0, sprphja arg1) {
        sprxln sprxln2 = sprqoo.cfr_renamed_16385(arg0, arg1);
        this.cfr_renamed_16394(sprxln2, true, true);
    }

    @Override
    @sprtea
    public void cfr_renamed_16104(sprgeja arg0, sprsuja arg1, sprsuja arg2) {
        if (arg0.cfr_renamed_29()) {
            return;
        }
        sprxln sprxln2 = sprqoo.cfr_renamed_16383(arg0, arg1, arg2, this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16371());
        this.cfr_renamed_16394(sprxln2, true, false);
    }

    @Override
    @sprtea
    public void cfr_renamed_16122() {
        sprqmo sprqmo2 = this;
        sprpln sprpln2 = sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_12551();
        sprtbp sprtbp2 = sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_12571();
        if (sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16325() == null || sprpln2 == null && sprtbp2 == null) {
            return;
        }
        sprqmo sprqmo3 = this;
        sprqmo3.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16335();
        sprqmo3.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16325().cfr_renamed_12550(sprpln2);
        sprqmo3.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16325().cfr_renamed_12505(sprtbp2);
        sprqmo3.cfr_renamed_16401();
    }

    private /* synthetic */ void cfr_renamed_16410(sprmrn arg0, sprphja arg1) {
        sprxln sprxln2;
        if (this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_12676().cfr_renamed_1778() == 0) {
            return;
        }
        sprxln sprxln3 = sprxln2 = this.cfr_renamed_16405(sprsuja.cfr_renamed_13377(), arg1);
        sprxln3.cfr_renamed_12550(new sprghp(this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_12676()));
        arg0.cfr_renamed_12507(sprxln3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprvyo cfr_renamed_16415(byte[] arg0, sprgeja arg1, sprlfja arg2, int arg3, boolean arg4, boolean arg5) {
        if (!this.cfr_renamed_16402(arg3)) {
            return null;
        }
        sprqso sprqso2 = null;
        try {
            sprvyo sprvyo2 = new sprvyo(arg0);
            try {
                sprqso sprqso3 = sprqso2 = new sprvyo(arg2.cfr_renamed_1942(), arg2.cfr_renamed_1452(), 72.0f, 72.0f);
                sprqso sprqso4 = sprqso2;
                sprvyo2.cfr_renamed_16416(arg1, (sprvyo)sprqso3, new sprgeja(new sprsuja(), sprlfja.cfr_renamed_15060(arg2)), arg4, arg5);
                sprqso sprqso5 = sprqso3;
                return sprqso5;
            }
            finally {
                if (sprvyo2 != null) {
                    sprvyo2.cfr_renamed_11665();
                }
            }
        }
        catch (Exception exception) {
            if (sprqso2 == null) return null;
            sprqso2.cfr_renamed_11665();
            return null;
        }
    }

    @Override
    @sprtea
    public void cfr_renamed_16106(sprsuja[][] arg0) {
        if (arg0.length >= 0) {
            if (this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16321()) {
                int n;
                sprsuja[][] sprsujaArray = arg0;
                int n2 = arg0.length;
                int n3 = n = 0;
                while (n3 < n2) {
                    sprsuja[] sprsujaArray2 = sprsujaArray[n];
                    sprqmo sprqmo2 = this;
                    sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16327(sprsujaArray2);
                    sprqmo2.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16362().cfr_renamed_16334();
                    n3 = ++n;
                }
            } else {
                sprxln sprxln2 = sprqoo.cfr_renamed_16382(arg0, false);
                this.cfr_renamed_16394(sprxln2, true, false);
            }
        }
    }

    private /* synthetic */ void cfr_renamed_16391(sprxln arg0, sprtbp arg1, sprpln arg2) {
        if (arg1 == null && arg2 == null) {
            return;
        }
        sprxln sprxln2 = arg0;
        sprxln2.cfr_renamed_12505(arg1);
        sprxln2.cfr_renamed_12550(arg2);
        arg0.cfr_renamed_12591(sprkho.cfr_renamed_16340(this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_12609()));
        this.cfr_renamed_2820().cfr_renamed_16404(arg0);
    }

    @Override
    @sprtea
    public void cfr_renamed_16109(sprmrn arg0) {
        this.cfr_renamed_2820().cfr_renamed_16404(arg0);
    }

    private /* synthetic */ void cfr_renamed_16397(sprxln arg0, boolean arg1, boolean arg2, boolean arg3) {
        sprpln sprpln2;
        sprioo sprioo2 = this.cfr_renamed_2820().cfr_renamed_16100();
        sprtbp sprtbp2 = arg1 ? sprioo2.cfr_renamed_12571() : null;
        sprpln sprpln3 = sprpln2 = arg2 ? sprioo2.cfr_renamed_12551() : null;
        if (arg3 && sprpln2 != null) {
            sprpln2 = new sprghp(sprioo2.cfr_renamed_12676());
        }
        this.cfr_renamed_16391(arg0, sprtbp2, sprpln2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    @sprtea
    public void cfr_renamed_16108(sprgeja arg0, sprgeja arg1, byte[] arg2, int arg3) {
        sprvyo sprvyo2;
        byte[] byArray;
        Object object;
        sprvyo sprvyo3;
        sprvyo sprvyo4;
        block11: {
            boolean bl = sprrgga.cfr_renamed_13830(arg0.cfr_renamed_1942()) != sprrgga.cfr_renamed_13830(arg1.cfr_renamed_1942());
            boolean bl2 = sprrgga.cfr_renamed_13830(arg0.cfr_renamed_1452()) != sprrgga.cfr_renamed_13830(arg1.cfr_renamed_1452());
            arg0 = sprqmo.cfr_renamed_16413(arg0);
            arg1 = sprqmo.cfr_renamed_16413(arg1);
            sprqmo sprqmo2 = this;
            sprlfja sprlfja2 = sprqmo2.cfr_renamed_16395(arg1);
            sprvyo4 = sprqmo2.cfr_renamed_16415(arg2, arg0, sprlfja2, arg3, bl, bl2);
            sprvyo3 = sprqmo2.cfr_renamed_16417(arg1, sprlfja2);
            if (sprvyo4 == null || sprvyo3 == null) {
                return;
            }
            try {
                block10: {
                    this.cfr_renamed_16418(sprvyo4, sprvyo3, arg3);
                    object = new sprpdja();
                    try {
                        sprvyo3.cfr_renamed_12641((spreen)object, 6);
                        byArray = ((sprpdja)object).cfr_renamed_4529();
                        if (object == null) break block10;
                        sprvyo2 = sprvyo4;
                    }
                    catch (Throwable throwable) {
                        if (object != null) {
                            ((spreen)object).cfr_renamed_2637();
                        }
                        throw throwable;
                    }
                    ((spreen)object).cfr_renamed_2637();
                    break block11;
                }
                sprvyo2 = sprvyo4;
            }
            catch (Throwable throwable) {
                if (sprvyo4 != null) {
                    sprvyo4.cfr_renamed_11665();
                }
                if (sprvyo3 != null) {
                    sprvyo3.cfr_renamed_11665();
                }
                throw throwable;
            }
        }
        if (sprvyo2 != null) {
            sprvyo4.cfr_renamed_11665();
        }
        if (sprvyo3 != null) {
            sprvyo3.cfr_renamed_11665();
        }
        object = new sprson(arg1.cfr_renamed_9494(), arg1.cfr_renamed_2773(), byArray);
        this.cfr_renamed_2820().cfr_renamed_16404((sprvjn)object);
    }

    @Override
    @sprtea
    public void cfr_renamed_16105(sprgeja arg0) {
        if (arg0.cfr_renamed_29()) {
            return;
        }
        sprxln sprxln2 = sprqoo.cfr_renamed_16380(arg0);
        this.cfr_renamed_16394(sprxln2, true, true);
    }

    @Override
    @sprtea
    public void cfr_renamed_16116(sprgeja arg0, sprgeja arg1, sprqgp arg2, byte[] arg3) {
        sprczo sprczo2 = sprsto.cfr_renamed_13321(arg3);
        sprson sprson2 = new sprson(new sprsuja(sprczo2.cfr_renamed_13430(), sprczo2.cfr_renamed_13342()), sprlfja.cfr_renamed_15060(sprczo2.cfr_renamed_2773()), arg3);
        sprmrn sprmrn2 = new sprmrn();
        sprmrn2.cfr_renamed_12507(sprson2);
        sprmrn2.cfr_renamed_12511(arg2.cfr_renamed_14487());
        sprmrn sprmrn3 = new sprmrn();
        sprmrn3.cfr_renamed_12507(sprmrn2);
        sprmrn sprmrn4 = sprmrn3;
        sprmrn4.cfr_renamed_12545(sprxln.cfr_renamed_13253(arg0));
        sprmrn4.cfr_renamed_12511(sprqgp.cfr_renamed_16234(arg0, arg1));
        this.cfr_renamed_2820().cfr_renamed_16404(sprmrn3);
    }

    private static /* synthetic */ boolean cfr_renamed_16414(int arg0) {
        return arg0 >= 0 && arg0 <= 31 || arg0 >= 128 && arg0 <= 159;
    }

    @sprtea
    public sprqmo(sprdfo arg0, boolean arg1, spriy arg2) {
        super(arg0, arg1, arg2);
    }

    private /* synthetic */ void cfr_renamed_16418(sprvyo arg0, sprvyo arg1, int arg2) {
        int n;
        int n2 = -16777216;
        int n3 = -16777216;
        int n4 = (int)(0xFFFFFFFFL & 0xFFFFFFFFL);
        int n5 = n = 0;
        while (n5 < arg0.cfr_renamed_1942()) {
            int n6;
            int n7 = n6 = 0;
            while (n7 < arg0.cfr_renamed_1452()) {
                sprvyo sprvyo2;
                int n8;
                int n9 = arg1.cfr_renamed_14004(n, n6);
                int n10 = arg0.cfr_renamed_14004(n, n6);
                if ((n9 & n2) == 0) {
                    n9 = 0xFFFFFF;
                }
                switch (arg2) {
                    case 0x660046: {
                        if (n10 == n3) {
                            n8 = n9;
                            sprvyo2 = arg1;
                            break;
                        }
                        if (n9 == n3) {
                            n8 = n10;
                            sprvyo2 = arg1;
                            break;
                        }
                        if ((n9 & n2) == 0) {
                            n9 |= n2;
                        }
                        n8 = (n10 ^ n9) & ~n2;
                        n8 |= (n10 | n9) & n2;
                        sprvyo2 = arg1;
                        break;
                    }
                    case 4457256: {
                        while (false) {
                        }
                        n8 = n10 & ~n9;
                        sprvyo2 = arg1;
                        break;
                    }
                    case 15597702: {
                        if (((long)n10 & 0xFFFFFFFFL) == 0xFF000000L && (n9 & n2) == 0) {
                            n8 = n9;
                            sprvyo2 = arg1;
                            break;
                        }
                        n8 = n10 | n9;
                        sprvyo2 = arg1;
                        break;
                    }
                    case 8913094: {
                        if (n10 == n3) {
                            n8 = n3;
                            sprvyo2 = arg1;
                            break;
                        }
                        if (n9 == n3) {
                            n8 = n3;
                            sprvyo2 = arg1;
                            break;
                        }
                        if (n10 == n4) {
                            n8 = n9;
                            sprvyo2 = arg1;
                            break;
                        }
                        if (n9 == n4) {
                            n8 = n10;
                            sprvyo2 = arg1;
                            break;
                        }
                        n8 = n10 & n9 & ~n2;
                        n8 |= (n10 | n9) & n2;
                        sprvyo2 = arg1;
                        break;
                    }
                    case 12255782: {
                        int n11 = n10 & n2;
                        if ((n10 & ~n2) == (n4 & ~n2)) {
                            n11 = 0;
                        }
                        n8 = (n9 | ~n10) & ~n2;
                        n8 |= (n9 | n11) & n2;
                        sprvyo2 = arg1;
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException(new StringBuilder().insert(0, sprndo.cfr_renamed_9("f\u000fW\u0003OFS\u0007R\u0012D\u0014\u0001\tQ\u0003S\u0007U\u000fN\b\u0001\u000fRFO\tUFR\u0013Q\u0016N\u0014U\u0003EFC\u001f\u0001\u000bD\u0012I\tE\\\u0001")).append(arg2).append(sprvrb.cfr_renamed_9("\u000e\u0015S~q~nzwzq?m~nz9?")).append(sprndo.cfr_renamed_9("\u0014@\u0015U\u0003S)Q")).toString());
                    }
                }
                sprvyo2.cfr_renamed_16419(n, n6++, n8);
                n7 = n6;
            }
            n5 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_16411(sprmrn arg0, String arg1, sprktp arg2, int arg3, float arg4, float arg5) {
        Iterator iterator;
        if (!sprznp.cfr_renamed_12328(sprraia.cfr_renamed_12806(arg1))) {
            return;
        }
        sprioo sprioo2 = this.cfr_renamed_2820().cfr_renamed_16100();
        sprsuja sprsuja2 = sprsuja.cfr_renamed_13377();
        int n = 0;
        Iterator iterator2 = iterator = new sprcop(arg1).iterator();
        while (iterator2.hasNext()) {
            sprthn sprthn2;
            int n2 = (Integer)iterator.next();
            sprhhp sprhhp2 = sprioo2.cfr_renamed_13257();
            if (!sprhhp2.cfr_renamed_13261().cfr_renamed_16399(n2)) {
                sprhhp2 = this.cfr_renamed_16398(sprhhp2, n2);
            }
            sprthn sprthn3 = sprthn2 = new sprthn(sprhhp2, sprioo2.cfr_renamed_16215(), sprwbp.cfr_renamed_1447, sprsuja.cfr_renamed_13377(), sprxsp.cfr_renamed_12396(n2), 0.0f);
            sprthn3.cfr_renamed_12511(sprioo2.cfr_renamed_16366(sprsuja2, arg3, arg4, arg5));
            arg0.cfr_renamed_12507(sprthn3);
            sprsuja sprsuja3 = arg2.cfr_renamed_576(n);
            ++n;
            sprsuja2 = new sprsuja(sprsuja2.cfr_renamed_1980() + sprsuja3.cfr_renamed_1980(), sprsuja2.spr\u3181() + sprsuja3.spr\u3181());
            iterator2 = iterator;
        }
    }

    private /* synthetic */ sprvyo cfr_renamed_16417(sprgeja arg0, sprlfja arg1) {
        if (this.cfr_renamed_2820().cfr_renamed_16420() == null) {
            this.cfr_renamed_2820().cfr_renamed_16421();
        }
        return this.cfr_renamed_2820().cfr_renamed_16420().cfr_renamed_16422(arg0, arg1);
    }
}

