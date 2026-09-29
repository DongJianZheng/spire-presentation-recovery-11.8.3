/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfwe;
import com.spire.presentation.packages.sprhsh;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrdaa;
import com.spire.presentation.packages.sprwgk;
import com.spire.presentation.packages.spryye;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;

public final class spruek
extends spryye {
    public static final int cfr_renamed_2 = 32;
    public static final int cfr_renamed_3 = 32;
    private final byte[] cfr_renamed_4;

    public void cfr_renamed_8007(byte[] arg0, int arg1) {
        System.arraycopy(this.cfr_renamed_4, 0, arg0, arg1, 32);
    }

    public void cfr_renamed_9973(sprwgk arg0, byte[] arg1, int arg2) {
        byte[] byArray = new byte[32];
        arg0.cfr_renamed_8007(byArray, 0);
        if (!sprhsh.cfr_renamed_8880(this.cfr_renamed_4, 0, byArray, 0, arg1, arg2)) {
            throw new IllegalStateException(sprrdaa.cfr_renamed_9("Sy>~:r+*l9n.f.e?+-j\"g.o"));
        }
    }

    private static /* synthetic */ byte[] cfr_renamed_9971(byte[] arg0) {
        if (arg0.length != 32) {
            throw new IllegalArgumentException(sprfwe.cfr_renamed_9(")I{M)\u000bc^}_.Co]k\u000bbN`LzC.\u0018<"));
        }
        return arg0;
    }

    public spruek(byte[] arg0) {
        this(spruek.cfr_renamed_9971(arg0), 0);
    }

    /*
     * WARNING - void declaration
     */
    public spruek(InputStream inputStream) throws IOException {
        super(true);
        void arg0;
        this.cfr_renamed_4 = new byte[32];
        if (32 != sprkqe.cfr_renamed_476((InputStream)arg0, this.cfr_renamed_4)) {
            throw new EOFException(sprrdaa.cfr_renamed_9("N\u0004Mkn%h$~%\u007f.y.okb%+&b/o'nkd-+\u00139~>z2k{9b=j?nk`.r"));
        }
    }

    public sprwgk cfr_renamed_9432() {
        byte[] byArray = new byte[32];
        sprhsh.cfr_renamed_8735(this.cfr_renamed_4, 0, byArray, 0);
        return new sprwgk(byArray, 0);
    }

    public spruek(byte[] byArray, int n) {
        super(true);
        this.cfr_renamed_4 = new byte[32];
        System.arraycopy(byArray, n, this.cfr_renamed_4, 0, 32);
    }

    public byte[] cfr_renamed_91() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public spruek(SecureRandom secureRandom) {
        spruek spruek2 = this;
        super(true);
        spruek2.cfr_renamed_4 = new byte[32];
        sprhsh.cfr_renamed_8800(secureRandom, spruek2.cfr_renamed_4);
    }
}

