/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakb;
import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprdfq;
import com.spire.presentation.packages.sprfua;
import com.spire.presentation.packages.sprgma;
import com.spire.presentation.packages.sprkna;
import com.spire.presentation.packages.sprmqa;
import com.spire.presentation.packages.sprmsb;
import com.spire.presentation.packages.sprsnl;
import com.spire.presentation.packages.sprz;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Principal;
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
import javax.security.auth.x500.X500Principal;

public class sprpqb
extends CertPathBuilderSpi {
    private Exception cfr_renamed_4;

    private /* synthetic */ CertPathBuilderResult cfr_renamed_2277(sprz arg0, X509Certificate arg1, sprfua arg2, List arg3) {
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
            certificateFactory = CertificateFactory.getInstance(sprdfq.cfr_renamed_9("I@$^("), "BC");
            certPathValidator = CertPathValidator.getInstance(sprsnl.cfr_renamed_9("v\u001fgj\u0016a\u0015"), "BC");
        }
        catch (Exception exception) {
            throw new RuntimeException(sprdfq.cfr_renamed_9("T\u0016r\u000ba\u001ax\u0001\u007fNr\u001ct\u000fe\u0007\u007f\t1\u001dd\u001ea\u0001c\u001a1\r}\u000fb\u001dt\u001d?"));
        }
        {
            if (sprmqa.cfr_renamed_2273(arg1, arg2.getTrustAnchors(), arg2.getSigProvider()) != null) {
                PKIXCertPathValidatorResult pKIXCertPathValidatorResult;
                CertPath certPath;
                try {
                    certPath = certificateFactory.generateCertPath(arg3);
                }
                catch (Exception exception) {
                    throw new sprakb(sprsnl.cfr_renamed_9("\u001aA+P0B0G8P0K7\u0004)E-LyG6Q5@yJ6PyF<\u0004:K7W-V,G-A=\u0004?V6IyG<V-M?M:E-AyH0W-\n"), exception);
                }
                {
                    pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult)certPathValidator.validate(certPath, arg2);
                }
                return new PKIXCertPathBuilderResult(certPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
            }
            try {
                sprmqa.cfr_renamed_2275(arg1, arg2);
            }
            catch (CertificateParsingException certificateParsingException) {
                throw new sprakb(sprsnl.cfr_renamed_9("j6\u00048@=M-M6J8Hy|w\u0011i\u001dyW-K+A*\u0004:E7\u0004;AyE=@<@yB+K4\u0004:A+P0B0G8P<\u00045K:E-M6J*\n"), certificateParsingException);
            }
            HashSet hashSet = new HashSet();
            try {
                hashSet.addAll(sprmqa.cfr_renamed_2276(arg1, arg2));
            }
            catch (sprakb sprakb2) {
                throw new sprakb(sprdfq.cfr_renamed_9("R\u000f\u007f\u0000~\u001a1\bx\u0000uNx\u001db\u001bt\u001c1\rt\u001ce\u0007w\u0007r\u000fe\u000b1\b~\u001c1\rt\u001ce\u0007w\u0007r\u000fe\u000b1\u0007\u007fNr\u000bc\u001ax\bx\rp\u001ax\u0001\u007fNa\u000fe\u0006?"), sprakb2);
            }
            if (hashSet.isEmpty()) {
                throw new sprakb(sprsnl.cfr_renamed_9("\u0017KyM*W,A+\u0004:A+P0B0G8P<\u0004?K+\u0004:A+P0B0G8P<\u00040JyG<V-M?M:E-M6JyT8P1\u0004?K,J=\n"));
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
                    certPathBuilderResult = this.cfr_renamed_2277(arg0, x509Certificate, arg2, arg3);
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
    @Override
    public CertPathBuilderResult engineBuild(CertPathParameters arg0) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        Collection collection;
        if (!(arg0 instanceof PKIXBuilderParameters) && !(arg0 instanceof sprfua)) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprsnl.cfr_renamed_9("\tE+E4A-A+WyI,W-\u0004;AyE7\u00040J*P8J:AyK?\u0004")).append(PKIXBuilderParameters.class.getName()).append(sprdfq.cfr_renamed_9("N~\u001c1")).append(sprfua.class.getName()).append(".").toString());
        }
        sprfua sprfua2 = arg0 instanceof sprfua ? (sprfua)arg0 : (sprfua)sprfua.cfr_renamed_382((PKIXBuilderParameters)arg0);
        ArrayList arrayList = new ArrayList();
        sprb sprb2 = sprfua2.cfr_renamed_397();
        if (!(sprb2 instanceof sprkna)) {
            throw new CertPathBuilderException(new StringBuilder().insert(0, sprsnl.cfr_renamed_9("p8V>A-g6J*P+E0J-WyI,W-\u0004;AyE7\u00040J*P8J:AyK?\u0004")).append(sprkna.class.getName()).append(sprdfq.cfr_renamed_9("1\b~\u001c1")).append(this.getClass().getName()).append(sprsnl.cfr_renamed_9("\u0004:H8W*\n")).toString());
        }
        try {
            collection = sprmqa.cfr_renamed_2278((sprkna)sprb2, sprfua2.cfr_renamed_385());
        }
        catch (sprakb sprakb2) {
            throw new sprmsb(sprdfq.cfr_renamed_9("T\u001cc\u0001cNw\u0007\u007f\nx\u0000vNe\u000fc\tt\u001a1\u000fe\u001ac\u0007s\u001be\u000b1\rt\u001ce\u0007w\u0007r\u000fe\u000b?"), sprakb2);
        }
        if (collection.isEmpty()) {
            throw new CertPathBuilderException(sprsnl.cfr_renamed_9("j6\u00048P-V0F,P<\u0004:A+P0B0G8P<\u0004?K,J=\u00044E-G1M7CyP8V>A-g6J-V8M7P*\n"));
        }
        CertPathBuilderResult certPathBuilderResult = null;
        Iterator iterator = collection.iterator();
        block5: while (true) {
            int n;
            int n2;
            HashSet hashSet;
            Principal[] principalArray;
            sprgma sprgma2;
            sprz sprz2;
            if (iterator.hasNext() && certPathBuilderResult == null) {
                sprz2 = (sprz)iterator.next();
                sprgma2 = new sprgma();
                principalArray = sprz2.cfr_renamed_102().cfr_renamed_271();
                hashSet = new HashSet();
                n = n2 = 0;
            } else {
                if (certPathBuilderResult == null && this.cfr_renamed_4 != null) {
                    throw new sprmsb(sprsnl.cfr_renamed_9("\tK*W0F5AyG<V-M?M:E-AyG1E0JyG6Q5@yJ6PyF<\u0004/E5M=E-A=\n"), this.cfr_renamed_4);
                }
                if (certPathBuilderResult == null && this.cfr_renamed_4 == null) {
                    throw new CertPathBuilderException(sprdfq.cfr_renamed_9("D\u0000p\f}\u000b1\u001a~Nw\u0007\u007f\n1\rt\u001ce\u0007w\u0007r\u000fe\u000b1\ry\u000fx\u0000?"));
                }
                return certPathBuilderResult;
            }
            while (n < principalArray.length) {
                try {
                    if (principalArray[n2] instanceof X500Principal) {
                        sprgma2.setSubject(((X500Principal)principalArray[n2]).getEncoded());
                    }
                    sprgma sprgma3 = sprgma2;
                    hashSet.addAll(sprmqa.cfr_renamed_2181(sprgma3, sprfua2.cfr_renamed_385()));
                    hashSet.addAll(sprmqa.cfr_renamed_2181(sprgma3, sprfua2.getCertStores()));
                }
                catch (sprakb sprakb3) {
                    throw new sprmsb(sprdfq.cfr_renamed_9(">d\f}\u0007rNz\u000bhNr\u000bc\u001ax\bx\rp\u001atNw\u0001cNp\u001ae\u001cx\fd\u001atNr\u000bc\u001ax\bx\rp\u001atNr\u000f\u007f\u0000~\u001a1\ftNb\u000bp\u001cr\u0006t\n?"), sprakb3);
                }
                catch (IOException iOException) {
                    throw new sprmsb(sprsnl.cfr_renamed_9(":E7J6PyA7G6@<\u0004\u0001\u0011i\u0014\tV0J:M)E5\n"), iOException);
                }
                n = ++n2;
            }
            if (hashSet.isEmpty()) {
                throw new CertPathBuilderException(sprdfq.cfr_renamed_9("A\u001bs\u0002x\r1\u0005t\u00171\rt\u001ce\u0007w\u0007r\u000fe\u000b1\b~\u001c1\u000fe\u001ac\u0007s\u001be\u000b1\rt\u001ce\u0007w\u0007r\u000fe\u000b1\rp\u0000\u007f\u0001eNs\u000b1\b~\u001b\u007f\n?"));
            }
            Iterator iterator2 = hashSet.iterator();
            while (true) {
                Iterator iterator3;
                if (!iterator2.hasNext() || certPathBuilderResult != null) continue block5;
                certPathBuilderResult = this.cfr_renamed_2277(sprz2, (X509Certificate)iterator3.next(), sprfua2, arrayList);
                iterator2 = iterator3;
            }
            break;
        }
    }
}

