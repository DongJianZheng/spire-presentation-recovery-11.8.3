/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprahg;
import com.spire.presentation.packages.sprawc;
import com.spire.presentation.packages.sprexj;
import com.spire.presentation.packages.sprgak;
import com.spire.presentation.packages.sprgkg;
import com.spire.presentation.packages.sprglg;
import com.spire.presentation.packages.sprhhm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprine;
import com.spire.presentation.packages.sprjgm;
import com.spire.presentation.packages.sprkdm;
import com.spire.presentation.packages.sprkl;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmmg;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqvg;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprukq;
import com.spire.presentation.packages.sprvcm;
import com.spire.presentation.packages.sprwck;
import com.spire.presentation.packages.sprwzl;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxkg;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.CRLException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public class sprrjg {
    public static final String cfr_renamed_4 = sprrdm.cfr_renamed_96.cfr_renamed_19();

    public static PublicKey cfr_renamed_7313(List arg0, int arg1, sprrr arg2) throws CertPathValidatorException {
        int n;
        PublicKey publicKey = ((Certificate)arg0.get(arg1)).getPublicKey();
        if (!(publicKey instanceof DSAPublicKey)) {
            return publicKey;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey)publicKey;
        if (dSAPublicKey.getParams() != null) {
            return dSAPublicKey;
        }
        int n2 = n = arg1 + 1;
        while (n2 < arg0.size()) {
            publicKey = ((X509Certificate)arg0.get(n)).getPublicKey();
            if (!(publicKey instanceof DSAPublicKey)) {
                throw new CertPathValidatorException(sprawc.cfr_renamed_9("Ep@\u0003qBsBlFuFsP!@`MoLu\u0003cF!JoKdQhWdG!EsLl\u0003qQdUhLtP!@dQuJgJbBuF/"));
            }
            DSAPublicKey dSAPublicKey2 = (DSAPublicKey)publicKey;
            if (dSAPublicKey2.getParams() != null) {
                DSAParams dSAParams = dSAPublicKey2.getParams();
                DSAPublicKeySpec dSAPublicKeySpec = new DSAPublicKeySpec(dSAPublicKey.getY(), dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
                try {
                    KeyFactory keyFactory = arg2.cfr_renamed_1511("DSA");
                    return keyFactory.generatePublic(dSAPublicKeySpec);
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception.getMessage());
                }
            }
            n2 = ++n;
        }
        throw new CertPathValidatorException(sprukq.cfr_renamed_9("\u007fvz\u0005KDIDV@O@IV\u001bFZKUJO\u0005Y@\u001bLUM^WRQ^A\u001bCIJV\u0005KW^SRJNV\u001bF^WOL]LXDO@\u0015"));
    }

    private static /* synthetic */ boolean cfr_renamed_2339(X509CRL arg0) {
        Set<String> set = arg0.getCriticalExtensionOIDs();
        if (null == set) {
            return false;
        }
        return set.contains(sprxkg.cfr_renamed_91);
    }

    private static /* synthetic */ sprnbm cfr_renamed_7314(X500Principal arg0) {
        return sprnbm.cfr_renamed_23(arg0.getEncoded());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean cfr_renamed_2130(X509CRL arg0) throws CRLException {
        try {
            byte[] byArray = arg0.getExtensionValue(sprrdm.cfr_renamed_96.cfr_renamed_19());
            return byArray != null && sprwzl.cfr_renamed_23(sproug.cfr_renamed_23(byArray).cfr_renamed_186()).cfr_renamed_2131();
        }
        catch (Exception exception) {
            throw new CRLException(sprawc.cfr_renamed_9("Fy@dSuJnM!QdBeJoD!jrPtJoDEJrWsJcVuJnMQLhMu"), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_7304(Date arg0, X509CRL arg1, Object arg2, sprahg arg3) throws sprglg {
        Object object;
        Object object2;
        boolean bl;
        try {
            bl = sprrjg.cfr_renamed_2130(arg1);
        }
        catch (CRLException cRLException) {
            throw new sprglg(sprukq.cfr_renamed_9("cZLW@_\u0005XM^FP\u0005]JI\u0005RK_LI@XQ\u001bfii\u0015"), cRLException);
        }
        X509Certificate x509Certificate = (X509Certificate)arg2;
        sprnbm sprnbm2 = sprrjg.cfr_renamed_7314(x509Certificate.getIssuerX500Principal());
        if (!bl && !sprnbm2.equals(object2 = sprrjg.cfr_renamed_7314(arg1.getIssuerX500Principal()))) {
            return;
        }
        object2 = arg1.getRevokedCertificate(x509Certificate.getSerialNumber());
        if (null == object2) {
            return;
        }
        if (bl) {
            sprnbm sprnbm3;
            X500Principal x500Principal = ((X509CRLEntry)object2).getCertificateIssuer();
            if (null == x500Principal) {
                object = sprrjg.cfr_renamed_7314(arg1.getIssuerX500Principal());
                sprnbm3 = sprnbm2;
            } else {
                object = sprrjg.cfr_renamed_7314(x500Principal);
                sprnbm3 = sprnbm2;
            }
            if (!sprnbm3.equals(object)) {
                return;
            }
        }
        int n = 0;
        if (((X509CRLEntry)object2).hasExtensions()) {
            try {
                object = sprrjg.cfr_renamed_7275((X509Extension)object2, sprrdm.cfr_renamed_953);
                sprqvg sprqvg2 = sprqvg.cfr_renamed_23(object);
                if (null != sprqvg2) {
                    n = sprqvg2.cfr_renamed_5023();
                }
            }
            catch (Exception exception) {
                throw new sprglg(sprawc.cfr_renamed_9("SF`PnM!@nGd\u0003BqM\u0003dMuQx\u0003d[uFoPhLo\u0003bLtOe\u0003oLu\u0003cF!Gd@nGdG/"), exception);
            }
        }
        if (arg0.before((Date)(object = ((X509CRLEntry)object2).getRevocationDate()))) {
            switch (n) {
                case 0: 
                case 1: 
                case 2: 
                case 10: {
                    break;
                }
                default: {
                    return;
                }
            }
        }
        arg3.cfr_renamed_2164(n);
        arg3.cfr_renamed_2333((Date)object);
    }

    public static Date cfr_renamed_7272(sprgak arg0, Date arg1) {
        Date date = arg0.cfr_renamed_7315();
        if (null == date) {
            return arg1;
        }
        return date;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprxgf cfr_renamed_7316(sprlem arg0, byte[] arg1) throws sprglg {
        try {
            return sprxgf.cfr_renamed_184(sproug.cfr_renamed_23(arg1).cfr_renamed_186());
        }
        catch (Exception exception) {
            throw new sprglg(new StringBuilder().insert(0, sprukq.cfr_renamed_9("^]X@KQRJU\u0005KWTF^VHLUB\u001b@CQ^KHLTK\u001b")).append(arg0).toString(), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set cfr_renamed_7292(sprjgm arg0, Object arg1, Date arg2, List arg3, List arg4) throws sprglg, sprmmg {
        Cloneable cloneable;
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            cloneable = new HashSet<sprnbm>();
            cloneable.add(sprrjg.cfr_renamed_7314(((X509Certificate)arg1).getIssuerX500Principal()));
            sprrjg.cfr_renamed_7317(arg0, cloneable, x509CRLSelector);
        }
        catch (sprglg sprglg2) {
            throw new sprglg(sprawc.cfr_renamed_9("BLtOe\u0003oLu\u0003fFu\u0003hPrVdQ!JoEnQlBuJnM!EsLl\u0003eJrWsJcVuJnM!SnJoW/"), sprglg2);
        }
        if (arg1 instanceof X509Certificate) {
            x509CRLSelector.setCertificateChecking((X509Certificate)arg1);
        }
        cloneable = new sprwck(x509CRLSelector).cfr_renamed_167(true).cfr_renamed_1451();
        Set set = sprgkg.cfr_renamed_7277(cloneable, arg2, arg3, arg4);
        sprrjg.cfr_renamed_7318(set, arg1);
        return set;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void cfr_renamed_7317(sprjgm arg0, Collection arg1, X509CRLSelector arg2) throws sprglg {
        Object object;
        ArrayList<sprnbm> arrayList;
        block11: {
            int n;
            int n2;
            block10: {
                block9: {
                    arrayList = new ArrayList<sprnbm>();
                    if (arg0.cfr_renamed_2186() == null) break block9;
                    object = arg0.cfr_renamed_2186().cfr_renamed_289();
                    n = n2 = 0;
                    break block10;
                }
                if (arg0.cfr_renamed_323() == null) {
                    throw new sprglg(sprawc.cfr_renamed_9("BqM\u0003hPrVdQ!Jr\u0003nNhWuFe\u0003gQnN!GhPuQhAtWhLo\u0003qLhMu\u0003cVu\u0003oL!GhPuQhAtWhLosnJoW!EhFmG!SsFrFoW/"));
                }
                Object object2 = object = arg1.iterator();
                while (object2.hasNext()) {
                    Object object3 = object;
                    object2 = object3;
                    arrayList.add((sprnbm)object3.next());
                }
                return;
                break block11;
            }
            while (n < ((sprigm[])object).length) {
                if (object[n2].cfr_renamed_312() == 4) {
                    try {
                        arrayList.add(sprnbm.cfr_renamed_23(((sprigm)object[n2]).cfr_renamed_313()));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw new sprglg(sprukq.cfr_renamed_9("xww\u0005RVHP^W\u001bLUCTWVDOLTK\u001bCIJV\u0005_LHQILYPOLTK\u001bUTLUQ\u001bFZKUJO\u0005Y@\u001bA^FTA^A\u0015"), illegalArgumentException);
                    }
                }
                n = ++n2;
            }
        }
        Object object4 = object = arrayList.iterator();
        while (object4.hasNext()) {
            try {
                arg2.addIssuerName(((sprnbm)object.next()).cfr_renamed_91());
                object4 = object;
            }
            catch (IOException iOException) {
                throw new sprglg(sprukq.cfr_renamed_9("xDUKTQ\u001bA^FTA^\u0005xww\u0005RVHP^W\u001bLUCTWVDOLTK\u0015"), iOException);
            }
        }
    }

    public static void cfr_renamed_7318(Set arg0, Object arg1) throws sprmmg {
        if (arg0.isEmpty()) {
            sprnbm sprnbm2 = sprrjg.cfr_renamed_7314(((X509Certificate)arg1).getIssuerX500Principal());
            throw new sprmmg(new StringBuilder().insert(0, sprawc.cfr_renamed_9("mn\u0003BqMP!EnVoG!EnQ!JrPtFs\u0003#")).append(sprkdm.cfr_renamed_952.cfr_renamed_7319(sprnbm2)).append(sprukq.cfr_renamed_9("\u0019")).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List<sprkl> cfr_renamed_7269(sprvcm arg0, Map<sprigm, sprkl> arg1) throws sprglg {
        int n;
        sprjgm[] sprjgmArray;
        if (arg0 == null) {
            return Collections.emptyList();
        }
        try {
            sprjgmArray = arg0.cfr_renamed_322();
        }
        catch (Exception exception) {
            throw new sprglg(sprawc.cfr_renamed_9("ghPuQhAtWhLo\u0003qLhMuP!@nVmG!MnW!Ad\u0003sF`G/"), exception);
        }
        ArrayList<sprkl> arrayList = new ArrayList<sprkl>();
        int n2 = n = 0;
        while (n2 < sprjgmArray.length) {
            sprhhm sprhhm2 = sprjgmArray[n].cfr_renamed_323();
            if (sprhhm2 != null && sprhhm2.cfr_renamed_324() == 0) {
                int n3;
                sprigm[] sprigmArray = spraem.cfr_renamed_23(sprhhm2.cfr_renamed_313()).cfr_renamed_289();
                int n4 = n3 = 0;
                while (n4 < sprigmArray.length) {
                    sprkl sprkl2 = arg1.get(sprigmArray[n3]);
                    if (sprkl2 != null) {
                        arrayList.add(sprkl2);
                    }
                    n4 = ++n3;
                }
            }
            n2 = ++n;
        }
        return arrayList;
    }

    public static sprxgf cfr_renamed_7275(X509Extension arg0, sprlem arg1) throws sprglg {
        byte[] byArray = arg0.getExtensionValue(arg1.cfr_renamed_19());
        if (null == byArray) {
            return null;
        }
        return sprrjg.cfr_renamed_7316(arg1, byArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_7308(LinkedHashSet arg0, sprexj arg1, List arg2) throws sprglg {
        Iterator iterator = arg2.iterator();
        while (iterator.hasNext()) {
            Object object;
            Object e = iterator.next();
            if (e instanceof sprug) {
                object = (sprug)e;
                try {
                    arg0.addAll(object.cfr_renamed_3216(arg1));
                }
                catch (sprine sprine2) {
                    throw new sprglg(sprukq.cfr_renamed_9("uIJYI^H\u001bRSLW@\u001bURFPLUB\u001bF^WOL]LXDO@H\u0005]WTH\u001b}\u0015\u0010\u000b\u001c\u001bVOJI@\u0015"), sprine2);
                }
            }
            object = (CertStore)e;
            try {
                arg0.addAll(sprexj.cfr_renamed_5098(arg1, (CertStore)object));
            }
            catch (CertStoreException certStoreException) {
                throw new sprglg(sprawc.cfr_renamed_9("ssLcOdN!TiJmF!Sh@jJoD!@dQuJgJbBuFr\u0003gQnN!@dQuJgJbBuF!PuLsF/"), certStoreException);
            }
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set cfr_renamed_7297(Date arg0, X509CRL arg1, List<CertStore> arg2, List<sprkl> arg3) throws sprglg {
        sprwck sprwck2;
        Object object;
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            x509CRLSelector.addIssuerName(arg1.getIssuerX500Principal().getEncoded());
        }
        catch (IOException iOException) {
            throw new sprglg(sprukq.cfr_renamed_9("XDUKTQ\u001b@CQIDXQ\u001bLHVN@I\u0005]WTH\u001bfii\u0015"), iOException);
        }
        BigInteger bigInteger = null;
        try {
            object = sprrjg.cfr_renamed_7275(arg1, sprrdm.cfr_renamed_128);
            if (object != null) {
                bigInteger = sprktm.cfr_renamed_23(object).cfr_renamed_162();
            }
        }
        catch (Exception exception) {
            throw new sprglg(sprawc.cfr_renamed_9("@`MoLu\u0003d[uQ`@u\u0003BqM\u0003oVlAdQ!FyWdMrJnM!EsLl\u0003BqM"), exception);
        }
        try {
            object = arg1.getExtensionValue(cfr_renamed_4);
        }
        catch (Exception exception) {
            throw new sprglg(sprukq.cfr_renamed_9("LHVNLUB\u001bARVOWRGNQRJU\u0005KJRKO\u0005^]O@UVRJU\u0005MDWP^\u0005XJNI_\u0005UJO\u0005Y@\u001bW^D_"), exception);
        }
        x509CRLSelector.setMinCRLNumber(bigInteger == null ? null : bigInteger.add(BigInteger.valueOf(1L)));
        sprwck sprwck3 = sprwck2 = new sprwck(x509CRLSelector);
        sprwck2.cfr_renamed_157((byte[])object);
        sprwck3.cfr_renamed_166(true);
        sprwck3.cfr_renamed_164(bigInteger);
        Set set = sprgkg.cfr_renamed_7277(sprwck3.cfr_renamed_1451(), arg0, arg2, arg3);
        HashSet<X509CRL> hashSet = new HashSet<X509CRL>();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            X509CRL x509CRL = (X509CRL)iterator.next();
            if (!sprrjg.cfr_renamed_2339(x509CRL)) continue;
            hashSet.add(x509CRL);
        }
        return hashSet;
    }
}

