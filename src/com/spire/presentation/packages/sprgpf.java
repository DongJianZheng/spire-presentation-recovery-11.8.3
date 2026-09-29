/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.SaveToHtmlOption;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprlfk;
import com.spire.presentation.packages.sprlpf;
import com.spire.presentation.packages.sprmpf;
import com.spire.presentation.packages.sprnl;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprsqf;
import com.spire.presentation.packages.sprtof;
import com.spire.presentation.packages.sprvof;
import java.io.IOException;

public final class sprgpf
extends sprtof
implements sprnl,
sprjn {
    private final byte[] cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private final sprlpf cfr_renamed_3;
    private final int cfr_renamed_4;

    public /* synthetic */ sprgpf(sprsqf arg0, sprmpf arg1) {
        this(arg0);
    }

    @Override
    public byte[] cfr_renamed_954() {
        byte[] byArray;
        byte[] byArray2;
        sprgpf sprgpf2 = this;
        int n = sprgpf2.cfr_renamed_3.cfr_renamed_5732();
        int n2 = 4;
        int n3 = n;
        int n4 = n;
        int n5 = 0;
        if (sprgpf2.cfr_renamed_4 != 0) {
            byArray = byArray2 = new byte[n2 + n3 + n4];
            sprpxe.cfr_renamed_442(this.cfr_renamed_4, byArray2, n5);
            n5 += n2;
        } else {
            byArray = byArray2 = new byte[n3 + n4];
        }
        sprvof.cfr_renamed_5754(byArray, this.cfr_renamed_1, n5);
        sprvof.cfr_renamed_5754(byArray2, this.cfr_renamed_2, n5 += n3);
        return byArray2;
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_954();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprgpf(sprsqf sprsqf2) {
        void v5;
        void v4;
        void arg0;
        sprgpf sprgpf2 = this;
        super(false, sprsqf.cfr_renamed_5793((sprsqf)arg0).cfr_renamed_3234());
        sprgpf2.cfr_renamed_3 = sprsqf.cfr_renamed_5793(sprsqf2);
        if (sprgpf2.cfr_renamed_3 == null) {
            throw new NullPointerException(SaveToHtmlOption.cfr_renamed_9("\u001f\u000e\u001d\u000e\u0002\u001cORRO\u0001\u001a\u0003\u0003"));
        }
        int n = this.cfr_renamed_3.cfr_renamed_5732();
        byte[] byArray = sprsqf.cfr_renamed_5794((sprsqf)arg0);
        if (byArray != null) {
            int n2 = 4;
            int n3 = n;
            int n4 = n;
            int n5 = 0;
            if (byArray.length == n3 + n4) {
                sprgpf sprgpf3 = this;
                this.cfr_renamed_4 = 0;
                sprgpf3.cfr_renamed_1 = sprvof.cfr_renamed_5759(byArray, n5, n3);
                sprgpf3.cfr_renamed_2 = sprvof.cfr_renamed_5759(byArray, n5 += n3, n4);
                return;
            }
            if (byArray.length == n2 + n3 + n4) {
                sprgpf sprgpf4 = this;
                this.cfr_renamed_4 = sprpxe.cfr_renamed_446(byArray, 0);
                sprgpf4.cfr_renamed_1 = sprvof.cfr_renamed_5759(byArray, n5 += n2, n3);
                sprgpf4.cfr_renamed_2 = sprvof.cfr_renamed_5759(byArray, n5 += n3, n4);
                return;
            }
            throw new IllegalArgumentException(sprlfk.cfr_renamed_9(",V>O5@|H9Z|K=P|T.L2D|P5Y9"));
        }
        sprgpf sprgpf5 = this;
        if (this.cfr_renamed_3.cfr_renamed_4721() != null) {
            sprgpf5.cfr_renamed_4 = this.cfr_renamed_3.cfr_renamed_4721().cfr_renamed_4721();
            v4 = arg0;
        } else {
            sprgpf5.cfr_renamed_4 = 0;
            v4 = arg0;
        }
        byte[] byArray2 = sprsqf.cfr_renamed_5795((sprsqf)v4);
        if (byArray2 != null) {
            if (byArray2.length != n) {
                throw new IllegalArgumentException(SaveToHtmlOption.cfr_renamed_9("\u0003\n\u0001\b\u001b\u0007O\u0000\tO\u001d\u0000\u0000\u001bO\u0002\u001a\u001c\u001bO\r\nO\n\u001e\u001a\u000e\u0003O\u001b\u0000O\u0003\n\u0001\b\u001b\u0007O\u0000\tO\u000b\u0006\b\n\u001c\u001b"));
            }
            this.cfr_renamed_1 = byArray2;
            v5 = arg0;
        } else {
            this.cfr_renamed_1 = new byte[n];
            v5 = arg0;
        }
        byte[] byArray3 = sprsqf.cfr_renamed_5796((sprsqf)v5);
        if (byArray3 != null) {
            if (byArray3.length != n) {
                throw new IllegalArgumentException(sprlfk.cfr_renamed_9("O9M;W4\u00033E|S)A0J?p9F8\u00031V/W|A9\u00039R)B0\u0003(L|O9M;W4\u00033E|G5D9P("));
            }
            this.cfr_renamed_2 = byArray3;
            return;
        }
        this.cfr_renamed_2 = new byte[n];
    }

    public byte[] cfr_renamed_5769() {
        return sprvof.cfr_renamed_5753(this.cfr_renamed_2);
    }

    public sprlpf cfr_renamed_284() {
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_1411() {
        return sprvof.cfr_renamed_5753(this.cfr_renamed_1);
    }
}

