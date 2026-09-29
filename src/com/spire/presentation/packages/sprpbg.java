/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqbg;
import com.spire.presentation.packages.sprvvf;
import java.security.SecureRandom;
import java.util.Arrays;

public class sprpbg {
    public long[] cfr_renamed_3;
    public int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprpbg(sprpbg sprpbg2) {
        void arg0;
        sprpbg sprpbg3 = this;
        sprpbg3.cfr_renamed_3 = arg0.cfr_renamed_3;
        sprpbg3.cfr_renamed_4 = sprpbg2.cfr_renamed_4;
    }

    public long cfr_renamed_6624(int arg0, sprpbg arg1, int arg2, int arg3) {
        int n;
        long l = this.cfr_renamed_3[arg0 += this.cfr_renamed_4];
        ++arg0;
        long l2 = l & arg1.cfr_renamed_3[arg2 += arg1.cfr_renamed_4];
        ++arg2;
        int n2 = n = 1;
        while (n2 < arg3) {
            long l3 = this.cfr_renamed_3[arg0];
            ++arg0;
            long l4 = l2 ^ l3 & arg1.cfr_renamed_3[arg2];
            ++arg2;
            l2 = l4;
            n2 = ++n;
        }
        return l2;
    }

    public int cfr_renamed_6625(int arg0, int arg1) {
        int n = arg1;
        int n2 = 0;
        long l = 0L;
        int n3 = this.cfr_renamed_4;
        int n4 = n;
        while (n4 > 0) {
            int n5;
            long l2 = this.cfr_renamed_3[n3];
            ++n3;
            int n6 = n5 = 1;
            while (n6 < arg0) {
                l2 |= this.cfr_renamed_3[n3];
                ++n3;
                n6 = ++n5;
            }
            n2 = (int)((long)n2 + (l |= sprqbg.cfr_renamed_6626(l2)));
            n4 = --n;
        }
        return n2;
    }

    public void cfr_renamed_6605() {
        this.cfr_renamed_4 = 0;
    }

    public void cfr_renamed_6627(sprpbg arg0, int arg1) {
        sprpbg sprpbg2 = arg0;
        sprpbg sprpbg3 = this;
        System.arraycopy(sprpbg2.cfr_renamed_3, sprpbg2.cfr_renamed_4, sprpbg3.cfr_renamed_3, sprpbg3.cfr_renamed_4, arg1);
    }

    public sprpbg() {
        this.cfr_renamed_4 = 0;
    }

    public void cfr_renamed_6628(int arg0) {
        sprpbg sprpbg2 = this;
        sprpbg2.cfr_renamed_3[sprpbg2.cfr_renamed_4 + arg0] = 0L;
    }

    public byte[] cfr_renamed_6616(int arg0) {
        int n;
        byte[] byArray = new byte[arg0];
        int n2 = n = 0;
        while (n2 < byArray.length) {
            sprpbg sprpbg2 = this;
            int n3 = n;
            byte by = (byte)(sprpbg2.cfr_renamed_3[sprpbg2.cfr_renamed_4 + (n3 >>> 3)] >>> ((n & 7) << 3));
            byArray[n3] = by;
            n2 = ++n;
        }
        return byArray;
    }

    public long cfr_renamed_576(int arg0) {
        sprpbg sprpbg2 = this;
        return sprpbg2.cfr_renamed_3[sprpbg2.cfr_renamed_4 + arg0];
    }

