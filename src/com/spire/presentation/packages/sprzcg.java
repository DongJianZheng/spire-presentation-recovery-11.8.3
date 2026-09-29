/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdxf;
import com.spire.presentation.packages.spreuf;
import com.spire.presentation.packages.sprfzf;
import com.spire.presentation.packages.sprjyf;
import com.spire.presentation.packages.sprmdg;
import com.spire.presentation.packages.sprnvf;
import com.spire.presentation.packages.sprnyf;
import com.spire.presentation.packages.sprqwf;

public class sprzcg {
    public final int[] cfr_renamed_102;
    public final int[] cfr_renamed_93;
    public spreuf cfr_renamed_86;
    public final int cfr_renamed_152 = 4;
    public sprdxf cfr_renamed_112;
    public final long[] cfr_renamed_119;
    public final int[] cfr_renamed_91;
    public sprqwf cfr_renamed_0;
    public final int[] cfr_renamed_1;
    public sprjyf cfr_renamed_2;
    public sprfzf cfr_renamed_3;
    private short[] cfr_renamed_4;

    public void cfr_renamed_6904(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        int n;
        int n2;
        if (arg5 == 0) {
            return;
        }
        int n3 = n2 = sprzcg.cfr_renamed_6905(arg5);
        int n4 = n = 1;
        while (n4 < n2) {
            int n5 = n3 >> 1;
            int n6 = 0;
            int n7 = 0;
            int n8 = n6;
            while (n8 < n) {
                int n9;
                int n10 = arg3[arg4 + n + n6];
                int n11 = arg1 + n7 * arg2;
                int n12 = n11 + n5 * arg2;
                int n13 = n9 = 0;
                while (n13 < n5) {
                    int[] nArray = arg0;
                    int n14 = nArray[n11];
                    int n15 = this.cfr_renamed_6906(arg0[n12], n10, arg6, arg7);
                    arg0[n11] = this.cfr_renamed_6907(n14, n15, arg6);
                    nArray[n12] = this.cfr_renamed_6908(n14, n15, arg6);
                    n11 += arg2;
                    n12 += arg2;
                    n13 = ++n9;
                }
                n7 += n3;
                n8 = ++n6;
            }
            n3 = n5;
            n4 = n << 1;
        }
    }

    public void cfr_renamed_6909(sprmdg[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        int n;
        int n2 = sprzcg.cfr_renamed_6905(arg4);
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = arg1 + n;
            sprmdg sprmdg2 = this.cfr_renamed_2.cfr_renamed_6816(arg2[arg3 + n]);
            arg0[n4] = sprmdg2;
            n3 = ++n;
        }
    }

    public void cfr_renamed_6910(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10, int arg11, int arg12, int[] arg13, int arg14) {
        int n;
        int n2;
        int n3 = sprzcg.cfr_renamed_6905(arg12);
        int n4 = arg6 + 1;
        int n5 = arg14;
        int n6 = n5 + sprzcg.cfr_renamed_6905(arg12);
        int n7 = n6 + sprzcg.cfr_renamed_6905(arg12);
        int n8 = n7 + n3 * n4;
        sprnyf[] sprnyfArray = sprqwf.cfr_renamed_4;
        int n9 = 0;
        int n10 = n9;
        while (n10 < n4) {
            int n11;
            int n12 = sprnyfArray[n9].cfr_renamed_3;
            sprzcg sprzcg2 = this;
            int n13 = this.cfr_renamed_6911(n12);
            int n14 = sprzcg2.cfr_renamed_6912(n12, n13);
            int n15 = sprzcg2.cfr_renamed_6913(arg6, n12, n13, n14);
            sprzcg2.cfr_renamed_6914(arg13, n5, arg13, n6, arg12, sprnyfArray[n9].cfr_renamed_4, n12, n13);
            int n16 = n11 = 0;
            while (n16 < n3) {
                int n17 = n8 + n11;
                int n18 = this.cfr_renamed_6915(arg8[arg9 + n11], n12);
                arg13[n17] = n18;
                n16 = ++n11;
            }
            this.cfr_renamed_6916(arg13, n8, arg13, n5, arg12, n12, n13);
            n11 = 0;
            n2 = arg5;
            n = n7 + n9;
            int n19 = n11;
            while (n19 < n3) {
                arg13[n] = this.cfr_renamed_6917(arg4, n2, arg6, n12, n13, n14, n15);
                n2 += arg7;
                n += n4;
                n19 = ++n11;
            }
            this.cfr_renamed_6904(arg13, n7 + n9, n4, arg13, n5, arg12, n12, n13);
            n11 = 0;
            n = n7 + n9;
            int n20 = n11;
            while (n20 < n3) {
                sprzcg sprzcg3 = this;
                int n21 = sprzcg3.cfr_renamed_6906(sprzcg3.cfr_renamed_6906(arg13[n8 + n11], arg13[n], n12, n13), n14, n12, n13);
                arg13[n] = n21;
                n += n4;
                n20 = ++n11;
            }
            this.cfr_renamed_6918(arg13, n7 + ++n9, n4, arg13, n6, arg12, n12, n13);
            n10 = n9;
        }
        int n22 = n4;
        this.cfr_renamed_6919(arg13, n7, n22, n22, n3, sprnyfArray, 1, arg13, n8);
        n9 = 0;
        n = arg1;
        n2 = n7;
        int n23 = n9;
        while (n23 < n3) {
            this.cfr_renamed_6920(arg0, n, arg2, arg13, n2, n4, arg10, arg11);
            n += arg3;
            n2 += n4;
            n23 = ++n9;
        }
    }

    public void cfr_renamed_6916(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.cfr_renamed_6904(arg0, arg1, 1, arg2, arg3, arg4, arg5, arg6);
    }

    public int cfr_renamed_6921(byte[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5) {
        int n;
        int n2 = sprzcg.cfr_renamed_6905(arg5);
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = this.cfr_renamed_6922(arg2, arg3 + n);
            if (n4 < -arg4 || n4 > arg4) {
                return 0;
            }
            int n5 = arg1 + n;
            arg0[n5] = (byte)n4;
            n3 = ++n;
        }
        return 1;
    }

    public int cfr_renamed_6911(int arg0) {
        int n;
        int n2 = n = 2 - arg0;
        int n3 = n = n2 * (2 - arg0 * n2);
        int n4 = n = n3 * (2 - arg0 * n3);
        int n5 = n = n4 * (2 - arg0 * n4);
        n = n5 * (2 - arg0 * n5);
        return Integer.MAX_VALUE & -n;
    }

    public void cfr_renamed_6923(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8 = 1 << arg2;
        int n9 = n8 >> 1;
        sprzcg sprzcg2 = this;
        int n10 = sprzcg2.cfr_renamed_102[arg3];
        int n11 = sprzcg2.cfr_renamed_102[arg3 + 1];
        sprqwf cfr_ignored_0 = sprzcg2.cfr_renamed_0;
        sprnyf[] sprnyfArray = sprqwf.cfr_renamed_4;
        int n12 = arg1;
        int n13 = n12 + n9 * n11;
        int n14 = n13 + n9 * n11;
        int n15 = n14 + n8 * n10;
        int n16 = n15 + n8 * n10;
        int n17 = n16 + n8;
        int n18 = n17 + n8;
        System.arraycopy(arg0, arg1, arg0, n14, 2 * n8 * n10);
        int n19 = 0;
        int n20 = n19;
        while (n20 < n10) {
            n7 = sprnyfArray[n19].cfr_renamed_3;
            sprzcg sprzcg3 = this;
            n6 = sprzcg3.cfr_renamed_6911(n7);
            n5 = sprzcg3.cfr_renamed_6912(n7, n6);
            sprzcg3.cfr_renamed_6914(arg0, n16, arg0, n17, arg2, sprnyfArray[n19].cfr_renamed_4, n7, n6);
            n4 = 0;
            n3 = n14 + n19;
            int n21 = n4;
            while (n21 < n8) {
                arg0[n18 + ++n4] = arg0[n3];
                n3 += n10;
                n21 = n4;
            }
            if (arg4 == 0) {
                this.cfr_renamed_6916(arg0, n18, arg0, n16, arg2, n7, n6);
            }
            n4 = 0;
            n3 = n12 + n19;
            int n22 = n4;
            while (n22 < n9) {
                int[] nArray = arg0;
                n2 = nArray[n18 + (n4 << 1) + 0];
                n = arg0[n18 + (n4 << 1) + 1];
                sprzcg sprzcg4 = this;
                nArray[n3] = sprzcg4.cfr_renamed_6906(sprzcg4.cfr_renamed_6906(n2, n, n7, n6), n5, n7, n6);
                n3 += n11;
                n22 = ++n4;
            }
            if (arg4 != 0) {
                this.cfr_renamed_6918(arg0, n14 + n19, n10, arg0, n17, arg2, n7, n6);
            }
            n4 = 0;
            n3 = n15 + n19;
            int n23 = n4;
            while (n23 < n8) {
                arg0[n18 + ++n4] = arg0[n3];
                n3 += n10;
                n23 = n4;
            }
            if (arg4 == 0) {
                this.cfr_renamed_6916(arg0, n18, arg0, n16, arg2, n7, n6);
            }
            n4 = 0;
            n3 = n13 + n19;
            int n24 = n4;
            while (n24 < n9) {
                int[] nArray = arg0;
                n2 = nArray[n18 + (n4 << 1) + 0];
                n = arg0[n18 + (n4 << 1) + 1];
                sprzcg sprzcg5 = this;
                nArray[n3] = sprzcg5.cfr_renamed_6906(sprzcg5.cfr_renamed_6906(n2, n, n7, n6), n5, n7, n6);
                n3 += n11;
                n24 = ++n4;
            }
            if (arg4 != 0) {
                this.cfr_renamed_6918(arg0, n15 + n19, n10, arg0, n17, arg2, n7, n6);
            }
            if (arg5 == 0) {
                sprzcg sprzcg6 = this;
                sprzcg6.cfr_renamed_6918(arg0, n12 + n19, n11, arg0, n17, arg2 - 1, n7, n6);
                sprzcg6.cfr_renamed_6918(arg0, n13 + n19, n11, arg0, n17, arg2 - 1, n7, n6);
            }
            n20 = ++n19;
        }
        int n25 = n10;
        this.cfr_renamed_6919(arg0, n14, n25, n25, n8, sprnyfArray, 1, arg0, n16);
        int n26 = n10;
        this.cfr_renamed_6919(arg0, n15, n26, n26, n8, sprnyfArray, 1, arg0, n16);
        int n27 = n19 = n10;
        while (n27 < n11) {
            int n28;
            n7 = sprnyfArray[n19].cfr_renamed_3;
            sprzcg sprzcg7 = this;
            n6 = this.cfr_renamed_6911(n7);
            n5 = sprzcg7.cfr_renamed_6912(n7, n6);
            n4 = sprzcg7.cfr_renamed_6913(n10, n7, n6, n5);
            sprzcg7.cfr_renamed_6914(arg0, n16, arg0, n17, arg2, sprnyfArray[n19].cfr_renamed_4, n7, n6);
            n3 = 0;
            n2 = n14;
            int n29 = n3;
            while (n29 < n8) {
                arg0[n18 + ++n3] = this.cfr_renamed_6917(arg0, n2, n10, n7, n6, n5, n4);
                n2 += n10;
                n29 = n3;
            }
            this.cfr_renamed_6916(arg0, n18, arg0, n16, arg2, n7, n6);
            n3 = 0;
            n2 = n12 + n19;
            int n30 = n3;
            while (n30 < n9) {
                int[] nArray = arg0;
                n = nArray[n18 + (n3 << 1) + 0];
                n28 = arg0[n18 + (n3 << 1) + 1];
                sprzcg sprzcg8 = this;
                nArray[n2] = sprzcg8.cfr_renamed_6906(sprzcg8.cfr_renamed_6906(n, n28, n7, n6), n5, n7, n6);
                n2 += n11;
                n30 = ++n3;
            }
            n3 = 0;
            n2 = n15;
            int n31 = n3;
            while (n31 < n8) {
                arg0[n18 + ++n3] = this.cfr_renamed_6917(arg0, n2, n10, n7, n6, n5, n4);
                n2 += n10;
                n31 = n3;
            }
            this.cfr_renamed_6916(arg0, n18, arg0, n16, arg2, n7, n6);
            n3 = 0;
            n2 = n13 + n19;
            int n32 = n3;
            while (n32 < n9) {
                int[] nArray = arg0;
                n = nArray[n18 + (n3 << 1) + 0];
                n28 = arg0[n18 + (n3 << 1) + 1];
                sprzcg sprzcg9 = this;
                nArray[n2] = sprzcg9.cfr_renamed_6906(sprzcg9.cfr_renamed_6906(n, n28, n7, n6), n5, n7, n6);
                n2 += n11;
                n32 = ++n3;
            }
            if (arg5 == 0) {
                sprzcg sprzcg10 = this;
                sprzcg10.cfr_renamed_6918(arg0, n12 + n19, n11, arg0, n17, arg2 - 1, n7, n6);
                sprzcg10.cfr_renamed_6918(arg0, n13 + n19, n11, arg0, n17, arg2 - 1, n7, n6);
            }
            n27 = ++n19;
        }
    }

    public int cfr_renamed_6915(int arg0, int arg1) {
        int n;
        int n2 = n = arg0;
        n = n2 + (arg1 & -(n2 >>> 31));
        return n;
    }

