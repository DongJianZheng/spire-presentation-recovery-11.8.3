/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprawha;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprikc;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sproje;
import com.spire.presentation.packages.sprozd;
import com.spire.presentation.packages.sprqpc;
import com.spire.presentation.packages.sprrkc;
import com.spire.presentation.packages.sprtkc;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwhc;
import com.spire.presentation.packages.spryte;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class sprpqc
extends CertificateFactorySpi {
    private static final sprqpc cfr_renamed_112;
    private InputStream cfr_renamed_119;
    private sprere cfr_renamed_91;
    private int cfr_renamed_0;
    private InputStream cfr_renamed_1;
    private int cfr_renamed_2;
    private static final sprqpc cfr_renamed_3;
    private sprere cfr_renamed_4;

    private /* synthetic */ Certificate cfr_renamed_2467(sprgle arg0) throws IOException, CertificateParsingException {
        sprbne sprbne2 = (sprbne)arg0.cfr_renamed_24();
        if (sprbne2.cfr_renamed_84() > 1 && sprbne2.cfr_renamed_85(0) instanceof sprtzd && sprbne2.cfr_renamed_85(0).equals(sprm.cfr_renamed_1397)) {
            this.cfr_renamed_91 = sprozd.cfr_renamed_23(sprbne.cfr_renamed_341((spryte)sprbne2.cfr_renamed_85(1), true)).cfr_renamed_617();
            return this.cfr_renamed_2141();
        }
        return new sprrkc(sprcge.cfr_renamed_23(sprbne2));
    }

    public CertPath engineGenerateCertPath(List arg0) throws CertificateException {
        for (Object e : arg0) {
            if (e == null || e instanceof X509Certificate) continue;
            throw new CertificateException(new StringBuilder().insert(0, sprawha.cfr_renamed_9("^jAw\u0012`]mFb[mA#\\l\\#j6\u0002:qf@w[e[`SwW#]aXfQw\u0012tZj^f\u0012`@fSw[mU#qf@wbbFk8")).append(e.toString()).toString());
        }
        return new sprikc(arg0);
    }

    public sprpqc() {
        sprpqc sprpqc2 = this;
        sprpqc sprpqc3 = this;
        sprpqc sprpqc4 = this;
        sprpqc4.cfr_renamed_91 = null;
        sprpqc4.cfr_renamed_0 = 0;
        sprpqc3.cfr_renamed_119 = null;
        sprpqc3.cfr_renamed_4 = null;
        sprpqc2.cfr_renamed_2 = 0;
        sprpqc2.cfr_renamed_1 = null;
    }

    private /* synthetic */ Certificate cfr_renamed_2141() throws CertificateParsingException {
        block2: {
            if (this.cfr_renamed_91 != null) {
                spra spra2;
                do {
                    sprpqc sprpqc2 = this;
                    if (sprpqc2.cfr_renamed_0 >= sprpqc2.cfr_renamed_91.cfr_renamed_84()) break block2;
                } while (!((spra2 = this.cfr_renamed_91.cfr_renamed_85(this.cfr_renamed_0++)) instanceof sprbne));
                return new sprrkc(sprcge.cfr_renamed_23(spra2));
            }
        }
        return null;
    }

    private /* synthetic */ CRL cfr_renamed_2126() throws CRLException {
        block3: {
            block2: {
                if (this.cfr_renamed_4 == null) break block2;
                sprpqc sprpqc2 = this;
                if (sprpqc2.cfr_renamed_2 < sprpqc2.cfr_renamed_4.cfr_renamed_84()) break block3;
            }
            return null;
        }
        sprpqc sprpqc3 = this;
        return sprpqc3.cfr_renamed_2468(sproje.cfr_renamed_23(sprpqc3.cfr_renamed_4.cfr_renamed_85(this.cfr_renamed_2++)));
    }

    private /* synthetic */ Certificate cfr_renamed_2142(InputStream arg0) throws IOException, CertificateParsingException {
        sprbne sprbne2 = cfr_renamed_3.cfr_renamed_2129(arg0);
        if (sprbne2 != null) {
            return new sprrkc(sprcge.cfr_renamed_23(sprbne2));
        }
        return null;
    }

    public CRL cfr_renamed_2468(sproje arg0) throws CRLException {
        return new sprtkc(arg0);
    }

    private /* synthetic */ CRL cfr_renamed_2127(InputStream arg0) throws IOException, CRLException {
        sprbne sprbne2 = cfr_renamed_112.cfr_renamed_2129(arg0);
        if (sprbne2 != null) {
            return this.cfr_renamed_2468(sproje.cfr_renamed_23(sprbne2));
        }
        return null;
    }

    @Override
    public CertPath engineGenerateCertPath(InputStream arg0, String arg1) throws CertificateException {
        return new sprikc(arg0, arg1);
    }

    @Override
    public CertPath engineGenerateCertPath(InputStream arg0) throws CertificateException {
        return this.engineGenerateCertPath(arg0, sprkqa.cfr_renamed_9("6P\u000fk\u0007O\u000e"));
    }

    public Collection engineGenerateCRLs(InputStream arg0) throws CRLException {
        CRL cRL;
        ArrayList<CRL> arrayList = new ArrayList<CRL>();
        sprpqc sprpqc2 = this;
        while ((cRL = sprpqc2.engineGenerateCRL(arg0)) != null) {
            sprpqc2 = this;
            arrayList.add(cRL);
        }
        return arrayList;
    }

    private /* synthetic */ CRL cfr_renamed_2469(sprgle arg0) throws IOException, CRLException {
        sprbne sprbne2 = (sprbne)arg0.cfr_renamed_24();
        if (sprbne2.cfr_renamed_84() > 1 && sprbne2.cfr_renamed_85(0) instanceof sprtzd && sprbne2.cfr_renamed_85(0).equals(sprm.cfr_renamed_1397)) {
            this.cfr_renamed_4 = sprozd.cfr_renamed_23(sprbne.cfr_renamed_341((spryte)sprbne2.cfr_renamed_85(1), true)).cfr_renamed_633();
            return this.cfr_renamed_2126();
        }
        return this.cfr_renamed_2468(sproje.cfr_renamed_23(sprbne2));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public CRL engineGenerateCRL(InputStream arg0) throws CRLException {
        block7: {
            block8: {
                if (this.cfr_renamed_1 != null) break block8;
                v0 = this;
                this.cfr_renamed_1 = arg0;
                this.cfr_renamed_4 = null;
                this.cfr_renamed_2 = 0;
                ** GOTO lbl15
            }
            if (this.cfr_renamed_1 != arg0) {
                v1 = this;
                this.cfr_renamed_1 = arg0;
                v1.cfr_renamed_4 = null;
                v1.cfr_renamed_2 = 0;
            }
            v0 = this;
lbl15:
            // 2 sources

            if (v0.cfr_renamed_4 == null) ** GOTO lbl24
            v2 = this;
            if (v2.cfr_renamed_2 == v2.cfr_renamed_4.cfr_renamed_84()) break block7;
            return this.cfr_renamed_2126();
        }
        try {
            this.cfr_renamed_4 = null;
            this.cfr_renamed_2 = 0;
            return null;
lbl24:
            // 1 sources

            var2_2 = new PushbackInputStream(arg0);
            var3_5 = var2_2.read();
            if (var3_5 == -1) {
                return null;
            }
            var2_2.unread(var3_5);
            if (var3_5 != 48) {
                return this.cfr_renamed_2127(var2_2);
            }
            return this.cfr_renamed_2469(new sprgle((InputStream)var2_2, true));
        }
        catch (CRLException var2_3) {
            throw var2_3;
        }
        catch (Exception var2_4) {
            throw new CRLException(var2_4.toString());
        }
    }

    public Iterator engineGetCertPathEncodings() {
        return sprikc.cfr_renamed_4.iterator();
    }

    public Collection engineGenerateCertificates(InputStream arg0) throws CertificateException {
        Certificate certificate;
        ArrayList<Certificate> arrayList = new ArrayList<Certificate>();
        sprpqc sprpqc2 = this;
        while ((certificate = sprpqc2.engineGenerateCertificate(arg0)) != null) {
            sprpqc2 = this;
            arrayList.add(certificate);
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Certificate engineGenerateCertificate(InputStream arg0) throws CertificateException {
        block6: {
            block7: {
                if (this.cfr_renamed_119 != null) break block7;
                v0 = this;
                this.cfr_renamed_119 = arg0;
                this.cfr_renamed_91 = null;
                this.cfr_renamed_0 = 0;
                ** GOTO lbl15
            }
            if (this.cfr_renamed_119 != arg0) {
                v1 = this;
                this.cfr_renamed_119 = arg0;
                v1.cfr_renamed_91 = null;
                v1.cfr_renamed_0 = 0;
            }
            try {
                v0 = this;
lbl15:
                // 2 sources

                if (v0.cfr_renamed_91 == null) ** GOTO lbl26
                v2 = this;
                if (v2.cfr_renamed_0 == v2.cfr_renamed_91.cfr_renamed_84()) break block6;
                return this.cfr_renamed_2141();
            }
            catch (Exception var2_3) {
                throw new sprwhc(this, (Throwable)var2_3);
            }
        }
        this.cfr_renamed_91 = null;
        this.cfr_renamed_0 = 0;
        return null;
lbl26:
        // 1 sources

        var2_2 = new PushbackInputStream(arg0);
        var3_4 = var2_2.read();
        if (var3_4 == -1) {
            return null;
        }
        var2_2.unread(var3_4);
        if (var3_4 != 48) {
            return this.cfr_renamed_2142(var2_2);
        }
        return this.cfr_renamed_2467(new sprgle(var2_2));
    }

    static {
        cfr_renamed_3 = new sprqpc("CERTIFICATE");
        cfr_renamed_112 = new sprqpc(sprawha.cfr_renamed_9("qQ~"));
    }
}

