/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbcq;
import com.spire.presentation.packages.sprbfn;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sproen;
import java.io.IOException;

public class sprwwm
extends sprgbf {
    private final sprgbf[] cfr_renamed_2;
    private final int cfr_renamed_3;
    private static final int cfr_renamed_4 = 1000;

    public sprwwm(sprgbf[] arg0) {
        this(arg0, 1000);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static byte[] cfr_renamed_11290(sprgbf[] arg0) {
        int n;
        int n2;
        int n3 = arg0.length;
        switch (n3) {
            case 0: {
                byte[] byArray = new byte[1];
                byArray[0] = 0;
                return byArray;
            }
            case 1: {
                return arg0[0].cfr_renamed_3;
            }
        }
        int n4 = n3 - 1;
        int n5 = 0;
        int n6 = n2 = 0;
        while (n6 < n4) {
            byte[] byArray = arg0[n2].cfr_renamed_3;
            if (arg0[n2].cfr_renamed_3[0] != 0) {
                throw new IllegalArgumentException(sprbcq.cfr_renamed_9("\u0018>\u001b)W$\u001f5W<\u0016#\u0003p\u00195\u0004$\u00124W2\u001e$\u0004$\u00059\u00197W3\u0016>W8\u0016&\u0012p\u00071\u00134\u001e>\u0010"));
            }
            n5 += byArray.length - 1;
            n6 = ++n2;
        }
        byte[] byArray = arg0[n4].cfr_renamed_3;
        byte by = arg0[n4].cfr_renamed_3[0];
        byte[] byArray2 = new byte[n5 += byArray.length];
        byArray2[0] = by;
        int n7 = 1;
        int n8 = n = 0;
        while (n8 < n3) {
            byte[] byArray3 = arg0[n].cfr_renamed_3;
            int n9 = arg0[n].cfr_renamed_3.length - 1;
            System.arraycopy(byArray3, 1, byArray2, n7, n9);
            n7 += n9;
            n8 = ++n;
        }
        return byArray2;
    }

    public sprwwm(byte[] arg0, int arg1) {
        this(arg0, arg1, 1000);
    }

    /*
     * WARNING - void declaration
     */
    public sprwwm(byte by, int n) {
        void arg1;
        void arg0;
        sprwwm sprwwm2 = this;
        super((byte)arg0, (int)arg1);
        sprwwm2.cfr_renamed_2 = null;
        sprwwm2.cfr_renamed_3 = 1000;
    }

    /*
     * WARNING - void declaration
     */
    public sprwwm(sprgbf[] sprgbfArray, int n) {
        void arg0;
        sprwwm sprwwm2 = this;
        void v1 = arg0;
        super(sprwwm.cfr_renamed_11290((sprgbf[])v1), false);
        sprwwm2.cfr_renamed_2 = v1;
        sprwwm2.cfr_renamed_3 = n;
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) throws IOException {
        int n;
        if (!this.cfr_renamed_11277()) {
            return sprbfn.cfr_renamed_11301(arg0, ((int)this.cfr_renamed_3).length);
        }
        int n2 = n = arg0 ? 4 : 3;
        if (null != this.cfr_renamed_2) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_2.length) {
                sprgbf sprgbf2 = this.cfr_renamed_2[n3];
                n += sprgbf2.cfr_renamed_11213(true);
                n4 = ++n3;
            }
        } else {
            if (((int)this.cfr_renamed_3).length < 2) {
                return n;
            }
            int n5 = (((int)this.cfr_renamed_3).length - 2) / (this.cfr_renamed_3 - 1);
            n += n5 * sprbfn.cfr_renamed_11301(true, this.cfr_renamed_3);
            int n6 = ((int)this.cfr_renamed_3).length - n5 * (this.cfr_renamed_3 - 1);
            n += sprbfn.cfr_renamed_11301(true, n6);
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprwwm(byte[] byArray, boolean bl) {
        void arg1;
        void arg0;
        sprwwm sprwwm2 = this;
        super((byte[])arg0, (boolean)arg1);
        sprwwm2.cfr_renamed_2 = null;
        sprwwm2.cfr_renamed_3 = 1000;
    }

    public sprwwm(sprco arg0) throws IOException {
        this(arg0.cfr_renamed_119().cfr_renamed_104("DER"), 0);
    }

    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        sproen sproen2;
        if (!this.cfr_renamed_11277()) {
            sprbfn.cfr_renamed_11297(arg0, arg1, (byte[])this.cfr_renamed_3, 0, ((int)this.cfr_renamed_3).length);
            return;
        }
        arg0.cfr_renamed_11285(arg1, 35);
        arg0.cfr_renamed_4787(128);
        if (null != this.cfr_renamed_2) {
            sproen sproen3 = arg0;
            sproen2 = sproen3;
            sproen3.cfr_renamed_11292(this.cfr_renamed_2);
        } else if (((int)this.cfr_renamed_3).length < 2) {
            sproen2 = arg0;
        } else {
            sprwwm sprwwm2 = this;
            void var3_3 = sprwwm2.cfr_renamed_3[0];
            int n = ((int)sprwwm2.cfr_renamed_3).length;
            int n2 = n - 1;
            int n3 = this.cfr_renamed_3 - 1;
            int n4 = n2;
            while (n4 > n3) {
                sprbfn.cfr_renamed_11299(arg0, true, (byte)0, (byte[])this.cfr_renamed_3, n - n2, n3);
                n4 = n2 - n3;
            }
            sproen sproen4 = arg0;
            sproen2 = sproen4;
            sprbfn.cfr_renamed_11299(sproen4, true, (byte)var3_3, (byte[])this.cfr_renamed_3, n - n2, n2);
        }
        sproen2.cfr_renamed_4787(0);
        arg0.cfr_renamed_4787(0);
    }

    @Override
    public boolean cfr_renamed_11277() {
        return null != this.cfr_renamed_2 || ((int)this.cfr_renamed_3).length > this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprwwm(byte[] byArray, int n, int n2) {
        void arg1;
        void arg0;
        sprwwm sprwwm2 = this;
        super((byte[])arg0, (int)arg1);
        sprwwm2.cfr_renamed_2 = null;
        sprwwm2.cfr_renamed_3 = n2;
    }

    public sprwwm(byte[] arg0) {
        this(arg0, 0);
    }
}

