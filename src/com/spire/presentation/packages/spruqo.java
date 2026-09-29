/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbtm;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprsdn;
import com.spire.presentation.packages.sprtea;

@sprtea
public class spruqo {
    @sprtea
    public byte[] cfr_renamed_2;
    @sprtea
    public byte cfr_renamed_3;
    @sprtea
    public byte cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_18252(sprruo sprruo2) {
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_11594(this.cfr_renamed_4);
        v0.cfr_renamed_11594(this.cfr_renamed_3);
    }

    @sprtea
    public static spruqo cfr_renamed_18583(sprmzo arg0, int arg1, int arg2) {
        if (arg2 < spruqo.cfr_renamed_18581(arg1)) {
            throw new IllegalStateException(sprbtm.cfr_renamed_9("\u0003\u0017;\u000b3E<\u00019\u001dt\u00011\u0013=\u00061E&\u00007\n&\u0001t\u0016=\u001f1K"));
        }
        spruqo spruqo2 = new spruqo();
        sprmzo sprmzo2 = arg0;
        spruqo2.cfr_renamed_4 = arg0.cfr_renamed_12137();
        spruqo2.cfr_renamed_3 = sprmzo2.cfr_renamed_12137();
        spruqo2.cfr_renamed_2 = sprmzo2.cfr_renamed_16065(arg1);
        arg0.cfr_renamed_14060().cfr_renamed_11548(arg0.cfr_renamed_14060().cfr_renamed_3274() + (long)(arg2 - spruqo.cfr_renamed_18581(arg1)));
        return spruqo2;
    }

    @sprtea
    public static int cfr_renamed_18581(int arg0) {
        return arg0 + 2;
    }

    @sprtea
    public int cfr_renamed_18584() {
        return spruqo.cfr_renamed_18581(this.cfr_renamed_2.length);
    }

    @sprtea
    public void cfr_renamed_18582(sprruo arg0, int arg1) {
        if (arg1 < spruqo.cfr_renamed_18581(this.cfr_renamed_2.length)) {
            throw new IllegalStateException(sprsdn.cfr_renamed_9(" ]\u0018A\u0010\u000f\u001fK\u001aWWK\u0012Y\u001eL\u0012\u000f\u0005J\u0014@\u0005KW\\\u001eU\u0012\u0001"));
        }
        this.cfr_renamed_18252(arg0);
        sprruo sprruo2 = arg0;
        sprruo2.cfr_renamed_9854(this.cfr_renamed_2);
        sprruo2.cfr_renamed_14060().cfr_renamed_11548(arg0.cfr_renamed_14060().cfr_renamed_3274() + (long)(arg1 - this.cfr_renamed_18584()));
    }
}

