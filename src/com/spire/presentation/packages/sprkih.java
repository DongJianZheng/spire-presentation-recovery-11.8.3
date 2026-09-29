/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpzz;
import com.spire.presentation.packages.sprqvg;
import java.math.BigInteger;

public class sprkih
extends sprqvg {
    public static final sprkih cfr_renamed_107;
    public static final sprkih cfr_renamed_132;
    public static final sprkih cfr_renamed_102;
    public static final sprkih cfr_renamed_93;
    public static final sprkih cfr_renamed_86;
    public static final sprkih cfr_renamed_152;
    public static final sprkih cfr_renamed_112;
    public static final sprkih cfr_renamed_119;
    public static final sprkih cfr_renamed_91;
    public static final sprkih cfr_renamed_0;
    public static final sprkih cfr_renamed_1;
    public static final sprkih cfr_renamed_2;
    public static final sprkih cfr_renamed_3;
    public static final sprkih cfr_renamed_4;

    public void cfr_renamed_8326() {
        if (this.cfr_renamed_97().intValue() < 0 || this.cfr_renamed_97().intValue() > 13) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprpzz.cfr_renamed_9("4Z+U1]9\u00148Z(Y8F<@4[3\u0014+U1A8\u0014")).append(this.cfr_renamed_97()).toString());
        }
    }

    public sprkih(byte[] arg0) {
        sprkih sprkih2 = this;
        super(arg0);
        sprkih2.cfr_renamed_8326();
    }

    private /* synthetic */ sprkih(sprqvg arg0) {
        this(arg0.cfr_renamed_97());
    }

    public sprkih(int arg0) {
        sprkih sprkih2 = this;
        super(arg0);
        sprkih2.cfr_renamed_8326();
    }

    public sprkih(BigInteger arg0) {
        sprkih sprkih2 = this;
        super(arg0);
        sprkih2.cfr_renamed_8326();
    }

    public static sprkih cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkih) {
            return (sprkih)arg0;
        }
        if (arg0 != null) {
            return new sprkih(sprqvg.cfr_renamed_23(arg0));
        }
        return null;
    }

    static {
        cfr_renamed_112 = new sprkih(0);
        cfr_renamed_107 = new sprkih(1);
        cfr_renamed_1 = new sprkih(2);
        cfr_renamed_102 = new sprkih(3);
        cfr_renamed_4 = new sprkih(4);
        cfr_renamed_2 = new sprkih(5);
        cfr_renamed_0 = new sprkih(6);
        cfr_renamed_93 = new sprkih(7);
        cfr_renamed_132 = new sprkih(8);
        cfr_renamed_119 = new sprkih(9);
        cfr_renamed_152 = new sprkih(10);
        cfr_renamed_91 = new sprkih(11);
        cfr_renamed_86 = new sprkih(12);
        cfr_renamed_3 = new sprkih(13);
    }
}

