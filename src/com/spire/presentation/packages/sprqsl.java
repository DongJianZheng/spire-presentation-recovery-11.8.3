/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgvl;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhlm;
import com.spire.presentation.packages.spriol;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprntl;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrum;
import com.spire.presentation.packages.sprvqm;
import com.spire.presentation.packages.sprvw;
import com.spire.presentation.packages.spryrl;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class sprqsl {
    private sprvqm cfr_renamed_3;
    private sprhgm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprqsl(sprvqm sprvqm2) {
        void arg0;
        sprqsl sprqsl2 = this;
        sprqsl2.cfr_renamed_3 = arg0;
        sprqsl2.cfr_renamed_4 = sprvqm2.cfr_renamed_4271();
    }

    public Set cfr_renamed_665() {
        return sprntl.cfr_renamed_10879(this.cfr_renamed_4);
    }

    public boolean cfr_renamed_663() {
        return this.cfr_renamed_4 != null;
    }

    public Date cfr_renamed_2132() {
        return sprntl.cfr_renamed_10908(this.cfr_renamed_3.cfr_renamed_2132());
    }

    public sprvw cfr_renamed_2161() {
        sprhlm sprhlm2 = this.cfr_renamed_3.cfr_renamed_2161();
        if (sprhlm2.cfr_renamed_312() == 0) {
            return null;
        }
        if (sprhlm2.cfr_renamed_312() == 1) {
            return new sprgvl(sprrum.cfr_renamed_23(sprhlm2.cfr_renamed_648()));
        }
        return new spryrl();
    }

    public sprrdm cfr_renamed_5024(sprlem arg0) {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_5024(arg0);
        }
        return null;
    }

    public spriol cfr_renamed_4270() {
        return new spriol(this.cfr_renamed_3.cfr_renamed_4270());
    }

    public List cfr_renamed_583() {
        return sprntl.cfr_renamed_5274(this.cfr_renamed_4);
    }

    public Date cfr_renamed_2133() {
        if (this.cfr_renamed_3.cfr_renamed_2133() == null) {
            return null;
        }
        return sprntl.cfr_renamed_10908(this.cfr_renamed_3.cfr_renamed_2133());
    }

    public Set cfr_renamed_662() {
        return sprntl.cfr_renamed_10880(this.cfr_renamed_4);
    }
}

