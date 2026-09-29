/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.ShapeAlignmentEnum;
import com.spire.presentation.packages.spreb;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprelb;
import com.spire.presentation.packages.sprfld;
import com.spire.presentation.packages.sprib;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtn;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.sprwbf;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprxed;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprmld
implements sprtn {
    private boolean cfr_renamed_119;
    private boolean cfr_renamed_91;
    private sprfld cfr_renamed_0;
    private static final BigInteger cfr_renamed_1 = BigInteger.valueOf(1L);
    private SecureRandom cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprib cfr_renamed_4;

    public sprt cfr_renamed_3488(byte[] arg0, int arg1) {
        return this.cfr_renamed_1456(arg0, 0, arg0.length, arg1);
    }

    public spreb cfr_renamed_3284() {
        return new sprelb();
    }

    /*
     * WARNING - void declaration
     */
    public sprmld(sprib sprib2, SecureRandom secureRandom) {
        void arg1;
        void arg0;
        sprmld sprmld2 = this;
        sprmld sprmld3 = this;
        this.cfr_renamed_4 = arg0;
        sprmld3.cfr_renamed_2 = arg1;
        sprmld3.cfr_renamed_91 = false;
        sprmld2.cfr_renamed_119 = false;
        sprmld2.cfr_renamed_3 = false;
    }

    @Override
    public sprt cfr_renamed_1456(byte[] arg0, int arg1, int arg2, int arg3) throws IllegalArgumentException {
        if (!(this.cfr_renamed_0 instanceof spreed)) {
            throw new IllegalArgumentException(sprwbf.cfr_renamed_9("g3^7V5Ra\\$NaE$F4^3R%\u0017'X3\u0017$Y\"E8G5^.Y"));
        }
        spreed spreed2 = (spreed)this.cfr_renamed_0;
        sprqid sprqid2 = spreed2.cfr_renamed_284();
        sprpib sprpib2 = sprqid2.cfr_renamed_1769();
        BigInteger bigInteger = sprqid2.cfr_renamed_1146();
        BigInteger bigInteger2 = sprqid2.cfr_renamed_1153();
        byte[] byArray = new byte[arg2];
        System.arraycopy(arg0, arg1, byArray, 0, arg2);
        sprrlb sprrlb2 = sprpib2.cfr_renamed_2002(byArray);
        if (this.cfr_renamed_91 || this.cfr_renamed_119) {
            sprrlb2 = sprrlb2.cfr_renamed_1830(bigInteger2);
        }
        BigInteger bigInteger3 = spreed2.cfr_renamed_2112();
        if (this.cfr_renamed_91) {
            bigInteger3 = bigInteger3.multiply(bigInteger2.modInverse(bigInteger)).mod(bigInteger);
        }
        byte[] byArray2 = sprrlb2.cfr_renamed_1830(bigInteger3).cfr_renamed_1775().cfr_renamed_1969().cfr_renamed_91();
        byte[] byArray3 = this.cfr_renamed_3 ? sprzra.cfr_renamed_543(byArray, byArray2) : byArray2;
        sprmld sprmld2 = this;
        sprmld2.cfr_renamed_4.cfr_renamed_2342(new sprxed(byArray3, null));
        byte[] byArray4 = new byte[arg3];
        sprmld2.cfr_renamed_4.cfr_renamed_2341(byArray4, 0, byArray4.length);
        return new sprnld(byArray4);
    }

    public sprt cfr_renamed_3487(byte[] arg0, int arg1) {
        return this.cfr_renamed_3485(arg0, 0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprmld(sprib sprib2, SecureRandom secureRandom, boolean bl, boolean bl2, boolean bl3) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprmld sprmld2 = this;
        sprmld sprmld3 = this;
        this.cfr_renamed_4 = arg0;
        sprmld3.cfr_renamed_2 = arg1;
        sprmld3.cfr_renamed_91 = arg2;
        sprmld2.cfr_renamed_119 = arg3;
        sprmld2.cfr_renamed_3 = bl3;
    }

    @Override
    public sprt cfr_renamed_3485(byte[] arg0, int arg1, int arg2) throws IllegalArgumentException {
        if (!(this.cfr_renamed_0 instanceof sprwmd)) {
            throw new IllegalArgumentException(ShapeAlignmentEnum.cfr_renamed_9("f~Tg_h\u0016`Sr\u0016ySzCbDnR+PdD+SeUyO{BbYe"));
        }
        sprwmd sprwmd2 = (sprwmd)this.cfr_renamed_0;
        sprqid sprqid2 = sprwmd2.cfr_renamed_284();
        sprpib sprpib2 = sprqid2.cfr_renamed_1769();
        BigInteger bigInteger = sprqid2.cfr_renamed_1146();
        BigInteger bigInteger2 = sprqid2.cfr_renamed_1153();
        BigInteger bigInteger3 = sprvpa.cfr_renamed_513(cfr_renamed_1, bigInteger, this.cfr_renamed_2);
        BigInteger bigInteger4 = this.cfr_renamed_91 ? bigInteger3.multiply(bigInteger2).mod(bigInteger) : bigInteger3;
        spreb spreb2 = this.cfr_renamed_3284();
        sprrlb[] sprrlbArray = new sprrlb[2];
        sprrlbArray[0] = spreb2.cfr_renamed_1968(sprqid2.cfr_renamed_1145(), bigInteger3);
        sprrlbArray[1] = sprwmd2.cfr_renamed_1604().cfr_renamed_1830(bigInteger4);
        sprrlb[] sprrlbArray2 = sprrlbArray;
        sprpib2.cfr_renamed_1805(sprrlbArray2);
        sprrlb sprrlb2 = sprrlbArray2[0];
        sprrlb sprrlb3 = sprrlbArray2[1];
        byte[] byArray = sprrlb2.cfr_renamed_91();
        System.arraycopy(byArray, 0, arg0, arg1, byArray.length);
        byte[] byArray2 = sprrlb3.cfr_renamed_1969().cfr_renamed_91();
        byte[] byArray3 = this.cfr_renamed_3 ? sprzra.cfr_renamed_543(byArray, byArray2) : byArray2;
        sprmld sprmld2 = this;
        sprmld2.cfr_renamed_4.cfr_renamed_2342(new sprxed(byArray3, null));
        byte[] byArray4 = new byte[arg2];
        sprmld2.cfr_renamed_4.cfr_renamed_2341(byArray4, 0, byArray4.length);
        return new sprnld(byArray4);
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) throws IllegalArgumentException {
        if (!(arg0 instanceof sprfld)) {
            throw new IllegalArgumentException(sprwbf.cfr_renamed_9("r\u0002\u0017*R8\u00173R0B(E$S"));
        }
        this.cfr_renamed_0 = (sprfld)arg0;
    }
}

