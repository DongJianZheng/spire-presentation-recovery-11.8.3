/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprimd;
import com.spire.presentation.packages.sprizd;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprpld;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.sprylp;
import com.spire.presentation.packages.sprzkd;
import java.math.BigInteger;
import java.security.SecureRandom;

public class spruid
implements sprh {
    private static final BigInteger cfr_renamed_119 = BigInteger.valueOf(0L);
    private boolean cfr_renamed_91;
    private int cfr_renamed_0;
    private static final BigInteger cfr_renamed_1;
    private static final BigInteger cfr_renamed_2;
    private sprpld cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    @Override
    public int cfr_renamed_1344() {
        if (this.cfr_renamed_91) {
            return (this.cfr_renamed_0 - 1) / 8;
        }
        return 2 * ((this.cfr_renamed_0 + 7) / 8);
    }

    @Override
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) {
        byte[] byArray;
        BigInteger bigInteger;
        byte[] byArray2;
        int n;
        if (this.cfr_renamed_3 == null) {
            throw new IllegalStateException(sprylp.cfr_renamed_9("+e)h\u0003h\u0002)\u000bg\t`\u0000lNg\u0001}N`\u0000`\u001a`\u000fe\u0007z\u000bm"));
        }
        int n2 = n = this.cfr_renamed_91 ? (this.cfr_renamed_0 - 1 + 7) / 8 : this.cfr_renamed_1344();
        if (arg2 > n) {
            throw new sprjkd(sprizd.cfr_renamed_9("T9M\"IwI8RwQ6O0Xw[8Owx;z6P6Qw^>M?X%\u0013]"));
        }
        spruid spruid2 = this;
        BigInteger bigInteger2 = spruid2.cfr_renamed_3.cfr_renamed_284().cfr_renamed_1155();
        if (spruid2.cfr_renamed_3 instanceof sprimd) {
            byte[] byArray3 = new byte[arg2 / 2];
            byte[] byArray4 = new byte[arg2 / 2];
            System.arraycopy(arg0, arg1, byArray3, 0, byArray3.length);
            System.arraycopy(arg0, arg1 + byArray3.length, byArray4, 0, byArray4.length);
            BigInteger bigInteger3 = new BigInteger(1, byArray3);
            BigInteger bigInteger4 = new BigInteger(1, byArray4);
            sprimd sprimd2 = (sprimd)this.cfr_renamed_3;
            BigInteger bigInteger5 = bigInteger3.modPow(bigInteger2.subtract(cfr_renamed_2).subtract(sprimd2.cfr_renamed_1980()), bigInteger2).multiply(bigInteger4).mod(bigInteger2);
            return sprvpa.cfr_renamed_514(bigInteger5);
        }
        if (arg1 != 0 || arg2 != arg0.length) {
            byArray2 = new byte[arg2];
            System.arraycopy(arg0, arg1, byArray2, 0, arg2);
        } else {
            byArray2 = arg0;
        }
        BigInteger bigInteger6 = new BigInteger(1, byArray2);
        if (bigInteger6.compareTo(bigInteger2) >= 0) {
            throw new sprjkd(sprylp.cfr_renamed_9("\u0007g\u001e|\u001a)\u001af\u0001)\u0002h\u001cn\u000b)\bf\u001c)+e)h\u0003h\u0002)\r`\u001ea\u000b{@\u0003"));
        }
        sprzkd sprzkd2 = (sprzkd)this.cfr_renamed_3;
        int n3 = bigInteger2.bitLength();
        BigInteger bigInteger7 = bigInteger = new BigInteger(n3, this.cfr_renamed_4);
        while (bigInteger7.equals(cfr_renamed_119) || bigInteger.compareTo(bigInteger2.subtract(cfr_renamed_1)) > 0) {
            bigInteger7 = new BigInteger(n3, this.cfr_renamed_4);
        }
        spruid spruid3 = this;
        BigInteger bigInteger8 = spruid3.cfr_renamed_3.cfr_renamed_284().cfr_renamed_1145();
        BigInteger bigInteger9 = bigInteger8.modPow(bigInteger, bigInteger2);
        BigInteger bigInteger10 = bigInteger6.multiply(sprzkd2.spr\u3181().modPow(bigInteger, bigInteger2)).mod(bigInteger2);
        byte[] byArray5 = bigInteger9.toByteArray();
        byte[] byArray6 = bigInteger10.toByteArray();
        byte[] byArray7 = new byte[spruid3.cfr_renamed_1339()];
        if (byArray5.length > byArray7.length / 2) {
            System.arraycopy(byArray5, 1, byArray7, byArray7.length / 2 - (byArray5.length - 1), byArray5.length - 1);
            byArray = byArray6;
        } else {
            System.arraycopy(byArray5, 0, byArray7, byArray7.length / 2 - byArray5.length, byArray5.length);
            byArray = byArray6;
        }
        if (byArray.length > byArray7.length / 2) {
            System.arraycopy(byArray6, 1, byArray7, byArray7.length - (byArray6.length - 1), byArray6.length - 1);
            return byArray7;
        }
        System.arraycopy(byArray6, 0, byArray7, byArray7.length - byArray6.length, byArray6.length);
        return byArray7;
    }

    @Override
    public int cfr_renamed_1339() {
        if (this.cfr_renamed_91) {
            return 2 * ((this.cfr_renamed_0 + 7) / 8);
        }
        return (this.cfr_renamed_0 - 1) / 8;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        spruid spruid2;
        Object object;
        if (arg1 instanceof spraed) {
            object = (spraed)arg1;
            this.cfr_renamed_3 = (sprpld)((spraed)object).cfr_renamed_284();
            spruid2 = this;
            this.cfr_renamed_4 = ((spraed)object).cfr_renamed_1295();
        } else {
            this.cfr_renamed_3 = (sprpld)arg1;
            spruid2 = this;
            this.cfr_renamed_4 = new SecureRandom();
        }
        spruid2.cfr_renamed_91 = arg0;
        object = this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_1155();
        this.cfr_renamed_0 = ((BigInteger)object).bitLength();
        if (arg0) {
            if (!(this.cfr_renamed_3 instanceof sprzkd)) {
                throw new IllegalArgumentException(sprizd.cfr_renamed_9("\u0012Q\u0010\\:\\;m\"_;T4v2D\u0007\\%\\:X#X%Nw\\%XwO2L\"T%X3\u001d1R%\u001d2S4O.M#T8Sy"));
            }
        } else if (!(this.cfr_renamed_3 instanceof sprimd)) {
            throw new IllegalArgumentException(sprylp.cfr_renamed_9("+e)h\u0003h\u0002Y\u001c`\u0018h\u001al%l\u0017Y\u000f{\u000fd\u000b}\u000b{\u001d)\u000f{\u000b)\u001cl\u001f|\u0007{\u000bmNo\u0001{Nm\u000bj\u001cp\u001e}\u0007f\u0000'"));
        }
    }

    static {
        cfr_renamed_2 = BigInteger.valueOf(1L);
        cfr_renamed_1 = BigInteger.valueOf(2L);
    }
}

