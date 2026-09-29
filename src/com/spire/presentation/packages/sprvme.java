/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprvva;
import java.math.BigInteger;

public class sprvme
extends sprkra {
    public static final int cfr_renamed_79 = 3;
    public static final sprvme cfr_renamed_107;
    public static final int cfr_renamed_132 = 2;
    public static final sprvme cfr_renamed_102;
    public static final sprvme cfr_renamed_93;
    public static final int cfr_renamed_86 = 0;
    public static final int cfr_renamed_152 = 6;
    public static final sprvme cfr_renamed_112;
    public static final int cfr_renamed_119 = 1;
    public static final sprvme cfr_renamed_91;
    private sprooe cfr_renamed_0;
    public static final int cfr_renamed_1 = 5;
    public static final sprvme cfr_renamed_2;
    public static final sprvme cfr_renamed_3;
    public static final int cfr_renamed_4 = 4;

    private /* synthetic */ sprvme(sprooe sprooe2) {
        this.cfr_renamed_0 = sprooe2;
    }

    public static sprvme cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvme) {
            return (sprvme)arg0;
        }
        if (arg0 != null) {
            return new sprvme(sprooe.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprvme(int n) {
        this(new sprooe((long)arg0));
        void arg0;
    }

    static {
        cfr_renamed_112 = new sprvme(0);
        cfr_renamed_91 = new sprvme(1);
        cfr_renamed_102 = new sprvme(2);
        cfr_renamed_107 = new sprvme(3);
        cfr_renamed_3 = new sprvme(4);
        cfr_renamed_2 = new sprvme(5);
        cfr_renamed_93 = new sprvme(6);
    }

    public BigInteger cfr_renamed_97() {
        return this.cfr_renamed_0.cfr_renamed_97();
    }
}

