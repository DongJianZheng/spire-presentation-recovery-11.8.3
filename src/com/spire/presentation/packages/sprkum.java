/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdsm;
import com.spire.presentation.packages.spriom;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpdp;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprusc;
import com.spire.presentation.packages.sprvim;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprkum
extends sprqqe
implements sprlm {
    private sprco cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    public sprco cfr_renamed_19() {
        return this.cfr_renamed_4;
    }

    public static sprkum cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        if (!arg1) {
            throw new IllegalArgumentException(sprusc.cfr_renamed_9("N\u000ecHyOd\u0002}\u0003d\fd\u001ba\u0016-\u001bl\b- \u007f\u0006j\u0006c\u000ey\u0000\u007f&i\nc\u001bd\td\n\u007f \u007f$h\u0016"));
        }
        return sprkum.cfr_renamed_23(arg0.cfr_renamed_8225());
    }

    /*
     * WARNING - void declaration
     */
    public sprkum(spriom spriom2) {
        void arg0;
        sprkum sprkum2 = this;
        sprkum2.cfr_renamed_4 = new sprycn(false, 1, (sprco)arg0);
    }

    public sprdsm cfr_renamed_4024() {
        if (this.cfr_renamed_4 instanceof sprdsm) {
            return (sprdsm)this.cfr_renamed_4;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprkum(sprvim sprvim2) {
        void arg0;
        sprkum sprkum2 = this;
        sprkum2.cfr_renamed_4 = new sprycn(0 != 0, 0, (sprco)arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprkum(sproug sproug2) {
        this(new sprvim(arg0.cfr_renamed_186()));
        void arg0;
    }

    public sprkum(sprdsm sprdsm2) {
        this.cfr_renamed_4 = sprdsm2;
    }

    public sprkum(sprxgf sprxgf2) {
        this.cfr_renamed_4 = sprxgf2;
    }

    public static sprkum cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprkum) {
            return (sprkum)arg0;
        }
        if (arg0 instanceof sprdsm || arg0 instanceof sprszm) {
            return new sprkum(sprdsm.cfr_renamed_23(arg0));
        }
        if (arg0 instanceof sprnvm) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_6501(arg0, 128);
            if (sprnvm2.cfr_renamed_312() == 0) {
                return new sprkum(sprvim.cfr_renamed_5085(sprnvm2, false));
            }
            if (sprnvm2.cfr_renamed_312() == 1) {
                return new sprkum(spriom.cfr_renamed_5085(sprnvm2, false));
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprpdp.cfr_renamed_9("\u0006h9g#o+&\u0000t&a&h.r t\u0006b*h;o)o*t\u0000t\u0004c6<o")).append(arg0.getClass().getName()).toString());
    }

    public sprvim cfr_renamed_3955() {
        if (this.cfr_renamed_4 instanceof sprnvm && ((sprnvm)this.cfr_renamed_4).cfr_renamed_312() == 0) {
            return sprvim.cfr_renamed_5085((sprnvm)this.cfr_renamed_4, false);
        }
        return null;
    }

    public spriom cfr_renamed_4022() {
        if (this.cfr_renamed_4 instanceof sprnvm && ((sprnvm)this.cfr_renamed_4).cfr_renamed_312() == 1) {
            return spriom.cfr_renamed_5085((sprnvm)this.cfr_renamed_4, false);
        }
        return null;
    }
}

