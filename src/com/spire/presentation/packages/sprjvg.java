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
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprktg;
import com.spire.presentation.packages.sprlbh;
import com.spire.presentation.packages.sprlsg;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprmwg;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sprnlaa;
import com.spire.presentation.packages.sprpzg;
import com.spire.presentation.packages.sprqug;
import com.spire.presentation.packages.sprrdz;
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

public class sprjvg {
    private static /* synthetic */ void cfr_renamed_8072(String arg0, String arg1, char[] arg2, String arg3) throws IOException, NoSuchProviderException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(arg0));
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(arg1));
        BufferedInputStream bufferedInputStream3 = bufferedInputStream;
        sprjvg.cfr_renamed_8070(bufferedInputStream3, bufferedInputStream2, arg2, arg3);
        ((InputStream)bufferedInputStream2).close();
        ((InputStream)bufferedInputStream3).close();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ 4;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4;
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

    public static void main(String[] arg0) throws Exception {
        Security.addProvider(new sprsci());
        if (arg0.length == 0) {
            System.err.println(sprrdz.cfr_renamed_9("\u001ac\u000ew\n*O[\ni-q\u001cu\u000bV\u0006|\n@\u001d\u007f\fu\u001cc\u0000bO=\nlBtOKBq\u0013q\u0006MOv\u0006|\n04c\ns\u001du\u001b[\ni)y\u0003uO`\u000ec\u001c@\u0007b\u000ec\nl\u001fe\r[\ni)y\u0003u2"));
            return;
        }
        if (arg0[0].equals(sprnlaa.cfr_renamed_9("Jv"))) {
            StringBuilder stringBuilder;
            if (arg0[1].equals(sprrdz.cfr_renamed_9("=\u000e")) || arg0[1].equals(sprnlaa.cfr_renamed_9(">\u0006z")) || arg0[1].equals(sprrdz.cfr_renamed_9("By\u000e"))) {
                sprjvg.cfr_renamed_8071(new StringBuilder().insert(0, arg0[2]).append(sprnlaa.cfr_renamed_9("Ir\u0014p")).toString(), arg0[2], arg0[3], true, arg0[true].indexOf(105) > 0);
                return;
            }
            if (arg0[1].equals(sprrdz.cfr_renamed_9("=\u0006"))) {
                stringBuilder = new StringBuilder();
                sprjvg.cfr_renamed_8071(stringBuilder.insert(0, arg0[2]).append(sprnlaa.cfr_renamed_9("Iq\u0017t")).toString(), arg0[2], arg0[3], false, true);
                return;
            }
            stringBuilder = new StringBuilder();
            sprjvg.cfr_renamed_8071(stringBuilder.insert(0, arg0[1]).append(sprrdz.cfr_renamed_9(">\r`\b")).toString(), arg0[1], arg0[2], false, false);
            return;
        }
        if (arg0[0].equals(sprnlaa.cfr_renamed_9("Jw"))) {
            sprjvg.cfr_renamed_8072(arg0[1], arg0[2], arg0[3].toCharArray(), new StringBuilder().insert(0, new File(arg0[1]).getName()).append(sprrdz.cfr_renamed_9(">\u0000e\u001b")).toString());
            return;
        }
        System.err.println(sprnlaa.cfr_renamed_9("f\u0014r\u0000v]3,v\u001eQ\u0006`\u0002w!z\u000bv7a\bp\u0002`\u0014|\u00153Jw\u001b>\u00023<>\u0006o\u0006z:3\u0001z\u000bvGH\u0014v\u0004a\u0002g,v\u001eU\u000e\u007f\u00023\u0017r\u0014`7{\u0015r\u0014v\u001bc\u0012q,v\u001eU\u000e\u007f\u0002N"));
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
            OutputStream outputStream;
            sprgvg sprgvg2;
            byte[] byArray = sprazg.cfr_renamed_8064(arg1, 1);
            sprvd sprvd2 = new sprlbh(3).cfr_renamed_1499("BC").cfr_renamed_1555(new SecureRandom()).cfr_renamed_7906(arg4);
            sprgvg sprgvg3 = sprgvg2 = new sprgvg(sprvd2);
            sprgvg sprgvg4 = sprgvg2;
            sprgvg3.cfr_renamed_7868(new sprurg(arg2).cfr_renamed_1499("BC"));
            OutputStream outputStream2 = outputStream = sprgvg3.cfr_renamed_7859(arg0, byArray.length);
            outputStream2.write(byArray);
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

    private static /* synthetic */ void cfr_renamed_8070(InputStream arg0, InputStream arg1, char[] arg2, String arg3) throws IOException, NoSuchProviderException {
        arg0 = sprmxg.cfr_renamed_7556(arg0);
        try {
            FileOutputStream fileOutputStream;
            Object object;
            Object object2;
            sprkbh sprkbh2;
            sprwvg sprwvg2 = new sprwvg(arg0);
            Object object3 = sprwvg2.cfr_renamed_7703();
            Iterator<sprkah> iterator = (object3 instanceof sprkbh ? (sprkbh2 = (sprkbh)object3) : (sprkbh2 = (sprkbh)sprwvg2.cfr_renamed_7703())).cfr_renamed_7844();
            sprmah sprmah2 = null;
            sprgzg sprgzg2 = null;
            sprlsg sprlsg2 = new sprlsg(sprmxg.cfr_renamed_7556(arg1), (sprrk)new sprmwg());
            sprmah sprmah3 = sprmah2;
            while (sprmah3 == null && iterator.hasNext()) {
                sprgzg2 = (sprgzg)iterator.next();
                sprmah3 = sprazg.cfr_renamed_8063(sprlsg2, sprgzg2.cfr_renamed_7541(), arg2);
            }
            if (sprmah2 == null) {
                throw new IllegalArgumentException(sprrdz.cfr_renamed_9("\u001cu\fb\ndO{\niOv\u0000bO}\nc\u001cq\buO~\u0000dOv\u0000e\u0001tA"));
            }
            InputStream inputStream = sprgzg2.cfr_renamed_7784(new sprktg().cfr_renamed_1499("BC").cfr_renamed_7940(sprmah2));
            Object object4 = new sprwvg(inputStream).cfr_renamed_7703();
            if (object4 instanceof sprftg) {
                object2 = (sprftg)object4;
                object = new sprwvg(((sprftg)object2).cfr_renamed_7830());
                object4 = ((sprqug)object).cfr_renamed_7703();
            }
            if (object4 instanceof sprpzg) {
                object2 = (sprpzg)object4;
                object = ((sprpzg)object2).cfr_renamed_678();
                if (((String)object).length() == 0) {
                    object = arg3;
                }
            } else {
                if (object4 instanceof sprwsg) {
                    throw new sprtqg(sprnlaa.cfr_renamed_9("v\tp\u0015j\u0017g\u0002wG~\u0002`\u0014r\u0000vGp\b}\u0013r\u000e}\u00143\u00063\u0014z\u0000}\u0002wG~\u0002`\u0014r\u0000vG>G}\bgG\u007f\u000eg\u0002a\u0006\u007fGw\u0006g\u0006="));
                }
                throw new sprtqg(sprrdz.cfr_renamed_9("}\nc\u001cq\buOy\u001c0\u0001\u007f\u001b0\u000e0\u001cy\u0002`\u0003uOu\u0001s\u001di\u001fd\ntOv\u0006|\n0B0\u001bi\u001fuOe\u0001{\u0001\u007f\u0018~A"));
            }
            InputStream inputStream2 = ((sprpzg)object2).cfr_renamed_2920();
            FileOutputStream fileOutputStream2 = fileOutputStream = new FileOutputStream((String)object);
            sprkqe.cfr_renamed_5195(inputStream2, fileOutputStream2, 8192);
            ((OutputStream)fileOutputStream2).close();
            if (sprgzg2.cfr_renamed_7846()) {
                if (!sprgzg2.cfr_renamed_1626()) {
                    System.err.println(sprnlaa.cfr_renamed_9("\nv\u0014`\u0006t\u00023\u0001r\u000e\u007f\u0002wGz\tg\u0002t\u0015z\u0013jGp\u000fv\u0004x"));
                    return;
                }
                System.err.println(sprrdz.cfr_renamed_9("}\nc\u001cq\buOy\u0001d\nw\u001dy\u001biOs\u0007u\f{O`\u000ec\u001cu\u000b"));
                return;
            }
            System.err.println(sprnlaa.cfr_renamed_9("\t|G~\u0002`\u0014r\u0000vGz\tg\u0002t\u0015z\u0013jGp\u000fv\u0004x"));
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

    private static /* synthetic */ void cfr_renamed_8071(String arg0, String arg1, String arg2, boolean arg3, boolean arg4) throws IOException, NoSuchProviderException, sprtqg {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(arg0));
        sprvbh sprvbh2 = sprazg.cfr_renamed_8062(arg2);
        BufferedOutputStream bufferedOutputStream2 = bufferedOutputStream;
        sprjvg.cfr_renamed_8073(bufferedOutputStream2, arg1, sprvbh2, arg3, arg4);
        ((OutputStream)bufferedOutputStream2).close();
    }
}

