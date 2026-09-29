/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazg;
import com.spire.presentation.packages.sprczl;
import com.spire.presentation.packages.sprftg;
import com.spire.presentation.packages.sprgvg;
import com.spire.presentation.packages.sprgzg;
import com.spire.presentation.packages.sprkah;
import com.spire.presentation.packages.sprkbh;
import com.spire.presentation.packages.sprkgba;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprktg;
import com.spire.presentation.packages.sprlbh;
import com.spire.presentation.packages.sprlsg;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprmwg;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sprnwg;
import com.spire.presentation.packages.sprpzg;
import com.spire.presentation.packages.sprqks;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprurg;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprvd;
import com.spire.presentation.packages.sprwsg;
import com.spire.presentation.packages.sprwvg;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Iterator;

public class sprasg {
    private static /* synthetic */ void cfr_renamed_8070(InputStream arg0, InputStream arg1, char[] arg2, String arg3) throws IOException, NoSuchProviderException {
        arg0 = sprmxg.cfr_renamed_7556(arg0);
        try {
            FileOutputStream fileOutputStream;
            String string;
            sprpzg sprpzg2;
            sprkbh sprkbh2;
            sprwvg sprwvg2 = new sprwvg(arg0);
            Object object = sprwvg2.cfr_renamed_7703();
            Iterator<sprkah> iterator = (object instanceof sprkbh ? (sprkbh2 = (sprkbh)object) : (sprkbh2 = (sprkbh)sprwvg2.cfr_renamed_7703())).cfr_renamed_7844();
            sprmah sprmah2 = null;
            sprgzg sprgzg2 = null;
            sprlsg sprlsg2 = new sprlsg(sprmxg.cfr_renamed_7556(arg1), (sprrk)new sprmwg());
            sprmah sprmah3 = sprmah2;
            while (sprmah3 == null && iterator.hasNext()) {
                sprgzg2 = (sprgzg)iterator.next();
                sprmah3 = sprazg.cfr_renamed_8063(sprlsg2, sprgzg2.cfr_renamed_7541(), arg2);
            }
            if (sprmah2 == null) {
                throw new IllegalArgumentException(sprkgba.cfr_renamed_9("\u001fs\u000fd\tbL}\toLp\u0003dL{\te\u001fw\u000bsLx\u0003bLp\u0003c\u0002rB"));
            }
            InputStream inputStream = sprgzg2.cfr_renamed_7784(new sprktg().cfr_renamed_1499("BC").cfr_renamed_7940(sprmah2));
            sprftg sprftg2 = (sprftg)new sprwvg(inputStream).cfr_renamed_7703();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(sprftg2.cfr_renamed_7830());
            Object object2 = new sprwvg(bufferedInputStream).cfr_renamed_7703();
            if (object2 instanceof sprpzg) {
                sprpzg2 = (sprpzg)object2;
                string = sprpzg2.cfr_renamed_678();
                if (string.length() == 0) {
                    string = arg3;
                }
            } else {
                if (object2 instanceof sprwsg) {
                    throw new sprtqg(sprqks.cfr_renamed_9("\u0019\u0003\u001f\u001f\u0005\u001d\b\b\u0018M\u0011\b\u000f\u001e\u001d\n\u0019M\u001f\u0002\u0012\u0019\u001d\u0004\u0012\u001e\\\f\\\u001e\u0015\n\u0012\b\u0018M\u0011\b\u000f\u001e\u001d\n\u0019MQM\u0012\u0002\bM\u0010\u0004\b\b\u000e\f\u0010M\u0018\f\b\fR"));
                }
                throw new sprtqg(sprkgba.cfr_renamed_9("{\te\u001fw\u000bsL\u007f\u001f6\u0002y\u00186\r6\u001f\u007f\u0001f\u0000sLs\u0002u\u001eo\u001cb\trLp\u0005z\t6A6\u0018o\u001csLc\u0002}\u0002y\u001bxB"));
            }
            InputStream inputStream2 = sprpzg2.cfr_renamed_2920();
            FileOutputStream fileOutputStream2 = fileOutputStream = new FileOutputStream(string);
            sprkqe.cfr_renamed_5195(inputStream2, fileOutputStream2, 8192);
            ((OutputStream)fileOutputStream2).close();
            if (sprgzg2.cfr_renamed_7846()) {
                if (!sprgzg2.cfr_renamed_1626()) {
                    System.err.println(sprqks.cfr_renamed_9("\u0000\u0019\u001e\u000f\f\u001b\b\\\u000b\u001d\u0004\u0010\b\u0018M\u0015\u0003\b\b\u001b\u001f\u0015\u0019\u0005M\u001f\u0005\u0019\u000e\u0017"));
                    return;
                }
                System.err.println(sprkgba.cfr_renamed_9("{\te\u001fw\u000bsL\u007f\u0002b\tq\u001e\u007f\u0018oLu\u0004s\u000f}Lf\re\u001fs\b"));
                return;
            }
            System.err.println(sprqks.cfr_renamed_9("\u0003\u0013M\u0011\b\u000f\u001e\u001d\n\u0019M\u0015\u0003\b\b\u001b\u001f\u0015\u0019\u0005M\u001f\u0005\u0019\u000e\u0017"));
            return;
        }
        catch (sprtqg sprtqg2) {
            System.err.println(sprtqg2);
            if (sprtqg2.cfr_renamed_584() != null) {
                sprtqg2.cfr_renamed_584().printStackTrace();
            }
            return;
        }
    }

