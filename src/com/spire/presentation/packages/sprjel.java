/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprery;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprkkk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqbb;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.sprybl;
import java.security.SecureRandom;

public class sprjel
implements sprwn {
    private SecureRandom cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private boolean cfr_renamed_2;
    private sprwn cfr_renamed_3;
    private sprgf cfr_renamed_4;

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprjel sprjel2;
        if (arg1 instanceof sprbgk) {
            sprbgk sprbgk2 = (sprbgk)arg1;
            sprjel2 = this;
            this.cfr_renamed_0 = sprbgk2.cfr_renamed_1295();
        } else {
            sprjel2 = this;
            this.cfr_renamed_0 = sprybl.cfr_renamed_2794();
        }
        sprjel2.cfr_renamed_3.cfr_renamed_5535(arg0, arg1);
        this.cfr_renamed_2 = arg0;
    }

    @Override
    public int cfr_renamed_1339() {
        sprjel sprjel2 = this;
        int n = sprjel2.cfr_renamed_3.cfr_renamed_1339();
        if (sprjel2.cfr_renamed_2) {
            return n;
        }
        return n - 1 - 2 * this.cfr_renamed_1.length;
    }

    /*
     * WARNING - void declaration
     */
    public sprjel(sprwn sprwn2, sprgf sprgf2, sprgf sprgf3, byte[] byArray) {
        void arg2;
        void arg0;
        void arg1;
        void v0 = arg1;
        sprjel sprjel2 = this;
        sprjel2.cfr_renamed_3 = arg0;
        sprjel2.cfr_renamed_4 = arg2;
        this.cfr_renamed_1 = new byte[v0.cfr_renamed_1218()];
        v0.cfr_renamed_41();
        if (byArray != null) {
            void arg3;
            void v2 = arg3;
            arg1.cfr_renamed_1197((byte[])v2, 0, ((void)v2).length);
        }
        arg1.cfr_renamed_1219(this.cfr_renamed_1, 0);
    }

    public byte[] cfr_renamed_3740(byte[] arg0, int arg1, int arg2) throws sprull {
        int n;
        if (arg2 > this.cfr_renamed_1344()) {
            throw new sprddl(sprery.cfr_renamed_9("DV]MY\u0018IYYY\rLBW\rTBVJ"));
        }
        byte[] byArray = new byte[this.cfr_renamed_1344() + 1 + 2 * this.cfr_renamed_1.length];
        System.arraycopy(arg0, arg1, byArray, byArray.length - arg2, arg2);
        byArray[byArray.length - arg2 - 1] = 1;
        System.arraycopy(this.cfr_renamed_1, 0, byArray, this.cfr_renamed_1.length, this.cfr_renamed_1.length);
        byte[] byArray2 = new byte[this.cfr_renamed_1.length];
        sprjel sprjel2 = this;
        sprjel2.cfr_renamed_0.nextBytes(byArray2);
        byte[] byArray3 = sprjel2.cfr_renamed_3278(byArray2, 0, byArray2.length, byArray.length - this.cfr_renamed_1.length);
        int n2 = n = this.cfr_renamed_1.length;
        while (n2 != byArray.length) {
            int n3 = n;
            byte by = (byte)(byArray[n3] ^ byArray3[n - this.cfr_renamed_1.length]);
            byArray[n3] = by;
            n2 = ++n;
        }
        System.arraycopy(byArray2, 0, byArray, 0, this.cfr_renamed_1.length);
        sprjel sprjel3 = this;
        byArray3 = sprjel3.cfr_renamed_3278(byArray, sprjel3.cfr_renamed_1.length, byArray.length - this.cfr_renamed_1.length, this.cfr_renamed_1.length);
        int n4 = n = 0;
        while (n4 != this.cfr_renamed_1.length) {
            int n5 = n;
            byte by = (byte)(byArray[n5] ^ byArray3[n]);
            byArray[n5] = by;
            n4 = ++n;
        }
        return this.cfr_renamed_3.cfr_renamed_1337(byArray, 0, byArray.length);
    }

    public sprjel(sprwn arg0, sprgf arg1, byte[] arg2) {
        sprgf sprgf2 = arg1;
        this(arg0, sprgf2, sprgf2, arg2);
    }

    public sprjel(sprwn arg0, sprgf arg1) {
        this(arg0, arg1, null);
    }

    public sprjel(sprwn arg0) {
        this(arg0, sprkkk.cfr_renamed_5701(), null);
    }

    public byte[] cfr_renamed_3739(byte[] arg0, int arg1, int arg2) throws sprull {
        int n;
        int n2;
        sprjel sprjel2;
        sprjel sprjel3 = this;
        byte[] byArray = sprjel3.cfr_renamed_3.cfr_renamed_1337(arg0, arg1, arg2);
        byte[] byArray2 = new byte[sprjel3.cfr_renamed_3.cfr_renamed_1339()];
        int n3 = byArray2.length - (2 * this.cfr_renamed_1.length + 1) >> 31;
        if (byArray.length <= byArray2.length) {
            System.arraycopy(byArray, 0, byArray2, byArray2.length - byArray.length, byArray.length);
            sprjel2 = this;
        } else {
            System.arraycopy(byArray, 0, byArray2, 0, byArray2.length);
            n3 |= 1;
            sprjel2 = this;
        }
        byte[] byArray3 = sprjel2.cfr_renamed_3278(byArray2, this.cfr_renamed_1.length, byArray2.length - this.cfr_renamed_1.length, this.cfr_renamed_1.length);
        int n4 = n2 = 0;
        while (n4 != this.cfr_renamed_1.length) {
            int n5 = n2;
            byte by = (byte)(byArray2[n5] ^ byArray3[n2]);
            byArray2[n5] = by;
            n4 = ++n2;
        }
        byArray3 = this.cfr_renamed_3278(byArray2, 0, this.cfr_renamed_1.length, byArray2.length - this.cfr_renamed_1.length);
        int n6 = n2 = this.cfr_renamed_1.length;
        while (n6 != byArray2.length) {
            int n7 = n2;
            byte by = (byte)(byArray2[n7] ^ byArray3[n2 - this.cfr_renamed_1.length]);
            byArray2[n7] = by;
            n6 = ++n2;
        }
        int n8 = n2 = 0;
        while (n8 != this.cfr_renamed_1.length) {
            byte by = this.cfr_renamed_1[n2];
            byte by2 = byArray2[this.cfr_renamed_1.length + n2];
            n3 |= by ^ by2;
            n8 = ++n2;
        }
        n2 = -1;
        int n9 = n = 2 * this.cfr_renamed_1.length;
        while (n9 != byArray2.length) {
            int n10 = (-(byArray2[n] & 0xFF) & n2) >> 31;
            n2 += n++ & n10;
            n9 = n;
        }
        n3 |= n2++ >> 31;
        if ((n3 |= byArray2[n2] ^ 1) != 0) {
            sproze.cfr_renamed_492(byArray2, (byte)0);
            throw new sprull(sprqbb.cfr_renamed_9("i\ty\t-\u001f\u007f\u0007c\u000f"));
        }
        byte[] byArray4 = new byte[byArray2.length - ++n2];
        System.arraycopy(byArray2, n2, byArray4, 0, byArray4.length);
        sproze.cfr_renamed_492(byArray2, (byte)0);
        return byArray4;
    }

    public sprwn cfr_renamed_2349() {
        return this.cfr_renamed_3;
    }

    @Override
    public int cfr_renamed_1344() {
        sprjel sprjel2 = this;
        int n = sprjel2.cfr_renamed_3.cfr_renamed_1344();
        if (sprjel2.cfr_renamed_2) {
            return n - 1 - 2 * this.cfr_renamed_1.length;
        }
        return n;
    }

    private /* synthetic */ byte[] cfr_renamed_3278(byte[] arg0, int arg1, int arg2, int arg3) {
        byte[] byArray = new byte[arg3];
        sprjel sprjel2 = this;
        byte[] byArray2 = new byte[sprjel2.cfr_renamed_4.cfr_renamed_1218()];
        byte[] byArray3 = new byte[4];
        int n = 0;
        sprjel2.cfr_renamed_4.cfr_renamed_41();
        int n2 = n;
        while (n2 < arg3 / byArray2.length) {
            sprpxe.cfr_renamed_442(n, byArray3, 0);
            sprjel sprjel3 = this;
            sprjel3.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
            sprjel3.cfr_renamed_4.cfr_renamed_1197(byArray3, 0, byArray3.length);
            this.cfr_renamed_4.cfr_renamed_1219(byArray2, 0);
            int n3 = n * byArray2.length;
            System.arraycopy(byArray2, 0, byArray, n3, byArray2.length);
            n2 = ++n;
        }
        if (n * byArray2.length < arg3) {
            sprpxe.cfr_renamed_442(n, byArray3, 0);
            sprjel sprjel4 = this;
            sprjel4.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
            sprjel4.cfr_renamed_4.cfr_renamed_1197(byArray3, 0, byArray3.length);
            this.cfr_renamed_4.cfr_renamed_1219(byArray2, 0);
            System.arraycopy(byArray2, 0, byArray, n * byArray2.length, byArray.length - n * byArray2.length);
        }
        return byArray;
    }

    @Override
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) throws sprull {
        if (this.cfr_renamed_2) {
            return this.cfr_renamed_3740(arg0, arg1, arg2);
        }
        return this.cfr_renamed_3739(arg0, arg1, arg2);
    }
}

