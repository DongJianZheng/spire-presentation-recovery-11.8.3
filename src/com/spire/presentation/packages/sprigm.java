/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcff;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprhyo;
import com.spire.presentation.packages.sprjii;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprlyja;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.io.IOException;
import java.util.StringTokenizer;

public class sprigm
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_93 = 4;
    private sprco cfr_renamed_86;
    public static final int cfr_renamed_152 = 2;
    private int cfr_renamed_112;
    public static final int cfr_renamed_119 = 7;
    public static final int cfr_renamed_91 = 6;
    public static final int cfr_renamed_0 = 5;
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 8;
    public static final int cfr_renamed_3 = 3;
    public static final int cfr_renamed_4 = 0;

    /*
     * WARNING - void declaration
     */
    public sprigm(sprjii sprjii2) {
        void arg0;
        sprigm sprigm2 = this;
        sprigm2.cfr_renamed_86 = sprnbm.cfr_renamed_23(arg0);
        sprigm2.cfr_renamed_112 = 4;
    }

    public static sprigm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprigm) {
            return (sprigm)arg0;
        }
        if (arg0 instanceof sprnvm) {
            sprnvm sprnvm2 = (sprnvm)arg0;
            int n = sprnvm2.cfr_renamed_312();
            switch (n) {
                case 0: 
                case 3: 
                case 5: {
                    return new sprigm(n, sprszm.cfr_renamed_5085(sprnvm2, false));
                }
                case 1: 
                case 2: 
                case 6: {
                    return new sprigm(n, sprupm.cfr_renamed_5085(sprnvm2, false));
                }
                case 4: {
                    return new sprigm(n, sprnbm.cfr_renamed_5085(sprnvm2, true));
                }
                case 7: {
                    return new sprigm(n, sproug.cfr_renamed_5085(sprnvm2, false));
                }
                case 8: {
                    return new sprigm(n, sprlem.cfr_renamed_5085(sprnvm2, false));
                }
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhyo.cfr_renamed_9("\\{B{FbG5]tN/\t")).append(n).toString());
        }
        if (arg0 instanceof byte[]) {
            try {
                return sprigm.cfr_renamed_23(sprxgf.cfr_renamed_184((byte[])arg0));
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(sprlyja.cfr_renamed_9("[-O!B&\u000e7Ac^\"\\0KcK-M,J&JcI&@&\\\"Bc@\"C&"));
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprhyo.cfr_renamed_9("\\{B{FbG5FwCpJa\t|G5Np]\\Gf]tGvL/\t")).append(arg0.getClass().getName()).toString());
    }

    private /* synthetic */ byte[] cfr_renamed_4518(String arg0) {
        if (sprcff.cfr_renamed_465(arg0) || sprcff.cfr_renamed_466(arg0)) {
            sprigm sprigm2;
            int n = arg0.indexOf(47);
            if (n < 0) {
                byte[] byArray = new byte[16];
                sprigm sprigm3 = this;
                int[] nArray = sprigm3.cfr_renamed_4519(arg0);
                sprigm3.cfr_renamed_4520(nArray, byArray, 0);
                return byArray;
            }
            byte[] byArray = new byte[32];
            sprigm sprigm4 = this;
            int[] nArray = sprigm4.cfr_renamed_4519(arg0.substring(0, n));
            sprigm4.cfr_renamed_4520(nArray, byArray, 0);
            String string = arg0.substring(n + 1);
            if (string.indexOf(58) > 0) {
                sprigm sprigm5 = this;
                sprigm2 = sprigm5;
                nArray = sprigm5.cfr_renamed_4519(string);
            } else {
                sprigm sprigm6 = this;
                sprigm2 = sprigm6;
                nArray = sprigm6.cfr_renamed_4516(string);
            }
            sprigm2.cfr_renamed_4520(nArray, byArray, 16);
            return byArray;
        }
        if (sprcff.cfr_renamed_464(arg0) || sprcff.cfr_renamed_467(arg0)) {
            int n = arg0.indexOf(47);
            if (n < 0) {
                byte[] byArray = new byte[4];
                this.cfr_renamed_4517(arg0, byArray, 0);
                return byArray;
            }
            byte[] byArray = new byte[8];
            String string = arg0;
            this.cfr_renamed_4517(string.substring(0, n), byArray, 0);
            String string2 = string.substring(n + 1);
            sprigm sprigm7 = this;
            if (string2.indexOf(46) > 0) {
                sprigm7.cfr_renamed_4517(string2, byArray, 4);
                return byArray;
            }
            sprigm7.cfr_renamed_4515(string2, byArray, 4);
            return byArray;
        }
        return null;
    }

    private /* synthetic */ void cfr_renamed_4517(String arg0, byte[] arg1, int arg2) {
        StringTokenizer stringTokenizer = new StringTokenizer(arg0, sprlyja.cfr_renamed_9("\u0000l"));
        int n = 0;
        StringTokenizer stringTokenizer2 = stringTokenizer;
        while (stringTokenizer2.hasMoreTokens()) {
            StringTokenizer stringTokenizer3 = stringTokenizer;
            stringTokenizer2 = stringTokenizer3;
            arg1[arg2 + ++n] = (byte)Integer.parseInt(stringTokenizer3.nextToken());
        }
    }

    private /* synthetic */ void cfr_renamed_4515(String arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = Integer.parseInt(arg0);
        int n3 = n = 0;
        while (n3 != n2) {
            int n4 = n / 8 + arg2;
            byte by = (byte)(arg1[n4] | 1 << 7 - n % 8);
            arg1[n4] = by;
            n3 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprigm(int n, sprco sprco2) {
        void arg1;
        sprigm sprigm2 = this;
        sprigm2.cfr_renamed_86 = arg1;
        sprigm2.cfr_renamed_112 = n;
    }

    public int cfr_renamed_312() {
        return this.cfr_renamed_112;
    }

    public sprco cfr_renamed_313() {
        return this.cfr_renamed_86;
    }

    public String toString() {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = new StringBuffer();
        sprigm sprigm2 = this;
        stringBuffer2.append(sprigm2.cfr_renamed_112);
        stringBuffer2.append(": ");
        switch (sprigm2.cfr_renamed_112) {
            case 1: 
            case 2: 
            case 6: {
                StringBuffer stringBuffer3 = stringBuffer2;
                while (false) {
                }
                stringBuffer = stringBuffer3;
                stringBuffer3.append(sprupm.cfr_renamed_23(this.cfr_renamed_86).cfr_renamed_314());
                break;
            }
            case 4: {
                StringBuffer stringBuffer4 = stringBuffer2;
                stringBuffer = stringBuffer4;
                stringBuffer4.append(sprnbm.cfr_renamed_23(this.cfr_renamed_86).toString());
                break;
            }
            default: {
                StringBuffer stringBuffer5 = stringBuffer2;
                stringBuffer = stringBuffer5;
                stringBuffer5.append(this.cfr_renamed_86.toString());
            }
        }
        return stringBuffer.toString();
    }

    private /* synthetic */ int[] cfr_renamed_4516(String arg0) {
        int n;
        int[] nArray = new int[8];
        int n2 = Integer.parseInt(arg0);
        int n3 = n = 0;
        while (n3 != n2) {
            int n4 = n / 16;
            int n5 = nArray[n4] | 1 << 15 - n % 16;
            nArray[n4] = n5;
            n3 = ++n;
        }
        return nArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        boolean bl = this.cfr_renamed_112 == 4;
        sprigm sprigm2 = this;
        return new sprycn(bl, sprigm2.cfr_renamed_112, sprigm2.cfr_renamed_86);
    }

    /*
     * WARNING - void declaration
     */
    public sprigm(sprnbm sprnbm2) {
        void arg0;
        sprigm sprigm2 = this;
        sprigm2.cfr_renamed_86 = arg0;
        sprigm2.cfr_renamed_112 = 4;
    }

    public sprigm(int arg0, String arg1) {
        this.cfr_renamed_112 = arg0;
        if (this.cfr_renamed_112 == 1 || arg0 == 2 || arg0 == 6) {
            this.cfr_renamed_86 = new sprnrm(arg1);
            return;
        }
        if (arg0 == 8) {
            sprigm sprigm2 = this;
            sprigm2.cfr_renamed_86 = new sprlem(arg1);
            return;
        }
        if (arg0 == 4) {
            this.cfr_renamed_86 = new sprnbm(arg1);
            return;
        }
        if (arg0 == 7) {
            byte[] byArray = this.cfr_renamed_4518(arg1);
            if (byArray != null) {
                this.cfr_renamed_86 = new sprfvg(byArray);
                return;
            }
            throw new IllegalArgumentException(sprhyo.cfr_renamed_9("`E\tTMq[pZf\t|Z5@{_tE|M"));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprlyja.cfr_renamed_9("M\"@dZc^1A K0]c}7\\*@$\u000e%A1\u000e7O$\u0014c")).append(arg0).toString());
    }

    public static sprigm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        if (!arg1) {
            throw new IllegalArgumentException(sprhyo.cfr_renamed_9("J}F|Jp\t|]pD5D`Za\twL5LmYy@v@aEl\taHrNpM"));
        }
        return sprigm.cfr_renamed_23(sprnvm.cfr_renamed_5085(arg0, true));
    }

    private /* synthetic */ int[] cfr_renamed_4519(String arg0) {
        StringTokenizer stringTokenizer = new StringTokenizer(arg0, ":", true);
        int n = 0;
        int[] nArray = new int[8];
        if (arg0.charAt(0) == ':' && arg0.charAt(1) == ':') {
            stringTokenizer.nextToken();
        }
        int n2 = -1;
        while (stringTokenizer.hasMoreTokens()) {
            String string = stringTokenizer.nextToken();
            if (string.equals(":")) {
                n2 = n;
                nArray[n++] = 0;
                continue;
            }
            if (string.indexOf(46) < 0) {
                nArray[n++] = Integer.parseInt(string, 16);
                if (!stringTokenizer.hasMoreTokens()) continue;
                stringTokenizer.nextToken();
                continue;
            }
            StringTokenizer stringTokenizer2 = new StringTokenizer(string, ".");
            nArray[n++] = Integer.parseInt(stringTokenizer2.nextToken()) << 8 | Integer.parseInt(stringTokenizer2.nextToken());
            nArray[n++] = Integer.parseInt(stringTokenizer2.nextToken()) << 8 | Integer.parseInt(stringTokenizer2.nextToken());
        }
        if (n != nArray.length) {
            int n3;
            int[] nArray2 = nArray;
            System.arraycopy(nArray2, n2, nArray, nArray2.length - (n - n2), n - n2);
            int n4 = n3 = n2;
            while (n4 != nArray.length - (n - n2)) {
                nArray[n3++] = 0;
                n4 = n3;
            }
        }
        return nArray;
    }

    private /* synthetic */ void cfr_renamed_4520(int[] arg0, byte[] arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 != arg0.length) {
            arg1[n * 2 + arg2] = (byte)(arg0[n] >> 8);
            int n3 = n * 2 + 1 + arg2;
            byte by = (byte)arg0[n];
            arg1[n3] = by;
            n2 = ++n;
        }
    }
}

