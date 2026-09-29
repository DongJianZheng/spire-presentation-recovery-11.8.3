/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcjaa;
import com.spire.presentation.packages.sprgdp;
import com.spire.presentation.packages.sprnvz;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.spryjn;

@sprtea
public class sprwto {
    private static float[] cfr_renamed_93;
    private static float[] cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private int cfr_renamed_119;
    private static final int cfr_renamed_91 = 256;
    private static final int cfr_renamed_0 = 8;
    private int cfr_renamed_1;
    private float[] cfr_renamed_2;
    private float[][] cfr_renamed_3;
    private float[] cfr_renamed_4;

    @sprtea
    public static sprwto cfr_renamed_14150(sprgdp arg0) {
        float[][] fArrayArray;
        int n;
        int n2 = 1;
        int n3 = 3;
        if (arg0.cfr_renamed_12779() == null) {
            int n4;
            float[] fArray;
            float[] fArray2 = arg0.cfr_renamed_14163();
            if (fArray2 == null) {
                fArray2 = cfr_renamed_93;
            }
            if ((fArray = arg0.cfr_renamed_14164()) == null) {
                fArray = cfr_renamed_86;
            }
            n = fArray2.length + 1;
            fArrayArray = new float[n][];
            int n5 = n4 = 0;
            while (n5 < n) {
                fArrayArray[n4++] = new float[n2 + n3];
                n5 = n4;
            }
            fArrayArray[n - 1][0] = 1.0f;
            int n6 = n4 = 0;
            while (n6 < 3) {
                int n7 = n4 + 1;
                float f = sprwto.cfr_renamed_14165(arg0.cfr_renamed_12646(), n4);
                fArrayArray[n - 1][n7] = f;
                n6 = ++n4;
            }
            int n8 = n4 = 0;
            while (n8 < n - 1) {
                int n9;
                float f;
                float f2 = fArray2[n4];
                if (f <= 1.0f) {
                    fArrayArray[n4][0] = f2;
                }
                int n10 = n9 = 0;
                while (n10 < 3) {
                    sprgdp sprgdp2 = arg0;
                    float f3 = fArray[n4] * sprwto.cfr_renamed_14165(sprgdp2.cfr_renamed_12646(), n9);
                    float f4 = 1.0f - fArray[n4];
                    float f5 = sprwto.cfr_renamed_14165(sprgdp2.cfr_renamed_12645(), n9);
                    fArrayArray[n4][++n9] = f3 + f4 * f5;
                    n10 = n9;
                }
                n8 = ++n4;
            }
        } else {
            int n11;
            n = arg0.cfr_renamed_12779().length;
            fArrayArray = new float[n][];
            int n12 = n11 = 0;
            while (n12 < n) {
                fArrayArray[n11++] = new float[n2 + n3];
                n12 = n11;
            }
            int n13 = n11 = 0;
            while (n13 < n) {
                int n14;
                fArrayArray[n11][0] = arg0.cfr_renamed_12779()[n11].cfr_renamed_3274();
                int n15 = n14 = 0;
                while (n15 < 3) {
                    sprwbp sprwbp2 = arg0.cfr_renamed_12779()[n11].cfr_renamed_12553();
                    int n16 = n14 + 1;
                    float f = sprwto.cfr_renamed_14165(sprwbp2, n14);
                    fArrayArray[n11][n16] = f;
                    n15 = ++n14;
                }
                n13 = ++n11;
            }
        }
        return sprwto.cfr_renamed_14166(fArrayArray, n, n2, n3);
    }

    private static /* synthetic */ boolean cfr_renamed_14168(float[][] arg0, int arg1, int arg2, float[] arg3) {
        int n;
        boolean bl = false;
        int n2 = n = 0;
        while (n2 < arg2) {
            arg3[n++] = Float.POSITIVE_INFINITY;
            n2 = n;
        }
        int n3 = n = 1;
        while (n3 < arg1) {
            int n4;
            int n5 = n4 = 0;
            while (n5 < arg2) {
                float f = arg0[n][n4] - arg0[n - 1][n4];
                if (f != arg3[n4] && arg3[n4] != Float.POSITIVE_INFINITY) {
                    bl = true;
                }
                if (f < arg3[n4]) {
                    arg3[n4] = f;
                }
                n5 = ++n4;
            }
            n3 = ++n;
        }
        return bl;
    }

