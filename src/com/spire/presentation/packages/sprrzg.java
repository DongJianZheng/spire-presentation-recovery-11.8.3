/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrpja;
import com.spire.presentation.packages.sprvfk;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprrzg
extends sprqqe
implements sprlm {
    public final sprco cfr_renamed_2;
    public final int cfr_renamed_3;
    public static final int cfr_renamed_4 = 0;

    public static sprrzg cfr_renamed_8223(byte[] arg0) {
        if (arg0.length != 16) {
            throw new IllegalArgumentException(sprvfk.cfr_renamed_9("rCpAjN>KkUj\u0006|C>\u0017("));
        }
        return new sprrzg(0, new sprfvg(arg0));
    }

    public sprco cfr_renamed_8224() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprrzg(sprnvm sprnvm2) {
        sprrzg sprrzg2 = this;
        sprrzg2.cfr_renamed_3 = sprnvm2.cfr_renamed_312();
        switch (sprrzg2.cfr_renamed_3) {
            case 0: {
                void arg0;
                this.cfr_renamed_2 = sprfvg.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprrpja.cfr_renamed_9(",\u001b3\u0014)\u001c!U&\u001d*\u001c&\u0010e\u0003$\u00190\u0010e")).append(this.cfr_renamed_3).toString());
    }

    public static sprrzg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrzg) {
            return (sprrzg)arg0;
        }
        if (arg0 != null) {
            return new sprrzg(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrzg sprrzg2 = this;
        return new sprycn(sprrzg2.cfr_renamed_3, sprrzg2.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public sprrzg(int n, sprco sprco2) {
        void arg0;
        sprrzg sprrzg2 = this;
        sprrzg2.cfr_renamed_3 = arg0;
        sprrzg2.cfr_renamed_2 = sprco2;
    }

    public static sprrzg cfr_renamed_8226(sproug arg0) {
        return sprrzg.cfr_renamed_8223(arg0.cfr_renamed_186());
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_3;
    }
}

