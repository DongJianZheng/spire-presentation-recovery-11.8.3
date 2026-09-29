/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakb;
import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprfua;
import com.spire.presentation.packages.sprfym;
import com.spire.presentation.packages.sprgma;
import com.spire.presentation.packages.sprmqa;
import com.spire.presentation.packages.sprmsb;
import com.spire.presentation.packages.sprvsz;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidator;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class sprzib
extends CertPathBuilderSpi {
    private Exception cfr_renamed_4;

    public CertPathBuilderResult cfr_renamed_2274(X509Certificate arg0, sprfua arg1, List arg2) {
        CertPathValidator certPathValidator;
        CertificateFactory certificateFactory;
        if (arg2.contains(arg0)) {
            return null;
        }
        if (arg1.cfr_renamed_399().contains(arg0)) {
            return null;
        }
        if (arg1.cfr_renamed_401() != -1 && arg2.size() - 1 > arg1.cfr_renamed_401()) {
            return null;
        }
        arg2.add(arg0);
        CertPathBuilderResult certPathBuilderResult = null;
        try {
            certificateFactory = CertificateFactory.getInstance(sprfym.cfr_renamed_9("bU\u000fK\u0003"), "BC");
            certPathValidator = CertPathValidator.getInstance(sprvsz.cfr_renamed_9("zDcW"), "BC");
        }
        catch (Exception exception) {
            throw new RuntimeException(sprfym.cfr_renamed_9("\u007f\u0003Y\u001eJ\u000fS\u0014T[Y\t_\u001aN\u0012T\u001c\u001a\bO\u000bJ\u0014H\u000f\u001a\u0018V\u001aI\b_\b\u0014"));
        }
        {
            if (sprmqa.cfr_renamed_2273(arg0, arg1.getTrustAnchors(), arg1.getSigProvider()) != null) {
                CertPath certPath = null;
                PKIXCertPathValidatorResult pKIXCertPathValidatorResult = null;
                try {
                    certPath = certificateFactory.generateCertPath(arg2);
                }
                catch (Exception exception) {
                    throw new sprakb(sprvsz.cfr_renamed_9("ijX{CiClK{C`D/Zn^g\nlEzFk\naE{\nmO/I`D|^}_l^jN/L}Eb\nlO}^fLfIn^j\ncC|^!"), exception);
                }
                {
                    pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult)certPathValidator.validate(certPath, arg1);
                }
                return new PKIXCertPathBuilderResult(certPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
            }
            try {
                sprmqa.cfr_renamed_2275(arg0, arg1);
            }
            catch (CertificateParsingException certificateParsingException) {
                throw new sprakb(sprvsz.cfr_renamed_9("d`\nnNkC{C`D{Kc\nW\u0004:\u001a6\n|^`XjY/InD/Hj\nnNkOk\niX`G/IjX{CiClK{O/F`In^fEaY!"), certificateParsingException);
            }
            HashSet hashSet = new HashSet();
            try {
                hashSet.addAll(sprmqa.cfr_renamed_2276(arg0, arg1));
            }
            catch (sprakb sprakb2) {
                throw new sprakb(sprfym.cfr_renamed_9("y\u001aT\u0015U\u000f\u001a\u001dS\u0015^[S\bI\u000e_\t\u001a\u0018_\tN\u0012\\\u0012Y\u001aN\u001e\u001a\u001dU\t\u001a\u0018_\tN\u0012\\\u0012Y\u001aN\u001e\u001a\u0012T[Y\u001eH\u000fS\u001dS\u0018[\u000fS\u0014T[J\u001aN\u0013\u0014"), sprakb2);
            }
            if (hashSet.isEmpty()) {
                throw new sprakb(sprvsz.cfr_renamed_9("d`\nfY|_jX/IjX{CiClK{O/L`X/IjX{CiClK{O/Ca\nlO}^fLfIn^fEa\n\u007fK{B/L`_aN!"));
            }
            Iterator iterator = hashSet.iterator();
            while (iterator.hasNext() && certPathBuilderResult == null) {
                X509Certificate x509Certificate = (X509Certificate)iterator.next();
                certPathBuilderResult = this.cfr_renamed_2274(x509Certificate, arg1, arg2);
            }
        }
        if (certPathBuilderResult == null) {
            arg2.remove(arg0);
        }
        return certPathBuilderResult;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public CertPathBuilderResult engineBuild(CertPathParameters arg0) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        Iterator iterator;
        Collection collection;
        if (!(arg0 instanceof PKIXBuilderParameters) && !(arg0 instanceof sprfua)) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprfym.cfr_renamed_9("+[\t[\u0016_\u000f_\tI[W\u000eI\u000f\u001a\u0019_[[\u0015\u001a\u0012T\bN\u001aT\u0018_[U\u001d\u001a")).append(PKIXBuilderParameters.class.getName()).append(sprvsz.cfr_renamed_9("\n`X/")).append(sprfua.class.getName()).append(".").toString());
        }
        sprfua sprfua2 = null;
        sprfua2 = arg0 instanceof sprfua ? (sprfua)arg0 : (sprfua)sprfua.cfr_renamed_382((PKIXBuilderParameters)arg0);
        ArrayList arrayList = new ArrayList();
        sprb sprb2 = sprfua2.cfr_renamed_397();
        if (!(sprb2 instanceof sprgma)) {
            throw new CertPathBuilderException(new StringBuilder().insert(0, sprfym.cfr_renamed_9("n\u001aH\u001c_\u000fy\u0014T\bN\t[\u0012T\u000fI[W\u000eI\u000f\u001a\u0019_[[\u0015\u001a\u0012T\bN\u001aT\u0018_[U\u001d\u001a")).append(sprgma.class.getName()).append(sprvsz.cfr_renamed_9("/L`X/")).append(this.getClass().getName()).append(sprfym.cfr_renamed_9("\u001a\u0018V\u001aI\b\u0014")).toString());
        }
        try {
            collection = sprmqa.cfr_renamed_2181((sprgma)sprb2, sprfua2.cfr_renamed_385());
            collection.addAll(sprmqa.cfr_renamed_2181((sprgma)sprb2, sprfua2.getCertStores()));
        }
        catch (sprakb sprakb2) {
            throw new sprmsb(sprvsz.cfr_renamed_9("JX}E}\niCaNfDh\n{K}Mj^/IjX{CiClK{O!"), sprakb2);
        }
        if (collection.isEmpty()) {
            throw new CertPathBuilderException(sprfym.cfr_renamed_9("t\u0014\u001a\u0018_\tN\u0012\\\u0012Y\u001aN\u001e\u001a\u001dU\u000eT\u001f\u001a\u0016[\u000fY\u0013S\u0015][N\u001aH\u001c_\u000fy\u0014T\u000fH\u001aS\u0015N\b\u0014"));
        }
        CertPathBuilderResult certPathBuilderResult = null;
        Iterator iterator2 = iterator = collection.iterator();
        while (iterator2.hasNext() && certPathBuilderResult == null) {
            X509Certificate x509Certificate = (X509Certificate)iterator.next();
            certPathBuilderResult = this.cfr_renamed_2274(x509Certificate, sprfua2, arrayList);
            iterator2 = iterator;
        }
        if (certPathBuilderResult == null && this.cfr_renamed_4 != null) {
            if (this.cfr_renamed_4 instanceof sprakb) {
                throw new CertPathBuilderException(this.cfr_renamed_4.getMessage(), this.cfr_renamed_4.getCause());
            }
            throw new CertPathBuilderException(sprvsz.cfr_renamed_9("z`Y|CmFj\nlO}^fLfIn^j\nlBnCa\nlEzFk\naE{\nmO/\\nFfNn^jN!"), this.cfr_renamed_4);
        }
        if (certPathBuilderResult == null && this.cfr_renamed_4 == null) {
            throw new CertPathBuilderException(sprfym.cfr_renamed_9("o\u0015[\u0019V\u001e\u001a\u000fU[\\\u0012T\u001f\u001a\u0018_\tN\u0012\\\u0012Y\u001aN\u001e\u001a\u0018R\u001aS\u0015\u0014"));
        }
        return certPathBuilderResult;
    }
}

