/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sproel;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrgl;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprud;
import com.spire.presentation.packages.sprxxda;
import com.spire.presentation.packages.sprzdq;

public class sprrtk
implements spraq,
sprud {
    private final int cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private boolean cfr_renamed_0;
    private boolean cfr_renamed_1;
    private static final byte[] cfr_renamed_2 = new byte[100];
    private final int cfr_renamed_3;
    private final sproel cfr_renamed_4;

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, sprzdq.cfr_renamed_9("iVCx")).append(this.cfr_renamed_4.cfr_renamed_1315().substring(6)).toString();
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_3;
    }

    @Override
    public int cfr_renamed_3248() {
        return this.cfr_renamed_4.cfr_renamed_3248();
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_3;
    }

    @Override
    public int cfr_renamed_1199(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_1) {
            if (!this.cfr_renamed_0) {
                throw new IllegalStateException(sprxxda.cfr_renamed_9("*\u0019\u00007A:\u000e A=\u000f=\u0015=\u00008\b.\u00040"));
            }
            byte[] byArray = sprrgl.cfr_renamed_10112(arg2 * 8);
            this.cfr_renamed_4.cfr_renamed_1197(byArray, 0, byArray.length);
        }
        sprrtk sprrtk2 = this;
        int n = sprrtk2.cfr_renamed_4.cfr_renamed_1199(arg0, arg1, arg2);
        sprrtk2.cfr_renamed_41();
        return n;
    }

    @Override
    public int cfr_renamed_6410(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_1) {
            if (!this.cfr_renamed_0) {
                throw new IllegalStateException(sprzdq.cfr_renamed_9("iVCx\u0002uMo\u0002rLrVrCwKaG\u007f"));
            }
            byte[] byArray = sprrgl.cfr_renamed_10112(0L);
            this.cfr_renamed_4.cfr_renamed_1197(byArray, 0, byArray.length);
            this.cfr_renamed_1 = false;
        }
        return this.cfr_renamed_4.cfr_renamed_6410(arg0, arg1, arg2);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) throws IllegalStateException {
        if (!this.cfr_renamed_0) {
            throw new IllegalStateException(sprxxda.cfr_renamed_9("*\u0019\u00007A:\u000e A=\u000f=\u0015=\u00008\b.\u00040"));
        }
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

    private /* synthetic */ void cfr_renamed_10113(byte[] arg0, int arg1) {
        byte[] byArray = sprrgl.cfr_renamed_10114(arg1);
        this.cfr_renamed_1197(byArray, 0, byArray.length);
        byte[] byArray2 = sprrtk.cfr_renamed_485(arg0);
        this.cfr_renamed_1197(byArray2, 0, byArray2.length);
        int n = arg1 - (byArray.length + byArray2.length) % arg1;
        if (n > 0 && n != arg1) {
            int n2 = n;
            while (n2 > cfr_renamed_2.length) {
                this.cfr_renamed_1197(cfr_renamed_2, 0, cfr_renamed_2.length);
                n2 = n - cfr_renamed_2.length;
            }
            this.cfr_renamed_1197(cfr_renamed_2, 0, n);
        }
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) throws IllegalArgumentException {
        sprtpk sprtpk2 = (sprtpk)arg0;
        this.cfr_renamed_91 = sproze.cfr_renamed_158(sprtpk2.cfr_renamed_1521());
        this.cfr_renamed_0 = true;
        this.cfr_renamed_41();
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprddl, IllegalStateException {
        if (this.cfr_renamed_1) {
            if (!this.cfr_renamed_0) {
                throw new IllegalStateException(sprzdq.cfr_renamed_9("iVCx\u0002uMo\u0002rLrVrCwKaG\u007f"));
            }
            sprrtk sprrtk2 = this;
            byte[] byArray = sprrgl.cfr_renamed_10112(sprrtk2.cfr_renamed_2404() * 8);
            sprrtk2.cfr_renamed_4.cfr_renamed_1197(byArray, 0, byArray.length);
        }
        sprrtk sprrtk3 = this;
        int n = sprrtk3.cfr_renamed_4.cfr_renamed_1199(arg0, arg1, this.cfr_renamed_2404());
        sprrtk3.cfr_renamed_41();
        return n;
    }

    private static /* synthetic */ byte[] cfr_renamed_485(byte[] arg0) {
        return sproze.cfr_renamed_543(sprrgl.cfr_renamed_10114(arg0.length * 8), arg0);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalStateException {
        if (!this.cfr_renamed_0) {
            throw new IllegalStateException(sprxxda.cfr_renamed_9("*\u0019\u00007A:\u000e A=\u000f=\u0015=\u00008\b.\u00040"));
        }
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void cfr_renamed_41() {
        v0 = this;
        v0.cfr_renamed_4.cfr_renamed_41();
        if (v0.cfr_renamed_91 == null) ** GOTO lbl11
        if (this.cfr_renamed_119 == 128) {
            v1 = this;
            v2 = v1;
            v1.cfr_renamed_10113(v1.cfr_renamed_91, 168);
        } else {
            v3 = this;
            v3.cfr_renamed_10113(v3.cfr_renamed_91, 136);
lbl11:
            // 2 sources

            v2 = this;
        }
        v2.cfr_renamed_1 = true;
    }

    /*
     * WARNING - void declaration
     */
    public sprrtk(int n, byte[] byArray) {
        void arg1;
        void arg0;
        sprrtk sprrtk2 = this;
        sprrtk sprrtk3 = this;
        sprrtk3.cfr_renamed_4 = new sproel((int)arg0, sprkoe.cfr_renamed_433(sprzdq.cfr_renamed_9("iVCx")), (byte[])arg1);
        sprrtk2.cfr_renamed_119 = arg0;
        sprrtk2.cfr_renamed_3 = n * 2 / 8;
    }
}

