/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbsf;
import com.spire.presentation.packages.sprgof;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprnl;
import com.spire.presentation.packages.sprokk;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprvof;
import com.spire.presentation.packages.sprvsf;
import java.io.IOException;

public final class sprgsf
extends sprbsf
implements sprnl,
sprjn {
    private final int cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public /* synthetic */ sprgsf(sprvsf arg0, sprgof arg1) {
        this(arg0);
    }

    public byte[] cfr_renamed_1295() {
        return sprvof.cfr_renamed_5753(this.cfr_renamed_4);
    }

    public int cfr_renamed_320() {
        return this.cfr_renamed_3;
    }

    @Override
    public byte[] cfr_renamed_954() {
        int n;
        sprgsf sprgsf2 = this;
        int n2 = sprgsf2.cfr_renamed_2110().cfr_renamed_5732();
        int n3 = 4;
        int n4 = n2;
        int n5 = sprgsf2.cfr_renamed_2110().cfr_renamed_5783().cfr_renamed_2110().cfr_renamed_5786() * n2;
        int n6 = sprgsf2.cfr_renamed_2110().cfr_renamed_1452() * n2;
        byte[] byArray = new byte[n3 + n4 + n5 + n6];
        int n7 = 0;
        sprpxe.cfr_renamed_442(sprgsf2.cfr_renamed_3, byArray, n7);
        int n8 = n7 += n3;
        sprvof.cfr_renamed_5754(byArray, this.cfr_renamed_4, n8);
        n7 = n8 + n4;
        byte[][] byArray2 = sprgsf2.cfr_renamed_5741().cfr_renamed_954();
        int n9 = n = 0;
        while (n9 < byArray2.length) {
            int n10 = n7;
            sprvof.cfr_renamed_5754(byArray, byArray2[n], n10);
            n7 = n10 + n2;
            n9 = ++n;
        }
        int n11 = n = 0;
        while (n11 < this.cfr_renamed_1415().size()) {
            byte[] byArray3 = this.cfr_renamed_1415().get(n).cfr_renamed_97();
            int n12 = n7;
            sprvof.cfr_renamed_5754(byArray, byArray3, n12);
            n7 = n12 + n2;
            n11 = ++n;
        }
        return byArray;
    }

    private /* synthetic */ sprgsf(sprvsf arg0) {
        sprvsf sprvsf2 = arg0;
        super(arg0);
        this.cfr_renamed_3 = sprvsf.cfr_renamed_5787(sprvsf2);
        int n = this.cfr_renamed_2110().cfr_renamed_5732();
        byte[] byArray = sprvsf.cfr_renamed_5788(sprvsf2);
        if (byArray != null) {
            if (byArray.length != n) {
                throw new IllegalArgumentException(sprokk.cfr_renamed_9("t\u0003}\u000f'\u0005aJu\u000bi\u000eh\u0007'\u0004b\u000fc\u0019'\u001ehJe\u000f'\u000fv\u001ff\u0006'\u001ehJt\u0003}\u000f'\u0005aJc\u0003`\u000ft\u001e"));
            }
            this.cfr_renamed_4 = byArray;
            return;
        }
        this.cfr_renamed_4 = new byte[n];
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_954();
    }
}

