/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdtd;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprmze;
import com.spire.presentation.packages.sprveh;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzmh;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class sprpxk
extends spryye {
    private final sprveh cfr_renamed_3;
    public static final int cfr_renamed_4 = 57;

    private static /* synthetic */ sprveh cfr_renamed_8042(byte[] arg0, int arg1) {
        sprveh sprveh2 = sprzmh.cfr_renamed_8810(arg0, arg1);
        if (sprveh2 == null) {
            throw new IllegalArgumentException(sprmze.cfr_renamed_9("2*-%7-?d+19(2'{/>="));
        }
        return sprveh2;
    }

    /*
     * WARNING - void declaration
     */
    public sprpxk(InputStream inputStream) throws IOException {
        super(false);
        void arg0;
        byte[] byArray = new byte[57];
        if (57 != sprkqe.cfr_renamed_476((InputStream)arg0, byArray)) {
            throw new EOFException(sprdtd.cfr_renamed_9("nGm(NfHg^f_mYmO(Bf\u000beBlOdN(Dn\u000bMO<\u001f0\u000bx^jGaH(@mR"));
        }
        this.cfr_renamed_3 = sprpxk.cfr_renamed_8042(byArray, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean cfr_renamed_9939(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        switch (arg0) {
            case 0: {
                if (null == arg1) {
                    throw new NullPointerException(sprmze.cfr_renamed_9("|'/<|d8%5*40{&>d517("));
                }
                if (arg1.length > 255) {
                    throw new IllegalArgumentException(sprdtd.cfr_renamed_9("H|S"));
                }
                return sprzmh.cfr_renamed_8771(arg5, arg6, this.cfr_renamed_3, arg1, arg2, arg3, arg4);
            }
            case 1: {
                if (null == arg1) {
                    throw new NullPointerException(sprmze.cfr_renamed_9("|'/<|d8%5*40{&>d517("));
                }
                if (arg1.length > 255) {
                    throw new IllegalArgumentException(sprdtd.cfr_renamed_9("H|S"));
                }
                if (64 != arg4) {
                    throw new IllegalArgumentException(sprmze.cfr_renamed_9("67<\b>*"));
                }
                return sprzmh.cfr_renamed_8803(arg5, arg6, this.cfr_renamed_3, arg1, arg2, arg3);
            }
        }
        throw new IllegalArgumentException("algorithm");
    }

    public byte[] cfr_renamed_91() {
        byte[] byArray = new byte[57];
        this.cfr_renamed_8007(byArray, 0);
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprpxk(sprveh sprveh2) {
        super(false);
        void arg0;
        if (sprveh2 == null) {
            throw new NullPointerException(sprdtd.cfr_renamed_9("/[}IdBk{gBf_/\u000bkJfEg_(Im\u000bf^dG"));
        }
        this.cfr_renamed_3 = arg0;
    }

    public sprpxk(byte[] arg0) {
        this(sprpxk.cfr_renamed_9971(arg0), 0);
    }

    private static /* synthetic */ byte[] cfr_renamed_9971(byte[] arg0) {
        if (arg0.length != 57) {
            throw new IllegalArgumentException(sprmze.cfr_renamed_9("c91=c{).7/d3%-!{(>*<03dns"));
        }
        return arg0;
    }

    public void cfr_renamed_8007(byte[] arg0, int arg1) {
        sprzmh.cfr_renamed_8797(this.cfr_renamed_3, arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprpxk(byte[] byArray, int n) {
        super(false);
        void arg1;
        this.cfr_renamed_3 = sprpxk.cfr_renamed_8042(byArray, (int)arg1);
    }
}

