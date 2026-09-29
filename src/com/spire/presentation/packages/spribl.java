/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprnnaa;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprvv;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprywa;

public class spribl
implements sprvv {
    private boolean cfr_renamed_152;
    private int cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private int[] cfr_renamed_0;
    private static final int cfr_renamed_1 = 5;
    private int cfr_renamed_2;
    private int[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int[] cfr_renamed_3674(int[] nArray, int n) {
        void arg1;
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        v1[0] = v1[1];
        void v2 = arg0;
        v2[1] = v2[2];
        void v3 = arg0;
        v3[2] = v3[3];
        v0[3] = arg0[4];
        v0[4] = arg1;
        return v0;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl {
        int n;
        if (!this.cfr_renamed_152) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprnnaa.cfr_renamed_9("\u000bAD[\u000bFEF_FJCB\\NK")).toString());
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprywa.cfr_renamed_9("2y+b/79b=q>e{c4x{d3x)c"));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new sprwjl(sprnnaa.cfr_renamed_9("@^[[Z_\u000fIZMIN]\u000b[D@\u000b\\C@Y["));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = arg4 + n;
            byte by = (byte)(arg0[arg1 + n] ^ this.cfr_renamed_3677());
            arg3[n3] = by;
            n2 = ++n;
        }
        return arg2;
    }

    private /* synthetic */ void cfr_renamed_3678() {
        int n;
        int n2 = n = 0;
        while (n2 < 10) {
            spribl spribl2 = this;
            spribl2.cfr_renamed_2 = spribl2.cfr_renamed_3673();
            spribl2.cfr_renamed_0 = spribl2.cfr_renamed_3674(spribl2.cfr_renamed_0, this.cfr_renamed_3675() ^ this.cfr_renamed_3[0] ^ this.cfr_renamed_2);
            spribl2.cfr_renamed_3 = spribl2.cfr_renamed_3674(spribl2.cfr_renamed_3, this.cfr_renamed_3676() ^ this.cfr_renamed_2);
            n2 = ++n;
        }
        this.cfr_renamed_152 = true;
    }

    private /* synthetic */ int cfr_renamed_3675() {
        spribl spribl2 = this;
        int n = spribl2.cfr_renamed_0[0];
        spribl spribl3 = this;
        int n2 = spribl2.cfr_renamed_0[0] >>> 9 | spribl3.cfr_renamed_0[1] << 7;
        int n3 = spribl3.cfr_renamed_0[0] >>> 14 | this.cfr_renamed_0[1] << 2;
        int n4 = spribl2.cfr_renamed_0[0] >>> 15 | this.cfr_renamed_0[1] << 1;
        int n5 = spribl2.cfr_renamed_0[1] >>> 5 | this.cfr_renamed_0[2] << 11;
        int n6 = spribl2.cfr_renamed_0[1] >>> 12 | this.cfr_renamed_0[2] << 4;
        int n7 = spribl2.cfr_renamed_0[2] >>> 1 | this.cfr_renamed_0[3] << 15;
        int n8 = spribl2.cfr_renamed_0[2] >>> 5 | this.cfr_renamed_0[3] << 11;
        int n9 = spribl2.cfr_renamed_0[2] >>> 13 | this.cfr_renamed_0[3] << 3;
        int n10 = spribl2.cfr_renamed_0[3] >>> 4 | this.cfr_renamed_0[4] << 12;
        int n11 = spribl2.cfr_renamed_0[3] >>> 12 | this.cfr_renamed_0[4] << 4;
        int n12 = spribl2.cfr_renamed_0[3] >>> 14 | this.cfr_renamed_0[4] << 2;
        int n13 = spribl2.cfr_renamed_0[3] >>> 15 | this.cfr_renamed_0[4] << 1;
        return (n12 ^ n11 ^ n10 ^ n9 ^ n8 ^ n7 ^ n6 ^ n5 ^ n3 ^ n2 ^ n ^ n13 & n11 ^ n8 & n7 ^ n4 & n2 ^ n11 & n10 & n9 ^ n7 & n6 & n5 ^ n13 & n9 & n6 & n2 ^ n11 & n10 & n8 & n7 ^ n13 & n11 & n5 & n4 ^ n13 & n11 & n10 & n9 & n8 ^ n7 & n6 & n5 & n4 & n2 ^ n10 & n9 & n8 & n7 & n6 & n5) & 0xFFFF;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        if (!(arg1 instanceof sprkpk)) {
            throw new IllegalArgumentException(sprywa.cfr_renamed_9("P)v2y{aj72y2c{g:e:z>c>e(76b(c{~5t7b?r{v57\u0012A"));
        }
        sprkpk sprkpk2 = (sprkpk)arg1;
        byte[] byArray = sprkpk2.cfr_renamed_1205();
        if (byArray == null || byArray.length != 8) {
            throw new IllegalArgumentException(sprnnaa.cfr_renamed_9("hYNBA\u000bY\u001a\u000fYJZZB]N\\\u000bJSNH[GV\u000b\u0017\u000bMR[N\\\u000b@M\u000fby"));
        }
        if (!(sprkpk2.cfr_renamed_284() instanceof sprtpk)) {
            throw new IllegalArgumentException(sprywa.cfr_renamed_9("P)v2y{aj72y2c{g:e:z>c>e(76b(c{~5t7b?r{v{|>n"));
        }
        byte[] byArray2 = ((sprtpk)sprkpk2.cfr_renamed_284()).cfr_renamed_1521();
        if (byArray2.length != 10) {
            throw new IllegalArgumentException(sprnnaa.cfr_renamed_9("hYNBA\u000bY\u001a\u000f@JR\u000fFZX[\u000bMN\u000f\u0013\u001f\u000bMB[X\u000fG@EH"));
        }
        this.cfr_renamed_91 = new byte[byArray2.length];
        this.cfr_renamed_119 = new byte[byArray2.length];
        spribl spribl2 = this;
        this.cfr_renamed_3 = new int[5];
        spribl2.cfr_renamed_0 = new int[5];
        spribl2.cfr_renamed_4 = new byte[2];
        System.arraycopy(byArray, 0, this.cfr_renamed_91, 0, byArray.length);
        System.arraycopy(byArray2, 0, this.cfr_renamed_119, 0, byArray2.length);
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 80, arg1, sprlrk.cfr_renamed_9915(arg0)));
        this.cfr_renamed_41();
    }

    @Override
    public String cfr_renamed_1315() {
        return sprywa.cfr_renamed_9("\u001ce:~57-&");
    }

    @Override
    public byte cfr_renamed_3243(byte arg0) {
        if (!this.cfr_renamed_152) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprnnaa.cfr_renamed_9("\u000bAD[\u000bFEF_FJCB\\NK")).toString());
        }
        return (byte)(arg0 ^ this.cfr_renamed_3677());
    }

    private /* synthetic */ int cfr_renamed_3676() {
        spribl spribl2 = this;
        int n = spribl2.cfr_renamed_3[0];
        spribl spribl3 = this;
        int n2 = spribl2.cfr_renamed_3[0] >>> 13 | spribl3.cfr_renamed_3[1] << 3;
        int n3 = spribl3.cfr_renamed_3[1] >>> 7 | this.cfr_renamed_3[2] << 9;
        int n4 = spribl2.cfr_renamed_3[2] >>> 6 | this.cfr_renamed_3[3] << 10;
        int n5 = spribl2.cfr_renamed_3[3] >>> 3 | this.cfr_renamed_3[4] << 13;
        int n6 = spribl2.cfr_renamed_3[3] >>> 14 | this.cfr_renamed_3[4] << 2;
        return (n ^ n2 ^ n3 ^ n4 ^ n5 ^ n6) & 0xFFFF;
    }

    private /* synthetic */ byte cfr_renamed_3677() {
        if (this.cfr_renamed_112 > 1) {
            this.cfr_renamed_3672();
            this.cfr_renamed_112 = 0;
        }
        return this.cfr_renamed_4[this.cfr_renamed_112++];
    }

    @Override
    public void cfr_renamed_41() {
        spribl spribl2 = this;
        spribl2.cfr_renamed_112 = 2;
        spribl spribl3 = this;
        spribl3.cfr_renamed_3471(spribl2.cfr_renamed_119, spribl3.cfr_renamed_91);
        spribl2.cfr_renamed_3678();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3471(byte[] byArray, byte[] byArray2) {
        int n;
        void arg0;
        void arg1;
        void v0 = arg1;
        v0[8] = -1;
        v0[9] = -1;
        spribl spribl2 = this;
        spribl2.cfr_renamed_119 = arg0;
        spribl2.cfr_renamed_91 = v0;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_0.length) {
            spribl spribl3 = this;
            this.cfr_renamed_0[n] = (spribl3.cfr_renamed_119[n2 + 1] << 8 | this.cfr_renamed_119[n2] & 0xFF) & 0xFFFF;
            int n4 = (this.cfr_renamed_91[n2 + 1] << 8 | this.cfr_renamed_91[n2] & 0xFF) & 0xFFFF;
            n2 += 2;
            spribl3.cfr_renamed_3[n] = n4;
            n3 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_3672() {
        spribl spribl2 = this;
        spribl2.cfr_renamed_2 = spribl2.cfr_renamed_3673();
        spribl2.cfr_renamed_4[0] = (byte)this.cfr_renamed_2;
        spribl2.cfr_renamed_4[1] = (byte)(this.cfr_renamed_2 >> 8);
        spribl2.cfr_renamed_0 = spribl2.cfr_renamed_3674(spribl2.cfr_renamed_0, this.cfr_renamed_3675() ^ this.cfr_renamed_3[0]);
        spribl2.cfr_renamed_3 = spribl2.cfr_renamed_3674(spribl2.cfr_renamed_3, this.cfr_renamed_3676());
    }

    private /* synthetic */ int cfr_renamed_3673() {
        spribl spribl2 = this;
        spribl spribl3 = this;
        int n = spribl2.cfr_renamed_0[0] >>> 1 | spribl3.cfr_renamed_0[1] << 15;
        int n2 = spribl2.cfr_renamed_0[0] >>> 2 | this.cfr_renamed_0[1] << 14;
        int n3 = spribl3.cfr_renamed_0[0] >>> 4 | this.cfr_renamed_0[1] << 12;
        int n4 = spribl2.cfr_renamed_0[0] >>> 10 | this.cfr_renamed_0[1] << 6;
        int n5 = spribl2.cfr_renamed_0[1] >>> 15 | this.cfr_renamed_0[2] << 1;
        int n6 = spribl2.cfr_renamed_0[2] >>> 11 | this.cfr_renamed_0[3] << 5;
        int n7 = spribl2.cfr_renamed_0[3] >>> 8 | this.cfr_renamed_0[4] << 8;
        int n8 = spribl2.cfr_renamed_0[3] >>> 15 | this.cfr_renamed_0[4] << 1;
        int n9 = spribl2.cfr_renamed_3[0] >>> 3 | this.cfr_renamed_3[1] << 13;
        int n10 = spribl2.cfr_renamed_3[1] >>> 9 | this.cfr_renamed_3[2] << 7;
        int n11 = spribl2.cfr_renamed_3[2] >>> 14 | this.cfr_renamed_3[3] << 2;
        int n12 = spribl2.cfr_renamed_3[4];
        return (n10 ^ n8 ^ n9 & n12 ^ n11 & n12 ^ n12 & n8 ^ n9 & n10 & n11 ^ n9 & n11 & n12 ^ n9 & n11 & n8 ^ n10 & n11 & n8 ^ n11 & n12 & n8 ^ n ^ n2 ^ n3 ^ n4 ^ n5 ^ n6 ^ n7) & 0xFFFF;
    }

    public spribl() {
        spribl spribl2 = this;
        spribl2.cfr_renamed_112 = 2;
        spribl2.cfr_renamed_152 = false;
    }
}

