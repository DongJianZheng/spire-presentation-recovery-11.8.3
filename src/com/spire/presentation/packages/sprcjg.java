/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdqg;
import com.spire.presentation.packages.sprfng;
import com.spire.presentation.packages.sprfpg;
import com.spire.presentation.packages.sprjmg;
import com.spire.presentation.packages.sprkep;
import com.spire.presentation.packages.sprmrg;
import com.spire.presentation.packages.sprnil;
import com.spire.presentation.packages.sprvpg;
import com.spire.presentation.packages.sprygg;

public class sprcjg {
    private final sprygg cfr_renamed_0;
    private int[] cfr_renamed_1;
    private final int cfr_renamed_2;
    private final int cfr_renamed_3;
    private final sprvpg cfr_renamed_4;

    public void cfr_renamed_7072() {
        sprcjg sprcjg2 = this;
        sprcjg2.cfr_renamed_7091(sprfng.cfr_renamed_7092(sprcjg2.cfr_renamed_790()));
    }

    public int[] cfr_renamed_790() {
        return this.cfr_renamed_1;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        int n = 0;
        int n2 = n;
        while (n2 < this.cfr_renamed_1.length) {
            int n3 = n;
            stringBuffer.append(this.cfr_renamed_1[n3]);
            if (n3 != this.cfr_renamed_1.length - 1) {
                stringBuffer.append(sprkep.cfr_renamed_9("\u007f-"));
            }
            n2 = ++n;
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append("]");
        return stringBuffer2.toString();
    }

    public void cfr_renamed_7093(byte[] arg0) {
        if (this.cfr_renamed_4.cfr_renamed_7094() == 131072) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_2 / 4) {
                sprcjg sprcjg2 = this;
                sprcjg sprcjg3 = this;
                sprcjg3.cfr_renamed_7069(4 * n + 0, (arg0[9 * n + 0] & 0xFF | (arg0[9 * n + 1] & 0xFF) << 8 | (arg0[9 * n + 2] & 0xFF) << 16) & 0x3FFFF);
                sprcjg3.cfr_renamed_7069(4 * n + 1, ((arg0[9 * n + 2] & 0xFF) >>> 2 | (arg0[9 * n + 3] & 0xFF) << 6 | (arg0[9 * n + 4] & 0xFF) << 14) & 0x3FFFF);
                sprcjg2.cfr_renamed_7069(4 * n + 2, ((arg0[9 * n + 4] & 0xFF) >>> 4 | (arg0[9 * n + 5] & 0xFF) << 4 | (arg0[9 * n + 6] & 0xFF) << 12) & 0x3FFFF);
                sprcjg2.cfr_renamed_7069(4 * n + 3, ((arg0[9 * n + 6] & 0xFF) >>> 6 | (arg0[9 * n + 7] & 0xFF) << 2 | (arg0[9 * n + 8] & 0xFF) << 10) & 0x3FFFF);
                sprcjg sprcjg4 = this;
                sprcjg4.cfr_renamed_7069(4 * n + 0, this.cfr_renamed_4.cfr_renamed_7094() - sprcjg4.cfr_renamed_6983(4 * n + 0));
                sprcjg sprcjg5 = this;
                sprcjg5.cfr_renamed_7069(4 * n + 1, this.cfr_renamed_4.cfr_renamed_7094() - sprcjg5.cfr_renamed_6983(4 * n + 1));
                sprcjg sprcjg6 = this;
                sprcjg6.cfr_renamed_7069(4 * n + 2, this.cfr_renamed_4.cfr_renamed_7094() - sprcjg6.cfr_renamed_6983(4 * n + 2));
                sprcjg sprcjg7 = this;
                sprcjg7.cfr_renamed_7069(4 * ++n + 3, this.cfr_renamed_4.cfr_renamed_7094() - sprcjg7.cfr_renamed_6983(4 * n + 3));
                n2 = n;
            }
        } else if (this.cfr_renamed_4.cfr_renamed_7094() == 524288) {
            int n;
            int n3 = n = 0;
            while (n3 < this.cfr_renamed_2 / 2) {
                sprcjg sprcjg8 = this;
                sprcjg8.cfr_renamed_7069(2 * n + 0, (arg0[5 * n + 0] & 0xFF | (arg0[5 * n + 1] & 0xFF) << 8 | (arg0[5 * n + 2] & 0xFF) << 16) & 0xFFFFF);
                sprcjg8.cfr_renamed_7069(2 * n + 1, ((arg0[5 * n + 2] & 0xFF) >>> 4 | (arg0[5 * n + 3] & 0xFF) << 4 | (arg0[5 * n + 4] & 0xFF) << 12) & 0xFFFFF);
                sprcjg sprcjg9 = this;
                sprcjg9.cfr_renamed_7069(2 * n + 0, this.cfr_renamed_4.cfr_renamed_7094() - sprcjg9.cfr_renamed_6983(2 * n + 0));
                sprcjg sprcjg10 = this;
                sprcjg10.cfr_renamed_7069(2 * ++n + 1, this.cfr_renamed_4.cfr_renamed_7094() - sprcjg10.cfr_renamed_6983(2 * n + 1));
                n3 = n;
            }
        } else {
            throw new RuntimeException(sprmrg.cfr_renamed_9("\u001f}'a//\ff$f<g!z%/\u000fn%b)>i"));
        }
    }

    public void cfr_renamed_7061(byte[] arg0, short arg1) {
        int n;
        sprcjg sprcjg2 = this;
        sprcjg sprcjg3 = this;
        int n2 = sprcjg2.cfr_renamed_3 * sprcjg3.cfr_renamed_0.cfr_renamed_3;
        byte[] byArray = new byte[n2 + 2];
        sprcjg2.cfr_renamed_0.cfr_renamed_7043(arg0, arg1);
        sprcjg3.cfr_renamed_0.cfr_renamed_7046(byArray, 0, n2);
        int n3 = n = sprcjg.cfr_renamed_7095(sprcjg2, 0, this.cfr_renamed_2, byArray, n2);
        while (n3 < this.cfr_renamed_2) {
            int n4;
            int n5 = n2 % 3;
            int n6 = n4 = 0;
            while (n6 < n5) {
                byArray[++n4] = byArray[n2 - n5 + n4];
                n6 = n4;
            }
            sprcjg sprcjg4 = this;
            sprcjg4.cfr_renamed_0.cfr_renamed_7046(byArray, n5, this.cfr_renamed_0.cfr_renamed_3);
            n2 = sprcjg4.cfr_renamed_0.cfr_renamed_3 + n5;
            int n7 = n;
            n3 = n7 + sprcjg.cfr_renamed_7095(this, n7, this.cfr_renamed_2 - n, byArray, n2);
        }
    }

    public void cfr_renamed_7065(byte[] arg0, short arg1) {
        sprcjg sprcjg2 = this;
        sprcjg sprcjg3 = this;
        byte[] byArray = new byte[sprcjg2.cfr_renamed_4.cfr_renamed_7096() * sprcjg3.cfr_renamed_0.cfr_renamed_4];
        sprcjg2.cfr_renamed_0.cfr_renamed_7044(arg0, arg1);
        sprcjg3.cfr_renamed_0.cfr_renamed_7045(byArray, 0, this.cfr_renamed_4.cfr_renamed_7096() * this.cfr_renamed_0.cfr_renamed_4);
        sprcjg2.cfr_renamed_7097(byArray);
    }

    public void cfr_renamed_6985() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            sprcjg sprcjg2 = this;
            sprcjg2.cfr_renamed_7069(n, sprjmg.cfr_renamed_7053(sprcjg2.cfr_renamed_6983(n++)));
            n2 = n;
        }
    }

    public void cfr_renamed_7087(sprcjg arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            sprcjg sprcjg2 = this;
            int[] nArray = sprdqg.cfr_renamed_7051(sprcjg2.cfr_renamed_6983(n));
            sprcjg2.cfr_renamed_7069(n, nArray[0]);
            arg0.cfr_renamed_7069(n++, nArray[1]);
            n2 = n;
        }
    }

    public void cfr_renamed_7078(sprcjg arg0, sprcjg arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            int n3 = n++;
            this.cfr_renamed_7069(n3, sprdqg.cfr_renamed_7049(arg0.cfr_renamed_6983(n), arg1.cfr_renamed_6983(n3), this.cfr_renamed_4.cfr_renamed_7048()));
            n2 = n;
        }
    }

    public void cfr_renamed_7069(int arg0, int arg1) {
        this.cfr_renamed_1[arg0] = arg1;
    }

    public sprcjg(sprvpg sprvpg2) {
        sprcjg sprcjg2 = this;
        sprcjg sprcjg3 = this;
        sprcjg sprcjg4 = this;
        sprcjg3.cfr_renamed_2 = 256;
        sprcjg3.cfr_renamed_1 = new int[sprcjg4.cfr_renamed_2];
        sprcjg2.cfr_renamed_4 = sprvpg2;
        sprcjg2.cfr_renamed_0 = sprvpg2.cfr_renamed_7098();
        this.cfr_renamed_3 = (768 + this.cfr_renamed_0.cfr_renamed_3 - 1) / this.cfr_renamed_0.cfr_renamed_3;
    }

    public void cfr_renamed_7099(byte[] arg0, int arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2 / 8) {
            int n3 = arg1 + 13 * n;
            sprcjg sprcjg2 = this;
            sprcjg sprcjg3 = this;
            sprcjg sprcjg4 = this;
            sprcjg sprcjg5 = this;
            sprcjg5.cfr_renamed_7069(8 * n + 0, (arg0[n3 + 0] & 0xFF | (arg0[n3 + 1] & 0xFF) << 8) & 0x1FFF);
            sprcjg5.cfr_renamed_7069(8 * n + 1, ((arg0[n3 + 1] & 0xFF) >> 5 | (arg0[n3 + 2] & 0xFF) << 3 | (arg0[n3 + 3] & 0xFF) << 11) & 0x1FFF);
            sprcjg4.cfr_renamed_7069(8 * n + 2, ((arg0[n3 + 3] & 0xFF) >> 2 | (arg0[n3 + 4] & 0xFF) << 6) & 0x1FFF);
            sprcjg4.cfr_renamed_7069(8 * n + 3, ((arg0[n3 + 4] & 0xFF) >> 7 | (arg0[n3 + 5] & 0xFF) << 1 | (arg0[n3 + 6] & 0xFF) << 9) & 0x1FFF);
            sprcjg3.cfr_renamed_7069(8 * n + 4, ((arg0[n3 + 6] & 0xFF) >> 4 | (arg0[n3 + 7] & 0xFF) << 4 | (arg0[n3 + 8] & 0xFF) << 12) & 0x1FFF);
            sprcjg3.cfr_renamed_7069(8 * n + 5, ((arg0[n3 + 8] & 0xFF) >> 1 | (arg0[n3 + 9] & 0xFF) << 7) & 0x1FFF);
            sprcjg2.cfr_renamed_7069(8 * n + 6, ((arg0[n3 + 9] & 0xFF) >> 6 | (arg0[n3 + 10] & 0xFF) << 2 | (arg0[n3 + 11] & 0xFF) << 10) & 0x1FFF);
            sprcjg2.cfr_renamed_7069(8 * n + 7, ((arg0[n3 + 11] & 0xFF) >> 3 | (arg0[n3 + 12] & 0xFF) << 5) & 0x1FFF);
            sprcjg sprcjg6 = this;
            sprcjg6.cfr_renamed_7069(8 * n + 0, 4096 - sprcjg6.cfr_renamed_6983(8 * n + 0));
            sprcjg sprcjg7 = this;
            sprcjg7.cfr_renamed_7069(8 * n + 1, 4096 - sprcjg7.cfr_renamed_6983(8 * n + 1));
            sprcjg sprcjg8 = this;
            sprcjg8.cfr_renamed_7069(8 * n + 2, 4096 - sprcjg8.cfr_renamed_6983(8 * n + 2));
            sprcjg sprcjg9 = this;
            sprcjg9.cfr_renamed_7069(8 * n + 3, 4096 - sprcjg9.cfr_renamed_6983(8 * n + 3));
            sprcjg sprcjg10 = this;
            sprcjg10.cfr_renamed_7069(8 * n + 4, 4096 - sprcjg10.cfr_renamed_6983(8 * n + 4));
            sprcjg sprcjg11 = this;
            sprcjg11.cfr_renamed_7069(8 * n + 5, 4096 - sprcjg11.cfr_renamed_6983(8 * n + 5));
            sprcjg sprcjg12 = this;
            sprcjg12.cfr_renamed_7069(8 * n + 6, 4096 - sprcjg12.cfr_renamed_6983(8 * n + 6));
            sprcjg sprcjg13 = this;
            sprcjg13.cfr_renamed_7069(8 * ++n + 7, 4096 - sprcjg13.cfr_renamed_6983(8 * n + 7));
            n2 = n;
        }
    }

    public int cfr_renamed_7082(sprcjg arg0, sprcjg arg1) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_2) {
            int n4 = n;
            this.cfr_renamed_7069(n4, sprdqg.cfr_renamed_7047(arg0.cfr_renamed_6983(n), arg1.cfr_renamed_6983(n4), this.cfr_renamed_4));
            n2 += this.cfr_renamed_6983(n++);
            n3 = n;
        }
        return n2;
    }

    public boolean cfr_renamed_7062(int arg0) {
        int n;
        if (arg0 > 1047552) {
            return true;
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            sprcjg sprcjg2 = this;
            int n3 = sprcjg2.cfr_renamed_6983(n) >> 31;
            n3 = sprcjg2.cfr_renamed_6983(n) - (n3 & 2 * this.cfr_renamed_6983(n));
            if (n3 >= arg0) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    public byte[] cfr_renamed_7100(byte[] arg0, int arg1) {
        int n;
        int[] nArray = new int[8];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2 / 8) {
            int n3;
            nArray[0] = 4096 - this.cfr_renamed_6983(8 * n + 0);
            nArray[1] = 4096 - this.cfr_renamed_6983(8 * n + 1);
            nArray[2] = 4096 - this.cfr_renamed_6983(8 * n + 2);
            nArray[3] = 4096 - this.cfr_renamed_6983(8 * n + 3);
            nArray[4] = 4096 - this.cfr_renamed_6983(8 * n + 4);
            nArray[5] = 4096 - this.cfr_renamed_6983(8 * n + 5);
            nArray[6] = 4096 - this.cfr_renamed_6983(8 * n + 6);
            nArray[7] = 4096 - this.cfr_renamed_6983(8 * n + 7);
            int n4 = n3 = arg1 + 13 * n;
            int n5 = n3;
            int n6 = n3;
            int n7 = n3;
            int n8 = n3;
            int n9 = n3;
            int n10 = n3;
            arg0[n3 + 0] = (byte)nArray[0];
            arg0[n10 + 1] = (byte)(nArray[0] >> 8);
            arg0[n10 + 1] = (byte)(arg0[n3 + 1] | (byte)(nArray[1] << 5));
            arg0[n3 + 2] = (byte)(nArray[1] >> 3);
            arg0[n9 + 3] = (byte)(nArray[1] >> 11);
            arg0[n9 + 3] = (byte)(arg0[n3 + 3] | (byte)(nArray[2] << 2));
            arg0[n3 + 4] = (byte)(nArray[2] >> 6);
            arg0[n8 + 4] = (byte)(arg0[n3 + 4] | (byte)(nArray[3] << 7));
            arg0[n8 + 5] = (byte)(nArray[3] >> 1);
            arg0[n3 + 6] = (byte)(nArray[3] >> 9);
            arg0[n7 + 6] = (byte)(arg0[n3 + 6] | (byte)(nArray[4] << 4));
            arg0[n7 + 7] = (byte)(nArray[4] >> 4);
            arg0[n6 + 8] = (byte)(nArray[4] >> 12);
            arg0[n6 + 8] = (byte)(arg0[n3 + 8] | (byte)(nArray[5] << 1));
            arg0[n5 + 9] = (byte)(nArray[5] >> 7);
            arg0[n5 + 9] = (byte)(arg0[n3 + 9] | (byte)(nArray[6] << 6));
            arg0[n3 + 10] = (byte)(nArray[6] >> 2);
            arg0[n4 + 11] = (byte)(nArray[6] >> 10);
            arg0[n4 + 11] = (byte)(arg0[n3 + 11] | (byte)(nArray[7] << 3));
            arg0[n3 + 12] = (byte)(nArray[7] >> 5);
            n2 = ++n;
        }
        return arg0;
    }

    public int cfr_renamed_6983(int arg0) {
        return this.cfr_renamed_1[arg0];
    }

    public void cfr_renamed_6991() {
        sprcjg sprcjg2 = this;
        sprcjg2.cfr_renamed_7091(sprfng.cfr_renamed_7101(sprcjg2.cfr_renamed_1));
    }

    public void cfr_renamed_7076(sprcjg arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            sprcjg sprcjg2 = this;
            int[] nArray = sprdqg.cfr_renamed_7050(this.cfr_renamed_6983(n), sprcjg2.cfr_renamed_4.cfr_renamed_7048());
            sprcjg2.cfr_renamed_7069(n, nArray[1]);
            arg0.cfr_renamed_7069(n++, nArray[0]);
            n2 = n;
        }
    }

    public void cfr_renamed_7067(sprcjg arg0, sprcjg arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            int n3 = n;
            long l = arg1.cfr_renamed_6983(n);
            this.cfr_renamed_7069(n3, sprjmg.cfr_renamed_7054((long)arg0.cfr_renamed_6983(n3) * l));
            n2 = ++n;
        }
    }

    public void cfr_renamed_1007() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            sprcjg sprcjg2 = this;
            sprcjg2.cfr_renamed_7069(++n, sprcjg2.cfr_renamed_6983(n) << 13);
            n2 = n;
        }
    }

    public void cfr_renamed_7064(sprcjg arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            sprcjg sprcjg2 = this;
            sprcjg2.cfr_renamed_7069(n, sprcjg2.cfr_renamed_6983(n) + arg0.cfr_renamed_6983(n++));
            n2 = n;
        }
    }

    public byte[] cfr_renamed_7102(byte[] arg0, int arg1) {
        byte[] byArray = new byte[8];
        if (this.cfr_renamed_4.cfr_renamed_7103() == 2) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_2 / 8) {
                byArray[0] = (byte)(this.cfr_renamed_4.cfr_renamed_7103() - this.cfr_renamed_6983(8 * n + 0));
                byArray[1] = (byte)(this.cfr_renamed_4.cfr_renamed_7103() - this.cfr_renamed_6983(8 * n + 1));
                byArray[2] = (byte)(this.cfr_renamed_4.cfr_renamed_7103() - this.cfr_renamed_6983(8 * n + 2));
                byArray[3] = (byte)(this.cfr_renamed_4.cfr_renamed_7103() - this.cfr_renamed_6983(8 * n + 3));
                byArray[4] = (byte)(this.cfr_renamed_4.cfr_renamed_7103() - this.cfr_renamed_6983(8 * n + 4));
                byArray[5] = (byte)(this.cfr_renamed_4.cfr_renamed_7103() - this.cfr_renamed_6983(8 * n + 5));
                byArray[6] = (byte)(this.cfr_renamed_4.cfr_renamed_7103() - this.cfr_renamed_6983(8 * n + 6));
                byArray[7] = (byte)(this.cfr_renamed_4.cfr_renamed_7103() - this.cfr_renamed_6983(8 * n + 7));
                arg0[arg1 + 3 * n + 0] = (byte)(byArray[0] >> 0 | byArray[1] << 3 | byArray[2] << 6);
                arg0[arg1 + 3 * n + 1] = (byte)(byArray[2] >> 2 | byArray[3] << 1 | byArray[4] << 4 | byArray[5] << 7);
                int n3 = arg1 + 3 * n + 2;
                arg0[n3] = (byte)(byArray[5] >> 1 | byArray[6] << 2 | byArray[7] << 5);
                n2 = ++n;
            }
        } else if (this.cfr_renamed_4.cfr_renamed_7103() == 4) {
            int n;
            int n4 = n = 0;
            while (n4 < this.cfr_renamed_2 / 2) {
                byArray[0] = (byte)(this.cfr_renamed_4.cfr_renamed_7103() - this.cfr_renamed_6983(2 * n + 0));
                byArray[1] = (byte)(this.cfr_renamed_4.cfr_renamed_7103() - this.cfr_renamed_6983(2 * n + 1));
                int n5 = arg1 + n;
                arg0[n5] = (byte)(byArray[0] | byArray[1] << 4);
                n4 = ++n;
            }
        } else {
            throw new RuntimeException(sprkep.cfr_renamed_9("H'lsc6h7~sy<-1hs?sb!-g,"));
        }
        return arg0;
    }

    public void cfr_renamed_7091(int[] arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public void cfr_renamed_7104(byte[] arg0) {
        sprnil sprnil2;
        int n = 0;
        byte[] byArray = new byte[this.cfr_renamed_0.cfr_renamed_4];
        sprnil sprnil3 = sprnil2 = new sprnil(256);
        sprnil3.cfr_renamed_1197(arg0, 0, 32);
        sprnil3.cfr_renamed_6410(byArray, 0, this.cfr_renamed_0.cfr_renamed_4);
        long l = 0L;
        int n2 = 0;
        int n3 = n2;
        while (n3 < 8) {
            long l2 = byArray[n2] & 0xFF;
            int n4 = 8 * n2;
            l |= l2 << n4;
            n3 = ++n2;
        }
        int n5 = 8;
        int n6 = n2 = 0;
        while (n6 < this.cfr_renamed_2) {
            this.cfr_renamed_7069(n2++, 0);
            n6 = n2;
        }
        sprcjg sprcjg2 = this;
        int n7 = n2 = sprcjg2.cfr_renamed_2 - sprcjg2.cfr_renamed_4.cfr_renamed_7105();
        while (n7 < this.cfr_renamed_2) {
            int n8;
            do {
                if (n5 >= this.cfr_renamed_0.cfr_renamed_4) {
                    sprnil2.cfr_renamed_6410(byArray, 0, this.cfr_renamed_0.cfr_renamed_4);
                    n5 = 0;
                }
                n8 = byArray[n5] & 0xFF;
                ++n5;
                n = n8;
            } while (n8 > n2);
            sprcjg sprcjg3 = this;
            sprcjg3.cfr_renamed_7069(n2, this.cfr_renamed_6983(n));
            sprcjg3.cfr_renamed_7069(n, (int)(1L - 2L * (l & 1L)));
            l >>= 1;
            n7 = ++n2;
        }
    }

    public void cfr_renamed_7059(sprfpg arg0, sprfpg arg1) {
        int n;
        sprcjg sprcjg2 = new sprcjg(this.cfr_renamed_4);
        this.cfr_renamed_7067(arg0.cfr_renamed_6975(0), arg1.cfr_renamed_6975(0));
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_4.cfr_renamed_7056()) {
            sprcjg sprcjg3 = sprcjg2;
            sprcjg3.cfr_renamed_7067(arg0.cfr_renamed_6975(n), arg1.cfr_renamed_6975(n++));
            this.cfr_renamed_7064(sprcjg3);
            n2 = n;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ int cfr_renamed_7106(sprcjg arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        var7_6 = 0;
        var6_7 = 0;
        block0: while (true) {
            v0 = var6_7;
            while (v0 < arg2 && var7_6 < arg4) {
                var8_8 = arg3[var7_6] & 255 & 15;
                v1 = arg3[var7_6] & 255;
                ++var7_6;
                var9_9 = v1 >> 4;
                if (arg5 == 2) {
                    if (var8_8 < 15) {
                        v2 = var8_8;
                        var8_8 = v2 - (205 * v2 >> 10) * 5;
                        v3 = arg1 + var6_7;
                        ++var6_7;
                        arg0.cfr_renamed_7069(v3, 2 - var8_8);
                    }
                    if (var9_9 >= 15 || var6_7 >= arg2) continue block0;
                    v4 = var9_9;
                    var9_9 = v4 - (205 * v4 >> 10) * 5;
                    v5 = arg1 + var6_7;
                    arg0.cfr_renamed_7069(v5, 2 - var9_9);
                    v0 = ++var6_7;
                    continue;
                }
                if (arg5 != 4) continue block0;
                if (var8_8 < 9) {
                    v6 = arg1 + var6_7;
                    ++var6_7;
                    arg0.cfr_renamed_7069(v6, 4 - var8_8);
                }
                if (var9_9 < 9 && var6_7 < arg2) ** break;
                continue block0;
                v7 = arg1 + var6_7;
                arg0.cfr_renamed_7069(v7, 4 - var9_9);
                v0 = ++var6_7;
            }
            break;
        }
        return var6_7;
    }

    public void cfr_renamed_7085() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            sprcjg sprcjg2 = this;
            sprcjg2.cfr_renamed_7069(n, sprjmg.cfr_renamed_7052(sprcjg2.cfr_renamed_6983(n++)));
            n2 = n;
        }
    }

    public byte[] cfr_renamed_7107() {
        sprcjg sprcjg2 = this;
        byte[] byArray = new byte[sprcjg2.cfr_renamed_4.cfr_renamed_7108()];
        int[] nArray = new int[4];
        if (sprcjg2.cfr_renamed_4.cfr_renamed_7094() == 131072) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_2 / 4) {
                nArray[0] = this.cfr_renamed_4.cfr_renamed_7094() - this.cfr_renamed_6983(4 * n + 0);
                nArray[1] = this.cfr_renamed_4.cfr_renamed_7094() - this.cfr_renamed_6983(4 * n + 1);
                nArray[2] = this.cfr_renamed_4.cfr_renamed_7094() - this.cfr_renamed_6983(4 * n + 2);
                nArray[3] = this.cfr_renamed_4.cfr_renamed_7094() - this.cfr_renamed_6983(4 * n + 3);
                byArray[9 * n + 0] = (byte)nArray[0];
                byArray[9 * n + 1] = (byte)(nArray[0] >> 8);
                byArray[9 * n + 2] = (byte)((byte)(nArray[0] >> 16) | nArray[1] << 2);
                byArray[9 * n + 3] = (byte)(nArray[1] >> 6);
                byArray[9 * n + 4] = (byte)((byte)(nArray[1] >> 14) | nArray[2] << 4);
                byArray[9 * n + 5] = (byte)(nArray[2] >> 4);
                byArray[9 * n + 6] = (byte)((byte)(nArray[2] >> 12) | nArray[3] << 6);
                byArray[9 * n + 7] = (byte)(nArray[3] >> 2);
                int n3 = 9 * n + 8;
                byArray[n3] = (byte)(nArray[3] >> 10);
                n2 = ++n;
            }
        } else if (this.cfr_renamed_4.cfr_renamed_7094() == 524288) {
            int n;
            int n4 = n = 0;
            while (n4 < this.cfr_renamed_2 / 2) {
                nArray[0] = this.cfr_renamed_4.cfr_renamed_7094() - this.cfr_renamed_6983(2 * n + 0);
                nArray[1] = this.cfr_renamed_4.cfr_renamed_7094() - this.cfr_renamed_6983(2 * n + 1);
                byArray[5 * n + 0] = (byte)nArray[0];
                byArray[5 * n + 1] = (byte)(nArray[0] >> 8);
                byArray[5 * n + 2] = (byte)((byte)(nArray[0] >> 16) | nArray[1] << 4);
                byArray[5 * n + 3] = (byte)(nArray[1] >> 4);
                int n5 = 5 * n + 4;
                byArray[n5] = (byte)(nArray[1] >> 12);
                n4 = ++n;
            }
        } else {
            throw new RuntimeException(sprmrg.cfr_renamed_9("\u001f}'a//\ff$f<g!z%/\u000fn%b)>i"));
        }
        return byArray;
    }

    public byte[] cfr_renamed_7109() {
        int n;
        byte[] byArray = new byte[320];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2 / 4) {
            byArray[5 * n + 0] = (byte)(this.cfr_renamed_1[4 * n + 0] >> 0);
            byArray[5 * n + 1] = (byte)(this.cfr_renamed_1[4 * n + 0] >> 8 | this.cfr_renamed_1[4 * n + 1] << 2);
            byArray[5 * n + 2] = (byte)(this.cfr_renamed_1[4 * n + 1] >> 6 | this.cfr_renamed_1[4 * n + 2] << 4);
            byArray[5 * n + 3] = (byte)(this.cfr_renamed_1[4 * n + 2] >> 4 | this.cfr_renamed_1[4 * n + 3] << 6);
            int n3 = 5 * n + 4;
            byte by = (byte)(this.cfr_renamed_1[4 * n + 3] >> 2);
            byArray[n3] = by;
            n2 = ++n;
        }
        return byArray;
    }

    public void cfr_renamed_7110(byte[] arg0, int arg1) {
        block3: {
            int n;
            int n2;
            block2: {
                int n3;
                sprcjg sprcjg2 = this;
                n2 = sprcjg2.cfr_renamed_4.cfr_renamed_7103();
                if (sprcjg2.cfr_renamed_4.cfr_renamed_7103() != 2) break block2;
                int n4 = n3 = 0;
                while (n4 < this.cfr_renamed_2 / 8) {
                    int n5 = arg1 + 3 * n3;
                    sprcjg sprcjg3 = this;
                    sprcjg sprcjg4 = this;
                    sprcjg sprcjg5 = this;
                    sprcjg sprcjg6 = this;
                    sprcjg6.cfr_renamed_7069(8 * n3 + 0, (arg0[n5 + 0] & 0xFF) >> 0 & 7);
                    sprcjg6.cfr_renamed_7069(8 * n3 + 1, (arg0[n5 + 0] & 0xFF) >> 3 & 7);
                    sprcjg5.cfr_renamed_7069(8 * n3 + 2, (arg0[n5 + 0] & 0xFF) >> 6 | (arg0[n5 + 1] & 0xFF) << 2 & 7);
                    sprcjg5.cfr_renamed_7069(8 * n3 + 3, (arg0[n5 + 1] & 0xFF) >> 1 & 7);
                    sprcjg4.cfr_renamed_7069(8 * n3 + 4, (arg0[n5 + 1] & 0xFF) >> 4 & 7);
                    sprcjg4.cfr_renamed_7069(8 * n3 + 5, (arg0[n5 + 1] & 0xFF) >> 7 | (arg0[n5 + 2] & 0xFF) << 1 & 7);
                    sprcjg3.cfr_renamed_7069(8 * n3 + 6, (arg0[n5 + 2] & 0xFF) >> 2 & 7);
                    sprcjg3.cfr_renamed_7069(8 * n3 + 7, (arg0[n5 + 2] & 0xFF) >> 5 & 7);
                    sprcjg sprcjg7 = this;
                    sprcjg7.cfr_renamed_7069(8 * n3 + 0, n2 - sprcjg7.cfr_renamed_6983(8 * n3 + 0));
                    sprcjg sprcjg8 = this;
                    sprcjg8.cfr_renamed_7069(8 * n3 + 1, n2 - sprcjg8.cfr_renamed_6983(8 * n3 + 1));
                    sprcjg sprcjg9 = this;
                    sprcjg9.cfr_renamed_7069(8 * n3 + 2, n2 - sprcjg9.cfr_renamed_6983(8 * n3 + 2));
                    sprcjg sprcjg10 = this;
                    sprcjg10.cfr_renamed_7069(8 * n3 + 3, n2 - sprcjg10.cfr_renamed_6983(8 * n3 + 3));
                    sprcjg sprcjg11 = this;
                    sprcjg11.cfr_renamed_7069(8 * n3 + 4, n2 - sprcjg11.cfr_renamed_6983(8 * n3 + 4));
                    sprcjg sprcjg12 = this;
                    sprcjg12.cfr_renamed_7069(8 * n3 + 5, n2 - sprcjg12.cfr_renamed_6983(8 * n3 + 5));
                    sprcjg sprcjg13 = this;
                    sprcjg13.cfr_renamed_7069(8 * n3 + 6, n2 - sprcjg13.cfr_renamed_6983(8 * n3 + 6));
                    sprcjg sprcjg14 = this;
                    sprcjg14.cfr_renamed_7069(8 * ++n3 + 7, n2 - sprcjg14.cfr_renamed_6983(8 * n3 + 7));
                    n4 = n3;
                }
                break block3;
            }
            if (this.cfr_renamed_4.cfr_renamed_7103() != 4) break block3;
            int n6 = n = 0;
            while (n6 < this.cfr_renamed_2 / 2) {
                sprcjg sprcjg15 = this;
                sprcjg15.cfr_renamed_7069(2 * n + 0, arg0[arg1 + n] & 0xF);
                sprcjg15.cfr_renamed_7069(2 * n + 1, (arg0[arg1 + n] & 0xFF) >> 4);
                sprcjg sprcjg16 = this;
                sprcjg16.cfr_renamed_7069(2 * n + 0, n2 - sprcjg16.cfr_renamed_6983(2 * n + 0));
                sprcjg sprcjg17 = this;
                sprcjg17.cfr_renamed_7069(2 * ++n + 1, n2 - sprcjg17.cfr_renamed_6983(2 * n + 1));
                n6 = n;
            }
        }
    }

    private static /* synthetic */ int cfr_renamed_7095(sprcjg arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n = 0;
        int n2 = 0;
        block0: while (true) {
            int n3 = n2;
            while (n3 < arg2 && n + 3 <= arg4) {
                int n4 = arg3[n] & 0xFF;
                int n5 = n4;
                int n6 = arg3[++n] & 0xFF;
                n5 = n4 | n6 << 8;
                int n7 = arg3[++n] & 0xFF;
                ++n;
                n5 |= n7 << 16;
                if ((n5 &= 0x7FFFFF) >= 8380417) continue block0;
                arg0.cfr_renamed_7069(arg1 + n2++, n5);
                n3 = n2;
            }
            break;
        }
        return n2;
    }

    private /* synthetic */ void cfr_renamed_7097(byte[] arg0) {
        if (this.cfr_renamed_4.cfr_renamed_7094() == 131072) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_2 / 4) {
                sprcjg sprcjg2 = this;
                sprcjg sprcjg3 = this;
                sprcjg3.cfr_renamed_7069(4 * n + 0, (arg0[9 * n + 0] & 0xFF | (arg0[9 * n + 1] & 0xFF) << 8 | (arg0[9 * n + 2] & 0xFF) << 16) & 0x3FFFF);
                sprcjg3.cfr_renamed_7069(4 * n + 1, ((arg0[9 * n + 2] & 0xFF) >> 2 | (arg0[9 * n + 3] & 0xFF) << 6 | (arg0[9 * n + 4] & 0xFF) << 14) & 0x3FFFF);
                sprcjg2.cfr_renamed_7069(4 * n + 2, ((arg0[9 * n + 4] & 0xFF) >> 4 | (arg0[9 * n + 5] & 0xFF) << 4 | (arg0[9 * n + 6] & 0xFF) << 12) & 0x3FFFF);
                sprcjg2.cfr_renamed_7069(4 * n + 3, ((arg0[9 * n + 6] & 0xFF) >> 6 | (arg0[9 * n + 7] & 0xFF) << 2 | (arg0[9 * n + 8] & 0xFF) << 10) & 0x3FFFF);
                sprcjg sprcjg4 = this;
                sprcjg4.cfr_renamed_7069(4 * n + 0, this.cfr_renamed_4.cfr_renamed_7094() - sprcjg4.cfr_renamed_6983(4 * n + 0));
                sprcjg sprcjg5 = this;
                sprcjg5.cfr_renamed_7069(4 * n + 1, this.cfr_renamed_4.cfr_renamed_7094() - sprcjg5.cfr_renamed_6983(4 * n + 1));
                sprcjg sprcjg6 = this;
                sprcjg6.cfr_renamed_7069(4 * n + 2, this.cfr_renamed_4.cfr_renamed_7094() - sprcjg6.cfr_renamed_6983(4 * n + 2));
                sprcjg sprcjg7 = this;
                sprcjg7.cfr_renamed_7069(4 * ++n + 3, this.cfr_renamed_4.cfr_renamed_7094() - sprcjg7.cfr_renamed_6983(4 * n + 3));
                n2 = n;
            }
        } else if (this.cfr_renamed_4.cfr_renamed_7094() == 524288) {
            int n;
            int n3 = n = 0;
            while (n3 < this.cfr_renamed_2 / 2) {
                sprcjg sprcjg8 = this;
                sprcjg8.cfr_renamed_7069(2 * n + 0, (arg0[5 * n + 0] & 0xFF | (arg0[5 * n + 1] & 0xFF) << 8 | (arg0[5 * n + 2] & 0xFF) << 16) & 0xFFFFF);
                sprcjg8.cfr_renamed_7069(2 * n + 1, ((arg0[5 * n + 2] & 0xFF) >> 4 | (arg0[5 * n + 3] & 0xFF) << 4 | (arg0[5 * n + 4] & 0xFF) << 12) & 0xFFFFF);
                sprcjg sprcjg9 = this;
                sprcjg9.cfr_renamed_7069(2 * n + 0, this.cfr_renamed_4.cfr_renamed_7094() - sprcjg9.cfr_renamed_6983(2 * n + 0));
                sprcjg sprcjg10 = this;
                sprcjg10.cfr_renamed_7069(2 * ++n + 1, this.cfr_renamed_4.cfr_renamed_7094() - sprcjg10.cfr_renamed_6983(2 * n + 1));
                n3 = n;
            }
        } else {
            throw new RuntimeException(sprkep.cfr_renamed_9("\u0004\u007f<c4-\u0017d?d'e:x>csJ2`>lb,"));
        }
    }

    public void cfr_renamed_7073(byte[] arg0, short arg1) {
        int n;
        int n2;
        int n3;
        sprcjg sprcjg2 = this;
        int n4 = sprcjg2.cfr_renamed_4.cfr_renamed_7103();
        if (sprcjg2.cfr_renamed_4.cfr_renamed_7103() == 2) {
            n2 = n3 = (136 + this.cfr_renamed_0.cfr_renamed_4 - 1) / this.cfr_renamed_0.cfr_renamed_4;
        } else if (this.cfr_renamed_4.cfr_renamed_7103() == 4) {
            n2 = n3 = (227 + this.cfr_renamed_0.cfr_renamed_4 - 1) / this.cfr_renamed_0.cfr_renamed_4;
        } else {
            throw new RuntimeException(sprmrg.cfr_renamed_9("X:`&hhK!c!{ f=bhJ<ni"));
        }
        int n5 = n2 * this.cfr_renamed_0.cfr_renamed_4;
        byte[] byArray = new byte[n5];
        sprcjg sprcjg3 = this;
        sprcjg3.cfr_renamed_0.cfr_renamed_7044(arg0, arg1);
        sprcjg3.cfr_renamed_0.cfr_renamed_7045(byArray, 0, n5);
        int n6 = n = sprcjg.cfr_renamed_7106(sprcjg3, 0, this.cfr_renamed_2, byArray, n5, n4);
        while (n6 < 256) {
            this.cfr_renamed_0.cfr_renamed_7045(byArray, 0, this.cfr_renamed_0.cfr_renamed_4);
            int n7 = n;
            n6 = n7 + sprcjg.cfr_renamed_7106(this, n7, this.cfr_renamed_2 - n, byArray, this.cfr_renamed_0.cfr_renamed_4, n4);
        }
    }

    public void cfr_renamed_7084(sprcjg arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            sprcjg sprcjg2 = this;
            sprcjg2.cfr_renamed_7069(n, sprcjg2.cfr_renamed_6983(n) - arg0.cfr_renamed_6983(n++));
            n2 = n;
        }
    }

    public byte[] cfr_renamed_7090() {
        byte[] byArray;
        block3: {
            int n;
            block2: {
                int n2;
                sprcjg sprcjg2 = this;
                byArray = new byte[sprcjg2.cfr_renamed_4.cfr_renamed_7089()];
                if (sprcjg2.cfr_renamed_4.cfr_renamed_7048() != 95232) break block2;
                int n3 = n2 = 0;
                while (n3 < this.cfr_renamed_2 / 4) {
                    byArray[3 * n2 + 0] = (byte)((byte)this.cfr_renamed_6983(4 * n2 + 0) | this.cfr_renamed_6983(4 * n2 + 1) << 6);
                    byArray[3 * n2 + 1] = (byte)((byte)(this.cfr_renamed_6983(4 * n2 + 1) >> 2) | this.cfr_renamed_6983(4 * n2 + 2) << 4);
                    int n4 = 3 * n2 + 2;
                    byte by = (byte)((byte)(this.cfr_renamed_6983(4 * n2 + 2) >> 4) | this.cfr_renamed_6983(4 * n2 + 3) << 2);
                    byArray[n4] = by;
                    n3 = ++n2;
                }
                break block3;
            }
            if (this.cfr_renamed_4.cfr_renamed_7048() != 261888) break block3;
            int n5 = n = 0;
            while (n5 < this.cfr_renamed_2 / 2) {
                int n6 = n;
                byte by = (byte)(this.cfr_renamed_6983(2 * n6 + 0) | this.cfr_renamed_6983(2 * n + 1) << 4);
                byArray[n6] = by;
                n5 = ++n;
            }
        }
        return byArray;
    }

    public void cfr_renamed_7111(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2 / 4) {
            sprcjg sprcjg2 = this;
            sprcjg sprcjg3 = this;
            sprcjg3.cfr_renamed_7069(4 * n + 0, ((arg0[5 * n + 0] & 0xFF) >> 0 | (arg0[5 * n + 1] & 0xFF) << 8) & 0x3FF);
            sprcjg3.cfr_renamed_7069(4 * n + 1, ((arg0[5 * n + 1] & 0xFF) >> 2 | (arg0[5 * n + 2] & 0xFF) << 6) & 0x3FF);
            sprcjg2.cfr_renamed_7069(4 * n + 2, ((arg0[5 * n + 2] & 0xFF) >> 4 | (arg0[5 * n + 3] & 0xFF) << 4) & 0x3FF);
            int n3 = 4 * n + 3;
            int n4 = (arg0[5 * n + 3] & 0xFF) >> 6 | (arg0[5 * n + 4] & 0xFF) << 2;
            sprcjg2.cfr_renamed_7069(n3, n4 & 0x3FF);
            n2 = ++n;
        }
    }
}

