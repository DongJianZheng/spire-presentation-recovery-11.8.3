/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprahg;
import com.spire.presentation.packages.spravo;
import com.spire.presentation.packages.sprdfp;
import com.spire.presentation.packages.sprdog;
import com.spire.presentation.packages.sprgak;
import com.spire.presentation.packages.sprgkg;
import com.spire.presentation.packages.sprglg;
import com.spire.presentation.packages.sprhhm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprjgm;
import com.spire.presentation.packages.sprkgg;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprkl;
import com.spire.presentation.packages.sprlxj;
import com.spire.presentation.packages.sprmdk;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprmmg;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprqgg;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrjg;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprtkg;
import com.spire.presentation.packages.sprtul;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprvcm;
import com.spire.presentation.packages.sprvjg;
import com.spire.presentation.packages.sprwck;
import com.spire.presentation.packages.sprwgg;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.sprxkg;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.x500.X500Principal;

public class sprzhg
extends PKIXCertPathChecker {
    private final long cfr_renamed_114;
    private Date cfr_renamed_96;
    private final sprrr cfr_renamed_105;
    private final Set<TrustAnchor> cfr_renamed_137;
    private final Date cfr_renamed_79;
    private X509Certificate cfr_renamed_107;
    private final int cfr_renamed_132;
    private final boolean cfr_renamed_102;
    private final List<CertStore> cfr_renamed_93;
    private final boolean cfr_renamed_86;
    private X500Principal cfr_renamed_152;
    public static final String[] cfr_renamed_112;
    private static Logger cfr_renamed_119;
    private final Map<X500Principal, Long> cfr_renamed_91;
    private PublicKey cfr_renamed_0;
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 0;
    private final List<sprug<CRL>> cfr_renamed_3;
    private final long cfr_renamed_4;

    static {
        cfr_renamed_119 = Logger.getLogger(sprzhg.class.getName());
        String[] stringArray = new String[11];
        stringArray[0] = sprdfp.cfr_renamed_9("F]@CVPZUZVW");
        stringArray[1] = spravo.cfr_renamed_9("*,8\n.$1;.$(:$");
        stringArray[2] = sprdfp.cfr_renamed_9("Prp\\^CA\\^Z@V");
        stringArray[3] = spravo.cfr_renamed_9("('/(%((5 .'\u0002! '&,%");
        stringArray[4] = sprdfp.cfr_renamed_9("@FCVA@VWVW");
        stringArray[5] = spravo.cfr_renamed_9("*$:2(5 .'\u000e/\u000e9$; =(&/");
        stringArray[6] = sprdfp.cfr_renamed_9("PVAGZUZPRGV{\\_W");
        stringArray[7] = "unknown";
        stringArray[8] = spravo.cfr_renamed_9("3,,&7,\u0007;.$\u0002\u001b\r");
        stringArray[9] = sprdfp.cfr_renamed_9("CAZEZ_VTVdZG[WARD]");
        stringArray[10] = spravo.cfr_renamed_9("(\u0000\n.$1;.$(:$");
        cfr_renamed_112 = stringArray;
    }

    @Override
    public Object clone() {
        return this;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_7268(List<X500Principal> list, sprug<CRL> sprug2) {
        void arg0;
        void arg1;
        arg1.cfr_renamed_3216(new sprvjg(this, (List)arg0));
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
            throw new sprglg(sprdfp.cfr_renamed_9("P\\F_W\u0013]\\G\u0013AVRW\u0013WZ@GAZQFGZ\\]\u0013C\\Z]G@\u0013P\\F_W\u0013]\\G\u0013QV\u0013AVRW"), exception);
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

    @Override
    public void check(Certificate arg0, Collection<String> arg1) throws CertPathValidatorException {
        sprzhg sprzhg2;
        sprmdk sprmdk2;
        int sprgak2;
        sprmdk sprmdk3;
        X509Certificate x509Certificate = (X509Certificate)arg0;
        if (this.cfr_renamed_102 && x509Certificate.getBasicConstraints() != -1) {
            sprzhg sprzhg3 = this;
            X509Certificate x509Certificate2 = x509Certificate;
            this.cfr_renamed_152 = x509Certificate2.getSubjectX500Principal();
            sprzhg3.cfr_renamed_0 = x509Certificate2.getPublicKey();
            sprzhg3.cfr_renamed_107 = x509Certificate;
            return;
        }
        TrustAnchor trustAnchor = null;
        if (this.cfr_renamed_152 == null) {
            this.cfr_renamed_152 = x509Certificate.getIssuerX500Principal();
            for (TrustAnchor object22 : this.cfr_renamed_137) {
                if (!this.cfr_renamed_152.equals(object22.getCA()) && !this.cfr_renamed_152.equals(object22.getTrustedCert().getSubjectX500Principal())) continue;
                trustAnchor = object22;
            }
            if (trustAnchor == null) {
                throw new CertPathValidatorException(new StringBuilder().insert(0, spravo.cfr_renamed_9("'.i5;4:5i '\"!.;a/.</-a/.;a")).append(this.cfr_renamed_152).toString());
            }
            this.cfr_renamed_107 = trustAnchor.getTrustedCert();
            this.cfr_renamed_0 = this.cfr_renamed_107.getPublicKey();
        }
        ArrayList arrayList = new ArrayList();
        try {
            int date;
            PKIXParameters generalSecurityException;
            PKIXParameters pKIXParameters = generalSecurityException = new PKIXParameters(this.cfr_renamed_137);
            pKIXParameters.setRevocationEnabled(false);
            pKIXParameters.setDate(this.cfr_renamed_79);
            int n = date = 0;
            while (n != this.cfr_renamed_93.size()) {
                if (cfr_renamed_119.isLoggable(Level.INFO)) {
                    sprzhg sprzhg4 = this;
                    sprzhg4.cfr_renamed_7270(arrayList, sprzhg4.cfr_renamed_93.get(date));
                }
                generalSecurityException.addCertStore(this.cfr_renamed_93.get(date++));
                n = date;
            }
            sprmdk3 = new sprmdk(generalSecurityException);
            sprmdk3.cfr_renamed_389(this.cfr_renamed_132);
        }
        catch (GeneralSecurityException n) {
            throw new RuntimeException(new StringBuilder().insert(0, sprdfp.cfr_renamed_9("VAA\\A\u0013@VGGZ]T\u0013FC\u0013QR@VcRAR^@\t\u0013")).append(n.getMessage()).toString());
        }
        int n = sprgak2 = 0;
        while (n != this.cfr_renamed_3.size()) {
            if (cfr_renamed_119.isLoggable(Level.INFO)) {
                sprzhg sprzhg5 = this;
                sprzhg5.cfr_renamed_7268(arrayList, sprzhg5.cfr_renamed_3.get(sprgak2));
            }
            sprug<CRL> sprug2 = this.cfr_renamed_3.get(sprgak2);
            sprmdk3.cfr_renamed_7271(new sprkgg(sprug2));
            n = ++sprgak2;
        }
        if (arrayList.isEmpty()) {
            cfr_renamed_119.log(Level.INFO, spravo.cfr_renamed_9("\"&//(.4;$-a>(=)iqi1;$d-& -$-a\n\u0013\u00052"));
            sprmdk2 = sprmdk3;
        } else {
            if (cfr_renamed_119.isLoggable(Level.FINE)) {
                int n2 = sprgak2 = 0;
                while (n2 != arrayList.size()) {
                    StringBuilder stringBuilder = new StringBuilder().insert(0, sprdfp.cfr_renamed_9("P\\]UZTFAZ]T\u0013DZG[\u0013pa\u007f\u0013U\\A\u0013Z@@FVA\u0013\u0011")).append(arrayList.get(sprgak2));
                    cfr_renamed_119.log(Level.FINE, stringBuilder.append(spravo.cfr_renamed_9("c")).toString());
                    n2 = ++sprgak2;
                }
            } else {
                cfr_renamed_119.log(Level.INFO, new StringBuilder().insert(0, sprdfp.cfr_renamed_9("P\\]UZTFAVW\u0013DZG[\u0013")).append(arrayList.size()).append(spravo.cfr_renamed_9("i1;$d-& -$-a\n\u0013\u00052")).toString());
            }
            sprmdk2 = sprmdk3;
        }
        sprgak sprgak3 = sprmdk2.cfr_renamed_1451();
        Date date = sprrjg.cfr_renamed_7272(sprgak3, this.cfr_renamed_79);
        try {
            sprzhg sprzhg6 = this;
            this.cfr_renamed_7273(sprgak3, this.cfr_renamed_96, date, x509Certificate, sprzhg6.cfr_renamed_107, sprzhg6.cfr_renamed_0, new ArrayList(), this.cfr_renamed_105);
            sprzhg2 = this;
        }
        catch (sprglg sprmmg2) {
            throw new CertPathValidatorException(sprmmg2.getMessage(), sprmmg2.getCause());
        }
        catch (sprmmg sprmmg2) {
            Set<CRL> set;
            if (null == x509Certificate.getExtensionValue(sprrdm.cfr_renamed_79.cfr_renamed_19())) {
                throw sprmmg2;
            }
            try {
                set = this.cfr_renamed_7274(x509Certificate.getIssuerX500Principal(), date, sprrjg.cfr_renamed_7275(x509Certificate, sprrdm.cfr_renamed_79), this.cfr_renamed_105);
            }
            catch (sprglg sprglg4) {
                throw new CertPathValidatorException(sprglg4.getMessage(), sprglg4.getCause());
            }
            if (!set.isEmpty()) {
                try {
                    sprmdk3.cfr_renamed_7271(new sprkgg(new sprtul<CRL>(set)));
                    sprgak3 = sprmdk3.cfr_renamed_1451();
                    date = sprrjg.cfr_renamed_7272(sprgak3, this.cfr_renamed_79);
                    sprzhg sprzhg7 = this;
                    sprzhg sprzhg8 = this;
                    sprzhg7.cfr_renamed_7273(sprgak3, sprzhg7.cfr_renamed_96, date, x509Certificate, sprzhg8.cfr_renamed_107, sprzhg8.cfr_renamed_0, new ArrayList(), this.cfr_renamed_105);
                    sprzhg2 = this;
                }
                catch (sprglg x500Principal) {
                    throw new CertPathValidatorException(x500Principal.getMessage(), x500Principal.getCause());
                }
            }
            if (!this.cfr_renamed_86) {
                throw sprmmg2;
            }
            X500Principal x500Principal = x509Certificate.getIssuerX500Principal();
            Long l = this.cfr_renamed_91.get(x500Principal);
            if (l != null) {
                long l2 = System.currentTimeMillis() - l;
                if (this.cfr_renamed_114 != -1L && this.cfr_renamed_114 < l2) {
                    throw sprmmg2;
                }
                if (l2 < this.cfr_renamed_4) {
                    cfr_renamed_119.log(Level.WARNING, new StringBuilder().insert(0, sprdfp.cfr_renamed_9("@\\UG\u0013URZ_Z]T\u0013U\\A\u0013Z@@FVA\t\u0013\u0011")).append(x500Principal).append(spravo.cfr_renamed_9("c")).toString());
                } else {
                    cfr_renamed_119.log(Level.SEVERE, new StringBuilder().insert(0, sprdfp.cfr_renamed_9("@\\UG\u0013URZ_Z]T\u0013U\\A\u0013Z@@FVA\t\u0013\u0011")).append(x500Principal).append(spravo.cfr_renamed_9("c")).toString());
                }
            } else {
                this.cfr_renamed_91.put(x500Principal, System.currentTimeMillis());
            }
            sprzhg2 = this;
        }
        sprzhg2.cfr_renamed_107 = x509Certificate;
        sprzhg sprzhg9 = this;
        sprzhg9.cfr_renamed_0 = x509Certificate.getPublicKey();
        sprzhg9.cfr_renamed_152 = x509Certificate.getSubjectX500Principal();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Set<CRL> cfr_renamed_7274(X500Principal arg0, Date arg1, sprxgf arg2, sprrr arg3) {
        int n;
        CertificateFactory certificateFactory;
        sprjgm[] sprjgmArray = sprvcm.cfr_renamed_23(arg2).cfr_renamed_322();
        try {
            certificateFactory = arg3.cfr_renamed_1550(sprdfp.cfr_renamed_9("k\u001d\u0006\u0003\n"));
        }
        catch (Exception exception) {
            if (cfr_renamed_119.isLoggable(Level.FINE)) {
                cfr_renamed_119.log(Level.FINE, new StringBuilder().insert(0, spravo.cfr_renamed_9("\"&4%%i/&5i\";$(5,a*$;5\u000f *5sa")).append(exception.getMessage()).toString(), exception);
                return null;
            }
            cfr_renamed_119.log(Level.INFO, new StringBuilder().insert(0, sprdfp.cfr_renamed_9("P\\F_W\u0013]\\G\u0013PAVRGV\u0013PVAGuRPG\t\u0013")).append(exception.getMessage()).toString());
            return null;
        }
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        x509CRLSelector.addIssuer(arg0);
        sprlxj<? extends CRL> sprlxj2 = new sprwck(x509CRLSelector).cfr_renamed_1451();
        HashSet<CRL> hashSet = new HashSet<CRL>();
        int n2 = n = 0;
        while (n2 != sprjgmArray.length) {
            sprhhm sprhhm2 = sprjgmArray[n].cfr_renamed_323();
            if (sprhhm2 != null && sprhhm2.cfr_renamed_324() == 0) {
                int n3;
                sprigm[] sprigmArray = spraem.cfr_renamed_23(sprhhm2.cfr_renamed_313()).cfr_renamed_289();
                int n4 = n3 = 0;
                while (n4 != sprigmArray.length) {
                    sprigm sprigm2 = sprigmArray[n3];
                    if (sprigm2.cfr_renamed_312() == 6) {
                        URI uRI = null;
                        try {
                            uRI = new URI(((sprml)((Object)sprigm2.cfr_renamed_313())).cfr_renamed_314());
                            sprkl sprkl2 = sprtkg.cfr_renamed_7276(certificateFactory, this.cfr_renamed_79, uRI);
                            if (sprkl2 != null) {
                                hashSet.addAll(sprgkg.cfr_renamed_7277(sprlxj2, arg1, Collections.EMPTY_LIST, Collections.singletonList(sprkl2)));
                            }
                        }
                        catch (Exception exception) {
                            if (cfr_renamed_119.isLoggable(Level.FINE)) {
                                cfr_renamed_119.log(Level.FINE, new StringBuilder().insert(0, spravo.cfr_renamed_9("\n3%\u0005\u0019a")).append(uRI).append(sprdfp.cfr_renamed_9("\u0013ZT]\\AVW\t\u0013")).append(exception.getMessage()).toString(), exception);
                            }
                            cfr_renamed_119.log(Level.INFO, new StringBuilder().insert(0, spravo.cfr_renamed_9("\n3%\u0005\u0019a")).append(uRI).append(sprdfp.cfr_renamed_9("\u0013ZT]\\AVW\t\u0013")).append(exception.getMessage()).toString());
                        }
                    }
                    n4 = ++n3;
                }
            }
            n2 = ++n;
        }
        return hashSet;
    }

    public /* synthetic */ sprzhg(sprqgg arg0, sprwgg arg1) {
        this(arg0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_7270(List<X500Principal> list, CertStore certStore) throws CertStoreException {
        void arg0;
        void arg1;
        arg1.getCRLs(new sprwgg(this, (List)arg0));
    }

    private /* synthetic */ sprzhg(sprqgg arg0) {
        sprqgg sprqgg2 = arg0;
        sprzhg sprzhg2 = this;
        sprqgg sprqgg3 = arg0;
        sprzhg sprzhg3 = this;
        sprqgg sprqgg4 = arg0;
        sprzhg sprzhg4 = this;
        this.cfr_renamed_91 = new HashMap<X500Principal, Long>();
        sprzhg4.cfr_renamed_3 = new ArrayList<sprug<CRL>>(sprqgg.cfr_renamed_7278(arg0));
        this.cfr_renamed_93 = new ArrayList<CertStore>(sprqgg.cfr_renamed_7279(arg0));
        this.cfr_renamed_102 = sprqgg.cfr_renamed_7280(sprqgg4);
        sprzhg3.cfr_renamed_132 = sprqgg.cfr_renamed_7281(sprqgg4);
        sprzhg3.cfr_renamed_137 = sprqgg.cfr_renamed_7282(arg0);
        this.cfr_renamed_86 = sprqgg.cfr_renamed_7283(sprqgg3);
        sprzhg2.cfr_renamed_4 = sprqgg.cfr_renamed_7284(sprqgg3);
        sprzhg2.cfr_renamed_114 = sprqgg.cfr_renamed_7285(arg0);
        this.cfr_renamed_79 = sprqgg.cfr_renamed_7286(sprqgg2);
        if (sprqgg.cfr_renamed_7287(sprqgg2) != null) {
            this.cfr_renamed_105 = new sprkhi(sprqgg.cfr_renamed_7287(arg0));
            return;
        }
        if (sprqgg.cfr_renamed_7288(arg0) != null) {
            this.cfr_renamed_105 = new sprxil(sprqgg.cfr_renamed_7288(arg0));
            return;
        }
        this.cfr_renamed_105 = new sprrul();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_7273(sprgak arg0, Date arg1, Date arg2, X509Certificate arg3, X509Certificate arg4, PublicKey arg5, List arg6, sprrr arg7) throws sprglg, CertPathValidatorException {
        boolean bl;
        Object object;
        Object object2;
        sprglg sprglg2;
        sprdog sprdog2;
        sprahg sprahg2;
        block20: {
            Object object3;
            sprvcm sprvcm2;
            try {
                sprvcm2 = sprvcm.cfr_renamed_23(sprrjg.cfr_renamed_7275(arg3, sprrdm.cfr_renamed_79));
            }
            catch (Exception exception) {
                throw new sprglg(spravo.cfr_renamed_9("* '/&5i3, -a\n\u0013\u0005a-(:5;(+4=(&/i1&('5i$15,/:(&/"), exception);
            }
            sprahg2 = new sprahg();
            sprdog2 = new sprdog();
            sprglg2 = null;
            boolean bl2 = false;
            if (sprvcm2 != null) {
                try {
                    object2 = sprvcm2.cfr_renamed_322();
                }
                catch (Exception exception) {
                    throw new sprglg(sprdfp.cfr_renamed_9("PR]]\\G\u0013AVRW\u0013WZ@GAZQFGZ\\]\u0013C\\Z]G@"), exception);
                }
                if (object2 != null) {
                    int n;
                    Object object4;
                    object = new sprmdk(arg0);
                    try {
                        object3 = sprzhg.cfr_renamed_7269(sprvcm2, arg0.cfr_renamed_7289());
                        object4 = object3.iterator();
                        while (object4.hasNext()) {
                            ((sprmdk)object).cfr_renamed_7271(object4.next());
                        }
                    }
                    catch (sprglg sprglg3) {
                        throw new sprglg(spravo.cfr_renamed_9("'.i -% 5 .' %a\n\u0013\u0005a%.* =(&/:a*.<--a+$i%,\"&%,%i';.$a\n\u0013\u0005a-(:5;(+4=(&/i1&('5i$15,/:(&/"), sprglg3);
                    }
                    object3 = ((sprmdk)object).cfr_renamed_1451();
                    object4 = sprrjg.cfr_renamed_7272((sprgak)object3, arg1);
                    int n2 = n = 0;
                    while (n2 < ((Object)object2).length && sprahg2.cfr_renamed_2161() == 11 && !sprdog2.cfr_renamed_2162()) {
                        try {
                            sprxkg.cfr_renamed_7290((sprjgm)object2[n], (sprgak)object3, arg1, (Date)object4, arg3, arg4, arg5, sprahg2, sprdog2, arg6, arg7);
                            bl2 = true;
                        }
                        catch (sprglg sprglg4) {
                            sprglg2 = sprglg4;
                        }
                        n2 = ++n;
                    }
                }
            }
            if (sprahg2.cfr_renamed_2161() == 11 && !sprdog2.cfr_renamed_2162()) {
                try {
                    object2 = arg3.getIssuerX500Principal();
                    object = new sprjgm(new sprhhm(0, new spraem(new sprigm(4, sprnbm.cfr_renamed_23(((X500Principal)object2).getEncoded())))), null, null);
                    object3 = (sprgak)arg0.clone();
                    sprxkg.cfr_renamed_7290((sprjgm)object, (sprgak)object3, arg1, arg2, arg3, arg4, arg5, sprahg2, sprdog2, arg6, arg7);
                    bl = bl2 = true;
                    break block20;
                }
                catch (sprglg sprglg5) {
                    sprglg2 = sprglg5;
                }
            }
            bl = bl2;
        }
        if (!bl) {
            if (sprglg2 instanceof sprglg) {
                throw new sprmmg(sprdfp.cfr_renamed_9("]\\\u0013ER_ZW\u0013pa\u007f\u0013U\\F]W"), sprglg2);
            }
            throw new sprmmg(spravo.cfr_renamed_9("'.i7(- %i\u0002\u001b\ri'&4'%"));
        }
        if (sprahg2.cfr_renamed_2161() != 11) {
            object2 = new SimpleDateFormat(sprdfp.cfr_renamed_9("JJJJ\u001e~~\u001eWW\u0013{{\t^^\t@@\u0013i"));
            ((DateFormat)object2).setTimeZone(TimeZone.getTimeZone("UTC"));
            object = new StringBuilder().insert(0, spravo.cfr_renamed_9("\",3=(/(* =$i\u001a 2:4,3tc")).append(arg3.getIssuerX500Principal()).append(sprdfp.cfr_renamed_9("\u0011\u001f@VAZR_}F^QVA\u000e")).append(arg3.getSerialNumber()).append(spravo.cfr_renamed_9("e2<##$*5tc")).append(arg3.getSubjectX500Principal()).append(sprdfp.cfr_renamed_9("\u0011n\u0013AVE\\XVW\u0013RUGVA\u0013")).append(((DateFormat)object2).format(sprahg2.cfr_renamed_2139())).toString();
            object = new StringBuilder().insert(0, (String)object).append(spravo.cfr_renamed_9("ea;$(2&/sa")).append(cfr_renamed_112[sprahg2.cfr_renamed_2161()]).toString();
            throw new sprglg((String)object);
        }
        if (!sprdog2.cfr_renamed_2162() && sprahg2.cfr_renamed_2161() == 11) {
            sprahg2.cfr_renamed_2164(12);
        }
        if (sprahg2.cfr_renamed_2161() == 12) {
            throw new sprglg(sprdfp.cfr_renamed_9("PVAGZUZPRGV\u0013@GRGF@\u0013P\\F_W\u0013]\\G\u0013QV\u0013WVGVA^Z]VW"));
        }
    }

    @Override
    public Set<String> getSupportedExtensions() {
        return null;
    }

    @Override
    public boolean isForwardCheckingSupported() {
        return false;
    }

    @Override
    public void init(boolean arg0) throws CertPathValidatorException {
        if (arg0) {
            throw new IllegalArgumentException(spravo.cfr_renamed_9("/.;6(3-a93&\",2:('&i/&5i2<19.;5,%"));
        }
        this.cfr_renamed_96 = new Date();
        this.cfr_renamed_152 = null;
    }
}

