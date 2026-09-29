/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfyf;

public class spryag {
    private final int cfr_renamed_119;
    private final boolean cfr_renamed_91;
    private final int cfr_renamed_0;
    private final int cfr_renamed_1;
    private final int cfr_renamed_2;
    private final int cfr_renamed_3;
    private final int cfr_renamed_4;

    public void cfr_renamed_6071(byte[] arg0, short[][] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1) {
            int n3 = n;
            spryag spryag2 = this;
            this.cfr_renamed_6072(arg0, n3 * (spryag2.cfr_renamed_2 * spryag2.cfr_renamed_4 / 8), arg1[n]);
            n2 = n = (int)((byte)(n3 + 1));
        }
    }

    public void cfr_renamed_6073(byte[] arg0, int arg1, short[] arg2) {
        block4: {
            int n;
            block5: {
                int n2;
                block3: {
                    int n3;
                    if (this.cfr_renamed_0 != 3) break block3;
                    int n4 = n3 = 0;
                    while (n4 < this.cfr_renamed_4 / 8) {
                        short s = (short)(3 * n3);
                        short s2 = (short)(8 * n3);
                        int n5 = arg1;
                        arg0[n5 + s + 0] = (byte)(arg2[s2 + 0] & 7 | (arg2[s2 + 1] & 7) << 3 | (arg2[s2 + 2] & 3) << 6);
                        arg0[n5 + s + 1] = (byte)(arg2[s2 + 2] >> 2 & 1 | (arg2[s2 + 3] & 7) << 1 | (arg2[s2 + 4] & 7) << 4 | (arg2[s2 + 5] & 1) << 7);
                        arg0[arg1 + s + 2] = (byte)(arg2[s2 + 5] >> 1 & 3 | (arg2[s2 + 6] & 7) << 2 | (arg2[s2 + 7] & 7) << 5);
                        n4 = n3 = (int)((short)(n3 + 1));
                    }
                    break block4;
                }
                if (this.cfr_renamed_0 != 4) break block5;
                int n6 = n2 = 0;
                while (n6 < this.cfr_renamed_4 / 2) {
                    int n7 = n2;
                    short s = (short)(2 * n2);
                    arg0[arg1 + n7] = (byte)(arg2[s] & 0xF | (arg2[s + 1] & 0xF) << 4);
                    n6 = n2 = (int)((short)(n2 + 1));
                }
                break block4;
            }
            if (this.cfr_renamed_0 != 6) break block4;
            int n8 = n = 0;
            while (n8 < this.cfr_renamed_4 / 4) {
                short s = (short)(3 * n);
                short s3 = (short)(4 * n);
                int n9 = arg1;
                arg0[n9 + s + 0] = (byte)(arg2[s3 + 0] & 0x3F | (arg2[s3 + 1] & 3) << 6);
                arg0[n9 + s + 1] = (byte)(arg2[s3 + 1] >> 2 & 0xF | (arg2[s3 + 2] & 0xF) << 4);
                arg0[arg1 + s + 2] = (byte)(arg2[s3 + 2] >> 4 & 3 | (arg2[s3 + 3] & 0x3F) << 2);
                n8 = n = (int)((short)(n + 1));
            }
        }
    }

    private /* synthetic */ void cfr_renamed_6072(byte[] arg0, int arg1, short[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4 / 4) {
            short s = (short)(5 * n);
            short s2 = (short)(4 * n);
            int n3 = arg1;
            arg0[arg1 + s + 0] = (byte)(arg2[s2 + 0] & 0xFF);
            arg0[arg1 + s + 1] = (byte)(arg2[s2 + 0] >> 8 & 3 | (arg2[s2 + 1] & 0x3F) << 2);
            arg0[n3 + s + 2] = (byte)(arg2[s2 + 1] >> 6 & 0xF | (arg2[s2 + 2] & 0xF) << 4);
            arg0[n3 + s + 3] = (byte)(arg2[s2 + 2] >> 4 & 0x3F | (arg2[s2 + 3] & 3) << 6);
            arg0[arg1 + s + 4] = (byte)(arg2[s2 + 3] >> 2 & 0xFF);
            n2 = n = (int)((short)(n + 1));
        }
    }

    public void cfr_renamed_6074(byte[] arg0, short[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_119) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < 8) {
                arg0[n] = (byte)(arg0[n] | (arg1[n * 8 + n3] & 1) << n3);
                n4 = n3 = (int)((byte)(n3 + 1));
            }
            n2 = n = (int)((byte)(n + 1));
        }
    }

    public void cfr_renamed_6075(byte[] arg0, int arg1, short[] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4 / 4) {
            short s;
            short s2 = (short)(5 * n);
            short s3 = s = (short)(4 * n);
            arg2[s + 0] = (short)(arg0[arg1 + s2 + 0] & 0xFF | (arg0[arg1 + s2 + 1] & 3) << 8);
            arg2[s3 + 1] = (short)(arg0[arg1 + s2 + 1] >> 2 & 0x3F | (arg0[arg1 + s2 + 2] & 0xF) << 6);
            arg2[s3 + 2] = (short)(arg0[arg1 + s2 + 2] >> 4 & 0xF | (arg0[arg1 + s2 + 3] & 0x3F) << 4);
            arg2[s + 3] = (short)(arg0[arg1 + s2 + 3] >> 6 & 3 | (arg0[arg1 + s2 + 4] & 0xFF) << 2);
            n2 = n = (int)((short)(n + 1));
        }
    }

    /*
     * WARNING - void declaration
     */
    public spryag(sprfyf sprfyf2) {
        void arg0;
        spryag spryag2 = this;
        void v1 = arg0;
        spryag spryag3 = this;
        void v3 = arg0;
        this.cfr_renamed_4 = arg0.cfr_renamed_6076();
        this.cfr_renamed_1 = v3.cfr_renamed_6077();
        spryag3.cfr_renamed_0 = v3.cfr_renamed_6078();
        spryag3.cfr_renamed_3 = arg0.cfr_renamed_6079();
        this.cfr_renamed_2 = v1.cfr_renamed_6080();
        spryag2.cfr_renamed_119 = v1.cfr_renamed_6081();
        spryag2.cfr_renamed_91 = sprfyf2.cfr_renamed_96;
    }

    private /* synthetic */ void cfr_renamed_6082(byte[] arg0, int arg1, short[] arg2) {
        if (!this.cfr_renamed_91) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_4 / 8) {
                short s;
                short s2 = (short)(13 * n);
                short s3 = s = (short)(8 * n);
                short s4 = s;
                arg2[s + 0] = (short)(arg0[arg1 + s2 + 0] & 0xFF | (arg0[arg1 + s2 + 1] & 0x1F) << 8);
                arg2[s + 1] = (short)(arg0[arg1 + s2 + 1] >> 5 & 7 | (arg0[arg1 + s2 + 2] & 0xFF) << 3 | (arg0[arg1 + s2 + 3] & 3) << 11);
                arg2[s4 + 2] = (short)(arg0[arg1 + s2 + 3] >> 2 & 0x3F | (arg0[arg1 + s2 + 4] & 0x7F) << 6);
                arg2[s4 + 3] = (short)(arg0[arg1 + s2 + 4] >> 7 & 1 | (arg0[arg1 + s2 + 5] & 0xFF) << 1 | (arg0[arg1 + s2 + 6] & 0xF) << 9);
                arg2[s + 4] = (short)(arg0[arg1 + s2 + 6] >> 4 & 0xF | (arg0[arg1 + s2 + 7] & 0xFF) << 4 | (arg0[arg1 + s2 + 8] & 1) << 12);
                arg2[s3 + 5] = (short)(arg0[arg1 + s2 + 8] >> 1 & 0x7F | (arg0[arg1 + s2 + 9] & 0x3F) << 7);
                arg2[s3 + 6] = (short)(arg0[arg1 + s2 + 9] >> 6 & 3 | (arg0[arg1 + s2 + 10] & 0xFF) << 2 | (arg0[arg1 + s2 + 11] & 7) << 10);
                arg2[s + 7] = (short)(arg0[arg1 + s2 + 11] >> 3 & 0x1F | (arg0[arg1 + s2 + 12] & 0xFF) << 5);
                n2 = n = (int)((short)(n + 1));
            }
        } else {
            int n;
            int n3 = n = 0;
            while (n3 < this.cfr_renamed_4 / 2) {
                short s = (short)(3 * n);
                short s5 = (short)(2 * n);
                arg2[s5 + 0] = (short)(arg0[arg1 + s + 0] & 0xFF | (arg0[arg1 + s + 1] & 0xF) << 8);
                arg2[s5 + 1] = (short)(arg0[arg1 + s + 1] >> 4 & 0xF | (arg0[arg1 + s + 2] & 0xFF) << 4);
                n3 = n = (int)((short)(n + 1));
            }
        }
    }

    public void cfr_renamed_6083(byte[] arg0, short[] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_119) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < 8) {
                int n5 = n3;
                arg1[n * 8 + n5] = (short)(arg0[n] >> n3 & 1);
                n4 = n3 = (int)((byte)(n5 + 1));
            }
            n2 = n = (int)((byte)(n + 1));
        }
    }

    public void cfr_renamed_6084(byte[] arg0, int arg1, short[][] arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1) {
            this.cfr_renamed_6082(arg0, arg1 + n * this.cfr_renamed_3, arg2[n]);
            n2 = n = (int)((byte)(n + 1));
        }
    }

    public void cfr_renamed_6085(byte[] arg0, short[][] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1) {
            int n3 = n;
            spryag spryag2 = this;
            this.cfr_renamed_6075(arg0, n3 * (spryag2.cfr_renamed_2 * spryag2.cfr_renamed_4 / 8), arg1[n]);
            n2 = n = (int)((byte)(n3 + 1));
        }
    }

    public void cfr_renamed_6086(byte[] arg0, int arg1, short[] arg2) {
        block4: {
            int n;
            block5: {
                int n2;
                block3: {
                    int n3;
                    if (this.cfr_renamed_0 != 3) break block3;
                    int n4 = n3 = 0;
                    while (n4 < this.cfr_renamed_4 / 8) {
                        short s;
                        short s2 = (short)(3 * n3);
                        short s3 = s = (short)(8 * n3);
                        short s4 = s;
                        arg2[s + 0] = (short)(arg0[arg1 + s2 + 0] & 7);
                        arg2[s + 1] = (short)(arg0[arg1 + s2 + 0] >> 3 & 7);
                        arg2[s4 + 2] = (short)(arg0[arg1 + s2 + 0] >> 6 & 3 | (arg0[arg1 + s2 + 1] & 1) << 2);
                        arg2[s4 + 3] = (short)(arg0[arg1 + s2 + 1] >> 1 & 7);
                        arg2[s + 4] = (short)(arg0[arg1 + s2 + 1] >> 4 & 7);
                        arg2[s3 + 5] = (short)(arg0[arg1 + s2 + 1] >> 7 & 1 | (arg0[arg1 + s2 + 2] & 3) << 1);
                        arg2[s3 + 6] = (short)(arg0[arg1 + s2 + 2] >> 2 & 7);
                        arg2[s + 7] = (short)(arg0[arg1 + s2 + 2] >> 5 & 7);
                        n4 = n3 = (int)((short)(n3 + 1));
                    }
                    break block4;
                }
                if (this.cfr_renamed_0 != 4) break block5;
                int n5 = n2 = 0;
                while (n5 < this.cfr_renamed_4 / 2) {
                    int n6 = n2;
                    short s = (short)(2 * n2);
                    arg2[s] = (short)(arg0[arg1 + n6] & 0xF);
                    arg2[s + 1] = (short)(arg0[arg1 + n6] >> 4 & 0xF);
                    n5 = n2 = (int)((short)(n2 + 1));
                }
                break block4;
            }
            if (this.cfr_renamed_0 != 6) break block4;
            int n7 = n = 0;
            while (n7 < this.cfr_renamed_4 / 4) {
                short s;
                short s5 = (short)(3 * n);
                short s6 = s = (short)(4 * n);
                arg2[s + 0] = (short)(arg0[arg1 + s5 + 0] & 0x3F);
                arg2[s6 + 1] = (short)(arg0[arg1 + s5 + 0] >> 6 & 3 | (arg0[arg1 + s5 + 1] & 0xF) << 2);
                arg2[s6 + 2] = (short)((arg0[arg1 + s5 + 1] & 0xFF) >> 4 | (arg0[arg1 + s5 + 2] & 3) << 4);
                arg2[s + 3] = (short)((arg0[arg1 + s5 + 2] & 0xFF) >> 2);
                n7 = n = (int)((short)(n + 1));
            }
        }
    }

    private /* synthetic */ void cfr_renamed_6087(byte[] arg0, int arg1, short[] arg2) {
        if (!this.cfr_renamed_91) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_4 / 8) {
                short s = (short)(13 * n);
                short s2 = (short)(8 * n);
                int n3 = arg1;
                int n4 = arg1;
                int n5 = arg1;
                int n6 = arg1;
                arg0[arg1 + s + 0] = (byte)(arg2[s2 + 0] & 0xFF);
                arg0[n6 + s + 1] = (byte)(arg2[s2 + 0] >> 8 & 0x1F | (arg2[s2 + 1] & 7) << 5);
                arg0[n6 + s + 2] = (byte)(arg2[s2 + 1] >> 3 & 0xFF);
                arg0[arg1 + s + 3] = (byte)(arg2[s2 + 1] >> 11 & 3 | (arg2[s2 + 2] & 0x3F) << 2);
                arg0[n5 + s + 4] = (byte)(arg2[s2 + 2] >> 6 & 0x7F | (arg2[s2 + 3] & 1) << 7);
                arg0[n5 + s + 5] = (byte)(arg2[s2 + 3] >> 1 & 0xFF);
                arg0[arg1 + s + 6] = (byte)(arg2[s2 + 3] >> 9 & 0xF | (arg2[s2 + 4] & 0xF) << 4);
                arg0[n4 + s + 7] = (byte)(arg2[s2 + 4] >> 4 & 0xFF);
                arg0[n4 + s + 8] = (byte)(arg2[s2 + 4] >> 12 & 1 | (arg2[s2 + 5] & 0x7F) << 1);
                arg0[arg1 + s + 9] = (byte)(arg2[s2 + 5] >> 7 & 0x3F | (arg2[s2 + 6] & 3) << 6);
                arg0[n3 + s + 10] = (byte)(arg2[s2 + 6] >> 2 & 0xFF);
                arg0[n3 + s + 11] = (byte)(arg2[s2 + 6] >> 10 & 7 | (arg2[s2 + 7] & 0x1F) << 3);
                arg0[arg1 + s + 12] = (byte)(arg2[s2 + 7] >> 5 & 0xFF);
                n2 = n = (int)((short)(n + 1));
            }
        } else {
            int n;
            int n7 = n = 0;
            while (n7 < this.cfr_renamed_4 / 2) {
                short s = (short)(3 * n);
                short s3 = (short)(2 * n);
                int n8 = arg1;
                arg0[n8 + s + 0] = (byte)(arg2[s3 + 0] & 0xFF);
                arg0[n8 + s + 1] = (byte)(arg2[s3 + 0] >> 8 & 0xF | (arg2[s3 + 1] & 0xF) << 4);
                arg0[arg1 + s + 2] = (byte)(arg2[s3 + 1] >> 4 & 0xFF);
                n7 = n = (int)((short)(n + 1));
            }
        }
    }

    public void cfr_renamed_6088(byte[] arg0, short[][] arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1) {
            int n3 = n;
            this.cfr_renamed_6087(arg0, n3 * this.cfr_renamed_3, arg1[n]);
            n2 = n = (int)((byte)(n3 + 1));
        }
    }
}

