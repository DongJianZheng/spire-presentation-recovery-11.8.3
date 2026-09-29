/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbsa;
import com.spire.presentation.packages.sprch;
import com.spire.presentation.packages.sprcty;
import com.spire.presentation.packages.sprerd;
import com.spire.presentation.packages.sprgi;
import com.spire.presentation.packages.sprhvd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprixd;
import com.spire.presentation.packages.sprjxd;
import com.spire.presentation.packages.sprlh;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlya;
import com.spire.presentation.packages.sprrqd;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public abstract class sprurd {
    private sprixd cfr_renamed_119;
    private byte[] cfr_renamed_91;
    public sprjxd cfr_renamed_0;
    public sprije cfr_renamed_1;
    private sprgi cfr_renamed_2;
    public sprije cfr_renamed_3;
    public sprch cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_3997() {
        try {
            sprurd sprurd2 = this;
            return sprurd2.cfr_renamed_3956(sprurd2.cfr_renamed_3.cfr_renamed_284());
        }
        catch (Exception exception) {
            throw new RuntimeException(new StringBuilder().insert(0, sprcty.cfr_renamed_9("!#'>4/-4*{#>0/-5#{!5')=+02+5d+%)%6!/!)7{")).append(exception).toString());
        }
    }

    public String cfr_renamed_3998() {
        return this.cfr_renamed_3.cfr_renamed_593().cfr_renamed_19();
    }

    public abstract sprixd cfr_renamed_3999(sprlh var1) throws sprlqd, IOException;

    public byte[] cfr_renamed_3964() {
        if (this.cfr_renamed_4 instanceof sprrqd) {
            return ((sprrqd)this.cfr_renamed_4).cfr_renamed_580();
        }
        return null;
    }

    public sprije cfr_renamed_4000() {
        return this.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_4001(sprlh arg0) throws sprlqd {
        try {
            return sprerd.cfr_renamed_4002(this.cfr_renamed_4003(arg0).cfr_renamed_4004());
        }
        catch (IOException iOException) {
            throw new sprlqd(new StringBuilder().insert(0, sprlya.cfr_renamed_9("AhUdXc\u0014r[&DgFuQ&]h@cFhUj\u0014u@tQgY<\u0014")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_1472() {
        if (this.cfr_renamed_91 == null && this.cfr_renamed_119.cfr_renamed_3992()) {
            sprurd sprurd2;
            if (this.cfr_renamed_2 != null) {
                try {
                    sprbsa.cfr_renamed_477(this.cfr_renamed_119.cfr_renamed_1447(new ByteArrayInputStream(this.cfr_renamed_2.cfr_renamed_4005().cfr_renamed_104("DER"))));
                    sprurd2 = this;
                }
                catch (IOException iOException) {
                    throw new IllegalStateException(new StringBuilder().insert(0, sprcty.cfr_renamed_9(".*:&7!{04d?6:-5d2*+1/~{")).append(iOException.getMessage()).toString());
                }
            } else {
                sprurd2 = this;
            }
            sprurd2.cfr_renamed_91 = this.cfr_renamed_119.cfr_renamed_1472();
        }
        return this.cfr_renamed_91;
    }

    public sprhvd cfr_renamed_4003(sprlh arg0) throws sprlqd, IOException {
        sprurd sprurd2 = this;
        sprurd2.cfr_renamed_119 = sprurd2.cfr_renamed_3999(arg0);
        if (sprurd2.cfr_renamed_2 != null) {
            return new sprhvd(this.cfr_renamed_4.cfr_renamed_2920());
        }
        sprurd sprurd3 = this;
        return new sprhvd(sprurd3.cfr_renamed_119.cfr_renamed_1447(sprurd3.cfr_renamed_4.cfr_renamed_2920()));
    }

    public sprjxd cfr_renamed_3995() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprurd(sprije sprije2, sprije sprije3, sprch sprch2, sprgi sprgi2) {
        void arg2;
        void arg1;
        void arg0;
        sprurd sprurd2 = this;
        sprurd sprurd3 = this;
        sprurd3.cfr_renamed_3 = arg0;
        sprurd3.cfr_renamed_1 = arg1;
        sprurd2.cfr_renamed_4 = arg2;
        sprurd2.cfr_renamed_2 = sprgi2;
    }

    private /* synthetic */ byte[] cfr_renamed_3956(spra arg0) throws IOException {
        if (arg0 != null) {
            return arg0.cfr_renamed_119().cfr_renamed_91();
        }
        return null;
    }
}

