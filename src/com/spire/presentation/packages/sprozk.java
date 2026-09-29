/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcbl;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfoq;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmbba;
import com.spire.presentation.packages.sproze;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.Set;

public class sprozk {
    private static final byte[] cfr_renamed_1;
    private static final String cfr_renamed_2 = "2y";
    private static final byte[] cfr_renamed_3;
    private static final Set<String> cfr_renamed_4;

    public static String cfr_renamed_10170(char[] arg0, byte[] arg1, int arg2) {
        return sprozk.cfr_renamed_10171(cfr_renamed_2, arg0, arg1, arg2);
    }

    public static boolean cfr_renamed_10172(String arg0, char[] arg1) {
        if (arg1 == null) {
            throw new IllegalArgumentException(sprmbba.cfr_renamed_9("+ \u0015:\u000f'\u0001i\u0016(\u0015:\u0011&\u0014-H"));
        }
        return sprozk.cfr_renamed_10173(arg0, sprkoe.cfr_renamed_432(arg1));
    }

    private static /* synthetic */ byte[] cfr_renamed_10174(String arg0) {
        int n;
        int n2;
        int n3;
        char[] cArray = arg0.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16);
        if (cArray.length != 22) {
            throw new sprddl(new StringBuilder().insert(0, sprfoq.cfr_renamed_9(";\u001b\u0004\u0014\u001e\u001c\u0016U\u0010\u0014\u0001\u0010DAR\u0006\u0013\u0019\u0006U\u001e\u0010\u001c\u0012\u0006\u001dHU")).append(cArray.length).append(sprmbba.cfr_renamed_9("FeF{Ti\u0014,\u0017<\u000f;\u0003-H")).toString());
        }
        int n4 = n3 = 0;
        while (n4 < cArray.length) {
            n2 = cArray[n3];
            if (n2 > 122 || n2 < 46 || n2 > 57 && n2 < 65) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprfoq.cfr_renamed_9("!\u0014\u001e\u0001R\u0006\u0006\u0007\u001b\u001b\u0015U\u0011\u001a\u001c\u0001\u0013\u001c\u001c\u0006R\u001c\u001c\u0003\u0013\u0019\u001b\u0011R\u0016\u001a\u0014\u0000\u0014\u0011\u0001\u0017\u0007HU")).append(n2).toString());
            }
            n4 = ++n3;
        }
        char[] cArray2 = new char[24];
        System.arraycopy(cArray, 0, cArray2, 0, cArray.length);
        cArray = cArray2;
        n2 = cArray2.length;
        int n5 = n = 0;
        while (n5 < n2) {
            byte by = cfr_renamed_3[cArray[n]];
            byte by2 = cfr_renamed_3[cArray[n + 1]];
            byte by3 = cfr_renamed_3[cArray[n + 2]];
            byte by4 = cfr_renamed_3[cArray[n + 3]];
            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            byte by5 = by2;
            byteArrayOutputStream.write(by << 2 | by5 >> 4);
            byteArrayOutputStream2.write(by5 << 4 | by3 >> 2);
            byteArrayOutputStream2.write(by3 << 6 | by4);
            n5 = n += 4;
        }
        byte[] byArray = byteArrayOutputStream.toByteArray();
        byte[] byArray2 = new byte[16];
        System.arraycopy(byArray, 0, byArray2, 0, byArray2.length);
        byArray = byArray2;
        return byArray2;
    }

    private static /* synthetic */ String cfr_renamed_10175(String arg0, byte[] arg1, byte[] arg2, int arg3) {
        StringBuilder stringBuilder;
        if (!cfr_renamed_4.contains(arg0)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmbba.cfr_renamed_9("\u001f\u0003;\u0015 \t'F")).append(arg0).append(sprfoq.cfr_renamed_9("R\u001c\u0001U\u001c\u001a\u0006U\u0013\u0016\u0011\u0010\u0002\u0001\u0017\u0011R\u0017\u000bU\u0006\u001d\u001b\u0006R\u001c\u001f\u0005\u001e\u0010\u001f\u0010\u001c\u0001\u0013\u0001\u001b\u001a\u001c[")).toString());
        }
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder(60);
        stringBuilder.append('$');
        stringBuilder2.append(arg0);
        stringBuilder.append('$');
        stringBuilder2.append(arg3 < 10 ? new StringBuilder().insert(0, "0").append(arg3).toString() : Integer.toString(arg3));
        stringBuilder.append('$');
        StringBuilder stringBuilder3 = stringBuilder;
        sprozk.cfr_renamed_10176(stringBuilder3, arg2);
        sprozk.cfr_renamed_10176(stringBuilder3, sprcbl.cfr_renamed_10177(arg1, arg2, arg3));
        return stringBuilder.toString();
    }

    static {
        byte[] byArray = new byte[64];
        byArray[0] = 46;
        byArray[1] = 47;
        byArray[2] = 65;
        byArray[3] = 66;
        byArray[4] = 67;
        byArray[5] = 68;
        byArray[6] = 69;
        byArray[7] = 70;
        byArray[8] = 71;
        byArray[9] = 72;
        byArray[10] = 73;
        byArray[11] = 74;
        byArray[12] = 75;
        byArray[13] = 76;
        byArray[14] = 77;
        byArray[15] = 78;
        byArray[16] = 79;
        byArray[17] = 80;
        byArray[18] = 81;
        byArray[19] = 82;
        byArray[20] = 83;
        byArray[21] = 84;
        byArray[22] = 85;
        byArray[23] = 86;
        byArray[24] = 87;
        byArray[25] = 88;
        byArray[26] = 89;
        byArray[27] = 90;
        byArray[28] = 97;
        byArray[29] = 98;
        byArray[30] = 99;
        byArray[31] = 100;
        byArray[32] = 101;
        byArray[33] = 102;
        byArray[34] = 103;
        byArray[35] = 104;
        byArray[36] = 105;
        byArray[37] = 106;
        byArray[38] = 107;
        byArray[39] = 108;
        byArray[40] = 109;
        byArray[41] = 110;
        byArray[42] = 111;
        byArray[43] = 112;
        byArray[44] = 113;
        byArray[45] = 114;
        byArray[46] = 115;
        byArray[47] = 116;
        byArray[48] = 117;
        byArray[49] = 118;
        byArray[50] = 119;
        byArray[51] = 120;
        byArray[52] = 121;
        byArray[53] = 122;
        byArray[54] = 48;
        byArray[55] = 49;
        byArray[56] = 50;
        byArray[57] = 51;
        byArray[58] = 52;
        byArray[59] = 53;
        byArray[60] = 54;
        byArray[61] = 55;
        byArray[62] = 56;
        byArray[63] = 57;
        cfr_renamed_1 = byArray;
        cfr_renamed_3 = new byte[128];
        cfr_renamed_4 = new HashSet<String>();
        cfr_renamed_4.add(sprmbba.cfr_renamed_9("T"));
        cfr_renamed_4.add(sprfoq.cfr_renamed_9("@\r"));
        cfr_renamed_4.add(sprmbba.cfr_renamed_9("{\u0007"));
        cfr_renamed_4.add(cfr_renamed_2);
        cfr_renamed_4.add(sprfoq.cfr_renamed_9("@\u0017"));
        int n = 0;
        int n2 = n;
        while (n2 < cfr_renamed_3.length) {
            sprozk.cfr_renamed_3[n++] = -1;
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < cfr_renamed_1.length) {
            byte by = cfr_renamed_1[n];
            byte by2 = (byte)n;
            sprozk.cfr_renamed_3[by] = by2;
            n3 = ++n;
        }
    }

    private static /* synthetic */ String cfr_renamed_10178(String arg0, byte[] arg1, byte[] arg2, int arg3) {
        byte[] byArray;
        if (!cfr_renamed_4.contains(arg0)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmbba.cfr_renamed_9("\u001f\u0003;\u0015 \t'F")).append(arg0).append(sprfoq.cfr_renamed_9("R\u001c\u0001U\u001c\u001a\u0006U\u0013\u0016\u0011\u0010\u0002\u0001\u0017\u0011R\u0017\u000bU\u0006\u001d\u001b\u0006R\u001c\u001f\u0005\u001e\u0010\u001f\u0010\u001c\u0001\u0013\u0001\u001b\u001a\u001c[")).toString());
        }
        if (arg2 == null) {
            throw new IllegalArgumentException(sprmbba.cfr_renamed_9("\u001a\u0007%\u0012i\u0014,\u0017<\u000f;\u0003-H"));
        }
        if (arg2.length != 16) {
            throw new sprddl(new StringBuilder().insert(0, sprfoq.cfr_renamed_9("DDU\u0010\f\u0006\u0010R\u0006\u0013\u0019\u0006U\u0000\u0010\u0003\u0000\u001b\u0007\u0017\u0011HU")).append(arg2.length).toString());
        }
        if (arg3 < 4 || arg3 > 31) {
            throw new IllegalArgumentException(sprmbba.cfr_renamed_9("\u0000\b?\u0007%\u000f-F*\t:\u0012i\u0000(\u0005=\t;H"));
        }
        byte[] byArray2 = new byte[arg1.length >= 72 ? 72 : arg1.length + 1];
        if (byArray2.length > arg1.length) {
            System.arraycopy(arg1, 0, byArray2, 0, arg1.length);
            byArray = arg1;
        } else {
            System.arraycopy(arg1, 0, byArray2, 0, byArray2.length);
            byArray = arg1;
        }
        sproze.cfr_renamed_492(byArray, (byte)0);
        String string = sprozk.cfr_renamed_10175(arg0, byArray2, arg2, arg3);
        sproze.cfr_renamed_492(byArray2, (byte)0);
        return string;
    }

    private static /* synthetic */ void cfr_renamed_10176(StringBuilder arg0, byte[] arg1) {
        int n;
        byte[] byArray;
        if (arg1.length != 24 && arg1.length != 16) {
            throw new sprddl(new StringBuilder().insert(0, sprfoq.cfr_renamed_9(";\u001b\u0004\u0014\u001e\u001c\u0016U\u001e\u0010\u001c\u0012\u0006\u001dHU")).append(arg1.length).append(sprmbba.cfr_renamed_9("eF{Ri\u0000&\u0014i\r,\u001fi\t;FxPi\u0000&\u0014i\u0015(\n=F,\u001e9\u0003*\u0012,\u0002")).toString());
        }
        boolean bl = false;
        if (arg1.length == 16) {
            bl = true;
            byte[] byArray2 = new byte[18];
            System.arraycopy(arg1, 0, byArray2, 0, arg1.length);
            byArray = arg1 = byArray2;
        } else {
            arg1[arg1.length - 1] = 0;
            byArray = arg1;
        }
        int n2 = byArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = arg1[n] & 0xFF;
            int n5 = arg1[n + 1] & 0xFF;
            int n6 = arg1[n + 2] & 0xFF;
            arg0.append((char)cfr_renamed_1[n4 >>> 2 & 0x3F]);
            arg0.append((char)cfr_renamed_1[(n4 << 4 | n5 >>> 4) & 0x3F]);
            arg0.append((char)cfr_renamed_1[(n5 << 2 | n6 >>> 6) & 0x3F]);
            n += 3;
            arg0.append((char)cfr_renamed_1[n6 & 0x3F]);
            n3 = n;
        }
        if (bl) {
            StringBuilder stringBuilder = arg0;
            stringBuilder.setLength(stringBuilder.length() - 2);
            return;
        }
        StringBuilder stringBuilder = arg0;
        stringBuilder.setLength(stringBuilder.length() - 1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ boolean cfr_renamed_10173(String arg0, byte[] arg1) {
        int n;
        String string;
        if (arg0 == null) {
            throw new IllegalArgumentException(sprfoq.cfr_renamed_9("8\u001b\u0006\u0001\u001c\u001c\u0012R\u0017\u0011\u0007\u000b\u0005\u0006&\u0006\u0007\u001b\u001b\u0015["));
        }
        if (arg0.charAt(1) != '2') {
            throw new IllegalArgumentException(sprmbba.cfr_renamed_9("\b&\u0012i\u0007i$*\u00140\u0016=F:\u0012;\u000f'\u0001"));
        }
        int n2 = arg0.length();
        if (n2 != 60 && (n2 != 59 || arg0.charAt(2) != '$')) {
            throw new sprddl(new StringBuilder().insert(0, sprfoq.cfr_renamed_9("0\u0016\u0000\f\u0002\u0001R&\u0006\u0007\u001b\u001b\u0015U\u001e\u0010\u001c\u0012\u0006\u001dHU")).append(n2).append(sprmbba.cfr_renamed_9("eF\u007fVi\u0014,\u0017<\u000f;\u0003-H")).toString());
        }
        if (arg0.charAt(2) == '$') {
            if (arg0.charAt(0) != '$' || arg0.charAt(5) != '$') {
                throw new IllegalArgumentException(sprfoq.cfr_renamed_9("<\u001c\u0003\u0013\u0019\u001b\u0011R7\u0011\u0007\u000b\u0005\u0006U!\u0001\u0000\u001c\u001c\u0012R\u0013\u001d\u0007\u001f\u0014\u0006["));
            }
        } else if (arg0.charAt(0) != '$' || arg0.charAt(3) != '$' || arg0.charAt(6) != '$') {
            throw new IllegalArgumentException(sprmbba.cfr_renamed_9("/'\u0010(\n \u0002i$*\u00140\u0016=F\u001a\u0012;\u000f'\u0001i\u0000&\u0014$\u0007=H"));
        }
        if (arg0.charAt(2) == '$') {
            string = arg0.substring(1, 2);
            n = 3;
        } else {
            string = arg0.substring(1, 3);
            n = 4;
        }
        if (!cfr_renamed_4.contains(string)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprfoq.cfr_renamed_9("0\u0016\u0000\f\u0002\u0001R\u0003\u0017\u0007\u0001\u001c\u001d\u001bRR")).append(string).append(sprmbba.cfr_renamed_9("Ai\u000f:F'\t=F:\u00139\u0016&\u0014=\u0003-F+\u001fi\u0012!\u000f:F \u000b9\n,\u000b,\b=\u0007=\u000f&\b")).toString());
        }
        int n3 = 0;
        int n4 = n;
        String string2 = arg0.substring(n4, n4 + 2);
        try {
            n3 = Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprfoq.cfr_renamed_9("<\u001c\u0003\u0013\u0019\u001b\u0011R\u0016\u001d\u0006\u0006U\u0014\u0014\u0011\u0001\u001d\u0007HU")).append(string2).toString());
        }
        if (n3 >= 4 && n3 <= 31) {
            String string3 = arg0;
            byte[] byArray = sprozk.cfr_renamed_10174(string3.substring(string3.lastIndexOf(36) + 1, n2 - 31));
            return sprkoe.cfr_renamed_5146(string3, sprozk.cfr_renamed_10178(string, arg1, byArray, n3));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprmbba.cfr_renamed_9("/'\u0010(\n \u0002i\u0005&\u0015=F/\u0007*\u0012&\u0014sF")).append(n3).append(sprfoq.cfr_renamed_9("YRARIR\u0016\u001d\u0006\u0006UNUADR\u0010\n\u0005\u0017\u0016\u0006\u0010\u0016[")).toString());
    }

    public static String cfr_renamed_10177(byte[] arg0, byte[] arg1, int arg2) {
        return sprozk.cfr_renamed_10179(cfr_renamed_2, arg0, arg1, arg2);
    }

    public static String cfr_renamed_10171(String arg0, char[] arg1, byte[] arg2, int arg3) {
        if (arg1 == null) {
            throw new IllegalArgumentException(sprmbba.cfr_renamed_9("\u0019\u0007:\u0015>\t;\u0002i\u0014,\u0017<\u000f;\u0003-H"));
        }
        return sprozk.cfr_renamed_10178(arg0, sprkoe.cfr_renamed_432(arg1), arg2, arg3);
    }

    public static String cfr_renamed_10179(String arg0, byte[] arg1, byte[] arg2, int arg3) {
        if (arg1 == null) {
            throw new IllegalArgumentException(sprfoq.cfr_renamed_9("\"\u0014\u0001\u0006\u0005\u001a\u0000\u0011R\u0007\u0017\u0004\u0007\u001c\u0000\u0010\u0016["));
        }
        return sprozk.cfr_renamed_10178(arg0, sproze.cfr_renamed_158(arg1), arg2, arg3);
    }

    public static boolean cfr_renamed_10180(String arg0, byte[] arg1) {
        if (arg1 == null) {
            throw new IllegalArgumentException(sprmbba.cfr_renamed_9("+ \u0015:\u000f'\u0001i\u0016(\u0015:\u0011&\u0014-H"));
        }
        return sprozk.cfr_renamed_10173(arg0, sproze.cfr_renamed_158(arg1));
    }

    private /* synthetic */ sprozk() {
    }
}

