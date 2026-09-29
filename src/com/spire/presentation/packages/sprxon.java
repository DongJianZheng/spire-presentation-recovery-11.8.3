/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcin;
import com.spire.presentation.packages.sprcnn;
import com.spire.presentation.packages.sprcpn;
import com.spire.presentation.packages.sprfkn;
import com.spire.presentation.packages.sprfon;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprgjn;
import com.spire.presentation.packages.sprgmn;
import com.spire.presentation.packages.sprgrn;
import com.spire.presentation.packages.sprhin;
import com.spire.presentation.packages.spriin;
import com.spire.presentation.packages.sprisn;
import com.spire.presentation.packages.sprjeka;
import com.spire.presentation.packages.sprjpn;
import com.spire.presentation.packages.sprlon;
import com.spire.presentation.packages.sprlqn;
import com.spire.presentation.packages.sprnmn;
import com.spire.presentation.packages.sprokn;
import com.spire.presentation.packages.spropn;
import com.spire.presentation.packages.sprqpn;
import com.spire.presentation.packages.sprqqn;
import com.spire.presentation.packages.sprrln;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvhn;
import com.spire.presentation.packages.sprvq;
import com.spire.presentation.packages.sprwmn;
import com.spire.presentation.packages.sprxin;
import com.spire.presentation.packages.sprxjn;
import com.spire.presentation.packages.spryin;
import com.spire.presentation.packages.sprznn;
import com.spire.presentation.packages.sprzpn;
import com.spire.presentation.packages.sprzrn;
import java.util.Iterator;

