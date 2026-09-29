/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhna;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprreaa;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;

public class spruke
extends sprkra {
    private sprooe cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public static spruke cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof spruke) {
            return (spruke)arg0;
        }
        if (arg0 instanceof sprooe) {
            return new spruke((sprooe)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprreaa.cfr_renamed_9("/\u0001\u0010\u000e\n\u0006\u0002O\"'6\u001a\u0004\u0003\u000f\f-\n\u001fUF")).append(arg0.getClass().getName()).toString());
    }

    public static spruke cfr_renamed_341(spryte arg0, boolean arg1) {
        return spruke.cfr_renamed_23(sprooe.cfr_renamed_341(arg0, arg1));
    }

    public sprooe spr\u3181() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public spruke(sprooe sprooe2) {
        void arg0;
        if (sprooe2 == null) {
            throw new IllegalArgumentException(sprhna.cfr_renamed_9("4\u00014Xp\u0019}\u0016|\f3\u001avX}\r\u007f\u0014"));
        }
        this.cfr_renamed_4 = arg0;
    }
}

