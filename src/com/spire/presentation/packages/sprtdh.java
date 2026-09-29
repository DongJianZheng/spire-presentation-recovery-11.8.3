/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqvg;
import com.spire.presentation.packages.sprznj;
import java.math.BigInteger;

public class sprtdh
extends sprqvg {
    public static final sprtdh cfr_renamed_79;
    public static final sprtdh cfr_renamed_107;
    public static final sprtdh cfr_renamed_132;
    public static final sprtdh cfr_renamed_102;
    public static final sprtdh cfr_renamed_93;
    public static final sprtdh cfr_renamed_86;
    public static final sprtdh cfr_renamed_152;
    public static final sprtdh cfr_renamed_112;
    public static final sprtdh cfr_renamed_119;
    public static final sprtdh cfr_renamed_91;
    public static final sprtdh cfr_renamed_0;
    public static final sprtdh cfr_renamed_1;
    public static final sprtdh cfr_renamed_2;
    public static final sprtdh cfr_renamed_3;
    public static final sprtdh cfr_renamed_4;

    static {
        cfr_renamed_91 = new sprtdh(0);
        cfr_renamed_119 = new sprtdh(1);
        cfr_renamed_1 = new sprtdh(2);
        cfr_renamed_2 = new sprtdh(3);
        cfr_renamed_93 = new sprtdh(4);
        cfr_renamed_132 = new sprtdh(5);
        cfr_renamed_3 = new sprtdh(6);
        cfr_renamed_0 = new sprtdh(7);
        cfr_renamed_79 = new sprtdh(8);
        cfr_renamed_86 = new sprtdh(9);
        cfr_renamed_152 = new sprtdh(10);
        cfr_renamed_102 = new sprtdh(11);
        cfr_renamed_4 = new sprtdh(12);
        cfr_renamed_107 = new sprtdh(13);
        cfr_renamed_112 = new sprtdh(14);
    }

    public sprtdh(byte[] arg0) {
        sprtdh sprtdh2 = this;
        super(arg0);
        sprtdh2.cfr_renamed_8326();
    }

    public void cfr_renamed_8326() {
        if (this.cfr_renamed_97().intValue() < 0 || this.cfr_renamed_97().intValue() > 14) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprznj.cfr_renamed_9("qcnltd|-}cm`}\u007fyyqbv-nltx}-")).append(this.cfr_renamed_97()).toString());
        }
    }

    private /* synthetic */ sprtdh(sprqvg arg0) {
        sprtdh sprtdh2 = this;
        super(arg0.cfr_renamed_97());
        sprtdh2.cfr_renamed_8326();
    }

    public sprtdh(int arg0) {
        sprtdh sprtdh2 = this;
        super(arg0);
        sprtdh2.cfr_renamed_8326();
    }

    public sprtdh(BigInteger arg0) {
        sprtdh sprtdh2 = this;
        super(arg0);
        sprtdh2.cfr_renamed_8326();
    }

    public static sprtdh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtdh) {
            return (sprtdh)arg0;
        }
        if (arg0 != null) {
            return new sprtdh(sprqvg.cfr_renamed_23(arg0));
        }
        return null;
    }
}