@sprtea
public class sprxon
extends sprgrn {
    private sprgdo cfr_renamed_2;
    private sprjeka cfr_renamed_3;
    private sprfon cfr_renamed_4;

    @Override
    public void cfr_renamed_13910(sprnmn arg0) {
        this.cfr_renamed_14694("/Sect");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13924(sprcpn sprcpn2) {
        void arg0;
        int n;
        this.cfr_renamed_14694("/Link");
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_13932().cfr_renamed_11861()) {
            int n3 = arg0.cfr_renamed_13932().cfr_renamed_576(n);
            sprgjn sprgjn2 = this.cfr_renamed_2.cfr_renamed_14454().cfr_renamed_14695(n3);
            if (sprgjn2 != null) {
                sprqqn sprqqn2 = this.cfr_renamed_14696();
                sprgjn sprgjn3 = sprgjn2;
                sprqqn2.cfr_renamed_14687(sprgjn3.cfr_renamed_13245(), sprgjn2.cfr_renamed_14697());
                sprgjn3.cfr_renamed_14684(sprqqn2);
            }
            n2 = ++n;
        }
    }

    @Override
    public void cfr_renamed_13927(sprjpn arg0) {
        this.cfr_renamed_14698();
    }

    public sprfon cfr_renamed_14607(sprvq sprvq2) {
        sprxon sprxon2 = this;
        sprxon2.cfr_renamed_14699(sprvq2);
        sprxon sprxon3 = this;
        sprxon2.cfr_renamed_4.cfr_renamed_14676(sprxon3.cfr_renamed_14700());
        return sprxon3.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_13916(sprxjn arg0) {
        this.cfr_renamed_14698();
    }

    @Override
    public void cfr_renamed_13917(sprhin arg0) {
        this.cfr_renamed_14694("/LBody");
    }

    @Override
    public void cfr_renamed_13912(spriin arg0) {
        this.cfr_renamed_14694("/LI");
    }

    @Override
    public void cfr_renamed_13920(sprznn arg0) {
        this.cfr_renamed_14701(sprcnn.cfr_renamed_14692(arg0), arg0.cfr_renamed_13930());
    }

    private static /* synthetic */ String cfr_renamed_14702(sprjpn arg0) {
        if (arg0.cfr_renamed_13931() >= 6) {
            return "/P";
        }
        return sprcnn.cfr_renamed_14691(arg0.cfr_renamed_13931() + 1);
    }

    @Override
    public void cfr_renamed_13914(sprznn arg0) {
        this.cfr_renamed_14698();
    }

    @Override
    public void cfr_renamed_13900(sprhin arg0) {
        this.cfr_renamed_14698();
    }

    @Override
    public void cfr_renamed_13913(spriin arg0) {
        this.cfr_renamed_14698();
    }

    @Override
    public void cfr_renamed_13918(sprwmn arg0) {
        this.cfr_renamed_14698();
    }

    private /* synthetic */ void cfr_renamed_14701(String arg0, String arg1) {
        sprfkn sprfkn2 = new sprfkn(this.cfr_renamed_2, arg0, arg1);
        sprxon sprxon2 = this;
        sprxon2.cfr_renamed_14696().cfr_renamed_14685(sprfkn2);
        sprxon2.cfr_renamed_3.cfr_renamed_12516(sprfkn2);
    }

    @Override
    public void cfr_renamed_13908(sprlqn arg0) {
        this.cfr_renamed_14698();
    }

    @Override
    public void cfr_renamed_13909(sprqpn arg0) {
        this.cfr_renamed_14694("/Lbl");
    }

    @Override
    public void cfr_renamed_13923(sprzrn arg0) {
        sprgmn sprgmn2 = this.cfr_renamed_2.cfr_renamed_14454().cfr_renamed_14703(arg0.cfr_renamed_13938());
        if (sprgmn2 == null) {
            return;
        }
        sprqqn sprqqn2 = this.cfr_renamed_14696();
        sprgmn sprgmn3 = sprgmn2;
        sprqqn2.cfr_renamed_14688(sprgmn3.cfr_renamed_14704(), sprgmn2.cfr_renamed_14697());
        sprgmn3.cfr_renamed_14684(sprqqn2);
    }

    @Override
    public void cfr_renamed_13926(sprjpn arg0) {
        this.cfr_renamed_14694(sprxon.cfr_renamed_14702(arg0));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_14699(sprvq sprvq2) {
        void arg0;
        this.cfr_renamed_4 = new sprfon(this.cfr_renamed_2);
        this.cfr_renamed_3.cfr_renamed_12516(this.cfr_renamed_4);
        if (sprvq2 == null) {
            return;
        }
        arg0.cfr_renamed_13928(this);
    }

    @Override
    public void cfr_renamed_13904(sprokn arg0) {
        this.cfr_renamed_14694("/TR");
    }

    @Override
    public void cfr_renamed_13899(sprvhn arg0) {
        this.cfr_renamed_14698();
    }

    private /* synthetic */ sprisn cfr_renamed_14700() {
        sprrln sprrln2;
        Object object;
        Iterator iterator;
        sprisn sprisn2 = new sprisn(this.cfr_renamed_2);
        sprxon sprxon2 = this;
        sprisn2.cfr_renamed_14705(sprxon2.cfr_renamed_2.cfr_renamed_14454().cfr_renamed_14706());
        Iterator iterator2 = iterator = sprxon2.cfr_renamed_2.cfr_renamed_14454().cfr_renamed_14707().iterator();
        while (iterator2.hasNext()) {
            object = (spryin)iterator.next();
            sprrln2 = new sprlon(((spryin)object).cfr_renamed_14486());
            Iterator iterator3 = ((spryin)object).cfr_renamed_14708().iterator();
            while (iterator3.hasNext()) {
                Iterator iterator4;
                sprgmn sprgmn2 = (sprgmn)iterator4.next();
                iterator3 = iterator4;
                sprrln2.cfr_renamed_14709(sprgmn2.cfr_renamed_14704(), sprgmn2.cfr_renamed_14683());
            }
            sprisn2.cfr_renamed_14710(sprrln2);
            iterator2 = iterator;
        }
        iterator = this.cfr_renamed_2.cfr_renamed_14454().cfr_renamed_14711().cfr_renamed_205().iterator();
        block2: while (true) {
            Iterator iterator5 = iterator;
            while (iterator5.hasNext()) {
                object = (sprgjn)iterator.next();
                if (((sprgjn)object).cfr_renamed_13245().cfr_renamed_14486() < 0) continue block2;
                if (((sprgjn)object).cfr_renamed_14683() == null) {
                    iterator5 = iterator;
                    continue;
                }
                sprrln2 = new sprxin(((sprgjn)object).cfr_renamed_14683(), ((sprgjn)object).cfr_renamed_13245().cfr_renamed_14486());
                iterator5 = iterator;
                sprisn2.cfr_renamed_14710(sprrln2);
            }
            break;
        }
        return sprisn2;
    }

    @Override
    public void cfr_renamed_13925(sprzpn arg0) {
        this.cfr_renamed_14694("/Annotation");
    }

    @Override
    public void cfr_renamed_13922(spropn arg0) {
        this.cfr_renamed_14694("/Endnote");
    }

    @Override
    public void cfr_renamed_13919(sprqpn arg0) {
        this.cfr_renamed_14698();
    }

    private /* synthetic */ sprqqn cfr_renamed_14696() {
        return (sprqqn)this.cfr_renamed_3.cfr_renamed_12398();
    }

    @Override
    public void cfr_renamed_13898(sprlqn arg0) {
        this.cfr_renamed_14694("/Part");
    }

    @Override
    public void cfr_renamed_13901(sprnmn arg0) {
        this.cfr_renamed_14698();
    }

    public sprxon(sprgdo sprgdo2) {
        sprxon sprxon2 = this;
        this.cfr_renamed_3 = new sprjeka();
        this.cfr_renamed_2 = sprgdo2;
    }

    private /* synthetic */ void cfr_renamed_14698() {
        this.cfr_renamed_3.cfr_renamed_12514();
    }

    @Override
    public void cfr_renamed_13902(sprwmn arg0) {
        this.cfr_renamed_14694(sprcnn.cfr_renamed_14693(arg0));
    }

    @Override
    public void cfr_renamed_13921(sprvhn arg0) {
        this.cfr_renamed_14694("/Footnote");
    }

    @Override
    public void cfr_renamed_13915(sprcpn arg0) {
        this.cfr_renamed_14698();
    }

    @Override
    public void cfr_renamed_13911(sprcin arg0) {
        this.cfr_renamed_14698();
    }

    private /* synthetic */ void cfr_renamed_14694(String arg0) {
        this.cfr_renamed_14701(arg0, "");
    }

    @Override
    public void cfr_renamed_13905(sprzpn arg0) {
        this.cfr_renamed_14698();
    }

    @Override
    public void cfr_renamed_13897(sprxjn arg0) {
        this.cfr_renamed_14701("/Table", arg0.cfr_renamed_13930());
    }

    @Override
    public void cfr_renamed_13903(sprcin arg0) {
        this.cfr_renamed_14694("/L");
    }

    @Override
    public void cfr_renamed_13906(sprokn arg0) {
        this.cfr_renamed_14698();
    }

    @Override
    public void cfr_renamed_13907(spropn arg0) {
        this.cfr_renamed_14698();
    }
}

