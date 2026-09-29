/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprabd;
import com.spire.presentation.packages.sprbzc;
import com.spire.presentation.packages.sprevc;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprjyc;
import com.spire.presentation.packages.sprkxc;
import com.spire.presentation.packages.sprsxy;
import com.spire.presentation.packages.sprvlh;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzsc;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;

public class sprbcd {
    public static final Integer cfr_renamed_91 = spriwa.cfr_renamed_279(22);
    public static final Integer cfr_renamed_0;
    public static final Integer cfr_renamed_1;
    public static final Integer cfr_renamed_2;
    public static final Integer cfr_renamed_3;
    public static final Integer cfr_renamed_4;

    public static sprevc cfr_renamed_2959(Hashtable arg0) throws IOException {
        byte[] byArray = sprzsc.cfr_renamed_2642(arg0, cfr_renamed_0);
        if (byArray == null) {
            return null;
        }
        return sprbcd.cfr_renamed_2960(byArray);
    }

    public static byte[] cfr_renamed_2961(sprevc arg0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        if (arg0 == null) {
            throw new spryad(80);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        arg0.cfr_renamed_2623(byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }

    public static short cfr_renamed_2962(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprvlh.cfr_renamed_9("3|lmqwgp{wPx`x39wxzw{m4{q9zlxu"));
        }
        if (arg0.length != 1) {
            throw new spryad(50);
        }
        short s = arg0[0];
        if (!sprbzc.cfr_renamed_2963(s)) {
            throw new spryad(47);
        }
        return s;
    }

    public static boolean cfr_renamed_2836(Hashtable arg0) throws IOException {
        byte[] byArray = sprzsc.cfr_renamed_2642(arg0, cfr_renamed_4);
        if (byArray == null) {
            return false;
        }
        return sprbcd.cfr_renamed_2964(byArray);
    }

    public static byte[] cfr_renamed_2965() {
        return sprbcd.cfr_renamed_2966();
    }

    public static boolean cfr_renamed_2834(Hashtable arg0) throws IOException {
        byte[] byArray = sprzsc.cfr_renamed_2642(arg0, cfr_renamed_91);
        if (byArray == null) {
            return false;
        }
        return sprbcd.cfr_renamed_2967(byArray);
    }

    public static sprabd cfr_renamed_2968(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprsxy.cfr_renamed_9("\rZRKOQYVEQn^^^\r\u001fI^DQEK\n]O\u001fDJFS"));
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg0);
        sprabd sprabd2 = sprabd.cfr_renamed_2661(byteArrayInputStream);
        sprkxc.cfr_renamed_2674(byteArrayInputStream);
        return sprabd2;
    }

    public static byte[] cfr_renamed_2969(short arg0) throws IOException {
        if (!sprbzc.cfr_renamed_2963(arg0)) {
            throw new spryad(80);
        }
        byte[] byArray = new byte[1];
        byArray[0] = (byte)arg0;
        return byArray;
    }

    private static /* synthetic */ boolean cfr_renamed_2970(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprvlh.cfr_renamed_9("3|lmqwgp{wPx`x39wxzw{m4{q9zlxu"));
        }
        if (arg0.length != 0) {
            throw new spryad(47);
        }
        return true;
    }

    public static boolean cfr_renamed_2967(byte[] arg0) throws IOException {
        return sprbcd.cfr_renamed_2970(arg0);
    }

    public static void cfr_renamed_2971(Hashtable arg0, short arg1) throws IOException {
        arg0.put(cfr_renamed_2, sprbcd.cfr_renamed_2969(arg1));
    }

    public static Hashtable cfr_renamed_2832(Hashtable arg0) {
        if (arg0 == null) {
            return new Hashtable();
        }
        return arg0;
    }

    public static void cfr_renamed_2972(Hashtable arg0) {
        arg0.put(cfr_renamed_4, sprbcd.cfr_renamed_2965());
    }

    public static sprjyc cfr_renamed_2973(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprsxy.cfr_renamed_9("\rZRKOQYVEQn^^^\r\u001fI^DQEK\n]O\u001fDJFS"));
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg0);
        sprjyc sprjyc2 = sprjyc.cfr_renamed_2661(byteArrayInputStream);
        sprkxc.cfr_renamed_2674(byteArrayInputStream);
        return sprjyc2;
    }

    public static sprjyc cfr_renamed_2974(Hashtable arg0) throws IOException {
        byte[] byArray = sprzsc.cfr_renamed_2642(arg0, cfr_renamed_3);
        if (byArray == null) {
            return null;
        }
        return sprbcd.cfr_renamed_2973(byArray);
    }

    public static sprevc cfr_renamed_2960(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprvlh.cfr_renamed_9("3|lmqwgp{wPx`x39wxzw{m4{q9zlxu"));
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg0);
        sprevc sprevc2 = sprevc.cfr_renamed_2661(byteArrayInputStream);
        sprkxc.cfr_renamed_2674(byteArrayInputStream);
        return sprevc2;
    }

    public static byte[] cfr_renamed_2975(sprjyc arg0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        if (arg0 == null) {
            throw new spryad(80);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        arg0.cfr_renamed_2623(byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }

    public static byte[] cfr_renamed_2976() {
        return sprbcd.cfr_renamed_2966();
    }

    public static byte[] cfr_renamed_2977(sprabd arg0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        if (arg0 == null) {
            throw new spryad(80);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        arg0.cfr_renamed_2623(byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }

    public static void cfr_renamed_2978(Hashtable arg0) {
        arg0.put(cfr_renamed_91, sprbcd.cfr_renamed_2976());
    }

    public static boolean cfr_renamed_2964(byte[] arg0) throws IOException {
        return sprbcd.cfr_renamed_2970(arg0);
    }

    public static short cfr_renamed_2930(Hashtable arg0) throws IOException {
        byte[] byArray = sprzsc.cfr_renamed_2642(arg0, cfr_renamed_2);
        if (byArray == null) {
            return -1;
        }
        return sprbcd.cfr_renamed_2962(byArray);
    }

    public static sprabd cfr_renamed_2979(Hashtable arg0) throws IOException {
        byte[] byArray = sprzsc.cfr_renamed_2642(arg0, cfr_renamed_1);
        if (byArray == null) {
            return null;
        }
        return sprbcd.cfr_renamed_2968(byArray);
    }

    public static void cfr_renamed_2980(Hashtable arg0, sprevc arg1) throws IOException {
        arg0.put(cfr_renamed_0, sprbcd.cfr_renamed_2961(arg1));
    }

    public static byte[] cfr_renamed_2966() {
        return sprzsc.cfr_renamed_1;
    }

    public static void cfr_renamed_2981(Hashtable arg0, sprabd arg1) throws IOException {
        arg0.put(cfr_renamed_1, sprbcd.cfr_renamed_2977(arg1));
    }

    static {
        cfr_renamed_3 = spriwa.cfr_renamed_279(15);
        cfr_renamed_2 = spriwa.cfr_renamed_279(1);
        cfr_renamed_1 = spriwa.cfr_renamed_279(0);
        cfr_renamed_0 = spriwa.cfr_renamed_279(5);
        cfr_renamed_4 = spriwa.cfr_renamed_279(4);
    }

    public static void cfr_renamed_2982(Hashtable arg0, sprjyc arg1) throws IOException {
        arg0.put(cfr_renamed_3, sprbcd.cfr_renamed_2975(arg1));
    }
}

