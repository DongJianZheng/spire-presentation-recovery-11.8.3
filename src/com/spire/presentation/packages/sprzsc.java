/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprayc;
import com.spire.presentation.packages.sprbbd;
import com.spire.presentation.packages.sprbsa;
import com.spire.presentation.packages.sprced;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprfmd;
import com.spire.presentation.packages.sprfzc;
import com.spire.presentation.packages.sprgbd;
import com.spire.presentation.packages.sprgg;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprhcd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprirc;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprixc;
import com.spire.presentation.packages.sprkc;
import com.spire.presentation.packages.sprkxc;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprlid;
import com.spire.presentation.packages.sprlxc;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sproed;
import com.spire.presentation.packages.sprpxc;
import com.spire.presentation.packages.sprqcs;
import com.spire.presentation.packages.sprs;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtfd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprued;
import com.spire.presentation.packages.spruld;
import com.spire.presentation.packages.spruuc;
import com.spire.presentation.packages.sprvhd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprxpo;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzc;
import com.spire.presentation.packages.sprzfe;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzuc;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;

public class sprzsc {
    public static final Integer cfr_renamed_0;
    public static final byte[] cfr_renamed_1;
    public static final byte[] cfr_renamed_2;
    public static final byte[] cfr_renamed_3;
    public static final byte[][] cfr_renamed_4;

    public static void cfr_renamed_2638(byte[] arg0, OutputStream arg1) throws IOException {
        sprzsc.cfr_renamed_2639(arg0.length);
        sprzsc.cfr_renamed_2625(arg0.length, arg1);
        arg1.write(arg0);
    }

