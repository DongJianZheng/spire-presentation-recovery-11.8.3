/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdus;
import com.spire.presentation.packages.sprhva;
import com.spire.presentation.packages.sprmpa;
import com.spire.presentation.packages.sprqna;
import com.spire.presentation.packages.spryeo;
import com.spire.presentation.packages.sprzta;
import java.security.SecureRandom;

public class sprxta {
    public static final char cfr_renamed_1 = 'I';
    private int cfr_renamed_2;
    private int[] cfr_renamed_3;
    private sprmpa cfr_renamed_4;

    public int cfr_renamed_813() {
        int n = this.cfr_renamed_3.length - 1;
        if (this.cfr_renamed_3[n] == 0) {
            return -1;
        }
        return n;
    }

    public sprxta cfr_renamed_831(int arg0) {
        int[] nArray = new int[arg0 + 1];
        sprxta sprxta2 = this;
        nArray[arg0] = 1;
        int[] nArray2 = sprxta2.cfr_renamed_832(sprxta2.cfr_renamed_3, nArray);
        return new sprxta(this.cfr_renamed_4, nArray2);
    }

    private static /* synthetic */ int cfr_renamed_833(int[] arg0) {
        int n = sprxta.cfr_renamed_834(arg0);
        if (n == -1) {
            return 0;
        }
        return arg0[n];
    }

