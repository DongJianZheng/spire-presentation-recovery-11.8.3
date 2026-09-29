/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcty;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprfe;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.sprkll;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprmuk;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprosk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrkl;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.spruwk;
import com.spire.presentation.packages.sprvse;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzph;
import com.spire.presentation.packages.sprzuk;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprntk {
    private boolean cfr_renamed_119;
    private sprqxk cfr_renamed_91;
    private final sprgf cfr_renamed_0;
    private SecureRandom cfr_renamed_1;
    private int cfr_renamed_2;
    private final spruwk cfr_renamed_3;
    private sprmuk cfr_renamed_4;

    public sprfe cfr_renamed_3284() {
        return new sprzph();
    }

    private /* synthetic */ void cfr_renamed_10340(sprgf arg0, spreuh arg1, byte[] arg2) {
        sprgf sprgf2 = arg0;
        int n = sprgf2.cfr_renamed_1218();
        byte[] byArray = new byte[Math.max(4, n)];
        int n2 = 0;
        sprhx sprhx2 = null;
        sprhx sprhx3 = null;
        if (sprgf2 instanceof sprhx) {
            sprgf sprgf3 = arg0;
            spreuh spreuh2 = arg1;
            this.cfr_renamed_9926(arg0, spreuh2.cfr_renamed_1969());
            this.cfr_renamed_9926(sprgf3, spreuh2.cfr_renamed_1973());
            sprhx2 = (sprhx)((Object)sprgf3);
            sprhx3 = sprhx2.cfr_renamed_461();
        }
        int n3 = 0;
        int n4 = n2;
        while (n4 < arg2.length) {
            if (sprhx2 != null) {
                sprhx2.cfr_renamed_5183(sprhx3);
            } else {
                sprgf sprgf4 = arg0;
                this.cfr_renamed_9926(sprgf4, arg1.cfr_renamed_1969());
                this.cfr_renamed_9926(sprgf4, arg1.cfr_renamed_1973());
            }
            sprpxe.cfr_renamed_442(++n3, byArray, 0);
            sprgf sprgf5 = arg0;
            sprgf5.cfr_renamed_1197(byArray, 0, 4);
            sprgf5.cfr_renamed_1219(byArray, 0);
            int n5 = Math.min(n, arg2.length - n2);
            this.cfr_renamed_3421(arg2, byArray, n2, n5);
            n4 = n2 + n5;
        }
    }

    private /* synthetic */ void cfr_renamed_3421(byte[] arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        int n2 = n = 0;
        while (n2 != arg3) {
            int n3 = arg2 + n;
            byte by = (byte)(arg0[n3] ^ arg1[n]);
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprntk(spruwk spruwk2) {
        this(new sprkll(), (spruwk)arg0);
        void arg0;
    }

    public sprntk(sprgf arg0) {
        this(arg0, spruwk.cfr_renamed_2);
    }

    public int cfr_renamed_1202(int arg0) {
        return 1 + 2 * this.cfr_renamed_2 + arg0 + this.cfr_renamed_0.cfr_renamed_1218();
    }

    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) throws sprull {
        if (arg1 + arg2 > arg0.length || arg2 == 0) {
            throw new sprddl(sprcty.cfr_renamed_9("-54.0{&.\"=!)d/+4d(,46/"));
        }
        if (this.cfr_renamed_119) {
            return this.cfr_renamed_3485(arg0, arg1, arg2);
        }
        return this.cfr_renamed_10341(arg0, arg1, arg2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ byte[] cfr_renamed_3485(byte[] arg0, int arg1, int arg2) throws sprull {
        spreuh spreuh2;
        byte[] byArray;
        Object object;
        sprntk sprntk2;
        byte[] byArray2 = new byte[arg2];
        System.arraycopy(arg0, arg1, byArray2, 0, byArray2.length);
        sprfe sprfe2 = this.cfr_renamed_3284();
        do {
            sprntk sprntk3 = this;
            object = sprntk3.cfr_renamed_3208();
            byArray = sprfe2.cfr_renamed_8926(this.cfr_renamed_91.cfr_renamed_1145(), (BigInteger)object).cfr_renamed_1775().cfr_renamed_1972(false);
            spreuh2 = ((sprnzk)sprntk3.cfr_renamed_4).cfr_renamed_1604().cfr_renamed_1830((BigInteger)object).cfr_renamed_1775();
            sprntk2 = this;
            sprntk2.cfr_renamed_10340(this.cfr_renamed_0, spreuh2, byArray2);
        } while (sprntk2.cfr_renamed_10342(byArray2, arg0, arg1));
        sprntk sprntk4 = this;
        object = new byte[sprntk4.cfr_renamed_0.cfr_renamed_1218()];
        sprntk4.cfr_renamed_9926(sprntk4.cfr_renamed_0, spreuh2.cfr_renamed_1969());
        sprntk4.cfr_renamed_0.cfr_renamed_1197(arg0, arg1, arg2);
        sprntk4.cfr_renamed_9926(sprntk4.cfr_renamed_0, spreuh2.cfr_renamed_1973());
        sprntk4.cfr_renamed_0.cfr_renamed_1219((byte[])object, 0);
        switch (sprosk.cfr_renamed_4[this.cfr_renamed_3.ordinal()]) {
            case 1: {
                return sproze.cfr_renamed_527(byArray, (byte[])object, byArray2);
            }
        }
        return sproze.cfr_renamed_527(byArray, byArray2, (byte[])object);
    }

    private /* synthetic */ void cfr_renamed_9926(sprgf arg0, sprlsh arg1) {
        byte[] byArray = sprhdf.cfr_renamed_512(this.cfr_renamed_2, arg1.cfr_renamed_1779());
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
    }

    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprntk sprntk2;
        this.cfr_renamed_119 = arg0;
        if (this.cfr_renamed_119) {
            sprbgk sprbgk2 = (sprbgk)arg1;
            this.cfr_renamed_4 = (sprmuk)sprbgk2.cfr_renamed_284();
            sprntk sprntk3 = this;
            sprntk3.cfr_renamed_91 = sprntk3.cfr_renamed_4.cfr_renamed_284();
            if (((sprnzk)sprntk3.cfr_renamed_4).cfr_renamed_1604().cfr_renamed_1830(this.cfr_renamed_91.cfr_renamed_1153()).cfr_renamed_1952()) {
                throw new IllegalArgumentException(sprvse.cfr_renamed_9("rCmLwD\u007f\rpHb\u0017;vspJ\rzY;DuKrCrYb"));
            }
            sprntk2 = this;
            this.cfr_renamed_1 = sprbgk2.cfr_renamed_1295();
        } else {
            this.cfr_renamed_4 = (sprmuk)arg1;
            sprntk sprntk4 = this;
            sprntk2 = sprntk4;
            sprntk4.cfr_renamed_91 = sprntk4.cfr_renamed_4.cfr_renamed_284();
        }
        sprntk2.cfr_renamed_2 = (this.cfr_renamed_91.cfr_renamed_1769().cfr_renamed_1938() + 7) / 8;
        sprybl.cfr_renamed_9170(new sprfdl(sprcty.cfr_renamed_9("\b\ti"), sprrkl.cfr_renamed_9917(this.cfr_renamed_91.cfr_renamed_1769()), this.cfr_renamed_4, sprlrk.cfr_renamed_9915(arg0)));
    }

    private /* synthetic */ boolean cfr_renamed_10342(byte[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 != arg0.length) {
            if (arg0[n] != arg1[arg2 + n]) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    private /* synthetic */ byte[] cfr_renamed_10341(byte[] arg0, int arg1, int arg2) throws sprull {
        sprntk sprntk2;
        byte[] byArray = new byte[this.cfr_renamed_2 * 2 + 1];
        System.arraycopy(arg0, arg1, byArray, 0, byArray.length);
        spreuh spreuh2 = this.cfr_renamed_91.cfr_renamed_1769().cfr_renamed_2002(byArray);
        if (spreuh2.cfr_renamed_1830(this.cfr_renamed_91.cfr_renamed_1153()).cfr_renamed_1952()) {
            throw new sprull(sprvse.cfr_renamed_9("@EFn*\rzY;DuKrCrYb"));
        }
        spreuh2 = spreuh2.cfr_renamed_1830(((sprzuk)this.cfr_renamed_4).cfr_renamed_2112()).cfr_renamed_1775();
        int n = this.cfr_renamed_0.cfr_renamed_1218();
        byte[] byArray2 = new byte[arg2 - byArray.length - n];
        if (this.cfr_renamed_3 == spruwk.cfr_renamed_4) {
            System.arraycopy(arg0, arg1 + byArray.length + n, byArray2, 0, byArray2.length);
            sprntk2 = this;
        } else {
            System.arraycopy(arg0, arg1 + byArray.length, byArray2, 0, byArray2.length);
            sprntk2 = this;
        }
        sprntk2.cfr_renamed_10340(this.cfr_renamed_0, spreuh2, byArray2);
        sprntk sprntk3 = this;
        byte[] byArray3 = new byte[sprntk3.cfr_renamed_0.cfr_renamed_1218()];
        sprntk3.cfr_renamed_9926(sprntk3.cfr_renamed_0, spreuh2.cfr_renamed_1969());
        sprntk3.cfr_renamed_0.cfr_renamed_1197(byArray2, 0, byArray2.length);
        sprntk sprntk4 = this;
        sprntk4.cfr_renamed_9926(sprntk4.cfr_renamed_0, spreuh2.cfr_renamed_1973());
        sprntk4.cfr_renamed_0.cfr_renamed_1219(byArray3, 0);
        int n2 = 0;
        if (sprntk4.cfr_renamed_3 == spruwk.cfr_renamed_4) {
            int n3;
            int n4 = n3 = 0;
            while (n4 != byArray3.length) {
                byte by = byArray3[n3];
                byte by2 = arg0[arg1 + byArray.length + n3];
                n2 |= by ^ by2;
                n4 = ++n3;
            }
        } else {
            int n5;
            int n6 = n5 = 0;
            while (n6 != byArray3.length) {
                byte by = byArray3[n5];
                byte by3 = arg0[arg1 + byArray.length + byArray2.length + n5];
                n2 |= by ^ by3;
                n6 = ++n5;
            }
        }
        sproze.cfr_renamed_492(byArray, (byte)0);
        sproze.cfr_renamed_492(byArray3, (byte)0);
        if (n2 != 0) {
            sproze.cfr_renamed_492(byArray2, (byte)0);
            throw new sprull(sprcty.cfr_renamed_9("2*-%7-?d8-+,>6{0></"));
        }
        return byArray2;
    }

    private /* synthetic */ BigInteger cfr_renamed_3208() {
        BigInteger bigInteger;
        int n = this.cfr_renamed_91.cfr_renamed_1146().bitLength();
        while ((bigInteger = sprhdf.cfr_renamed_5230(n, this.cfr_renamed_1)).equals(sprhdf.cfr_renamed_0) || bigInteger.compareTo(this.cfr_renamed_91.cfr_renamed_1146()) >= 0) {
        }
        return bigInteger;
    }

    /*
     * WARNING - void declaration
     */
    public sprntk(sprgf sprgf2, spruwk spruwk2) {
        void arg1;
        void arg0;
        if (spruwk2 == null) {
            throw new IllegalArgumentException(sprvse.cfr_renamed_9("vB\u007fH;NzCuBo\ryH;cNaW"));
        }
        this.cfr_renamed_0 = arg0;
        this.cfr_renamed_3 = arg1;
    }

    public sprntk() {
        this(new sprkll());
    }
}

