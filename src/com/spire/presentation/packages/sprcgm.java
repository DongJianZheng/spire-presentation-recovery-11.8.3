/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcoca;
import com.spire.presentation.packages.sprfan;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzyfa;

public class sprcgm
extends sprqqe
implements sprlm {
    private sprxgf cfr_renamed_4;

    public boolean cfr_renamed_2317() {
        return this.cfr_renamed_4 instanceof sprlem;
    }

    public static sprcgm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        if (!arg1) {
            throw new IllegalArgumentException(sprzyfa.cfr_renamed_9("<\u00030\u0002<\u000e\u007f\u0002+\u000e2K2\u001e,\u001f\u007f\t:K:\u0013/\u00076\b6\u001f3\u0012\u007f\u001f>\f8\u000e;"));
        }
        return sprcgm.cfr_renamed_23(arg0.cfr_renamed_8225());
    }

    public boolean cfr_renamed_2320() {
        return this.cfr_renamed_4 instanceof sprfan;
    }

    public sprxgf cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ sprcgm(sprxgf sprxgf2) {
        sprcgm sprcgm2 = this;
        sprcgm2.cfr_renamed_4 = null;
        sprcgm2.cfr_renamed_4 = sprxgf2;
    }

    public sprcgm(sprfan sprfan2) {
        sprcgm sprcgm2 = this;
        sprcgm2.cfr_renamed_4 = null;
        sprcgm2.cfr_renamed_4 = sprfan2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public sprcgm(sprlem sprlem2) {
        sprcgm sprcgm2 = this;
        sprcgm2.cfr_renamed_4 = null;
        sprcgm2.cfr_renamed_4 = sprlem2;
    }

    public sprcgm(sprhfm sprhfm2) {
        sprcgm sprcgm2 = this;
        sprcgm2.cfr_renamed_4 = null;
        sprcgm2.cfr_renamed_4 = sprhfm2.cfr_renamed_119();
    }

    public static sprcgm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprcgm) {
            return (sprcgm)arg0;
        }
        if (arg0 instanceof sprxgf) {
            return new sprcgm((sprxgf)arg0);
        }
        if (arg0 instanceof byte[]) {
            try {
                return new sprcgm(sprxgf.cfr_renamed_184((byte[])arg0));
            }
            catch (Exception exception) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprcoca.cfr_renamed_9("\u0001T\u0015X\u0018_TN\u001b\u001a\u0004[\u0006I\u0011\u001a\u0011T\u0017U\u0010_\u0010\u001a\u0010[\u0000[N\u001a")).append(exception.getMessage()).toString());
            }
        }
        throw new IllegalArgumentException(sprzyfa.cfr_renamed_9("*\u00054\u00050\u001c1K0\t5\u000e<\u001f\u007f\u00021K8\u000e+\"1\u0018+\n1\b:Cv"));
    }
}

