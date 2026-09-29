/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqbb;
import com.spire.presentation.packages.sprqdd;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.sprvuca;

public class sprqcd
extends sprqdd {
    @Override
    public void cfr_renamed_3602() {
        this.cfr_renamed_132[12] = this.cfr_renamed_132[12] + 1;
        if (this.cfr_renamed_132[12] == 0) {
            this.cfr_renamed_132[13] = this.cfr_renamed_132[13] + 1;
        }
    }

    @Override
    public void cfr_renamed_3603() {
        if (this.cfr_renamed_132[12] == 0 && this.cfr_renamed_132[13] == 0) {
            throw new IllegalStateException(sprqbb.cfr_renamed_9("l\u001cy\r`\u0018yHy\u0007-\u001ah\fx\u000bhHn\u0007x\u0006y\r\u007fH}\t~\u001c-\u0012h\u001abF"));
        }
        this.cfr_renamed_132[12] = this.cfr_renamed_132[12] - 1;
        if (this.cfr_renamed_132[12] == -1) {
            this.cfr_renamed_132[13] = this.cfr_renamed_132[13] - 1;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_3604(byte[] byArray) {
        void arg0;
        sprqcd sprqcd2 = this;
        sprqcd sprqcd3 = this;
        sprqcd.cfr_renamed_3698(sprqcd2.cfr_renamed_91, sprqcd2.cfr_renamed_132, sprqcd3.cfr_renamed_3);
        sprtsa.cfr_renamed_449(sprqcd3.cfr_renamed_3, (byte[])arg0, 0);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, sprvuca.cfr_renamed_9("L(n\u0003g!")).append(this.cfr_renamed_91).toString();
    }

    @Override
    public long cfr_renamed_3374() {
        return (long)this.cfr_renamed_132[13] << 32 | (long)this.cfr_renamed_132[12] & 0xFFFFFFFFL;
    }

    @Override
    public void cfr_renamed_3471(byte[] arg0, byte[] arg1) {
        if (arg0 != null) {
            sprqcd sprqcd2;
            int n;
            byte[] byArray;
            if (arg0.length != 16 && arg0.length != 32) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprqbb.cfr_renamed_9("-\u001ah\u0019x\u0001\u007f\r~H<Z5Ho\u0001yHb\u001a-Z8^-\nd\u001c-\u0003h\u0011")).toString());
            }
            sprqcd sprqcd3 = this;
            sprqcd3.cfr_renamed_132[4] = sprtsa.cfr_renamed_439(arg0, 0);
            sprqcd3.cfr_renamed_132[5] = sprtsa.cfr_renamed_439(arg0, 4);
            sprqcd3.cfr_renamed_132[6] = sprtsa.cfr_renamed_439(arg0, 8);
            sprqcd3.cfr_renamed_132[7] = sprtsa.cfr_renamed_439(arg0, 12);
            if (arg0.length == 32) {
                byArray = cfr_renamed_86;
                n = 16;
                sprqcd2 = this;
            } else {
                byArray = cfr_renamed_93;
                n = 0;
                sprqcd2 = this;
            }
            sprqcd2.cfr_renamed_132[8] = sprtsa.cfr_renamed_439(arg0, n);
            sprqcd sprqcd4 = this;
            sprqcd4.cfr_renamed_132[9] = sprtsa.cfr_renamed_439(arg0, n + 4);
            sprqcd4.cfr_renamed_132[10] = sprtsa.cfr_renamed_439(arg0, n + 8);
            sprqcd4.cfr_renamed_132[11] = sprtsa.cfr_renamed_439(arg0, n + 12);
            sprqcd4.cfr_renamed_132[0] = sprtsa.cfr_renamed_439(byArray, 0);
            sprqcd4.cfr_renamed_132[1] = sprtsa.cfr_renamed_439(byArray, 4);
            sprqcd4.cfr_renamed_132[2] = sprtsa.cfr_renamed_439(byArray, 8);
            sprqcd4.cfr_renamed_132[3] = sprtsa.cfr_renamed_439(byArray, 12);
        }
        sprqcd sprqcd5 = this;
        sprqcd5.cfr_renamed_132[14] = sprtsa.cfr_renamed_439(arg1, 0);
        sprqcd5.cfr_renamed_132[15] = sprtsa.cfr_renamed_439(arg1, 4);
    }

    public sprqcd(int arg0) {
        super(arg0);
    }

    @Override
    public void cfr_renamed_3606() {
        this.cfr_renamed_132[13] = 0;
        this.cfr_renamed_132[12] = 0;
    }

    public static void cfr_renamed_3698(int arg0, int[] arg1, int[] arg2) {
        int n;
        if (arg1.length != 16) {
            throw new IllegalArgumentException();
        }
        if (arg2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (arg0 % 2 != 0) {
            throw new IllegalArgumentException(sprvuca.cfr_renamed_9("\u000ez-m%}``&/2`5a$|`b5|4/\"j`j6j."));
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
            n14 = sprqcd.cfr_renamed_3608(n14 ^ (n2 += n6), 16);
            n6 = sprqcd.cfr_renamed_3608(n6 ^ (n10 += n14), 12);
            n14 = sprqcd.cfr_renamed_3608(n14 ^ (n2 += n6), 8);
            n6 = sprqcd.cfr_renamed_3608(n6 ^ (n10 += n14), 7);
            n15 = sprqcd.cfr_renamed_3608(n15 ^ (n3 += n7), 16);
            n7 = sprqcd.cfr_renamed_3608(n7 ^ (n11 += n15), 12);
            n15 = sprqcd.cfr_renamed_3608(n15 ^ (n3 += n7), 8);
            n7 = sprqcd.cfr_renamed_3608(n7 ^ (n11 += n15), 7);
            n16 = sprqcd.cfr_renamed_3608(n16 ^ (n4 += n8), 16);
            n8 = sprqcd.cfr_renamed_3608(n8 ^ (n12 += n16), 12);
            n16 = sprqcd.cfr_renamed_3608(n16 ^ (n4 += n8), 8);
            n8 = sprqcd.cfr_renamed_3608(n8 ^ (n12 += n16), 7);
            n17 = sprqcd.cfr_renamed_3608(n17 ^ (n5 += n9), 16);
            n9 = sprqcd.cfr_renamed_3608(n9 ^ (n13 += n17), 12);
            n17 = sprqcd.cfr_renamed_3608(n17 ^ (n5 += n9), 8);
            n9 = sprqcd.cfr_renamed_3608(n9 ^ (n13 += n17), 7);
            n17 = sprqcd.cfr_renamed_3608(n17 ^ (n2 += n7), 16);
            n7 = sprqcd.cfr_renamed_3608(n7 ^ (n12 += n17), 12);
            n17 = sprqcd.cfr_renamed_3608(n17 ^ (n2 += n7), 8);
            n7 = sprqcd.cfr_renamed_3608(n7 ^ (n12 += n17), 7);
            n14 = sprqcd.cfr_renamed_3608(n14 ^ (n3 += n8), 16);
            n8 = sprqcd.cfr_renamed_3608(n8 ^ (n13 += n14), 12);
            n14 = sprqcd.cfr_renamed_3608(n14 ^ (n3 += n8), 8);
            n8 = sprqcd.cfr_renamed_3608(n8 ^ (n13 += n14), 7);
            n15 = sprqcd.cfr_renamed_3608(n15 ^ (n4 += n9), 16);
            n9 = sprqcd.cfr_renamed_3608(n9 ^ (n10 += n15), 12);
            n15 = sprqcd.cfr_renamed_3608(n15 ^ (n4 += n9), 8);
            n9 = sprqcd.cfr_renamed_3608(n9 ^ (n10 += n15), 7);
            n16 = sprqcd.cfr_renamed_3608(n16 ^ (n5 += n6), 16);
            n6 = sprqcd.cfr_renamed_3608(n6 ^ (n11 += n16), 12);
            n16 = sprqcd.cfr_renamed_3608(n16 ^ (n5 += n6), 8);
            n6 = sprqcd.cfr_renamed_3608(n6 ^ (n11 += n16), 7);
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

    public sprqcd() {
    }
}

