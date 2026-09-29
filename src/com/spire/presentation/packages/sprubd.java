/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sproqda;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprta;
import com.spire.presentation.packages.spruj;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprytp;
import java.io.IOException;
import java.math.BigInteger;

public class sprubd
implements sprta {
    private final sprlc cfr_renamed_2;
    private final spruj cfr_renamed_3;
    private boolean cfr_renamed_4;

    private /* synthetic */ byte[] cfr_renamed_2516(BigInteger arg0, BigInteger arg1) throws IOException {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(new sprooe(arg0));
        sprlre3.cfr_renamed_49(new sprooe(arg1));
        return new sprpse(sprlre2).cfr_renamed_104("DER");
    }

    /*
     * WARNING - void declaration
     */
    public sprubd(spruj spruj2, sprlc sprlc2) {
        void arg1;
        sprubd sprubd2 = this;
        sprubd2.cfr_renamed_2 = arg1;
        sprubd2.cfr_renamed_3 = spruj2;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_2.cfr_renamed_1221(arg0);
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_2.cfr_renamed_41();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) {
        void v0;
        sprhgb sprhgb2;
        void arg1;
        void arg0;
        this.cfr_renamed_4 = arg0;
        if (sprt2 instanceof spraed) {
            sprhgb2 = (sprhgb)((spraed)arg1).cfr_renamed_284();
            v0 = arg0;
        } else {
            sprhgb2 = (sprhgb)arg1;
            v0 = arg0;
        }
        if (v0 != false && !sprhgb2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sproqda.cfr_renamed_9("Psdtjtd:Q\u007frojhfi#Jqsu{w\u007f#Qfc-"));
        }
        if (arg0 == false && sprhgb2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprytp.cfr_renamed_9("+U\u000fY\u001bY\u001eQ\tY\u0012^]b\u0018A\bY\u000fU\u000e\u0010-E\u001f\\\u0014S]{\u0018IS"));
        }
        sprubd sprubd2 = this;
        sprubd2.cfr_renamed_41();
        sprubd2.cfr_renamed_3.cfr_renamed_1217((boolean)arg0, (sprt)arg1);
    }

    private /* synthetic */ BigInteger[] cfr_renamed_2515(byte[] arg0) throws IOException {
        sprbne sprbne2 = (sprbne)sprvva.cfr_renamed_184(arg0);
        BigInteger[] bigIntegerArray = new BigInteger[2];
        bigIntegerArray[0] = ((sprooe)sprbne2.cfr_renamed_85(0)).cfr_renamed_97();
        bigIntegerArray[1] = ((sprooe)sprbne2.cfr_renamed_85(1)).cfr_renamed_97();
        return bigIntegerArray;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_2.cfr_renamed_1197(arg0, arg1, arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sproqda.cfr_renamed_9("^P[Gsd\u007fpnPsdtfh#tln#smswsbvjif~#|lh#lfhj|jybnjum"));
        }
        sprubd sprubd2 = this;
        byte[] byArray = new byte[sprubd2.cfr_renamed_2.cfr_renamed_1218()];
        sprubd2.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        try {
            sprubd sprubd3 = this;
            BigInteger[] bigIntegerArray = sprubd3.cfr_renamed_2515(arg0);
            return sprubd3.cfr_renamed_3.cfr_renamed_2474(byArray, bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (IOException iOException) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_1329() {
        if (!this.cfr_renamed_4) {
            throw new IllegalStateException(sprytp.cfr_renamed_9("9c<t\u0014W\u0018C\tc\u0014W\u0013U\u000f\u0010\u0013_\t\u0010\u0014^\u0014D\u0014Q\u0011Y\u000eU\u0019\u0010\u001b_\u000f\u0010\u000eY\u001a^\u001cD\bB\u0018\u0010\u001aU\u0013U\u000fQ\tY\u0012^S"));
        }
        sprubd sprubd2 = this;
        byte[] byArray = new byte[sprubd2.cfr_renamed_2.cfr_renamed_1218()];
        sprubd2.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        BigInteger[] bigIntegerArray = this.cfr_renamed_3.cfr_renamed_125(byArray);
        try {
            return this.cfr_renamed_2516(bigIntegerArray[0], bigIntegerArray[1]);
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sproqda.cfr_renamed_9("om{avf:wu#\u007fmyl~f:psdtbnvhf"));
        }
    }
}

