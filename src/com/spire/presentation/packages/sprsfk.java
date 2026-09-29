/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlnk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpgp;
import com.spire.presentation.packages.sprplaa;
import com.spire.presentation.packages.spruyh;
import com.spire.presentation.packages.spryye;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;

public final class sprsfk
extends spryye {
    public static final int cfr_renamed_2 = 56;
    public static final int cfr_renamed_3 = 56;
    private final byte[] cfr_renamed_4;

    private static /* synthetic */ byte[] cfr_renamed_9971(byte[] arg0) {
        if (arg0.length != 56) {
            throw new IllegalArgumentException(sprpgp.cfr_renamed_9("`P2T`\u0012*G4FgZ&D\"\u0012+W)U3Zg\u0007q"));
        }
        return arg0;
    }

    public sprsfk(byte[] byArray, int n) {
        super(true);
        this.cfr_renamed_4 = new byte[56];
        System.arraycopy(byArray, n, this.cfr_renamed_4, 0, 56);
    }

    public sprsfk(SecureRandom secureRandom) {
        sprsfk sprsfk2 = this;
        super(true);
        sprsfk2.cfr_renamed_4 = new byte[56];
        spruyh.cfr_renamed_8800(secureRandom, sprsfk2.cfr_renamed_4);
    }

    public void cfr_renamed_9972(sprlnk arg0, byte[] arg1, int arg2) {
        byte[] byArray = new byte[56];
        arg0.cfr_renamed_8007(byArray, 0);
        if (!spruyh.cfr_renamed_8880(this.cfr_renamed_4, 0, byArray, 0, arg1, arg2)) {
            throw new IllegalStateException(sprplaa.cfr_renamed_9("\u000ffcjw30 27:79&w46;;73"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprsfk(InputStream inputStream) throws IOException {
        super(true);
        void arg0;
        this.cfr_renamed_4 = new byte[56];
        if (56 != sprkqe.cfr_renamed_476((InputStream)arg0, this.cfr_renamed_4)) {
            throw new EOFException(sprpgp.cfr_renamed_9("\u0002}\u0001\u0012\"\\$]2\\3W5W#\u0012.\\g_.V#^\"\u0012(Tgjs\u0006\u007f\u00127@.D&F\"\u0012,W>"));
        }
    }

    public byte[] cfr_renamed_91() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public sprlnk cfr_renamed_9432() {
        byte[] byArray = new byte[56];
        spruyh.cfr_renamed_8735(this.cfr_renamed_4, 0, byArray, 0);
        return new sprlnk(byArray, 0);
    }

    public sprsfk(byte[] arg0) {
        this(sprsfk.cfr_renamed_9971(arg0), 0);
    }

    public void cfr_renamed_8007(byte[] arg0, int arg1) {
        System.arraycopy(this.cfr_renamed_4, 0, arg0, arg1, 56);
    }
}

