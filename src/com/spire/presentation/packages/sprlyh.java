/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprbz;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.spream;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprfzl;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprgum;
import com.spire.presentation.packages.sprhfp;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.spriu;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprjr;
import com.spire.presentation.packages.sprke;
import com.spire.presentation.packages.sprkrh;
import com.spire.presentation.packages.sprks;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlom;
import com.spire.presentation.packages.sprluh;
import com.spire.presentation.packages.sprmdi;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprmom;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpdm;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrsm;
import com.spire.presentation.packages.sprrum;
import com.spire.presentation.packages.sprssm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtsn;
import com.spire.presentation.packages.spruam;
import com.spire.presentation.packages.sprufm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvqm;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprwzj;
import com.spire.presentation.packages.sprxbi;
import com.spire.presentation.packages.sprxsm;
import com.spire.presentation.packages.sprzmm;
import com.spire.presentation.packages.sprzoh;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sun.security.x509.Extension;

public class sprlyh
implements sprke {
    private final sprzoh cfr_renamed_102;
    private static final int cfr_renamed_93 = 15000;
    private String cfr_renamed_86;
    private boolean cfr_renamed_152;
    private static final Map cfr_renamed_112 = new HashMap();
    private final sprrr cfr_renamed_119;
    private List<Extension> cfr_renamed_91;
    private sprwzj cfr_renamed_0;
    private URI cfr_renamed_1;
    private Map<X509Certificate, byte[]> cfr_renamed_2;
    private static final int cfr_renamed_3 = 32768;
    private X509Certificate cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_9066(sprwzj sprwzj2) {
        void arg0;
        sprlyh sprlyh2 = this;
        this.cfr_renamed_0 = arg0;
        sprlyh2.cfr_renamed_152 = sprjcf.cfr_renamed_5159(sprhfp.cfr_renamed_9("[&G5\u001a Z$V)Q"));
        sprlyh2.cfr_renamed_86 = sprjcf.cfr_renamed_5153(sprtsn.cfr_renamed_9("uTiG4E\u007fDjXtS\u007fEOeV"));
    }

    private /* synthetic */ sprssm cfr_renamed_9103(sprssm arg0, sprndm arg1, sprktm arg2) throws CertPathValidatorException {
        return this.cfr_renamed_9104(arg0.cfr_renamed_579(), arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprlyh(sprzoh sprzoh2, sprrr sprrr2) {
        void arg0;
        sprlyh sprlyh2 = this;
        this.cfr_renamed_2 = Collections.emptyMap();
        this.cfr_renamed_91 = Collections.emptyList();
        sprlyh2.cfr_renamed_102 = arg0;
        sprlyh2.cfr_renamed_119 = sprrr2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void check(Certificate arg0) throws CertPathValidatorException {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        X509Certificate x509Certificate = (X509Certificate)arg0;
        HashMap<X509Certificate, Object> hashMap = new HashMap<X509Certificate, Object>(this.cfr_renamed_2.size());
        Object object6 = object5 = this.cfr_renamed_2.entrySet().iterator();
        while (object6.hasNext()) {
            object4 = object5.next();
            hashMap.put(object4.getKey(), ((byte[])object4.getValue()).clone());
            object6 = object5;
        }
        object5 = hashMap;
        object4 = this.cfr_renamed_1;
        if (object4 == null) {
            if (this.cfr_renamed_86 != null) {
                try {
                    object4 = new URI(this.cfr_renamed_86);
                }
                catch (URISyntaxException uRISyntaxException) {
                    throw new CertPathValidatorException(new StringBuilder().insert(0, sprhfp.cfr_renamed_9("W*Z#]\"A7U1]*ZeQ7F*F\u007f\u0014")).append(uRISyntaxException.getMessage()).toString(), (Throwable)uRISyntaxException, this.cfr_renamed_0.cfr_renamed_315(), this.cfr_renamed_0.cfr_renamed_320());
                }
            } else {
                object4 = sprlyh.cfr_renamed_9105(x509Certificate);
            }
        }
        byte[] byArray = null;
        boolean bl = false;
        if (object5.get(x509Certificate) == null && object4 != null) {
            if (this.cfr_renamed_86 == null && this.cfr_renamed_1 == null && !this.cfr_renamed_152) {
                throw new sprluh(sprtsn.cfr_renamed_9("xYdJ\u0017~^iVx[\u007fS:Uc\u00178XyDj\u0019\u007fY{UvR8\u0017iRnCsY}"), null, this.cfr_renamed_0.cfr_renamed_315(), this.cfr_renamed_0.cfr_renamed_320());
            }
            sprlyh sprlyh2 = this;
            object3 = sprlyh2.cfr_renamed_9106();
            sprlyh sprlyh3 = this;
            sprssm sprssm2 = sprlyh2.cfr_renamed_9104(new sprddm(sprgt.cfr_renamed_0), (sprndm)object3, new sprktm(x509Certificate.getSerialNumber()));
            sprlyh sprlyh4 = this;
            object2 = sprkrh.cfr_renamed_9107(sprssm2, this.cfr_renamed_0, (URI)object4, sprlyh4.cfr_renamed_4, Collections.unmodifiableList(sprlyh4.cfr_renamed_91), this.cfr_renamed_119);
            try {
                object5.put(x509Certificate, ((sprqqe)object2).cfr_renamed_91());
                bl = true;
            }
            catch (IOException iOException) {
                throw new CertPathValidatorException(sprhfp.cfr_renamed_9("0Z$V)Qe@*\u0014 Z&[!Qe{\u0006g\u0015\u00147Q6D*Z6Q"), (Throwable)iOException, this.cfr_renamed_0.cfr_renamed_315(), this.cfr_renamed_0.cfr_renamed_320());
            }
        } else {
            int n;
            object3 = Collections.unmodifiableList(this.cfr_renamed_91);
            int n2 = n = 0;
            while (n2 != object3.size()) {
                object2 = (Extension)object3.get(n);
                object = ((Extension)object2).getExtensionValue();
                if (spriu.cfr_renamed_4.cfr_renamed_19().equals(((Extension)object2).getExtensionId())) {
                    byArray = object;
                }
                n2 = ++n;
            }
        }
        if (object5.isEmpty()) {
            throw new sprluh(sprhfp.cfr_renamed_9("+[e{\u0006g\u0015\u00147Q6D*Z6QeR*A+PeR*FeU+MeW F1]#]&U1Q"), null, this.cfr_renamed_0.cfr_renamed_315(), this.cfr_renamed_0.cfr_renamed_320());
        }
        object3 = sprmom.cfr_renamed_23(object5.get(x509Certificate));
        sprktm sprktm2 = new sprktm(x509Certificate.getSerialNumber());
        if (object3 == null) {
            throw new sprluh(sprtsn.cfr_renamed_9("Yu\u0017UtIg:E\u007fDjXtD\u007f\u0017|XoY~\u0017|Xh\u0017yRhCsQsT{C\u007f"), null, this.cfr_renamed_0.cfr_renamed_315(), this.cfr_renamed_0.cfr_renamed_320());
        }
        if (0 != ((sprmom)object3).cfr_renamed_4115().cfr_renamed_9108()) {
            throw new CertPathValidatorException(new StringBuilder().insert(0, sprhfp.cfr_renamed_9("\nw\u0016deF G5[+G \u0014#U,X P\u007f\u0014")).append(((sprmom)object3).cfr_renamed_4115().cfr_renamed_97()).toString(), null, this.cfr_renamed_0.cfr_renamed_315(), this.cfr_renamed_0.cfr_renamed_320());
        }
        object2 = sprlom.cfr_renamed_23(((sprmom)object3).cfr_renamed_4285());
        if (!((sprlom)object2).cfr_renamed_4286().cfr_renamed_5078(spriu.cfr_renamed_112)) return;
        try {
            object = sprzmm.cfr_renamed_23(((sprlom)object2).cfr_renamed_3262().cfr_renamed_186());
            if (!bl) {
                sprlyh sprlyh5 = this;
                if (!sprlyh.cfr_renamed_9109((sprzmm)object, this.cfr_renamed_0, byArray, sprlyh5.cfr_renamed_4, sprlyh5.cfr_renamed_119)) return;
            }
            sprszm sprszm2 = sprxsm.cfr_renamed_23(((sprzmm)object).cfr_renamed_4315()).cfr_renamed_4280();
            sprssm sprssm3 = null;
            for (int i = 0; i != sprszm2.cfr_renamed_84(); ++i) {
                sprqqe sprqqe2;
                sprvqm sprvqm2 = sprvqm.cfr_renamed_23(sprszm2.cfr_renamed_85(i));
                if (!sprktm2.cfr_renamed_5078(sprvqm2.cfr_renamed_4270().cfr_renamed_114())) continue;
                sprjfn sprjfn2 = sprvqm2.cfr_renamed_2133();
                if (sprjfn2 != null && this.cfr_renamed_0.cfr_renamed_9110().after(sprjfn2.cfr_renamed_110())) {
                    throw new sprxbi(sprtsn.cfr_renamed_9("UtIg:E\u007fDjXtD\u007f\u0017\u007fOj^hR~"));
                }
                if (sprssm3 == null || !sprssm3.cfr_renamed_579().equals(sprvqm2.cfr_renamed_4270().cfr_renamed_579())) {
                    sprlyh sprlyh6 = this;
                    sprqqe2 = sprlyh6.cfr_renamed_9106();
                    sprssm3 = sprlyh6.cfr_renamed_9103(sprvqm2.cfr_renamed_4270(), (sprndm)sprqqe2, sprktm2);
                }
                if (!sprssm3.equals(sprvqm2.cfr_renamed_4270())) continue;
                if (sprvqm2.cfr_renamed_2161().cfr_renamed_312() == 0) {
                    return;
                }
                if (sprvqm2.cfr_renamed_2161().cfr_renamed_312() != 1) throw new CertPathValidatorException(sprhfp.cfr_renamed_9("&Q7@,R,W$@ \u00147Q3[.Q!\u0018eP @$])GeA+_+[2Z"), null, this.cfr_renamed_0.cfr_renamed_315(), this.cfr_renamed_0.cfr_renamed_320());
                sprqqe2 = sprrum.cfr_renamed_23(sprvqm2.cfr_renamed_2161().cfr_renamed_648());
                sprfzl sprfzl2 = ((sprrum)sprqqe2).cfr_renamed_4273();
                throw new CertPathValidatorException(new StringBuilder().insert(0, sprhfp.cfr_renamed_9("W F1]#]&U1QeF B*_ Pi\u00147Q$G*Zx\u001c")).append(sprfzl2).append(sprtsn.cfr_renamed_9("\u001e6\u0017~VnR'")).append(((sprrum)sprqqe2).cfr_renamed_4274().cfr_renamed_110()).toString(), null, this.cfr_renamed_0.cfr_renamed_315(), this.cfr_renamed_0.cfr_renamed_320());
            }
            return;
        }
        catch (CertPathValidatorException certPathValidatorException) {
            throw certPathValidatorException;
        }
        catch (Exception exception) {
            throw new CertPathValidatorException(sprtsn.cfr_renamed_9("oY{UvR:Cu\u0017jEuT\u007fDi\u0017UtIg:E\u007fDjXtD\u007f"), (Throwable)exception, this.cfr_renamed_0.cfr_renamed_315(), this.cfr_renamed_0.cfr_renamed_320());
        }
    }

    private static /* synthetic */ String cfr_renamed_5816(sprlem arg0) {
        String string = sprmdi.cfr_renamed_5816(arg0);
        int n = string.indexOf(45);
        if (n > 0 && !string.startsWith(sprtsn.cfr_renamed_9("dRv)"))) {
            return new StringBuilder().insert(0, string.substring(0, n)).append(string.substring(n + 1)).toString();
        }
        return string;
    }

    public List<CertPathValidatorException> cfr_renamed_9101() {
        return null;
    }

    private static /* synthetic */ X509Certificate cfr_renamed_8034(sprzmm arg0, X509Certificate arg1, X509Certificate arg2, sprrr arg3) throws NoSuchProviderException, NoSuchAlgorithmException {
        sprgum sprgum2 = arg0.cfr_renamed_4315().cfr_renamed_4277();
        byte[] byArray = sprgum2.cfr_renamed_4604();
        if (byArray != null) {
            MessageDigest messageDigest = arg3.cfr_renamed_7438("SHA1");
            X509Certificate x509Certificate = arg2;
            if (x509Certificate != null && sproze.cfr_renamed_92(byArray, sprlyh.cfr_renamed_9111(messageDigest, x509Certificate.getPublicKey()))) {
                return x509Certificate;
            }
            x509Certificate = arg1;
            if (x509Certificate != null && sproze.cfr_renamed_92(byArray, sprlyh.cfr_renamed_9111(messageDigest, x509Certificate.getPublicKey()))) {
                return x509Certificate;
            }
        } else {
            sprnbm sprnbm2 = sprnbm.cfr_renamed_9063(spruam.cfr_renamed_956, sprgum2.cfr_renamed_313());
            X509Certificate x509Certificate = arg2;
            if (x509Certificate != null && sprnbm2.equals(sprnbm.cfr_renamed_9063(spruam.cfr_renamed_956, x509Certificate.getSubjectX500Principal().getEncoded()))) {
                return x509Certificate;
            }
            x509Certificate = arg1;
            if (x509Certificate != null && sprnbm2.equals(sprnbm.cfr_renamed_9063(spruam.cfr_renamed_956, x509Certificate.getSubjectX500Principal().getEncoded()))) {
                return x509Certificate;
            }
        }
        return null;
    }

    private static /* synthetic */ String cfr_renamed_9057(sprddm arg0) {
        sprco sprco2 = arg0.cfr_renamed_284();
        if (sprco2 != null && !sprpen.cfr_renamed_4.cfr_renamed_7476(sprco2) && arg0.cfr_renamed_593().cfr_renamed_5078(sprdl.cfr_renamed_3250)) {
            sprrsm sprrsm2 = sprrsm.cfr_renamed_23(sprco2);
            return new StringBuilder().insert(0, sprlyh.cfr_renamed_5816(sprrsm2.cfr_renamed_579().cfr_renamed_593())).append(sprhfp.cfr_renamed_9("\u0012}\u0011|\u0017g\u0004u\u000bp\bs\u0003\u0005")).toString();
        }
        if (cfr_renamed_112.containsKey(arg0.cfr_renamed_593())) {
            return (String)cfr_renamed_112.get(arg0.cfr_renamed_593());
        }
        return arg0.cfr_renamed_593().cfr_renamed_19();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static URI cfr_renamed_9105(X509Certificate arg0) {
        int n;
        byte[] byArray = arg0.getExtensionValue(sprrdm.cfr_renamed_102.cfr_renamed_19());
        if (byArray == null) {
            return null;
        }
        sprufm[] sprufmArray = spream.cfr_renamed_23(sproug.cfr_renamed_23(byArray).cfr_renamed_186()).cfr_renamed_309();
        int n2 = n = 0;
        while (n2 != sprufmArray.length) {
            sprigm sprigm2;
            sprufm sprufm2 = sprufmArray[n];
            if (sprufm.cfr_renamed_4.cfr_renamed_5078(sprufm2.cfr_renamed_310()) && (sprigm2 = sprufm2.cfr_renamed_311()).cfr_renamed_312() == 6) {
                try {
                    return new URI(((sprml)((Object)sprigm2.cfr_renamed_313())).cfr_renamed_314());
                }
                catch (URISyntaxException uRISyntaxException) {
                    // empty catch block
                }
            }
            n2 = ++n;
        }
        return null;
    }

    private static /* synthetic */ byte[] cfr_renamed_9111(MessageDigest arg0, PublicKey arg1) {
        sprvhm sprvhm2 = sprvhm.cfr_renamed_23(arg1.getEncoded());
        return arg0.digest(sprvhm2.cfr_renamed_2314().cfr_renamed_81());
    }

    public void cfr_renamed_9102(boolean arg0) throws CertPathValidatorException {
        if (arg0) {
            throw new CertPathValidatorException(sprtsn.cfr_renamed_9("QuEmVhS:TrRy\\sY}\u0017tXn\u0017iBjGuEnR~"));
        }
        sprlyh sprlyh2 = this;
        sprlyh2.cfr_renamed_0 = null;
        sprlyh2.cfr_renamed_152 = sprjcf.cfr_renamed_5159(sprhfp.cfr_renamed_9("[&G5\u001a Z$V)Q"));
        this.cfr_renamed_86 = sprjcf.cfr_renamed_5153(sprtsn.cfr_renamed_9("uTiG4E\u007fDjXtS\u007fEOeV"));
    }

    @Override
    public void cfr_renamed_1262(String arg0, Object arg1) {
    }

    public boolean cfr_renamed_9112() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprndm cfr_renamed_9106() throws CertPathValidatorException {
        try {
            return sprndm.cfr_renamed_23(this.cfr_renamed_0.cfr_renamed_9113().getEncoded());
        }
        catch (Exception exception) {
            throw new CertPathValidatorException(new StringBuilder().insert(0, sprhfp.cfr_renamed_9("W$Z+[1\u00145F*W G6\u00146]\"Z,Z\"\u0014&Q7@\u007f\u0014")).append(exception.getMessage()).toString(), (Throwable)exception, this.cfr_renamed_0.cfr_renamed_315(), this.cfr_renamed_0.cfr_renamed_320());
        }
    }

    public static boolean cfr_renamed_9109(sprzmm arg0, sprwzj arg1, byte[] arg2, X509Certificate arg3, sprrr arg4) throws CertPathValidatorException {
        block11: {
            Object object;
            Object object2;
            Signature signature;
            sprzmm sprzmm2 = arg0;
            sprszm sprszm2 = sprzmm2.cfr_renamed_626();
            Signature signature2 = arg4.cfr_renamed_1539(sprlyh.cfr_renamed_9057(arg0.cfr_renamed_89()));
            X509Certificate x509Certificate = sprlyh.cfr_renamed_8034(sprzmm2, arg1.cfr_renamed_9113(), arg3, arg4);
            if (x509Certificate == null && sprszm2 == null) {
                throw new CertPathValidatorException(sprtsn.cfr_renamed_9("xYdJ\u0017hRiGuY~Rh\u0017yRhCsQsT{C\u007f\u0017tXn\u0017|XoY~"));
            }
            if (x509Certificate != null) {
                Signature signature3 = signature2;
                signature = signature3;
                signature3.initVerify(x509Certificate.getPublicKey());
            } else {
                object2 = arg4.cfr_renamed_1550(sprhfp.cfr_renamed_9("lk\u0001u\r"));
                object = (X509Certificate)((CertificateFactory)object2).generateCertificate(new ByteArrayInputStream(sprszm2.cfr_renamed_85(0).cfr_renamed_119().cfr_renamed_91()));
                X509Certificate x509Certificate2 = object;
                x509Certificate2.verify(arg1.cfr_renamed_9113().getPublicKey());
                x509Certificate2.checkValidity(arg1.cfr_renamed_9110());
                if (!sprlyh.cfr_renamed_9114(arg0.cfr_renamed_4315().cfr_renamed_4277(), (X509Certificate)object, arg4)) {
                    throw new CertPathValidatorException(sprtsn.cfr_renamed_9("E\u007fDjXtS\u007fE:T\u007fEn^|^yVnR:SuRi\u0017tXn\u0017wVnTr\u0017hRiGuY~Rh~^"), null, arg1.cfr_renamed_315(), arg1.cfr_renamed_320());
                }
                List<String> list = ((X509Certificate)object).getExtendedKeyUsage();
                if (list == null || !list.contains(sprpdm.cfr_renamed_953.cfr_renamed_19())) {
                    throw new CertPathValidatorException(sprhfp.cfr_renamed_9("7Q6D*Z!Q7\u0014&Q7@,R,W$@ \u0014+[1\u00143U)]!\u0014#[7\u00146]\"Z,Z\"\u0014\nw\u0016deF G5[+G G"), null, arg1.cfr_renamed_315(), arg1.cfr_renamed_320());
                }
                Signature signature4 = signature2;
                signature = signature4;
                signature4.initVerify((Certificate)object);
            }
            signature.update(arg0.cfr_renamed_4315().cfr_renamed_104("DER"));
            if (!signature2.verify(arg0.cfr_renamed_79().cfr_renamed_81())) break block11;
            if (arg2 != null && !sproze.cfr_renamed_92(arg2, ((sprrdm)(object = ((sprhgm)(object2 = arg0.cfr_renamed_4315().cfr_renamed_4278())).cfr_renamed_5024(spriu.cfr_renamed_4))).cfr_renamed_103().cfr_renamed_186())) {
                throw new CertPathValidatorException(sprtsn.cfr_renamed_9("tXtT\u007f\u0017w^iZ{Cy_:^t\u0017UtIg:E\u007fDjXtD\u007f"), null, arg1.cfr_renamed_315(), arg1.cfr_renamed_320());
            }
            return true;
        }
        try {
            return false;
        }
        catch (CertPathValidatorException certPathValidatorException) {
            throw certPathValidatorException;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new CertPathValidatorException(new StringBuilder().insert(0, sprhfp.cfr_renamed_9("{\u0006g\u0015\u00147Q6D*Z6QeR$])A7Q\u007f\u0014")).append(generalSecurityException.getMessage()).toString(), (Throwable)generalSecurityException, arg1.cfr_renamed_315(), arg1.cfr_renamed_320());
        }
        catch (IOException iOException) {
            throw new CertPathValidatorException(new StringBuilder().insert(0, sprtsn.cfr_renamed_9("UtIg:E\u007fDjXtD\u007f\u0017|Vs[oE\u007f\r:")).append(iOException.getMessage()).toString(), (Throwable)iOException, arg1.cfr_renamed_315(), arg1.cfr_renamed_320());
        }
    }

    static {
        cfr_renamed_112.put(new sprlem(sprhfp.cfr_renamed_9("t\u001aw\u001a}\u0000u\u001at\u0005v\u0001q\rk\u0005k\u0005k\u0001")), sprtsn.cfr_renamed_9("I\u007f[\u0006M~N\u007fHd["));
        cfr_renamed_112.put(sprdl.cfr_renamed_1262, sprhfp.cfr_renamed_9("g\ruw\u0006qc\f`\rf\u0016u"));
        cfr_renamed_112.put(sprdl.cfr_renamed_1601, sprtsn.cfr_renamed_9("I\u007f[\u0005/\u0001M~N\u007fHd["));
        cfr_renamed_112.put(sprdl.cfr_renamed_1572, sprhfp.cfr_renamed_9("g\ruv\fqc\f`\rf\u0016u"));
        cfr_renamed_112.put(sprdl.cfr_renamed_84, sprtsn.cfr_renamed_9("I\u007f[\u0002+\u0005M~N\u007fHd["));
        cfr_renamed_112.put(sprqo.cfr_renamed_107, sprhfp.cfr_renamed_9("\u0002{\u0016`v\u0000t\u0005\u0012}\u0011|\u0002{\u0016`v\u0000t\u0004"));
        cfr_renamed_112.put(sprqo.cfr_renamed_96, sprtsn.cfr_renamed_9("pUdN\u0004.\u0006+`ScRrYpUdN\u0004.\u0006*"));
        cfr_renamed_112.put(sprdt.cfr_renamed_1, sprhfp.cfr_renamed_9("\u0002{\u0016`v\u0000t\u0005h\u0006u\u0005w\u0019w\u0001sc\f`\rq\u0006s\ng\u0011\u0007q\u0005u\u0019w\u0004t\u0006h\u0006p\u0002"));
        cfr_renamed_112.put(sprdt.cfr_renamed_107, sprtsn.cfr_renamed_9("pUdN\u0004.\u0006+\u001a(\u0007+\u00057\u0002+\u0005M~N\u007f_t]xIc)\u0003+\u00077\u0005*\u0006(\u001a/\u0006("));
        cfr_renamed_112.put(sprjr.cfr_renamed_114, sprhfp.cfr_renamed_9("g\rutc\f`\rd\tu\fzhq\u0006p\u0016u"));
        cfr_renamed_112.put(sprjr.cfr_renamed_96, sprtsn.cfr_renamed_9("I\u007f[\u0005(\u0003M~N\u007fJ{[~T\u001a_t^d["));
        cfr_renamed_112.put(sprjr.cfr_renamed_126, sprhfp.cfr_renamed_9("g\ruw\u0001sc\f`\rd\tu\fzhq\u0006p\u0016u"));
        cfr_renamed_112.put(sprjr.cfr_renamed_105, sprtsn.cfr_renamed_9("I\u007f[\u0004\"\u0003M~N\u007fJ{[~T\u001a_t^d["));
        cfr_renamed_112.put(sprjr.cfr_renamed_2, sprhfp.cfr_renamed_9("g\rup\u0005wc\f`\rd\tu\fzhq\u0006p\u0016u"));
        cfr_renamed_112.put(sprjr.cfr_renamed_102, sprtsn.cfr_renamed_9("eSg_z^\u0006,\u0007M~N\u007fJ{[~T\u001a_t^d["));
        cfr_renamed_112.put(sprks.cfr_renamed_96, sprhfp.cfr_renamed_9("g\rutc\f`\rw\u0013whq\u0006p\u0016u"));
        cfr_renamed_112.put(sprks.cfr_renamed_119, sprtsn.cfr_renamed_9("I\u007f[\u0005(\u0003M~N\u007fYaY\u001a_t^d["));
        cfr_renamed_112.put(sprks.cfr_renamed_105, sprhfp.cfr_renamed_9("g\ruw\u0001sc\f`\rw\u0013whq\u0006p\u0016u"));
        cfr_renamed_112.put(sprks.cfr_renamed_152, sprtsn.cfr_renamed_9("I\u007f[\u0004\"\u0003M~N\u007fYaY\u001a_t^d["));
        cfr_renamed_112.put(sprks.cfr_renamed_126, sprhfp.cfr_renamed_9("g\rup\u0005wc\f`\rw\u0013whq\u0006p\u0016u"));
        cfr_renamed_112.put(sprbz.cfr_renamed_3, sprtsn.cfr_renamed_9("oWdI"));
        cfr_renamed_112.put(sprbz.cfr_renamed_4, sprhfp.cfr_renamed_9("\u001dy\u0016g\b`"));
        cfr_renamed_112.put(new sprlem(sprtsn.cfr_renamed_9("\u00064\u00054\u000f.\u00074\u0006+\u0004/\u0003#\u0019+\u0019+\u0019.")), sprhfp.cfr_renamed_9("\bppc\f`\rf\u0016u"));
        cfr_renamed_112.put(new sprlem(sprtsn.cfr_renamed_9("\u00064\u00054\u000f.\u00074\u0006+\u0004/\u0003#\u0019+\u0019+\u0019(")), sprhfp.cfr_renamed_9("\bpwc\f`\rf\u0016u"));
        cfr_renamed_112.put(new sprlem(sprtsn.cfr_renamed_9("+\u0019(\u0019\"\u0003*\u0019+\u0007*\u0003*\u0019.\u0019)")), sprhfp.cfr_renamed_9("g\rutc\f`\rp\u0016u"));
        cfr_renamed_112.put(sprbr.cfr_renamed_955, sprtsn.cfr_renamed_9("I\u007f[\u0006M~N\u007f_t^d["));
        cfr_renamed_112.put(sprbr.cfr_renamed_129, sprhfp.cfr_renamed_9("g\ruw\u0006qc\f`\rq\u0006p\u0016u"));
        cfr_renamed_112.put(sprbr.cfr_renamed_79, sprtsn.cfr_renamed_9("I\u007f[\u0005/\u0001M~N\u007f_t^d["));
        cfr_renamed_112.put(sprbr.cfr_renamed_107, sprhfp.cfr_renamed_9("g\ruv\fqc\f`\rq\u0006p\u0016u"));
        cfr_renamed_112.put(sprbr.cfr_renamed_724, sprtsn.cfr_renamed_9("I\u007f[\u0002+\u0005M~N\u007f_t^d["));
        cfr_renamed_112.put(sprgt.cfr_renamed_4, sprhfp.cfr_renamed_9("g\rutc\f`\rf\u0016u"));
        cfr_renamed_112.put(sprgt.cfr_renamed_93, sprtsn.cfr_renamed_9("I\u007f[\u0006M~N\u007f^d["));
        cfr_renamed_112.put(sprwr.cfr_renamed_79, sprhfp.cfr_renamed_9("g\ruw\u0006qc\f`\rp\u0016u"));
        cfr_renamed_112.put(sprwr.cfr_renamed_82, sprtsn.cfr_renamed_9("I\u007f[\u0005/\u0001M~N\u007f^d["));
    }

    public Set<String> cfr_renamed_365() {
        return null;
    }

    private static /* synthetic */ boolean cfr_renamed_9114(sprgum arg0, X509Certificate arg1, sprrr arg2) throws NoSuchProviderException, NoSuchAlgorithmException {
        byte[] byArray = arg0.cfr_renamed_4604();
        if (byArray != null) {
            MessageDigest messageDigest = arg2.cfr_renamed_7438("SHA1");
            return sproze.cfr_renamed_92(byArray, sprlyh.cfr_renamed_9111(messageDigest, arg1.getPublicKey()));
        }
        sprnbm sprnbm2 = sprnbm.cfr_renamed_9063(spruam.cfr_renamed_956, arg0.cfr_renamed_313());
        return sprnbm2.equals(sprnbm.cfr_renamed_9063(spruam.cfr_renamed_956, arg1.getSubjectX500Principal().getEncoded()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprssm cfr_renamed_9104(sprddm arg0, sprndm arg1, sprktm arg2) throws CertPathValidatorException {
        try {
            MessageDigest messageDigest = this.cfr_renamed_119.cfr_renamed_7438(sprmdi.cfr_renamed_5816(arg0.cfr_renamed_593()));
            sprfvg sprfvg2 = new sprfvg(messageDigest.digest(arg1.cfr_renamed_1485().cfr_renamed_104("DER")));
            sprfvg sprfvg3 = new sprfvg(messageDigest.digest(arg1.cfr_renamed_1489().cfr_renamed_2314().cfr_renamed_81()));
            return new sprssm(arg0, sprfvg2, sprfvg3, arg2);
        }
        catch (Exception exception) {
            throw new CertPathValidatorException(new StringBuilder().insert(0, sprhfp.cfr_renamed_9("D7['X YeW7Q$@,Z\"\u0014\fp\u007f\u0014")).append(exception).toString(), exception);
        }
    }
}

