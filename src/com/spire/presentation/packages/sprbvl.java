/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdol;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.spriol;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprool;
import com.spire.presentation.packages.sprrtl;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprveda;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvw;
import com.spire.presentation.packages.sprxsm;
import com.spire.presentation.packages.sprycga;
import com.spire.presentation.packages.sprzmm;
import com.spire.presentation.packages.sprzwl;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class sprbvl {
    private List cfr_renamed_2;
    private sprhgm cfr_renamed_3;
    private sprool cfr_renamed_4;

    public sprbvl cfr_renamed_10919(sprhgm arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public sprbvl cfr_renamed_10920(spriol arg0, sprvw arg1) {
        sprbvl sprbvl2 = this;
        sprbvl2.cfr_renamed_10921(arg0, arg1, new Date(), null, null);
        return sprbvl2;
    }

    public sprbvl cfr_renamed_10921(spriol arg0, sprvw arg1, Date arg2, Date arg3, sprhgm arg4) {
        sprbvl sprbvl2 = this;
        sprbvl2.cfr_renamed_2.add(new sprdol(arg0, arg1, arg2, arg3, arg4));
        return sprbvl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprrtl cfr_renamed_10922(sprcf arg0, sprtpl[] arg1, Date arg2) throws sprzwl {
        sprdye sprdye2;
        Object object;
        Iterator iterator = this.cfr_renamed_2.iterator();
        sprrvm sprrvm2 = new sprrvm();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            try {
                sprrvm2.cfr_renamed_5004(((sprdol)iterator.next()).cfr_renamed_4310());
                iterator2 = iterator;
            }
            catch (Exception exception) {
                throw new sprzwl(sprveda.cfr_renamed_9("B\u0018D\u0005W\u0014N\u000fI@D\u0012B\u0001S\tI\u0007\u00072B\u0011R\u0005T\u0014"), exception);
            }
        }
        sprxsm sprxsm2 = new sprxsm(this.cfr_renamed_4.cfr_renamed_119(), new sprjfn(arg2), (sprszm)new sprcen(sprrvm2), this.cfr_renamed_3);
        try {
            object = arg0.cfr_renamed_470();
            ((OutputStream)object).write(sprxsm2.cfr_renamed_104("DER"));
            ((OutputStream)object).close();
            sprdye2 = new sprdye(arg0.cfr_renamed_79());
        }
        catch (Exception exception) {
            throw new sprzwl(new StringBuilder().insert(0, sprycga.cfr_renamed_9("\u0010D\u0016Y\u0005H\u001cS\u001b\u001c\u0005N\u001a_\u0010O\u0006U\u001b[Uh\u0017O'Y\u0004I\u0010O\u0001\u0006U")).append(exception.getMessage()).toString(), exception);
        }
        object = arg0.cfr_renamed_615();
        sprcen sprcen2 = null;
        if (arg1 != null && arg1.length > 0) {
            int n;
            sprrvm sprrvm3 = new sprrvm();
            int n2 = n = 0;
            while (n2 != arg1.length) {
                sprrvm3.cfr_renamed_5004(arg1[n++].cfr_renamed_568());
                n2 = n;
            }
            sprcen2 = new sprcen(sprrvm3);
        }
        return new sprrtl(new sprzmm(sprxsm2, (sprddm)object, sprdye2, sprcen2));
    }

    /*
     * WARNING - void declaration
     */
    public sprbvl(sprvhm sprvhm2, sprjj sprjj2) throws sprzwl {
        void arg1;
        void arg0;
        sprbvl sprbvl2 = this;
        sprbvl sprbvl3 = this;
        sprbvl2.cfr_renamed_2 = new ArrayList();
        sprbvl2.cfr_renamed_3 = null;
        sprbvl2.cfr_renamed_4 = new sprool((sprvhm)arg0, (sprjj)arg1);
    }

    public sprbvl cfr_renamed_10923(spriol arg0, sprvw arg1, sprhgm arg2) {
        sprbvl sprbvl2 = this;
        sprbvl2.cfr_renamed_10921(arg0, arg1, new Date(), null, arg2);
        return sprbvl2;
    }

    public sprbvl cfr_renamed_10924(spriol arg0, sprvw arg1, Date arg2, Date arg3) {
        sprbvl sprbvl2 = this;
        sprbvl2.cfr_renamed_10921(arg0, arg1, arg2, arg3, null);
        return sprbvl2;
    }

    public sprbvl cfr_renamed_10925(spriol arg0, sprvw arg1, Date arg2, sprhgm arg3) {
        sprbvl sprbvl2 = this;
        sprbvl2.cfr_renamed_10921(arg0, arg1, new Date(), arg2, arg3);
        return sprbvl2;
    }

    public sprbvl(sprool sprool2) {
        sprbvl sprbvl2 = this;
        sprbvl sprbvl3 = this;
        sprbvl3.cfr_renamed_2 = new ArrayList();
        sprbvl2.cfr_renamed_3 = null;
        sprbvl2.cfr_renamed_4 = sprool2;
    }
}

