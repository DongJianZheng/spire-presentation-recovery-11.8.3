/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtff;

public abstract class sprxye {
    public short[] cfr_renamed_3;
    public sprtff cfr_renamed_4;

    public void cfr_renamed_5395(sprxye arg0) {
        int n;
        int n2 = this.cfr_renamed_3.length;
        int n3 = n = 0;
        while (n3 < n2) {
            sprxye sprxye2 = this;
            int n4 = n;
            sprxye2.cfr_renamed_3[n4] = (short)sprxye.cfr_renamed_5396(arg0.cfr_renamed_3[n4] & 0xFFFF, this.cfr_renamed_4.cfr_renamed_5397());
            sprxye sprxye3 = this;
            short s = (short)(sprxye2.cfr_renamed_3[n] >>> sprxye3.cfr_renamed_4.cfr_renamed_5398() - 1);
            int n5 = n++;
            sprxye3.cfr_renamed_3[n5] = (short)(sprxye3.cfr_renamed_3[n5] + (s << 1 - (this.cfr_renamed_4.cfr_renamed_5398() & 1)));
            n3 = n;
        }
        this.cfr_renamed_5399();
    }

    public void cfr_renamed_5400(sprxye arg0, sprxye arg1) {
        sprxye sprxye2 = this;
        sprxye2.cfr_renamed_5401(arg0, arg1);
        sprxye2.cfr_renamed_5399();
    }

    public void cfr_renamed_5402() {
        int n;
        int n2 = this.cfr_renamed_4.cfr_renamed_5403();
        int n3 = n = 0;
        while (n3 < n2) {
            sprxye sprxye2 = this;
            int n4 = n++;
            sprxye2.cfr_renamed_3[n4] = (short)(sprxye2.cfr_renamed_3[n4] - this.cfr_renamed_3[n2 - 1]);
            n3 = n;
        }
    }