    public sprxta cfr_renamed_835(sprxta arg0) {
        sprxta sprxta2 = this;
        int[] nArray = sprxta2.cfr_renamed_836(sprxta2.cfr_renamed_3, arg0.cfr_renamed_3);
        return new sprxta(this.cfr_renamed_4, nArray);
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_837(int n) {
        int n2;
        sprxta sprxta2 = this;
        int n3 = this.cfr_renamed_3[sprxta2.cfr_renamed_2];
        int n4 = n2 = sprxta2.cfr_renamed_2 - 1;
        while (n4 >= 0) {
            void arg0;
            n3 = this.cfr_renamed_4.cfr_renamed_838(n3, (int)arg0) ^ this.cfr_renamed_3[n2--];
            n4 = n2;
        }
        return n3;
    }

    public sprxta cfr_renamed_819(int arg0) {
        if (!this.cfr_renamed_4.cfr_renamed_839(arg0)) {
            throw new ArithmeticException(sprdus.cfr_renamed_9("56\u000fy\u001a7[<\u0017<\u0016<\u0015-[6\u001dy\u000f1\u001ey\u001d0\u00150\u000f<[?\u0012<\u0017=[-\u00130\by\u000b6\u0017 \u00156\u00160\u001a5[0\by\u001f<\u001d0\u0015<\u001fy\u0014/\u001e+U"));
        }
        sprxta sprxta2 = this;
        int[] nArray = sprxta2.cfr_renamed_840(sprxta2.cfr_renamed_3, arg0);
        return new sprxta(this.cfr_renamed_4, nArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprxta(sprmpa sprmpa2, int[] nArray) {
        void arg0;
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = sprxta.cfr_renamed_841(nArray);
        this.cfr_renamed_842();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int[][] cfr_renamed_843(int[] nArray, int[] nArray2) {
        void arg0;
        void arg1;
        int n = sprxta.cfr_renamed_834((int[])arg1);
        int n2 = sprxta.cfr_renamed_834(nArray) + 1;
        if (n == -1) {
            throw new ArithmeticException(spryeo.cfr_renamed_9("b\u001dP\u001dU\u001dI\u001a\u0006\u0016_T\\\u0011T\u001b\b"));
        }
        int[][] nArrayArray = new int[2][];
        nArrayArray[0] = new int[1];
        nArrayArray[1] = new int[n2];
        int n3 = sprxta.cfr_renamed_833((int[])arg1);
        n3 = this.cfr_renamed_4.cfr_renamed_817(n3);
        nArrayArray[0][0] = 0;
        System.arraycopy(arg0, 0, nArrayArray[1], 0, nArrayArray[1].length);
        int n4 = n;
        while (n4 <= sprxta.cfr_renamed_834(nArrayArray[1])) {
            int[] nArray3 = new int[]{this.cfr_renamed_4.cfr_renamed_838(sprxta.cfr_renamed_833(nArrayArray[1]), n3)};
            int[] nArray4 = this.cfr_renamed_840((int[])arg1, nArray3[0]);
            int n5 = sprxta.cfr_renamed_834(nArrayArray[1]) - n;
            nArray4 = sprxta.cfr_renamed_844(nArray4, n5);
            nArray3 = sprxta.cfr_renamed_844(nArray3, n5);
            n4 = n;
            nArrayArray[0] = this.cfr_renamed_832(nArray3, nArrayArray[0]);
            nArrayArray[1] = this.cfr_renamed_832(nArray4, nArrayArray[1]);
        }
        return nArrayArray;
    }

    public sprxta(sprzta arg0) {
        this(arg0.cfr_renamed_845(), arg0.cfr_renamed_846());
    }

    private /* synthetic */ int[] cfr_renamed_847(int[] arg0, int[] arg1, int[] arg2) {
        int[] nArray = sprxta.cfr_renamed_841(arg2);
        sprxta sprxta2 = this;
        int[] nArray2 = sprxta2.cfr_renamed_848(arg1, arg2);
        int[] nArray3 = new int[1];
        nArray3[0] = 0;
        int[] nArray4 = nArray3;
        int[] nArray5 = sprxta2.cfr_renamed_848(arg0, arg2);
        int[] nArray6 = nArray2;
        while (sprxta.cfr_renamed_834(nArray6) != -1) {
            int[][] nArray7 = this.cfr_renamed_843(nArray, nArray2);
            nArray = sprxta.cfr_renamed_841(nArray2);
            nArray2 = sprxta.cfr_renamed_841(nArray7[1]);
            sprxta sprxta3 = this;
            int[] nArray8 = sprxta3.cfr_renamed_832(nArray4, sprxta3.cfr_renamed_849(nArray7[0], nArray5, arg2));
            nArray4 = sprxta.cfr_renamed_841(nArray5);
            nArray5 = sprxta.cfr_renamed_841(nArray8);
            nArray6 = nArray2;
        }
        int n = sprxta.cfr_renamed_833(nArray);
        sprxta sprxta4 = this;
        nArray4 = sprxta4.cfr_renamed_840(nArray4, sprxta4.cfr_renamed_4.cfr_renamed_817(n));
        return nArray4;
    }

    private static /* synthetic */ int cfr_renamed_834(int[] arg0) {
        int n;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0 && arg0[n] == 0) {
            n2 = --n;
        }
        return n;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !(arg0 instanceof sprxta)) {
            return false;
        }
        sprxta sprxta2 = (sprxta)arg0;
        return this.cfr_renamed_4.equals(sprxta2.cfr_renamed_4) && this.cfr_renamed_2 == sprxta2.cfr_renamed_2 && sprxta.cfr_renamed_850(this.cfr_renamed_3, sprxta2.cfr_renamed_3);
    }

    public byte[] cfr_renamed_91() {
        int n;
        int n2 = 8;
        int n3 = 1;
        sprxta sprxta2 = this;
        while (sprxta2.cfr_renamed_4.cfr_renamed_813() > n2) {
            n2 += 8;
            sprxta2 = this;
            ++n3;
        }
        byte[] byArray = new byte[this.cfr_renamed_3.length * n3];
        n3 = 0;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_3.length) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < n2) {
                int n7 = n3++;
                byte by = (byte)(this.cfr_renamed_3[n] >>> n5);
                byArray[n7] = by;
                n6 = n5 += 8;
            }
            n4 = ++n;
        }
        return byArray;
    }

    private /* synthetic */ int[] cfr_renamed_840(int[] arg0, int arg1) {
        int n;
        int n2 = sprxta.cfr_renamed_834(arg0);
        if (n2 == -1 || arg1 == 0) {
            return new int[1];
        }
        if (arg1 == 1) {
            return sprhva.cfr_renamed_535(arg0);
        }
        int[] nArray = new int[n2 + 1];
        int n3 = n = n2;
        while (n3 >= 0) {
            int n4 = n--;
            nArray[n4] = this.cfr_renamed_4.cfr_renamed_838(arg0[n4], arg1);
            n3 = n;
        }
        return nArray;
    }

    public sprxta cfr_renamed_851(sprxta[] arg0) {
        int n;
        int n2 = arg0.length;
        int[] nArray = new int[n2];
        int[] nArray2 = new int[n2];
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_3.length) {
            sprxta sprxta2 = this;
            int n4 = n;
            int n5 = sprxta2.cfr_renamed_4.cfr_renamed_838(sprxta2.cfr_renamed_3[n4], this.cfr_renamed_3[n]);
            nArray2[n4] = n5;
            n3 = ++n;
        }
        int n6 = n = 0;
        while (n6 < n2) {
            int n7;
            int n8 = n7 = 0;
            while (n8 < n2) {
                if (n < arg0[n7].cfr_renamed_3.length) {
                    int n9 = this.cfr_renamed_4.cfr_renamed_838(arg0[n7].cfr_renamed_3[n], nArray2[n7]);
                    nArray[n] = this.cfr_renamed_4.cfr_renamed_825(nArray[n], n9);
                }
                n8 = ++n7;
            }
            n6 = ++n;
        }
        return new sprxta(this.cfr_renamed_4, nArray);
    }

    private /* synthetic */ boolean cfr_renamed_852(int[] arg0) {
        int n;
        if (arg0[0] == 0) {
            return false;
        }
        int n2 = sprxta.cfr_renamed_834(arg0) >> 1;
        int[] nArray = new int[2];
        nArray[0] = 0;
        nArray[1] = 1;
        int[] nArray2 = nArray;
        int[] nArray3 = new int[2];
        nArray3[0] = 0;
        nArray3[1] = 1;
        int[] nArray4 = nArray3;
        int n3 = this.cfr_renamed_4.cfr_renamed_813();
        int n4 = n = 0;
        while (n4 < n2) {
            int n5 = n3 - 1;
            while (n5 >= 0) {
                int n6;
                nArray2 = this.cfr_renamed_849(nArray2, nArray2, arg0);
                n5 = --n6;
            }
            nArray2 = sprxta.cfr_renamed_841(nArray2);
            sprxta sprxta2 = this;
            int[] nArray5 = sprxta2.cfr_renamed_836(sprxta2.cfr_renamed_832(nArray2, nArray4), arg0);
            if (sprxta.cfr_renamed_834(nArray5) != 0) {
                return false;
            }
            n4 = ++n;
        }
        return true;
    }

    public int cfr_renamed_853() {
        if (this.cfr_renamed_2 == -1) {
            return 0;
        }
        sprxta sprxta2 = this;
        return sprxta2.cfr_renamed_3[sprxta2.cfr_renamed_2];
    }

    public int hashCode() {
        int n;
        int n2 = this.cfr_renamed_4.hashCode();
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_3.length) {
            n2 = n2 * 31 + this.cfr_renamed_3[n++];
            n3 = n;
        }
        return n2;
    }

    public sprxta cfr_renamed_854(sprxta arg0, sprxta arg1) {
        sprxta sprxta2 = this;
        int[] nArray = sprxta2.cfr_renamed_849(sprxta2.cfr_renamed_3, arg0.cfr_renamed_3, arg1.cfr_renamed_3);
        return new sprxta(this.cfr_renamed_4, nArray);
    }

    private /* synthetic */ int[] cfr_renamed_836(int[] arg0, int[] arg1) {
        int[] nArray = arg0;
        int[] nArray2 = arg1;
        if (sprxta.cfr_renamed_834(nArray) == -1) {
            return nArray2;
        }
        int[] nArray3 = nArray2;
        while (sprxta.cfr_renamed_834(nArray3) != -1) {
            int[] nArray4 = this.cfr_renamed_848(nArray, nArray2);
            nArray = new int[nArray2.length];
            System.arraycopy(nArray2, 0, nArray, 0, nArray.length);
            nArray2 = new int[nArray4.length];
            System.arraycopy(nArray4, 0, nArray2, 0, nArray2.length);
            nArray3 = nArray2;
        }
        sprxta sprxta2 = this;
        int n = sprxta2.cfr_renamed_4.cfr_renamed_817(sprxta.cfr_renamed_833(nArray));
        return sprxta2.cfr_renamed_840(nArray, n);
    }

    private /* synthetic */ int[] cfr_renamed_855(int[] arg0, int[] arg1) {
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        if (sprxta.cfr_renamed_834(arg0) < sprxta.cfr_renamed_834(arg1)) {
            nArray3 = arg1;
            nArray2 = arg0;
            nArray = nArray3;
        } else {
            nArray3 = arg0;
            nArray2 = arg1;
            nArray = nArray3;
        }
        nArray3 = sprxta.cfr_renamed_841(nArray);
        nArray2 = sprxta.cfr_renamed_841(nArray2);
        if (nArray2.length == 1) {
            return this.cfr_renamed_840(nArray3, nArray2[0]);
        }
        int n = nArray3.length;
        int n2 = nArray2.length;
        int[] nArray4 = new int[n + n2 - 1];
        if (n2 != n) {
            int[] nArray5 = new int[n2];
            int[] nArray6 = new int[n - n2];
            System.arraycopy(nArray3, 0, nArray5, 0, nArray5.length);
            System.arraycopy(nArray3, n2, nArray6, 0, nArray6.length);
            sprxta sprxta2 = this;
            nArray5 = sprxta2.cfr_renamed_855(nArray5, nArray2);
            nArray6 = sprxta2.cfr_renamed_855(nArray6, nArray2);
            nArray6 = sprxta.cfr_renamed_844(nArray6, n2);
            nArray4 = sprxta2.cfr_renamed_832(nArray5, nArray6);
            return nArray4;
        }
        n2 = n + 1 >>> 1;
        int n3 = n - n2;
        int[] nArray7 = new int[n2];
        int[] nArray8 = new int[n2];
        int[] nArray9 = new int[n3];
        int[] nArray10 = new int[n3];
        System.arraycopy(nArray3, 0, nArray7, 0, nArray7.length);
        System.arraycopy(nArray3, n2, nArray9, 0, nArray9.length);
        System.arraycopy(nArray2, 0, nArray8, 0, nArray8.length);
        System.arraycopy(nArray2, n2, nArray10, 0, nArray10.length);
        sprxta sprxta3 = this;
        int[] nArray11 = sprxta3.cfr_renamed_832(nArray7, nArray9);
        int[] nArray12 = sprxta3.cfr_renamed_832(nArray8, nArray10);
        int[] nArray13 = sprxta3.cfr_renamed_855(nArray7, nArray8);
        int[] nArray14 = sprxta3.cfr_renamed_855(nArray11, nArray12);
        int[] nArray15 = sprxta3.cfr_renamed_855(nArray9, nArray10);
        nArray14 = sprxta3.cfr_renamed_832(nArray14, nArray13);
        nArray14 = sprxta3.cfr_renamed_832(nArray14, nArray15);
        nArray15 = sprxta.cfr_renamed_844(nArray15, n2);
        nArray4 = sprxta3.cfr_renamed_832(nArray14, nArray15);
        nArray4 = sprxta.cfr_renamed_844(nArray4, n2);
        nArray4 = sprxta3.cfr_renamed_832(nArray4, nArray13);
        return nArray4;
    }

    /*
     * WARNING - void declaration
     */
    public sprxta(sprxta sprxta2) {
        void arg0;
        sprxta sprxta3 = this;
        void v1 = arg0;
        this.cfr_renamed_4 = v1.cfr_renamed_4;
        sprxta3.cfr_renamed_2 = v1.cfr_renamed_2;
        sprxta3.cfr_renamed_3 = sprhva.cfr_renamed_535(sprxta2.cfr_renamed_3);
    }

    public int cfr_renamed_816(int arg0) {
        if (arg0 < 0 || arg0 > this.cfr_renamed_2) {
            return 0;
        }
        return this.cfr_renamed_3[arg0];
    }

    public sprxta cfr_renamed_856(sprxta arg0) {
        sprxta sprxta2 = this;
        int[] nArray = sprxta2.cfr_renamed_855(sprxta2.cfr_renamed_3, arg0.cfr_renamed_3);
        return new sprxta(this.cfr_renamed_4, nArray);
    }

    private /* synthetic */ int[] cfr_renamed_832(int[] arg0, int[] arg1) {
        int n;
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        if (arg0.length < arg1.length) {
            nArray3 = new int[arg1.length];
            System.arraycopy(arg1, 0, nArray3, 0, arg1.length);
            nArray = nArray2 = arg0;
        } else {
            nArray3 = new int[arg0.length];
            System.arraycopy(arg0, 0, nArray3, 0, arg0.length);
            nArray = nArray2 = arg1;
        }
        int n2 = n = nArray.length - 1;
        while (n2 >= 0) {
            nArray3[--n] = this.cfr_renamed_4.cfr_renamed_825(nArray3[n], nArray2[n]);
            n2 = n;
        }
        return nArray3;
    }

    /*
     * WARNING - void declaration
     */
    public sprxta(sprmpa sprmpa2, byte[] byArray) {
        int n;
        void arg1;
        void arg0;
        void v0 = arg0;
        void v1 = v0;
        this.cfr_renamed_4 = v0;
        int n2 = 8;
        int n3 = 1;
        while (v1.cfr_renamed_813() > n2) {
            n2 += 8;
            v1 = arg0;
            ++n3;
        }
        if (((void)arg1).length % n3 != 0) {
            throw new IllegalArgumentException(sprdus.cfr_renamed_9("[\u001c\t+\u0014+Ay\u0019 \u000f<[8\t+\u001a [0\by\u00156\u000fy\u001e7\u00186\u001f<\u001fy\u000b6\u0017 \u00156\u00160\u001a5[6\r<\ty\u001c0\r<\u0015y\u001d0\u00150\u000f<[?\u0012<\u0017=[\u001e=k\u0016"));
        }
        this.cfr_renamed_3 = new int[((void)arg1).length / n3];
        n3 = 0;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_3.length) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < n2) {
                int n7 = n;
                int n8 = arg1[n3] & 0xFF;
                ++n3;
                int n9 = this.cfr_renamed_3[n7] ^ n8 << n5;
                this.cfr_renamed_3[n7] = n9;
                n6 = n5 += 8;
            }
            sprxta sprxta2 = this;
            if (!sprxta2.cfr_renamed_4.cfr_renamed_839(sprxta2.cfr_renamed_3[n])) {
                throw new IllegalArgumentException(spryeo.cfr_renamed_9("\u00061T\u0006I\u0006\u001cTD\rR\u0011\u0006\u0015T\u0006G\r\u0006\u001dUTH\u001bRTC\u001aE\u001bB\u0011BTV\u001bJ\rH\u001bK\u001dG\u0018\u0006\u001bP\u0011TTA\u001dP\u0011HT@\u001dH\u001dR\u0011\u0006\u0012O\u0011J\u0010\u00063`FK"));
            }
            n4 = ++n;
        }
        if (this.cfr_renamed_3.length != 1) {
            sprxta sprxta3 = this;
            if (sprxta3.cfr_renamed_3[sprxta3.cfr_renamed_3.length - 1] == 0) {
                throw new IllegalArgumentException(sprdus.cfr_renamed_9("[\u001c\t+\u0014+Ay\u0019 \u000f<[8\t+\u001a [0\by\u00156\u000fy\u001e7\u00186\u001f<\u001fy\u000b6\u0017 \u00156\u00160\u001a5[6\r<\ty\u001c0\r<\u0015y\u001d0\u00150\u000f<[?\u0012<\u0017=[\u001e=k\u0016"));
            }
        }
        this.cfr_renamed_842();
    }

    public sprxta cfr_renamed_857(sprxta arg0, sprxta arg1) {
        sprxta sprxta2 = this;
        int[] nArray = sprxta2.cfr_renamed_847(sprxta2.cfr_renamed_3, arg0.cfr_renamed_3, arg1.cfr_renamed_3);
        return new sprxta(this.cfr_renamed_4, nArray);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ boolean cfr_renamed_850(int[] nArray, int[] nArray2) {
        int n;
        int n2;
        int[] arg0;
        int n3 = sprxta.cfr_renamed_834(arg0);
        if (n3 != (n2 = sprxta.cfr_renamed_834(nArray2))) {
            return false;
        }
        int n4 = n = 0;
        while (n4 <= n3) {
            void arg1;
            if (arg0[n] != arg1[n]) {
                return false;
            }
            n4 = ++n;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public sprxta(sprmpa sprmpa2, int n, char c, SecureRandom secureRandom) {
        sprxta sprxta2;
        void arg0;
        this.cfr_renamed_4 = arg0;
        switch (c) {
            case 'I': {
                void arg3;
                void arg1;
                sprxta2 = this;
                while (false) {
                }
                sprxta2.cfr_renamed_3 = sprxta2.cfr_renamed_858((int)arg1, (SecureRandom)arg3);
                break;
            }
            default: {
                void arg2;
                throw new IllegalArgumentException(new StringBuilder().insert(0, spryeo.cfr_renamed_9("\u00061T\u0006I\u0006\u001cTR\rV\u0011\u0006")).append((char)arg2).append(sprdus.cfr_renamed_9("[0\by\u00156\u000fy\u001f<\u001d0\u0015<\u001fy\u001d6\ty<\u001fI*\u00168\u00175\u0016\t\u00145\u00027\u00144\u00128\u0017")).toString());
            }
        }
        sprxta2.cfr_renamed_842();
    }

    private /* synthetic */ int[] cfr_renamed_849(int[] arg0, int[] arg1, int[] arg2) {
        sprxta sprxta2 = this;
        return sprxta2.cfr_renamed_848(sprxta2.cfr_renamed_855(arg0, arg1), arg2);
    }

    private static /* synthetic */ int[] cfr_renamed_844(int[] arg0, int arg1) {
        int n = sprxta.cfr_renamed_834(arg0);
        if (n == -1) {
            return new int[1];
        }
        int[] nArray = new int[n + arg1 + 1];
        System.arraycopy(arg0, 0, nArray, arg1, n + 1);
        return nArray;
    }

    private /* synthetic */ int[] cfr_renamed_848(int[] arg0, int[] arg1) {
        int n = sprxta.cfr_renamed_834(arg1);
        if (n == -1) {
            throw new ArithmeticException(spryeo.cfr_renamed_9("0O\u0002O\u0007O\u001bHTD\r\u0006\u000eC\u0006I"));
        }
        int[] nArray = new int[arg0.length];
        int n2 = sprxta.cfr_renamed_833(arg1);
        n2 = this.cfr_renamed_4.cfr_renamed_817(n2);
        System.arraycopy(arg0, 0, nArray, 0, nArray.length);
        int n3 = n;
        while (n3 <= sprxta.cfr_renamed_834(nArray)) {
            sprxta sprxta2 = this;
            int n4 = sprxta2.cfr_renamed_4.cfr_renamed_838(sprxta.cfr_renamed_833(nArray), n2);
            int[] nArray2 = sprxta.cfr_renamed_844(arg1, sprxta.cfr_renamed_834(nArray) - n);
            nArray2 = sprxta2.cfr_renamed_840(nArray2, n4);
            nArray = sprxta2.cfr_renamed_832(nArray2, nArray);
            n3 = n;
        }
        return nArray;
    }

    public sprxta cfr_renamed_814(sprxta arg0) {
        sprxta sprxta2 = this;
        int[] nArray = sprxta2.cfr_renamed_848(sprxta2.cfr_renamed_3, arg0.cfr_renamed_3);
        return new sprxta(this.cfr_renamed_4, nArray);
    }

    public sprxta[] cfr_renamed_859(sprxta arg0) {
        sprxta sprxta2 = this;
        int[][] nArray = sprxta2.cfr_renamed_843(sprxta2.cfr_renamed_3, arg0.cfr_renamed_3);
        sprxta[] sprxtaArray = new sprxta[2];
        sprxtaArray[0] = new sprxta(this.cfr_renamed_4, nArray[0]);
        sprxtaArray[1] = new sprxta(this.cfr_renamed_4, nArray[1]);
        return sprxtaArray;
    }

    public sprxta cfr_renamed_860(int arg0) {
        int[] nArray = sprxta.cfr_renamed_844(this.cfr_renamed_3, arg0);
        return new sprxta(this.cfr_renamed_4, nArray);
    }

    public void cfr_renamed_818(int arg0) {
        if (!this.cfr_renamed_4.cfr_renamed_839(arg0)) {
            throw new ArithmeticException(sprdus.cfr_renamed_9("56\u000fy\u001a7[<\u0017<\u0016<\u0015-[6\u001dy\u000f1\u001ey\u001d0\u00150\u000f<[?\u0012<\u0017=[-\u00130\by\u000b6\u0017 \u00156\u00160\u001a5[0\by\u001f<\u001d0\u0015<\u001fy\u0014/\u001e+U"));
        }
        sprxta sprxta2 = this;
        sprxta2.cfr_renamed_3 = sprxta2.cfr_renamed_840(sprxta2.cfr_renamed_3, arg0);
        sprxta2.cfr_renamed_842();
    }

    /*
     * WARNING - void declaration
     */
    public sprxta(sprmpa sprmpa2, int n) {
        void arg1;
        void arg0;
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_2 = arg1;
        this.cfr_renamed_3 = new int[n + 1];
        this.cfr_renamed_3[arg1] = 1;
    }

    public sprxta cfr_renamed_861(sprxta arg0) {
        sprxta sprxta2 = this;
        int[] nArray = sprxta2.cfr_renamed_832(sprxta2.cfr_renamed_3, arg0.cfr_renamed_3);
        return new sprxta(this.cfr_renamed_4, nArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprxta(sprmpa sprmpa2) {
        void arg0;
        sprxta sprxta2 = this;
        this.cfr_renamed_4 = arg0;
        sprxta2.cfr_renamed_2 = -1;
        sprxta2.cfr_renamed_3 = new int[1];
    }

    private /* synthetic */ void cfr_renamed_842() {
        this.cfr_renamed_2 = this.cfr_renamed_3.length - 1;
        sprxta sprxta2 = this;
        while (sprxta2.cfr_renamed_2 >= 0) {
            sprxta sprxta3 = this;
            if (sprxta3.cfr_renamed_3[sprxta3.cfr_renamed_2] != 0) break;
            sprxta sprxta4 = this;
            sprxta2 = sprxta4;
            --sprxta4.cfr_renamed_2;
        }
    }

    private /* synthetic */ int[] cfr_renamed_858(int arg0, SecureRandom arg1) {
        int n;
        int[] nArray = new int[arg0 + 1];
        nArray[arg0] = 1;
        nArray[0] = this.cfr_renamed_4.cfr_renamed_862(arg1);
        int n2 = n = 1;
        while (n2 < arg0) {
            nArray[n++] = this.cfr_renamed_4.cfr_renamed_863(arg1);
            n2 = n;
        }
        while (!this.cfr_renamed_852(nArray)) {
            n = sprqna.cfr_renamed_808(arg1, arg0);
            if (n == 0) {
                nArray[0] = this.cfr_renamed_4.cfr_renamed_862(arg1);
                continue;
            }
            nArray[n] = this.cfr_renamed_4.cfr_renamed_863(arg1);
        }
        return nArray;
    }

    public sprxta cfr_renamed_864(sprxta[] arg0) {
        int n;
        int n2 = arg0.length;
        int[] nArray = new int[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            int n4;
            int n5 = n4 = 0;
            while (n5 < n2) {
                if (n < arg0[n4].cfr_renamed_3.length && n4 < this.cfr_renamed_3.length) {
                    int n6 = this.cfr_renamed_4.cfr_renamed_838(arg0[n4].cfr_renamed_3[n], this.cfr_renamed_3[n4]);
                    nArray[n] = this.cfr_renamed_4.cfr_renamed_825(nArray[n], n6);
                }
                n5 = ++n4;
            }
            n3 = ++n;
        }
        int n7 = n = 0;
        while (n7 < n2) {
            nArray[++n] = this.cfr_renamed_4.cfr_renamed_865(nArray[n]);
            n7 = n;
        }
        return new sprxta(this.cfr_renamed_4, nArray);
    }

    public sprxta cfr_renamed_866(sprxta arg0) {
        int[] nArray;
        sprxta sprxta2 = this;
        int[] nArray2 = sprhva.cfr_renamed_535(sprxta2.cfr_renamed_3);
        int[] nArray3 = nArray = sprxta2.cfr_renamed_849(nArray2, nArray2, arg0.cfr_renamed_3);
        while (!sprxta.cfr_renamed_850(nArray3, this.cfr_renamed_3)) {
            nArray2 = sprxta.cfr_renamed_841(nArray);
            nArray3 = this.cfr_renamed_849(nArray2, nArray2, arg0.cfr_renamed_3);
        }
        return new sprxta(this.cfr_renamed_4, nArray2);
    }

    public void cfr_renamed_820(sprxta arg0) {
        sprxta sprxta2 = this;
        sprxta2.cfr_renamed_3 = sprxta2.cfr_renamed_832(sprxta2.cfr_renamed_3, arg0.cfr_renamed_3);
        sprxta2.cfr_renamed_842();
    }

    public String toString() {
        int n;
        String string = new StringBuilder().insert(0, spryeo.cfr_renamed_9("\u0006$I\u0018_\u001aI\u0019O\u0015JTI\u0002C\u0006\u0006")).append(this.cfr_renamed_4.toString()).append(sprdus.cfr_renamed_9("Ayq")).toString();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            sprxta sprxta2 = this;
            StringBuilder stringBuilder = new StringBuilder().insert(0, string).append(sprxta2.cfr_renamed_4.cfr_renamed_867(sprxta2.cfr_renamed_3[n])).append(spryeo.cfr_renamed_9("-x")).append(n);
            string = stringBuilder.append("+").toString();
            n2 = ++n;
        }
        string = new StringBuilder().insert(0, string).append(sprdus.cfr_renamed_9("@")).toString();
        return string;
    }

    private static /* synthetic */ int[] cfr_renamed_841(int[] arg0) {
        int n = sprxta.cfr_renamed_834(arg0);
        if (n == -1) {
            return new int[1];
        }
        if (arg0.length == n + 1) {
            return sprhva.cfr_renamed_535(arg0);
        }
        int[] nArray = new int[n + 1];
        System.arraycopy(arg0, 0, nArray, 0, n + 1);
        return nArray;
    }

    public sprxta cfr_renamed_868(sprxta arg0) {
        int[] nArray = new int[1];
        nArray[0] = 1;
        sprxta sprxta2 = this;
        int[] nArray2 = sprxta2.cfr_renamed_847(nArray, sprxta2.cfr_renamed_3, arg0.cfr_renamed_3);
        return new sprxta(this.cfr_renamed_4, nArray2);
    }

    public sprxta[] cfr_renamed_869(sprxta arg0) {
        sprxta sprxta2 = arg0;
        int n = sprxta2.cfr_renamed_2 >> 1;
        int[] nArray = sprxta.cfr_renamed_841(sprxta2.cfr_renamed_3);
        sprxta sprxta3 = this;
        int[] nArray2 = sprxta3.cfr_renamed_848(sprxta3.cfr_renamed_3, arg0.cfr_renamed_3);
        int[] nArray3 = new int[1];
        nArray3[0] = 0;
        int[] nArray4 = nArray3;
        int[] nArray5 = new int[1];
        nArray5[0] = 1;
        int[] nArray6 = nArray5;
        int[] nArray7 = nArray2;
        while (sprxta.cfr_renamed_834(nArray7) > n) {
            int[][] nArray8 = this.cfr_renamed_843(nArray, nArray2);
            nArray = nArray2;
            nArray2 = nArray8[1];
            sprxta sprxta4 = this;
            int[] nArray9 = sprxta4.cfr_renamed_832(nArray4, sprxta4.cfr_renamed_849(nArray8[0], nArray6, arg0.cfr_renamed_3));
            nArray4 = nArray6;
            nArray6 = nArray9;
            nArray7 = nArray2;
        }
        sprxta[] sprxtaArray = new sprxta[2];
        sprxtaArray[0] = new sprxta(this.cfr_renamed_4, nArray2);
        sprxtaArray[1] = new sprxta(this.cfr_renamed_4, nArray6);
        return sprxtaArray;
    }
}