    public long[] cfr_renamed_6629() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_6630(int arg0, sprvvf arg1, int arg2, int arg3) {
        arg0 += this.cfr_renamed_4;
        arg2 += arg1.cfr_renamed_4;
        if (arg1.cfr_renamed_3 == 0) {
            int n;
            int n2 = n = 0;
            while (n2 < arg3) {
                int n3 = arg0++;
                long l = this.cfr_renamed_3[n3] ^ arg1.cfr_renamed_3[arg2];
                ++arg2;
                this.cfr_renamed_3[n3] = l;
                n2 = ++n;
            }
        } else {
            int n;
            int n4 = arg1.cfr_renamed_3 << 3;
            int n5 = 8 - arg1.cfr_renamed_3 << 3;
            int n6 = n = 0;
            while (n6 < arg3) {
                int n7 = arg0++;
                this.cfr_renamed_3[n7] = this.cfr_renamed_3[n7] ^ (arg1.cfr_renamed_3[arg2] >>> n4 | arg1.cfr_renamed_3[++arg2] << n5);
                n6 = ++n;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_6631(sprpbg sprpbg2, int n) {
        void arg1;
        int n2;
        void arg0;
        int n3 = arg0.cfr_renamed_4;
        int n4 = this.cfr_renamed_4;
        int n5 = n2 = 0;
        while (n5 < arg1) {
            long l = this.cfr_renamed_3[n4];
            ++n4;
            long l2 = l - arg0.cfr_renamed_3[n3];
            long l3 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
            ++n3;
            if (l3 != false) {
                return 0;
            }
            n5 = ++n2;
        }
        return 1;
    }

    public void cfr_renamed_6632(sprpbg arg0) {
        sprpbg sprpbg2 = arg0;
        long[] lArray = sprpbg2.cfr_renamed_3;
        int n = sprpbg2.cfr_renamed_4;
        sprpbg2.cfr_renamed_3 = this.cfr_renamed_3;
        sprpbg2.cfr_renamed_4 = this.cfr_renamed_4;
        sprpbg sprpbg3 = this;
        sprpbg3.cfr_renamed_3 = lArray;
        sprpbg3.cfr_renamed_4 = n;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_6633(sprpbg sprpbg2, int n) {
        void arg1;
        int n2;
        int n3 = this.cfr_renamed_4;
        int n4 = sprpbg2.cfr_renamed_4;
        int n5 = n2 = 0;
        while (n5 < arg1) {
            void arg0;
            int n6 = n3++;
            long l = this.cfr_renamed_3[n6] ^ arg0.cfr_renamed_3[n4];
            ++n4;
            this.cfr_renamed_3[n6] = l;
            n5 = ++n2;
        }
    }

    public void cfr_renamed_6634(sprvvf arg0, int arg1) {
        int n;
        if (arg0.cfr_renamed_3 == 0) {
            sprvvf sprvvf2 = arg0;
            sprpbg sprpbg2 = this;
            System.arraycopy(sprvvf2.cfr_renamed_3, sprvvf2.cfr_renamed_4, sprpbg2.cfr_renamed_3, sprpbg2.cfr_renamed_4, arg1);
            return;
        }
        int n2 = 8 - arg0.cfr_renamed_3 << 3;
        sprvvf sprvvf3 = arg0;
        int n3 = sprvvf3.cfr_renamed_3 << 3;
        int n4 = this.cfr_renamed_4;
        int n5 = sprvvf3.cfr_renamed_4;
        int n6 = n = 0;
        while (n6 < arg1) {
            this.cfr_renamed_3[n4++] = arg0.cfr_renamed_3[n5] >>> n3 ^ arg0.cfr_renamed_3[++n5] << n2;
            n6 = ++n;
        }
    }

    public void cfr_renamed_6635(long arg0) {
        sprpbg sprpbg2 = this;
        long[] lArray = sprpbg2.cfr_renamed_3;
        int n = sprpbg2.cfr_renamed_4;
        lArray[n] = lArray[n] & arg0;
    }

    public void cfr_renamed_6636() {
        ++this.cfr_renamed_4;
    }

    public long cfr_renamed_1397() {
        sprpbg sprpbg2 = this;
        return sprpbg2.cfr_renamed_3[sprpbg2.cfr_renamed_4];
    }

    /*
     * WARNING - void declaration
     */
    public sprpbg(sprpbg sprpbg2, int n) {
        void arg1;
        void arg0;
        sprpbg sprpbg3 = this;
        sprpbg3.cfr_renamed_3 = arg0.cfr_renamed_3;
        sprpbg3.cfr_renamed_4 = sprpbg2.cfr_renamed_4 + arg1;
    }

    public int cfr_renamed_6637(int arg0, int arg1, int arg2) {
        sprpbg sprpbg2 = this;
        while (sprpbg2.cfr_renamed_6638(arg0 * arg2, arg2) != 0 && arg0 >= arg1) {
            sprpbg2 = this;
            --arg0;
        }
        return arg0;
    }

    public void cfr_renamed_6639(sprpbg arg0, int arg1) {
        int n;
        int n2 = arg0.cfr_renamed_4;
        int n3 = n = 0;
        while (n3 < arg1) {
            int n4 = this.cfr_renamed_4++;
            long l = this.cfr_renamed_3[n4] ^ arg0.cfr_renamed_3[n2];
            ++n2;
            this.cfr_renamed_3[n4] = l;
            n3 = ++n;
        }
    }

    public void cfr_renamed_6609(int arg0, int arg1) {
        int n = arg0 += this.cfr_renamed_4;
        Arrays.fill(this.cfr_renamed_3, n, n + arg1, 0L);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_6640(sprpbg sprpbg2) {
        void arg0;
        sprpbg sprpbg3 = this;
        sprpbg3.cfr_renamed_3 = arg0.cfr_renamed_3;
        sprpbg3.cfr_renamed_4 = sprpbg2.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_6641(sprpbg sprpbg2, sprpbg sprpbg3, long l, int n) {
        void arg3;
        int n2;
        void arg0;
        int n3 = this.cfr_renamed_4;
        int n4 = arg0.cfr_renamed_4;
        int n5 = sprpbg3.cfr_renamed_4;
        int n6 = n2 = 0;
        while (n6 < arg3) {
            void arg2;
            void arg1;
            void v1 = arg0;
            this.cfr_renamed_3[n3] = (v1.cfr_renamed_3[n4] ^ arg1.cfr_renamed_3[n5]) & arg2;
            int n7 = n4++;
            v1.cfr_renamed_3[n7] = v1.cfr_renamed_3[n7] ^ this.cfr_renamed_3[n3];
            int n8 = n5++;
            long l2 = arg1.cfr_renamed_3[n8] ^ this.cfr_renamed_3[n3];
            ++n3;
            arg1.cfr_renamed_3[n8] = l2;
            n6 = ++n2;
        }
    }

    public int cfr_renamed_320() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_6642(sprvvf arg0, int arg1, int arg2) {
        int n = arg2 & 0x3F;
        int n2 = 64 - n;
        int n3 = this.cfr_renamed_4;
        int n4 = arg0.cfr_renamed_4;
        if (arg0.cfr_renamed_3 == 0) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < arg1) {
                this.cfr_renamed_3[n3++] = arg0.cfr_renamed_3[n4] >>> n ^ arg0.cfr_renamed_3[++n4] << n2;
                n6 = ++n5;
            }
        } else {
            int n7;
            int n8 = arg0.cfr_renamed_3 << 3;
            int n9 = 8 - arg0.cfr_renamed_3 << 3;
            int n10 = n7 = 0;
            while (n10 < arg1) {
                this.cfr_renamed_3[n3++] = (arg0.cfr_renamed_3[n4] >>> n8 | arg0.cfr_renamed_3[++n4] << n9) >>> n ^ (arg0.cfr_renamed_3[n4] >>> n8 | arg0.cfr_renamed_3[n4 + 1] << n9) << n2;
                n10 = ++n7;
            }
        }
    }

    public void cfr_renamed_6643(int arg0, sprpbg arg1, int arg2, sprpbg arg3, int arg4, int arg5) {
        int n;
        arg0 += this.cfr_renamed_4;
        arg2 += arg1.cfr_renamed_4;
        arg4 += arg3.cfr_renamed_4;
        int n2 = n = 0;
        while (n2 < arg5) {
            int n3 = arg0++;
            long l = arg1.cfr_renamed_3[arg2];
            ++arg2;
            long l2 = this.cfr_renamed_3[n3] ^ (l ^ arg3.cfr_renamed_3[arg4]);
            ++arg4;
            this.cfr_renamed_3[n3] = l2;
            n2 = ++n;
        }
    }

    public void cfr_renamed_6619(int arg0, long arg1) {
        sprpbg sprpbg2 = this;
        sprpbg2.cfr_renamed_3[sprpbg2.cfr_renamed_4 + arg0] = arg1;
    }

    /*
     * WARNING - void declaration
     */
    public sprpbg(int n) {
        void arg0;
        sprpbg sprpbg2 = this;
        sprpbg2.cfr_renamed_3 = new long[arg0];
        sprpbg2.cfr_renamed_4 = 0;
    }

    public void cfr_renamed_6620(int arg0, long arg1) {
        sprpbg sprpbg2 = this;
        long[] lArray = sprpbg2.cfr_renamed_3;
        int n = sprpbg2.cfr_renamed_4 + arg0;
        lArray[n] = lArray[n] ^ arg1;
    }

    public void cfr_renamed_6644(int arg0, SecureRandom arg1, int arg2) {
        byte[] byArray = new byte[arg2];
        arg1.nextBytes(byArray);
        this.cfr_renamed_6615(arg0, byArray, 0, byArray.length);
    }

    public void cfr_renamed_6645(int arg0, sprpbg arg1, int arg2, int arg3) {
        int n;
        arg0 += this.cfr_renamed_4;
        arg2 += arg1.cfr_renamed_4;
        int n2 = n = 0;
        while (n2 < arg3) {
            int n3 = arg0++;
            long l = this.cfr_renamed_3[n3] ^ arg1.cfr_renamed_3[arg2];
            ++arg2;
            this.cfr_renamed_3[n3] = l;
            n2 = ++n;
        }
    }

    public void cfr_renamed_6646(sprvvf arg0, int arg1, int arg2) {
        int n = arg2 & 0x3F;
        int n2 = 64 - n;
        int n3 = this.cfr_renamed_4;
        int n4 = arg0.cfr_renamed_4;
        if (arg0.cfr_renamed_3 == 0) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < arg1 && n4 < ((int)arg0.cfr_renamed_3).length - 1) {
                this.cfr_renamed_3[n3++] = arg0.cfr_renamed_3[n4] >>> n ^ arg0.cfr_renamed_3[++n4] << n2;
                n6 = ++n5;
            }
            if (n5 < arg1) {
                this.cfr_renamed_3[n3] = arg0.cfr_renamed_3[n4] >>> n;
                return;
            }
        } else {
            int n7;
            int n8 = arg0.cfr_renamed_3 << 3;
            int n9 = 8 - arg0.cfr_renamed_3 << 3;
            int n10 = n7 = 0;
            while (n10 < arg1 && n4 < ((int)arg0.cfr_renamed_3).length - 2) {
                this.cfr_renamed_3[n3++] = (arg0.cfr_renamed_3[n4] >>> n8 | arg0.cfr_renamed_3[++n4] << n9) >>> n ^ (arg0.cfr_renamed_3[n4] >>> n8 | arg0.cfr_renamed_3[n4 + 1] << n9) << n2;
                n10 = ++n7;
            }
            if (n7 < arg1) {
                this.cfr_renamed_3[n3] = (arg0.cfr_renamed_3[n4] >>> n8 | arg0.cfr_renamed_3[++n4] << n9) >>> n ^ arg0.cfr_renamed_3[n4] >>> n8 << n2;
            }
        }
    }

    public void cfr_renamed_6647(sprpbg arg0, int arg1, int arg2) {
        int n;
        int n2 = this.cfr_renamed_4;
        arg1 += arg0.cfr_renamed_4;
        int n3 = n = 0;
        while (n3 < arg2) {
            int n4 = n2++;
            long l = this.cfr_renamed_3[n4] ^ arg0.cfr_renamed_3[arg1];
            ++arg1;
            this.cfr_renamed_3[n4] = l;
            n3 = ++n;
        }
    }

    public void cfr_renamed_6615(int arg0, byte[] arg1, int arg2, int arg3) {
        int n;
        int n2 = 0;
        int n3 = n = this.cfr_renamed_4 + arg0;
        while (n3 < this.cfr_renamed_3.length && n2 + 8 <= arg3) {
            long l = sprpxe.cfr_renamed_443(arg1, arg2);
            arg2 += 8;
            this.cfr_renamed_3[n++] = l;
            n2 += 8;
            n3 = n;
        }
        if (n2 < arg3 && n < this.cfr_renamed_3.length) {
            int n4;
            int n5 = n4 = 0;
            this.cfr_renamed_3[n] = 0L;
            while (n5 < 8 && n2 < arg3) {
                int n6 = n;
                long l = this.cfr_renamed_3[n6] | ((long)arg1[arg2] & 0xFFL) << (n4 << 3);
                ++n2;
                this.cfr_renamed_3[n6] = l;
                ++arg2;
                n5 = ++n4;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_6648(sprpbg sprpbg2, int n) {
        void arg1;
        void arg0;
        sprpbg sprpbg3 = this;
        sprpbg3.cfr_renamed_3 = arg0.cfr_renamed_3;
        sprpbg3.cfr_renamed_4 = sprpbg2.cfr_renamed_4 + arg1;
    }

    public void cfr_renamed_6649(int arg0) {
        this.cfr_renamed_4 += arg0;
    }

    public void cfr_renamed_6650(sprpbg arg0, sprpbg arg1, int arg2) {
        int n = 0;
        int n2 = this.cfr_renamed_4;
        int n3 = arg0.cfr_renamed_4;
        int n4 = arg1.cfr_renamed_4;
        int n5 = n;
        while (n5 < arg2) {
            int n6 = n2++;
            long l = arg0.cfr_renamed_3[n3];
            ++n3;
            long l2 = l ^ arg1.cfr_renamed_3[n4];
            ++n4;
            this.cfr_renamed_3[n6] = l2;
            n5 = ++n;
        }
    }

    public void cfr_renamed_6651(int arg0, int arg1) {
        int n;
        sprpbg sprpbg2 = this;
        int n2 = sprpbg2.cfr_renamed_4 + arg0;
        sprpbg2.cfr_renamed_3[n2++] = 1L;
        int n3 = n = 1;
        while (n3 < arg1) {
            this.cfr_renamed_3[n2++] = 0L;
            n3 = ++n;
        }
    }

    public void cfr_renamed_6652(long arg0) {
        sprpbg sprpbg2 = this;
        sprpbg2.cfr_renamed_3[sprpbg2.cfr_renamed_4] = arg0;
    }

    public void cfr_renamed_6653(sprpbg arg0, int arg1, int arg2) {
        int n;
        int n2 = this.cfr_renamed_4;
        int n3 = n = 0;
        while (n3 < arg2) {
            int n4 = 0;
            int n5 = n2;
            int n6 = n4;
            while (n6 < arg1) {
                int n7 = n5++;
                this.cfr_renamed_3[n7] = this.cfr_renamed_3[n7] ^ arg0.cfr_renamed_3[arg0.cfr_renamed_4++];
                n6 = ++n4;
            }
            n3 = ++n;
        }
        this.cfr_renamed_4 += arg1;
    }

    public int cfr_renamed_6654(long arg0, int arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            sprpbg sprpbg2 = this;
            long l = -(arg0 >>> n & 1L);
            sprpbg2.cfr_renamed_3[sprpbg2.cfr_renamed_4 + arg1] = l;
            ++arg1;
            n2 = ++n;
        }
        return arg1;
    }

    public void cfr_renamed_6655(int arg0, sprpbg arg1, int arg2, int arg3, int arg4) {
        int n;
        int n2 = 64 - arg4;
        arg0 += this.cfr_renamed_4;
        arg2 += arg1.cfr_renamed_4;
        int n3 = n = 0;
        while (n3 < arg3) {
            this.cfr_renamed_3[arg0++] = arg1.cfr_renamed_3[arg2] >>> n2 ^ arg1.cfr_renamed_3[++arg2] << arg4;
            n3 = ++n;
        }
    }

    public int cfr_renamed_6638(int arg0, int arg1) {
        int n;
        long l = this.cfr_renamed_576(arg0);
        int n2 = n = 1;
        while (n2 < arg1) {
            int n3 = arg0 + n;
            l |= this.cfr_renamed_576(n3);
            n2 = ++n;
        }
        return (int)sprqbg.cfr_renamed_6656(l);
    }

    public void cfr_renamed_6657(sprpbg arg0, int arg1, long arg2) {
        int n;
        int n2 = this.cfr_renamed_4;
        int n3 = n = 0;
        while (n3 < arg1) {
            int n4 = n2++;
            this.cfr_renamed_3[n4] = this.cfr_renamed_3[n4] ^ arg0.cfr_renamed_3[arg0.cfr_renamed_4++] & arg2;
            n3 = ++n;
        }
    }

    public void cfr_renamed_6658(int arg0, sprpbg arg1, int arg2, int arg3) {
        sprpbg sprpbg2 = arg1;
        sprpbg sprpbg3 = this;
        System.arraycopy(sprpbg2.cfr_renamed_3, sprpbg2.cfr_renamed_4 + arg2, sprpbg3.cfr_renamed_3, sprpbg3.cfr_renamed_4 + arg0, arg3);
    }

    public void cfr_renamed_6659(int arg0, sprpbg arg1, int arg2, sprpbg arg3, int arg4, int arg5) {
        int n;
        arg0 += this.cfr_renamed_4;
        arg2 += arg1.cfr_renamed_4;
        arg4 += arg3.cfr_renamed_4;
        int n2 = n = 0;
        while (n2 < arg5) {
            int n3 = arg0++;
            long l = arg1.cfr_renamed_3[arg2];
            ++arg2;
            long l2 = l ^ arg3.cfr_renamed_3[arg4];
            ++arg4;
            this.cfr_renamed_3[n3] = l2;
            n2 = ++n;
        }
    }

    public int cfr_renamed_806() {
        return this.cfr_renamed_3.length - this.cfr_renamed_4;
    }

    public void cfr_renamed_6660(int arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_6602(long arg0) {
        sprpbg sprpbg2 = this;
        long[] lArray = sprpbg2.cfr_renamed_3;
        int n = sprpbg2.cfr_renamed_4;
        lArray[n] = lArray[n] ^ arg0;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_6612(sprpbg sprpbg2, int n, long l) {
        void arg1;
        int n2;
        int n3 = this.cfr_renamed_4;
        int n4 = sprpbg2.cfr_renamed_4;
        int n5 = n2 = 0;
        while (n5 < arg1) {
            void arg2;
            void arg0;
            int n6 = n3++;
            long l2 = arg0.cfr_renamed_3[n4] & arg2;
            ++n4;
            this.cfr_renamed_3[n6] = this.cfr_renamed_3[n6] ^ l2;
            n5 = ++n2;
        }
    }

    public void cfr_renamed_6661(sprpbg arg0, int arg1, int arg2) {
        int n;
        int n2 = this.cfr_renamed_4;
        int n3 = n = 0;
        while (n3 < arg2) {
            int n4 = 0;
            int n5 = n2;
            int n6 = n4;
            while (n6 < arg1) {
                int n7 = n5++;
                this.cfr_renamed_3[n7] = this.cfr_renamed_3[n7] ^ arg0.cfr_renamed_3[arg0.cfr_renamed_4++];
                n6 = ++n4;
            }
            n3 = ++n;
        }
    }

    public void cfr_renamed_6621(int arg0, long arg1) {
        sprpbg sprpbg2 = this;
        long[] lArray = sprpbg2.cfr_renamed_3;
        int n = sprpbg2.cfr_renamed_4 + arg0;
        lArray[n] = lArray[n] & arg1;
    }
}

