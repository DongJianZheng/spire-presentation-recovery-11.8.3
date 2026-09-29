/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdzh;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprque;
import com.spire.presentation.packages.sprrsm;
import com.spire.presentation.packages.sprrya;
import com.spire.presentation.packages.sprwiea;
import com.spire.presentation.packages.sprwr;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public class spriue {
    private static Hashtable cfr_renamed_2;
    private static Set cfr_renamed_3;
    private static Hashtable cfr_renamed_4;

    public static Signature cfr_renamed_120(String arg0) throws NoSuchAlgorithmException {
        return Signature.getInstance(arg0);
    }

    public static byte[] cfr_renamed_5008(sprlem arg0, String arg1, String arg2, PrivateKey arg3, SecureRandom arg4, sprco arg5) throws IOException, NoSuchProviderException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Signature signature;
        if (arg0 == null) {
            throw new IllegalStateException(sprwiea.cfr_renamed_9(" \u0014n\b'\u001c \u001a:\u000e<\u001en\u001a\"\u001c!\t'\u000f&\u0016n\b>\u001e-\u0012(\u0012+\u001f"));
        }
        Signature signature2 = spriue.cfr_renamed_118(arg1, arg2);
        if (arg4 != null) {
            Signature signature3 = signature2;
            signature = signature3;
            signature3.initSign(arg3, arg4);
        } else {
            Signature signature4 = signature2;
            signature = signature4;
            signature4.initSign(arg3);
        }
        signature.update(arg5.cfr_renamed_119().cfr_renamed_104("DER"));
        return signature2.sign();
    }

    private static /* synthetic */ sprrsm cfr_renamed_5025(sprddm arg0, int arg1) {
        return new sprrsm(arg0, new sprddm(sprdl.cfr_renamed_135, arg0), new sprktm(arg1), new sprktm(1L));
    }

    public static Provider cfr_renamed_121(String arg0) throws NoSuchProviderException {
        Provider provider = Security.getProvider(arg0);
        if (provider == null) {
            throw new NoSuchProviderException(new StringBuilder().insert(0, sprrya.cfr_renamed_9("c\n\\\u000eZ\u001cV\n\u0013")).append(arg0).append(sprwiea.cfr_renamed_9("n\u0015!\u000fn\u001d!\u000e \u001f")).toString());
        }
        return provider;
    }

    public static byte[] cfr_renamed_5014(sprlem arg0, String arg1, PrivateKey arg2, SecureRandom arg3, sprco arg4) throws IOException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Signature signature;
        if (arg0 == null) {
            throw new IllegalStateException(sprrya.cfr_renamed_9("\u0016\\X@\u0011T\u0016R\fF\nVXR\u0014T\u0017A\u0011G\u0010^X@\bV\u001bZ\u001eZ\u001dW"));
        }
        Signature signature2 = spriue.cfr_renamed_120(arg1);
        if (arg3 != null) {
            Signature signature3 = signature2;
            signature = signature3;
            signature3.initSign(arg2, arg3);
        } else {
            Signature signature4 = signature2;
            signature = signature4;
            signature4.initSign(arg2);
        }
        signature.update(arg4.cfr_renamed_119().cfr_renamed_104("DER"));
        return signature2.sign();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprque cfr_renamed_117(String arg0, String arg1) throws NoSuchAlgorithmException {
        int n;
        Provider[] providerArray = Security.getProviders();
        int n2 = n = 0;
        while (true) {
            if (n2 == providerArray.length) {
                throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprwiea.cfr_renamed_9("\u0018/\u0015 \u0014:[(\u0012 \u001fn\u0012#\u000b\"\u001e#\u001e \u000f/\u000f'\u0014 [")).append(arg1).toString());
            }
            sprque sprque2 = spriue.cfr_renamed_115(arg0, sprkoe.cfr_renamed_116(arg1), providerArray[n]);
            if (sprque2 != null) {
                return sprque2;
            }
            try {
                sprque2 = spriue.cfr_renamed_115(arg0, arg1, providerArray[n]);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                // empty catch block
            }
            n2 = ++n;
        }
    }

    public static Signature cfr_renamed_118(String arg0, String arg1) throws NoSuchProviderException, NoSuchAlgorithmException {
        if (arg1 != null) {
            return Signature.getInstance(arg0, arg1);
        }
        return Signature.getInstance(arg0);
    }

    public static sprddm cfr_renamed_4995(sprlem arg0, String arg1) {
        if (cfr_renamed_3.contains(arg0)) {
            return new sprddm(arg0);
        }
        if (cfr_renamed_2.containsKey(arg1 = sprkoe.cfr_renamed_116(arg1))) {
            return new sprddm(arg0, (sprco)cfr_renamed_2.get(arg1));
        }
        return new sprddm(arg0, sprpen.cfr_renamed_4);
    }

    public static sprque cfr_renamed_115(String arg0, String arg1, Provider arg2) throws NoSuchAlgorithmException {
        String string;
        arg1 = sprkoe.cfr_renamed_116(arg1);
        Provider provider = arg2;
        while ((string = provider.getProperty(new StringBuilder().insert(0, sprrya.cfr_renamed_9("9_\u001f\u001d9_\u0011R\u000b\u001d")).append(arg0).append(".").append(arg1).toString())) != null) {
            arg1 = string;
            provider = arg2;
        }
        String string2 = arg2.getProperty(new StringBuilder().insert(0, arg0).append(".").append(arg1).toString());
        if (string2 != null) {
            try {
                ClassLoader classLoader = arg2.getClass().getClassLoader();
                Class<?> clazz = classLoader != null ? classLoader.loadClass(string2) : Class.forName(string2);
                return new sprque(clazz.newInstance(), arg2);
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprwiea.cfr_renamed_9("/\u0017)\u0014<\u0012:\u0013#[")).append(arg1).append(sprrya.cfr_renamed_9("\u0013\u0011]XC\n\\\u000eZ\u001cV\n\u0013")).append(arg2.getName()).append(sprwiea.cfr_renamed_9("[,\u000e:[ \u0014n\u0018\"\u001a=\bnY")).append(string2).append(sprrya.cfr_renamed_9("Z\u0013\u001e\\\r]\u001c\u0012")).toString());
            }
            catch (Exception exception) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprwiea.cfr_renamed_9("/\u0017)\u0014<\u0012:\u0013#[")).append(arg1).append(sprrya.cfr_renamed_9("\u0013\u0011]XC\n\\\u000eZ\u001cV\n\u0013")).append(arg2.getName()).append(sprwiea.cfr_renamed_9("n\u0019;\u000fn\u0018\"\u001a=\bnY")).append(string2).append(sprrya.cfr_renamed_9("\u0011XZ\u0016R\u001bP\u001d@\u000bZ\u001a_\u001d\u0012")).toString());
            }
        }
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprwiea.cfr_renamed_9("\u0018/\u0015 \u0014:[(\u0012 \u001fn\u0012#\u000b\"\u001e#\u001e \u000f/\u000f'\u0014 [")).append(arg1).append(sprrya.cfr_renamed_9("XU\u0017AXC\n\\\u000eZ\u001cV\n\u0013")).append(arg2.getName()).toString());
    }

    public static sprlem cfr_renamed_51(String arg0) {
        if (cfr_renamed_4.containsKey(arg0 = sprkoe.cfr_renamed_116(arg0))) {
            return (sprlem)cfr_renamed_4.get(arg0);
        }
        return new sprlem(arg0);
    }

    public static Iterator cfr_renamed_26() {
        Enumeration enumeration = cfr_renamed_4.keys();
        ArrayList arrayList = new ArrayList();
        Enumeration enumeration2 = enumeration;
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            arrayList.add(enumeration3.nextElement());
        }
        return arrayList.iterator();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprdzh cfr_renamed_124(X500Principal arg0) {
        try {
            return new sprdzh(arg0.getEncoded());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprwiea.cfr_renamed_9("-\u001a \u0015!\u000fn\u0018!\u00158\u001e<\u000fn\u000b<\u0012 \u0018'\u000b/\u0017"));
        }
    }

    static {
        cfr_renamed_4 = new Hashtable();
        cfr_renamed_2 = new Hashtable();
        cfr_renamed_3 = new HashSet();
        cfr_renamed_4.put(sprrya.cfr_renamed_9("5wJd1g0a+r=};a!c,z7}"), sprdl.cfr_renamed_1762);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("\u0003?|,\u0007/\u0006)\u001d:"), sprdl.cfr_renamed_1762);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("5wMd1g0a+r=};a!c,z7}"), sprdl.cfr_renamed_614);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("\u0003?{,\u0007/\u0006)\u001d:"), sprdl.cfr_renamed_614);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("`0rId1g0a+r=};a!c,z7}"), sprdl.cfr_renamed_3051);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("(\u0006:\u007f,\u0007/\u0006)\u001d:"), sprdl.cfr_renamed_3051);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("`0rJ\u0001Ld1g0a+r=};a!c,z7}"), sprdl.cfr_renamed_1262);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("(\u0006:|Iz,\u0007/\u0006)\u001d:"), sprdl.cfr_renamed_1262);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("`0rJ\u0006Nd1g0a+r=};a!c,z7}"), sprdl.cfr_renamed_1601);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("(\u0006:|Nx,\u0007/\u0006)\u001d:"), sprdl.cfr_renamed_1601);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("`0rK\u000bLd1g0a+r=};a!c,z7}"), sprdl.cfr_renamed_1572);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("(\u0006:}Cz,\u0007/\u0006)\u001d:"), sprdl.cfr_renamed_1572);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("`0rM\u0002Jd1g0a+r=};a!c,z7}"), sprdl.cfr_renamed_84);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("(\u0006:{J|,\u0007/\u0006)\u001d:"), sprdl.cfr_renamed_84);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("+{9\u0002/z,{*`9r6w5t>\u0002"), sprdl.cfr_renamed_3250);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("\u001d3\u000fI|O\u00192\u001a3\u001c(\u000f:\u0000?\u0003<\bJ"), sprdl.cfr_renamed_3250);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("+{9\u0001M\u0005/z,{*`9r6w5t>\u0002"), sprdl.cfr_renamed_3250);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("\u001d3\u000fHvO\u00192\u001a3\u001c(\u000f:\u0000?\u0003<\bJ"), sprdl.cfr_renamed_3250);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("+{9\u0006I\u0001/z,{*`9r6w5t>\u0002"), sprdl.cfr_renamed_3250);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("\u001c2\u001e>\u0003?\u007fM~,\u0007/\u0006)\u001d:\u000b5\r)\u0017+\u001a2\u00015"), spris.cfr_renamed_133);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("*z(v5wI\u0005Hd1g0a+r"), spris.cfr_renamed_133);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("\u001c2\u001e>\u0003?\u007fIv,\u0007/\u0006)\u001d:\u000b5\r)\u0017+\u001a2\u00015"), spris.cfr_renamed_86);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("*z(v5wI\u0001@d1g0a+r"), spris.cfr_renamed_86);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("\u001c2\u001e>\u0003?|Nx,\u0007/\u0006)\u001d:\u000b5\r)\u0017+\u001a2\u00015"), spris.cfr_renamed_112);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("*z(v5wJ\u0006Nd1g0a+r"), spris.cfr_renamed_112);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("(\u0006:\u007f,\u0007/\u0006?\u001d:"), sprbr.cfr_renamed_615);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("w+r/z,{+{9\u0002"), sprbr.cfr_renamed_615);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("(\u0006:|Iz,\u0007/\u0006?\u001d:"), sprwr.cfr_renamed_79);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("`0rJ\u0006Nd1g0w+r"), sprwr.cfr_renamed_82);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("(\u0006:}Cz,\u0007/\u0006?\u001d:"), sprwr.cfr_renamed_1260);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("`0rM\u0002Jd1g0w+r"), sprwr.cfr_renamed_1337);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("(\u0006:\u007f,\u0007/\u0006>\r?\u001d:"), sprbr.cfr_renamed_955);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("v;w+r/z,{+{9\u0002"), sprbr.cfr_renamed_955);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("(\u0006:|Iz,\u0007/\u0006>\r?\u001d:"), sprbr.cfr_renamed_129);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("`0rJ\u0006Nd1g0v;w+r"), sprbr.cfr_renamed_79);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("(\u0006:}Cz,\u0007/\u0006>\r?\u001d:"), sprbr.cfr_renamed_107);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("`0rM\u0002Jd1g0v;w+r"), sprbr.cfr_renamed_724);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("\t4\u001d/}O\u007fJ\u00192\u001a3\t4\u001d/}O\u007fK"), sprqo.cfr_renamed_107);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("t7`,\u0000L\u0002Id1g0t7`,\u0000L\u0002H\u001eA\u0007"), sprqo.cfr_renamed_107);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("\t4\u001d/}O\u007fJ\u00192\u001a3\u000b8\t4\u001d/}O\u007fK"), sprqo.cfr_renamed_96);
        cfr_renamed_4.put(sprrya.cfr_renamed_9("t7`,\u0000L\u0002Id1g0v;t7`,\u0000L\u0002H\u001eJ\u0003H\u0002"), sprqo.cfr_renamed_96);
        cfr_renamed_4.put(sprwiea.cfr_renamed_9("<\u0001(\u001aHzJ\u007f,\u0007/\u0006<\u0001(\u001aHzJ~V|K~J"), sprqo.cfr_renamed_96);
        cfr_renamed_3.add(sprbr.cfr_renamed_955);
        cfr_renamed_3.add(sprbr.cfr_renamed_129);
        cfr_renamed_3.add(sprbr.cfr_renamed_79);
        cfr_renamed_3.add(sprbr.cfr_renamed_107);
        cfr_renamed_3.add(sprbr.cfr_renamed_724);
        cfr_renamed_3.add(sprbr.cfr_renamed_615);
        cfr_renamed_3.add(sprgt.cfr_renamed_93);
        cfr_renamed_3.add(sprwr.cfr_renamed_79);
        cfr_renamed_3.add(sprwr.cfr_renamed_82);
        cfr_renamed_3.add(sprwr.cfr_renamed_1260);
        cfr_renamed_3.add(sprwr.cfr_renamed_1337);
        cfr_renamed_3.add(sprqo.cfr_renamed_107);
        cfr_renamed_3.add(sprqo.cfr_renamed_96);
        sprddm sprddm2 = new sprddm(sprgt.cfr_renamed_0, sprpen.cfr_renamed_4);
        cfr_renamed_2.put(sprrya.cfr_renamed_9("+{9\u0002/z,{*`9r6w5t>\u0002"), spriue.cfr_renamed_5025(sprddm2, 20));
        sprddm sprddm3 = new sprddm(sprwr.cfr_renamed_957, sprpen.cfr_renamed_4);
        cfr_renamed_2.put(sprwiea.cfr_renamed_9("\u001d3\u000fI|O\u00192\u001a3\u001c(\u000f:\u0000?\u0003<\bJ"), spriue.cfr_renamed_5025(sprddm3, 28));
        sprddm sprddm4 = new sprddm(sprwr.cfr_renamed_1226, sprpen.cfr_renamed_4);
        cfr_renamed_2.put(sprrya.cfr_renamed_9("+{9\u0001M\u0005/z,{*`9r6w5t>\u0002"), spriue.cfr_renamed_5025(sprddm4, 32));
        sprddm sprddm5 = new sprddm(sprwr.cfr_renamed_112, sprpen.cfr_renamed_4);
        cfr_renamed_2.put(sprwiea.cfr_renamed_9("\u001d3\u000fHvO\u00192\u001a3\u001c(\u000f:\u0000?\u0003<\bJ"), spriue.cfr_renamed_5025(sprddm5, 48));
        sprddm sprddm6 = new sprddm(sprwr.cfr_renamed_272, sprpen.cfr_renamed_4);
        cfr_renamed_2.put(sprrya.cfr_renamed_9("+{9\u0006I\u0001/z,{*`9r6w5t>\u0002"), spriue.cfr_renamed_5025(sprddm6, 64));
    }
}

