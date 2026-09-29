/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprrgo;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprywh;

public class sprpuk
implements sprmr {
    private byte[] cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private sprmr cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private boolean cfr_renamed_1;
    private boolean cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_91.cfr_renamed_1195();
    }

    @Override
    public String cfr_renamed_1315() {
        if (this.cfr_renamed_1) {
            return new StringBuilder().insert(0, this.cfr_renamed_91.cfr_renamed_1315()).append(sprrgo.cfr_renamed_9("\u0018vpvt`uQ^R_oa")).toString();
        }
        return new StringBuilder().insert(0, this.cfr_renamed_91.cfr_renamed_1315()).append(sprywh.cfr_renamed_9("5\u0017]\u0017Y\u0001X")).toString();
    }

    private /* synthetic */ int cfr_renamed_3393(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        if (arg1 + this.cfr_renamed_3 > arg0.length) {
            throw new sprddl(sprrgo.cfr_renamed_9("OYVBR\u0017DB@QCE\u0006CIX\u0006DNXTC"));
        }
        if (arg3 + this.cfr_renamed_3 > arg2.length) {
            throw new sprwjl(sprywh.cfr_renamed_9("u2n7o3:%o!|\"hgn(ugi/u5n"));
        }
        sprpuk sprpuk2 = this;
        sprpuk2.cfr_renamed_91.cfr_renamed_3064(sprpuk2.cfr_renamed_119, 0, this.cfr_renamed_0, 0);
        int n = 0;
        int n2 = n;
        while (n2 < this.cfr_renamed_3) {
            int n3 = arg3 + n;
            byte by = this.cfr_renamed_3394(arg0[arg1 + n], n);
            arg2[n3] = by;
            n2 = ++n;
        }
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_3) {
            int n5 = n++;
            this.cfr_renamed_119[n5] = arg2[arg3 + n5];
            n4 = n;
        }
        return this.cfr_renamed_3;
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        if (this.cfr_renamed_1) {
            if (this.cfr_renamed_2) {
                return this.cfr_renamed_3397(arg0, arg1, arg2, arg3);
            }
            return this.cfr_renamed_3395(arg0, arg1, arg2, arg3);
        }
        sprpuk sprpuk2 = this;
        if (this.cfr_renamed_2) {
            return sprpuk2.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        }
        return sprpuk2.cfr_renamed_3396(arg0, arg1, arg2, arg3);
    }

    public sprpuk(sprmr arg0, boolean arg1) {
        sprpuk sprpuk2 = this;
        this.cfr_renamed_91 = arg0;
        this.cfr_renamed_1 = arg1;
        sprpuk2.cfr_renamed_3 = arg0.cfr_renamed_1195();
        sprpuk2.cfr_renamed_112 = new byte[this.cfr_renamed_3];
        sprpuk2.cfr_renamed_119 = new byte[sprpuk2.cfr_renamed_3];
        sprpuk2.cfr_renamed_0 = new byte[sprpuk2.cfr_renamed_3];
        sprpuk2.cfr_renamed_152 = new byte[sprpuk2.cfr_renamed_3];
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        this.cfr_renamed_4 = 0;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_119.length) {
            if (this.cfr_renamed_1) {
                this.cfr_renamed_119[n] = 0;
            } else {
                sprpuk sprpuk2 = this;
                int n3 = n;
                sprpuk2.cfr_renamed_119[n3] = sprpuk2.cfr_renamed_112[n3];
            }
            n2 = ++n;
        }
        this.cfr_renamed_91.cfr_renamed_41();
    }

    private /* synthetic */ int cfr_renamed_3397(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        if (arg1 + this.cfr_renamed_3 > arg0.length) {
            throw new sprddl(sprrgo.cfr_renamed_9("OYVBR\u0017DB@QCE\u0006CIX\u0006DNXTC"));
        }
        if (this.cfr_renamed_4 == 0) {
            if (arg3 + 2 * this.cfr_renamed_3 + 2 > arg2.length) {
                throw new sprwjl(sprywh.cfr_renamed_9("u2n7o3:%o!|\"hgn(ugi/u5n"));
            }
            sprpuk sprpuk2 = this;
            sprpuk2.cfr_renamed_91.cfr_renamed_3064(sprpuk2.cfr_renamed_119, 0, this.cfr_renamed_0, 0);
            int n = 0;
            int n2 = n;
            while (n2 < this.cfr_renamed_3) {
                int n3 = arg3 + n;
                sprpuk sprpuk3 = this;
                byte by = sprpuk3.cfr_renamed_3394(sprpuk3.cfr_renamed_112[n], n);
                arg2[n3] = by;
                n2 = ++n;
            }
            System.arraycopy(arg2, arg3, this.cfr_renamed_119, 0, this.cfr_renamed_3);
            sprpuk sprpuk4 = this;
            sprpuk4.cfr_renamed_91.cfr_renamed_3064(sprpuk4.cfr_renamed_119, 0, this.cfr_renamed_0, 0);
            int n4 = arg3;
            sprpuk sprpuk5 = this;
            arg2[arg3 + this.cfr_renamed_3] = sprpuk5.cfr_renamed_3394(this.cfr_renamed_112[sprpuk5.cfr_renamed_3 - 2], 0);
            sprpuk sprpuk6 = this;
            arg2[n4 + this.cfr_renamed_3 + 1] = sprpuk6.cfr_renamed_3394(this.cfr_renamed_112[sprpuk6.cfr_renamed_3 - 1], 1);
            sprpuk sprpuk7 = this;
            System.arraycopy(arg2, n4 + 2, sprpuk7.cfr_renamed_119, 0, this.cfr_renamed_3);
            sprpuk7.cfr_renamed_91.cfr_renamed_3064(this.cfr_renamed_119, 0, this.cfr_renamed_0, 0);
            n = 0;
            int n5 = n;
            while (n5 < this.cfr_renamed_3) {
                int n6 = arg3 + this.cfr_renamed_3 + 2 + n;
                byte by = this.cfr_renamed_3394(arg0[arg1 + n], n);
                arg2[n6] = by;
                n5 = ++n;
            }
            System.arraycopy(arg2, arg3 + this.cfr_renamed_3 + 2, this.cfr_renamed_119, 0, this.cfr_renamed_3);
            this.cfr_renamed_4 += 2 * this.cfr_renamed_3 + 2;
            return 2 * this.cfr_renamed_3 + 2;
        }
        sprpuk sprpuk8 = this;
        if (sprpuk8.cfr_renamed_4 >= sprpuk8.cfr_renamed_3 + 2) {
            if (arg3 + this.cfr_renamed_3 > arg2.length) {
                throw new sprwjl(sprrgo.cfr_renamed_9("XSCVBR\u0017DB@QCE\u0006CIX\u0006DNXTC"));
            }
            sprpuk sprpuk9 = this;
            sprpuk9.cfr_renamed_91.cfr_renamed_3064(sprpuk9.cfr_renamed_119, 0, this.cfr_renamed_0, 0);
            int n = 0;
            int n7 = n;
            while (n7 < this.cfr_renamed_3) {
                int n8 = arg3 + n;
                byte by = this.cfr_renamed_3394(arg0[arg1 + n], n);
                arg2[n8] = by;
                n7 = ++n;
            }
            System.arraycopy(arg2, arg3, this.cfr_renamed_119, 0, this.cfr_renamed_3);
        }
        return this.cfr_renamed_3;
    }

    private /* synthetic */ byte cfr_renamed_3394(byte arg0, int arg1) {
        return (byte)(this.cfr_renamed_0[arg1] ^ arg0);
    }

    private /* synthetic */ int cfr_renamed_3396(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        if (arg1 + this.cfr_renamed_3 > arg0.length) {
            throw new sprddl(sprywh.cfr_renamed_9(".t7o3:%o!|\"hgn(ugi/u5n"));
        }
        if (arg3 + this.cfr_renamed_3 > arg2.length) {
            throw new sprwjl(sprrgo.cfr_renamed_9("XSCVBR\u0017DB@QCE\u0006CIX\u0006DNXTC"));
        }
        sprpuk sprpuk2 = this;
        sprpuk2.cfr_renamed_91.cfr_renamed_3064(sprpuk2.cfr_renamed_119, 0, this.cfr_renamed_0, 0);
        int n = 0;
        int n2 = n;
        while (n2 < this.cfr_renamed_3) {
            int n3 = arg3 + n;
            byte by = this.cfr_renamed_3394(arg0[arg1 + n], n);
            arg2[n3] = by;
            n2 = ++n;
        }
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_3) {
            int n5 = n++;
            this.cfr_renamed_119[n5] = arg0[arg1 + n5];
            n4 = n;
        }
        return this.cfr_renamed_3;
    }

    private /* synthetic */ int cfr_renamed_3395(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        if (arg1 + this.cfr_renamed_3 > arg0.length) {
            throw new sprddl(sprywh.cfr_renamed_9(".t7o3:%o!|\"hgn(ugi/u5n"));
        }
        if (arg3 + this.cfr_renamed_3 > arg2.length) {
            throw new sprwjl(sprrgo.cfr_renamed_9("XSCVBR\u0017DB@QCE\u0006CIX\u0006DNXTC"));
        }
        if (this.cfr_renamed_4 == 0) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_3) {
                int n3 = n++;
                this.cfr_renamed_119[n3] = arg0[arg1 + n3];
                n2 = n;
            }
            sprpuk sprpuk2 = this;
            sprpuk2.cfr_renamed_91.cfr_renamed_3064(sprpuk2.cfr_renamed_119, 0, this.cfr_renamed_0, 0);
            this.cfr_renamed_4 += this.cfr_renamed_3;
            return 0;
        }
        sprpuk sprpuk3 = this;
        if (sprpuk3.cfr_renamed_4 == sprpuk3.cfr_renamed_3) {
            sprpuk sprpuk4 = this;
            System.arraycopy(arg0, arg1, sprpuk4.cfr_renamed_152, 0, this.cfr_renamed_3);
            sprpuk sprpuk5 = this;
            System.arraycopy(sprpuk5.cfr_renamed_119, 2, this.cfr_renamed_119, 0, this.cfr_renamed_3 - 2);
            sprpuk5.cfr_renamed_119[this.cfr_renamed_3 - 2] = this.cfr_renamed_152[0];
            sprpuk4.cfr_renamed_119[this.cfr_renamed_3 - 1] = this.cfr_renamed_152[1];
            sprpuk5.cfr_renamed_91.cfr_renamed_3064(this.cfr_renamed_119, 0, this.cfr_renamed_0, 0);
            int n = 0;
            int n4 = n;
            while (n4 < this.cfr_renamed_3 - 2) {
                int n5 = arg3 + n;
                sprpuk sprpuk6 = this;
                byte by = sprpuk6.cfr_renamed_3394(sprpuk6.cfr_renamed_152[n + 2], n);
                arg2[n5] = by;
                n4 = ++n;
            }
            sprpuk sprpuk7 = this;
            sprpuk sprpuk8 = this;
            System.arraycopy(sprpuk7.cfr_renamed_152, 2, sprpuk8.cfr_renamed_119, 0, this.cfr_renamed_3 - 2);
            sprpuk8.cfr_renamed_4 += 2;
            return sprpuk7.cfr_renamed_3 - 2;
        }
        sprpuk sprpuk9 = this;
        if (sprpuk9.cfr_renamed_4 >= sprpuk9.cfr_renamed_3 + 2) {
            System.arraycopy(arg0, arg1, this.cfr_renamed_152, 0, this.cfr_renamed_3);
            sprpuk sprpuk10 = this;
            arg2[arg3 + 0] = sprpuk10.cfr_renamed_3394(this.cfr_renamed_152[0], sprpuk10.cfr_renamed_3 - 2);
            sprpuk sprpuk11 = this;
            arg2[arg3 + 1] = sprpuk11.cfr_renamed_3394(this.cfr_renamed_152[1], sprpuk11.cfr_renamed_3 - 1);
            sprpuk sprpuk12 = this;
            System.arraycopy(this.cfr_renamed_152, 0, sprpuk12.cfr_renamed_119, this.cfr_renamed_3 - 2, 2);
            sprpuk12.cfr_renamed_91.cfr_renamed_3064(this.cfr_renamed_119, 0, this.cfr_renamed_0, 0);
            int n = 0;
            int n6 = n;
            while (n6 < this.cfr_renamed_3 - 2) {
                int n7 = arg3 + n + 2;
                sprpuk sprpuk13 = this;
                byte by = sprpuk13.cfr_renamed_3394(sprpuk13.cfr_renamed_152[n + 2], n);
                arg2[n7] = by;
                n6 = ++n;
            }
            System.arraycopy(this.cfr_renamed_152, 2, this.cfr_renamed_119, 0, this.cfr_renamed_3 - 2);
        }
        return this.cfr_renamed_3;
    }

    public sprmr cfr_renamed_2349() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) throws IllegalArgumentException {
        void arg1;
        void arg0;
        this.cfr_renamed_2 = arg0;
        if (sprbj2 instanceof sprkpk) {
            sprkpk sprkpk2 = (sprkpk)arg1;
            byte[] byArray = sprkpk2.cfr_renamed_1205();
            if (byArray.length < this.cfr_renamed_112.length) {
                int n;
                sprpuk sprpuk2 = this;
                System.arraycopy(byArray, 0, sprpuk2.cfr_renamed_112, sprpuk2.cfr_renamed_112.length - byArray.length, byArray.length);
                int n2 = n = 0;
                while (n2 < this.cfr_renamed_112.length - byArray.length) {
                    this.cfr_renamed_112[n++] = 0;
                    n2 = n;
                }
            } else {
                System.arraycopy(byArray, 0, this.cfr_renamed_112, 0, this.cfr_renamed_112.length);
            }
            sprpuk sprpuk3 = this;
            sprpuk3.cfr_renamed_41();
            sprpuk3.cfr_renamed_91.cfr_renamed_5535(true, sprkpk2.cfr_renamed_284());
            return;
        }
        sprpuk sprpuk4 = this;
        sprpuk4.cfr_renamed_41();
        sprpuk4.cfr_renamed_91.cfr_renamed_5535(true, (sprbj)arg1);
    }
}

