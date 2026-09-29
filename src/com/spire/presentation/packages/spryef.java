/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcye;
import com.spire.presentation.packages.sprdqp;
import com.spire.presentation.packages.sprfvo;
import com.spire.presentation.packages.sprnhf;
import com.spire.presentation.packages.sprwff;
import com.spire.presentation.packages.sprydf;
import com.spire.presentation.packages.sprzye;

public class spryef
extends sprzye {
    public int[][] cfr_renamed_3;
    public sprnhf cfr_renamed_4;

    @Override
    public sprcye cfr_renamed_5485(sprcye arg0) {
        throw new RuntimeException(sprfvo.cfr_renamed_9("2B\b\r\u0015@\fA\u0019@\u0019C\bH\u0018\u0003"));
    }

    @Override
    public sprzye cfr_renamed_5486(sprzye arg0) {
        throw new RuntimeException(sprdqp.cfr_renamed_9("\u0015'/h2%+$>%>&/-?f"));
    }

    @Override
    public byte[] cfr_renamed_91() {
        int n;
        int n2 = 8;
        int n3 = 1;
        spryef spryef2 = this;
        while (spryef2.cfr_renamed_4.cfr_renamed_813() > n2) {
            n2 += 8;
            spryef2 = this;
            ++n3;
        }
        spryef spryef3 = this;
        byte[] byArray = new byte[spryef3.cfr_renamed_2 * spryef3.cfr_renamed_1 * n3 + 4];
        byArray[0] = (byte)(this.cfr_renamed_2 & 0xFF);
        byArray[1] = (byte)(this.cfr_renamed_2 >>> 8 & 0xFF);
        byArray[2] = (byte)(this.cfr_renamed_2 >>> 16 & 0xFF);
        byArray[3] = (byte)(this.cfr_renamed_2 >>> 24 & 0xFF);
        n3 = 4;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_2) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < this.cfr_renamed_1) {
                int n7;
                int n8 = n7 = 0;
                while (n8 < n2) {
                    int n9 = n3++;
                    byte by = (byte)(this.cfr_renamed_3[n][n5] >>> n7);
                    byArray[n9] = by;
                    n8 = n7 += 8;
                }
                n6 = ++n5;
            }
            n4 = ++n;
        }
        return byArray;
    }

    @Override
    public sprzye cfr_renamed_5483(sprwff arg0) {
        throw new RuntimeException(sprfvo.cfr_renamed_9("2B\b\r\u0015@\fA\u0019@\u0019C\bH\u0018\u0003"));
    }

    @Override
    public String toString() {
        int n;
        String string = this.cfr_renamed_2 + sprdqp.cfr_renamed_9("h#h") + this.cfr_renamed_1 + sprfvo.cfr_renamed_9("\r1L\b_\u0015U\\B\nH\u000e\r") + this.cfr_renamed_4.toString() + sprdqp.cfr_renamed_9("r{B");
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_1) {
                spryef spryef2 = this;
                StringBuilder stringBuilder = new StringBuilder().insert(0, string).append(spryef2.cfr_renamed_4.cfr_renamed_867(spryef2.cfr_renamed_3[n][n3]));
                string = stringBuilder.append(sprfvo.cfr_renamed_9("\rF\r")).toString();
                n4 = ++n3;
            }
            string = new StringBuilder().insert(0, string).append("\n").toString();
            n2 = ++n;
        }
        return string;
    }

    private /* synthetic */ void cfr_renamed_1082(int[] arg0, int[] arg1) {
        int n;
        int n2 = n = arg1.length - 1;
        while (n2 >= 0) {
            int n3 = n;
            int n4 = this.cfr_renamed_4.cfr_renamed_825(arg0[n3], arg1[n]);
            arg1[n3] = n4;
            n2 = --n;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_1083(int[][] nArray, int n, int n2) {
        void arg2;
        int[][] arg0;
        int[] nArray2 = nArray[n];
        nArray[arg1] = arg0[arg2];
        arg0[arg2] = nArray2;
    }

    /*
     * WARNING - void declaration
     */
    public spryef(sprnhf sprnhf2, byte[] byArray) {
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
        if (((void)arg1).length < 5) {
            throw new IllegalArgumentException(sprdqp.cfr_renamed_9("{\r):4:ah<!--5h::))\"h2;{&4<{-5+4,>,{%:<)!#h4>>:{\u000f\u001d`i\u00166a"));
        }
        this.cfr_renamed_2 = (arg1[3] & 0xFF) << 24 ^ (arg1[2] & 0xFF) << 16 ^ (arg1[1] & 0xFF) << 8 ^ arg1[0] & 0xFF;
        int n4 = n3 * this.cfr_renamed_2;
        if (this.cfr_renamed_2 <= 0 || (((void)arg1).length - 4) % n4 != 0) {
            throw new IllegalArgumentException(sprfvo.cfr_renamed_9("\\h\u000e_\u0013_F\r\u001bD\nH\u0012\r\u001d_\u000eL\u0005\r\u0015^\\C\u0013Y\\H\u0012N\u0013I\u0019I\\@\u001dY\u000eD\u0004\r\u0013[\u0019_\\j:\u0005Ns\u0011\u0004"));
        }
        this.cfr_renamed_1 = (((void)arg1).length - 4) / n4;
        this.cfr_renamed_3 = new int[this.cfr_renamed_2][this.cfr_renamed_1];
        n3 = 4;
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_2) {
            int n6;
            int n7 = n6 = 0;
            while (n7 < this.cfr_renamed_1) {
                int n8;
                int n9 = n8 = 0;
                while (n9 < n2) {
                    int[] nArray = this.cfr_renamed_3[n];
                    int n10 = n6;
                    int n11 = arg1[n3] & 0xFF;
                    ++n3;
                    int n12 = nArray[n10] ^ n11 << n8;
                    nArray[n10] = n12;
                    n9 = n8 += 8;
                }
                spryef spryef2 = this;
                if (!spryef2.cfr_renamed_4.cfr_renamed_839(spryef2.cfr_renamed_3[n][n6])) {
                    throw new IllegalArgumentException(sprdqp.cfr_renamed_9("{\r):4:ah<!--5h::))\"h2;{&4<{-5+4,>,{%:<)!#h4>>:{\u000f\u001d`i\u00166a"));
                }
                n7 = ++n6;
            }
            n5 = ++n;
        }
    }

    public spryef(spryef arg0) {
        int n;
        spryef spryef2 = this;
        spryef spryef3 = arg0;
        this.cfr_renamed_2 = spryef3.cfr_renamed_2;
        this.cfr_renamed_1 = spryef3.cfr_renamed_1;
        spryef2.cfr_renamed_4 = arg0.cfr_renamed_4;
        spryef2.cfr_renamed_3 = new int[this.cfr_renamed_2][];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            int n3 = n++;
            this.cfr_renamed_3[n3] = sprydf.cfr_renamed_535(arg0.cfr_renamed_3[n3]);
            n2 = n;
        }
    }

    public boolean equals(Object arg0) {
        int n;
        if (arg0 == null || !(arg0 instanceof spryef)) {
            return false;
        }
        spryef spryef2 = (spryef)arg0;
        if (!this.cfr_renamed_4.equals(spryef2.cfr_renamed_4) || spryef2.cfr_renamed_2 != this.cfr_renamed_1 || spryef2.cfr_renamed_1 != this.cfr_renamed_1) {
            return false;
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_1) {
                if (this.cfr_renamed_3[n][n3] != spryef2.cfr_renamed_3[n][n3]) {
                    return false;
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return true;
    }

    private /* synthetic */ int[] cfr_renamed_1081(int[] arg0, int arg1) {
        int n;
        int[] nArray = new int[arg0.length];
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            int n3 = n--;
            nArray[n3] = this.cfr_renamed_4.cfr_renamed_838(arg0[n3], arg1);
            n2 = n;
        }
        return nArray;
    }

    @Override
    public boolean cfr_renamed_805() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_1) {
                if (this.cfr_renamed_3[n][n3] != 0) {
                    return false;
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return true;
    }

    @Override
    public sprcye cfr_renamed_5484(sprcye arg0) {
        throw new RuntimeException(sprfvo.cfr_renamed_9("2B\b\r\u0015@\fA\u0019@\u0019C\bH\u0018\u0003"));
    }

    public int hashCode() {
        int n;
        int n2 = (this.cfr_renamed_4.hashCode() * 31 + this.cfr_renamed_2) * 31 + this.cfr_renamed_1;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_2) {
            int n4;
            int n5 = n4 = 0;
            while (n5 < this.cfr_renamed_1) {
                n2 = n2 * 31 + this.cfr_renamed_3[n][n4++];
                n5 = n4;
            }
            n3 = ++n;
        }
        return n2;
    }

    @Override
    public sprzye cfr_renamed_875() {
        int n;
        int n2;
        spryef spryef2 = this;
        if (spryef2.cfr_renamed_2 != spryef2.cfr_renamed_1) {
            throw new ArithmeticException(sprdqp.cfr_renamed_9("\u0005:<)!#h2;{&4<{!5>>:/!9$>f"));
        }
        spryef spryef3 = this;
        int[][] nArray = new int[spryef3.cfr_renamed_2][spryef3.cfr_renamed_2];
        int n3 = n2 = this.cfr_renamed_2 - 1;
        while (n3 >= 0) {
            int n4 = n2--;
            nArray[n4] = sprydf.cfr_renamed_535(this.cfr_renamed_3[n4]);
            n3 = n2;
        }
        spryef spryef4 = this;
        int[][] nArray2 = new int[spryef4.cfr_renamed_2][spryef4.cfr_renamed_2];
        int n5 = n = this.cfr_renamed_2 - 1;
        while (n5 >= 0) {
            nArray2[n][n--] = 1;
            n5 = n;
        }
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_2) {
            int n7;
            int n8;
            int n9;
            if (nArray[n][n] == 0) {
                n9 = 0;
                int n10 = n8 = n + 1;
                while (n10 < this.cfr_renamed_2) {
                    if (nArray[n8][n] != 0) {
                        n9 = 1;
                        int n11 = n;
                        spryef.cfr_renamed_1083(nArray, n11, n8);
                        spryef.cfr_renamed_1083(nArray2, n11, n8);
                        n8 = this.cfr_renamed_2;
                    }
                    n10 = ++n8;
                }
                if (n9 == 0) {
                    throw new ArithmeticException(sprfvo.cfr_renamed_9("`\u001dY\u000eD\u0004\r\u0015^\\C\u0013Y\\D\u0012[\u0019_\bD\u001eA\u0019\u0003"));
                }
            }
            n9 = nArray[n][n];
            spryef spryef5 = this;
            n8 = this.cfr_renamed_4.cfr_renamed_817(n9);
            spryef5.cfr_renamed_1084(nArray[n], n8);
            spryef5.cfr_renamed_1084(nArray2[n], n8);
            int n12 = n7 = 0;
            while (n12 < this.cfr_renamed_2) {
                if (n7 != n && (n9 = nArray[n7][n]) != 0) {
                    spryef spryef6 = this;
                    int[] nArray3 = spryef6.cfr_renamed_1081(nArray[n], n9);
                    int[] nArray4 = spryef6.cfr_renamed_1081(nArray2[n], n9);
                    spryef6.cfr_renamed_1082(nArray3, nArray[n7]);
                    spryef6.cfr_renamed_1082(nArray4, nArray2[n7]);
                }
                n12 = ++n7;
            }
            n6 = ++n;
        }
        return new spryef(this.cfr_renamed_4, nArray2);
    }

    /*
     * WARNING - void declaration
     */
    public spryef(sprnhf sprnhf2, int[][] nArray) {
        void arg1;
        void arg0;
        spryef spryef2 = this;
        this.cfr_renamed_4 = arg0;
        spryef2.cfr_renamed_3 = arg1;
        spryef2.cfr_renamed_2 = nArray.length;
        this.cfr_renamed_1 = ((void)arg1[0]).length;
    }

    private /* synthetic */ void cfr_renamed_1084(int[] arg0, int arg1) {
        int n;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0) {
            arg0[--n] = this.cfr_renamed_4.cfr_renamed_838(arg0[n], arg1);
            n2 = n;
        }
    }
}

