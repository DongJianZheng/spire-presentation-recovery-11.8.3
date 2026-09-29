/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbuy;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprfjb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprnla;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprqhe;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprxvc;
import com.spire.presentation.packages.spryk;
import com.spire.presentation.packages.sprywa;
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

public class sprjra {
    private static Hashtable cfr_renamed_2 = new Hashtable();
    private static Hashtable cfr_renamed_3 = new Hashtable();
    private static Set cfr_renamed_4 = new HashSet();

    public static sprnla cfr_renamed_115(String arg0, String arg1, Provider arg2) throws NoSuchAlgorithmException {
        String string;
        arg1 = sprywa.cfr_renamed_116(arg1);
        Provider provider = arg2;
        while ((string = provider.getProperty(new StringBuilder().insert(0, sprbuy.cfr_renamed_9("3m\u0015/3m\u001b`\u0001/")).append(arg0).append(".").append(arg1).toString())) != null) {
            arg1 = string;
            provider = arg2;
        }
        String string2 = arg2.getProperty(new StringBuilder().insert(0, arg0).append(".").append(arg1).toString());
        if (string2 != null) {
            try {
                ClassLoader classLoader = arg2.getClass().getClassLoader();
                Class<?> clazz = classLoader != null ? classLoader.loadClass(string2) : Class.forName(string2);
                return new sprnla(clazz.newInstance(), arg2);
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprxvc.cfr_renamed_9("0s6p#v%w<?")).append(arg1).append(sprbuy.cfr_renamed_9("!\u001boRq\u0000n\u0004h\u0016d\u0000!")).append(arg2.getName()).append(sprxvc.cfr_renamed_9("?3j%??pq|=~\"lq=")).append(string2).append(sprbuy.cfr_renamed_9("P!\u0014n\u0007o\u0016 ")).toString());
            }
            catch (Exception exception) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprxvc.cfr_renamed_9("0s6p#v%w<?")).append(arg1).append(sprbuy.cfr_renamed_9("!\u001boRq\u0000n\u0004h\u0016d\u0000!")).append(arg2.getName()).append(sprxvc.cfr_renamed_9("q}$kq|=~\"lq=")).append(string2).append(sprbuy.cfr_renamed_9("#Rh\u001c`\u0011b\u0017r\u0001h\u0010m\u0017 ")).toString());
            }
        }
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprxvc.cfr_renamed_9("|0q?p%?7v?{qv<o=z<z?k0k8p??")).append(arg1).append(sprbuy.cfr_renamed_9("Rg\u001dsRq\u0000n\u0004h\u0016d\u0000!")).append(arg2.getName()).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprnla cfr_renamed_117(String arg0, String arg1) throws NoSuchAlgorithmException {
        int n;
        Provider[] providerArray = Security.getProviders();
        int n2 = n = 0;
        while (true) {
            if (n2 == providerArray.length) {
                throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprxvc.cfr_renamed_9("|0q?p%?7v?{qv<o=z<z?k0k8p??")).append(arg1).toString());
            }
            sprnla sprnla2 = sprjra.cfr_renamed_115(arg0, sprywa.cfr_renamed_116(arg1), providerArray[n]);
            if (sprnla2 != null) {
                return sprnla2;
            }
            try {
                sprnla2 = sprjra.cfr_renamed_115(arg0, arg1, providerArray[n]);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                // empty catch block
            }
            n2 = ++n;
        }
    }

    public static byte[] cfr_renamed_47(sprtzd arg0, String arg1, String arg2, PrivateKey arg3, SecureRandom arg4, spra arg5) throws IOException, NoSuchProviderException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Signature signature;
        if (arg0 == null) {
            throw new IllegalStateException(sprbuy.cfr_renamed_9("\u001cnRr\u001bf\u001c`\u0006t\u0000dR`\u001ef\u001ds\u001bu\u001alRr\u0002d\u0011h\u0014h\u0017e"));
        }
        Signature signature2 = sprjra.cfr_renamed_118(arg1, arg2);
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

    public static sprtzd cfr_renamed_51(String arg0) {
        if (cfr_renamed_2.containsKey(arg0 = sprywa.cfr_renamed_116(arg0))) {
            return (sprtzd)cfr_renamed_2.get(arg0);
        }
        return new sprtzd(arg0);
    }

    public static Signature cfr_renamed_118(String arg0, String arg1) throws NoSuchProviderException, NoSuchAlgorithmException {
        if (arg1 != null) {
            return Signature.getInstance(arg0, arg1);
        }
        return Signature.getInstance(arg0);
    }

    public static sprije cfr_renamed_52(sprtzd arg0, String arg1) {
        if (cfr_renamed_4.contains(arg0)) {
            return new sprije(arg0);
        }
        if (cfr_renamed_3.containsKey(arg1 = sprywa.cfr_renamed_116(arg1))) {
            return new sprije(arg0, (spra)cfr_renamed_3.get(arg1));
        }
        return new sprije(arg0, sprume.cfr_renamed_3);
    }

    public static Iterator cfr_renamed_26() {
        Enumeration enumeration = cfr_renamed_2.keys();
        ArrayList arrayList = new ArrayList();
        Enumeration enumeration2 = enumeration;
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            arrayList.add(enumeration3.nextElement());
        }
        return arrayList.iterator();
    }

    public static Signature cfr_renamed_120(String arg0) throws NoSuchAlgorithmException {
        return Signature.getInstance(arg0);
    }

    public static Provider cfr_renamed_121(String arg0) throws NoSuchProviderException {
        Provider provider = Security.getProvider(arg0);
        if (provider == null) {
            throw new NoSuchProviderException(new StringBuilder().insert(0, sprxvc.cfr_renamed_9("O#p'v5z#?")).append(arg0).append(sprbuy.cfr_renamed_9("Ro\u001duRg\u001dt\u001ce")).toString());
        }
        return provider;
    }

    private static /* synthetic */ sprqhe cfr_renamed_122(sprije arg0, int arg1) {
        return new sprqhe(arg0, new sprije(sprm.cfr_renamed_123, arg0), new sprooe(arg1), new sprooe(1L));
    }

    public static byte[] cfr_renamed_57(sprtzd arg0, String arg1, PrivateKey arg2, SecureRandom arg3, spra arg4) throws IOException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Signature signature;
        if (arg0 == null) {
            throw new IllegalStateException(sprxvc.cfr_renamed_9("?pql8x?~%j#zq~=x>m8k9rql!z2v7v4{"));
        }
        Signature signature2 = sprjra.cfr_renamed_120(arg1);
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
    public static sprfjb cfr_renamed_124(X500Principal arg0) {
        try {
            return new sprfjb(arg0.getEncoded());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprbuy.cfr_renamed_9("\u0011`\u001co\u001duRb\u001do\u0004d\u0000uRq\u0000h\u001cb\u001bq\u0013m"));
        }
    }

    static {
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("\u001c[cH\u0018K\u0019M\u0002^\u0014Q\u0012M\bO\u0005V\u001eQ"), sprm.cfr_renamed_125);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9("?E@V;U:S!@"), sprm.cfr_renamed_125);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("\u001c[dH\u0018K\u0019M\u0002^\u0014Q\u0012M\bO\u0005V\u001eQ"), sprm.cfr_renamed_126);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9("?EGV;U:S!@"), sprm.cfr_renamed_126);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("L\u0019^`H\u0018K\u0019M\u0002^\u0014Q\u0012M\bO\u0005V\u001eQ"), sprm.cfr_renamed_127);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9("R:@CV;U:S!@"), sprm.cfr_renamed_127);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("L\u0019^c-eH\u0018K\u0019M\u0002^\u0014Q\u0012M\bO\u0005V\u001eQ"), sprm.cfr_renamed_128);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9("R:@@3FV;U:S!@"), sprm.cfr_renamed_128);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("L\u0019^c*gH\u0018K\u0019M\u0002^\u0014Q\u0012M\bO\u0005V\u001eQ"), sprm.cfr_renamed_129);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9("R:@@4DV;U:S!@"), sprm.cfr_renamed_129);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("L\u0019^b'eH\u0018K\u0019M\u0002^\u0014Q\u0012M\bO\u0005V\u001eQ"), sprm.cfr_renamed_130);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9("R:@A9FV;U:S!@"), sprm.cfr_renamed_130);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("L\u0019^d.cH\u0018K\u0019M\u0002^\u0014Q\u0012M\bO\u0005V\u001eQ"), sprm.cfr_renamed_107);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9("R:@G0@V;U:S!@"), sprm.cfr_renamed_107);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("\u0002W\u0010.\u0006V\u0005W\u0003L\u0010^\u001f[\u001cX\u0017."), sprm.cfr_renamed_131);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9("!I33@5%H&I R3@<E?F40"), sprm.cfr_renamed_131);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("\u0002W\u0010-d)\u0006V\u0005W\u0003L\u0010^\u001f[\u001cX\u0017."), sprm.cfr_renamed_131);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9("!I32J5%H&I R3@<E?F40"), sprm.cfr_renamed_131);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("\u0002W\u0010*`-\u0006V\u0005W\u0003L\u0010^\u001f[\u001cX\u0017."), sprm.cfr_renamed_131);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9(" H\"D?EC7BV;U:S!@7O1S+Q&H=O"), spryk.cfr_renamed_2);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("\u0003V\u0001Z\u001c[`)aH\u0018K\u0019M\u0002^"), spryk.cfr_renamed_2);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9(" H\"D?EC3JV;U:S!@7O1S+Q&H=O"), spryk.cfr_renamed_82);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("\u0003V\u0001Z\u001c[`-iH\u0018K\u0019M\u0002^"), spryk.cfr_renamed_82);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9(" H\"D?E@4DV;U:S!@7O1S+Q&H=O"), spryk.spr\ufe34);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("\u0003V\u0001Z\u001c[c*gH\u0018K\u0019M\u0002^"), spryk.spr\ufe34);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9("R:@CV;U:E!@"), sprtk.cfr_renamed_132);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("[\u0002^\u0006V\u0005W\u0002W\u0010."), sprtk.cfr_renamed_132);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9("R:@@3FV;U:E!@"), sprdg.cfr_renamed_4);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("L\u0019^c*gH\u0018K\u0019[\u0002^"), sprdg.cfr_renamed_1);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9("R:@A9FV;U:E!@"), sprdg.cfr_renamed_133);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("L\u0019^d.cH\u0018K\u0019[\u0002^"), sprdg.cfr_renamed_31);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9("R:@CV;U:D1E!@"), sprtk.cfr_renamed_4);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("Z\u0012[\u0002^\u0006V\u0005W\u0002W\u0010."), sprtk.cfr_renamed_4);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9("R:@@3FV;U:D1E!@"), sprtk.cfr_renamed_134);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("L\u0019^c*gH\u0018K\u0019Z\u0012[\u0002^"), sprtk.cfr_renamed_91);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9("R:@A9FV;U:D1E!@"), sprtk.cfr_renamed_135);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("L\u0019^d.cH\u0018K\u0019Z\u0012[\u0002^"), sprtk.cfr_renamed_136);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9("5N!UA5C0%H&I5N!UA5C1"), sprji.cfr_renamed_88);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("X\u001eL\u0005,e.`H\u0018K\u0019X\u001eL\u0005,e.a2h+"), sprji.cfr_renamed_88);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9("5N!UA5C0%H&I7B5N!UA5C1"), sprji.cfr_renamed_137);
        cfr_renamed_2.put(sprxvc.cfr_renamed_9("X\u001eL\u0005,e.`H\u0018K\u0019Z\u0012X\u001eL\u0005,e.a2c/a."), sprji.cfr_renamed_137);
        cfr_renamed_2.put(sprbuy.cfr_renamed_9("F=R&2F0CV;U:F=R&2F0B,@1B0"), sprji.cfr_renamed_137);
        cfr_renamed_4.add(sprtk.cfr_renamed_4);
        cfr_renamed_4.add(sprtk.cfr_renamed_134);
        cfr_renamed_4.add(sprtk.cfr_renamed_91);
        cfr_renamed_4.add(sprtk.cfr_renamed_135);
        cfr_renamed_4.add(sprtk.cfr_renamed_136);
        cfr_renamed_4.add(sprtk.cfr_renamed_132);
        cfr_renamed_4.add(sprdg.cfr_renamed_4);
        cfr_renamed_4.add(sprdg.cfr_renamed_1);
        cfr_renamed_4.add(sprdg.cfr_renamed_133);
        cfr_renamed_4.add(sprdg.cfr_renamed_31);
        cfr_renamed_4.add(sprji.cfr_renamed_88);
        cfr_renamed_4.add(sprji.cfr_renamed_137);
        sprije sprije2 = new sprije(sprdh.cfr_renamed_86, sprume.cfr_renamed_3);
        cfr_renamed_3.put(sprxvc.cfr_renamed_9("\u0002W\u0010.\u0006V\u0005W\u0003L\u0010^\u001f[\u001cX\u0017."), sprjra.cfr_renamed_122(sprije2, 20));
        sprije sprije3 = new sprije(sprdg.spr\ufe34, sprume.cfr_renamed_3);
        cfr_renamed_3.put(sprbuy.cfr_renamed_9("!I33@5%H&I R3@<E?F40"), sprjra.cfr_renamed_122(sprije3, 28));
        sprije sprije4 = new sprije(sprdg.cfr_renamed_119, sprume.cfr_renamed_3);
        cfr_renamed_3.put(sprxvc.cfr_renamed_9("\u0002W\u0010-d)\u0006V\u0005W\u0003L\u0010^\u001f[\u001cX\u0017."), sprjra.cfr_renamed_122(sprije4, 32));
        sprije sprije5 = new sprije(sprdg.cfr_renamed_112, sprume.cfr_renamed_3);
        cfr_renamed_3.put(sprbuy.cfr_renamed_9("!I32J5%H&I R3@<E?F40"), sprjra.cfr_renamed_122(sprije5, 48));
        sprije sprije6 = new sprije(sprdg.cfr_renamed_107, sprume.cfr_renamed_3);
        cfr_renamed_3.put(sprxvc.cfr_renamed_9("\u0002W\u0010*`-\u0006V\u0005W\u0003L\u0010^\u001f[\u001cX\u0017."), sprjra.cfr_renamed_122(sprije6, 64));
    }
}

