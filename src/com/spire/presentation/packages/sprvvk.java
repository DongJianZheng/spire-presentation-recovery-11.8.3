/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprkyca;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsrk;
import com.spire.presentation.packages.spryrk;
import com.spire.presentation.packages.sprzro;

public class sprvvk
extends sprsrk {
    private byte[] cfr_renamed_112;
    private final int cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private final sprmr cfr_renamed_0;
    private int cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private boolean cfr_renamed_3;
    private final int cfr_renamed_4;

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_119;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_0.cfr_renamed_1315()).append(sprkyca.cfr_renamed_9("\u0011J}Yl")).toString();
    }

    private /* synthetic */ void cfr_renamed_10086() {
        sprvvk sprvvk2 = this;
        byte[] byArray = sprvvk2.cfr_renamed_91;
        int n = sprvvk2.cfr_renamed_91.length - 1;
        byArray[n] = (byte)(byArray[n] + 1);
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        if (arg1 instanceof sprkpk) {
            int n;
            sprkpk sprkpk2 = (sprkpk)arg1;
            sprvvk sprvvk2 = this;
            sprvvk2.cfr_renamed_10082();
            sprvvk2.cfr_renamed_112 = sproze.cfr_renamed_158(sprkpk2.cfr_renamed_1205());
            if (sprvvk2.cfr_renamed_112.length != this.cfr_renamed_4 / 2) {
                throw new IllegalArgumentException(sprzro.cfr_renamed_9("8h\u001ah\u0005l\u001cl\u001a)!_He\rg\u000f}\u0000)\u0005|\u001b}Hk\r)U4Hk\u0004f\u000bb;`\u0012lG;"));
            }
            System.arraycopy(this.cfr_renamed_112, 0, this.cfr_renamed_91, 0, this.cfr_renamed_112.length);
            int n2 = n = this.cfr_renamed_112.length;
            while (n2 < this.cfr_renamed_4) {
                this.cfr_renamed_91[n++] = 0;
                n2 = n;
            }
            if (sprkpk2.cfr_renamed_284() != null) {
                this.cfr_renamed_0.cfr_renamed_5535(true, sprkpk2.cfr_renamed_284());
            }
        } else {
            this.cfr_renamed_10082();
            if (arg1 != null) {
                this.cfr_renamed_0.cfr_renamed_5535(true, arg1);
            }
        }
        this.cfr_renamed_3 = true;
    }

    private /* synthetic */ byte[] cfr_renamed_10087() {
        byte[] byArray = new byte[this.cfr_renamed_91.length];
        sprvvk sprvvk2 = this;
        this.cfr_renamed_0.cfr_renamed_3064(sprvvk2.cfr_renamed_91, 0, byArray, 0);
        return spryrk.cfr_renamed_10033(byArray, sprvvk2.cfr_renamed_119);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_3064(byte[] byArray, int n, byte[] byArray2, int n2) throws sprddl, IllegalStateException {
        void arg3;
        void arg2;
        void arg1;
        sprvvk sprvvk2 = this;
        sprvvk2.cfr_renamed_505(byArray, (int)arg1, sprvvk2.cfr_renamed_119, (byte[])arg2, (int)arg3);
        return sprvvk2.cfr_renamed_119;
    }

    @Override
    public void cfr_renamed_41() {
        if (this.cfr_renamed_3) {
            int n;
            System.arraycopy(this.cfr_renamed_112, 0, this.cfr_renamed_91, 0, this.cfr_renamed_112.length);
            int n2 = n = this.cfr_renamed_112.length;
            while (n2 < this.cfr_renamed_4) {
                this.cfr_renamed_91[n++] = 0;
                n2 = n;
            }
            this.cfr_renamed_1 = 0;
            this.cfr_renamed_0.cfr_renamed_41();
        }
    }

    public sprvvk(sprmr arg0) {
        sprmr sprmr2 = arg0;
        this(sprmr2, sprmr2.cfr_renamed_1195() * 8);
    }

    @Override
    public byte cfr_renamed_3272(byte arg0) {
        if (this.cfr_renamed_1 == 0) {
            this.cfr_renamed_2 = this.cfr_renamed_10087();
        }
        sprvvk sprvvk2 = this;
        sprvvk sprvvk3 = this;
        byte by = (byte)(sprvvk2.cfr_renamed_2[sprvvk3.cfr_renamed_1] ^ arg0);
        ++sprvvk3.cfr_renamed_1;
        if (sprvvk2.cfr_renamed_1 == this.cfr_renamed_119) {
            this.cfr_renamed_1 = 0;
            this.cfr_renamed_10086();
        }
        return by;
    }

    private /* synthetic */ void cfr_renamed_10082() {
        sprvvk sprvvk2 = this;
        sprvvk2.cfr_renamed_112 = new byte[sprvvk2.cfr_renamed_4 / 2];
        sprvvk2.cfr_renamed_91 = new byte[sprvvk2.cfr_renamed_4];
        sprvvk2.cfr_renamed_2 = new byte[sprvvk2.cfr_renamed_119];
    }

    /*
     * WARNING - void declaration
     */
    public sprvvk(sprmr sprmr2, int n) {
        super((sprmr)arg0);
        void arg1;
        void arg0;
        this.cfr_renamed_1 = 0;
        if (n < 0 || arg1 > arg0.cfr_renamed_1195() * 8) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprkyca.cfr_renamed_9("]_\u007f_`[y[\u007f\u001eoWy|aQnU^Ww[-SxMy\u001eo[-Wc\u001e\u007f_cYh\u001e=\u001e1\u001eoWy|aQnU^Ww[-\u00020\u001e")).append(arg0.cfr_renamed_1195() * 8).toString());
        }
        sprvvk sprvvk2 = this;
        this.cfr_renamed_0 = arg0;
        this.cfr_renamed_4 = this.cfr_renamed_0.cfr_renamed_1195();
        sprvvk2.cfr_renamed_119 = arg1 / 8;
        sprvvk2.cfr_renamed_91 = new byte[this.cfr_renamed_4];
    }
}

