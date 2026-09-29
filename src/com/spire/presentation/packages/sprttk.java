/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprexk;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.spriw;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprozz;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtxk;
import com.spire.presentation.packages.sprtzk;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprufba;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwdl;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprxuk;
import com.spire.presentation.packages.sprybl;

public class sprttk
implements spriw {
    private final int cfr_renamed_133;
    private final int cfr_renamed_185;
    private final int spr\ufe34;
    private final int cfr_renamed_82;
    private final int cfr_renamed_126;
    private final int cfr_renamed_88;
    private final int[] cfr_renamed_31;
    private final int cfr_renamed_272;
    private sprxuk cfr_renamed_145 = sprxuk.cfr_renamed_3;
    private byte[] cfr_renamed_114;
    private final int cfr_renamed_96;
    private final int cfr_renamed_105;
    private final int cfr_renamed_137;
    private int cfr_renamed_79 = 0;
    private final int cfr_renamed_107;
    private final byte[] cfr_renamed_132;
    private final int cfr_renamed_102;
    private final int cfr_renamed_93;
    private boolean cfr_renamed_86;
    private final int cfr_renamed_152;
    private static final int[] cfr_renamed_112;
    private final int[] cfr_renamed_119;
    private final int[] cfr_renamed_91;
    private final int cfr_renamed_0;
    private final int cfr_renamed_1;
    private final int cfr_renamed_2;
    private String cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_3402(true);
    }

    public int cfr_renamed_10294() {
        return this.cfr_renamed_96;
    }

    @Override
    public void cfr_renamed_2417(byte[] arg0, int arg1, int arg2) {
        if (arg1 > arg0.length - arg2) {
            throw new sprddl(sprufba.cfr_renamed_9("k(r3vf`3d g4\"2m)\"5j)p2"));
        }
        if (arg2 <= 0) {
            return;
        }
        sprttk sprttk2 = this;
        sprttk2.cfr_renamed_10100();
        if (sprttk2.cfr_renamed_79 > 0) {
            sprttk sprttk3 = this;
            int n = sprttk3.cfr_renamed_2 - sprttk3.cfr_renamed_79;
            if (arg2 <= n) {
                sprttk sprttk4 = this;
                System.arraycopy(arg0, arg1, sprttk4.cfr_renamed_132, this.cfr_renamed_79, arg2);
                sprttk4.cfr_renamed_79 += arg2;
                return;
            }
            sprttk sprttk5 = this;
            System.arraycopy(arg0, arg1, sprttk5.cfr_renamed_132, sprttk5.cfr_renamed_79, n);
            arg1 += n;
            arg2 -= n;
            sprttk sprttk6 = this;
            sprttk6.cfr_renamed_10318(sprttk6.cfr_renamed_132, 0);
        }
        int n = arg2;
        while (n > this.cfr_renamed_2) {
            int n2 = arg1;
            this.cfr_renamed_10318(arg0, n2);
            arg1 = n2 + this.cfr_renamed_2;
            n = arg2 - this.cfr_renamed_2;
        }
        System.arraycopy(arg0, arg1, this.cfr_renamed_132, 0, arg2);
        this.cfr_renamed_79 = arg2;
    }

    public int cfr_renamed_10299() {
        return this.cfr_renamed_2;
    }

    @Override
    public byte[] cfr_renamed_1472() {
        return this.cfr_renamed_114;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int cfr_renamed_2345(int arg0) {
        int n;
        int n2 = Math.max(0, arg0) - 1;
        switch (this.cfr_renamed_145) {
            case cfr_renamed_119: 
            case cfr_renamed_152: {
                n = n2 = Math.max(0, n2 - this.cfr_renamed_152);
                return n - n2 % this.cfr_renamed_2;
            }
            case cfr_renamed_2: 
            case cfr_renamed_1: {
                n = n2 = Math.max(0, n2 + this.cfr_renamed_79 - this.cfr_renamed_152);
                return n - n2 % this.cfr_renamed_2;
            }
            case cfr_renamed_0: 
            case cfr_renamed_4: {
                n = n2 = Math.max(0, n2 + this.cfr_renamed_79);
                return n - n2 % this.cfr_renamed_2;
            }
        }
        n = n2;
        return n - n2 % this.cfr_renamed_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void cfr_renamed_10319(int[] arg0, int arg1) {
        switch (arg0.length) {
            case 8: {
                sprttk.cfr_renamed_10320(arg0, arg1);
                return;
            }
            case 12: {
                sprttk.cfr_renamed_10321(arg0, arg1);
                return;
            }
            case 16: {
                sprttk.cfr_renamed_10322(arg0, arg1);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean cfr_renamed_10098() {
        switch (this.cfr_renamed_145) {
            case cfr_renamed_119: 
            case cfr_renamed_152: {
                this.cfr_renamed_10323(sprxuk.cfr_renamed_2);
                return false;
            }
            case cfr_renamed_112: 
            case cfr_renamed_86: {
                this.cfr_renamed_10323(sprxuk.cfr_renamed_0);
                return true;
            }
            case cfr_renamed_2: {
                return false;
            }
            case cfr_renamed_0: {
                return true;
            }
            case cfr_renamed_4: {
                throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprozz.cfr_renamed_9("C0\u0002=\r<\u0017s\u00016C!\u0006&\u00106\u0007s\u0005<\u0011s\u0006=\u0000!\u001a#\u0017:\f=")).toString());
            }
        }
        throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprufba.cfr_renamed_9("\"(g#f5\"2mf`#\"/l/v/c*k<g\"")).toString());
    }

    public static void cfr_renamed_10324(sprwdl arg0, int[] arg1, int arg2) {
        if (null == arg0) {
            throw new NullPointerException(sprozz.cfr_renamed_9("7;\n C>\u0006'\u000b<\u0007s\n C<\r?\u001as\u0005<\u0011s\u0016 \u0006s\u0001*C\u0000\u00132\u00118\u000f6':\u00046\u0010'"));
        }
        sprttk.cfr_renamed_10322(arg1, arg2);
    }

    public static void cfr_renamed_10322(int[] arg0, int arg1) {
        int n;
        int n2 = arg0[0];
        int n3 = arg0[1];
        int n4 = arg0[2];
        int n5 = arg0[3];
        int n6 = arg0[4];
        int n7 = arg0[5];
        int n8 = arg0[6];
        int n9 = arg0[7];
        int n10 = arg0[8];
        int n11 = arg0[9];
        int n12 = arg0[10];
        int n13 = arg0[11];
        int n14 = arg0[12];
        int n15 = arg0[13];
        int n16 = arg0[14];
        int n17 = arg0[15];
        int n18 = n = 0;
        while (n18 < arg1) {
            n5 ^= n;
            int n19 = cfr_renamed_112[0];
            n2 += spruaf.cfr_renamed_493(n3 ^= cfr_renamed_112[n & 7], 31);
            n3 ^= spruaf.cfr_renamed_493(n2, 24);
            n2 ^= n19;
            n2 += spruaf.cfr_renamed_493(n3, 17);
            n3 ^= spruaf.cfr_renamed_493(n2, 17);
            n2 ^= n19;
            n2 += n3;
            n3 ^= spruaf.cfr_renamed_493(n2, 31);
            n2 ^= n19;
            n2 += spruaf.cfr_renamed_493(n3, 24);
            n3 ^= spruaf.cfr_renamed_493(n2, 16);
            n2 ^= n19;
            n19 = cfr_renamed_112[1];
            n4 += spruaf.cfr_renamed_493(n5, 31);
            n5 ^= spruaf.cfr_renamed_493(n4, 24);
            n4 ^= n19;
            n4 += spruaf.cfr_renamed_493(n5, 17);
            n5 ^= spruaf.cfr_renamed_493(n4, 17);
            n4 ^= n19;
            n4 += n5;
            n5 ^= spruaf.cfr_renamed_493(n4, 31);
            n4 ^= n19;
            n4 += spruaf.cfr_renamed_493(n5, 24);
            n5 ^= spruaf.cfr_renamed_493(n4, 16);
            n4 ^= n19;
            n19 = cfr_renamed_112[2];
            n6 += spruaf.cfr_renamed_493(n7, 31);
            n7 ^= spruaf.cfr_renamed_493(n6, 24);
            n6 ^= n19;
            n6 += spruaf.cfr_renamed_493(n7, 17);
            n7 ^= spruaf.cfr_renamed_493(n6, 17);
            n6 ^= n19;
            n6 += n7;
            n7 ^= spruaf.cfr_renamed_493(n6, 31);
            n6 ^= n19;
            n6 += spruaf.cfr_renamed_493(n7, 24);
            n7 ^= spruaf.cfr_renamed_493(n6, 16);
            n6 ^= n19;
            n19 = cfr_renamed_112[3];
            n8 += spruaf.cfr_renamed_493(n9, 31);
            n9 ^= spruaf.cfr_renamed_493(n8, 24);
            n8 ^= n19;
            n8 += spruaf.cfr_renamed_493(n9, 17);
            n9 ^= spruaf.cfr_renamed_493(n8, 17);
            n8 ^= n19;
            n8 += n9;
            n9 ^= spruaf.cfr_renamed_493(n8, 31);
            n8 ^= n19;
            n8 += spruaf.cfr_renamed_493(n9, 24);
            n9 ^= spruaf.cfr_renamed_493(n8, 16);
            n8 ^= n19;
            n19 = cfr_renamed_112[4];
            n10 += spruaf.cfr_renamed_493(n11, 31);
            n11 ^= spruaf.cfr_renamed_493(n10, 24);
            n10 ^= n19;
            n10 += spruaf.cfr_renamed_493(n11, 17);
            n11 ^= spruaf.cfr_renamed_493(n10, 17);
            n10 ^= n19;
            n10 += n11;
            n11 ^= spruaf.cfr_renamed_493(n10, 31);
            n10 ^= n19;
            n10 += spruaf.cfr_renamed_493(n11, 24);
            n11 ^= spruaf.cfr_renamed_493(n10, 16);
            n10 ^= n19;
            n19 = cfr_renamed_112[5];
            n12 += spruaf.cfr_renamed_493(n13, 31);
            n13 ^= spruaf.cfr_renamed_493(n12, 24);
            n12 ^= n19;
            n12 += spruaf.cfr_renamed_493(n13, 17);
            n13 ^= spruaf.cfr_renamed_493(n12, 17);
            n12 ^= n19;
            n12 += n13;
            n13 ^= spruaf.cfr_renamed_493(n12, 31);
            n12 ^= n19;
            n12 += spruaf.cfr_renamed_493(n13, 24);
            n13 ^= spruaf.cfr_renamed_493(n12, 16);
            n12 ^= n19;
            n19 = cfr_renamed_112[6];
            n14 += spruaf.cfr_renamed_493(n15, 31);
            n15 ^= spruaf.cfr_renamed_493(n14, 24);
            n14 ^= n19;
            n14 += spruaf.cfr_renamed_493(n15, 17);
            n15 ^= spruaf.cfr_renamed_493(n14, 17);
            n14 ^= n19;
            n14 += n15;
            n15 ^= spruaf.cfr_renamed_493(n14, 31);
            n14 ^= n19;
            n14 += spruaf.cfr_renamed_493(n15, 24);
            n15 ^= spruaf.cfr_renamed_493(n14, 16);
            n14 ^= n19;
            n19 = cfr_renamed_112[7];
            n16 += spruaf.cfr_renamed_493(n17, 31);
            n17 ^= spruaf.cfr_renamed_493(n16, 24);
            n16 ^= n19;
            n16 += spruaf.cfr_renamed_493(n17, 17);
            n17 ^= spruaf.cfr_renamed_493(n16, 17);
            n16 ^= n19;
            n16 += n17;
            n17 ^= spruaf.cfr_renamed_493(n16, 31);
            n16 ^= n19;
            n16 += spruaf.cfr_renamed_493(n17, 24);
            n17 ^= spruaf.cfr_renamed_493(n16, 16);
            n16 ^= n19;
            n19 = sprttk.cfr_renamed_10325(n2 ^ n4 ^ n6 ^ n8);
            int n20 = sprttk.cfr_renamed_10325(n3 ^ n5 ^ n7 ^ n9);
            int n21 = n2 ^ n10;
            int n22 = n3 ^ n11;
            int n23 = n4 ^ n12;
            int n24 = n5 ^ n13;
            int n25 = n6 ^ n14;
            int n26 = n7 ^ n15;
            int n27 = n8 ^ n16;
            int n28 = n9 ^ n17;
            n10 = n2;
            n11 = n3;
            n12 = n4;
            n13 = n5;
            n14 = n6;
            n15 = n7;
            n16 = n8;
            n17 = n9;
            n2 = n23 ^ n20;
            n3 = n24 ^ n19;
            n4 = n25 ^ n20;
            n5 = n26 ^ n19;
            n6 = n27 ^ n20;
            n7 = n28 ^ n19;
            n8 = n21 ^ n20;
            n9 = n22 ^ n19;
            n18 = ++n;
        }
        arg0[0] = n2;
        arg0[1] = n3;
        arg0[2] = n4;
        arg0[3] = n5;
        arg0[4] = n6;
        arg0[5] = n7;
        arg0[6] = n8;
        arg0[7] = n9;
        arg0[8] = n10;
        arg0[9] = n11;
        arg0[10] = n12;
        arg0[11] = n13;
        arg0[12] = n14;
        arg0[13] = n15;
        arg0[14] = n16;
        arg0[15] = n17;
    }

    private /* synthetic */ void cfr_renamed_10318(byte[] arg0, int arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0 / 2) {
            int n3 = n + this.cfr_renamed_0 / 2;
            sprttk sprttk2 = this;
            int n4 = this.cfr_renamed_91[n];
            int n5 = sprttk2.cfr_renamed_91[n3];
            int n6 = sprpxe.cfr_renamed_439(arg0, arg1 + n * 4);
            int n7 = sprpxe.cfr_renamed_439(arg0, arg1 + n3 * 4);
            sprttk sprttk3 = this;
            sprttk2.cfr_renamed_91[n] = n5 ^ n6 ^ sprttk3.cfr_renamed_91[sprttk3.cfr_renamed_0 + n];
            sprttk sprttk4 = this;
            sprttk2.cfr_renamed_91[n3] = n4 ^ n5 ^ n7 ^ sprttk4.cfr_renamed_91[sprttk4.cfr_renamed_0 + (n3 & this.cfr_renamed_105)];
            n2 = ++n;
        }
        sprttk sprttk5 = this;
        sprttk.cfr_renamed_10319(sprttk5.cfr_renamed_91, sprttk5.cfr_renamed_126);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int cfr_renamed_1202(int arg0) {
        int n = Math.max(0, arg0);
        switch (this.cfr_renamed_145) {
            case cfr_renamed_119: 
            case cfr_renamed_152: {
                return Math.max(0, n - this.cfr_renamed_152);
            }
            case cfr_renamed_2: 
            case cfr_renamed_1: {
                return Math.max(0, n + this.cfr_renamed_79 - this.cfr_renamed_152);
            }
            case cfr_renamed_0: 
            case cfr_renamed_4: {
                return n + this.cfr_renamed_79 + this.cfr_renamed_152;
            }
        }
        return n + this.cfr_renamed_152;
    }

    public static void cfr_renamed_10321(int[] arg0, int arg1) {
        int n;
        int n2 = arg0[0];
        int n3 = arg0[1];
        int n4 = arg0[2];
        int n5 = arg0[3];
        int n6 = arg0[4];
        int n7 = arg0[5];
        int n8 = arg0[6];
        int n9 = arg0[7];
        int n10 = arg0[8];
        int n11 = arg0[9];
        int n12 = arg0[10];
        int n13 = arg0[11];
        int n14 = n = 0;
        while (n14 < arg1) {
            n5 ^= n;
            int n15 = cfr_renamed_112[0];
            n2 += spruaf.cfr_renamed_493(n3 ^= cfr_renamed_112[n & 7], 31);
            n3 ^= spruaf.cfr_renamed_493(n2, 24);
            n2 ^= n15;
            n2 += spruaf.cfr_renamed_493(n3, 17);
            n3 ^= spruaf.cfr_renamed_493(n2, 17);
            n2 ^= n15;
            n2 += n3;
            n3 ^= spruaf.cfr_renamed_493(n2, 31);
            n2 ^= n15;
            n2 += spruaf.cfr_renamed_493(n3, 24);
            n3 ^= spruaf.cfr_renamed_493(n2, 16);
            n2 ^= n15;
            n15 = cfr_renamed_112[1];
            n4 += spruaf.cfr_renamed_493(n5, 31);
            n5 ^= spruaf.cfr_renamed_493(n4, 24);
            n4 ^= n15;
            n4 += spruaf.cfr_renamed_493(n5, 17);
            n5 ^= spruaf.cfr_renamed_493(n4, 17);
            n4 ^= n15;
            n4 += n5;
            n5 ^= spruaf.cfr_renamed_493(n4, 31);
            n4 ^= n15;
            n4 += spruaf.cfr_renamed_493(n5, 24);
            n5 ^= spruaf.cfr_renamed_493(n4, 16);
            n4 ^= n15;
            n15 = cfr_renamed_112[2];
            n6 += spruaf.cfr_renamed_493(n7, 31);
            n7 ^= spruaf.cfr_renamed_493(n6, 24);
            n6 ^= n15;
            n6 += spruaf.cfr_renamed_493(n7, 17);
            n7 ^= spruaf.cfr_renamed_493(n6, 17);
            n6 ^= n15;
            n6 += n7;
            n7 ^= spruaf.cfr_renamed_493(n6, 31);
            n6 ^= n15;
            n6 += spruaf.cfr_renamed_493(n7, 24);
            n7 ^= spruaf.cfr_renamed_493(n6, 16);
            n6 ^= n15;
            n15 = cfr_renamed_112[3];
            n8 += spruaf.cfr_renamed_493(n9, 31);
            n9 ^= spruaf.cfr_renamed_493(n8, 24);
            n8 ^= n15;
            n8 += spruaf.cfr_renamed_493(n9, 17);
            n9 ^= spruaf.cfr_renamed_493(n8, 17);
            n8 ^= n15;
            n8 += n9;
            n9 ^= spruaf.cfr_renamed_493(n8, 31);
            n8 ^= n15;
            n8 += spruaf.cfr_renamed_493(n9, 24);
            n9 ^= spruaf.cfr_renamed_493(n8, 16);
            n8 ^= n15;
            n15 = cfr_renamed_112[4];
            n10 += spruaf.cfr_renamed_493(n11, 31);
            n11 ^= spruaf.cfr_renamed_493(n10, 24);
            n10 ^= n15;
            n10 += spruaf.cfr_renamed_493(n11, 17);
            n11 ^= spruaf.cfr_renamed_493(n10, 17);
            n10 ^= n15;
            n10 += n11;
            n11 ^= spruaf.cfr_renamed_493(n10, 31);
            n10 ^= n15;
            n10 += spruaf.cfr_renamed_493(n11, 24);
            n11 ^= spruaf.cfr_renamed_493(n10, 16);
            n10 ^= n15;
            n15 = cfr_renamed_112[5];
            n12 += spruaf.cfr_renamed_493(n13, 31);
            n13 ^= spruaf.cfr_renamed_493(n12, 24);
            n12 ^= n15;
            n12 += spruaf.cfr_renamed_493(n13, 17);
            n13 ^= spruaf.cfr_renamed_493(n12, 17);
            n12 ^= n15;
            n12 += n13;
            n13 ^= spruaf.cfr_renamed_493(n12, 31);
            n12 ^= n15;
            n12 += spruaf.cfr_renamed_493(n13, 24);
            n13 ^= spruaf.cfr_renamed_493(n12, 16);
            n12 ^= n15;
            n15 = sprttk.cfr_renamed_10325(n2 ^ n4 ^ n6);
            int n16 = sprttk.cfr_renamed_10325(n3 ^ n5 ^ n7);
            int n17 = n2 ^ n8;
            int n18 = n3 ^ n9;
            int n19 = n4 ^ n10;
            int n20 = n5 ^ n11;
            int n21 = n6 ^ n12;
            int n22 = n7 ^ n13;
            n8 = n2;
            n9 = n3;
            n10 = n4;
            n11 = n5;
            n12 = n6;
            n13 = n7;
            n2 = n19 ^ n16;
            n3 = n20 ^ n15;
            n4 = n21 ^ n16;
            n5 = n22 ^ n15;
            n6 = n17 ^ n16;
            n7 = n18 ^ n15;
            n14 = ++n;
        }
        arg0[0] = n2;
        arg0[1] = n3;
        arg0[2] = n4;
        arg0[3] = n5;
        arg0[4] = n6;
        arg0[5] = n7;
        arg0[6] = n8;
        arg0[7] = n9;
        arg0[8] = n10;
        arg0[9] = n11;
        arg0[10] = n12;
        arg0[11] = n13;
    }

    private /* synthetic */ void cfr_renamed_10323(sprxuk arg0) {
        switch (this.cfr_renamed_145) {
            case cfr_renamed_152: 
            case cfr_renamed_86: {
                sprttk sprttk2 = this;
                while (false) {
                }
                sprttk sprttk3 = sprttk2;
                sprttk2.cfr_renamed_10326();
                break;
            }
            default: {
                sprttk sprttk3 = this;
            }
        }
        sprttk3.cfr_renamed_79 = 0;
        this.cfr_renamed_145 = arg0;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl {
        if (arg1 > arg0.length - arg2) {
            throw new sprddl(sprufba.cfr_renamed_9("k(r3vf`3d g4\"2m)\"5j)p2"));
        }
        boolean bl = this.cfr_renamed_10098();
        int n = 0;
        if (bl) {
            if (this.cfr_renamed_79 > 0) {
                sprttk sprttk2 = this;
                int n2 = sprttk2.cfr_renamed_2 - sprttk2.cfr_renamed_79;
                if (arg2 <= n2) {
                    sprttk sprttk3 = this;
                    System.arraycopy(arg0, arg1, sprttk3.cfr_renamed_132, this.cfr_renamed_79, arg2);
                    sprttk3.cfr_renamed_79 += arg2;
                    return 0;
                }
                sprttk sprttk4 = this;
                System.arraycopy(arg0, arg1, sprttk4.cfr_renamed_132, sprttk4.cfr_renamed_79, n2);
                arg1 += n2;
                arg2 -= n2;
                sprttk sprttk5 = this;
                sprttk5.cfr_renamed_10327(sprttk5.cfr_renamed_132, 0, arg3, arg4);
                n = sprttk5.cfr_renamed_2;
            }
            int n3 = arg2;
            while (n3 > this.cfr_renamed_2) {
                int n4 = arg1;
                this.cfr_renamed_10327(arg0, n4, arg3, arg4 + n);
                arg1 = n4 + this.cfr_renamed_2;
                n += this.cfr_renamed_2;
                n3 = arg2 -= this.cfr_renamed_2;
            }
        } else {
            sprttk sprttk6 = this;
            int n5 = sprttk6.cfr_renamed_137 - sprttk6.cfr_renamed_79;
            if (arg2 <= n5) {
                sprttk sprttk7 = this;
                System.arraycopy(arg0, arg1, sprttk7.cfr_renamed_132, this.cfr_renamed_79, arg2);
                sprttk7.cfr_renamed_79 += arg2;
                return 0;
            }
            sprttk sprttk8 = this;
            if (sprttk8.cfr_renamed_79 > sprttk8.cfr_renamed_2) {
                sprttk sprttk9 = this;
                sprttk9.cfr_renamed_10328(sprttk9.cfr_renamed_132, 0, arg3, arg4);
                sprttk9.cfr_renamed_79 -= this.cfr_renamed_2;
                sprttk sprttk10 = this;
                System.arraycopy(sprttk9.cfr_renamed_132, sprttk10.cfr_renamed_2, sprttk10.cfr_renamed_132, 0, this.cfr_renamed_79);
                n = sprttk9.cfr_renamed_2;
                if (arg2 <= (n5 += this.cfr_renamed_2)) {
                    sprttk sprttk11 = this;
                    System.arraycopy(arg0, arg1, sprttk11.cfr_renamed_132, this.cfr_renamed_79, arg2);
                    sprttk11.cfr_renamed_79 += arg2;
                    return n;
                }
            }
            sprttk sprttk12 = this;
            n5 = this.cfr_renamed_2 - sprttk12.cfr_renamed_79;
            sprttk sprttk13 = this;
            System.arraycopy(arg0, arg1, sprttk13.cfr_renamed_132, sprttk13.cfr_renamed_79, n5);
            arg1 += n5;
            this.cfr_renamed_10328(sprttk12.cfr_renamed_132, 0, arg3, arg4 + n);
            n += this.cfr_renamed_2;
            int n6 = arg2 -= n5;
            while (n6 > this.cfr_renamed_137) {
                int n7 = arg1;
                this.cfr_renamed_10328(arg0, n7, arg3, arg4 + n);
                arg1 = n7 + this.cfr_renamed_2;
                n += this.cfr_renamed_2;
                n6 = arg2 -= this.cfr_renamed_2;
            }
        }
        System.arraycopy(arg0, arg1, this.cfr_renamed_132, 0, arg2);
        this.cfr_renamed_79 = arg2;
        return n;
    }

    public static void cfr_renamed_10320(int[] arg0, int arg1) {
        int n;
        int n2 = arg0[0];
        int n3 = arg0[1];
        int n4 = arg0[2];
        int n5 = arg0[3];
        int n6 = arg0[4];
        int n7 = arg0[5];
        int n8 = arg0[6];
        int n9 = arg0[7];
        int n10 = n = 0;
        while (n10 < arg1) {
            n5 ^= n;
            int n11 = cfr_renamed_112[0];
            n2 += spruaf.cfr_renamed_493(n3 ^= cfr_renamed_112[n & 7], 31);
            n3 ^= spruaf.cfr_renamed_493(n2, 24);
            n2 ^= n11;
            n2 += spruaf.cfr_renamed_493(n3, 17);
            n3 ^= spruaf.cfr_renamed_493(n2, 17);
            n2 ^= n11;
            n2 += n3;
            n3 ^= spruaf.cfr_renamed_493(n2, 31);
            n2 ^= n11;
            n2 += spruaf.cfr_renamed_493(n3, 24);
            n3 ^= spruaf.cfr_renamed_493(n2, 16);
            n2 ^= n11;
            n11 = cfr_renamed_112[1];
            n4 += spruaf.cfr_renamed_493(n5, 31);
            n5 ^= spruaf.cfr_renamed_493(n4, 24);
            n4 ^= n11;
            n4 += spruaf.cfr_renamed_493(n5, 17);
            n5 ^= spruaf.cfr_renamed_493(n4, 17);
            n4 ^= n11;
            n4 += n5;
            n5 ^= spruaf.cfr_renamed_493(n4, 31);
            n4 ^= n11;
            n4 += spruaf.cfr_renamed_493(n5, 24);
            n5 ^= spruaf.cfr_renamed_493(n4, 16);
            n4 ^= n11;
            n11 = cfr_renamed_112[2];
            n6 += spruaf.cfr_renamed_493(n7, 31);
            n7 ^= spruaf.cfr_renamed_493(n6, 24);
            n6 ^= n11;
            n6 += spruaf.cfr_renamed_493(n7, 17);
            n7 ^= spruaf.cfr_renamed_493(n6, 17);
            n6 ^= n11;
            n6 += n7;
            n7 ^= spruaf.cfr_renamed_493(n6, 31);
            n6 ^= n11;
            n6 += spruaf.cfr_renamed_493(n7, 24);
            n7 ^= spruaf.cfr_renamed_493(n6, 16);
            n6 ^= n11;
            n11 = cfr_renamed_112[3];
            n8 += spruaf.cfr_renamed_493(n9, 31);
            n9 ^= spruaf.cfr_renamed_493(n8, 24);
            n8 ^= n11;
            n8 += spruaf.cfr_renamed_493(n9, 17);
            n9 ^= spruaf.cfr_renamed_493(n8, 17);
            n8 ^= n11;
            n8 += n9;
            n9 ^= spruaf.cfr_renamed_493(n8, 31);
            n8 ^= n11;
            n8 += spruaf.cfr_renamed_493(n9, 24);
            n9 ^= spruaf.cfr_renamed_493(n8, 16);
            n8 ^= n11;
            n11 = sprttk.cfr_renamed_10325(n2 ^ n4);
            int n12 = sprttk.cfr_renamed_10325(n3 ^ n5);
            int n13 = n2 ^ n6;
            int n14 = n3 ^ n7;
            int n15 = n4 ^ n8;
            int n16 = n5 ^ n9;
            n6 = n2;
            n7 = n3;
            n8 = n4;
            n9 = n5;
            n2 = n15 ^ n12;
            n3 = n16 ^ n11;
            n4 = n13 ^ n12;
            n5 = n14 ^ n11;
            n10 = ++n;
        }
        arg0[0] = n2;
        arg0[1] = n3;
        arg0[2] = n4;
        arg0[3] = n5;
        arg0[4] = n6;
        arg0[5] = n7;
        arg0[6] = n8;
        arg0[7] = n9;
    }

    private /* synthetic */ void cfr_renamed_10327(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int n;
        if (arg3 > arg2.length - this.cfr_renamed_2) {
            throw new sprwjl(sprozz.cfr_renamed_9("<\u0016'\u0013&\u0017s\u0001&\u00055\u0006!C'\f<C \u000b<\u0011'"));
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0 / 2) {
            int n3 = n + this.cfr_renamed_0 / 2;
            sprttk sprttk2 = this;
            int n4 = this.cfr_renamed_91[n];
            int n5 = sprttk2.cfr_renamed_91[n3];
            int n6 = sprpxe.cfr_renamed_439(arg0, arg1 + n * 4);
            int n7 = sprpxe.cfr_renamed_439(arg0, arg1 + n3 * 4);
            sprttk sprttk3 = this;
            sprttk2.cfr_renamed_91[n] = n5 ^ n6 ^ sprttk3.cfr_renamed_91[sprttk3.cfr_renamed_0 + n];
            sprttk sprttk4 = this;
            sprttk2.cfr_renamed_91[n3] = n4 ^ n5 ^ n7 ^ sprttk4.cfr_renamed_91[sprttk4.cfr_renamed_0 + (n3 & this.cfr_renamed_105)];
            sprpxe.cfr_renamed_437(n6 ^ n4, arg2, arg3 + n * 4);
            sprpxe.cfr_renamed_437(n7 ^ n5, arg2, arg3 + n3 * 4);
            n2 = ++n;
        }
        sprttk sprttk5 = this;
        sprttk.cfr_renamed_10319(sprttk5.cfr_renamed_91, sprttk5.cfr_renamed_126);
        this.cfr_renamed_86 = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        sprtpk sprtpk2;
        byte[] byArray;
        sprbj sprbj2;
        sprtpk sprtpk3 = null;
        if (!(arg1 instanceof sprtxk)) {
            if (!(arg1 instanceof sprkpk)) throw new IllegalArgumentException(sprozz.cfr_renamed_9("\n=\u00152\u000f:\u0007s\u00132\u00112\u000e6\u00176\u0011 C#\u0002 \u00106\u0007s\u0017<C\u0000\u00132\u00118\u000f6"));
            sprbj2 = (sprkpk)arg1;
            sprbj sprbj3 = ((sprkpk)sprbj2).cfr_renamed_284();
            if (sprbj3 instanceof sprtpk) {
                sprtpk3 = (sprtpk)sprbj3;
            }
            byArray = ((sprkpk)sprbj2).cfr_renamed_1205();
            sprtpk2 = sprtpk3;
            this.cfr_renamed_4 = null;
        } else {
            sprbj2 = (sprtxk)arg1;
            sprtpk3 = ((sprtxk)sprbj2).cfr_renamed_1521();
            byArray = ((sprtxk)sprbj2).cfr_renamed_596();
            sprbj sprbj4 = sprbj2;
            this.cfr_renamed_4 = ((sprtxk)sprbj4).cfr_renamed_3388();
            int n = ((sprtxk)sprbj4).cfr_renamed_2404();
            if (n != this.cfr_renamed_152 * 8) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprufba.cfr_renamed_9("K(t'n/fft'n3gfd)pfO\u0007Afq/x#8f")).append(n).toString());
            }
            sprtpk2 = sprtpk3;
        }
        if (sprtpk2 == null) {
            throw new IllegalArgumentException(sprufba.cfr_renamed_9("Q6c4i*gfk(k2\"6c4c+g2g4qfo3q2\"/l%n3f#\"'\"-g?"));
        }
        int n = this.cfr_renamed_133 * 4;
        if (n != sprtpk3.cfr_renamed_4600()) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, this.cfr_renamed_3).append(sprozz.cfr_renamed_9("C!\u0006\"\u0016:\u00116\u0010s\u0006+\u00020\u0017?\u001as")).append(n).append(sprufba.cfr_renamed_9("f`?v#qfm \"-g?")).toString());
        }
        int n2 = this.cfr_renamed_0 * 4;
        if (byArray == null || n2 != byArray.length) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, this.cfr_renamed_3).append(sprozz.cfr_renamed_9("C!\u0006\"\u0016:\u00116\u0010s\u0006+\u00020\u0017?\u001as")).append(n2).append(sprufba.cfr_renamed_9("\"${2g5\")dfK\u0010")).toString());
        }
        sprpxe.cfr_renamed_454(sprtpk3.cfr_renamed_1521(), 0, this.cfr_renamed_31);
        sprpxe.cfr_renamed_454(byArray, 0, this.cfr_renamed_119);
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 128, arg1, sprlrk.cfr_renamed_9915(arg0)));
        this.cfr_renamed_145 = arg0 ? sprxuk.cfr_renamed_112 : sprxuk.cfr_renamed_119;
        this.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_3212(byte arg0) {
        sprttk sprttk2 = this;
        sprttk2.cfr_renamed_10100();
        if (sprttk2.cfr_renamed_79 == this.cfr_renamed_2) {
            sprttk sprttk3 = this;
            sprttk3.cfr_renamed_10318(sprttk3.cfr_renamed_132, 0);
            sprttk3.cfr_renamed_79 = 0;
        }
        this.cfr_renamed_132[this.cfr_renamed_79++] = arg0;
    }

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_10326() {
        int n;
        sprttk sprttk2 = this;
        if (sprttk2.cfr_renamed_79 < sprttk2.cfr_renamed_2) {
            sprttk sprttk3 = this;
            sprttk sprttk4 = this;
            int[] nArray = sprttk3.cfr_renamed_91;
            sprttk sprttk5 = sprttk4;
            int n2 = sprttk4.cfr_renamed_88 - 1;
            nArray[n2] = nArray[n2] ^ this.cfr_renamed_82;
            sprttk3.cfr_renamed_132[this.cfr_renamed_79] = -128;
            while (++sprttk5.cfr_renamed_79 < this.cfr_renamed_2) {
                sprttk sprttk6 = this;
                sprttk5 = sprttk6;
                this.cfr_renamed_132[sprttk6.cfr_renamed_79] = 0;
            }
        } else {
            sprttk sprttk7 = this;
            int[] nArray = sprttk7.cfr_renamed_91;
            int n3 = sprttk7.cfr_renamed_88 - 1;
            nArray[n3] = nArray[n3] ^ this.cfr_renamed_107;
        }
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_0 / 2) {
            int n5 = n + this.cfr_renamed_0 / 2;
            sprttk sprttk8 = this;
            int n6 = sprttk8.cfr_renamed_91[n];
            int n7 = sprttk8.cfr_renamed_91[n5];
            int n8 = sprpxe.cfr_renamed_439(sprttk8.cfr_renamed_132, n * 4);
            int n9 = sprpxe.cfr_renamed_439(sprttk8.cfr_renamed_132, n5 * 4);
            sprttk sprttk9 = this;
            sprttk8.cfr_renamed_91[n] = n7 ^ n8 ^ sprttk9.cfr_renamed_91[sprttk9.cfr_renamed_0 + n];
            sprttk sprttk10 = this;
            sprttk8.cfr_renamed_91[n5] = n6 ^ n7 ^ n9 ^ sprttk10.cfr_renamed_91[sprttk10.cfr_renamed_0 + (n5 & this.cfr_renamed_105)];
            n4 = ++n;
        }
        sprttk sprttk11 = this;
        sprttk.cfr_renamed_10319(sprttk11.cfr_renamed_91, sprttk11.cfr_renamed_272);
    }

    private /* synthetic */ void cfr_renamed_3402(boolean arg0) {
        sprttk sprttk2;
        block8: {
            if (arg0) {
                this.cfr_renamed_114 = null;
            }
            sproze.cfr_renamed_3408(this.cfr_renamed_132);
            this.cfr_renamed_79 = 0;
            this.cfr_renamed_86 = 0;
            switch (this.cfr_renamed_145) {
                case cfr_renamed_119: 
                case cfr_renamed_112: {
                    break;
                }
                case cfr_renamed_152: 
                case cfr_renamed_2: 
                case cfr_renamed_1: {
                    while (false) {
                    }
                    sprttk2 = this;
                    this.cfr_renamed_145 = sprxuk.cfr_renamed_119;
                    break block8;
                }
                case cfr_renamed_0: 
                case cfr_renamed_4: 
                case cfr_renamed_86: {
                    this.cfr_renamed_145 = sprxuk.cfr_renamed_4;
                    return;
                }
                default: {
                    throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprozz.cfr_renamed_9("C=\u00066\u0007 C'\fs\u00016C:\r:\u0017:\u0002?\n)\u00067")).toString());
                }
            }
            sprttk2 = this;
        }
        System.arraycopy(sprttk2.cfr_renamed_119, 0, this.cfr_renamed_91, 0, this.cfr_renamed_0);
        sprttk sprttk3 = this;
        sprttk sprttk4 = this;
        System.arraycopy(sprttk3.cfr_renamed_31, 0, sprttk4.cfr_renamed_91, sprttk4.cfr_renamed_0, this.cfr_renamed_133);
        sprttk sprttk5 = this;
        sprttk.cfr_renamed_10319(sprttk3.cfr_renamed_91, sprttk5.cfr_renamed_272);
        if (sprttk5.cfr_renamed_4 != null) {
            sprttk sprttk6 = this;
            sprttk6.cfr_renamed_2417(this.cfr_renamed_4, 0, sprttk6.cfr_renamed_4.length);
        }
    }

    @Override
    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprddl {
        byte[] byArray = new byte[1];
        byArray[0] = arg0;
        return this.cfr_renamed_505(byArray, 0, 1, arg1, arg2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_10100() {
        switch (this.cfr_renamed_145) {
            case cfr_renamed_119: {
                this.cfr_renamed_145 = sprxuk.cfr_renamed_152;
                return;
            }
            case cfr_renamed_112: {
                this.cfr_renamed_145 = sprxuk.cfr_renamed_86;
                return;
            }
            case cfr_renamed_152: 
            case cfr_renamed_86: {
                return;
            }
            case cfr_renamed_4: {
                throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprufba.cfr_renamed_9("\"%c(l)vf`#\"4g3q#ffd)pfg(a4{6v/m(")).toString());
            }
        }
        throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprozz.cfr_renamed_9("C=\u00066\u0007 C'\fs\u00016C:\r:\u0017:\u0002?\n)\u00067")).toString());
    }

    static {
        int[] nArray = new int[8];
        nArray[0] = -1209970334;
        nArray[1] = -1083090816;
        nArray[2] = 951376470;
        nArray[3] = 844003128;
        nArray[4] = -1156479509;
        nArray[5] = 1333558103;
        nArray[6] = -809524792;
        nArray[7] = -1028445891;
        cfr_renamed_112 = nArray;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws IllegalStateException, sprull {
        sprttk sprttk2;
        int n;
        int n2;
        int n3;
        boolean bl = this.cfr_renamed_10098();
        if (bl) {
            sprttk sprttk3 = this;
            n3 = sprttk3.cfr_renamed_79 + sprttk3.cfr_renamed_152;
            n2 = arg1;
        } else {
            sprttk sprttk4 = this;
            if (sprttk4.cfr_renamed_79 < sprttk4.cfr_renamed_152) {
                throw new sprull(sprufba.cfr_renamed_9("f'v'\"2m)\"5j)p2"));
            }
            sprttk sprttk5 = this;
            sprttk5.cfr_renamed_79 -= this.cfr_renamed_152;
            n3 = sprttk5.cfr_renamed_79;
            n2 = arg1;
        }
        if (n2 > arg0.length - n3) {
            throw new sprwjl(sprozz.cfr_renamed_9("<\u0016'\u0013&\u0017s\u0001&\u00055\u0006!C'\f<C \u000b<\u0011'"));
        }
        if (this.cfr_renamed_86 || this.cfr_renamed_79 > 0) {
            int n4;
            sprttk sprttk6 = this;
            int[] nArray = sprttk6.cfr_renamed_91;
            int n5 = sprttk6.cfr_renamed_88 - 1;
            sprttk sprttk7 = this;
            nArray[n5] = nArray[n5] ^ (sprttk7.cfr_renamed_79 < sprttk7.cfr_renamed_2 ? this.cfr_renamed_185 : this.cfr_renamed_102);
            int[] nArray2 = new int[this.cfr_renamed_0];
            int n6 = n4 = 0;
            while (n6 < this.cfr_renamed_79) {
                int n7 = n4 >>> 2;
                int n8 = nArray2[n7] | (this.cfr_renamed_132[n4] & 0xFF) << ((n4 & 3) << 3);
                nArray2[n7] = n8;
                n6 = ++n4;
            }
            sprttk sprttk8 = this;
            if (sprttk8.cfr_renamed_79 < sprttk8.cfr_renamed_2) {
                if (!bl) {
                    sprttk sprttk9 = this;
                    int[] nArray3 = nArray2;
                    n4 = (sprttk9.cfr_renamed_79 & 3) << 3;
                    int n9 = this.cfr_renamed_79 >>> 2;
                    sprttk sprttk10 = this;
                    nArray3[n9] = nArray3[n9] | sprttk10.cfr_renamed_91[sprttk10.cfr_renamed_79 >>> 2] >>> n4 << n4;
                    int n10 = n4 = (sprttk9.cfr_renamed_79 >>> 2) + 1;
                    System.arraycopy(sprttk9.cfr_renamed_91, n10, nArray2, n10, this.cfr_renamed_0 - n4);
                }
                int n11 = this.cfr_renamed_79 >>> 2;
                nArray2[n11] = nArray2[n11] ^ 128 << ((this.cfr_renamed_79 & 3) << 3);
            }
            int n12 = n4 = 0;
            while (n12 < this.cfr_renamed_0 / 2) {
                int[] nArray4;
                int n13 = n4 + this.cfr_renamed_0 / 2;
                sprttk sprttk11 = this;
                int n14 = sprttk11.cfr_renamed_91[n4];
                int n15 = sprttk11.cfr_renamed_91[n13];
                sprttk sprttk12 = this;
                if (bl) {
                    int n16 = n4;
                    sprttk sprttk13 = this;
                    sprttk12.cfr_renamed_91[n16] = n15 ^ nArray2[n16] ^ sprttk13.cfr_renamed_91[sprttk13.cfr_renamed_0 + n4];
                    nArray4 = nArray2;
                    int n17 = n13;
                    sprttk sprttk14 = this;
                    this.cfr_renamed_91[n17] = n14 ^ n15 ^ nArray2[n17] ^ sprttk14.cfr_renamed_91[sprttk14.cfr_renamed_0 + (n13 & this.cfr_renamed_105)];
                } else {
                    int n18 = n4;
                    sprttk sprttk15 = this;
                    sprttk12.cfr_renamed_91[n18] = n14 ^ n15 ^ nArray2[n18] ^ sprttk15.cfr_renamed_91[sprttk15.cfr_renamed_0 + n4];
                    nArray4 = nArray2;
                    int n19 = n13;
                    sprttk sprttk16 = this;
                    this.cfr_renamed_91[n19] = n14 ^ nArray2[n19] ^ sprttk16.cfr_renamed_91[sprttk16.cfr_renamed_0 + (n13 & this.cfr_renamed_105)];
                }
                int n20 = n4++;
                nArray4[n20] = nArray4[n20] ^ n14;
                int n21 = n13;
                nArray2[n21] = nArray2[n21] ^ n15;
                n12 = n4;
            }
            int n22 = n4 = 0;
            while (n22 < this.cfr_renamed_79) {
                int n23 = arg1++;
                byte by = (byte)(nArray2[n4 >>> 2] >>> ((n4 & 3) << 3));
                arg0[n23] = by;
                n22 = ++n4;
            }
            sprttk sprttk17 = this;
            sprttk.cfr_renamed_10319(sprttk17.cfr_renamed_91, sprttk17.cfr_renamed_272);
        }
        int n24 = n = 0;
        while (n24 < this.cfr_renamed_133) {
            sprttk sprttk18 = this;
            int[] nArray = sprttk18.cfr_renamed_91;
            int n25 = sprttk18.cfr_renamed_0 + n;
            int n26 = nArray[n25] ^ this.cfr_renamed_31[n];
            nArray[n25] = n26;
            n24 = ++n;
        }
        sprttk sprttk19 = this;
        sprttk19.cfr_renamed_114 = new byte[sprttk19.cfr_renamed_152];
        sprttk sprttk20 = this;
        sprpxe.cfr_renamed_5171(sprttk19.cfr_renamed_91, sprttk20.cfr_renamed_0, sprttk20.spr\ufe34, this.cfr_renamed_114, 0);
        sprttk sprttk21 = this;
        if (bl) {
            System.arraycopy(sprttk21.cfr_renamed_114, 0, arg0, arg1, this.cfr_renamed_152);
            sprttk2 = this;
        } else {
            sprttk sprttk22 = this;
            if (!sproze.cfr_renamed_5245(sprttk21.cfr_renamed_152, this.cfr_renamed_114, 0, sprttk22.cfr_renamed_132, sprttk22.cfr_renamed_79)) {
                throw new sprull(new StringBuilder().insert(0, this.cfr_renamed_3).append(sprufba.cfr_renamed_9("fo'aff)g5\"(m2\"+c2a.")).toString());
            }
            sprttk2 = this;
        }
        sprttk2.cfr_renamed_3402(!bl);
        return n3;
    }

    private /* synthetic */ void cfr_renamed_10328(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        int n;
        if (arg3 > arg2.length - this.cfr_renamed_2) {
            throw new sprwjl(sprozz.cfr_renamed_9("<\u0016'\u0013&\u0017s\u0001&\u00055\u0006!C'\f<C \u000b<\u0011'"));
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0 / 2) {
            int n3 = n + this.cfr_renamed_0 / 2;
            sprttk sprttk2 = this;
            int n4 = this.cfr_renamed_91[n];
            int n5 = sprttk2.cfr_renamed_91[n3];
            int n6 = sprpxe.cfr_renamed_439(arg0, arg1 + n * 4);
            int n7 = sprpxe.cfr_renamed_439(arg0, arg1 + n3 * 4);
            sprttk sprttk3 = this;
            sprttk2.cfr_renamed_91[n] = n4 ^ n5 ^ n6 ^ sprttk3.cfr_renamed_91[sprttk3.cfr_renamed_0 + n];
            sprttk sprttk4 = this;
            sprttk2.cfr_renamed_91[n3] = n4 ^ n7 ^ sprttk4.cfr_renamed_91[sprttk4.cfr_renamed_0 + (n3 & this.cfr_renamed_105)];
            sprpxe.cfr_renamed_437(n6 ^ n4, arg2, arg3 + n * 4);
            sprpxe.cfr_renamed_437(n7 ^ n5, arg2, arg3 + n3 * 4);
            n2 = ++n;
        }
        sprttk sprttk5 = this;
        sprttk.cfr_renamed_10319(sprttk5.cfr_renamed_91, sprttk5.cfr_renamed_126);
        this.cfr_renamed_86 = true;
    }

    public static void cfr_renamed_10329(sprwdl arg0, int[] arg1, int arg2) {
        if (null == arg0) {
            throw new NullPointerException(sprufba.cfr_renamed_9("V.k5\"+g2j)ffk5\")l*{fd)pfw5gf`?\"\u0015r'p-n#F/e#q2"));
        }
        sprttk.cfr_renamed_10321(arg1, arg2);
    }

    private static /* synthetic */ int cfr_renamed_10325(int arg0) {
        return spruaf.cfr_renamed_493(arg0, 16) ^ arg0 & 0xFFFF;
    }

    /*
     * WARNING - void declaration
     */
    public sprttk(sprexk sprexk2) {
        int n;
        int n2;
        int n3;
        void arg0;
        switch (sprtzk.cfr_renamed_3[arg0.ordinal()]) {
            case 1: {
                while (false) {
                }
                sprttk sprttk2 = this;
                sprttk sprttk3 = this;
                this.cfr_renamed_1 = 128;
                sprttk3.cfr_renamed_93 = 128;
                n3 = 128;
                n2 = 256;
                n = 128;
                this.cfr_renamed_126 = 7;
                sprttk3.cfr_renamed_272 = 10;
                this.cfr_renamed_3 = "SCHWAEMM128-128";
                break;
            }
            case 2: {
                sprttk sprttk2 = this;
                sprttk sprttk4 = this;
                this.cfr_renamed_1 = 128;
                sprttk4.cfr_renamed_93 = 256;
                n3 = 128;
                n2 = 384;
                n = 128;
                this.cfr_renamed_126 = 7;
                sprttk4.cfr_renamed_272 = 11;
                this.cfr_renamed_3 = "SCHWAEMM256-128";
                break;
            }
            case 3: {
                sprttk sprttk2 = this;
                sprttk sprttk5 = this;
                this.cfr_renamed_1 = 192;
                sprttk5.cfr_renamed_93 = 192;
                n3 = 192;
                n2 = 384;
                n = 192;
                this.cfr_renamed_126 = 7;
                sprttk5.cfr_renamed_272 = 11;
                this.cfr_renamed_3 = "SCHWAEMM192-192";
                break;
            }
            case 4: {
                sprttk sprttk2 = this;
                sprttk sprttk6 = this;
                this.cfr_renamed_1 = 256;
                sprttk6.cfr_renamed_93 = 256;
                n3 = 256;
                n2 = 512;
                n = 256;
                this.cfr_renamed_126 = 8;
                sprttk6.cfr_renamed_272 = 12;
                this.cfr_renamed_3 = "SCHWAEMM256-256";
                break;
            }
            default: {
                throw new IllegalArgumentException(sprozz.cfr_renamed_9("\u001a\r%\u0002?\n7C7\u00065\n=\n'\n<\rs\f5C\u0000 \u001b4\u0012&\u001e.s\n=\u0010'\u0002=\u00006"));
            }
        }
        sprttk2.cfr_renamed_133 = this.cfr_renamed_1 >>> 5;
        int n4 = n3;
        this.cfr_renamed_96 = this.cfr_renamed_1 >>> 3;
        this.spr\ufe34 = n4 >>> 5;
        this.cfr_renamed_152 = n4 >>> 3;
        this.cfr_renamed_88 = n2 >>> 5;
        this.cfr_renamed_0 = this.cfr_renamed_93 >>> 5;
        this.cfr_renamed_2 = this.cfr_renamed_93 >>> 3;
        int n5 = n >>> 6;
        int n6 = n >>> 5;
        this.cfr_renamed_105 = this.cfr_renamed_0 > n6 ? n6 - 1 : -1;
        sprttk sprttk7 = this;
        sprttk sprttk8 = this;
        sprttk8.cfr_renamed_82 = 1 << n5 << 24;
        sprttk8.cfr_renamed_107 = (1 ^ 1 << n5) << 24;
        this.cfr_renamed_185 = (2 ^ 1 << n5) << 24;
        sprttk7.cfr_renamed_102 = (3 ^ 1 << n5) << 24;
        sprttk7.cfr_renamed_91 = new int[this.cfr_renamed_88];
        sprttk7.cfr_renamed_31 = new int[sprttk7.cfr_renamed_133];
        sprttk7.cfr_renamed_119 = new int[sprttk7.cfr_renamed_0];
        sprttk7.cfr_renamed_137 = sprttk7.cfr_renamed_2 + this.cfr_renamed_152;
        sprttk7.cfr_renamed_132 = new byte[sprttk7.cfr_renamed_137];
    }
}