    public void cfr_renamed_6924(int[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        int n;
        int n2 = sprzcg.cfr_renamed_6905(arg6);
        int n3 = arg1;
        int n4 = n3 + n2;
        sprnyf[] sprnyfArray = sprqwf.cfr_renamed_4;
        int n5 = sprqwf.cfr_renamed_4[0].cfr_renamed_3;
        int n6 = 0;
        int n7 = n6;
        while (n7 < n2) {
            arg0[n3 + n6] = this.cfr_renamed_6915(arg2[arg3 + n6], n5);
            int n8 = n4 + n6;
            int n9 = this.cfr_renamed_6915(arg4[arg5 + n6], n5);
            arg0[n8] = n9;
            n7 = ++n6;
        }
        if (arg7 == 0 && arg8 != 0) {
            int n10 = sprnyfArray[0].cfr_renamed_3;
            sprzcg sprzcg2 = this;
            sprzcg sprzcg3 = this;
            int n11 = sprzcg3.cfr_renamed_6911(n10);
            int n12 = n4 + n2;
            int n13 = n12 + n2;
            sprzcg3.cfr_renamed_6914(arg0, n12, arg0, n13, arg6, sprnyfArray[0].cfr_renamed_4, n10, n11);
            sprzcg2.cfr_renamed_6916(arg0, n3, arg0, n12, arg6, n10, n11);
            sprzcg2.cfr_renamed_6916(arg0, n4, arg0, n12, arg6, n10, n11);
            return;
        }
        int n14 = n = 0;
        while (n14 < arg7) {
            int n15;
            int n16;
            int n17 = n;
            if (n17 != 0) {
                n16 = 1;
                n15 = n;
            } else {
                n16 = 0;
                n15 = n;
            }
            this.cfr_renamed_6923(arg0, arg1, arg6 - n, n17, n16, n15 + 1 < arg7 || arg8 != 0 ? 1 : 0);
            n14 = ++n;
        }
    }

    public int cfr_renamed_6925(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, int arg8, int[] arg9, int arg10) {
        int n;
        int n2;
        int n3;
        if (arg8 == 0) {
            return 0;
        }
        int n4 = arg1;
        int n5 = arg3;
        int n6 = arg10;
        int n7 = n6 + arg8;
        int n8 = n7 + arg8;
        int n9 = n8 + arg8;
        int n10 = this.cfr_renamed_6911(arg4[arg5 + 0]);
        int n11 = this.cfr_renamed_6911(arg6[arg7 + 0]);
        System.arraycopy(arg4, arg5, arg9, n8, arg8);
        System.arraycopy(arg6, arg7, arg9, n9, arg8);
        arg0[n4 + 0] = 1;
        arg2[n5 + 0] = 0;
        int n12 = n3 = 1;
        while (n12 < arg8) {
            arg0[n4 + n3] = 0;
            int n13 = n5 + n3;
            arg2[n13] = 0;
            n12 = ++n3;
        }
        System.arraycopy(arg6, arg7, arg9, n6, arg8);
        System.arraycopy(arg4, arg5, arg9, n7, arg8);
        int n14 = n7 + 0;
        arg9[n14] = arg9[n14] - 1;
        int n15 = n2 = 62 * arg8 + 30;
        while (n15 >= 30) {
            int n16;
            int n17;
            int n18;
            n3 = -1;
            int n19 = -1;
            int n20 = 0;
            int n21 = 0;
            int n22 = 0;
            int n23 = 0;
            int n24 = n = arg8;
            while (true) {
                --n;
                if (n24 <= 0) break;
                n18 = arg9[n8 + n];
                n17 = arg9[n9 + n];
                int n25 = n20;
                n20 = n25 ^ (n25 ^ n18) & n3;
                int n26 = n21;
                n21 = n26 ^ (n26 ^ n18) & n19;
                int n27 = n22;
                n22 = n27 ^ (n27 ^ n17) & n3;
                int n28 = n23;
                n23 = n28 ^ (n28 ^ n17) & n19;
                n19 = n3;
                n3 &= ((n18 | n17) + Integer.MAX_VALUE >>> 31) - 1;
                n24 = n;
            }
            n21 |= n20 & n19;
            n23 |= n22 & n19;
            sprzcg sprzcg2 = this;
            long l = (this.cfr_renamed_6556(n20 &= ~n19) << 31) + sprzcg2.cfr_renamed_6556(n21);
            long l2 = (sprzcg2.cfr_renamed_6556(n22 &= ~n19) << 31) + this.cfr_renamed_6556(n23);
            int n29 = arg9[n8 + 0];
            int n30 = arg9[n9 + 0];
            long l3 = 1L;
            long l4 = 0L;
            long l5 = 0L;
            long l6 = 1L;
            int n31 = n16 = 0;
            while (n31 < 31) {
                long l7 = l2 - l;
                n18 = (int)((l7 ^ (l ^ l2) & (l ^ l7)) >>> 63);
                n17 = n29 >> n16 & 1;
                int n32 = n30 >> n16 & 1;
                int n33 = n17 & n32 & n18;
                int n34 = n17 & n32 & ~n18;
                int n35 = n33 | n17 ^ 1;
                n29 -= n30 & -n33;
                l -= l2 & -this.cfr_renamed_6556(n33);
                l3 -= l5 & -((long)n33);
                l4 -= l6 & -((long)n33);
                n30 -= n29 & -n34;
                l2 -= l & -this.cfr_renamed_6556(n34);
                l5 -= l3 & -((long)n34);
                l6 -= l4 & -((long)n34);
                int n36 = n29;
                n29 = n36 + (n36 & n35 - 1);
                long l8 = l3;
                l3 = l8 + (l8 & (long)n35 - 1L);
                long l9 = l4;
                l4 = l9 + (l9 & (long)n35 - 1L);
                long l10 = l;
                l = l10 ^ (l10 ^ l10 >> 1) & -this.cfr_renamed_6556(n35);
                int n37 = n30;
                n30 = n37 + (n37 & -n35);
                long l11 = l5;
                l5 = l11 + (l11 & -((long)n35));
                long l12 = l6;
                l6 = l12 + (l12 & -((long)n35));
                long l13 = l2;
                l2 = l13 ^ (l13 ^ l13 >> 1) & this.cfr_renamed_6556(n35) - 1L;
                n31 = ++n16;
            }
            sprzcg sprzcg3 = this;
            int n38 = sprzcg3.cfr_renamed_6926(arg9, n8, arg9, n9, arg8, l3, l4, l5, l6);
            long l14 = l3;
            l3 = l14 - (l14 + l14 & -((long)(n38 & 1)));
            long l15 = l4;
            l4 = l15 - (l15 + l15 & -((long)(n38 & 1)));
            long l16 = l5;
            l5 = l16 - (l16 + l16 & -((long)(n38 >>> 1)));
            long l17 = l6;
            l6 = l17 - (l17 + l17 & -((long)(n38 >>> 1)));
            sprzcg3.cfr_renamed_6927(arg0, n4, arg9, n6, arg6, arg7, arg8, n11, l3, l4, l5, l6);
            this.cfr_renamed_6927(arg2, n5, arg9, n7, arg4, arg5, arg8, n10, l3, l4, l5, l6);
            n15 = n2 -= 30;
        }
        int n39 = arg9[n8 + 0] ^ 1;
        int n40 = n = 1;
        while (n40 < arg8) {
            int n41 = n8 + n;
            n39 |= arg9[n41];
            n40 = ++n;
        }
        int n42 = n39;
        return 1 - ((n42 | -n42) >>> 31) & arg4[arg5 + 0] & arg6[arg7 + 0];
    }

    public int cfr_renamed_6928(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int[] arg5, int arg6) {
        int n;
        int n2;
        int n3 = 1 << arg0;
        int n4 = n3 >> 1;
        int n5 = sprqwf.cfr_renamed_4[0].cfr_renamed_3;
        sprzcg sprzcg2 = this;
        int n6 = sprzcg2.cfr_renamed_6911(n5);
        int n7 = sprzcg2.cfr_renamed_6912(n5, n6);
        int n8 = arg6;
        int n9 = n8 + n4;
        int n10 = n9 + n4;
        int n11 = n10 + n3;
        int n12 = n11 + n3;
        int n13 = n12 + n3;
        sprzcg2.cfr_renamed_6914(arg5, n12, arg5, n13, arg0, sprqwf.cfr_renamed_4[0].cfr_renamed_4, n5, n6);
        int n14 = 0;
        int n15 = n14;
        while (n15 < n4) {
            sprzcg sprzcg3 = this;
            arg5[n8 + n14] = sprzcg3.cfr_renamed_6915(sprzcg3.cfr_renamed_6922(arg5, n8 + n14), n5);
            int n16 = n9 + n14;
            sprzcg sprzcg4 = this;
            int n17 = sprzcg4.cfr_renamed_6915(sprzcg4.cfr_renamed_6922(arg5, n9 + n14), n5);
            arg5[n16] = n17;
            n15 = ++n14;
        }
        this.cfr_renamed_6916(arg5, n8, arg5, n12, arg0 - 1, n5, n6);
        this.cfr_renamed_6916(arg5, n9, arg5, n12, arg0 - 1, n5, n6);
        int n18 = n14 = 0;
        while (n18 < n3) {
            arg5[n10 + n14] = this.cfr_renamed_6915(arg1[arg2 + n14], n5);
            int n19 = n11 + n14;
            int n20 = this.cfr_renamed_6915(arg3[arg4 + n14], n5);
            arg5[n19] = n20;
            n18 = ++n14;
        }
        this.cfr_renamed_6916(arg5, n10, arg5, n12, arg0, n5, n6);
        this.cfr_renamed_6916(arg5, n11, arg5, n12, arg0, n5, n6);
        int n21 = n14 = 0;
        while (n21 < n3) {
            int[] nArray = arg5;
            n2 = arg5[n10 + n14 + 0];
            n = arg5[n10 + n14 + 1];
            int n22 = arg5[n11 + n14 + 0];
            int n23 = arg5[n11 + n14 + 1];
            int n24 = this.cfr_renamed_6906(arg5[n8 + (n14 >> 1)], n7, n5, n6);
            int n25 = this.cfr_renamed_6906(arg5[n9 + (n14 >> 1)], n7, n5, n6);
            nArray[n10 + n14 + 0] = this.cfr_renamed_6906(n23, n24, n5, n6);
            arg5[n10 + n14 + 1] = this.cfr_renamed_6906(n22, n24, n5, n6);
            arg5[n11 + n14 + 0] = this.cfr_renamed_6906(n, n25, n5, n6);
            int n26 = n11 + n14 + 1;
            nArray[n26] = this.cfr_renamed_6906(n2, n25, n5, n6);
            n21 = n14 += 2;
        }
        sprzcg sprzcg5 = this;
        this.cfr_renamed_6929(arg5, n10, arg5, n13, arg0, n5, n6);
        this.cfr_renamed_6929(arg5, n11, arg5, n13, arg0, n5, n6);
        n9 = n8 + n3;
        int n27 = n9 + n3;
        System.arraycopy(arg5, n10, arg5, n8, 2 * n3);
        int n28 = n27 + n3;
        int n29 = n28 + n3;
        int n30 = n29 + n3;
        int n31 = n30 + n3;
        sprzcg5.cfr_renamed_6914(arg5, n27, arg5, n28, arg0, sprqwf.cfr_renamed_4[0].cfr_renamed_4, n5, n6);
        sprzcg5.cfr_renamed_6916(arg5, n8, arg5, n27, arg0, n5, n6);
        sprzcg5.cfr_renamed_6916(arg5, n9, arg5, n27, arg0, n5, n6);
        int n32 = this.cfr_renamed_6915(arg1[arg2 + 0], n5);
        arg5[n31 + 0] = n32;
        arg5[n30 + 0] = n32;
        int n33 = n14 = 1;
        while (n33 < n3) {
            arg5[n30 + n14] = this.cfr_renamed_6915(arg1[arg2 + n14], n5);
            int n34 = n31 + n3 - n14;
            int n35 = this.cfr_renamed_6915(-arg1[arg2 + n14], n5);
            arg5[n34] = n35;
            n33 = ++n14;
        }
        this.cfr_renamed_6916(arg5, n30, arg5, n27, arg0, n5, n6);
        this.cfr_renamed_6916(arg5, n31, arg5, n27, arg0, n5, n6);
        int n36 = n14 = 0;
        while (n36 < n3) {
            n2 = this.cfr_renamed_6906(arg5[n31 + n14], n7, n5, n6);
            arg5[n28 + n14] = this.cfr_renamed_6906(n2, arg5[n8 + n14], n5, n6);
            int n37 = n29 + n14;
            int n38 = this.cfr_renamed_6906(n2, arg5[n30 + n14], n5, n6);
            arg5[n37] = n38;
            n36 = ++n14;
        }
        int n39 = this.cfr_renamed_6915(arg3[arg4 + 0], n5);
        arg5[n31 + 0] = n39;
        arg5[n30 + 0] = n39;
        int n40 = n14 = 1;
        while (n40 < n3) {
            arg5[n30 + n14] = this.cfr_renamed_6915(arg3[arg4 + n14], n5);
            int n41 = n31 + n3 - n14;
            int n42 = this.cfr_renamed_6915(-arg3[arg4 + n14], n5);
            arg5[n41] = n42;
            n40 = ++n14;
        }
        this.cfr_renamed_6916(arg5, n30, arg5, n27, arg0, n5, n6);
        this.cfr_renamed_6916(arg5, n31, arg5, n27, arg0, n5, n6);
        int n43 = n14 = 0;
        while (n43 < n3) {
            n2 = this.cfr_renamed_6906(arg5[n31 + n14], n7, n5, n6);
            arg5[n28 + n14] = this.cfr_renamed_6907(arg5[n28 + n14], this.cfr_renamed_6906(n2, arg5[n9 + n14], n5, n6), n5);
            arg5[n29 + ++n14] = this.cfr_renamed_6907(arg5[n29 + n14], this.cfr_renamed_6906(n2, arg5[n30 + n14], n5, n6), n5);
            n43 = n14;
        }
        this.cfr_renamed_6914(arg5, n27, arg5, n30, arg0, sprqwf.cfr_renamed_4[0].cfr_renamed_4, n5, n6);
        this.cfr_renamed_6929(arg5, n28, arg5, n30, arg0, n5, n6);
        this.cfr_renamed_6929(arg5, n29, arg5, n30, arg0, n5, n6);
        int n44 = n14 = 0;
        while (n44 < n3) {
            arg5[n27 + n14] = this.cfr_renamed_6930(arg5[n28 + n14], n5);
            arg5[n28 + ++n14] = this.cfr_renamed_6930(arg5[n29 + n14], n5);
            n44 = n14;
        }
        sprmdg[] sprmdgArray = new sprmdg[3 * n3];
        int n45 = 0 + n3;
        int n46 = n45 + n3;
        int n47 = n14 = 0;
        while (n47 < n3) {
            int n48 = n46 + n14;
            sprmdg sprmdg2 = this.cfr_renamed_2.cfr_renamed_6816(arg5[n28 + n14]);
            sprmdgArray[n48] = sprmdg2;
            n47 = ++n14;
        }
        this.cfr_renamed_86.cfr_renamed_6858(sprmdgArray, n46, arg0);
        System.arraycopy(sprmdgArray, n46, sprmdgArray, n45, n4);
        n46 = n45 + n4;
        int n49 = n14 = 0;
        while (n49 < n3) {
            int n50 = n46 + n14;
            sprmdg sprmdg3 = this.cfr_renamed_2.cfr_renamed_6816(arg5[n27 + n14]);
            sprmdgArray[n50] = sprmdg3;
            n49 = ++n14;
        }
        sprzcg sprzcg6 = this;
        sprzcg6.cfr_renamed_86.cfr_renamed_6858(sprmdgArray, n46, arg0);
        sprzcg6.cfr_renamed_86.cfr_renamed_6931(sprmdgArray, n46, sprmdgArray, n45, arg0);
        sprzcg6.cfr_renamed_86.cfr_renamed_6866(sprmdgArray, n46, arg0);
        int n51 = n14 = 0;
        while (n51 < n3) {
            int n52 = n27 + n14;
            sprzcg sprzcg7 = this;
            int n53 = sprzcg7.cfr_renamed_6915((int)sprzcg7.cfr_renamed_2.cfr_renamed_6830(sprmdgArray[n46 + n14]), n5);
            arg5[n52] = n53;
            n51 = ++n14;
        }
        n28 = n27 + n3;
        n29 = n28 + n3;
        n30 = n29 + n3;
        n31 = n30 + n3;
        this.cfr_renamed_6914(arg5, n28, arg5, n29, arg0, sprqwf.cfr_renamed_4[0].cfr_renamed_4, n5, n6);
        int n54 = n14 = 0;
        while (n54 < n3) {
            arg5[n30 + n14] = this.cfr_renamed_6915(arg1[arg2 + n14], n5);
            int n55 = n31 + n14;
            int n56 = this.cfr_renamed_6915(arg3[arg4 + n14], n5);
            arg5[n55] = n56;
            n54 = ++n14;
        }
        this.cfr_renamed_6916(arg5, n27, arg5, n28, arg0, n5, n6);
        this.cfr_renamed_6916(arg5, n30, arg5, n28, arg0, n5, n6);
        this.cfr_renamed_6916(arg5, n31, arg5, n28, arg0, n5, n6);
        int n57 = n14 = 0;
        while (n57 < n3) {
            n = this.cfr_renamed_6906(arg5[n27 + n14], n7, n5, n6);
            arg5[n8 + n14] = this.cfr_renamed_6908(arg5[n8 + n14], this.cfr_renamed_6906(n, arg5[n30 + n14], n5, n6), n5);
            arg5[n9 + ++n14] = this.cfr_renamed_6908(arg5[n9 + n14], this.cfr_renamed_6906(n, arg5[n31 + n14], n5, n6), n5);
            n57 = n14;
        }
        this.cfr_renamed_6929(arg5, n8, arg5, n29, arg0, n5, n6);
        this.cfr_renamed_6929(arg5, n9, arg5, n29, arg0, n5, n6);
        int n58 = n14 = 0;
        while (n58 < n3) {
            arg5[n8 + n14] = this.cfr_renamed_6930(arg5[n8 + n14], n5);
            arg5[n9 + ++n14] = this.cfr_renamed_6930(arg5[n9 + n14], n5);
            n58 = n14;
        }
        return 1;
    }

    public void cfr_renamed_6932(sprnvf arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        int n2 = sprzcg.cfr_renamed_6905(arg3);
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < n2) {
            int n5;
            block5: {
                block1: while (true) {
                    sprzcg sprzcg2 = this;
                    while (true) {
                        if ((n5 = sprzcg2.cfr_renamed_6933(arg0, arg3)) < -127) continue block1;
                        if (n5 > 127) {
                            sprzcg2 = this;
                            continue;
                        }
                        if (n != n2 - 1) break block1;
                        if ((n3 ^ n5 & 1) == 0) {
                            sprzcg2 = this;
                            continue;
                        }
                        break block5;
                        break;
                    }
                    break;
                }
                n3 ^= n5 & 1;
            }
            arg1[arg2 + n] = (byte)n5;
            n4 = ++n;
        }
    }

