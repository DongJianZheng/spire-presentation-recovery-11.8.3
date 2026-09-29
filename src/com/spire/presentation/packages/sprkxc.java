/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbd;
import com.spire.presentation.packages.sprbcd;
import com.spire.presentation.packages.sprcrc;
import com.spire.presentation.packages.sprfcd;
import com.spire.presentation.packages.sprfwc;
import com.spire.presentation.packages.sprgbd;
import com.spire.presentation.packages.sprgcd;
import com.spire.presentation.packages.sprgg;
import com.spire.presentation.packages.sprhj;
import com.spire.presentation.packages.sprirc;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprlbd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmuc;
import com.spire.presentation.packages.sproc;
import com.spire.presentation.packages.sprpxc;
import com.spire.presentation.packages.sprsbd;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprtj;
import com.spire.presentation.packages.sprubs;
import com.spire.presentation.packages.spruuc;
import com.spire.presentation.packages.sprxbd;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzc;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsc;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public abstract class sprkxc {
    private volatile boolean cfr_renamed_955;
    public static final short cfr_renamed_1228 = 16;
    public static final short cfr_renamed_1260 = 12;
    public SecureRandom cfr_renamed_499;
    public short cfr_renamed_135;
    private static final String cfr_renamed_956 = "Internal TLS error, this could be an attack";
    public int[] cfr_renamed_952;
    private volatile boolean cfr_renamed_728;
    private sprxbd cfr_renamed_128;
    public static final short cfr_renamed_957 = 5;
    public static final short cfr_renamed_314 = 6;
    private sprfwc cfr_renamed_951;
    public static final Integer cfr_renamed_84;
    private volatile boolean cfr_renamed_723;
    public static final short cfr_renamed_1226 = 15;
    public static final short cfr_renamed_287 = 9;
    public boolean cfr_renamed_724;
    private byte[] cfr_renamed_953;
    public sprgcd cfr_renamed_133;
    public static final short cfr_renamed_185 = 2;
    public static final short spr\ufe34 = 3;
    public spruuc cfr_renamed_82;
    public sprgbd cfr_renamed_126;
    public boolean cfr_renamed_88;
    public static final short cfr_renamed_31 = 8;
    public boolean cfr_renamed_272;
    private volatile boolean cfr_renamed_145;
    public static final short cfr_renamed_114 = 14;
    public Hashtable cfr_renamed_96;
    public static final short cfr_renamed_105 = 1;
    public static final short cfr_renamed_137 = 11;
    public static final short cfr_renamed_79 = 10;
    public sprzc cfr_renamed_107;
    public static final short cfr_renamed_132 = 0;
    public boolean cfr_renamed_102;
    public static final short cfr_renamed_93 = 13;
    public static final Integer cfr_renamed_86;
    public sprbbd cfr_renamed_152;
    private sprmuc cfr_renamed_112;
    private sprmuc cfr_renamed_119;
    public boolean cfr_renamed_91;
    public static final short cfr_renamed_0 = 4;
    private sprmuc cfr_renamed_1;
    public static final short cfr_renamed_2 = 7;
    public short[] cfr_renamed_3;
    public Hashtable cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_2905() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_2906(short arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        try {
            this.cfr_renamed_133.cfr_renamed_2907(arg0, arg1, arg2, arg3);
            return;
        }
        catch (spryad spryad2) {
            if (!this.cfr_renamed_955) {
                this.cfr_renamed_2908((short)2, spryad2.cfr_renamed_2909(), sprubs.cfr_renamed_9("4M\u001b@\u0017HRX\u001d\f\u0005^\u001bX\u0017\f\u0000I\u0011C\u0000H"), spryad2);
            }
            throw spryad2;
        }
        catch (IOException iOException) {
            if (!this.cfr_renamed_955) {
                this.cfr_renamed_2908((short)2, (short)80, sprkqa.cfr_renamed_9("}\u0007R\n^\u0002\u001b\u0012TFL\u0014R\u0012^FI\u0003X\tI\u0002"), iOException);
            }
            throw iOException;
        }
        catch (RuntimeException runtimeException) {
            if (!this.cfr_renamed_955) {
                this.cfr_renamed_2908((short)2, (short)80, sprubs.cfr_renamed_9("4M\u001b@\u0017HRX\u001d\f\u0005^\u001bX\u0017\f\u0000I\u0011C\u0000H"), runtimeException);
            }
            throw runtimeException;
        }
    }

    public static Vector cfr_renamed_2885(ByteArrayInputStream arg0) throws IOException {
        ByteArrayInputStream byteArrayInputStream = arg0;
        byte[] byArray = sprzsc.cfr_renamed_2700(byteArrayInputStream);
        sprkxc.cfr_renamed_2674(byteArrayInputStream);
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byArray);
        Vector<sprlbd> vector = new Vector<sprlbd>();
        ByteArrayInputStream byteArrayInputStream3 = byteArrayInputStream2;
        while (byteArrayInputStream3.available() > 0) {
            ByteArrayInputStream byteArrayInputStream4 = byteArrayInputStream2;
            byteArrayInputStream3 = byteArrayInputStream4;
            int n = sprzsc.cfr_renamed_2660(byteArrayInputStream4);
            byte[] byArray2 = sprzsc.cfr_renamed_2629(byteArrayInputStream4);
            vector.addElement(new sprlbd(n, byArray2));
        }
        return vector;
    }

    public int cfr_renamed_2910(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 1) {
            return 0;
        }
        sprkxc sprkxc2 = this;
        while (sprkxc2.cfr_renamed_1.cfr_renamed_84() == 0) {
            if (this.cfr_renamed_955) {
                if (this.cfr_renamed_728) {
                    throw new IOException(cfr_renamed_956);
                }
                return -1;
            }
            sprkxc sprkxc3 = this;
            sprkxc2 = sprkxc3;
            sprkxc3.cfr_renamed_2911();
        }
        arg2 = Math.min(arg2, this.cfr_renamed_1.cfr_renamed_84());
        this.cfr_renamed_1.cfr_renamed_2912(arg0, arg1, arg2, 0);
        return arg2;
    }

    private /* synthetic */ void cfr_renamed_2913(byte[] arg0, int arg1, int arg2) throws IOException {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            if (sprzsc.cfr_renamed_2762(arg0, arg1 + n) != 1) {
                throw new spryad(50);
            }
            if (this.cfr_renamed_88 || this.cfr_renamed_112.cfr_renamed_84() > 0 || this.cfr_renamed_119.cfr_renamed_84() > 0) {
                throw new spryad(10);
            }
            this.cfr_renamed_133.cfr_renamed_2914();
            this.cfr_renamed_88 = true;
            this.cfr_renamed_2915();
            n2 = ++n;
        }
    }

    public abstract sprhj cfr_renamed_2844();

    public void cfr_renamed_2916(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.cfr_renamed_955) {
            if (this.cfr_renamed_728) {
                throw new IOException(cfr_renamed_956);
            }
            throw new IOException(sprkqa.cfr_renamed_9("5T\u0014I\u001f\u0017FX\tU\b^\u0005O\u000fT\b\u001b\u000eZ\u0015\u001b\u0004^\u0003UFX\nT\u0015^\u0002\u0017FB\tNFX\u0007U\bT\u0012\u001b\u0011I\u000fO\u0003\u001b\u000bT\u0014^F_\u0007O\u0007"));
        }
        block0: while (true) {
            int n = arg2;
            while (n > 0) {
                if (this.cfr_renamed_723) {
                    this.cfr_renamed_2906((short)23, arg0, arg1++, 1);
                    --arg2;
                }
                if (arg2 <= 0) continue block0;
                int n2 = Math.min(arg2, this.cfr_renamed_133.cfr_renamed_2917());
                this.cfr_renamed_2906((short)23, arg0, arg1, n2);
                arg1 += n2;
                n = arg2 - n2;
            }
            break;
        }
    }

    public static void cfr_renamed_2674(ByteArrayInputStream arg0) throws IOException {
        if (arg0.available() > 0) {
            throw new spryad(50);
        }
    }

    public void cfr_renamed_2871() {
        if (this.cfr_renamed_953 != null) {
            sprzra.cfr_renamed_492(this.cfr_renamed_953, (byte)0);
            this.cfr_renamed_953 = null;
        }
        sprkxc sprkxc2 = this;
        sprkxc sprkxc3 = this;
        sprkxc sprkxc4 = this;
        sprkxc sprkxc5 = this;
        this.cfr_renamed_126.cfr_renamed_722();
        this.cfr_renamed_152 = null;
        sprkxc5.cfr_renamed_952 = null;
        sprkxc5.cfr_renamed_3 = null;
        sprkxc4.cfr_renamed_4 = null;
        sprkxc4.cfr_renamed_96 = null;
        sprkxc3.cfr_renamed_102 = false;
        sprkxc3.cfr_renamed_88 = false;
        sprkxc2.cfr_renamed_272 = false;
        sprkxc2.cfr_renamed_91 = false;
        this.cfr_renamed_724 = false;
    }

    static {
        cfr_renamed_86 = spriwa.cfr_renamed_279(65281);
        cfr_renamed_84 = spriwa.cfr_renamed_279(35);
    }

    public int cfr_renamed_2918() throws IOException {
        return this.cfr_renamed_1.cfr_renamed_84();
    }

    public void cfr_renamed_2816(byte[] arg0, int arg1, int arg2) throws IOException {
        int n = arg2;
        while (n > 0) {
            int n2 = Math.min(arg2, this.cfr_renamed_133.cfr_renamed_2917());
            this.cfr_renamed_2906((short)22, arg0, arg1, n2);
            arg1 += n2;
            n = arg2 - n2;
        }
    }

    public void cfr_renamed_2637() throws IOException {
        this.cfr_renamed_2919(true);
    }

    public InputStream cfr_renamed_2920() {
        return this.cfr_renamed_128;
    }

    public void cfr_renamed_2862() throws IOException {
        byte[] byArray = new byte[1];
        byArray[0] = 1;
        byte[] byArray2 = byArray;
        this.cfr_renamed_2906((short)20, byArray2, 0, byArray2.length);
        this.cfr_renamed_133.cfr_renamed_2921();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void cfr_renamed_2922(short arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        switch (arg0) {
            case 21: {
                sprkxc sprkxc2 = this;
                sprkxc2.cfr_renamed_112.cfr_renamed_2923(arg1, arg2, arg3);
                sprkxc2.cfr_renamed_2924();
                return;
            }
            case 23: {
                if (!this.cfr_renamed_145) {
                    throw new spryad(10);
                }
                sprkxc sprkxc3 = this;
                sprkxc3.cfr_renamed_1.cfr_renamed_2923(arg1, arg2, arg3);
                sprkxc3.cfr_renamed_2905();
                return;
            }
            case 20: {
                this.cfr_renamed_2913(arg1, arg2, arg3);
                return;
            }
            case 22: {
                sprkxc sprkxc4 = this;
                sprkxc4.cfr_renamed_119.cfr_renamed_2923(arg1, arg2, arg3);
                sprkxc4.cfr_renamed_2925();
                return;
            }
            case 24: {
                if (this.cfr_renamed_145) break;
                throw new spryad(10);
            }
        }
    }

    public void cfr_renamed_2919(boolean arg0) throws IOException {
        if (!this.cfr_renamed_955) {
            if (arg0 && !this.cfr_renamed_145) {
                this.cfr_renamed_2926((short)90, sprubs.cfr_renamed_9("y\u0001I\u0000\f\u0011M\u001cO\u0017@\u0017HRD\u0013B\u0016_\u001aM\u0019I"));
            }
            this.cfr_renamed_2908((short)1, (short)0, sprkqa.cfr_renamed_9("%T\bU\u0003X\u0012R\tUFX\nT\u0015^\u0002"), null);
        }
    }

    public static void cfr_renamed_2927(OutputStream arg0, Vector arg1) throws IOException {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n2 = n = 0;
        while (n2 < arg1.size()) {
            sprlbd sprlbd2 = (sprlbd)arg1.elementAt(n);
            int n3 = sprlbd2.cfr_renamed_2928();
            sprzsc.cfr_renamed_2647(n3);
            sprzsc.cfr_renamed_2648(n3, byteArrayOutputStream);
            sprzsc.cfr_renamed_2624(sprlbd2.cfr_renamed_2609(), byteArrayOutputStream);
            n2 = ++n;
        }
        byte[] byArray = byteArrayOutputStream.toByteArray();
        sprzsc.cfr_renamed_2712(byArray, arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int cfr_renamed_2839(sprsc arg0, int arg1) throws IOException {
        boolean bl = sprzsc.cfr_renamed_2631(arg0);
        switch (arg1) {
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
            case 158: 
            case 160: 
            case 162: 
            case 164: 
            case 168: 
            case 170: 
            case 172: 
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
            case 49189: 
            case 49191: 
            case 49193: 
            case 49195: 
            case 49197: 
            case 49199: 
            case 49201: 
            case 49266: 
            case 49268: 
            case 49270: 
            case 49272: 
            case 49274: 
            case 49276: 
            case 49278: 
            case 49280: 
            case 49282: 
            case 49284: 
            case 49286: 
            case 49288: 
            case 49290: 
            case 49292: 
            case 49294: 
            case 49296: 
            case 49298: 
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
                if (bl) {
                    return 1;
                }
                throw new spryad(47);
            }
            case 157: 
            case 159: 
            case 161: 
            case 163: 
            case 165: 
            case 169: 
            case 171: 
            case 173: 
            case 49188: 
            case 49190: 
            case 49192: 
            case 49194: 
            case 49196: 
            case 49198: 
            case 49200: 
            case 49202: 
            case 49267: 
            case 49269: 
            case 49271: 
            case 49273: 
            case 49275: 
            case 49277: 
            case 49279: 
            case 49281: 
            case 49283: 
            case 49285: 
            case 49287: 
            case 49289: 
            case 49291: 
            case 49293: 
            case 49295: 
            case 49297: 
            case 49299: {
                if (bl) {
                    return 2;
                }
                throw new spryad(47);
            }
            case 175: 
            case 177: 
            case 179: 
            case 181: 
            case 183: 
            case 185: 
            case 49208: 
            case 49211: 
            case 49301: 
            case 49303: 
            case 49305: 
            case 49307: {
                if (bl) {
                    return 2;
                }
                return 0;
            }
        }
        if (bl) {
            return 1;
        }
        return 0;
    }

    public void cfr_renamed_2929() {
        if (this.cfr_renamed_82 != null) {
            this.cfr_renamed_82.cfr_renamed_722();
            this.cfr_renamed_82 = null;
        }
        if (this.cfr_renamed_107 != null) {
            this.cfr_renamed_107.cfr_renamed_2812();
            this.cfr_renamed_107 = null;
        }
    }

    public void cfr_renamed_2869(short arg0) throws IOException {
    }

    /*
     * WARNING - void declaration
     */
    public sprkxc(InputStream inputStream, OutputStream outputStream, SecureRandom secureRandom) {
        void arg1;
        void arg0;
        sprkxc sprkxc2 = this;
        sprkxc sprkxc3 = this;
        sprkxc sprkxc4 = this;
        sprkxc sprkxc5 = this;
        sprkxc sprkxc6 = this;
        sprkxc sprkxc7 = this;
        sprkxc sprkxc8 = this;
        sprkxc sprkxc9 = this;
        sprkxc sprkxc10 = this;
        sprkxc sprkxc11 = this;
        sprkxc sprkxc12 = this;
        sprkxc sprkxc13 = this;
        this.cfr_renamed_1 = new sprmuc();
        sprkxc13.cfr_renamed_112 = new sprmuc(2);
        this.cfr_renamed_119 = new sprmuc();
        sprkxc12.cfr_renamed_128 = null;
        sprkxc12.cfr_renamed_951 = null;
        sprkxc11.cfr_renamed_955 = false;
        sprkxc11.cfr_renamed_728 = false;
        sprkxc10.cfr_renamed_145 = false;
        sprkxc10.cfr_renamed_723 = true;
        sprkxc9.cfr_renamed_953 = null;
        sprkxc9.cfr_renamed_107 = null;
        sprkxc8.cfr_renamed_82 = null;
        sprkxc8.cfr_renamed_126 = null;
        sprkxc7.cfr_renamed_152 = null;
        sprkxc7.cfr_renamed_952 = null;
        sprkxc6.cfr_renamed_3 = null;
        sprkxc6.cfr_renamed_4 = null;
        sprkxc5.cfr_renamed_96 = null;
        sprkxc5.cfr_renamed_135 = 0;
        sprkxc4.cfr_renamed_102 = 0;
        sprkxc4.cfr_renamed_88 = false;
        sprkxc3.cfr_renamed_272 = false;
        sprkxc3.cfr_renamed_91 = false;
        sprkxc2.cfr_renamed_724 = false;
        sprkxc2.cfr_renamed_133 = new sprgcd(this, (InputStream)arg0, (OutputStream)arg1);
        sprkxc2.cfr_renamed_499 = secureRandom;
    }

    public abstract void cfr_renamed_2873(short var1, byte[] var2) throws IOException;

    public short cfr_renamed_2835(Hashtable arg0, Hashtable arg1, short arg2) throws IOException {
        short s = sprbcd.cfr_renamed_2930(arg1);
        if (s >= 0 && !this.cfr_renamed_102 && s != sprbcd.cfr_renamed_2930(arg0)) {
            throw new spryad(arg2);
        }
        return s;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_2931(short s, short s2, String string, Exception exception) throws IOException {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprkxc sprkxc2 = this;
        sprkxc2.cfr_renamed_2844().cfr_renamed_2932((short)arg0, (short)arg1, (String)arg2, (Exception)arg3);
        byte[] byArray = new byte[]{(byte)arg0, (byte)arg1};
        sprkxc2.cfr_renamed_2906((short)21, byArray, 0, 2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_2911() throws IOException {
        try {
            if (this.cfr_renamed_133.cfr_renamed_2933()) return;
            throw new EOFException();
        }
        catch (spryad spryad2) {
            if (this.cfr_renamed_955) throw spryad2;
            this.cfr_renamed_2908((short)2, spryad2.cfr_renamed_2909(), sprubs.cfr_renamed_9("j\u0013E\u001eI\u0016\f\u0006CR^\u0017M\u0016\f\u0000I\u0011C\u0000H"), spryad2);
            throw spryad2;
        }
        catch (IOException iOException) {
            if (this.cfr_renamed_955) throw iOException;
            this.cfr_renamed_2908((short)2, (short)80, sprkqa.cfr_renamed_9(" Z\u000fW\u0003_FO\t\u001b\u0014^\u0007_FI\u0003X\tI\u0002"), iOException);
            throw iOException;
        }
        catch (RuntimeException runtimeException) {
            if (this.cfr_renamed_955) throw runtimeException;
            this.cfr_renamed_2908((short)2, (short)80, sprubs.cfr_renamed_9("j\u0013E\u001eI\u0016\f\u0006CR^\u0017M\u0016\f\u0000I\u0011C\u0000H"), runtimeException);
            throw runtimeException;
        }
    }

    public OutputStream cfr_renamed_470() {
        return this.cfr_renamed_951;
    }

    public void cfr_renamed_2926(short arg0, String arg1) throws IOException {
        this.cfr_renamed_2931((short)1, arg0, arg1, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void cfr_renamed_2867() throws IOException {
        try {
            sprkxc sprkxc2 = this;
            while (sprkxc2.cfr_renamed_135 != 16) {
                if (this.cfr_renamed_955) {
                    // empty if block
                }
                sprkxc sprkxc3 = this;
                sprkxc2 = sprkxc3;
                sprkxc3.cfr_renamed_2911();
            }
            sprkxc sprkxc4 = this;
            sprkxc4.cfr_renamed_133.cfr_renamed_2934();
            boolean bl = sprkxc4.cfr_renamed_723 = !sprzsc.cfr_renamed_2755(sprkxc4.cfr_renamed_2820());
            if (!this.cfr_renamed_145) {
                sprkxc sprkxc5 = this;
                sprkxc5.cfr_renamed_145 = true;
                sprkxc sprkxc6 = this;
                sprkxc5.cfr_renamed_128 = new sprxbd(this);
                sprkxc6.cfr_renamed_951 = new sprfwc(this);
            }
            if (this.cfr_renamed_107 != null) {
                if (this.cfr_renamed_82 == null) {
                    this.cfr_renamed_82 = new sprsbd().cfr_renamed_2935(this.cfr_renamed_126.cfr_renamed_4).cfr_renamed_2936(this.cfr_renamed_126.cfr_renamed_119).cfr_renamed_2937(this.cfr_renamed_126.cfr_renamed_152).cfr_renamed_2938(this.cfr_renamed_152).cfr_renamed_2939(this.cfr_renamed_96).cfr_renamed_1451();
                    this.cfr_renamed_107 = new sprirc(this.cfr_renamed_107.cfr_renamed_2811(), this.cfr_renamed_82);
                }
                this.cfr_renamed_2820().cfr_renamed_2940(this.cfr_renamed_107);
            }
            this.cfr_renamed_2844().cfr_renamed_2941();
            return;
        }
        finally {
            this.cfr_renamed_2871();
        }
    }

    public static byte[] cfr_renamed_2822(sprsc arg0, sprgg arg1, byte[] arg2) {
        sprlc sprlc2 = arg1.cfr_renamed_2942();
        if (arg2 != null && sprzsc.cfr_renamed_2665(arg0)) {
            sprlc2.cfr_renamed_1197(arg2, 0, arg2.length);
        }
        sprlc sprlc3 = sprlc2;
        byte[] byArray = new byte[sprlc3.cfr_renamed_1218()];
        sprlc3.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_2925() throws IOException {
        boolean bl;
        do {
            bl = false;
            if (this.cfr_renamed_119.cfr_renamed_84() < 4) continue;
            byte[] byArray = new byte[4];
            sprkxc sprkxc2 = this;
            sprkxc2.cfr_renamed_119.cfr_renamed_2943(byArray, 0, 4, 0);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
            short s = sprzsc.cfr_renamed_2630(byteArrayInputStream);
            int n = sprzsc.cfr_renamed_2645(byteArrayInputStream);
            if (sprkxc2.cfr_renamed_119.cfr_renamed_84() < n + 4) continue;
            byte[] byArray2 = this.cfr_renamed_119.cfr_renamed_2944(n, 4);
            switch (s) {
                case 0: {
                    break;
                }
                case 20: {
                    if (this.cfr_renamed_953 == null) {
                        sprkxc sprkxc3 = this;
                        sprkxc3.cfr_renamed_953 = sprkxc3.cfr_renamed_2945(!sprkxc3.cfr_renamed_2820().cfr_renamed_2770());
                    }
                }
                default: {
                    sprkxc sprkxc4 = this;
                    sprkxc4.cfr_renamed_133.cfr_renamed_2946(byArray, 0, 4);
                    sprkxc4.cfr_renamed_133.cfr_renamed_2946(byArray2, 0, n);
                }
            }
            this.cfr_renamed_2873(s, byArray2);
            bl = true;
        } while (bl);
    }

    public void cfr_renamed_2947() throws IOException {
        this.cfr_renamed_133.cfr_renamed_2947();
    }

    public void cfr_renamed_2887(ByteArrayInputStream arg0) throws IOException {
        byte[] byArray = sprzsc.cfr_renamed_2632(this.cfr_renamed_953.length, arg0);
        sprkxc.cfr_renamed_2674(arg0);
        if (!sprzra.cfr_renamed_559(this.cfr_renamed_953, byArray)) {
            throw new spryad(51);
        }
    }

    private /* synthetic */ void cfr_renamed_2924() throws IOException {
        sprkxc sprkxc2 = this;
        while (sprkxc2.cfr_renamed_112.cfr_renamed_84() >= 2) {
            sprkxc sprkxc3 = this;
            byte[] byArray = sprkxc3.cfr_renamed_112.cfr_renamed_2944(2, 0);
            short s = byArray[0];
            short s2 = byArray[1];
            sprkxc3.cfr_renamed_2844().cfr_renamed_2948(s, s2);
            if (s == 2) {
                this.cfr_renamed_2929();
                this.cfr_renamed_728 = true;
                this.cfr_renamed_955 = true;
                this.cfr_renamed_133.cfr_renamed_2949();
                throw new IOException(cfr_renamed_956);
            }
            if (s2 == 0) {
                this.cfr_renamed_2919(false);
            }
            sprkxc sprkxc4 = this;
            sprkxc2 = sprkxc4;
            sprkxc4.cfr_renamed_2869(s2);
        }
    }

    public static void cfr_renamed_2837(OutputStream arg0, Hashtable arg1) throws IOException {
        Object object;
        Enumeration enumeration;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Enumeration enumeration2 = enumeration = arg1.keys();
        while (enumeration2.hasMoreElements()) {
            object = (Integer)enumeration.nextElement();
            int n = (Integer)object;
            byte[] byArray = (byte[])arg1.get(object);
            sprzsc.cfr_renamed_2647(n);
            sprzsc.cfr_renamed_2648(n, byteArrayOutputStream);
            enumeration2 = enumeration;
            sprzsc.cfr_renamed_2624(byArray, byteArrayOutputStream);
        }
        byte[] byArray = byteArrayOutputStream.toByteArray();
        object = byArray;
        sprzsc.cfr_renamed_2624(byArray, arg0);
    }

    public void cfr_renamed_2915() throws IOException {
    }

    public static byte[] cfr_renamed_2864(boolean arg0, sprtj arg1) {
        byte[] byArray = new byte[32];
        arg1.cfr_renamed_1354(byArray);
        if (arg0) {
            sprzsc.cfr_renamed_2736(byArray, 0);
        }
        return byArray;
    }

    public void cfr_renamed_2889() throws IOException {
        sprkxc sprkxc2 = this;
        byte[] byArray = sprkxc2.cfr_renamed_2945(sprkxc2.cfr_renamed_2820().cfr_renamed_2770());
        sprfcd sprfcd2 = new sprfcd(this, 20, byArray.length);
        sprfcd2.write(byArray);
        sprfcd2.cfr_renamed_2818();
    }

    public byte[] cfr_renamed_2945(boolean arg0) {
        sprcrc sprcrc2 = this.cfr_renamed_2820();
        if (arg0) {
            return sprzsc.cfr_renamed_2664(sprcrc2, "server finished", sprkxc.cfr_renamed_2822(this.cfr_renamed_2820(), this.cfr_renamed_133.cfr_renamed_2881(), sprzsc.cfr_renamed_3));
        }
        return sprzsc.cfr_renamed_2664(sprcrc2, "client finished", sprkxc.cfr_renamed_2822(this.cfr_renamed_2820(), this.cfr_renamed_133.cfr_renamed_2881(), sprzsc.cfr_renamed_2));
    }

    public static byte[] cfr_renamed_2833(byte[] arg0) throws IOException {
        return sprzsc.cfr_renamed_2741(arg0);
    }

    public static Hashtable cfr_renamed_2849(ByteArrayInputStream arg0) throws IOException {
        if (arg0.available() < 1) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = arg0;
        byte[] byArray = sprzsc.cfr_renamed_2629(byteArrayInputStream);
        sprkxc.cfr_renamed_2674(byteArrayInputStream);
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byArray);
        Hashtable<Integer, byte[]> hashtable = new Hashtable<Integer, byte[]>();
        while (byteArrayInputStream2.available() > 0) {
            byte[] byArray2;
            ByteArrayInputStream byteArrayInputStream3 = byteArrayInputStream2;
            Integer n = spriwa.cfr_renamed_279(sprzsc.cfr_renamed_2660(byteArrayInputStream3));
            if (null == hashtable.put(n, byArray2 = sprzsc.cfr_renamed_2629(byteArrayInputStream3))) continue;
            throw new spryad(47);
        }
        return hashtable;
    }

    public void cfr_renamed_2874(Vector arg0) throws IOException {
        sprfcd sprfcd2 = new sprfcd(this, 23);
        sprkxc.cfr_renamed_2927(sprfcd2, arg0);
        sprfcd2.cfr_renamed_2818();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2858(sprsc arg0, sproc arg1) throws IOException {
        block3: {
            byte[] byArray = arg1.cfr_renamed_2799();
            try {
                arg0.cfr_renamed_2666().cfr_renamed_152 = sprzsc.cfr_renamed_2725(arg0, byArray);
                if (byArray == null) break block3;
            }
            catch (Throwable throwable) {
                if (byArray != null) {
                    sprzra.cfr_renamed_492(byArray, (byte)0);
                }
                throw throwable;
            }
            sprzra.cfr_renamed_492(byArray, (byte)0);
            return;
        }
    }

    public void cfr_renamed_2877(sprbbd arg0) throws IOException {
        sprpxc sprpxc2;
        Object object;
        if (arg0 == null) {
            arg0 = sprbbd.cfr_renamed_4;
        }
        if (arg0.cfr_renamed_806() == 0 && !(object = this.cfr_renamed_2820()).cfr_renamed_2770() && (sprpxc2 = this.cfr_renamed_2820().cfr_renamed_2683()).cfr_renamed_2684()) {
            String string = new StringBuilder().insert(0, sprpxc2.toString()).append(sprkqa.cfr_renamed_9("\u001b\u0005W\u000f^\bOF_\u000f_\b\u001c\u0012\u001b\u0016I\tM\u000f_\u0003\u001b\u0005I\u0003_\u0003U\u0012R\u0007W\u0015")).toString();
            this.cfr_renamed_2926((short)41, string);
            return;
        }
        Object object2 = object = new sprfcd(this, 11);
        arg0.cfr_renamed_2623((OutputStream)object2);
        ((sprfcd)object2).cfr_renamed_2818();
    }

    public void cfr_renamed_2908(short arg0, short arg1, String arg2, Exception arg3) throws IOException {
        if (!this.cfr_renamed_955) {
            this.cfr_renamed_955 = true;
            if (arg0 == 2) {
                this.cfr_renamed_2929();
                this.cfr_renamed_728 = true;
            }
            sprkxc sprkxc2 = this;
            sprkxc2.cfr_renamed_2931(arg0, arg1, arg2, arg3);
            sprkxc2.cfr_renamed_133.cfr_renamed_2949();
            if (arg0 != 2) {
                return;
            }
        }
        throw new IOException(cfr_renamed_956);
    }

    public abstract sprcrc cfr_renamed_2820();
}

