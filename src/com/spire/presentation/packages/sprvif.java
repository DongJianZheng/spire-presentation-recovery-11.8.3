/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdty;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprlsf;
import com.spire.presentation.packages.sprnl;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqqf;
import com.spire.presentation.packages.sprrnm;
import com.spire.presentation.packages.sprusf;
import com.spire.presentation.packages.sprvjf;
import com.spire.presentation.packages.sprvof;
import java.io.IOException;

public final class sprvif
extends sprlsf
implements sprnl,
sprjn {
    private final sprvjf cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final int cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_954() {
        byte[] byArray;
        byte[] byArray2;
        sprvif sprvif2 = this;
        int n = sprvif2.cfr_renamed_1.cfr_renamed_5732();
        int n2 = 4;
        int n3 = n;
        int n4 = n;
        int n5 = 0;
        if (sprvif2.cfr_renamed_4 != 0) {
            byArray = byArray2 = new byte[n2 + n3 + n4];
            sprpxe.cfr_renamed_442(this.cfr_renamed_4, byArray2, n5);
            n5 += n2;
        } else {
            byArray = byArray2 = new byte[n3 + n4];
        }
        sprvof.cfr_renamed_5754(byArray, this.cfr_renamed_3, n5);
        sprvof.cfr_renamed_5754(byArray2, this.cfr_renamed_2, n5 += n3);
        return byArray2;
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_954();
    }

    public byte[] cfr_renamed_5769() {
        return sprvof.cfr_renamed_5753(this.cfr_renamed_2);
    }

    public byte[] cfr_renamed_1411() {
        return sprvof.cfr_renamed_5753(this.cfr_renamed_3);
    }

    public sprvjf cfr_renamed_284() {
        return this.cfr_renamed_1;
    }

    public /* synthetic */ sprvif(sprusf arg0, sprqqf arg1) {
        this(arg0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprvif(sprusf sprusf2) {
        void v5;
        void v4;
        void arg0;
        sprvif sprvif2 = this;
        super(false, sprusf.cfr_renamed_5831((sprusf)arg0).cfr_renamed_3234());
        sprvif2.cfr_renamed_1 = sprusf.cfr_renamed_5831(sprusf2);
        if (sprvif2.cfr_renamed_1 == null) {
            throw new NullPointerException(sprdty.cfr_renamed_9("c\ta\t~\u001b3U.H}\u001d\u007f\u0004"));
        }
        int n = this.cfr_renamed_1.cfr_renamed_5732();
        byte[] byArray = sprusf.cfr_renamed_5832((sprusf)arg0);
        if (byArray != null) {
            int n2 = 4;
            int n3 = n;
            int n4 = n;
            int n5 = 0;
            if (byArray.length == n3 + n4) {
                sprvif sprvif3 = this;
                this.cfr_renamed_4 = 0;
                sprvif3.cfr_renamed_3 = sprvof.cfr_renamed_5759(byArray, n5, n3);
                sprvif3.cfr_renamed_2 = sprvof.cfr_renamed_5759(byArray, n5 += n3, n4);
                return;
            }
            if (byArray.length == n2 + n3 + n4) {
                sprvif sprvif4 = this;
                this.cfr_renamed_4 = sprpxe.cfr_renamed_446(byArray, 0);
                sprvif4.cfr_renamed_3 = sprvof.cfr_renamed_5759(byArray, n5 += n2, n3);
                sprvif4.cfr_renamed_2 = sprvof.cfr_renamed_5759(byArray, n5 += n3, n4);
                return;
            }
            throw new IllegalArgumentException(sprrnm.cfr_renamed_9("hlzuqz8r}`8qyj8njvv~8jqc}"));
        }
        sprvif sprvif5 = this;
        if (this.cfr_renamed_1.cfr_renamed_4721() != null) {
            sprvif5.cfr_renamed_4 = this.cfr_renamed_1.cfr_renamed_4721().cfr_renamed_4721();
            v4 = arg0;
        } else {
            sprvif5.cfr_renamed_4 = 0;
            v4 = arg0;
        }
        byte[] byArray2 = sprusf.cfr_renamed_5833((sprusf)v4);
        if (byArray2 != null) {
            if (byArray2.length != n) {
                throw new IllegalArgumentException(sprdty.cfr_renamed_9("\u007f\r}\u000fg\u00003\u0007uHa\u0007|\u001c3\u0005f\u001bgHq\r3\rb\u001dr\u00043\u001c|H\u007f\r}\u000fg\u00003\u0007uHw\u0001t\r`\u001c"));
            }
            this.cfr_renamed_3 = byArray2;
            v5 = arg0;
        } else {
            this.cfr_renamed_3 = new byte[n];
            v5 = arg0;
        }
        byte[] byArray3 = sprusf.cfr_renamed_5834((sprusf)v5);
        if (byArray3 != null) {
            if (byArray3.length != n) {
                throw new IllegalArgumentException(sprrnm.cfr_renamed_9("u}w\u007fmp9w\u007f8im{tp{J}||9ulkm8{}9}hmxt9lv8u}w\u007fmp9w\u007f8}q~}jl"));
            }
            this.cfr_renamed_2 = byArray3;
            return;
        }
        this.cfr_renamed_2 = new byte[n];
    }
}

