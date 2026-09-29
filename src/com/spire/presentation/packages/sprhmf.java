/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbsf;
import com.spire.presentation.packages.sprgkf;
import com.spire.presentation.packages.sprgraa;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprlsy;
import com.spire.presentation.packages.sprmtf;
import com.spire.presentation.packages.sprnl;
import com.spire.presentation.packages.sprvjf;
import com.spire.presentation.packages.sprvof;
import com.spire.presentation.packages.sprwqf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class sprhmf
implements sprnl,
sprjn {
    private final long cfr_renamed_1;
    private final sprvjf cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final List<sprbsf> cfr_renamed_4;

    public List<sprbsf> cfr_renamed_5822() {
        return this.cfr_renamed_4;
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_954();
    }

    public long cfr_renamed_320() {
        return this.cfr_renamed_1;
    }

    public /* synthetic */ sprhmf(sprmtf arg0, sprgkf arg1) {
        this(arg0);
    }

    public byte[] cfr_renamed_1295() {
        return sprvof.cfr_renamed_5753(this.cfr_renamed_3);
    }

    @Override
    public byte[] cfr_renamed_954() {
        Iterator<sprbsf> iterator;
        sprhmf sprhmf2 = this;
        int n = sprhmf2.cfr_renamed_2.cfr_renamed_5732();
        int n2 = sprhmf2.cfr_renamed_2.cfr_renamed_5783().cfr_renamed_2110().cfr_renamed_5786();
        int n3 = (int)Math.ceil((double)sprhmf2.cfr_renamed_2.cfr_renamed_1452() / 8.0);
        int n4 = n;
        int n5 = (sprhmf2.cfr_renamed_2.cfr_renamed_1452() / this.cfr_renamed_2.cfr_renamed_1134() + n2) * n;
        int n6 = n5 * this.cfr_renamed_2.cfr_renamed_1134();
        byte[] byArray = new byte[n3 + n4 + n6];
        int n7 = 0;
        byte[] byArray2 = sprvof.cfr_renamed_5755(sprhmf2.cfr_renamed_1, n3);
        sprvof.cfr_renamed_5754(byArray, byArray2, n7);
        sprvof.cfr_renamed_5754(byArray, this.cfr_renamed_3, n7 += n3);
        n7 += n4;
        Iterator<sprbsf> iterator2 = iterator = sprhmf2.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            byte[] byArray3 = iterator.next().cfr_renamed_954();
            iterator2 = iterator;
            int n8 = n7;
            sprvof.cfr_renamed_5754(byArray, byArray3, n8);
            n7 = n8 + n5;
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhmf(sprmtf sprmtf2) {
        void arg0;
        sprhmf sprhmf2 = this;
        sprhmf2.cfr_renamed_2 = sprmtf.cfr_renamed_5825(sprmtf2);
        if (sprhmf2.cfr_renamed_2 == null) {
            throw new NullPointerException(sprlsy.cfr_renamed_9("Y\u0019[\u0019D\u000b\tE\u0014XG\rE\u0014"));
        }
        int n = this.cfr_renamed_2.cfr_renamed_5732();
        byte[] byArray = sprmtf.cfr_renamed_5826((sprmtf)arg0);
        if (byArray != null) {
            int n2;
            int n3;
            int n4;
            sprhmf sprhmf3 = this;
            int n5 = sprhmf3.cfr_renamed_2.cfr_renamed_5783().cfr_renamed_2110().cfr_renamed_5786();
            int n6 = (int)Math.ceil((double)sprhmf3.cfr_renamed_2.cfr_renamed_1452() / 8.0);
            int n7 = n6 + (n4 = n) + (n3 = (n2 = (sprhmf3.cfr_renamed_2.cfr_renamed_1452() / this.cfr_renamed_2.cfr_renamed_1134() + n5) * n) * this.cfr_renamed_2.cfr_renamed_1134());
            if (byArray.length != n7) {
                throw new IllegalArgumentException(sprgraa.cfr_renamed_9("r]fZ`@tFd\u0014iUr\u0014vFnZf\u0014r]{Q"));
            }
            int n8 = 0;
            this.cfr_renamed_1 = sprvof.cfr_renamed_5761(byArray, n8, n6);
            if (!sprvof.cfr_renamed_5764(this.cfr_renamed_2.cfr_renamed_1452(), this.cfr_renamed_1)) {
                throw new IllegalArgumentException(sprlsy.cfr_renamed_9("\u0011G\u001cL\u0000\t\u0017\\\f\t\u0017OXK\u0017\\\u0016M\u000b"));
            }
            int n9 = n8 += n6;
            this.cfr_renamed_3 = sprvof.cfr_renamed_5759(byArray, n9, n4);
            n8 = n9 + n4;
            sprhmf sprhmf4 = this;
            sprhmf4.cfr_renamed_4 = new ArrayList<sprbsf>();
            int n10 = n8;
            while (n10 < byArray.length) {
                sprbsf sprbsf2 = new sprwqf(this.cfr_renamed_2.cfr_renamed_5821()).cfr_renamed_5827(sprvof.cfr_renamed_5759(byArray, n8, n2)).cfr_renamed_1451();
                this.cfr_renamed_4.add(sprbsf2);
                n10 = n8 += n2;
            }
        } else {
            void v5;
            this.cfr_renamed_1 = sprmtf.cfr_renamed_5828((sprmtf)arg0);
            byte[] byArray2 = sprmtf.cfr_renamed_5829((sprmtf)arg0);
            if (byArray2 != null) {
                if (byArray2.length != n) {
                    throw new IllegalArgumentException(sprgraa.cfr_renamed_9("r]{Q![g\u0014sUoPnY!ZdQeG!@n\u0014cQ!QpA`X!@n\u0014r]{Q![g\u0014e]fQr@"));
                }
                this.cfr_renamed_3 = byArray2;
                v5 = arg0;
            } else {
                this.cfr_renamed_3 = new byte[n];
                v5 = arg0;
            }
            List list = sprmtf.cfr_renamed_5830((sprmtf)v5);
            sprhmf sprhmf5 = this;
            if (list != null) {
                sprhmf5.cfr_renamed_4 = list;
                return;
            }
            sprhmf5.cfr_renamed_4 = new ArrayList<sprbsf>();
        }
    }
}

