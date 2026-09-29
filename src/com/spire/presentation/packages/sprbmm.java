/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprlql;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxqr;
import com.spire.presentation.packages.sprycn;
import java.io.IOException;

public class sprbmm
extends sprqqe
implements sprlm {
    private byte[] cfr_renamed_91;
    private sprndm cfr_renamed_0;
    public static final int cfr_renamed_1 = -1;
    private byte[] cfr_renamed_2;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 1;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbmm(sprnvm sprnvm2) {
        void arg0;
        if (sprnvm2.cfr_renamed_312() == 0) {
            this.cfr_renamed_91 = sproug.cfr_renamed_5085((sprnvm)arg0, true).cfr_renamed_186();
            return;
        }
        if (arg0.cfr_renamed_312() == 1) {
            this.cfr_renamed_2 = sproug.cfr_renamed_5085((sprnvm)arg0, true).cfr_renamed_186();
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprlql.cfr_renamed_9("\u0012s\fs\bj\t=\u0013|\u0000=\th\n\u007f\u0002o]=")).append(arg0.cfr_renamed_312()).toString());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_91 != null) {
            return new sprycn(0, new sprfvg(this.cfr_renamed_91));
        }
        if (this.cfr_renamed_2 != null) {
            return new sprycn(1, new sprfvg(this.cfr_renamed_2));
        }
        return this.cfr_renamed_0.cfr_renamed_119();
    }

    public static sprbmm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprbmm) {
            return (sprbmm)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprbmm(sprndm.cfr_renamed_23(arg0));
        }
        if (arg0 instanceof sprnvm) {
            return new sprbmm((sprnvm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprxqr.cfr_renamed_9("9\u0001<\b7\f<M?\u000f:\b3\u0019p\u0004>M7\b$$>\u001e$\f>\u000e5Wp")).append(arg0.getClass().getName()).toString());
    }

    public int cfr_renamed_324() {
        if (this.cfr_renamed_0 != null) {
            return -1;
        }
        if (this.cfr_renamed_91 != null) {
            return 0;
        }
        return 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_4636() {
        if (this.cfr_renamed_0 != null) {
            try {
                return this.cfr_renamed_0.cfr_renamed_91();
            }
            catch (IOException iOException) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprlql.cfr_renamed_9("\u0004|\t:\u0013=\u0003x\u0004r\u0003xG~\u0002o\u0013t\u0001t\u0004|\u0013x]=")).append(iOException).toString());
            }
        }
        if (this.cfr_renamed_91 != null) {
            return sproze.cfr_renamed_158(this.cfr_renamed_91);
        }
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    public static sprbmm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        if (!arg1) {
            throw new IllegalArgumentException(sprxqr.cfr_renamed_9("3\u0005?\u00043\bp\u0004$\b=M=\u0018#\u0019p\u000f5M5\u0015 \u00019\u000e9\u0019<\u0014p\u00191\n7\b4"));
        }
        return sprbmm.cfr_renamed_23(arg0.cfr_renamed_8225());
    }

    /*
     * WARNING - void declaration
     */
    public sprbmm(int n, byte[] byArray) {
        this(new sprycn((int)arg0, new sprfvg((byte[])arg1)));
        void arg1;
        void arg0;
    }

    public sprbmm(sprndm sprndm2) {
        this.cfr_renamed_0 = sprndm2;
    }
}

