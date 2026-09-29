/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprbd;
import com.spire.presentation.packages.sprbjm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddk;
import com.spire.presentation.packages.sprefi;
import com.spire.presentation.packages.sprexj;
import com.spire.presentation.packages.sprfzk;
import com.spire.presentation.packages.sprgai;
import com.spire.presentation.packages.sprgak;
import com.spire.presentation.packages.sprgth;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprhhm;
import com.spire.presentation.packages.sprhve;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.spritj;
import com.spire.presentation.packages.sprjgm;
import com.spire.presentation.packages.sprjjaa;
import com.spire.presentation.packages.sprkl;
import com.spire.presentation.packages.sprlhi;
import com.spire.presentation.packages.sprluh;
import com.spire.presentation.packages.sprmbm;
import com.spire.presentation.packages.sprmdk;
import com.spire.presentation.packages.sprmuh;
import com.spire.presentation.packages.sprooh;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprvcm;
import com.spire.presentation.packages.sprwzj;
import com.spire.presentation.packages.sprxbi;
import com.spire.presentation.packages.sprzqe;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertSelector;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public class sprirh {
    private static final String cfr_renamed_1 = sprrdm.cfr_renamed_91.cfr_renamed_19();
    private static final String cfr_renamed_2 = sprrdm.cfr_renamed_2.cfr_renamed_19();
    private static final String cfr_renamed_3;
    private static final String cfr_renamed_4;

    public static void cfr_renamed_9067(sprbd arg0, Set arg1, Set arg2) throws CertPathValidatorException {
        for (String string : arg1) {
            if (arg0.cfr_renamed_112(string) == null) continue;
            throw new CertPathValidatorException(new StringBuilder().insert(0, sprfzk.cfr_renamed_9("$=\u0011;\f+\u0010=\u0000i\u0006,\u0017=\f/\f*\u0004=\u0000i\u0006&\u000b=\u0004 \u000b:E9\u0017&\r \u0007 \u0011,\u0001i\u0004=\u0011;\f+\u0010=\u0000sE")).append(string).append(".").toString());
        }
        for (String string : arg2) {
            if (arg0.cfr_renamed_112(string) != null) continue;
            throw new CertPathValidatorException(new StringBuilder().insert(0, sprjjaa.cfr_renamed_9("<\u001e\t\u0018\u0014\b\b\u001e\u0018J\u001e\u000f\u000f\u001e\u0014\f\u0014\t\u001c\u001e\u0018J\u0019\u0005\u0018\u0019]\u0004\u0012\u001e]\t\u0012\u0004\t\u000b\u0014\u0004]\u0004\u0018\t\u0018\u0019\u000e\u000b\u000f\u0013]\u000b\t\u001e\u000f\u0003\u001f\u001f\t\u000fGJ")).append(string).append(".").toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CertPath cfr_renamed_9068(sprbd arg0, sprgak arg1) throws CertPathValidatorException {
        sprhd sprhd2;
        int n;
        Principal[] principalArray;
        Object object;
        CertPathBuilderResult certPathBuilderResult = null;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (arg0.cfr_renamed_93().cfr_renamed_102() != null) {
            object = new X509CertSelector();
            sprbd sprbd2 = arg0;
            ((X509CertSelector)object).setSerialNumber(sprbd2.cfr_renamed_93().cfr_renamed_114());
            principalArray = sprbd2.cfr_renamed_93().cfr_renamed_102();
            int n2 = n = 0;
            while (n2 < principalArray.length) {
                try {
                    if (principalArray[n] instanceof X500Principal) {
                        ((X509CertSelector)object).setIssuer(((X500Principal)principalArray[n]).getEncoded());
                    }
                    sprhd2 = new sprddk((CertSelector)object).cfr_renamed_1451();
                    sprgai.cfr_renamed_7308(linkedHashSet, (sprexj)sprhd2, arg1.cfr_renamed_2283());
                }
                catch (sprlhi sprlhi2) {
                    throw new sprxbi(sprfzk.cfr_renamed_9("\u0019\u0010+\t \u0006i\u000e,\u001ci\u0006,\u0017=\f/\f*\u0004=\u0000i\u0003&\u0017i\u0004=\u0011;\f+\u0010=\u0000i\u0006,\u0017=\f/\f*\u0004=\u0000i\u0006(\u000b'\n=E+\u0000i\u0016,\u0004;\u0006!\u0000-K"), sprlhi2);
                }
                catch (IOException iOException) {
                    throw new sprxbi(sprjjaa.cfr_renamed_9("(\u0004\u001c\b\u0011\u000f]\u001e\u0012J\u0018\u0004\u001e\u0005\u0019\u000f]2HZMJ\r\u0018\u0014\u0004\u001e\u0003\r\u000b\u0011D"), iOException);
                }
                n2 = ++n;
            }
            if (linkedHashSet.isEmpty()) {
                throw new CertPathValidatorException(sprfzk.cfr_renamed_9("\u0019\u0010+\t \u0006i\u000e,\u001ci\u0006,\u0017=\f/\f*\u0004=\u0000i\u00169\u0000*\f/\f,\u0001i\f'E+\u0004:\u0000i\u0006,\u0017=\f/\f*\u0004=\u0000i,\rE/\n;E(\u0011=\u0017 \u0007<\u0011,E*\u0000;\u0011 \u0003 \u0006(\u0011,E*\u0004'\u000b&\u0011i\u0007,E/\n<\u000b-K"));
            }
        }
        if (arg0.cfr_renamed_93().cfr_renamed_238() != null) {
            object = new sprhve();
            principalArray = arg0.cfr_renamed_93().cfr_renamed_238();
            int n3 = n = 0;
            while (n3 < principalArray.length) {
                try {
                    if (principalArray[n] instanceof X500Principal) {
                        ((X509CertSelector)object).setIssuer(((X500Principal)principalArray[n]).getEncoded());
                    }
                    sprhd2 = new sprddk((CertSelector)object).cfr_renamed_1451();
                    sprgai.cfr_renamed_7308(linkedHashSet, (sprexj)sprhd2, arg1.cfr_renamed_2283());
                }
                catch (sprlhi sprlhi3) {
                    throw new sprxbi(sprjjaa.cfr_renamed_9("-\u001f\u001f\u0006\u0014\t]\u0001\u0018\u0013]\t\u0018\u0018\t\u0003\u001b\u0003\u001e\u000b\t\u000f]\f\u0012\u0018]\u000b\t\u001e\u000f\u0003\u001f\u001f\t\u000f]\t\u0018\u0018\t\u0003\u001b\u0003\u001e\u000b\t\u000f]\t\u001c\u0004\u0013\u0005\tJ\u001f\u000f]\u0019\u0018\u000b\u000f\t\u0015\u000f\u0019D"), sprlhi3);
                }
                catch (IOException iOException) {
                    throw new sprxbi(sprfzk.cfr_renamed_9("\u001c\u000b(\u0007%\u0000i\u0011&E,\u000b*\n-\u0000i=|UyE9\u0017 \u000b*\f9\u0004%K"), iOException);
                }
                n3 = ++n;
            }
            if (linkedHashSet.isEmpty()) {
                throw new CertPathValidatorException(sprjjaa.cfr_renamed_9("-\u001f\u001f\u0006\u0014\t]\u0001\u0018\u0013]\t\u0018\u0018\t\u0003\u001b\u0003\u001e\u000b\t\u000f]\u0019\r\u000f\u001e\u0003\u001b\u0003\u0018\u000e]\u0003\u0013J\u0018\u0004\t\u0003\t\u0013]\u0004\u001c\u0007\u0018J\u001b\u0005\u000fJ\u001c\u001e\t\u0018\u0014\b\b\u001e\u0018J\u001e\u000f\u000f\u001e\u0014\f\u0014\t\u001c\u001e\u0018J\u001e\u000b\u0013\u0004\u0012\u001e]\b\u0018J\u001b\u0005\b\u0004\u0019D"));
            }
        }
        object = new sprmdk(arg1);
        principalArray = null;
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            sprhd2 = new sprhve();
            sprhd2.setCertificate((X509Certificate)iterator.next());
            ((sprmdk)object).cfr_renamed_7311(new sprddk((CertSelector)((Object)sprhd2)).cfr_renamed_1451());
            CertPathBuilder certPathBuilder = null;
            try {
                certPathBuilder = CertPathBuilder.getInstance(sprfzk.cfr_renamed_9("\u0019.\u0000="), "BC");
            }
            catch (NoSuchProviderException noSuchProviderException) {
                throw new sprxbi(sprjjaa.cfr_renamed_9("9\b\u001a\r\u0005\u000f\u001e]\t\u0011\u000b\u000e\u0019]\t\u0012\u001f\u0011\u000e]\u0004\u0012\u001e]\b\u0018J\u001e\u0018\u0018\u000b\t\u000f\u0019D"), noSuchProviderException);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                throw new sprxbi(sprfzk.cfr_renamed_9("6<\u00159\n;\u0011i\u0006%\u0004:\u0016i\u0006&\u0010%\u0001i\u000b&\u0011i\u0007,E*\u0017,\u0004=\u0000-K"), noSuchAlgorithmException);
            }
            {
                certPathBuilderResult = certPathBuilder.build(new spritj(((sprmdk)object).cfr_renamed_1451()).cfr_renamed_1451());
            }
        }
        if (principalArray != null) {
            throw principalArray;
        }
        return certPathBuilderResult.getCertPath();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CertPathValidatorResult cfr_renamed_9069(CertPath arg0, sprgak arg1) throws CertPathValidatorException {
        CertPathValidator certPathValidator = null;
        try {
            certPathValidator = CertPathValidator.getInstance(sprfzk.cfr_renamed_9("\u0019.\u0000="), "BC");
            return certPathValidator.validate(arg0, arg1);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprxbi(sprjjaa.cfr_renamed_9("9\b\u001a\r\u0005\u000f\u001e]\t\u0011\u000b\u000e\u0019]\t\u0012\u001f\u0011\u000e]\u0004\u0012\u001e]\b\u0018J\u001e\u0018\u0018\u000b\t\u000f\u0019D"), noSuchProviderException);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprxbi(sprfzk.cfr_renamed_9("6<\u00159\n;\u0011i\u0006%\u0004:\u0016i\u0006&\u0010%\u0001i\u000b&\u0011i\u0007,E*\u0017,\u0004=\u0000-K"), noSuchAlgorithmException);
        }
    }

    public static void cfr_renamed_9070(X509Certificate arg0, sprgak arg1) throws CertPathValidatorException {
        boolean[] blArray = arg0.getKeyUsage();
        if (!(blArray == null || blArray.length > 0 && blArray[0] || blArray.length > 1 && blArray[1])) {
            throw new CertPathValidatorException(sprfzk.cfr_renamed_9("\b\u0011=\u0017 \u0007<\u0011,E*\u0000;\u0011 \u0003 \u0006(\u0011,E \u0016:\u0010,\u0017i\u0015<\u0007%\f*E\"\u00000E*\u0004'\u000b&\u0011i\u0007,E<\u0016,\u0001i\u0011&E?\u0004%\f-\u0004=\u0000i\u0001 \u0002 \u0011(\ti\u0016 \u0002'\u0004=\u0010;\u0000:K"));
        }
        if (arg0.getBasicConstraints() != -1) {
            throw new CertPathValidatorException(sprjjaa.cfr_renamed_9("+\t\u001e\u000f\u0003\u001f\u001f\t\u000f]\t\u0018\u0018\t\u0003\u001b\u0003\u001e\u000b\t\u000f]\u0003\u000e\u0019\b\u000f\u000fJ\u0014\u0019]\u000b\u0011\u0019\u0012J\u001cJ\r\u001f\u001f\u0006\u0014\t]\u0001\u0018\u0013]\t\u0018\u0018\t\u0003\u001b\u0003\u001e\u000b\t\u000f]\u0003\u000e\u0019\b\u000f\u000fD"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_9071(sprbd arg0, CertPath arg1, CertPath arg2, sprgak arg3, Set arg4) throws CertPathValidatorException {
        Set<String> set;
        Set<String> set2 = arg0.getCriticalExtensionOIDs();
        if (set2.contains(cfr_renamed_1)) {
            try {
                sprbjm.cfr_renamed_23(sprgai.cfr_renamed_292(arg0, cfr_renamed_1));
                set = set2;
            }
            catch (sprlhi sprlhi2) {
                throw new sprxbi(sprfzk.cfr_renamed_9("1(\u0017.\u0000=E \u000b/\n;\b(\u0011 \n'E,\u001d=\u0000'\u0016 \n'E*\n<\t-E'\n=E+\u0000i\u0017,\u0004-K"), sprlhi2);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new sprxbi(sprjjaa.cfr_renamed_9(">\u001c\u0018\u001a\u000f\tJ\u0014\u0004\u001b\u0005\u000f\u0007\u001c\u001e\u0014\u0005\u0013J\u0018\u0012\t\u000f\u0013\u0019\u0014\u0005\u0013J\u001e\u0005\b\u0006\u0019J\u0013\u0005\tJ\u001f\u000f]\u0018\u0018\u000b\u0019D"), illegalArgumentException);
            }
        } else {
            set = set2;
        }
        set.remove(cfr_renamed_1);
        Iterator iterator = arg4.iterator();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            ((sprzqe)iterator.next()).cfr_renamed_5088(arg0, arg1, arg2, set2);
            iterator2 = iterator;
        }
        if (!set2.isEmpty()) {
            throw new CertPathValidatorException(new StringBuilder().insert(0, sprfzk.cfr_renamed_9("\b\u0011=\u0017 \u0007<\u0011,E*\u0000;\u0011 \u0003 \u0006(\u0011,E*\n'\u0011(\f'\u0016i\u0010'\u0016<\u00159\n;\u0011,\u0001i\u0006;\f=\f*\u0004%E,\u001d=\u0000'\u0016 \n'\u0016sE")).append(set2).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_9072(sprbd arg0, sprgak arg1, Date arg2, Date arg3, X509Certificate arg4, List arg5, sprrr arg6) throws CertPathValidatorException {
        if (!arg1.cfr_renamed_9073()) return;
        if (arg0.getExtensionValue(cfr_renamed_2) == null) {
            boolean bl;
            Object object;
            sprlhi sprlhi2;
            sprgth sprgth2;
            Object object2;
            block22: {
                sprgak sprgak2;
                sprvcm sprvcm2 = null;
                try {
                    sprvcm2 = sprvcm.cfr_renamed_23(sprgai.cfr_renamed_292(arg0, cfr_renamed_4));
                }
                catch (sprlhi sprlhi3) {
                    throw new CertPathValidatorException(sprjjaa.cfr_renamed_9(")/&]\u000e\u0014\u0019\t\u0018\u0014\b\b\u001e\u0014\u0005\u0013J\r\u0005\u0014\u0004\tJ\u0018\u0012\t\u000f\u0013\u0019\u0014\u0005\u0013J\u001e\u0005\b\u0006\u0019J\u0013\u0005\tJ\u001f\u000f]\u0018\u0018\u000b\u0019D"), sprlhi3);
                }
                ArrayList<sprkl> arrayList = new ArrayList<sprkl>();
                try {
                    arrayList.addAll(sprgai.cfr_renamed_9074(sprvcm2, arg1.cfr_renamed_7289(), arg3, arg6));
                }
                catch (sprlhi sprlhi4) {
                    throw new CertPathValidatorException(sprfzk.cfr_renamed_9("+&E(\u0001-\f=\f&\u000b(\ti&\u001b)i\t&\u0006(\u0011 \n'\u0016i\u0006&\u0010%\u0001i\u0007,E-\u0000*\n-\u0000-E/\u0017&\bi&\u001b)i\u0001 \u0016=\u0017 \u0007<\u0011 \n'E9\n \u000b=E,\u001d=\u0000'\u0016 \n'K"), sprlhi4);
                }
                sprmdk sprmdk2 = new sprmdk(arg1);
                Object object3 = object2 = arrayList.iterator();
                while (object3.hasNext()) {
                    sprmdk2.cfr_renamed_7271((sprkl)((Object)arrayList));
                    object3 = object2;
                }
                arg1 = sprmdk2.cfr_renamed_1451();
                object2 = new sprefi();
                sprgth2 = new sprgth();
                sprlhi2 = null;
                boolean bl2 = false;
                if (sprvcm2 != null) {
                    object = null;
                    try {
                        object = sprvcm2.cfr_renamed_322();
                    }
                    catch (Exception exception) {
                        throw new sprxbi(sprjjaa.cfr_renamed_9("9\u0003\u000e\u001e\u000f\u0003\u001f\u001f\t\u0003\u0012\u0004]\u001a\u0012\u0003\u0013\u001e\u000eJ\u001e\u0005\b\u0006\u0019J\u0013\u0005\tJ\u001f\u000f]\u0018\u0018\u000b\u0019D"), exception);
                    }
                    try {
                        for (int i = 0; i < ((sprjgm[])object).length && ((sprefi)object2).cfr_renamed_2161() == 11 && !sprgth2.cfr_renamed_2162(); ++i) {
                            sprgak2 = (sprgak)arg1.clone();
                            sprjgm sprjgm2 = object[i];
                            sprirh.cfr_renamed_9075(sprjgm2, arg0, sprgak2, arg2, arg3, arg4, (sprefi)object2, sprgth2, arg5, arg6);
                            bl2 = true;
                        }
                    }
                    catch (sprlhi sprlhi5) {
                        sprlhi2 = new sprlhi(sprfzk.cfr_renamed_9("\u0007\ni\u0013(\t \u0001i&\u001b)i\u0003&\u0017i\u0001 \u0016=\u0017 \u0007<\u0011 \n'E9\n \u000b=E/\n<\u000b-K"), sprlhi5);
                    }
                }
                if (((sprefi)object2).cfr_renamed_2161() == 11 && !sprgth2.cfr_renamed_2162()) {
                    try {
                        try {
                            object = sprooh.cfr_renamed_302(arg0);
                        }
                        catch (Exception exception) {
                            throw new sprlhi(sprjjaa.cfr_renamed_9("#\u000e\u0019\b\u000f\u000fJ\u001b\u0018\u0012\u0007]\t\u0018\u0018\t\u0003\u001b\u0003\u001e\u000b\t\u000f]\f\u0012\u0018])/&]\t\u0012\u001f\u0011\u000e]\u0004\u0012\u001e]\b\u0018J\u000f\u000f\u0018\u0004\u001e\u0005\u0019\u000f\u0019D"), exception);
                        }
                        sprjgm sprjgm3 = new sprjgm(new sprhhm(0, new spraem(new sprigm(4, (sprco)object))), null, null);
                        sprgak2 = (sprgak)arg1.clone();
                        sprirh.cfr_renamed_9075(sprjgm3, arg0, sprgak2, arg2, arg3, arg4, (sprefi)object2, sprgth2, arg5, arg6);
                        bl = bl2 = true;
                        break block22;
                    }
                    catch (sprlhi sprlhi6) {
                        sprlhi2 = new sprlhi(sprfzk.cfr_renamed_9("\u0007\ni\u0013(\t \u0001i&\u001b)i\u0003&\u0017i\u0001 \u0016=\u0017 \u0007<\u0011 \n'E9\n \u000b=E/\n<\u000b-K"), sprlhi6);
                    }
                }
                bl = bl2;
            }
            if (!bl) {
                throw new sprxbi(sprjjaa.cfr_renamed_9("$\u0012J\u000b\u000b\u0011\u0003\u0019J>81J\u001b\u0005\b\u0004\u0019D"), sprlhi2);
            }
            if (((sprefi)object2).cfr_renamed_2161() != 11) {
                object = new StringBuilder().insert(0, sprfzk.cfr_renamed_9("$=\u0011;\f+\u0010=\u0000i\u0006,\u0017=\f/\f*\u0004=\u0000i\u0017,\u0013&\u0006(\u0011 \n'E(\u0003=\u0000;E")).append(((sprefi)object2).cfr_renamed_2139()).toString();
                object = new StringBuilder().insert(0, (String)object).append(sprjjaa.cfr_renamed_9("QJ\u000f\u000f\u001c\u0019\u0012\u0004GJ")).append(sprmuh.cfr_renamed_102[((sprefi)object2).cfr_renamed_2161()]).toString();
                throw new CertPathValidatorException((String)object);
            }
            if (!sprgth2.cfr_renamed_2162() && ((sprefi)object2).cfr_renamed_2161() == 11) {
                ((sprefi)object2).cfr_renamed_2164(12);
            }
            if (((sprefi)object2).cfr_renamed_2161() != 12) return;
            throw new CertPathValidatorException(sprfzk.cfr_renamed_9("$=\u0011;\f+\u0010=\u0000i\u0006,\u0017=\f/\f*\u0004=\u0000i\u0016=\u0004=\u0010:E*\n<\t-E'\n=E+\u0000i\u0001,\u0011,\u0017$\f'\u0000-K"));
        }
        if (arg0.getExtensionValue(cfr_renamed_4) == null && arg0.getExtensionValue(cfr_renamed_3) == null) return;
        throw new CertPathValidatorException(sprjjaa.cfr_renamed_9("$\u0012J\u000f\u000f\u000bJ\u001c\u001c\u001c\u0003\u0011J\u0018\u0012\t\u000f\u0013\u0019\u0014\u0005\u0013J\u0014\u0019]\u0019\u0018\u001eQJ\u001f\u001f\tJ\u001c\u0006\u000e\u0005]\u000b\u0013J<)]\u0018\u0018\u001c\u0012\t\u001c\u001e\u0014\u0005\u0013J\r\u0005\u0014\u0004\t\u000f\u000fD"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_9076(sprbd arg0, Date arg1) throws CertPathValidatorException {
        try {
            arg0.cfr_renamed_96(arg1);
            return;
        }
        catch (CertificateExpiredException certificateExpiredException) {
            throw new sprxbi(sprfzk.cfr_renamed_9("$=\u0011;\f+\u0010=\u0000i\u0006,\u0017=\f/\f*\u0004=\u0000i\f:E'\n=E?\u0004%\f-K"), certificateExpiredException);
        }
        catch (CertificateNotYetValidException certificateNotYetValidException) {
            throw new sprxbi(sprjjaa.cfr_renamed_9("+\t\u001e\u000f\u0003\u001f\u001f\t\u000f]\t\u0018\u0018\t\u0003\u001b\u0003\u001e\u000b\t\u000f]\u0003\u000eJ\u0013\u0005\tJ\u000b\u000b\u0011\u0003\u0019D"), certificateNotYetValidException);
        }
    }

    static {
        cfr_renamed_4 = sprrdm.cfr_renamed_79.cfr_renamed_19();
        cfr_renamed_3 = sprrdm.cfr_renamed_102.cfr_renamed_19();
    }

    private static /* synthetic */ void cfr_renamed_9075(sprjgm arg0, sprbd arg1, sprgak arg2, Date arg3, Date arg4, X509Certificate arg5, sprefi arg6, sprgth arg7, List arg8, sprrr arg9) throws sprlhi, sprluh {
        Iterator iterator;
        if (arg1.getExtensionValue(sprmbm.cfr_renamed_126.cfr_renamed_19()) != null) {
            return;
        }
        if (arg4.getTime() > arg3.getTime()) {
            throw new sprlhi(sprfzk.cfr_renamed_9("3(\t \u0001(\u0011 \n'E=\f$\u0000i\f:E \u000bi\u0003<\u0011<\u0017,K"));
        }
        Set set = sprgai.cfr_renamed_9077(new sprwzj(arg2, arg4, null, -1, arg5, null), arg0, arg1, arg2, arg4);
        boolean bl = false;
        sprlhi sprlhi2 = null;
        Iterator iterator2 = iterator = set.iterator();
        while (iterator2.hasNext() && arg6.cfr_renamed_2161() == 11 && !arg7.cfr_renamed_2162()) {
            sprgth sprgth2;
            X509CRL x509CRL;
            block10: {
                x509CRL = (X509CRL)iterator.next();
                sprgth2 = sprmuh.cfr_renamed_7294(x509CRL, arg0);
                if (sprgth2.cfr_renamed_9078(arg7)) break block10;
                iterator2 = iterator;
            }
            try {
                X509CRL x509CRL2 = x509CRL;
                PublicKey publicKey = sprmuh.cfr_renamed_2168(x509CRL2, sprmuh.cfr_renamed_7296(x509CRL2, arg1, null, null, arg2, arg8, arg9));
                X509CRL x509CRL3 = null;
                if (arg2.cfr_renamed_391()) {
                    x509CRL3 = sprmuh.cfr_renamed_2170(sprgai.cfr_renamed_9079(arg3, x509CRL, arg2.cfr_renamed_2283(), arg2.cfr_renamed_7293(), arg9), publicKey);
                }
                if (arg2.cfr_renamed_376() != 1 && arg1.cfr_renamed_86().getTime() < x509CRL.getThisUpdate().getTime()) {
                    throw new sprlhi(sprjjaa.cfr_renamed_9("3\u0005]\u001c\u001c\u0006\u0014\u000e])/&]\f\u0012\u0018]\t\b\u0018\u000f\u000f\u0013\u001e]\u001e\u0014\u0007\u0018J\u001b\u0005\b\u0004\u0019D"));
                }
                sprbd sprbd2 = arg1;
                sprmuh.cfr_renamed_7298(arg0, sprbd2, x509CRL);
                sprmuh.cfr_renamed_7299(arg0, sprbd2, x509CRL);
                X509CRL x509CRL4 = x509CRL;
                sprmuh.cfr_renamed_7300(x509CRL3, x509CRL4, arg2);
                Date date = arg4;
                sprmuh.cfr_renamed_9080(date, x509CRL3, arg1, arg6, arg2);
                sprmuh.cfr_renamed_9081(date, x509CRL4, arg1, arg6);
                if (arg6.cfr_renamed_2161() == 8) {
                    arg6.cfr_renamed_2164(11);
                }
                arg7.cfr_renamed_9082(sprgth2);
                bl = true;
                iterator2 = iterator;
            }
            catch (sprlhi sprlhi3) {
                sprlhi2 = sprlhi3;
                iterator2 = iterator;
            }
        }
        if (!bl) {
            throw sprlhi2;
        }
    }

    public static void cfr_renamed_9083(X509Certificate arg0, Set arg1) throws CertPathValidatorException {
        Set set = arg1;
        boolean bl = false;
        for (TrustAnchor trustAnchor : set) {
            if (!arg0.getSubjectX500Principal().getName(sprfzk.cfr_renamed_9("7\u000f&{W|V")).equals(trustAnchor.getCAName()) && !arg0.equals(trustAnchor.getTrustedCert())) continue;
            bl = true;
        }
        if (!bl) {
            throw new CertPathValidatorException(sprjjaa.cfr_renamed_9("+\t\u001e\u000f\u0003\u001f\u001f\t\u000f]\t\u0018\u0018\t\u0003\u001b\u0003\u001e\u000b\t\u000f]\u0003\u000e\u0019\b\u000f\u000fJ\u0014\u0019]\u0004\u0012\u001e]\u000e\u0014\u0018\u0018\t\t\u0006\u0004J\t\u0018\b\u0019\t\u000f\u0019D"));
        }
    }
}

