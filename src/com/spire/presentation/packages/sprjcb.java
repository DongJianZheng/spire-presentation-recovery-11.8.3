/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sprtar;
import com.spire.presentation.packages.spruab;
import com.spire.presentation.packages.spruhj;
import com.spire.presentation.packages.sprzra;

public class sprjcb {
    public byte[] cfr_renamed_132;
    private int cfr_renamed_102;
    private byte[] cfr_renamed_93;
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private spruab cfr_renamed_0;
    private sprlc cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_1431() {
        var1_1 = new byte[this.cfr_renamed_1.cfr_renamed_1218()];
        v0 = var2_2 = 0;
        while (v0 < this.cfr_renamed_91 + 10000) {
            v1 = this;
            if (v1.cfr_renamed_86 == v1.cfr_renamed_4) {
                v2 = this;
                if (v2.cfr_renamed_152 == v2.cfr_renamed_102 - 1) {
                    v3 = this;
                    v3.cfr_renamed_1.cfr_renamed_1197(v3.cfr_renamed_2, 0, this.cfr_renamed_2.length);
                    v4 = this;
                    v4.cfr_renamed_3 = new byte[v4.cfr_renamed_1.cfr_renamed_1218()];
                    v4.cfr_renamed_1.cfr_renamed_1219(this.cfr_renamed_3, 0);
                    return;
                }
            }
            if (this.cfr_renamed_86 == 0) ** GOTO lbl-1000
            v5 = this;
            if (v5.cfr_renamed_152 == v5.cfr_renamed_102 - 1) lbl-1000:
            // 2 sources

            {
                v6 = this;
                v7 = this;
                ++v7.cfr_renamed_86;
                v6.cfr_renamed_152 = 0;
                v6.cfr_renamed_132 = v7.cfr_renamed_0.cfr_renamed_1370(this.cfr_renamed_93);
            } else {
                v8 = this;
                v8.cfr_renamed_1.cfr_renamed_1197(v8.cfr_renamed_132, 0, this.cfr_renamed_132.length);
                this.cfr_renamed_132 = var1_1;
                v9 = this;
                this.cfr_renamed_1.cfr_renamed_1219(this.cfr_renamed_132, 0);
                ++v9.cfr_renamed_152;
                if (v9.cfr_renamed_152 == this.cfr_renamed_102 - 1) {
                    v10 = this;
                    System.arraycopy(this.cfr_renamed_132, 0, v10.cfr_renamed_2, v10.cfr_renamed_112 * (this.cfr_renamed_86 - 1), this.cfr_renamed_112);
                }
            }
            v0 = ++var2_2;
        }
        throw new IllegalStateException(new StringBuilder().insert(0, spruhj.cfr_renamed_9("/\b;\u00046\u0003z\u00125F/\u0016>\u0007.\u0003\u0016\u0003;\u0000z\u000f4F)\u0012?\u0016)\\z")).append(this.cfr_renamed_91).append(" ").append(this.cfr_renamed_86).append(" ").append(this.cfr_renamed_152).toString());
    }

    public String toString() {
        int n;
        int n2;
        String string = "";
        int n3 = n2 = 0;
        while (n3 < 4) {
            StringBuilder stringBuilder = new StringBuilder().insert(0, string).append(this.cfr_renamed_1381()[n2]);
            string = stringBuilder.append(" ").toString();
            n3 = ++n2;
        }
        string = new StringBuilder().insert(0, string).append(" ").append(this.cfr_renamed_112).append(" ").append(this.cfr_renamed_4).append(" ").append(this.cfr_renamed_102).append(" ").toString();
        byte[][] byArray = this.cfr_renamed_1382();
        int n4 = n = 0;
        while (n4 < 4) {
            string = byArray[n] != null ? new StringBuilder().insert(0, string).append(new String(sprmma.cfr_renamed_485(byArray[n]))).append(" ").toString() : new StringBuilder().insert(0, string).append(sprtar.cfr_renamed_9("aUcL/")).toString();
            n4 = ++n;
        }
        return string;
    }

