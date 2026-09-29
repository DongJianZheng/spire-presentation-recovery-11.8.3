/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprfzf {
    public final byte[] cfr_renamed_2;
    public final byte[] cfr_renamed_3;
    public final byte[] cfr_renamed_4;

    public int cfr_renamed_6901(byte[] arg0, int arg1, int arg2, short[] arg3, int arg4, int arg5) {
        int n;
        int n2 = 1 << arg5;
        int n3 = n = 0;
        while (n3 < n2) {
            if ((arg3[arg4 + n] & 0xFFFF) >= 12289) {
                return 0;
            }
            n3 = ++n;
        }
        int n4 = n2 * 14 + 7 >> 3;
        if (arg0 == null) {
            return n4;
        }
        if (n4 > arg2) {
            return 0;
        }
        int n5 = arg1;
        int n6 = 0;
        int n7 = 0;
        int n8 = n = 0;
        while (n8 < n2) {
            n6 = n6 << 14 | arg3[arg4 + n] & 0xFFFF;
            int n9 = n7 += 14;
            while (n9 >= 8) {
                arg0[n5++] = (byte)(n6 >> (n7 -= 8));
                n9 = n7;
            }
            n8 = ++n;
        }
        if (n7 > 0) {
            arg0[n5] = (byte)(n6 << 8 - n7);
        }
        return n4;
    }

    public int cfr_renamed_6902(short[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        int n = 1 << arg2;
        int n2 = n * 14 + 7 >> 3;
        if (n2 > arg5) {
            return 0;
        }
        int n3 = arg4;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        block0: while (true) {
            int n7 = n6;
            while (n7 < n) {
                int n8 = arg3[n3] & 0xFF;
                ++n3;
                n4 = n4 << 8 | n8;
                if ((n5 += 8) < 14) continue block0;
                int n9 = n4 >>> (n5 -= 14) & 0x3FFF;
                if (n9 >= 12289) {
                    return 0;
                }
                int n10 = arg1 + n6;
                arg0[n10] = (short)n9;
                n7 = ++n6;
            }
            break;
        }
        if ((n4 & (1 << n5) - 1) != 0) {
            return 0;
        }
        return n2;
    }

    public int cfr_renamed_6900(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        int n;
        int n2 = 1 << arg5;
        int n3 = (1 << arg6 - 1) - 1;
        int n4 = -n3;
        int n5 = n = 0;
        while (n5 < n2) {
            if (arg3[arg4 + n] < n4 || arg3[arg4 + n] > n3) {
                return 0;
            }
            n5 = ++n;
        }
        int n6 = n2 * arg6 + 7 >> 3;
        if (arg0 == null) {
            return n6;
        }
        if (n6 > arg2) {
            return 0;
        }
        int n7 = arg1;
        int n8 = 0;
        int n9 = 0;
        int n10 = (1 << arg6) - 1;
        int n11 = n = 0;
        while (n11 < n2) {
            n8 = n8 << arg6 | arg3[arg4 + n] & 0xFFFF & n10;
            int n12 = n9 + arg6;
            while (n12 >= 8) {
                arg0[n7++] = (byte)(n8 >>> (n9 -= 8));
                n12 = n9;
            }
            n11 = ++n;
        }
        if (n9 > 0) {
            arg0[n7++] = (byte)(n8 << 8 - n9);
        }
        return n6;
    }

    public sprfzf() {
        sprfzf sprfzf2 = this;
        byte[] byArray = new byte[11];
        byArray[0] = 0;
        byArray[1] = 8;
        byArray[2] = 8;
        byArray[3] = 8;
        byArray[4] = 8;
        byArray[5] = 8;
        byArray[6] = 7;
        byArray[7] = 7;
        byArray[8] = 6;
        byArray[9] = 6;
        byArray[10] = 5;
        this.cfr_renamed_2 = byArray;
        byte[] byArray2 = new byte[11];
        byArray2[0] = 0;
        byArray2[1] = 8;
        byArray2[2] = 8;
        byArray2[3] = 8;
        byArray2[4] = 8;
        byArray2[5] = 8;
        byArray2[6] = 8;
        byArray2[7] = 8;
        byArray2[8] = 8;
        byArray2[9] = 8;
        byArray2[10] = 8;
        sprfzf2.cfr_renamed_4 = byArray2;
        byte[] byArray3 = new byte[11];
        byArray3[0] = 0;
        byArray3[1] = 10;
        byArray3[2] = 11;
        byArray3[3] = 11;
        byArray3[4] = 12;
        byArray3[5] = 12;
        byArray3[6] = 12;
        byArray3[7] = 12;
        byArray3[8] = 12;
        byArray3[9] = 12;
        byArray3[10] = 12;
        sprfzf2.cfr_renamed_3 = byArray3;
    }

    public int cfr_renamed_6895(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        int n = 1 << arg2;
        int n2 = n * arg3 + 7 >> 3;
        if (n2 > arg6) {
            return 0;
        }
        int n3 = arg5;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = (1 << arg3) - 1;
        int n8 = 1 << arg3 - 1;
        while (n4 < n) {
            int n9 = arg4[n3] & 0xFF;
            ++n3;
            n5 = n5 << 8 | n9;
            int n10 = n6 += 8;
            while (n10 >= arg3 && n4 < n) {
                int n11 = n5 >>> (n6 -= arg3) & n7;
                if ((n11 |= -(n11 & n8)) == -n8) {
                    return 0;
                }
                int n12 = arg1 + n4;
                ++n4;
                arg0[n12] = (byte)n11;
                n10 = n6;
            }
        }
        if ((n5 & (1 << n6) - 1) != 0) {
            return 0;
        }
        return n2;
    }

    public int cfr_renamed_6967(short[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        int n = 1 << arg2;
        int n2 = n * arg3 + 7 >> 3;
        if (n2 > arg6) {
            return 0;
        }
        int n3 = arg5;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = (1 << arg3) - 1;
        int n8 = 1 << arg3 - 1;
        while (n4 < n) {
            int n9 = arg4[n3] & 0xFF;
            ++n3;
            n5 = n5 << 8 | n9;
            int n10 = n6 += 8;
            while (n10 >= arg3 && n4 < n) {
                int n11 = n5 >>> (n6 -= arg3) & n7;
                if ((n11 |= -(n11 & n8)) == -n8) {
                    return 0;
                }
                int n12 = n11;
                n11 = n12 | -(n12 & n8);
                int n13 = arg1 + n4;
                ++n4;
                arg0[n13] = (short)n11;
                n10 = n6;
            }
        }
        if ((n5 & (1 << n6) - 1) != 0) {
            return 0;
        }
        return n2;
    }

    public int cfr_renamed_6903(short[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        int n;
        int n2 = 1 << arg2;
        int n3 = arg4;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = n = 0;
        while (n7 < n2) {
            int n8;
            int n9;
            block7: {
                if (n6 >= arg5) {
                    return 0;
                }
                byte by = arg3[n3 + n6];
                ++n6;
                n4 = n4 << 8 | by & 0xFF;
                int n10 = n4 >>> n5;
                n9 = n10 & 0x80;
                n8 = n10 & 0x7F;
                do {
                    if (n5 == 0) {
                        if (n6 >= arg5) {
                            return 0;
                        }
                        byte by2 = arg3[n3 + n6];
                        ++n6;
                        n4 = n4 << 8 | by2 & 0xFF;
                        n5 = 8;
                    }
                    if ((n4 >>> --n5 & 1) != 0) break block7;
                } while ((n8 += 128) <= 2047);
                return 0;
            }
            if (n9 != 0 && n8 == 0) {
                return 0;
            }
            arg0[arg1 + n] = (short)(n9 != 0 ? -n8 : n8);
            n7 = ++n;
        }
        if ((n4 & (1 << n5) - 1) != 0) {
            return 0;
        }
        return n6;
    }

    public int cfr_renamed_6897(byte[] arg0, int arg1, int arg2, short[] arg3, int arg4, int arg5) {
        int n;
        int n2 = 1 << arg5;
        int n3 = arg1;
        int n4 = n = 0;
        while (n4 < n2) {
            if (arg3[arg4 + n] < -2047 || arg3[arg4 + n] > 2047) {
                return 0;
            }
            n4 = ++n;
        }
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = n = 0;
        while (n8 < n2) {
            n5 <<= 1;
            int n9 = arg3[arg4 + n];
            if (n9 < 0) {
                n9 = -n9;
                n5 |= 1;
            }
            int n10 = n9;
            n5 <<= 7;
            n5 |= n10 & 0x7F;
            n5 <<= (n10 >>>= 7) + 1;
            n5 |= 1;
            int n11 = n6 = (n6 += 8) + (n10 + 1);
            while (n11 >= 8) {
                n6 -= 8;
                if (arg0 != null) {
                    if (n7 >= arg2) {
                        return 0;
                    }
                    arg0[n3 + n7] = (byte)(n5 >>> n6);
                }
                ++n7;
                n11 = n6;
            }
            n8 = ++n;
        }
        if (n6 > 0) {
            if (arg0 != null) {
                if (n7 >= arg2) {
                    return 0;
                }
                arg0[n3 + n7] = (byte)(n5 << 8 - n6);
            }
            ++n7;
        }
        return n7;
    }

    public int cfr_renamed_6968(byte[] arg0, int arg1, int arg2, short[] arg3, int arg4, int arg5, int arg6) {
        int n;
        int n2 = 1 << arg5;
        int n3 = (1 << arg6 - 1) - 1;
        int n4 = -n3;
        int n5 = n = 0;
        while (n5 < n2) {
            if (arg3[arg4 + n] < n4 || arg3[arg4 + n] > n3) {
                return 0;
            }
            n5 = ++n;
        }
        int n6 = n2 * arg6 + 7 >> 3;
        if (arg0 == null) {
            return n6;
        }
        if (n6 > arg2) {
            return 0;
        }
        int n7 = arg1;
        int n8 = 0;
        int n9 = 0;
        int n10 = (1 << arg6) - 1;
        int n11 = n = 0;
        while (n11 < n2) {
            n8 = n8 << arg6 | arg3[arg4 + n] & 0xFFF & n10;
            int n12 = n9 + arg6;
            while (n12 >= 8) {
                arg0[n7++] = (byte)(n8 >> (n9 -= 8));
                n12 = n9;
            }
            n11 = ++n;
        }
        if (n9 > 0) {
            arg0[n7++] = (byte)(n8 << 8 - n9);
        }
        return n6;
    }
}

