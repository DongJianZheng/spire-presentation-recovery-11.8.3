/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprjog;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprutm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class sprikm
extends sprqqe {
    private sprnbm cfr_renamed_93;
    private sprnbm cfr_renamed_86;
    private sprgbf cfr_renamed_152;
    private sprutm cfr_renamed_112;
    private sprhgm cfr_renamed_119;
    private sprgbf cfr_renamed_91;
    private sprktm cfr_renamed_0;
    private sprszm cfr_renamed_1;
    private sprktm cfr_renamed_2;
    private sprvhm cfr_renamed_3;
    private sprddm cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprikm(sprszm arg0) {
        sprnvm sprnvm2;
        this.cfr_renamed_1 = arg0;
        Enumeration enumeration = this.cfr_renamed_1.cfr_renamed_329();
        block12: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            sprnvm2 = (sprnvm)enumeration.nextElement();
            switch (sprnvm2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_0 = sprktm.cfr_renamed_5085(sprnvm2, false);
                    continue block12;
                }
                case 1: {
                    this.cfr_renamed_2 = sprktm.cfr_renamed_5085(sprnvm2, false);
                    continue block12;
                }
                case 2: {
                    this.cfr_renamed_4 = sprddm.cfr_renamed_5085(sprnvm2, false);
                    continue block12;
                }
                case 3: {
                    this.cfr_renamed_93 = sprnbm.cfr_renamed_5085(sprnvm2, true);
                    continue block12;
                }
                case 4: {
                    this.cfr_renamed_112 = sprutm.cfr_renamed_23(sprszm.cfr_renamed_5085(sprnvm2, false));
                    continue block12;
                }
                case 5: {
                    this.cfr_renamed_86 = sprnbm.cfr_renamed_5085(sprnvm2, true);
                    continue block12;
                }
                case 6: {
                    this.cfr_renamed_3 = sprvhm.cfr_renamed_5085(sprnvm2, false);
                    continue block12;
                }
                case 7: {
                    this.cfr_renamed_91 = sprgbf.cfr_renamed_5085(sprnvm2, false);
                    continue block12;
                }
                case 8: {
                    this.cfr_renamed_152 = sprgbf.cfr_renamed_5085(sprnvm2, false);
                    continue block12;
                }
                case 9: {
                    this.cfr_renamed_119 = sprhgm.cfr_renamed_5085(sprnvm2, false);
                    continue block12;
                }
            }
            break;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjog.cfr_renamed_9("2w,w(n)93x #g")).append(sprnvm2.cfr_renamed_312()).toString());
    }

    public sprktm cfr_renamed_114() {
        return this.cfr_renamed_2;
    }

    public sprhgm cfr_renamed_98() {
        return this.cfr_renamed_119;
    }

    public sprgbf cfr_renamed_4509() {
        return this.cfr_renamed_91;
    }

    public static sprikm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprikm) {
            return (sprikm)arg0;
        }
        if (arg0 != null) {
            return new sprikm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprutm cfr_renamed_4821() {
        return this.cfr_renamed_112;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_3() {
        if (this.cfr_renamed_0 != null) {
            return this.cfr_renamed_0.cfr_renamed_5023();
        }
        return -1;
    }

    public sprddm cfr_renamed_4822() {
        return this.cfr_renamed_4;
    }

    public sprvhm cfr_renamed_1157() {
        return this.cfr_renamed_3;
    }

    public sprnbm cfr_renamed_102() {
        return this.cfr_renamed_93;
    }

    public sprgbf cfr_renamed_4823() {
        return this.cfr_renamed_152;
    }

    public sprnbm cfr_renamed_1485() {
        return this.cfr_renamed_86;
    }
}

