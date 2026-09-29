/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprghm;
import com.spire.presentation.packages.spriam;
import com.spire.presentation.packages.sprje;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprmug;
import com.spire.presentation.packages.sprnhm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqnaa;
import com.spire.presentation.packages.sprqve;
import com.spire.presentation.packages.sprrbh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprtue;
import com.spire.presentation.packages.sprwxca;
import com.spire.presentation.packages.sprwzg;
import com.spire.presentation.packages.sprytg;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Date;
import java.util.Map;

public class sprmxg
implements sprje {
    private static String cfr_renamed_88 = "BC";
    private static Map<String, Integer> cfr_renamed_31 = new sprytg();
    private static Map<sprlem, String> cfr_renamed_272 = new sprwzg();
    private static final int cfr_renamed_145 = 60;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_7543(int arg0, int arg1) throws sprtqg {
        switch (arg0) {
            case 1: 
            case 3: {
                String string = "RSA";
                return new StringBuilder().insert(0, sprmxg.cfr_renamed_7544(arg1)).append(sprqnaa.cfr_renamed_9("2918")).append(string).toString();
            }
            case 17: {
                String string = "DSA";
                return new StringBuilder().insert(0, sprmxg.cfr_renamed_7544(arg1)).append(sprqnaa.cfr_renamed_9("2918")).append(string).toString();
            }
            case 16: 
            case 20: {
                String string = sprqnaa.cfr_renamed_9("\u0015)\u0017$=$<");
                return new StringBuilder().insert(0, sprmxg.cfr_renamed_7544(arg1)).append(sprqnaa.cfr_renamed_9("2918")).append(string).toString();
            }
        }
        throw new sprtqg(new StringBuilder().insert(0, sprwxca.cfr_renamed_9("\u0001:\u001f:\u001b#\u001at\u00158\u0013;\u0006=\u0000<\u0019t\u00005\u0013t\u001d:T'\u001d3\u001a5\u0000!\u00061N")).append(arg0).toString());
    }

    public static String cfr_renamed_7545() {
        return cfr_renamed_88;
    }

    public static boolean cfr_renamed_7546(byte[] arg0) throws IOException {
        int n;
        if (arg0.length < 12) {
            return false;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg0);
        int n2 = n = 0;
        while (n2 != 8) {
            ((InputStream)byteArrayInputStream).read();
            n2 = ++n;
        }
        return ((InputStream)byteArrayInputStream).read() == 75 && ((InputStream)byteArrayInputStream).read() == 66 && ((InputStream)byteArrayInputStream).read() == 88 && ((InputStream)byteArrayInputStream).read() == 102;
    }

    private static /* synthetic */ boolean cfr_renamed_7547(int arg0) {
        return arg0 >= 65 && arg0 <= 90 || arg0 >= 97 && arg0 <= 122 || arg0 >= 48 && arg0 <= 57 || arg0 == 43 || arg0 == 47 || arg0 == 13 || arg0 == 10;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_7548(int arg0) {
        switch (arg0) {
            case 0: {
                return null;
            }
            case 2: {
                return sprwxca.cfr_renamed_9("\u00101\u00071\u00101");
            }
            case 1: {
                return sprqnaa.cfr_renamed_9("\f\u0014\u0000\u0011");
            }
            case 3: {
                return sprwxca.cfr_renamed_9("7\u0015'\u0000A");
            }
            case 4: {
                return sprqnaa.cfr_renamed_9("\u0007<*'#968");
            }
            case 5: {
                return sprwxca.cfr_renamed_9("'\u00152\u0011&");
            }
            case 6: {
                return "DES";
            }
            case 7: {
                return sprqnaa.cfr_renamed_9("\u0011\u0000\u0003");
            }
            case 8: {
                return sprwxca.cfr_renamed_9("5\u0011'");
            }
            case 9: {
                return sprqnaa.cfr_renamed_9("\u0011\u0000\u0003");
            }
            case 11: {
                return sprwxca.cfr_renamed_9("\u0017\u00159\u00118\u0018=\u0015");
            }
            case 12: {
                return sprqnaa.cfr_renamed_9("\u00061(5)<,1");
            }
            case 13: {
                return sprwxca.cfr_renamed_9("\u0017\u00159\u00118\u0018=\u0015");
            }
            case 10: {
                return sprqnaa.cfr_renamed_9("\u00042?#968");
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprwxca.cfr_renamed_9("\u0001:\u001f:\u001b#\u001at\u0007-\u00199\u0011 \u0006=\u0017t\u00158\u0013;\u0006=\u0000<\u0019nT")).append(arg0).toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    public static byte[] cfr_renamed_7549(int arg0, SecureRandom arg1) throws sprtqg {
        int n;
        int n2 = 0;
        switch (arg0) {
            case 2: {
                n = n2 = 192;
                break;
            }
            case 1: {
                n = n2 = 128;
                break;
            }
            case 3: {
                n = n2 = 128;
                break;
            }
            case 4: {
                n = n2 = 128;
                break;
            }
            case 5: {
                n = n2 = 128;
                break;
            }
            case 6: {
                n = n2 = 64;
                break;
            }
            case 7: {
                n = n2 = 128;
                break;
            }
            case 8: {
                n = n2 = 192;
                break;
            }
            case 9: {
                n = n2 = 256;
                break;
            }
            case 11: {
                n = n2 = 128;
                break;
            }
            case 12: {
                n = n2 = 192;
                break;
            }
            case 13: {
                n = n2 = 256;
                break;
            }
            case 10: {
                n = n2 = 256;
                break;
            }
            default: {
                throw new sprtqg(new StringBuilder().insert(0, sprqnaa.cfr_renamed_9("%+;+?2>e#<=(51\",3e1)7*\",$-=\u007fp")).append(arg0).toString());
            }
        }
        byte[] byArray = new byte[(n + 7) / 8];
        arg1.nextBytes(byArray);
        return byArray;
    }

    public static boolean cfr_renamed_7550(byte[] arg0) throws IOException {
        int n = new sprmam(new ByteArrayInputStream(arg0)).cfr_renamed_7534();
        return n == 6 || n == 14 || n == 5 || n == 7;
    }

    public static void cfr_renamed_7551(OutputStream arg0, char arg1, File arg2) throws IOException {
        OutputStream outputStream = new sprrbh().cfr_renamed_7552(arg0, arg1, arg2);
        sprmxg.cfr_renamed_7553(arg2, outputStream, 32768);
    }

    public static String cfr_renamed_7554(sprlem arg0) {
        String string = cfr_renamed_272.get(arg0);
        if (string != null) {
            return string;
        }
        return sprnhm.cfr_renamed_7555(arg0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_7544(int arg0) throws sprtqg {
        switch (arg0) {
            case 2: {
                return "SHA1";
            }
            case 5: {
                return sprwxca.cfr_renamed_9("9\u0010F");
            }
            case 1: {
                return "MD5";
            }
            case 3: {
                return "RIPEMD160";
            }
            case 8: {
                return "SHA256";
            }
            case 9: {
                return "SHA384";
            }
            case 10: {
                return "SHA512";
            }
            case 11: {
                return sprqnaa.cfr_renamed_9("\u0016\u0018\u0004bwd");
            }
            case 12: 
            case 313: {
                return "SHA256";
            }
            case 314: {
                return "SHA384";
            }
            case 14: 
            case 315: {
                return "SHA512";
            }
            case 312: {
                return sprwxca.cfr_renamed_9("\u0007<\u0015Ff@");
            }
            case 6: {
                return sprqnaa.cfr_renamed_9("\u0004\f\u0017\u0000\u0002");
            }
        }
        throw new sprtqg(new StringBuilder().insert(0, sprwxca.cfr_renamed_9("\u0001:\u001f:\u001b#\u001at\u001c5\u0007<T5\u00183\u001b&\u001d \u001c9T \u00153T=\u001at\u00131\u0000\u0010\u001d3\u0011'\u0000\u001a\u00159\u0011nT")).append(arg0).toString());
    }

    public static InputStream cfr_renamed_7556(InputStream arg0) throws IOException {
        if (!arg0.markSupported()) {
            arg0 = new sprmug(arg0);
        }
        InputStream inputStream = arg0;
        inputStream.mark(60);
        int n = inputStream.read();
        if ((n & 0x80) != 0) {
            InputStream inputStream2 = arg0;
            inputStream2.reset();
            return inputStream2;
        }
        if (!sprmxg.cfr_renamed_7547(n)) {
            arg0.reset();
            return new spriam(arg0);
        }
        byte[] byArray = new byte[60];
        int n2 = 1;
        int n3 = 1;
        int n4 = n2;
        byArray[0] = (byte)n;
        while (n4 != 60 && (n = arg0.read()) >= 0) {
            if (!sprmxg.cfr_renamed_7547(n)) {
                arg0.reset();
                return new spriam(arg0);
            }
            if (n != 10 && n != 13) {
                byArray[n3++] = (byte)n;
            }
            n4 = ++n2;
        }
        arg0.reset();
        if (n2 < 4) {
            return new spriam(arg0);
        }
        byte[] byArray2 = new byte[8];
        System.arraycopy(byArray, 0, byArray2, 0, byArray2.length);
        try {
            byte[] byArray3 = sprtue.cfr_renamed_496(byArray2);
            if ((byArray3[0] & 0x80) != 0) {
                return new spriam(arg0, false);
            }
            return new spriam(arg0);
        }
        catch (sprqve sprqve2) {
            throw new IOException(sprqve2.getMessage());
        }
    }

    public static void cfr_renamed_7557(OutputStream arg0, char arg1, File arg2, byte[] arg3) throws IOException {
        OutputStream outputStream = new sprrbh().cfr_renamed_7558(arg0, arg1, arg2.getName(), new Date(arg2.lastModified()), arg3);
        sprmxg.cfr_renamed_7553(arg2, outputStream, arg3.length);
    }

    public static void cfr_renamed_7559(String arg0) {
        cfr_renamed_88 = arg0;
    }

    public static int cfr_renamed_7560(String arg0) {
        if (cfr_renamed_31.containsKey(arg0 = sprkoe.cfr_renamed_425(arg0))) {
            return cfr_renamed_31.get(arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprqnaa.cfr_renamed_9("0>$2)5e$*p(15p")).append(arg0).append(sprwxca.cfr_renamed_9("T \u001bt\u0015t\u001c5\u0007<T=\u0010")).toString());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_7553(File arg0, OutputStream arg1, int arg2) throws IOException {
        byte[] byArray = new byte[arg2];
        FileInputStream fileInputStream = new FileInputStream(arg0);
        try {
            int n;
            FileInputStream fileInputStream2 = fileInputStream;
            while ((n = fileInputStream2.read(byArray)) > 0) {
                fileInputStream2 = fileInputStream;
                arg1.write(byArray, 0, n);
            }
            arg1.close();
        }
        catch (Throwable throwable) {
            Throwable throwable2;
            sproze.cfr_renamed_492(byArray, (byte)0);
            try {
                fileInputStream.close();
                throwable2 = throwable;
                throw throwable2;
            }
            catch (IOException iOException) {
                throwable2 = throwable;
            }
            throw throwable2;
        }
        sproze.cfr_renamed_492(byArray, (byte)0);
        try {
            fileInputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprghm[] cfr_renamed_7540(byte[] arg0) throws sprtqg {
        sprktm sprktm2;
        sprktm sprktm3;
        try {
            sprszm sprszm2 = sprszm.cfr_renamed_23(arg0);
            sprktm3 = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
            sprktm2 = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
        }
        catch (RuntimeException runtimeException) {
            throw new sprtqg(sprqnaa.cfr_renamed_9(" (&55$,?+p!5&?!9+7e#,7+11%75"), runtimeException);
        }
        sprghm[] sprghmArray = new sprghm[2];
        sprghmArray[0] = new sprghm(sprktm3.cfr_renamed_97());
        sprghmArray[1] = new sprghm(sprktm2.cfr_renamed_97());
        return sprghmArray;
    }
}