    public void cfr_renamed_6929(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.cfr_renamed_6918(arg0, arg1, 1, arg2, arg3, arg4, arg5, arg6);
    }

    public void cfr_renamed_6914(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int n;
        int n2;
        int n3;
        int n4 = sprzcg.cfr_renamed_6905(arg4);
        sprzcg sprzcg2 = this;
        int n5 = sprzcg2.cfr_renamed_6912(arg6, arg7);
        arg5 = sprzcg2.cfr_renamed_6906(arg5, n5, arg6, arg7);
        int n6 = n3 = arg4;
        while (n6 < 10) {
            int n7 = arg5;
            arg5 = this.cfr_renamed_6906(n7, n7, arg6, arg7);
            n6 = ++n3;
        }
        sprzcg sprzcg3 = this;
        int n8 = arg6;
        int n9 = sprzcg3.cfr_renamed_6934(n5, arg5, n8, arg7, this.cfr_renamed_6935(n8));
        n3 = 10 - arg4;
        int n10 = n2 = sprzcg3.cfr_renamed_6935(arg6);
        int n11 = n = 0;
        while (n11 < n4) {
            sprzcg sprzcg4 = this;
            short s = sprzcg4.cfr_renamed_4[n << n3];
            arg0[arg1 + s] = n10;
            arg2[arg3 + s] = n2;
            n10 = sprzcg4.cfr_renamed_6906(n10, arg5, arg6, arg7);
            n2 = sprzcg4.cfr_renamed_6906(n2, n9, arg6, arg7);
            n11 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_6919(int[] nArray, int n, int n2, int n3, int n4, sprnyf[] sprnyfArray, int n5, int[] nArray2, int n6) {
        void arg6;
        void arg3;
        void arg8;
        void arg7;
        void arg0;
        void arg4;
        void var11_11;
        void arg1;
        void arg2;
        int n7;
        void arg5;
        arg7[arg8 + false] = arg5[0].cfr_renamed_3;
        int n8 = n7 = 1;
        while (n8 < arg2) {
            void v1 = arg5;
            int n9 = v1[n7].cfr_renamed_3;
            int n10 = v1[n7].cfr_renamed_2;
            int n11 = this.cfr_renamed_6911(n9);
            int n12 = this.cfr_renamed_6912(n9, n11);
            int n13 = 0;
            var11_11 = arg1;
            int n14 = n13;
            while (n14 < arg4) {
                void var17_17 = arg0[var11_11 + n7];
                sprzcg sprzcg2 = this;
                int n15 = sprzcg2.cfr_renamed_6936((int[])arg0, (int)var11_11, n7, n9, n11, n12);
                int n16 = sprzcg2.cfr_renamed_6906(n10, this.cfr_renamed_6908((int)var17_17, n15, n9), n9, n11);
                sprzcg2.cfr_renamed_6937((int[])arg0, (int)var11_11, (int[])arg7, (int)arg8, n7, n16);
                var11_11 += arg3;
                n14 = ++n13;
            }
            void v4 = arg8 + n7;
            int n17 = this.cfr_renamed_6938((int[])arg7, (int)arg8, n7, n9);
            arg7[v4] = n17;
            n8 = ++n7;
        }
        if (arg6 != false) {
            n7 = 0;
            var11_11 = arg1;
            int n18 = n7;
            while (n18 < arg4) {
                this.cfr_renamed_6939((int[])arg0, (int)var11_11, (int[])arg7, (int)arg8, (int)arg2);
                var11_11 += arg3;
                n18 = ++n7;
            }
        }
    }

    public void cfr_renamed_6939(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        int n;
        int n2 = 0;
        int n3 = 0;
        int n4 = n = arg4;
        while (true) {
            --n;
            if (n4 <= 0) break;
            int n5 = arg0[arg1 + n];
            int n6 = arg2[arg3 + n] >>> 1 | n3 << 30;
            n3 = arg2[arg3 + n] & 1;
            int n7 = n6 - n5;
            n7 = -n7 >>> 31 | -(n7 >>> 31);
            int n8 = n2;
            n2 = n8 | n7 & (n8 & 1) - 1;
            n4 = n;
        }
        this.cfr_renamed_6940(arg0, arg1, arg2, arg3, arg4, n2 >>> 31);
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_6941(int n, byte[] byArray, int n2, byte[] byArray2, int n3, int[] nArray, int n4) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        void arg5;
        sprzcg sprzcg2 = this;
        int n5 = sprzcg2.cfr_renamed_102[n];
        sprnyf[] sprnyfArray = sprqwf.cfr_renamed_4;
        int n6 = n4;
        int n7 = n6 + n5;
        int n8 = n7 + n5;
        int n9 = n8 + n5;
        int n10 = n9 + n5;
        sprzcg sprzcg3 = this;
        sprqwf cfr_ignored_0 = sprzcg2.cfr_renamed_0;
        void v2 = arg5;
        void v3 = arg0;
        this.cfr_renamed_6924((int[])v2, n8, (byte[])arg1, (int)arg2, (byte[])arg3, (int)arg4, (int)v3, (int)v3, 0);
        int n11 = n5;
        sprzcg3.cfr_renamed_6919((int[])v2, n8, n11, n11, 2, sprnyfArray, 0, (int[])arg5, n10);
        void v5 = arg5;
        void v6 = arg5;
        if (sprzcg3.cfr_renamed_6925((int[])v5, n7, (int[])v5, n6, (int[])v6, n8, (int[])v6, n9, n5, (int[])arg5, n10) == 0) {
            return 0;
        }
        int n12 = 12289;
        if (this.cfr_renamed_6938((int[])arg5, n6, n5, n12) != 0 || this.cfr_renamed_6938((int[])arg5, n7, n5, n12) != 0) {
            return 0;
        }
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_6913(int n, int n2, int n3, int n4) {
        void arg1;
        void arg0;
        int n5 = n4;
        --arg0;
        int n6 = this.cfr_renamed_6935((int)arg1);
        int n7 = 0;
        while (1 << n7 <= arg0) {
            void arg2;
            if ((arg0 & 1 << n7) != 0) {
                n6 = this.cfr_renamed_6906(n6, n5, (int)arg1, (int)arg2);
            }
            int n8 = n5;
            ++n7;
            n5 = this.cfr_renamed_6906(n8, n8, (int)arg1, (int)arg2);
        }
        return n6;
    }

    public int cfr_renamed_6934(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int n;
        int n2 = arg2 - 2;
        int n3 = arg4;
        int n4 = n = 30;
        while (n4 >= 0) {
            sprzcg sprzcg2 = this;
            int n5 = n3;
            n3 = sprzcg2.cfr_renamed_6906(n5, n5, arg2, arg3);
            int n6 = sprzcg2.cfr_renamed_6906(n3, arg1, arg2, arg3);
            int n7 = n3;
            int n8 = -(n2 >>> n & 1);
            n3 = n7 ^ (n7 ^ n6) & n8;
            n4 = --n;
        }
        sprzcg sprzcg3 = this;
        n3 = sprzcg3.cfr_renamed_6906(n3, 1, arg2, arg3);
        return sprzcg3.cfr_renamed_6906(arg0, n3, arg2, arg3);
    }

    public void cfr_renamed_6918(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        int n;
        if (arg5 == 0) {
            return;
        }
        int n2 = sprzcg.cfr_renamed_6905(arg5);
        int n3 = 1;
        int n4 = n = n2;
        while (n4 > 1) {
            int n5 = n >> 1;
            int n6 = n3 << 1;
            int n7 = 0;
            int n8 = 0;
            int n9 = n7;
            while (n9 < n5) {
                int n10;
                int n11 = arg3[arg4 + n5 + n7];
                int n12 = arg1 + n8 * arg2;
                int n13 = n12 + n3 * arg2;
                int n14 = n10 = 0;
                while (n14 < n3) {
                    int[] nArray = arg0;
                    int[] nArray2 = arg0;
                    int n15 = nArray[n12];
                    int n16 = nArray2[n13];
                    nArray[n12] = this.cfr_renamed_6907(n15, n16, arg6);
                    sprzcg sprzcg2 = this;
                    nArray2[n13] = sprzcg2.cfr_renamed_6906(sprzcg2.cfr_renamed_6908(n15, n16, arg6), n11, arg6, arg7);
                    n12 += arg2;
                    n13 += arg2;
                    n14 = ++n10;
                }
                n8 += n6;
                n9 = ++n7;
            }
            n3 = n6;
            n4 = n >> 1;
        }
        int n17 = 1 << 31 - arg5;
        int n18 = 0;
        int n19 = arg1;
        int n20 = n18;
        while (n20 < n2) {
            arg0[n19] = this.cfr_renamed_6906(arg0[n19], n17, arg6, arg7);
            n19 += arg2;
            n20 = ++n18;
        }
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_6930(int n, int n2) {
        void arg1;
        void arg0;
        void v0 = arg0;
        return (int)(v0 - (n2 & (v0 - (arg1 + true >>> 1) >>> 31) - true));
    }

    public void cfr_renamed_6942(sprmdg[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        int n;
        int n2 = sprzcg.cfr_renamed_6905(arg6);
        if (arg4 == 0) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < n2) {
                int n5 = arg1 + n3;
                arg0[n5] = this.cfr_renamed_2.cfr_renamed_107;
                n4 = ++n3;
            }
            return;
        }
        int n6 = n = 0;
        while (n6 < n2) {
            int n7;
            int n8 = -(arg2[arg3 + arg4 - 1] >>> 30);
            int n9 = n8 >>> 1;
            int n10 = n8 & 1;
            sprmdg sprmdg2 = this.cfr_renamed_2.cfr_renamed_107;
            sprmdg sprmdg3 = this.cfr_renamed_2.cfr_renamed_91;
            int n11 = n7 = 0;
            while (n11 < arg4) {
                int n12 = (arg2[arg3 + n7] ^ n9) + n10;
                n10 = n12 >>> 31;
                n12 &= Integer.MAX_VALUE;
                n12 -= n12 << 1 & n8;
                sprzcg sprzcg2 = this;
                sprmdg2 = this.cfr_renamed_2.cfr_renamed_6826(sprmdg2, sprzcg2.cfr_renamed_2.cfr_renamed_6814(this.cfr_renamed_2.cfr_renamed_6816(n12), sprmdg3));
                sprmdg3 = sprzcg2.cfr_renamed_2.cfr_renamed_6814(sprmdg3, this.cfr_renamed_2.cfr_renamed_82);
                n11 = ++n7;
            }
            int n13 = arg1 + n;
            arg0[n13] = sprmdg2;
            arg3 += arg5;
            n6 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_6943(int[] nArray, int n, int n2, int n3, int n4, int n5) {
        int n6;
        int n7 = 1 << n2 - 1;
        int n8 = n6 = 0;
        while (n8 < n7) {
            void arg5;
            void arg4;
            void arg3;
            void arg1;
            void arg0;
            void v1 = arg0;
            void var9_9 = v1[arg1 + (n6 << 1) + false];
            void var10_10 = v1[arg1 + (n6 << 1) + true];
            void v2 = arg1 + n6;
            sprzcg sprzcg2 = this;
            v1[v2] = sprzcg2.cfr_renamed_6906(sprzcg2.cfr_renamed_6906((int)var9_9, (int)var10_10, (int)arg3, (int)arg4), (int)arg5, (int)arg3, (int)arg4);
            n8 = ++n6;
        }
    }

    public int cfr_renamed_6912(int arg0, int arg1) {
        sprzcg sprzcg2 = this;
        int n = sprzcg2.cfr_renamed_6935(arg0);
        n = sprzcg2.cfr_renamed_6907(n, n, arg0);
        n = sprzcg2.cfr_renamed_6906(n, n, arg0, arg1);
        n = sprzcg2.cfr_renamed_6906(n, n, arg0, arg1);
        n = sprzcg2.cfr_renamed_6906(n, n, arg0, arg1);
        n = sprzcg2.cfr_renamed_6906(n, n, arg0, arg1);
        int n2 = n = sprzcg2.cfr_renamed_6906(n, n, arg0, arg1);
        n = n2 + (arg0 & -(n2 & 1)) >>> 1;
        return n;
    }

    public void cfr_renamed_6944(int[] arg0, int arg1, int arg2, int arg3) {
        int n;
        int n2 = arg3;
        int n3 = -arg3 >>> 1;
        int n4 = n = 0;
        while (n4 < arg2) {
            int n5 = arg0[arg1 + n];
            n5 = (n5 ^ n3) + n2;
            arg0[arg1 + n] = n5 & Integer.MAX_VALUE;
            n2 = n5 >>> 31;
            n4 = ++n;
        }
    }

    public int cfr_renamed_6908(int arg0, int arg1, int arg2) {
        int n;
        int n2 = n = arg0 - arg1;
        n = n2 + (arg2 & -(n2 >>> 31));
        return n;
    }

    public long cfr_renamed_6945(sprnvf arg0) {
        byte[] byArray = new byte[8];
        arg0.cfr_renamed_6804(byArray, 0, byArray.length);
        return (long)byArray[0] & 0xFFL | ((long)byArray[1] & 0xFFL) << 8 | ((long)byArray[2] & 0xFFL) << 16 | ((long)byArray[3] & 0xFFL) << 24 | ((long)byArray[4] & 0xFFL) << 32 | ((long)byArray[5] & 0xFFL) << 40 | ((long)byArray[6] & 0xFFL) << 48 | ((long)byArray[7] & 0xFFL) << 56;
    }

    public int cfr_renamed_6946(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5, int[] arg6, int arg7) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12 = arg0 - arg5;
        int n13 = 1 << n12;
        int n14 = n13 >> 1;
        sprzcg sprzcg2 = this;
        int n15 = sprzcg2.cfr_renamed_102[arg5];
        int n16 = sprzcg2.cfr_renamed_102[arg5 + 1];
        int n17 = sprzcg2.cfr_renamed_93[arg5];
        sprqwf cfr_ignored_0 = sprzcg2.cfr_renamed_0;
        sprnyf[] sprnyfArray = sprqwf.cfr_renamed_4;
        int n18 = arg7;
        int n19 = n18 + n16 * n14;
        int n20 = n19 + n16 * n14;
        this.cfr_renamed_6924(arg6, n20, arg1, arg2, arg3, arg4, arg0, arg5, 1);
        int n21 = arg7;
        int n22 = n21 + n13 * n17;
        int n23 = n22 + n13 * n17;
        System.arraycopy(arg6, n20, arg6, n23, 2 * n13 * n15);
        n20 = n23;
        int n24 = n23 + n15 * n13;
        n23 = n24 + n15 * n13;
        System.arraycopy(arg6, n18, arg6, n23, 2 * n14 * n16);
        n18 = n23;
        n19 = n18 + n14 * n16;
        int n25 = 0;
        int n26 = n25;
        while (n26 < n17) {
            n11 = sprnyfArray[n25].cfr_renamed_3;
            sprzcg sprzcg3 = this;
            n10 = sprzcg3.cfr_renamed_6911(n11);
            n9 = sprzcg3.cfr_renamed_6912(n11, n10);
            n8 = sprzcg3.cfr_renamed_6913(n16, n11, n10, n9);
            n7 = 0;
            n6 = n18;
            n5 = n19;
            n4 = n21 + n25;
            n3 = n22 + n25;
            int n27 = n7;
            while (n27 < n14) {
                arg6[n4] = this.cfr_renamed_6917(arg6, n6, n16, n11, n10, n9, n8);
                arg6[n3] = this.cfr_renamed_6917(arg6, n5, n16, n11, n10, n9, n8);
                n6 += n16;
                n5 += n16;
                n4 += n17;
                n3 += n17;
                n27 = ++n7;
            }
            n26 = ++n25;
        }
        int n28 = n25 = 0;
        while (n28 < n17) {
            int n29;
            int n30;
            int n31;
            n11 = sprnyfArray[n25].cfr_renamed_3;
            n10 = this.cfr_renamed_6911(n11);
            n9 = this.cfr_renamed_6912(n11, n10);
            if (n25 == n15) {
                sprzcg sprzcg4 = this;
                int n32 = n15;
                sprzcg4.cfr_renamed_6919(arg6, n20, n32, n32, n13, sprnyfArray, 1, arg6, n23);
                int n33 = n15;
                sprzcg4.cfr_renamed_6919(arg6, n24, n33, n33, n13, sprnyfArray, 1, arg6, n23);
            }
            n8 = n23;
            n7 = n8 + n13;
            n6 = n7 + n13;
            n5 = n6 + n13;
            this.cfr_renamed_6914(arg6, n8, arg6, n7, n12, sprnyfArray[n25].cfr_renamed_4, n11, n10);
            if (n25 < n15) {
                n31 = 0;
                n2 = n20 + n25;
                n = n24 + n25;
                int n34 = n31;
                while (n34 < n13) {
                    arg6[n6 + n31] = arg6[n2];
                    arg6[n5 + ++n31] = arg6[n];
                    n2 += n15;
                    n += n15;
                    n34 = n31;
                }
                this.cfr_renamed_6918(arg6, n20 + n25, n15, arg6, n7, n12, n11, n10);
                this.cfr_renamed_6918(arg6, n24 + n25, n15, arg6, n7, n12, n11, n10);
                n30 = n5;
            } else {
                n29 = this.cfr_renamed_6913(n15, n11, n10, n9);
                n31 = 0;
                n2 = n20;
                n = n24;
                int n35 = n31;
                while (n35 < n13) {
                    arg6[n6 + n31] = this.cfr_renamed_6917(arg6, n2, n15, n11, n10, n9, n29);
                    arg6[n5 + ++n31] = this.cfr_renamed_6917(arg6, n, n15, n11, n10, n9, n29);
                    n2 += n15;
                    n += n15;
                    n35 = n31;
                }
                this.cfr_renamed_6916(arg6, n6, arg6, n8, n12, n11, n10);
                this.cfr_renamed_6916(arg6, n5, arg6, n8, n12, n11, n10);
                n30 = n5;
            }
            n4 = n30 + n13;
            n3 = n4 + n14;
            n31 = 0;
            n2 = n21 + n25;
            n = n22 + n25;
            int n36 = n31;
            while (n36 < n14) {
                arg6[n4 + n31] = arg6[n2];
                arg6[n3 + ++n31] = arg6[n];
                n2 += n17;
                n += n17;
                n36 = n31;
            }
            this.cfr_renamed_6916(arg6, n4, arg6, n8, n12 - 1, n11, n10);
            this.cfr_renamed_6916(arg6, n3, arg6, n8, n12 - 1, n11, n10);
            n31 = 0;
            n2 = n21 + n25;
            n = n22 + n25;
            int n37 = n31;
            while (n37 < n14) {
                int[] nArray = arg6;
                n29 = arg6[n6 + (n31 << 1) + 0];
                int n38 = arg6[n6 + (n31 << 1) + 1];
                int n39 = arg6[n5 + (n31 << 1) + 0];
                int n40 = arg6[n5 + (n31 << 1) + 1];
                int n41 = this.cfr_renamed_6906(arg6[n4 + n31], n9, n11, n10);
                int n42 = this.cfr_renamed_6906(arg6[n3 + n31], n9, n11, n10);
                nArray[n2 + 0] = this.cfr_renamed_6906(n40, n41, n11, n10);
                arg6[n2 + n17] = this.cfr_renamed_6906(n39, n41, n11, n10);
                arg6[n + 0] = this.cfr_renamed_6906(n38, n42, n11, n10);
                nArray[n + n17] = this.cfr_renamed_6906(n29, n42, n11, n10);
                n2 += n17 << 1;
                n += n17 << 1;
                n37 = ++n31;
            }
            this.cfr_renamed_6918(arg6, n21 + n25, n17, arg6, n7, n12, n11, n10);
            int n43 = n22 + n25;
            this.cfr_renamed_6918(arg6, n43, n17, arg6, n7, n12, n11, n10);
            n28 = ++n25;
        }
        int n44 = n17;
        this.cfr_renamed_6919(arg6, n21, n44, n44, n13, sprnyfArray, 1, arg6, n23);
        int n45 = n17;
        this.cfr_renamed_6919(arg6, n22, n45, n45, n13, sprnyfArray, 1, arg6, n23);
        sprmdg[] sprmdgArray = new sprmdg[n13];
        sprmdg[] sprmdgArray2 = new sprmdg[n13];
        sprmdg[] sprmdgArray3 = new sprmdg[n13];
        sprmdg[] sprmdgArray4 = new sprmdg[n13];
        sprmdg[] sprmdgArray5 = new sprmdg[n13 >> 1];
        int[] nArray = new int[n13];
        int n46 = n15 > 10 ? 10 : n15;
        sprzcg sprzcg5 = this;
        sprzcg sprzcg6 = this;
        this.cfr_renamed_6942(sprmdgArray3, 0, arg6, n20 + n15 - n46, n46, n15, n12);
        sprzcg6.cfr_renamed_6942(sprmdgArray4, 0, arg6, n24 + n15 - n46, n46, n15, n12);
        int n47 = 31 * (n15 - n46);
        int n48 = sprzcg6.cfr_renamed_1[arg5] - 6 * this.cfr_renamed_91[arg5];
        sprzcg sprzcg7 = this;
        int n49 = sprzcg5.cfr_renamed_1[arg5] + 6 * sprzcg7.cfr_renamed_91[arg5];
        sprzcg7.cfr_renamed_86.cfr_renamed_6858(sprmdgArray3, 0, n12);
        sprzcg5.cfr_renamed_86.cfr_renamed_6858(sprmdgArray4, 0, n12);
        sprzcg5.cfr_renamed_86.cfr_renamed_6947(sprmdgArray5, 0, sprmdgArray3, 0, sprmdgArray4, 0, n12);
        sprzcg5.cfr_renamed_86.cfr_renamed_6948(sprmdgArray3, 0, n12);
        sprzcg5.cfr_renamed_86.cfr_renamed_6948(sprmdgArray4, 0, n12);
        int n50 = n17;
        int n51 = 31 * n17;
        int n52 = n51 - n48;
        while (true) {
            int n53;
            sprmdg sprmdg2;
            sprzcg sprzcg8;
            n46 = n50 > 10 ? 10 : n50;
            n11 = 31 * (n50 - n46);
            sprzcg sprzcg9 = this;
            sprzcg sprzcg10 = this;
            sprzcg10.cfr_renamed_6942(sprmdgArray, 0, arg6, n21 + n50 - n46, n46, n17, n12);
            sprzcg10.cfr_renamed_6942(sprmdgArray2, 0, arg6, n22 + n50 - n46, n46, n17, n12);
            sprzcg9.cfr_renamed_86.cfr_renamed_6858(sprmdgArray, 0, n12);
            sprzcg9.cfr_renamed_86.cfr_renamed_6858(sprmdgArray2, 0, n12);
            sprzcg9.cfr_renamed_86.cfr_renamed_6863(sprmdgArray, 0, sprmdgArray3, 0, n12);
            sprzcg9.cfr_renamed_86.cfr_renamed_6863(sprmdgArray2, 0, sprmdgArray4, 0, n12);
            sprzcg9.cfr_renamed_86.cfr_renamed_6862(sprmdgArray2, 0, sprmdgArray, 0, n12);
            sprzcg9.cfr_renamed_86.cfr_renamed_6949(sprmdgArray2, 0, sprmdgArray5, 0, n12);
            sprzcg9.cfr_renamed_86.cfr_renamed_6866(sprmdgArray2, 0, n12);
            n10 = n52 - n11 + n47;
            if (n10 < 0) {
                n10 = -n10;
                sprzcg sprzcg11 = this;
                sprzcg8 = sprzcg11;
                sprmdg2 = sprzcg11.cfr_renamed_2.cfr_renamed_88;
            } else {
                sprzcg sprzcg12 = this;
                sprzcg8 = sprzcg12;
                sprmdg2 = sprzcg12.cfr_renamed_2.cfr_renamed_102;
            }
            sprmdg sprmdg3 = sprzcg8.cfr_renamed_2.cfr_renamed_91;
            int n54 = n10;
            while (n54 != 0) {
                if ((n10 & 1) != 0) {
                    sprmdg3 = this.cfr_renamed_2.cfr_renamed_6814(sprmdg3, sprmdg2);
                }
                sprmdg2 = this.cfr_renamed_2.cfr_renamed_6822(sprmdg2);
                n54 = n10 >>= 1;
            }
            int n55 = n25 = 0;
            while (n55 < n13) {
                sprzcg sprzcg13 = this;
                sprmdg sprmdg4 = sprzcg13.cfr_renamed_2.cfr_renamed_6814(sprmdgArray2[n25], sprmdg3);
                if (!sprzcg13.cfr_renamed_2.cfr_renamed_6828(this.cfr_renamed_2.cfr_renamed_272, sprmdg4) || !this.cfr_renamed_2.cfr_renamed_6828(sprmdg4, this.cfr_renamed_2.cfr_renamed_137)) {
                    return 0;
                }
                nArray[n25++] = (int)this.cfr_renamed_2.cfr_renamed_6830(sprmdg4);
                n55 = n25;
            }
            n7 = n52 / 31;
            n8 = n52 % 31;
            if (arg5 <= 4) {
                n53 = n52;
                sprzcg sprzcg14 = this;
                int n56 = n15;
                sprzcg14.cfr_renamed_6910(arg6, n21, n50, n17, arg6, n20, n56, n56, nArray, 0, n7, n8, n12, arg6, n23);
                int n57 = n15;
                sprzcg14.cfr_renamed_6910(arg6, n22, n50, n17, arg6, n24, n57, n57, nArray, 0, n7, n8, n12, arg6, n23);
            } else {
                int n58 = n15;
                this.cfr_renamed_6950(arg6, n21, n50, n17, arg6, n20, n58, n58, nArray, 0, n7, n8, n12);
                int n59 = n15;
                this.cfr_renamed_6950(arg6, n22, n50, n17, arg6, n24, n59, n59, nArray, 0, n7, n8, n12);
                n53 = n52;
            }
            n9 = n53 + n49 + 10;
            if (n9 < n51 && n50 * 31 >= (n51 = n9) + 31) {
                --n50;
            }
            if (n52 <= 0) break;
            if ((n52 -= 25) >= 0) continue;
            n52 = 0;
        }
        if (n50 < n15) {
            int n60 = n25 = 0;
            while (n60 < n13) {
                n10 = -(arg6[n21 + n50 - 1] >>> 30) >>> 1;
                int n61 = n11 = n50;
                while (n61 < n15) {
                    int n62 = n21 + n11;
                    arg6[n62] = n10;
                    n61 = ++n11;
                }
                n10 = -(arg6[n22 + n50 - 1] >>> 30) >>> 1;
                int n63 = n11 = n50;
                while (n63 < n15) {
                    int n64 = n22 + n11;
                    arg6[n64] = n10;
                    n63 = ++n11;
                }
                n21 += n17;
                n22 += n17;
                n60 = ++n25;
            }
        }
        n25 = 0;
        n2 = arg7;
        n = arg7;
        int n65 = n25;
        while (n65 < n13 << 1) {
            System.arraycopy(arg6, n, arg6, n2, n15);
            n2 += n15;
            n += n17;
            n65 = ++n25;
        }
        return 1;
    }

    public int cfr_renamed_6933(sprnvf arg0, int arg1) {
        int n;
        int n2 = 1 << 10 - arg1;
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < n2) {
            int n5;
            sprzcg sprzcg2 = this;
            long l = sprzcg2.cfr_renamed_6945(arg0);
            int n6 = (int)(l >>> 63);
            int n7 = (int)((l &= Long.MAX_VALUE) - this.cfr_renamed_119[0] >>> 63);
            int n8 = 0;
            l = sprzcg2.cfr_renamed_6945(arg0);
            l &= Long.MAX_VALUE;
            int n9 = n5 = 1;
            while (n9 < this.cfr_renamed_119.length) {
                int n10 = (int)(l - this.cfr_renamed_119[n5] >>> 63) ^ 1;
                n8 |= n5 & -(n10 & (n7 ^ 1));
                n7 |= n10;
                n9 = ++n5;
            }
            n8 = (n8 ^ -n6) + n6;
            n3 += n8;
            n4 = ++n;
        }
        return n3;
    }

    public void cfr_renamed_6951(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            int n4 = arg0[arg1 + n] - arg3[arg4 + n] - n2;
            n2 = n4 >>> 31;
            n3 = ++n;
        }
        int n5 = -arg5 >>> 1;
        int n6 = -(arg5 | 1 - n2);
        n2 = arg5;
        int n7 = n = 0;
        while (n7 < arg2) {
            int n8 = arg0[arg1 + n];
            int n9 = (arg3[arg4 + n] ^ n5) & n6;
            n8 = n8 - n9 - n2;
            arg0[arg1 + n] = n8 & Integer.MAX_VALUE;
            n2 = n8 >>> 31;
            n7 = ++n;
        }
    }

    public void cfr_renamed_6937(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg4) {
            int n4 = arg0[arg1 + n];
            long l = this.cfr_renamed_6556(arg2[arg3 + n]) * this.cfr_renamed_6556(arg5) + this.cfr_renamed_6556(n4) + this.cfr_renamed_6556(n2);
            arg0[arg1 + n] = (int)l & Integer.MAX_VALUE;
            n2 = (int)(l >>> 31);
            n3 = ++n;
        }
        arg0[arg1 + arg4] = n2;
    }

    private /* synthetic */ long cfr_renamed_6556(int arg0) {
        return (long)arg0 & 0xFFFFFFFFL;
    }

    public int cfr_renamed_6922(int[] arg0, int arg1) {
        int n = arg0[arg1 + 0];
        n |= (n & 0x40000000) << 1;
        return n;
    }

    public int cfr_renamed_6906(int arg0, int arg1, int arg2, int arg3) {
        int n;
        long l = this.cfr_renamed_6556(arg0) * this.cfr_renamed_6556(arg1);
        long l2 = (l * (long)arg3 & this.cfr_renamed_6556(Integer.MAX_VALUE)) * (long)arg2;
        int n2 = n = (int)(l + l2 >>> 31) - arg2;
        n = n2 + (arg2 & -(n2 >>> 31));
        return n;
    }

    public sprzcg() {
        short[] sArray = new short[1024];
        sArray[0] = 0;
        sArray[1] = 512;
        sArray[2] = 256;
        sArray[3] = 768;
        sArray[4] = 128;
        sArray[5] = 640;
        sArray[6] = 384;
        sArray[7] = 896;
        sArray[8] = 64;
        sArray[9] = 576;
        sArray[10] = 320;
        sArray[11] = 832;
        sArray[12] = 192;
        sArray[13] = 704;
        sArray[14] = 448;
        sArray[15] = 960;
        sArray[16] = 32;
        sArray[17] = 544;
        sArray[18] = 288;
        sArray[19] = 800;
        sArray[20] = 160;
        sArray[21] = 672;
        sArray[22] = 416;
        sArray[23] = 928;
        sArray[24] = 96;
        sArray[25] = 608;
        sArray[26] = 352;
        sArray[27] = 864;
        sArray[28] = 224;
        sArray[29] = 736;
        sArray[30] = 480;
        sArray[31] = 992;
        sArray[32] = 16;
        sArray[33] = 528;
        sArray[34] = 272;
        sArray[35] = 784;
        sArray[36] = 144;
        sArray[37] = 656;
        sArray[38] = 400;
        sArray[39] = 912;
        sArray[40] = 80;
        sArray[41] = 592;
        sArray[42] = 336;
        sArray[43] = 848;
        sArray[44] = 208;
        sArray[45] = 720;
        sArray[46] = 464;
        sArray[47] = 976;
        sArray[48] = 48;
        sArray[49] = 560;
        sArray[50] = 304;
        sArray[51] = 816;
        sArray[52] = 176;
        sArray[53] = 688;
        sArray[54] = 432;
        sArray[55] = 944;
        sArray[56] = 112;
        sArray[57] = 624;
        sArray[58] = 368;
        sArray[59] = 880;
        sArray[60] = 240;
        sArray[61] = 752;
        sArray[62] = 496;
        sArray[63] = 1008;
        sArray[64] = 8;
        sArray[65] = 520;
        sArray[66] = 264;
        sArray[67] = 776;
        sArray[68] = 136;
        sArray[69] = 648;
        sArray[70] = 392;
        sArray[71] = 904;
        sArray[72] = 72;
        sArray[73] = 584;
        sArray[74] = 328;
        sArray[75] = 840;
        sArray[76] = 200;
        sArray[77] = 712;
        sArray[78] = 456;
        sArray[79] = 968;
        sArray[80] = 40;
        sArray[81] = 552;
        sArray[82] = 296;
        sArray[83] = 808;
        sArray[84] = 168;
        sArray[85] = 680;
        sArray[86] = 424;
        sArray[87] = 936;
        sArray[88] = 104;
        sArray[89] = 616;
        sArray[90] = 360;
        sArray[91] = 872;
        sArray[92] = 232;
        sArray[93] = 744;
        sArray[94] = 488;
        sArray[95] = 1000;
        sArray[96] = 24;
        sArray[97] = 536;
        sArray[98] = 280;
        sArray[99] = 792;
        sArray[100] = 152;
        sArray[101] = 664;
        sArray[102] = 408;
        sArray[103] = 920;
        sArray[104] = 88;
        sArray[105] = 600;
        sArray[106] = 344;
        sArray[107] = 856;
        sArray[108] = 216;
        sArray[109] = 728;
        sArray[110] = 472;
        sArray[111] = 984;
        sArray[112] = 56;
        sArray[113] = 568;
        sArray[114] = 312;
        sArray[115] = 824;
        sArray[116] = 184;
        sArray[117] = 696;
        sArray[118] = 440;
        sArray[119] = 952;
        sArray[120] = 120;
        sArray[121] = 632;
        sArray[122] = 376;
        sArray[123] = 888;
        sArray[124] = 248;
        sArray[125] = 760;
        sArray[126] = 504;
        sArray[127] = 1016;
        sArray[128] = 4;
        sArray[129] = 516;
        sArray[130] = 260;
        sArray[131] = 772;
        sArray[132] = 132;
        sArray[133] = 644;
        sArray[134] = 388;
        sArray[135] = 900;
        sArray[136] = 68;
        sArray[137] = 580;
        sArray[138] = 324;
        sArray[139] = 836;
        sArray[140] = 196;
        sArray[141] = 708;
        sArray[142] = 452;
        sArray[143] = 964;
        sArray[144] = 36;
        sArray[145] = 548;
        sArray[146] = 292;
        sArray[147] = 804;
        sArray[148] = 164;
        sArray[149] = 676;
        sArray[150] = 420;
        sArray[151] = 932;
        sArray[152] = 100;
        sArray[153] = 612;
        sArray[154] = 356;
        sArray[155] = 868;
        sArray[156] = 228;
        sArray[157] = 740;
        sArray[158] = 484;
        sArray[159] = 996;
        sArray[160] = 20;
        sArray[161] = 532;
        sArray[162] = 276;
        sArray[163] = 788;
        sArray[164] = 148;
        sArray[165] = 660;
        sArray[166] = 404;
        sArray[167] = 916;
        sArray[168] = 84;
        sArray[169] = 596;
        sArray[170] = 340;
        sArray[171] = 852;
        sArray[172] = 212;
        sArray[173] = 724;
        sArray[174] = 468;
        sArray[175] = 980;
        sArray[176] = 52;
        sArray[177] = 564;
        sArray[178] = 308;
        sArray[179] = 820;
        sArray[180] = 180;
        sArray[181] = 692;
        sArray[182] = 436;
        sArray[183] = 948;
        sArray[184] = 116;
        sArray[185] = 628;
        sArray[186] = 372;
        sArray[187] = 884;
        sArray[188] = 244;
        sArray[189] = 756;
        sArray[190] = 500;
        sArray[191] = 1012;
        sArray[192] = 12;
        sArray[193] = 524;
        sArray[194] = 268;
        sArray[195] = 780;
        sArray[196] = 140;
        sArray[197] = 652;
        sArray[198] = 396;
        sArray[199] = 908;
        sArray[200] = 76;
        sArray[201] = 588;
        sArray[202] = 332;
        sArray[203] = 844;
        sArray[204] = 204;
        sArray[205] = 716;
        sArray[206] = 460;
        sArray[207] = 972;
        sArray[208] = 44;
        sArray[209] = 556;
        sArray[210] = 300;
        sArray[211] = 812;
        sArray[212] = 172;
        sArray[213] = 684;
        sArray[214] = 428;
        sArray[215] = 940;
        sArray[216] = 108;
        sArray[217] = 620;
        sArray[218] = 364;
        sArray[219] = 876;
        sArray[220] = 236;
        sArray[221] = 748;
        sArray[222] = 492;
        sArray[223] = 1004;
        sArray[224] = 28;
        sArray[225] = 540;
        sArray[226] = 284;
        sArray[227] = 796;
        sArray[228] = 156;
        sArray[229] = 668;
        sArray[230] = 412;
        sArray[231] = 924;
        sArray[232] = 92;
        sArray[233] = 604;
        sArray[234] = 348;
        sArray[235] = 860;
        sArray[236] = 220;
        sArray[237] = 732;
        sArray[238] = 476;
        sArray[239] = 988;
        sArray[240] = 60;
        sArray[241] = 572;
        sArray[242] = 316;
        sArray[243] = 828;
        sArray[244] = 188;
        sArray[245] = 700;
        sArray[246] = 444;
        sArray[247] = 956;
        sArray[248] = 124;
        sArray[249] = 636;
        sArray[250] = 380;
        sArray[251] = 892;
        sArray[252] = 252;
        sArray[253] = 764;
        sArray[254] = 508;
        sArray[255] = 1020;
        sArray[256] = 2;
        sArray[257] = 514;
        sArray[258] = 258;
        sArray[259] = 770;
        sArray[260] = 130;
        sArray[261] = 642;
        sArray[262] = 386;
        sArray[263] = 898;
        sArray[264] = 66;
        sArray[265] = 578;
        sArray[266] = 322;
        sArray[267] = 834;
        sArray[268] = 194;
        sArray[269] = 706;
        sArray[270] = 450;
        sArray[271] = 962;
        sArray[272] = 34;
        sArray[273] = 546;
        sArray[274] = 290;
        sArray[275] = 802;
        sArray[276] = 162;
        sArray[277] = 674;
        sArray[278] = 418;
        sArray[279] = 930;
        sArray[280] = 98;
        sArray[281] = 610;
        sArray[282] = 354;
        sArray[283] = 866;
        sArray[284] = 226;
        sArray[285] = 738;
        sArray[286] = 482;
        sArray[287] = 994;
        sArray[288] = 18;
        sArray[289] = 530;
        sArray[290] = 274;
        sArray[291] = 786;
        sArray[292] = 146;
        sArray[293] = 658;
        sArray[294] = 402;
        sArray[295] = 914;
        sArray[296] = 82;
        sArray[297] = 594;
        sArray[298] = 338;
        sArray[299] = 850;
        sArray[300] = 210;
        sArray[301] = 722;
        sArray[302] = 466;
        sArray[303] = 978;
        sArray[304] = 50;
        sArray[305] = 562;
        sArray[306] = 306;
        sArray[307] = 818;
        sArray[308] = 178;
        sArray[309] = 690;
        sArray[310] = 434;
        sArray[311] = 946;
        sArray[312] = 114;
        sArray[313] = 626;
        sArray[314] = 370;
        sArray[315] = 882;
        sArray[316] = 242;
        sArray[317] = 754;
        sArray[318] = 498;
        sArray[319] = 1010;
        sArray[320] = 10;
        sArray[321] = 522;
        sArray[322] = 266;
        sArray[323] = 778;
        sArray[324] = 138;
        sArray[325] = 650;
        sArray[326] = 394;
        sArray[327] = 906;
        sArray[328] = 74;
        sArray[329] = 586;
        sArray[330] = 330;
        sArray[331] = 842;
        sArray[332] = 202;
        sArray[333] = 714;
        sArray[334] = 458;
        sArray[335] = 970;
        sArray[336] = 42;
        sArray[337] = 554;
        sArray[338] = 298;
        sArray[339] = 810;
        sArray[340] = 170;
        sArray[341] = 682;
        sArray[342] = 426;
        sArray[343] = 938;
        sArray[344] = 106;
        sArray[345] = 618;
        sArray[346] = 362;
        sArray[347] = 874;
        sArray[348] = 234;
        sArray[349] = 746;
        sArray[350] = 490;
        sArray[351] = 1002;
        sArray[352] = 26;
        sArray[353] = 538;
        sArray[354] = 282;
        sArray[355] = 794;
        sArray[356] = 154;
        sArray[357] = 666;
        sArray[358] = 410;
        sArray[359] = 922;
        sArray[360] = 90;
        sArray[361] = 602;
        sArray[362] = 346;
        sArray[363] = 858;
        sArray[364] = 218;
        sArray[365] = 730;
        sArray[366] = 474;
        sArray[367] = 986;
        sArray[368] = 58;
        sArray[369] = 570;
        sArray[370] = 314;
        sArray[371] = 826;
        sArray[372] = 186;
        sArray[373] = 698;
        sArray[374] = 442;
        sArray[375] = 954;
        sArray[376] = 122;
        sArray[377] = 634;
        sArray[378] = 378;
        sArray[379] = 890;
        sArray[380] = 250;
        sArray[381] = 762;
        sArray[382] = 506;
        sArray[383] = 1018;
        sArray[384] = 6;
        sArray[385] = 518;
        sArray[386] = 262;
        sArray[387] = 774;
        sArray[388] = 134;
        sArray[389] = 646;
        sArray[390] = 390;
        sArray[391] = 902;
        sArray[392] = 70;
        sArray[393] = 582;
        sArray[394] = 326;
        sArray[395] = 838;
        sArray[396] = 198;
        sArray[397] = 710;
        sArray[398] = 454;
        sArray[399] = 966;
        sArray[400] = 38;
        sArray[401] = 550;
        sArray[402] = 294;
        sArray[403] = 806;
        sArray[404] = 166;
        sArray[405] = 678;
        sArray[406] = 422;
        sArray[407] = 934;
        sArray[408] = 102;
        sArray[409] = 614;
        sArray[410] = 358;
        sArray[411] = 870;
        sArray[412] = 230;
        sArray[413] = 742;
        sArray[414] = 486;
        sArray[415] = 998;
        sArray[416] = 22;
        sArray[417] = 534;
        sArray[418] = 278;
        sArray[419] = 790;
        sArray[420] = 150;
        sArray[421] = 662;
        sArray[422] = 406;
        sArray[423] = 918;
        sArray[424] = 86;
        sArray[425] = 598;
        sArray[426] = 342;
        sArray[427] = 854;
        sArray[428] = 214;
        sArray[429] = 726;
        sArray[430] = 470;
        sArray[431] = 982;
        sArray[432] = 54;
        sArray[433] = 566;
        sArray[434] = 310;
        sArray[435] = 822;
        sArray[436] = 182;
        sArray[437] = 694;
        sArray[438] = 438;
        sArray[439] = 950;
        sArray[440] = 118;
        sArray[441] = 630;
        sArray[442] = 374;
        sArray[443] = 886;
        sArray[444] = 246;
        sArray[445] = 758;
        sArray[446] = 502;
        sArray[447] = 1014;
        sArray[448] = 14;
        sArray[449] = 526;
        sArray[450] = 270;
        sArray[451] = 782;
        sArray[452] = 142;
        sArray[453] = 654;
        sArray[454] = 398;
        sArray[455] = 910;
        sArray[456] = 78;
        sArray[457] = 590;
        sArray[458] = 334;
        sArray[459] = 846;
        sArray[460] = 206;
        sArray[461] = 718;
        sArray[462] = 462;
        sArray[463] = 974;
        sArray[464] = 46;
        sArray[465] = 558;
        sArray[466] = 302;
        sArray[467] = 814;
        sArray[468] = 174;
        sArray[469] = 686;
        sArray[470] = 430;
        sArray[471] = 942;
        sArray[472] = 110;
        sArray[473] = 622;
        sArray[474] = 366;
        sArray[475] = 878;
        sArray[476] = 238;
        sArray[477] = 750;
        sArray[478] = 494;
        sArray[479] = 1006;
        sArray[480] = 30;
        sArray[481] = 542;
        sArray[482] = 286;
        sArray[483] = 798;
        sArray[484] = 158;
        sArray[485] = 670;
        sArray[486] = 414;
        sArray[487] = 926;
        sArray[488] = 94;
        sArray[489] = 606;
        sArray[490] = 350;
        sArray[491] = 862;
        sArray[492] = 222;
        sArray[493] = 734;
        sArray[494] = 478;
        sArray[495] = 990;
        sArray[496] = 62;
        sArray[497] = 574;
        sArray[498] = 318;
        sArray[499] = 830;
        sArray[500] = 190;
        sArray[501] = 702;
        sArray[502] = 446;
        sArray[503] = 958;
        sArray[504] = 126;
        sArray[505] = 638;
        sArray[506] = 382;
        sArray[507] = 894;
        sArray[508] = 254;
        sArray[509] = 766;
        sArray[510] = 510;
        sArray[511] = 1022;
        sArray[512] = 1;
        sArray[513] = 513;
        sArray[514] = 257;
        sArray[515] = 769;
        sArray[516] = 129;
        sArray[517] = 641;
        sArray[518] = 385;
        sArray[519] = 897;
        sArray[520] = 65;
        sArray[521] = 577;
        sArray[522] = 321;
        sArray[523] = 833;
        sArray[524] = 193;
        sArray[525] = 705;
        sArray[526] = 449;
        sArray[527] = 961;
        sArray[528] = 33;
        sArray[529] = 545;
        sArray[530] = 289;
        sArray[531] = 801;
        sArray[532] = 161;
        sArray[533] = 673;
        sArray[534] = 417;
        sArray[535] = 929;
        sArray[536] = 97;
        sArray[537] = 609;
        sArray[538] = 353;
        sArray[539] = 865;
        sArray[540] = 225;
        sArray[541] = 737;
        sArray[542] = 481;
        sArray[543] = 993;
        sArray[544] = 17;
        sArray[545] = 529;
        sArray[546] = 273;
        sArray[547] = 785;
        sArray[548] = 145;
        sArray[549] = 657;
        sArray[550] = 401;
        sArray[551] = 913;
        sArray[552] = 81;
        sArray[553] = 593;
        sArray[554] = 337;
        sArray[555] = 849;
        sArray[556] = 209;
        sArray[557] = 721;
        sArray[558] = 465;
        sArray[559] = 977;
        sArray[560] = 49;
        sArray[561] = 561;
        sArray[562] = 305;
        sArray[563] = 817;
        sArray[564] = 177;
        sArray[565] = 689;
        sArray[566] = 433;
        sArray[567] = 945;
        sArray[568] = 113;
        sArray[569] = 625;
        sArray[570] = 369;
        sArray[571] = 881;
        sArray[572] = 241;
        sArray[573] = 753;
        sArray[574] = 497;
        sArray[575] = 1009;
        sArray[576] = 9;
        sArray[577] = 521;
        sArray[578] = 265;
        sArray[579] = 777;
        sArray[580] = 137;
        sArray[581] = 649;
        sArray[582] = 393;
        sArray[583] = 905;
        sArray[584] = 73;
        sArray[585] = 585;
        sArray[586] = 329;
        sArray[587] = 841;
        sArray[588] = 201;
        sArray[589] = 713;
        sArray[590] = 457;
        sArray[591] = 969;
        sArray[592] = 41;
        sArray[593] = 553;
        sArray[594] = 297;
        sArray[595] = 809;
        sArray[596] = 169;
        sArray[597] = 681;
        sArray[598] = 425;
        sArray[599] = 937;
        sArray[600] = 105;
        sArray[601] = 617;
        sArray[602] = 361;
        sArray[603] = 873;
        sArray[604] = 233;
        sArray[605] = 745;
        sArray[606] = 489;
        sArray[607] = 1001;
        sArray[608] = 25;
        sArray[609] = 537;
        sArray[610] = 281;
        sArray[611] = 793;
        sArray[612] = 153;
        sArray[613] = 665;
        sArray[614] = 409;
        sArray[615] = 921;
        sArray[616] = 89;
        sArray[617] = 601;
        sArray[618] = 345;
        sArray[619] = 857;
        sArray[620] = 217;
        sArray[621] = 729;
        sArray[622] = 473;
        sArray[623] = 985;
        sArray[624] = 57;
        sArray[625] = 569;
        sArray[626] = 313;
        sArray[627] = 825;
        sArray[628] = 185;
        sArray[629] = 697;
        sArray[630] = 441;
        sArray[631] = 953;
        sArray[632] = 121;
        sArray[633] = 633;
        sArray[634] = 377;
        sArray[635] = 889;
        sArray[636] = 249;
        sArray[637] = 761;
        sArray[638] = 505;
        sArray[639] = 1017;
        sArray[640] = 5;
        sArray[641] = 517;
        sArray[642] = 261;
        sArray[643] = 773;
        sArray[644] = 133;
        sArray[645] = 645;
        sArray[646] = 389;
        sArray[647] = 901;
        sArray[648] = 69;
        sArray[649] = 581;
        sArray[650] = 325;
        sArray[651] = 837;
        sArray[652] = 197;
        sArray[653] = 709;
        sArray[654] = 453;
        sArray[655] = 965;
        sArray[656] = 37;
        sArray[657] = 549;
        sArray[658] = 293;
        sArray[659] = 805;
        sArray[660] = 165;
        sArray[661] = 677;
        sArray[662] = 421;
        sArray[663] = 933;
        sArray[664] = 101;
        sArray[665] = 613;
        sArray[666] = 357;
        sArray[667] = 869;
        sArray[668] = 229;
        sArray[669] = 741;
        sArray[670] = 485;
        sArray[671] = 997;
        sArray[672] = 21;
        sArray[673] = 533;
        sArray[674] = 277;
        sArray[675] = 789;
        sArray[676] = 149;
        sArray[677] = 661;
        sArray[678] = 405;
        sArray[679] = 917;
        sArray[680] = 85;
        sArray[681] = 597;
        sArray[682] = 341;
        sArray[683] = 853;
        sArray[684] = 213;
        sArray[685] = 725;
        sArray[686] = 469;
        sArray[687] = 981;
        sArray[688] = 53;
        sArray[689] = 565;
        sArray[690] = 309;
        sArray[691] = 821;
        sArray[692] = 181;
        sArray[693] = 693;
        sArray[694] = 437;
        sArray[695] = 949;
        sArray[696] = 117;
        sArray[697] = 629;
        sArray[698] = 373;
        sArray[699] = 885;
        sArray[700] = 245;
        sArray[701] = 757;
        sArray[702] = 501;
        sArray[703] = 1013;
        sArray[704] = 13;
        sArray[705] = 525;
        sArray[706] = 269;
        sArray[707] = 781;
        sArray[708] = 141;
        sArray[709] = 653;
        sArray[710] = 397;
        sArray[711] = 909;
        sArray[712] = 77;
        sArray[713] = 589;
        sArray[714] = 333;
        sArray[715] = 845;
        sArray[716] = 205;
        sArray[717] = 717;
        sArray[718] = 461;
        sArray[719] = 973;
        sArray[720] = 45;
        sArray[721] = 557;
        sArray[722] = 301;
        sArray[723] = 813;
        sArray[724] = 173;
        sArray[725] = 685;
        sArray[726] = 429;
        sArray[727] = 941;
        sArray[728] = 109;
        sArray[729] = 621;
        sArray[730] = 365;
        sArray[731] = 877;
        sArray[732] = 237;
        sArray[733] = 749;
        sArray[734] = 493;
        sArray[735] = 1005;
        sArray[736] = 29;
        sArray[737] = 541;
        sArray[738] = 285;
        sArray[739] = 797;
        sArray[740] = 157;
        sArray[741] = 669;
        sArray[742] = 413;
        sArray[743] = 925;
        sArray[744] = 93;
        sArray[745] = 605;
        sArray[746] = 349;
        sArray[747] = 861;
        sArray[748] = 221;
        sArray[749] = 733;
        sArray[750] = 477;
        sArray[751] = 989;
        sArray[752] = 61;
        sArray[753] = 573;
        sArray[754] = 317;
        sArray[755] = 829;
        sArray[756] = 189;
        sArray[757] = 701;
        sArray[758] = 445;
        sArray[759] = 957;
        sArray[760] = 125;
        sArray[761] = 637;
        sArray[762] = 381;
        sArray[763] = 893;
        sArray[764] = 253;
        sArray[765] = 765;
        sArray[766] = 509;
        sArray[767] = 1021;
        sArray[768] = 3;
        sArray[769] = 515;
        sArray[770] = 259;
        sArray[771] = 771;
        sArray[772] = 131;
        sArray[773] = 643;
        sArray[774] = 387;
        sArray[775] = 899;
        sArray[776] = 67;
        sArray[777] = 579;
        sArray[778] = 323;
        sArray[779] = 835;
        sArray[780] = 195;
        sArray[781] = 707;
        sArray[782] = 451;
        sArray[783] = 963;
        sArray[784] = 35;
        sArray[785] = 547;
        sArray[786] = 291;
        sArray[787] = 803;
        sArray[788] = 163;
        sArray[789] = 675;
        sArray[790] = 419;
        sArray[791] = 931;
        sArray[792] = 99;
        sArray[793] = 611;
        sArray[794] = 355;
        sArray[795] = 867;
        sArray[796] = 227;
        sArray[797] = 739;
        sArray[798] = 483;
        sArray[799] = 995;
        sArray[800] = 19;
        sArray[801] = 531;
        sArray[802] = 275;
        sArray[803] = 787;
        sArray[804] = 147;
        sArray[805] = 659;
        sArray[806] = 403;
        sArray[807] = 915;
        sArray[808] = 83;
        sArray[809] = 595;
        sArray[810] = 339;
        sArray[811] = 851;
        sArray[812] = 211;
        sArray[813] = 723;
        sArray[814] = 467;
        sArray[815] = 979;
        sArray[816] = 51;
        sArray[817] = 563;
        sArray[818] = 307;
        sArray[819] = 819;
        sArray[820] = 179;
        sArray[821] = 691;
        sArray[822] = 435;
        sArray[823] = 947;
        sArray[824] = 115;
        sArray[825] = 627;
        sArray[826] = 371;
        sArray[827] = 883;
        sArray[828] = 243;
        sArray[829] = 755;
        sArray[830] = 499;
        sArray[831] = 1011;
        sArray[832] = 11;
        sArray[833] = 523;
        sArray[834] = 267;
        sArray[835] = 779;
        sArray[836] = 139;
        sArray[837] = 651;
        sArray[838] = 395;
        sArray[839] = 907;
        sArray[840] = 75;
        sArray[841] = 587;
        sArray[842] = 331;
        sArray[843] = 843;
        sArray[844] = 203;
        sArray[845] = 715;
        sArray[846] = 459;
        sArray[847] = 971;
        sArray[848] = 43;
        sArray[849] = 555;
        sArray[850] = 299;
        sArray[851] = 811;
        sArray[852] = 171;
        sArray[853] = 683;
        sArray[854] = 427;
        sArray[855] = 939;
        sArray[856] = 107;
        sArray[857] = 619;
        sArray[858] = 363;
        sArray[859] = 875;
        sArray[860] = 235;
        sArray[861] = 747;
        sArray[862] = 491;
        sArray[863] = 1003;
        sArray[864] = 27;
        sArray[865] = 539;
        sArray[866] = 283;
        sArray[867] = 795;
        sArray[868] = 155;
        sArray[869] = 667;
        sArray[870] = 411;
        sArray[871] = 923;
        sArray[872] = 91;
        sArray[873] = 603;
        sArray[874] = 347;
        sArray[875] = 859;
        sArray[876] = 219;
        sArray[877] = 731;
        sArray[878] = 475;
        sArray[879] = 987;
        sArray[880] = 59;
        sArray[881] = 571;
        sArray[882] = 315;
        sArray[883] = 827;
        sArray[884] = 187;
        sArray[885] = 699;
        sArray[886] = 443;
        sArray[887] = 955;
        sArray[888] = 123;
        sArray[889] = 635;
        sArray[890] = 379;
        sArray[891] = 891;
        sArray[892] = 251;
        sArray[893] = 763;
        sArray[894] = 507;
        sArray[895] = 1019;
        sArray[896] = 7;
        sArray[897] = 519;
        sArray[898] = 263;
        sArray[899] = 775;
        sArray[900] = 135;
        sArray[901] = 647;
        sArray[902] = 391;
        sArray[903] = 903;
        sArray[904] = 71;
        sArray[905] = 583;
        sArray[906] = 327;
        sArray[907] = 839;
        sArray[908] = 199;
        sArray[909] = 711;
        sArray[910] = 455;
        sArray[911] = 967;
        sArray[912] = 39;
        sArray[913] = 551;
        sArray[914] = 295;
        sArray[915] = 807;
        sArray[916] = 167;
        sArray[917] = 679;
        sArray[918] = 423;
        sArray[919] = 935;
        sArray[920] = 103;
        sArray[921] = 615;
        sArray[922] = 359;
        sArray[923] = 871;
        sArray[924] = 231;
        sArray[925] = 743;
        sArray[926] = 487;
        sArray[927] = 999;
        sArray[928] = 23;
        sArray[929] = 535;
        sArray[930] = 279;
        sArray[931] = 791;
        sArray[932] = 151;
        sArray[933] = 663;
        sArray[934] = 407;
        sArray[935] = 919;
        sArray[936] = 87;
        sArray[937] = 599;
        sArray[938] = 343;
        sArray[939] = 855;
        sArray[940] = 215;
        sArray[941] = 727;
        sArray[942] = 471;
        sArray[943] = 983;
        sArray[944] = 55;
        sArray[945] = 567;
        sArray[946] = 311;
        sArray[947] = 823;
        sArray[948] = 183;
        sArray[949] = 695;
        sArray[950] = 439;
        sArray[951] = 951;
        sArray[952] = 119;
        sArray[953] = 631;
        sArray[954] = 375;
        sArray[955] = 887;
        sArray[956] = 247;
        sArray[957] = 759;
        sArray[958] = 503;
        sArray[959] = 1015;
        sArray[960] = 15;
        sArray[961] = 527;
        sArray[962] = 271;
        sArray[963] = 783;
        sArray[964] = 143;
        sArray[965] = 655;
        sArray[966] = 399;
        sArray[967] = 911;
        sArray[968] = 79;
        sArray[969] = 591;
        sArray[970] = 335;
        sArray[971] = 847;
        sArray[972] = 207;
        sArray[973] = 719;
        sArray[974] = 463;
        sArray[975] = 975;
        sArray[976] = 47;
        sArray[977] = 559;
        sArray[978] = 303;
        sArray[979] = 815;
        sArray[980] = 175;
        sArray[981] = 687;
        sArray[982] = 431;
        sArray[983] = 943;
        sArray[984] = 111;
        sArray[985] = 623;
        sArray[986] = 367;
        sArray[987] = 879;
        sArray[988] = 239;
        sArray[989] = 751;
        sArray[990] = 495;
        sArray[991] = 1007;
        sArray[992] = 31;
        sArray[993] = 543;
        sArray[994] = 287;
        sArray[995] = 799;
        sArray[996] = 159;
        sArray[997] = 671;
        sArray[998] = 415;
        sArray[999] = 927;
        sArray[1000] = 95;
        sArray[1001] = 607;
        sArray[1002] = 351;
        sArray[1003] = 863;
        sArray[1004] = 223;
        sArray[1005] = 735;
        sArray[1006] = 479;
        sArray[1007] = 991;
        sArray[1008] = 63;
        sArray[1009] = 575;
        sArray[1010] = 319;
        sArray[1011] = 831;
        sArray[1012] = 191;
        sArray[1013] = 703;
        sArray[1014] = 447;
        sArray[1015] = 959;
        sArray[1016] = 127;
        sArray[1017] = 639;
        sArray[1018] = 383;
        sArray[1019] = 895;
        sArray[1020] = 255;
        sArray[1021] = 767;
        sArray[1022] = 511;
        sArray[1023] = 1023;
        this.cfr_renamed_4 = sArray;
        sprzcg sprzcg2 = this;
        sprzcg sprzcg3 = this;
        sprzcg sprzcg4 = this;
        sprzcg sprzcg5 = this;
        long[] lArray = new long[27];
        lArray[0] = 1283868770400643928L;
        lArray[1] = 6416574995475331444L;
        lArray[2] = 4078260278032692663L;
        lArray[3] = 2353523259288686585L;
        lArray[4] = 1227179971273316331L;
        lArray[5] = 575931623374121527L;
        lArray[6] = 242543240509105209L;
        lArray[7] = 91437049221049666L;
        lArray[8] = 30799446349977173L;
        lArray[9] = 9255276791179340L;
        lArray[10] = 2478152334826140L;
        lArray[11] = 590642893610164L;
        lArray[12] = 125206034929641L;
        lArray[13] = 23590435911403L;
        lArray[14] = 3948334035941L;
        lArray[15] = 586753615614L;
        lArray[16] = 77391054539L;
        lArray[17] = 9056793210L;
        lArray[18] = 940121950L;
        lArray[19] = 86539696L;
        lArray[20] = 7062824L;
        lArray[21] = 510971L;
        lArray[22] = 32764L;
        lArray[23] = 1862L;
        lArray[24] = 94L;
        lArray[25] = 4L;
        lArray[26] = 0L;
        sprzcg5.cfr_renamed_119 = lArray;
        int[] nArray = new int[11];
        nArray[0] = 1;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 2;
        nArray[4] = 4;
        nArray[5] = 7;
        nArray[6] = 14;
        nArray[7] = 27;
        nArray[8] = 53;
        nArray[9] = 106;
        nArray[10] = 209;
        sprzcg5.cfr_renamed_102 = nArray;
        int[] nArray2 = new int[10];
        nArray2[0] = 2;
        nArray2[1] = 2;
        nArray2[2] = 5;
        nArray2[3] = 7;
        nArray2[4] = 12;
        nArray2[5] = 21;
        nArray2[6] = 40;
        nArray2[7] = 78;
        nArray2[8] = 157;
        nArray2[9] = 308;
        sprzcg4.cfr_renamed_93 = nArray2;
        int[] nArray3 = new int[11];
        nArray3[0] = 4;
        nArray3[1] = 11;
        nArray3[2] = 24;
        nArray3[3] = 50;
        nArray3[4] = 102;
        nArray3[5] = 202;
        nArray3[6] = 401;
        nArray3[7] = 794;
        nArray3[8] = 1577;
        nArray3[9] = 3138;
        nArray3[10] = 6308;
        sprzcg4.cfr_renamed_1 = nArray3;
        int[] nArray4 = new int[11];
        nArray4[0] = 0;
        nArray4[1] = 1;
        nArray4[2] = 1;
        nArray4[3] = 1;
        nArray4[4] = 1;
        nArray4[5] = 2;
        nArray4[6] = 4;
        nArray4[7] = 5;
        nArray4[8] = 8;
        nArray4[9] = 13;
        nArray4[10] = 25;
        sprzcg3.cfr_renamed_91 = nArray4;
        sprzcg3.cfr_renamed_152 = 4;
        sprzcg sprzcg6 = this;
        sprzcg2.cfr_renamed_2 = new sprjyf();
        sprzcg6.cfr_renamed_0 = new sprqwf();
        sprzcg2.cfr_renamed_86 = new spreuf();
        sprzcg2.cfr_renamed_3 = new sprfzf();
        sprzcg2.cfr_renamed_112 = new sprdxf();
    }

    private static /* synthetic */ int cfr_renamed_6905(int arg0) {
        return 1 << arg0;
    }

    public int cfr_renamed_6940(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5) {
        int n;
        int n2 = 0;
        int n3 = -arg5;
        int n4 = n = 0;
        while (n4 < arg4) {
            int n5 = arg0[arg1 + n];
            int n6 = n5 - arg2[arg3 + n] - n2;
            n2 = n6 >>> 31;
            int n7 = n5;
            n5 = n7 ^ (n6 & Integer.MAX_VALUE ^ n7) & n3;
            int n8 = arg1 + n;
            arg0[n8] = n5;
            n4 = ++n;
        }
        return n2;
    }

    public void cfr_renamed_6950(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10, int arg11, int arg12) {
        int n;
        int n2 = sprzcg.cfr_renamed_6905(arg12);
        int n3 = n = 0;
        while (n3 < n2) {
            int n4;
            int n5 = -arg8[arg9 + n];
            int n6 = arg1 + n * arg3;
            int n7 = arg5;
            int n8 = n4 = 0;
            while (n8 < n2) {
                int n9;
                this.cfr_renamed_6952(arg0, n6, arg2, arg4, n7, arg6, n5, arg10, arg11);
                if (n + n4 == n2 - 1) {
                    n6 = arg1;
                    n5 = -n5;
                    n9 = n7;
                } else {
                    n6 += arg3;
                    n9 = n7;
                }
                n7 = n9 + arg7;
                n8 = ++n4;
            }
            n3 = ++n;
        }
    }

    public void cfr_renamed_6920(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        int n;
        if (arg5 == 0) {
            return;
        }
        int n2 = -(arg3[arg4 + arg5 - 1] >>> 30) >>> 1;
        int n3 = 0;
        int n4 = 0;
        int n5 = n = arg6;
        while (n5 < arg2) {
            int n6 = n - arg6;
            int n7 = n6 < arg5 ? arg3[arg4 + n6] : n2;
            int n8 = n7 << arg7 & Integer.MAX_VALUE | n3;
            n3 = n7 >>> 31 - arg7;
            int n9 = arg0[arg1 + n] - n8 - n4;
            arg0[arg1 + n] = n9 & Integer.MAX_VALUE;
            n4 = n9 >>> 31;
            n5 = ++n;
        }
    }

    public int cfr_renamed_6907(int arg0, int arg1, int arg2) {
        int n;
        int n2 = n = arg0 + arg1 - arg2;
        n = n2 + (arg2 & -(n2 >>> 31));
        return n;
    }

    public void cfr_renamed_6952(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int n;
        if (arg5 == 0) {
            return;
        }
        int n2 = -(arg3[arg4 + arg5 - 1] >>> 30) >>> 1;
        int n3 = 0;
        int n4 = 0;
        int n5 = n = arg7;
        while (n5 < arg2) {
            int n6 = n - arg7;
            int n7 = n6 < arg5 ? arg3[arg4 + n6] : n2;
            int n8 = n7 << arg8 & Integer.MAX_VALUE | n3;
            n3 = n7 >>> 31 - arg8;
            long l = this.cfr_renamed_6556(n8) * (long)arg6 + this.cfr_renamed_6556(arg0[arg1 + n]) + (long)n4;
            arg0[arg1 + n] = (int)l & Integer.MAX_VALUE;
            n4 = (int)(l >>> 31);
            n5 = ++n;
        }
    }

    public int cfr_renamed_6936(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int n;
        int n2 = 0;
        int n3 = n = arg2;
        while (true) {
            int n4;
            --n;
            if (n3 <= 0) break;
            sprzcg sprzcg2 = this;
            n2 = sprzcg2.cfr_renamed_6906(n2, arg5, arg3, arg4);
            int n5 = n4 = arg0[arg1 + n] - arg3;
            n4 = n5 + (arg3 & -(n5 >>> 31));
            n2 = sprzcg2.cfr_renamed_6907(n2, n4, arg3);
            n3 = n;
        }
        return n2;
    }

    public int cfr_renamed_6938(int[] arg0, int arg1, int arg2, int arg3) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < arg2) {
            long l = this.cfr_renamed_6556(arg0[arg1 + n]) * this.cfr_renamed_6556(arg3) + (long)n2;
            arg0[arg1 + n] = (int)l & Integer.MAX_VALUE;
            n2 = (int)(l >> 31);
            n3 = ++n;
        }
        return n2;
    }

    public int cfr_renamed_6953(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = sprzcg.cfr_renamed_6905(arg2);
        int n3 = 0;
        int n4 = 0;
        int n5 = n = 0;
        while (n5 < n2) {
            byte by;
            byte by2 = by = arg0[arg1 + n];
            n4 |= (n3 += by2 * by2);
            n5 = ++n;
        }
        return n3 | -(n4 >>> 31);
    }

    public void cfr_renamed_6899(sprnvf arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, byte[] arg5, int arg6, byte[] arg7, int arg8, short[] arg9, int arg10, int arg11) {
        int n = sprzcg.cfr_renamed_6905(arg11);
        sprnvf sprnvf2 = arg0;
        while (true) {
            sprzcg sprzcg2;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            sprmdg[] sprmdgArray;
            block6: {
                sprmdgArray = new sprmdg[3 * n];
                sprzcg sprzcg3 = this;
                sprzcg3.cfr_renamed_6932(sprnvf2, arg1, arg2, arg11);
                sprzcg3.cfr_renamed_6932(sprnvf2, arg3, arg4, arg11);
                n8 = 1 << this.cfr_renamed_3.cfr_renamed_2[arg11] - 1;
                int n9 = n7 = 0;
                while (n9 < n) {
                    if (arg1[arg2 + n7] >= n8 || arg1[arg2 + n7] <= -n8 || arg3[arg4 + n7] >= n8 || arg3[arg4 + n7] <= -n8) {
                        n6 = n8 = -1;
                        break block6;
                    }
                    n9 = ++n7;
                }
                n6 = n8;
            }
            if (n6 < 0 || ((long)((n5 = this.cfr_renamed_6953(arg1, arg2, arg11)) + (n4 = this.cfr_renamed_6953(arg3, arg4, arg11)) | -((n5 | n4) >>> 31)) & 0xFFFFFFFFL) >= 16823L) continue;
            int n10 = 0;
            int n11 = 0 + n;
            int n12 = n11 + n;
            sprzcg sprzcg4 = this;
            sprzcg sprzcg5 = this;
            sprzcg5.cfr_renamed_6909(sprmdgArray, n10, arg1, arg2, arg11);
            sprzcg5.cfr_renamed_6909(sprmdgArray, n11, arg3, arg4, arg11);
            sprzcg4.cfr_renamed_86.cfr_renamed_6858(sprmdgArray, n10, arg11);
            sprzcg4.cfr_renamed_86.cfr_renamed_6858(sprmdgArray, n11, arg11);
            sprzcg4.cfr_renamed_86.cfr_renamed_6947(sprmdgArray, n12, sprmdgArray, n10, sprmdgArray, n11, arg11);
            sprzcg4.cfr_renamed_86.cfr_renamed_6948(sprmdgArray, n10, arg11);
            sprzcg4.cfr_renamed_86.cfr_renamed_6948(sprmdgArray, n11, arg11);
            sprzcg4.cfr_renamed_86.cfr_renamed_6864(sprmdgArray, n10, this.cfr_renamed_2.cfr_renamed_4, arg11);
            sprzcg4.cfr_renamed_86.cfr_renamed_6864(sprmdgArray, n11, this.cfr_renamed_2.cfr_renamed_4, arg11);
            sprzcg4.cfr_renamed_86.cfr_renamed_6949(sprmdgArray, n10, sprmdgArray, n12, arg11);
            sprzcg4.cfr_renamed_86.cfr_renamed_6949(sprmdgArray, n11, sprmdgArray, n12, arg11);
            sprzcg4.cfr_renamed_86.cfr_renamed_6866(sprmdgArray, n10, arg11);
            sprzcg4.cfr_renamed_86.cfr_renamed_6866(sprmdgArray, n11, arg11);
            sprmdg sprmdg2 = sprzcg4.cfr_renamed_2.cfr_renamed_107;
            int n13 = n7 = 0;
            while (n13 < n) {
                sprzcg sprzcg6 = this;
                sprmdg2 = this.cfr_renamed_2.cfr_renamed_6826(sprmdg2, sprzcg6.cfr_renamed_2.cfr_renamed_6822(sprmdgArray[n10 + n7]));
                sprmdg sprmdg3 = sprmdgArray[n11 + n7];
                sprmdg2 = sprzcg6.cfr_renamed_2.cfr_renamed_6826(sprmdg2, this.cfr_renamed_2.cfr_renamed_6822(sprmdg3));
                n13 = ++n7;
            }
            if (!this.cfr_renamed_2.cfr_renamed_6828(sprmdg2, this.cfr_renamed_2.cfr_renamed_152)) continue;
            short[] sArray = new short[2 * n];
            if (arg9 == null) {
                n3 = 0;
                arg9 = sArray;
                n2 = n3 + n;
                sprzcg2 = this;
            } else {
                n3 = arg10;
                n2 = 0;
                sprzcg2 = this;
            }
            if (sprzcg2.cfr_renamed_112.cfr_renamed_6848(arg9, n3, arg1, arg2, arg3, arg4, arg11, sArray, n2) == 0) continue;
            int[] nArray = arg11 > 2 ? new int[28 * n] : new int[28 * n * 3];
            n8 = (1 << this.cfr_renamed_3.cfr_renamed_4[arg11] - 1) - 1;
            if (this.cfr_renamed_6954(arg11, arg5, arg6, arg7, arg8, arg1, arg2, arg3, arg4, n8, nArray, 0) != 0) break;
        }
    }

    public int cfr_renamed_6954(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, byte[] arg5, int arg6, byte[] arg7, int arg8, int arg9, int[] arg10, int arg11) {
        int n;
        int n2 = sprzcg.cfr_renamed_6905(arg0);
        if (this.cfr_renamed_6941(arg0, arg5, arg6, arg7, arg8, arg10, arg11) == 0) {
            return 0;
        }
        if (arg0 <= 2) {
            n = arg0;
            while (n-- > 0) {
                if (this.cfr_renamed_6946(arg0, arg5, arg6, arg7, arg8, n, arg10, arg11) != 0) continue;
                return 0;
            }
        } else {
            n = arg0;
            while (n-- > 2) {
                if (this.cfr_renamed_6946(arg0, arg5, arg6, arg7, arg8, n, arg10, arg11) != 0) continue;
                return 0;
            }
            if (this.cfr_renamed_6955(arg0, arg5, arg6, arg7, arg8, arg10, arg11) == 0) {
                return 0;
            }
            if (this.cfr_renamed_6928(arg0, arg5, arg6, arg7, arg8, arg10, arg11) == 0) {
                return 0;
            }
        }
        if (arg3 == null) {
            arg4 = 0;
            arg3 = new byte[n2];
        }
        if (this.cfr_renamed_6921(arg1, arg2, arg10, arg11, arg9, arg0) == 0 || this.cfr_renamed_6921(arg3, arg4, arg10, arg11 + n2, arg9, arg0) == 0) {
            return 0;
        }
        int n3 = arg11;
        int n4 = n3 + n2;
        int n5 = n4 + n2;
        int n6 = n5 + n2;
        int n7 = n6 + n2;
        sprnyf[] sprnyfArray = sprqwf.cfr_renamed_4;
        int n8 = sprqwf.cfr_renamed_4[0].cfr_renamed_3;
        sprzcg sprzcg2 = this;
        int n9 = sprzcg2.cfr_renamed_6911(n8);
        sprzcg2.cfr_renamed_6914(arg10, n7, arg10, arg11, arg0, sprnyfArray[0].cfr_renamed_4, n8, n9);
        int n10 = 0;
        int n11 = n10;
        while (n11 < n2) {
            int n12 = n3 + n10;
            int n13 = this.cfr_renamed_6915(arg3[arg4 + n10], n8);
            arg10[n12] = n13;
            n11 = ++n10;
        }
        int n14 = n10 = 0;
        while (n14 < n2) {
            arg10[n4 + n10] = this.cfr_renamed_6915(arg5[arg6 + n10], n8);
            arg10[n5 + n10] = this.cfr_renamed_6915(arg7[arg8 + n10], n8);
            int n15 = n6 + n10;
            int n16 = this.cfr_renamed_6915(arg1[arg2 + n10], n8);
            arg10[n15] = n16;
            n14 = ++n10;
        }
        sprzcg sprzcg3 = this;
        this.cfr_renamed_6916(arg10, n4, arg10, n7, arg0, n8, n9);
        this.cfr_renamed_6916(arg10, n5, arg10, n7, arg0, n8, n9);
        sprzcg3.cfr_renamed_6916(arg10, n6, arg10, n7, arg0, n8, n9);
        sprzcg3.cfr_renamed_6916(arg10, n3, arg10, n7, arg0, n8, n9);
        int n17 = this.cfr_renamed_6906(12289, 1, n8, n9);
        int n18 = n10 = 0;
        while (n18 < n2) {
            sprzcg sprzcg4 = this;
            n = sprzcg4.cfr_renamed_6908(this.cfr_renamed_6906(arg10[n4 + n10], arg10[n3 + n10], n8, n9), sprzcg4.cfr_renamed_6906(arg10[n5 + n10], arg10[n6 + n10], n8, n9), n8);
            if (n != n17) {
                return 0;
            }
            n18 = ++n10;
        }
        return 1;
    }

    public void cfr_renamed_6927(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, long arg8, long arg9, long arg10, long arg11) {
        int n;
        long l = 0L;
        long l2 = 0L;
        int n2 = (arg0[arg1 + 0] * (int)arg8 + arg2[arg3 + 0] * (int)arg9) * arg7 & Integer.MAX_VALUE;
        int n3 = (arg0[arg1 + 0] * (int)arg10 + arg2[arg3 + 0] * (int)arg11) * arg7 & Integer.MAX_VALUE;
        int n4 = n = 0;
        while (n4 < arg6) {
            int n5 = arg0[arg1 + n];
            int n6 = arg2[arg3 + n];
            long l3 = (long)n5 * arg8 + (long)n6 * arg9 + (long)arg4[arg5 + n] * this.cfr_renamed_6556(n2) + l;
            long l4 = (long)n5 * arg10 + (long)n6 * arg11 + (long)arg4[arg5 + n] * this.cfr_renamed_6556(n3) + l2;
            if (n > 0) {
                arg0[arg1 + n - 1] = (int)l3 & Integer.MAX_VALUE;
                arg2[arg3 + n - 1] = (int)l4 & Integer.MAX_VALUE;
            }
            l = l3 >> 31;
            l2 = l4 >> 31;
            n4 = ++n;
        }
        arg0[arg1 + arg6 - 1] = (int)l;
        arg2[arg3 + arg6 - 1] = (int)l2;
        sprzcg sprzcg2 = this;
        sprzcg2.cfr_renamed_6951(arg0, arg1, arg6, arg4, arg5, (int)(l >>> 63));
        sprzcg2.cfr_renamed_6951(arg2, arg3, arg6, arg4, arg5, (int)(l2 >>> 63));
    }

    public int cfr_renamed_6935(int arg0) {
        return Integer.MIN_VALUE - arg0;
    }

    public int cfr_renamed_6926(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, long arg5, long arg6, long arg7, long arg8) {
        int n;
        long l = 0L;
        long l2 = 0L;
        int n2 = n = 0;
        while (n2 < arg4) {
            int n3 = arg0[arg1 + n];
            int n4 = arg2[arg3 + n];
            long l3 = (long)n3 * arg5 + (long)n4 * arg6 + l;
            long l4 = (long)n3 * arg7 + (long)n4 * arg8 + l2;
            if (n > 0) {
                arg0[arg1 + n - 1] = (int)l3 & Integer.MAX_VALUE;
                arg2[arg3 + n - 1] = (int)l4 & Integer.MAX_VALUE;
            }
            l = l3 >> 31;
            l2 = l4 >> 31;
            n2 = ++n;
        }
        arg0[arg1 + arg4 - 1] = (int)l;
        arg2[arg3 + arg4 - 1] = (int)l2;
        int n5 = (int)(l >>> 63);
        int n6 = (int)(l2 >>> 63);
        sprzcg sprzcg2 = this;
        sprzcg2.cfr_renamed_6944(arg0, arg1, arg4, n5);
        sprzcg2.cfr_renamed_6944(arg2, arg3, arg4, n6);
        return n5 | n6 << 1;
    }

    public int cfr_renamed_6955(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int[] arg5, int arg6) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11 = 1;
        int n12 = 1 << arg0;
        int n13 = arg0 - n11;
        int n14 = 1 << n13;
        int n15 = n14 >> 1;
        sprzcg sprzcg2 = this;
        int n16 = sprzcg2.cfr_renamed_102[n11];
        int n17 = sprzcg2.cfr_renamed_102[n11 + 1];
        int n18 = sprzcg2.cfr_renamed_93[n11];
        int n19 = arg6;
        int n20 = n19 + n17 * n15;
        int n21 = n20 + n17 * n15;
        int n22 = n21 + n18 * n14;
        int n23 = n10 = 0;
        while (n23 < n18) {
            n9 = sprqwf.cfr_renamed_4[n10].cfr_renamed_3;
            sprzcg sprzcg3 = this;
            n8 = sprzcg3.cfr_renamed_6911(n9);
            n7 = sprzcg3.cfr_renamed_6912(n9, n8);
            n6 = sprzcg3.cfr_renamed_6913(n17, n9, n8, n7);
            n5 = 0;
            n4 = n19;
            n3 = n20;
            n2 = n21 + n10;
            n = n22 + n10;
            int n24 = n5;
            while (n24 < n15) {
                arg5[n2] = this.cfr_renamed_6917(arg5, n4, n17, n9, n8, n7, n6);
                arg5[n] = this.cfr_renamed_6917(arg5, n3, n17, n9, n8, n7, n6);
                n4 += n17;
                n3 += n17;
                n2 += n18;
                n += n18;
                n24 = ++n5;
            }
            n23 = ++n10;
        }
        System.arraycopy(arg5, n21, arg5, arg6, n18 * n14);
        n21 = arg6;
        System.arraycopy(arg5, n22, arg5, n21 + n18 * n14, n18 * n14);
        n22 = n21 + n18 * n14;
        int n25 = n22 + n18 * n14;
        int n26 = n25 + n16 * n14;
        int n27 = n26 + n16 * n14;
        int n28 = n10 = 0;
        while (n28 < n18) {
            n9 = sprqwf.cfr_renamed_4[n10].cfr_renamed_3;
            sprzcg sprzcg4 = this;
            n8 = sprzcg4.cfr_renamed_6911(n9);
            n7 = sprzcg4.cfr_renamed_6912(n9, n8);
            n6 = n27;
            n5 = n6 + n12;
            n4 = n5 + n14;
            n3 = n4 + n12;
            sprzcg4.cfr_renamed_6914(arg5, n6, arg5, n5, arg0, sprqwf.cfr_renamed_4[n10].cfr_renamed_4, n9, n8);
            int n29 = 0;
            int n30 = n29;
            while (n30 < n12) {
                arg5[n4 + n29] = this.cfr_renamed_6915(arg1[arg2 + n29], n9);
                int n31 = n3 + n29;
                int n32 = this.cfr_renamed_6915(arg3[arg4 + n29], n9);
                arg5[n31] = n32;
                n30 = ++n29;
            }
            this.cfr_renamed_6916(arg5, n4, arg5, n6, arg0, n9, n8);
            this.cfr_renamed_6916(arg5, n3, arg5, n6, arg0, n9, n8);
            int n33 = arg0;
            while (n33 > n13) {
                int n34;
                sprzcg sprzcg5 = this;
                sprzcg5.cfr_renamed_6943(arg5, n4, n34, n9, n8, n7);
                sprzcg5.cfr_renamed_6943(arg5, n3, n34--, n9, n8, n7);
                n33 = n34;
            }
            if (n11 > 0) {
                int[] nArray = arg5;
                System.arraycopy(nArray, n5, arg5, n6 + n14, n14);
                n5 = n6 + n14;
                System.arraycopy(arg5, n4, arg5, n5 + n14, n14);
                n4 = n5 + n14;
                System.arraycopy(nArray, n3, arg5, n4 + n14, n14);
                n3 = n4 + n14;
            }
            n2 = n3 + n14;
            n = n2 + n15;
            n29 = 0;
            int n35 = n21 + n10;
            int n36 = n22 + n10;
            int n37 = n29;
            while (n37 < n15) {
                arg5[n2 + n29] = arg5[n35];
                arg5[n + ++n29] = arg5[n36];
                n35 += n18;
                n36 += n18;
                n37 = n29;
            }
            this.cfr_renamed_6916(arg5, n2, arg5, n6, n13 - 1, n9, n8);
            this.cfr_renamed_6916(arg5, n, arg5, n6, n13 - 1, n9, n8);
            n29 = 0;
            n35 = n21 + n10;
            n36 = n22 + n10;
            int n38 = n29;
            while (n38 < n15) {
                int[] nArray = arg5;
                int n39 = arg5[n4 + (n29 << 1) + 0];
                int n40 = arg5[n4 + (n29 << 1) + 1];
                int n41 = arg5[n3 + (n29 << 1) + 0];
                int n42 = arg5[n3 + (n29 << 1) + 1];
                int n43 = this.cfr_renamed_6906(arg5[n2 + n29], n7, n9, n8);
                int n44 = this.cfr_renamed_6906(arg5[n + n29], n7, n9, n8);
                nArray[n35 + 0] = this.cfr_renamed_6906(n42, n43, n9, n8);
                arg5[n35 + n18] = this.cfr_renamed_6906(n41, n43, n9, n8);
                arg5[n36 + 0] = this.cfr_renamed_6906(n40, n44, n9, n8);
                nArray[n36 + n18] = this.cfr_renamed_6906(n39, n44, n9, n8);
                n35 += n18 << 1;
                n36 += n18 << 1;
                n38 = ++n29;
            }
            this.cfr_renamed_6918(arg5, n21 + n10, n18, arg5, n5, n13, n9, n8);
            this.cfr_renamed_6918(arg5, n22 + n10, n18, arg5, n5, n13, n9, n8);
            if (n10 < n16) {
                sprzcg sprzcg6 = this;
                sprzcg6.cfr_renamed_6929(arg5, n4, arg5, n5, n13, n9, n8);
                sprzcg6.cfr_renamed_6929(arg5, n3, arg5, n5, n13, n9, n8);
                n29 = 0;
                n35 = n25 + n10;
                n36 = n26 + n10;
                int n45 = n29;
                while (n45 < n14) {
                    arg5[n35] = arg5[n4 + n29];
                    int n46 = arg5[n3 + n29];
                    arg5[n36] = n46;
                    n35 += n16;
                    n36 += n16;
                    n45 = ++n29;
                }
            }
            n28 = ++n10;
        }
        int n47 = n18;
        this.cfr_renamed_6919(arg5, n21, n47, n47, n14 << 1, sprqwf.cfr_renamed_4, 1, arg5, n27);
        int n48 = n16;
        this.cfr_renamed_6919(arg5, n25, n48, n48, n14 << 1, sprqwf.cfr_renamed_4, 1, arg5, n27);
        sprmdg[] sprmdgArray = new sprmdg[n14];
        sprmdg[] sprmdgArray2 = new sprmdg[n14];
        sprzcg sprzcg7 = this;
        int n49 = n18;
        sprzcg7.cfr_renamed_6942(sprmdgArray, 0, arg5, n21, n49, n49, n13);
        int n50 = n18;
        sprzcg7.cfr_renamed_6942(sprmdgArray2, 0, arg5, n22, n50, n50, n13);
        System.arraycopy(arg5, n25, arg5, arg6, 2 * n16 * n14);
        n25 = arg6;
        n26 = n25 + n16 * n14;
        sprmdg[] sprmdgArray3 = new sprmdg[n14];
        sprmdg[] sprmdgArray4 = new sprmdg[n14];
        sprzcg sprzcg8 = this;
        sprzcg sprzcg9 = this;
        int n51 = n16;
        sprzcg9.cfr_renamed_6942(sprmdgArray3, 0, arg5, n25, n51, n51, n13);
        int n52 = n16;
        sprzcg9.cfr_renamed_6942(sprmdgArray4, 0, arg5, n26, n52, n52, n13);
        sprzcg8.cfr_renamed_86.cfr_renamed_6858(sprmdgArray, 0, n13);
        sprzcg8.cfr_renamed_86.cfr_renamed_6858(sprmdgArray2, 0, n13);
        sprzcg8.cfr_renamed_86.cfr_renamed_6858(sprmdgArray3, 0, n13);
        sprzcg8.cfr_renamed_86.cfr_renamed_6858(sprmdgArray4, 0, n13);
        sprmdg[] sprmdgArray5 = new sprmdg[n14];
        sprmdg[] sprmdgArray6 = new sprmdg[n14 >> 1];
        sprzcg sprzcg10 = this;
        sprzcg10.cfr_renamed_86.cfr_renamed_6956(sprmdgArray5, 0, sprmdgArray, 0, sprmdgArray2, 0, sprmdgArray3, 0, sprmdgArray4, 0, n13);
        sprzcg10.cfr_renamed_86.cfr_renamed_6947(sprmdgArray6, 0, sprmdgArray3, 0, sprmdgArray4, 0, n13);
        sprzcg10.cfr_renamed_86.cfr_renamed_6949(sprmdgArray5, 0, sprmdgArray6, 0, n13);
        sprzcg10.cfr_renamed_86.cfr_renamed_6866(sprmdgArray5, 0, n13);
        int n53 = n10 = 0;
        while (n53 < n14) {
            sprmdg sprmdg2;
            block16: {
                block15: {
                    sprmdg2 = sprmdgArray5[n10];
                    if (!this.cfr_renamed_2.cfr_renamed_6828(sprmdg2, this.cfr_renamed_2.cfr_renamed_105)) break block15;
                    sprzcg sprzcg11 = this;
                    if (sprzcg11.cfr_renamed_2.cfr_renamed_6828(sprzcg11.cfr_renamed_2.cfr_renamed_0, sprmdg2)) break block16;
                }
                return 0;
            }
            sprzcg sprzcg12 = this;
            sprmdgArray5[n10++] = sprzcg12.cfr_renamed_2.cfr_renamed_6816(sprzcg12.cfr_renamed_2.cfr_renamed_6830(sprmdg2));
            n53 = n10;
        }
        sprzcg sprzcg13 = this;
        sprzcg13.cfr_renamed_86.cfr_renamed_6858(sprmdgArray5, 0, n13);
        sprzcg13.cfr_renamed_86.cfr_renamed_6863(sprmdgArray3, 0, sprmdgArray5, 0, n13);
        sprzcg13.cfr_renamed_86.cfr_renamed_6863(sprmdgArray4, 0, sprmdgArray5, 0, n13);
        sprzcg13.cfr_renamed_86.cfr_renamed_6874(sprmdgArray, 0, sprmdgArray3, 0, n13);
        sprzcg13.cfr_renamed_86.cfr_renamed_6874(sprmdgArray2, 0, sprmdgArray4, 0, n13);
        sprzcg13.cfr_renamed_86.cfr_renamed_6866(sprmdgArray, 0, n13);
        sprzcg13.cfr_renamed_86.cfr_renamed_6866(sprmdgArray2, 0, n13);
        n21 = arg6;
        n22 = n21 + n14;
        int n54 = n10 = 0;
        while (n54 < n14) {
            arg5[n21 + n10] = (int)this.cfr_renamed_2.cfr_renamed_6830(sprmdgArray[n10]);
            int n55 = n22 + n10;
            int n56 = (int)this.cfr_renamed_2.cfr_renamed_6830(sprmdgArray2[n10]);
            arg5[n55] = n56;
            n54 = ++n10;
        }
        return 1;
    }

    public int cfr_renamed_6917(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 == 0) {
            return 0;
        }
        sprzcg sprzcg2 = this;
        int n = sprzcg2.cfr_renamed_6936(arg0, arg1, arg2, arg3, arg4, arg5);
        n = sprzcg2.cfr_renamed_6908(n, arg6 & -(arg0[arg1 + arg2 - 1] >>> 30), arg3);
        return n;
    }
}

