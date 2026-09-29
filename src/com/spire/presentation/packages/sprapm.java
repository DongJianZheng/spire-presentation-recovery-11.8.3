/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.spravm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdcm;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnom;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsqaa;
import com.spire.presentation.packages.sprtgn;
import com.spire.presentation.packages.sprwum;
import com.spire.presentation.packages.sprycn;
import java.math.BigInteger;

public class sprapm {
    private spravm cfr_renamed_137;
    private static final int cfr_renamed_79 = 4;
    private spraem cfr_renamed_107;
    private static final int cfr_renamed_132 = 0;
    private static final int cfr_renamed_102 = 1;
    private sprhgm cfr_renamed_93;
    private sprdcm cfr_renamed_86;
    private static final int cfr_renamed_152 = 3;
    private sprnom cfr_renamed_112;
    private static final int cfr_renamed_119 = 1;
    private static final int cfr_renamed_91 = 2;
    private BigInteger cfr_renamed_0;
    private final sprwum cfr_renamed_1;
    private spraem cfr_renamed_2;
    private int cfr_renamed_3;
    private spraem cfr_renamed_4;

    public void cfr_renamed_9837(sprhgm arg0) {
        if (this.cfr_renamed_137 != null) {
            throw new IllegalStateException(sprsqaa.cfr_renamed_9("Q\u0011\\\u001e]\u0004\u0012\u0013Z\u0011\\\u0017WPW\bF\u0015\\\u0003[\u001f\\\u0003\u0012\u0019\\PW\b[\u0003F\u0019\\\u0017\u00124d3a\"W\u0001G\u0015A\u0004{\u001eT\u001f@\u001dS\u0004[\u001f\\"));
        }
        this.cfr_renamed_93 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_9838(sprigm sprigm2) {
        void arg0;
        this.cfr_renamed_9840(new spraem((sprigm)arg0));
    }

    public spravm cfr_renamed_1451() {
        int n;
        sprrvm sprrvm2 = new sprrvm(9);
        if (this.cfr_renamed_3 != 1) {
            sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_3));
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_1);
        if (this.cfr_renamed_0 != null) {
            sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_0));
        }
        if (this.cfr_renamed_112 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_112);
        }
        int[] nArray = new int[5];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        nArray[4] = 4;
        int[] nArray2 = nArray;
        sprco[] sprcoArray = new sprco[5];
        sprcoArray[0] = this.cfr_renamed_107;
        sprcoArray[1] = this.cfr_renamed_86;
        sprcoArray[2] = this.cfr_renamed_2;
        sprcoArray[3] = this.cfr_renamed_4;
        sprcoArray[4] = this.cfr_renamed_93;
        sprco[] sprcoArray2 = sprcoArray;
        int n2 = n = 0;
        while (n2 < nArray2.length) {
            int n3 = nArray2[n];
            sprco sprco2 = sprcoArray2[n];
            if (sprco2 != null) {
                sprrvm2.cfr_renamed_5004(new sprycn(false, n3, sprco2));
            }
            n2 = ++n;
        }
        return spravm.cfr_renamed_23(new sprcen(sprrvm2));
    }

    public sprapm(sprwum sprwum2) {
        sprapm sprapm2 = this;
        sprapm2.cfr_renamed_3 = 1;
        sprapm2.cfr_renamed_1 = sprwum2;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_9842(sprigm sprigm2) {
        void arg0;
        this.cfr_renamed_9841(new spraem((sprigm)arg0));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 5;
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 3 << 1;
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

    /*
     * Unable to fully structure code
     */
    public void cfr_renamed_2602(BigInteger arg0) {
        if (this.cfr_renamed_137 == null) ** GOTO lbl17
        if (this.cfr_renamed_137.cfr_renamed_596() == null) {
            v0 = this;
            this.cfr_renamed_0 = arg0;
        } else {
            var2_2 = this.cfr_renamed_137.cfr_renamed_596().toByteArray();
            var3_3 = sprhdf.cfr_renamed_514(arg0);
            var4_4 = new byte[var2_2.length + var3_3.length];
            System.arraycopy(var2_2, 0, var4_4, 0, var2_2.length);
            System.arraycopy(var3_3, 0, var4_4, var2_2.length, var3_3.length);
            v1 = this;
            v1.cfr_renamed_0 = new BigInteger(var4_4);
lbl17:
            // 2 sources

            v0 = this;
        }
        v0.cfr_renamed_0 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprapm(spravm spravm2) {
        void arg0;
        sprapm sprapm2 = this;
        void v1 = arg0;
        sprapm sprapm3 = this;
        void v3 = arg0;
        sprapm sprapm4 = this;
        this.cfr_renamed_3 = 1;
        sprapm4.cfr_renamed_137 = arg0;
        sprapm4.cfr_renamed_1 = arg0.cfr_renamed_2594();
        this.cfr_renamed_3 = v3.cfr_renamed_3();
        sprapm3.cfr_renamed_0 = v3.cfr_renamed_596();
        sprapm3.cfr_renamed_112 = arg0.cfr_renamed_2590();
        this.cfr_renamed_86 = v1.cfr_renamed_2595();
        sprapm2.cfr_renamed_2 = v1.cfr_renamed_2599();
        sprapm2.cfr_renamed_4 = spravm2.cfr_renamed_2596();
    }

    public void cfr_renamed_9829(sprnom arg0) {
        if (this.cfr_renamed_137 != null) {
            throw new IllegalStateException(sprtgn.cfr_renamed_9(",,!# 9o.',!**m=(>8*>;m;$\"(o$!m*5&>;$!*o\t\u0019\u000e\u001c\u001f*<:(<9\u0006#)\"= .9&\"!"));
        }
        this.cfr_renamed_112 = arg0;
    }

    public void cfr_renamed_4767(int arg0) {
        if (this.cfr_renamed_137 != null) {
            throw new IllegalStateException(sprsqaa.cfr_renamed_9("\u0013S\u001e\\\u001fFPQ\u0018S\u001eU\u0015\u0012\u0006W\u0002A\u0019]\u001e\u0012\u0019\\PW\b[\u0003F\u0019\\\u0017\u00124d3a\"W\u0001G\u0015A\u0004{\u001eT\u001f@\u001dS\u0004[\u001f\\"));
        }
        this.cfr_renamed_3 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_9839(sprigm sprigm2) {
        void arg0;
        this.cfr_renamed_11257(new spraem((sprigm)arg0));
    }

    public void cfr_renamed_11258(sprdcm arg0) {
        if (this.cfr_renamed_137 != null) {
            throw new IllegalStateException(sprtgn.cfr_renamed_9(",,!# 9o.',!**m=(>8*>;m?\"#$,4o$!m*5&>;$!*o\t\u0019\u000e\u001c\u001f*<:(<9\u0006#)\"= .9&\"!"));
        }
        this.cfr_renamed_86 = arg0;
    }

    public void cfr_renamed_9840(spraem arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_9841(spraem arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public void cfr_renamed_11257(spraem arg0) {
        this.cfr_renamed_107 = arg0;
    }
}

