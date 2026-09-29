/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfcn;
import com.spire.presentation.packages.sprhno;
import com.spire.presentation.packages.sprian;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpfn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprwfn;
import com.spire.presentation.packages.sprwtz;
import com.spire.presentation.packages.sprxgf;

public class sprqhm
extends sprqqe
implements sprlm,
sprml {
    private sprml cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return ((sprco)((Object)this.cfr_renamed_4)).cfr_renamed_119();
    }

    private /* synthetic */ sprqhm(sprian sprian2) {
        this.cfr_renamed_4 = sprian2;
    }

    /*
     * WARNING - void declaration
     */
    public sprqhm(String string) {
        void arg0;
        sprqhm sprqhm2 = this;
        sprqhm2.cfr_renamed_4 = new spraen((String)arg0);
    }

    @Override
    public String cfr_renamed_314() {
        return this.cfr_renamed_4.cfr_renamed_314();
    }

    private /* synthetic */ sprqhm(sprwfn sprwfn2) {
        this.cfr_renamed_4 = sprwfn2;
    }

    private /* synthetic */ sprqhm(sprpfn sprpfn2) {
        this.cfr_renamed_4 = sprpfn2;
    }

    public static sprqhm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        if (!arg1) {
            throw new IllegalArgumentException(sprhno.cfr_renamed_9("\u0017-\u001b,\u0017 T,\u0000 \u0019e\u00190\u00071T'\u0011e\u0011=\u0004)\u001d&\u001d1\u0018<T1\u0015\"\u0013 \u0010"));
        }
        return sprqhm.cfr_renamed_23(arg0.cfr_renamed_8225());
    }

    public static sprqhm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprqhm) {
            return (sprqhm)arg0;
        }
        if (arg0 instanceof sprwfn) {
            return new sprqhm((sprwfn)arg0);
        }
        if (arg0 instanceof sprpfn) {
            return new sprqhm((sprpfn)arg0);
        }
        if (arg0 instanceof sprian) {
            return new sprqhm((sprian)arg0);
        }
        if (arg0 instanceof sprkgn) {
            return new sprqhm((sprkgn)arg0);
        }
        if (arg0 instanceof sprfcn) {
            return new sprqhm((sprfcn)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprwtz.cfr_renamed_9("}\tx\u0000s\u0004xE{\u0007~\u0000w\u00114\fzEs\u0000`,z\u0016`\u0004z\u0006q_4")).append(arg0.getClass().getName()).toString());
    }

    private /* synthetic */ sprqhm(sprkgn sprkgn2) {
        this.cfr_renamed_4 = sprkgn2;
    }

    private /* synthetic */ sprqhm(sprfcn sprfcn2) {
        this.cfr_renamed_4 = sprfcn2;
    }

    public String toString() {
        return this.cfr_renamed_4.cfr_renamed_314();
    }
}

