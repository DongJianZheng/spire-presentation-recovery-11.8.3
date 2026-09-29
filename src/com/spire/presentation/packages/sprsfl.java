/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprgmg;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprlwba;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprvv;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;

public class sprsfl
implements sprvv {
    private int[] cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private int[] cfr_renamed_119;
    private int cfr_renamed_91;
    private static final int cfr_renamed_0 = 4;
    private byte[] cfr_renamed_1;
    private boolean cfr_renamed_2;
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    private /* synthetic */ int cfr_renamed_3675() {
        sprsfl sprsfl2 = this;
        int n = sprsfl2.cfr_renamed_119[0];
        sprsfl sprsfl3 = this;
        int n2 = sprsfl2.cfr_renamed_119[0] >>> 3 | sprsfl3.cfr_renamed_119[1] << 29;
        int n3 = sprsfl3.cfr_renamed_119[0] >>> 11 | this.cfr_renamed_119[1] << 21;
        int n4 = sprsfl2.cfr_renamed_119[0] >>> 13 | this.cfr_renamed_119[1] << 19;
        int n5 = sprsfl2.cfr_renamed_119[0] >>> 17 | this.cfr_renamed_119[1] << 15;
        int n6 = sprsfl2.cfr_renamed_119[0] >>> 18 | this.cfr_renamed_119[1] << 14;
        int n7 = sprsfl2.cfr_renamed_119[0] >>> 26 | this.cfr_renamed_119[1] << 6;
        int n8 = sprsfl2.cfr_renamed_119[0] >>> 27 | this.cfr_renamed_119[1] << 5;
        int n9 = sprsfl2.cfr_renamed_119[1] >>> 8 | this.cfr_renamed_119[2] << 24;
        int n10 = sprsfl2.cfr_renamed_119[1] >>> 16 | this.cfr_renamed_119[2] << 16;
        int n11 = sprsfl2.cfr_renamed_119[1] >>> 24 | this.cfr_renamed_119[2] << 8;
        int n12 = sprsfl2.cfr_renamed_119[1] >>> 27 | this.cfr_renamed_119[2] << 5;
        int n13 = sprsfl2.cfr_renamed_119[1] >>> 29 | this.cfr_renamed_119[2] << 3;
        int n14 = sprsfl2.cfr_renamed_119[2] >>> 1 | this.cfr_renamed_119[3] << 31;
        int n15 = sprsfl2.cfr_renamed_119[2] >>> 3 | this.cfr_renamed_119[3] << 29;
        int n16 = sprsfl2.cfr_renamed_119[2] >>> 4 | this.cfr_renamed_119[3] << 28;
        int n17 = sprsfl2.cfr_renamed_119[2] >>> 20 | this.cfr_renamed_119[3] << 12;
        int n18 = sprsfl2.cfr_renamed_119[2] >>> 27 | this.cfr_renamed_119[3] << 5;
        int n19 = sprsfl2.cfr_renamed_119[3];
        return n ^ n7 ^ n11 ^ n18 ^ n19 ^ n2 & n15 ^ n3 & n4 ^ n5 & n6 ^ n8 & n12 ^ n9 & n10 ^ n13 & n14 ^ n16 & n17;
    }

    private /* synthetic */ byte cfr_renamed_3677() {
        if (this.cfr_renamed_91 > 3) {
            this.cfr_renamed_3672();
            this.cfr_renamed_91 = 0;
        }
        return this.cfr_renamed_1[this.cfr_renamed_91++];
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3471(byte[] byArray, byte[] byArray2) {
        int n;
        void arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        v1[12] = -1;
        v1[13] = -1;
        v0[14] = -1;
        v0[15] = -1;
        sprsfl sprsfl2 = this;
        sprsfl2.cfr_renamed_112 = arg0;
        sprsfl2.cfr_renamed_4 = v0;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_119.length) {
            sprsfl sprsfl3 = this;
            this.cfr_renamed_119[n] = sprsfl3.cfr_renamed_112[n2 + 3] << 24 | this.cfr_renamed_112[n2 + 2] << 16 & 0xFF0000 | this.cfr_renamed_112[n2 + 1] << 8 & 0xFF00 | this.cfr_renamed_112[n2] & 0xFF;
            int n4 = this.cfr_renamed_4[n2 + 3] << 24 | this.cfr_renamed_4[n2 + 2] << 16 & 0xFF0000 | this.cfr_renamed_4[n2 + 1] << 8 & 0xFF00 | this.cfr_renamed_4[n2] & 0xFF;
            n2 += 4;
            sprsfl3.cfr_renamed_152[n] = n4;
            n3 = ++n;
        }
    }

    @Override
    public void cfr_renamed_41() {
        sprsfl sprsfl2 = this;
        sprsfl2.cfr_renamed_91 = 4;
        sprsfl sprsfl3 = this;
        sprsfl3.cfr_renamed_3471(sprsfl2.cfr_renamed_112, sprsfl3.cfr_renamed_4);
        sprsfl2.cfr_renamed_3678();
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl {
        int n;
        if (!this.cfr_renamed_2) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprgmg.cfr_renamed_9("{J4P{M5M/M:H2W>@")).toString());
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprlwba.cfr_renamed_9("&6?-;x--)>**o, 7o+'7=,"));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new sprwjl(sprgmg.cfr_renamed_9("K.P+Q/\u00049Q=B>V{P4K{W3K)P"));
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

    @Override
    public String cfr_renamed_1315() {
        return sprlwba.cfr_renamed_9("\u001f=9&6bi}`");
    }

    private /* synthetic */ void cfr_renamed_3678() {
        int n;
        int n2 = n = 0;
        while (n2 < 8) {
            sprsfl sprsfl2 = this;
            sprsfl2.cfr_renamed_3 = sprsfl2.cfr_renamed_3673();
            sprsfl2.cfr_renamed_119 = sprsfl2.cfr_renamed_3674(sprsfl2.cfr_renamed_119, this.cfr_renamed_3675() ^ this.cfr_renamed_152[0] ^ this.cfr_renamed_3);
            sprsfl2.cfr_renamed_152 = sprsfl2.cfr_renamed_3674(sprsfl2.cfr_renamed_152, this.cfr_renamed_3676() ^ this.cfr_renamed_3);
            n2 = ++n;
        }
        this.cfr_renamed_2 = true;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        if (!(arg1 instanceof sprkpk)) {
            throw new IllegalArgumentException(sprgmg.cfr_renamed_9("\u001cV:M5\tj\u0016c\u0004\u0012J2P{T:V:I>P>V(\u00046Q(P{M5G7Q?A{E5\u0004\u0012r"));
        }
        sprkpk sprkpk2 = (sprkpk)arg1;
        byte[] byArray = sprkpk2.cfr_renamed_1205();
        if (byArray == null || byArray.length != 12) {
            throw new IllegalArgumentException(sprlwba.cfr_renamed_9("\u001f=9&6bi}`o**):1==<x* .;;46x~jo:6,*+o7)x\u0006\u000e"));
        }
        if (!(sprkpk2.cfr_renamed_284() instanceof sprtpk)) {
            throw new IllegalArgumentException(sprgmg.cfr_renamed_9("\u001cV:M5\tj\u0016c\u00042J2P{T:V:I>P>V(\u00046Q(P{M5G7Q?A{E{O>]"));
        }
        byte[] byArray2 = ((sprtpk)sprkpk2.cfr_renamed_284()).cfr_renamed_1521();
        if (byArray2.length != 16) {
            throw new IllegalArgumentException(sprlwba.cfr_renamed_9("\u001f=9&6bi}`o3*!o5:+;x-=oi}`o:&,<x#7!?"));
        }
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 128, arg1, sprlrk.cfr_renamed_9915(arg0)));
        this.cfr_renamed_4 = new byte[byArray2.length];
        this.cfr_renamed_112 = new byte[byArray2.length];
        sprsfl sprsfl2 = this;
        this.cfr_renamed_152 = new int[4];
        sprsfl2.cfr_renamed_119 = new int[4];
        sprsfl2.cfr_renamed_1 = new byte[4];
        System.arraycopy(byArray, 0, this.cfr_renamed_4, 0, byArray.length);
        System.arraycopy(byArray2, 0, this.cfr_renamed_112, 0, byArray2.length);
        this.cfr_renamed_41();
    }

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
        v0[2] = arg0[3];
        v0[3] = arg1;
        return v0;
    }

    @Override
    public byte cfr_renamed_3243(byte arg0) {
        if (!this.cfr_renamed_2) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprgmg.cfr_renamed_9("{J4P{M5M/M:H2W>@")).toString());
        }
        return (byte)(arg0 ^ this.cfr_renamed_3677());
    }

    public sprsfl() {
        sprsfl sprsfl2 = this;
        sprsfl2.cfr_renamed_91 = 4;
        sprsfl2.cfr_renamed_2 = false;
    }

    private /* synthetic */ int cfr_renamed_3676() {
        sprsfl sprsfl2 = this;
        int n = sprsfl2.cfr_renamed_152[0];
        sprsfl sprsfl3 = this;
        int n2 = sprsfl2.cfr_renamed_152[0] >>> 7 | sprsfl3.cfr_renamed_152[1] << 25;
        int n3 = sprsfl3.cfr_renamed_152[1] >>> 6 | this.cfr_renamed_152[2] << 26;
        int n4 = sprsfl2.cfr_renamed_152[2] >>> 6 | this.cfr_renamed_152[3] << 26;
        int n5 = sprsfl2.cfr_renamed_152[2] >>> 17 | this.cfr_renamed_152[3] << 15;
        int n6 = sprsfl2.cfr_renamed_152[3];
        return n ^ n2 ^ n3 ^ n4 ^ n5 ^ n6;
    }

    private /* synthetic */ void cfr_renamed_3672() {
        sprsfl sprsfl2 = this;
        sprsfl2.cfr_renamed_3 = sprsfl2.cfr_renamed_3673();
        sprsfl2.cfr_renamed_1[0] = (byte)this.cfr_renamed_3;
        sprsfl2.cfr_renamed_1[1] = (byte)(this.cfr_renamed_3 >> 8);
        sprsfl2.cfr_renamed_1[2] = (byte)(this.cfr_renamed_3 >> 16);
        sprsfl2.cfr_renamed_1[3] = (byte)(this.cfr_renamed_3 >> 24);
        sprsfl2.cfr_renamed_119 = sprsfl2.cfr_renamed_3674(sprsfl2.cfr_renamed_119, this.cfr_renamed_3675() ^ this.cfr_renamed_152[0]);
        sprsfl2.cfr_renamed_152 = sprsfl2.cfr_renamed_3674(sprsfl2.cfr_renamed_152, this.cfr_renamed_3676());
    }

    private /* synthetic */ int cfr_renamed_3673() {
        sprsfl sprsfl2 = this;
        sprsfl sprsfl3 = this;
        int n = sprsfl2.cfr_renamed_119[0] >>> 2 | sprsfl3.cfr_renamed_119[1] << 30;
        int n2 = sprsfl2.cfr_renamed_119[0] >>> 12 | this.cfr_renamed_119[1] << 20;
        int n3 = sprsfl3.cfr_renamed_119[0] >>> 15 | this.cfr_renamed_119[1] << 17;
        int n4 = sprsfl2.cfr_renamed_119[1] >>> 4 | this.cfr_renamed_119[2] << 28;
        int n5 = sprsfl2.cfr_renamed_119[1] >>> 13 | this.cfr_renamed_119[2] << 19;
        int n6 = sprsfl2.cfr_renamed_119[2];
        int n7 = sprsfl2.cfr_renamed_119[2] >>> 9 | this.cfr_renamed_119[3] << 23;
        int n8 = sprsfl2.cfr_renamed_119[2] >>> 25 | this.cfr_renamed_119[3] << 7;
        int n9 = sprsfl2.cfr_renamed_119[2] >>> 31 | this.cfr_renamed_119[3] << 1;
        int n10 = sprsfl2.cfr_renamed_152[0] >>> 8 | this.cfr_renamed_152[1] << 24;
        int n11 = sprsfl2.cfr_renamed_152[0] >>> 13 | this.cfr_renamed_152[1] << 19;
        int n12 = sprsfl2.cfr_renamed_152[0] >>> 20 | this.cfr_renamed_152[1] << 12;
        int n13 = sprsfl2.cfr_renamed_152[1] >>> 10 | this.cfr_renamed_152[2] << 22;
        int n14 = sprsfl2.cfr_renamed_152[1] >>> 28 | this.cfr_renamed_152[2] << 4;
        int n15 = sprsfl2.cfr_renamed_152[2] >>> 15 | this.cfr_renamed_152[3] << 17;
        int n16 = sprsfl2.cfr_renamed_152[2] >>> 29 | this.cfr_renamed_152[3] << 3;
        int n17 = sprsfl2.cfr_renamed_152[2] >>> 31 | this.cfr_renamed_152[3] << 1;
        return n2 & n10 ^ n11 & n12 ^ n9 & n13 ^ n14 & n15 ^ n2 & n9 & n17 ^ n16 ^ n ^ n3 ^ n4 ^ n5 ^ n6 ^ n7 ^ n8;
    }
}

