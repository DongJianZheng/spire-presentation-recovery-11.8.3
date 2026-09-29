/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbnj;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjqj;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprkuh;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpkj;
import com.spire.presentation.packages.sprqoj;
import com.spire.presentation.packages.sprqyl;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtmj;
import com.spire.presentation.packages.sprxoa;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
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

public class spranj
extends CertificateFactorySpi {
    private spridn cfr_renamed_86;
    private static final sprqoj cfr_renamed_152 = new sprqoj("CERTIFICATE");
    private static final sprqoj cfr_renamed_112;
    private spridn cfr_renamed_119;
    private InputStream cfr_renamed_91;
    private int cfr_renamed_0;
    private InputStream cfr_renamed_1;
    private static final sprqoj cfr_renamed_2;
    private final sprrr cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ Certificate cfr_renamed_9363(InputStream arg0, boolean arg1) throws CertificateException {
        block6: {
            block7: {
                if (this.cfr_renamed_1 != null) break block7;
                v0 = this;
                this.cfr_renamed_1 = arg0;
                this.cfr_renamed_119 = null;
                this.cfr_renamed_4 = 0;
                ** GOTO lbl15
            }
            if (this.cfr_renamed_1 != arg0) {
                v1 = this;
                this.cfr_renamed_1 = arg0;
                v1.cfr_renamed_119 = null;
                v1.cfr_renamed_4 = 0;
            }
            try {
                v0 = this;
lbl15:
                // 2 sources

                if (v0.cfr_renamed_119 == null) ** GOTO lbl26
                v2 = this;
                if (v2.cfr_renamed_4 == v2.cfr_renamed_119.cfr_renamed_84()) break block6;
                return this.cfr_renamed_2141();
            }
            catch (Exception var3_4) {
                throw new sprpkj(new StringBuilder().insert(0, sprxoa.cfr_renamed_9("A\bC\u001aX\u0007VIX\u001aB\u001cTS\u0011")).append(var3_4.getMessage()).toString(), var3_4);
            }
        }
        this.cfr_renamed_119 = null;
        this.cfr_renamed_4 = 0;
        return null;
lbl26:
        // 1 sources

        (arg0.markSupported() != false ? (var3_3 = arg0) : (var3_3 = new ByteArrayInputStream(sprkqe.cfr_renamed_471(arg0)))).mark(1);
        var4_5 = var3_3.read();
        if (var4_5 == -1) {
            return null;
        }
        var3_3.reset();
        if (var4_5 != 48) {
            return this.cfr_renamed_9364(var3_3, arg1);
        }
        return this.cfr_renamed_9365(new sprrzm(var3_3));
    }

    private /* synthetic */ Certificate cfr_renamed_9365(sprrzm arg0) throws IOException, CertificateParsingException {
        return this.cfr_renamed_9366(sprszm.cfr_renamed_23(arg0.cfr_renamed_24()));
    }

    public Collection engineGenerateCRLs(InputStream arg0) throws CRLException {
        CRL cRL;
        ArrayList<CRL> arrayList = new ArrayList<CRL>();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(arg0);
        spranj spranj2 = this;
        while ((cRL = spranj2.cfr_renamed_9367(bufferedInputStream, arrayList.isEmpty())) != null) {
            spranj2 = this;
            arrayList.add(cRL);
        }
        return arrayList;
    }

    private /* synthetic */ CRL cfr_renamed_9368(InputStream arg0, boolean arg1) throws IOException, CRLException {
        return this.cfr_renamed_9369(cfr_renamed_2.cfr_renamed_9362(arg0, arg1));
    }

    public CRL cfr_renamed_9370(sprffm arg0) throws CRLException {
        return new sprtmj(this.cfr_renamed_3, arg0);
    }

    public spranj() {
        spranj spranj2 = this;
        spranj spranj3 = this;
        spranj spranj4 = this;
        spranj spranj5 = this;
        spranj5.cfr_renamed_3 = new sprdki();
        spranj4.cfr_renamed_119 = null;
        spranj4.cfr_renamed_4 = 0;
        spranj3.cfr_renamed_1 = null;
        spranj3.cfr_renamed_86 = null;
        spranj2.cfr_renamed_0 = 0;
        spranj2.cfr_renamed_91 = null;
    }

    private /* synthetic */ Certificate cfr_renamed_9364(InputStream arg0, boolean arg1) throws IOException, CertificateParsingException {
        return this.cfr_renamed_9366(cfr_renamed_152.cfr_renamed_9362(arg0, arg1));
    }

    static {
        cfr_renamed_2 = new sprqoj(sprkuh.cfr_renamed_9("rr}"));
        cfr_renamed_112 = new sprqoj("PKCS7");
    }

    private /* synthetic */ Certificate cfr_renamed_9366(sprszm arg0) throws CertificateParsingException {
        if (arg0 == null) {
            return null;
        }
        if (arg0.cfr_renamed_84() > 1 && arg0.cfr_renamed_85(0) instanceof sprlem && arg0.cfr_renamed_85(0).equals(sprdl.cfr_renamed_128)) {
            this.cfr_renamed_119 = sprqyl.cfr_renamed_23(sprszm.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(1), true)).cfr_renamed_617();
            return this.cfr_renamed_2141();
        }
        return new sprjqj(this.cfr_renamed_3, sprndm.cfr_renamed_23(arg0));
    }

    private /* synthetic */ CRL cfr_renamed_9369(sprszm arg0) throws CRLException {
        if (arg0 == null) {
            return null;
        }
        if (arg0.cfr_renamed_84() > 1 && arg0.cfr_renamed_85(0) instanceof sprlem && arg0.cfr_renamed_85(0).equals(sprdl.cfr_renamed_128)) {
            this.cfr_renamed_86 = sprqyl.cfr_renamed_23(sprszm.cfr_renamed_5085((sprnvm)arg0.cfr_renamed_85(1), true)).cfr_renamed_633();
            return this.cfr_renamed_2126();
        }
        return this.cfr_renamed_9370(sprffm.cfr_renamed_23(arg0));
    }

    public Collection engineGenerateCertificates(InputStream arg0) throws CertificateException {
        Certificate certificate;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(arg0);
        ArrayList<Certificate> arrayList = new ArrayList<Certificate>();
        spranj spranj2 = this;
        while ((certificate = spranj2.cfr_renamed_9363(bufferedInputStream, arrayList.isEmpty())) != null) {
            spranj2 = this;
            arrayList.add(certificate);
        }
        return arrayList;
    }

    private /* synthetic */ Certificate cfr_renamed_2141() throws CertificateParsingException {
        block2: {
            if (this.cfr_renamed_119 != null) {
                sprco sprco2;
                do {
                    spranj spranj2 = this;
                    if (spranj2.cfr_renamed_4 >= spranj2.cfr_renamed_119.cfr_renamed_84()) break block2;
                } while (!((sprco2 = this.cfr_renamed_119.cfr_renamed_85(this.cfr_renamed_4++)) instanceof sprszm));
                return new sprjqj(this.cfr_renamed_3, sprndm.cfr_renamed_23(sprco2));
            }
        }
        return null;
    }

    @Override
    public CertPath engineGenerateCertPath(InputStream arg0) throws CertificateException {
        return this.engineGenerateCertPath(arg0, sprxoa.cfr_renamed_9("a\u0002X9P\u001dY"));
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ CRL cfr_renamed_9367(InputStream arg0, boolean arg1) throws CRLException {
        block7: {
            block8: {
                if (this.cfr_renamed_91 != null) break block8;
                v0 = this;
                this.cfr_renamed_91 = arg0;
                this.cfr_renamed_86 = null;
                this.cfr_renamed_0 = 0;
                ** GOTO lbl15
            }
            if (this.cfr_renamed_91 != arg0) {
                v1 = this;
                this.cfr_renamed_91 = arg0;
                v1.cfr_renamed_86 = null;
                v1.cfr_renamed_0 = 0;
            }
            v0 = this;
lbl15:
            // 2 sources

            if (v0.cfr_renamed_86 == null) ** GOTO lbl24
            v2 = this;
            if (v2.cfr_renamed_0 == v2.cfr_renamed_86.cfr_renamed_84()) break block7;
            return this.cfr_renamed_2126();
        }
        try {
            this.cfr_renamed_86 = null;
            this.cfr_renamed_0 = 0;
            return null;
lbl24:
            // 1 sources

            (arg0.markSupported() != false ? (var3_3 = arg0) : (var3_3 = new ByteArrayInputStream(sprkqe.cfr_renamed_471(arg0)))).mark(1);
            var4_6 = var3_3.read();
            if (var4_6 == -1) {
                return null;
            }
            var3_3.reset();
            if (var4_6 != 48) {
                return this.cfr_renamed_9368(var3_3, arg1);
            }
            return this.cfr_renamed_9371(new sprrzm(var3_3, true));
        }
        catch (CRLException var3_4) {
            throw var3_4;
        }
        catch (Exception var3_5) {
            throw new CRLException(var3_5.toString());
        }
    }

    public Iterator engineGetCertPathEncodings() {
        return sprbnj.cfr_renamed_3.iterator();
    }

    private /* synthetic */ CRL cfr_renamed_9371(sprrzm arg0) throws IOException, CRLException {
        return this.cfr_renamed_9369(sprszm.cfr_renamed_23(arg0.cfr_renamed_24()));
    }

    private /* synthetic */ CRL cfr_renamed_2126() throws CRLException {
        block3: {
            block2: {
                if (this.cfr_renamed_86 == null) break block2;
                spranj spranj2 = this;
                if (spranj2.cfr_renamed_0 < spranj2.cfr_renamed_86.cfr_renamed_84()) break block3;
            }
            return null;
        }
        spranj spranj3 = this;
        return spranj3.cfr_renamed_9370(sprffm.cfr_renamed_23(spranj3.cfr_renamed_86.cfr_renamed_85(this.cfr_renamed_0++)));
    }

    @Override
    public CRL engineGenerateCRL(InputStream arg0) throws CRLException {
        return this.cfr_renamed_9367(arg0, true);
    }

    @Override
    public CertPath engineGenerateCertPath(InputStream arg0, String arg1) throws CertificateException {
        return new sprbnj(arg0, arg1);
    }

    public CertPath engineGenerateCertPath(List arg0) throws CertificateException {
        for (Object e : arg0) {
            if (e == null || e instanceof X509Certificate) continue;
            throw new CertificateException(new StringBuilder().insert(0, sprkuh.cfr_renamed_9("]IBT\u0011C^NEAXNB\u0000_O_\u0000i\u0015\u0001\u0019rECTXFXCPTT\u0000^B[ERT\u0011WYI]E\u0011CCEPTXNV\u0000rECTaAEH;")).append(e.toString()).toString());
        }
        return new sprbnj(arg0);
    }

    @Override
    public Certificate engineGenerateCertificate(InputStream arg0) throws CertificateException {
        return this.cfr_renamed_9363(arg0, true);
    }
}

