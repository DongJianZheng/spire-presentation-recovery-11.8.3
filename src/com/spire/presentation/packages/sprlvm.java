/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprasy;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spredn;
import com.spire.presentation.packages.sprfdn;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprfvo;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprkdn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqcn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprlvm
extends sprqqe
implements sprgz {
    private final boolean cfr_renamed_126;
    private final sprco cfr_renamed_88;
    private final sprlem cfr_renamed_31;

    /*
     * Unable to fully structure code
     */
    @Override
    public sprxgf cfr_renamed_119() {
        var1_1 = new sprrvm(2);
        v0 = this;
        var1_1.cfr_renamed_5004(v0.cfr_renamed_31);
        if (v0.cfr_renamed_88 == null) ** GOTO lbl12
        if (this.cfr_renamed_126) {
            v1 = this;
            var1_1.cfr_renamed_5004(new spredn(0, this.cfr_renamed_88));
        } else {
            var1_1.cfr_renamed_5004(new sprkdn(0, this.cfr_renamed_88));
lbl12:
            // 2 sources

            v1 = this;
        }
        if (v1.cfr_renamed_126) {
            return new sprfdn(var1_1);
        }
        return new sprqcn(var1_1);
    }

    public sprlem cfr_renamed_696() {
        return this.cfr_renamed_31;
    }

    public static sprlvm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprlvm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public static sprlvm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprlvm) {
            return (sprlvm)arg0;
        }
        if (arg0 != null) {
            return new sprlvm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprlvm(sprlem arg0, sprco arg1) {
        this.cfr_renamed_31 = arg0;
        this.cfr_renamed_88 = arg1;
        if (this.cfr_renamed_88 != null) {
            sprxgf sprxgf2 = arg1.cfr_renamed_119();
            this.cfr_renamed_126 = sprxgf2 instanceof sprfvg || sprxgf2 instanceof sprfdn || sprxgf2 instanceof sprcen;
            return;
        }
        this.cfr_renamed_126 = true;
    }

    public boolean cfr_renamed_11327() {
        return this.cfr_renamed_126;
    }

    public sprco cfr_renamed_480() {
        return this.cfr_renamed_88;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprlvm(sprszm sprszm2) {
        sprlvm sprlvm2;
        void arg0;
        if (sprszm2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprasy.cfr_renamed_9("j4Lu[0Y M;K0\b&A/Mo\b")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_31 = (sprlem)arg0.cfr_renamed_85(0);
        if (arg0.cfr_renamed_84() > 1) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_6501(arg0.cfr_renamed_85(1), 128);
            if (!sprnvm2.cfr_renamed_4567() || sprnvm2.cfr_renamed_312() != 0) {
                throw new IllegalArgumentException(sprfvo.cfr_renamed_9("o\u001dI\\Y\u001dJ\\K\u0013_\\\n\u001fB\u0012Y\u0019C\b\n"));
            }
            sprlvm2 = this;
            this.cfr_renamed_88 = sprnvm2.cfr_renamed_8225();
        } else {
            sprlvm2 = this;
            this.cfr_renamed_88 = null;
        }
        sprlvm2.cfr_renamed_126 = !(arg0 instanceof sprqcn);
    }
}

