/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprifd;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.sprudda;
import com.spire.presentation.packages.sprvzy;
import com.spire.presentation.packages.sprwd;
import com.spire.presentation.packages.sprywa;

public class sprqdd
implements sprwd {
    public int[] cfr_renamed_132;
    private byte[] cfr_renamed_102;
    public static final byte[] cfr_renamed_93;
    public static final byte[] cfr_renamed_86;
    private static final int cfr_renamed_152 = 16;
    private boolean cfr_renamed_112;
    public static final int cfr_renamed_119 = 20;
    public int cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    public int[] cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public long cfr_renamed_3275(long l) {
        sprqdd sprqdd2 = this;
        sprqdd2.cfr_renamed_41();
        return sprqdd2.cfr_renamed_3273(l);
    }

    @Override
    public long cfr_renamed_3273(long arg0) {
        if (arg0 >= 0L) {
            long l;
            long l2 = l = 0L;
            while (l2 < arg0) {
                sprqdd sprqdd2 = this;
                sprqdd2.cfr_renamed_2 = sprqdd2.cfr_renamed_2 + 1 & 0x3F;
                if (sprqdd2.cfr_renamed_2 == 0) {
                    this.cfr_renamed_3602();
                }
                l2 = l + 1L;
            }
        } else {
            long l;
            long l3 = l = 0L;
            while (l3 > arg0) {
                if (this.cfr_renamed_2 == 0) {
                    this.cfr_renamed_3603();
                }
                this.cfr_renamed_2 = this.cfr_renamed_2 - 1 & 0x3F;
                l3 = l - 1L;
            }
        }
        sprqdd sprqdd3 = this;
        sprqdd3.cfr_renamed_3604(sprqdd3.cfr_renamed_102);
        return arg0;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3604(byte[] byArray) {
        void arg0;
        sprqdd sprqdd2 = this;
        sprqdd sprqdd3 = this;
        sprqdd.cfr_renamed_3498(sprqdd2.cfr_renamed_91, sprqdd2.cfr_renamed_132, sprqdd3.cfr_renamed_3);
        sprtsa.cfr_renamed_449(sprqdd3.cfr_renamed_3, (byte[])arg0, 0);
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        sprqdd sprqdd2;
        if (!(arg1 instanceof sprnjd)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprudda.cfr_renamed_9("\u000f\u0014A4[}_<]<B8[8].\u000f0Z.[}F3L1Z9J}N3\u000f\u0014y")).toString());
        }
        sprnjd sprnjd2 = (sprnjd)arg1;
        byte[] byArray = sprnjd2.cfr_renamed_1205();
        if (byArray == null || byArray.length != this.cfr_renamed_3540()) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprvzy.cfr_renamed_9("#\\f_vGqKp\u000efVbMwBz\u000e")).append(this.cfr_renamed_3540()).append(sprudda.cfr_renamed_9("}M$[8\\}@;\u000f\u0014y")).toString());
        }
        sprt sprt2 = sprnjd2.cfr_renamed_284();
        if (sprt2 == null) {
            if (!this.cfr_renamed_112) {
                throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprvzy.cfr_renamed_9("#efWSOqOnKwKq\u000e`Om\u000emAw\u000eaK#@vBo\u000eeAq\u000eeGq]w\u000ej@jZjOoGpOwGl@")).toString());
            }
            sprqdd sprqdd3 = this;
            sprqdd2 = sprqdd3;
            sprqdd3.cfr_renamed_3471(null, byArray);
        } else if (sprt2 instanceof sprnld) {
            this.cfr_renamed_3471(((sprnld)sprt2).cfr_renamed_1521(), byArray);
            sprqdd2 = this;
        } else {
            throw new IllegalArgumentException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprudda.cfr_renamed_9("}f3F)\u000f-N/N0J)J/\\}B(\\)\u000f>@3[<F3\u000f<\u000f\u0016J$\u007f<]<B8[8]}\u00072]}A(C1\u000f;@/\u000f/JpF3F)\u0006")).toString());
        }
        sprqdd2.cfr_renamed_41();
        this.cfr_renamed_112 = true;
    }

    public long cfr_renamed_3374() {
        return (long)this.cfr_renamed_132[9] << 32 | (long)this.cfr_renamed_132[8] & 0xFFFFFFFFL;
    }

    @Override
    public byte cfr_renamed_3243(byte arg0) {
        if (this.cfr_renamed_3605()) {
            throw new sprifd(sprvzy.cfr_renamed_9("\u001c]\u00193\u000eaWwK#BjCjZ#^f\\#gU\u0015#mkOmIf\u000eJx"));
        }
        sprqdd sprqdd2 = this;
        byte by = (byte)(sprqdd2.cfr_renamed_102[this.cfr_renamed_2] ^ arg0);
        this.cfr_renamed_2 = sprqdd2.cfr_renamed_2 + 1 & 0x3F;
        if (sprqdd2.cfr_renamed_2 == 0) {
            sprqdd sprqdd3 = this;
            sprqdd3.cfr_renamed_3602();
            sprqdd3.cfr_renamed_3604(sprqdd3.cfr_renamed_102);
        }
        return by;
    }

    public void cfr_renamed_3606() {
        this.cfr_renamed_132[9] = 0;
        this.cfr_renamed_132[8] = 0;
    }

    static {
        cfr_renamed_86 = sprywa.cfr_renamed_433(sprudda.cfr_renamed_9("8W-N3K}\u001co\u0002?V)J}D"));
        cfr_renamed_93 = sprywa.cfr_renamed_433(sprvzy.cfr_renamed_9("fVsOmJ#\u001f5\u0003aWwK#E"));
    }

    @Override
    public void cfr_renamed_41() {
        sprqdd sprqdd2 = this;
        sprqdd2.cfr_renamed_2 = 0;
        sprqdd2.cfr_renamed_3607();
        sprqdd2.cfr_renamed_3606();
        sprqdd2.cfr_renamed_3604(sprqdd2.cfr_renamed_102);
    }

    @Override
    public String cfr_renamed_1315() {
        String string = sprudda.cfr_renamed_9("|<C.No\u001f");
        if (this.cfr_renamed_91 != 20) {
            string = new StringBuilder().insert(0, string).append("/").append(this.cfr_renamed_91).toString();
        }
        return string;
    }

    public static void cfr_renamed_3498(int arg0, int[] arg1, int[] arg2) {
        int n;
        if (arg1.length != 16) {
            throw new IllegalArgumentException();
        }
        if (arg2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (arg0 % 2 != 0) {
            throw new IllegalArgumentException(sprvzy.cfr_renamed_9("`vCaKq\u000elH#\\l[mJp\u000en[pZ#Lf\u000efXf@"));
        }
        int n2 = arg1[0];
        int n3 = arg1[1];
        int n4 = arg1[2];
        int n5 = arg1[3];
        int n6 = arg1[4];
        int n7 = arg1[5];
        int n8 = arg1[6];
        int n9 = arg1[7];
        int n10 = arg1[8];
        int n11 = arg1[9];
        int n12 = arg1[10];
        int n13 = arg1[11];
        int n14 = arg1[12];
        int n15 = arg1[13];
        int n16 = arg1[14];
        int n17 = arg1[15];
        int n18 = n = arg0;
        while (n18 > 0) {
            n10 ^= sprqdd.cfr_renamed_3608((n6 ^= sprqdd.cfr_renamed_3608(n2 + n14, 7)) + n2, 9);
            n2 ^= sprqdd.cfr_renamed_3608((n14 ^= sprqdd.cfr_renamed_3608(n10 + n6, 13)) + n10, 18);
            n15 ^= sprqdd.cfr_renamed_3608((n11 ^= sprqdd.cfr_renamed_3608(n7 + n3, 7)) + n7, 9);
            n7 ^= sprqdd.cfr_renamed_3608((n3 ^= sprqdd.cfr_renamed_3608(n15 + n11, 13)) + n15, 18);
            n4 ^= sprqdd.cfr_renamed_3608((n16 ^= sprqdd.cfr_renamed_3608(n12 + n8, 7)) + n12, 9);
            n12 ^= sprqdd.cfr_renamed_3608((n8 ^= sprqdd.cfr_renamed_3608(n4 + n16, 13)) + n4, 18);
            n9 ^= sprqdd.cfr_renamed_3608((n5 ^= sprqdd.cfr_renamed_3608(n17 + n13, 7)) + n17, 9);
            n17 ^= sprqdd.cfr_renamed_3608((n13 ^= sprqdd.cfr_renamed_3608(n9 + n5, 13)) + n9, 18);
            n4 ^= sprqdd.cfr_renamed_3608((n3 ^= sprqdd.cfr_renamed_3608(n2 + n5, 7)) + n2, 9);
            n2 ^= sprqdd.cfr_renamed_3608((n5 ^= sprqdd.cfr_renamed_3608(n4 + n3, 13)) + n4, 18);
            n9 ^= sprqdd.cfr_renamed_3608((n8 ^= sprqdd.cfr_renamed_3608(n7 + n6, 7)) + n7, 9);
            n7 ^= sprqdd.cfr_renamed_3608((n6 ^= sprqdd.cfr_renamed_3608(n9 + n8, 13)) + n9, 18);
            n10 ^= sprqdd.cfr_renamed_3608((n13 ^= sprqdd.cfr_renamed_3608(n12 + n11, 7)) + n12, 9);
            n12 ^= sprqdd.cfr_renamed_3608((n11 ^= sprqdd.cfr_renamed_3608(n10 + n13, 13)) + n10, 18);
            n15 ^= sprqdd.cfr_renamed_3608((n14 ^= sprqdd.cfr_renamed_3608(n17 + n16, 7)) + n17, 9);
            n17 ^= sprqdd.cfr_renamed_3608((n16 ^= sprqdd.cfr_renamed_3608(n15 + n14, 13)) + n15, 18);
            n18 = n -= 2;
        }
        arg2[0] = n2 + arg1[0];
        arg2[1] = n3 + arg1[1];
        arg2[2] = n4 + arg1[2];
        arg2[3] = n5 + arg1[3];
        arg2[4] = n6 + arg1[4];
        arg2[5] = n7 + arg1[5];
        arg2[6] = n8 + arg1[6];
        arg2[7] = n9 + arg1[7];
        arg2[8] = n10 + arg1[8];
        arg2[9] = n11 + arg1[9];
        arg2[10] = n12 + arg1[10];
        arg2[11] = n13 + arg1[11];
        arg2[12] = n14 + arg1[12];
        arg2[13] = n15 + arg1[13];
        arg2[14] = n16 + arg1[14];
        arg2[15] = n17 + arg1[15];
    }

    public void cfr_renamed_3471(byte[] arg0, byte[] arg1) {
        if (arg0 != null) {
            sprqdd sprqdd2;
            int n;
            byte[] byArray;
            if (arg0.length != 16 && arg0.length != 32) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprudda.cfr_renamed_9("}]8^(F/J.\u000fl\u001de\u000f?F)\u000f2]}\u001dh\u0019}M4[}D8V")).toString());
            }
            sprqdd sprqdd3 = this;
            sprqdd3.cfr_renamed_132[1] = sprtsa.cfr_renamed_439(arg0, 0);
            sprqdd3.cfr_renamed_132[2] = sprtsa.cfr_renamed_439(arg0, 4);
            sprqdd3.cfr_renamed_132[3] = sprtsa.cfr_renamed_439(arg0, 8);
            sprqdd3.cfr_renamed_132[4] = sprtsa.cfr_renamed_439(arg0, 12);
            if (arg0.length == 32) {
                byArray = cfr_renamed_86;
                n = 16;
                sprqdd2 = this;
            } else {
                byArray = cfr_renamed_93;
                n = 0;
                sprqdd2 = this;
            }
            sprqdd2.cfr_renamed_132[11] = sprtsa.cfr_renamed_439(arg0, n);
            sprqdd sprqdd4 = this;
            sprqdd4.cfr_renamed_132[12] = sprtsa.cfr_renamed_439(arg0, n + 4);
            sprqdd4.cfr_renamed_132[13] = sprtsa.cfr_renamed_439(arg0, n + 8);
            sprqdd4.cfr_renamed_132[14] = sprtsa.cfr_renamed_439(arg0, n + 12);
            sprqdd4.cfr_renamed_132[0] = sprtsa.cfr_renamed_439(byArray, 0);
            sprqdd4.cfr_renamed_132[5] = sprtsa.cfr_renamed_439(byArray, 4);
            sprqdd4.cfr_renamed_132[10] = sprtsa.cfr_renamed_439(byArray, 8);
            sprqdd4.cfr_renamed_132[15] = sprtsa.cfr_renamed_439(byArray, 12);
        }
        sprqdd sprqdd5 = this;
        sprqdd5.cfr_renamed_132[6] = sprtsa.cfr_renamed_439(arg1, 0);
        sprqdd5.cfr_renamed_132[7] = sprtsa.cfr_renamed_439(arg1, 4);
    }

    public int cfr_renamed_3540() {
        return 8;
    }

    private /* synthetic */ boolean cfr_renamed_3609(int arg0) {
        sprqdd sprqdd2 = this;
        sprqdd2.cfr_renamed_4 += arg0;
        if (sprqdd2.cfr_renamed_4 < arg0 && this.cfr_renamed_4 >= 0 && ++this.cfr_renamed_0 == 0) {
            return (++this.cfr_renamed_1 & 0x20) != 0;
        }
        return false;
    }

    @Override
    public long cfr_renamed_3274() {
        return this.cfr_renamed_3374() * 64L + (long)this.cfr_renamed_2;
    }

    public void cfr_renamed_3602() {
        this.cfr_renamed_132[8] = this.cfr_renamed_132[8] + 1;
        if (this.cfr_renamed_132[8] == 0) {
            this.cfr_renamed_132[9] = this.cfr_renamed_132[9] + 1;
        }
    }

    public sprqdd() {
        this(20);
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        if (!this.cfr_renamed_112) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprvzy.cfr_renamed_9("#@lZ#GmGwGbBj]fJ")).toString());
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprjkd(sprudda.cfr_renamed_9("4A-Z)\u000f?Z;I8]}[2@}\\5@/["));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new spreid(sprvzy.cfr_renamed_9("AvZs[w\u000ea[eHf\\#ZlA#]kAqZ"));
        }
        if (this.cfr_renamed_3609(arg2)) {
            throw new sprifd(sprudda.cfr_renamed_9("\u001d\u0003\u0018m\u000f?V)J}C4B4[}_8]}f\u000b\u000f*@(C9\u000f?J}J%L8J9J9\u0014}l5N3H8\u000f\u0014y"));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            sprqdd sprqdd2 = this;
            arg3[n + arg4] = (byte)(sprqdd2.cfr_renamed_102[sprqdd2.cfr_renamed_2] ^ arg0[n + arg1]);
            sprqdd sprqdd3 = this;
            sprqdd2.cfr_renamed_2 = sprqdd3.cfr_renamed_2 + 1 & 0x3F;
            if (sprqdd3.cfr_renamed_2 == 0) {
                sprqdd sprqdd4 = this;
                sprqdd4.cfr_renamed_3602();
                sprqdd4.cfr_renamed_3604(sprqdd4.cfr_renamed_102);
            }
            n2 = ++n;
        }
        return arg2;
    }

    public void cfr_renamed_3603() {
        if (this.cfr_renamed_132[8] == 0 && this.cfr_renamed_132[9] == 0) {
            throw new IllegalStateException(sprvzy.cfr_renamed_9("bZwKn^w\u000ewA#\\fJvMf\u000e`Av@wKq\u000esOpZ#Tf\\l\u0000"));
        }
        this.cfr_renamed_132[8] = this.cfr_renamed_132[8] - 1;
        if (this.cfr_renamed_132[8] == -1) {
            this.cfr_renamed_132[9] = this.cfr_renamed_132[9] - 1;
        }
    }

    private /* synthetic */ void cfr_renamed_3607() {
        sprqdd sprqdd2 = this;
        this.cfr_renamed_4 = 0;
        sprqdd2.cfr_renamed_0 = 0;
        sprqdd2.cfr_renamed_1 = 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprqdd(int n) {
        void arg0;
        sprqdd sprqdd2 = this;
        sprqdd sprqdd3 = this;
        this.cfr_renamed_2 = 0;
        sprqdd3.cfr_renamed_132 = new int[16];
        sprqdd3.cfr_renamed_3 = new int[16];
        sprqdd2.cfr_renamed_102 = new byte[64];
        sprqdd2.cfr_renamed_112 = false;
        if (n <= 0 || (arg0 & 1) != 0) {
            throw new IllegalArgumentException(sprudda.cfr_renamed_9("z]2Z3K.\b}B(\\)\u000f?J}N}_2\\4[4Y8\u0003}J+J3\u000f3Z0M8]"));
        }
        this.cfr_renamed_91 = arg0;
    }

    private /* synthetic */ boolean cfr_renamed_3605() {
        if (++this.cfr_renamed_4 == 0 && ++this.cfr_renamed_0 == 0) {
            return (++this.cfr_renamed_1 & 0x20) != 0;
        }
        return false;
    }

    public static int cfr_renamed_3608(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> -arg1;
    }
}

