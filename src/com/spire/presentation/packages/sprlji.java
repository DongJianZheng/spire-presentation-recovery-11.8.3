/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprdzh;
import com.spire.presentation.packages.sprfjs;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprjii;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlqm;
import com.spire.presentation.packages.sprmzh;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrsm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxvh;
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

public class sprlji
extends sprmzh {
    private static Set cfr_renamed_0;
    private static Hashtable cfr_renamed_1;
    private static Hashtable cfr_renamed_2;
    private static Hashtable cfr_renamed_3;
    private static Hashtable cfr_renamed_4;

    public boolean cfr_renamed_1626() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        return this.cfr_renamed_1623("BC");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_9056(Signature arg0, sprco arg1) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (arg1 != null && !sprpen.cfr_renamed_4.cfr_renamed_7476(arg1)) {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(arg0.getAlgorithm(), arg0.getProvider());
            try {
                algorithmParameters.init(arg1.cfr_renamed_119().cfr_renamed_104("DER"));
            }
            catch (IOException iOException) {
                throw new SignatureException(new StringBuilder().insert(0, sprxvh.cfr_renamed_9("Z_Vhpucdz\u007f}0wup\u007fwy}w3`rbr}vdvb`*3")).append(iOException.getMessage()).toString());
            }
            if (arg0.getAlgorithm().endsWith(sprfjs.cfr_renamed_9("\u0011A\u001a7"))) {
                try {
                    arg0.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                    return;
                }
                catch (GeneralSecurityException generalSecurityException) {
                    throw new SignatureException(new StringBuilder().insert(0, sprxvh.cfr_renamed_9("Vhpucdz\u007f}0vhgbrsgy}w3`rbr}vdvb`*3")).append(generalSecurityException.getMessage()).toString());
                }
            }
        }
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

    public static String cfr_renamed_9057(sprddm arg0) {
        sprco sprco2 = arg0.cfr_renamed_284();
        if (sprco2 != null && !sprpen.cfr_renamed_4.cfr_renamed_7476(sprco2) && arg0.cfr_renamed_593().cfr_renamed_5078(sprdl.cfr_renamed_3250)) {
            sprrsm sprrsm2 = sprrsm.cfr_renamed_23(sprco2);
            return new StringBuilder().insert(0, sprlji.cfr_renamed_9058(sprrsm2.cfr_renamed_579().cfr_renamed_593())).append(sprfjs.cfr_renamed_9("+o(n\u000eU\u001dg2b\u0011A\u001a7")).toString();
        }
        return arg0.cfr_renamed_593().cfr_renamed_19();
    }

    public boolean cfr_renamed_1623(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        sprlji sprlji2 = this;
        return sprlji2.cfr_renamed_88(sprlji2.cfr_renamed_1624(arg0), arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprjii cfr_renamed_2365(X500Principal arg0) {
        try {
            return new sprdzh(arg0.getEncoded());
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprxvh.cfr_renamed_9("sr~4d3s|~euad3~r}v"));
        }
    }

    public PublicKey cfr_renamed_1157() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
        return this.cfr_renamed_1624("BC");
    }

    public sprlji(sprszm arg0) {
        super(arg0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprlji(String var1_1, sprjii var2_2, PublicKey var3_3, spridn var4_4, PrivateKey var5_5, String var6_6) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        block11: {
            block10: {
                super();
                var7_7 = sprkoe.cfr_renamed_116(var1_1);
                var8_8 = (sprlem)sprlji.cfr_renamed_4.get(var7_7);
                if (var8_8 == null) {
                    try {
                        var8_8 = new sprlem(var7_7);
                        v0 = arg1;
                    }
                    catch (Exception var9_9) {
                        throw new IllegalArgumentException(sprfjs.cfr_renamed_9("\th7h3q2&/o;h=r)t9&(\u007f,c|t9w)c/r9b"));
                    }
                } else {
                    v0 = arg1;
                }
                if (v0 == null) {
                    throw new IllegalArgumentException(sprxvh.cfr_renamed_9("cfryupd3}fcg0}\u007fg0qu3~f|\u007f"));
                }
                if (arg2 == null) {
                    throw new IllegalArgumentException(sprfjs.cfr_renamed_9("v)d0o?&7c%&1s/r|h3r|d9&2s0j"));
                }
                if (!sprlji.cfr_renamed_0.contains(var8_8)) break block10;
                v1 = arg2;
                v2 = this;
                v2.cfr_renamed_2 = new sprddm(var8_8);
                ** GOTO lbl33
            }
            v3 = this;
            if (!sprlji.cfr_renamed_1.containsKey(var7_7)) break block11;
            v3.cfr_renamed_2 = new sprddm(var8_8, (sprco)sprlji.cfr_renamed_1.get(var7_7));
            v1 = arg2;
            ** GOTO lbl33
        }
        v3.cfr_renamed_2 = new sprddm(var8_8, sprpen.cfr_renamed_4);
        try {
            v1 = arg2;
lbl33:
            // 3 sources

            var9_10 = (sprszm)sprxgf.cfr_renamed_184(v1.getEncoded());
            this.cfr_renamed_3 = new sprlqm((sprjii)arg1, sprvhm.cfr_renamed_23(var9_10), (spridn)arg3);
        }
        catch (IOException var9_11) {
            throw new IllegalArgumentException(sprxvh.cfr_renamed_9("pq}7g0v~p\u007fwu3`fr\u007fyp0xuj"));
        }
        (arg5 == null ? (var9_10 = Signature.getInstance((String)arg0)) : (var9_10 = Signature.getInstance((String)arg0, (String)arg5))).initSign((PrivateKey)arg4);
        try {
            var9_10.update(this.cfr_renamed_3.cfr_renamed_104("DER"));
        }
        catch (Exception var10_12) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprfjs.cfr_renamed_9("9~?c,r5i2&9h?i8o2a|R\u001eU|e9t(&.c-s9u(&q&")).append(var10_12).toString());
        }
        this.cfr_renamed_4 = new sprdye(var9_10.sign());
    }

    public sprlji(String arg0, X500Principal arg1, PublicKey arg2, spridn arg3, PrivateKey arg4, String arg5) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        this(arg0, sprlji.cfr_renamed_2365(arg1), arg2, arg3, arg4, arg5);
    }

    static {
        cfr_renamed_4 = new Hashtable();
        cfr_renamed_1 = new Hashtable();
        cfr_renamed_3 = new Hashtable();
        cfr_renamed_2 = new Hashtable();
        cfr_renamed_0 = new HashSet();
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("]W\"DYGXACRU]SAICDZ_]"), new sprlem(sprfjs.cfr_renamed_9("m(n(d2l(m7o3h?r7r7r4")));
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("]W\"DYGXACR"), new sprlem(sprfjs.cfr_renamed_9("m(n(d2l(m7o3h?r7r7r4")));
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("]W%DYGXACRU]SAICDZ_]"), new sprlem(sprfjs.cfr_renamed_9("m(n(d2l(m7o3h?r7r7r2")));
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("]W%DYGXACR"), new sprlem(sprfjs.cfr_renamed_9("m(n(d2l(m7o3h?r7r7r2")));
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("B@QDYGX^T&"), new sprlem(sprfjs.cfr_renamed_9("m(n(d2l(m7o3h?r7r7r2")));
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("@XR!DYGXACRU]SAICDZ_]"), new sprlem(sprfjs.cfr_renamed_9("m(n(d2l(m7o3h?r7r7r3")));
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("@XR!DYGXACR"), new sprlem(sprfjs.cfr_renamed_9("m(n(d2l(m7o3h?r7r7r3")));
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("@XR\"!$DYGXACRU]SAICDZ_]"), sprdl.cfr_renamed_1262);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("U\u0014Gn4hQ\u0015R\u0014T\u000fG"), sprdl.cfr_renamed_1262);
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("@XR\"&&DYGXACRU]SAICDZ_]"), sprdl.cfr_renamed_1601);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("U\u0014Gn3jQ\u0015R\u0014T\u000fG"), sprdl.cfr_renamed_1601);
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("@XR#+$DYGXACRU]SAICDZ_]"), sprdl.cfr_renamed_1572);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("U\u0014Go>hQ\u0015R\u0014T\u000fG"), sprdl.cfr_renamed_1572);
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("@XR%\"\"DYGXACRU]SAICDZ_]"), sprdl.cfr_renamed_84);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("U\u0014Gi7nQ\u0015R\u0014T\u000fG"), sprdl.cfr_renamed_84);
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("C[Q\"GZD[B@QR^W]TV\""), sprdl.cfr_renamed_3250);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("\u000fN\u001d4n2\u000bO\bN\u000eU\u001dG\u0012B\u0011A\u001a7"), sprdl.cfr_renamed_3250);
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("C[Q!%%GZD[B@QR^W]TV\""), sprdl.cfr_renamed_3250);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("\u000fN\u001d5d2\u000bO\bN\u000eU\u001dG\u0012B\u0011A\u001a7"), sprdl.cfr_renamed_3250);
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("C[Q&!!GZD[B@QR^W]TV\""), sprdl.cfr_renamed_3250);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("T\u000fG\u000bO\bN\u000fN\u001d7"), new sprlem(sprxvh.cfr_renamed_9("!=\"=(' =!\"#&$*>\">\">&")));
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("\u000eO\fC\u0011Bm4dQ\u0015R\u0014T\u000fG\u0019H\u001fT\u0005V\bO\u0013H"), spris.cfr_renamed_86);
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("BZ@V]W!!(DYGXACR"), spris.cfr_renamed_86);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("\u000eO\fC\u0011Bm0lQ\u0015R\u0014T\u000fG\u0019H\u001fT\u0005V\bO\u0013H"), spris.cfr_renamed_133);
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("BZ@V]W!% DYGXACR"), spris.cfr_renamed_133);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("\u000eO\fC\u0011Bn3jQ\u0015R\u0014T\u000fG\u0019H\u001fT\u0005V\bO\u0013H"), spris.cfr_renamed_112);
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("BZ@V]W\"&&DYGXACR"), spris.cfr_renamed_112);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("U\u0014GmQ\u0015R\u0014B\u000fG"), new sprlem(sprxvh.cfr_renamed_9("\">!>+$#>\" #$#>'> ")));
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("B\u000fG\u000bO\bN\u000fN\u001d7"), new sprlem(sprxvh.cfr_renamed_9("\">!>+$#>\" #$#>'> ")));
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("U\u0014Gn4hQ\u0015R\u0014B\u000fG"), sprwr.cfr_renamed_79);
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("@XR\"&&DYGXWCR"), sprwr.cfr_renamed_82);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("U\u0014Go>hQ\u0015R\u0014B\u000fG"), sprwr.cfr_renamed_1260);
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("@XR%\"\"DYGXWCR"), sprwr.cfr_renamed_1337);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("U\u0014GmQ\u0015R\u0014C\u001fB\u000fG"), sprbr.cfr_renamed_955);
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("@XR\"!$DYGXVSWCR"), sprbr.cfr_renamed_129);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("U\u0014Gn3jQ\u0015R\u0014C\u001fB\u000fG"), sprbr.cfr_renamed_79);
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("@XR#+$DYGXVSWCR"), sprbr.cfr_renamed_107);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("U\u0014Gi7nQ\u0015R\u0014C\u001fB\u000fG"), sprbr.cfr_renamed_724);
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("VSWCRGZD[C[Q\""), sprbr.cfr_renamed_955);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("\u001bI\u000fRo2m7\u000bO\bN\u001bI\u000fRo2m6"), sprqo.cfr_renamed_107);
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("W\\CG#'!#GZD[W\\CG#'!\""), sprqo.cfr_renamed_107);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("\u001bI\u000fRo2m7\u000bO\bN\u0019E\u001bI\u000fRo2m6"), sprqo.cfr_renamed_96);
        cfr_renamed_4.put(sprxvh.cfr_renamed_9("T_@D $\"!DYGXVST_@D $\" >\"# \""), sprqo.cfr_renamed_96);
        cfr_renamed_4.put(sprfjs.cfr_renamed_9("A\u0013U\b5h7mQ\u0015R\u0014A\u0013U\b5h7l+n6l7"), sprqo.cfr_renamed_96);
        cfr_renamed_2.put(new sprlem(sprxvh.cfr_renamed_9("!=\"=(' =!\"#&$*>\">\">&")), sprfjs.cfr_renamed_9("U\u0014GmQ\u0015R\u0014T\u000fG"));
        cfr_renamed_2.put(sprdl.cfr_renamed_1262, sprxvh.cfr_renamed_9("@XR\"!$DYGXACR"));
        cfr_renamed_2.put(sprdl.cfr_renamed_1601, sprfjs.cfr_renamed_9("U\u0014Gn3jQ\u0015R\u0014T\u000fG"));
        cfr_renamed_2.put(sprdl.cfr_renamed_1572, sprxvh.cfr_renamed_9("@XR#+$DYGXACR"));
        cfr_renamed_2.put(sprdl.cfr_renamed_84, sprfjs.cfr_renamed_9("U\u0014Gi7nQ\u0015R\u0014T\u000fG"));
        cfr_renamed_2.put(sprqo.cfr_renamed_107, sprxvh.cfr_renamed_9("W\\CG#'!\"GZD[W\\CG#'!#"));
        cfr_renamed_2.put(sprqo.cfr_renamed_96, sprfjs.cfr_renamed_9("\u001bI\u000fRo2m7\u000bO\bN\u0019E\u001bI\u000fRo2m6"));
        cfr_renamed_2.put(new sprlem(sprxvh.cfr_renamed_9("!=\"=(' =!\"#&$*>\">\">'")), sprfjs.cfr_renamed_9("\u0011BiQ\u0015R\u0014T\u000fG"));
        cfr_renamed_2.put(new sprlem(sprxvh.cfr_renamed_9("!=\"=(' =!\"#&$*>\">\">!")), sprfjs.cfr_renamed_9("\u0011BnQ\u0015R\u0014T\u000fG"));
        cfr_renamed_2.put(new sprlem(sprxvh.cfr_renamed_9("\">!>+$#>\" #$#>'> ")), sprfjs.cfr_renamed_9("U\u0014GmQ\u0015R\u0014B\u000fG"));
        cfr_renamed_2.put(sprbr.cfr_renamed_955, sprxvh.cfr_renamed_9("@XR!DYGXVSWCR"));
        cfr_renamed_2.put(sprbr.cfr_renamed_129, sprfjs.cfr_renamed_9("U\u0014Gn4hQ\u0015R\u0014C\u001fB\u000fG"));
        cfr_renamed_2.put(sprbr.cfr_renamed_79, sprxvh.cfr_renamed_9("@XR\"&&DYGXVSWCR"));
        cfr_renamed_2.put(sprbr.cfr_renamed_107, sprfjs.cfr_renamed_9("U\u0014Go>hQ\u0015R\u0014C\u001fB\u000fG"));
        cfr_renamed_2.put(sprbr.cfr_renamed_724, sprxvh.cfr_renamed_9("@XR%\"\"DYGXVSWCR"));
        cfr_renamed_2.put(sprgt.cfr_renamed_4, sprfjs.cfr_renamed_9("U\u0014GmQ\u0015R\u0014T\u000fG"));
        cfr_renamed_2.put(sprgt.cfr_renamed_93, sprxvh.cfr_renamed_9("@XR!DYGXWCR"));
        cfr_renamed_2.put(sprwr.cfr_renamed_79, sprfjs.cfr_renamed_9("U\u0014Gn4hQ\u0015R\u0014B\u000fG"));
        cfr_renamed_2.put(sprwr.cfr_renamed_82, sprxvh.cfr_renamed_9("@XR\"&&DYGXWCR"));
        cfr_renamed_3.put(sprdl.cfr_renamed_1205, "RSA");
        cfr_renamed_3.put(sprbr.cfr_renamed_84, "DSA");
        cfr_renamed_0.add(sprbr.cfr_renamed_955);
        cfr_renamed_0.add(sprbr.cfr_renamed_129);
        cfr_renamed_0.add(sprbr.cfr_renamed_79);
        cfr_renamed_0.add(sprbr.cfr_renamed_107);
        cfr_renamed_0.add(sprbr.cfr_renamed_724);
        cfr_renamed_0.add(sprbr.cfr_renamed_615);
        cfr_renamed_0.add(sprgt.cfr_renamed_93);
        cfr_renamed_0.add(sprwr.cfr_renamed_79);
        cfr_renamed_0.add(sprwr.cfr_renamed_82);
        cfr_renamed_0.add(sprqo.cfr_renamed_107);
        cfr_renamed_0.add(sprqo.cfr_renamed_96);
        sprddm sprddm2 = new sprddm(sprgt.cfr_renamed_0, sprpen.cfr_renamed_4);
        cfr_renamed_1.put(sprfjs.cfr_renamed_9("\u000fN\u001d7\u000bO\bN\u000eU\u001dG\u0012B\u0011A\u001a7"), sprlji.cfr_renamed_5025(sprddm2, 20));
        sprddm sprddm3 = new sprddm(sprwr.cfr_renamed_957, sprpen.cfr_renamed_4);
        cfr_renamed_1.put(sprxvh.cfr_renamed_9("C[Q!\"'GZD[B@QR^W]TV\""), sprlji.cfr_renamed_5025(sprddm3, 28));
        sprddm sprddm4 = new sprddm(sprwr.cfr_renamed_1226, sprpen.cfr_renamed_4);
        cfr_renamed_1.put(sprfjs.cfr_renamed_9("\u000fN\u001d4i0\u000bO\bN\u000eU\u001dG\u0012B\u0011A\u001a7"), sprlji.cfr_renamed_5025(sprddm4, 32));
        sprddm sprddm5 = new sprddm(sprwr.cfr_renamed_112, sprpen.cfr_renamed_4);
        cfr_renamed_1.put(sprxvh.cfr_renamed_9("C[Q ('GZD[B@QR^W]TV\""), sprlji.cfr_renamed_5025(sprddm5, 48));
        sprddm sprddm6 = new sprddm(sprwr.cfr_renamed_272, sprpen.cfr_renamed_4);
        cfr_renamed_1.put(sprfjs.cfr_renamed_9("\u000fN\u001d3m4\u000bO\bN\u000eU\u001dG\u0012B\u0011A\u001a7"), sprlji.cfr_renamed_5025(sprddm6, 64));
    }

    private static /* synthetic */ sprrsm cfr_renamed_5025(sprddm arg0, int arg1) {
        return new sprrsm(arg0, new sprddm(sprdl.cfr_renamed_135, arg0), new sprktm(arg1), new sprktm(1L));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_88(PublicKey arg0, String arg1) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        Signature signature;
        try {
            signature = arg1 == null ? Signature.getInstance(sprlji.cfr_renamed_9057((sprddm)((Object)this.cfr_renamed_2))) : Signature.getInstance(sprlji.cfr_renamed_9057((sprddm)((Object)this.cfr_renamed_2)), arg1);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            String string;
            if (cfr_renamed_2.get(((sprddm)((Object)this.cfr_renamed_2)).cfr_renamed_593()) == null) throw noSuchAlgorithmException;
            String string2 = string = (String)cfr_renamed_2.get(((sprddm)((Object)this.cfr_renamed_2)).cfr_renamed_593());
            signature = arg1 == null ? Signature.getInstance(string2) : Signature.getInstance(string2, arg1);
        }
        this.cfr_renamed_9056(signature, ((sprddm)((Object)this.cfr_renamed_2)).cfr_renamed_284());
        signature.initVerify(arg0);
        try {
            signature.update(((sprqqe)((Object)this.cfr_renamed_3)).cfr_renamed_104("DER"));
            return signature.verify(((sprgbf)((Object)this.cfr_renamed_4)).cfr_renamed_186());
        }
        catch (Exception exception) {
            throw new SignatureException(new StringBuilder().insert(0, sprxvh.cfr_renamed_9("uksv`gy|~3u}s|tz~t0GR@0puad3bvafu`d3=3")).append(exception).toString());
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_1624(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
        sprvhm sprvhm2 = ((sprlqm)((Object)this.cfr_renamed_3)).cfr_renamed_1489();
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(new sprdye(sprvhm2).cfr_renamed_186());
            sprddm sprddm2 = sprvhm2.cfr_renamed_593();
            try {
                if (arg0 != null) return KeyFactory.getInstance(sprddm2.cfr_renamed_593().cfr_renamed_19(), arg0).generatePublic(x509EncodedKeySpec);
                return KeyFactory.getInstance(sprddm2.cfr_renamed_593().cfr_renamed_19()).generatePublic(x509EncodedKeySpec);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                if (cfr_renamed_3.get(sprddm2.cfr_renamed_593()) == null) {
                    throw noSuchAlgorithmException;
                }
                String string = (String)cfr_renamed_3.get(sprddm2.cfr_renamed_593());
                if (arg0 != null) return KeyFactory.getInstance(string, arg0).generatePublic(x509EncodedKeySpec);
                return KeyFactory.getInstance(string).generatePublic(x509EncodedKeySpec);
            }
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            throw new InvalidKeyException(sprfjs.cfr_renamed_9("c.t3t|b9e3b5h;&,s>j5e|m9\u007f"));
        }
        catch (IOException iOException) {
            throw new InvalidKeyException(sprxvh.cfr_renamed_9("vba\u007fa0wup\u007fwy}w3`fr\u007fyp0xuj"));
        }
    }

    public sprlji(String arg0, X500Principal arg1, PublicKey arg2, spridn arg3, PrivateKey arg4) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        this(arg0, sprlji.cfr_renamed_2365(arg1), arg2, arg3, arg4, "BC");
    }

    private static /* synthetic */ String cfr_renamed_9058(sprlem arg0) {
        if (sprdl.cfr_renamed_1540.cfr_renamed_5078(arg0)) {
            return "MD5";
        }
        if (sprgt.cfr_renamed_0.cfr_renamed_5078(arg0)) {
            return "SHA1";
        }
        if (sprwr.cfr_renamed_957.cfr_renamed_5078(arg0)) {
            return sprfjs.cfr_renamed_9("\u000fN\u001d4n2");
        }
        if (sprwr.cfr_renamed_1226.cfr_renamed_5078(arg0)) {
            return "SHA256";
        }
        if (sprwr.cfr_renamed_112.cfr_renamed_5078(arg0)) {
            return "SHA384";
        }
        if (sprwr.cfr_renamed_272.cfr_renamed_5078(arg0)) {
            return "SHA512";
        }
        if (spris.cfr_renamed_91.cfr_renamed_5078(arg0)) {
            return sprxvh.cfr_renamed_9("AYCU^T\"\"+");
        }
        if (spris.cfr_renamed_272.cfr_renamed_5078(arg0)) {
            return "RIPEMD160";
        }
        if (spris.cfr_renamed_102.cfr_renamed_5078(arg0)) {
            return sprfjs.cfr_renamed_9("T\u0015V\u0019K\u00184i0");
        }
        if (sprqo.cfr_renamed_112.cfr_renamed_5078(arg0)) {
            return sprxvh.cfr_renamed_9("W\\CG#'!\"");
        }
        return arg0.cfr_renamed_19();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprszm cfr_renamed_1625(byte[] arg0) {
        try {
            sprrzm sprrzm2 = new sprrzm(arg0);
            return (sprszm)sprrzm2.cfr_renamed_24();
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(sprfjs.cfr_renamed_9("d=b0\u007f|c2e3b9b|t9w)c/r"));
        }
    }

    public sprlji(String arg0, sprjii arg1, PublicKey arg2, spridn arg3, PrivateKey arg4) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        this(arg0, arg1, arg2, arg3, arg4, "BC");
    }

    public sprlji(byte[] arg0) {
        super(sprlji.cfr_renamed_1625(arg0));
    }
}