    static {
        float[] fArray = new float[2];
        fArray[0] = 0.0f;
        fArray[1] = 1.0f;
        cfr_renamed_93 = fArray;
        float[] fArray2 = new float[2];
        fArray2[0] = 0.0f;
        fArray2[1] = 1.0f;
        cfr_renamed_86 = fArray2;
    }

    @sprtea
    public void cfr_renamed_14157(spryjn arg0) {
        int n;
        if (this.cfr_renamed_1 != 8) {
            throw new UnsupportedOperationException(sprnvz.cfr_renamed_9("\u0001/\"8nyn#'5n1+3n2/,>-+a(4 \":(!/=a=4>1!3:$*a=.n'/3`"));
        }
        byte[][] byArrayArray = new byte[this.cfr_renamed_152][];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_152) {
            sprwto sprwto2 = this;
            byArrayArray[n++] = new byte[sprwto2.cfr_renamed_112 + sprwto2.cfr_renamed_119];
            n2 = n;
        }
        int n3 = n = 0;
        while (true) {
            int n4;
            double d;
            double d2;
            double d3;
            sprwto sprwto3 = this;
            if (n3 >= sprwto3.cfr_renamed_112 + sprwto3.cfr_renamed_119) break;
            if (n < this.cfr_renamed_112) {
                sprwto sprwto4 = this;
                d3 = sprwto4.cfr_renamed_2[n * 2];
                d2 = sprwto4.cfr_renamed_2[n * 2 + 1];
            } else {
                sprwto sprwto5 = this;
                d3 = sprwto5.cfr_renamed_4[(n - this.cfr_renamed_112) * 2];
                d2 = sprwto5.cfr_renamed_4[(n - this.cfr_renamed_112) * 2 + 1];
            }
            double d4 = d2 - d3 != 0.0 ? 255.0 / (d - d3) : 1.0;
            int n5 = n4 = 0;
            while (n5 < this.cfr_renamed_152) {
                double d5 = this.cfr_renamed_3[n4][n];
                byte[] byArray = byArrayArray[n4];
                byArray[n] = (byte)sprrgga.cfr_renamed_12793((d5 - d3) * d4);
                n5 = ++n4;
            }
            n3 = ++n;
        }
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_152) {
            int n7 = this.cfr_renamed_112;
            while (true) {
                int n8;
                sprwto sprwto6 = this;
                if (n7 >= sprwto6.cfr_renamed_112 + sprwto6.cfr_renamed_119) break;
                arg0.cfr_renamed_11594(byArrayArray[n][n8++]);
                n7 = n8;
            }
            n6 = ++n;
        }
    }

    @sprtea
    public int cfr_renamed_14156() {
        return this.cfr_renamed_1;
    }

    @sprtea
    public float[] cfr_renamed_14154() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public float[] cfr_renamed_14153() {
        return this.cfr_renamed_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ float cfr_renamed_14165(sprwbp arg0, int arg1) {
        switch (arg1) {
            case 0: {
                int n;
                int n2 = n = arg0.cfr_renamed_3353();
                return (float)((double)n2 / 255.0);
            }
            case 1: {
                int n;
                int n2 = n = arg0.cfr_renamed_1145();
                return (float)((double)n2 / 255.0);
            }
            case 2: {
                int n;
                int n2 = n = arg0.cfr_renamed_1997();
                return (float)((double)n2 / 255.0);
            }
        }
        throw new IllegalArgumentException();
    }

    private static /* synthetic */ sprwto cfr_renamed_14166(float[][] arg0, int arg1, int arg2, int arg3) {
        int n;
        int n2;
        int n3 = arg2 + arg3;
        float[] fArray = new float[n3];
        float[] fArray2 = new float[n3];
        int n4 = n2 = 0;
        while (n4 < n3) {
            int n5 = n2++;
            fArray[n5] = Float.POSITIVE_INFINITY;
            fArray2[n5] = Float.NEGATIVE_INFINITY;
            n4 = n2;
        }
        int n6 = n2 = 0;
        while (n6 < arg1) {
            int n7;
            int n8 = n7 = 0;
            while (n8 < n3) {
                if (fArray[n7] > arg0[n2][n7]) {
                    int n9 = n7;
                    fArray[n9] = arg0[n2][n9];
                }
                if (fArray2[n7] < arg0[n2][n7]) {
                    int n10 = n7;
                    fArray2[n10] = arg0[n2][n10];
                }
                n8 = ++n7;
            }
            n6 = ++n2;
        }
        float[] fArray3 = new float[arg2 * 2];
        float[] fArray4 = new float[arg3 * 2];
        int n11 = n = 0;
        while (n11 < n3) {
            if (n < arg2) {
                fArray3[n * 2] = fArray[n];
                fArray3[n * 2 + 1] = fArray2[n];
            } else {
                int n12 = n;
                fArray4[(n12 - arg2) * 2] = fArray[n];
                fArray4[(n12 - arg2) * 2 + 1] = fArray2[n];
            }
            n11 = ++n;
        }
        int[] nArray = new int[]{arg1};
        arg0 = sprwto.cfr_renamed_14167(arg0, fArray3, fArray4, nArray, arg2, arg3);
        arg1 = nArray[0];
        return new sprwto(arg2, arg3, arg1, arg0, fArray3, fArray4);
    }

    private static /* synthetic */ float[][] cfr_renamed_14167(float[][] arg0, float[] arg1, float[] arg2, int[] arg3, int arg4, int arg5) {
        if (arg4 != 1) {
            throw new UnsupportedOperationException(sprcjaa.cfr_renamed_9("l\fO\u001b\u0003\u0011V\u0012S\rQ\u0016\u0003\u0004V\f@\u0016J\rM\u0011\u0003\u0015J\u0016KBL\fFBJ\fS\u0017WBU\u0003Q\u000bB\u0000O\u0007\r"));
        }
        Object object = arg0;
        float[] fArray = new float[arg4];
        if (sprwto.cfr_renamed_14168(arg0, arg3[0], arg4, fArray)) {
            int n;
            int n2;
            fArray[0] = (arg1[1] - arg1[0]) / 256.0f;
            object = new float[256][];
            int n3 = n2 = 0;
            while (n3 < 256) {
                object[n2++] = new float[arg4 + arg5];
                n3 = n2;
            }
            n2 = -1;
            int n4 = 0;
            int n5 = n = 0;
            while (n5 < 256) {
                object[n][0] = (float)n * fArray[0];
                float f = arg0[n4][0];
                float f2 = n2 >= 0 ? arg0[n2][0] : 0.0f;
                int n6 = arg4;
                while (n6 < arg5 + arg4) {
                    float f3;
                    int n7;
                    float f4 = arg0[n4][n7];
                    float f5 = f3 = n2 >= 0 ? arg0[n2][n7] : 0.0f;
                    if (f - f2 != 0.0f) {
                        Object object2;
                        float f6 = f4 - f3;
                        float f7 = f - f2;
                        float f8 = object[n][0] - f2;
                        object[n][n7] = f6 / f7 * f8 + f3;
                        if (object2[n][n7] < arg2[(n7 - arg4) * 2]) {
                            int n8 = n7;
                            object[n][n8] = arg2[(n8 - arg4) * 2];
                        }
                        if (object[n][n7] > arg2[(n7 - arg4) * 2 + 1]) {
                            int n9 = n7;
                            object[n][n9] = arg2[(n9 - arg4) * 2 + 1];
                        }
                    } else {
                        object[n][n7] = f4;
                    }
                    n6 = ++n7;
                }
                if (object[n][0] >= arg0[n4][0]) {
                    ++n2;
                    ++n4;
                }
                n5 = ++n;
            }
            arg3[0] = 256;
        }
        return object;
    }

    public int cfr_renamed_14170() {
        return this.cfr_renamed_119;
    }

    @sprtea
    public int cfr_renamed_14155() {
        return this.cfr_renamed_152;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprwto(int n, int n2, int n3, float[][] fArray, float[] fArray2, float[] fArray3) {
        void arg4;
        void arg1;
        void arg0;
        void arg2;
        void arg3;
        sprwto sprwto2 = this;
        sprwto sprwto3 = this;
        sprwto sprwto4 = this;
        this.cfr_renamed_1 = 8;
        sprwto4.cfr_renamed_3 = arg3;
        sprwto4.cfr_renamed_152 = arg2;
        sprwto3.cfr_renamed_112 = arg0;
        sprwto3.cfr_renamed_119 = arg1;
        sprwto2.cfr_renamed_2 = arg4;
        sprwto2.cfr_renamed_4 = fArray3;
    }

    public int cfr_renamed_14169() {
        return this.cfr_renamed_112;
    }
}

