/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprade;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprhrc;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprlza;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprqa;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprwjb;
import com.spire.presentation.packages.spryge;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class sprgfb {
    private spruhe cfr_renamed_1;
    private List cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprdce cfr_renamed_4;

    public sprgfb cfr_renamed_1481(sprtzd arg0, spra arg1) {
        sprgfb sprgfb2 = this;
        sprgfb2.cfr_renamed_2.add(new sprade(arg0, new sprcwe(arg1)));
        return sprgfb2;
    }

    public sprgfb cfr_renamed_1482(sprtzd arg0, spra[] arg1) {
        sprgfb sprgfb2 = this;
        sprgfb2.cfr_renamed_2.add(new sprade(arg0, new sprcwe(arg1)));
        return sprgfb2;
    }

    public sprgfb cfr_renamed_1483(boolean arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprgfb(spruhe spruhe2, sprdce sprdce2) {
        void arg0;
        sprgfb sprgfb2 = this;
        sprgfb sprgfb3 = this;
        this.cfr_renamed_2 = new ArrayList();
        this.cfr_renamed_3 = false;
        sprgfb2.cfr_renamed_1 = arg0;
        sprgfb2.cfr_renamed_4 = sprdce2;
    }

    /*
     * Unable to fully structure code
     */
    public sprlza cfr_renamed_1484(sprqa arg0) {
        block5: {
            if (!this.cfr_renamed_2.isEmpty()) break block5;
            if (this.cfr_renamed_3) {
                v0 = this;
                var2_2 = new spryge(v0.cfr_renamed_1, v0.cfr_renamed_4, null);
                v1 = arg0;
            } else {
                v2 = this;
                var2_2 = new spryge(v2.cfr_renamed_1, v2.cfr_renamed_4, (sprere)new sprcwe());
                v1 = arg0;
            }
            ** GOTO lbl23
        }
        var3_3 = new sprlre();
        v3 = var4_5 = this.cfr_renamed_2.iterator();
        while (v3.hasNext()) {
            v4 = var4_5;
            v3 = v4;
            var3_3.cfr_renamed_49(sprade.cfr_renamed_23(v4.next()));
        }
        v5 = this;
        var2_2 = new spryge(v5.cfr_renamed_1, v5.cfr_renamed_4, (sprere)new sprcwe((sprlre)var3_3));
        try {
            v1 = arg0;
lbl23:
            // 3 sources

            var3_3 = v1.cfr_renamed_470();
            var3_3.write(var2_2.cfr_renamed_104("DER"));
            var3_3.close();
            return new sprlza(new sprwjb(var2_2, arg0.cfr_renamed_615(), new sprmra(arg0.cfr_renamed_79())));
        }
        catch (IOException var3_4) {
            throw new IllegalStateException(sprhrc.cfr_renamed_9("o4b;c!,%~:h o0,6i'x<j<o4x<c;,'i$y0\u007f!,&e2b4x ~0"));
        }
    }
}

