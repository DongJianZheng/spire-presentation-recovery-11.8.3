/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakb;
import com.spire.presentation.packages.spramb;
import com.spire.presentation.packages.sprbfe;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprdgb;
import com.spire.presentation.packages.sprdna;
import com.spire.presentation.packages.sprefe;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprgva;
import com.spire.presentation.packages.sprhzc;
import com.spire.presentation.packages.spriae;
import com.spire.presentation.packages.spriee;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprjae;
import com.spire.presentation.packages.sprjxc;
import com.spire.presentation.packages.sprkmb;
import com.spire.presentation.packages.sprkpb;
import com.spire.presentation.packages.sprlhe;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprmce;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprmqa;
import com.spire.presentation.packages.sprnge;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprree;
import com.spire.presentation.packages.sprsxc;
import com.spire.presentation.packages.sprtae;
import com.spire.presentation.packages.sprtua;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprude;
import com.spire.presentation.packages.sprune;
import com.spire.presentation.packages.sprvje;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwge;
import com.spire.presentation.packages.sprxqa;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.spryke;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.spryvc;
import com.spire.presentation.packages.sprzrb;
import com.spire.presentation.packages.sprztc;
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

public class sprtqa
extends sprmqa {
    public int cfr_renamed_31;
    public PublicKey cfr_renamed_272;
    private static final String cfr_renamed_145 = "org.bouncycastle.x509.CertPathReviewerMessages";
    public List[] cfr_renamed_79;
    public PolicyNode cfr_renamed_107;
    public List[] cfr_renamed_132;
    private static final String cfr_renamed_102;
    public TrustAnchor cfr_renamed_93;
    public PKIXParameters cfr_renamed_86;
    public List cfr_renamed_152;
    private static final String cfr_renamed_112;
    private static final String cfr_renamed_119;
    public CertPath cfr_renamed_2;
    private boolean cfr_renamed_3;
    public Date cfr_renamed_4;

    public void cfr_renamed_273(PKIXParameters arg0, X509Certificate arg1, Date arg2, X509Certificate arg3, PublicKey arg4, Vector arg5, Vector arg6, int arg7) throws sprdna {
        this.cfr_renamed_274(arg0, arg1, arg2, arg3, arg4, arg5, arg7);
    }

    public void cfr_renamed_275(spryvc arg0) {
        this.cfr_renamed_132[0].add(arg0);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void cfr_renamed_276() {
        block54: {
            block55: {
                block51: {
                    block50: {
                        var1_1 = null;
                        var2_2 = null;
                        v0 = new Object[2];
                        v0[0] = new sprjxc(this.cfr_renamed_4);
                        v0[1] = new sprjxc(new Date());
                        var3_3 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("\u0013S\"B\u0000W$^\u0002S&_5A5D~U5D$f1B8`1Z9R\u0014W$S"), v0);
                        this.cfr_renamed_277((spryvc)var3_3);
                        try {
                            block53: {
                                v1 = this;
                                var3_3 = (X509Certificate)v1.cfr_renamed_152.get(v1.cfr_renamed_152.size() - 1);
                                v2 = this;
                                var4_6 = v2.cfr_renamed_278((X509Certificate)var3_3, v2.cfr_renamed_86.getTrustAnchors());
                                if (var4_6.size() > 1) {
                                    v3 = new Object[2];
                                    v3[0] = spriwa.cfr_renamed_279(var4_6.size());
                                    v3[1] = new sprhzc(var3_3.getIssuerX500Principal());
                                    var5_8 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012oSbZ`UoHeRkh~I\u007fHMRoTcN\u007f"), v3);
                                    this.cfr_renamed_275((spryvc)var5_8);
                                    break block50;
                                }
                                if (var4_6.isEmpty()) {
                                    v4 = new Object[2];
                                    v4[0] = new sprhzc(var3_3.getIssuerX500Principal());
                                    v4[1] = spriwa.cfr_renamed_279(this.cfr_renamed_86.getTrustAnchors().size());
                                    var5_8 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u0018>Y\u0004D%E$w>U8Y\"p?C>R"), v4);
                                    this.cfr_renamed_275((spryvc)var5_8);
                                    break block50;
                                }
                                v5 = var1_1 = (TrustAnchor)var4_6.iterator().next();
                                if (var1_1.getTrustedCert() == null) break block53;
                                var5_8 = v5.getTrustedCert().getPublicKey();
                                v6 = var3_3;
                                ** GOTO lbl44
                            }
                            var5_8 = v5.getCAPublicKey();
                            try {
                                v6 = var3_3;
lbl44:
                                // 2 sources

                                sprmqa.cfr_renamed_280((X509Certificate)v6, (PublicKey)var5_8, this.cfr_renamed_86.getSigProvider());
                            }
                            catch (SignatureException var6_9) {
                                var7_12 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012xNyOx~yHERz]`Uh\u007fiNx"));
                                this.cfr_renamed_275((spryvc)var7_12);
                            }
                            catch (Exception var6_10) {}
                        }
                        catch (sprdna var3_4) {
                            v7 = var1_1;
                            this.cfr_renamed_275(var3_4.cfr_renamed_281());
                            break block51;
                        }
                        catch (Throwable var3_5) {
                            v8 = new Object[2];
                            v8[0] = new sprhzc(var3_5.getMessage());
                            v8[1] = new sprhzc(var3_5);
                            var4_6 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("\u0013S\"B\u0000W$^\u0002S&_5A5D~C>]>Y'X"), v8);
                            this.cfr_renamed_275((spryvc)var4_6);
                        }
                    }
                    v7 = var1_1;
                }
                if (v7 != null) {
                    var3_3 = var1_1.getTrustedCert();
                    try {
                        var2_2 = var3_3 != null ? sprtqa.cfr_renamed_282((X509Certificate)var3_3) : new X500Principal(var1_1.getCAName());
                    }
                    catch (IllegalArgumentException var4_7) {
                        v9 = new Object[1];
                        v9[0] = new sprhzc(var1_1.getCAName());
                        var5_8 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"H~I\u007fHHrERz]`Uh"), v9);
                        this.cfr_renamed_275((spryvc)var5_8);
                    }
                    if (var3_3 != null) {
                        v10 = var3_3.getKeyUsage();
                        var4_6 = v10;
                        if (v10 != null && var4_6[5] == false) {
                            var5_8 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("\u0013S\"B\u0000W$^\u0002S&_5A5D~B\"C#B\u001bS)c#W7S"));
                            this.cfr_renamed_277((spryvc)var5_8);
                        }
                    }
                }
                var3_3 = null;
                var4_6 = var2_2;
                var5_8 = null;
                var6_11 = null;
                var7_12 = null;
                var8_13 = null;
                if (var1_1 == null) break block54;
                var5_8 = var1_1.getTrustedCert();
                if (var5_8 == null) break block55;
                v11 = var3_3 = var5_8.getPublicKey();
                ** GOTO lbl100
            }
            var3_3 = var1_1.getCAPublicKey();
            try {
                v11 = var3_3;
lbl100:
                // 2 sources

                var6_11 = sprtqa.cfr_renamed_283((PublicKey)v11);
                var7_12 = var6_11.cfr_renamed_90();
                var8_13 = var6_11.cfr_renamed_284();
            }
            catch (CertPathValidatorException var9_14) {
                var10_16 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"H~I\u007fH\\InwiEIN~S~"));
                this.cfr_renamed_275(var10_16);
                var6_11 = null;
            }
        }
        var9_15 = null;
        v12 = var11_18 = this.cfr_renamed_152.size() - 1;
        while (v12 >= 0) {
            block52: {
                block57: {
                    block56: {
                        v13 = this;
                        var10_17 = v13.cfr_renamed_31 - var11_18;
                        var9_15 = (X509Certificate)v13.cfr_renamed_152.get(var11_18);
                        if (var3_3 == null) break block56;
                        try {
                            sprmqa.cfr_renamed_280(var9_15, (PublicKey)var3_3, this.cfr_renamed_86.getSigProvider());
                            v14 = var9_15;
                        }
                        catch (GeneralSecurityException var12_20) {
                            v15 = new Object[3];
                            v15[0] = var12_20.getMessage();
                            v15[1] = var12_20;
                            v15[2] = var12_20.getClass().getName();
                            var13_25 /* !! */  = (byte[])new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u0018#_7X1B%D5x?B\u0006S\"_6_5R"), v15);
                            v14 = var9_15;
                            this.cfr_renamed_285((spryvc)var13_25 /* !! */ , var11_18);
                        }
                        ** GOTO lbl180
                    }
                    if (!sprtqa.cfr_renamed_286(var9_15)) break block57;
                    try {
                        v16 = var9_15;
                        sprmqa.cfr_renamed_280(v16, v16.getPublicKey(), this.cfr_renamed_86.getSigProvider());
                        var12_19 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"NcSxwiEEOZ]`Uh~yHBSx}XNyOx}b_dS~"));
                        this.cfr_renamed_285((spryvc)var12_19, var11_18);
                        v14 = var9_15;
                    }
                    catch (GeneralSecurityException var12_21) {
                        v17 = new Object[3];
                        v17[0] = var12_21.getMessage();
                        v17[1] = var12_21;
                        v17[2] = var12_21.getClass().getName();
                        var13_25 /* !! */  = (byte[])new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u0018#_7X1B%D5x?B\u0006S\"_6_5R"), v17);
                        v14 = var9_15;
                        this.cfr_renamed_285((spryvc)var13_25 /* !! */ , var11_18);
                    }
                    ** GOTO lbl180
                }
                var12_19 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012BSEO\u007fIiN\\InPe_GYu"));
                var13_25 /* !! */  = var9_15.getExtensionValue(sprude.cfr_renamed_287.cfr_renamed_19());
                if (var13_25 /* !! */  != null) {
                    try {
                        var14_28 = sprxqa.cfr_renamed_23(sprtua.cfr_renamed_36(var13_25 /* !! */ ));
                        var15_31 = var14_28.cfr_renamed_288();
                        if (var15_31 != null) {
                            var16_32 = var15_31.cfr_renamed_289()[0];
                            var17_33 = var14_28.cfr_renamed_290();
                            if (var17_33 != null) {
                                v18 = new Object[7];
                                v18[0] = new sprsxc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("[9E#_>Q\u0019E#C5D"));
                                v18[1] = sprdgb.cfr_renamed_9("\u001c.");
                                v18[2] = var16_32;
                                v18[3] = spramb.cfr_renamed_9("r\u0016");
                                v18[4] = new sprsxc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("aU\u007fOeRkoiNe]`"));
                                v18[5] = " ";
                                v18[6] = var17_33;
                                var18_35 = v18;
                                var12_19.cfr_renamed_291(var18_35);
                            }
                        }
                    }
                    catch (IOException var14_29) {
                        // empty catch block
                    }
                }
                this.cfr_renamed_285((spryvc)var12_19, var11_18);
                try {
                    v14 = var9_15;
lbl180:
                    // 5 sources

                    v14.checkValidity(this.cfr_renamed_4);
                    v19 = this;
                }
                catch (CertificateNotYetValidException var12_22) {
                    v20 = new Object[1];
                    v20[0] = new sprjxc(var9_15.getNotBefore());
                    var13_25 /* !! */  = (byte[])new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u00183S\"B9P9U1B5x?B\tS$`1Z9R"), v20);
                    v21 = this;
                    v19 = v21;
                    v21.cfr_renamed_285((spryvc)var13_25 /* !! */ , var11_18);
                }
                catch (CertificateExpiredException var12_23) {
                    v22 = new Object[1];
                    v22[0] = new sprjxc(var9_15.getNotAfter());
                    var13_25 /* !! */  = (byte[])new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"_iNxUjUo]xYID|U~Yh"), v22);
                    v23 = this;
                    v19 = v23;
                    v23.cfr_renamed_285((spryvc)var13_25 /* !! */ , var11_18);
                }
                if (v19.cfr_renamed_86.isRevocationEnabled()) {
                    var12_19 = null;
                    try {
                        v24 = sprtqa.cfr_renamed_292(var9_15, sprtqa.cfr_renamed_112);
                        var13_25 /* !! */  = (byte[])v24;
                        if (v24 != null) {
                            var12_19 = sprefe.cfr_renamed_23(var13_25 /* !! */ );
                        }
                    }
                    catch (sprakb var13_26) {
                        var14_28 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("\u0013S\"B\u0000W$^\u0002S&_5A5D~U\"Z\u0014_#B\u0000B\u0015N$s\"D?D"));
                        this.cfr_renamed_285((spryvc)var14_28, var11_18);
                    }
                    var13_25 /* !! */  = null;
                    try {
                        var14_28 = sprtqa.cfr_renamed_292(var9_15, sprtqa.cfr_renamed_102);
                        if (var14_28 != null) {
                            var13_25 /* !! */  = (byte[])sprjae.cfr_renamed_23(var14_28);
                        }
                    }
                    catch (sprakb var14_30) {
                        var15_31 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012oN`}yHdubZc}o_IN~S~"));
                        this.cfr_renamed_285((spryvc)var15_31, var11_18);
                    }
                    v25 = this;
                    var14_28 = v25.cfr_renamed_293((sprefe)var12_19);
                    var15_31 = v25.cfr_renamed_294((sprjae)var13_25 /* !! */ );
                    var16_32 = var14_28.iterator();
                    v26 = var16_32;
                    while (v26.hasNext()) {
                        v27 = new Object[1];
                        v27[0] = new sprztc(var16_32.next());
                        var17_33 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u00183D<r9E$f?_>B"), v27);
                        v26 = var16_32;
                        this.cfr_renamed_295((spryvc)var17_33, var11_18);
                    }
                    v28 = var16_32 = var15_31.iterator();
                    while (v28.hasNext()) {
                        v29 = new Object[1];
                        v29[0] = new sprztc(var16_32.next());
                        var17_33 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"SoO|pc_mHeSb"), v29);
                        v28 = var16_32;
                        this.cfr_renamed_295((spryvc)var17_33, var11_18);
                    }
                    try {
                        v30 = this;
                        v30.cfr_renamed_273(v30.cfr_renamed_86, var9_15, this.cfr_renamed_4, (X509Certificate)var5_8, (PublicKey)var3_3, (Vector)var14_28, (Vector)var15_31, var11_18);
                        v31 = var4_6;
                        break block52;
                    }
                    catch (sprdna var17_34) {
                        this.cfr_renamed_285(var17_34.cfr_renamed_281(), var11_18);
                    }
                }
                v31 = var4_6;
            }
            if (v31 != null && !var9_15.getIssuerX500Principal().equals(var4_6)) {
                v32 = new Object[2];
                v32[0] = var4_6.getName();
                v32[1] = var9_15.getIssuerX500Principal().getName();
                var12_19 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("\u0013S\"B\u0000W$^\u0002S&_5A5D~U5D$a\"Y>Q\u0019E#C5D"), v32);
                this.cfr_renamed_285((spryvc)var12_19, var11_18);
            }
            if (var10_17 != this.cfr_renamed_31) {
                if (var9_15 != null && var9_15.getVersion() == 1) {
                    var12_19 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"Rc\u007fM\u007fiNx"));
                    this.cfr_renamed_285((spryvc)var12_19, var11_18);
                }
                try {
                    var12_19 = sprwge.cfr_renamed_23(sprtqa.cfr_renamed_292(var9_15, sprtqa.cfr_renamed_114));
                    if (var12_19 != null) {
                        if (!var12_19.cfr_renamed_296()) {
                            var13_25 /* !! */  = (byte[])new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u0018>Y\u0013w\u0013S\"B"));
                            this.cfr_renamed_285((spryvc)var13_25 /* !! */ , var11_18);
                        }
                    } else {
                        var13_25 /* !! */  = (byte[])new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"Rc~mOe_OSbOxNmUbH\u007f"));
                        this.cfr_renamed_285((spryvc)var13_25 /* !! */ , var11_18);
                    }
                }
                catch (sprakb var13_27) {
                    var14_28 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u00185D\"Y\"f\"Y3S#_>Q\u0012u"));
                    this.cfr_renamed_285((spryvc)var14_28, var11_18);
                }
                v33 = var9_15.getKeyUsage();
                var13_25 /* !! */  = (byte[])v33;
                if (v33 != null && var13_25 /* !! */ [5] == 0) {
                    var14_28 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"Rc\u007fiNxoe[b"));
                    this.cfr_renamed_285((spryvc)var14_28, var11_18);
                }
            }
            var5_8 = var9_15;
            var4_6 = var5_8.getSubjectX500Principal();
            try {
                var3_3 = sprtqa.cfr_renamed_297(this.cfr_renamed_152, var11_18);
                var6_11 = sprtqa.cfr_renamed_283((PublicKey)var3_3);
                var7_12 = var6_11.cfr_renamed_90();
                var8_13 = var6_11.cfr_renamed_284();
            }
            catch (CertPathValidatorException var12_24) {
                var13_25 /* !! */  = (byte[])new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("\u0013S\"B\u0000W$^\u0002S&_5A5D~F%T\u001bS)s\"D?D"));
                this.cfr_renamed_285((spryvc)var13_25 /* !! */ , var11_18);
                var6_11 = null;
                var7_12 = null;
                var8_13 = null;
            }
            v12 = --var11_18;
        }
        this.cfr_renamed_93 = var1_1;
        this.cfr_renamed_272 = var3_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_298() {
        int n;
        sprtqa sprtqa2 = this;
        int n2 = sprtqa2.cfr_renamed_31;
        int n3 = 0;
        X509Certificate x509Certificate = null;
        int n4 = n = sprtqa2.cfr_renamed_152.size() - 1;
        while (true) {
            int n5;
            BigInteger bigInteger;
            Object object;
            Object object2;
            if (n4 <= 0) {
                Object[] objectArray = new Object[1];
                objectArray[0] = spriwa.cfr_renamed_279(n3);
                spryvc spryvc2 = new spryvc(cfr_renamed_145, sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012xSx]`lmHdpiRkHd"), objectArray);
                this.cfr_renamed_277(spryvc2);
                return;
            }
            sprtqa sprtqa3 = this;
            int n6 = sprtqa3.cfr_renamed_31 - n;
            x509Certificate = (X509Certificate)sprtqa3.cfr_renamed_152.get(n);
            if (!sprtqa.cfr_renamed_286(x509Certificate)) {
                if (n2 <= 0) {
                    object2 = new spryvc(cfr_renamed_145, sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"LmHdpiRkTxytHiRhYh"));
                    this.cfr_renamed_275((spryvc)object2);
                }
                --n2;
                ++n3;
            }
            try {
                object = object2 = sprwge.cfr_renamed_23(sprtqa.cfr_renamed_292(x509Certificate, cfr_renamed_114));
            }
            catch (sprakb sprakb2) {
                spryvc spryvc3 = new spryvc(cfr_renamed_145, spramb.cfr_renamed_9("\u0013S\"B\u0000W$^\u0002S&_5A5D~F\"Y3S#E\u001cS>Q$^\u0013Y>E$s\"D?D"));
                this.cfr_renamed_285(spryvc3, n);
                object = object2 = null;
            }
            if (object != null && (bigInteger = ((sprwge)object2).cfr_renamed_299()) != null && (n5 = bigInteger.intValue()) < n2) {
                n2 = n5;
            }
            n4 = --n;
        }
    }

    public int cfr_renamed_300() {
        return this.cfr_renamed_31;
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

    public void cfr_renamed_277(spryvc arg0) {
        this.cfr_renamed_79[0].add(arg0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_274(PKIXParameters arg0, X509Certificate arg1, Date arg2, X509Certificate arg3, PublicKey arg4, Vector arg5, int arg6) throws sprdna {
        block53: {
            block54: {
                block52: {
                    block51: {
                        block50: {
                            block49: {
                                var8_8 = new sprgva();
                                try {
                                    var8_8.addIssuerName(sprtqa.cfr_renamed_302(arg1).getEncoded());
                                }
                                catch (IOException var9_9) {
                                    var10_11 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u00183D<\u007f#E%S\"s(U5F$_?X"));
                                    throw new sprdna(var10_11, (Throwable)var9_9);
                                }
                                var8_8.setCertificateChecking(arg1);
                                try {
                                    var10_12 = sprtqa.cfr_renamed_86.cfr_renamed_303(var8_8, arg0);
                                    var9_10 = var10_12.iterator();
                                    if (var10_12.isEmpty()) {
                                        var10_12 = sprtqa.cfr_renamed_86.cfr_renamed_303(new sprgva(), arg0);
                                        var11_15 = var10_12.iterator();
                                        var12_16 = new ArrayList<X500Principal>();
                                        v0 = var11_15;
                                        while (v0.hasNext()) {
                                            var12_16.add(((X509CRL)var11_15.next()).getIssuerX500Principal());
                                            v0 = var11_15;
                                        }
                                        var13_17 = var12_16.size();
                                        v1 = new Object[3];
                                        v1[0] = new sprhzc(var8_8.getIssuerNames());
                                        v1[1] = new sprhzc(var12_16);
                                        v1[2] = spriwa.cfr_renamed_279(var13_17);
                                        var14_24 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"Rc\u007f~PEROY~H\u007fHcNi"), v1);
                                        this.cfr_renamed_295((spryvc)var14_24, arg6);
                                    }
                                }
                                catch (sprakb var10_13) {
                                    v2 = new Object[3];
                                    v2[0] = var10_13.getCause().getMessage();
                                    v2[1] = var10_13.getCause();
                                    v2[2] = var10_13.getCause().getClass().getName();
                                    var11_15 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u00183D<s(B\"W3B9Y>s\"D?D"), v2);
                                    this.cfr_renamed_285((spryvc)var11_15, arg6);
                                    var9_10 = new ArrayList<E>().iterator();
                                }
                                var10_14 = false;
                                var11_15 = null;
                                v3 = var9_10;
                                while (v3.hasNext()) {
                                    var11_15 = (X509CRL)var9_10.next();
                                    if (var11_15.getNextUpdate() == null || arg0.getDate().before(var11_15.getNextUpdate())) {
                                        var10_14 = true;
                                        v4 = new Object[2];
                                        v4[0] = new sprjxc(var11_15.getThisUpdate());
                                        v4[1] = new sprjxc(var11_15.getNextUpdate());
                                        var12_16 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012`So]`jmPeXOn@"), v4);
                                        v5 = var10_14;
                                        this.cfr_renamed_295((spryvc)var12_16, arg6);
                                        break block49;
                                    }
                                    v6 = new Object[2];
                                    v6[0] = new sprjxc(var11_15.getThisUpdate());
                                    v6[1] = new sprjxc(var11_15.getNextUpdate());
                                    var12_16 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("\u0013S\"B\u0000W$^\u0002S&_5A5D~Z?U1Z\u0019X&W<_4u\u0002z"), v6);
                                    v3 = var9_10;
                                    this.cfr_renamed_295((spryvc)var12_16, arg6);
                                }
                                v5 = var10_14;
                            }
                            if (!v5) {
                                var12_16 = null;
                                var13_18 = arg5.iterator();
                                block25: while (true) {
                                    v7 = var13_18;
                                    while (v7.hasNext()) {
                                        try {
                                            var14_24 = (String)var13_18.next();
                                            var12_16 = this.cfr_renamed_304((String)var14_24);
                                            if (var12_16 == null) continue block25;
                                            if (!arg1.getIssuerX500Principal().equals(var12_16.getIssuerX500Principal())) {
                                                v8 = new Object[3];
                                                v8[0] = new sprhzc(var12_16.getIssuerX500Principal().getName());
                                                v8[1] = new sprhzc(arg1.getIssuerX500Principal().getName());
                                                v8[2] = new sprztc(var14_24);
                                                var15_27 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"SbPeRi\u007f^p[NcRk\u007fM"), v8);
                                                this.cfr_renamed_295((spryvc)var15_27, arg6);
                                                v7 = var13_18;
                                                continue;
                                            }
                                            if (var12_16.getNextUpdate() == null || this.cfr_renamed_86.getDate().before(var12_16.getNextUpdate())) {
                                                var10_14 = true;
                                                v9 = new Object[3];
                                                v9[0] = new sprjxc(var12_16.getThisUpdate());
                                                v9[1] = new sprjxc(var12_16.getNextUpdate());
                                                v9[2] = new sprztc(var14_24);
                                                var15_27 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u0018?X<_>S\u0006W<_4u\u0002z"), v9);
                                                this.cfr_renamed_295((spryvc)var15_27, arg6);
                                                v10 = var11_15 = var12_16;
                                                break block50;
                                            }
                                            v11 = new Object[3];
                                            v11[0] = new sprjxc(var12_16.getThisUpdate());
                                            v11[1] = new sprjxc(var12_16.getNextUpdate());
                                            v11[2] = new sprztc(var14_24);
                                            var15_27 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"SbPeRiubJmPeXOn@"), v11);
                                            this.cfr_renamed_295((spryvc)var15_27, arg6);
                                        }
                                        catch (sprdna var14_25) {
                                            v7 = var13_18;
                                            this.cfr_renamed_295(var14_25.cfr_renamed_281(), arg6);
                                            continue;
                                        }
                                        continue block25;
                                    }
                                    break;
                                }
                            }
                            v10 = var11_15;
                        }
                        if (v10 == null) break block53;
                        if (!(arg3 == null || (var13_19 = arg3.getKeyUsage()) == null || var13_19.length >= 7 && var13_19[6])) {
                            var14_24 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u0018>Y\u0013D<e9Q>_>Q\u0000S\"[9B5R"));
                            throw new sprdna((spryvc)var14_24);
                        }
                        if (arg4 == null) {
                            var13_21 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u00183D<x?\u007f#E%S\"f%T<_3}5O"));
                            throw new sprdna(var13_21);
                        }
                        try {
                            var11_15.verify(arg4, "BC");
                        }
                        catch (Exception var13_20) {
                            var14_24 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012oN`jiNeZuzmU`Yh"));
                            throw new sprdna((spryvc)var14_24, (Throwable)var13_20);
                        }
                        var12_16 = var11_15.getRevokedCertificate(arg1.getSerialNumber());
                        if (var12_16 != null) {
                            var13_22 = null;
                            if (var12_16.hasExtensions()) {
                                try {
                                    var14_24 = sprune.cfr_renamed_23(sprtqa.cfr_renamed_292((X509Extension)var12_16, sprude.cfr_renamed_112.cfr_renamed_19()));
                                }
                                catch (sprakb var15_28) {
                                    var16_29 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012oN`ni]\u007fSbytHIN~S~"));
                                    throw new sprdna(var16_29, (Throwable)var15_28);
                                }
                                if (var14_24 != null) {
                                    var13_22 = sprtqa.cfr_renamed_102[var14_24.cfr_renamed_97().intValue()];
                                }
                            }
                            if (var13_22 == null) {
                                var13_22 = sprtqa.cfr_renamed_102[7];
                            }
                            var14_24 = new sprsxc("org.bouncycastle.x509.CertPathReviewerMessages", (String)var13_22);
                            if (!arg2.before(var12_16.getRevocationDate())) {
                                v12 = new Object[2];
                                v12[0] = new sprjxc(var12_16.getRevocationDate());
                                v12[1] = var14_24;
                                var15_27 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("\u0013S\"B\u0000W$^\u0002S&_5A5D~U5D$d5@?]5R"), v12);
                                throw new sprdna((spryvc)var15_27);
                            }
                            v13 = new Object[2];
                            v13[0] = new sprjxc(var12_16.getRevocationDate());
                            v13[1] = var14_24;
                            var15_27 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"NiJcWiXMZxY~jmPeXmHeSb"), v13);
                            v14 = var11_15;
                            this.cfr_renamed_295((spryvc)var15_27, arg6);
                        } else {
                            var13_22 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u0018>Y$d5@?]5R"));
                            v14 = var11_15;
                            this.cfr_renamed_295((spryvc)var13_22, arg6);
                        }
                        if (v14.getNextUpdate() != null && var11_15.getNextUpdate().before(this.cfr_renamed_86.getDate())) {
                            v15 = new Object[1];
                            v15[0] = new sprjxc(var11_15.getNextUpdate());
                            var13_22 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"_~PYLh]xYMJmU`]nPi"), v15);
                            this.cfr_renamed_295((spryvc)var13_22, arg6);
                        }
                        try {
                            var13_22 = sprtqa.cfr_renamed_292((X509Extension)var11_15, sprtqa.cfr_renamed_1);
                        }
                        catch (sprakb var14_26) {
                            var15_27 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("\u0013S\"B\u0000W$^\u0002S&_5A5D~R9E$D\u0000B\u0015N$s\"D?D"));
                            throw new sprdna((spryvc)var15_27);
                        }
                        {
                            var14_24 = sprtqa.cfr_renamed_292((X509Extension)var11_15, sprtqa.cfr_renamed_137);
                        }
                        if (var14_24 == null) break block54;
                        var15_27 = new sprgva();
                        try {
                            var15_27.addIssuerName(sprtqa.cfr_renamed_305((X509CRL)var11_15).getEncoded());
                        }
                        catch (IOException var16_30) {
                            var17_34 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u00183D<\u007f#E%S\"s(U5F$_?X"));
                            throw new sprdna(var17_34, (Throwable)var16_30);
                        }
                        var15_27.setMinCRLNumber(((sprooe)var14_24).cfr_renamed_162());
                        try {
                            var15_27.setMaxCRLNumber(((sprooe)sprtqa.cfr_renamed_292((X509Extension)var11_15, sprtqa.cfr_renamed_105)).cfr_renamed_162().subtract(BigInteger.valueOf(1L)));
                        }
                        catch (sprakb var16_31) {
                            var17_35 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"_~PB^~ytHIN~S~"));
                            throw new sprdna(var17_35, (Throwable)var16_31);
                        }
                        var16_32 = false;
                        try {
                            v16 = var17_36 = sprtqa.cfr_renamed_86.cfr_renamed_303((sprgva)var15_27, arg0).iterator();
                            if (true) ** GOTO lbl207
                        }
                        catch (sprakb var18_38) {
                            var19_40 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u00183D<s(B\"W3B9Y>s\"D?D"));
                            throw new sprdna(var19_40, (Throwable)var18_38);
                        }
                        while (true) {
                            v16 = var17_36;
lbl207:
                            // 2 sources

                            if (!v16.hasNext()) break block51;
                            var18_39 = (X509CRL)var17_36.next();
                            try {
                                var19_41 = sprtqa.cfr_renamed_292((X509Extension)var18_39, sprtqa.cfr_renamed_1);
                            }
                            catch (sprakb var20_42) {
                                var21_43 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012hU\u007fH~lxytHIN~S~"));
                                throw new sprdna(var21_43, (Throwable)var20_42);
                            }
                            if (var13_22 == null) {
                                if (var19_41 != null) continue;
                                v17 = var16_32 = true;
                                break block52;
                            }
                            if (var13_22.equals(var19_41)) break;
                        }
                        v17 = var16_32 = true;
                        break block52;
                    }
                    v17 = var16_32;
                }
                if (!v17) {
                    var18_39 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("\u0013S\"B\u0000W$^\u0002S&_5A5D~X?t1E5u\u0002z"));
                    throw new sprdna((spryvc)var18_39);
                }
            }
            if (var13_22 != null) {
                var15_27 = sprnge.cfr_renamed_23(var13_22);
                var16_33 = null;
                try {
                    var16_33 = sprwge.cfr_renamed_23(sprtqa.cfr_renamed_292(arg1, sprtqa.cfr_renamed_114));
                }
                catch (sprakb var17_37) {
                    var18_39 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012oN`~OytHIN~S~"));
                    throw new sprdna((spryvc)var18_39, (Throwable)var17_37);
                }
                if (var15_27.cfr_renamed_306() && var16_33 != null && var16_33.cfr_renamed_296()) {
                    var17_36 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("\u0013S\"B\u0000W$^\u0002S&_5A5D~U\"Z\u001fX<O\u0005E5D\u0013S\"B"));
                    throw new sprdna((spryvc)var17_36);
                }
                if (var15_27.cfr_renamed_307() && (var16_33 == null || !var16_33.cfr_renamed_296())) {
                    var17_36 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012oN`sbPu\u007fm\u007fiNx"));
                    throw new sprdna((spryvc)var17_36);
                }
                if (var15_27.cfr_renamed_308()) {
                    var17_36 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("\u0013S\"B\u0000W$^\u0002S&_5A5D~U\"Z\u001fX<O\u0011B$D\u0013S\"B"));
                    throw new sprdna((spryvc)var17_36);
                }
            }
        }
        if (!var10_14) {
            var13_23 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012bSZ]`Uh\u007f~PJSyRh"));
            throw new sprdna(var13_23);
        }
    }

    public Vector cfr_renamed_294(sprjae arg0) {
        Vector<String> vector = new Vector<String>();
        if (arg0 != null) {
            int n;
            sprmce[] sprmceArray = arg0.cfr_renamed_309();
            int n2 = n = 0;
            while (n2 < sprmceArray.length) {
                sprmee sprmee2;
                if (sprmceArray[n].cfr_renamed_310().equals(sprmce.cfr_renamed_1) && (sprmee2 = sprmceArray[n].cfr_renamed_311()).cfr_renamed_312() == 6) {
                    String string = ((sprcae)sprmee2.cfr_renamed_313()).cfr_renamed_314();
                    vector.add(string);
                }
                n2 = ++n;
            }
        }
        return vector;
    }

    public CertPath cfr_renamed_315() {
        return this.cfr_renamed_2;
    }

    public List[] cfr_renamed_316() {
        sprtqa sprtqa2 = this;
        sprtqa2.cfr_renamed_317();
        return sprtqa2.cfr_renamed_132;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_318() {
        List<PKIXCertPathChecker> list = this.cfr_renamed_86.getCertPathCheckers();
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
                spryvc spryvc2 = new spryvc(cfr_renamed_145, spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u00183S\"B\u0000W$^\u0013^5U;S\"s\"D?D"), objectArray);
                throw new sprdna(spryvc2, (Throwable)certPathValidatorException);
            }
            X509Certificate x509Certificate = null;
            for (int i = this.cfr_renamed_152.size() - 1; i >= 0; --i) {
                spryvc spryvc3;
                x509Certificate = (X509Certificate)this.cfr_renamed_152.get(i);
                Set<String> set = x509Certificate.getCriticalExtensionOIDs();
                if (set == null || set.isEmpty()) continue;
                Set<String> set2 = set;
                set2.remove(cfr_renamed_0);
                set.remove(cfr_renamed_152);
                set.remove(cfr_renamed_2);
                set.remove(cfr_renamed_93);
                set.remove(cfr_renamed_1);
                set.remove(cfr_renamed_137);
                set.remove(cfr_renamed_91);
                set.remove(cfr_renamed_114);
                set.remove(cfr_renamed_4);
                set.remove(cfr_renamed_96);
                if (set2.contains(cfr_renamed_119) && this.cfr_renamed_319(x509Certificate, i)) {
                    set.remove(cfr_renamed_119);
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
                        spryvc3 = new spryvc(cfr_renamed_145, sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"_~UxUo]`ytHiR\u007fUcRIN~S~"), objectArray);
                        throw new sprdna(spryvc3, certPathValidatorException.getCause(), this.cfr_renamed_2, i);
                    }
                }
                if (set.isEmpty()) continue;
                Object object = set.iterator();
                while (object.hasNext()) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = new sprtzd(spryvc3.next());
                    spryvc spryvc4 = new spryvc(cfr_renamed_145, spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u0018%X;X?A>u\"_$_3W<s(B"), objectArray);
                    object = spryvc3;
                    this.cfr_renamed_285(spryvc4, i);
                }
            }
            return;
        }
        catch (sprdna sprdna2) {
            this.cfr_renamed_285(sprdna2.cfr_renamed_281(), sprdna2.cfr_renamed_320());
        }
    }

    public PublicKey cfr_renamed_321() {
        sprtqa sprtqa2 = this;
        sprtqa2.cfr_renamed_317();
        return sprtqa2.cfr_renamed_272;
    }

    public Vector cfr_renamed_293(sprefe arg0) {
        Vector<String> vector = new Vector<String>();
        if (arg0 != null) {
            int n;
            spryke[] sprykeArray = arg0.cfr_renamed_322();
            int n2 = n = 0;
            while (n2 < sprykeArray.length) {
                sprtae sprtae2 = sprykeArray[n].cfr_renamed_323();
                if (sprtae2.cfr_renamed_324() == 0) {
                    int n3;
                    sprmee[] sprmeeArray = spryee.cfr_renamed_23(sprtae2.cfr_renamed_313()).cfr_renamed_289();
                    int n4 = n3 = 0;
                    while (n4 < sprmeeArray.length) {
                        if (sprmeeArray[n3].cfr_renamed_312() == 6) {
                            String string = ((sprcae)sprmeeArray[n3].cfr_renamed_313()).cfr_renamed_314();
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

    public sprtqa() {
    }

    public List cfr_renamed_325(int arg0) {
        sprtqa sprtqa2 = this;
        sprtqa2.cfr_renamed_317();
        return sprtqa2.cfr_renamed_79[arg0 + 1];
    }

    public void cfr_renamed_285(spryvc arg0, int arg1) {
        if (arg1 < -1 || arg1 >= this.cfr_renamed_31) {
            throw new IndexOutOfBoundsException();
        }
        this.cfr_renamed_132[arg1 + 1].add(arg0);
    }

    public List[] cfr_renamed_326() {
        sprtqa sprtqa2 = this;
        sprtqa2.cfr_renamed_317();
        return sprtqa2.cfr_renamed_79;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Collection cfr_renamed_278(X509Certificate arg0, Set arg1) throws sprdna {
        Object object;
        Object object2;
        Object object3;
        X509CertSelector x509CertSelector;
        Iterator iterator;
        ArrayList<Object> arrayList;
        block6: {
            arrayList = new ArrayList<Object>();
            iterator = arg1.iterator();
            x509CertSelector = new X509CertSelector();
            try {
                x509CertSelector.setSubject(sprtqa.cfr_renamed_302(arg0).getEncoded());
                object3 = arg0.getExtensionValue(sprude.cfr_renamed_287.cfr_renamed_19());
                if (object3 == null) break block6;
                object2 = (sprxue)sprvva.cfr_renamed_184((byte[])object3);
                object = sprxqa.cfr_renamed_23(sprvva.cfr_renamed_184(((sprxue)object2).cfr_renamed_186()));
                sprxqa sprxqa2 = object;
                x509CertSelector.setSerialNumber(sprxqa2.cfr_renamed_290());
                byte[] byArray = sprxqa2.cfr_renamed_327();
                if (byArray != null) {
                    x509CertSelector.setSubjectKeyIdentifier(new sprlqe(byArray).cfr_renamed_91());
                }
            }
            catch (IOException iOException) {
                spryvc spryvc2 = new spryvc(cfr_renamed_145, sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"H~I\u007fHMRoTcNEO\u007fIiNIN~S~"));
                throw new sprdna(spryvc2);
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
            if (((TrustAnchor)object3).getCAName() == null || ((TrustAnchor)object3).getCAPublicKey() == null || !((X500Principal)(object2 = sprtqa.cfr_renamed_302(arg0))).equals(object = new X500Principal(((TrustAnchor)object3).getCAName()))) continue;
            arrayList.add(object3);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ X509CRL cfr_renamed_304(String arg0) throws sprdna {
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
            return (X509CRL)CertificateFactory.getInstance(spramb.cfr_renamed_9("n~\u0003`\u000f"), "BC").generateCRL(httpURLConnection.getInputStream());
        }
        catch (Exception exception) {
            Object[] objectArray = new Object[4];
            objectArray[0] = new sprhzc(arg0);
            objectArray[1] = exception.getMessage();
            objectArray[2] = exception;
            objectArray[3] = exception.getClass().getName();
            spryvc spryvc2 = new spryvc(cfr_renamed_145, sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012`SmXON`xeOxlcUbHIN~S~"), objectArray);
            throw new sprdna(spryvc2);
        }
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_328() {
        v0 = this;
        var1_1 = v0.cfr_renamed_86.getInitialPolicies();
        var2_2 = new ArrayList[v0.cfr_renamed_31 + 1];
        v1 = var3_3 = 0;
        while (v1 < var2_2.length) {
            var2_2[var3_3++] = new ArrayList<E>();
            v1 = var3_3;
        }
        var3_4 = new HashSet<String>();
        var3_4.add("2.5.29.32.0");
        var4_5 = new sprkpb(new ArrayList<E>(), 0, var3_4, null, new HashSet<E>(), "2.5.29.32.0", false);
        var2_2[0].add(var4_5);
        if (this.cfr_renamed_86.isExplicitPolicyRequired()) {
            var5_6 = 0;
            v2 = this;
        } else {
            v3 = this;
            v2 = v3;
            var5_6 = v3.cfr_renamed_31 + 1;
        }
        if (v2.cfr_renamed_86.isAnyPolicyInhibited()) {
            var6_7 = 0;
            v4 = this;
        } else {
            v5 = this;
            v4 = v5;
            var6_7 = v5.cfr_renamed_31 + 1;
        }
        var7_8 = v4.cfr_renamed_86.isPolicyMappingInhibited() != false ? 0 : this.cfr_renamed_31 + 1;
        var8_9 = null;
        var9_10 = null;
        try {
            block98: {
                v6 = var10_11 = this.cfr_renamed_152.size() - 1;
                while (v6 >= 0) {
                    v7 = this;
                    var11_12 = v7.cfr_renamed_31 - var10_11;
                    var9_10 = (X509Certificate)v7.cfr_renamed_152.get(var10_11);
                    try {
                        var12_13 = (sprbne)sprtqa.cfr_renamed_292(var9_10, (String)sprtqa.cfr_renamed_152);
                    }
                    catch (sprakb var13_17) {
                        var14_18 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u0018 Y<_3O\u0015N$s\"D?D"));
                        throw new sprdna((spryvc)var14_18, (Throwable)var13_17, this.cfr_renamed_2, var10_11);
                    }
                    if (var12_13 != null && var4_5 != null) {
                        var13_16 = var12_13.cfr_renamed_329();
                        var14_18 = new HashSet<E>();
                        while (var13_16.hasMoreElements()) {
                            var15_26 = spriae.cfr_renamed_23(var13_16.nextElement());
                            var16_43 = var15_26.cfr_renamed_330();
                            var14_18.add(var16_43.cfr_renamed_19());
                            if ("2.5.29.32.0".equals(var16_43.cfr_renamed_19())) continue;
                            try {
                                var17_54 /* !! */  = sprtqa.cfr_renamed_331(var15_26.cfr_renamed_332());
                            }
                            catch (CertPathValidatorException var18_66) {
                                var19_78 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"LcPe_umy]`UjUiNIN~S~"));
                                throw new sprdna((spryvc)var19_78, (Throwable)var18_66, this.cfr_renamed_2, var10_11);
                            }
                            var18_67 = sprtqa.cfr_renamed_333(var11_12, var2_2, (sprtzd)var16_43, var17_54 /* !! */ );
                            if (var18_67 != 0) continue;
                            sprtqa.cfr_renamed_334(var11_12, var2_2, (sprtzd)var16_43, var17_54 /* !! */ );
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
                        if (v8 > 0 || var11_12 < this.cfr_renamed_31 && sprtqa.cfr_renamed_286(var9_10)) {
                            var13_16 = var12_13.cfr_renamed_329();
                            while (var13_16.hasMoreElements()) {
                                var15_26 = spriae.cfr_renamed_23(var13_16.nextElement());
                                if (!"2.5.29.32.0".equals(var15_26.cfr_renamed_330().cfr_renamed_19())) continue;
                                try {
                                    var16_43 = sprtqa.cfr_renamed_331(var15_26.cfr_renamed_332());
                                }
                                catch (CertPathValidatorException var17_55) {
                                    var18_68 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u0018 Y<_3O\u0001C1Z9P9S\"s\"D?D"));
                                    throw new sprdna(var18_68, (Throwable)var17_55, this.cfr_renamed_2, var10_11);
                                }
                                var17_54 /* !! */  = var2_2[var11_12 - 1];
                                v9 = var18_67 = 0;
                                while (v9 < var17_54 /* !! */ .size()) {
                                    var19_78 = (sprkpb)var17_54 /* !! */ .get(var18_67);
                                    var20_81 = var19_78.getExpectedPolicies().iterator();
                                    while (var20_81.hasNext()) {
                                        v10 /* !! */  = var21_82 /* !! */  = var20_81.next();
                                        if (var21_82 /* !! */  instanceof String) {
                                            var22_83 = (String)v10 /* !! */ ;
                                        } else {
                                            if (!(v10 /* !! */  instanceof sprtzd)) continue;
                                            var22_83 = ((sprtzd)var21_82 /* !! */ ).cfr_renamed_19();
                                        }
                                        var23_84 = false;
                                        var24_85 = var19_78.getChildren();
                                        while (var24_85.hasNext()) {
                                            var25_86 = (sprkpb)var24_85.next();
                                            if (!var22_83.equals(var25_86.getValidPolicy())) continue;
                                            var23_84 = true;
                                        }
                                        if (var23_84) continue;
                                        var25_86 = new HashSet<String>();
                                        var25_86.add(var22_83);
                                        var26_87 = new sprkpb(new ArrayList<E>(), var11_12, (Set)var25_86, (PolicyNode)var19_78, (Set)var16_43, var22_83, false);
                                        var19_78.cfr_renamed_335(var26_87);
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
                            while (v12 < var16_43.size() && ((var18_69 = (sprkpb)var16_43.get(var17_56)).cfr_renamed_336() || (var4_5 = sprtqa.cfr_renamed_337((sprkpb)var4_5, var2_2, var18_69)) != null)) {
                                v12 = ++var17_56;
                            }
                            v11 = --var15_27;
                        }
                        var15_28 = var9_10.getCriticalExtensionOIDs();
                        if (var15_28 != null) {
                            var16_44 = var15_28.contains(sprtqa.cfr_renamed_152);
                            var17_57 = var2_2[var11_12];
                            v13 = var18_70 = 0;
                            while (v13 < var17_57.size()) {
                                v14 = (sprkpb)var17_57.get(var18_70);
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
                        var13_16 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012bSZ]`UhlcPe_uh~Yi"));
                        throw new sprdna((spryvc)var13_16);
                    }
                    if (var11_12 != this.cfr_renamed_31) {
                        try {
                            var13_16 = sprtqa.cfr_renamed_292(var9_10, (String)sprtqa.cfr_renamed_2);
                        }
                        catch (sprakb var14_19) {
                            var15_29 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("\u0013S\"B\u0000W$^\u0002S&_5A5D~F?Z9U){1F\u0015N$s\"D?D"));
                            throw new sprdna(var15_29, (Throwable)var14_19, this.cfr_renamed_2, var10_11);
                        }
                        if (var13_16 != null) {
                            var14_18 = (sprbne)var13_16;
                            v15 = var15_30 = 0;
                            while (v15 < var14_18.cfr_renamed_84()) {
                                var16_45 = (sprbne)var14_18.cfr_renamed_85(var15_30);
                                var17_58 = (sprtzd)var16_45.cfr_renamed_85(0);
                                var18_71 = (sprtzd)var16_45.cfr_renamed_85(1);
                                if ("2.5.29.32.0".equals(var17_58.cfr_renamed_19())) {
                                    var19_78 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"UbJmPeX\\S`UoEA]|LeRk"));
                                    throw new sprdna((spryvc)var19_78, this.cfr_renamed_2, var10_11);
                                }
                                if ("2.5.29.32.0".equals(var18_71.cfr_renamed_19())) {
                                    var19_78 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u00189X&W<_4f?Z9U){1F _>Q"));
                                    throw new sprdna((spryvc)var19_78, this.cfr_renamed_2, var10_11);
                                }
                                v15 = ++var15_30;
                            }
                        }
                        if (var13_16 != null) {
                            var14_18 = (sprbne)var13_16;
                            var15_31 = new HashMap<Object, HashSet<E>>();
                            var16_46 = new HashSet<Object>();
                            v16 = var17_59 = 0;
                            while (v16 < var14_18.cfr_renamed_84()) {
                                var18_72 = (sprbne)var14_18.cfr_renamed_85(var17_59);
                                var19_78 = ((sprtzd)var18_72.cfr_renamed_85(0)).cfr_renamed_19();
                                var20_81 = ((sprtzd)var18_72.cfr_renamed_85(1)).cfr_renamed_19();
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
                                        sprtqa.cfr_renamed_339(var11_12, var2_2, var18_73, var15_31, var9_10);
                                        continue;
                                    }
                                    catch (sprakb var19_79) {
                                        var20_81 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"LcPe_uytHIN~S~"));
                                        throw new sprdna((spryvc)var20_81, (Throwable)var19_79, this.cfr_renamed_2, var10_11);
                                    }
                                    catch (CertPathValidatorException var19_80) {
                                        var20_81 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u0018 Y<_3O\u0001C1Z9P9S\"s\"D?D"));
                                        throw new sprdna((spryvc)var20_81, (Throwable)var19_80, this.cfr_renamed_2, var10_11);
                                    }
                                }
                                if (var7_8 > 0) continue;
                                var4_5 = sprtqa.cfr_renamed_340(var11_12, var2_2, var18_73, (sprkpb)var4_5);
                            }
                        }
                        if (!sprtqa.cfr_renamed_286(var9_10)) {
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
                            var14_18 = (sprbne)sprtqa.cfr_renamed_292(var9_10, sprtqa.cfr_renamed_91);
                            if (var14_18 != null) {
                                var15_32 = var14_18.cfr_renamed_329();
                                while (var15_32.hasMoreElements()) {
                                    var16_47 = (spryte)var15_32.nextElement();
                                    switch (var16_47.cfr_renamed_312()) {
                                        case 0: {
                                            while (false) {
                                            }
                                            var17_61 = sprooe.cfr_renamed_341(var16_47, false).cfr_renamed_97().intValue();
                                            if (var17_61 >= var5_6) break;
                                            var5_6 = var17_61;
                                            break;
                                        }
                                        case 1: {
                                            var17_61 = sprooe.cfr_renamed_341(var16_47, false).cfr_renamed_97().intValue();
                                            if (var17_61 >= var7_8) break;
                                            var7_8 = var17_61;
                                        }
                                    }
                                }
                            }
                        }
                        catch (sprakb var14_20) {
                            var15_33 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012|S`UoEOSbOxytHIN~S~"));
                            throw new sprdna(var15_33, this.cfr_renamed_2, var10_11);
                        }
                        try {
                            var14_18 = (sprooe)sprtqa.cfr_renamed_292(var9_10, (String)sprtqa.cfr_renamed_93);
                            if (var14_18 != null && (var15_34 = var14_18.cfr_renamed_97().intValue()) < var6_7) {
                                var6_7 = var15_34;
                            }
                        }
                        catch (sprakb var14_21) {
                            var15_35 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("\u0013S\"B\u0000W$^\u0002S&_5A5D~F?Z9U)\u007f>^9T9B\u0015N$s\"D?D"));
                            throw new sprdna(var15_35, this.cfr_renamed_2, var10_11);
                        }
                    }
                    v6 = --var10_11;
                }
                if (!sprtqa.cfr_renamed_286(var9_10) && var5_6 > 0) {
                    --var5_6;
                }
                try {
                    var12_13 = (sprbne)sprtqa.cfr_renamed_292(var9_10, sprtqa.cfr_renamed_91);
                    if (var12_13 == null) break block98;
                    var13_16 = var12_13.cfr_renamed_329();
                    while (var13_16.hasMoreElements()) {
                        var14_18 = (spryte)var13_16.nextElement();
                        switch (var14_18.cfr_renamed_312()) lbl-1000:
                        // 2 sources

                        {
                            case 0: {
                                if (false) ** GOTO lbl-1000
                                var15_36 = sprooe.cfr_renamed_341(var14_18, false).cfr_renamed_97().intValue();
                                if (var15_36 != 0) break;
                                var5_6 = 0;
                            }
                        }
                    }
                }
                catch (sprakb var12_14) {
                    var13_16 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012|S`UoEOSbOxytHIN~S~"));
                    throw new sprdna((spryvc)var13_16, this.cfr_renamed_2, var10_11);
                }
            }
            if (var4_5 == null) {
                if (this.cfr_renamed_86.isExplicitPolicyRequired()) {
                    var13_16 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u00185N Z9U9B\u0000Y<_3O"));
                    throw new sprdna((spryvc)var13_16, this.cfr_renamed_2, var10_11);
                }
                var12_13 = null;
                v17 = var5_6;
            } else if (sprtqa.cfr_renamed_342(var1_1)) {
                if (this.cfr_renamed_86.isExplicitPolicyRequired()) {
                    if (var8_9.isEmpty()) {
                        var13_16 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"YtL`UoUxlcPe_u"));
                        throw new sprdna((spryvc)var13_16, this.cfr_renamed_2, var10_11);
                    }
                    var13_16 = new HashSet<E>();
                    v18 = var14_22 = 0;
                    while (v18 < var2_2.length) {
                        var15_37 = var2_2[var14_22];
                        v19 = var16_48 = 0;
                        while (v19 < var15_37.size()) {
                            var17_62 = (sprkpb)var15_37.get(var16_48);
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
                        var15_38 = (sprkpb)var14_23.next();
                        var16_49 = var15_38.getValidPolicy();
                        if (var8_9.contains(var16_49)) continue;
                    }
                    if (var4_5 != null) {
                        v22 = var15_39 = this.cfr_renamed_31 - 1;
                        while (v22 >= 0) {
                            var16_50 = var2_2[var15_39];
                            v23 = var17_63 = 0;
                            while (v23 < var16_50.size()) {
                                var18_75 = (sprkpb)var16_50.get(var17_63);
                                if (!var18_75.cfr_renamed_336()) {
                                    var4_5 = sprtqa.cfr_renamed_337((sprkpb)var4_5, var2_2, var18_75);
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
                        var17_64 = (sprkpb)var15_40.get(var16_51);
                        if ("2.5.29.32.0".equals(var17_64.getValidPolicy())) {
                            var18_76 = var17_64.getChildren();
                            while (var18_76.hasNext()) {
                                var19_78 = (sprkpb)var18_76.next();
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
                    var15_41 = (sprkpb)var14_25.next();
                    var16_52 = var15_41.getValidPolicy();
                    if (var1_1.contains(var16_52)) continue;
                    var4_5 = sprtqa.cfr_renamed_337((sprkpb)var4_5, var2_2, var15_41);
                }
                if (var4_5 != null) {
                    v26 = var15_42 = this.cfr_renamed_31 - 1;
                    while (v26 >= 0) {
                        var16_53 = var2_2[var15_42];
                        v27 = var17_65 = 0;
                        while (v27 < var16_53.size()) {
                            var18_77 = (sprkpb)var16_53.get(var17_65);
                            if (!var18_77.cfr_renamed_336()) {
                                var4_5 = sprtqa.cfr_renamed_337((sprkpb)var4_5, var2_2, var18_77);
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
                var13_16 = new spryvc("org.bouncycastle.x509.CertPathReviewerMessages", spramb.cfr_renamed_9("\u0013S\"B\u0000W$^\u0002S&_5A5D~_>@1Z9R\u0000Y<_3O"));
                throw new sprdna((spryvc)var13_16);
            }
            var4_5 = var12_13;
            return;
        }
        catch (sprdna var12_15) {
            this.cfr_renamed_285(var12_15.cfr_renamed_281(), var12_15.cfr_renamed_320());
            var4_5 = null;
            return;
        }
    }

    static {
        cfr_renamed_119 = sprude.spr\ufe34.cfr_renamed_19();
        cfr_renamed_112 = sprude.cfr_renamed_93.cfr_renamed_19();
        cfr_renamed_102 = sprude.cfr_renamed_1.cfr_renamed_19();
    }

    public boolean cfr_renamed_176() {
        int n;
        this.cfr_renamed_317();
        boolean bl = true;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_132.length) {
            if (!this.cfr_renamed_132[n].isEmpty()) {
                bl = false;
                return false;
            }
            n2 = ++n;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_343() {
        X509Certificate x509Certificate = null;
        sprkmb sprkmb2 = new sprkmb();
        try {
            for (int i = this.cfr_renamed_152.size() - 1; i > 0; --i) {
                int n;
                Object object;
                sprbfe[] sprbfeArray;
                Object object2;
                Object object3;
                sprtqa sprtqa2 = this;
                int n2 = sprtqa2.cfr_renamed_31 - i;
                x509Certificate = (X509Certificate)sprtqa2.cfr_renamed_152.get(i);
                if (!sprtqa.cfr_renamed_286(x509Certificate)) {
                    object3 = sprtqa.cfr_renamed_282(x509Certificate);
                    object2 = new sprgle(new ByteArrayInputStream(((X500Principal)object3).getEncoded()));
                    try {
                        sprbfeArray = (sprbne)((sprgle)object2).cfr_renamed_24();
                    }
                    catch (IOException iOException) {
                        Object[] objectArray = new Object[1];
                        objectArray[0] = new sprhzc(object3);
                        spryvc spryvc2 = new spryvc(cfr_renamed_145, sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"Rooy^fYoHB]aYIN~S~"), objectArray);
                        throw new sprdna(spryvc2, (Throwable)iOException, this.cfr_renamed_2, i);
                    }
                    {
                        sprkmb2.cfr_renamed_344((sprbne)sprbfeArray);
                    }
                    {
                        sprkmb2.cfr_renamed_345((sprbne)sprbfeArray);
                    }
                    {
                        object = (sprbne)sprtqa.cfr_renamed_292(x509Certificate, (String)((Object)cfr_renamed_4));
                    }
                    if (object != null) {
                        int n3 = n = 0;
                        while (n3 < ((sprbne)object).cfr_renamed_84()) {
                            sprmee sprmee2 = sprmee.cfr_renamed_23(((sprbne)object).cfr_renamed_85(n));
                            try {
                                sprkmb sprkmb3 = sprkmb2;
                                sprmee sprmee3 = sprmee2;
                                sprkmb3.cfr_renamed_346(sprmee3);
                                sprkmb3.cfr_renamed_347(sprmee3);
                            }
                            catch (sprzrb sprzrb2) {
                                Object[] objectArray = new Object[1];
                                objectArray[0] = new sprhzc(sprmee2);
                                spryvc spryvc3 = new spryvc(cfr_renamed_145, sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012bSxliNaUxHiXIQmU`"), objectArray);
                                throw new sprdna(spryvc3, (Throwable)sprzrb2, this.cfr_renamed_2, i);
                            }
                            n3 = ++n;
                        }
                    }
                }
                try {
                    object3 = (sprbne)sprtqa.cfr_renamed_292(x509Certificate, cfr_renamed_96);
                }
                catch (sprakb sprakb2) {
                    sprbfeArray = new spryvc(cfr_renamed_145, spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u0018>U\u0015N$s\"D?D"));
                    throw new sprdna((spryvc)sprbfeArray, (Throwable)sprakb2, this.cfr_renamed_2, i);
                }
                if (object3 == null) continue;
                object2 = sprlhe.cfr_renamed_23(object3);
                sprbfeArray = ((sprlhe)object2).cfr_renamed_348();
                if (sprbfeArray != null) {
                    sprkmb2.cfr_renamed_349(sprbfeArray);
                }
                if ((object = ((sprlhe)object2).cfr_renamed_350()) == null) continue;
                int n4 = n = 0;
                while (n4 != ((sprbfe[])object).length) {
                    sprkmb2.cfr_renamed_351(object[n++]);
                    n4 = n;
                }
            }
            return;
        }
        catch (sprdna sprdna2) {
            this.cfr_renamed_285(sprdna2.cfr_renamed_281(), sprdna2.cfr_renamed_320());
        }
    }

    public TrustAnchor cfr_renamed_352() {
        sprtqa sprtqa2 = this;
        sprtqa2.cfr_renamed_317();
        return sprtqa2.cfr_renamed_93;
    }

    public void cfr_renamed_295(spryvc arg0, int arg1) {
        if (arg1 < -1 || arg1 >= this.cfr_renamed_31) {
            throw new IndexOutOfBoundsException();
        }
        this.cfr_renamed_79[arg1 + 1].add(arg0);
    }

    public void cfr_renamed_317() {
        if (!this.cfr_renamed_3) {
            throw new IllegalStateException(sprdgb.cfr_renamed_9("snVi_x\u001cbSx\u001ceReHe]`UvYh\u0012,\u007fmP`\u001ceReH$\u0015,ZeN\u007fH\""));
        }
        if (this.cfr_renamed_79 == null) {
            int n;
            this.cfr_renamed_79 = new List[this.cfr_renamed_31 + 1];
            this.cfr_renamed_132 = new List[this.cfr_renamed_31 + 1];
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_79.length) {
                sprtqa sprtqa2 = this;
                sprtqa2.cfr_renamed_79[n] = new ArrayList();
                sprtqa2.cfr_renamed_132[n++] = new ArrayList();
                n2 = n;
            }
            sprtqa sprtqa3 = this;
            sprtqa3.cfr_renamed_276();
            sprtqa3.cfr_renamed_343();
            sprtqa3.cfr_renamed_298();
            sprtqa3.cfr_renamed_328();
            sprtqa3.cfr_renamed_318();
        }
    }

    public List cfr_renamed_353(int arg0) {
        sprtqa sprtqa2 = this;
        sprtqa2.cfr_renamed_317();
        return sprtqa2.cfr_renamed_132[arg0 + 1];
    }

    public PolicyNode cfr_renamed_354() {
        sprtqa sprtqa2 = this;
        sprtqa2.cfr_renamed_317();
        return sprtqa2.cfr_renamed_107;
    }

    /*
     * WARNING - void declaration
     */
    public sprtqa(CertPath certPath, PKIXParameters pKIXParameters) throws sprdna {
        void arg1;
        sprtqa sprtqa2 = this;
        sprtqa2.cfr_renamed_355(certPath, (PKIXParameters)arg1);
    }

    private /* synthetic */ boolean cfr_renamed_319(X509Certificate arg0, int arg1) {
        try {
            int n;
            boolean bl = false;
            sprbne sprbne2 = (sprbne)sprtqa.cfr_renamed_292(arg0, cfr_renamed_119);
            int n2 = n = 0;
            while (n2 < sprbne2.cfr_renamed_84()) {
                Object object;
                spriee spriee2 = spriee.cfr_renamed_23(sprbne2.cfr_renamed_85(n));
                if (spriee.cfr_renamed_1.equals(spriee2.cfr_renamed_356())) {
                    object = new spryvc(cfr_renamed_145, spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u0018\u0001U\u0015C\u0013Y=F<_1X3S"));
                    this.cfr_renamed_295((spryvc)object, arg1);
                } else if (!spriee.cfr_renamed_91.equals(spriee2.cfr_renamed_356())) {
                    if (spriee.cfr_renamed_2.equals(spriee2.cfr_renamed_356())) {
                        object = new spryvc(cfr_renamed_145, sprdgb.cfr_renamed_9("OY~H\\]xT^YzUiKiN\"moo_\u007fH"));
                        this.cfr_renamed_295((spryvc)object, arg1);
                    } else if (spriee.cfr_renamed_4.equals(spriee2.cfr_renamed_356())) {
                        sprtqa sprtqa2;
                        spryvc spryvc2;
                        spryvc spryvc3;
                        object = sprree.cfr_renamed_23(spriee2.cfr_renamed_357());
                        sprvje sprvje2 = ((sprree)object).cfr_renamed_358();
                        double d = ((sprree)object).cfr_renamed_359().doubleValue() * Math.pow(10.0, ((sprree)object).cfr_renamed_360().doubleValue());
                        if (((sprree)object).cfr_renamed_358().cfr_renamed_361()) {
                            Object[] objectArray = new Object[3];
                            objectArray[0] = ((sprree)object).cfr_renamed_358().cfr_renamed_362();
                            objectArray[1] = new sprjxc(new Double(d));
                            objectArray[2] = object;
                            spryvc3 = new spryvc(cfr_renamed_145, spramb.cfr_renamed_9("\u0013S\"B\u0000W$^\u0002S&_5A5D~g3z9[9B\u0006W<C5w<F8W"), objectArray);
                            spryvc2 = spryvc3;
                            sprtqa2 = this;
                        } else {
                            Object[] objectArray = new Object[3];
                            objectArray[0] = spriwa.cfr_renamed_279(((sprree)object).cfr_renamed_358().cfr_renamed_363());
                            objectArray[1] = new sprjxc(new Double(d));
                            objectArray[2] = object;
                            spryvc3 = new spryvc(cfr_renamed_145, sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012]_@UaUxjmPyYBIa"), objectArray);
                            spryvc2 = spryvc3;
                            sprtqa2 = this;
                        }
                        sprtqa2.cfr_renamed_295(spryvc2, arg1);
                    } else {
                        Object[] objectArray = new Object[2];
                        objectArray[0] = spriee2.cfr_renamed_356();
                        objectArray[1] = new sprhzc(spriee2);
                        object = new spryvc(cfr_renamed_145, spramb.cfr_renamed_9("u5D$f1B8d5@9S'S\"\u0018\u0001U\u0005X;X?A>e$W$S=S>B"), objectArray);
                        this.cfr_renamed_295((spryvc)object, arg1);
                        bl = true;
                    }
                }
                n2 = ++n;
            }
            return !bl;
        }
        catch (sprakb sprakb2) {
            spryvc spryvc4 = new spryvc(cfr_renamed_145, sprdgb.cfr_renamed_9("\u007fiNxlmHdniJeY{Y~\u0012]__HmHiQiRxytHIN~S~"));
            this.cfr_renamed_285(spryvc4, arg1);
            return false;
        }
    }

    public void cfr_renamed_355(CertPath arg0, PKIXParameters arg1) throws sprdna {
        if (this.cfr_renamed_3) {
            throw new IllegalStateException(spramb.cfr_renamed_9("?T:S3Bp_#\u00161Z\"S1R)\u00169X9B9W<_*S4\u0017"));
        }
        this.cfr_renamed_3 = true;
        if (arg0 == null) {
            throw new NullPointerException(sprdgb.cfr_renamed_9("oY~H\\]xT,KmO,RyP`"));
        }
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_152 = arg0.getCertificates();
        this.cfr_renamed_31 = this.cfr_renamed_152.size();
        if (this.cfr_renamed_152.isEmpty()) {
            throw new sprdna(new spryvc(cfr_renamed_145, spramb.cfr_renamed_9("\u0013S\"B\u0000W$^\u0002S&_5A5D~S=F$O\u0013S\"B\u0000W$^")));
        }
        this.cfr_renamed_86 = (PKIXParameters)arg1.clone();
        sprtqa sprtqa2 = this;
        sprtqa sprtqa3 = this;
        this.cfr_renamed_4 = sprtqa.cfr_renamed_364(this.cfr_renamed_86);
        this.cfr_renamed_79 = null;
        sprtqa3.cfr_renamed_132 = null;
        sprtqa3.cfr_renamed_93 = null;
        sprtqa2.cfr_renamed_272 = null;
        sprtqa2.cfr_renamed_107 = null;
    }
}

