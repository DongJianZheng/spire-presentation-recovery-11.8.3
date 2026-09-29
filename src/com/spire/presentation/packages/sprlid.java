/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprehd;
import com.spire.presentation.packages.sprjl;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprtsa;

public class sprlid
extends sprehd
implements sprjl {
    private static final int cfr_renamed_102 = 1859775393;
    private static final int cfr_renamed_93 = 20;
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private static final int cfr_renamed_0 = 1518500249;
    private int cfr_renamed_1;
    private static final int cfr_renamed_2 = -1894007588;
    private static final int cfr_renamed_3 = -899497514;
    private int[] cfr_renamed_4;

    @Override
    public sprrj cfr_renamed_461() {
        return new sprlid(this);
    }

    /*
     * WARNING - void declaration
     */
    public sprlid(byte[] byArray) {
        int n;
        void arg0;
        sprlid sprlid2 = this;
        void v1 = arg0;
        sprlid sprlid3 = this;
        void v3 = arg0;
        super((byte[])arg0);
        this.cfr_renamed_4 = new int[80];
        this.cfr_renamed_1 = sprtsa.cfr_renamed_446((byte[])v3, 16);
        sprlid3.cfr_renamed_119 = sprtsa.cfr_renamed_446((byte[])v3, 20);
        sprlid3.cfr_renamed_86 = sprtsa.cfr_renamed_446((byte[])arg0, 24);
        this.cfr_renamed_91 = sprtsa.cfr_renamed_446((byte[])v1, 28);
        sprlid2.cfr_renamed_152 = sprtsa.cfr_renamed_446((byte[])v1, 32);
        sprlid2.cfr_renamed_112 = sprtsa.cfr_renamed_446(byArray, 36);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_112) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = sprtsa.cfr_renamed_446((byte[])arg0, 40 + n3 * 4);
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        void arg0;
        sprlid sprlid2 = this;
        sprlid2.cfr_renamed_3120();
        sprtsa.cfr_renamed_442(sprlid2.cfr_renamed_1, (byte[])arg0, (int)arg1);
        sprtsa.cfr_renamed_442(sprlid2.cfr_renamed_119, (byte[])arg0, (int)(arg1 + 4));
        sprtsa.cfr_renamed_442(sprlid2.cfr_renamed_86, (byte[])arg0, (int)(arg1 + 8));
        sprtsa.cfr_renamed_442(sprlid2.cfr_renamed_91, (byte[])arg0, (int)(arg1 + 12));
        sprtsa.cfr_renamed_442(sprlid2.cfr_renamed_152, (byte[])arg0, (int)(arg1 + 16));
        sprlid2.cfr_renamed_41();
        return 20;
    }

    private /* synthetic */ void cfr_renamed_3829(sprlid arg0) {
        sprlid sprlid2 = arg0;
        sprlid sprlid3 = this;
        sprlid sprlid4 = arg0;
        this.cfr_renamed_1 = arg0.cfr_renamed_1;
        this.cfr_renamed_119 = sprlid4.cfr_renamed_119;
        sprlid3.cfr_renamed_86 = sprlid4.cfr_renamed_86;
        sprlid3.cfr_renamed_91 = arg0.cfr_renamed_91;
        this.cfr_renamed_152 = sprlid2.cfr_renamed_152;
        System.arraycopy(sprlid2.cfr_renamed_4, 0, this.cfr_renamed_4, 0, arg0.cfr_renamed_4.length);
        this.cfr_renamed_112 = arg0.cfr_renamed_112;
    }

    private /* synthetic */ int cfr_renamed_3830(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | ~arg0 & arg2;
    }

    @Override
    public void cfr_renamed_3766(byte[] arg0, int arg1) {
        int n;
        int n2;
        int n3;
        int n4 = n3;
        n4 = n2;
        n4 = n;
        n4 = arg0[arg1] << 24 | (arg0[++arg1] & 0xFF) << 16 | (arg0[++arg1] & 0xFF) << 8 | arg0[++arg1] & 0xFF;
        sprlid sprlid2 = this;
        this.cfr_renamed_4[sprlid2.cfr_renamed_112] = n4;
        if (++sprlid2.cfr_renamed_112 == 16) {
            this.cfr_renamed_3473();
        }
    }

    public sprlid() {
        sprlid sprlid2 = this;
        sprlid2.cfr_renamed_4 = new int[80];
        sprlid2.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_3763(long arg0) {
        if (this.cfr_renamed_112 > 14) {
            this.cfr_renamed_3473();
        }
        sprlid sprlid2 = this;
        sprlid2.cfr_renamed_4[14] = (int)(arg0 >>> 32);
        sprlid2.cfr_renamed_4[15] = (int)(arg0 & 0xFFFFFFFFFFFFFFFFL);
    }

    private /* synthetic */ int cfr_renamed_3831(int arg0, int arg1, int arg2) {
        return arg0 ^ arg1 ^ arg2;
    }

    @Override
    public String cfr_renamed_1315() {
        return "SHA-1";
    }

    @Override
    public void cfr_renamed_3473() {
        int n;
        int n2;
        int n3;
        int n4 = n3 = 16;
        while (n4 < 80) {
            sprlid sprlid2 = this;
            n2 = this.cfr_renamed_4[n3 - 3] ^ this.cfr_renamed_4[n3 - 8] ^ this.cfr_renamed_4[n3 - 14] ^ sprlid2.cfr_renamed_4[n3 - 16];
            sprlid2.cfr_renamed_4[n3++] = n2 << 1 | n2 >>> 31;
            n4 = n3;
        }
        sprlid sprlid3 = this;
        n3 = sprlid3.cfr_renamed_1;
        n2 = sprlid3.cfr_renamed_119;
        int n5 = sprlid3.cfr_renamed_86;
        int n6 = sprlid3.cfr_renamed_91;
        int n7 = sprlid3.cfr_renamed_152;
        int n8 = 0;
        int n9 = n = 0;
        while (n9 < 4) {
            int n10 = (n3 << 5 | n3 >>> 27) + this.cfr_renamed_3830(n2, n5, n6) + this.cfr_renamed_4[n8];
            n2 = n2 << 30 | n2 >>> 2;
            int n11 = ((n7 += n10 + 1518500249) << 5 | n7 >>> 27) + this.cfr_renamed_3830(n3, n2, n5) + this.cfr_renamed_4[++n8];
            n3 = n3 << 30 | n3 >>> 2;
            int n12 = ((n6 += n11 + 1518500249) << 5 | n6 >>> 27) + this.cfr_renamed_3830(n7, n3, n2) + this.cfr_renamed_4[++n8];
            n7 = n7 << 30 | n7 >>> 2;
            int n13 = ((n5 += n12 + 1518500249) << 5 | n5 >>> 27) + this.cfr_renamed_3830(n6, n7, n3) + this.cfr_renamed_4[++n8];
            n6 = n6 << 30 | n6 >>> 2;
            int n14 = ((n2 += n13 + 1518500249) << 5 | n2 >>> 27) + this.cfr_renamed_3830(n5, n6, n7) + this.cfr_renamed_4[++n8];
            ++n8;
            n3 += n14 + 1518500249;
            n5 = n5 << 30 | n5 >>> 2;
            n9 = ++n;
        }
        int n15 = n = 0;
        while (n15 < 4) {
            int n16 = (n3 << 5 | n3 >>> 27) + this.cfr_renamed_3831(n2, n5, n6) + this.cfr_renamed_4[n8];
            n2 = n2 << 30 | n2 >>> 2;
            int n17 = ((n7 += n16 + 1859775393) << 5 | n7 >>> 27) + this.cfr_renamed_3831(n3, n2, n5) + this.cfr_renamed_4[++n8];
            n3 = n3 << 30 | n3 >>> 2;
            int n18 = ((n6 += n17 + 1859775393) << 5 | n6 >>> 27) + this.cfr_renamed_3831(n7, n3, n2) + this.cfr_renamed_4[++n8];
            n7 = n7 << 30 | n7 >>> 2;
            int n19 = ((n5 += n18 + 1859775393) << 5 | n5 >>> 27) + this.cfr_renamed_3831(n6, n7, n3) + this.cfr_renamed_4[++n8];
            n6 = n6 << 30 | n6 >>> 2;
            int n20 = ((n2 += n19 + 1859775393) << 5 | n2 >>> 27) + this.cfr_renamed_3831(n5, n6, n7) + this.cfr_renamed_4[++n8];
            ++n8;
            n3 += n20 + 1859775393;
            n5 = n5 << 30 | n5 >>> 2;
            n15 = ++n;
        }
        int n21 = n = 0;
        while (n21 < 4) {
            int n22 = (n3 << 5 | n3 >>> 27) + this.cfr_renamed_3832(n2, n5, n6) + this.cfr_renamed_4[n8];
            n2 = n2 << 30 | n2 >>> 2;
            int n23 = ((n7 += n22 + -1894007588) << 5 | n7 >>> 27) + this.cfr_renamed_3832(n3, n2, n5) + this.cfr_renamed_4[++n8];
            n3 = n3 << 30 | n3 >>> 2;
            int n24 = ((n6 += n23 + -1894007588) << 5 | n6 >>> 27) + this.cfr_renamed_3832(n7, n3, n2) + this.cfr_renamed_4[++n8];
            n7 = n7 << 30 | n7 >>> 2;
            int n25 = ((n5 += n24 + -1894007588) << 5 | n5 >>> 27) + this.cfr_renamed_3832(n6, n7, n3) + this.cfr_renamed_4[++n8];
            n6 = n6 << 30 | n6 >>> 2;
            int n26 = ((n2 += n25 + -1894007588) << 5 | n2 >>> 27) + this.cfr_renamed_3832(n5, n6, n7) + this.cfr_renamed_4[++n8];
            ++n8;
            n3 += n26 + -1894007588;
            n5 = n5 << 30 | n5 >>> 2;
            n21 = ++n;
        }
        int n27 = n = 0;
        while (n27 <= 3) {
            int n28 = (n3 << 5 | n3 >>> 27) + this.cfr_renamed_3831(n2, n5, n6) + this.cfr_renamed_4[n8];
            n2 = n2 << 30 | n2 >>> 2;
            int n29 = ((n7 += n28 + -899497514) << 5 | n7 >>> 27) + this.cfr_renamed_3831(n3, n2, n5) + this.cfr_renamed_4[++n8];
            n3 = n3 << 30 | n3 >>> 2;
            int n30 = ((n6 += n29 + -899497514) << 5 | n6 >>> 27) + this.cfr_renamed_3831(n7, n3, n2) + this.cfr_renamed_4[++n8];
            n7 = n7 << 30 | n7 >>> 2;
            int n31 = ((n5 += n30 + -899497514) << 5 | n5 >>> 27) + this.cfr_renamed_3831(n6, n7, n3) + this.cfr_renamed_4[++n8];
            n6 = n6 << 30 | n6 >>> 2;
            int n32 = ((n2 += n31 + -899497514) << 5 | n2 >>> 27) + this.cfr_renamed_3831(n5, n6, n7) + this.cfr_renamed_4[++n8];
            ++n8;
            n3 += n32 + -899497514;
            n5 = n5 << 30 | n5 >>> 2;
            n27 = ++n;
        }
        sprlid sprlid4 = this;
        sprlid4.cfr_renamed_1 += n3;
        sprlid4.cfr_renamed_119 += n2;
        sprlid4.cfr_renamed_86 += n5;
        sprlid4.cfr_renamed_91 += n6;
        sprlid4.cfr_renamed_152 += n7;
        this.cfr_renamed_112 = 0;
        int n33 = n = 0;
        while (n33 < 16) {
            this.cfr_renamed_4[n++] = 0;
            n33 = n;
        }
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprlid sprlid2 = (sprlid)arg0;
        sprlid sprlid3 = this;
        super.cfr_renamed_3767(sprlid2);
        sprlid3.cfr_renamed_3829(sprlid2);
    }

    private /* synthetic */ int cfr_renamed_3832(int arg0, int arg1, int arg2) {
        return arg0 & arg1 | arg0 & arg2 | arg1 & arg2;
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        sprlid sprlid2 = this;
        sprlid sprlid3 = this;
        sprlid sprlid4 = this;
        super.cfr_renamed_41();
        sprlid4.cfr_renamed_1 = 1732584193;
        sprlid4.cfr_renamed_119 = -271733879;
        sprlid3.cfr_renamed_86 = -1732584194;
        sprlid3.cfr_renamed_91 = 271733878;
        sprlid2.cfr_renamed_152 = -1009589776;
        sprlid2.cfr_renamed_112 = 0;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            this.cfr_renamed_4[n++] = 0;
            n2 = n;
        }
    }

    @Override
    public int cfr_renamed_1218() {
        return 20;
    }

    @Override
    public byte[] cfr_renamed_2426() {
        int n;
        byte[] byArray = new byte[40 + this.cfr_renamed_112 * 4];
        sprlid sprlid2 = this;
        super.cfr_renamed_3793(byArray);
        sprtsa.cfr_renamed_442(sprlid2.cfr_renamed_1, byArray, 16);
        sprtsa.cfr_renamed_442(sprlid2.cfr_renamed_119, byArray, 20);
        sprtsa.cfr_renamed_442(sprlid2.cfr_renamed_86, byArray, 24);
        sprtsa.cfr_renamed_442(sprlid2.cfr_renamed_91, byArray, 28);
        sprtsa.cfr_renamed_442(sprlid2.cfr_renamed_152, byArray, 32);
        sprtsa.cfr_renamed_442(sprlid2.cfr_renamed_112, byArray, 36);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_112) {
            sprtsa.cfr_renamed_442(this.cfr_renamed_4[n], byArray, 40 + n++ * 4);
            n2 = n;
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprlid(sprlid sprlid2) {
        super((sprehd)arg0);
        void arg0;
        this.cfr_renamed_4 = new int[80];
        this.cfr_renamed_3829(sprlid2);
    }
}

