/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprerd;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprmre;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprnvz;
import com.spire.presentation.packages.sprqqr;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprun;
import com.spire.presentation.packages.sprxue;
import java.io.IOException;
import java.io.InputStream;

public class sprwud {
    public sprnte cfr_renamed_3;
    public sprmre cfr_renamed_4;

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_91();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_4186(sprun arg0) throws sprlqd {
        sprxue sprxue2 = (sprxue)this.cfr_renamed_4.cfr_renamed_2589().cfr_renamed_480();
        InputStream inputStream = arg0.cfr_renamed_578(this.cfr_renamed_4.cfr_renamed_4187()).cfr_renamed_1447(sprxue2.cfr_renamed_698());
        try {
            return sprerd.cfr_renamed_4002(inputStream);
        }
        catch (IOException iOException) {
            throw new sprlqd(sprnvz.cfr_renamed_9("$6\"+1:(!/n3+ *( &n\"!,>3+2=$*a=5<$/,`"), iOException);
        }
    }

    public sprwud(byte[] arg0) throws sprlqd {
        this(sprerd.cfr_renamed_4106(arg0));
    }

    public sprnte cfr_renamed_568() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprwud(sprnte sprnte2) throws sprlqd {
        this.cfr_renamed_3 = sprnte2;
        try {
            void arg0;
            this.cfr_renamed_4 = sprmre.cfr_renamed_23(arg0.cfr_renamed_480());
            return;
        }
        catch (ClassCastException classCastException) {
            throw new sprlqd(sprqqr.cfr_renamed_9("\u0019.8);=9*0o7 :;1! a"), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprlqd(sprnvz.cfr_renamed_9("\f/-(.<,+%n\"!/:$ 5`"), illegalArgumentException);
        }
    }

    public sprwud(InputStream arg0) throws sprlqd {
        this(sprerd.cfr_renamed_4104(arg0));
    }

    public sprtzd cfr_renamed_696() {
        return this.cfr_renamed_3.cfr_renamed_696();
    }
}

