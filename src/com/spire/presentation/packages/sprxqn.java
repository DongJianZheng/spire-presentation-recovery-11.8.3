/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprfmp;
import com.spire.presentation.packages.sprgdp;
import com.spire.presentation.packages.sprghp;
import com.spire.presentation.packages.sprkmn;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprxln;

@sprtea
public class sprxqn {
    public sprwvn cfr_renamed_4;

    public sprxqn() {
        sprxqn sprxqn2 = this;
        sprxqn2.cfr_renamed_4 = new sprwvn();
    }

    public void cfr_renamed_12525(sprkmn arg0, float arg1, int arg2) {
        int n;
        sprmrn sprmrn2 = new sprmrn();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.size() / 2) {
            sprxln sprxln2 = spresca.cfr_renamed_11777(this.cfr_renamed_4.get(n * 2), sprxln.class);
            sprxln2.cfr_renamed_12550(spresca.cfr_renamed_11777(this.cfr_renamed_4.get(n * 2 + 1), sprpln.class));
            sprgdp sprgdp2 = spresca.cfr_renamed_11777(sprxln2.cfr_renamed_12551(), sprgdp.class);
            if (arg1 < 1.0f) {
                Object object;
                int n3 = (int)(arg1 * 255.0f);
                if (sprgdp2 != null) {
                    int n4;
                    object = sprgdp2.cfr_renamed_12779();
                    int n5 = ((sprfmp[])object).length;
                    int n6 = n4 = 0;
                    while (n6 < n5) {
                        Object object2 = object[n4];
                        sprwbp sprwbp2 = ((sprfmp)object2).cfr_renamed_12553();
                        ((sprfmp)object2).cfr_renamed_12554(sprwbp.cfr_renamed_12555(n3, sprwbp2.cfr_renamed_3353(), sprwbp2.cfr_renamed_1145(), sprwbp2.cfr_renamed_1997()));
                        n6 = ++n4;
                    }
                } else {
                    object = spresca.cfr_renamed_11777(sprxln2.cfr_renamed_12551(), sprghp.class);
                    if (object != null) {
                        Object object3 = object;
                        sprwbp sprwbp3 = ((sprghp)object3).cfr_renamed_12553();
                        ((sprghp)object3).cfr_renamed_12554(sprwbp.cfr_renamed_12555(n3, sprwbp3.cfr_renamed_3353(), sprwbp3.cfr_renamed_1145(), sprwbp3.cfr_renamed_1997()));
                    }
                }
            }
            sprmrn2.cfr_renamed_12507(sprxln2);
            n2 = ++n;
        }
        arg0.cfr_renamed_12507(sprmrn2);
    }

    public void cfr_renamed_722() {
        this.cfr_renamed_4.clear();
    }
}

