/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprefm;
import com.spire.presentation.packages.sprjhm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpsh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruwl;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprhem
extends sprqqe {
    public sprjhm cfr_renamed_2;
    public spraem cfr_renamed_3;
    public sprefm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_2));
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_4));
        }
        return new sprcen(sprrvm2);
    }

    public sprefm cfr_renamed_409() {
        return this.cfr_renamed_4;
    }

    public sprhem(spraem arg0) {
        this(arg0, null, null);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhem(sprszm sprszm2) {
        int n;
        void arg0;
        if (sprszm2.cfr_renamed_84() > 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprpsh.cfr_renamed_9("4j\u0012+\u0005n\u0007~\u0013e\u0015nVx\u001fq\u00131V")).append(arg0.cfr_renamed_84()).toString());
        }
        int n2 = 0;
        if (!(arg0.cfr_renamed_85(0) instanceof sprnvm)) {
            this.cfr_renamed_3 = spraem.cfr_renamed_23(arg0.cfr_renamed_85(0));
        }
        int n3 = n = ++n2;
        while (n3 != arg0.cfr_renamed_84()) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            if (sprnvm2.cfr_renamed_312() == 0) {
                this.cfr_renamed_2 = sprjhm.cfr_renamed_5085(sprnvm2, false);
            } else if (sprnvm2.cfr_renamed_312() == 1) {
                this.cfr_renamed_4 = sprefm.cfr_renamed_5085(sprnvm2, false);
            } else {
                throw new IllegalArgumentException(new StringBuilder().insert(0, spruwl.cfr_renamed_9("A@g\u0001w@d\u0001mTnCfS9\u0001")).append(sprnvm2.cfr_renamed_312()).toString());
            }
            n3 = ++n;
        }
    }

    public sprhem(spraem arg0, sprefm arg1) {
        this(arg0, null, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprhem(spraem spraem2, sprjhm sprjhm2, sprefm sprefm2) {
        void arg1;
        void arg0;
        sprhem sprhem2 = this;
        this.cfr_renamed_3 = arg0;
        sprhem2.cfr_renamed_2 = arg1;
        sprhem2.cfr_renamed_4 = sprefm2;
    }

    public sprhem(spraem arg0, sprjhm arg1) {
        this(arg0, arg1, null);
    }

    public static sprhem cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhem) {
            return (sprhem)arg0;
        }
        if (arg0 != null) {
            return new sprhem(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprjhm cfr_renamed_404() {
        return this.cfr_renamed_2;
    }

    public spraem cfr_renamed_403() {
        return this.cfr_renamed_3;
    }

    public static sprhem cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprhem.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }
}

