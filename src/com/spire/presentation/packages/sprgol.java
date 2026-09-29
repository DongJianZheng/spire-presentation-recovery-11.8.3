/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spratl;
import com.spire.presentation.packages.sprcbaa;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprglm;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.spriol;
import com.spire.presentation.packages.sprirl;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproxz;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprtpm;
import com.spire.presentation.packages.sprwrm;
import com.spire.presentation.packages.sprzwl;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class sprgol {
    private sprhgm cfr_renamed_2;
    private List cfr_renamed_3;
    private sprigm cfr_renamed_4;

    public sprgol cfr_renamed_10909(sprhgm arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprgol cfr_renamed_10910(sprnbm sprnbm2) {
        void arg0;
        this.cfr_renamed_4 = new sprigm(4, (sprco)arg0);
        return this;
    }

    public sprgol() {
        sprgol sprgol2 = this;
        sprgol sprgol3 = this;
        sprgol3.cfr_renamed_3 = new ArrayList();
        sprgol2.cfr_renamed_4 = null;
        sprgol2.cfr_renamed_2 = null;
    }

    public sprirl cfr_renamed_10911(sprcf arg0, sprtpl[] arg1) throws sprzwl, IllegalArgumentException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprcbaa.cfr_renamed_9("la\"}kilkp.q~gmkhkkf"));
        }
        return this.cfr_renamed_10912(arg0, arg1);
    }

    public sprgol cfr_renamed_10913(spriol arg0) {
        sprgol sprgol2 = this;
        sprgol2.cfr_renamed_3.add(new spratl(arg0, null));
        return sprgol2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprirl cfr_renamed_10912(sprcf arg0, sprtpl[] arg1) throws sprzwl {
        Object object;
        Iterator iterator = this.cfr_renamed_3.iterator();
        sprrvm sprrvm2 = new sprrvm();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            try {
                sprrvm2.cfr_renamed_5004(((spratl)iterator.next()).cfr_renamed_4294());
                iterator2 = iterator;
            }
            catch (Exception exception) {
                throw new sprzwl(sproxz.cfr_renamed_9("SmUpFa_zX5UgStB|Xr\u0016GSdCpEa"), exception);
            }
        }
        sprtpm sprtpm2 = new sprtpm(this.cfr_renamed_4, (sprszm)new sprcen(sprrvm2), this.cfr_renamed_2);
        sprglm sprglm2 = null;
        if (arg0 == null) return new sprirl(new sprwrm(sprtpm2, sprglm2));
        if (this.cfr_renamed_4 == null) {
            throw new sprzwl(sprcbaa.cfr_renamed_9("pks{g}vap@ccg.o{qz\"lg.q~gmkhkkf.kh\"|g\u007fwkqz\"gq.qge`gj,"));
        }
        try {
            object = arg0.cfr_renamed_470();
            ((OutputStream)object).write(sprtpm2.cfr_renamed_104("DER"));
            ((OutputStream)object).close();
        }
        catch (Exception exception) {
            throw new sprzwl(new StringBuilder().insert(0, sproxz.cfr_renamed_9("pNvSeB|Y{\u0016eDzUpEf_{Q5bwEGSdCpEa\f5")).append(exception).toString(), exception);
        }
        object = new sprdye(arg0.cfr_renamed_79());
        sprddm sprddm2 = arg0.cfr_renamed_615();
        if (arg1 != null && arg1.length > 0) {
            int n;
            sprrvm sprrvm3 = new sprrvm();
            int n2 = n = 0;
            while (true) {
                if (n2 == arg1.length) {
                    sprglm2 = new sprglm(sprddm2, (sprdye)object, new sprcen(sprrvm3));
                    return new sprirl(new sprwrm(sprtpm2, sprglm2));
                }
                sprrvm3.cfr_renamed_5004(arg1[n++].cfr_renamed_568());
                n2 = n;
            }
        }
        sprglm2 = new sprglm(sprddm2, (sprdye)object);
        return new sprirl(new sprwrm(sprtpm2, sprglm2));
    }

    public sprgol cfr_renamed_10914(sprigm arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprgol cfr_renamed_10915(spriol arg0, sprhgm arg1) {
        sprgol sprgol2 = this;
        sprgol2.cfr_renamed_3.add(new spratl(arg0, arg1));
        return sprgol2;
    }

    public sprirl cfr_renamed_1451() throws sprzwl {
        return this.cfr_renamed_10912(null, null);
    }
}

