/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.sprabz;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdrd;
import com.spire.presentation.packages.sprfse;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkme;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprwfq;
import com.spire.presentation.packages.spryvd;
import com.spire.presentation.packages.sprza;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;

public class sprlrd {
    private sprza cfr_renamed_3;
    private sprfse cfr_renamed_4;

    public BigInteger cfr_renamed_4419() {
        return this.cfr_renamed_4.cfr_renamed_4420().cfr_renamed_97();
    }

    /*
     * WARNING - void declaration
     */
    public sprlrd(sprza sprza2, sprfse sprfse2) {
        void arg0;
        sprlrd sprlrd2 = this;
        sprlrd2.cfr_renamed_3 = arg0;
        sprlrd2.cfr_renamed_4 = sprfse2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_4421(sprcyd arg0, spraa arg1) throws spryvd {
        sprpa sprpa2;
        sprije sprije2 = this.cfr_renamed_3.cfr_renamed_1572(arg0.cfr_renamed_568().cfr_renamed_89());
        if (sprije2 == null) {
            throw new spryvd(sprwfq.cfr_renamed_9("L6A9@#\u000f1F9KwN;H8]>[?BwI8]wK>H2\\#\u000f1]8Bw\\>H9N#Z%J"));
        }
        try {
            sprpa2 = arg1.cfr_renamed_578(sprije2);
        }
        catch (sprfya sprfya2) {
            throw new spryvd(new StringBuilder().insert(0, sprabz.cfr_renamed_9("@sT\u007fYx\u0015iZ=VoP|Ax\u0015y\\zPnAxG'\u0015")).append(sprfya2.getMessage()).toString(), sprfya2);
        }
        sprdrd.cfr_renamed_4329(arg0.cfr_renamed_568(), sprpa2.cfr_renamed_470());
        return sprzra.cfr_renamed_92(this.cfr_renamed_4.cfr_renamed_629().cfr_renamed_186(), sprpa2.cfr_renamed_580());
    }

    public sprkme cfr_renamed_4422() {
        return this.cfr_renamed_4.cfr_renamed_4422();
    }
}