    /*
     * WARNING - void declaration
     */
    public sprjcb(sprlc sprlc2, byte[][] byArray, int[] nArray) {
        void arg0;
        void arg2;
        void arg1;
        sprjcb sprjcb2 = this;
        void v1 = arg1;
        sprjcb sprjcb3 = this;
        sprjcb sprjcb4 = this;
        sprjcb sprjcb5 = this;
        void v5 = arg2;
        sprjcb sprjcb6 = this;
        sprjcb6.cfr_renamed_86 = arg2[0];
        sprjcb6.cfr_renamed_152 = arg2[1];
        this.cfr_renamed_91 = v5[2];
        sprjcb5.cfr_renamed_119 = v5[3];
        sprjcb5.cfr_renamed_1 = arg0;
        sprjcb4.cfr_renamed_0 = new spruab(this.cfr_renamed_1);
        sprjcb4.cfr_renamed_112 = this.cfr_renamed_1.cfr_renamed_1218();
        int n = (int)Math.ceil((double)(sprjcb4.cfr_renamed_112 << 3) / (double)this.cfr_renamed_119);
        int n2 = sprjcb4.cfr_renamed_1366((n << this.cfr_renamed_119) + 1);
        sprjcb3.cfr_renamed_4 = n + (int)Math.ceil((double)n2 / (double)this.cfr_renamed_119);
        sprjcb3.cfr_renamed_102 = 1 << this.cfr_renamed_119;
        sprjcb3.cfr_renamed_132 = arg1[0];
        this.cfr_renamed_93 = v1[1];
        sprjcb2.cfr_renamed_2 = v1[2];
        sprjcb2.cfr_renamed_3 = byArray[3];
    }

    public sprjcb cfr_renamed_1427() {
        sprjcb sprjcb2 = new sprjcb(this);
        sprjcb2.cfr_renamed_1431();
        return sprjcb2;
    }

