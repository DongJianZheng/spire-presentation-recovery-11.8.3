/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprapm;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sproh;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrkl;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryzk;
import com.spire.presentation.packages.sprzuk;
import java.math.BigInteger;

public class sprlbl
implements sproh {
    private boolean cfr_renamed_91;
    private final sprzuk cfr_renamed_0;
    private boolean cfr_renamed_1;
    private boolean cfr_renamed_2;
    private int cfr_renamed_3;
    private sprjs cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_5685(byte[] arg0) {
        sprlbl sprlbl2 = this;
        sprzuk sprzuk2 = sprlbl2.cfr_renamed_0;
        sprqxk sprqxk2 = sprzuk2.cfr_renamed_284();
        sprgxh sprgxh2 = sprqxk2.cfr_renamed_1769();
        BigInteger bigInteger = sprqxk2.cfr_renamed_1146();
        BigInteger bigInteger2 = sprqxk2.cfr_renamed_1153();
        spreuh spreuh2 = sprgxh2.cfr_renamed_2002(arg0);
        if (sprlbl2.cfr_renamed_91 || this.cfr_renamed_1) {
            spreuh2 = spreuh2.cfr_renamed_1830(bigInteger2);
        }
        BigInteger bigInteger3 = sprzuk2.cfr_renamed_2112();
        if (this.cfr_renamed_91) {
            bigInteger3 = bigInteger3.multiply(sprqxk2.cfr_renamed_9987()).mod(bigInteger);
        }
        byte[] byArray = spreuh2.cfr_renamed_1830(bigInteger3).cfr_renamed_1775().cfr_renamed_1969().cfr_renamed_91();
        sprlbl sprlbl3 = this;
        return spryzk.cfr_renamed_10124(sprlbl3.cfr_renamed_2, sprlbl3.cfr_renamed_4, this.cfr_renamed_3, arg0, byArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprlbl(sprzuk sprzuk2, int n, sprjs sprjs2) {
        void arg2;
        void arg1;
        void arg0;
        sprlbl sprlbl2 = this;
        sprlbl sprlbl3 = this;
        sprlbl sprlbl4 = this;
        sprlbl4.cfr_renamed_0 = arg0;
        sprlbl4.cfr_renamed_3 = arg1;
        sprlbl3.cfr_renamed_4 = arg2;
        sprlbl3.cfr_renamed_91 = false;
        sprlbl2.cfr_renamed_1 = false;
        sprlbl2.cfr_renamed_2 = false;
    }

    public sprlbl(sprzuk arg0, int arg1, sprjs arg2, boolean arg3, boolean arg4, boolean arg5) {
        sprlbl sprlbl2;
        sprlbl sprlbl3 = this;
        this.cfr_renamed_0 = arg0;
        sprlbl3.cfr_renamed_3 = arg1;
        sprlbl3.cfr_renamed_4 = arg2;
        this.cfr_renamed_91 = arg3;
        if (this.cfr_renamed_91) {
            sprlbl2 = this;
            this.cfr_renamed_1 = false;
        } else {
            sprlbl2 = this;
            this.cfr_renamed_1 = arg4;
        }
        sprlbl2.cfr_renamed_2 = arg5;
        sprybl.cfr_renamed_9170(new sprfdl(sprapm.cfr_renamed_9("p5|3f=P\u001b"), sprrkl.cfr_renamed_9917(this.cfr_renamed_0.cfr_renamed_284().cfr_renamed_1769()), arg0, spriil.cfr_renamed_152));
    }

    @Override
    public int cfr_renamed_5687() {
        return this.cfr_renamed_0.cfr_renamed_284().cfr_renamed_1769().cfr_renamed_1938() / 8 * 2 + 1;
    }
}

