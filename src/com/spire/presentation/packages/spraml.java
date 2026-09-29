/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprekl;
import com.spire.presentation.packages.sprokk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpfm;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.spryy;
import java.util.ArrayList;

public class spraml
implements spryy {
    private sprekl cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private boolean cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private static final int cfr_renamed_3 = 4;
    private ArrayList<byte[]> cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_1579(byte[] arg0, int arg1, int arg2) throws sprull {
        int n;
        if (this.cfr_renamed_91) {
            throw new IllegalStateException(sprpfm.cfr_renamed_9("u3o|h9o|}3i|n2l.z,k5u;"));
        }
        if (arg2 % this.cfr_renamed_112.cfr_renamed_1195() != 0) {
            throw new sprddl(new StringBuilder().insert(0, sprokk.cfr_renamed_9("r\u0004p\u0018f\u001a'\u000ef\u001efJj\u001ft\u001e'\bbJfJj\u001fk\u001en\u001ak\u000f'\u0005aJ")).append(this.cfr_renamed_112.cfr_renamed_1195()).append(sprpfm.cfr_renamed_9(";>b(~/")).toString());
        }
        int n2 = 2 * arg2 / this.cfr_renamed_112.cfr_renamed_1195();
        int n3 = (n2 - 1) * 6;
        byte[] byArray = new byte[arg2];
        spraml spraml2 = this;
        System.arraycopy(arg0, arg1, byArray, 0, arg2);
        byte[] byArray2 = new byte[spraml2.cfr_renamed_112.cfr_renamed_1195() / 2];
        System.arraycopy(byArray, 0, byArray2, 0, this.cfr_renamed_112.cfr_renamed_1195() / 2);
        spraml2.cfr_renamed_4.clear();
        int n4 = byArray.length - this.cfr_renamed_112.cfr_renamed_1195() / 2;
        int n5 = this.cfr_renamed_112.cfr_renamed_1195() / 2;
        int n6 = n4;
        while (n6 != 0) {
            spraml spraml3 = this;
            byte[] byArray3 = new byte[spraml3.cfr_renamed_112.cfr_renamed_1195() / 2];
            System.arraycopy(byArray, n5, byArray3, 0, this.cfr_renamed_112.cfr_renamed_1195() / 2);
            spraml3.cfr_renamed_4.add(byArray3);
            n5 += this.cfr_renamed_112.cfr_renamed_1195() / 2;
            n6 = n4 -= this.cfr_renamed_112.cfr_renamed_1195() / 2;
        }
        int n7 = n = 0;
        while (n7 < n3) {
            int n8;
            System.arraycopy(this.cfr_renamed_4.get(n2 - 2), 0, byArray, 0, this.cfr_renamed_112.cfr_renamed_1195() / 2);
            System.arraycopy(byArray2, 0, byArray, this.cfr_renamed_112.cfr_renamed_1195() / 2, this.cfr_renamed_112.cfr_renamed_1195() / 2);
            spraml spraml4 = this;
            spraml4.cfr_renamed_10029(n3 - n, spraml4.cfr_renamed_1, 0);
            int n9 = n8 = 0;
            while (n9 < 4) {
                int n10 = n8 + this.cfr_renamed_112.cfr_renamed_1195() / 2;
                byte by = (byte)(byArray[n10] ^ this.cfr_renamed_1[n8]);
                byArray[n10] = by;
                n9 = ++n8;
            }
            this.cfr_renamed_112.cfr_renamed_3064(byArray, 0, byArray, 0);
            System.arraycopy(byArray, 0, byArray2, 0, this.cfr_renamed_112.cfr_renamed_1195() / 2);
            n8 = 2;
            int n11 = n8;
            while (n11 < n2) {
                System.arraycopy(this.cfr_renamed_4.get(n2 - n8 - 1), 0, this.cfr_renamed_4.get(n2 - ++n8), 0, this.cfr_renamed_112.cfr_renamed_1195() / 2);
                n11 = n8;
            }
            System.arraycopy(byArray, this.cfr_renamed_112.cfr_renamed_1195() / 2, this.cfr_renamed_4.get(0), 0, this.cfr_renamed_112.cfr_renamed_1195() / 2);
            n7 = ++n;
        }
        System.arraycopy(byArray2, 0, byArray, 0, this.cfr_renamed_112.cfr_renamed_1195() / 2);
        n5 = this.cfr_renamed_112.cfr_renamed_1195() / 2;
        int n12 = n = 0;
        while (n12 < n2 - 1) {
            System.arraycopy(this.cfr_renamed_4.get(n), 0, byArray, n5, this.cfr_renamed_112.cfr_renamed_1195() / 2);
            n5 += this.cfr_renamed_112.cfr_renamed_1195() / 2;
            n12 = ++n;
        }
        System.arraycopy(byArray, byArray.length - this.cfr_renamed_112.cfr_renamed_1195(), this.cfr_renamed_119, 0, this.cfr_renamed_112.cfr_renamed_1195());
        byte[] byArray4 = new byte[byArray.length - this.cfr_renamed_112.cfr_renamed_1195()];
        spraml spraml5 = this;
        if (!sproze.cfr_renamed_92(spraml5.cfr_renamed_119, spraml5.cfr_renamed_2)) {
            throw new sprull(sprokk.cfr_renamed_9("\to\u000fd\u0001t\u001fjJa\u000bn\u0006b\u000e"));
        }
        System.arraycopy(byArray, 0, byArray4, 0, byArray.length - this.cfr_renamed_112.cfr_renamed_1195());
        return byArray4;
    }

    /*
     * WARNING - void declaration
     */
    public spraml(int n) {
        void arg0;
        spraml spraml2 = this;
        spraml spraml3 = this;
        spraml3.cfr_renamed_112 = new sprekl((int)arg0);
        spraml3.cfr_renamed_0 = new byte[this.cfr_renamed_112.cfr_renamed_1195() / 2];
        spraml3.cfr_renamed_119 = new byte[spraml3.cfr_renamed_112.cfr_renamed_1195()];
        spraml2.cfr_renamed_2 = new byte[spraml3.cfr_renamed_112.cfr_renamed_1195()];
        spraml2.cfr_renamed_4 = new ArrayList();
        spraml2.cfr_renamed_1 = new byte[4];
    }

    @Override
    public String cfr_renamed_1315() {
        return sprpfm.cfr_renamed_9("_/o),j)hL.z,^2|5u9");
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (arg1 instanceof sprbgk) {
            arg1 = ((sprbgk)arg1).cfr_renamed_284();
        }
        this.cfr_renamed_91 = arg0;
        if (arg1 instanceof sprtpk) {
            this.cfr_renamed_112.cfr_renamed_5535(arg0, arg1);
            return;
        }
        throw new IllegalArgumentException(sprokk.cfr_renamed_9("\u0003i\u001cf\u0006n\u000e'\u001af\u0018f\u0007b\u001eb\u0018tJw\u000bt\u0019b\u000e'\u001ehJC\u0019s\u001f0\\5^P\u0018f\u001aB\u0004`\u0003i\u000f"));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_10029(int n, byte[] byArray, int n2) {
        void arg0;
        void arg2;
        void arg1;
        void v0 = arg1;
        void v1 = arg2;
        arg1[arg2 + 3] = (byte)(arg0 >> 24);
        arg1[v1 + 2] = (byte)(arg0 >> 16);
        v0[v1 + true] = (byte)(arg0 >> 8);
        v0[n2] = (byte)arg0;
    }

    @Override
    public byte[] cfr_renamed_1575(byte[] arg0, int arg1, int arg2) {
        int n;
        if (!this.cfr_renamed_91) {
            throw new IllegalStateException(sprpfm.cfr_renamed_9("u3o|h9o|}3i|l.z,k5u;"));
        }
        if (arg2 % this.cfr_renamed_112.cfr_renamed_1195() != 0) {
            throw new sprddl(new StringBuilder().insert(0, sprokk.cfr_renamed_9("p\u0018f\u001a'\u000ef\u001efJj\u001ft\u001e'\bbJfJj\u001fk\u001en\u001ak\u000f'\u0005aJ")).append(this.cfr_renamed_112.cfr_renamed_1195()).append(sprpfm.cfr_renamed_9(";>b(~/")).toString());
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprokk.cfr_renamed_9("n\u0004w\u001fsJe\u001fa\fb\u0018'\u001eh\u0005'\u0019o\u0005u\u001e"));
        }
        int n2 = 2 * (1 + arg2 / this.cfr_renamed_112.cfr_renamed_1195());
        int n3 = (n2 - 1) * 6;
        byte[] byArray = new byte[arg2 + this.cfr_renamed_112.cfr_renamed_1195()];
        System.arraycopy(arg0, arg1, byArray, 0, arg2);
        System.arraycopy(byArray, 0, this.cfr_renamed_0, 0, this.cfr_renamed_112.cfr_renamed_1195() / 2);
        this.cfr_renamed_4.clear();
        int n4 = byArray.length - this.cfr_renamed_112.cfr_renamed_1195() / 2;
        int n5 = this.cfr_renamed_112.cfr_renamed_1195() / 2;
        int n6 = n4;
        while (n6 != 0) {
            spraml spraml2 = this;
            byte[] byArray2 = new byte[spraml2.cfr_renamed_112.cfr_renamed_1195() / 2];
            System.arraycopy(byArray, n5, byArray2, 0, this.cfr_renamed_112.cfr_renamed_1195() / 2);
            spraml2.cfr_renamed_4.add(byArray2);
            n5 += this.cfr_renamed_112.cfr_renamed_1195() / 2;
            n6 = n4 -= this.cfr_renamed_112.cfr_renamed_1195() / 2;
        }
        int n7 = n = 0;
        while (n7 < n3) {
            spraml spraml3 = this;
            System.arraycopy(spraml3.cfr_renamed_0, 0, byArray, 0, this.cfr_renamed_112.cfr_renamed_1195() / 2);
            System.arraycopy(spraml3.cfr_renamed_4.get(0), 0, byArray, this.cfr_renamed_112.cfr_renamed_1195() / 2, this.cfr_renamed_112.cfr_renamed_1195() / 2);
            spraml3.cfr_renamed_112.cfr_renamed_3064(byArray, 0, byArray, 0);
            spraml spraml4 = this;
            spraml4.cfr_renamed_10029(n + 1, spraml4.cfr_renamed_1, 0);
            int n8 = 0;
            int n9 = n8;
            while (n9 < 4) {
                int n10 = n8 + this.cfr_renamed_112.cfr_renamed_1195() / 2;
                byte by = (byte)(byArray[n10] ^ this.cfr_renamed_1[n8]);
                byArray[n10] = by;
                n9 = ++n8;
            }
            System.arraycopy(byArray, this.cfr_renamed_112.cfr_renamed_1195() / 2, this.cfr_renamed_0, 0, this.cfr_renamed_112.cfr_renamed_1195() / 2);
            int n11 = n8 = 2;
            while (n11 < n2) {
                System.arraycopy(this.cfr_renamed_4.get(n8 - 1), 0, this.cfr_renamed_4.get(++n8 - 2), 0, this.cfr_renamed_112.cfr_renamed_1195() / 2);
                n11 = n8;
            }
            System.arraycopy(byArray, 0, this.cfr_renamed_4.get(n2 - 2), 0, this.cfr_renamed_112.cfr_renamed_1195() / 2);
            n7 = ++n;
        }
        spraml spraml5 = this;
        System.arraycopy(spraml5.cfr_renamed_0, 0, byArray, 0, this.cfr_renamed_112.cfr_renamed_1195() / 2);
        n5 = spraml5.cfr_renamed_112.cfr_renamed_1195() / 2;
        int n12 = n = 0;
        while (n12 < n2 - 1) {
            System.arraycopy(this.cfr_renamed_4.get(n), 0, byArray, n5, this.cfr_renamed_112.cfr_renamed_1195() / 2);
            n5 += this.cfr_renamed_112.cfr_renamed_1195() / 2;
            n12 = ++n;
        }
        return byArray;
    }
}

