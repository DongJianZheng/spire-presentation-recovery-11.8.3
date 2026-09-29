/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.SaveToImageOption;
import com.spire.presentation.packages.spraze;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprwsga;

public class sprrhf {
    private int cfr_renamed_132;
    private byte[] cfr_renamed_102;
    private int cfr_renamed_93;
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private int cfr_renamed_0;
    private spraze cfr_renamed_1;
    public byte[] cfr_renamed_2;
    private sprgf cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprrhf(sprgf sprgf2, int n, int n2, byte[] byArray) {
        void arg2;
        void arg0;
        void arg1;
        sprrhf sprrhf2 = this;
        sprrhf sprrhf3 = this;
        sprrhf sprrhf4 = this;
        sprrhf4.cfr_renamed_0 = arg1;
        sprrhf4.cfr_renamed_3 = arg0;
        sprrhf3.cfr_renamed_1 = new spraze(this.cfr_renamed_3);
        sprrhf3.cfr_renamed_86 = this.cfr_renamed_3.cfr_renamed_1218();
        int n3 = (int)Math.ceil((double)(sprrhf3.cfr_renamed_86 << 3) / (double)arg1);
        int n4 = sprrhf3.cfr_renamed_1366((n3 << arg1) + 1);
        sprrhf3.cfr_renamed_4 = n3 + (int)Math.ceil((double)n4 / (double)arg1);
        sprrhf3.cfr_renamed_112 = 1 << arg1;
        sprrhf3.cfr_renamed_132 = (int)Math.ceil((double)(((1 << arg1) - 1) * this.cfr_renamed_4 + 1 + this.cfr_renamed_4) / (double)arg2);
        sprrhf3.cfr_renamed_102 = new byte[sprrhf3.cfr_renamed_86];
        sprrhf3.cfr_renamed_91 = new byte[sprrhf3.cfr_renamed_86];
        sprrhf3.cfr_renamed_2 = new byte[sprrhf3.cfr_renamed_86];
        sprrhf2.cfr_renamed_119 = new byte[sprrhf2.cfr_renamed_86 * this.cfr_renamed_4];
        sprrhf2.cfr_renamed_1422(byArray);
    }

