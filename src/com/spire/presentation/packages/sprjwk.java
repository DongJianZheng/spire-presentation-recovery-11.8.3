/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprabaa;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprkuh;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprsrk;

public class sprjwk
extends sprsrk {
    public static final int cfr_renamed_93 = 0x1010104;
    public int cfr_renamed_86;
    public boolean cfr_renamed_152 = true;
    private final int cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private final sprmr cfr_renamed_0;
    public int cfr_renamed_1;
    public static final int cfr_renamed_2 = 0x1010101;
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_0.cfr_renamed_1315()).append(sprkuh.cfr_renamed_9("\u001egrtc")).toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprjwk(sprmr sprmr2) {
        super((sprmr)arg0);
        void arg0;
        this.cfr_renamed_0 = arg0;
        this.cfr_renamed_112 = sprmr2.cfr_renamed_1195();
        if (this.cfr_renamed_112 != 8) {
            throw new IllegalArgumentException(sprabaa.cfr_renamed_9("D_WN#smpz<esq<5(#~jh#~os`w#\u007fjlkyqo"));
        }
        sprjwk sprjwk2 = this;
        void v1 = arg0;
        this.cfr_renamed_91 = new byte[arg0.cfr_renamed_1195()];
        sprjwk2.cfr_renamed_119 = new byte[v1.cfr_renamed_1195()];
        sprjwk2.cfr_renamed_4 = new byte[v1.cfr_renamed_1195()];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) throws IllegalArgumentException {
        void arg1;
        sprjwk sprjwk2 = this;
        this.cfr_renamed_152 = true;
        sprjwk2.cfr_renamed_86 = 0;
        sprjwk2.cfr_renamed_1 = 0;
        if (sprbj2 instanceof sprkpk) {
            sprkpk sprkpk2 = (sprkpk)arg1;
            byte[] byArray = sprkpk2.cfr_renamed_1205();
            if (byArray.length < this.cfr_renamed_91.length) {
                int n;
                sprjwk sprjwk3 = this;
                System.arraycopy(byArray, 0, sprjwk3.cfr_renamed_91, sprjwk3.cfr_renamed_91.length - byArray.length, byArray.length);
                int n2 = n = 0;
                while (n2 < this.cfr_renamed_91.length - byArray.length) {
                    this.cfr_renamed_91[n++] = 0;
                    n2 = n;
                }
            } else {
                System.arraycopy(byArray, 0, this.cfr_renamed_91, 0, this.cfr_renamed_91.length);
            }
            this.cfr_renamed_41();
            if (sprkpk2.cfr_renamed_284() != null) {
                this.cfr_renamed_0.cfr_renamed_5535(true, sprkpk2.cfr_renamed_284());
                return;
            }
        } else {
            this.cfr_renamed_41();
            if (arg1 != null) {
                this.cfr_renamed_0.cfr_renamed_5535(true, (sprbj)arg1);
            }
        }
    }

    @Override
    public byte cfr_renamed_3272(byte arg0) {
        if (this.cfr_renamed_3 == 0) {
            if (this.cfr_renamed_152) {
                this.cfr_renamed_152 = false;
                this.cfr_renamed_0.cfr_renamed_3064(this.cfr_renamed_119, 0, this.cfr_renamed_4, 0);
                sprjwk sprjwk2 = this;
                sprjwk2.cfr_renamed_86 = sprjwk2.cfr_renamed_3409(sprjwk2.cfr_renamed_4, 0);
                sprjwk2.cfr_renamed_1 = sprjwk2.cfr_renamed_3409(sprjwk2.cfr_renamed_4, 4);
            }
            sprjwk sprjwk3 = this;
            sprjwk3.cfr_renamed_86 += 0x1010101;
            sprjwk3.cfr_renamed_1 += 0x1010104;
            if (sprjwk3.cfr_renamed_1 < 0x1010104 && this.cfr_renamed_1 > 0) {
                ++this.cfr_renamed_1;
            }
            sprjwk sprjwk4 = this;
            sprjwk sprjwk5 = this;
            sprjwk4.cfr_renamed_3410(sprjwk4.cfr_renamed_86, sprjwk5.cfr_renamed_119, 0);
            sprjwk4.cfr_renamed_3410(sprjwk5.cfr_renamed_1, this.cfr_renamed_119, 4);
            sprjwk4.cfr_renamed_0.cfr_renamed_3064(this.cfr_renamed_119, 0, this.cfr_renamed_4, 0);
        }
        byte by = (byte)(this.cfr_renamed_4[this.cfr_renamed_3++] ^ arg0);
        sprjwk sprjwk6 = this;
        if (sprjwk6.cfr_renamed_3 == sprjwk6.cfr_renamed_112) {
            this.cfr_renamed_3 = 0;
            sprjwk sprjwk7 = this;
            System.arraycopy(this.cfr_renamed_119, sprjwk7.cfr_renamed_112, sprjwk7.cfr_renamed_119, 0, this.cfr_renamed_119.length - this.cfr_renamed_112);
            sprjwk sprjwk8 = this;
            System.arraycopy(this.cfr_renamed_4, 0, sprjwk8.cfr_renamed_119, sprjwk8.cfr_renamed_119.length - this.cfr_renamed_112, this.cfr_renamed_112);
        }
        return by;
    }

    private /* synthetic */ int cfr_renamed_3409(byte[] arg0, int arg1) {
        return (arg0[arg1 + 3] << 24 & 0xFF000000) + (arg0[arg1 + 2] << 16 & 0xFF0000) + (arg0[arg1 + 1] << 8 & 0xFF00) + (arg0[arg1] & 0xFF);
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_152 = true;
        this.cfr_renamed_86 = 0;
        this.cfr_renamed_1 = 0;
        System.arraycopy(this.cfr_renamed_91, 0, this.cfr_renamed_119, 0, this.cfr_renamed_91.length);
        this.cfr_renamed_3 = 0;
        this.cfr_renamed_0.cfr_renamed_41();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3410(int n, byte[] byArray, int n2) {
        void arg0;
        void arg2;
        void arg1;
        void v0 = arg1;
        void v1 = arg2;
        arg1[arg2 + 3] = (byte)(arg0 >>> 24);
        arg1[v1 + 2] = (byte)(arg0 >>> 16);
        v0[v1 + true] = (byte)(arg0 >>> 8);
        v0[n2] = (byte)arg0;
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_3064(byte[] byArray, int n, byte[] byArray2, int n2) throws sprddl, IllegalStateException {
        void arg3;
        void arg2;
        void arg1;
        sprjwk sprjwk2 = this;
        sprjwk2.cfr_renamed_505(byArray, (int)arg1, sprjwk2.cfr_renamed_112, (byte[])arg2, (int)arg3);
        return sprjwk2.cfr_renamed_112;
    }
}

