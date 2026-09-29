/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprjjo;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class sprqpm
extends sprqqe {
    private sprjfn cfr_renamed_2;
    private sprupm cfr_renamed_3;
    private sprktm cfr_renamed_4;

    public sprjfn cfr_renamed_4606() {
        return this.cfr_renamed_2;
    }

    public sprnrm cfr_renamed_4607() {
        if (null == this.cfr_renamed_3 || this.cfr_renamed_3 instanceof sprnrm) {
            return (sprnrm)this.cfr_renamed_3;
        }
        return new sprnrm(this.cfr_renamed_3.cfr_renamed_314(), false);
    }

    public static sprqpm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqpm) {
            return (sprqpm)arg0;
        }
        if (arg0 != null) {
            return new sprqpm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprktm cfr_renamed_4605() {
        return this.cfr_renamed_4;
    }

    public sprupm cfr_renamed_11203() {
        return this.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprqpm(sprszm sprszm2) {
        sprnvm sprnvm2;
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        block5: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            sprnvm2 = (sprnvm)enumeration.nextElement();
            switch (sprnvm2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_3 = sprupm.cfr_renamed_5085(sprnvm2, true);
                    continue block5;
                }
                case 1: {
                    this.cfr_renamed_4 = sprktm.cfr_renamed_5085(sprnvm2, true);
                    continue block5;
                }
                case 2: {
                    this.cfr_renamed_2 = sprjfn.cfr_renamed_5085(sprnvm2, true);
                    continue block5;
                }
            }
            break;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjjo.cfr_renamed_9("S\u000fM\u000fI\u0016HAR\u0000AAH\u0014K\u0003C\u0013\u001cA")).append(sprnvm2.cfr_renamed_312()).toString());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_3));
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_4));
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 2, (sprco)this.cfr_renamed_2));
        }
        return new sprcen(sprrvm2);
    }
}

