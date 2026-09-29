/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbpm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprekm;
import com.spire.presentation.packages.spreul;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprfz;
import com.spire.presentation.packages.spriom;
import com.spire.presentation.packages.sprkum;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprnlm;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvhm;

public abstract class sprwkl
implements sprfz {
    private sprvhm cfr_renamed_2;
    private sprlem cfr_renamed_3;
    private sprlem cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprwkl(sprlem sprlem2, sprvhm sprvhm2, sprlem sprlem3) {
        void arg0;
        void arg1;
        sprwkl sprwkl2 = this;
        this.cfr_renamed_2 = arg1;
        sprwkl2.cfr_renamed_3 = arg0;
        sprwkl2.cfr_renamed_4 = sprlem3;
    }

    @Override
    public sprbpm cfr_renamed_10668(sprnfg arg0) throws sprlyl {
        sprwkl sprwkl2 = this;
        sprkum sprkum2 = new sprkum(sprwkl2.cfr_renamed_10685(sprwkl2.cfr_renamed_2));
        sprddm sprddm2 = spreul.cfr_renamed_9390(this.cfr_renamed_4.cfr_renamed_19()) || this.cfr_renamed_4.cfr_renamed_5078(sprdl.cfr_renamed_1435) ? new sprddm(this.cfr_renamed_4, sprpen.cfr_renamed_4) : (spreul.cfr_renamed_7452(this.cfr_renamed_3) ? new sprddm(this.cfr_renamed_4, new sprekm(sprqo.cfr_renamed_145)) : new sprddm(this.cfr_renamed_4));
        sprddm sprddm3 = new sprddm(this.cfr_renamed_3, sprddm2);
        sprwkl sprwkl3 = this;
        sprszm sprszm2 = sprwkl3.cfr_renamed_10686(sprddm3, sprddm2, arg0);
        byte[] byArray = sprwkl3.cfr_renamed_10687(sprddm3);
        if (byArray != null) {
            return new sprbpm(new sprnlm(sprkum2, new sprfvg(byArray), sprddm3, sprszm2));
        }
        return new sprbpm(new sprnlm(sprkum2, null, sprddm3, sprszm2));
    }

    public spriom cfr_renamed_10685(sprvhm arg0) {
        return new spriom(arg0.cfr_renamed_593(), arg0.cfr_renamed_2314().cfr_renamed_81());
    }

    public abstract sprszm cfr_renamed_10686(sprddm var1, sprddm var2, sprnfg var3) throws sprlyl;

    public abstract byte[] cfr_renamed_10687(sprddm var1) throws sprlyl;
}

