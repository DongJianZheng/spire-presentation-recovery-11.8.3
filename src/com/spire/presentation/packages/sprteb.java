/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxo;
import com.spire.presentation.packages.sprddb;
import com.spire.presentation.packages.spruuc;

public class sprteb {
    public short[] cfr_renamed_3;
    private short[][] cfr_renamed_4;

    public short[][] cfr_renamed_1277(short arg0, short[][] arg1) {
        int n;
        short[][] sArray = new short[arg1.length][arg1[0].length];
        int n2 = n = 0;
        while (n2 < arg1.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg1[0].length) {
                int n5 = n3++;
                sArray[n][n5] = sprddb.cfr_renamed_1275(arg0, arg1[n][n5]);
                n4 = n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    public short[] cfr_renamed_1278(short[][] arg0, short[] arg1) throws RuntimeException {
        int n;
        if (arg0[0].length != arg1.length) {
            throw new RuntimeException(spraxo.cfr_renamed_9("\u0018j9k<o9v6~!v:quv&?;p!?%p&l<}9zt"));
        }
        short s = 0;
        short[] sArray = new short[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg1.length) {
                s = sprddb.cfr_renamed_1275(arg0[n][n3], arg1[n3]);
                sArray[n] = sprddb.cfr_renamed_1274(sArray[n], s);
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    private /* synthetic */ void cfr_renamed_1279(boolean arg0) throws RuntimeException {
        int n;
        short s = 0;
        int n2 = arg0 ? 2 * this.cfr_renamed_4.length : this.cfr_renamed_4.length + 1;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4.length - 1) {
            int n4 = n + 1;
            while (n4 < this.cfr_renamed_4.length) {
                int n5;
                sprteb sprteb2 = this;
                short s2 = sprteb2.cfr_renamed_4[n5][n];
                short s3 = sprddb.cfr_renamed_1273(sprteb2.cfr_renamed_4[n][n]);
                if (s3 == 0) {
                    throw new RuntimeException(spruuc.cfr_renamed_9("$\u0010\u001d\u0003\u0000\tI\u001f\u0006\u0005I\u0018\u0007\u0007\f\u0003\u001d\u0018\u000b\u001d\fPI&\fQ\u0001\u0010\u001f\u0014I\u0005\u0006Q\n\u0019\u0006\u001e\u001a\u0014I\u0010\u0007\u001e\u001d\u0019\f\u0003I\u001e\u0007\u0014H"));
                }
                int n6 = n;
                while (n6 < n2) {
                    int n7;
                    sprteb sprteb3 = this;
                    s = sprddb.cfr_renamed_1275(sprteb3.cfr_renamed_4[n][n7], s3);
                    s = sprddb.cfr_renamed_1275(s2, s);
                    int n8 = n7++;
                    sprteb3.cfr_renamed_4[n5][n8] = sprddb.cfr_renamed_1274(this.cfr_renamed_4[n5][n8], s);
                    n6 = n7;
                }
                n4 = ++n5;
            }
            n3 = ++n;
        }
    }

    public short[] cfr_renamed_1280(short arg0, short[] arg1) {
        int n;
        short[] sArray = new short[arg1.length];
        int n2 = n = 0;
        while (n2 < sArray.length) {
            int n3 = n++;
            sArray[n3] = sprddb.cfr_renamed_1275(arg0, arg1[n3]);
            n2 = n;
        }
        return sArray;
    }

    public short[] cfr_renamed_1281(short[][] arg0, short[] arg1) {
        try {
            int n;
            if (arg0.length != arg1.length) {
                throw new RuntimeException(spraxo.cfr_renamed_9("\u0001w0?0n ~!v:qul,l!z8?<luq:kul:s#~7s0"));
            }
            this.cfr_renamed_4 = new short[arg0.length][arg0.length + 1];
            this.cfr_renamed_3 = new short[arg0.length];
            int n2 = n = 0;
            while (n2 < arg0.length) {
                int n3;
                int n4 = n3 = 0;
                while (n4 < arg0[0].length) {
                    int n5 = n3++;
                    this.cfr_renamed_4[n][n5] = arg0[n][n5];
                    n4 = n3;
                }
                n2 = ++n;
            }
            int n6 = n = 0;
            while (n6 < arg1.length) {
                short[] sArray = this.cfr_renamed_4[n];
                short s = sprddb.cfr_renamed_1274(arg1[n], this.cfr_renamed_4[n][arg1.length]);
                sArray[arg1.length] = s;
                n6 = ++n;
            }
            sprteb sprteb2 = this;
            sprteb2.cfr_renamed_1279(false);
            sprteb2.cfr_renamed_1282();
            return sprteb2.cfr_renamed_3;
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
    }

    public short[][] cfr_renamed_1283(short[] arg0, short[] arg1) {
        int n;
        if (arg0.length != arg1.length) {
            throw new RuntimeException(spruuc.cfr_renamed_9("$\u0004\u0005\u0005\u0000\u0001\u0005\u0018\n\u0010\u001d\u0018\u0006\u001fI\u0018\u001aQ\u0007\u001e\u001dQ\u0019\u001e\u001a\u0002\u0000\u0013\u0005\u0014H"));
        }
        short[][] sArray = new short[arg0.length][arg1.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg1.length) {
                int n5 = n3++;
                sArray[n][n5] = sprddb.cfr_renamed_1275(arg0[n], arg1[n5]);
                n4 = n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    public short[][] cfr_renamed_1284(short[][] arg0, short[][] arg1) throws RuntimeException {
        int n;
        if (arg0[0].length != arg1.length) {
            throw new RuntimeException(spraxo.cfr_renamed_9("\u0018j9k<o9v6~!v:quv&?;p!?%p&l<}9zt"));
        }
        short s = 0;
        this.cfr_renamed_4 = new short[arg0.length][arg1[0].length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg1.length) {
                int n5;
                int n6 = n5 = 0;
                while (n6 < arg1[0].length) {
                    s = sprddb.cfr_renamed_1275(arg0[n][n3], arg1[n3][n5]);
                    int n7 = n5++;
                    this.cfr_renamed_4[n][n7] = sprddb.cfr_renamed_1274(this.cfr_renamed_4[n][n7], s);
                    n6 = n5;
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return this.cfr_renamed_4;
    }

    private /* synthetic */ void cfr_renamed_1285() throws RuntimeException {
        int n;
        short s = 0;
        int n2 = n = this.cfr_renamed_4.length - 1;
        while (n2 > 0) {
            int n3 = n - 1;
            while (n3 >= 0) {
                int n4;
                sprteb sprteb2 = this;
                short s2 = sprteb2.cfr_renamed_4[n4][n];
                short s3 = sprddb.cfr_renamed_1273(sprteb2.cfr_renamed_4[n][n]);
                if (s3 == 0) {
                    throw new RuntimeException(spruuc.cfr_renamed_9("%\u0001\u0014I\u001c\b\u0005\u001b\u0018\u0011Q\u0000\u0002I\u001f\u0006\u0005I\u0018\u0007\u0007\f\u0003\u001d\u0018\u000b\u001d\f"));
                }
                int n5 = n;
                while (n5 < 2 * this.cfr_renamed_4.length) {
                    int n6;
                    sprteb sprteb3 = this;
                    s = sprddb.cfr_renamed_1275(sprteb3.cfr_renamed_4[n][n6], s3);
                    s = sprddb.cfr_renamed_1275(s2, s);
                    int n7 = n6++;
                    sprteb3.cfr_renamed_4[n4][n7] = sprddb.cfr_renamed_1274(this.cfr_renamed_4[n4][n7], s);
                    n5 = n6;
                }
                n3 = --n4;
            }
            n2 = --n;
        }
    }

    public short[] cfr_renamed_1286(short[] arg0, short[] arg1) {
        int n;
        if (arg0.length != arg1.length) {
            throw new RuntimeException(spraxo.cfr_renamed_9("\u0018j9k<o9v6~!v:quv&?;p!?%p&l<}9zt"));
        }
        short[] sArray = new short[arg0.length];
        int n2 = n = 0;
        while (n2 < sArray.length) {
            int n3 = n;
            short s = sprddb.cfr_renamed_1274(arg0[n], arg1[n3]);
            sArray[n3] = s;
            n2 = ++n;
        }
        return sArray;
    }

    public short[][] cfr_renamed_1287(short[][] arg0, short[][] arg1) {
        int n;
        if (arg0.length != arg1.length || arg0[0].length != arg1[0].length) {
            throw new RuntimeException(spruuc.cfr_renamed_9("(\u0015\r\u0018\u001d\u0018\u0006\u001fI\u0018\u001aQ\u0007\u001e\u001dQ\u0019\u001e\u001a\u0002\u0000\u0013\u0005\u0014H"));
        }
        short[][] sArray = new short[arg0.length][arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg1.length) {
                int n5 = n3;
                short s = sprddb.cfr_renamed_1274(arg0[n][n3], arg1[n][n5]);
                sArray[n][n5] = s;
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    public short[][] cfr_renamed_1288(short[][] arg0) {
        try {
            int n;
            int n2;
            this.cfr_renamed_4 = new short[arg0.length][2 * arg0.length];
            if (arg0.length != arg0[0].length) {
                throw new RuntimeException(spraxo.cfr_renamed_9("K=zur4k'v-?<luq:kuv;i0m!v7s01uO9z4l0?6w:p&zu~;p!w0mup;zt"));
            }
            int n3 = n2 = 0;
            while (n3 < arg0.length) {
                int n4 = n = 0;
                while (n4 < arg0.length) {
                    int n5 = n++;
                    this.cfr_renamed_4[n2][n5] = arg0[n2][n5];
                    n4 = n;
                }
                int n6 = n = arg0.length;
                while (n6 < 2 * arg0.length) {
                    this.cfr_renamed_4[n2][n++] = 0;
                    n6 = n;
                }
                short[] sArray = this.cfr_renamed_4[n2];
                int n7 = n2 + this.cfr_renamed_4.length;
                sArray[n7] = 1;
                n3 = ++n2;
            }
            this.cfr_renamed_1279(true);
            int n8 = n2 = 0;
            while (n8 < this.cfr_renamed_4.length) {
                short s = sprddb.cfr_renamed_1273(this.cfr_renamed_4[n2][n2]);
                int n9 = n2;
                while (n9 < 2 * this.cfr_renamed_4.length) {
                    int n10 = n++;
                    this.cfr_renamed_4[n2][n10] = sprddb.cfr_renamed_1275(this.cfr_renamed_4[n2][n10], s);
                    n9 = n;
                }
                n8 = ++n2;
            }
            sprteb sprteb2 = this;
            sprteb2.cfr_renamed_1285();
            short[][] sArray = new short[sprteb2.cfr_renamed_4.length][this.cfr_renamed_4.length];
            int n11 = n2 = 0;
            while (n11 < this.cfr_renamed_4.length) {
                int n12 = this.cfr_renamed_4.length;
                while (n12 < 2 * this.cfr_renamed_4.length) {
                    int n13 = n - this.cfr_renamed_4.length;
                    short s = this.cfr_renamed_4[n2][n];
                    sArray[n2][n13] = s;
                    n12 = ++n;
                }
                n11 = ++n2;
            }
            return sArray;
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
    }

    private /* synthetic */ void cfr_renamed_1282() throws RuntimeException {
        int n;
        sprteb sprteb2 = this;
        short s = sprddb.cfr_renamed_1273(sprteb2.cfr_renamed_4[sprteb2.cfr_renamed_4.length - 1][this.cfr_renamed_4.length - 1]);
        if (s == 0) {
            throw new RuntimeException(spruuc.cfr_renamed_9("=\u0019\fQ\f\u0000\u001c\u0010\u001d\u0018\u0006\u001fI\u0002\u0010\u0002\u001d\u0014\u0004Q\u0000\u0002I\u001f\u0006\u0005I\u0002\u0006\u001d\u001f\u0010\u000b\u001d\f"));
        }
        sprteb sprteb3 = this;
        sprteb sprteb4 = this;
        sprteb3.cfr_renamed_3[sprteb3.cfr_renamed_4.length - 1] = sprddb.cfr_renamed_1275(sprteb4.cfr_renamed_4[sprteb4.cfr_renamed_4.length - 1][this.cfr_renamed_4.length], s);
        int n2 = n = this.cfr_renamed_4.length - 2;
        while (n2 >= 0) {
            short s2 = this.cfr_renamed_4[n][this.cfr_renamed_4.length];
            int n3 = this.cfr_renamed_4.length - 1;
            while (n3 > n) {
                int n4;
                s = sprddb.cfr_renamed_1275(this.cfr_renamed_4[n][n4], this.cfr_renamed_3[n4]);
                s2 = sprddb.cfr_renamed_1274(s2, s);
                n3 = --n4;
            }
            s = sprddb.cfr_renamed_1273(this.cfr_renamed_4[n][n]);
            if (s == 0) {
                throw new RuntimeException(spraxo.cfr_renamed_9("Q:kul:s#~7s0?0n ~!v:qul,l!z8"));
            }
            this.cfr_renamed_3[n--] = sprddb.cfr_renamed_1275(s2, s);
            n2 = n;
        }
    }
}

