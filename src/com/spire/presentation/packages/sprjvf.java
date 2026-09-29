/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpjc;
import com.spire.presentation.packages.sprszf;
import com.spire.presentation.packages.sprxrq;

public class sprjvf {
    public short cfr_renamed_6139(short[][] arg0, short[] arg1) throws RuntimeException {
        int n;
        if (arg0.length != arg0[0].length || arg0[0].length != arg1.length) {
            throw new RuntimeException(sprpjc.cfr_renamed_9("5P\u0014Q\u0011U\u0014L\u001bD\fL\u0017KXL\u000b\u0005\u0016J\f\u0005\bJ\u000bV\u0011G\u0014@Y"));
        }
        short s = 0;
        short[] sArray = new short[arg0.length];
        short s2 = 0;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg1.length) {
                s = sprszf.cfr_renamed_1275(arg0[n][n3], arg1[n3]);
                sArray[n] = sprszf.cfr_renamed_1274(sArray[n], s);
                n4 = ++n3;
            }
            s = sprszf.cfr_renamed_1275(sArray[n], arg1[n]);
            s2 = sprszf.cfr_renamed_1274(s2, s);
            n2 = ++n;
        }
        return s2;
    }

    public short[] cfr_renamed_1286(short[] arg0, short[] arg1) {
        int n;
        if (arg0.length != arg1.length) {
            throw new RuntimeException(new StringBuilder().insert(0, sprxrq.cfr_renamed_9("v*S'C'X \u0017'DnY!CnG!D=^,[+\u0016nA+T:X<\u0006`[+Y)C&\rn")).append(arg0.length).append(sprpjc.cfr_renamed_9("XS\u001dF\fJ\n\u0017VI\u001dK\u001fQ\u0010\u001fX")).append(arg1.length).toString());
        }
        short[] sArray = new short[arg0.length];
        int n2 = n = 0;
        while (n2 < sArray.length) {
            int n3 = n;
            short s = sprszf.cfr_renamed_1274(arg0[n], arg1[n3]);
            sArray[n3] = s;
            n2 = ++n;
        }
        return sArray;
    }

    public short[][] cfr_renamed_6167(short[][] arg0) {
        if (arg0.length != arg0[0].length) {
            throw new RuntimeException(sprxrq.cfr_renamed_9("\u000fS*^:^!Yn^=\u0017 X:\u0017>X=D'U\"Ro"));
        }
        sprjvf sprjvf2 = this;
        return sprjvf2.cfr_renamed_6140(arg0, sprjvf2.cfr_renamed_6166(arg0));
    }

    public short[] cfr_renamed_1278(short[][] arg0, short[] arg1) throws RuntimeException {
        int n;
        if (arg0[0].length != arg1.length) {
            throw new RuntimeException(sprpjc.cfr_renamed_9("5P\u0014Q\u0011U\u0014L\u001bD\fL\u0017KXL\u000b\u0005\u0016J\f\u0005\bJ\u000bV\u0011G\u0014@Y"));
        }
        short s = 0;
        short[] sArray = new short[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg1.length) {
                s = sprszf.cfr_renamed_1275(arg0[n][n3], arg1[n3]);
                sArray[n] = sprszf.cfr_renamed_1274(sArray[n], s);
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    public short[][] cfr_renamed_6169(short[][] arg0) {
        int n;
        if (arg0.length != arg0[0].length) {
            throw new RuntimeException(sprxrq.cfr_renamed_9("\rX#G;C/C'X \u0017:XnB>G+EnC<^/Y)B\"V<\u0017#V:E'On^=\u0017 X:\u0017>X=D'U\"Ro"));
        }
        short[][] sArray = new short[arg0.length][arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            sArray[n][n3] = arg0[n][n];
            int n4 = n3 + 1;
            while (n4 < arg0[0].length) {
                int n5;
                int n6 = n5;
                short s = sprszf.cfr_renamed_1274(arg0[n][n5], arg0[n6][n]);
                sArray[n][n6] = s;
                n4 = ++n5;
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
            sArray[n3] = sprszf.cfr_renamed_1275(arg0, arg1[n3]);
            n2 = n;
        }
        return sArray;
    }

    public short[] cfr_renamed_1281(short[][] arg0, short[] arg1) {
        if (arg0.length != arg1.length) {
            return null;
        }
        try {
            int n;
            short[][] sArray = new short[arg0.length][arg0.length + 1];
            short[] sArray2 = new short[arg0.length];
            int n2 = n = 0;
            while (n2 < arg0.length) {
                System.arraycopy(arg0[n], 0, sArray[n], 0, arg0[0].length);
                short[] sArray3 = sArray[n];
                short s = sprszf.cfr_renamed_1274(arg1[n], sArray[n][arg1.length]);
                sArray3[arg1.length] = s;
                n2 = ++n;
            }
            this.cfr_renamed_6198(sArray);
            int n3 = n = 0;
            while (n3 < sArray.length) {
                int n4 = n++;
                sArray2[n4] = sArray[n4][arg1.length];
                n3 = n;
            }
            return sArray2;
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
    }

    public short[][] cfr_renamed_1288(short[][] arg0) {
        if (arg0.length != arg0[0].length) {
            throw new RuntimeException(sprpjc.cfr_renamed_9("q\u0010@XH\u0019Q\nL\u0000\u0005\u0011VXK\u0017QXL\u0016S\u001dW\fL\u001aI\u001d\u000bXu\u0014@\u0019V\u001d\u0005\u001bM\u0017J\u000b@XD\u0016J\fM\u001dWXJ\u0016@Y"));
        }
        try {
            int n;
            int n2;
            short[][] sArray = new short[arg0.length][2 * arg0.length];
            int n3 = n2 = 0;
            while (n3 < arg0.length) {
                System.arraycopy(arg0[n2], 0, sArray[n2], 0, arg0.length);
                int n4 = arg0.length;
                while (n4 < 2 * arg0.length) {
                    sArray[n2][n++] = 0;
                    n4 = n;
                }
                short[] sArray2 = sArray[n2];
                int n5 = n2 + sArray.length;
                sArray2[n5] = 1;
                n3 = ++n2;
            }
            this.cfr_renamed_6198(sArray);
            short[][] sArray3 = new short[sArray.length][sArray.length];
            int n6 = n2 = 0;
            while (n6 < sArray.length) {
                int n7 = sArray.length;
                while (n7 < 2 * sArray.length) {
                    int n8 = n - sArray.length;
                    short s = sArray[n2][n];
                    sArray3[n2][n8] = s;
                    n7 = ++n;
                }
                n6 = ++n2;
            }
            return sArray3;
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
    }

    public short[][] cfr_renamed_1284(short[][] arg0, short[][] arg1) throws RuntimeException {
        int n;
        if (arg0[0].length != arg1.length) {
            throw new RuntimeException(sprxrq.cfr_renamed_9("\u0003B\"C'G\"^-V:^!Yn^=\u0017 X:\u0017>X=D'U\"Ro"));
        }
        short s = 0;
        short[][] sArray = new short[arg0.length][arg1[0].length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg1.length) {
                int n5;
                int n6 = n5 = 0;
                while (n6 < arg1[0].length) {
                    s = sprszf.cfr_renamed_1275(arg0[n][n3], arg1[n3][n5]);
                    int n7 = n5++;
                    sArray[n][n7] = sprszf.cfr_renamed_1274(sArray[n][n7], s);
                    n6 = n5;
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    public short[][] cfr_renamed_1283(short[] arg0, short[] arg1) {
        int n;
        if (arg0.length != arg1.length) {
            throw new RuntimeException(sprpjc.cfr_renamed_9("5P\u0014Q\u0011U\u0014L\u001bD\fL\u0017KXL\u000b\u0005\u0016J\f\u0005\bJ\u000bV\u0011G\u0014@Y"));
        }
        short[][] sArray = new short[arg0.length][arg1.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg1.length) {
                int n5 = n3++;
                sArray[n][n5] = sprszf.cfr_renamed_1275(arg0[n], arg1[n5]);
                n4 = n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    public short[][] cfr_renamed_6166(short[][] arg0) {
        int n;
        short[][] sArray = new short[arg0[0].length][arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg0[0].length) {
                short[] sArray2 = sArray[n3];
                int n5 = n;
                short s = arg0[n5][n3];
                sArray2[n5] = s;
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    public short[][][] cfr_renamed_6162(short[][] arg0, short[][][] arg1, short[][][] arg2) {
        int n;
        if (arg1[0].length != arg2[0].length || arg1[0][0].length != arg2[0][0].length || arg1.length != arg0[0].length || arg2.length != arg0.length) {
            throw new RuntimeException(sprxrq.cfr_renamed_9("z;[:^>['T/C'X \u0017 X:\u0017>X=D'U\"Ro"));
        }
        short[][][] sArray = new short[arg2.length][arg2[0].length][arg2[0][0].length];
        int n2 = n = 0;
        while (n2 < arg1[0].length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg1[0][0].length) {
                int n5;
                int n6 = n5 = 0;
                while (n6 < arg0.length) {
                    int n7;
                    int n8 = n7 = 0;
                    while (n8 < arg0[0].length) {
                        short s = sprszf.cfr_renamed_1275(arg0[n5][n7], arg1[n7][n][n3]);
                        int n9 = n3;
                        sArray[n5][n][n9] = sprszf.cfr_renamed_1274(sArray[n5][n][n9], s);
                        n8 = ++n7;
                    }
                    short[] sArray2 = sArray[n5][n];
                    int n10 = n3;
                    short s = sprszf.cfr_renamed_1274(arg2[n5][n][n3], sArray[n5][n][n10]);
                    sArray2[n10] = s;
                    n6 = ++n5;
                }
                n4 = ++n3;
            }
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
                sArray[n][n5] = sprszf.cfr_renamed_1275(arg0, arg1[n][n5]);
                n4 = n3;
            }
            n2 = ++n;
        }
        return sArray;
    }

    private /* synthetic */ void cfr_renamed_6198(short[][] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4;
            int n5 = n4 = n + 1;
            while (n5 < arg0.length) {
                if (arg0[n][n] == 0) {
                    int n6 = n;
                    while (n6 < arg0[0].length) {
                        int n7 = n3;
                        short s = sprszf.cfr_renamed_1274(arg0[n][n3], arg0[n4][n7]);
                        arg0[n][n7] = s;
                        n6 = ++n3;
                    }
                }
                n5 = ++n4;
            }
            short s = sprszf.cfr_renamed_1273(arg0[n][n]);
            if (s == 0) {
                throw new RuntimeException(sprpjc.cfr_renamed_9("q\u0010@XH\u0019Q\nL\u0000\u0005\u0011VXK\u0017QXL\u0016S\u001dW\fL\u001aI\u001d"));
            }
            arg0[n] = this.cfr_renamed_1280(s, arg0[n]);
            int n8 = n4 = 0;
            while (n8 < arg0.length) {
                if (n != n4) {
                    short s2 = arg0[n4][n];
                    int n9 = n;
                    while (n9 < arg0[0].length) {
                        short s3 = sprszf.cfr_renamed_1275(arg0[n][n3], s2);
                        int n10 = n3++;
                        arg0[n4][n10] = sprszf.cfr_renamed_1274(arg0[n4][n10], s3);
                        n9 = n3;
                    }
                }
                n8 = ++n4;
            }
            n2 = ++n;
        }
    }

    public short[][] cfr_renamed_6140(short[][] arg0, short[][] arg1) {
        int n;
        if (arg0.length != arg1.length || arg0[0].length != arg1[0].length) {
            throw new RuntimeException(sprxrq.cfr_renamed_9("\u000fS*^:^!Yn^=\u0017 X:\u0017>X=D'U\"Ro"));
        }
        short[][] sArray = new short[arg0.length][arg0[0].length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < arg0[0].length) {
                int n5 = n3;
                short s = sprszf.cfr_renamed_1274(arg0[n][n3], arg1[n][n5]);
                sArray[n][n5] = s;
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return sArray;
    }
}

