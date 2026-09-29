/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.spramg;
import com.spire.presentation.packages.sprbcm;
import com.spire.presentation.packages.sprckg;
import com.spire.presentation.packages.sprdcm;
import com.spire.presentation.packages.spream;
import com.spire.presentation.packages.spredm;
import com.spire.presentation.packages.sprefg;
import com.spire.presentation.packages.spreog;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgkg;
import com.spire.presentation.packages.sprglg;
import com.spire.presentation.packages.sprhhm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprjgm;
import com.spire.presentation.packages.sprkhfa;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmaca;
import com.spire.presentation.packages.sprmye;
import com.spire.presentation.packages.sprnjg;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpgg;
import com.spire.presentation.packages.sprqdm;
import com.spire.presentation.packages.sprqvg;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrzl;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprsem;
import com.spire.presentation.packages.sprskg;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprufm;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprvcm;
import com.spire.presentation.packages.sprvig;
import com.spire.presentation.packages.sprwng;
import com.spire.presentation.packages.sprwzl;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxlg;
import com.spire.presentation.packages.sprygm;
import com.spire.presentation.packages.sprzgg;
import com.spire.presentation.packages.sprzne;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;

public class sprvfg
extends sprnjg {
    public CertPath cfr_renamed_126;
    public TrustAnchor cfr_renamed_88;
    public PolicyNode cfr_renamed_31;
    private static final String cfr_renamed_272;
    public List[] cfr_renamed_145;
    private static final String cfr_renamed_114;
    public List cfr_renamed_79;
    public Date cfr_renamed_107;
    private boolean cfr_renamed_132;
    public List[] cfr_renamed_102;
    private static final String cfr_renamed_93;
    private static final String cfr_renamed_86 = "com.spire.psmodel.security.pkix.CertPathReviewerMessages";
    public PublicKey cfr_renamed_1;
    public PKIXParameters cfr_renamed_2;
    public Date cfr_renamed_3;
    public int cfr_renamed_4;

    static {
        cfr_renamed_114 = sprrdm.cfr_renamed_185.cfr_renamed_19();
        cfr_renamed_272 = sprrdm.cfr_renamed_79.cfr_renamed_19();
        cfr_renamed_93 = sprrdm.cfr_renamed_102.cfr_renamed_19();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void cfr_renamed_276() {
        block51: {
            block52: {
                block48: {
                    block47: {
                        var1_1 = null;
                        var2_2 = null;
                        v0 = new Object[2];
                        v0[0] = new sprefg(this.cfr_renamed_107);
                        v0[1] = new sprefg(this.cfr_renamed_3);
                        var3_3 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u0016Q\u0007@%U\u0001\\#U\u0019]\u0011p\u0014@\u0010"), v0);
                        this.cfr_renamed_7328((sprxlg)var3_3);
                        try {
                            block50: {
                                v1 = this;
                                var3_3 = (X509Certificate)v1.cfr_renamed_79.get(v1.cfr_renamed_79.size() - 1);
                                v2 = this;
                                var4_6 = v2.cfr_renamed_278((X509Certificate)var3_3, v2.cfr_renamed_2.getTrustAnchors());
                                if (var4_6.size() > 1) {
                                    v3 = new Object[2];
                                    v3[0] = spruaf.cfr_renamed_279(var4_6.size());
                                    v3[1] = new sprckg(var3_3.getIssuerX500Principal());
                                    var5_8 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("\u007fCNRlGHNnCJOYQYT\u0012ESHZJUEHORAhTIUHgRETINU"), v3);
                                    this.cfr_renamed_7329((sprxlg)var5_8);
                                    break block47;
                                }
                                if (var4_6.isEmpty()) {
                                    v4 = new Object[2];
                                    v4[0] = new sprckg(var3_3.getIssuerX500Principal());
                                    v4[1] = spruaf.cfr_renamed_279(this.cfr_renamed_2.getTrustAnchors().size());
                                    var5_8 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[Z\u001a`\u0007A\u0006@4Z\u0016\\\u001aF3[\u0000Z\u0011"), v4);
                                    this.cfr_renamed_7329((sprxlg)var5_8);
                                    break block47;
                                }
                                v5 = var1_1 = (TrustAnchor)var4_6.iterator().next();
                                if (var1_1.getTrustedCert() == null) break block50;
                                var5_8 = v5.getTrustedCert().getPublicKey();
                                v6 = var3_3;
                                ** GOTO lbl44
                            }
                            var5_8 = v5.getCAPublicKey();
                            try {
                                v6 = var3_3;
lbl44:
                                // 2 sources

                                sprnjg.cfr_renamed_280((X509Certificate)v6, (PublicKey)var5_8, this.cfr_renamed_2.getSigProvider());
                            }
                            catch (SignatureException var6_9) {
                                var7_12 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("\u007fCNRlGHNnCJOYQYT\u0012RNSOR~SHoRP]JUB\u007fCNR"));
                                this.cfr_renamed_7329((sprxlg)var7_12);
                            }
                            catch (Exception var6_10) {}
                        }
                        catch (sprvig var3_4) {
                            v7 = var1_1;
                            this.cfr_renamed_7329(var3_4.cfr_renamed_281());
                            break block48;
                        }
                        catch (Throwable var3_5) {
                            v8 = new Object[2];
                            v8[0] = new sprckg(var3_5.getMessage());
                            v8[1] = new sprckg(var3_5);
                            var4_6 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u0000Z\u001eZ\u001aC\u001b"), v8);
                            this.cfr_renamed_7329((sprxlg)var4_6);
                        }
                    }
                    v7 = var1_1;
                }
                if (v7 != null) {
                    var3_3 = var1_1.getTrustedCert();
                    try {
                        var2_2 = var3_3 != null ? sprvfg.cfr_renamed_282((X509Certificate)var3_3) : new X500Principal(var1_1.getCAName());
                    }
                    catch (IllegalArgumentException var4_7) {
                        v9 = new Object[1];
                        v9[0] = new sprckg(var1_1.getCAName());
                        var5_8 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bHTIUHbroRP]JUB"), v9);
                        this.cfr_renamed_7329((sprxlg)var5_8);
                    }
                    if (var3_3 != null) {
                        v10 = var3_3.getKeyUsage();
                        var4_6 = v10;
                        if (v10 != null && (((Object)var4_6).length <= 5 || var4_6[5] == false)) {
                            var5_8 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u0001F\u0000G\u0001\u007f\u0010M G\u0014S\u0010"));
                            this.cfr_renamed_7328((sprxlg)var5_8);
                        }
                    }
                }
                var3_3 = null;
                var4_6 = var2_2;
                var5_8 = null;
                var6_11 = null;
                var7_12 = null;
                var8_13 = null;
                if (var1_1 == null) break block51;
                var5_8 = var1_1.getTrustedCert();
                if (var5_8 == null) break block52;
                v11 = var3_3 = var5_8.getPublicKey();
                ** GOTO lbl100
            }
            var3_3 = var1_1.getCAPublicKey();
            try {
                v11 = var3_3;
lbl100:
                // 2 sources

                var6_11 = sprvfg.cfr_renamed_283((PublicKey)v11);
                var7_12 = var6_11.cfr_renamed_593();
                var8_13 = var6_11.cfr_renamed_284();
            }
            catch (CertPathValidatorException var9_14) {
                var10_16 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bHTIUHvIDwCEcNTST"));
                this.cfr_renamed_7329(var10_16);
                var6_11 = null;
            }
        }
        var9_15 = null;
        v12 = var11_18 = this.cfr_renamed_79.size() - 1;
        while (v12 >= 0) {
            block49: {
                block54: {
                    block53: {
                        v13 = this;
                        var10_17 = v13.cfr_renamed_4 - var11_18;
                        var9_15 = (X509Certificate)v13.cfr_renamed_79.get(var11_18);
                        if (var3_3 == null) break block53;
                        try {
                            sprnjg.cfr_renamed_280(var9_15, (PublicKey)var3_3, this.cfr_renamed_2.getSigProvider());
                            v14 = var9_15;
                        }
                        catch (GeneralSecurityException var12_20) {
                            v15 = new Object[3];
                            v15[0] = var12_20.getMessage();
                            v15[1] = var12_20;
                            v15[2] = var12_20.getClass().getName();
                            var13_25 /* !! */  = (byte[])new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[G\u001cS\u001bU\u0001A\u0007Q;[\u0001b\u0010F\u001cR\u001cQ\u0011"), v15);
                            v14 = var9_15;
                            this.cfr_renamed_7330((sprxlg)var13_25 /* !! */ , var11_18);
                        }
                        ** GOTO lbl173
                    }
                    if (!sprvfg.cfr_renamed_286(var9_15)) break block54;
                    try {
                        v16 = var9_15;
                        sprnjg.cfr_renamed_280(v16, v16.getPublicKey(), this.cfr_renamed_2.getSigProvider());
                        var12_19 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bNISRwCEoOp]JUB~SHhSR}rNSOR}H_NST"));
                        this.cfr_renamed_7330((sprxlg)var12_19, var11_18);
                        v14 = var9_15;
                    }
                    catch (GeneralSecurityException var12_21) {
                        v17 = new Object[3];
                        v17[0] = var12_21.getMessage();
                        v17[1] = var12_21;
                        v17[2] = var12_21.getClass().getName();
                        var13_25 /* !! */  = (byte[])new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[G\u001cS\u001bU\u0001A\u0007Q;[\u0001b\u0010F\u001cR\u001cQ\u0011"), v17);
                        v14 = var9_15;
                        this.cfr_renamed_7330((sprxlg)var13_25 /* !! */ , var11_18);
                    }
                    ** GOTO lbl173
                }
                var12_19 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("\u007fCNRlGHNnCJOYQYT\u0012hSoOUICNvIDPO_mY_"));
                var13_25 /* !! */  = var9_15.getExtensionValue(sprrdm.cfr_renamed_105.cfr_renamed_19());
                if (var13_25 /* !! */  != null && (var15_30 = (var14_28 = sprzne.cfr_renamed_23(sprfvg.cfr_renamed_23(var13_25 /* !! */ ).cfr_renamed_186())).cfr_renamed_288()) != null) {
                    var16_31 = var15_30.cfr_renamed_289()[0];
                    var17_32 = var14_28.cfr_renamed_290();
                    if (var17_32 != null) {
                        v18 = new Object[7];
                        v18[0] = new sprpgg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("\u0018]\u0006G\u001cZ\u0012}\u0006G\u0000Q\u0007"));
                        v18[1] = sprmaca.cfr_renamed_9("\u001c\u0004");
                        v18[2] = var16_31;
                        v18[3] = sprkhfa.cfr_renamed_9("\u0016U");
                        v18[4] = new sprpgg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("KUUOORAoCNO]J"));
                        v18[5] = " ";
                        v18[6] = var17_32;
                        var18_34 = v18;
                        var12_19.cfr_renamed_291(var18_34);
                    }
                }
                this.cfr_renamed_7330((sprxlg)var12_19, var11_18);
                try {
                    v14 = var9_15;
lbl173:
                    // 5 sources

                    v14.checkValidity(this.cfr_renamed_107);
                    v19 = this;
                }
                catch (CertificateNotYetValidException var12_22) {
                    v20 = new Object[1];
                    v20[0] = new sprefg(var9_15.getNotBefore());
                    var13_25 /* !! */  = (byte[])new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[W\u0010F\u0001]\u0013]\u0016U\u0001Q;[\u0001m\u0010@#U\u0019]\u0011"), v20);
                    v21 = this;
                    v19 = v21;
                    v21.cfr_renamed_7330((sprxlg)var13_25 /* !! */ , var11_18);
                }
                catch (CertificateExpiredException var12_23) {
                    v22 = new Object[1];
                    v22[0] = new sprefg(var9_15.getNotAfter());
                    var13_25 /* !! */  = (byte[])new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\b_CNRU@UE]RYcDVUTYB"), v22);
                    v23 = this;
                    v19 = v23;
                    v23.cfr_renamed_7330((sprxlg)var13_25 /* !! */ , var11_18);
                }
                if (v19.cfr_renamed_2.isRevocationEnabled()) {
                    var12_19 = null;
                    try {
                        v24 = sprvfg.cfr_renamed_292(var9_15, sprvfg.cfr_renamed_272);
                        var13_25 /* !! */  = (byte[])v24;
                        if (v24 != null) {
                            var12_19 = sprvcm.cfr_renamed_23(var13_25 /* !! */ );
                        }
                    }
                    catch (sprglg var13_26) {
                        var14_28 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u0016F\u0019p\u001cG\u0001d\u0001q\r@0F\u0007[\u0007"));
                        this.cfr_renamed_7330((sprxlg)var14_28, var11_18);
                    }
                    var13_25 /* !! */  = null;
                    try {
                        var14_28 = sprvfg.cfr_renamed_292(var9_15, sprvfg.cfr_renamed_93);
                        if (var14_28 != null) {
                            var13_25 /* !! */  = (byte[])spream.cfr_renamed_23(var14_28);
                        }
                    }
                    catch (sprglg var14_29) {
                        var15_30 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("\u007fCNRlGHNnCJOYQYT\u0012ENJ}SHNuHZI}E_cNTST"));
                        this.cfr_renamed_7330((sprxlg)var15_30, var11_18);
                    }
                    v25 = this;
                    var14_28 = v25.cfr_renamed_5064((sprvcm)var12_19);
                    var15_30 = v25.cfr_renamed_5076((spream)var13_25 /* !! */ );
                    var16_31 = var14_28.iterator();
                    v26 = var16_31;
                    while (v26.hasNext()) {
                        v27 = new Object[1];
                        v27[0] = new sprskg(var16_31.next());
                        var17_32 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[W\u0007X1]\u0006@%[\u001cZ\u0001"), v27);
                        v26 = var16_31;
                        this.cfr_renamed_7331((sprxlg)var17_32, var11_18);
                    }
                    v28 = var16_31 = var15_30.iterator();
                    while (v28.hasNext()) {
                        v29 = new Object[1];
                        v29[0] = new sprskg(var16_31.next());
                        var17_32 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bSEOVpI_GHOSH"), v29);
                        v28 = var16_31;
                        this.cfr_renamed_7331((sprxlg)var17_32, var11_18);
                    }
                    try {
                        v30 = this;
                        v30.cfr_renamed_273(v30.cfr_renamed_2, var9_15, this.cfr_renamed_107, (X509Certificate)var5_8, (PublicKey)var3_3, (Vector)var14_28, (Vector)var15_30, var11_18);
                        v31 = var4_6;
                        break block49;
                    }
                    catch (sprvig var17_33) {
                        this.cfr_renamed_7330(var17_33.cfr_renamed_281(), var11_18);
                    }
                }
                v31 = var4_6;
            }
            if (v31 != null && !var9_15.getIssuerX500Principal().equals(var4_6)) {
                v32 = new Object[2];
                v32[0] = var4_6.getName();
                v32[1] = var9_15.getIssuerX500Principal().getName();
                var12_19 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u0016Q\u0007@\"F\u001aZ\u0012}\u0006G\u0000Q\u0007"), v32);
                this.cfr_renamed_7330((sprxlg)var12_19, var11_18);
            }
            if (var10_17 != this.cfr_renamed_4) {
                if (var9_15 != null && var9_15.getVersion() == 1) {
                    var12_19 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bRI\u007fg\u007fCNR"));
                    this.cfr_renamed_7330((sprxlg)var12_19, var11_18);
                }
                try {
                    var12_19 = sprbcm.cfr_renamed_23(sprvfg.cfr_renamed_292(var9_15, sprvfg.cfr_renamed_112));
                    if (var12_19 != null) {
                        if (!var12_19.cfr_renamed_296()) {
                            var13_25 /* !! */  = (byte[])new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[Z\u001aw4w\u0010F\u0001"));
                            this.cfr_renamed_7330((sprxlg)var13_25 /* !! */ , var11_18);
                        }
                    } else {
                        var13_25 /* !! */  = (byte[])new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bRI~GOO_eSHORNGUHHU"));
                        this.cfr_renamed_7330((sprxlg)var13_25 /* !! */ , var11_18);
                    }
                }
                catch (sprglg var13_27) {
                    var14_28 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[Q\u0007F\u001aF%F\u001aW\u0010G\u001cZ\u0012v6"));
                    this.cfr_renamed_7330((sprxlg)var14_28, var11_18);
                }
                v33 = var9_15.getKeyUsage();
                var13_25 /* !! */  = (byte[])v33;
                if (v33 != null && (var13_25 /* !! */ .length <= 5 || var13_25 /* !! */ [5] == 0)) {
                    var14_28 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bRI\u007fCNRoO[H"));
                    this.cfr_renamed_7330((sprxlg)var14_28, var11_18);
                }
            }
            var5_8 = var9_15;
            var4_6 = var5_8.getSubjectX500Principal();
            try {
                var3_3 = sprvfg.cfr_renamed_297(this.cfr_renamed_79, var11_18);
                var6_11 = sprvfg.cfr_renamed_283((PublicKey)var3_3);
                var7_12 = var6_11.cfr_renamed_593();
                var8_13 = var6_11.cfr_renamed_284();
            }
            catch (CertPathValidatorException var12_24) {
                var13_25 /* !! */  = (byte[])new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u0005A\u0017\u007f\u0010M0F\u0007[\u0007"));
                this.cfr_renamed_7330((sprxlg)var13_25 /* !! */ , var11_18);
                var6_11 = null;
                var7_12 = null;
                var8_13 = null;
            }
            v12 = --var11_18;
        }
        this.cfr_renamed_88 = var1_1;
        this.cfr_renamed_1 = var3_3;
    }

    private /* synthetic */ boolean cfr_renamed_319(X509Certificate arg0, int arg1) {
        try {
            int n;
            boolean bl = false;
            sprszm sprszm2 = (sprszm)sprvfg.cfr_renamed_292(arg0, cfr_renamed_114);
            int n2 = n = 0;
            while (n2 < sprszm2.cfr_renamed_84()) {
                Object object;
                sprrzl sprrzl2 = sprrzl.cfr_renamed_23(sprszm2.cfr_renamed_85(n));
                if (sprrzl.cfr_renamed_112.cfr_renamed_5078(sprrzl2.cfr_renamed_356())) {
                    object = new sprxlg(cfr_renamed_86, sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bmEyS\u007fIQVPO]H_C"));
                    this.cfr_renamed_7331((sprxlg)object, arg1);
                } else if (!sprrzl.cfr_renamed_86.cfr_renamed_5078(sprrzl2.cfr_renamed_356())) {
                    if (sprrzl.cfr_renamed_152.cfr_renamed_5078(sprrzl2.cfr_renamed_356())) {
                        object = new sprxlg(cfr_renamed_86, sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[e\u0016g&w1"));
                        this.cfr_renamed_7331((sprxlg)object, arg1);
                    } else if (sprrzl.cfr_renamed_2.cfr_renamed_5078(sprrzl2.cfr_renamed_356())) {
                        sprvfg sprvfg2;
                        sprxlg sprxlg2;
                        sprxlg sprxlg3;
                        object = sprqdm.cfr_renamed_23(sprrzl2.cfr_renamed_357());
                        spredm spredm2 = ((sprqdm)object).cfr_renamed_358();
                        double d = ((sprqdm)object).cfr_renamed_359().doubleValue() * Math.pow(10.0, ((sprqdm)object).cfr_renamed_360().doubleValue());
                        if (((sprqdm)object).cfr_renamed_358().cfr_renamed_361()) {
                            Object[] objectArray = new Object[3];
                            objectArray[0] = ((sprqdm)object).cfr_renamed_358().cfr_renamed_362();
                            objectArray[1] = new sprefg(new Double(d));
                            objectArray[2] = object;
                            sprxlg3 = new sprxlg(cfr_renamed_86, sprmaca.cfr_renamed_9("\u007fCNRlGHNnCJOYQYT\u0012w_jUKURjGPSYgPVTG"), objectArray);
                            sprxlg2 = sprxlg3;
                            sprvfg2 = this;
                        } else {
                            Object[] objectArray = new Object[3];
                            objectArray[0] = spruaf.cfr_renamed_279(((sprqdm)object).cfr_renamed_358().cfr_renamed_363());
                            objectArray[1] = new sprefg(new Double(d));
                            objectArray[2] = object;
                            sprxlg3 = new sprxlg(cfr_renamed_86, sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a$W9]\u0018]\u0001b\u0014X\u0000Q;A\u0018"), objectArray);
                            sprxlg2 = sprxlg3;
                            sprvfg2 = this;
                        }
                        sprvfg2.cfr_renamed_7331(sprxlg2, arg1);
                    } else {
                        Object[] objectArray = new Object[2];
                        objectArray[0] = sprrzl2.cfr_renamed_356();
                        objectArray[1] = new sprckg(sprrzl2);
                        object = new sprxlg(cfr_renamed_86, sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bmEiHWHSQRuHGHCQCRR"), objectArray);
                        this.cfr_renamed_7331((sprxlg)object, arg1);
                        bl = true;
                    }
                }
                n2 = ++n;
            }
            return !bl;
        }
        catch (sprglg sprglg2) {
            sprxlg sprxlg4 = new sprxlg(cfr_renamed_86, sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a$W&@\u0014@\u0010Y\u0010Z\u0001q\r@0F\u0007[\u0007"));
            this.cfr_renamed_7330(sprxlg4, arg1);
            return false;
        }
    }

    public PolicyNode cfr_renamed_354() {
        sprvfg sprvfg2 = this;
        sprvfg2.cfr_renamed_317();
        return sprvfg2.cfr_renamed_31;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ String cfr_renamed_301(byte[] arg0) {
        try {
            return InetAddress.getByAddress(arg0).getHostAddress();
        }
        catch (Exception exception) {
            int n;
            StringBuffer stringBuffer = new StringBuffer();
            int n2 = n = 0;
            while (true) {
                if (n2 == arg0.length) {
                    return stringBuffer.toString();
                }
                stringBuffer.append(Integer.toHexString(arg0[n] & 0xFF));
                stringBuffer.append(' ');
                n2 = ++n;
            }
        }
    }

    public void cfr_renamed_317() {
        if (!this.cfr_renamed_132) {
            throw new IllegalStateException(sprmaca.cfr_renamed_9("sDVC_R\u001cHSR\u001cOROHO]JU\\YB\u0012\u0006\u007fGPJ\u001cOROH\u000e\u0015\u0006ZONUH\b"));
        }
        if (this.cfr_renamed_145 == null) {
            int n;
            this.cfr_renamed_145 = new List[this.cfr_renamed_4 + 1];
            this.cfr_renamed_102 = new List[this.cfr_renamed_4 + 1];
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_145.length) {
                sprvfg sprvfg2 = this;
                sprvfg2.cfr_renamed_145[n] = new ArrayList();
                sprvfg2.cfr_renamed_102[n++] = new ArrayList();
                n2 = n;
            }
            sprvfg sprvfg3 = this;
            sprvfg3.cfr_renamed_276();
            sprvfg3.cfr_renamed_343();
            sprvfg3.cfr_renamed_298();
            sprvfg3.cfr_renamed_328();
            sprvfg3.cfr_renamed_318();
        }
    }

    public void cfr_renamed_7328(sprxlg arg0) {
        this.cfr_renamed_145[0].add(arg0);
    }

    public void cfr_renamed_7331(sprxlg arg0, int arg1) {
        if (arg1 < -1 || arg1 >= this.cfr_renamed_4) {
            throw new IndexOutOfBoundsException();
        }
        this.cfr_renamed_145[arg1 + 1].add(arg0);
    }

    public List cfr_renamed_325(int arg0) {
        sprvfg sprvfg2 = this;
        sprvfg2.cfr_renamed_317();
        return sprvfg2.cfr_renamed_145[arg0 + 1];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_343() {
        X509Certificate x509Certificate = null;
        spramg spramg2 = new spramg();
        try {
            for (int i = this.cfr_renamed_79.size() - 1; i > 0; --i) {
                int n;
                Object object;
                sprsem[] sprsemArray;
                Object object2;
                Object object3;
                sprvfg sprvfg2 = this;
                int n2 = sprvfg2.cfr_renamed_4 - i;
                x509Certificate = (X509Certificate)sprvfg2.cfr_renamed_79.get(i);
                if (!sprvfg.cfr_renamed_286(x509Certificate)) {
                    object3 = sprvfg.cfr_renamed_282(x509Certificate);
                    object2 = new sprrzm(new ByteArrayInputStream(((X500Principal)object3).getEncoded()));
                    try {
                        sprsemArray = (sprszm)((sprrzm)object2).cfr_renamed_24();
                    }
                    catch (IOException iOException) {
                        Object[] objectArray = new Object[1];
                        objectArray[0] = new sprckg(object3);
                        sprxlg sprxlg2 = new sprxlg(cfr_renamed_86, sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[Z\u0016g\u0000V\u001fQ\u0016@;U\u0018Q0F\u0007[\u0007"), objectArray);
                        throw new sprvig(sprxlg2, (Throwable)iOException, this.cfr_renamed_126, i);
                    }
                    {
                        spramg2.cfr_renamed_5066((sprszm)sprsemArray);
                    }
                    {
                        spramg2.cfr_renamed_5067((sprszm)sprsemArray);
                    }
                    {
                        object = (sprszm)sprvfg.cfr_renamed_292(x509Certificate, (String)((Object)cfr_renamed_79));
                    }
                    if (object != null) {
                        int n3 = n = 0;
                        while (n3 < ((sprszm)object).cfr_renamed_84()) {
                            sprigm sprigm2 = sprigm.cfr_renamed_23(((sprszm)object).cfr_renamed_85(n));
                            try {
                                spramg spramg3 = spramg2;
                                sprigm sprigm3 = sprigm2;
                                spramg3.cfr_renamed_5068(sprigm3);
                                spramg3.cfr_renamed_5069(sprigm3);
                            }
                            catch (sprzgg sprzgg2) {
                                Object[] objectArray = new Object[1];
                                objectArray[0] = new sprckg(sprigm2);
                                sprxlg sprxlg3 = new sprxlg(cfr_renamed_86, sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u001b[\u0001d\u0010F\u0018]\u0001@\u0010P0Y\u0014]\u0019"), objectArray);
                                throw new sprvig(sprxlg3, (Throwable)sprzgg2, this.cfr_renamed_126, i);
                            }
                            n3 = ++n;
                        }
                    }
                }
                try {
                    object3 = (sprszm)sprvfg.cfr_renamed_292(x509Certificate, cfr_renamed_105);
                }
                catch (sprglg sprglg2) {
                    sprsemArray = new sprxlg(cfr_renamed_86, sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bREy^HcNTST"));
                    throw new sprvig((sprxlg)sprsemArray, (Throwable)sprglg2, this.cfr_renamed_126, i);
                }
                if (object3 == null) continue;
                object2 = sprygm.cfr_renamed_23(object3);
                sprsemArray = ((sprygm)object2).cfr_renamed_348();
                if (sprsemArray != null) {
                    spramg2.cfr_renamed_5070(sprsemArray);
                }
                if ((object = ((sprygm)object2).cfr_renamed_350()) == null) continue;
                int n4 = n = 0;
                while (n4 != ((sprsem[])object).length) {
                    spramg2.cfr_renamed_5071(object[n++]);
                    n4 = n;
                }
            }
            return;
        }
        catch (sprvig sprvig2) {
            this.cfr_renamed_7330(sprvig2.cfr_renamed_281(), sprvig2.cfr_renamed_320());
        }
    }

    public Vector cfr_renamed_5064(sprvcm arg0) {
        Vector<String> vector = new Vector<String>();
        if (arg0 != null) {
            int n;
            sprjgm[] sprjgmArray = arg0.cfr_renamed_322();
            int n2 = n = 0;
            while (n2 < sprjgmArray.length) {
                sprhhm sprhhm2 = sprjgmArray[n].cfr_renamed_323();
                if (sprhhm2.cfr_renamed_324() == 0) {
                    int n3;
                    sprigm[] sprigmArray = spraem.cfr_renamed_23(sprhhm2.cfr_renamed_313()).cfr_renamed_289();
                    int n4 = n3 = 0;
                    while (n4 < sprigmArray.length) {
                        if (sprigmArray[n3].cfr_renamed_312() == 6) {
                            String string = ((sprupm)sprigmArray[n3].cfr_renamed_313()).cfr_renamed_314();
                            vector.add(string);
                        }
                        n4 = ++n3;
                    }
                }
                n2 = ++n;
            }
        }
        return vector;
    }

    /*
     * WARNING - void declaration
     */
    public sprvfg(CertPath certPath, PKIXParameters pKIXParameters) throws sprvig {
        void arg1;
        sprvfg sprvfg2 = this;
        sprvfg2.cfr_renamed_355(certPath, (PKIXParameters)arg1);
    }

    public void cfr_renamed_273(PKIXParameters arg0, X509Certificate arg1, Date arg2, X509Certificate arg3, PublicKey arg4, Vector arg5, Vector arg6, int arg7) throws sprvig {
        this.cfr_renamed_274(arg0, arg1, arg2, arg3, arg4, arg5, arg7);
    }

    public void cfr_renamed_7330(sprxlg arg0, int arg1) {
        if (arg1 < -1 || arg1 >= this.cfr_renamed_4) {
            throw new IndexOutOfBoundsException();
        }
        this.cfr_renamed_102[arg1 + 1].add(arg0);
    }

    public CertPath cfr_renamed_315() {
        return this.cfr_renamed_126;
    }

    public boolean cfr_renamed_176() {
        int n;
        this.cfr_renamed_317();
        boolean bl = true;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_102.length) {
            if (!this.cfr_renamed_102[n].isEmpty()) {
                bl = false;
                return false;
            }
            n2 = ++n;
        }
        return bl;
    }

    public sprvfg() {
    }

    public List cfr_renamed_353(int arg0) {
        sprvfg sprvfg2 = this;
        sprvfg2.cfr_renamed_317();
        return sprvfg2.cfr_renamed_102[arg0 + 1];
    }

    public Vector cfr_renamed_5076(spream arg0) {
        Vector<String> vector = new Vector<String>();
        if (arg0 != null) {
            int n;
            sprufm[] sprufmArray = arg0.cfr_renamed_309();
            int n2 = n = 0;
            while (n2 < sprufmArray.length) {
                sprigm sprigm2;
                if (sprufmArray[n].cfr_renamed_310().cfr_renamed_5078(sprufm.cfr_renamed_4) && (sprigm2 = sprufmArray[n].cfr_renamed_311()).cfr_renamed_312() == 6) {
                    String string = ((sprupm)sprigm2.cfr_renamed_313()).cfr_renamed_314();
                    vector.add(string);
                }
                n2 = ++n;
            }
        }
        return vector;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Collection cfr_renamed_278(X509Certificate arg0, Set arg1) throws sprvig {
        Object object;
        Object object2;
        Object object3;
        X509CertSelector x509CertSelector;
        Iterator iterator;
        ArrayList<Object> arrayList;
        block7: {
            arrayList = new ArrayList<Object>();
            iterator = arg1.iterator();
            x509CertSelector = new X509CertSelector();
            try {
                x509CertSelector.setSubject(sprvfg.cfr_renamed_302(arg0).getEncoded());
                object3 = arg0.getExtensionValue(sprrdm.cfr_renamed_105.cfr_renamed_19());
                if (object3 == null) break block7;
                object2 = (sproug)sprxgf.cfr_renamed_184((byte[])object3);
                object = sprzne.cfr_renamed_23(sprxgf.cfr_renamed_184(((sproug)object2).cfr_renamed_186()));
                if (((sprzne)object).cfr_renamed_290() != null) {
                    x509CertSelector.setSerialNumber(((sprzne)object).cfr_renamed_290());
                    break block7;
                }
                byte[] byArray = ((sprzne)object).cfr_renamed_327();
                if (byArray != null) {
                    x509CertSelector.setSubjectKeyIdentifier(new sprfvg(byArray).cfr_renamed_91());
                }
            }
            catch (IOException iOException) {
                sprxlg sprxlg2 = new sprxlg(cfr_renamed_86, sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[@\u0007A\u0006@4Z\u0016\\\u001aF<G\u0006A\u0010F0F\u0007[\u0007"));
                throw new sprvig(sprxlg2);
            }
        }
        while (iterator.hasNext()) {
            TrustAnchor trustAnchor = (TrustAnchor)iterator.next();
            object3 = trustAnchor;
            if (trustAnchor.getTrustedCert() != null) {
                if (!x509CertSelector.match(((TrustAnchor)object3).getTrustedCert())) continue;
                arrayList.add(object3);
                continue;
            }
            if (((TrustAnchor)object3).getCAName() == null || ((TrustAnchor)object3).getCAPublicKey() == null || !((X500Principal)(object2 = sprvfg.cfr_renamed_302(arg0))).equals(object = new X500Principal(((TrustAnchor)object3).getCAName()))) continue;
            arrayList.add(object3);
        }
        return arrayList;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_328() {
        v0 = this;
        var1_1 = v0.cfr_renamed_2.getInitialPolicies();
        var2_2 = new ArrayList[v0.cfr_renamed_4 + 1];
        v1 = var3_3 = 0;
        while (v1 < var2_2.length) {
            var2_2[var3_3++] = new ArrayList<E>();
            v1 = var3_3;
        }
        var3_4 = new HashSet<String>();
        var3_4.add("2.5.29.32.0");
        var4_5 = new spreog(new ArrayList<E>(), 0, var3_4, null, new HashSet<E>(), "2.5.29.32.0", false);
        var2_2[0].add(var4_5);
        if (this.cfr_renamed_2.isExplicitPolicyRequired()) {
            var5_6 = 0;
            v2 = this;
        } else {
            v3 = this;
            v2 = v3;
            var5_6 = v3.cfr_renamed_4 + 1;
        }
        if (v2.cfr_renamed_2.isAnyPolicyInhibited()) {
            var6_7 = 0;
            v4 = this;
        } else {
            v5 = this;
            v4 = v5;
            var6_7 = v5.cfr_renamed_4 + 1;
        }
        var7_8 = v4.cfr_renamed_2.isPolicyMappingInhibited() != false ? 0 : this.cfr_renamed_4 + 1;
        var8_9 = null;
        var9_10 = null;
        try {
            block98: {
                v6 = var10_11 = this.cfr_renamed_79.size() - 1;
                while (v6 >= 0) {
                    v7 = this;
                    var11_12 = v7.cfr_renamed_4 - var10_11;
                    var9_10 = (X509Certificate)v7.cfr_renamed_79.get(var10_11);
                    try {
                        var12_13 = (sprszm)sprvfg.cfr_renamed_292(var9_10, sprvfg.cfr_renamed_119);
                    }
                    catch (sprglg var13_17) {
                        var14_18 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bLIPO__y^HcNTST"));
                        throw new sprvig((sprxlg)var14_18, (Throwable)var13_17, this.cfr_renamed_126, var10_11);
                    }
                    if (var12_13 != null && var4_5 != null) {
                        var13_16 = var12_13.cfr_renamed_329();
                        var14_18 = new HashSet<E>();
                        while (var13_16.hasMoreElements()) {
                            var15_26 = sprdcm.cfr_renamed_23(var13_16.nextElement());
                            var16_43 = var15_26.cfr_renamed_330();
                            var14_18.add(var16_43.cfr_renamed_19());
                            if ("2.5.29.32.0".equals(var16_43.cfr_renamed_19())) continue;
                            try {
                                var17_54 /* !! */  = sprvfg.cfr_renamed_5079(var15_26.cfr_renamed_332());
                            }
                            catch (CertPathValidatorException var18_66) {
                                var19_78 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[D\u001aX\u001cW\fe\u0000U\u0019]\u0013]\u0010F0F\u0007[\u0007"));
                                throw new sprvig((sprxlg)var19_78, (Throwable)var18_66, this.cfr_renamed_126, var10_11);
                            }
                            var18_67 = sprvfg.cfr_renamed_5080(var11_12, var2_2, (sprlem)var16_43, var17_54 /* !! */ );
                            if (var18_67 != 0) continue;
                            sprvfg.cfr_renamed_5081(var11_12, var2_2, (sprlem)var16_43, var17_54 /* !! */ );
                        }
                        if (var8_9 == null || var8_9.contains("2.5.29.32.0")) {
                            var8_9 = var14_18;
                            v8 = var6_7;
                        } else {
                            var15_26 = var8_9.iterator();
                            var16_43 = new HashSet<E>();
                            while (var15_26.hasNext()) {
                                var17_54 /* !! */  = var15_26.next();
                                if (!var14_18.contains(var17_54 /* !! */ )) continue;
                                var16_43.add(var17_54 /* !! */ );
                            }
                            var8_9 = var16_43;
                            v8 = var6_7;
                        }
                        if (v8 > 0 || var11_12 < this.cfr_renamed_4 && sprvfg.cfr_renamed_286(var9_10)) {
                            var13_16 = var12_13.cfr_renamed_329();
                            while (var13_16.hasMoreElements()) {
                                var15_26 = sprdcm.cfr_renamed_23(var13_16.nextElement());
                                if (!"2.5.29.32.0".equals(var15_26.cfr_renamed_330().cfr_renamed_19())) continue;
                                try {
                                    var16_43 = sprvfg.cfr_renamed_5079(var15_26.cfr_renamed_332());
                                }
                                catch (CertPathValidatorException var17_55) {
                                    var18_68 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bLIPO__mS]JU@UCNcNTST"));
                                    throw new sprvig(var18_68, (Throwable)var17_55, this.cfr_renamed_126, var10_11);
                                }
                                var17_54 /* !! */  = var2_2[var11_12 - 1];
                                v9 = var18_67 = 0;
                                while (v9 < var17_54 /* !! */ .size()) {
                                    var19_78 = (spreog)var17_54 /* !! */ .get(var18_67);
                                    var20_81 = var19_78.getExpectedPolicies().iterator();
                                    while (var20_81.hasNext()) {
                                        v10 /* !! */  = var21_82 /* !! */  = var20_81.next();
                                        if (var21_82 /* !! */  instanceof String) {
                                            var22_83 = (String)v10 /* !! */ ;
                                        } else {
                                            if (!(v10 /* !! */  instanceof sprlem)) continue;
                                            var22_83 = ((sprlem)var21_82 /* !! */ ).cfr_renamed_19();
                                        }
                                        var23_84 = false;
                                        var24_85 = var19_78.getChildren();
                                        while (var24_85.hasNext()) {
                                            var25_86 = (spreog)var24_85.next();
                                            if (!var22_83.equals(var25_86.getValidPolicy())) continue;
                                            var23_84 = true;
                                        }
                                        if (var23_84) continue;
                                        var25_86 = new HashSet<String>();
                                        var25_86.add(var22_83);
                                        var26_87 = new spreog(new ArrayList<E>(), var11_12, (Set)var25_86, (PolicyNode)var19_78, (Set)var16_43, var22_83, false);
                                        var19_78.cfr_renamed_7322(var26_87);
                                        var2_2[var11_12].add(var26_87);
                                    }
                                    v9 = ++var18_67;
                                }
                                break block30;
                            }
                        }
                        v11 = var11_12 - 1;
                        while (v11 >= 0) {
                            var16_43 = var2_2[var15_27];
                            v12 = var17_56 = 0;
                            while (v12 < var16_43.size() && ((var18_69 = (spreog)var16_43.get(var17_56)).cfr_renamed_336() || (var4_5 = sprvfg.cfr_renamed_7332((spreog)var4_5, var2_2, var18_69)) != null)) {
                                v12 = ++var17_56;
                            }
                            v11 = --var15_27;
                        }
                        var15_28 = var9_10.getCriticalExtensionOIDs();
                        if (var15_28 != null) {
                            var16_44 = var15_28.contains(sprvfg.cfr_renamed_119);
                            var17_57 = var2_2[var11_12];
                            v13 = var18_70 = 0;
                            while (v13 < var17_57.size()) {
                                v14 = (spreog)var17_57.get(var18_70);
                                var19_78 = v14;
                                v14.cfr_renamed_338(var16_44);
                                v13 = ++var18_70;
                            }
                        }
                    }
                    if (var12_13 == null) {
                        var4_5 = null;
                    }
                    if (var5_6 <= 0 && var4_5 == null) {
                        var13_16 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u001b[#U\u0019]\u0011d\u001aX\u001cW\f`\u0007Q\u0010"));
                        throw new sprvig((sprxlg)var13_16);
                    }
                    if (var11_12 != this.cfr_renamed_4) {
                        try {
                            var13_16 = sprvfg.cfr_renamed_292(var9_10, (String)sprvfg.cfr_renamed_2);
                        }
                        catch (sprglg var14_19) {
                            var15_29 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("\u007fCNRlGHNnCJOYQYT\u0012VSJUEEk]Vy^HcNTST"));
                            throw new sprvig(var15_29, (Throwable)var14_19, this.cfr_renamed_126, var10_11);
                        }
                        if (var13_16 != null) {
                            var14_18 = (sprszm)var13_16;
                            v15 = var15_30 = 0;
                            while (v15 < var14_18.cfr_renamed_84()) {
                                var16_45 = (sprszm)var14_18.cfr_renamed_85(var15_30);
                                var17_58 = (sprlem)var16_45.cfr_renamed_85(0);
                                var18_71 = (sprlem)var16_45.cfr_renamed_85(1);
                                if ("2.5.29.32.0".equals(var17_58.cfr_renamed_19())) {
                                    var19_78 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[]\u001bB\u0014X\u001cP%[\u0019]\u0016M8U\u0005D\u001cZ\u0012"));
                                    throw new sprvig((sprxlg)var19_78, this.cfr_renamed_126, var10_11);
                                }
                                if ("2.5.29.32.0".equals(var18_71.cfr_renamed_19())) {
                                    var19_78 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bUHJGPOXvSJUEEk]VLORA"));
                                    throw new sprvig((sprxlg)var19_78, this.cfr_renamed_126, var10_11);
                                }
                                v15 = ++var15_30;
                            }
                        }
                        if (var13_16 != null) {
                            var14_18 = (sprszm)var13_16;
                            var15_31 = new HashMap<Object, HashSet<E>>();
                            var16_46 = new HashSet<Object>();
                            v16 = var17_59 = 0;
                            while (v16 < var14_18.cfr_renamed_84()) {
                                var18_72 = (sprszm)var14_18.cfr_renamed_85(var17_59);
                                var19_78 = ((sprlem)var18_72.cfr_renamed_85(0)).cfr_renamed_19();
                                var20_81 = ((sprlem)var18_72.cfr_renamed_85(1)).cfr_renamed_19();
                                if (!var15_31.containsKey(var19_78)) {
                                    var21_82 /* !! */  = new HashSet<Iterator<E>>();
                                    var21_82 /* !! */ .add(var20_81);
                                    var15_31.put(var19_78, var21_82 /* !! */ );
                                    var16_46.add(var19_78);
                                } else {
                                    var21_82 /* !! */  = (Set)var15_31.get(var19_78);
                                    var21_82 /* !! */ .add(var20_81);
                                }
                                v16 = ++var17_59;
                            }
                            for (String var18_73 : var16_46) {
                                if (var7_8 > 0) {
                                    try {
                                        sprvfg.cfr_renamed_339(var11_12, var2_2, var18_73, var15_31, var9_10);
                                        continue;
                                    }
                                    catch (sprglg var19_79) {
                                        var20_81 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[D\u001aX\u001cW\fq\r@0F\u0007[\u0007"));
                                        throw new sprvig((sprxlg)var20_81, (Throwable)var19_79, this.cfr_renamed_126, var10_11);
                                    }
                                    catch (CertPathValidatorException var19_80) {
                                        var20_81 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bLIPO__mS]JU@UCNcNTST"));
                                        throw new sprvig((sprxlg)var20_81, (Throwable)var19_80, this.cfr_renamed_126, var10_11);
                                    }
                                }
                                if (var7_8 > 0) continue;
                                var4_5 = sprvfg.cfr_renamed_7333(var11_12, var2_2, var18_73, (spreog)var4_5);
                            }
                        }
                        if (!sprvfg.cfr_renamed_286(var9_10)) {
                            if (var5_6 != 0) {
                                --var5_6;
                            }
                            if (var7_8 != 0) {
                                --var7_8;
                            }
                            if (var6_7 != 0) {
                                --var6_7;
                            }
                        }
                        try {
                            var14_18 = (sprszm)sprvfg.cfr_renamed_292(var9_10, sprvfg.cfr_renamed_91);
                            if (var14_18 != null) {
                                var15_32 = var14_18.cfr_renamed_329();
                                while (var15_32.hasMoreElements()) {
                                    var16_47 = (sprnvm)var15_32.nextElement();
                                    switch (var16_47.cfr_renamed_312()) {
                                        case 0: {
                                            while (false) {
                                            }
                                            var17_61 = sprktm.cfr_renamed_5085(var16_47, false).cfr_renamed_5023();
                                            if (var17_61 >= var5_6) break;
                                            var5_6 = var17_61;
                                            break;
                                        }
                                        case 1: {
                                            var17_61 = sprktm.cfr_renamed_5085(var16_47, false).cfr_renamed_5023();
                                            if (var17_61 >= var7_8) break;
                                            var7_8 = var17_61;
                                        }
                                    }
                                }
                            }
                        }
                        catch (sprglg var14_20) {
                            var15_33 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u0005[\u0019]\u0016M6[\u001bG\u0001q\r@0F\u0007[\u0007"));
                            throw new sprvig(var15_33, this.cfr_renamed_126, var10_11);
                        }
                        try {
                            var14_18 = (sprktm)sprvfg.cfr_renamed_292(var9_10, (String)sprvfg.cfr_renamed_102);
                            if (var14_18 != null && (var15_34 = var14_18.cfr_renamed_5023()) < var6_7) {
                                var6_7 = var15_34;
                            }
                        }
                        catch (sprglg var14_21) {
                            var15_35 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("\u007fCNRlGHNnCJOYQYT\u0012VSJUEEoRNUDURy^HcNTST"));
                            throw new sprvig(var15_35, this.cfr_renamed_126, var10_11);
                        }
                    }
                    v6 = --var10_11;
                }
                if (!sprvfg.cfr_renamed_286(var9_10) && var5_6 > 0) {
                    --var5_6;
                }
                try {
                    var12_13 = (sprszm)sprvfg.cfr_renamed_292(var9_10, sprvfg.cfr_renamed_91);
                    if (var12_13 == null) break block98;
                    var13_16 = var12_13.cfr_renamed_329();
                    while (var13_16.hasMoreElements()) {
                        var14_18 = (sprnvm)var13_16.nextElement();
                        switch (var14_18.cfr_renamed_312()) lbl-1000:
                        // 2 sources

                        {
                            case 0: {
                                if (false) ** GOTO lbl-1000
                                var15_36 = sprktm.cfr_renamed_5085(var14_18, false).cfr_renamed_5023();
                                if (var15_36 != 0) break;
                                var5_6 = 0;
                            }
                        }
                    }
                }
                catch (sprglg var12_14) {
                    var13_16 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u0005[\u0019]\u0016M6[\u001bG\u0001q\r@0F\u0007[\u0007"));
                    throw new sprvig((sprxlg)var13_16, this.cfr_renamed_126, var10_11);
                }
            }
            if (var4_5 == null) {
                if (this.cfr_renamed_2.isExplicitPolicyRequired()) {
                    var13_16 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bY^LJUEURlIPO__"));
                    throw new sprvig((sprxlg)var13_16, this.cfr_renamed_126, var10_11);
                }
                var12_13 = null;
                v17 = var5_6;
            } else if (sprvfg.cfr_renamed_342(var1_1)) {
                if (this.cfr_renamed_2.isExplicitPolicyRequired()) {
                    if (var8_9.isEmpty()) {
                        var13_16 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[Q\rD\u0019]\u0016]\u0001d\u001aX\u001cW\f"));
                        throw new sprvig((sprxlg)var13_16, this.cfr_renamed_126, var10_11);
                    }
                    var13_16 = new HashSet<E>();
                    v18 = var14_22 = 0;
                    while (v18 < var2_2.length) {
                        var15_37 = var2_2[var14_22];
                        v19 = var16_48 = 0;
                        while (v19 < var15_37.size()) {
                            var17_62 = (spreog)var15_37.get(var16_48);
                            if ("2.5.29.32.0".equals(var17_62.getValidPolicy())) {
                                v20 = var17_62.getChildren();
                                while (v20.hasNext()) {
                                    v21 = var18_74;
                                    v20 = v21;
                                    var13_16.add(v21.next());
                                }
                            }
                            v19 = ++var16_48;
                        }
                        v18 = ++var14_22;
                    }
                    var14_23 = var13_16.iterator();
                    while (var14_23.hasNext()) {
                        var15_38 = (spreog)var14_23.next();
                        var16_49 = var15_38.getValidPolicy();
                        if (var8_9.contains(var16_49)) continue;
                    }
                    if (var4_5 != null) {
                        v22 = var15_39 = this.cfr_renamed_4 - 1;
                        while (v22 >= 0) {
                            var16_50 = var2_2[var15_39];
                            v23 = var17_63 = 0;
                            while (v23 < var16_50.size()) {
                                var18_75 = (spreog)var16_50.get(var17_63);
                                if (!var18_75.cfr_renamed_336()) {
                                    var4_5 = sprvfg.cfr_renamed_7332((spreog)var4_5, var2_2, var18_75);
                                }
                                v23 = ++var17_63;
                            }
                            v22 = --var15_39;
                        }
                    }
                }
                var12_13 = var4_5;
                v17 = var5_6;
            } else {
                var13_16 = new HashSet<E>();
                v24 = var14_24 = 0;
                while (v24 < var2_2.length) {
                    var15_40 = var2_2[var14_24];
                    v25 = var16_51 = 0;
                    while (v25 < var15_40.size()) {
                        var17_64 = (spreog)var15_40.get(var16_51);
                        if ("2.5.29.32.0".equals(var17_64.getValidPolicy())) {
                            var18_76 = var17_64.getChildren();
                            while (var18_76.hasNext()) {
                                var19_78 = (spreog)var18_76.next();
                                if ("2.5.29.32.0".equals(var19_78.getValidPolicy())) continue;
                                var13_16.add(var19_78);
                            }
                        }
                        v25 = ++var16_51;
                    }
                    v24 = ++var14_24;
                }
                var14_25 = var13_16.iterator();
                while (var14_25.hasNext()) {
                    var15_41 = (spreog)var14_25.next();
                    var16_52 = var15_41.getValidPolicy();
                    if (var1_1.contains(var16_52)) continue;
                    var4_5 = sprvfg.cfr_renamed_7332((spreog)var4_5, var2_2, var15_41);
                }
                if (var4_5 != null) {
                    v26 = var15_42 = this.cfr_renamed_4 - 1;
                    while (v26 >= 0) {
                        var16_53 = var2_2[var15_42];
                        v27 = var17_65 = 0;
                        while (v27 < var16_53.size()) {
                            var18_77 = (spreog)var16_53.get(var17_65);
                            if (!var18_77.cfr_renamed_336()) {
                                var4_5 = sprvfg.cfr_renamed_7332((spreog)var4_5, var2_2, var18_77);
                            }
                            v27 = ++var17_65;
                        }
                        v26 = --var15_42;
                    }
                }
                var12_13 = var4_5;
                v17 = var5_6;
            }
            if (v17 <= 0 && var12_13 == null) {
                var13_16 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("\u007fCNRlGHNnCJOYQYT\u0012ORP]JUBlIPO__"));
                throw new sprvig((sprxlg)var13_16);
            }
            var4_5 = var12_13;
            return;
        }
        catch (sprvig var12_15) {
            this.cfr_renamed_7330(var12_15.cfr_renamed_281(), var12_15.cfr_renamed_320());
            var4_5 = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_298() {
        int n;
        sprvfg sprvfg2 = this;
        int n2 = sprvfg2.cfr_renamed_4;
        int n3 = 0;
        X509Certificate x509Certificate = null;
        int n4 = n = sprvfg2.cfr_renamed_79.size() - 1;
        while (true) {
            sprktm sprktm2;
            Object object;
            Object object2;
            if (n4 <= 0) {
                Object[] objectArray = new Object[1];
                objectArray[0] = spruaf.cfr_renamed_279(n3);
                sprxlg sprxlg2 = new sprxlg(cfr_renamed_86, sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u0001[\u0001U\u0019d\u0014@\u001dx\u0010Z\u0012@\u001d"), objectArray);
                this.cfr_renamed_7328(sprxlg2);
                return;
            }
            sprvfg sprvfg3 = this;
            int n5 = sprvfg3.cfr_renamed_4 - n;
            x509Certificate = (X509Certificate)sprvfg3.cfr_renamed_79.get(n);
            if (!sprvfg.cfr_renamed_286(x509Certificate)) {
                if (n2 <= 0) {
                    object2 = new sprxlg(cfr_renamed_86, sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[D\u0014@\u001dx\u0010Z\u0012@\u001dq\r@\u0010Z\u0011Q\u0011"));
                    this.cfr_renamed_7329((sprxlg)object2);
                }
                --n2;
                ++n3;
            }
            try {
                object = object2 = sprbcm.cfr_renamed_23(sprvfg.cfr_renamed_292(x509Certificate, cfr_renamed_112));
            }
            catch (sprglg sprglg2) {
                sprxlg sprxlg3 = new sprxlg(cfr_renamed_86, sprmaca.cfr_renamed_9("\u007fCNRlGHNnCJOYQYT\u0012VNI_COUpCRAHN\u007fIRUHcNTST"));
                this.cfr_renamed_7330(sprxlg3, n);
                object = object2 = null;
            }
            if (object != null && ((sprbcm)object2).cfr_renamed_296() && (sprktm2 = ((sprbcm)object2).cfr_renamed_5086()) != null) {
                n2 = Math.min(n2, sprktm2.cfr_renamed_5087());
            }
            n4 = --n;
        }
    }

    public List[] cfr_renamed_326() {
        sprvfg sprvfg2 = this;
        sprvfg2.cfr_renamed_317();
        return sprvfg2.cfr_renamed_145;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_318() {
        List<PKIXCertPathChecker> list = this.cfr_renamed_2.getCertPathCheckers();
        Iterator<PKIXCertPathChecker> iterator = list.iterator();
        try {
            try {
                while (iterator.hasNext()) {
                    iterator.next().init(false);
                }
            }
            catch (CertPathValidatorException certPathValidatorException) {
                Object[] objectArray = new Object[3];
                objectArray[0] = certPathValidatorException.getMessage();
                objectArray[1] = certPathValidatorException;
                objectArray[2] = certPathValidatorException.getClass().getName();
                sprxlg sprxlg2 = new sprxlg(cfr_renamed_86, sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\b_CNRlGHN\u007fNYEWCNcNTST"), objectArray);
                throw new sprvig(sprxlg2, (Throwable)certPathValidatorException);
            }
            X509Certificate x509Certificate = null;
            for (int i = this.cfr_renamed_79.size() - 1; i >= 0; --i) {
                sprxlg sprxlg3;
                x509Certificate = (X509Certificate)this.cfr_renamed_79.get(i);
                Set<String> set = x509Certificate.getCriticalExtensionOIDs();
                if (set == null || set.isEmpty()) continue;
                set.remove(cfr_renamed_96);
                set.remove(cfr_renamed_119);
                set.remove(cfr_renamed_2);
                set.remove(cfr_renamed_102);
                set.remove(cfr_renamed_152);
                set.remove(cfr_renamed_3);
                set.remove(cfr_renamed_91);
                set.remove(cfr_renamed_112);
                set.remove(cfr_renamed_79);
                set.remove(cfr_renamed_105);
                if (i == 0) {
                    set.remove(sprrdm.cfr_renamed_114.cfr_renamed_19());
                }
                if (set.contains(cfr_renamed_114) && this.cfr_renamed_319(x509Certificate, i)) {
                    set.remove(cfr_renamed_114);
                }
                Iterator<PKIXCertPathChecker> iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                    try {
                        Iterator<PKIXCertPathChecker> iterator3;
                        iterator3.next().check(x509Certificate, set);
                        iterator2 = iterator3;
                    }
                    catch (CertPathValidatorException certPathValidatorException) {
                        Object[] objectArray = new Object[3];
                        objectArray[0] = certPathValidatorException.getMessage();
                        objectArray[1] = certPathValidatorException;
                        objectArray[2] = certPathValidatorException.getClass().getName();
                        sprxlg3 = new sprxlg(cfr_renamed_86, sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[W\u0007]\u0001]\u0016U\u0019q\r@\u0010Z\u0006]\u001aZ0F\u0007[\u0007"), objectArray);
                        throw new sprvig(sprxlg3, certPathValidatorException.getCause(), this.cfr_renamed_126, i);
                    }
                }
                if (set.isEmpty()) continue;
                Object object = set.iterator();
                while (object.hasNext()) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = new sprlem(sprxlg3.next());
                    sprxlg sprxlg4 = new sprxlg(cfr_renamed_86, sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bIHWHSQReNOHO_GPcDR"), objectArray);
                    object = sprxlg3;
                    this.cfr_renamed_7330(sprxlg4, i);
                }
            }
            return;
        }
        catch (sprvig sprvig2) {
            this.cfr_renamed_7330(sprvig2.cfr_renamed_281(), sprvig2.cfr_renamed_320());
        }
    }

    public PublicKey cfr_renamed_321() {
        sprvfg sprvfg2 = this;
        sprvfg2.cfr_renamed_317();
        return sprvfg2.cfr_renamed_1;
    }

    public void cfr_renamed_355(CertPath arg0, PKIXParameters arg1) throws sprvig {
        sprvfg sprvfg2;
        if (this.cfr_renamed_132) {
            throw new IllegalStateException(sprkhfa.cfr_renamed_9("[\u0017^\u0010W\u0001\u0014\u001cGUU\u0019F\u0010U\u0011MU]\u001b]\u0001]\u0014X\u001cN\u0010PT"));
        }
        this.cfr_renamed_132 = true;
        if (arg0 == null) {
            throw new NullPointerException(sprmaca.cfr_renamed_9("EYTHv]RT\u0006KGO\u0006RSPJ"));
        }
        List<? extends Certificate> list = arg0.getCertificates();
        if (list.size() != 1) {
            int n;
            Object object;
            HashSet<X509Certificate> hashSet = new HashSet<X509Certificate>();
            Object object2 = object = arg1.getTrustAnchors().iterator();
            while (object2.hasNext()) {
                TrustAnchor trustAnchor = object.next();
                object2 = object;
                hashSet.add(trustAnchor.getTrustedCert());
            }
            object = new ArrayList();
            int n2 = n = 0;
            while (n2 != list.size()) {
                if (!hashSet.contains(list.get(n))) {
                    object.add(list.get(n));
                }
                n2 = ++n;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(sprkhfa.cfr_renamed_9("-\u001a@\u0004L"), "BC");
                this.cfr_renamed_126 = certificateFactory.generateCertPath((List<? extends Certificate>)object);
            }
            catch (GeneralSecurityException generalSecurityException) {
                throw new IllegalStateException(sprmaca.cfr_renamed_9("IH]DPC\u001cRS\u0006NC^SUJX\u0006_CNRLGHN"));
            }
            this.cfr_renamed_79 = object;
            sprvfg2 = this;
        } else {
            sprvfg2 = this;
            sprvfg sprvfg3 = this;
            sprvfg3.cfr_renamed_126 = arg0;
            sprvfg3.cfr_renamed_79 = arg0.getCertificates();
        }
        sprvfg2.cfr_renamed_4 = this.cfr_renamed_79.size();
        if (this.cfr_renamed_79.isEmpty()) {
            throw new sprvig(new sprxlg(cfr_renamed_86, sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u0010Y\u0005@\fw\u0010F\u0001d\u0014@\u001d")));
        }
        this.cfr_renamed_2 = (PKIXParameters)arg1.clone();
        sprvfg sprvfg4 = this;
        sprvfg sprvfg5 = this;
        sprvfg sprvfg6 = this;
        sprvfg6.cfr_renamed_3 = new Date();
        this.cfr_renamed_107 = sprvfg.cfr_renamed_5077(this.cfr_renamed_2, this.cfr_renamed_3);
        this.cfr_renamed_145 = null;
        sprvfg5.cfr_renamed_102 = null;
        sprvfg5.cfr_renamed_88 = null;
        sprvfg4.cfr_renamed_1 = null;
        sprvfg4.cfr_renamed_31 = null;
    }

    public int cfr_renamed_300() {
        return this.cfr_renamed_4;
    }

    public TrustAnchor cfr_renamed_352() {
        sprvfg sprvfg2 = this;
        sprvfg2.cfr_renamed_317();
        return sprvfg2.cfr_renamed_88;
    }

    public List[] cfr_renamed_316() {
        sprvfg sprvfg2 = this;
        sprvfg2.cfr_renamed_317();
        return sprvfg2.cfr_renamed_102;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ X509CRL cfr_renamed_304(String arg0) throws sprvig {
        X509CRL x509CRL = null;
        try {
            HttpURLConnection httpURLConnection;
            URL uRL = new URL(arg0);
            if (!uRL.getProtocol().equals("http")) {
                if (!uRL.getProtocol().equals("https")) return x509CRL;
            }
            HttpURLConnection httpURLConnection2 = httpURLConnection = (HttpURLConnection)uRL.openConnection();
            httpURLConnection2.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection2.connect();
            if (httpURLConnection.getResponseCode() != 200) throw new Exception(httpURLConnection.getResponseMessage());
            return (X509CRL)CertificateFactory.getInstance(sprmaca.cfr_renamed_9("~\u0012\u0013\f\u001f"), "BC").generateCRL(httpURLConnection.getInputStream());
        }
        catch (Exception exception) {
            Object[] objectArray = new Object[4];
            objectArray[0] = new sprckg(arg0);
            objectArray[1] = exception.getMessage();
            objectArray[2] = exception;
            objectArray[3] = exception.getClass().getName();
            sprxlg sprxlg2 = new sprxlg(cfr_renamed_86, sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u0019[\u0014P6F\u0019p\u001cG\u0001d\u001a]\u001b@0F\u0007[\u0007"), objectArray);
            throw new sprvig(sprxlg2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_274(PKIXParameters arg0, X509Certificate arg1, Date arg2, X509Certificate arg3, PublicKey arg4, Vector arg5, int arg6) throws sprvig {
        block51: {
            block52: {
                block53: {
                    block50: {
                        block49: {
                            block48: {
                                var8_8 = new sprwng();
                                try {
                                    var8_8.addIssuerName(sprvfg.cfr_renamed_302(arg1).getEncoded());
                                }
                                catch (IOException var9_9) {
                                    var10_11 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\b_TPoOUICNcDEYVHOSH"));
                                    throw new sprvig(var10_11, (Throwable)var9_9);
                                }
                                var8_8.setCertificateChecking(arg1);
                                try {
                                    var10_12 = sprgkg.cfr_renamed_7323(var8_8, arg0);
                                    var9_10 = var10_12.iterator();
                                    if (var10_12.isEmpty()) {
                                        var10_12 = sprgkg.cfr_renamed_7323(new sprwng(), arg0);
                                        var11_15 = var10_12.iterator();
                                        var12_16 = new ArrayList<E>();
                                        v0 = var11_15;
                                        while (v0.hasNext()) {
                                            var12_16.add(((X509CRL)var11_15.next()).getIssuerX500Principal());
                                            v0 = var11_15;
                                        }
                                        var13_17 = var12_16.size();
                                        v1 = new Object[3];
                                        v1[0] = new sprckg(var8_8.getIssuerNames());
                                        v1[1] = new sprckg(var12_16);
                                        v1[2] = spruaf.cfr_renamed_279(var13_17);
                                        var14_25 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[Z\u001aw\u0007X<Z6Q\u0007@\u0006@\u001aF\u0010"), v1);
                                        this.cfr_renamed_7331((sprxlg)var14_25, arg6);
                                    }
                                }
                                catch (sprglg var10_13) {
                                    v2 = new Object[3];
                                    v2[0] = var10_13.getCause().getMessage();
                                    v2[1] = var10_13.getCause();
                                    v2[2] = var10_13.getCause().getClass().getName();
                                    var11_15 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\b_TPcDRNG_RUIRcNTST"), v2);
                                    this.cfr_renamed_7330((sprxlg)var11_15, arg6);
                                    var9_10 = new ArrayList<E>().iterator();
                                }
                                var10_14 = false;
                                var11_15 = null;
                                v3 = var9_10;
                                while (v3.hasNext()) {
                                    var11_15 = (X509CRL)var9_10.next();
                                    var12_16 = var11_15.getThisUpdate();
                                    var13_18 = var11_15.getNextUpdate();
                                    v4 = new Object[2];
                                    v4[0] = new sprefg(var12_16);
                                    v4[1] = new sprefg(var13_18);
                                    var14_25 = v4;
                                    if (var13_18 == null || arg2.before(var13_18)) {
                                        var10_14 = true;
                                        var15_26 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u0019[\u0016U\u0019b\u0014X\u001cP6f9"), (Object[])var14_25);
                                        v5 = var10_14;
                                        this.cfr_renamed_7331((sprxlg)var15_26, arg6);
                                        break block48;
                                    }
                                    var15_26 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("\u007fCNRlGHNnCJOYQYT\u0012JSE]JuHJGPOXenj"), (Object[])var14_25);
                                    v3 = var9_10;
                                    this.cfr_renamed_7331((sprxlg)var15_26, arg6);
                                }
                                v5 = var10_14;
                            }
                            if (!v5) {
                                var12_16 = arg1.getIssuerX500Principal();
                                var13_19 = null;
                                var14_25 = arg5.iterator();
                                block25: while (true) {
                                    v6 = var14_25;
                                    while (v6.hasNext()) {
                                        try {
                                            var15_26 = (String)var14_25.next();
                                            var13_19 = this.cfr_renamed_304((String)var15_26);
                                            if (var13_19 == null) continue block25;
                                            var16_30 = var13_19.getIssuerX500Principal();
                                            if (!var12_16.equals(var16_30)) {
                                                v7 = new Object[3];
                                                v7[0] = new sprckg(var16_30.getName());
                                                v7[1] = new sprckg(var12_16.getName());
                                                v7[2] = new sprskg(var15_26);
                                                var17_31 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[[\u001bX\u001cZ\u0010w'x\"F\u001aZ\u0012w4"), v7);
                                                this.cfr_renamed_7331((sprxlg)var17_31, arg6);
                                                v6 = var14_25;
                                                continue;
                                            }
                                            v8 = var13_19;
                                            var17_31 = v8.getThisUpdate();
                                            var18_37 = v8.getNextUpdate();
                                            v9 = new Object[3];
                                            v9[0] = new sprefg(var17_31);
                                            v9[1] = new sprefg(var18_37);
                                            v9[2] = new sprskg(var15_26);
                                            var19_39 /* !! */  = v9;
                                            if (var18_37 == null || arg2.before((Date)var18_37)) {
                                                var10_14 = true;
                                                var20_41 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bSHPORCjGPOXenj"), var19_39 /* !! */ );
                                                this.cfr_renamed_7331((sprxlg)var20_41, arg6);
                                                v10 = var11_15 = var13_19;
                                                break block49;
                                            }
                                            var20_41 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[[\u001bX\u001cZ\u0010}\u001bB\u0014X\u001cP6f9"), var19_39 /* !! */ );
                                            this.cfr_renamed_7331((sprxlg)var20_41, arg6);
                                        }
                                        catch (sprvig var15_27) {
                                            v6 = var14_25;
                                            this.cfr_renamed_7331(var15_27.cfr_renamed_281(), arg6);
                                            continue;
                                        }
                                        continue block25;
                                    }
                                    break;
                                }
                            }
                            v10 = var11_15;
                        }
                        if (v10 == null) break block51;
                        if (!(arg3 == null || (var13_20 = arg3.getKeyUsage()) == null || var13_20.length > 6 && var13_20[6])) {
                            var14_25 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bRI\u007fTPuUARORAlCNKURYB"));
                            throw new sprvig((sprxlg)var14_25);
                        }
                        if (arg4 == null) {
                            var13_22 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\b_TPhSoOUICNvIDPO_mY_"));
                            throw new sprvig(var13_22);
                        }
                        try {
                            var11_15.verify(arg4, "BC");
                        }
                        catch (Exception var13_21) {
                            var14_25 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u0016F\u0019b\u0010F\u001cR\fr\u0014]\u0019Q\u0011"));
                            throw new sprvig((sprxlg)var14_25, (Throwable)var13_21);
                        }
                        var12_16 = var11_15.getRevokedCertificate(arg1.getSerialNumber());
                        if (var12_16 != null) {
                            var13_23 = null;
                            if (var12_16.hasExtensions()) {
                                try {
                                    var14_25 = sprqvg.cfr_renamed_23(sprvfg.cfr_renamed_292((X509Extension)var12_16, sprrdm.cfr_renamed_953.cfr_renamed_19()));
                                }
                                catch (sprglg var15_28) {
                                    var16_30 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u0016F\u0019f\u0010U\u0006[\u001bq\r@0F\u0007[\u0007"));
                                    throw new sprvig((sprxlg)var16_30, (Throwable)var15_28);
                                }
                                if (var14_25 != null) {
                                    var13_23 = sprvfg.cfr_renamed_107[var14_25.cfr_renamed_5023()];
                                }
                            }
                            if (var13_23 == null) {
                                var13_23 = sprvfg.cfr_renamed_107[7];
                            }
                            var14_25 = new sprpgg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", (String)var13_23);
                            if (!arg2.before(var12_16.getRevocationDate())) {
                                v11 = new Object[2];
                                v11[0] = new sprefg(var12_16.getRevocationDate());
                                v11[1] = var14_25;
                                var15_26 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("\u007fCNRlGHNnCJOYQYT\u0012EYTHtYPSMYB"), v11);
                                throw new sprvig((sprxlg)var15_26);
                            }
                            v12 = new Object[2];
                            v12[0] = new sprefg(var12_16.getRevocationDate());
                            v12[1] = var14_25;
                            var15_26 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[F\u0010B\u001a_\u0010P4R\u0001Q\u0007b\u0014X\u001cP\u0014@\u001c[\u001b"), v12);
                            v13 = var11_15;
                            this.cfr_renamed_7331((sprxlg)var15_26, arg6);
                        } else {
                            var13_23 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\bRIHtYPSMYB"));
                            v13 = var11_15;
                            this.cfr_renamed_7331((sprxlg)var13_23, arg6);
                        }
                        var13_23 = v13.getNextUpdate();
                        if (var13_23 != null && !arg2.before((Date)var13_23)) {
                            v14 = new Object[1];
                            v14[0] = new sprefg(var13_23);
                            var14_25 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[W\u0007X D\u0011U\u0001Q4B\u0014]\u0019U\u0017X\u0010"), v14);
                            this.cfr_renamed_7331((sprxlg)var14_25, arg6);
                        }
                        try {
                            var14_25 = sprvfg.cfr_renamed_292((X509Extension)var11_15, sprvfg.cfr_renamed_152);
                        }
                        catch (sprglg var15_29) {
                            var16_30 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("\u007fCNRlGHNnCJOYQYT\u0012BUUHTlRy^HcNTST"));
                            throw new sprvig((sprxlg)var16_30);
                        }
                        {
                            var15_26 = sprvfg.cfr_renamed_292((X509Extension)var11_15, (String)sprvfg.cfr_renamed_3);
                        }
                        if (var15_26 == null) break block52;
                        var16_30 = new sprwng();
                        try {
                            var16_30.addIssuerName(sprvfg.cfr_renamed_305((X509CRL)var11_15).getEncoded());
                        }
                        catch (IOException var17_32) {
                            var18_37 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\b_TPoOUICNcDEYVHOSH"));
                            throw new sprvig((sprxlg)var18_37, (Throwable)var17_32);
                        }
                        var16_30.setMinCRLNumber(((sprktm)var15_26).cfr_renamed_162());
                        try {
                            var16_30.setMaxCRLNumber(((sprktm)sprvfg.cfr_renamed_292((X509Extension)var11_15, sprvfg.cfr_renamed_137)).cfr_renamed_162().subtract(BigInteger.valueOf(1L)));
                        }
                        catch (sprglg var17_33) {
                            var18_37 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("6Q\u0007@%U\u0001\\'Q\u0003]\u0010C\u0010F[W\u0007X;V\u0007q\r@0F\u0007[\u0007"));
                            throw new sprvig((sprxlg)var18_37, (Throwable)var17_33);
                        }
                        var17_34 = false;
                        try {
                            v15 = var18_37 = sprgkg.cfr_renamed_7323((sprwng)var16_30, arg0).iterator();
                            if (true) ** GOTO lbl206
                        }
                        catch (sprglg var19_40) {
                            var20_41 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("eYTHv]RTtYPUCKCN\b_TPcDRNG_RUIRcNTST"));
                            throw new sprvig((sprxlg)var20_41, (Throwable)var19_40);
                        }
                        do {
                            v15 = var18_37;
lbl206:
                            // 2 sources

                            if (!v15.hasNext()) break block50;
                            var19_39 /* !! */  = (X509CRL)var18_37.next();
                            try {
                                var20_41 = sprvfg.cfr_renamed_292((X509Extension)var19_39 /* !! */ , sprvfg.cfr_renamed_152);
                            }
                            catch (sprglg var21_42) {
                                var22_43 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u0011]\u0006@\u0007d\u0001q\r@0F\u0007[\u0007"));
                                throw new sprvig(var22_43, (Throwable)var21_42);
                            }
                        } while (!sprmye.cfr_renamed_5073(var14_25, var20_41));
                        v16 = var17_34 = true;
                        break block53;
                    }
                    v16 = var17_34;
                }
                if (!v16) {
                    var19_39 /* !! */  = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("\u007fCNRlGHNnCJOYQYT\u0012HSd]UYenj"));
                    throw new sprvig((sprxlg)var19_39 /* !! */ );
                }
            }
            if (var14_25 != null) {
                var16_30 = sprwzl.cfr_renamed_23(var14_25);
                var17_36 = null;
                try {
                    var17_36 = sprbcm.cfr_renamed_23(sprvfg.cfr_renamed_292(arg1, sprvfg.cfr_renamed_112));
                }
                catch (sprglg var18_38) {
                    var19_39 /* !! */  = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u0016F\u0019v6q\r@0F\u0007[\u0007"));
                    throw new sprvig((sprxlg)var19_39 /* !! */ , (Throwable)var18_38);
                }
                if (var16_30.cfr_renamed_306() && var17_36 != null && var17_36.cfr_renamed_296()) {
                    var18_37 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("\u007fCNRlGHNnCJOYQYT\u0012ENJsHP_iUYT\u007fCNR"));
                    throw new sprvig((sprxlg)var18_37);
                }
                if (var16_30.cfr_renamed_307() && (var17_36 == null || !var17_36.cfr_renamed_296())) {
                    var18_37 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u0016F\u0019{\u001bX\fw\u0014w\u0010F\u0001"));
                    throw new sprvig((sprxlg)var18_37);
                }
                if (var16_30.cfr_renamed_308()) {
                    var18_37 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprmaca.cfr_renamed_9("\u007fCNRlGHNnCJOYQYT\u0012ENJsHP_}RHT\u007fCNR"));
                    throw new sprvig((sprxlg)var18_37);
                }
            }
        }
        if (!var10_14) {
            var13_24 = new sprxlg("com.spire.psmodel.security.pkix.CertPathReviewerMessages", sprkhfa.cfr_renamed_9("w\u0010F\u0001d\u0014@\u001df\u0010B\u001cQ\u0002Q\u0007\u001a\u001b[#U\u0019]\u0011w\u0007X3[\u0000Z\u0011"));
            throw new sprvig(var13_24);
        }
    }

    public void cfr_renamed_7329(sprxlg arg0) {
        this.cfr_renamed_102[0].add(arg0);
    }
}

