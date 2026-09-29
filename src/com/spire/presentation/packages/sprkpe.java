/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfl;
import com.spire.presentation.packages.sprgkz;
import com.spire.presentation.packages.sprnjj;
import com.spire.presentation.packages.sprtte;
import java.io.IOException;
import java.io.InputStream;

public class sprkpe
extends InputStream
implements sprfl {
    public char cfr_renamed_1221;
    private static final int cfr_renamed_725 = 3;
    private InputStream cfr_renamed_134;
    public int cfr_renamed_954;
    public int cfr_renamed_805;
    public int cfr_renamed_131;
    public int cfr_renamed_722;
    public int cfr_renamed_955;
    private char[] cfr_renamed_1228;
    public int cfr_renamed_1260;
    private char[] cfr_renamed_499;
    private int cfr_renamed_135;
    private int[] cfr_renamed_956;
    private char[] cfr_renamed_952;
    private int cfr_renamed_728;
    private static final int cfr_renamed_128 = 2;
    public int cfr_renamed_957;
    private static final int cfr_renamed_314 = 7;
    private static final int cfr_renamed_951 = 4;
    private sprtte cfr_renamed_84;
    private static final int cfr_renamed_723 = 5;
    private int cfr_renamed_1226;
    public int cfr_renamed_287;
    private int cfr_renamed_724;
    private int cfr_renamed_953;
    private boolean cfr_renamed_133;
    private int[][] cfr_renamed_185;
    private int[][] spr\ufe34;
    private int cfr_renamed_82;
    private char[] cfr_renamed_126;
    private int cfr_renamed_88;
    private int cfr_renamed_31;
    private int[][] cfr_renamed_272;
    private boolean cfr_renamed_145;
    public int cfr_renamed_114;
    private int cfr_renamed_96;
    private int cfr_renamed_105;
    private int[] cfr_renamed_137;
    private int[] cfr_renamed_79;
    private static final int cfr_renamed_107 = 1;
    private static final int cfr_renamed_132 = 6;
    private int cfr_renamed_102;
    private char[] cfr_renamed_0;
    private boolean[] cfr_renamed_1;
    private int cfr_renamed_2;

    private /* synthetic */ void cfr_renamed_4975() {
        sprkpe sprkpe2 = this;
        if (sprkpe2.cfr_renamed_722 < sprkpe2.cfr_renamed_1221) {
            sprkpe sprkpe3 = this;
            sprkpe3.cfr_renamed_953 = sprkpe3.cfr_renamed_954;
            sprkpe3.cfr_renamed_84.cfr_renamed_4946(this.cfr_renamed_954);
            ++sprkpe3.cfr_renamed_722;
            return;
        }
        this.cfr_renamed_724 = 2;
        ++this.cfr_renamed_955;
        this.cfr_renamed_287 = 0;
        this.cfr_renamed_4976();
    }

    /*
     * WARNING - void declaration
     */
    public sprkpe(InputStream inputStream) throws IOException {
        void arg0;
        sprkpe sprkpe2 = this;
        sprkpe sprkpe3 = this;
        sprkpe sprkpe4 = this;
        sprkpe sprkpe5 = this;
        this.cfr_renamed_84 = new sprtte();
        this.cfr_renamed_1 = new boolean[256];
        sprkpe4.cfr_renamed_952 = new char[256];
        sprkpe4.cfr_renamed_0 = new char[256];
        sprkpe3.cfr_renamed_1228 = new char[18002];
        sprkpe3.cfr_renamed_126 = new char[18002];
        sprkpe2.cfr_renamed_137 = new int[256];
        sprkpe2.cfr_renamed_185 = new int[6][258];
        this.cfr_renamed_272 = new int[6][258];
        this.spr\ufe34 = new int[6][258];
        sprkpe sprkpe6 = this;
        sprkpe sprkpe7 = this;
        sprkpe sprkpe8 = this;
        sprkpe sprkpe9 = this;
        this.cfr_renamed_956 = new int[6];
        sprkpe9.cfr_renamed_145 = false;
        sprkpe9.cfr_renamed_953 = -1;
        sprkpe8.cfr_renamed_724 = 1;
        sprkpe8.cfr_renamed_131 = 0;
        sprkpe7.cfr_renamed_1260 = 0;
        sprkpe7.cfr_renamed_499 = null;
        this.cfr_renamed_79 = null;
        sprkpe6.cfr_renamed_4977((InputStream)arg0);
        this.cfr_renamed_1391();
        sprkpe6.cfr_renamed_4954();
        sprkpe6.cfr_renamed_4978();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ int cfr_renamed_4979(int arg0) {
        sprkpe sprkpe2 = this;
        while (true) {
            char c;
            if (sprkpe2.cfr_renamed_105 >= arg0) {
                sprkpe sprkpe3 = this;
                int n = sprkpe3.cfr_renamed_728 >> sprkpe3.cfr_renamed_105 - arg0 & (1 << arg0) - 1;
                sprkpe3.cfr_renamed_105 -= arg0;
                return n;
            }
            char c2 = '\u0000';
            try {
                c = c2 = (char)this.cfr_renamed_134.read();
            }
            catch (IOException iOException) {
                sprkpe.cfr_renamed_4980();
                c = c2;
            }
            if (c == '\uffffffff') {
                sprkpe.cfr_renamed_4980();
            }
            char c3 = c2;
            sprkpe sprkpe4 = this;
            sprkpe2 = sprkpe4;
            sprkpe4.cfr_renamed_728 = sprkpe4.cfr_renamed_728 << 8 | c3 & 0xFF;
            sprkpe4.cfr_renamed_105 += 8;
        }
    }

    private /* synthetic */ void cfr_renamed_4981() {
        sprkpe sprkpe2 = this;
        if (sprkpe2.cfr_renamed_955 <= sprkpe2.cfr_renamed_2) {
            sprkpe sprkpe3 = this;
            sprkpe3.cfr_renamed_805 = sprkpe3.cfr_renamed_954;
            sprkpe3.cfr_renamed_954 = sprkpe3.cfr_renamed_499[this.cfr_renamed_114];
            sprkpe3.cfr_renamed_114 = sprkpe3.cfr_renamed_79[this.cfr_renamed_114];
            ++sprkpe3.cfr_renamed_955;
            this.cfr_renamed_953 = sprkpe3.cfr_renamed_954;
            this.cfr_renamed_724 = 6;
            this.cfr_renamed_84.cfr_renamed_4946(this.cfr_renamed_954);
            return;
        }
        sprkpe sprkpe4 = this;
        sprkpe4.cfr_renamed_4971();
        sprkpe4.cfr_renamed_4954();
        sprkpe4.cfr_renamed_4978();
    }

    private /* synthetic */ int cfr_renamed_4982(int arg0) {
        return this.cfr_renamed_4979(arg0);
    }

    private /* synthetic */ void cfr_renamed_4976() {
        sprkpe sprkpe2 = this;
        if (sprkpe2.cfr_renamed_955 <= sprkpe2.cfr_renamed_2) {
            sprkpe sprkpe3 = this;
            sprkpe3.cfr_renamed_805 = sprkpe3.cfr_renamed_954;
            sprkpe3.cfr_renamed_954 = sprkpe3.cfr_renamed_499[this.cfr_renamed_114];
            sprkpe3.cfr_renamed_114 = sprkpe3.cfr_renamed_79[this.cfr_renamed_114];
            if (sprkpe3.cfr_renamed_131 == 0) {
                sprkpe sprkpe4 = this;
                this.cfr_renamed_131 = cfr_renamed_2[sprkpe4.cfr_renamed_1260];
                ++sprkpe4.cfr_renamed_1260;
                if (this.cfr_renamed_1260 == 512) {
                    this.cfr_renamed_1260 = 0;
                }
            }
            sprkpe sprkpe5 = this;
            --sprkpe5.cfr_renamed_131;
            sprkpe5.cfr_renamed_954 = sprkpe5.cfr_renamed_954 ^ (this.cfr_renamed_131 == 1 ? 1 : 0);
            sprkpe sprkpe6 = this;
            ++sprkpe6.cfr_renamed_955;
            this.cfr_renamed_953 = sprkpe6.cfr_renamed_954;
            this.cfr_renamed_724 = 3;
            this.cfr_renamed_84.cfr_renamed_4946(this.cfr_renamed_954);
            return;
        }
        sprkpe sprkpe7 = this;
        sprkpe7.cfr_renamed_4971();
        sprkpe7.cfr_renamed_4954();
        sprkpe7.cfr_renamed_4978();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_4965() {
        try {
            if (this.cfr_renamed_134 == null) return;
            if (this.cfr_renamed_134 == System.in) return;
            this.cfr_renamed_134.close();
            this.cfr_renamed_134 = null;
            return;
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private /* synthetic */ void cfr_renamed_4983() {
        int n;
        int n2;
        int n3;
        int n4;
        char[][] cArray = new char[6][258];
        boolean[] blArray = new boolean[16];
        int n5 = n4 = 0;
        while (n5 < 16) {
            blArray[n4] = this.cfr_renamed_4979(1) == 1;
            n5 = ++n4;
        }
        int n6 = n4 = 0;
        while (n6 < 256) {
            this.cfr_renamed_1[n4++] = false;
            n6 = n4;
        }
        int n7 = n4 = 0;
        while (n7 < 16) {
            if (blArray[n4]) {
                int n8 = n3 = 0;
                while (n8 < 16) {
                    if (this.cfr_renamed_4979(1) == 1) {
                        this.cfr_renamed_1[n4 * 16 + n3] = true;
                    }
                    n8 = ++n3;
                }
            }
            n7 = ++n4;
        }
        sprkpe sprkpe2 = this;
        sprkpe2.cfr_renamed_4955();
        int n9 = sprkpe2.cfr_renamed_1226 + 2;
        int n10 = sprkpe2.cfr_renamed_4979(3);
        int n11 = sprkpe2.cfr_renamed_4979(15);
        int n12 = n4 = 0;
        while (n12 < n11) {
            n3 = 0;
            sprkpe sprkpe3 = this;
            while (sprkpe3.cfr_renamed_4979(1) == 1) {
                sprkpe3 = this;
                ++n3;
            }
            this.cfr_renamed_126[n4++] = (char)n3;
            n12 = n4;
        }
        char[] cArray2 = new char[6];
        int n13 = n2 = 0;
        while (n13 < n10) {
            int n14 = n2;
            cArray2[n14] = n14;
            n13 = n2 = (int)((char)(n14 + 1));
        }
        int n15 = n4 = 0;
        while (n15 < n11) {
            n2 = this.cfr_renamed_126[n4];
            char c = cArray2[n2];
            int n16 = n2;
            while (n16 > 0) {
                int n17 = n2;
                cArray2[n17] = cArray2[n2 - 1];
                n16 = n2 = (int)((char)(n17 - 1));
            }
            cArray2[0] = c;
            this.cfr_renamed_1228[n4++] = c;
            n15 = n4;
        }
        int n18 = n = 0;
        while (n18 < n10) {
            int n19 = this.cfr_renamed_4979(5);
            int n20 = n4 = 0;
            while (n20 < n9) {
                sprkpe sprkpe4 = this;
                while (sprkpe4.cfr_renamed_4979(1) == 1) {
                    if (this.cfr_renamed_4979(1) == 0) {
                        sprkpe4 = this;
                        ++n19;
                        continue;
                    }
                    --n19;
                    sprkpe4 = this;
                }
                cArray[n][n4++] = (char)n19;
                n20 = n4;
            }
            n18 = ++n;
        }
        int n21 = n = 0;
        while (n21 < n10) {
            int n22 = 32;
            char c = '\u0000';
            int n23 = n4 = 0;
            while (n23 < n9) {
                if (cArray[n][n4] > c) {
                    c = cArray[n][n4];
                }
                if (cArray[n][n4] < n22) {
                    n22 = cArray[n][n4];
                }
                n23 = ++n4;
            }
            sprkpe sprkpe5 = this;
            sprkpe sprkpe6 = this;
            sprkpe6.cfr_renamed_4984(sprkpe5.cfr_renamed_185[n], this.cfr_renamed_272[n], sprkpe6.spr\ufe34[n], cArray[n], n22, c, n9);
            sprkpe5.cfr_renamed_956[n++] = n22;
            n21 = n;
        }
    }

    private /* synthetic */ void cfr_renamed_4954() {
        sprkpe sprkpe2;
        sprkpe sprkpe3 = this;
        char c = sprkpe3.cfr_renamed_4985();
        char c2 = sprkpe3.cfr_renamed_4985();
        char c3 = sprkpe3.cfr_renamed_4985();
        char c4 = sprkpe3.cfr_renamed_4985();
        char c5 = sprkpe3.cfr_renamed_4985();
        char c6 = sprkpe3.cfr_renamed_4985();
        if (c == '\u0017' && c2 == 'r' && c3 == 'E' && c4 == '8' && c5 == 'P' && c6 == '\u0090') {
            this.cfr_renamed_4986();
            return;
        }
        if (c != '1' || c2 != 'A' || c3 != 'Y' || c4 != '&' || c5 != 'S' || c6 != 'Y') {
            System.out.println(sprgkz.cfr_renamed_9("\u0002:\u0002H\u0004\u001a3\u00073"));
            this.cfr_renamed_145 = true;
            return;
        }
        this.cfr_renamed_88 = this.cfr_renamed_4987();
        if (this.cfr_renamed_4979(1) == 1) {
            sprkpe2 = this;
            this.cfr_renamed_133 = true;
        } else {
            sprkpe2 = this;
            this.cfr_renamed_133 = false;
        }
        sprkpe2.cfr_renamed_4988();
        this.cfr_renamed_84.cfr_renamed_4945();
        this.cfr_renamed_724 = 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int read() {
        if (this.cfr_renamed_145) {
            return -1;
        }
        sprkpe sprkpe2 = this;
        int n = sprkpe2.cfr_renamed_953;
        switch (sprkpe2.cfr_renamed_724) {
            case 1: {
                return n;
            }
            case 2: {
                return n;
            }
            case 3: {
                this.cfr_renamed_4989();
                return n;
            }
            case 4: {
                this.cfr_renamed_4975();
                return n;
            }
            case 5: {
                return n;
            }
            case 6: {
                this.cfr_renamed_4990();
                return n;
            }
            case 7: {
                this.cfr_renamed_4991();
                return n;
            }
        }
        return n;
    }

    private /* synthetic */ void cfr_renamed_4992(int arg0) {
        if (0 > arg0 || arg0 > 9 || 0 > this.cfr_renamed_96 || this.cfr_renamed_96 > 9) {
            // empty if block
        }
        this.cfr_renamed_96 = arg0;
        if (arg0 == 0) {
            return;
        }
        int n = 100000 * arg0;
        sprkpe sprkpe2 = this;
        sprkpe2.cfr_renamed_499 = new char[n];
        sprkpe2.cfr_renamed_79 = new int[n];
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_4977(InputStream inputStream) {
        void arg0;
        sprkpe sprkpe2 = this;
        this.cfr_renamed_134 = arg0;
        sprkpe2.cfr_renamed_105 = 0;
        sprkpe2.cfr_renamed_728 = 0;
    }

    private /* synthetic */ int cfr_renamed_4993() {
        int n = 0;
        n = 0 << 8 | this.cfr_renamed_4979(8);
        n = n << 8 | this.cfr_renamed_4979(8);
        n = n << 8 | this.cfr_renamed_4979(8);
        n = n << 8 | this.cfr_renamed_4979(8);
        return n;
    }

    private /* synthetic */ char cfr_renamed_4985() {
        return (char)this.cfr_renamed_4979(8);
    }

    private /* synthetic */ void cfr_renamed_4986() {
        sprkpe sprkpe2 = this;
        sprkpe2.cfr_renamed_31 = sprkpe2.cfr_renamed_4987();
        if (sprkpe2.cfr_renamed_31 != this.cfr_renamed_82) {
            sprkpe.cfr_renamed_4980();
        }
        this.cfr_renamed_4965();
        this.cfr_renamed_145 = true;
    }

    private /* synthetic */ int cfr_renamed_4987() {
        return this.cfr_renamed_4993();
    }

    private /* synthetic */ void cfr_renamed_4988() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        char[] cArray = new char[256];
        int n6 = 100000 * this.cfr_renamed_96;
        sprkpe sprkpe2 = this;
        sprkpe2.cfr_renamed_135 = sprkpe2.cfr_renamed_4982(24);
        sprkpe2.cfr_renamed_4983();
        int n7 = sprkpe2.cfr_renamed_1226 + 1;
        int n8 = -1;
        int n9 = 0;
        int n10 = n5 = 0;
        while (n10 <= 255) {
            this.cfr_renamed_137[n5++] = 0;
            n10 = n5;
        }
        int n11 = n5 = 0;
        while (n11 <= 255) {
            int n12 = n5++;
            cArray[n12] = (char)n12;
            n11 = n5;
        }
        this.cfr_renamed_2 = -1;
        if (n9 == 0) {
            n9 = 50;
            ++n8;
        }
        --n9;
        sprkpe sprkpe3 = this;
        char c = sprkpe3.cfr_renamed_1228[n8];
        int n13 = sprkpe3.cfr_renamed_956[c];
        int n14 = n4 = sprkpe3.cfr_renamed_4979(n13);
        while (n14 > this.cfr_renamed_185[c][n13]) {
            sprkpe sprkpe4 = this;
            ++n13;
            while (sprkpe4.cfr_renamed_105 < 1) {
                int n15;
                n3 = 0;
                try {
                    n15 = n3 = (int)this.cfr_renamed_134.read();
                }
                catch (IOException iOException) {
                    sprkpe.cfr_renamed_4980();
                    n15 = n3;
                }
                if (n15 == -1) {
                    sprkpe.cfr_renamed_4980();
                }
                n2 = n3;
                sprkpe sprkpe5 = this;
                sprkpe4 = sprkpe5;
                sprkpe5.cfr_renamed_728 = sprkpe5.cfr_renamed_728 << 8 | n2 & 0xFF;
                sprkpe5.cfr_renamed_105 += 8;
            }
            sprkpe sprkpe6 = this;
            n = sprkpe6.cfr_renamed_728 >> sprkpe6.cfr_renamed_105 - 1 & 1;
            --sprkpe6.cfr_renamed_105;
            n14 = n4 << 1 | n;
        }
        int n16 = this.spr\ufe34[c][n4 - this.cfr_renamed_272[c][n13]];
        block10: while (true) {
            int n17 = n16;
            while (true) {
                int n18;
                if (n17 == n7) {
                    return;
                }
                if (n16 == 0 || n16 == 1) {
                    n13 = -1;
                    n4 = 1;
                    do {
                        int n19;
                        if (n16 == 0) {
                            n13 += 1 * n4;
                            n19 = n4;
                        } else {
                            if (n16 == 1) {
                                n13 += 2 * n4;
                            }
                            n19 = n4;
                        }
                        n4 = n19 * 2;
                        if (n9 == 0) {
                            n9 = 50;
                            ++n8;
                        }
                        --n9;
                        sprkpe sprkpe7 = this;
                        n = sprkpe7.cfr_renamed_1228[n8];
                        n2 = sprkpe7.cfr_renamed_956[n];
                        int n20 = sprkpe7.cfr_renamed_4979(n2);
                        while (n20 > this.cfr_renamed_185[n][n2]) {
                            sprkpe sprkpe8 = this;
                            ++n2;
                            while (sprkpe8.cfr_renamed_105 < 1) {
                                char c2;
                                char c3 = '\u0000';
                                try {
                                    c2 = c3 = (char)this.cfr_renamed_134.read();
                                }
                                catch (IOException iOException) {
                                    sprkpe.cfr_renamed_4980();
                                    c2 = c3;
                                }
                                if (c2 == '\uffffffff') {
                                    sprkpe.cfr_renamed_4980();
                                }
                                char c4 = c3;
                                sprkpe sprkpe9 = this;
                                sprkpe8 = sprkpe9;
                                sprkpe9.cfr_renamed_728 = sprkpe9.cfr_renamed_728 << 8 | c4 & 0xFF;
                                sprkpe9.cfr_renamed_105 += 8;
                            }
                            sprkpe sprkpe10 = this;
                            int n21 = sprkpe10.cfr_renamed_728 >> sprkpe10.cfr_renamed_105 - 1 & 1;
                            --sprkpe10.cfr_renamed_105;
                            n20 = n3 << 1 | n21;
                        }
                    } while ((n16 = this.spr\ufe34[n][n3 - this.cfr_renamed_272[n][n2]]) == 0 || n16 == 1);
                    sprkpe sprkpe11 = this;
                    char c5 = c = sprkpe11.cfr_renamed_952[cArray[0]];
                    sprkpe11.cfr_renamed_137[c5] = sprkpe11.cfr_renamed_137[c5] + ++n13;
                    int n22 = n13;
                    while (n22 > 0) {
                        sprkpe sprkpe12 = this;
                        ++sprkpe12.cfr_renamed_2;
                        sprkpe12.cfr_renamed_499[this.cfr_renamed_2] = c;
                        n22 = --n13;
                    }
                    if (this.cfr_renamed_2 < n6) continue block10;
                    System.out.println(sprgkz.cfr_renamed_9("\u0002:\u0002H\u0004\u001a3\u00073"));
                    n17 = n16;
                    continue;
                }
                sprkpe sprkpe13 = this;
                ++sprkpe13.cfr_renamed_2;
                if (sprkpe13.cfr_renamed_2 >= n6) {
                    System.out.println(sprgkz.cfr_renamed_9("\u0002:\u0002H\u0004\u001a3\u00073"));
                }
                c = cArray[n16 - 1];
                sprkpe sprkpe14 = this;
                int[] nArray = this.cfr_renamed_137;
                char c6 = sprkpe14.cfr_renamed_952[c];
                nArray[c6] = nArray[c6] + 1;
                sprkpe sprkpe15 = this;
                sprkpe14.cfr_renamed_499[sprkpe15.cfr_renamed_2] = sprkpe15.cfr_renamed_952[c];
                int n23 = n16 - 1;
                while (n23 > 3) {
                    int n24 = n18;
                    cArray[n24] = cArray[n18 - 1];
                    cArray[n24 - 1] = cArray[n18 - 2];
                    cArray[n24 - 2] = cArray[n18 - 3];
                    char c7 = cArray[n18 - 4];
                    cArray[n24 - 3] = c7;
                    n23 = n18 -= 4;
                }
                int n25 = n18;
                while (n25 > 0) {
                    cArray[--n18] = cArray[n18 - 1];
                    n25 = n18;
                }
                cArray[0] = c;
                if (n9 == 0) {
                    n9 = 50;
                    ++n8;
                }
                --n9;
                sprkpe sprkpe16 = this;
                n13 = sprkpe16.cfr_renamed_1228[n8];
                n4 = sprkpe16.cfr_renamed_956[n13];
                int n26 = sprkpe16.cfr_renamed_4979(n4);
                while (n26 > this.cfr_renamed_185[n13][n4]) {
                    sprkpe sprkpe17 = this;
                    ++n4;
                    while (sprkpe17.cfr_renamed_105 < 1) {
                        char c8;
                        char c9 = '\u0000';
                        try {
                            c8 = c9 = (char)this.cfr_renamed_134.read();
                        }
                        catch (IOException iOException) {
                            sprkpe.cfr_renamed_4980();
                            c8 = c9;
                        }
                        n3 = c8;
                        sprkpe sprkpe18 = this;
                        sprkpe17 = sprkpe18;
                        sprkpe18.cfr_renamed_728 = sprkpe18.cfr_renamed_728 << 8 | n3 & 0xFF;
                        sprkpe18.cfr_renamed_105 += 8;
                    }
                    sprkpe sprkpe19 = this;
                    n2 = sprkpe19.cfr_renamed_728 >> sprkpe19.cfr_renamed_105 - 1 & 1;
                    --sprkpe19.cfr_renamed_105;
                    n26 = n << 1 | n2;
                }
                n17 = this.spr\ufe34[n13][n - this.cfr_renamed_272[n13][n4]];
            }
            break;
        }
    }

    private /* synthetic */ void cfr_renamed_4990() {
        sprkpe sprkpe2 = this;
        if (sprkpe2.cfr_renamed_954 != sprkpe2.cfr_renamed_805) {
            this.cfr_renamed_724 = 5;
            this.cfr_renamed_287 = 1;
            this.cfr_renamed_4981();
            return;
        }
        sprkpe sprkpe3 = this;
        ++sprkpe3.cfr_renamed_287;
        if (sprkpe3.cfr_renamed_287 >= 4) {
            sprkpe sprkpe4 = this;
            this.cfr_renamed_1221 = this.cfr_renamed_499[sprkpe4.cfr_renamed_114];
            this.cfr_renamed_114 = sprkpe4.cfr_renamed_79[this.cfr_renamed_114];
            this.cfr_renamed_724 = 7;
            this.cfr_renamed_722 = 0;
            this.cfr_renamed_4991();
            return;
        }
        this.cfr_renamed_724 = 5;
        this.cfr_renamed_4981();
    }

    private /* synthetic */ void cfr_renamed_4978() {
        int[] nArray = new int[257];
        sprkpe sprkpe2 = this;
        nArray[0] = 0;
        this.cfr_renamed_957 = 1;
        while (sprkpe2.cfr_renamed_957 <= 256) {
            sprkpe sprkpe3 = this;
            sprkpe2 = sprkpe3;
            sprkpe sprkpe4 = this;
            nArray[sprkpe3.cfr_renamed_957] = sprkpe4.cfr_renamed_137[sprkpe4.cfr_renamed_957 - 1];
            ++sprkpe3.cfr_renamed_957;
        }
        sprkpe sprkpe5 = this;
        this.cfr_renamed_957 = 1;
        while (sprkpe5.cfr_renamed_957 <= 256) {
            sprkpe sprkpe6 = this;
            int[] nArray2 = nArray;
            sprkpe5 = sprkpe6;
            int n = sprkpe6.cfr_renamed_957++;
            nArray2[n] = nArray2[n] + nArray[this.cfr_renamed_957 - 1];
        }
        sprkpe sprkpe7 = this;
        this.cfr_renamed_957 = 0;
        while (sprkpe7.cfr_renamed_957 <= this.cfr_renamed_2) {
            sprkpe sprkpe8 = this;
            int[] nArray3 = nArray;
            sprkpe7 = sprkpe8;
            sprkpe sprkpe9 = this;
            char c = sprkpe9.cfr_renamed_499[sprkpe9.cfr_renamed_957];
            sprkpe8.cfr_renamed_79[nArray[c]] = this.cfr_renamed_957;
            char c2 = c;
            nArray3[c2] = nArray3[c2] + 1;
            ++sprkpe8.cfr_renamed_957;
        }
        nArray = null;
        this.cfr_renamed_114 = this.cfr_renamed_79[this.cfr_renamed_135];
        this.cfr_renamed_287 = 0;
        this.cfr_renamed_955 = 0;
        this.cfr_renamed_954 = 256;
        if (this.cfr_renamed_133) {
            this.cfr_renamed_131 = 0;
            this.cfr_renamed_1260 = 0;
            this.cfr_renamed_4976();
            return;
        }
        this.cfr_renamed_4981();
    }

    private /* synthetic */ void cfr_renamed_1391() throws IOException {
        sprkpe sprkpe2 = this;
        char c = sprkpe2.cfr_renamed_4985();
        char c2 = sprkpe2.cfr_renamed_4985();
        if (c != 'B' && c2 != 'Z') {
            throw new IOException(sprnjj.cfr_renamed_9("=\u001c\u0007S\u0012S1):#AS\u001e\u0012\u0001\u0018\u0016\u0017S\u0000\u0007\u0001\u0016\u0012\u001e"));
        }
        sprkpe sprkpe3 = this;
        c = sprkpe3.cfr_renamed_4985();
        c2 = sprkpe3.cfr_renamed_4985();
        if (c != 'h' || c2 < '1' || c2 > '9') {
            this.cfr_renamed_4965();
            this.cfr_renamed_145 = true;
            return;
        }
        this.cfr_renamed_4992(c2 - 48);
        this.cfr_renamed_82 = 0;
    }

    private /* synthetic */ void cfr_renamed_4971() {
        sprkpe sprkpe2 = this;
        sprkpe2.cfr_renamed_102 = sprkpe2.cfr_renamed_84.cfr_renamed_4949();
        if (sprkpe2.cfr_renamed_88 != this.cfr_renamed_102) {
            sprkpe.cfr_renamed_4980();
        }
        sprkpe sprkpe3 = this;
        this.cfr_renamed_82 = sprkpe3.cfr_renamed_82 << 1 | this.cfr_renamed_82 >>> 31;
        sprkpe3.cfr_renamed_82 ^= this.cfr_renamed_102;
    }

    private /* synthetic */ void cfr_renamed_4955() {
        int n;
        this.cfr_renamed_1226 = 0;
        int n2 = n = 0;
        while (n2 < 256) {
            if (this.cfr_renamed_1[n]) {
                sprkpe sprkpe2 = this;
                sprkpe sprkpe3 = this;
                sprkpe2.cfr_renamed_952[sprkpe3.cfr_renamed_1226] = (char)n;
                sprkpe2.cfr_renamed_0[n] = (char)this.cfr_renamed_1226;
                ++sprkpe3.cfr_renamed_1226;
            }
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_4984(int[] arg0, int[] arg1, int[] arg2, char[] arg3, int arg4, int arg5, int arg6) {
        int n;
        int n2 = 0;
        int n3 = n = arg4;
        while (n3 <= arg5) {
            int n4;
            int n5 = n4 = 0;
            while (n5 < arg6) {
                if (arg3[n4] == n) {
                    arg2[n2++] = n4;
                }
                n5 = ++n4;
            }
            n3 = ++n;
        }
        int n6 = n = 0;
        while (n6 < 23) {
            arg1[n++] = 0;
            n6 = n;
        }
        int n7 = n = 0;
        while (n7 < arg6) {
            int n8 = arg3[n] + '\u0001';
            arg1[n8] = arg1[n8] + 1;
            n7 = ++n;
        }
        int n9 = n = 1;
        while (n9 < 23) {
            int n10 = n;
            int n11 = arg1[n10] + arg1[n - 1];
            arg1[n10] = n11;
            n9 = ++n;
        }
        int n12 = n = 0;
        while (n12 < 23) {
            arg0[n++] = 0;
            n12 = n;
        }
        int n13 = 0;
        int n14 = n = arg4;
        while (n14 <= arg5) {
            int n15 = n13 += arg1[n + 1] - arg1[n];
            arg0[n] = n15 - 1;
            n13 = n15 << 1;
            n14 = ++n;
        }
        int n16 = n = arg4 + 1;
        while (n16 <= arg5) {
            int n17 = n;
            int n18 = (arg0[n17 - 1] + 1 << 1) - arg1[n];
            arg1[n17] = n18;
            n16 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_4989() {
        sprkpe sprkpe2 = this;
        if (sprkpe2.cfr_renamed_954 != sprkpe2.cfr_renamed_805) {
            this.cfr_renamed_724 = 2;
            this.cfr_renamed_287 = 1;
            this.cfr_renamed_4976();
            return;
        }
        sprkpe sprkpe3 = this;
        ++sprkpe3.cfr_renamed_287;
        if (sprkpe3.cfr_renamed_287 >= 4) {
            sprkpe sprkpe4 = this;
            sprkpe sprkpe5 = this;
            sprkpe4.cfr_renamed_1221 = sprkpe4.cfr_renamed_499[sprkpe5.cfr_renamed_114];
            sprkpe4.cfr_renamed_114 = sprkpe5.cfr_renamed_79[this.cfr_renamed_114];
            if (sprkpe4.cfr_renamed_131 == 0) {
                sprkpe sprkpe6 = this;
                this.cfr_renamed_131 = cfr_renamed_2[sprkpe6.cfr_renamed_1260];
                ++sprkpe6.cfr_renamed_1260;
                if (this.cfr_renamed_1260 == 512) {
                    this.cfr_renamed_1260 = 0;
                }
            }
            sprkpe sprkpe7 = this;
            --sprkpe7.cfr_renamed_131;
            sprkpe7.cfr_renamed_1221 = (char)(sprkpe7.cfr_renamed_1221 ^ (this.cfr_renamed_131 == 1 ? (char)'\u0001' : '\u0000'));
            this.cfr_renamed_722 = 0;
            this.cfr_renamed_724 = 4;
            this.cfr_renamed_4975();
            return;
        }
        this.cfr_renamed_724 = 2;
        this.cfr_renamed_4976();
    }

    private /* synthetic */ void cfr_renamed_4991() {
        sprkpe sprkpe2 = this;
        if (sprkpe2.cfr_renamed_722 < sprkpe2.cfr_renamed_1221) {
            sprkpe sprkpe3 = this;
            sprkpe3.cfr_renamed_953 = sprkpe3.cfr_renamed_954;
            sprkpe3.cfr_renamed_84.cfr_renamed_4946(this.cfr_renamed_954);
            ++sprkpe3.cfr_renamed_722;
            return;
        }
        this.cfr_renamed_724 = 5;
        ++this.cfr_renamed_955;
        this.cfr_renamed_287 = 0;
        this.cfr_renamed_4981();
    }
}

