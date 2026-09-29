/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproug;
import java.io.IOException;

public class sprfwm
extends sproug {
    private final sproug[] cfr_renamed_2;
    private static final int cfr_renamed_3 = 1000;
    private final int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_11218(sproen sproen2, boolean bl) throws IOException {
        void v2;
        void arg1;
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_11285((boolean)arg1, 36);
        v0.cfr_renamed_4787(128);
        if (null != this.cfr_renamed_2) {
            void v1 = arg0;
            v2 = v1;
            v1.cfr_renamed_11292(this.cfr_renamed_2);
        } else {
            int n;
            int n2 = n = 0;
            while (n2 < ((int)this.cfr_renamed_4).length) {
                int n3 = Math.min(((int)this.cfr_renamed_4).length - n, this.cfr_renamed_4);
                sprfvg.cfr_renamed_11297((sproen)arg0, true, (byte[])this.cfr_renamed_4, n, n3);
                n2 = n + n3;
            }
            v2 = arg0;
        }
        v2.cfr_renamed_4787(0);
        arg0.cfr_renamed_4787(0);
    }

    public sprfwm(byte[] arg0, int arg1) {
        this(arg0, null, arg1);
    }

    public sprfwm(sproug[] arg0, int arg1) {
        this(sprfwm.cfr_renamed_11288(arg0), arg0, arg1);
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) throws IOException {
        int n;
        int n2 = n = arg0 ? 4 : 3;
        if (null != this.cfr_renamed_2) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_2.length) {
                sproug sproug2 = this.cfr_renamed_2[n3];
                n += sproug2.cfr_renamed_11213(true);
                n4 = ++n3;
            }
        } else {
            int n5 = ((int)this.cfr_renamed_4).length / this.cfr_renamed_4;
            n += n5 * sprfvg.cfr_renamed_11301(true, this.cfr_renamed_4);
            int n6 = ((int)this.cfr_renamed_4).length - n5 * this.cfr_renamed_4;
            if (n6 > 0) {
                n += sprfvg.cfr_renamed_11301(true, n6);
            }
        }
        return n;
    }

    public sprfwm(sproug[] arg0) {
        this(arg0, 1000);
    }

    public sprfwm(byte[] arg0) {
        this(arg0, 1000);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static byte[] cfr_renamed_11288(sproug[] arg0) {
        int n;
        int n2 = arg0.length;
        switch (n2) {
            case 0: {
                return cfr_renamed_3;
            }
            case 1: {
                return arg0[0].cfr_renamed_4;
            }
        }
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < n2) {
            n3 += arg0[++n].cfr_renamed_4.length;
            n4 = n;
        }
        byte[] byArray = new byte[n3];
        int n5 = 0;
        int n6 = 0;
        int n7 = n5;
        while (n7 < n2) {
            byte[] byArray2 = arg0[n5].cfr_renamed_4;
            System.arraycopy(arg0[n5].cfr_renamed_4, 0, byArray, n6, byArray2.length);
            n6 += byArray2.length;
            n7 = ++n5;
        }
        return byArray;
    }

    @Override
    public boolean cfr_renamed_11277() {
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfwm(byte[] byArray, sproug[] sprougArray, int n) {
        void arg1;
        void arg0;
        sprfwm sprfwm2 = this;
        super((byte[])arg0);
        sprfwm2.cfr_renamed_2 = arg1;
        sprfwm2.cfr_renamed_4 = n;
    }
}

