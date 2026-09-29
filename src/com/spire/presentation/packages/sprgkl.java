/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbrp;
import com.spire.presentation.packages.spriifa;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryye;
import java.security.SecureRandom;

public class sprgkl
implements sprwn {
    private boolean cfr_renamed_93;
    private SecureRandom cfr_renamed_86;
    private boolean cfr_renamed_152;
    private int cfr_renamed_112;
    private sprwn cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private byte[] cfr_renamed_0;
    public static final String cfr_renamed_1 = "com.spire.psmodel.security.pkcs1.not_strict";
    private boolean cfr_renamed_2;
    public static final String cfr_renamed_3 = "com.spire.psmodel.security.pkcs1.strict";
    private static final int cfr_renamed_4 = 10;

    private /* synthetic */ byte[] cfr_renamed_3740(byte[] arg0, int arg1, int arg2) throws sprull {
        if (arg2 > this.cfr_renamed_1344()) {
            throw new IllegalArgumentException(spriifa.cfr_renamed_9("\u0014\u001c\r\u0007\tR\u0019\u0013\t\u0013]\u0006\u0012\u001d]\u001e\u001c\u0000\u001a\u0017"));
        }
        sprgkl sprgkl2 = this;
        byte[] byArray = new byte[sprgkl2.cfr_renamed_119.cfr_renamed_1344()];
        if (sprgkl2.cfr_renamed_2) {
            int n;
            byArray[0] = 1;
            int n2 = n = 1;
            while (n2 != byArray.length - arg2 - 1) {
                byArray[n++] = -1;
                n2 = n;
            }
        } else {
            int n;
            this.cfr_renamed_86.nextBytes(byArray);
            byArray[0] = 2;
            int n3 = n = 1;
            while (n3 != byArray.length - arg2 - 1) {
                byte[] byArray2 = byArray;
                while (byArray2[n] == 0) {
                    byArray2 = byArray;
                    byArray[n] = (byte)this.cfr_renamed_86.nextInt();
                }
                n3 = ++n;
            }
        }
        byArray[byArray.length - arg2 - 1] = 0;
        System.arraycopy(arg0, arg1, byArray, byArray.length - arg2, arg2);
        return this.cfr_renamed_119.cfr_renamed_1337(byArray, 0, byArray.length);
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprgkl sprgkl2;
        spryye spryye2;
        if (arg1 instanceof sprbgk) {
            sprbgk sprbgk2;
            sprbgk sprbgk3 = sprbgk2 = (sprbgk)arg1;
            this.cfr_renamed_86 = sprbgk3.cfr_renamed_1295();
            spryye2 = (spryye)sprbgk3.cfr_renamed_284();
            sprgkl2 = this;
        } else {
            spryye2 = (spryye)arg1;
            if (!spryye2.cfr_renamed_1352() && arg0) {
                this.cfr_renamed_86 = sprybl.cfr_renamed_2794();
            }
            sprgkl2 = this;
        }
        sprgkl2.cfr_renamed_119.cfr_renamed_5535(arg0, arg1);
        this.cfr_renamed_2 = spryye2.cfr_renamed_1352();
        this.cfr_renamed_93 = arg0;
        this.cfr_renamed_0 = new byte[this.cfr_renamed_119.cfr_renamed_1339()];
        if (this.cfr_renamed_112 > 0 && this.cfr_renamed_91 == null && this.cfr_renamed_86 == null) {
            throw new IllegalArgumentException(sprbrp.cfr_renamed_9("ORISNYX\u001cXY[ICNOO\nNKRNSG"));
        }
    }

    public sprwn cfr_renamed_2349() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sprgkl(sprwn sprwn2, int n) {
        void arg0;
        sprgkl sprgkl2 = this;
        this.cfr_renamed_112 = -1;
        sprgkl2.cfr_renamed_91 = null;
        sprgkl2.cfr_renamed_119 = arg0;
        this.cfr_renamed_152 = this.cfr_renamed_3738();
        this.cfr_renamed_112 = n;
    }

    @Override
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) throws sprull {
        if (this.cfr_renamed_93) {
            return this.cfr_renamed_3740(arg0, arg1, arg2);
        }
        return this.cfr_renamed_3739(arg0, arg1, arg2);
    }

    private /* synthetic */ boolean cfr_renamed_3738() {
        if (sprjcf.cfr_renamed_5155(cfr_renamed_1, true)) {
            return false;
        }
        return !sprjcf.cfr_renamed_5155(cfr_renamed_3, false);
    }

    private /* synthetic */ int cfr_renamed_10457(byte arg0, byte[] arg1) throws sprull {
        int n;
        int n2 = -1;
        boolean bl = false;
        int n3 = n = 1;
        while (n3 != arg1.length) {
            int n4;
            boolean bl2;
            int n5;
            boolean bl3;
            byte by = arg1[n];
            if (by == 0) {
                bl3 = true;
                n5 = n2;
            } else {
                bl3 = false;
                n5 = n2;
            }
            if (bl3 & n5 < 0) {
                n2 = n;
            }
            if (arg0 == 1) {
                bl2 = true;
                n4 = n2;
            } else {
                bl2 = false;
                n4 = n2;
            }
            bl |= bl2 & n4 < 0 & by != -1;
            n3 = ++n;
        }
        if (bl) {
            return -1;
        }
        return n2;
    }

    @Override
    public int cfr_renamed_1344() {
        sprgkl sprgkl2 = this;
        int n = sprgkl2.cfr_renamed_119.cfr_renamed_1344();
        if (sprgkl2.cfr_renamed_93) {
            return n - 10;
        }
        return n;
    }

    private /* synthetic */ byte[] cfr_renamed_3736(byte[] arg0, int arg1, int arg2) throws sprull {
        int n;
        byte[] byArray;
        sprgkl sprgkl2;
        if (!this.cfr_renamed_2) {
            throw new sprull(spriifa.cfr_renamed_9("\u000e\u001d\u000f\u0000\u0004^]\u0006\u0015\u001b\u000eR\u0010\u0017\t\u001a\u0012\u0016]\u001b\u000eR\u0012\u001c\u0011\u000b]\u0014\u0012\u0000]\u0016\u0018\u0011\u000f\u000b\r\u0006\u0014\u001d\u0013^]\u001c\u0012\u0006]\u0014\u0012\u0000]\u0001\u0014\u0015\u0013\u001b\u0013\u0015"));
        }
        sprgkl sprgkl3 = this;
        byte[] byArray2 = sprgkl3.cfr_renamed_119.cfr_renamed_1337(arg0, arg1, arg2);
        if (sprgkl3.cfr_renamed_91 == null) {
            sprgkl sprgkl4 = this;
            sprgkl2 = sprgkl4;
            byArray = new byte[sprgkl4.cfr_renamed_112];
            sprgkl4.cfr_renamed_86.nextBytes(byArray);
        } else {
            sprgkl sprgkl5 = this;
            sprgkl2 = sprgkl5;
            byArray = sprgkl5.cfr_renamed_91;
        }
        byte[] byArray3 = sprgkl2.cfr_renamed_152 & byArray2.length != this.cfr_renamed_119.cfr_renamed_1339() ? this.cfr_renamed_0 : byArray2;
        sprgkl sprgkl6 = this;
        int n2 = sprgkl.cfr_renamed_3737(byArray3, sprgkl6.cfr_renamed_112);
        byte[] byArray4 = new byte[sprgkl6.cfr_renamed_112];
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_112) {
            int n4 = n;
            byte by = (byte)(byArray3[n4 + (byArray3.length - this.cfr_renamed_112)] & ~n2 | byArray[n] & n2);
            byArray4[n4] = by;
            n3 = ++n;
        }
        sproze.cfr_renamed_492(byArray3, (byte)0);
        return byArray4;
    }

    public sprgkl(sprwn arg0) {
        sprgkl sprgkl2 = this;
        this.cfr_renamed_112 = -1;
        this.cfr_renamed_91 = null;
        sprgkl2.cfr_renamed_119 = arg0;
        sprgkl2.cfr_renamed_152 = this.cfr_renamed_3738();
    }

    private static /* synthetic */ int cfr_renamed_3737(byte[] arg0, int arg1) {
        int n;
        int n2 = 0;
        n2 = 0 | arg0[0] ^ 2;
        int n3 = arg0.length - (arg1 + 1);
        int n4 = n = 1;
        while (n4 < n3) {
            int n5 = arg0[n];
            n5 |= n5 >> 1;
            n5 |= n5 >> 2;
            n5 |= n5 >> 4;
            n2 |= (n5 & 1) - 1;
            n4 = ++n;
        }
        n2 |= arg0[arg0.length - (arg1 + 1)];
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        return ~((n2 & 1) - 1);
    }

    /*
     * WARNING - void declaration
     */
    public sprgkl(sprwn sprwn2, byte[] byArray) {
        void arg1;
        void arg0;
        sprgkl sprgkl2 = this;
        sprgkl sprgkl3 = this;
        this.cfr_renamed_112 = -1;
        this.cfr_renamed_91 = null;
        sprgkl3.cfr_renamed_119 = arg0;
        sprgkl3.cfr_renamed_152 = this.cfr_renamed_3738();
        sprgkl2.cfr_renamed_91 = arg1;
        sprgkl2.cfr_renamed_112 = byArray.length;
    }

    @Override
    public int cfr_renamed_1339() {
        sprgkl sprgkl2 = this;
        int n = sprgkl2.cfr_renamed_119.cfr_renamed_1339();
        if (sprgkl2.cfr_renamed_93) {
            return n;
        }
        return n - 10;
    }

    private /* synthetic */ byte[] cfr_renamed_3739(byte[] arg0, int arg1, int arg2) throws sprull {
        sprgkl sprgkl2;
        boolean bl;
        byte[] byArray;
        if (this.cfr_renamed_112 != -1) {
            return this.cfr_renamed_3736(arg0, arg1, arg2);
        }
        sprgkl sprgkl3 = this;
        byte[] byArray2 = sprgkl3.cfr_renamed_119.cfr_renamed_1337(arg0, arg1, arg2);
        boolean bl2 = sprgkl3.cfr_renamed_152 & byArray2.length != this.cfr_renamed_119.cfr_renamed_1339();
        byte by = (byArray2.length < this.cfr_renamed_1339() ? (byArray = this.cfr_renamed_0) : (byArray = byArray2))[0];
        if (this.cfr_renamed_2) {
            bl = by != 2;
            sprgkl2 = this;
        } else {
            bl = by != 1;
            sprgkl2 = this;
        }
        int n = sprgkl2.cfr_renamed_10457(by, byArray);
        if (bl | ++n < 10) {
            sproze.cfr_renamed_492(byArray, (byte)0);
            throw new sprull(sprbrp.cfr_renamed_9("HPE_A\u001cCRISXNO_^"));
        }
        if (bl2) {
            sproze.cfr_renamed_492(byArray, (byte)0);
            throw new sprull(spriifa.cfr_renamed_9("\u001f\u001e\u0012\u0011\u0016R\u0014\u001c\u001e\u001d\u000f\u0000\u0018\u0011\tR\u000e\u001b\u0007\u0017"));
        }
        byte[] byArray3 = new byte[byArray.length - n];
        System.arraycopy(byArray, n, byArray3, 0, byArray3.length);
        return byArray3;
    }
}

