/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreul;
import com.spire.presentation.packages.sprhql;
import com.spire.presentation.packages.sprjz;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlq;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprlz;
import com.spire.presentation.packages.sprmtl;
import com.spire.presentation.packages.sprniy;
import com.spire.presentation.packages.sprnzha;
import com.spire.presentation.packages.sprwpl;
import com.spire.presentation.packages.spryil;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public abstract class sprctl {
    public sprddm cfr_renamed_119;
    private sprlq cfr_renamed_91;
    private sprmtl cfr_renamed_0;
    public sprjz cfr_renamed_1;
    public sprddm cfr_renamed_2;
    private byte[] cfr_renamed_3;
    public spryil cfr_renamed_4;

    public sprddm cfr_renamed_4000() {
        return this.cfr_renamed_2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_1472() {
        if (this.cfr_renamed_3 == null && this.cfr_renamed_0.cfr_renamed_3992()) {
            sprctl sprctl2;
            if (this.cfr_renamed_91 != null) {
                try {
                    sprkqe.cfr_renamed_477(this.cfr_renamed_0.cfr_renamed_1447(new ByteArrayInputStream(this.cfr_renamed_91.cfr_renamed_4005().cfr_renamed_104("DER"))));
                    sprctl2 = this;
                }
                catch (IOException iOException) {
                    throw new IllegalStateException(new StringBuilder().insert(0, sprnzha.cfr_renamed_9("\u0001k\u0015g\u0018`Tq\u001b%\u0010w\u0015l\u001a%\u001dk\u0004p\u0000?T")).append(iOException.getMessage()).toString());
                }
            } else {
                sprctl2 = this;
            }
            sprctl2.cfr_renamed_3 = this.cfr_renamed_0.cfr_renamed_1472();
        }
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprctl(sprddm sprddm2, sprddm sprddm3, sprjz sprjz2, sprlq sprlq2) {
        void arg2;
        void arg1;
        void arg0;
        sprctl sprctl2 = this;
        sprctl sprctl3 = this;
        sprctl3.cfr_renamed_2 = arg0;
        sprctl3.cfr_renamed_119 = arg1;
        sprctl2.cfr_renamed_1 = arg2;
        sprctl2.cfr_renamed_91 = sprlq2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_3997() {
        try {
            sprctl sprctl2 = this;
            return sprctl2.cfr_renamed_10646(sprctl2.cfr_renamed_2.cfr_renamed_284());
        }
        catch (Exception exception) {
            throw new RuntimeException(new StringBuilder().insert(0, sprniy.cfr_renamed_9("(\u0002.\u001f=\u000e$\u0015#Z*\u001f9\u000e$\u0014*Z(\u0014.\b4\n9\u0013\"\u0014m\n,\b,\u0017(\u000e(\b>Z")).append(exception).toString());
        }
    }

    public sprlem cfr_renamed_696() {
        return this.cfr_renamed_1.cfr_renamed_696();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 1 << 3;
        int n4 = n2;
        int n5 = 5 << 4 ^ (2 ^ 5);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public String cfr_renamed_3998() {
        return this.cfr_renamed_2.cfr_renamed_593().cfr_renamed_19();
    }

    public spryil cfr_renamed_3995() {
        return this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_3964() {
        if (this.cfr_renamed_1 instanceof sprwpl) {
            return ((sprwpl)this.cfr_renamed_1).cfr_renamed_580();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_10664(sprlz arg0) throws sprlyl {
        try {
            return spreul.cfr_renamed_4002(this.cfr_renamed_10665(arg0).cfr_renamed_4004());
        }
        catch (IOException iOException) {
            throw new sprlyl(new StringBuilder().insert(0, sprnzha.cfr_renamed_9("\u0001k\u0015g\u0018`Tq\u001b%\u0004d\u0006v\u0011%\u001dk\u0000`\u0006k\u0015iTv\u0000w\u0011d\u0019?T")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprhql cfr_renamed_10665(sprlz arg0) throws sprlyl, IOException {
        sprctl sprctl2 = this;
        sprctl2.cfr_renamed_0 = sprctl2.cfr_renamed_10666(arg0);
        if (sprctl2.cfr_renamed_91 != null) {
            if (this.cfr_renamed_91.cfr_renamed_10667()) {
                this.cfr_renamed_0.cfr_renamed_7491().write(this.cfr_renamed_91.cfr_renamed_4005().cfr_renamed_104("DER"));
                sprctl sprctl3 = this;
                return new sprhql(this.cfr_renamed_1.cfr_renamed_696(), sprctl3.cfr_renamed_0.cfr_renamed_1447(sprctl3.cfr_renamed_1.cfr_renamed_2920()));
            }
            return new sprhql(this.cfr_renamed_1.cfr_renamed_696(), this.cfr_renamed_1.cfr_renamed_2920());
        }
        sprctl sprctl4 = this;
        return new sprhql(this.cfr_renamed_1.cfr_renamed_696(), sprctl4.cfr_renamed_0.cfr_renamed_1447(sprctl4.cfr_renamed_1.cfr_renamed_2920()));
    }

    public abstract sprmtl cfr_renamed_10666(sprlz var1) throws sprlyl, IOException;

    private /* synthetic */ byte[] cfr_renamed_10646(sprco arg0) throws IOException {
        if (arg0 != null) {
            return arg0.cfr_renamed_119().cfr_renamed_91();
        }
        return null;
    }
}

