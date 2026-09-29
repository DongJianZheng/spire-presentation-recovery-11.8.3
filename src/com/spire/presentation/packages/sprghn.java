/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbpn;
import com.spire.presentation.packages.sprcff;
import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprdvo;
import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.spriso;
import com.spire.presentation.packages.sprlfo;
import com.spire.presentation.packages.sproin;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvqo;

@sprtea
public class sprghn
extends sprbpn {
    private sprvqo cfr_renamed_4;

    public sprghn(sprvqo sprvqo2) {
        super(false);
        this.cfr_renamed_4 = sprvqo2;
    }

    @Override
    public void cfr_renamed_14130(sproin arg0) {
        sprghn sprghn2 = this;
        spriso[] sprisoArray = sprdvo.cfr_renamed_14131(sprghn2.cfr_renamed_4.cfr_renamed_13484());
        boolean bl = sprghn2.cfr_renamed_4.cfr_renamed_13261().cfr_renamed_14132() && this.cfr_renamed_4.cfr_renamed_13261().cfr_renamed_14133();
        int n = 100;
        int n2 = 0;
        int n3 = sprisoArray.length;
        int n4 = n2;
        while (n4 < n3) {
            int n5;
            int n6 = n > n3 - n2 ? n3 - n2 : n;
            arg0.cfr_renamed_14059(sprcff.cfr_renamed_9("IGOWIFO"), sprebp.cfr_renamed_14063(n6), bl ? sprlfo.cfr_renamed_9("p0u<|6{1q=s'") : sprcff.cfr_renamed_9("P\u0012U\u001e\\\u0015T\u0014Z\u0016@"));
            int n7 = n5 = 0;
            while (n7 < n6) {
                spriso spriso2 = sprisoArray[n2 + n5];
                if (bl) {
                    sprghn sprghn3 = this;
                    int n8 = sprghn3.cfr_renamed_14134(spriso2.cfr_renamed_320(), sprghn3.cfr_renamed_4.cfr_renamed_13261().cfr_renamed_14135());
                    arg0.cfr_renamed_14059(sprlfo.cfr_renamed_9("..\"(,.#("), this.cfr_renamed_14136(spriso2.cfr_renamed_12561()), Integer.toString(n8));
                } else {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = sprdvo.cfr_renamed_14137(spriso2.cfr_renamed_12561());
                    arg0.cfr_renamed_14059(sprcff.cfr_renamed_9("KIGOIIFO"), this.cfr_renamed_14136(spriso2.cfr_renamed_12561()), sprraia.cfr_renamed_11562(sprlfo.cfr_renamed_9("=.\"("), objectArray));
                }
                n7 = ++n5;
            }
            arg0.cfr_renamed_14085("{0}", bl ? sprcff.cfr_renamed_9("\u0012\\\u0013Q\u001eV\u0014Z\u0016@") : sprlfo.cfr_renamed_9("0|1p3q=s'"));
            n4 = n2 + n6;
        }
    }

    private /* synthetic */ int cfr_renamed_14134(int arg0, sprdsp arg1) {
        if (!arg1.cfr_renamed_14000(arg0)) {
            return 0;
        }
        return (Integer)arg1.cfr_renamed_576(arg0);
    }

    private /* synthetic */ String cfr_renamed_14136(int arg0) {
        return sprghn.cfr_renamed_14138(arg0);
    }
}

