/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprwqm
extends sprqqe {
    public static final sprwqm cfr_renamed_79;
    public static final sprwqm cfr_renamed_107;
    public static final int cfr_renamed_132 = 6;
    public static final sprwqm cfr_renamed_102;
    public static final sprwqm cfr_renamed_93;
    public static final sprwqm cfr_renamed_86;
    public static final int cfr_renamed_152 = 2;
    public static final int cfr_renamed_112 = 4;
    public static final sprwqm cfr_renamed_119;
    public static final int cfr_renamed_91 = 1;
    public static final int cfr_renamed_0 = 3;
    public static final int cfr_renamed_1 = 0;
    public static final sprwqm cfr_renamed_2;
    public static final int cfr_renamed_3 = 5;
    private final sprktm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public static sprwqm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwqm) {
            return (sprwqm)arg0;
        }
        if (arg0 != null) {
            return new sprwqm(sprktm.cfr_renamed_23(arg0));
        }
        return null;
    }

    static {
        cfr_renamed_119 = new sprwqm(0);
        cfr_renamed_86 = new sprwqm(1);
        cfr_renamed_107 = new sprwqm(2);
        cfr_renamed_93 = new sprwqm(3);
        cfr_renamed_79 = new sprwqm(4);
        cfr_renamed_102 = new sprwqm(5);
        cfr_renamed_2 = new sprwqm(6);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprwqm(int n) {
        this(new sprktm((long)arg0));
        void arg0;
    }

    private /* synthetic */ sprwqm(sprktm sprktm2) {
        this.cfr_renamed_4 = sprktm2;
    }

    public BigInteger cfr_renamed_97() {
        return this.cfr_renamed_4.cfr_renamed_97();
    }
}