    public byte[] cfr_renamed_1421() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjcb(sprjcb sprjcb2) {
        void arg0;
        sprjcb sprjcb3 = this;
        void v1 = arg0;
        sprjcb sprjcb4 = this;
        void v3 = arg0;
        sprjcb sprjcb5 = this;
        void v5 = arg0;
        sprjcb sprjcb6 = this;
        void v7 = arg0;
        this.cfr_renamed_1 = arg0.cfr_renamed_1;
        this.cfr_renamed_112 = v7.cfr_renamed_112;
        sprjcb6.cfr_renamed_4 = v7.cfr_renamed_4;
        sprjcb6.cfr_renamed_0 = arg0.cfr_renamed_0;
        this.cfr_renamed_3 = sprzra.cfr_renamed_158(v5.cfr_renamed_3);
        sprjcb5.cfr_renamed_2 = sprzra.cfr_renamed_158(v5.cfr_renamed_2);
        sprjcb5.cfr_renamed_86 = arg0.cfr_renamed_86;
        this.cfr_renamed_152 = v3.cfr_renamed_152;
        sprjcb4.cfr_renamed_102 = v3.cfr_renamed_102;
        sprjcb4.cfr_renamed_119 = arg0.cfr_renamed_119;
        this.cfr_renamed_91 = v1.cfr_renamed_91;
        sprjcb3.cfr_renamed_93 = sprzra.cfr_renamed_158(v1.cfr_renamed_93);
        sprjcb3.cfr_renamed_132 = sprzra.cfr_renamed_158(sprjcb2.cfr_renamed_132);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_1422(byte[] byArray) {
        void arg0;
        this.cfr_renamed_86 = 0;
        this.cfr_renamed_152 = 0;
        byte[] byArray2 = new byte[this.cfr_renamed_112];
        System.arraycopy(arg0, 0, byArray2, 0, this.cfr_renamed_93.length);
        this.cfr_renamed_93 = this.cfr_renamed_0.cfr_renamed_1370(byArray2);
    }

    /*
     * WARNING - void declaration
     */
    public sprjcb(sprlc sprlc2, int n, int n2, byte[] byArray) {
        void arg2;
        void arg0;
        void arg1;
        sprjcb sprjcb2 = this;
        sprjcb sprjcb3 = this;
        sprjcb sprjcb4 = this;
        sprjcb4.cfr_renamed_119 = arg1;
        sprjcb4.cfr_renamed_1 = arg0;
        sprjcb3.cfr_renamed_0 = new spruab(this.cfr_renamed_1);
        sprjcb3.cfr_renamed_112 = this.cfr_renamed_1.cfr_renamed_1218();
        int n3 = (int)Math.ceil((double)(sprjcb3.cfr_renamed_112 << 3) / (double)arg1);
        int n4 = sprjcb3.cfr_renamed_1366((n3 << arg1) + 1);
        sprjcb3.cfr_renamed_4 = n3 + (int)Math.ceil((double)n4 / (double)arg1);
        sprjcb3.cfr_renamed_102 = 1 << arg1;
        sprjcb3.cfr_renamed_91 = (int)Math.ceil((double)(((1 << arg1) - 1) * this.cfr_renamed_4 + 1 + this.cfr_renamed_4) / (double)arg2);
        sprjcb3.cfr_renamed_93 = new byte[sprjcb3.cfr_renamed_112];
        sprjcb3.cfr_renamed_3 = new byte[sprjcb3.cfr_renamed_112];
        sprjcb3.cfr_renamed_132 = new byte[sprjcb3.cfr_renamed_112];
        sprjcb2.cfr_renamed_2 = new byte[sprjcb2.cfr_renamed_112 * this.cfr_renamed_4];
        sprjcb2.cfr_renamed_1422(byArray);
    }

    public int[] cfr_renamed_1381() {
        int[] nArray;
        int[] nArray2 = nArray = new int[4];
        nArray[0] = this.cfr_renamed_86;
        nArray[1] = this.cfr_renamed_152;
        nArray2[2] = this.cfr_renamed_91;
        nArray[3] = this.cfr_renamed_119;
        return nArray2;
    }

    public sprjcb(sprlc arg0, int arg1, int arg2) {
        sprjcb sprjcb2 = this;
        sprjcb sprjcb3 = this;
        sprjcb3.cfr_renamed_119 = arg1;
        sprjcb3.cfr_renamed_1 = arg0;
        sprjcb2.cfr_renamed_0 = new spruab(this.cfr_renamed_1);
        sprjcb2.cfr_renamed_112 = this.cfr_renamed_1.cfr_renamed_1218();
        int n = (int)Math.ceil((double)(sprjcb2.cfr_renamed_112 << 3) / (double)arg1);
        int n2 = sprjcb2.cfr_renamed_1366((n << arg1) + 1);
        sprjcb2.cfr_renamed_4 = n + (int)Math.ceil((double)n2 / (double)arg1);
        sprjcb2.cfr_renamed_102 = 1 << arg1;
        sprjcb2.cfr_renamed_91 = (int)Math.ceil((double)(((1 << arg1) - 1) * this.cfr_renamed_4 + 1 + this.cfr_renamed_4) / (double)arg2);
        sprjcb2.cfr_renamed_93 = new byte[sprjcb2.cfr_renamed_112];
        sprjcb2.cfr_renamed_3 = new byte[sprjcb2.cfr_renamed_112];
        sprjcb2.cfr_renamed_132 = new byte[sprjcb2.cfr_renamed_112];
        sprjcb2.cfr_renamed_2 = new byte[sprjcb2.cfr_renamed_112 * this.cfr_renamed_4];
    }

    public byte[][] cfr_renamed_1382() {
        byte[][] byArrayArray;
        byte[][] byArrayArray2 = byArrayArray = new byte[4][];
        byArrayArray[0] = new byte[this.cfr_renamed_112];
        byArrayArray[1] = new byte[this.cfr_renamed_112];
        sprjcb sprjcb2 = this;
        byArrayArray[2] = new byte[sprjcb2.cfr_renamed_112 * sprjcb2.cfr_renamed_4];
        byArrayArray[3] = new byte[this.cfr_renamed_112];
        byArrayArray[0] = this.cfr_renamed_132;
        byArrayArray[1] = this.cfr_renamed_93;
        byArrayArray2[2] = this.cfr_renamed_2;
        byArrayArray[3] = this.cfr_renamed_3;
        return byArrayArray2;
    }

    private /* synthetic */ int cfr_renamed_1366(int arg0) {
        int n;
        int n2 = 1;
        int n3 = n = 2;
        while (n3 < arg0) {
            ++n2;
            n3 = n <<= 1;
        }
        return n2;
    }
}

