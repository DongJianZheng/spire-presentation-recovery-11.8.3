/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.spreip;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprqta;
import com.spire.presentation.packages.sprsjfa;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spruib;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import java.io.IOException;
import java.util.StringTokenizer;

public class sprmee
extends sprkra
implements sprkj {
    public static final int cfr_renamed_93 = 5;
    public static final int cfr_renamed_86 = 8;
    public static final int cfr_renamed_152 = 0;
    public static final int cfr_renamed_112 = 1;
    private int cfr_renamed_119;
    private spra cfr_renamed_91;
    public static final int cfr_renamed_0 = 4;
    public static final int cfr_renamed_1 = 3;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 6;
    public static final int cfr_renamed_4 = 7;

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
    public sprmee(int n, spra spra2) {
        void arg1;
        sprmee sprmee2 = this;
        sprmee2.cfr_renamed_91 = arg1;
        sprmee2.cfr_renamed_119 = n;
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

    public int cfr_renamed_312() {
        return this.cfr_renamed_119;
    }

    @Override
    public sprvva cfr_renamed_119() {
        if (this.cfr_renamed_119 == 4) {
            sprmee sprmee2 = this;
            return new sprhse(true, sprmee2.cfr_renamed_119, sprmee2.cfr_renamed_91);
        }
        sprmee sprmee3 = this;
        return new sprhse(false, sprmee3.cfr_renamed_119, sprmee3.cfr_renamed_91);
    }

    /*
     * WARNING - void declaration
     */
    public sprmee(spruhe spruhe2) {
        void arg0;
        sprmee sprmee2 = this;
        sprmee2.cfr_renamed_91 = arg0;
        sprmee2.cfr_renamed_119 = 4;
    }

    public String toString() {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = new StringBuffer();
        sprmee sprmee2 = this;
        stringBuffer2.append(sprmee2.cfr_renamed_119);
        stringBuffer2.append(": ");
        switch (sprmee2.cfr_renamed_119) {
            case 1: 
            case 2: 
            case 6: {
                StringBuffer stringBuffer3 = stringBuffer2;
                while (false) {
                }
                stringBuffer = stringBuffer3;
                stringBuffer3.append(sprcae.cfr_renamed_23(this.cfr_renamed_91).cfr_renamed_314());
                break;
            }
            case 4: {
                StringBuffer stringBuffer4 = stringBuffer2;
                stringBuffer = stringBuffer4;
                stringBuffer4.append(spruhe.cfr_renamed_23(this.cfr_renamed_91).toString());
                break;
            }
            default: {
                StringBuffer stringBuffer5 = stringBuffer2;
                stringBuffer = stringBuffer5;
                stringBuffer5.append(this.cfr_renamed_91.toString());
            }
        }
        return stringBuffer.toString();
    }

    private /* synthetic */ void cfr_renamed_4517(String arg0, byte[] arg1, int arg2) {
        StringTokenizer stringTokenizer = new StringTokenizer(arg0, sprsjfa.cfr_renamed_9("bk"));
        int n = 0;
        StringTokenizer stringTokenizer2 = stringTokenizer;
        while (stringTokenizer2.hasMoreTokens()) {
            StringTokenizer stringTokenizer3 = stringTokenizer;
            stringTokenizer2 = stringTokenizer3;
            arg1[arg2 + ++n] = (byte)Integer.parseInt(stringTokenizer3.nextToken());
        }
    }

    public spra cfr_renamed_313() {
        return this.cfr_renamed_91;
    }

    private /* synthetic */ byte[] cfr_renamed_4518(String arg0) {
        if (sprqta.cfr_renamed_465(arg0) || sprqta.cfr_renamed_466(arg0)) {
            sprmee sprmee2;
            int n = arg0.indexOf(47);
            if (n < 0) {
                byte[] byArray = new byte[16];
                sprmee sprmee3 = this;
                int[] nArray = sprmee3.cfr_renamed_4519(arg0);
                sprmee3.cfr_renamed_4520(nArray, byArray, 0);
                return byArray;
            }
            byte[] byArray = new byte[32];
            sprmee sprmee4 = this;
            int[] nArray = sprmee4.cfr_renamed_4519(arg0.substring(0, n));
            sprmee4.cfr_renamed_4520(nArray, byArray, 0);
            String string = arg0.substring(n + 1);
            if (string.indexOf(58) > 0) {
                sprmee sprmee5 = this;
                sprmee2 = sprmee5;
                nArray = sprmee5.cfr_renamed_4519(string);
            } else {
                sprmee sprmee6 = this;
                sprmee2 = sprmee6;
                nArray = sprmee6.cfr_renamed_4516(string);
            }
            sprmee2.cfr_renamed_4520(nArray, byArray, 16);
            return byArray;
        }
        if (sprqta.cfr_renamed_464(arg0) || sprqta.cfr_renamed_467(arg0)) {
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
            sprmee sprmee7 = this;
            if (string2.indexOf(46) > 0) {
                sprmee7.cfr_renamed_4517(string2, byArray, 4);
                return byArray;
            }
            sprmee7.cfr_renamed_4515(string2, byArray, 4);
            return byArray;
        }
        return null;
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

    /*
     * WARNING - void declaration
     */
    public sprmee(spruib spruib2) {
        void arg0;
        sprmee sprmee2 = this;
        sprmee2.cfr_renamed_91 = spruhe.cfr_renamed_23(arg0);
        sprmee2.cfr_renamed_119 = 4;
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

    public sprmee(int arg0, String arg1) {
        this.cfr_renamed_119 = arg0;
        if (this.cfr_renamed_119 == 1 || arg0 == 2 || arg0 == 6) {
            this.cfr_renamed_91 = new sprcae(arg1);
            return;
        }
        if (arg0 == 8) {
            sprmee sprmee2 = this;
            sprmee2.cfr_renamed_91 = new sprtzd(arg1);
            return;
        }
        if (arg0 == 4) {
            this.cfr_renamed_91 = new spruhe(arg1);
            return;
        }
        if (arg0 == 7) {
            byte[] byArray = this.cfr_renamed_4518(arg1);
            if (byArray != null) {
                this.cfr_renamed_91 = new sprlqe(byArray);
                return;
            }
            throw new IllegalArgumentException(spreip.cfr_renamed_9("hD\u0001UEpSqRg\u0001}R4HzWuM}E"));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprsjfa.cfr_renamed_9("/%\"c8d<6#')7?d\u001f0>-\"#l\"#6l0-#vd")).append(arg0).toString());
    }

    public static sprmee cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprmee.cfr_renamed_23(spryte.cfr_renamed_341(arg0, true));
    }

    public static sprmee cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprmee) {
            return (sprmee)arg0;
        }
        if (arg0 instanceof spryte) {
            spryte spryte2 = (spryte)arg0;
            int n = spryte2.cfr_renamed_312();
            switch (n) {
                case 0: {
                    return new sprmee(n, sprbne.cfr_renamed_341(spryte2, false));
                }
                case 1: {
                    return new sprmee(n, sprcae.cfr_renamed_341(spryte2, false));
                }
                case 2: {
                    return new sprmee(n, sprcae.cfr_renamed_341(spryte2, false));
                }
                case 3: {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, spreip.cfr_renamed_9("TzJzNcO4UuF.\u0001")).append(n).toString());
                }
                case 4: {
                    return new sprmee(n, spruhe.cfr_renamed_341(spryte2, true));
                }
                case 5: {
                    return new sprmee(n, sprbne.cfr_renamed_341(spryte2, false));
                }
                case 6: {
                    return new sprmee(n, sprcae.cfr_renamed_341(spryte2, false));
                }
                case 7: {
                    return new sprmee(n, sprxue.cfr_renamed_341(spryte2, false));
                }
                case 8: {
                    return new sprmee(n, sprtzd.cfr_renamed_341(spryte2, false));
                }
            }
        }
        if (arg0 instanceof byte[]) {
            try {
                return sprmee.cfr_renamed_23(sprvva.cfr_renamed_184((byte[])arg0));
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(sprsjfa.cfr_renamed_9("9*-& !l0#d<%>7)d)*/+(!(d+!\"!>% d\"%!!"));
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, spreip.cfr_renamed_9("TzJzNcO4NvKqB`\u0001}O4FqU]OgUuOwD.\u0001")).append(arg0.getClass().getName()).toString());
    }
}

