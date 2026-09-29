/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprahg;
import com.spire.presentation.packages.sprbcm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddk;
import com.spire.presentation.packages.sprdog;
import com.spire.presentation.packages.sprexj;
import com.spire.presentation.packages.sprgak;
import com.spire.presentation.packages.sprgkg;
import com.spire.presentation.packages.sprglg;
import com.spire.presentation.packages.sprhhm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.spritj;
import com.spire.presentation.packages.sprjgm;
import com.spire.presentation.packages.sprkl;
import com.spire.presentation.packages.sprlxj;
import com.spire.presentation.packages.sprmdk;
import com.spire.presentation.packages.sprmmg;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqve;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrjg;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsra;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvcm;
import com.spire.presentation.packages.sprwck;
import com.spire.presentation.packages.sprwzl;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.io.Serializable;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class sprxkg {
    public static final String cfr_renamed_119;
    public static final String cfr_renamed_91;
    public static final String cfr_renamed_0;
    public static final int cfr_renamed_1 = 5;
    public static final String cfr_renamed_2;
    public static final int cfr_renamed_3 = 6;
    public static final String cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_7290(sprjgm arg0, sprgak arg1, Date arg2, Date arg3, X509Certificate arg4, X509Certificate arg5, PublicKey arg6, sprahg arg7, sprdog arg8, List arg9, sprrr arg10) throws sprglg, sprmmg {
        Iterator iterator;
        if (arg3.getTime() > arg2.getTime()) {
            throw new sprglg(sprsra.cfr_renamed_9("=\u0000\u0007\b\u000f\u0000\u001f\b\u0004\u000fK\u0015\u0002\f\u000eA\u0002\u0012K\b\u0005A\r\u0014\u001f\u0014\u0019\u0004E"));
        }
        Set set = sprrjg.cfr_renamed_7292(arg0, arg4, arg3, arg1.cfr_renamed_2283(), arg1.cfr_renamed_7293());
        boolean bl = false;
        sprglg sprglg2 = null;
        Iterator iterator2 = iterator = set.iterator();
        while (iterator2.hasNext() && arg7.cfr_renamed_2161() == 11 && !arg8.cfr_renamed_2162()) {
            try {
                Set<String> set2;
                X509CRL x509CRL = (X509CRL)iterator.next();
                sprdog sprdog2 = sprxkg.cfr_renamed_7294(x509CRL, arg0);
                if (!sprdog2.cfr_renamed_7295(arg8)) {
                    iterator2 = iterator;
                }
                X509CRL x509CRL2 = x509CRL;
                PublicKey publicKey = sprxkg.cfr_renamed_2168(x509CRL2, sprxkg.cfr_renamed_7296(x509CRL2, arg4, arg5, arg6, arg1, arg9, arg10));
                X509CRL x509CRL3 = null;
                if (arg1.cfr_renamed_391()) {
                    set2 = sprrjg.cfr_renamed_7297(arg3, x509CRL, arg1.cfr_renamed_2283(), arg1.cfr_renamed_7293());
                    x509CRL3 = sprxkg.cfr_renamed_2170(set2, publicKey);
                }
                if (arg1.cfr_renamed_376() != 1 && arg4.getNotAfter().getTime() < x509CRL.getThisUpdate().getTime()) {
                    throw new sprglg(sprqve.cfr_renamed_9("\u0019MwT6N>Fwa\u0005nwD8PwA\"P%G9VwV>O2\u00021M\"L3\f"));
                }
                X509Certificate x509Certificate = arg4;
                sprxkg.cfr_renamed_7298(arg0, x509Certificate, x509CRL);
                sprxkg.cfr_renamed_7299(arg0, x509Certificate, x509CRL);
                X509CRL x509CRL4 = x509CRL;
                sprxkg.cfr_renamed_7300(x509CRL3, x509CRL4, arg1);
                Date date = arg3;
                sprxkg.cfr_renamed_7301(date, x509CRL3, arg4, arg7, arg1);
                sprxkg.cfr_renamed_7302(date, x509CRL4, arg4, arg7);
                if (arg7.cfr_renamed_2161() == 8) {
                    arg7.cfr_renamed_2164(11);
                }
                arg8.cfr_renamed_7303(sprdog2);
                set2 = x509CRL.getCriticalExtensionOIDs();
                if (set2 != null) {
                    Set<String> set3 = set2 = new HashSet<String>(set2);
                    set2.remove(sprrdm.cfr_renamed_96.cfr_renamed_19());
                    set3.remove(sprrdm.cfr_renamed_4.cfr_renamed_19());
                    if (!set3.isEmpty()) {
                        throw new sprglg(sprsra.cfr_renamed_9("(3'A\b\u000e\u0005\u0015\n\b\u0005\u0012K\u0014\u0005\u0012\u001e\u0011\u001b\u000e\u0019\u0015\u000e\u0005K\u0002\u0019\b\u001f\b\b\u0000\u0007A\u000e\u0019\u001f\u0004\u0005\u0012\u0002\u000e\u0005\u0012E"));
                    }
                }
                if (x509CRL3 != null && (set2 = x509CRL3.getCriticalExtensionOIDs()) != null) {
                    Set<String> set4 = set2 = new HashSet<String>(set2);
                    set2.remove(sprrdm.cfr_renamed_96.cfr_renamed_19());
                    set4.remove(sprrdm.cfr_renamed_4.cfr_renamed_19());
                    if (!set4.isEmpty()) {
                        throw new sprglg(sprqve.cfr_renamed_9("\u0013G;V6\u0002\u0014p\u001b\u00024M9V6K9QwW9Q\"R'M%V2FwA%K#K4C;\u00022Z#G9Q>M9\f"));
                    }
                }
                bl = true;
                iterator2 = iterator;
            }
            catch (sprglg sprglg3) {
                sprglg2 = sprglg3;
                iterator2 = iterator;
            }
        }
        if (!bl) {
            throw sprglg2;
        }
    }

    public static void cfr_renamed_7301(Date arg0, X509CRL arg1, Object arg2, sprahg arg3, sprgak arg4) throws sprglg {
        if (arg4.cfr_renamed_391() && arg1 != null) {
            sprrjg.cfr_renamed_7304(arg0, arg1, arg2, arg3);
        }
    }

    static {
        cfr_renamed_4 = sprrdm.cfr_renamed_96.cfr_renamed_19();
        cfr_renamed_2 = sprrdm.cfr_renamed_957.cfr_renamed_19();
        cfr_renamed_91 = sprrdm.cfr_renamed_4.cfr_renamed_19();
        cfr_renamed_119 = sprrdm.cfr_renamed_133.cfr_renamed_19();
        cfr_renamed_0 = sprrdm.cfr_renamed_105.cfr_renamed_19();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static PublicKey cfr_renamed_2168(X509CRL arg0, Set arg1) throws sprglg {
        Iterator iterator;
        Exception exception = null;
        Iterator iterator2 = iterator = arg1.iterator();
        while (true) {
            if (!iterator2.hasNext()) {
                throw new sprglg(sprsra.cfr_renamed_9("\"\n\u000f\u0005\u000e\u001fA\u001d\u0004\u0019\b\r\u0018K\"9-E"), exception);
            }
            PublicKey publicKey = (PublicKey)iterator.next();
            try {
                arg0.verify(publicKey);
                return publicKey;
            }
            catch (Exception exception2) {
                exception = exception2;
                iterator2 = iterator;
                continue;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set[] cfr_renamed_7305(sprgak arg0, Date arg1, Date arg2, X509Certificate arg3, X509CRL arg4) throws sprglg {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        x509CRLSelector.setCertificateChecking(arg3);
        try {
            x509CRLSelector.addIssuerName(arg4.getIssuerX500Principal().getEncoded());
        }
        catch (IOException iOException) {
            throw new sprglg(new StringBuilder().insert(0, sprqve.cfr_renamed_9("a6L9M#\u00022Z#P6A#\u0002>Q$W2PwD%M:\u0002\u0014p\u001b\f")).append(iOException).toString(), iOException);
        }
        sprlxj<? extends CRL> sprlxj2 = new sprwck(x509CRLSelector).cfr_renamed_167(true).cfr_renamed_1451();
        Set set = sprgkg.cfr_renamed_7277(sprlxj2, arg2, arg0.cfr_renamed_2283(), arg0.cfr_renamed_7293());
        HashSet hashSet = new HashSet();
        if (arg0.cfr_renamed_391()) {
            try {
                hashSet.addAll(sprrjg.cfr_renamed_7297(arg2, arg4, arg0.cfr_renamed_2283(), arg0.cfr_renamed_7293()));
            }
            catch (sprglg sprglg2) {
                throw new sprglg(sprsra.cfr_renamed_9(".\u0019\b\u0004\u001b\u0015\u0002\u000e\u0005A\u0004\u0003\u001f\u0000\u0002\u000f\u0002\u000f\fA\u000f\u0004\u0007\u0015\nA(3'\u0012E"), sprglg2);
            }
        }
        Set[] setArray = new Set[2];
        setArray[0] = set;
        setArray[1] = hashSet;
        return setArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_7300(X509CRL arg0, X509CRL arg1, sprgak arg2) throws sprglg {
        block15: {
            boolean bl;
            block18: {
                boolean bl2;
                block17: {
                    sprwzl sprwzl2;
                    sprwzl sprwzl3;
                    block16: {
                        if (arg0 == null) {
                            return;
                        }
                        sprwzl3 = null;
                        try {
                            sprwzl3 = sprwzl.cfr_renamed_23(sprrjg.cfr_renamed_7275(arg1, sprrdm.cfr_renamed_96));
                        }
                        catch (Exception exception) {
                            throw new sprglg(sprqve.cfr_renamed_9(">Q$W>L0\u00023K$V%K5W#K8LwR8K9VwG/V2L$K8LwA8W;FwL8Vw@2\u00023G4M3G3\f"), exception);
                        }
                        if (!arg2.cfr_renamed_391()) break block15;
                        if (!arg0.getIssuerX500Principal().equals(arg1.getIssuerX500Principal())) {
                            throw new sprglg(sprsra.cfr_renamed_9("\b\u000e\u0006\u0011\u0007\u0004\u001f\u0004K\"9-K\b\u0018\u0012\u001e\u0004\u0019A\u000f\u000e\u000e\u0012K\u000f\u0004\u0015K\f\n\u0015\b\tK\u0005\u000e\r\u001f\u0000K\"9-K\b\u0018\u0012\u001e\u0004\u0019"));
                        }
                        sprwzl2 = null;
                        try {
                            sprwzl2 = sprwzl.cfr_renamed_23(sprrjg.cfr_renamed_7275(arg0, sprrdm.cfr_renamed_96));
                        }
                        catch (Exception exception) {
                            throw new sprglg(sprqve.cfr_renamed_9("k$Q\"K9EwF>Q#P>@\"V>M9\u0002'M>L#\u00022Z#G9Q>M9\u00021P8OwF2N#Cwa\u0005nwA8W;FwL8Vw@2\u00023G4M3G3\f"), exception);
                        }
                        bl2 = false;
                        if (sprwzl3 != null) break block16;
                        if (sprwzl2 != null) break block17;
                        bl = bl2 = true;
                        break block18;
                    }
                    if (sprwzl3.equals(sprwzl2)) {
                        bl2 = true;
                    }
                }
                bl = bl2;
            }
            if (!bl) {
                throw new sprglg(sprsra.cfr_renamed_9("(\u0018\u0012\u001e\b\u0005\u0006K\u0005\u0002\u0012\u001f\u0013\u0002\u0003\u001e\u0015\u0002\u000e\u0005A\u001b\u000e\u0002\u000f\u001fA\u000e\u0019\u001f\u0004\u0005\u0012\u0002\u000e\u0005A\r\u0013\u0004\fK\u0005\u000e\r\u001f\u0000K\"9-K\u0000\u0005\u0005K\u0002\u0004\f\u001b\r\u000e\u0015\u000eA(3'A\u000f\u000e\u000e\u0012K\u000f\u0004\u0015K\f\n\u0015\b\tE"));
            }
            sprxgf sprxgf2 = null;
            try {
                sprxgf2 = sprrjg.cfr_renamed_7275(arg1, sprrdm.cfr_renamed_105);
            }
            catch (sprglg sprglg2) {
                throw new sprglg(sprqve.cfr_renamed_9("\u0016W#J8P>V.\u0002<G.\u0002>F2L#K1K2PwG/V2L$K8LwA8W;FwL8Vw@2\u00022Z#P6A#G3\u00021P8OwA8O'N2V2\u0002\u0014p\u001b\f"), sprglg2);
            }
            sprxgf sprxgf3 = null;
            try {
                sprxgf3 = sprrjg.cfr_renamed_7275(arg0, sprrdm.cfr_renamed_105);
            }
            catch (sprglg sprglg3) {
                throw new sprglg(sprsra.cfr_renamed_9("*\u0014\u001f\t\u0004\u0013\u0002\u0015\u0012A\u0000\u0004\u0012A\u0002\u0005\u000e\u000f\u001f\b\r\b\u000e\u0013K\u0004\u0013\u0015\u000e\u000f\u0018\b\u0004\u000fK\u0002\u0004\u0014\u0007\u0005K\u000f\u0004\u0015K\u0003\u000eA\u000e\u0019\u001f\u0013\n\u0002\u001f\u0004\u000fA\r\u0013\u0004\fK\u0005\u000e\r\u001f\u0000K\"9-E"), sprglg3);
            }
            if (sprxgf2 == null) {
                throw new sprglg(sprqve.cfr_renamed_9("a\u0005nwC\"V?M%K#[wI2[wK3G9V>D>G%\u0002>QwL\"N;\f"));
            }
            if (sprxgf3 == null) {
                throw new sprglg(sprsra.cfr_renamed_9("/\u0004\u0007\u0015\nA(3'A\n\u0014\u001f\t\u0004\u0013\u0002\u0015\u0012A\u0000\u0004\u0012A\u0002\u0005\u000e\u000f\u001f\b\r\b\u000e\u0013K\b\u0018A\u0005\u0014\u0007\rE"));
            }
            if (!sprxgf2.cfr_renamed_5078(sprxgf3)) {
                throw new sprglg(sprqve.cfr_renamed_9("\u0013G;V6\u0002\u0014p\u001b\u00026W#J8P>V.\u0002<G.\u0002>F2L#K1K2PwF8G$\u00029M#\u0002:C#A?\u00024M:R;G#Gwa\u0005nwC\"V?M%K#[wI2[wK3G9V>D>G%\f"));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static X509CRL cfr_renamed_2170(Set arg0, PublicKey arg1) throws sprglg {
        Iterator iterator;
        Exception exception = null;
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            X509CRL x509CRL = (X509CRL)iterator.next();
            try {
                x509CRL.verify(arg1);
                return x509CRL;
            }
            catch (Exception exception2) {
                exception = exception2;
                iterator2 = iterator;
            }
        }
        if (exception != null) {
            throw new sprglg(sprsra.cfr_renamed_9("\"\n\u000f\u0005\u000e\u001fA\u001d\u0004\u0019\b\r\u0018K\u0005\u000e\r\u001f\u0000K\"9-E"), exception);
        }
        return null;
    }

    public static void cfr_renamed_7302(Date arg0, X509CRL arg1, Object arg2, sprahg arg3) throws sprglg {
        if (arg3.cfr_renamed_2161() == 11) {
            sprrjg.cfr_renamed_7304(arg0, arg1, arg2, arg3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set cfr_renamed_7306(sprgak arg0, Date arg1, X509Certificate arg2, X509CRL arg3) throws sprglg {
        HashSet hashSet = new HashSet();
        if (arg0.cfr_renamed_391()) {
            sprvcm sprvcm2;
            sprvcm sprvcm3 = null;
            try {
                sprvcm3 = sprvcm.cfr_renamed_23(sprrjg.cfr_renamed_7275(arg2, sprrdm.cfr_renamed_957));
            }
            catch (sprglg sprglg2) {
                throw new sprglg(sprqve.cfr_renamed_9("d%G$J2Q#\u0002\u0014p\u001b\u00022Z#G9Q>M9\u00024M\"N3\u00029M#\u00025GwF2A8F2FwD%M:\u00024G%V>D>A6V2\f"), sprglg2);
            }
            if (sprvcm3 == null) {
                try {
                    sprvcm2 = sprvcm3 = sprvcm.cfr_renamed_23(sprrjg.cfr_renamed_7275(arg3, sprrdm.cfr_renamed_957));
                }
                catch (sprglg sprglg3) {
                    throw new sprglg(sprsra.cfr_renamed_9("-\u0013\u000e\u0012\u0003\u0004\u0018\u0015K\"9-K\u0004\u0013\u0015\u000e\u000f\u0018\b\u0004\u000fK\u0002\u0004\u0014\u0007\u0005K\u000f\u0004\u0015K\u0003\u000eA\u000f\u0004\b\u000e\u000f\u0004\u000fA\r\u0013\u0004\fK\"9-E"), sprglg3);
                }
            } else {
                sprvcm2 = sprvcm3;
            }
            if (sprvcm2 != null) {
                ArrayList<sprkl> arrayList = new ArrayList<sprkl>();
                arrayList.addAll(arg0.cfr_renamed_7293());
                try {
                    arrayList.addAll(sprrjg.cfr_renamed_7269(sprvcm3, arg0.cfr_renamed_7289()));
                }
                catch (sprglg sprglg4) {
                    throw new sprglg(sprqve.cfr_renamed_9("\u0019MwL2UwF2N#Cwa\u0005nwN8A6V>M9QwA8W;Fw@2\u00026F3G3\u00021P8Owd%G$J2Q#\u0002\u0014p\u001b\u00022Z#G9Q>M9\f"), sprglg4);
                }
                {
                    hashSet.addAll(sprrjg.cfr_renamed_7297(arg1, arg3, arg0.cfr_renamed_2283(), arrayList));
                }
                return hashSet;
            }
        }
        return hashSet;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprdog cfr_renamed_7294(X509CRL arg0, sprjgm arg1) throws sprglg {
        sprdog sprdog2;
        sprwzl sprwzl2;
        sprdog sprdog3;
        sprwzl sprwzl3 = null;
        try {
            sprwzl3 = sprwzl.cfr_renamed_23(sprrjg.cfr_renamed_7275(arg0, sprrdm.cfr_renamed_96));
        }
        catch (Exception exception) {
            throw new sprglg(sprqve.cfr_renamed_9("\u001eQ$W>L0\u00023K$V%K5W#K8LwR8K9VwG/V2L$K8LwA8W;FwL8Vw@2\u00023G4M3G3\f"), exception);
        }
        if (sprwzl3 != null && sprwzl3.cfr_renamed_2203() != null && arg1.cfr_renamed_2204() != null) {
            return new sprdog(arg1.cfr_renamed_2204()).cfr_renamed_7307(new sprdog(sprwzl3.cfr_renamed_2203()));
        }
        if ((sprwzl3 == null || sprwzl3.cfr_renamed_2203() == null) && arg1.cfr_renamed_2204() == null) {
            return sprdog.cfr_renamed_3;
        }
        if (arg1.cfr_renamed_2204() == null) {
            sprdog3 = sprdog.cfr_renamed_3;
            sprwzl2 = sprwzl3;
        } else {
            sprdog3 = new sprdog(arg1.cfr_renamed_2204());
            sprwzl2 = sprwzl3;
        }
        if (sprwzl2 == null) {
            sprdog2 = sprdog.cfr_renamed_3;
            return sprdog3.cfr_renamed_7307(sprdog2);
        }
        sprdog2 = new sprdog(sprwzl3.cfr_renamed_2203());
        return sprdog3.cfr_renamed_7307(sprdog2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Set cfr_renamed_7296(X509CRL arg0, Object arg1, X509Certificate arg2, PublicKey arg3, sprgak arg4, List arg5, sprrr arg6) throws sprglg {
        int n;
        Object object;
        Object object2;
        Object object3;
        Serializable serializable;
        Object object4;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            object4 = arg0.getIssuerX500Principal().getEncoded();
            x509CertSelector.setSubject((byte[])object4);
        }
        catch (IOException iOException) {
            throw new sprglg(sprsra.cfr_renamed_9("\u0018\u0014\t\u000b\u000e\u0002\u001fA\b\u0013\u0002\u0015\u000e\u0013\u0002\u0000K\u0007\u0004\u0013K\u0002\u000e\u0013\u001f\b\r\b\b\u0000\u001f\u0004K\u0012\u000e\r\u000e\u0002\u001f\u000e\u0019A\u001f\u000eK\u0007\u0002\u000f\u000fA\u0002\u0012\u0018\u0014\u000e\u0013K\u0002\u000e\u0013\u001f\b\r\b\b\u0000\u001f\u0004K\u0007\u0004\u0013K\"9-K\u0002\u0004\u0014\u0007\u0005K\u000f\u0004\u0015K\u0003\u000eA\u0018\u0004\u001f"), iOException);
        }
        object4 = new sprddk(x509CertSelector).cfr_renamed_1451();
        LinkedHashSet<X509Certificate> linkedHashSet = new LinkedHashSet<X509Certificate>();
        try {
            sprrjg.cfr_renamed_7308(linkedHashSet, (sprexj)object4, arg4.cfr_renamed_7309());
            sprrjg.cfr_renamed_7308(linkedHashSet, (sprexj)object4, arg4.cfr_renamed_2283());
        }
        catch (sprglg sprglg2) {
            throw new sprglg(sprqve.cfr_renamed_9("\u001eQ$W2PwA2P#K1K4C#GwD8Pwa\u0005nwA6L9M#\u00025GwQ2C%A?G3\f"), sprglg2);
        }
        linkedHashSet.add(arg2);
        ArrayList<Serializable> arrayList = new ArrayList<Serializable>();
        ArrayList<PublicKey> arrayList2 = new ArrayList<PublicKey>();
        Iterator iterator = linkedHashSet.iterator();
        block8: while (true) {
            Iterator iterator2 = iterator;
            while (iterator2.hasNext()) {
                serializable = (X509Certificate)iterator.next();
                if (((Certificate)serializable).equals(arg2)) {
                    iterator2 = iterator;
                    arrayList.add(serializable);
                    arrayList2.add(arg3);
                    continue;
                }
                try {
                    object3 = arg6.cfr_renamed_7310(sprsra.cfr_renamed_9("1 (3"));
                    X509CertSelector x509CertSelector2 = new X509CertSelector();
                    x509CertSelector2.setCertificate((X509Certificate)serializable);
                    Object object5 = object2 = new sprmdk(arg4).cfr_renamed_7311(new sprddk(x509CertSelector2).cfr_renamed_1451());
                    if (arg5.contains(serializable)) {
                        ((sprmdk)object5).cfr_renamed_7312(false);
                    } else {
                        ((sprmdk)object5).cfr_renamed_7312(true);
                    }
                    object = new spritj(((sprmdk)object2).cfr_renamed_1451()).cfr_renamed_1451();
                    List<? extends Certificate> list = ((CertPathBuilder)object3).build((CertPathParameters)object).getCertPath().getCertificates();
                    arrayList.add(serializable);
                    arrayList2.add(sprrjg.cfr_renamed_7313(list, 0, arg6));
                }
                catch (CertPathBuilderException certPathBuilderException) {
                    throw new sprglg(sprqve.cfr_renamed_9("a2P#r6V?\u00021M%\u0002\u0014p\u001b\u0002$K0L2PwD6K;G3\u0002#MwT6N>F6V2\f"), certPathBuilderException);
                }
                catch (CertPathValidatorException certPathValidatorException) {
                    throw new sprglg(sprsra.cfr_renamed_9(";\u0014\t\r\u0002\u0002K\n\u000e\u0018K\u000e\rA\u0002\u0012\u0018\u0014\u000e\u0013K\u0002\u000e\u0013\u001f\b\r\b\b\u0000\u001f\u0004K\u000e\rA(3'A\b\u000e\u001e\r\u000fA\u0005\u000e\u001fA\t\u0004K\u0013\u000e\u0015\u0019\b\u000e\u0017\u000e\u0005E"), certPathValidatorException);
                }
                catch (Exception exception) {
                    throw new sprglg(exception.getMessage());
                }
                continue block8;
            }
            break;
        }
        serializable = new HashSet();
        object3 = null;
        int n2 = n = 0;
        while (n2 < arrayList.size()) {
            object2 = (X509Certificate)arrayList.get(n);
            object = ((X509Certificate)object2).getKeyUsage();
            if (!(object == null || ((boolean[])object).length > 6 && object[6])) {
                object3 = new sprglg(sprqve.cfr_renamed_9("k$Q\"G%\u00024G%V>D>A6V2\u0002<G.\u0002\"Q6E2\u00022Z#G9Q>M9\u00023M2QwL8VwR2P:K#\u0002\u0014p\u001b\u0002$K0L>L0\f"));
            } else {
                serializable.add(arrayList2.get(n));
            }
            n2 = ++n;
        }
        if (serializable.isEmpty() && object3 == null) {
            throw new sprglg(sprsra.cfr_renamed_9("(\u0000\u0005\u000f\u0004\u0015K\u0007\u0002\u000f\u000fA\nA\u001d\u0000\u0007\b\u000fA\u0002\u0012\u0018\u0014\u000e\u0013K\u0002\u000e\u0013\u001f\b\r\b\b\u0000\u001f\u0004E"));
        }
        if (serializable.isEmpty() && object3 != null) {
            throw object3;
        }
        return serializable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_7299(sprjgm arg0, Object arg1, X509CRL arg2) throws sprglg {
        block31: {
            sprqqe sprqqe2;
            sprwzl sprwzl2;
            block32: {
                boolean bl;
                block30: {
                    int n;
                    int n2;
                    sprigm[] sprigmArray;
                    boolean bl2;
                    ArrayList<sprigm> arrayList;
                    block36: {
                        boolean bl3;
                        block29: {
                            int n3;
                            sprigm[] sprigmArray2;
                            block34: {
                                int n4;
                                block35: {
                                    block33: {
                                        Object object;
                                        sprwzl2 = null;
                                        try {
                                            sprwzl2 = sprwzl.cfr_renamed_23(sprrjg.cfr_renamed_7275(arg2, sprrdm.cfr_renamed_96));
                                        }
                                        catch (Exception exception) {
                                            throw new sprglg(sprqve.cfr_renamed_9("\u001eQ$W>L0\u00023K$V%K5W#K8LwR8K9VwG/V2L$K8LwA8W;FwL8Vw@2\u00023G4M3G3\f"), exception);
                                        }
                                        if (sprwzl2 == null) break block31;
                                        if (sprwzl2.cfr_renamed_323() == null) break block32;
                                        sprqqe2 = sprwzl.cfr_renamed_23(sprwzl2).cfr_renamed_323();
                                        arrayList = new ArrayList<sprigm>();
                                        if (((sprhhm)sprqqe2).cfr_renamed_324() == 0) {
                                            int n5;
                                            object = spraem.cfr_renamed_23(((sprhhm)sprqqe2).cfr_renamed_313()).cfr_renamed_289();
                                            int n6 = n5 = 0;
                                            while (n6 < ((sprigm[])object).length) {
                                                arrayList.add(object[n5++]);
                                                n6 = n5;
                                            }
                                        }
                                        if (((sprhhm)sprqqe2).cfr_renamed_324() == 1) {
                                            object = new sprrvm();
                                            try {
                                                Enumeration enumeration = sprszm.cfr_renamed_23(arg2.getIssuerX500Principal().getEncoded()).cfr_renamed_329();
                                                while (enumeration.hasMoreElements()) {
                                                    ((sprrvm)object).cfr_renamed_5004((sprco)enumeration.nextElement());
                                                }
                                            }
                                            catch (Exception exception) {
                                                throw new sprglg(sprsra.cfr_renamed_9("\"\u0004\u0014\u0007\u0005K\u000f\u0004\u0015K\u0013\u000e\u0000\u000fA(3'A\u0002\u0012\u0018\u0014\u000e\u0013E"), exception);
                                            }
                                            ((sprrvm)object).cfr_renamed_5004(((sprhhm)sprqqe2).cfr_renamed_313());
                                            arrayList.add(new sprigm(sprnbm.cfr_renamed_23(new sprcen((sprrvm)object))));
                                        }
                                        bl2 = false;
                                        if (arg0.cfr_renamed_323() == null) break block33;
                                        sprqqe2 = arg0.cfr_renamed_323();
                                        sprigmArray2 = null;
                                        if (((sprhhm)sprqqe2).cfr_renamed_324() == 0) {
                                            sprigmArray2 = spraem.cfr_renamed_23(((sprhhm)sprqqe2).cfr_renamed_313()).cfr_renamed_289();
                                        }
                                        if (((sprhhm)sprqqe2).cfr_renamed_324() != 1) break block34;
                                        if (arg0.cfr_renamed_2186() != null) {
                                            sprigmArray2 = arg0.cfr_renamed_2186().cfr_renamed_289();
                                        } else {
                                            sprigmArray2 = new sprigm[1];
                                            try {
                                                sprigmArray2[0] = new sprigm(sprnbm.cfr_renamed_23(((X509Certificate)arg1).getIssuerX500Principal().getEncoded()));
                                            }
                                            catch (Exception exception) {
                                                throw new sprglg(sprqve.cfr_renamed_9("\u0014M\"N3\u00029M#\u0002%G6FwA2P#K1K4C#GwK$Q\"G%\f"), exception);
                                            }
                                        }
                                        n4 = n3 = 0;
                                        break block35;
                                    }
                                    if (arg0.cfr_renamed_2186() == null) {
                                        throw new sprglg(sprqve.cfr_renamed_9("g>V?G%\u0002#J2\u00024p\u001bk$Q\"G%\u00028PwV?GwF>Q#P>@\"V>M9r8K9VwD>G;FwO\"Q#\u00025GwA8L#C>L2FwK9\u0002\u0013K$V%K5W#K8L\u0007M>L#\f"));
                                    }
                                    sprigmArray = arg0.cfr_renamed_2186().cfr_renamed_289();
                                    n = n2 = 0;
                                    break block36;
                                }
                                while (n4 < sprigmArray2.length) {
                                    Enumeration enumeration = sprszm.cfr_renamed_23(sprigmArray2[n3].cfr_renamed_313().cfr_renamed_119()).cfr_renamed_329();
                                    sprrvm sprrvm2 = new sprrvm();
                                    Enumeration enumeration2 = enumeration;
                                    while (enumeration2.hasMoreElements()) {
                                        sprrvm2.cfr_renamed_5004((sprco)enumeration.nextElement());
                                        enumeration2 = enumeration;
                                    }
                                    sprrvm2.cfr_renamed_5004(((sprhhm)sprqqe2).cfr_renamed_313());
                                    sprigmArray2[n3++] = new sprigm(sprnbm.cfr_renamed_23(new sprcen(sprrvm2)));
                                    n4 = n3;
                                }
                            }
                            if (sprigmArray2 != null) {
                                int n7 = n3 = 0;
                                while (n7 < sprigmArray2.length) {
                                    if (arrayList.contains(sprigmArray2[n3])) {
                                        bl3 = bl2 = true;
                                        break block29;
                                    }
                                    n7 = ++n3;
                                }
                            }
                            bl3 = bl2;
                        }
                        if (!bl3) {
                            throw new sprglg(sprsra.cfr_renamed_9("%\u000eK\f\n\u0015\b\tK\u0007\u0004\u0013K\u0002\u000e\u0013\u001f\b\r\b\b\u0000\u001f\u0004K\"9-K\b\u0018\u0012\u001e\b\u0005\u0006K\u0005\u0002\u0012\u001f\u0013\u0002\u0003\u001e\u0015\u0002\u000e\u0005A\u001b\u000e\u0002\u000f\u001fA\u0005\u0000\u0006\u0004K\u0015\u0004A\b3'(\u0018\u0012\u001e\u0004\u0019A(3'A\u000f\b\u0018\u0015\u0019\b\t\u0014\u001f\b\u0004\u000fK\u0011\u0004\b\u0005\u0015E"));
                        }
                        break block32;
                    }
                    while (n < sprigmArray.length) {
                        if (arrayList.contains(sprigmArray[n2])) {
                            bl = bl2 = true;
                            break block30;
                        }
                        n = ++n2;
                    }
                    bl = bl2;
                }
                if (!bl) {
                    throw new sprglg(sprsra.cfr_renamed_9("%\u000eK\f\n\u0015\b\tK\u0007\u0004\u0013K\u0002\u000e\u0013\u001f\b\r\b\b\u0000\u001f\u0004K\"9-K\b\u0018\u0012\u001e\b\u0005\u0006K\u0005\u0002\u0012\u001f\u0013\u0002\u0003\u001e\u0015\u0002\u000e\u0005A\u001b\u000e\u0002\u000f\u001fA\u0005\u0000\u0006\u0004K\u0015\u0004A\b3'(\u0018\u0012\u001e\u0004\u0019A(3'A\u000f\b\u0018\u0015\u0019\b\t\u0014\u001f\b\u0004\u000fK\u0011\u0004\b\u0005\u0015E"));
                }
            }
            sprqqe2 = null;
            try {
                sprqqe2 = sprbcm.cfr_renamed_23(sprrjg.cfr_renamed_7275((X509Extension)arg1, sprrdm.cfr_renamed_133));
            }
            catch (Exception exception) {
                throw new sprglg(sprqve.cfr_renamed_9("`6Q>AwA8L$V%C>L#QwG/V2L$K8LwA8W;FwL8Vw@2\u00023G4M3G3\f"), exception);
            }
            if (arg1 instanceof X509Certificate) {
                if (sprwzl2.cfr_renamed_306() && sprqqe2 != null && ((sprbcm)sprqqe2).cfr_renamed_296()) {
                    throw new sprglg(sprsra.cfr_renamed_9("\"*A(\u0004\u0019\u0015K\"9-K\u000e\u0005\r\u0012A\b\u000e\u0005\u0015\n\b\u0005\u0012K\u0014\u0018\u0004\u0019A\b\u0004\u0019\u0015\u0002\u0007\u0002\u0002\n\u0015\u000e\u0012E"));
                }
                if (sprwzl2.cfr_renamed_307() && (sprqqe2 == null || !((sprbcm)sprqqe2).cfr_renamed_296())) {
                    throw new sprglg(sprqve.cfr_renamed_9("\u0012L3\u0002\u0014p\u001b\u00028L;[wA8L#C>L$\u0002\u0014cwA2P#K1K4C#G$\f"));
                }
            }
            if (sprwzl2.cfr_renamed_308()) {
                throw new sprglg(sprsra.cfr_renamed_9("\u0004\u000f\u0007\u0018(\u000e\u0005\u0015\n\b\u0005\u0012*\u0015\u001f\u0013\u0002\u0003\u001e\u0015\u000e\"\u000e\u0013\u001f\u0012K\u0003\u0004\u000e\u0007\u0004\n\u000fK\b\u0018A\n\u0012\u0018\u0004\u0019\u0015\u000e\u0005E"));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_7298(sprjgm arg0, Object arg1, X509CRL arg2) throws sprglg {
        sprxgf sprxgf2 = sprrjg.cfr_renamed_7275(arg2, sprrdm.cfr_renamed_96);
        boolean bl = false;
        if (sprxgf2 != null && sprwzl.cfr_renamed_23(sprxgf2).cfr_renamed_2131()) {
            bl = true;
        }
        byte[] byArray = arg2.getIssuerX500Principal().getEncoded();
        boolean bl2 = false;
        if (arg0.cfr_renamed_2186() == null) {
            if (arg2.getIssuerX500Principal().equals(((X509Certificate)arg1).getIssuerX500Principal())) {
                return;
            }
        } else {
            int n;
            sprigm[] sprigmArray = arg0.cfr_renamed_2186().cfr_renamed_289();
            int n2 = n = 0;
            while (n2 < sprigmArray.length) {
                if (sprigmArray[n].cfr_renamed_312() == 4) {
                    try {
                        if (sproze.cfr_renamed_92(sprigmArray[n].cfr_renamed_313().cfr_renamed_119().cfr_renamed_91(), byArray)) {
                            bl2 = true;
                        }
                    }
                    catch (IOException iOException) {
                        throw new sprglg(sprqve.cfr_renamed_9("a\u0005nwK$Q\"G%\u0002>L1M%O6V>M9\u00021P8OwF>Q#P>@\"V>M9\u0002'M>L#\u00024C9L8Vw@2\u00023G4M3G3\f"), iOException);
                    }
                }
                n2 = ++n;
            }
            if (bl2 && !bl) {
                throw new sprglg(sprsra.cfr_renamed_9("%\u0002\u0012\u001f\u0013\u0002\u0003\u001e\u0015\u0002\u000e\u0005A\u001b\u000e\u0002\u000f\u001fA\b\u000e\u0005\u0015\n\b\u0005\u0012K\u00029-\"\u0012\u0018\u0014\u000e\u0013K\u0007\u0002\u0004\u0007\u0005K\u0003\u001e\u0015K\"9-K\b\u0018A\u0005\u000e\u001fA\u0002\u000f\u000f\b\u0019\u0004\b\u0015E"));
            }
            if (!bl2) {
                throw new sprglg(sprqve.cfr_renamed_9("\u0014p\u001b\u0002>Q$W2PwM1\u0002\u0014p\u001b\u00023M2QwL8VwO6V4Jwa\u0005nwK$Q\"G%\u00028DwF>Q#P>@\"V>M9\u0002'M>L#\f"));
            }
        }
        if (bl2) return;
        throw new sprglg(sprsra.cfr_renamed_9("\"\n\u000f\u0005\u000e\u001fA\r\b\u0005\u0005K\f\n\u0015\b\t\u0002\u000f\fA(3'A\u0002\u0012\u0018\u0014\u000e\u0013K\u0007\u0004\u0013K\u0002\u000e\u0013\u001f\b\r\b\b\u0000\u001f\u0004E"));
    }
}

