/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjrh;
import com.spire.presentation.packages.sprkiaa;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprnuk;
import com.spire.presentation.packages.sprouaa;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.spryye;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;

public final class sprbyk
extends spryye {
    private sprnuk cfr_renamed_1;
    public static final int cfr_renamed_2 = 32;
    private final byte[] cfr_renamed_3;
    public static final int cfr_renamed_4 = 64;

    public sprbyk(byte[] arg0) {
        this(sprbyk.cfr_renamed_9971(arg0), 0);
    }

    /*
     * WARNING - void declaration
     */
    public sprbyk(InputStream inputStream) throws IOException {
        super(true);
        void arg0;
        this.cfr_renamed_3 = new byte[32];
        if (32 != sprkqe.cfr_renamed_476((InputStream)arg0, this.cfr_renamed_3)) {
            throw new EOFException(sprkiaa.cfr_renamed_9("]\u0000^o}!{ m!l*j*|oq!8\"q+|#}ow)8\n|}-z)v8?j&n.l*8$}6"));
        }
    }

    public void cfr_renamed_8007(byte[] arg0, int arg1) {
        System.arraycopy(this.cfr_renamed_3, 0, arg0, arg1, 32);
    }

    public sprbyk(SecureRandom secureRandom) {
        sprbyk sprbyk2 = this;
        super(true);
        sprbyk2.cfr_renamed_3 = new byte[32];
        sprjrh.cfr_renamed_8800(secureRandom, sprbyk2.cfr_renamed_3);
    }

    public byte[] cfr_renamed_91() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void cfr_renamed_9938(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        sprnuk sprnuk2 = this.cfr_renamed_9432();
        byte[] byArray = new byte[32];
        sprnuk2.cfr_renamed_8007(byArray, 0);
        switch (arg0) {
            case 0: {
                if (null != arg1) {
                    throw new IllegalArgumentException(sprouaa.cfr_renamed_9(" X;"));
                }
                sprjrh.cfr_renamed_8857(this.cfr_renamed_3, 0, byArray, 0, arg2, arg3, arg4, arg5, arg6);
                return;
            }
            case 1: {
                if (null == arg1) {
                    throw new NullPointerException(sprkiaa.cfr_renamed_9("?,l7?o{.v!w;8-}ov:t#"));
                }
                if (arg1.length > 255) {
                    throw new IllegalArgumentException(sprouaa.cfr_renamed_9(" X;"));
                }
                sprjrh.cfr_renamed_8809(this.cfr_renamed_3, 0, byArray, 0, arg1, arg2, arg3, arg4, arg5, arg6);
                return;
            }
            case 2: {
                if (null == arg1) {
                    throw new NullPointerException(sprkiaa.cfr_renamed_9("?,l7?o{.v!w;8-}ov:t#"));
                }
                if (arg1.length > 255) {
                    throw new IllegalArgumentException(sprouaa.cfr_renamed_9(" X;"));
                }
                if (64 != arg4) {
                    throw new IllegalArgumentException(sprkiaa.cfr_renamed_9("u<\u007f\u0003}!"));
                }
                sprjrh.cfr_renamed_8794(this.cfr_renamed_3, 0, byArray, 0, arg1, arg2, arg3, arg5, arg6);
                return;
            }
        }
        throw new IllegalArgumentException("algorithm");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprnuk cfr_renamed_9432() {
        byte[] byArray = this.cfr_renamed_3;
        synchronized (this.cfr_renamed_3) {
            if (null == this.cfr_renamed_1) {
                sprbyk sprbyk2 = this;
                this.cfr_renamed_1 = new sprnuk(sprjrh.cfr_renamed_8804(this.cfr_renamed_3, 0));
            }
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return this.cfr_renamed_1;
        }
    }

    public sprbyk(byte[] byArray, int n) {
        super(true);
        this.cfr_renamed_3 = new byte[32];
        System.arraycopy(byArray, n, this.cfr_renamed_3, 0, 32);
    }

    private static /* synthetic */ byte[] cfr_renamed_9971(byte[] arg0) {
        if (arg0.length != 32) {
            throw new IllegalArgumentException(sprouaa.cfr_renamed_9("dN6Jd\f.Y0XcD\"Z&\f/I-K7Dc\u001fq"));
        }
        return arg0;
    }

    public void cfr_renamed_9983(int arg0, sprnuk arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        this.cfr_renamed_9938(arg0, arg2, arg3, arg4, arg5, arg6, arg7);
    }
}

