/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraee;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprcje;
import com.spire.presentation.packages.sprcpc;
import com.spire.presentation.packages.sprefe;
import com.spire.presentation.packages.sprege;
import com.spire.presentation.packages.sprenc;
import com.spire.presentation.packages.sprfjb;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprhnc;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlbd;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sprnge;
import com.spire.presentation.packages.sproje;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprrtea;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwmb;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryee;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public class sprtkc
extends X509CRL {
    private sproje cfr_renamed_91;
    private String cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private boolean cfr_renamed_2;
    private int cfr_renamed_3;
    private boolean cfr_renamed_4;

    @Override
    public String toString() {
        Object object;
        Object object2;
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprrtea.cfr_renamed_9("%D'Hg^,](_(Y&_"));
        stringBuffer.append(sprlbd.cfr_renamed_9("VdVdVdVdVdVdVd !\u00047\u001f+\u0018~V")).append(this.getVersion()).append(string);
        stringBuffer.append(sprrtea.cfr_renamed_9("\ri\ri\ri\ri\ri\ri\r\u0000^:X,_\rcs\r")).append(this.getIssuerDN()).append(string);
        stringBuffer.append(sprlbd.cfr_renamed_9("VdVdVdVdVd\",\u001f7V1\u0006 \u00170\u0013~V")).append(this.getThisUpdate()).append(string);
        stringBuffer.append(sprrtea.cfr_renamed_9("\ri\ri\ri\ri\ric,U=\r<]-L=Hs\r")).append(this.getNextUpdate()).append(string);
        stringBuffer.append(sprlbd.cfr_renamed_9("Vd%-\u0011*\u00170\u00036\u0013d7(\u0011+\u0004-\u0002,\u001b~V")).append(this.getSigAlgName()).append(string);
        byte[] byArray = this.getSignature();
        stringBuffer.append(sprrtea.cfr_renamed_9("\ri\ri\ri\ri\ri\ri~ J'L=X;Hs\r")).append(new String(sprmma.cfr_renamed_502(byArray, 0, 20))).append(string);
        int n = 20;
        int n2 = n;
        while (n2 < byArray.length) {
            if (n < byArray.length - 20) {
                stringBuffer.append(sprlbd.cfr_renamed_9("VdVdVdVdVdVdVdVdVdVdVdV")).append(new String(sprmma.cfr_renamed_502(byArray, n, 20))).append(string);
            } else {
                stringBuffer.append(sprrtea.cfr_renamed_9("\ri\ri\ri\ri\ri\ri\ri\ri\ri\ri\ri\r")).append(new String(sprmma.cfr_renamed_502(byArray, n, byArray.length - n))).append(string);
            }
            n2 = n += 20;
        }
        sprszd sprszd2 = this.cfr_renamed_91.cfr_renamed_2134().cfr_renamed_98();
        if (sprszd2 != null) {
            object2 = sprszd2.cfr_renamed_99();
            if (object2.hasMoreElements()) {
                stringBuffer.append(sprlbd.cfr_renamed_9("VdVdVdVdVdV\u0001\u000e0\u0013*\u0005-\u0019*\u0005~V")).append(string);
            }
            while (object2.hasMoreElements()) {
                object = (sprtzd)object2.nextElement();
                sprtie sprtie2 = sprszd2.cfr_renamed_100((sprtzd)object);
                if (sprtie2.cfr_renamed_103() != null) {
                    byte[] byArray2 = sprtie2.cfr_renamed_103().cfr_renamed_186();
                    sprgle sprgle2 = new sprgle(byArray2);
                    stringBuffer.append(sprrtea.cfr_renamed_9("i\ri\ri\ri\ri\ri\ri\ri\ri\ri\ri\riN;D=D*L%\u0005")).append(sprtie2.cfr_renamed_101()).append(sprlbd.cfr_renamed_9("mV"));
                    try {
                        if (((sprvva)object).equals(sprtie.cfr_renamed_132)) {
                            stringBuffer.append(new spraee(sprooe.cfr_renamed_23(sprgle2.cfr_renamed_24()).cfr_renamed_162())).append(string);
                            continue;
                        }
                        if (((sprvva)object).equals(sprtie.cfr_renamed_185)) {
                            stringBuffer.append(new StringBuilder().insert(0, sprrtea.cfr_renamed_9("\u000bL:Hin\u001bas\r")).append(new spraee(sprooe.cfr_renamed_23(sprgle2.cfr_renamed_24()).cfr_renamed_162())).toString()).append(string);
                            continue;
                        }
                        if (((sprvva)object).equals(sprtie.cfr_renamed_0)) {
                            stringBuffer.append(sprnge.cfr_renamed_23(sprgle2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        if (((sprvva)object).equals(sprtie.spr\ufe34)) {
                            stringBuffer.append(sprefe.cfr_renamed_23(sprgle2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        StringBuffer stringBuffer2 = stringBuffer;
                        if (((sprvva)object).equals(sprtie.cfr_renamed_79)) {
                            stringBuffer2.append(sprefe.cfr_renamed_23(sprgle2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        stringBuffer2.append(((sprtzd)object).cfr_renamed_19());
                        stringBuffer.append(sprlbd.cfr_renamed_9("V2\u0017(\u0003!VyV")).append(sprcje.cfr_renamed_2138(sprgle2.cfr_renamed_24())).append(string);
                    }
                    catch (Exception exception) {
                        stringBuffer.append(((sprtzd)object).cfr_renamed_19());
                        stringBuffer.append(sprrtea.cfr_renamed_9("\r?L%X,\rt\r")).append(sprlbd.cfr_renamed_9("\\n\\n\\")).append(string);
                    }
                    continue;
                }
                stringBuffer.append(string);
            }
        }
        if ((object2 = this.getRevokedCertificates()) != null) {
            Object object3 = object = object2.iterator();
            while (object3.hasNext()) {
                Object object4 = object;
                object3 = object4;
                stringBuffer.append(object4.next());
                stringBuffer.append(string);
            }
        }
        return stringBuffer.toString();
    }

    @Override
    public byte[] getSignature() {
        return this.cfr_renamed_91.cfr_renamed_79().cfr_renamed_81();
    }

    private /* synthetic */ Set cfr_renamed_2137() {
        HashSet<sprcpc> hashSet = new HashSet<sprcpc>();
        Enumeration enumeration = this.cfr_renamed_91.cfr_renamed_2135();
        spruhe spruhe2 = null;
        while (enumeration.hasMoreElements()) {
            sprtie sprtie2;
            sprege sprege2 = (sprege)enumeration.nextElement();
            sprcpc sprcpc2 = new sprcpc(sprege2, this.cfr_renamed_2, spruhe2);
            hashSet.add(sprcpc2);
            if (!this.cfr_renamed_2 || !sprege2.cfr_renamed_663() || (sprtie2 = sprege2.cfr_renamed_98().cfr_renamed_100(sprtie.cfr_renamed_105)) == null) continue;
            spruhe2 = spruhe.cfr_renamed_23(spryee.cfr_renamed_23(sprtie2.cfr_renamed_372()).cfr_renamed_289()[0].cfr_renamed_313());
        }
        return hashSet;
    }

    @Override
    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (!(arg0 instanceof X509CRL)) {
            return false;
        }
        if (arg0 instanceof sprtkc) {
            sprtkc sprtkc2 = (sprtkc)arg0;
            if (this.cfr_renamed_4 && sprtkc2.cfr_renamed_4 && sprtkc2.cfr_renamed_3 != this.cfr_renamed_3) {
                return false;
            }
            return this.cfr_renamed_91.equals(sprtkc2.cfr_renamed_91);
        }
        return super.equals(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getTBSCertList() throws CRLException {
        try {
            return this.cfr_renamed_91.cfr_renamed_2134().cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new CRLException(iOException.toString());
        }
    }

    @Override
    public byte[] getSigAlgParams() {
        if (this.cfr_renamed_1 != null) {
            byte[] byArray = new byte[this.cfr_renamed_1.length];
            System.arraycopy(this.cfr_renamed_1, 0, byArray, 0, byArray.length);
            return byArray;
        }
        return null;
    }

    @Override
    public X509CRLEntry getRevokedCertificate(BigInteger arg0) {
        Enumeration enumeration = this.cfr_renamed_91.cfr_renamed_2135();
        spruhe spruhe2 = null;
        while (enumeration.hasMoreElements()) {
            sprtie sprtie2;
            sprege sprege2 = (sprege)enumeration.nextElement();
            if (arg0.equals(sprege2.cfr_renamed_2136().cfr_renamed_97())) {
                return new sprcpc(sprege2, this.cfr_renamed_2, spruhe2);
            }
            if (!this.cfr_renamed_2 || !sprege2.cfr_renamed_663() || (sprtie2 = sprege2.cfr_renamed_98().cfr_renamed_100(sprtie.cfr_renamed_105)) == null) continue;
            spruhe2 = spruhe.cfr_renamed_23(spryee.cfr_renamed_23(sprtie2.cfr_renamed_372()).cfr_renamed_289()[0].cfr_renamed_313());
        }
        return null;
    }

    @Override
    public void verify(PublicKey arg0, String arg1) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        Signature signature;
        if (!this.cfr_renamed_91.cfr_renamed_89().equals(this.cfr_renamed_91.cfr_renamed_2134().cfr_renamed_79())) {
            throw new CRLException(sprrtea.cfr_renamed_9("\u001aD.C(Y<_,\r(A.B;D=E$\r&Cin,_=D/D*L=H\u0005D:YiI&H:\r'B=\r$L=N!\r\u001do\u001an,_=a ^=\u0003"));
        }
        (arg1 != null ? (signature = Signature.getInstance(this.getSigAlgName(), arg1)) : (signature = Signature.getInstance(this.getSigAlgName()))).initVerify(arg0);
        Signature signature2 = signature;
        signature2.update(this.getTBSCertList());
        if (!signature2.verify(this.getSignature())) {
            throw new SignatureException(sprlbd.cfr_renamed_9("5\u0016:d\u0012+\u00137V*\u00190V2\u00136\u001f\"\u000fd\u0001-\u0002,V7\u00034\u0006(\u001f!\u0012d\u00061\u0014(\u001f'V/\u0013=X"));
        }
    }

    @Override
    public int hashCode() {
        if (!this.cfr_renamed_4) {
            this.cfr_renamed_4 = true;
            this.cfr_renamed_3 = super.hashCode();
        }
        return this.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean cfr_renamed_2130(X509CRL arg0) throws CRLException {
        try {
            byte[] byArray = arg0.getExtensionValue(sprtie.cfr_renamed_0.cfr_renamed_19());
            return byArray != null && sprnge.cfr_renamed_23(sprxue.cfr_renamed_23(byArray).cfr_renamed_186()).cfr_renamed_2131();
        }
        catch (Exception exception) {
            throw new sprenc(sprrtea.cfr_renamed_9("\fU*H9Y B'\r;H(I C.\r\u0000^:X C.i ^=_ O<Y B'}&D'Y"), exception);
        }
    }

    public Set getRevokedCertificates() {
        Set set = this.cfr_renamed_2137();
        if (!set.isEmpty()) {
            return Collections.unmodifiableSet(set);
        }
        return null;
    }

    @Override
    public boolean hasUnsupportedCriticalExtension() {
        Set set = this.getCriticalExtensionOIDs();
        if (set == null) {
            return false;
        }
        Set set2 = set;
        set2.remove(sprwmb.cfr_renamed_102);
        set.remove(sprwmb.cfr_renamed_0);
        return !set2.isEmpty();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprtkc(sproje sproje2) throws CRLException {
        sprtkc sprtkc2 = this;
        sprtkc2.cfr_renamed_4 = false;
        sprtkc2.cfr_renamed_91 = sproje2;
        try {
            sprtkc sprtkc3;
            void arg0;
            this.cfr_renamed_0 = sprhnc.cfr_renamed_1538(arg0.cfr_renamed_89());
            if (arg0.cfr_renamed_89().cfr_renamed_284() != null) {
                sprtkc3 = this;
                this.cfr_renamed_1 = arg0.cfr_renamed_89().cfr_renamed_284().cfr_renamed_119().cfr_renamed_104("DER");
            } else {
                sprtkc3 = this;
                this.cfr_renamed_1 = null;
            }
            sprtkc3.cfr_renamed_2 = sprtkc.cfr_renamed_2130(this);
            return;
        }
        catch (Exception exception) {
            throw new CRLException(new StringBuilder().insert(0, sprlbd.cfr_renamed_9("\u0007$\bV'\u0019*\u0002!\u00180\u0005d\u001f*\u0000%\u001a-\u0012~V")).append(exception).toString());
        }
    }

    @Override
    public String getSigAlgName() {
        return this.cfr_renamed_0;
    }

    @Override
    public Date getNextUpdate() {
        if (this.cfr_renamed_91.cfr_renamed_2133() != null) {
            return this.cfr_renamed_91.cfr_renamed_2133().cfr_renamed_110();
        }
        return null;
    }

    @Override
    public int getVersion() {
        return this.cfr_renamed_91.cfr_renamed_569();
    }

    @Override
    public Date getThisUpdate() {
        return this.cfr_renamed_91.cfr_renamed_2132().cfr_renamed_110();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() throws CRLException {
        try {
            return this.cfr_renamed_91.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new CRLException(iOException.toString());
        }
    }

    @Override
    public Principal getIssuerDN() {
        return new sprfjb(spruhe.cfr_renamed_23(this.cfr_renamed_91.cfr_renamed_102().cfr_renamed_119()));
    }

    private /* synthetic */ Set cfr_renamed_78(boolean arg0) {
        sprszd sprszd2;
        if (this.getVersion() == 2 && (sprszd2 = this.cfr_renamed_91.cfr_renamed_2134().cfr_renamed_98()) != null) {
            HashSet<String> hashSet = new HashSet<String>();
            Enumeration enumeration = sprszd2.cfr_renamed_99();
            while (enumeration.hasMoreElements()) {
                sprtzd sprtzd2 = (sprtzd)enumeration.nextElement();
                sprtie sprtie2 = sprszd2.cfr_renamed_100(sprtzd2);
                if (arg0 != sprtie2.cfr_renamed_101()) continue;
                hashSet.add(sprtzd2.cfr_renamed_19());
            }
            return hashSet;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean isRevoked(Certificate arg0) {
        if (!arg0.getType().equals(sprrtea.cfr_renamed_9("ug\u0018y\u0014"))) {
            throw new RuntimeException(sprlbd.cfr_renamed_9("\u001cXqF}V\u0007$\bV1\u0005!\u0012d\u0001-\u0002,V*\u0019*V\u001cXqF}V\u0007\u00136\u0002"));
        }
        sprtkc sprtkc2 = this;
        Enumeration enumeration = sprtkc2.cfr_renamed_91.cfr_renamed_2135();
        spruhe spruhe2 = sprtkc2.cfr_renamed_91.cfr_renamed_102();
        if (!enumeration.hasMoreElements()) return false;
        BigInteger bigInteger = ((X509Certificate)arg0).getSerialNumber();
        while (enumeration.hasMoreElements()) {
            spruhe spruhe3;
            sprkra sprkra2;
            sprege sprege2 = sprege.cfr_renamed_23(enumeration.nextElement());
            if (this.cfr_renamed_2 && sprege2.cfr_renamed_663() && (sprkra2 = sprege2.cfr_renamed_98().cfr_renamed_100(sprtie.cfr_renamed_105)) != null) {
                spruhe2 = spruhe.cfr_renamed_23(spryee.cfr_renamed_23(sprkra2.cfr_renamed_372()).cfr_renamed_289()[0].cfr_renamed_313());
            }
            if (!sprege2.cfr_renamed_2136().cfr_renamed_97().equals(bigInteger)) continue;
            if (arg0 instanceof X509Certificate) {
                sprkra2 = spruhe.cfr_renamed_23(((X509Certificate)arg0).getIssuerX500Principal().getEncoded());
                spruhe3 = spruhe2;
                return spruhe3.equals(sprkra2);
            }
            try {
                sprkra2 = sprcge.cfr_renamed_23(arg0.getEncoded()).cfr_renamed_102();
                spruhe3 = spruhe2;
                return spruhe3.equals(sprkra2);
            }
            catch (CertificateEncodingException certificateEncodingException) {
                throw new RuntimeException(sprrtea.cfr_renamed_9("\nL'C&Yi];B*H:^iN,_=D/D*L=H"));
            }
        }
        return false;
    }

    @Override
    public String getSigAlgOID() {
        return this.cfr_renamed_91.cfr_renamed_89().cfr_renamed_593().cfr_renamed_19();
    }

    @Override
    public void verify(PublicKey arg0) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.verify(arg0, "BC");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.cfr_renamed_91.cfr_renamed_102().cfr_renamed_91());
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprlbd.cfr_renamed_9("'\u0017*Q0V!\u0018'\u0019 \u0013d\u001f7\u00051\u00136V\u00008"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getExtensionValue(String arg0) {
        sprszd sprszd2 = this.cfr_renamed_91.cfr_renamed_2134().cfr_renamed_98();
        if (sprszd2 != null) {
            sprtie sprtie2 = sprszd2.cfr_renamed_100(new sprtzd(arg0));
            if (sprtie2 != null) {
                try {
                    return sprtie2.cfr_renamed_103().cfr_renamed_91();
                }
                catch (Exception exception) {
                    throw new IllegalStateException(new StringBuilder().insert(0, sprrtea.cfr_renamed_9(",_;B;\r9L;^ C.\r")).append(exception.toString()).toString());
                }
            }
        }
        return null;
    }

    public Set getCriticalExtensionOIDs() {
        return this.cfr_renamed_78(true);
    }

    public Set getNonCriticalExtensionOIDs() {
        return this.cfr_renamed_78(false);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = 5 << 4 ^ (2 ^ 5) << 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ 3;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }
}

