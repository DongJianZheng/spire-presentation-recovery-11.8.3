/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprqgo;
import com.spire.presentation.packages.sprrxg;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;

public class spraal
implements sprmr {
    private static final int cfr_renamed_0 = 64;
    private int[] cfr_renamed_1;
    private static final int cfr_renamed_2 = 32;
    private boolean cfr_renamed_3;
    private static final int[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_3569(int[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            byte[] byArray = arg1;
            byte[] byArray2 = arg1;
            byArray[arg2++] = (byte)(arg0[n] >>> 24);
            byArray2[arg2++] = (byte)(arg0[n] >>> 16);
            byArray[arg2++] = (byte)(arg0[n] >>> 8);
            int n3 = arg2++;
            byte by = (byte)arg0[n];
            byArray2[n3] = by;
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_3570(byte[] arg0, int[] arg1, int arg2, int arg3) {
        int n;
        int n2 = n = arg3;
        while (n2 < arg0.length / 4) {
            int n3 = arg0[arg2] & 0xFF;
            int n4 = arg0[++arg2] & 0xFF;
            int n5 = arg0[++arg2] & 0xFF;
            int n6 = arg0[++arg2] & 0xFF;
            ++arg2;
            arg1[n++] = n3 << 24 | n4 << 16 | n5 << 8 | n6;
            n2 = n;
        }
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        sprbj sprbj2;
        int n;
        if (!(arg1 instanceof sprtpk)) {
            throw new IllegalArgumentException(sprrxg.cfr_renamed_9("4S7D{N2P+Q>\u001d\u0010X\"m:O:P>I>O{X#M>^/X?\u0013"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_1 = new int[64];
        byte[] byArray = ((sprtpk)arg1).cfr_renamed_1521();
        this.cfr_renamed_2402(byArray);
        int n2 = byArray.length * 8;
        String string = this.cfr_renamed_1315();
        if (n2 < 256) {
            n = n2;
            sprbj2 = arg1;
        } else {
            n = 256;
            sprbj2 = arg1;
        }
        sprybl.cfr_renamed_9170(new sprfdl(string, n, sprbj2, sprlrk.cfr_renamed_9915(this.cfr_renamed_3)));
    }

    static {
        int[] nArray = new int[64];
        nArray[0] = 1116352408;
        nArray[1] = 1899447441;
        nArray[2] = -1245643825;
        nArray[3] = -373957723;
        nArray[4] = 961987163;
        nArray[5] = 1508970993;
        nArray[6] = -1841331548;
        nArray[7] = -1424204075;
        nArray[8] = -670586216;
        nArray[9] = 310598401;
        nArray[10] = 607225278;
        nArray[11] = 1426881987;
        nArray[12] = 1925078388;
        nArray[13] = -2132889090;
        nArray[14] = -1680079193;
        nArray[15] = -1046744716;
        nArray[16] = -459576895;
        nArray[17] = -272742522;
        nArray[18] = 264347078;
        nArray[19] = 604807628;
        nArray[20] = 770255983;
        nArray[21] = 1249150122;
        nArray[22] = 1555081692;
        nArray[23] = 1996064986;
        nArray[24] = -1740746414;
        nArray[25] = -1473132947;
        nArray[26] = -1341970488;
        nArray[27] = -1084653625;
        nArray[28] = -958395405;
        nArray[29] = -710438585;
        nArray[30] = 113926993;
        nArray[31] = 338241895;
        nArray[32] = 666307205;
        nArray[33] = 773529912;
        nArray[34] = 1294757372;
        nArray[35] = 1396182291;
        nArray[36] = 1695183700;
        nArray[37] = 1986661051;
        nArray[38] = -2117940946;
        nArray[39] = -1838011259;
        nArray[40] = -1564481375;
        nArray[41] = -1474664885;
        nArray[42] = -1035236496;
        nArray[43] = -949202525;
        nArray[44] = -778901479;
        nArray[45] = -694614492;
        nArray[46] = -200395387;
        nArray[47] = 275423344;
        nArray[48] = 430227734;
        nArray[49] = 506948616;
        nArray[50] = 659060556;
        nArray[51] = 883997877;
        nArray[52] = 958139571;
        nArray[53] = 1322822218;
        nArray[54] = 1537002063;
        nArray[55] = 1747873779;
        nArray[56] = 1955562222;
        nArray[57] = 2024104815;
        nArray[58] = -2067236844;
        nArray[59] = -1933114872;
        nArray[60] = -1866530822;
        nArray[61] = -1538233109;
        nArray[62] = -1090935817;
        nArray[63] = -965641998;
        cfr_renamed_4 = nArray;
    }

    public void cfr_renamed_2402(byte[] arg0) {
        int n;
        if (arg0.length == 0 || arg0.length > 64 || arg0.length < 16 || arg0.length % 8 != 0) {
            throw new IllegalArgumentException(sprqgo.cfr_renamed_9("1p\u0003{\u0003tP5\t}\u001b8\u000fm\u0011lBz\u00078S.B5B.V8\u0000a\u0016}\u00118\u0003v\u00068\u000fm\u000el\u000bh\u000e}Bw\u00048Z"));
        }
        this.cfr_renamed_3570(arg0, this.cfr_renamed_1, 0, 0);
        int n2 = n = 16;
        while (n2 < 64) {
            spraal spraal2 = this;
            int n3 = n;
            int n4 = ((spraal2.cfr_renamed_1[n - 2] >>> 17 | this.cfr_renamed_1[n3 - 2] << -17) ^ (this.cfr_renamed_1[n - 2] >>> 19 | this.cfr_renamed_1[n - 2] << -19) ^ this.cfr_renamed_1[n - 2] >>> 10) + this.cfr_renamed_1[n - 7] + ((this.cfr_renamed_1[n - 15] >>> 7 | this.cfr_renamed_1[n - 15] << -7) ^ (this.cfr_renamed_1[n - 15] >>> 18 | this.cfr_renamed_1[n - 15] << -18) ^ this.cfr_renamed_1[n - 15] >>> 3) + this.cfr_renamed_1[n - 16];
            spraal2.cfr_renamed_1[n3] = n4;
            n2 = ++n;
        }
    }

    public spraal() {
        spraal spraal2 = this;
        spraal2.cfr_renamed_3 = false;
        spraal2.cfr_renamed_1 = null;
    }

    @Override
    public int cfr_renamed_1195() {
        return 32;
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        if (this.cfr_renamed_1 == null) {
            throw new IllegalStateException(sprrxg.cfr_renamed_9("n3\\8\\7\u000f{S4I{T5T/T:Q2N>Y"));
        }
        if (arg1 + 32 > arg0.length) {
            throw new sprddl(sprqgo.cfr_renamed_9("q\fh\u0017lBz\u0017~\u0004}\u00108\u0016w\r8\u0011p\rj\u0016"));
        }
        if (arg3 + 32 > arg2.length) {
            throw new sprwjl(sprrxg.cfr_renamed_9("R.I+H/\u001d9H=[>O{I4R{N3R)I"));
        }
        if (this.cfr_renamed_3) {
            this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        } else {
            this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
        }
        return 32;
    }

    @Override
    public void cfr_renamed_41() {
    }

    @Override
    public String cfr_renamed_1315() {
        return sprqgo.cfr_renamed_9("1p\u0003{\u0003tP");
    }

    private /* synthetic */ void cfr_renamed_10344(byte[] arg0, int[] arg1, int arg2, int arg3) {
        int n;
        int n2 = n = arg3;
        while (n2 < 8) {
            int n3 = arg0[arg2] & 0xFF;
            int n4 = arg0[++arg2] & 0xFF;
            int n5 = arg0[++arg2] & 0xFF;
            int n6 = arg0[++arg2] & 0xFF;
            ++arg2;
            arg1[n++] = n3 << 24 | n4 << 16 | n5 << 8 | n6;
            n2 = n;
        }
    }

    private /* synthetic */ void cfr_renamed_3393(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int n;
        int[] nArray = new int[8];
        this.cfr_renamed_10344(arg0, nArray, arg1, 0);
        int n2 = n = 0;
        while (n2 < 64) {
            int[] nArray2 = nArray;
            int[] nArray3 = nArray;
            int n3 = ((nArray2[4] >>> 6 | nArray[4] << -6) ^ (nArray[4] >>> 11 | nArray[4] << -11) ^ (nArray[4] >>> 25 | nArray[4] << -25)) + (nArray[4] & nArray[5] ^ ~nArray[4] & nArray[6]) + nArray[7] + cfr_renamed_4[n] + this.cfr_renamed_1[n];
            nArray3[7] = nArray[6];
            nArray[6] = nArray[5];
            nArray2[5] = nArray[4];
            nArray3[4] = nArray[3] + n3;
            nArray2[3] = nArray[2];
            nArray3[2] = nArray[1];
            nArray2[1] = nArray[0];
            nArray3[0] = n3 + ((nArray[0] >>> 2 | nArray[0] << -2) ^ (nArray[0] >>> 13 | nArray[0] << -13) ^ (nArray[0] >>> 22 | nArray[0] << -22)) + (nArray[0] & nArray[2] ^ nArray[0] & nArray[3] ^ nArray[2] & nArray[3]);
            n2 = ++n;
        }
        this.cfr_renamed_3569(nArray, arg2, arg3);
    }

    private /* synthetic */ void cfr_renamed_3396(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int n;
        int[] nArray = new int[8];
        this.cfr_renamed_10344(arg0, nArray, arg1, 0);
        int n2 = n = 63;
        while (n2 > -1) {
            int[] nArray2 = nArray;
            int[] nArray3 = nArray;
            int n3 = nArray2[0] - ((nArray[1] >>> 2 | nArray[1] << -2) ^ (nArray[1] >>> 13 | nArray[1] << -13) ^ (nArray[1] >>> 22 | nArray[1] << -22)) - (nArray[1] & nArray[2] ^ nArray[1] & nArray[3] ^ nArray[2] & nArray[3]);
            nArray3[0] = nArray[1];
            nArray[1] = nArray[2];
            nArray2[2] = nArray[3];
            nArray3[3] = nArray[4] - n3;
            nArray2[4] = nArray[5];
            nArray3[5] = nArray[6];
            nArray2[6] = nArray[7];
            int n4 = n3 - cfr_renamed_4[n] - this.cfr_renamed_1[n] - ((nArray[4] >>> 6 | nArray[4] << -6) ^ (nArray[4] >>> 11 | nArray[4] << -11) ^ (nArray[4] >>> 25 | nArray[4] << -25)) - (nArray[4] & nArray[5] ^ ~nArray[4] & nArray[6]);
            nArray3[7] = n4;
            n2 = --n;
        }
        this.cfr_renamed_3569(nArray, arg2, arg3);
    }
}

