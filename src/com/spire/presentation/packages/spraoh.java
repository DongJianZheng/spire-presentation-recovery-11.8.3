/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbd;
import com.spire.presentation.packages.sprddk;
import com.spire.presentation.packages.sprexj;
import com.spire.presentation.packages.sprgai;
import com.spire.presentation.packages.sprgak;
import com.spire.presentation.packages.sprggi;
import com.spire.presentation.packages.sprgv;
import com.spire.presentation.packages.sprhve;
import com.spire.presentation.packages.sprine;
import com.spire.presentation.packages.spritj;
import com.spire.presentation.packages.sprivj;
import com.spire.presentation.packages.sprjvg;
import com.spire.presentation.packages.sprlhi;
import com.spire.presentation.packages.sprnve;
import com.spire.presentation.packages.sprpre;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprxjaa;
import com.spire.presentation.packages.spryue;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Principal;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidator;
import java.security.cert.Certificate;
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
import java.util.LinkedHashSet;
import java.util.List;
import javax.security.auth.x500.X500Principal;

public class spraoh
extends CertPathBuilderSpi {
    private Exception cfr_renamed_4;

    private /* synthetic */ CertPathBuilderResult cfr_renamed_9146(sprbd arg0, X509Certificate arg1, sprivj arg2, List arg3) {
        CertPathValidator certPathValidator;
        CertificateFactory certificateFactory;
        if (arg3.contains(arg1)) {
            return null;
        }
        if (arg2.cfr_renamed_399().contains(arg1)) {
            return null;
        }
        if (arg2.cfr_renamed_401() != -1 && arg3.size() - 1 > arg2.cfr_renamed_401()) {
            return null;
        }
        arg3.add(arg1);
        CertPathBuilderResult certPathBuilderResult = null;
        try {
            certificateFactory = CertificateFactory.getInstance(sprjvg.cfr_renamed_9("(\u0016E\bI"), "BC");
            certPathValidator = CertPathValidator.getInstance(sprxjaa.cfr_renamed_9("\u001d-\fX}S~"), "BC");
        }
        catch (Exception exception) {
            throw new RuntimeException(sprjvg.cfr_renamed_9("5@\u0013]\u0000L\u0019W\u001e\u0018\u0013J\u0015Y\u0004Q\u001e_PK\u0005H\u0000W\u0002LP[\u001cY\u0003K\u0015K^"));
        }
        {
            sprgak sprgak2 = arg2.cfr_renamed_9128();
            if (sprgai.cfr_renamed_9139(arg1, sprgak2.cfr_renamed_9129(), sprgak2.cfr_renamed_9097())) {
                PKIXCertPathValidatorResult pKIXCertPathValidatorResult;
                CertPath certPath;
                try {
                    certPath = certificateFactory.generateCertPath(arg3);
                }
                catch (Exception exception) {
                    throw new sprlhi(sprxjaa.cfr_renamed_9("(*\u0019;\u0002)\u0002,\n;\u0002 \u0005o\u001b.\u001f'K,\u0004:\u0007+K!\u0004;K-\u000eo\b \u0005<\u001f=\u001e,\u001f*\u000fo\r=\u0004\"K,\u000e=\u001f&\r&\b.\u001f*K#\u0002<\u001fa"), exception);
                }
                {
                    pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult)certPathValidator.validate(certPath, arg2);
                }
                return new PKIXCertPathBuilderResult(certPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
            }
            ArrayList<sprgv> arrayList = new ArrayList<sprgv>();
            arrayList.addAll(sprgak2.cfr_renamed_7309());
            try {
                arrayList.addAll(sprgai.cfr_renamed_9140(arg1.getExtensionValue(sprrdm.cfr_renamed_3.cfr_renamed_19()), sprgak2.cfr_renamed_9141()));
            }
            catch (CertificateParsingException certificateParsingException) {
                throw new sprlhi(sprxjaa.cfr_renamed_9("\u0001\u0004o\n+\u000f&\u001f&\u0004!\n#K\u0017Ez[vK<\u001f \u0019*\u0018o\b.\u0005o\t*K.\u000f+\u000e+K)\u0019 \u0006o\b*\u0019;\u0002)\u0002,\n;\u000eo\u0007 \b.\u001f&\u0004!\u0018a"), certificateParsingException);
            }
            HashSet hashSet = new HashSet();
            try {
                hashSet.addAll(sprgai.cfr_renamed_9142(arg1, sprgak2.cfr_renamed_2283(), arrayList));
            }
            catch (sprlhi sprlhi2) {
                throw new sprlhi(sprjvg.cfr_renamed_9("3Y\u001eV\u001fLP^\u0019V\u0014\u0018\u0019K\u0003M\u0015JP[\u0015J\u0004Q\u0016Q\u0013Y\u0004]P^\u001fJP[\u0015J\u0004Q\u0016Q\u0013Y\u0004]PQ\u001e\u0018\u0013]\u0002L\u0019^\u0019[\u0011L\u0019W\u001e\u0018\u0000Y\u0004P^"), sprlhi2);
            }
            if (hashSet.isEmpty()) {
                throw new sprlhi(sprxjaa.cfr_renamed_9("% K&\u0018<\u001e*\u0019o\b*\u0019;\u0002)\u0002,\n;\u000eo\r \u0019o\b*\u0019;\u0002)\u0002,\n;\u000eo\u0002!K,\u000e=\u001f&\r&\b.\u001f&\u0004!K?\n;\u0003o\r \u001e!\u000fa"));
            }
            Iterator iterator = hashSet.iterator();
            block10: while (true) {
                Iterator iterator2 = iterator;
                while (iterator2.hasNext() && certPathBuilderResult == null) {
                    X509Certificate x509Certificate = (X509Certificate)iterator.next();
                    if (x509Certificate.getIssuerX500Principal().equals(x509Certificate.getSubjectX500Principal())) {
                        iterator2 = iterator;
                        continue;
                    }
                    certPathBuilderResult = this.cfr_renamed_9146(arg0, x509Certificate, arg2, arg3);
                    continue block10;
                }
                break;
            }
        }
        if (certPathBuilderResult == null) {
            arg3.remove(arg1);
        }
        return certPathBuilderResult;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Collection cfr_renamed_5093(spryue arg0, List arg1) throws sprlhi {
        HashSet hashSet = new HashSet();
        Iterator iterator = arg1.iterator();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            if (!(e instanceof sprug)) continue;
            sprug sprug2 = (sprug)e;
            try {
                hashSet.addAll(sprug2.cfr_renamed_3216(arg0));
            }
            catch (sprine sprine2) {
                throw new sprlhi(sprxjaa.cfr_renamed_9(";=\u0004-\u0007*\u0006o\u001c'\u0002#\u000eo\u001b&\b$\u0002!\fo\b*\u0019;\u0002)\u0002,\n;\u000e<K)\u0019 \u0006o3a^\u007fRo\u0018;\u0004=\u000ea"), sprine2);
            }
        }
        return hashSet;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public CertPathBuilderResult engineBuild(CertPathParameters arg0) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        sprivj sprivj2;
        Object object;
        Object object2;
        if (!(arg0 instanceof PKIXBuilderParameters || arg0 instanceof sprnve || arg0 instanceof sprivj)) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprjvg.cfr_renamed_9("h\u0011J\u0011U\u0015L\u0015J\u0003\u0018\u001dM\u0003LPZ\u0015\u0018\u0011VPQ\u001eK\u0004Y\u001e[\u0015\u0018\u001f^P")).append(PKIXBuilderParameters.class.getName()).append(sprxjaa.cfr_renamed_9("K \u0019o")).append(sprivj.class.getName()).append(".").toString());
        }
        List list = new ArrayList();
        if (arg0 instanceof PKIXBuilderParameters) {
            object2 = new spritj((PKIXBuilderParameters)arg0);
            if (arg0 instanceof sprpre) {
                object = (sprnve)arg0;
                ((spritj)object2).cfr_renamed_9144(((sprnve)object).cfr_renamed_399());
                ((spritj)object2).cfr_renamed_400(((sprnve)object).cfr_renamed_401());
                list = ((sprpre)object).cfr_renamed_385();
            }
            sprivj2 = ((spritj)object2).cfr_renamed_1451();
        } else {
            sprivj2 = (sprivj)arg0;
        }
        ArrayList arrayList = new ArrayList();
        sprgak sprgak2 = sprivj2.cfr_renamed_9128();
        sprexj sprexj2 = sprgak2.cfr_renamed_397();
        if (!(sprexj2 instanceof spryue)) {
            throw new CertPathBuilderException(new StringBuilder().insert(0, sprjvg.cfr_renamed_9("$Y\u0002_\u0015L3W\u001eK\u0004J\u0011Q\u001eL\u0003\u0018\u001dM\u0003LPZ\u0015\u0018\u0011VPQ\u001eK\u0004Y\u001e[\u0015\u0018\u001f^P")).append(spryue.class.getName()).append(sprxjaa.cfr_renamed_9("o\r \u0019o")).append(this.getClass().getName()).append(sprjvg.cfr_renamed_9("P[\u001cY\u0003K^")).toString());
        }
        try {
            object2 = spraoh.cfr_renamed_5093((spryue)((Object)sprexj2), list);
        }
        catch (sprlhi sprlhi2) {
            throw new sprggi(sprxjaa.cfr_renamed_9("\n\u0019=\u0004=K)\u0002!\u000f&\u0005(K;\n=\f*\u001fo\n;\u001f=\u0002-\u001e;\u000eo\b*\u0019;\u0002)\u0002,\n;\u000ea"), sprlhi2);
        }
        if (object2.isEmpty()) {
            throw new CertPathBuilderException(sprjvg.cfr_renamed_9("v\u001f\u0018\u0011L\u0004J\u0019Z\u0005L\u0015\u0018\u0013]\u0002L\u0019^\u0019[\u0011L\u0015\u0018\u0016W\u0005V\u0014\u0018\u001dY\u0004[\u0018Q\u001e_PL\u0011J\u0017]\u0004{\u001fV\u0003L\u0002Y\u0019V\u0004K^"));
        }
        CertPathBuilderResult certPathBuilderResult = null;
        object = object2.iterator();
        block5: while (true) {
            int n;
            int n2;
            LinkedHashSet linkedHashSet;
            Principal[] principalArray;
            sprhve sprhve2;
            sprbd sprbd2;
            if (object.hasNext() && certPathBuilderResult == null) {
                sprbd2 = (sprbd)object.next();
                sprhve2 = new sprhve();
                principalArray = sprbd2.cfr_renamed_102().cfr_renamed_271();
                linkedHashSet = new LinkedHashSet();
                n = n2 = 0;
            } else {
                if (certPathBuilderResult == null && this.cfr_renamed_4 != null) {
                    throw new sprggi(sprjvg.cfr_renamed_9("h\u001fK\u0003Q\u0012T\u0015\u0018\u0013]\u0002L\u0019^\u0019[\u0011L\u0015\u0018\u0013P\u0011Q\u001e\u0018\u0013W\u0005T\u0014\u0018\u001eW\u0004\u0018\u0012]PN\u0011T\u0019\\\u0011L\u0015\\^"), this.cfr_renamed_4);
                }
                if (certPathBuilderResult == null && this.cfr_renamed_4 == null) {
                    throw new CertPathBuilderException(sprxjaa.cfr_renamed_9("\u001a\u0005.\t#\u000eo\u001f K)\u0002!\u000fo\b*\u0019;\u0002)\u0002,\n;\u000eo\b'\n&\u0005a"));
                }
                return certPathBuilderResult;
            }
            while (n < principalArray.length) {
                try {
                    if (principalArray[n2] instanceof X500Principal) {
                        sprhve2.setSubject(((X500Principal)principalArray[n2]).getEncoded());
                    }
                    sprexj<? extends Certificate> sprexj3 = new sprddk(sprhve2).cfr_renamed_1451();
                    LinkedHashSet linkedHashSet2 = linkedHashSet;
                    sprgai.cfr_renamed_7308(linkedHashSet2, sprexj3, sprgak2.cfr_renamed_2283());
                    sprgai.cfr_renamed_7308(linkedHashSet2, sprexj3, sprgak2.cfr_renamed_7309());
                }
                catch (sprlhi sprlhi3) {
                    throw new sprggi(sprxjaa.cfr_renamed_9(";:\t#\u0002,K$\u000e6K,\u000e=\u001f&\r&\b.\u001f*K)\u0004=K.\u001f;\u0019&\t:\u001f*K,\u000e=\u001f&\r&\b.\u001f*K,\n!\u0005 \u001fo\t*K<\u000e.\u0019,\u0003*\u000fa"), sprlhi3);
                }
                catch (IOException iOException) {
                    throw new sprggi(sprjvg.cfr_renamed_9("[\u0011V\u001eW\u0004\u0018\u0015V\u0013W\u0014]P`E\b@h\u0002Q\u001e[\u0019H\u0011T^"), iOException);
                }
                n = ++n2;
            }
            if (linkedHashSet.isEmpty()) {
                throw new CertPathBuilderException(sprxjaa.cfr_renamed_9("\u001f\u001e-\u0007&\bo\u0000*\u0012o\b*\u0019;\u0002)\u0002,\n;\u000eo\r \u0019o\n;\u001f=\u0002-\u001e;\u000eo\b*\u0019;\u0002)\u0002,\n;\u000eo\b.\u0005!\u0004;K-\u000eo\r \u001e!\u000fa"));
            }
            Iterator iterator = linkedHashSet.iterator();
            while (true) {
                Iterator iterator2;
                if (!iterator.hasNext() || certPathBuilderResult != null) continue block5;
                certPathBuilderResult = this.cfr_renamed_9146(sprbd2, (X509Certificate)iterator2.next(), sprivj2, arrayList);
                iterator = iterator2;
            }
            break;
        }
    }
}

