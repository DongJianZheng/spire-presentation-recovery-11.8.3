/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprfjb;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprqhe;
import com.spire.presentation.packages.sprrbfa;
import com.spire.presentation.packages.sprrle;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruib;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwjb;
import com.spire.presentation.packages.spryge;
import com.spire.presentation.packages.spryk;
import com.spire.presentation.packages.sprywa;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public class sprjnb
extends sprwjb {
    private static Hashtable cfr_renamed_0;
    private static Hashtable cfr_renamed_1;
    private static Hashtable cfr_renamed_2;
    private static Set cfr_renamed_3;
    private static Hashtable cfr_renamed_4;

    private static /* synthetic */ String cfr_renamed_1546(sprtzd arg0) {
        if (sprm.cfr_renamed_102.equals(arg0)) {
            return "MD5";
        }
        if (sprdh.cfr_renamed_86.equals(arg0)) {
            return "SHA1";
        }
        if (sprdg.spr\ufe34.equals(arg0)) {
            return sprrle.cfr_renamed_9("4?&EUC");
        }
        if (sprdg.cfr_renamed_119.equals(arg0)) {
            return "SHA256";
        }
        if (sprdg.cfr_renamed_112.equals(arg0)) {
            return "SHA384";
        }
        if (sprdg.cfr_renamed_107.equals(arg0)) {
            return "SHA512";
        }
        if (spryk.cfr_renamed_126.equals(arg0)) {
            return sprrbfa.cfr_renamed_9(" |\"p?qC\u0007J");
        }
        if (spryk.cfr_renamed_91.equals(arg0)) {
            return "RIPEMD160";
        }
        if (spryk.cfr_renamed_3.equals(arg0)) {
            return sprrle.cfr_renamed_9("%.'\":#ERA");
        }
        if (sprji.cfr_renamed_31.equals(arg0)) {
            return sprrbfa.cfr_renamed_9("r=f&\u0006F\u0004C");
        }
        return arg0.cfr_renamed_19();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprbne cfr_renamed_1625(byte[] arg0) {
        try {
            sprgle sprgle2 = new sprgle(arg0);
            return (sprbne)sprgle2.cfr_renamed_24();
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(sprrle.cfr_renamed_9("\u0015\u0006\u0013\u000b\u000eG\u0012\t\u0014\b\u0013\u0002\u0013G\u0005\u0002\u0006\u0012\u0012\u0014\u0003"));
        }
    }

    public sprjnb(sprbne arg0) {
        super(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_2120(Signature arg0, spra arg1) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (arg1 != null && !sprume.cfr_renamed_3.equals(arg1)) {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(arg0.getAlgorithm(), arg0.getProvider());
            try {
                algorithmParameters.init(arg1.cfr_renamed_119().cfr_renamed_104("DER"));
            }
            catch (IOException iOException) {
                throw new SignatureException(new StringBuilder().insert(0, sprrbfa.cfr_renamed_9(";z7M\u0011P\u0002A\u001bZ\u001c\u0015\u0016P\u0011Z\u0016\\\u001cRRE\u0013G\u0013X\u0017A\u0017G\u0001\u000fR")).append(iOException.getMessage()).toString());
            }
            if (arg0.getAlgorithm().endsWith(sprrle.cfr_renamed_9("*0!F"))) {
                try {
                    arg0.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                    return;
                }
                catch (GeneralSecurityException generalSecurityException) {
                    throw new SignatureException(new StringBuilder().insert(0, sprrbfa.cfr_renamed_9("7M\u0011P\u0002A\u001bZ\u001c\u0015\u0017M\u0006G\u0013V\u0006\\\u001cRRE\u0013G\u0013X\u0017A\u0017G\u0001\u000fR")).append(generalSecurityException.getMessage()).toString());
                }
            }
        }
    }

    public boolean cfr_renamed_1626() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        return this.cfr_renamed_1623("BC");
    }

    public static String cfr_renamed_1538(sprije arg0) {
        spra spra2 = arg0.cfr_renamed_284();
        if (spra2 != null && !sprume.cfr_renamed_3.equals(spra2) && arg0.cfr_renamed_90().equals(sprm.cfr_renamed_131)) {
            sprqhe sprqhe2 = sprqhe.cfr_renamed_23(spra2);
            return new StringBuilder().insert(0, sprjnb.cfr_renamed_1546(sprqhe2.cfr_renamed_579().cfr_renamed_90())).append(sprrle.cfr_renamed_9("\u0010\u001e\u0013\u001f5$&\u0016\t\u0013*0!F")).toString();
        }
        return arg0.cfr_renamed_90().cfr_renamed_19();
    }

    private static /* synthetic */ sprqhe cfr_renamed_122(sprije arg0, int arg1) {
        return new sprqhe(arg0, new sprije(sprm.cfr_renamed_123, arg0), new sprooe(arg1), new sprooe(1L));
    }

    public sprjnb(String arg0, X500Principal arg1, PublicKey arg2, sprere arg3, PrivateKey arg4, String arg5) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        this(arg0, sprjnb.cfr_renamed_2365(arg1), arg2, arg3, arg4, arg5);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_91() {
        try {
            return this.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException.toString());
        }
    }

    public sprjnb(byte[] arg0) {
        super(sprjnb.cfr_renamed_1625(arg0));
    }

    public sprjnb(String arg0, spruib arg1, PublicKey arg2, sprere arg3, PrivateKey arg4) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        this(arg0, arg1, arg2, arg3, arg4, "BC");
    }

    static {
        cfr_renamed_2 = new Hashtable();
        cfr_renamed_0 = new Hashtable();
        cfr_renamed_4 = new Hashtable();
        cfr_renamed_1 = new Hashtable();
        cfr_renamed_3 = new HashSet();
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("x6\u0007%|&} f3p<v l\"a;z<"), new sprtzd(sprrle.cfr_renamed_9("VYUY_CWYVFTBSNIFIFIE")));
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("x6\u0007%|&} f3"), new sprtzd(sprrle.cfr_renamed_9("VYUY_CWYVFTBSNIFIFIE")));
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("x6\u0000%|&} f3p<v l\"a;z<"), new sprtzd(sprrle.cfr_renamed_9("VYUY_CWYVFTBSNIFIFIC")));
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("x6\u0000%|&} f3"), new sprtzd(sprrle.cfr_renamed_9("VYUY_CWYVFTBSNIFIFIC")));
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("g!t%|&}?qG"), new sprtzd(sprrle.cfr_renamed_9("VYUY_CWYVFTBSNIFIFIC")));
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("!}3\u0004%|&} f3p<v l\"a;z<"), new sprtzd(sprrle.cfr_renamed_9("VYUY_CWYVFTBSNIFIFIB")));
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("!}3\u0004%|&} f3"), new sprtzd(sprrle.cfr_renamed_9("VYUY_CWYVFTBSNIFIFIB")));
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("!}3\u0007@\u0001%|&} f3p<v l\"a;z<"), sprm.cfr_renamed_128);
        cfr_renamed_2.put(sprrle.cfr_renamed_9("$/6UES .#/%46"), sprm.cfr_renamed_128);
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("!}3\u0007G\u0003%|&} f3p<v l\"a;z<"), sprm.cfr_renamed_129);
        cfr_renamed_2.put(sprrle.cfr_renamed_9("$/6UBQ .#/%46"), sprm.cfr_renamed_129);
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("!}3\u0006J\u0001%|&} f3p<v l\"a;z<"), sprm.cfr_renamed_130);
        cfr_renamed_2.put(sprrle.cfr_renamed_9("$/6TOS .#/%46"), sprm.cfr_renamed_130);
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("!}3\u0000C\u0007%|&} f3p<v l\"a;z<"), sprm.cfr_renamed_107);
        cfr_renamed_2.put(sprrle.cfr_renamed_9("$/6RFU .#/%46"), sprm.cfr_renamed_107);
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("f:tCb;a:g!t3{6x5sC"), sprm.cfr_renamed_131);
        cfr_renamed_2.put(sprrle.cfr_renamed_9("4?&EUC0>3?5$&6)3*0!F"), sprm.cfr_renamed_131);
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("f:t@\u0000Db;a:g!t3{6x5sC"), sprm.cfr_renamed_131);
        cfr_renamed_2.put(sprrle.cfr_renamed_9("4?&D_C0>3?5$&6)3*0!F"), sprm.cfr_renamed_131);
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("f:tG\u0004@b;a:g!t3{6x5sC"), sprm.cfr_renamed_131);
        cfr_renamed_2.put(sprrle.cfr_renamed_9("%460>3?4?&F"), new sprtzd(sprrbfa.cfr_renamed_9("\u0004\\\u0007\\\rF\u0005\\\u0004C\u0006G\u0001K\u001bC\u001bC\u001bG")));
        cfr_renamed_2.put(sprrle.cfr_renamed_9("5>72*3VE_ .#/%46\"9$%>'3>(9"), spryk.cfr_renamed_82);
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("g;e7x6\u0004@\r%|&} f3"), spryk.cfr_renamed_82);
        cfr_renamed_2.put(sprrle.cfr_renamed_9("5>72*3VAW .#/%46\"9$%>'3>(9"), spryk.cfr_renamed_2);
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("g;e7x6\u0004D\u0005%|&} f3"), spryk.cfr_renamed_2);
        cfr_renamed_2.put(sprrle.cfr_renamed_9("5>72*3UBQ .#/%46\"9$%>'3>(9"), spryk.spr\ufe34);
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("g;e7x6\u0007G\u0003%|&} f3"), spryk.spr\ufe34);
        cfr_renamed_2.put(sprrle.cfr_renamed_9("$/6V .#/346"), new sprtzd(sprrbfa.cfr_renamed_9("C\u001b@\u001bJ\u0001B\u001bC\u0005B\u0001B\u001bF\u001bA")));
        cfr_renamed_2.put(sprrle.cfr_renamed_9("3460>3?4?&F"), new sprtzd(sprrbfa.cfr_renamed_9("C\u001b@\u001bJ\u0001B\u001bC\u0005B\u0001B\u001bF\u001bA")));
        cfr_renamed_2.put(sprrle.cfr_renamed_9("$/6UES .#/346"), sprdg.cfr_renamed_4);
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("!}3\u0007G\u0003%|&}6f3"), sprdg.cfr_renamed_1);
        cfr_renamed_2.put(sprrle.cfr_renamed_9("$/6TOS .#/346"), sprdg.cfr_renamed_133);
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("!}3\u0000C\u0007%|&}6f3"), sprdg.cfr_renamed_31);
        cfr_renamed_2.put(sprrle.cfr_renamed_9("$/6V .#/2$346"), sprtk.cfr_renamed_4);
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("!}3\u0007@\u0001%|&}7v6f3"), sprtk.cfr_renamed_134);
        cfr_renamed_2.put(sprrle.cfr_renamed_9("$/6UBQ .#/2$346"), sprtk.cfr_renamed_91);
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("!}3\u0006J\u0001%|&}7v6f3"), sprtk.cfr_renamed_135);
        cfr_renamed_2.put(sprrle.cfr_renamed_9("$/6RFU .#/2$346"), sprtk.cfr_renamed_136);
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("7v6f3b;a:f:tC"), sprtk.cfr_renamed_4);
        cfr_renamed_2.put(sprrle.cfr_renamed_9(" 84#TCVF0>3? 84#TCVG"), sprji.cfr_renamed_88);
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("r=f&\u0006F\u0004Bb;a:r=f&\u0006F\u0004C"), sprji.cfr_renamed_88);
        cfr_renamed_2.put(sprrle.cfr_renamed_9(" 84#TCVF0>3?\"4 84#TCVG"), sprji.cfr_renamed_137);
        cfr_renamed_2.put(sprrbfa.cfr_renamed_9("5z!aA\u0001C\u0004%|&}7v5z!aA\u0001C\u0005_\u0007B\u0005C"), sprji.cfr_renamed_137);
        cfr_renamed_2.put(sprrle.cfr_renamed_9("0($3DSFV .#/0($3DSFWZUGWF"), sprji.cfr_renamed_137);
        cfr_renamed_1.put(new sprtzd(sprrbfa.cfr_renamed_9("\u0004\\\u0007\\\rF\u0005\\\u0004C\u0006G\u0001K\u001bC\u001bC\u001bG")), sprrle.cfr_renamed_9("$/6V .#/%46"));
        cfr_renamed_1.put(sprm.cfr_renamed_128, sprrbfa.cfr_renamed_9("!}3\u0007@\u0001%|&} f3"));
        cfr_renamed_1.put(sprm.cfr_renamed_129, sprrle.cfr_renamed_9("$/6UBQ .#/%46"));
        cfr_renamed_1.put(sprm.cfr_renamed_130, sprrbfa.cfr_renamed_9("!}3\u0006J\u0001%|&} f3"));
        cfr_renamed_1.put(sprm.cfr_renamed_107, sprrle.cfr_renamed_9("$/6RFU .#/%46"));
        cfr_renamed_1.put(sprji.cfr_renamed_88, sprrbfa.cfr_renamed_9("r=f&\u0006F\u0004Cb;a:r=f&\u0006F\u0004B"));
        cfr_renamed_1.put(sprji.cfr_renamed_137, sprrle.cfr_renamed_9(" 84#TCVF0>3?\"4 84#TCVG"));
        cfr_renamed_1.put(new sprtzd(sprrbfa.cfr_renamed_9("\u0004\\\u0007\\\rF\u0005\\\u0004C\u0006G\u0001K\u001bC\u001bC\u001bF")), sprrle.cfr_renamed_9("*3R .#/%46"));
        cfr_renamed_1.put(new sprtzd(sprrbfa.cfr_renamed_9("\u0004\\\u0007\\\rF\u0005\\\u0004C\u0006G\u0001K\u001bC\u001bC\u001b@")), sprrle.cfr_renamed_9("*3U .#/%46"));
        cfr_renamed_1.put(new sprtzd(sprrbfa.cfr_renamed_9("C\u001b@\u001bJ\u0001B\u001bC\u0005B\u0001B\u001bF\u001bA")), sprrle.cfr_renamed_9("$/6V .#/346"));
        cfr_renamed_1.put(sprtk.cfr_renamed_4, sprrbfa.cfr_renamed_9("!}3\u0004%|&}7v6f3"));
        cfr_renamed_1.put(sprtk.cfr_renamed_134, sprrle.cfr_renamed_9("$/6UES .#/2$346"));
        cfr_renamed_1.put(sprtk.cfr_renamed_91, sprrbfa.cfr_renamed_9("!}3\u0007G\u0003%|&}7v6f3"));
        cfr_renamed_1.put(sprtk.cfr_renamed_135, sprrle.cfr_renamed_9("$/6TOS .#/2$346"));
        cfr_renamed_1.put(sprtk.cfr_renamed_136, sprrbfa.cfr_renamed_9("!}3\u0000C\u0007%|&}7v6f3"));
        cfr_renamed_1.put(sprdh.cfr_renamed_112, sprrle.cfr_renamed_9("$/6V .#/%46"));
        cfr_renamed_1.put(sprdh.cfr_renamed_1, sprrbfa.cfr_renamed_9("!}3\u0004%|&}6f3"));
        cfr_renamed_1.put(sprdg.cfr_renamed_4, sprrle.cfr_renamed_9("$/6UES .#/346"));
        cfr_renamed_1.put(sprdg.cfr_renamed_1, sprrbfa.cfr_renamed_9("!}3\u0007G\u0003%|&}6f3"));
        cfr_renamed_4.put(sprm.cfr_renamed_1510, "RSA");
        cfr_renamed_4.put(sprtk.cfr_renamed_314, "DSA");
        cfr_renamed_3.add(sprtk.cfr_renamed_4);
        cfr_renamed_3.add(sprtk.cfr_renamed_134);
        cfr_renamed_3.add(sprtk.cfr_renamed_91);
        cfr_renamed_3.add(sprtk.cfr_renamed_135);
        cfr_renamed_3.add(sprtk.cfr_renamed_136);
        cfr_renamed_3.add(sprtk.cfr_renamed_132);
        cfr_renamed_3.add(sprdg.cfr_renamed_4);
        cfr_renamed_3.add(sprdg.cfr_renamed_1);
        cfr_renamed_3.add(sprji.cfr_renamed_88);
        cfr_renamed_3.add(sprji.cfr_renamed_137);
        sprije sprije2 = new sprije(sprdh.cfr_renamed_86, sprume.cfr_renamed_3);
        cfr_renamed_0.put(sprrle.cfr_renamed_9("4?&F0>3?5$&6)3*0!F"), sprjnb.cfr_renamed_122(sprije2, 20));
        sprije sprije3 = new sprije(sprdg.spr\ufe34, sprume.cfr_renamed_3);
        cfr_renamed_0.put(sprrbfa.cfr_renamed_9("f:t@\u0007Fb;a:g!t3{6x5sC"), sprjnb.cfr_renamed_122(sprije3, 28));
        sprije sprije4 = new sprije(sprdg.cfr_renamed_119, sprume.cfr_renamed_3);
        cfr_renamed_0.put(sprrle.cfr_renamed_9("4?&ERA0>3?5$&6)3*0!F"), sprjnb.cfr_renamed_122(sprije4, 32));
        sprije sprije5 = new sprije(sprdg.cfr_renamed_112, sprume.cfr_renamed_3);
        cfr_renamed_0.put(sprrbfa.cfr_renamed_9("f:tA\rFb;a:g!t3{6x5sC"), sprjnb.cfr_renamed_122(sprije5, 48));
        sprije sprije6 = new sprije(sprdg.cfr_renamed_107, sprume.cfr_renamed_3);
        cfr_renamed_0.put(sprrle.cfr_renamed_9("4?&BVE0>3?5$&6)3*0!F"), sprjnb.cfr_renamed_122(sprije6, 64));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_1624(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
        sprdce sprdce2 = ((spryge)((Object)this.cfr_renamed_2)).cfr_renamed_1489();
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(new sprmra(sprdce2).cfr_renamed_81());
            sprije sprije2 = sprdce2.cfr_renamed_593();
            try {
                if (arg0 != null) return KeyFactory.getInstance(sprije2.cfr_renamed_593().cfr_renamed_19(), arg0).generatePublic(x509EncodedKeySpec);
                return KeyFactory.getInstance(sprije2.cfr_renamed_593().cfr_renamed_19()).generatePublic(x509EncodedKeySpec);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                if (cfr_renamed_4.get(sprije2.cfr_renamed_90()) == null) {
                    throw noSuchAlgorithmException;
                }
                String string = (String)cfr_renamed_4.get(sprije2.cfr_renamed_90());
                if (arg0 != null) return KeyFactory.getInstance(string, arg0).generatePublic(x509EncodedKeySpec);
                return KeyFactory.getInstance(string).generatePublic(x509EncodedKeySpec);
            }
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            throw new InvalidKeyException(sprrbfa.cfr_renamed_9("\u0017G\u0000Z\u0000\u0015\u0016P\u0011Z\u0016\\\u001cRRE\u0007W\u001e\\\u0011\u0015\u0019P\u000b"));
        }
        catch (IOException iOException) {
            throw new InvalidKeyException(sprrle.cfr_renamed_9("\u0012\u0015\u0005\b\u0005G\u0013\u0002\u0014\b\u0013\u000e\u0019\u0000W\u0017\u0002\u0005\u001b\u000e\u0014G\u001c\u0002\u000e"));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprjnb(String var1_1, spruib var2_2, PublicKey var3_3, sprere var4_4, PrivateKey var5_5, String var6_6) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        block11: {
            block10: {
                super();
                var7_7 = sprywa.cfr_renamed_116(var1_1);
                var8_8 = (sprtzd)sprjnb.cfr_renamed_2.get(var7_7);
                if (var8_8 == null) {
                    try {
                        var8_8 = new sprtzd(var7_7);
                        v0 = arg1;
                    }
                    catch (Exception var9_9) {
                        throw new IllegalArgumentException(sprrbfa.cfr_renamed_9("`\u001c^\u001cZ\u0005[RF\u001bR\u001cT\u0006@\u0000PRA\u000bE\u0017\u0015\u0000P\u0003@\u0017F\u0006P\u0016"));
                    }
                } else {
                    v0 = arg1;
                }
                if (v0 == null) {
                    throw new IllegalArgumentException(sprrle.cfr_renamed_9("\u0014\u0002\u0005\u001d\u0002\u0014\u0013W\n\u0002\u0014\u0003G\u0019\b\u0003G\u0015\u0002W\t\u0002\u000b\u001b"));
                }
                if (arg2 == null) {
                    throw new IllegalArgumentException(sprrbfa.cfr_renamed_9("\u0002@\u0010Y\u001bVR^\u0017LRX\u0007F\u0006\u0015\u001cZ\u0006\u0015\u0010PR[\u0007Y\u001e"));
                }
                if (!sprjnb.cfr_renamed_3.contains(var8_8)) break block10;
                v1 = arg2;
                v2 = this;
                v2.cfr_renamed_3 = new sprije(var8_8);
                ** GOTO lbl33
            }
            v3 = this;
            if (!sprjnb.cfr_renamed_0.containsKey(var7_7)) break block11;
            v3.cfr_renamed_3 = new sprije(var8_8, (spra)sprjnb.cfr_renamed_0.get(var7_7));
            v1 = arg2;
            ** GOTO lbl33
        }
        v3.cfr_renamed_3 = new sprije(var8_8, sprume.cfr_renamed_3);
        try {
            v1 = arg2;
lbl33:
            // 3 sources

            var9_10 = (sprbne)sprvva.cfr_renamed_184(v1.getEncoded());
            this.cfr_renamed_2 = new spryge((spruib)arg1, new sprdce((sprbne)var9_10), (sprere)arg3);
        }
        catch (IOException var9_11) {
            throw new IllegalArgumentException(sprrle.cfr_renamed_9("\u0014\u0006\u0019@\u0003G\u0012\t\u0014\b\u0013\u0002W\u0017\u0002\u0005\u001b\u000e\u0014G\u001c\u0002\u000e"));
        }
        (arg5 == null ? (var9_10 = Signature.getInstance((String)arg0)) : (var9_10 = Signature.getInstance((String)arg0, (String)arg5))).initSign((PrivateKey)arg4);
        try {
            var9_10.update(this.cfr_renamed_2.cfr_renamed_104("DER"));
        }
        catch (Exception var10_12) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprrbfa.cfr_renamed_9("P\nV\u0017E\u0006\\\u001d[RP\u001cV\u001dQ\u001b[\u0015\u0015&w!\u0015\u0011P\u0000ARG\u0017D\u0007P\u0001AR\u0018R")).append(var10_12).toString());
        }
        this.cfr_renamed_4 = new sprmra(var9_10.sign());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_88(PublicKey arg0, String arg1) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        Signature signature;
        try {
            signature = arg1 == null ? Signature.getInstance(sprjnb.cfr_renamed_1538((sprije)((Object)this.cfr_renamed_3))) : Signature.getInstance(sprjnb.cfr_renamed_1538((sprije)((Object)this.cfr_renamed_3)), arg1);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            String string;
            if (cfr_renamed_1.get(((sprije)((Object)this.cfr_renamed_3)).cfr_renamed_90()) == null) throw noSuchAlgorithmException;
            String string2 = string = (String)cfr_renamed_1.get(((sprije)((Object)this.cfr_renamed_3)).cfr_renamed_90());
            signature = arg1 == null ? Signature.getInstance(string2) : Signature.getInstance(string2, arg1);
        }
        this.cfr_renamed_2120(signature, ((sprije)((Object)this.cfr_renamed_3)).cfr_renamed_284());
        signature.initVerify(arg0);
        try {
            signature.update(((sprkra)((Object)this.cfr_renamed_2)).cfr_renamed_104("DER"));
            return signature.verify(((sprmra)((Object)this.cfr_renamed_4)).cfr_renamed_81());
        }
        catch (Exception exception) {
            throw new SignatureException(new StringBuilder().insert(0, sprrle.cfr_renamed_9("\u0002\u000f\u0004\u0012\u0017\u0003\u000e\u0018\tW\u0002\u0019\u0004\u0018\u0003\u001e\t\u0010G#%$G\u0014\u0002\u0005\u0013W\u0015\u0012\u0016\u0002\u0002\u0004\u0013WJW")).append(exception).toString());
        }
    }

    public PublicKey cfr_renamed_1157() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
        return this.cfr_renamed_1624("BC");
    }

    public boolean cfr_renamed_1623(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        sprjnb sprjnb2 = this;
        return sprjnb2.cfr_renamed_88(sprjnb2.cfr_renamed_1624(arg0), arg0);
    }

    public sprjnb(String arg0, X500Principal arg1, PublicKey arg2, sprere arg3, PrivateKey arg4) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        this(arg0, sprjnb.cfr_renamed_2365(arg1), arg2, arg3, arg4, "BC");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ spruib cfr_renamed_2365(X500Principal arg0) {
        try {
            return new sprfjb(arg0.getEncoded());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprrbfa.cfr_renamed_9("V\u0013[UARV\u001d[\u0004P\u0000AR[\u0013X\u0017"));
        }
    }
}