    public static byte[] spr\ufe34\ufe34(byte[] arg0, byte[] arg1) {
        int n;
        sprlc sprlc2 = sprzsc.cfr_renamed_2640((short)1);
        sprlc sprlc3 = sprzsc.cfr_renamed_2640((short)2);
        int n2 = sprlc2.cfr_renamed_1218();
        byte[] byArray = new byte[sprlc3.cfr_renamed_1218()];
        byte[] byArray2 = new byte[n2 * 3];
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < 3) {
            byte[] byArray3 = cfr_renamed_4[n];
            sprlc3.cfr_renamed_1197(byArray3, 0, byArray3.length);
            sprlc3.cfr_renamed_1197(arg0, 0, arg0.length);
            sprlc3.cfr_renamed_1197(arg1, 0, arg1.length);
            sprlc3.cfr_renamed_1219(byArray, 0);
            sprlc2.cfr_renamed_1197(arg0, 0, arg0.length);
            sprlc2.cfr_renamed_1197(byArray, 0, byArray.length);
            sprlc2.cfr_renamed_1219(byArray2, n3);
            n3 += n2;
            n4 = ++n;
        }
        return byArray2;
    }

    public static Vector cfr_renamed_2641(Hashtable arg0) throws IOException {
        byte[] byArray = sprzsc.cfr_renamed_2642(arg0, cfr_renamed_0);
        if (byArray == null) {
            return null;
        }
        return sprzsc.cfr_renamed_2643(byArray);
    }

    public static long cfr_renamed_2644(InputStream arg0) throws IOException {
        InputStream inputStream = arg0;
        int n = sprzsc.cfr_renamed_2645(inputStream);
        int n2 = sprzsc.cfr_renamed_2645(inputStream);
        return ((long)n & 0xFFFFFFFFL) << 24 | (long)n2 & 0xFFFFFFFFL;
    }

    public static void cfr_renamed_2646(Vector arg0, boolean arg1, OutputStream arg2) throws IOException {
        int n;
        if (arg0 == null || arg0.size() < 1 || arg0.size() >= 32768) {
            throw new IllegalArgumentException(sprqcs.cfr_renamed_9("lY>Z;E9^.N\u0018C,D*^>X.k'M$X\"^#G8\rkG>Y?\n#K=OkF.D,^#\n-X$Gk\u001bk^$\nc\u0018\u0015\u001b~\nf\nz\u0003"));
        }
        int n2 = 2 * arg0.size();
        sprzsc.cfr_renamed_2647(n2);
        sprzsc.cfr_renamed_2648(n2, arg2);
        int n3 = n = 0;
        while (n3 < arg0.size()) {
            sprzuc sprzuc2 = (sprzuc)arg0.elementAt(n);
            if (!arg1 && sprzuc2.cfr_renamed_79() == 0) {
                throw new IllegalArgumentException(sprxpo.cfr_renamed_9("\u0018>,9*#>%.\u0016'0$%\"##:e6%8%.&8>$k\u001a\u001e\u0004\u001fw\u0005\u0018\u001fw*';2*%k>%w??.w8>,9*#>%.\b*;,89>??&$k23#.98>$9"));
            }
            sprzuc2.cfr_renamed_2623(arg2);
            n3 = ++n;
        }
    }

    public static sprlc cfr_renamed_2649(int arg0) {
        switch (arg0) {
            case 0: {
                return new sprfzc();
            }
        }
        return sprzsc.cfr_renamed_2640(sprzsc.cfr_renamed_2650(arg0));
    }

    public static void cfr_renamed_2651(Hashtable arg0, Vector arg1) throws IOException {
        arg0.put(cfr_renamed_0, sprzsc.cfr_renamed_2652(arg1));
    }

    public static int cfr_renamed_2653(byte[] arg0, int arg1) {
        int n;
        int n2;
        int n3 = n2;
        n3 = n;
        n3 = (arg0[arg1] & 0xFF) << 16 | (arg0[++arg1] & 0xFF) << 8 | arg0[++arg1] & 0xFF;
        return n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_2654(int n, byte[] byArray, int n2) {
        int arg0;
        void arg2;
        void arg1;
        void v0 = arg1;
        void v1 = arg2;
        arg1[v1] = (byte)(arg0 >>> 16);
        v0[v1 + true] = (byte)(arg0 >>> 8);
        v0[n2 + 2] = (byte)arg0;
    }

    public static boolean cfr_renamed_2655(Hashtable arg0, Integer arg1, short arg2) throws IOException {
        byte[] byArray = sprzsc.cfr_renamed_2642(arg0, arg1);
        if (byArray == null) {
            return false;
        }
        if (byArray.length != 0) {
            throw new spryad(arg2);
        }
        return true;
    }

    public static boolean cfr_renamed_2656(long arg0) {
        return (arg0 & 0xFFFFFFFFL) == arg0;
    }

    public static sprpxc cfr_renamed_2657(InputStream arg0) throws IOException {
        InputStream inputStream = arg0;
        int n = inputStream.read();
        int n2 = inputStream.read();
        if (n2 < 0) {
            throw new EOFException();
        }
        return sprpxc.cfr_renamed_2658(n, n2);
    }

    public static Vector cfr_renamed_2659(boolean arg0, InputStream arg1) throws IOException {
        int n;
        int n2 = sprzsc.cfr_renamed_2660(arg1);
        if (n2 < 2 || (n2 & 1) != 0) {
            throw new spryad(50);
        }
        int n3 = n2 / 2;
        Vector<sprzuc> vector = new Vector<sprzuc>(n3);
        int n4 = n = 0;
        while (n4 < n3) {
            sprzuc sprzuc2 = sprzuc.cfr_renamed_2661(arg1);
            if (!arg0 && sprzuc2.cfr_renamed_79() == 0) {
                throw new spryad(47);
            }
            vector.addElement(sprzuc2);
            n4 = ++n;
        }
        return vector;
    }

    public static void cfr_renamed_2662(int arg0) throws IOException {
        if (!sprzsc.cfr_renamed_2663(arg0)) {
            throw new spryad(80);
        }
    }

    public static byte[] cfr_renamed_2664(sprsc arg0, String arg1, byte[] arg2) {
        if (sprzsc.cfr_renamed_2665(arg0)) {
            return arg2;
        }
        sprsc sprsc2 = arg0;
        sprgbd sprgbd2 = sprsc2.cfr_renamed_2666();
        byte[] byArray = sprgbd2.cfr_renamed_2667();
        int n = sprgbd2.cfr_renamed_2668();
        return sprzsc.cfr_renamed_2669(sprsc2, byArray, arg1, arg2, n);
    }

    public static byte[] cfr_renamed_2670(int arg0, InputStream arg1) throws IOException {
        if (arg0 < 1) {
            return cfr_renamed_1;
        }
        byte[] byArray = new byte[arg0];
        int n = sprbsa.cfr_renamed_476(arg1, byArray);
        if (n == 0) {
            return null;
        }
        if (n != arg0) {
            throw new EOFException();
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_2671(long l, byte[] byArray, int n) {
        long arg0;
        void arg2;
        void arg1;
        void v0 = arg1;
        void v1 = arg2;
        void v2 = arg1;
        void v3 = arg2;
        arg1[v3] = (byte)(arg0 >>> 40);
        v2[v3 + true] = (byte)(arg0 >>> 32);
        v2[arg2 + 2] = (byte)(arg0 >>> 24);
        arg1[v1 + 3] = (byte)(arg0 >>> 16);
        v0[v1 + 4] = (byte)(arg0 >>> 8);
        v0[n + 5] = (byte)arg0;
    }

    public static sprlc cfr_renamed_2672(int arg0, sprlc arg1) {
        switch (arg0) {
            case 0: {
                return new sprfzc((sprfzc)arg1);
            }
        }
        return sprzsc.cfr_renamed_2673(sprzsc.cfr_renamed_2650(arg0), arg1);
    }

    public static Vector cfr_renamed_2643(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprqcs.cfr_renamed_9("lO3^.D8C$D\u000fK?Kl\n(K%D$^kH.\n%_'F"));
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg0);
        Vector vector = sprzsc.cfr_renamed_2659(false, byteArrayInputStream);
        sprkxc.cfr_renamed_2674(byteArrayInputStream);
        return vector;
    }

    public static void cfr_renamed_2675(short[] arg0, OutputStream arg1) throws IOException {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprzsc.cfr_renamed_2676(arg0[n++], arg1);
            n2 = n;
        }
    }

    public static void cfr_renamed_2647(int arg0) throws IOException {
        if (!sprzsc.cfr_renamed_2677(arg0)) {
            throw new spryad(80);
        }
    }

    public static void cfr_renamed_2678(int[] arg0, byte[] arg1, int arg2) throws IOException {
        int n = 2 * arg0.length;
        sprzsc.cfr_renamed_2647(n);
        sprzsc.cfr_renamed_2679(n, arg1, arg2);
        sprzsc.cfr_renamed_2680(arg0, arg1, arg2 + 2);
    }

    public static boolean cfr_renamed_2681(int arg0) {
        return (arg0 & 0xFF) == arg0;
    }

    public static void cfr_renamed_2682(byte[] arg0, InputStream arg1) throws IOException {
        int n = arg0.length;
        if (n > 0 && n != sprbsa.cfr_renamed_476(arg1, arg0)) {
            throw new EOFException();
        }
    }

    public static byte[] cfr_renamed_2669(sprsc arg0, byte[] arg1, String arg2, byte[] arg3, int arg4) {
        if (arg0.cfr_renamed_2683().cfr_renamed_2684()) {
            throw new IllegalStateException(sprxpo.cfr_renamed_9("\u00058k\u0007\u0019\u0011k6=6\";*5'2k1$%k\u0004\u0018\u001b=dk$.$8>$9"));
        }
        byte[] byArray = sprywa.cfr_renamed_433(arg2);
        byte[] byArray2 = sprzsc.cfr_renamed_2685(byArray, arg3);
        int n = arg0.cfr_renamed_2666().cfr_renamed_2686();
        if (n == 0) {
            return sprzsc.cfr_renamed_2687(arg1, byArray, byArray2, arg4);
        }
        sprlc sprlc2 = sprzsc.cfr_renamed_2649(n);
        byte[] byArray3 = new byte[arg4];
        sprzsc.cfr_renamed_2688(sprlc2, arg1, byArray2, byArray3);
        return byArray3;
    }

    public static void cfr_renamed_2689(sprgg arg0, Vector arg1) {
        if (arg1 != null) {
            int n;
            int n2 = n = 0;
            while (n2 < arg1.size()) {
                short s = ((sprzuc)arg1.elementAt(n)).cfr_renamed_2690();
                arg0.cfr_renamed_2691(s);
                n2 = ++n;
            }
        }
    }

    public static void cfr_renamed_2692(short[] arg0, byte[] arg1, int arg2) throws IOException {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprzsc.cfr_renamed_2693(arg0[n], arg1, arg2);
            n2 = ++n;
            ++arg2;
        }
    }

    public static byte[] cfr_renamed_2694(int[] arg0) throws IOException {
        int n = 2 * arg0.length;
        byte[] byArray = new byte[2 + n];
        sprzsc.cfr_renamed_2678(arg0, byArray, 0);
        return byArray;
    }

    public static void cfr_renamed_2695(int[] arg0, OutputStream arg1) throws IOException {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprzsc.cfr_renamed_2648(arg0[n++], arg1);
            n2 = n;
        }
    }

    public static void cfr_renamed_2693(short arg0, byte[] arg1, int arg2) {
        arg1[arg2] = (byte)arg0;
    }

    static {
        cfr_renamed_1 = new byte[0];
        cfr_renamed_0 = spriwa.cfr_renamed_279(13);
        byte[] byArray = new byte[4];
        byArray[0] = 67;
        byArray[1] = 76;
        byArray[2] = 78;
        byArray[3] = 84;
        cfr_renamed_2 = byArray;
        byte[] byArray2 = new byte[4];
        byArray2[0] = 83;
        byArray2[1] = 82;
        byArray2[2] = 86;
        byArray2[3] = 82;
        cfr_renamed_3 = byArray2;
        cfr_renamed_4 = sprzsc.cfr_renamed_2696();
    }

    public static sprvva cfr_renamed_2697(byte[] arg0) throws IOException {
        sprgle sprgle2 = new sprgle(arg0);
        sprvva sprvva2 = sprgle2.cfr_renamed_24();
        if (null == sprvva2) {
            throw new spryad(50);
        }
        if (null != sprgle2.cfr_renamed_24()) {
            throw new spryad(50);
        }
        return sprvva2;
    }

    public static void cfr_renamed_2698(long arg0) throws IOException {
        if (!sprzsc.cfr_renamed_2699(arg0)) {
            throw new spryad(80);
        }
    }

    public static byte[] cfr_renamed_2700(InputStream arg0) throws IOException {
        return sprzsc.cfr_renamed_2632(sprzsc.cfr_renamed_2645(arg0), arg0);
    }

    public static int cfr_renamed_2701(InputStream arg0) throws IOException {
        InputStream inputStream = arg0;
        int n = inputStream.read();
        int n2 = inputStream.read();
        if (n2 < 0) {
            throw new EOFException();
        }
        return n << 8 | n2;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_2702(sprpxc sprpxc2, byte[] byArray, int n) {
        sprpxc arg0;
        void arg1;
        void v0 = arg1;
        v0[arg2] = (byte)arg0.cfr_renamed_2703();
        v0[n + 1] = (byte)arg0.cfr_renamed_2704();
    }

    public static int cfr_renamed_2705(byte[] arg0, int arg1) {
        int n;
        int n2 = n;
        n2 = (arg0[arg1] & 0xFF) << 8 | arg0[++arg1] & 0xFF;
        return n2;
    }

    public static void cfr_renamed_2624(byte[] arg0, OutputStream arg1) throws IOException {
        sprzsc.cfr_renamed_2647(arg0.length);
        sprzsc.cfr_renamed_2648(arg0.length, arg1);
        arg1.write(arg0);
    }

    public static void cfr_renamed_2680(int[] arg0, byte[] arg1, int arg2) throws IOException {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            sprzsc.cfr_renamed_2679(arg0[n], arg1, arg2);
            n2 = ++n;
            arg2 += 2;
        }
    }

    public static void cfr_renamed_2706(short[] arg0, OutputStream arg1) throws IOException {
        sprzsc.cfr_renamed_2639(arg0.length);
        sprzsc.cfr_renamed_2625(arg0.length, arg1);
        sprzsc.cfr_renamed_2675(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_2707(long l, OutputStream outputStream) throws IOException {
        long arg0;
        void arg1;
        void v0 = arg1;
        long l2 = arg0;
        void v2 = arg1;
        long l3 = arg0;
        arg1.write((byte)(l3 >>> 40));
        v2.write((byte)(l3 >>> 32));
        v2.write((byte)(arg0 >>> 24));
        arg1.write((byte)(l2 >>> 16));
        v0.write((byte)(l2 >>> 8));
        v0.write((byte)l);
    }

    private static /* synthetic */ byte[][] cfr_renamed_2696() {
        int n;
        int n2 = 10;
        byte[][] byArrayArray = new byte[10][];
        int n3 = n = 0;
        while (n3 < n2) {
            byte[] byArray = new byte[n + 1];
            int n4 = n++;
            sprzra.cfr_renamed_492(byArray, (byte)(65 + n4));
            byArrayArray[n4] = byArray;
            n3 = n;
        }
        return byArrayArray;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_2708(long l, byte[] byArray, int n) {
        long arg0;
        void arg2;
        void arg1;
        void v0 = arg1;
        void v1 = arg2;
        void v2 = arg1;
        void v3 = arg2;
        void v4 = arg1;
        v4[arg2] = (byte)(arg0 >>> 56);
        v4[arg2 + true] = (byte)(arg0 >>> 48);
        arg1[v3 + 2] = (byte)(arg0 >>> 40);
        v2[v3 + 3] = (byte)(arg0 >>> 32);
        v2[arg2 + 4] = (byte)(arg0 >>> 24);
        arg1[v1 + 5] = (byte)(arg0 >>> 16);
        v0[v1 + 6] = (byte)(arg0 >>> 8);
        v0[n + 7] = (byte)arg0;
    }

    public static boolean cfr_renamed_2709(int arg0) throws IOException {
        return 2 == sprzsc.cfr_renamed_2710(arg0);
    }

    public static short[] cfr_renamed_2711(int arg0, InputStream arg1) throws IOException {
        int n;
        short[] sArray = new short[arg0];
        int n2 = n = 0;
        while (n2 < arg0) {
            sArray[n++] = sprzsc.cfr_renamed_2630(arg1);
            n2 = n;
        }
        return sArray;
    }

    public static void cfr_renamed_2712(byte[] arg0, OutputStream arg1) throws IOException {
        sprzsc.cfr_renamed_2662(arg0.length);
        sprzsc.cfr_renamed_2713(arg0.length, arg1);
        arg1.write(arg0);
    }

    public static int cfr_renamed_2660(InputStream arg0) throws IOException {
        InputStream inputStream = arg0;
        int n = inputStream.read();
        int n2 = inputStream.read();
        if (n2 < 0) {
            throw new EOFException();
        }
        return n << 8 | n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean cfr_renamed_2714(short arg0) {
        switch (arg0) {
            case 1: 
            case 2: 
            case 64: {
                return true;
            }
        }
        return false;
    }

    public static byte[] cfr_renamed_2715(short[] arg0) throws IOException {
        byte[] byArray = new byte[1 + arg0.length];
        sprzsc.cfr_renamed_2716(arg0, byArray, 0);
        return byArray;
    }

    public static Vector cfr_renamed_2717() {
        return sprzsc.cfr_renamed_2718(new sprzuc(2, 3));
    }

    public static short cfr_renamed_2719(sprbbd arg0, sprbbd arg1) throws IOException {
        sprhgb sprhgb2;
        sprcge sprcge2;
        block7: {
            if (arg0.cfr_renamed_29()) {
                return -1;
            }
            sprcge2 = arg0.cfr_renamed_2720(0);
            sprdce sprdce2 = sprcge2.cfr_renamed_1489();
            sprhgb2 = sprhcd.cfr_renamed_1531(sprdce2);
            if (sprhgb2.cfr_renamed_1352()) {
                throw new spryad(80);
            }
            if (!(sprhgb2 instanceof sprmtc)) break block7;
            sprzsc.cfr_renamed_2721(sprcge2, 128);
            return 1;
        }
        try {
            if (sprhgb2 instanceof spruld) {
                sprzsc.cfr_renamed_2721(sprcge2, 128);
                return 2;
            }
            if (sprhgb2 instanceof sprwmd) {
                sprzsc.cfr_renamed_2721(sprcge2, 128);
                return 64;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        throw new spryad(43);
    }

    public static boolean cfr_renamed_2677(int arg0) {
        return (arg0 & 0xFFFF) == arg0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sprtzd cfr_renamed_2722(short arg0) {
        switch (arg0) {
            case 1: {
                return sprm.cfr_renamed_102;
            }
            case 2: {
                return sprs.cfr_renamed_722;
            }
            case 3: {
                return sprdg.spr\ufe34;
            }
            case 4: {
                return sprdg.cfr_renamed_119;
            }
            case 5: {
                return sprdg.cfr_renamed_112;
            }
            case 6: {
                return sprdg.cfr_renamed_107;
            }
        }
        throw new IllegalArgumentException(sprqcs.cfr_renamed_9("_%A%E<Dkb*Y#k'M$X\"^#G"));
    }

    public static void cfr_renamed_2716(short[] arg0, byte[] arg1, int arg2) throws IOException {
        sprzsc.cfr_renamed_2639(arg0.length);
        sprzsc.cfr_renamed_2723(arg0.length, arg1, arg2);
        sprzsc.cfr_renamed_2692(arg0, arg1, arg2 + 1);
    }

    public static sprzc cfr_renamed_2724(byte[] arg0, spruuc arg1) {
        return new sprirc(arg0, arg1);
    }

    public static byte[] cfr_renamed_2652(Vector arg0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        sprzsc.cfr_renamed_2646(arg0, false, byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }

    public static byte[] cfr_renamed_2725(sprsc arg0, byte[] arg1) {
        sprsc sprsc2 = arg0;
        sprgbd sprgbd2 = sprsc2.cfr_renamed_2666();
        byte[] byArray = sprzsc.cfr_renamed_2685(sprgbd2.cfr_renamed_2726(), sprgbd2.cfr_renamed_2727());
        if (sprzsc.cfr_renamed_2665(sprsc2)) {
            return sprzsc.spr\ufe34\ufe34(arg1, byArray);
        }
        return sprzsc.cfr_renamed_2669(arg0, arg1, "master secret", byArray, 48);
    }

    public static boolean cfr_renamed_2728(long arg0) {
        return true;
    }

    public static boolean cfr_renamed_2729(int arg0) throws IOException {
        return 0 == sprzsc.cfr_renamed_2710(arg0);
    }

    public static byte[] cfr_renamed_2629(InputStream arg0) throws IOException {
        return sprzsc.cfr_renamed_2632(sprzsc.cfr_renamed_2660(arg0), arg0);
    }

    public static byte[] cfr_renamed_2642(Hashtable arg0, Integer arg1) {
        if (arg0 == null) {
            return null;
        }
        return (byte[])arg0.get(arg1);
    }

    public static void cfr_renamed_2730(long arg0) throws IOException {
        if (!sprzsc.cfr_renamed_2728(arg0)) {
            throw new spryad(80);
        }
    }

    public static long cfr_renamed_2731(InputStream arg0) throws IOException {
        InputStream inputStream = arg0;
        int n = inputStream.read();
        int n2 = inputStream.read();
        int n3 = inputStream.read();
        int n4 = inputStream.read();
        if (n4 < 0) {
            throw new EOFException();
        }
        return (long)(n << 2 | n2 << 16 | n3 << 8 | n4) & 0xFFFFFFFFL;
    }

    public static boolean cfr_renamed_2663(int arg0) {
        return (arg0 & 0xFFFFFF) == arg0;
    }

    public static byte[] cfr_renamed_2687(byte[] arg0, byte[] arg1, byte[] arg2, int arg3) {
        int n;
        int n2 = (arg0.length + 1) / 2;
        byte[] byArray = new byte[n2];
        byte[] byArray2 = new byte[n2];
        byte[] byArray3 = arg0;
        System.arraycopy(byArray3, 0, byArray, 0, n2);
        System.arraycopy(byArray3, arg0.length - n2, byArray2, 0, n2);
        byte[] byArray4 = new byte[arg3];
        byte[] byArray5 = new byte[arg3];
        sprzsc.cfr_renamed_2688(sprzsc.cfr_renamed_2640((short)1), byArray, arg2, byArray4);
        sprzsc.cfr_renamed_2688(sprzsc.cfr_renamed_2640((short)2), byArray2, arg2, byArray5);
        int n3 = n = 0;
        while (n3 < arg3) {
            int n4 = n;
            byte by = (byte)(byArray4[n4] ^ byArray5[n]);
            byArray4[n4] = by;
            n3 = ++n;
        }
        return byArray4;
    }

    public static boolean cfr_renamed_2732(int arg0) throws IOException {
        return 1 == sprzsc.cfr_renamed_2710(arg0);
    }

    public static boolean cfr_renamed_2733(long arg0) {
        return (arg0 & 0xFFFFFFL) == arg0;
    }

    public static boolean cfr_renamed_2665(sprsc arg0) {
        return arg0.cfr_renamed_2683().cfr_renamed_2684();
    }

    public static int cfr_renamed_2734(byte[] arg0, int arg1) throws IOException {
        return arg0[arg1] << 8 | arg0[arg1 + 1];
    }

    public static byte[] cfr_renamed_2632(int arg0, InputStream arg1) throws IOException {
        if (arg0 < 1) {
            return cfr_renamed_1;
        }
        byte[] byArray = new byte[arg0];
        if (arg0 != sprbsa.cfr_renamed_476(arg1, byArray)) {
            throw new EOFException();
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_2735(long l, OutputStream outputStream) throws IOException {
        long arg0;
        void arg1;
        void v0 = arg1;
        long l2 = arg0;
        arg1.write((byte)(arg0 >>> 24));
        arg1.write((byte)(l2 >>> 16));
        v0.write((byte)(l2 >>> 8));
        v0.write((byte)l);
    }

    public static void cfr_renamed_2736(byte[] arg0, int arg1) {
        int n = (int)(System.currentTimeMillis() / 1000L);
        int n2 = arg1;
        arg0[arg1] = (byte)(n >>> 24);
        arg0[n2 + 1] = (byte)(n >>> 16);
        arg0[n2 + 2] = (byte)(n >>> 8);
        arg0[arg1 + 3] = (byte)n;
    }

    public static Vector cfr_renamed_2737() {
        return sprzsc.cfr_renamed_2718(new sprzuc(2, 2));
    }

    public static void cfr_renamed_2738(long arg0) throws IOException {
        if (!sprzsc.cfr_renamed_2656(arg0)) {
            throw new spryad(80);
        }
    }

    public static sprlc cfr_renamed_2640(short arg0) {
        switch (arg0) {
            case 1: {
                return new sprfmd();
            }
            case 2: {
                return new sprlid();
            }
            case 3: {
                return new sprued();
            }
            case 4: {
                return new sprtfd();
            }
            case 5: {
                return new sproed();
            }
            case 6: {
                return new sprvhd();
            }
        }
        throw new IllegalArgumentException(sprxpo.cfr_renamed_9("\"%<%8<9k\u001f*$#\u0016'0$%\"##:"));
    }

    public static boolean cfr_renamed_2739(long arg0) {
        return (arg0 & 0xFFL) == arg0;
    }

    public static void cfr_renamed_2676(short arg0, OutputStream arg1) throws IOException {
        arg1.write(arg0);
    }

    public static boolean cfr_renamed_2740(long arg0) {
        return (arg0 & 0xFFFFL) == arg0;
    }

    public static byte[] cfr_renamed_2741(byte[] arg0) throws IOException {
        sprzsc.cfr_renamed_2639(arg0.length);
        return sprzra.cfr_renamed_560(arg0, (byte)arg0.length);
    }

    public static void cfr_renamed_2688(sprlc arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        int n;
        sprced sprced2 = new sprced(arg0);
        sprced2.cfr_renamed_1524(new sprnld(arg1));
        byte[] byArray = arg2;
        int n2 = arg0.cfr_renamed_1218();
        int n3 = (arg3.length + n2 - 1) / n2;
        sprced sprced3 = sprced2;
        byte[] byArray2 = new byte[sprced3.cfr_renamed_2404()];
        byte[] byArray3 = new byte[sprced3.cfr_renamed_2404()];
        int n4 = n = 0;
        while (n4 < n3) {
            sprced2.cfr_renamed_1197(byArray, 0, byArray.length);
            sprced sprced4 = sprced2;
            sprced4.cfr_renamed_1219(byArray2, 0);
            byArray = byArray2;
            sprced4.cfr_renamed_1197(byArray, 0, byArray.length);
            sprced2.cfr_renamed_1197(arg2, 0, arg2.length);
            sprced2.cfr_renamed_1219(byArray3, 0);
            System.arraycopy(byArray3, 0, arg3, n2 * ++n, Math.min(n2, arg3.length - n2 * n));
            n4 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_2713(int n, OutputStream outputStream) throws IOException {
        int arg0;
        void arg1;
        void v0 = arg1;
        int n2 = arg0;
        arg1.write((byte)(n2 >>> 16));
        v0.write((byte)(n2 >>> 8));
        v0.write((byte)n);
    }

    public static boolean cfr_renamed_2631(sprsc arg0) {
        return sprpxc.cfr_renamed_119.cfr_renamed_2742(arg0.cfr_renamed_2683().cfr_renamed_2743());
    }

    public static byte[] cfr_renamed_2744(byte[] arg0, byte[] arg1, int arg2) {
        byte[] byArray;
        int n;
        sprlc sprlc2 = sprzsc.cfr_renamed_2640((short)1);
        sprlc sprlc3 = sprzsc.cfr_renamed_2640((short)2);
        int n2 = sprlc2.cfr_renamed_1218();
        byte[] byArray2 = new byte[sprlc3.cfr_renamed_1218()];
        byte[] byArray3 = new byte[arg2 + n2];
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < arg2) {
            byArray = cfr_renamed_4[n3];
            sprlc3.cfr_renamed_1197(byArray, 0, byArray.length);
            sprlc3.cfr_renamed_1197(arg0, 0, arg0.length);
            sprlc3.cfr_renamed_1197(arg1, 0, arg1.length);
            sprlc3.cfr_renamed_1219(byArray2, 0);
            sprlc2.cfr_renamed_1197(arg0, 0, arg0.length);
            sprlc2.cfr_renamed_1197(byArray2, 0, byArray2.length);
            sprlc2.cfr_renamed_1219(byArray3, n);
            ++n3;
            n4 = n += n2;
        }
        byArray = new byte[arg2];
        System.arraycopy(byArray3, 0, byArray, 0, arg2);
        return byArray;
    }

    public static void cfr_renamed_2745(long arg0) throws IOException {
        if (!sprzsc.cfr_renamed_2740(arg0)) {
            throw new spryad(80);
        }
    }

    public static int cfr_renamed_2710(int arg0) throws IOException {
        switch (sprzsc.cfr_renamed_2746(arg0)) {
            case 10: 
            case 11: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 102: {
                return 2;
            }
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 12: 
            case 13: 
            case 14: {
                return 1;
            }
            case 1: 
            case 2: 
            case 100: 
            case 101: {
                while (false) {
                }
                return 0;
            }
        }
        throw new spryad(80);
    }

    private static /* synthetic */ Vector cfr_renamed_2718(Object arg0) {
        Vector<Object> vector = new Vector<Object>(1);
        vector.addElement(arg0);
        return vector;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_2747(long l, byte[] byArray, int n) {
        long arg0;
        void arg2;
        void arg1;
        void v0 = arg1;
        void v1 = arg2;
        arg1[arg2] = (byte)(arg0 >>> 24);
        arg1[v1 + true] = (byte)(arg0 >>> 16);
        v0[v1 + 2] = (byte)(arg0 >>> 8);
        v0[n + 3] = (byte)arg0;
    }

    public static void cfr_renamed_2625(int arg0, OutputStream arg1) throws IOException {
        arg1.write(arg0);
    }

    public static void cfr_renamed_2748(long arg0) throws IOException {
        if (!sprzsc.cfr_renamed_2739(arg0)) {
            throw new spryad(80);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_2749(sprpxc sprpxc2, OutputStream outputStream) throws IOException {
        sprpxc arg0;
        void arg1;
        void v0 = arg1;
        v0.write(arg0.cfr_renamed_2703());
        v0.write(sprpxc2.cfr_renamed_2704());
    }

    public static boolean cfr_renamed_2750(int arg0, sprpxc arg1) {
        return sprzsc.cfr_renamed_2751(arg0).cfr_renamed_2742(arg1.cfr_renamed_2743());
    }

    public static void cfr_renamed_2752(int[] arg0, OutputStream arg1) throws IOException {
        int n = 2 * arg0.length;
        sprzsc.cfr_renamed_2647(n);
        sprzsc.cfr_renamed_2648(n, arg1);
        sprzsc.cfr_renamed_2695(arg0, arg1);
    }

    public static short cfr_renamed_2630(InputStream arg0) throws IOException {
        int n = arg0.read();
        if (n < 0) {
            throw new EOFException();
        }
        return (short)n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sprpxc cfr_renamed_2751(int arg0) {
        switch (arg0) {
            case 59: 
            case 60: 
            case 61: 
            case 62: 
            case 63: 
            case 64: 
            case 103: 
            case 104: 
            case 105: 
            case 106: 
            case 107: 
            case 156: 
            case 157: 
            case 158: 
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 168: 
            case 169: 
            case 170: 
            case 171: 
            case 172: 
            case 173: 
            case 186: 
            case 187: 
            case 188: 
            case 189: 
            case 190: 
            case 191: 
            case 192: 
            case 193: 
            case 194: 
            case 195: 
            case 196: 
            case 197: 
            case 49187: 
            case 49188: 
            case 49189: 
            case 49190: 
            case 49191: 
            case 49192: 
            case 49193: 
            case 49194: 
            case 49195: 
            case 49196: 
            case 49197: 
            case 49198: 
            case 49199: 
            case 49200: 
            case 49201: 
            case 49202: 
            case 49266: 
            case 49267: 
            case 49268: 
            case 49269: 
            case 49270: 
            case 49271: 
            case 49272: 
            case 49273: 
            case 49274: 
            case 49275: 
            case 49276: 
            case 49277: 
            case 49278: 
            case 49279: 
            case 49280: 
            case 49281: 
            case 49282: 
            case 49283: 
            case 49284: 
            case 49285: 
            case 49286: 
            case 49287: 
            case 49288: 
            case 49289: 
            case 49290: 
            case 49291: 
            case 49292: 
            case 49293: 
            case 49294: 
            case 49295: 
            case 49296: 
            case 49297: 
            case 49298: 
            case 49299: 
            case 49308: 
            case 49309: 
            case 49310: 
            case 49311: 
            case 49312: 
            case 49313: 
            case 49314: 
            case 49315: 
            case 49316: 
            case 49317: 
            case 49318: 
            case 49319: 
            case 49320: 
            case 49321: 
            case 49322: 
            case 49323: 
            case 52243: 
            case 52244: 
            case 52245: {
                return sprpxc.cfr_renamed_119;
            }
        }
        return sprpxc.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_2679(int n, byte[] byArray, int n2) {
        int arg0;
        void arg1;
        void v0 = arg1;
        v0[arg2] = (byte)(arg0 >>> 8);
        v0[n2 + 1] = (byte)arg0;
    }

    public static byte[] cfr_renamed_2753(sprsc arg0, int arg1) {
        sprsc sprsc2 = arg0;
        sprgbd sprgbd2 = sprsc2.cfr_renamed_2666();
        byte[] byArray = sprgbd2.cfr_renamed_2667();
        byte[] byArray2 = sprzsc.cfr_renamed_2685(sprgbd2.cfr_renamed_2727(), sprgbd2.cfr_renamed_2726());
        if (sprzsc.cfr_renamed_2665(sprsc2)) {
            return sprzsc.cfr_renamed_2744(byArray, byArray2, arg1);
        }
        return sprzsc.cfr_renamed_2669(arg0, byArray, "key expansion", byArray2, arg1);
    }

    public static int[] cfr_renamed_2754(int arg0, InputStream arg1) throws IOException {
        int n;
        int[] nArray = new int[arg0];
        int n2 = n = 0;
        while (n2 < arg0) {
            nArray[n++] = sprzsc.cfr_renamed_2660(arg1);
            n2 = n;
        }
        return nArray;
    }

    public static void cfr_renamed_2639(int arg0) throws IOException {
        if (!sprzsc.cfr_renamed_2681(arg0)) {
            throw new spryad(80);
        }
    }

    public static boolean cfr_renamed_2755(sprsc arg0) {
        return sprpxc.cfr_renamed_1.cfr_renamed_2742(arg0.cfr_renamed_2683().cfr_renamed_2743());
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_2648(int n, OutputStream outputStream) throws IOException {
        int arg0;
        void arg1;
        void v0 = arg1;
        v0.write(arg0 >>> 8);
        v0.write(n);
    }

    public static int cfr_renamed_2645(InputStream arg0) throws IOException {
        InputStream inputStream = arg0;
        int n = inputStream.read();
        int n2 = inputStream.read();
        int n3 = inputStream.read();
        if (n3 < 0) {
            throw new EOFException();
        }
        return n << 16 | n2 << 8 | n3;
    }

    public static boolean cfr_renamed_2756(sprpxc arg0) {
        return sprpxc.cfr_renamed_119.cfr_renamed_2742(arg0.cfr_renamed_2743());
    }

    public static void cfr_renamed_2721(sprcge arg0, int arg1) throws IOException {
        sprzfe sprzfe2;
        sprszd sprszd2 = arg0.cfr_renamed_2151().cfr_renamed_98();
        if (sprszd2 != null && (sprzfe2 = sprzfe.cfr_renamed_2757(sprszd2)) != null && (sprzfe2.cfr_renamed_81()[0] & 0xFF & arg1) != arg1) {
            throw new spryad(46);
        }
    }

    public static void cfr_renamed_2723(int arg0, byte[] arg1, int arg2) {
        arg1[arg2] = (byte)arg0;
    }

    public static void cfr_renamed_2758(short arg0) throws IOException {
        if (!sprzsc.cfr_renamed_2759(arg0)) {
            throw new spryad(80);
        }
    }

    public static byte[] cfr_renamed_2685(byte[] arg0, byte[] arg1) {
        byte[] byArray = new byte[arg0.length + arg1.length];
        System.arraycopy(arg0, 0, byArray, 0, arg0.length);
        System.arraycopy(arg1, 0, byArray, arg0.length, arg1.length);
        return byArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int cfr_renamed_2746(int arg0) throws IOException {
        switch (arg0) {
            case 10: 
            case 13: 
            case 16: 
            case 19: 
            case 22: 
            case 139: 
            case 143: 
            case 147: 
            case 49155: 
            case 49160: 
            case 49165: 
            case 49170: 
            case 49178: 
            case 49179: 
            case 49180: 
            case 49204: {
                return 7;
            }
            case 52243: 
            case 52244: 
            case 52245: {
                return 102;
            }
            case 47: 
            case 48: 
            case 49: 
            case 50: 
            case 51: 
            case 140: 
            case 144: 
            case 148: 
            case 49156: 
            case 49161: 
            case 49166: 
            case 49171: 
            case 49181: 
            case 49182: 
            case 49183: 
            case 49205: {
                return 8;
            }
            case 60: 
            case 62: 
            case 63: 
            case 64: 
            case 103: 
            case 174: 
            case 178: 
            case 182: 
            case 49187: 
            case 49189: 
            case 49191: 
            case 49193: 
            case 49207: {
                return 8;
            }
            case 49308: 
            case 49310: 
            case 49316: 
            case 49318: {
                return 15;
            }
            case 49312: 
            case 49314: 
            case 49320: 
            case 49322: {
                return 16;
            }
            case 156: 
            case 158: 
            case 160: 
            case 162: 
            case 164: 
            case 168: 
            case 170: 
            case 172: 
            case 49195: 
            case 49197: 
            case 49199: 
            case 49201: {
                return 10;
            }
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 141: 
            case 145: 
            case 149: 
            case 49157: 
            case 49162: 
            case 49167: 
            case 49172: 
            case 49184: 
            case 49185: 
            case 49186: 
            case 49206: {
                return 9;
            }
            case 61: 
            case 104: 
            case 105: 
            case 106: 
            case 107: {
                return 9;
            }
            case 175: 
            case 179: 
            case 183: 
            case 49188: 
            case 49190: 
            case 49192: 
            case 49194: 
            case 49208: {
                return 9;
            }
            case 49309: 
            case 49311: 
            case 49317: 
            case 49319: {
                return 17;
            }
            case 49313: 
            case 49315: 
            case 49321: 
            case 49323: {
                return 18;
            }
            case 157: 
            case 159: 
            case 161: 
            case 163: 
            case 165: 
            case 169: 
            case 171: 
            case 173: 
            case 49196: 
            case 49198: 
            case 49200: 
            case 49202: {
                return 11;
            }
            case 65: 
            case 66: 
            case 67: 
            case 68: 
            case 69: {
                return 12;
            }
            case 186: 
            case 187: 
            case 188: 
            case 189: 
            case 190: 
            case 49266: 
            case 49268: 
            case 49270: 
            case 49272: 
            case 49300: 
            case 49302: 
            case 49304: 
            case 49306: {
                return 12;
            }
            case 49274: 
            case 49276: 
            case 49278: 
            case 49280: 
            case 49282: 
            case 49286: 
            case 49288: 
            case 49290: 
            case 49292: 
            case 49294: 
            case 49296: 
            case 49298: {
                return 19;
            }
            case 132: 
            case 133: 
            case 134: 
            case 135: 
            case 136: {
                return 13;
            }
            case 192: 
            case 193: 
            case 194: 
            case 195: 
            case 196: {
                return 13;
            }
            case 49267: 
            case 49269: 
            case 49271: 
            case 49273: 
            case 49301: 
            case 49303: 
            case 49305: 
            case 49307: {
                return 13;
            }
            case 49275: 
            case 49277: 
            case 49279: 
            case 49281: 
            case 49283: 
            case 49287: 
            case 49289: 
            case 49291: 
            case 49293: 
            case 49295: 
            case 49297: 
            case 49299: {
                return 20;
            }
            case 58384: 
            case 58386: 
            case 58388: 
            case 58390: 
            case 58392: 
            case 58394: 
            case 58396: 
            case 58398: {
                return 100;
            }
            case 1: {
                return 0;
            }
            case 2: 
            case 44: 
            case 45: 
            case 46: 
            case 49153: 
            case 49158: 
            case 49163: 
            case 49168: 
            case 49209: {
                return 0;
            }
            case 59: 
            case 176: 
            case 180: 
            case 184: 
            case 49210: {
                return 0;
            }
            case 177: 
            case 181: 
            case 185: 
            case 49211: {
                return 0;
            }
            case 4: 
            case 24: {
                return 2;
            }
            case 5: 
            case 138: 
            case 142: 
            case 146: 
            case 49154: 
            case 49159: 
            case 49164: 
            case 49169: 
            case 49174: 
            case 49203: {
                return 2;
            }
            case 58385: 
            case 58387: 
            case 58389: 
            case 58391: 
            case 58393: 
            case 58395: 
            case 58397: 
            case 58399: {
                return 101;
            }
            case 150: 
            case 151: 
            case 152: 
            case 153: 
            case 154: {
                return 14;
            }
        }
        throw new spryad(80);
    }

    public static byte[] cfr_renamed_2629(byte[] arg0, String arg1, byte[] arg2, int arg3) {
        byte[] byArray = sprywa.cfr_renamed_433(arg1);
        byte[] byArray2 = sprzsc.cfr_renamed_2685(byArray, arg2);
        return sprzsc.cfr_renamed_2687(arg0, byArray, byArray2, arg3);
    }

    /*
     * WARNING - void declaration
     */
    public static void cfr_renamed_2760(long l, OutputStream outputStream) throws IOException {
        long arg0;
        void arg1;
        void v0 = arg1;
        long l2 = arg0;
        void v2 = arg1;
        long l3 = arg0;
        void v4 = arg1;
        v4.write((byte)(arg0 >>> 56));
        v4.write((byte)(arg0 >>> 48));
        arg1.write((byte)(l3 >>> 40));
        v2.write((byte)(l3 >>> 32));
        v2.write((byte)(arg0 >>> 24));
        arg1.write((byte)(l2 >>> 16));
        v0.write((byte)(l2 >>> 8));
        v0.write((byte)l);
    }

    public static long cfr_renamed_2761(byte[] arg0, int arg1) {
        int n;
        int n2;
        int n3;
        int n4 = n3;
        n4 = n2;
        n4 = n;
        n4 = (arg0[arg1] & 0xFF) << 24 | (arg0[++arg1] & 0xFF) << 16 | (arg0[++arg1] & 0xFF) << 8 | arg0[++arg1] & 0xFF;
        return (long)n4 & 0xFFFFFFFFL;
    }

    public static short cfr_renamed_2762(byte[] arg0, int arg1) {
        return arg0[arg1];
    }

    public static byte[] cfr_renamed_2763(InputStream arg0) throws IOException {
        return sprzsc.cfr_renamed_2632(sprzsc.cfr_renamed_2630(arg0), arg0);
    }

    public static sprlc cfr_renamed_2673(short arg0, sprlc arg1) {
        switch (arg0) {
            case 1: {
                return new sprfmd((sprfmd)arg1);
            }
            case 2: {
                return new sprlid((sprlid)arg1);
            }
            case 3: {
                return new sprued((sprued)arg1);
            }
            case 4: {
                return new sprtfd((sprtfd)arg1);
            }
            case 5: {
                return new sproed((sproed)arg1);
            }
            case 6: {
                return new sprvhd((sprvhd)arg1);
            }
        }
        throw new IllegalArgumentException(sprqcs.cfr_renamed_9("_%A%E<Dkb*Y#k'M$X\"^#G"));
    }

    public static long cfr_renamed_2764(byte[] arg0, int arg1) {
        int n = sprzsc.cfr_renamed_2653(arg0, arg1);
        int n2 = sprzsc.cfr_renamed_2653(arg0, arg1 + 3);
        return ((long)n & 0xFFFFFFFFL) << 24 | (long)n2 & 0xFFFFFFFFL;
    }

    public static sprkc cfr_renamed_2765(short arg0) {
        switch (arg0) {
            case 2: {
                return new sprlxc();
            }
            case 64: {
                return new sprixc();
            }
            case 1: {
                return new sprayc();
            }
        }
        throw new IllegalArgumentException(sprxpo.cfr_renamed_9("p(;\"2%#\b29#\"1\"4*#.\u00032'.pk>8w%8?w*w?.;2k \"##w8>,9\"9,w(6;6)>'>?."));
    }

    public static Vector cfr_renamed_2766() {
        return sprzsc.cfr_renamed_2718(new sprzuc(2, 1));
    }

    public static boolean cfr_renamed_2699(long arg0) {
        return (arg0 & 0xFFFFFFFFFFFFL) == arg0;
    }

    public static sprpxc cfr_renamed_2767(byte[] arg0, int arg1) throws IOException {
        return sprpxc.cfr_renamed_2658(arg0[arg1] & 0xFF, arg0[arg1 + 1] & 0xFF);
    }

    public static sprvva cfr_renamed_2768(byte[] arg0) throws IOException {
        sprvva sprvva2 = sprzsc.cfr_renamed_2697(arg0);
        if (!sprzra.cfr_renamed_92(sprvva2.cfr_renamed_104("DER"), arg0)) {
            throw new spryad(50);
        }
        return sprvva2;
    }

    public static boolean cfr_renamed_2759(short arg0) {
        return (arg0 & 0xFF) == arg0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static short cfr_renamed_2650(int arg0) {
        switch (arg0) {
            case 0: {
                throw new IllegalArgumentException(sprqcs.cfr_renamed_9("'O,K(Skz\u0019lkD$^kKk\\*F\"NkK'M$X\"^#G"));
            }
            case 1: {
                return 4;
            }
            case 2: {
                return 5;
            }
        }
        throw new IllegalArgumentException(sprxpo.cfr_renamed_9(">9 9$ %w\u001b\u0005\r\u0016'0$%\"##:"));
    }

    public static void cfr_renamed_2769(long arg0) throws IOException {
        if (!sprzsc.cfr_renamed_2733(arg0)) {
            throw new spryad(80);
        }
    }
}