    public byte[] cfr_renamed_1421() {
        return sproze.cfr_renamed_158(this.cfr_renamed_91);
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_1431() {
        var1_1 = new byte[this.cfr_renamed_3.cfr_renamed_1218()];
        v0 = var2_2 = 0;
        while (v0 < this.cfr_renamed_132 + 10000) {
            v1 = this;
            if (v1.cfr_renamed_93 == v1.cfr_renamed_4) {
                v2 = this;
                if (v2.cfr_renamed_152 == v2.cfr_renamed_112 - 1) {
                    v3 = this;
                    v3.cfr_renamed_3.cfr_renamed_1197(v3.cfr_renamed_119, 0, this.cfr_renamed_119.length);
                    v4 = this;
                    v4.cfr_renamed_91 = new byte[v4.cfr_renamed_3.cfr_renamed_1218()];
                    v4.cfr_renamed_3.cfr_renamed_1219(this.cfr_renamed_91, 0);
                    return;
                }
            }
            if (this.cfr_renamed_93 == 0) ** GOTO lbl-1000
            v5 = this;
            if (v5.cfr_renamed_152 == v5.cfr_renamed_112 - 1) lbl-1000:
            // 2 sources

            {
                v6 = this;
                v7 = this;
                ++v7.cfr_renamed_93;
                v6.cfr_renamed_152 = 0;
                v6.cfr_renamed_2 = v7.cfr_renamed_1.cfr_renamed_1370(this.cfr_renamed_102);
            } else {
                v8 = this;
                v8.cfr_renamed_3.cfr_renamed_1197(v8.cfr_renamed_2, 0, this.cfr_renamed_2.length);
                this.cfr_renamed_2 = var1_1;
                v9 = this;
                this.cfr_renamed_3.cfr_renamed_1219(this.cfr_renamed_2, 0);
                ++v9.cfr_renamed_152;
                if (v9.cfr_renamed_152 == this.cfr_renamed_112 - 1) {
                    v10 = this;
                    System.arraycopy(this.cfr_renamed_2, 0, v10.cfr_renamed_119, v10.cfr_renamed_86 * (this.cfr_renamed_93 - 1), this.cfr_renamed_86);
                }
            }
            v0 = ++var2_2;
        }
        throw new IllegalStateException(new StringBuilder().insert(0, sprwsga.cfr_renamed_9(":0.<#;o* ~:.+?;;\u0003;.8o7!~<**.<do")).append(this.cfr_renamed_132).append(" ").append(this.cfr_renamed_93).append(" ").append(this.cfr_renamed_152).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprrhf(sprgf sprgf2, byte[][] byArray, int[] nArray) {
        void arg0;
        void arg2;
        void arg1;
        sprrhf sprrhf2 = this;
        void v1 = arg1;
        sprrhf sprrhf3 = this;
        sprrhf sprrhf4 = this;
        sprrhf sprrhf5 = this;
        void v5 = arg2;
        sprrhf sprrhf6 = this;
        sprrhf6.cfr_renamed_93 = arg2[0];
        sprrhf6.cfr_renamed_152 = arg2[1];
        this.cfr_renamed_132 = v5[2];
        sprrhf5.cfr_renamed_0 = v5[3];
        sprrhf5.cfr_renamed_3 = arg0;
        sprrhf4.cfr_renamed_1 = new spraze(this.cfr_renamed_3);
        sprrhf4.cfr_renamed_86 = this.cfr_renamed_3.cfr_renamed_1218();
        int n = (int)Math.ceil((double)(sprrhf4.cfr_renamed_86 << 3) / (double)this.cfr_renamed_0);
        int n2 = sprrhf4.cfr_renamed_1366((n << this.cfr_renamed_0) + 1);
        sprrhf3.cfr_renamed_4 = n + (int)Math.ceil((double)n2 / (double)this.cfr_renamed_0);
        sprrhf3.cfr_renamed_112 = 1 << this.cfr_renamed_0;
        sprrhf3.cfr_renamed_2 = arg1[0];
        this.cfr_renamed_102 = v1[1];
        sprrhf2.cfr_renamed_119 = v1[2];
        sprrhf2.cfr_renamed_91 = byArray[3];
    }

    public byte[][] cfr_renamed_1382() {
        byte[][] byArrayArray;
        byte[][] byArrayArray2 = byArrayArray = new byte[4][];
        byArrayArray[0] = this.cfr_renamed_2;
        byArrayArray[1] = this.cfr_renamed_102;
        byArrayArray2[2] = this.cfr_renamed_119;
        byArrayArray[3] = this.cfr_renamed_91;
        return byArrayArray2;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_1422(byte[] byArray) {
        void arg0;
        this.cfr_renamed_93 = 0;
        this.cfr_renamed_152 = 0;
        byte[] byArray2 = new byte[this.cfr_renamed_86];
        System.arraycopy(arg0, 0, byArray2, 0, this.cfr_renamed_102.length);
        this.cfr_renamed_102 = this.cfr_renamed_1.cfr_renamed_1370(byArray2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprrhf(sprrhf sprrhf2) {
        void arg0;
        sprrhf sprrhf3 = this;
        void v1 = arg0;
        sprrhf sprrhf4 = this;
        void v3 = arg0;
        sprrhf sprrhf5 = this;
        void v5 = arg0;
        sprrhf sprrhf6 = this;
        void v7 = arg0;
        this.cfr_renamed_3 = arg0.cfr_renamed_3;
        this.cfr_renamed_86 = v7.cfr_renamed_86;
        sprrhf6.cfr_renamed_4 = v7.cfr_renamed_4;
        sprrhf6.cfr_renamed_1 = arg0.cfr_renamed_1;
        this.cfr_renamed_91 = sproze.cfr_renamed_158(v5.cfr_renamed_91);
        sprrhf5.cfr_renamed_119 = sproze.cfr_renamed_158(v5.cfr_renamed_119);
        sprrhf5.cfr_renamed_93 = arg0.cfr_renamed_93;
        this.cfr_renamed_152 = v3.cfr_renamed_152;
        sprrhf4.cfr_renamed_112 = v3.cfr_renamed_112;
        sprrhf4.cfr_renamed_0 = arg0.cfr_renamed_0;
        this.cfr_renamed_132 = v1.cfr_renamed_132;
        sprrhf3.cfr_renamed_102 = sproze.cfr_renamed_158(v1.cfr_renamed_102);
        sprrhf3.cfr_renamed_2 = sproze.cfr_renamed_158(sprrhf2.cfr_renamed_2);
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

    public sprrhf cfr_renamed_1427() {
        sprrhf sprrhf2 = new sprrhf(this);
        sprrhf2.cfr_renamed_1431();
        return sprrhf2;
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
        string = new StringBuilder().insert(0, string).append(" ").append(this.cfr_renamed_86).append(" ").append(this.cfr_renamed_4).append(" ").append(this.cfr_renamed_112).append(" ").toString();
        byte[][] byArray = this.cfr_renamed_1382();
        int n4 = n = 0;
        while (n4 < 4) {
            string = byArray[n] != null ? new StringBuilder().insert(0, string).append(new String(sprfqe.cfr_renamed_485(byArray[n]))).append(" ").toString() : new StringBuilder().insert(0, string).append(SaveToImageOption.cfr_renamed_9("g\u0012e\u000b)")).toString();
            n4 = ++n;
        }
        return string;
    }

    public int[] cfr_renamed_1381() {
        int[] nArray;
        int[] nArray2 = nArray = new int[4];
        nArray[0] = this.cfr_renamed_93;
        nArray[1] = this.cfr_renamed_152;
        nArray2[2] = this.cfr_renamed_132;
        nArray[3] = this.cfr_renamed_0;
        return nArray2;
    }

    public sprrhf(sprgf arg0, int arg1, int arg2) {
        sprrhf sprrhf2 = this;
        sprrhf sprrhf3 = this;
        sprrhf3.cfr_renamed_0 = arg1;
        sprrhf3.cfr_renamed_3 = arg0;
        sprrhf2.cfr_renamed_1 = new spraze(this.cfr_renamed_3);
        sprrhf2.cfr_renamed_86 = this.cfr_renamed_3.cfr_renamed_1218();
        int n = (int)Math.ceil((double)(sprrhf2.cfr_renamed_86 << 3) / (double)arg1);
        int n2 = sprrhf2.cfr_renamed_1366((n << arg1) + 1);
        sprrhf2.cfr_renamed_4 = n + (int)Math.ceil((double)n2 / (double)arg1);
        sprrhf2.cfr_renamed_112 = 1 << arg1;
        sprrhf2.cfr_renamed_132 = (int)Math.ceil((double)(((1 << arg1) - 1) * this.cfr_renamed_4 + 1 + this.cfr_renamed_4) / (double)arg2);
        sprrhf2.cfr_renamed_102 = new byte[sprrhf2.cfr_renamed_86];
        sprrhf2.cfr_renamed_91 = new byte[sprrhf2.cfr_renamed_86];
        sprrhf2.cfr_renamed_2 = new byte[sprrhf2.cfr_renamed_86];
        sprrhf2.cfr_renamed_119 = new byte[sprrhf2.cfr_renamed_86 * this.cfr_renamed_4];
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 2 << 1;
        int cfr_ignored_0 = 5 << 3 ^ 4;
        int n4 = n2;
        int n5 = 5 << 4 ^ 3;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }
}

