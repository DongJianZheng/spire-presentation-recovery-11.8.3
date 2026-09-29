/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcoa;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprnez;
import com.spire.presentation.packages.sproae;
import com.spire.presentation.packages.sprrua;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spryce;
import java.io.IOException;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.Date;

public class sprhsa {
    public Date cfr_renamed_3;
    public sproae cfr_renamed_4;

    public boolean cfr_renamed_585() {
        return this.cfr_renamed_4.cfr_renamed_586().cfr_renamed_587();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprhsa(sproae sproae2) throws sprrua, IOException {
        this.cfr_renamed_4 = sproae2;
        try {
            void arg0;
            this.cfr_renamed_3 = arg0.cfr_renamed_588().cfr_renamed_110();
            return;
        }
        catch (ParseException parseException) {
            throw new sprrua(sprnez.cfr_renamed_9("\u0016%\u0002)\u000f.C?\fk\u0013*\u00118\u0006k\u0004.\r\u001f\n&\u0006k\u0005\"\u0006'\u0007"));
        }
    }

    public sproae cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_91();
    }

    public spryce cfr_renamed_589() {
        return this.cfr_renamed_4.cfr_renamed_589();
    }

    public sprmee cfr_renamed_590() {
        return this.cfr_renamed_4.cfr_renamed_590();
    }

    public sprtzd cfr_renamed_591() {
        return this.cfr_renamed_4.cfr_renamed_592().cfr_renamed_579().cfr_renamed_593();
    }

    public Date cfr_renamed_588() {
        return this.cfr_renamed_3;
    }

    public sproae cfr_renamed_594() {
        return this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_581() {
        return this.cfr_renamed_4.cfr_renamed_592().cfr_renamed_595();
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_4.cfr_renamed_114().cfr_renamed_97();
    }

    public BigInteger cfr_renamed_596() {
        if (this.cfr_renamed_4.cfr_renamed_596() != null) {
            return this.cfr_renamed_4.cfr_renamed_596().cfr_renamed_97();
        }
        return null;
    }

    public sprcoa cfr_renamed_597() {
        if (this.cfr_renamed_589() != null) {
            return new sprcoa(this.cfr_renamed_589());
        }
        return null;
    }

    public sprije cfr_renamed_579() {
        return this.cfr_renamed_4.cfr_renamed_592().cfr_renamed_579();
    }

    public sprtzd cfr_renamed_598() {
        return this.cfr_renamed_4.cfr_renamed_598();
    }
}

