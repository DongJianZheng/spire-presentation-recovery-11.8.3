/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfym;
import com.spire.presentation.packages.sprfzl;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprntl;
import com.spire.presentation.packages.sprrum;
import com.spire.presentation.packages.sprvw;
import java.util.Date;

public class sprgvl
implements sprvw {
    public sprrum cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprgvl(Date date, int n) {
        void arg1;
        void arg0;
        sprgvl sprgvl2 = this;
        sprgvl2.cfr_renamed_4 = new sprrum(new sprjfn((Date)arg0), sprfzl.cfr_renamed_4272((int)arg1));
    }

    public int cfr_renamed_4273() {
        if (this.cfr_renamed_4.cfr_renamed_4273() == null) {
            throw new IllegalStateException(sprfym.cfr_renamed_9("[\u000fN\u001eW\u000bN[N\u0014\u001a\u001c_\u000f\u001a\u001a\u001a\t_\u001aI\u0014T[M\u0013_\t_[T\u0014T\u001e\u001a\u0012I[[\r[\u0012V\u001aX\u0017_"));
        }
        return this.cfr_renamed_4.cfr_renamed_4273().cfr_renamed_97().intValue();
    }

    public sprgvl(sprrum sprrum2) {
        this.cfr_renamed_4 = sprrum2;
    }

    public boolean cfr_renamed_4275() {
        return this.cfr_renamed_4.cfr_renamed_4273() != null;
    }

    /*
     * WARNING - void declaration
     */
    public sprgvl(Date date) {
        void arg0;
        sprgvl sprgvl2 = this;
        sprgvl2.cfr_renamed_4 = new sprrum(new sprjfn((Date)arg0));
    }

    public Date cfr_renamed_4274() {
        return sprntl.cfr_renamed_10908(this.cfr_renamed_4.cfr_renamed_4274());
    }
}

