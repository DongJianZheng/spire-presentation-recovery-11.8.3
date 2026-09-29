/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprchf;
import com.spire.presentation.packages.spredf;
import com.spire.presentation.packages.spreye;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprhgf;
import com.spire.presentation.packages.sprhm;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprmdf;
import com.spire.presentation.packages.sprnff;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprygf;

public class sprlaf
implements sprii {
    private spredf cfr_renamed_4;

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_4 = (spredf)arg0;
    }

    @Override
    public sprsil cfr_renamed_1223() {
        sprhgf sprhgf2;
        int n;
        sprhgf sprhgf3;
        sprhgf sprhgf4;
        sprhm sprhm2;
        sprlaf sprlaf2 = this;
        int n2 = sprlaf2.cfr_renamed_4.cfr_renamed_107;
        int n3 = sprlaf2.cfr_renamed_4.cfr_renamed_1;
        int n4 = sprlaf2.cfr_renamed_4.cfr_renamed_3;
        int n5 = sprlaf2.cfr_renamed_4.cfr_renamed_93;
        int n6 = sprlaf2.cfr_renamed_4.cfr_renamed_114;
        int n7 = sprlaf2.cfr_renamed_4.cfr_renamed_96;
        int n8 = sprlaf2.cfr_renamed_4.cfr_renamed_31;
        boolean bl = sprlaf2.cfr_renamed_4.cfr_renamed_2;
        boolean bl2 = sprlaf2.cfr_renamed_4.cfr_renamed_145;
        sprhgf sprhgf5 = null;
        boolean bl3 = bl;
        while (true) {
            sprhgf sprhgf6;
            if (bl3) {
                sprhm sprhm3;
                if (this.cfr_renamed_4.cfr_renamed_79 == 0) {
                    int n9 = n4;
                    sprhm3 = sprmdf.cfr_renamed_707(n2, n9, n9, bl2, this.cfr_renamed_4.cfr_renamed_1295());
                } else {
                    int n10 = n7;
                    sprhm3 = spreye.cfr_renamed_734(n2, n5, n6, n10, n10, this.cfr_renamed_4.cfr_renamed_1295());
                }
                sprhm2 = sprhm3;
                sprhgf6 = sprhgf4 = sprhm2.cfr_renamed_131();
                sprhgf4.cfr_renamed_751(3);
                sprhgf4.cfr_renamed_3[0] = sprhgf4.cfr_renamed_3[0] + 1;
            } else {
                sprhm sprhm4;
                int n11 = n2;
                if (this.cfr_renamed_4.cfr_renamed_79 == 0) {
                    int n12 = n4;
                    sprhm4 = sprmdf.cfr_renamed_707(n11, n12, n12 - 1, bl2, this.cfr_renamed_4.cfr_renamed_1295());
                } else {
                    int n13 = n7;
                    sprhm4 = spreye.cfr_renamed_734(n11, n5, n6, n13, n13 - 1, this.cfr_renamed_4.cfr_renamed_1295());
                }
                sprhm2 = sprhm4;
                sprhgf4 = sprhm2.cfr_renamed_131();
                sprhgf5 = sprhgf4.cfr_renamed_761();
                if (sprhgf5 == null) {
                    bl3 = bl;
                    continue;
                }
                sprhgf6 = sprhgf4;
            }
            sprhgf3 = sprhgf6.cfr_renamed_778(n3);
            if (sprhgf3 != null) break;
            bl3 = bl;
        }
        if (bl) {
            sprhgf5 = new sprhgf(n2);
            sprhgf5.cfr_renamed_3[0] = 1;
        }
        do {
            n = n8;
        } while ((sprhgf4 = sprchf.cfr_renamed_708(n2, n, n - 1, this.cfr_renamed_4.cfr_renamed_1295())).cfr_renamed_778(n3) == null);
        sprhgf sprhgf7 = sprhgf2 = ((sprchf)sprhgf4).cfr_renamed_3238(sprhgf3, n3);
        sprhgf7.cfr_renamed_770(n3);
        sprhgf7.cfr_renamed_766(n3);
        sprhgf4.cfr_renamed_722();
        sprhgf3.cfr_renamed_722();
        sprnff sprnff2 = new sprnff(sprhgf2, sprhm2, sprhgf5, this.cfr_renamed_4.cfr_renamed_1346());
        sprygf sprygf2 = new sprygf(sprhgf2, this.cfr_renamed_4.cfr_renamed_1346());
        return new sprsil(sprygf2, sprnff2);
    }
}

