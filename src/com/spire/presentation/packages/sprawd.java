/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbfb;
import com.spire.presentation.packages.sprcud;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprmn;
import com.spire.presentation.packages.sprpfm;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprrrd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprzfe;

public class sprawd
implements sprmn {
    private boolean cfr_renamed_4;

    @Override
    public sprrj cfr_renamed_461() {
        return new sprawd(this.cfr_renamed_4);
    }

    public sprawd(boolean bl) {
        this.cfr_renamed_4 = bl;
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprawd sprawd2 = (sprawd)arg0;
        this.cfr_renamed_4 = sprawd2.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_3232(sprcud arg0, sprcyd arg1) throws sprrrd {
        sprcud sprcud2 = arg0;
        sprcud2.cfr_renamed_4247(sprtie.cfr_renamed_953);
        if (!sprcud2.cfr_renamed_4248()) {
            sprzfe sprzfe2 = sprzfe.cfr_renamed_2757(arg1.cfr_renamed_98());
            if (sprzfe2 != null) {
                if (!sprzfe2.cfr_renamed_4249(4)) {
                    throw new sprrrd(sprbfb.cfr_renamed_9("\u0006N<H*Oo^*O;T)T,\\;Xov*D\u001aN.Z*\u001d*E;X!N&R!\u001d+R*NoS IoM*O\"T;\u001d$X6\u001d<T(S&S("));
                }
            } else if (this.cfr_renamed_4) {
                throw new sprrrd(sprpfm.cfr_renamed_9("P9b\th=|9;9c(~2h5t2;2t(;,i9h9u(;5u|X\u001d;?~.o5}5x=o9"));
            }
        }
    }

    public sprawd() {
        this(true);
    }
}

