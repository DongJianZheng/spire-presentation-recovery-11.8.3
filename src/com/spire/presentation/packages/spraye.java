/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spradf;
import com.spire.presentation.packages.sprcye;
import com.spire.presentation.packages.spreyl;
import com.spire.presentation.packages.sprfdf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprquba;
import com.spire.presentation.packages.sprwff;
import com.spire.presentation.packages.sprydf;
import com.spire.presentation.packages.sprzye;
import java.security.SecureRandom;

public class spraye
extends sprzye {
    private int[][] cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public boolean cfr_renamed_805() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_4) {
                if (this.cfr_renamed_3[n][n3] != 0) {
                    return false;
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public spraye(spraye spraye2) {
        int n;
        void arg0;
        spraye spraye3 = this;
        void v1 = arg0;
        this.cfr_renamed_1 = arg0.cfr_renamed_883();
        this.cfr_renamed_2 = v1.cfr_renamed_884();
        spraye3.cfr_renamed_4 = v1.cfr_renamed_4;
        spraye3.cfr_renamed_3 = new int[spraye2.cfr_renamed_3.length][];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            int n3 = n++;
            this.cfr_renamed_3[n3] = sprydf.cfr_renamed_535(arg0.cfr_renamed_3[n3]);
            n2 = n;
        }
    }

    public sprzye cfr_renamed_1090() {
        int n;
        spraye spraye2 = this;
        int[][] nArray = new int[spraye2.cfr_renamed_1][spraye2.cfr_renamed_2 + 31 >>> 5];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_1) {
                int n5 = n3 >>> 5;
                int n6 = n3 & 0x1F;
                int n7 = this.cfr_renamed_3[n][n5] >>> n6 & 1;
                int n8 = n >>> 5;
                int n9 = n & 0x1F;
                if (n7 == 1) {
                    int[] nArray2 = nArray[n3];
                    int n10 = n8;
                    nArray2[n10] = nArray2[n10] | 1 << n9;
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return new spraye(this.cfr_renamed_2, nArray);
    }

    public spraye cfr_renamed_1103() {
        int n;
        spraye spraye2 = this;
        spraye spraye3 = new spraye(spraye2.cfr_renamed_2, spraye2.cfr_renamed_2 + this.cfr_renamed_1);
        spraye spraye4 = this;
        int n2 = spraye4.cfr_renamed_2 >> 5;
        int n3 = spraye4.cfr_renamed_2 & 0x1F;
        int n4 = n = spraye4.cfr_renamed_2 - 1;
        while (n4 >= 0) {
            int[] nArray = spraye3.cfr_renamed_3[n];
            int n5 = n >> 5;
            nArray[n5] = nArray[n5] | 1 << (n & 0x1F);
            if (n3 != 0) {
                int n6;
                int n7 = n2;
                int n8 = n6 = 0;
                while (n8 < this.cfr_renamed_4 - 1) {
                    int n9 = this.cfr_renamed_3[n][n6];
                    int[] nArray2 = spraye3.cfr_renamed_3[n];
                    int n10 = n7++;
                    nArray2[n10] = nArray2[n10] | n9 << n3;
                    int[] nArray3 = spraye3.cfr_renamed_3[n];
                    int n11 = n7;
                    nArray3[n11] = nArray3[n11] | n9 >>> 32 - n3;
                    n8 = ++n6;
                }
                n6 = this.cfr_renamed_3[n][this.cfr_renamed_4 - 1];
                int[] nArray4 = spraye3.cfr_renamed_3[n];
                int n12 = n7++;
                nArray4[n12] = nArray4[n12] | n6 << n3;
                if (n7 < spraye3.cfr_renamed_4) {
                    int[] nArray5 = spraye3.cfr_renamed_3[n];
                    int n13 = n7;
                    nArray5[n13] = nArray5[n13] | n6 >>> 32 - n3;
                }
            } else {
                System.arraycopy(this.cfr_renamed_3[n], 0, spraye3.cfr_renamed_3[n], n2, this.cfr_renamed_4);
            }
            n4 = --n;
        }
        return spraye3;
    }

    private /* synthetic */ void cfr_renamed_1097(int n, int n2) {
        int n3;
        this.cfr_renamed_2 = n;
        this.cfr_renamed_1 = n2;
        this.cfr_renamed_4 = n2 + 31 >>> 5;
        this.cfr_renamed_3 = new int[this.cfr_renamed_2][this.cfr_renamed_4];
        int n4 = n3 = 0;
        while (n4 < this.cfr_renamed_2) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < this.cfr_renamed_4) {
                this.cfr_renamed_3[n3][n5++] = 0;
                n6 = n5;
            }
            n4 = ++n3;
        }
    }

    public double cfr_renamed_961() {
        int n;
        double d = 0.0;
        double d2 = 0.0;
        int n2 = this.cfr_renamed_1 & 0x1F;
        int n3 = n2 == 0 ? this.cfr_renamed_4 : this.cfr_renamed_4 - 1;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_2) {
            int n5;
            int n6;
            int n7;
            int n8 = n7 = 0;
            while (n8 < n3) {
                n6 = this.cfr_renamed_3[n][n7];
                int n9 = n5 = 0;
                while (n9 < 32) {
                    int n10 = n6 >>> n5 & 1;
                    d += (double)n10;
                    d2 += 1.0;
                    n9 = ++n5;
                }
                n8 = ++n7;
            }
            n7 = this.cfr_renamed_3[n][this.cfr_renamed_4 - 1];
            int n11 = n6 = 0;
            while (n11 < n2) {
                n5 = n7 >>> n6 & 1;
                d += (double)n5;
                d2 += 1.0;
                n11 = ++n6;
            }
            n4 = ++n;
        }
        return d / d2;
    }

    public int[] cfr_renamed_1092(int arg0) {
        return this.cfr_renamed_3[arg0];
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_1094(int n, SecureRandom secureRandom) {
        int n2;
        void arg1;
        void arg0;
        this.cfr_renamed_1 = this.cfr_renamed_2 = n;
        this.cfr_renamed_4 = n + 31 >>> 5;
        this.cfr_renamed_3 = new int[this.cfr_renamed_2][this.cfr_renamed_4];
        spraye spraye2 = new spraye((int)arg0, 'L', (SecureRandom)arg1);
        spraye spraye3 = new spraye((int)arg0, 'U', (SecureRandom)arg1);
        spraye spraye4 = (spraye)spraye2.cfr_renamed_5486(spraye3);
        int[] nArray = new sprwff((int)arg0, (SecureRandom)arg1).cfr_renamed_876();
        int n3 = n2 = 0;
        while (n3 < arg0) {
            System.arraycopy(spraye4.cfr_renamed_3[n2], 0, this.cfr_renamed_3[nArray[++n2]], 0, this.cfr_renamed_4);
            n3 = n2;
        }
    }

    private /* synthetic */ void cfr_renamed_1099(int n) {
        int n2;
        int n3;
        this.cfr_renamed_1 = this.cfr_renamed_2 = n;
        this.cfr_renamed_4 = n + 31 >>> 5;
        this.cfr_renamed_3 = new int[this.cfr_renamed_2][this.cfr_renamed_4];
        int n4 = n3 = 0;
        while (n4 < this.cfr_renamed_2) {
            int n5 = n2 = 0;
            while (n5 < this.cfr_renamed_4) {
                this.cfr_renamed_3[n3][n2++] = 0;
                n5 = n2;
            }
            n4 = ++n3;
        }
        int n6 = n3 = 0;
        while (n6 < this.cfr_renamed_2) {
            n2 = n3 & 0x1F;
            int[] nArray = this.cfr_renamed_3[n3];
            int n7 = n3 >>> 5;
            nArray[n7] = 1 << n2;
            n6 = ++n3;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_1101(int n, SecureRandom secureRandom) {
        int n2;
        void arg0;
        this.cfr_renamed_1 = this.cfr_renamed_2 = n;
        this.cfr_renamed_4 = n + 31 >>> 5;
        this.cfr_renamed_3 = new int[this.cfr_renamed_2][this.cfr_renamed_4];
        int n3 = arg0 & 0x1F;
        int n4 = n3 == 0 ? -1 : (1 << n3) - 1;
        int n5 = n2 = 0;
        while (n5 < this.cfr_renamed_2) {
            void arg1;
            int n6;
            int n7;
            int n8 = n2 >>> 5;
            int n9 = n7 = n2 & 0x1F;
            n7 = 1 << n7;
            int n10 = n6 = 0;
            while (n10 < n8) {
                this.cfr_renamed_3[n2][n6++] = 0;
                n10 = n6;
            }
            this.cfr_renamed_3[n2][n8] = arg1.nextInt() << n9 | n7;
            int n11 = n6 = n8 + 1;
            while (n11 < this.cfr_renamed_4) {
                this.cfr_renamed_3[n2][n6++] = arg1.nextInt();
                n11 = n6;
            }
            int[] nArray = this.cfr_renamed_3[n2];
            int n12 = this.cfr_renamed_4 - 1;
            nArray[n12] = nArray[n12] & n4;
            n5 = ++n2;
        }
    }

    @Override
    public sprzye cfr_renamed_5486(sprzye arg0) {
        int n;
        if (!(arg0 instanceof spraye)) {
            throw new ArithmeticException(spreyl.cfr_renamed_9("PyIjT`\u001dqN8SwI8Y}[qS}Y8RnXj\u001d_{0\u000f1"));
        }
        if (arg0.cfr_renamed_2 != this.cfr_renamed_1) {
            throw new ArithmeticException(sprquba.cfr_renamed_9("\u0006]\u0004_\u001ePJU\u0003K\u0007Y\u001e[\u0002"));
        }
        spraye spraye2 = (spraye)arg0;
        spraye spraye3 = new spraye(this.cfr_renamed_2, arg0.cfr_renamed_1);
        int n2 = this.cfr_renamed_1 & 0x1F;
        int n3 = n2 == 0 ? this.cfr_renamed_4 : this.cfr_renamed_4 - 1;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_2) {
            int n5;
            int n6;
            int n7;
            int n8;
            int n9 = 0;
            int n10 = n8 = 0;
            while (n10 < n3) {
                n7 = this.cfr_renamed_3[n][n8];
                int n11 = n6 = 0;
                while (n11 < 32) {
                    n5 = n7 & 1 << n6;
                    if (n5 != 0) {
                        int n12;
                        int n13 = n12 = 0;
                        while (n13 < spraye2.cfr_renamed_4) {
                            int[] nArray = spraye3.cfr_renamed_3[n];
                            int n14 = n12;
                            int n15 = nArray[n14] ^ spraye2.cfr_renamed_3[n9][n12];
                            nArray[n14] = n15;
                            n13 = ++n12;
                        }
                    }
                    ++n9;
                    n11 = ++n6;
                }
                n10 = ++n8;
            }
            n8 = this.cfr_renamed_3[n][this.cfr_renamed_4 - 1];
            int n16 = n7 = 0;
            while (n16 < n2) {
                n6 = n8 & 1 << n7;
                if (n6 != 0) {
                    int n17 = n5 = 0;
                    while (n17 < spraye2.cfr_renamed_4) {
                        int[] nArray = spraye3.cfr_renamed_3[n];
                        int n18 = n5;
                        int n19 = nArray[n18] ^ spraye2.cfr_renamed_3[n9][n5];
                        nArray[n18] = n19;
                        n17 = ++n5;
                    }
                }
                ++n9;
                n16 = ++n7;
            }
            n4 = ++n;
        }
        return spraye3;
    }

    @Override
    public sprzye cfr_renamed_5483(sprwff arg0) {
        int n;
        int[] nArray = arg0.cfr_renamed_876();
        if (nArray.length != this.cfr_renamed_1) {
            throw new ArithmeticException(spreyl.cfr_renamed_9("tXvZlU8PqNu\\l^p"));
        }
        spraye spraye2 = this;
        spraye spraye3 = new spraye(spraye2.cfr_renamed_2, spraye2.cfr_renamed_1);
        int n2 = n = this.cfr_renamed_1 - 1;
        while (n2 >= 0) {
            int n3 = n >>> 5;
            int n4 = n & 0x1F;
            int n5 = nArray[n] >>> 5;
            int n6 = nArray[n] & 0x1F;
            int n7 = this.cfr_renamed_2 - 1;
            while (n7 >= 0) {
                int n8;
                int[] nArray2 = spraye3.cfr_renamed_3[n8];
                int n9 = n3;
                int n10 = nArray2[n9] | (this.cfr_renamed_3[n8][n5] >>> n6 & 1) << n4;
                nArray2[n9] = n10;
                n7 = --n8;
            }
            n2 = --n;
        }
        return spraye3;
    }

    /*
     * WARNING - void declaration
     */
    public spraye(byte[] byArray) {
        int n;
        void arg0;
        if (byArray.length < 9) {
            throw new ArithmeticException(sprquba.cfr_renamed_9("\rQ\u001c]\u0004\u0018\u000bJ\u0018Y\u0013\u0018\u0003KJV\u0005LJY\u0004\u0018\u000fV\tW\u000e]\u000e\u0018\u0007Y\u001eJ\u0003@JW\u001c]\u0018\u0018-~B\nC"));
        }
        spraye spraye2 = this;
        spraye spraye3 = this;
        spraye3.cfr_renamed_2 = sprfdf.cfr_renamed_871((byte[])arg0, 0);
        spraye3.cfr_renamed_1 = sprfdf.cfr_renamed_871((byte[])arg0, 4);
        int n2 = (spraye2.cfr_renamed_1 + 7 >>> 3) * this.cfr_renamed_2;
        if (spraye2.cfr_renamed_2 <= 0 || n2 != ((void)arg0).length - 8) {
            throw new ArithmeticException(spreyl.cfr_renamed_9("\u007fTnXv\u001dyOj\\a\u001dqN8SwI8\\v\u001d}S{R|X|\u001du\\lOqE8RnXj\u001d_{0\u000f1"));
        }
        spraye spraye4 = this;
        spraye4.cfr_renamed_4 = spraye4.cfr_renamed_1 + 31 >>> 5;
        spraye4.cfr_renamed_3 = new int[spraye4.cfr_renamed_2][this.cfr_renamed_4];
        spraye spraye5 = this;
        int n3 = spraye5.cfr_renamed_1 >> 5;
        int n4 = spraye5.cfr_renamed_1 & 0x1F;
        int n5 = 8;
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_2) {
            int n7;
            int n8 = n7 = 0;
            while (n8 < n3) {
                this.cfr_renamed_3[n][n7++] = sprfdf.cfr_renamed_871((byte[])arg0, n5);
                n5 += 4;
                n8 = n7;
            }
            int n9 = n7 = 0;
            while (n9 < n4) {
                int[] nArray = this.cfr_renamed_3[n];
                int n10 = n3;
                int n11 = arg0[n5] & 0xFF;
                ++n5;
                int n12 = nArray[n10] ^ n11 << n7;
                nArray[n10] = n12;
                n9 = n7 += 8;
            }
            n6 = ++n;
        }
    }

    @Override
    public String toString() {
        int n;
        int n2 = this.cfr_renamed_1 & 0x1F;
        int n3 = n2 == 0 ? this.cfr_renamed_4 : this.cfr_renamed_4 - 1;
        StringBuffer stringBuffer = new StringBuffer();
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_2) {
            int n5;
            int n6;
            stringBuffer.append(n + ": ");
            int n7 = 0;
            int n8 = n7;
            while (n8 < n3) {
                n6 = this.cfr_renamed_3[n][n7];
                int n9 = n5 = 0;
                while (n9 < 32) {
                    if ((n6 >>> n5 & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                    n9 = ++n5;
                }
                stringBuffer.append(' ');
                n8 = ++n7;
            }
            n7 = this.cfr_renamed_3[n][this.cfr_renamed_4 - 1];
            int n10 = n6 = 0;
            while (n10 < n2) {
                n5 = n7 >>> n6 & 1;
                StringBuffer stringBuffer2 = stringBuffer;
                if (n5 == 0) {
                    stringBuffer2.append('0');
                } else {
                    stringBuffer2.append('1');
                }
                n10 = ++n6;
            }
            stringBuffer.append('\n');
            n4 = ++n;
        }
        return stringBuffer.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public spraye(int n, char c, SecureRandom secureRandom) {
        void arg1;
        if (n <= 0) {
            throw new ArithmeticException(sprquba.cfr_renamed_9("9Q\u0010]JW\f\u0018\u0007Y\u001eJ\u0003@JQ\u0019\u0018\u0004W\u0004\u0015\u001aW\u0019Q\u001eQ\u001c]D"));
        }
        switch (arg1) {
            case 90: {
                void arg0;
                void v0 = arg0;
                this.cfr_renamed_1097((int)v0, (int)v0);
                return;
            }
            case 73: {
                void arg0;
                this.cfr_renamed_1099((int)arg0);
                return;
            }
            case 76: {
                void arg2;
                void arg0;
                this.cfr_renamed_1100((int)arg0, (SecureRandom)arg2);
                return;
            }
            case 85: {
                void arg2;
                void arg0;
                this.cfr_renamed_1101((int)arg0, (SecureRandom)arg2);
                return;
            }
            case 82: {
                void arg2;
                void arg0;
                this.cfr_renamed_1094((int)arg0, (SecureRandom)arg2);
                return;
            }
        }
        throw new ArithmeticException(spreyl.cfr_renamed_9("hvVvRoS8PyIjT`\u001dlDhX6"));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spraye(int n, int n2) {
        void arg1;
        void arg0;
        if (n2 <= 0 || arg0 <= 0) {
            throw new ArithmeticException(sprquba.cfr_renamed_9("K\u0003B\u000f\u0018\u0005^JU\u000bL\u0018Q\u0012\u0018\u0003KJV\u0005VGH\u0005K\u0003L\u0003N\u000f"));
        }
        this.cfr_renamed_1097((int)arg0, (int)arg1);
    }

    @Override
    public byte[] cfr_renamed_91() {
        int n;
        spraye spraye2 = this;
        int n2 = spraye2.cfr_renamed_1 + 7 >>> 3;
        spraye spraye3 = this;
        n2 *= spraye3.cfr_renamed_2;
        byte[] byArray = new byte[n2 += 8];
        sprfdf.cfr_renamed_877(spraye2.cfr_renamed_2, byArray, 0);
        sprfdf.cfr_renamed_877(spraye3.cfr_renamed_1, byArray, 4);
        int n3 = spraye2.cfr_renamed_1 >>> 5;
        int n4 = spraye2.cfr_renamed_1 & 0x1F;
        int n5 = 8;
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_2) {
            int n7;
            int n8 = n7 = 0;
            while (n8 < n3) {
                int n9 = this.cfr_renamed_3[n][n7];
                sprfdf.cfr_renamed_877(n9, byArray, n5);
                n5 += 4;
                n8 = ++n7;
            }
            int n10 = n7 = 0;
            while (n10 < n4) {
                int n11 = n5++;
                byte by = (byte)(this.cfr_renamed_3[n][n3] >>> n7 & 0xFF);
                byArray[n11] = by;
                n10 = n7 += 8;
            }
            n6 = ++n;
        }
        return byArray;
    }

    public spraye cfr_renamed_1096() {
        int n;
        spraye spraye2 = this;
        spraye spraye3 = this;
        int n2 = spraye2.cfr_renamed_1 + spraye3.cfr_renamed_2;
        spraye spraye4 = new spraye(this.cfr_renamed_2, n2);
        int n3 = spraye2.cfr_renamed_2 - 1 + this.cfr_renamed_1;
        int n4 = n = spraye3.cfr_renamed_2 - 1;
        while (n4 >= 0) {
            spraye spraye5 = spraye4;
            System.arraycopy(this.cfr_renamed_3[n], 0, spraye5.cfr_renamed_3[n], 0, this.cfr_renamed_4);
            int[] nArray = spraye5.cfr_renamed_3[n];
            int n5 = n3 >> 5;
            nArray[n5] = nArray[n5] | 1 << (n3 & 0x1F);
            --n3;
            n4 = --n;
        }
        return spraye4;
    }

    @Override
    public sprcye cfr_renamed_5485(sprcye arg0) {
        int n;
        int n2;
        int n3;
        if (!(arg0 instanceof spradf)) {
            throw new ArithmeticException(spreyl.cfr_renamed_9("K}^lRj\u001dqN8SwI8Y}[qS}Y8RnXj\u001d_{0\u000f1"));
        }
        if (arg0.cfr_renamed_4 != this.cfr_renamed_2) {
            throw new ArithmeticException(sprquba.cfr_renamed_9("\u0006]\u0004_\u001ePJU\u0003K\u0007Y\u001e[\u0002"));
        }
        int[] nArray = ((spradf)arg0).cfr_renamed_959();
        spraye spraye2 = this;
        int[] nArray2 = new int[spraye2.cfr_renamed_4];
        int n4 = spraye2.cfr_renamed_2 >> 5;
        int n5 = 1 << (this.cfr_renamed_2 & 0x1F);
        int n6 = 0;
        int n7 = n3 = 0;
        while (n7 < n4) {
            n2 = 1;
            do {
                if ((n = nArray[n3] & n2) != 0) {
                    int n8;
                    int n9 = n8 = 0;
                    while (n9 < this.cfr_renamed_4) {
                        int n10 = n8;
                        int n11 = nArray2[n10] ^ this.cfr_renamed_3[n6][n8];
                        nArray2[n10] = n11;
                        n9 = ++n8;
                    }
                }
                ++n6;
            } while ((n2 <<= 1) != 0);
            n7 = ++n3;
        }
        int n12 = n3 = 1;
        while (n12 != n5) {
            n2 = nArray[n4] & n3;
            if (n2 != 0) {
                int n13 = n = 0;
                while (n13 < this.cfr_renamed_4) {
                    int n14 = n;
                    int n15 = nArray2[n14] ^ this.cfr_renamed_3[n6][n];
                    nArray2[n14] = n15;
                    n13 = ++n;
                }
            }
            ++n6;
            n12 = n3 << 1;
        }
        return new spradf(nArray2, this.cfr_renamed_1);
    }

    @Override
    public sprcye cfr_renamed_5484(sprcye arg0) {
        int n;
        if (!(arg0 instanceof spradf)) {
            throw new ArithmeticException(spreyl.cfr_renamed_9("K}^lRj\u001dqN8SwI8Y}[qS}Y8RnXj\u001d_{0\u000f1"));
        }
        if (arg0.cfr_renamed_4 != this.cfr_renamed_1) {
            throw new ArithmeticException(sprquba.cfr_renamed_9("\u0006]\u0004_\u001ePJU\u0003K\u0007Y\u001e[\u0002"));
        }
        int[] nArray = ((spradf)arg0).cfr_renamed_959();
        int[] nArray2 = new int[this.cfr_renamed_2 + 31 >>> 5];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            int n3;
            int n4;
            int n5 = 0;
            int n6 = n4 = 0;
            while (n6 < this.cfr_renamed_4) {
                int n7 = this.cfr_renamed_3[n][n4];
                int n8 = nArray[n4];
                n5 ^= n7 & n8;
                n6 = ++n4;
            }
            n4 = 0;
            int n9 = n3 = 0;
            while (n9 < 32) {
                int n10 = n5 >>> n3;
                n4 ^= n10 & 1;
                n9 = ++n3;
            }
            if (n4 == 1) {
                int n11 = n >>> 5;
                nArray2[n11] = nArray2[n11] | 1 << (n & 0x1F);
            }
            n2 = ++n;
        }
        return new spradf(nArray2, this.cfr_renamed_2);
    }

    public boolean equals(Object arg0) {
        int n;
        if (!(arg0 instanceof spraye)) {
            return false;
        }
        spraye spraye2 = (spraye)arg0;
        if (this.cfr_renamed_2 != spraye2.cfr_renamed_2 || this.cfr_renamed_1 != spraye2.cfr_renamed_1 || this.cfr_renamed_4 != spraye2.cfr_renamed_4) {
            return false;
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            if (!sprydf.cfr_renamed_874(this.cfr_renamed_3[n], spraye2.cfr_renamed_3[n])) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    @Override
    public sprzye cfr_renamed_875() {
        int n;
        int n2;
        int n3;
        int n4;
        spraye spraye2 = this;
        if (spraye2.cfr_renamed_2 != spraye2.cfr_renamed_1) {
            throw new ArithmeticException(spreyl.cfr_renamed_9("U\\lOqE8Tk\u001dvRl\u001dqSnXjIq_tX6"));
        }
        spraye spraye3 = this;
        int[][] nArray = new int[spraye3.cfr_renamed_2][spraye3.cfr_renamed_4];
        int n5 = n4 = this.cfr_renamed_2 - 1;
        while (n5 >= 0) {
            int n6 = n4--;
            nArray[n6] = sprydf.cfr_renamed_535(this.cfr_renamed_3[n6]);
            n5 = n4;
        }
        spraye spraye4 = this;
        int[][] nArray2 = new int[spraye4.cfr_renamed_2][spraye4.cfr_renamed_4];
        int n7 = n3 = this.cfr_renamed_2 - 1;
        while (n7 >= 0) {
            n2 = n3 >> 5;
            n = n3 & 0x1F;
            int[] nArray3 = nArray2[n3];
            nArray3[n2] = 1 << n;
            n7 = --n3;
        }
        int n8 = n3 = 0;
        while (n8 < this.cfr_renamed_2) {
            int n9;
            n2 = n3 >> 5;
            n = 1 << (n3 & 0x1F);
            if ((nArray[n3][n2] & n) == 0) {
                n9 = 0;
                int n10 = n3 + 1;
                while (n10 < this.cfr_renamed_2) {
                    int n11;
                    if ((nArray[n11][n2] & n) != 0) {
                        n9 = 1;
                        int n12 = n3;
                        spraye.cfr_renamed_1093(nArray, n12, n11);
                        spraye.cfr_renamed_1093(nArray2, n12, n11);
                        n11 = this.cfr_renamed_2;
                    }
                    n10 = ++n11;
                }
                if (n9 == 0) {
                    throw new ArithmeticException(sprquba.cfr_renamed_9("'Y\u001eJ\u0003@JQ\u0019\u0018\u0004W\u001e\u0018\u0003V\u001c]\u0018L\u0003Z\u0006]D"));
                }
            }
            int n13 = this.cfr_renamed_2 - 1;
            while (n13 >= 0) {
                if (n9 != n3 && (nArray[n9][n2] & n) != 0) {
                    int n14 = n3;
                    spraye.cfr_renamed_1098(nArray[n14], nArray[n9], n2);
                    spraye.cfr_renamed_1098(nArray2[n14], nArray2[n9], 0);
                }
                n13 = --n9;
            }
            n8 = ++n3;
        }
        return new spraye(this.cfr_renamed_1, nArray2);
    }

    public spraye cfr_renamed_945() {
        int n;
        spraye spraye2 = this;
        if (spraye2.cfr_renamed_1 <= spraye2.cfr_renamed_2) {
            throw new ArithmeticException(spreyl.cfr_renamed_9("}PhIa\u001dkHzPyIjT`"));
        }
        spraye spraye3 = this;
        int n2 = spraye3.cfr_renamed_2 + 31 >> 5;
        int[][] nArray = new int[spraye3.cfr_renamed_2][n2];
        int n3 = (1 << (this.cfr_renamed_2 & 0x1F)) - 1;
        if (n3 == 0) {
            n3 = -1;
        }
        int n4 = n = this.cfr_renamed_2 - 1;
        while (n4 >= 0) {
            int n5 = n;
            System.arraycopy(this.cfr_renamed_3[n5], 0, nArray[n], 0, n2);
            int[] nArray2 = nArray[n5];
            int n6 = n2 - 1;
            nArray2[n6] = nArray2[n6] & n3;
            n4 = --n;
        }
        return new spraye(this.cfr_renamed_2, nArray);
    }

    public int cfr_renamed_806() {
        return this.cfr_renamed_4;
    }

    public static spraye[] cfr_renamed_1104(int arg0, SecureRandom arg1) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        spraye[] sprayeArray = new spraye[2];
        int n9 = arg0 + 31 >> 5;
        spraye spraye2 = new spraye(arg0, 'L', arg1);
        spraye spraye3 = new spraye(arg0, 'U', arg1);
        spraye spraye4 = (spraye)spraye2.cfr_renamed_5486(spraye3);
        sprwff sprwff2 = new sprwff(arg0, arg1);
        int[] nArray = sprwff2.cfr_renamed_876();
        int[][] nArray2 = new int[arg0][n9];
        int n10 = n8 = 0;
        while (n10 < arg0) {
            int[] nArray3 = spraye4.cfr_renamed_3[nArray[n8]];
            int[] nArray4 = nArray2[n8];
            System.arraycopy(nArray3, 0, nArray4, 0, n9);
            n10 = ++n8;
        }
        sprayeArray[0] = new spraye(arg0, nArray2);
        spraye spraye5 = new spraye(arg0, 'I');
        int n11 = n7 = 0;
        while (n11 < arg0) {
            n6 = n7 & 0x1F;
            n5 = n7 >>> 5;
            n4 = 1 << n6;
            int n12 = n7 + 1;
            while (n12 < arg0) {
                n2 = spraye2.cfr_renamed_3[n3][n5] & n4;
                if (n2 != 0) {
                    int n13 = n = 0;
                    while (n13 <= n5) {
                        int[] nArray5 = spraye5.cfr_renamed_3[n3];
                        int n14 = n;
                        int n15 = nArray5[n14] ^ spraye5.cfr_renamed_3[n7][n];
                        nArray5[n14] = n15;
                        n13 = ++n;
                    }
                }
                n12 = ++n3;
            }
            n11 = ++n7;
        }
        spraye spraye6 = new spraye(arg0, 'I');
        int n16 = n6 = arg0 - 1;
        while (n16 >= 0) {
            n5 = n6 & 0x1F;
            n4 = n6 >>> 5;
            n3 = 1 << n5;
            int n17 = n6 - 1;
            while (n17 >= 0) {
                n = spraye3.cfr_renamed_3[n2][n4] & n3;
                if (n != 0) {
                    int n18 = n4;
                    while (n18 < n9) {
                        int n19;
                        int[] nArray6 = spraye6.cfr_renamed_3[n2];
                        int n20 = n19;
                        int n21 = nArray6[n20] ^ spraye6.cfr_renamed_3[n6][n19];
                        nArray6[n20] = n21;
                        n18 = ++n19;
                    }
                }
                n17 = --n2;
            }
            n16 = --n6;
        }
        sprayeArray[1] = (spraye)spraye6.cfr_renamed_5486(spraye5.cfr_renamed_5483(sprwff2));
        return sprayeArray;
    }

    public int[][] cfr_renamed_1095() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public spraye(int n, int[][] nArray) {
        int n2;
        void arg1;
        void arg0;
        if (nArray[0].length != arg0 + 31 >> 5) {
            throw new ArithmeticException(sprquba.cfr_renamed_9("#V\u001e\u0018\u000bJ\u0018Y\u0013\u0018\u000eW\u000fKJV\u0005LJU\u000bL\tPJ_\u0003N\u000fVJV\u001fU\b]\u0018\u0018\u0005^J[\u0005T\u001fU\u0004KD"));
        }
        this.cfr_renamed_1 = arg0;
        this.cfr_renamed_2 = ((void)arg1).length;
        this.cfr_renamed_4 = ((void)arg1[0]).length;
        int n3 = arg0 & 0x1F;
        int n4 = n3 == 0 ? -1 : (1 << n3) - 1;
        int n5 = n2 = 0;
        while (n5 < this.cfr_renamed_2) {
            void v1 = arg1[n2];
            int n6 = this.cfr_renamed_4 - 1;
            v1[n6] = v1[n6] & n4;
            n5 = ++n2;
        }
        this.cfr_renamed_3 = arg1;
    }

    public int hashCode() {
        int n;
        int n2 = (this.cfr_renamed_2 * 31 + this.cfr_renamed_1) * 31 + this.cfr_renamed_4;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_2) {
            int[] nArray = this.cfr_renamed_3[n];
            n2 = n2 * 31 + sproze.cfr_renamed_552(nArray);
            n3 = ++n;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_1100(int n, SecureRandom secureRandom) {
        int n2;
        this.cfr_renamed_1 = this.cfr_renamed_2 = n;
        this.cfr_renamed_4 = n + 31 >>> 5;
        this.cfr_renamed_3 = new int[this.cfr_renamed_2][this.cfr_renamed_4];
        int n3 = n2 = 0;
        while (n3 < this.cfr_renamed_2) {
            void arg1;
            int n4;
            int n5 = n2 >>> 5;
            int n6 = n2 & 0x1F;
            int n7 = 31 - n6;
            n6 = 1 << n6;
            int n8 = n4 = 0;
            while (n8 < n5) {
                this.cfr_renamed_3[n2][n4++] = arg1.nextInt();
                n8 = n4;
            }
            this.cfr_renamed_3[n2][n5] = arg1.nextInt() >>> n7 | n6;
            int n9 = n4 = n5 + 1;
            while (n9 < this.cfr_renamed_4) {
                this.cfr_renamed_3[n2][n4++] = 0;
                n9 = n4;
            }
            n3 = ++n2;
        }
    }

    public sprzye cfr_renamed_5531(sprwff arg0) {
        int n;
        int[] nArray = arg0.cfr_renamed_876();
        if (nArray.length != this.cfr_renamed_2) {
            throw new ArithmeticException(spreyl.cfr_renamed_9("tXvZlU8PqNu\\l^p"));
        }
        int[][] nArrayArray = new int[this.cfr_renamed_2][];
        int n2 = n = this.cfr_renamed_2 - 1;
        while (n2 >= 0) {
            int n3 = n--;
            nArrayArray[n3] = sprydf.cfr_renamed_535(this.cfr_renamed_3[nArray[n3]]);
            n2 = n;
        }
        return new spraye(this.cfr_renamed_2, nArrayArray);
    }

    public spraye(int arg0, char arg1) {
        this(arg0, arg1, new SecureRandom());
    }

    public sprcye cfr_renamed_5532(sprcye arg0) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        if (!(arg0 instanceof spradf)) {
            throw new ArithmeticException(sprquba.cfr_renamed_9("N\u000f[\u001eW\u0018\u0018\u0003KJV\u0005LJ\\\u000f^\u0003V\u000f\\JW\u001c]\u0018\u0018-~B\nC"));
        }
        if (arg0.cfr_renamed_4 != this.cfr_renamed_2) {
            throw new ArithmeticException(spreyl.cfr_renamed_9("tXvZlU8PqNu\\l^p"));
        }
        int[] nArray = ((spradf)arg0).cfr_renamed_959();
        spraye spraye2 = this;
        int[] nArray2 = new int[this.cfr_renamed_2 + spraye2.cfr_renamed_1 + 31 >>> 5];
        int n6 = spraye2.cfr_renamed_2 >>> 5;
        int n7 = 0;
        int n8 = n5 = 0;
        while (n8 < n6) {
            n4 = 1;
            do {
                if ((n3 = nArray[n5] & n4) != 0) {
                    int n9 = n2 = 0;
                    while (n9 < this.cfr_renamed_4) {
                        int n10 = n2;
                        int n11 = nArray2[n10] ^ this.cfr_renamed_3[n7][n2];
                        nArray2[n10] = n11;
                        n9 = ++n2;
                    }
                    spraye spraye3 = this;
                    n2 = spraye3.cfr_renamed_1 + n7 >>> 5;
                    n = spraye3.cfr_renamed_1 + n7 & 0x1F;
                    int n12 = n2;
                    nArray2[n12] = nArray2[n12] | 1 << n;
                }
                ++n7;
            } while ((n4 <<= 1) != 0);
            n8 = ++n5;
        }
        n5 = 1 << (this.cfr_renamed_2 & 0x1F);
        int n13 = n4 = 1;
        while (n13 != n5) {
            n3 = nArray[n6] & n4;
            if (n3 != 0) {
                int n14 = n2 = 0;
                while (n14 < this.cfr_renamed_4) {
                    int n15 = n2;
                    int n16 = nArray2[n15] ^ this.cfr_renamed_3[n7][n2];
                    nArray2[n15] = n16;
                    n14 = ++n2;
                }
                spraye spraye4 = this;
                n2 = spraye4.cfr_renamed_1 + n7 >>> 5;
                n = spraye4.cfr_renamed_1 + n7 & 0x1F;
                int n17 = n2;
                nArray2[n17] = nArray2[n17] | 1 << n;
            }
            ++n7;
            n13 = n4 << 1;
        }
        spraye spraye5 = this;
        return new spradf(nArray2, spraye5.cfr_renamed_2 + spraye5.cfr_renamed_1);
    }

    public spraye cfr_renamed_946() {
        int n;
        spraye spraye2 = this;
        if (spraye2.cfr_renamed_1 <= spraye2.cfr_renamed_2) {
            throw new ArithmeticException(sprquba.cfr_renamed_9("\u000fU\u001aL\u0013\u0018\u0019M\bU\u000bL\u0018Q\u0012"));
        }
        spraye spraye3 = this;
        int n2 = spraye3.cfr_renamed_2 >> 5;
        int n3 = spraye3.cfr_renamed_2 & 0x1F;
        spraye spraye4 = this;
        spraye spraye5 = new spraye(spraye4.cfr_renamed_2, spraye4.cfr_renamed_1 - this.cfr_renamed_2);
        int n4 = n = spraye3.cfr_renamed_2 - 1;
        while (n4 >= 0) {
            if (n3 != 0) {
                int n5;
                int n6 = n2;
                int n7 = n5 = 0;
                while (n7 < spraye5.cfr_renamed_4 - 1) {
                    spraye5.cfr_renamed_3[n][n5++] = this.cfr_renamed_3[n][n6] >>> n3 | this.cfr_renamed_3[n][++n6] << 32 - n3;
                    n7 = n5;
                }
                int n8 = spraye5.cfr_renamed_3[n][spraye5.cfr_renamed_4 - 1] = this.cfr_renamed_3[n][n6] >>> n3;
                if (++n6 < this.cfr_renamed_4) {
                    int[] nArray = spraye5.cfr_renamed_3[n];
                    int n9 = spraye5.cfr_renamed_4 - 1;
                    nArray[n9] = nArray[n9] | this.cfr_renamed_3[n][n6] << 32 - n3;
                }
            } else {
                System.arraycopy(this.cfr_renamed_3[n], n2, spraye5.cfr_renamed_3[n], 0, spraye5.cfr_renamed_4);
            }
            n4 = --n;
        }
        return spraye5;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_1093(int[][] nArray, int n, int n2) {
        void arg2;
        int[][] arg0;
        int[] nArray2 = nArray[n];
        nArray[arg1] = arg0[arg2];
        arg0[arg2] = nArray2;
    }

    public sprcye cfr_renamed_5533(sprcye arg0) {
        int n;
        if (!(arg0 instanceof spradf)) {
            throw new ArithmeticException(spreyl.cfr_renamed_9("K}^lRj\u001dqN8SwI8Y}[qS}Y8RnXj\u001d_{0\u000f1"));
        }
        spraye spraye2 = this;
        if (arg0.cfr_renamed_4 != spraye2.cfr_renamed_1 + spraye2.cfr_renamed_2) {
            throw new ArithmeticException(sprquba.cfr_renamed_9("\u0006]\u0004_\u001ePJU\u0003K\u0007Y\u001e[\u0002"));
        }
        int[] nArray = ((spradf)arg0).cfr_renamed_959();
        spraye spraye3 = this;
        int[] nArray2 = new int[spraye3.cfr_renamed_2 + 31 >>> 5];
        int n2 = spraye3.cfr_renamed_2 >> 5;
        int n3 = spraye3.cfr_renamed_2 & 0x1F;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_2) {
            int n5;
            int n6;
            int n7 = nArray[n >> 5] >>> (n & 0x1F) & 1;
            int n8 = n2;
            if (n3 != 0) {
                n6 = 0;
                int n9 = n5 = 0;
                while (n9 < this.cfr_renamed_4 - 1) {
                    n6 = nArray[n8] >>> n3 | nArray[++n8] << 32 - n3;
                    int n10 = this.cfr_renamed_3[n][n5];
                    n7 ^= n10 & n6;
                    n9 = ++n5;
                }
                int n11 = n6 = nArray[n8] >>> n3;
                if (++n8 < nArray.length) {
                    n6 |= nArray[n8] << 32 - n3;
                }
                n7 ^= this.cfr_renamed_3[n][this.cfr_renamed_4 - 1] & n6;
            } else {
                int n12 = n6 = 0;
                while (n12 < this.cfr_renamed_4) {
                    int n13 = this.cfr_renamed_3[n][n6] & nArray[n8];
                    ++n8;
                    n7 ^= n13;
                    n12 = ++n6;
                }
            }
            n6 = 0;
            int n14 = n5 = 0;
            while (n14 < 32) {
                n6 ^= n7 & 1;
                n7 >>>= 1;
                n14 = ++n5;
            }
            if (n6 == 1) {
                int n15 = n >> 5;
                nArray2[n15] = nArray2[n15] | 1 << (n & 0x1F);
            }
            n4 = ++n;
        }
        return new spradf(nArray2, this.cfr_renamed_2);
    }

    private static /* synthetic */ void cfr_renamed_1098(int[] arg0, int[] arg1, int arg2) {
        int n;
        int n2 = n = arg1.length - 1;
        while (n2 >= arg2) {
            int n3 = n;
            int n4 = arg0[n3] ^ arg1[n];
            arg1[n3] = n4;
            n2 = --n;
        }
    }
}

