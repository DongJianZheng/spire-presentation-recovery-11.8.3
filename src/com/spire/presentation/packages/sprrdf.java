/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprniia;
import com.spire.presentation.packages.sprqwe;
import com.spire.presentation.packages.sprtwg;

public class sprrdf {
    public short[] cfr_renamed_3;
    private short[][] cfr_renamed_4;

    public short[] cfr_renamed_1278(short[][] arg0, short[] arg1) throws RuntimeException {
        int n;
        if (arg0[0].length != arg1.length) {
            throw new RuntimeException(sprtwg.cfr_renamed_9("-\u0013\f\u0012\t\u0016\f\u000f\u0003\u0007\u0014\u000f\u000f\b@\u000f\u0013F\u000e\t\u0014F\u0010\t\u0013\u0015\t\u0004\f\u0003A"));
        }
        short s = 0;
        short[] sArray = new short[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg1.length) {
                s = sprqwe.cfr_renamed_1275(arg0[n][n3], arg1[n3]);
                sArray[n] = sprqwe.cfr_renamed_1274(sArray[n], s);
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    private /* synthetic */ void cfr_renamed_1285() throws RuntimeException {
        int n;
        short s = 0;
        int n2 = n = this.cfr_renamed_4.length - 1;
        while (n2 > 0) {
            int n3 = n - 1;
            while (n3 >= 0) {
                int n4;
                sprrdf sprrdf2 = this;
                short s2 = sprrdf2.cfr_renamed_4[n4][n];
                short s3 = sprqwe.cfr_renamed_1273(sprrdf2.cfr_renamed_4[n][n]);
                if (s3 == 0) {
                    throw new RuntimeException(sprniia.cfr_renamed_9("2L\u0003\u0004\u000bE\u0012V\u000f\\FM\u0015\u0004\bK\u0012\u0004\u000fJ\u0010A\u0014P\u000fF\nA"));
                }
                int n5 = n;
                while (n5 < 2 * this.cfr_renamed_4.length) {
                    int n6;
                    sprrdf sprrdf3 = this;
                    s = sprqwe.cfr_renamed_1275(sprrdf3.cfr_renamed_4[n][n6], s3);
                    s = sprqwe.cfr_renamed_1275(s2, s);
                    int n7 = n6++;
                    sprrdf3.cfr_renamed_4[n4][n7] = sprqwe.cfr_renamed_1274(this.cfr_renamed_4[n4][n7], s);
                    n5 = n6;
                }
                n3 = --n4;
            }
            n2 = --n;
        }
    }

    public short[][] cfr_renamed_1288(short[][] arg0) {
        try {
            int n;
            int n2;
            this.cfr_renamed_4 = new short[arg0.length][2 * arg0.length];
            if (arg0.length != arg0[0].length) {
                throw new RuntimeException(sprtwg.cfr_renamed_9("2\b\u0003@\u000b\u0001\u0012\u0012\u000f\u0018F\t\u0015@\b\u000f\u0012@\u000f\u000e\u0010\u0005\u0014\u0014\u000f\u0002\n\u0005H@6\f\u0003\u0001\u0015\u0005F\u0003\u000e\u000f\t\u0013\u0003@\u0007\u000e\t\u0014\u000e\u0005\u0014@\t\u000e\u0003A"));
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
                short s = sprqwe.cfr_renamed_1273(this.cfr_renamed_4[n2][n2]);
                int n9 = n2;
                while (n9 < 2 * this.cfr_renamed_4.length) {
                    int n10 = n++;
                    this.cfr_renamed_4[n2][n10] = sprqwe.cfr_renamed_1275(this.cfr_renamed_4[n2][n10], s);
                    n9 = n;
                }
                n8 = ++n2;
            }
            sprrdf sprrdf2 = this;
            sprrdf2.cfr_renamed_1285();
            short[][] sArray = new short[sprrdf2.cfr_renamed_4.length][this.cfr_renamed_4.length];
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

    public short[] cfr_renamed_1286(short[] arg0, short[] arg1) {
        int n;
        if (arg0.length != arg1.length) {
            throw new RuntimeException(sprniia.cfr_renamed_9("i\u0013H\u0012M\u0016H\u000fG\u0007P\u000fK\b\u0004\u000fWFJ\tPFT\tW\u0015M\u0004H\u0003\u0005"));
        }
        short[] sArray = new short[arg0.length];
        int n2 = n = 0;
        while (n2 < sArray.length) {
            int n3 = n;
            short s = sprqwe.cfr_renamed_1274(arg0[n], arg1[n3]);
            sArray[n3] = s;
            n2 = ++n;
        }
        return sArray;
    }

    public short[][] cfr_renamed_1277(short arg0, short[][] arg1) {
        int n;
        short[][] sArray = new short[arg1.length][arg1[0].length];
        int n2 = n = 0;
        while (n2 < arg1.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg1[0].length) {
                int n5 = n3++;
                sArray[n][n5] = sprqwe.cfr_renamed_1275(arg0, arg1[n][n5]);
                n4 = n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    public short[][] cfr_renamed_1287(short[][] arg0, short[][] arg1) {
        int n;
        if (arg0.length != arg1.length || arg0[0].length != arg1[0].length) {
            throw new RuntimeException(sprtwg.cfr_renamed_9("!\u0002\u0004\u000f\u0014\u000f\u000f\b@\u000f\u0013F\u000e\t\u0014F\u0010\t\u0013\u0015\t\u0004\f\u0003A"));
        }
        short[][] sArray = new short[arg0.length][arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg1.length) {
                int n5 = n3;
                short s = sprqwe.cfr_renamed_1274(arg0[n][n3], arg1[n][n5]);
                sArray[n][n5] = s;
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    public short[] cfr_renamed_1280(short arg0, short[] arg1) {
        int n;
        short[] sArray = new short[arg1.length];
        int n2 = n = 0;
        while (n2 < sArray.length) {
            int n3 = n++;
            sArray[n3] = sprqwe.cfr_renamed_1275(arg0, arg1[n3]);
            n2 = n;
        }
        return sArray;
    }

    public short[][] cfr_renamed_1283(short[] arg0, short[] arg1) {
        int n;
        if (arg0.length != arg1.length) {
            throw new RuntimeException(sprniia.cfr_renamed_9("i\u0013H\u0012M\u0016H\u000fG\u0007P\u000fK\b\u0004\u000fWFJ\tPFT\tW\u0015M\u0004H\u0003\u0005"));
        }
        short[][] sArray = new short[arg0.length][arg1.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg1.length) {
                int n5 = n3++;
                sArray[n][n5] = sprqwe.cfr_renamed_1275(arg0[n], arg1[n5]);
                n4 = n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    private /* synthetic */ void cfr_renamed_1282() throws IllegalStateException {
        int n;
        sprrdf sprrdf2 = this;
        short s = sprqwe.cfr_renamed_1273(sprrdf2.cfr_renamed_4[sprrdf2.cfr_renamed_4.length - 1][this.cfr_renamed_4.length - 1]);
        if (s == 0) {
            throw new IllegalStateException(sprtwg.cfr_renamed_9("4\u000e\u0005F\u0005\u0017\u0015\u0007\u0014\u000f\u000f\b@\u0015\u0019\u0015\u0014\u0003\rF\t\u0015@\b\u000f\u0012@\u0015\u000f\n\u0016\u0007\u0002\n\u0005"));
        }
        sprrdf sprrdf3 = this;
        sprrdf sprrdf4 = this;
        sprrdf3.cfr_renamed_3[sprrdf3.cfr_renamed_4.length - 1] = sprqwe.cfr_renamed_1275(sprrdf4.cfr_renamed_4[sprrdf4.cfr_renamed_4.length - 1][this.cfr_renamed_4.length], s);
        int n2 = n = this.cfr_renamed_4.length - 2;
        while (n2 >= 0) {
            short s2 = this.cfr_renamed_4[n][this.cfr_renamed_4.length];
            int n3 = this.cfr_renamed_4.length - 1;
            while (n3 > n) {
                int n4;
                s = sprqwe.cfr_renamed_1275(this.cfr_renamed_4[n][n4], this.cfr_renamed_3[n4]);
                s2 = sprqwe.cfr_renamed_1274(s2, s);
                n3 = --n4;
            }
            s = sprqwe.cfr_renamed_1273(this.cfr_renamed_4[n][n]);
            if (s == 0) {
                throw new IllegalStateException(sprniia.cfr_renamed_9("(K\u0012\u0004\u0015K\nR\u0007F\nAFA\u0017Q\u0007P\u000fK\b\u0004\u0015]\u0015P\u0003I"));
            }
            this.cfr_renamed_3[n--] = sprqwe.cfr_renamed_1275(s2, s);
            n2 = n;
        }
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
                sprrdf sprrdf2 = this;
                short s2 = sprrdf2.cfr_renamed_4[n5][n];
                short s3 = sprqwe.cfr_renamed_1273(sprrdf2.cfr_renamed_4[n][n]);
                if (s3 == 0) {
                    throw new IllegalStateException(sprtwg.cfr_renamed_9("-\u0007\u0014\u0014\t\u001e@\b\u000f\u0012@\u000f\u000e\u0010\u0005\u0014\u0014\u000f\u0002\n\u0005G@1\u0005F\b\u0007\u0016\u0003@\u0012\u000fF\u0003\u000e\u000f\t\u0013\u0003@\u0007\u000e\t\u0014\u000e\u0005\u0014@\t\u000e\u0003A"));
                }
                int n6 = n;
                while (n6 < n2) {
                    int n7;
                    sprrdf sprrdf3 = this;
                    s = sprqwe.cfr_renamed_1275(sprrdf3.cfr_renamed_4[n][n7], s3);
                    s = sprqwe.cfr_renamed_1275(s2, s);
                    int n8 = n7++;
                    sprrdf3.cfr_renamed_4[n5][n8] = sprqwe.cfr_renamed_1274(this.cfr_renamed_4[n5][n8], s);
                    n6 = n7;
                }
                n4 = ++n5;
            }
            n3 = ++n;
        }
    }

    public short[][] cfr_renamed_1284(short[][] arg0, short[][] arg1) throws RuntimeException {
        int n;
        if (arg0[0].length != arg1.length) {
            throw new RuntimeException(sprniia.cfr_renamed_9("i\u0013H\u0012M\u0016H\u000fG\u0007P\u000fK\b\u0004\u000fWFJ\tPFT\tW\u0015M\u0004H\u0003\u0005"));
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
                    s = sprqwe.cfr_renamed_1275(arg0[n][n3], arg1[n3][n5]);
                    int n7 = n5++;
                    this.cfr_renamed_4[n][n7] = sprqwe.cfr_renamed_1274(this.cfr_renamed_4[n][n7], s);
                    n6 = n5;
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return this.cfr_renamed_4;
    }

    public short[] cfr_renamed_1281(short[][] arg0, short[] arg1) {
        if (arg0.length != arg1.length) {
            return null;
        }
        try {
            int n;
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
                short s = sprqwe.cfr_renamed_1274(arg1[n], this.cfr_renamed_4[n][arg1.length]);
                sArray[arg1.length] = s;
                n6 = ++n;
            }
            sprrdf sprrdf2 = this;
            sprrdf2.cfr_renamed_1279(false);
            sprrdf2.cfr_renamed_1282();
            return sprrdf2.cfr_renamed_3;
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
    }
}

