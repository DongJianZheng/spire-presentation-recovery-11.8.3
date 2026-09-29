/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyg;
import com.spire.presentation.packages.sprivk;
import com.spire.presentation.packages.sprjem;
import com.spire.presentation.packages.sprjzk;
import com.spire.presentation.packages.sprlxg;
import com.spire.presentation.packages.sprmjm;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpik;
import com.spire.presentation.packages.sprqld;
import com.spire.presentation.packages.sprsgm;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprtma;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprtxk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprycm;
import com.spire.presentation.packages.spryvg;
import com.spire.presentation.packages.sprzcm;
import com.spire.presentation.packages.sprzu;
import java.security.SecureRandom;

public abstract class sprdah
extends spryvg {
    private int cfr_renamed_91;
    private SecureRandom cfr_renamed_0;
    private char[] cfr_renamed_1;
    private sprsm cfr_renamed_2;
    private sprpik cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public sprzcm cfr_renamed_7854(int arg0, int arg1, byte[] arg2) throws sprtqg {
        return this.cfr_renamed_7852(arg0, arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprzcm cfr_renamed_7908(int arg0, int arg1, byte[] arg2) throws sprtqg {
        sprzu sprzu2;
        sprjzk sprjzk2;
        byte[] byArray = this.cfr_renamed_7861(arg0);
        byte[] byArray2 = new byte[4];
        byArray2[0] = -61;
        byArray2[1] = 6;
        byArray2[2] = (byte)arg0;
        byArray2[3] = (byte)arg1;
        byte[] byArray3 = byArray2;
        sprjzk sprjzk3 = sprjzk2 = new sprjzk(new sprohl());
        sprjzk sprjzk4 = sprjzk2;
        sprjzk3.cfr_renamed_5671(new sprivk(byArray, null, byArray3));
        byte[] byArray4 = new byte[sprycm.cfr_renamed_7909(arg0)];
        sprjzk3.cfr_renamed_2341(byArray4, 0, byArray4.length);
        byte[] byArray5 = new byte[arg2.length - 3];
        System.arraycopy(arg2, 1, byArray5, 0, byArray5.length);
        byte[] byArray6 = new byte[sprsgm.cfr_renamed_7910(arg1)];
        this.cfr_renamed_0.nextBytes(byArray6);
        sprzu sprzu3 = sprzu2 = sprlxg.cfr_renamed_7911(arg0, arg1);
        sprzu3.cfr_renamed_5535(true, new sprtxk(new sprtpk(byArray4), 128, byArray6, byArray3));
        int n = sprsgm.cfr_renamed_7912(arg1);
        byte[] byArray7 = new byte[sprzu3.cfr_renamed_1202(byArray5.length)];
        int n2 = sprzu2.cfr_renamed_505(byArray5, 0, byArray5.length, byArray7, 0);
        try {
            n2 += sprzu2.cfr_renamed_1219(byArray7, n2);
        }
        catch (sprull sprull2) {
            throw new sprtqg(sprqld.cfr_renamed_9("\u0004u\tz\b`Gq\tw\u0015m\u0017`Gg\u0002g\u0014}\bzG}\tr\b"), sprull2);
        }
        byte[] byArray8 = sproze.cfr_renamed_533(byArray7, 0, byArray7.length - n);
        byte[] byArray9 = sproze.cfr_renamed_533(byArray7, byArray8.length, byArray7.length);
        return sprjem.cfr_renamed_7913(arg0, arg1, byArray6, this.cfr_renamed_3, byArray8, byArray9);
    }

    public sprdah cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    @Override
    public sprzcm cfr_renamed_7850(int arg0, int arg1, byte[] arg2) throws sprtqg {
        return this.cfr_renamed_7908(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprdah(char[] cArray, sprmjm sprmjm2) {
        void arg1;
        sprdah sprdah2 = this;
        sprdah2.cfr_renamed_4 = -1;
        sprdah2.cfr_renamed_1 = cArray;
        sprdah sprdah3 = this;
        sprdah2.cfr_renamed_3 = new sprpik((sprmjm)arg1);
    }

    public sprdah cfr_renamed_7914(int arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public abstract byte[] cfr_renamed_7915(int var1, byte[] var2, byte[] var3) throws sprtqg;

    /*
     * WARNING - void declaration
     */
    public sprdah(char[] cArray, sprsm sprsm2, int n) {
        void arg2;
        void arg1;
        void arg0;
        sprdah sprdah2 = this;
        this.cfr_renamed_4 = -1;
        sprdah2.cfr_renamed_1 = arg0;
        sprdah2.cfr_renamed_2 = arg1;
        if (n < 0 || arg2 > 255) {
            throw new IllegalArgumentException(sprtma.cfr_renamed_9(")?1N5x4yz{;a/hzb/y)d>hzb<-(l4j?-j-.bz?o8t"));
        }
        this.cfr_renamed_91 = arg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprzcm cfr_renamed_7916(int arg0, int arg1, byte[] arg2) throws sprtqg {
        sprzu sprzu2;
        byte[] byArray = this.cfr_renamed_7861(arg0);
        byte[] byArray2 = new byte[4];
        byArray2[0] = -61;
        byArray2[1] = 5;
        byArray2[2] = (byte)arg0;
        byArray2[3] = (byte)arg1;
        byte[] byArray3 = byArray2;
        byte[] byArray4 = new byte[arg2.length - 3];
        System.arraycopy(arg2, 1, byArray4, 0, byArray4.length);
        byte[] byArray5 = new byte[sprsgm.cfr_renamed_7910(arg1)];
        this.cfr_renamed_0.nextBytes(byArray5);
        sprzu sprzu3 = sprzu2 = sprlxg.cfr_renamed_7911(arg0, arg1);
        sprzu3.cfr_renamed_5535(true, new sprtxk(new sprtpk(byArray), 128, byArray5, byArray3));
        int n = sprsgm.cfr_renamed_7912(arg1);
        byte[] byArray6 = new byte[sprzu3.cfr_renamed_1202(byArray4.length)];
        int n2 = sprzu2.cfr_renamed_505(byArray4, 0, byArray4.length, byArray6, 0);
        try {
            n2 += sprzu2.cfr_renamed_1219(byArray6, n2);
        }
        catch (sprull sprull2) {
            throw new sprtqg(sprqld.cfr_renamed_9("\u0004u\tz\b`Gq\tw\u0015m\u0017`Gg\u0002g\u0014}\bzG}\tr\b"), sprull2);
        }
        byte[] byArray7 = sproze.cfr_renamed_533(byArray6, 0, byArray6.length - n);
        byte[] byArray8 = sproze.cfr_renamed_533(byArray6, byArray7.length, byArray6.length);
        return sprjem.cfr_renamed_7917(arg0, arg1, byArray5, this.cfr_renamed_3, byArray7, byArray8);
    }

    @Override
    public sprzcm cfr_renamed_7852(int arg0, byte[] arg1) throws sprtqg {
        if (arg1 == null) {
            return sprjem.cfr_renamed_7918(arg0, this.cfr_renamed_3, null);
        }
        byte[] byArray = this.cfr_renamed_7861(arg0);
        byte[] byArray2 = new byte[arg1.length - 2];
        System.arraycopy(arg1, 0, byArray2, 0, byArray2.length);
        int n = arg0;
        return sprjem.cfr_renamed_7918(n, this.cfr_renamed_3, this.cfr_renamed_7915(n, byArray, byArray2));
    }

    public int cfr_renamed_7851(int arg0) {
        if (this.cfr_renamed_4 < 0) {
            return arg0;
        }
        return this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_7861(int arg0) throws sprtqg {
        if (this.cfr_renamed_3 == null) {
            byte[] byArray = new byte[8];
            if (this.cfr_renamed_0 == null) {
                sprdah sprdah2 = this;
                sprdah2.cfr_renamed_0 = new SecureRandom();
            }
            this.cfr_renamed_0.nextBytes(byArray);
            this.cfr_renamed_3 = new sprpik(this.cfr_renamed_2.cfr_renamed_593(), byArray, this.cfr_renamed_91);
        }
        sprdah sprdah3 = this;
        return sprbyg.cfr_renamed_7889(this.cfr_renamed_2, arg0, sprdah3.cfr_renamed_3, sprdah3.cfr_renamed_1);
    }

    public sprdah(char[] arg0, sprsm arg1) {
        this(arg0, arg1, 96);
    }
}

