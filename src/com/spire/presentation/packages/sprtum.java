/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcul;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprjhm;
import com.spire.presentation.packages.sprldn;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpaz;
import com.spire.presentation.packages.sprpfn;
import com.spire.presentation.packages.sprqhm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class sprtum
extends sprqqe {
    private String cfr_renamed_1;
    private sprigm cfr_renamed_2;
    private sprjhm cfr_renamed_3;
    private sprqhm cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprtum(sprszm sprszm2) {
        sprnvm sprnvm2;
        void arg0;
        if (sprszm2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprpaz.cfr_renamed_9("f @aW$U4A/G$\u00042M;A{\u0004")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        block5: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            sprnvm2 = sprnvm.cfr_renamed_6501(enumeration.nextElement(), 128);
            switch (sprnvm2.cfr_renamed_312()) {
                case 1: {
                    this.cfr_renamed_1 = sprpfn.cfr_renamed_5085(sprnvm2, true).cfr_renamed_314();
                    continue block5;
                }
                case 2: {
                    this.cfr_renamed_4 = sprqhm.cfr_renamed_5085(sprnvm2, true);
                    continue block5;
                }
                case 3: {
                    sprqqe sprqqe2 = sprnvm2.cfr_renamed_8225();
                    sprtum sprtum2 = this;
                    if (sprqqe2 instanceof sprnvm) {
                        sprtum2.cfr_renamed_2 = sprigm.cfr_renamed_23(sprqqe2);
                        continue block5;
                    }
                    sprtum2.cfr_renamed_3 = sprjhm.cfr_renamed_23(sprqqe2);
                    continue block5;
                }
            }
            break;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprcul.cfr_renamed_9("Y\u0002\u007fCo\u0002|Cu\u0016v\u0001~\u0011!C")).append(sprnvm2.cfr_renamed_312()).toString());
    }

    public static sprtum cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprtum) {
            return (sprtum)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprtum((sprszm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprpaz.cfr_renamed_9("M-H$C HaK#N$G5\u0004(JaC$P\bJ2P J\"A{\u0004")).append(arg0.getClass().getName()).toString());
    }

    public sprjhm cfr_renamed_4626() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        if (this.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)new sprldn(this.cfr_renamed_1, true)));
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 2, (sprco)this.cfr_renamed_4));
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 3, (sprco)this.cfr_renamed_2));
        } else {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 3, (sprco)this.cfr_renamed_3));
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprtum(String string, sprqhm sprqhm2, sprjhm sprjhm2) {
        void arg1;
        void arg0;
        sprtum sprtum2 = this;
        sprtum sprtum3 = this;
        sprtum3.cfr_renamed_1 = arg0;
        sprtum3.cfr_renamed_4 = arg1;
        sprtum2.cfr_renamed_2 = null;
        sprtum2.cfr_renamed_3 = sprjhm2;
    }

    public sprqhm cfr_renamed_4625() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprtum(String string, sprqhm sprqhm2, sprigm sprigm2) {
        void arg2;
        void arg1;
        void arg0;
        sprtum sprtum2 = this;
        sprtum sprtum3 = this;
        sprtum3.cfr_renamed_1 = arg0;
        sprtum3.cfr_renamed_4 = arg1;
        sprtum2.cfr_renamed_2 = arg2;
        sprtum2.cfr_renamed_3 = null;
    }

    public String cfr_renamed_4624() {
        return this.cfr_renamed_1;
    }

    public sprigm cfr_renamed_4623() {
        return this.cfr_renamed_2;
    }
}