    public void cfr_renamed_5404(byte[] arg0) {
        byte by;
        int n;
        int n2 = this.cfr_renamed_3.length;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4.cfr_renamed_5405() / 5) {
            by = arg0[n];
            sprxye sprxye2 = this;
            this.cfr_renamed_3[5 * n + 0] = by;
            sprxye2.cfr_renamed_3[5 * n + 1] = (short)((by & 0xFF) * 171 >>> 9);
            sprxye2.cfr_renamed_3[5 * n + 2] = (short)((by & 0xFF) * 57 >>> 9);
            sprxye2.cfr_renamed_3[5 * n + 3] = (short)((by & 0xFF) * 19 >>> 9);
            int n4 = 5 * n + 4;
            sprxye2.cfr_renamed_3[n4] = (short)((by & 0xFF) * 203 >>> 14);
            n3 = ++n;
        }
        if (this.cfr_renamed_4.cfr_renamed_5405() > this.cfr_renamed_4.cfr_renamed_5405() / 5 * 5) {
            n = this.cfr_renamed_4.cfr_renamed_5405() / 5;
            by = arg0[n];
            int n5 = 0;
            while (5 * n + n5 < this.cfr_renamed_4.cfr_renamed_5405()) {
                byte by2 = by;
                this.cfr_renamed_3[5 * n + n5] = by2;
                ++n5;
                by = (byte)((by2 & 0xFF) * 171 >> 9);
            }
        }
        sprxye sprxye3 = this;
        sprxye3.cfr_renamed_3[n2 - 1] = 0;
        sprxye3.cfr_renamed_5399();
    }

    public void cfr_renamed_5399() {
        int n;
        int n2 = this.cfr_renamed_4.cfr_renamed_5403();
        int n3 = n = 0;
        while (n3 < n2) {
            sprxye sprxye2 = this;
            int n4 = n++;
            sprxye2.cfr_renamed_3[n4] = sprxye.cfr_renamed_5406((short)(sprxye2.cfr_renamed_3[n4] + 2 * this.cfr_renamed_3[n2 - 1]));
            n3 = n;
        }
    }

    public void cfr_renamed_5407(sprxye arg0, sprxye arg1, sprxye arg2, sprxye arg3, sprxye arg4) {
        int n;
        int n2;
        int n3 = this.cfr_renamed_3.length;
        arg4.cfr_renamed_3[0] = 1;
        int n4 = n2 = 0;
        while (n4 < n3) {
            arg1.cfr_renamed_3[n2++] = 1;
            n4 = n2;
        }
        int n5 = n2 = 0;
        while (n5 < n3 - 1) {
            int n6 = n3 - 2 - n2;
            short s = (short)((arg0.cfr_renamed_3[n2] ^ arg0.cfr_renamed_3[n3 - 1]) & 1);
            arg2.cfr_renamed_3[n6] = s;
            n5 = ++n2;
        }
        arg2.cfr_renamed_3[n3 - 1] = 0;
        int n7 = 1;
        int n8 = n = 0;
        while (n8 < 2 * (n3 - 1) - 1) {
            int n9 = n2 = n3 - 1;
            while (n9 > 0) {
                sprxye sprxye2 = arg3;
                int n10 = n2--;
                sprxye2.cfr_renamed_3[n10] = sprxye2.cfr_renamed_3[n10 - 1];
                n9 = n2;
            }
            arg3.cfr_renamed_3[0] = 0;
            short s = (short)(arg2.cfr_renamed_3[0] & arg1.cfr_renamed_3[0]);
            short s2 = sprxye.cfr_renamed_5408((short)(-n7), -arg2.cfr_renamed_3[0]);
            int n11 = n7;
            short s3 = (short)(n11 ^ s2 & (n11 ^ -n11));
            n7 = s3;
            n7 = (short)(s3 + 1);
            int n12 = n2 = 0;
            while (n12 < n3) {
                short s4 = (short)(s2 & (arg1.cfr_renamed_3[n2] ^ arg2.cfr_renamed_3[n2]));
                int n13 = n2;
                arg1.cfr_renamed_3[n13] = (short)(arg1.cfr_renamed_3[n13] ^ s4);
                int n14 = n2;
                arg2.cfr_renamed_3[n14] = (short)(arg2.cfr_renamed_3[n14] ^ s4);
                sprxye sprxye3 = arg3;
                s4 = (short)(s2 & (sprxye3.cfr_renamed_3[n2] ^ arg4.cfr_renamed_3[n2]));
                int n15 = n2;
                sprxye3.cfr_renamed_3[n15] = (short)(sprxye3.cfr_renamed_3[n15] ^ s4);
                int n16 = n2++;
                arg4.cfr_renamed_3[n16] = (short)(arg4.cfr_renamed_3[n16] ^ s4);
                n12 = n2;
            }
            int n17 = n2 = 0;
            while (n17 < n3) {
                sprxye sprxye4 = arg2;
                int n18 = n2;
                short s5 = (short)(sprxye4.cfr_renamed_3[n18] ^ s & arg1.cfr_renamed_3[n2]);
                sprxye4.cfr_renamed_3[n18] = s5;
                n17 = ++n2;
            }
            int n19 = n2 = 0;
            while (n19 < n3) {
                sprxye sprxye5 = arg4;
                int n20 = n2;
                short s6 = (short)(sprxye5.cfr_renamed_3[n20] ^ s & arg3.cfr_renamed_3[n2]);
                sprxye5.cfr_renamed_3[n20] = s6;
                n19 = ++n2;
            }
            int n21 = n2 = 0;
            while (n21 < n3 - 1) {
                sprxye sprxye6 = arg2;
                int n22 = n2++;
                sprxye6.cfr_renamed_3[n22] = sprxye6.cfr_renamed_3[n22 + 1];
                n21 = n2;
            }
            arg2.cfr_renamed_3[n3 - 1] = 0;
            n8 = ++n;
        }
        int n23 = n2 = 0;
        while (n23 < n3 - 1) {
            int n24 = n2++;
            this.cfr_renamed_3[n24] = arg3.cfr_renamed_3[n3 - 2 - n24];
            n23 = n2;
        }
        this.cfr_renamed_3[n3 - 1] = 0;
    }

    public abstract void cfr_renamed_5409(sprxye var1);

    public abstract byte[] cfr_renamed_5410(int var1);

    public void cfr_renamed_5411() {
        int n;
        int n2 = this.cfr_renamed_3.length;
        int n3 = n = 0;
        while (n3 < n2) {
            sprxye sprxye2 = this;
            int n4 = n;
            short s = (short)(sprxye2.cfr_renamed_3[n] | -(this.cfr_renamed_3[n4] >>> 1) & this.cfr_renamed_4.cfr_renamed_5397() - 1);
            sprxye2.cfr_renamed_3[n4] = s;
            n3 = ++n;
        }
    }

    public void cfr_renamed_5412(sprxye arg0, sprxye arg1) {
        sprxye sprxye2 = this;
        sprxye2.cfr_renamed_5401(arg0, arg1);
        sprxye2.cfr_renamed_5402();
    }

    public abstract void cfr_renamed_5413(byte[] var1);

    /*
     * WARNING - void declaration
     */
    public sprxye(sprtff sprtff2) {
        void arg0;
        sprxye sprxye2 = this;
        sprxye2.cfr_renamed_3 = new short[arg0.cfr_renamed_5403()];
        sprxye2.cfr_renamed_4 = sprtff2;
    }

    public void cfr_renamed_5401(sprxye arg0, sprxye arg1) {
        int n;
        int n2 = this.cfr_renamed_3.length;
        int n3 = n = 0;
        while (n3 < n2) {
            int n4;
            this.cfr_renamed_3[n] = 0;
            int n5 = n4 = 1;
            while (n5 < n2 - n) {
                int n6 = n;
                short s = (short)(this.cfr_renamed_3[n6] + arg0.cfr_renamed_3[n + n4] * arg1.cfr_renamed_3[n2 - n4]);
                this.cfr_renamed_3[n6] = s;
                n5 = ++n4;
            }
            int n7 = n4 = 0;
            while (n7 < n + 1) {
                int n8 = n;
                short s = (short)(this.cfr_renamed_3[n8] + arg0.cfr_renamed_3[n - n4] * arg1.cfr_renamed_3[n4]);
                this.cfr_renamed_3[n8] = s;
                n7 = ++n4;
            }
            n3 = ++n;
        }
    }

    public void cfr_renamed_5414() {
        int n;
        int n2 = this.cfr_renamed_3.length;
        int n3 = n = 0;
        while (n3 < n2) {
            sprxye sprxye2 = this;
            this.cfr_renamed_3[n] = (short)sprxye.cfr_renamed_5396(sprxye2.cfr_renamed_3[n] & 0xFFFF, this.cfr_renamed_4.cfr_renamed_5397());
            int n4 = n;
            short s = (short)(3 & (this.cfr_renamed_3[n4] ^ this.cfr_renamed_3[n] >>> this.cfr_renamed_4.cfr_renamed_5398() - 1));
            sprxye2.cfr_renamed_3[n4] = s;
            n3 = ++n;
        }
    }

    public byte[] cfr_renamed_5415(int arg0) {
        return this.cfr_renamed_5410(arg0);
    }

    public static short cfr_renamed_5408(short arg0, short arg1) {
        return (short)((arg0 & arg1) >>> 15);
    }

    public static byte cfr_renamed_5416(byte arg0) {
        return (byte)((arg0 & 0xFF) % 3);
    }

    private /* synthetic */ void cfr_renamed_5417(sprxye arg0, sprxye arg1, sprxye arg2, sprxye arg3, sprxye arg4) {
        int n;
        int n2 = this.cfr_renamed_3.length;
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = n++;
            arg2.cfr_renamed_3[n4] = -arg1.cfr_renamed_3[n4];
            n3 = n;
        }
        int n5 = n = 0;
        while (n5 < n2) {
            int n6 = n++;
            this.cfr_renamed_3[n6] = arg0.cfr_renamed_3[n6];
            n5 = n;
        }
        sprxye sprxye2 = arg3;
        sprxye sprxye3 = arg3;
        sprxye sprxye4 = arg3;
        arg3.cfr_renamed_5401(this, arg2);
        sprxye4.cfr_renamed_3[0] = (short)(sprxye4.cfr_renamed_3[0] + 2);
        arg4.cfr_renamed_5401(arg3, this);
        sprxye4.cfr_renamed_5401(arg4, arg2);
        sprxye3.cfr_renamed_3[0] = (short)(sprxye3.cfr_renamed_3[0] + 2);
        this.cfr_renamed_5401(arg3, arg4);
        sprxye3.cfr_renamed_5401(this, arg2);
        sprxye2.cfr_renamed_3[0] = (short)(sprxye2.cfr_renamed_3[0] + 2);
        arg4.cfr_renamed_5401(arg3, this);
        sprxye2.cfr_renamed_5401(arg4, arg2);
        arg3.cfr_renamed_3[0] = (short)(arg3.cfr_renamed_3[0] + 2);
        this.cfr_renamed_5401(arg3, arg4);
    }

    public byte[] cfr_renamed_5418(int arg0) {
        byte by;
        int n;
        byte[] byArray = new byte[arg0];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.cfr_renamed_5405() / 5) {
            by = (byte)(this.cfr_renamed_3[5 * n + 4] & 0xFF);
            by = (byte)(3 * by + this.cfr_renamed_3[5 * n + 3] & 0xFF);
            by = (byte)(3 * by + this.cfr_renamed_3[5 * n + 2] & 0xFF);
            by = (byte)(3 * by + this.cfr_renamed_3[5 * n + 1] & 0xFF);
            by = (byte)(3 * by + this.cfr_renamed_3[5 * n + 0] & 0xFF);
            byArray[n++] = by;
            n2 = n;
        }
        if (this.cfr_renamed_4.cfr_renamed_5405() > this.cfr_renamed_4.cfr_renamed_5405() / 5 * 5) {
            int n3;
            sprxye sprxye2 = this;
            n = sprxye2.cfr_renamed_4.cfr_renamed_5405() / 5;
            by = 0;
            int n4 = n3 = sprxye2.cfr_renamed_4.cfr_renamed_5405() - 5 * n - 1;
            while (n4 >= 0) {
                int n5 = 3 * by + this.cfr_renamed_3[5 * n + n3];
                by = (byte)(n5 & 0xFF);
                n4 = --n3;
            }
            byArray[n] = by;
        }
        return byArray;
    }

    public abstract void cfr_renamed_5419(sprxye var1);

    public abstract void cfr_renamed_5420(sprxye var1);

    public abstract void cfr_renamed_5421(sprxye var1);

    public static int cfr_renamed_5396(int arg0, int arg1) {
        return arg0 % arg1;
    }

    public void cfr_renamed_5422(byte[] arg0) {
        int n;
        int n2 = this.cfr_renamed_3.length;
        sprxye sprxye2 = this;
        sprxye2.cfr_renamed_5413(arg0);
        sprxye2.cfr_renamed_3[n2 - 1] = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4.cfr_renamed_5405()) {
            int n4 = n2 - 1;
            short s = (short)(this.cfr_renamed_3[n4] - this.cfr_renamed_3[n]);
            this.cfr_renamed_3[n4] = s;
            n3 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_5423(sprxye sprxye2, sprxye sprxye3, sprxye sprxye4, sprxye sprxye5, sprxye sprxye6) {
        void arg4;
        void arg3;
        void arg2;
        void arg0;
        void arg1;
        void v0 = arg1;
        v0.cfr_renamed_5420((sprxye)arg0);
        this.cfr_renamed_5417((sprxye)v0, (sprxye)arg0, (sprxye)arg2, (sprxye)arg3, (sprxye)arg4);
    }

    public static short cfr_renamed_5406(short arg0) {
        return (short)((arg0 & 0xFFFF) % 3);
    }

    public void cfr_renamed_5424(sprxye arg0, sprxye arg1, sprxye arg2, sprxye arg3, sprxye arg4) {
        short s;
        int n;
        int n2;
        int n3 = this.cfr_renamed_3.length;
        arg4.cfr_renamed_3[0] = 1;
        int n4 = n2 = 0;
        while (n4 < n3) {
            arg1.cfr_renamed_3[n2++] = 1;
            n4 = n2;
        }
        int n5 = n2 = 0;
        while (n5 < n3 - 1) {
            int n6 = n3 - 2 - n2;
            short s2 = sprxye.cfr_renamed_5406((short)((arg0.cfr_renamed_3[n2] & 3) + 2 * (arg0.cfr_renamed_3[n3 - 1] & 3)));
            arg2.cfr_renamed_3[n6] = s2;
            n5 = ++n2;
        }
        arg2.cfr_renamed_3[n3 - 1] = 0;
        int n7 = 1;
        int n8 = n = 0;
        while (n8 < 2 * (n3 - 1) - 1) {
            int n9 = n2 = n3 - 1;
            while (n9 > 0) {
                sprxye sprxye2 = arg3;
                int n10 = n2--;
                sprxye2.cfr_renamed_3[n10] = sprxye2.cfr_renamed_3[n10 - 1];
                n9 = n2;
            }
            arg3.cfr_renamed_3[0] = 0;
            s = sprxye.cfr_renamed_5416((byte)(2 * arg2.cfr_renamed_3[0] * arg1.cfr_renamed_3[0]));
            short s3 = sprxye.cfr_renamed_5408((short)(-n7), -arg2.cfr_renamed_3[0]);
            int n11 = n7;
            short s4 = (short)(n11 ^ s3 & (n11 ^ -n11));
            n7 = s4;
            n7 = (short)(s4 + 1);
            int n12 = n2 = 0;
            while (n12 < n3) {
                short s5 = (short)(s3 & (arg1.cfr_renamed_3[n2] ^ arg2.cfr_renamed_3[n2]));
                int n13 = n2;
                arg1.cfr_renamed_3[n13] = (short)(arg1.cfr_renamed_3[n13] ^ s5);
                int n14 = n2;
                arg2.cfr_renamed_3[n14] = (short)(arg2.cfr_renamed_3[n14] ^ s5);
                sprxye sprxye3 = arg3;
                s5 = (short)(s3 & (sprxye3.cfr_renamed_3[n2] ^ arg4.cfr_renamed_3[n2]));
                int n15 = n2;
                sprxye3.cfr_renamed_3[n15] = (short)(sprxye3.cfr_renamed_3[n15] ^ s5);
                int n16 = n2++;
                arg4.cfr_renamed_3[n16] = (short)(arg4.cfr_renamed_3[n16] ^ s5);
                n12 = n2;
            }
            int n17 = n2 = 0;
            while (n17 < n3) {
                sprxye sprxye4 = arg2;
                int n18 = n2;
                short s6 = sprxye.cfr_renamed_5416((byte)(sprxye4.cfr_renamed_3[n18] + s * arg1.cfr_renamed_3[n2]));
                sprxye4.cfr_renamed_3[n18] = s6;
                n17 = ++n2;
            }
            int n19 = n2 = 0;
            while (n19 < n3) {
                sprxye sprxye5 = arg4;
                int n20 = n2;
                short s7 = sprxye.cfr_renamed_5416((byte)(sprxye5.cfr_renamed_3[n20] + s * arg3.cfr_renamed_3[n2]));
                sprxye5.cfr_renamed_3[n20] = s7;
                n19 = ++n2;
            }
            int n21 = n2 = 0;
            while (n21 < n3 - 1) {
                sprxye sprxye6 = arg2;
                int n22 = n2++;
                sprxye6.cfr_renamed_3[n22] = sprxye6.cfr_renamed_3[n22 + 1];
                n21 = n2;
            }
            arg2.cfr_renamed_3[n3 - 1] = 0;
            n8 = ++n;
        }
        s = arg1.cfr_renamed_3[0];
        int n23 = n2 = 0;
        while (n23 < n3 - 1) {
            int n24 = n2;
            short s8 = sprxye.cfr_renamed_5416((byte)(s * arg3.cfr_renamed_3[n3 - 2 - n2]));
            this.cfr_renamed_3[n24] = s8;
            n23 = ++n2;
        }
        this.cfr_renamed_3[n3 - 1] = 0;
    }
}

