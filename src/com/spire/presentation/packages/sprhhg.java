/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprcog;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprepg;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprhmg;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprmve;
import com.spire.presentation.packages.sprow;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprpzh;
import com.spire.presentation.packages.sprrsm;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprrvy;
import com.spire.presentation.packages.sprrxj;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprufba;
import com.spire.presentation.packages.sprutj;
import com.spire.presentation.packages.sprvng;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.spryng;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sprhhg {
    private AlgorithmParameterSpec cfr_renamed_91;
    private final String cfr_renamed_0;
    private sprddm cfr_renamed_1;
    private static final Set cfr_renamed_2 = new HashSet();
    private SecureRandom cfr_renamed_3;
    private sprvng cfr_renamed_4;

    private /* synthetic */ sprcf cfr_renamed_7465(sprutj arg0) throws sprhjg {
        try {
            int n;
            int n2;
            List<PrivateKey> list = arg0.cfr_renamed_7466();
            sprszm sprszm2 = sprszm.cfr_renamed_23(this.cfr_renamed_1.cfr_renamed_284());
            Signature[] signatureArray = new Signature[sprszm2.cfr_renamed_84()];
            int n3 = n2 = 0;
            while (n3 != sprszm2.cfr_renamed_84()) {
                sprhhg sprhhg2 = this;
                signatureArray[n2] = sprhhg2.cfr_renamed_4.cfr_renamed_7442(sprddm.cfr_renamed_23(sprszm2.cfr_renamed_85(n2)));
                if (sprhhg2.cfr_renamed_3 != null) {
                    signatureArray[n2].initSign(list.get(n2), this.cfr_renamed_3);
                } else {
                    signatureArray[n2].initSign(list.get(n2));
                }
                n3 = ++n2;
            }
            OutputStream outputStream = sprrxj.cfr_renamed_7467(signatureArray[0]);
            int n4 = n = 1;
            while (n4 != signatureArray.length) {
                Signature signature = signatureArray[n];
                outputStream = new sprmve(outputStream, sprrxj.cfr_renamed_7467(signature));
                n4 = ++n;
            }
            OutputStream outputStream2 = outputStream;
            return new sprepg(this, outputStream2, signatureArray);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprhjg(new StringBuilder().insert(0, sprufba.cfr_renamed_9("a'l(m2\"%p#c2gfq/e(g48f")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }

    public sprhhg(String string) {
        sprhhg sprhhg2 = this;
        this.cfr_renamed_4 = new sprvng(new sprrul());
        this.cfr_renamed_0 = string;
    }

    public sprhhg cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    private static /* synthetic */ sprszm cfr_renamed_7468(sprpzh arg0) {
        int n;
        sprhmg sprhmg2 = new sprhmg();
        sprrvm sprrvm2 = new sprrvm();
        sprpzh sprpzh2 = arg0;
        List<String> list = sprpzh2.cfr_renamed_7469();
        List<AlgorithmParameterSpec> list2 = sprpzh2.cfr_renamed_7470();
        int n2 = n = 0;
        while (n2 != list.size()) {
            AlgorithmParameterSpec algorithmParameterSpec = list2.get(n);
            if (algorithmParameterSpec == null) {
                sprrvm2.cfr_renamed_5004(sprhmg2.cfr_renamed_1494(list.get(n)));
            } else if (algorithmParameterSpec instanceof PSSParameterSpec) {
                sprrvm2.cfr_renamed_5004(sprhhg.cfr_renamed_7471((PSSParameterSpec)algorithmParameterSpec));
            } else {
                throw new IllegalArgumentException(sprrvy.cfr_renamed_9("g|`wq}u|{hwv2bs`s\u007fwfw`Abwq"));
            }
            n2 = ++n;
        }
        return new sprcen(sprrvm2);
    }

    static {
        cfr_renamed_2.add(sprufba.cfr_renamed_9("\u0002K\nK\u0012J\u000fW\u000b"));
        cfr_renamed_2.add(sprrvy.cfr_renamed_9("ABZ[\\QA9"));
        cfr_renamed_2.add(sprufba.cfr_renamed_9("\u0015R\u000eK\bA\u0015R*w5"));
    }

    /*
     * WARNING - void declaration
     */
    public sprhhg(String string, AlgorithmParameterSpec algorithmParameterSpec) {
        void arg1;
        void arg0;
        sprhhg sprhhg2 = this;
        this.cfr_renamed_4 = new sprvng(new sprrul());
        this.cfr_renamed_0 = arg0;
        if (algorithmParameterSpec instanceof PSSParameterSpec) {
            PSSParameterSpec pSSParameterSpec = (PSSParameterSpec)arg1;
            sprhhg sprhhg3 = this;
            sprhhg3.cfr_renamed_91 = pSSParameterSpec;
            sprhhg3.cfr_renamed_1 = new sprddm(sprdl.cfr_renamed_3250, sprhhg.cfr_renamed_7471(pSSParameterSpec));
            return;
        }
        if (arg1 instanceof sprpzh) {
            sprpzh sprpzh2 = (sprpzh)arg1;
            sprhhg sprhhg4 = this;
            sprhhg4.cfr_renamed_91 = sprpzh2;
            sprhhg4.cfr_renamed_1 = new sprddm(sprow.cfr_renamed_272, sprhhg.cfr_renamed_7468(sprpzh2));
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprrvy.cfr_renamed_9("g|y|}e|2a{uBs`s\u007fAbwq(2")).append(arg1 == null ? "null" : arg1.getClass().getName()).toString());
    }

    public static /* synthetic */ sprddm cfr_renamed_7472(sprhhg arg0) {
        return arg0.cfr_renamed_1;
    }

    private static /* synthetic */ sprrsm cfr_renamed_7471(PSSParameterSpec arg0) {
        sprddm sprddm2;
        sprcog sprcog2 = new sprcog();
        sprddm sprddm3 = sprcog2.cfr_renamed_1494(arg0.getDigestAlgorithm());
        if (sprddm3.cfr_renamed_284() == null) {
            sprddm3 = new sprddm(sprddm3.cfr_renamed_593(), sprpen.cfr_renamed_4);
        }
        if ((sprddm2 = sprcog2.cfr_renamed_1494(((MGF1ParameterSpec)arg0.getMGFParameters()).getDigestAlgorithm())).cfr_renamed_284() == null) {
            sprddm2 = new sprddm(sprddm2.cfr_renamed_593(), sprpen.cfr_renamed_4);
        }
        return new sprrsm(sprddm3, new sprddm(sprdl.cfr_renamed_135, sprddm2), new sprktm(arg0.getSaltLength()), new sprktm(arg0.getTrailerField()));
    }

    /*
     * Unable to fully structure code
     */
    public sprcf cfr_renamed_1568(PrivateKey arg0) throws sprhjg {
        if (arg0 instanceof sprutj) {
            return this.cfr_renamed_7465((sprutj)arg0);
        }
        try {
            if (this.cfr_renamed_91 != null) ** GOTO lbl12
            if (sprhhg.cfr_renamed_2.contains(sprkoe.cfr_renamed_116(this.cfr_renamed_0))) {
                v0 = this;
                this.cfr_renamed_1 = sprcom.cfr_renamed_23(arg0.getEncoded()).cfr_renamed_1254();
                this.cfr_renamed_91 = null;
            } else {
                this.cfr_renamed_1 = new sprhmg().cfr_renamed_1494(this.cfr_renamed_0);
                this.cfr_renamed_91 = null;
lbl12:
                // 2 sources

                v0 = this;
            }
            var2_2 = v0.cfr_renamed_1;
            v1 = this;
            v2 = var3_4 = this.cfr_renamed_4.cfr_renamed_7442(v1.cfr_renamed_1);
            if (v1.cfr_renamed_3 != null) {
                v2.initSign(arg0, this.cfr_renamed_3);
            } else {
                v2.initSign(arg0);
            }
            return new spryng(this, var3_4, var2_2);
        }
        catch (GeneralSecurityException var2_3) {
            throw new sprhjg(new StringBuilder().insert(0, sprufba.cfr_renamed_9("a'l(m2\"%p#c2gfq/e(g48f")).append(var2_3.getMessage()).toString(), var2_3);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprhhg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprvng(new sprxil((String)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprhhg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprvng(new sprkhi((Provider)arg0));
        return this;
    }
}

