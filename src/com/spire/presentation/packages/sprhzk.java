/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprboj;
import com.spire.presentation.packages.sprdua;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxk;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzmh;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;

public final class sprhzk
extends spryye {
    public static final int cfr_renamed_1 = 57;
    private sprpxk cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    public static final int cfr_renamed_4 = 114;

    /*
     * WARNING - void declaration
     */
    public sprhzk(InputStream inputStream) throws IOException {
        super(true);
        void arg0;
        this.cfr_renamed_3 = new byte[57];
        if (57 != sprkqe.cfr_renamed_476((InputStream)arg0, this.cfr_renamed_3)) {
            throw new EOFException(sprdua.cfr_renamed_9("&\u000b%d\u0006*\u0000+\u0016*\u0017!\u0011!\u0007d\n*C)\n \u0007(\u0006d\f\"C\u0001\u0007pW|C4\u0011-\u0015%\u0017!C/\u0006="));
        }
    }

    private static /* synthetic */ byte[] cfr_renamed_9971(byte[] arg0) {
        if (arg0.length != 57) {
            throw new IllegalArgumentException(sprboj.cfr_renamed_9("-J\u007fN-\bg]y\\*@k^o\bfMdO~@*\u001d="));
        }
        return arg0;
    }

    public byte[] cfr_renamed_91() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public sprhzk(SecureRandom secureRandom) {
        sprhzk sprhzk2 = this;
        super(true);
        sprhzk2.cfr_renamed_3 = new byte[57];
        sprzmh.cfr_renamed_8800(secureRandom, sprhzk2.cfr_renamed_3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void cfr_renamed_9938(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        sprpxk sprpxk2 = this.cfr_renamed_9432();
        byte[] byArray = new byte[57];
        sprpxk2.cfr_renamed_8007(byArray, 0);
        switch (arg0) {
            case 0: {
                if (null == arg1) {
                    throw new NullPointerException(sprdua.cfr_renamed_9("D'\u0017<Dd\u0000%\r*\f0C&\u0006d\r1\u000f("));
                }
                if (arg1.length > 255) {
                    throw new IllegalArgumentException(sprboj.cfr_renamed_9("i\\r"));
                }
                sprzmh.cfr_renamed_8809(this.cfr_renamed_3, 0, byArray, 0, arg1, arg2, arg3, arg4, arg5, arg6);
                return;
            }
            case 1: {
                if (null == arg1) {
                    throw new NullPointerException(sprdua.cfr_renamed_9("D'\u0017<Dd\u0000%\r*\f0C&\u0006d\r1\u000f("));
                }
                if (arg1.length > 255) {
                    throw new IllegalArgumentException(sprboj.cfr_renamed_9("i\\r"));
                }
                if (64 != arg4) {
                    throw new IllegalArgumentException(sprdua.cfr_renamed_9("\u000e7\u0004\b\u0006*"));
                }
                sprzmh.cfr_renamed_8794(this.cfr_renamed_3, 0, byArray, 0, arg1, arg2, arg3, arg5, arg6);
                return;
            }
        }
        throw new IllegalArgumentException("algorithm");
    }

    public void cfr_renamed_9982(int arg0, sprpxk arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        this.cfr_renamed_9938(arg0, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public void cfr_renamed_8007(byte[] arg0, int arg1) {
        System.arraycopy(this.cfr_renamed_3, 0, arg0, arg1, 57);
    }

    public sprhzk(byte[] arg0) {
        this(sprhzk.cfr_renamed_9971(arg0), 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprpxk cfr_renamed_9432() {
        byte[] byArray = this.cfr_renamed_3;
        synchronized (this.cfr_renamed_3) {
            if (null == this.cfr_renamed_2) {
                sprhzk sprhzk2 = this;
                this.cfr_renamed_2 = new sprpxk(sprzmh.cfr_renamed_8804(this.cfr_renamed_3, 0));
            }
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return this.cfr_renamed_2;
        }
    }

    public sprhzk(byte[] byArray, int n) {
        super(true);
        this.cfr_renamed_3 = new byte[57];
        System.arraycopy(byArray, n, this.cfr_renamed_3, 0, 57);
    }
}

