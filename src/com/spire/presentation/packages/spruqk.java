/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprfto;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprpzz;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;

public abstract class spruqk
implements sprmr {
    public int[] cfr_renamed_91;
    public static final int cfr_renamed_0 = -1640531527;
    public static final int cfr_renamed_1 = 16;
    public boolean cfr_renamed_2;
    public static final int cfr_renamed_3 = 32;
    public int cfr_renamed_4;

    public final void cfr_renamed_10307(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n = arg2 ^ arg4;
        int n2 = arg1 ^ arg2 & n;
        int n3 = n ^ n2;
        int[] nArray = arg0;
        int[] nArray2 = arg0;
        arg0[3] = arg3 ^ n3;
        int n4 = arg2 ^ n & n2;
        int n5 = nArray[3] | n4;
        arg0[1] = n2 ^ n5;
        int n6 = ~nArray2[1];
        int n7 = nArray[3] ^ n4;
        nArray2[0] = n6 ^ n7;
        nArray[2] = n3 ^ (n6 | n7);
    }

    public final void cfr_renamed_10301(int[] arg0) {
        int[] nArray = arg0;
        int[] nArray2 = arg0;
        int n = spruqk.cfr_renamed_493(nArray[2], 22) ^ arg0[3] ^ arg0[1] << 7;
        int n2 = spruqk.cfr_renamed_493(nArray2[0], 5) ^ arg0[1] ^ arg0[3];
        int n3 = spruqk.cfr_renamed_493(arg0[3], 7);
        int n4 = spruqk.cfr_renamed_493(nArray[1], 1);
        nArray2[3] = n3 ^ n ^ n2 << 3;
        nArray[1] = n4 ^ n2 ^ n;
        nArray2[2] = spruqk.cfr_renamed_493(n, 3);
        nArray[0] = spruqk.cfr_renamed_493(n2, 13);
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (arg1 instanceof sprtpk) {
            this.cfr_renamed_2 = arg0;
            byte[] byArray = ((sprtpk)arg1).cfr_renamed_1521();
            this.cfr_renamed_91 = this.cfr_renamed_3585(byArray);
            sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), byArray.length * 8, arg1, this.cfr_renamed_10343()));
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprpzz.cfr_renamed_9("4Z+U1]9\u0014-U/U0Q)Q/\u0014-U.G8P}@2\u0014")).append(this.cfr_renamed_1315()).append(sprfto.cfr_renamed_9("$8j8pq)q")).append(arg1.getClass().getName()).toString());
    }

    private /* synthetic */ spriil cfr_renamed_10343() {
        if (this.cfr_renamed_91 == null) {
            return spriil.cfr_renamed_0;
        }
        if (this.cfr_renamed_2) {
            return spriil.cfr_renamed_3;
        }
        return spriil.cfr_renamed_152;
    }

    public final void cfr_renamed_10304(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n = arg3 | arg4;
        int n2 = arg1 & n;
        int n3 = arg2 ^ n2;
        int n4 = arg1 & n3;
        int n5 = arg3 ^ n4;
        arg0[1] = arg4 ^ n5;
        int n6 = ~arg1;
        int n7 = n5 & arg0[1];
        arg0[3] = n3 ^ n7;
        int n8 = arg0[1] | n6;
        int n9 = arg4 ^ n8;
        arg0[0] = arg0[3] ^ n9;
        arg0[2] = n3 & n9 ^ (arg0[1] ^ n6);
    }

    @Override
    public final int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (this.cfr_renamed_91 == null) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprpzz.cfr_renamed_9("}Z2@}]3])]<X4G8P")).toString());
        }
        if (arg1 + 16 > arg0.length) {
            throw new sprddl(sprfto.cfr_renamed_9("m?t$pqf$b7a#$%k>$\"l>v%"));
        }
        if (arg3 + 16 > arg2.length) {
            throw new sprwjl(sprpzz.cfr_renamed_9("[(@-A)\u0014?A;R8F}@2[}G5[/@"));
        }
        if (this.cfr_renamed_2) {
            this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        } else {
            this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
        }
        return 16;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprfto.cfr_renamed_9("\u0002a#t4j%");
    }

    public final void cfr_renamed_10306(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n = arg2 ^ arg4;
        int n2 = ~n;
        int n3 = arg1 ^ arg3;
        int n4 = arg3 ^ n;
        int n5 = arg2 & n4;
        arg0[0] = n3 ^ n5;
        int n6 = arg1 | n2;
        int n7 = arg4 ^ n6;
        int n8 = n3 | n7;
        arg0[3] = n ^ n8;
        int n9 = ~n4;
        int n10 = arg0[0] | arg0[3];
        arg0[1] = n9 ^ n10;
        arg0[2] = arg4 & n9 ^ (n3 ^ n10);
    }

    public abstract int[] cfr_renamed_3585(byte[] var1);

    public abstract void cfr_renamed_3396(byte[] var1, int var2, byte[] var3, int var4);

    public abstract void cfr_renamed_3393(byte[] var1, int var2, byte[] var3, int var4);

    public final void cfr_renamed_10311(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n = arg2 ^ ~arg1;
        int n2 = arg3 ^ (arg1 | n);
        arg0[2] = arg4 ^ n2;
        int n3 = arg2 ^ (arg4 | n);
        int[] nArray = arg0;
        int n4 = n ^ nArray[2];
        nArray[3] = n4 ^ n2 & n3;
        int n5 = n2 ^ n3;
        arg0[1] = arg0[3] ^ n5;
        arg0[0] = n2 ^ n4 & n5;
    }

    public final void cfr_renamed_10305(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n = arg1 | arg2;
        int n2 = arg2 ^ arg3;
        int n3 = arg2 & n2;
        int n4 = arg1 ^ n3;
        int n5 = arg3 ^ n4;
        int n6 = arg4 | n4;
        int[] nArray = arg0;
        arg0[0] = n2 ^ n6;
        int n7 = n2 | n6;
        int n8 = arg4 ^ n7;
        nArray[2] = n5 ^ n8;
        int n9 = n ^ n8;
        int n10 = arg0[0] & n9;
        arg0[3] = n4 ^ n10;
        nArray[1] = arg0[3] ^ (arg0[0] ^ n9);
    }

    public final void cfr_renamed_10317(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n = arg2 ^ arg3;
        int n2 = arg3 & n;
        int n3 = arg4 ^ n2;
        int n4 = arg1 ^ n3;
        int n5 = arg4 | n;
        int n6 = n4 & n5;
        int[] nArray = arg0;
        arg0[1] = arg2 ^ n6;
        int n7 = n3 | arg0[1];
        int n8 = arg1 & n4;
        nArray[3] = n ^ n8;
        int n9 = n4 ^ n7;
        int n10 = arg0[3] & n9;
        arg0[2] = n3 ^ n10;
        nArray[0] = ~n9 ^ arg0[3] & arg0[2];
    }

    public static int cfr_renamed_493(int arg0, int arg1) {
        return arg0 >>> arg1 | arg0 << -arg1;
    }

    public final void cfr_renamed_10309(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n = arg1 ^ arg4;
        int n2 = arg3 ^ n;
        int n3 = arg2 ^ n2;
        int[] nArray = arg0;
        arg0[3] = arg1 & arg4 ^ n3;
        int n4 = arg1 ^ arg2 & n;
        nArray[2] = n3 ^ (arg3 | n4);
        int n5 = arg0[3] & (n2 ^ n4);
        arg0[1] = ~n2 ^ n5;
        nArray[0] = n5 ^ ~n4;
    }

    @Override
    public int cfr_renamed_1195() {
        return 16;
    }

    public final void cfr_renamed_10313(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n = arg1 ^ arg2;
        int n2 = arg1 & arg3;
        int n3 = arg1 | arg4;
        int n4 = arg3 ^ arg4;
        int n5 = n & n3;
        int n6 = n2 | n5;
        arg0[2] = n4 ^ n6;
        int n7 = arg2 ^ n3;
        int n8 = n6 ^ n7;
        int n9 = n4 & n8;
        arg0[0] = n ^ n9;
        int n10 = arg0[2] & arg0[0];
        arg0[1] = n8 ^ n10;
        arg0[3] = (arg2 | arg4) ^ (n4 ^ n10);
    }

    public final void cfr_renamed_10310(int[] arg0) {
        int[] nArray = arg0;
        int[] nArray2 = arg0;
        int n = spruqk.cfr_renamed_494(nArray[0], 13);
        int n2 = spruqk.cfr_renamed_494(nArray2[2], 3);
        int n3 = nArray[1] ^ n ^ n2;
        int n4 = nArray2[3] ^ n2 ^ n << 3;
        nArray[1] = spruqk.cfr_renamed_494(n3, 1);
        nArray2[3] = spruqk.cfr_renamed_494(n4, 7);
        nArray[0] = spruqk.cfr_renamed_494(n ^ arg0[1] ^ arg0[3], 5);
        nArray2[2] = spruqk.cfr_renamed_494(n2 ^ arg0[3] ^ arg0[1] << 7, 22);
    }

    public final void cfr_renamed_10302(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n = ~arg1;
        int n2 = arg1 ^ arg2;
        int n3 = arg3 ^ n2;
        int n4 = arg3 | n;
        int n5 = arg4 ^ n4;
        int[] nArray = arg0;
        nArray[1] = n3 ^ n5;
        int n6 = n3 & n5;
        int n7 = n2 ^ n6;
        int n8 = arg2 | n7;
        nArray[3] = n5 ^ n8;
        int n9 = arg2 | arg0[3];
        arg0[0] = n7 ^ n9;
        arg0[2] = arg4 & n ^ (n3 ^ n9);
    }

    public final void cfr_renamed_10308(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n = ~arg1;
        int n2 = arg1 ^ arg2;
        int n3 = arg4 ^ (n | n2);
        int n4 = arg3 ^ n3;
        arg0[2] = n2 ^ n4;
        int n5 = n ^ arg4 & n2;
        int[] nArray = arg0;
        nArray[1] = n3 ^ nArray[2] & n5;
        arg0[3] = arg1 & n3 ^ (n4 | arg0[1]);
        arg0[0] = arg0[3] ^ (n4 ^ n5);
    }

    public final void cfr_renamed_10312(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n = ~arg1;
        int n2 = arg2 ^ arg4;
        int n3 = arg3 & n;
        arg0[0] = n2 ^ n3;
        int n4 = arg3 ^ n;
        int[] nArray = arg0;
        int n5 = arg3 ^ nArray[0];
        int n6 = arg2 & n5;
        nArray[3] = n4 ^ n6;
        arg0[2] = arg1 ^ (arg4 | n6) & (arg0[0] | n4);
        arg0[1] = n2 ^ arg0[3] ^ (arg0[2] ^ (arg4 | n));
    }

    public static int cfr_renamed_494(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> -arg1;
    }

    public final void cfr_renamed_10315(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n = ~arg1;
        int n2 = arg1 ^ arg2;
        int n3 = arg1 ^ arg4;
        int n4 = arg3 ^ n;
        int n5 = n2 | n3;
        arg0[0] = n4 ^ n5;
        int n6 = arg4 & arg0[0];
        int[] nArray = arg0;
        int n7 = n2 ^ nArray[0];
        nArray[1] = n6 ^ n7;
        int n8 = n | arg0[0];
        int n9 = n2 | n6;
        int n10 = n3 ^ n8;
        arg0[2] = n9 ^ n10;
        arg0[3] = arg2 ^ n6 ^ arg0[1] & n10;
    }

    public final void cfr_renamed_10314(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n = arg1 ^ arg4;
        int n2 = arg4 & n;
        int n3 = arg3 ^ n2;
        int n4 = arg2 | n3;
        int[] nArray = arg0;
        nArray[3] = n ^ n4;
        int n5 = ~arg2;
        int n6 = n | n5;
        nArray[0] = n3 ^ n6;
        int n7 = arg1 & arg0[0];
        int n8 = n ^ n5;
        int n9 = n4 & n8;
        arg0[2] = n7 ^ n9;
        arg0[1] = arg1 ^ n3 ^ n8 & arg0[2];
    }

    public final void cfr_renamed_10300(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n = arg3 | arg1 & arg2;
        int n2 = arg4 & (arg1 | arg2);
        arg0[3] = n ^ n2;
        int n3 = ~arg4;
        int n4 = arg2 ^ n2;
        int[] nArray = arg0;
        int n5 = n4 | nArray[3] ^ n3;
        nArray[1] = arg1 ^ n5;
        arg0[0] = arg3 ^ n4 ^ (arg4 | arg0[1]);
        arg0[2] = n ^ arg0[1] ^ (arg0[0] ^ arg1 & arg0[3]);
    }

    @Override
    public void cfr_renamed_41() {
    }

    public spruqk() {
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 256));
    }

    public final void cfr_renamed_10316(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n = ~arg1;
        int n2 = arg1 ^ arg4;
        int n3 = arg2 ^ n2;
        int n4 = n | n2;
        int n5 = arg3 ^ n4;
        arg0[1] = arg2 ^ n5;
        int[] nArray = arg0;
        int n6 = n2 | nArray[1];
        int n7 = arg4 ^ n6;
        int n8 = n5 & n7;
        nArray[2] = n3 ^ n8;
        int n9 = n5 ^ n7;
        arg0[0] = arg0[2] ^ n9;
        arg0[3] = ~n5 ^ n3 & n9;
    }

    public final void cfr_renamed_10303(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int n = ~arg3;
        int n2 = arg2 & n;
        int n3 = arg4 ^ n2;
        int n4 = arg1 & n3;
        int n5 = arg2 ^ n;
        arg0[3] = n4 ^ n5;
        int n6 = arg2 | arg0[3];
        int n7 = arg1 & n6;
        arg0[1] = n3 ^ n7;
        int n8 = arg1 | arg4;
        int n9 = n ^ n6;
        arg0[0] = n8 ^ n9;
        arg0[2] = arg2 & n8 ^ (n4 | arg1 ^ arg3);
    }
}