    public static void main(String[] arg0) throws Exception {
        Security.addProvider(new sprsci());
        if (arg0.length == 0) {
            System.err.println(sprkgba.cfr_renamed_9("c\u001fw\u000bsV6's\u0015T\re\tr w\u001eq\tP\u0005z\tF\u001ey\u000fs\u001fe\u0003dL;\tjArLMAw\u0010w\u0005KLp\u0005z\t67e\tu\u001es\u0018]\to*\u007f\u0000sLf\re\u001fF\u0004d\re\tj\u001cc\u000e]\to*\u007f\u0000s1"));
            return;
        }
        if (arg0[0].equals(sprqks.cfr_renamed_9("@\u0019"))) {
            StringBuilder stringBuilder;
            if (arg0[1].equals(sprkgba.cfr_renamed_9(";\r")) || arg0[1].equals(sprqks.cfr_renamed_9("Q\f\u0015")) || arg0[1].equals(sprkgba.cfr_renamed_9("A\u007f\r"))) {
                sprasg.cfr_renamed_8071(new StringBuilder().insert(0, arg0[2]).append(sprqks.cfr_renamed_9("C\u001d\u001e\u001f")).toString(), arg0[2], arg0[3], true, arg0[true].indexOf(105) > 0);
                return;
            }
            if (arg0[1].equals(sprkgba.cfr_renamed_9(";\u0005"))) {
                stringBuilder = new StringBuilder();
                sprasg.cfr_renamed_8071(stringBuilder.insert(0, arg0[2]).append(sprqks.cfr_renamed_9("C\u001e\u001d\u001b")).toString(), arg0[2], arg0[3], false, true);
                return;
            }
            stringBuilder = new StringBuilder();
            sprasg.cfr_renamed_8071(stringBuilder.insert(0, arg0[1]).append(sprkgba.cfr_renamed_9("8\u000ef\u000b")).toString(), arg0[1], arg0[2], false, false);
            return;
        }
        if (arg0[0].equals(sprqks.cfr_renamed_9("@\u0018"))) {
            sprasg.cfr_renamed_8072(arg0[1], arg0[2], arg0[3].toCharArray(), new StringBuilder().insert(0, new File(arg0[1]).getName()).append(sprkgba.cfr_renamed_9("8\u0003c\u0018")).toString());
            return;
        }
        System.err.println(sprqks.cfr_renamed_9("\u0018\u000f\f\u001b\bFM7\b\u0005/\u001d\u001e\u0019\t0\f\u000e\n\u0019+\u0015\u0001\u0019=\u000e\u0002\u001f\b\u000f\u001e\u0013\u001f\\@\u0018\u0011Q\b\\6Q\f\u0000\f\u00150\\\u000b\u0015\u0001\u0019M'\u001e\u0019\u000e\u000e\b\b&\u0019\u0014:\u0004\u0010\b\\\u001d\u001d\u001e\u000f=\u0014\u001f\u001d\u001e\u0019\u0011\f\u0018\u001e&\u0019\u0014:\u0004\u0010\b!"));
    }

    private static /* synthetic */ void cfr_renamed_8072(String arg0, String arg1, char[] arg2, String arg3) throws IOException, NoSuchProviderException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(arg0));
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(arg1));
        BufferedInputStream bufferedInputStream3 = bufferedInputStream;
        sprasg.cfr_renamed_8070(bufferedInputStream3, bufferedInputStream2, arg2, arg3);
        ((InputStream)bufferedInputStream2).close();
        ((InputStream)bufferedInputStream3).close();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void cfr_renamed_8073(OutputStream arg0, String arg1, sprvbh arg2, boolean arg3, boolean arg4) throws IOException, NoSuchProviderException {
        if (arg3) {
            arg0 = new sprczl(arg0);
        }
        try {
            sprnwg sprnwg2;
            sprgvg sprgvg2;
            sprvd sprvd2 = new sprlbh(3).cfr_renamed_1499("BC").cfr_renamed_1555(new SecureRandom()).cfr_renamed_7906(arg4);
            sprgvg sprgvg3 = sprgvg2 = new sprgvg(sprvd2);
            sprgvg sprgvg4 = sprgvg2;
            sprgvg3.cfr_renamed_7868(new sprurg(arg2).cfr_renamed_1499("BC"));
            OutputStream outputStream = sprgvg3.cfr_renamed_7847(arg0, new byte[65536]);
            sprnwg sprnwg3 = sprnwg2 = new sprnwg(1);
            OutputStream outputStream2 = outputStream;
            sprmxg.cfr_renamed_7557(sprnwg3.cfr_renamed_4137(outputStream2), 'b', new File(arg1), new byte[65536]);
            sprnwg3.cfr_renamed_2637();
            outputStream2.close();
            if (!arg3) return;
            arg0.close();
            return;
        }
        catch (sprtqg sprtqg2) {
            System.err.println(sprtqg2);
            if (sprtqg2.cfr_renamed_584() == null) return;
            sprtqg2.cfr_renamed_584().printStackTrace();
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 2;
        int cfr_ignored_0 = 4 << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = 4 << 3;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    private static /* synthetic */ void cfr_renamed_8071(String arg0, String arg1, String arg2, boolean arg3, boolean arg4) throws IOException, NoSuchProviderException, sprtqg {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(arg0));
        sprvbh sprvbh2 = sprazg.cfr_renamed_8062(arg2);
        BufferedOutputStream bufferedOutputStream2 = bufferedOutputStream;
        sprasg.cfr_renamed_8073(bufferedOutputStream2, arg1, sprvbh2, arg3, arg4);
        ((OutputStream)bufferedOutputStream2).close();
    }
}

