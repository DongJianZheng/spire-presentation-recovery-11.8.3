/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprbyh;
import com.spire.presentation.packages.sprdzh;
import com.spire.presentation.packages.spregm;
import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprizda;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkph;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmuh;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpim;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrwja;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprsth;
import com.spire.presentation.packages.sprvcm;
import com.spire.presentation.packages.sprvzl;
import com.spire.presentation.packages.sprwzl;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
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

public class sprhyh
extends X509CRL {
    private int cfr_renamed_91;
    private boolean cfr_renamed_0;
    private sprffm cfr_renamed_1;
    private String cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private boolean cfr_renamed_4;

    @Override
    public int hashCode() {
        if (!this.cfr_renamed_0) {
            this.cfr_renamed_0 = true;
            this.cfr_renamed_91 = super.hashCode();
        }
        return this.cfr_renamed_91;
    }

    public Set getRevokedCertificates() {
        Set set = this.cfr_renamed_2137();
        if (!set.isEmpty()) {
            return Collections.unmodifiableSet(set);
        }
        return null;
    }

    @Override
    public void verify(PublicKey arg0, String arg1) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        Signature signature;
        sprhyh sprhyh2;
        if (arg1 != null) {
            sprhyh sprhyh3 = this;
            sprhyh2 = sprhyh3;
            signature = Signature.getInstance(sprhyh3.getSigAlgName(), arg1);
        } else {
            sprhyh sprhyh4 = this;
            sprhyh2 = sprhyh4;
            signature = Signature.getInstance(sprhyh4.getSigAlgName());
        }
        sprhyh2.cfr_renamed_9060(arg0, signature);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void verify(PublicKey arg0) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        sprhyh sprhyh2;
        Signature signature;
        try {
            signature = Signature.getInstance(this.getSigAlgName(), "BC");
            sprhyh2 = this;
        }
        catch (Exception exception) {
            sprhyh sprhyh3 = this;
            sprhyh2 = sprhyh3;
            signature = Signature.getInstance(sprhyh3.getSigAlgName());
        }
        sprhyh2.cfr_renamed_9060(arg0, signature);
    }

    @Override
    public int getVersion() {
        return this.cfr_renamed_1.cfr_renamed_569();
    }

    @Override
    public byte[] getSigAlgParams() {
        if (this.cfr_renamed_3 != null) {
            byte[] byArray = new byte[this.cfr_renamed_3.length];
            System.arraycopy(this.cfr_renamed_3, 0, byArray, 0, byArray.length);
            return byArray;
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
        set2.remove(sprmuh.cfr_renamed_152);
        set.remove(sprmuh.cfr_renamed_112);
        return !set2.isEmpty();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean isRevoked(Certificate arg0) {
        if (!arg0.getType().equals(sprrwja.cfr_renamed_9("EE([$"))) {
            throw new RuntimeException(sprizda.cfr_renamed_9("Zn7p;`A\u0012N`w3g$\"7k4j`l/l`Zn7p;`A%p4"));
        }
        sprhyh sprhyh2 = this;
        Enumeration enumeration = sprhyh2.cfr_renamed_1.cfr_renamed_2135();
        sprnbm sprnbm2 = sprhyh2.cfr_renamed_1.cfr_renamed_102();
        if (enumeration == null) return false;
        BigInteger bigInteger = ((X509Certificate)arg0).getSerialNumber();
        while (enumeration.hasMoreElements()) {
            sprnbm sprnbm3;
            sprqqe sprqqe2;
            sprpim sprpim2 = sprpim.cfr_renamed_23(enumeration.nextElement());
            if (this.cfr_renamed_4 && sprpim2.cfr_renamed_663() && (sprqqe2 = sprpim2.cfr_renamed_98().cfr_renamed_5024(sprrdm.cfr_renamed_119)) != null) {
                sprnbm2 = sprnbm.cfr_renamed_23(spraem.cfr_renamed_23(sprqqe2.cfr_renamed_372()).cfr_renamed_289()[0].cfr_renamed_313());
            }
            if (!sprpim2.cfr_renamed_2136().cfr_renamed_5103(bigInteger)) continue;
            if (arg0 instanceof X509Certificate) {
                sprqqe2 = sprnbm.cfr_renamed_23(((X509Certificate)arg0).getIssuerX500Principal().getEncoded());
                sprnbm3 = sprnbm2;
                return sprnbm3.equals(sprqqe2);
            }
            try {
                sprqqe2 = sprndm.cfr_renamed_23(arg0.getEncoded()).cfr_renamed_102();
                sprnbm3 = sprnbm2;
                return sprnbm3.equals(sprqqe2);
            }
            catch (CertificateEncodingException certificateEncodingException) {
                throw new RuntimeException(sprrwja.cfr_renamed_9("(|\u0005s\u0004iKm\u0019r\bx\u0018nK~\u000eo\u001ft\rt\b|\u001fx"));
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getTBSCertList() throws CRLException {
        try {
            return this.cfr_renamed_1.cfr_renamed_2134().cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new CRLException(iOException.toString());
        }
    }

    @Override
    public Principal getIssuerDN() {
        return new sprdzh(sprnbm.cfr_renamed_23(this.cfr_renamed_1.cfr_renamed_102().cfr_renamed_119()));
    }

    @Override
    public Date getThisUpdate() {
        return this.cfr_renamed_1.cfr_renamed_2132().cfr_renamed_110();
    }

    @Override
    public String getSigAlgOID() {
        return this.cfr_renamed_1.cfr_renamed_89().cfr_renamed_593().cfr_renamed_19();
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
            throw new sprbyh(sprizda.cfr_renamed_9("G8a%r4k/l`p%c$k.e`K3q5k.e\u0004k3v2k\"w4k/l\u0010m)l4"), exception);
        }
    }

    private /* synthetic */ void cfr_renamed_9060(PublicKey arg0, Signature arg1) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        if (!this.cfr_renamed_1.cfr_renamed_89().equals(this.cfr_renamed_1.cfr_renamed_2134().cfr_renamed_79())) {
            throw new CRLException(sprrwja.cfr_renamed_9("8t\fs\ni\u001eo\u000e=\nq\fr\u0019t\u001fu\u0006=\u0004sK^\u000eo\u001ft\rt\b|\u001fx't\u0018iKy\u0004x\u0018=\u0005r\u001f=\u0006|\u001f~\u0003=?_8^\u000eo\u001fQ\u0002n\u001f3"));
        }
        Signature signature = arg1;
        sprhyh sprhyh2 = this;
        arg1.initVerify(arg0);
        signature.update(sprhyh2.getTBSCertList());
        if (!signature.verify(sprhyh2.getSignature())) {
            throw new SignatureException(sprizda.cfr_renamed_9("\u0003P\f\"$m%q`l/v`t%p)d9\"7k4j`q5r0n)g$\"0w\"n)a`i%{n"));
        }
    }

    private /* synthetic */ Set cfr_renamed_2137() {
        HashSet<sprsth> hashSet = new HashSet<sprsth>();
        Enumeration enumeration = this.cfr_renamed_1.cfr_renamed_2135();
        sprnbm sprnbm2 = null;
        while (enumeration.hasMoreElements()) {
            sprrdm sprrdm2;
            sprpim sprpim2 = (sprpim)enumeration.nextElement();
            sprsth sprsth2 = new sprsth(sprpim2, this.cfr_renamed_4, sprnbm2);
            hashSet.add(sprsth2);
            if (!this.cfr_renamed_4 || !sprpim2.cfr_renamed_663() || (sprrdm2 = sprpim2.cfr_renamed_98().cfr_renamed_5024(sprrdm.cfr_renamed_119)) == null) continue;
            sprnbm2 = sprnbm.cfr_renamed_23(spraem.cfr_renamed_23(sprrdm2.cfr_renamed_372()).cfr_renamed_289()[0].cfr_renamed_313());
        }
        return hashSet;
    }

    public Set getNonCriticalExtensionOIDs() {
        return this.cfr_renamed_78(false);
    }

    @Override
    public String toString() {
        Object object;
        Object object2;
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        stringBuffer.append(sprrwja.cfr_renamed_9("=K=K=K=K=K=K=KK\u000eo\u0018t\u0004sQ=")).append(this.getVersion()).append(string);
        stringBuffer.append(sprizda.cfr_renamed_9("`\"`\"`\"`\"`\"`\"`K3q5g2F\u000e8`")).append(this.getIssuerDN()).append(string);
        stringBuffer.append(sprrwja.cfr_renamed_9("=K=K=K=K=KI\u0003t\u0018=\u001em\u000f|\u001fxQ=")).append(this.getThisUpdate()).append(string);
        stringBuffer.append(sprizda.cfr_renamed_9("`\"`\"`\"`\"`\"\u000eg8v`w0f!v%8`")).append(this.getNextUpdate()).append(string);
        stringBuffer.append(sprrwja.cfr_renamed_9("=KN\u0002z\u0005|\u001fh\u0019xK\\\u0007z\u0004o\u0002i\u0003pQ=")).append(this.getSigAlgName()).append(string);
        byte[] byArray = this.getSignature();
        stringBuffer.append(sprizda.cfr_renamed_9("`\"`\"`\"`\"`\"`\"\u0013k'l!v5p%8`")).append(new String(sprfqe.cfr_renamed_502(byArray, 0, 20))).append(string);
        int n = 20;
        int n2 = n;
        while (n2 < byArray.length) {
            if (n < byArray.length - 20) {
                stringBuffer.append(sprrwja.cfr_renamed_9("=K=K=K=K=K=K=K=K=K=K=K=")).append(new String(sprfqe.cfr_renamed_502(byArray, n, 20))).append(string);
            } else {
                stringBuffer.append(sprizda.cfr_renamed_9("`\"`\"`\"`\"`\"`\"`\"`\"`\"`\"`\"`")).append(new String(sprfqe.cfr_renamed_502(byArray, n, byArray.length - n))).append(string);
            }
            n2 = n += 20;
        }
        sprhgm sprhgm2 = this.cfr_renamed_1.cfr_renamed_2134().cfr_renamed_98();
        if (sprhgm2 != null) {
            object2 = sprhgm2.cfr_renamed_99();
            if (object2.hasMoreElements()) {
                stringBuffer.append(sprrwja.cfr_renamed_9("=K=K=K=K=K=.e\u001fx\u0005n\u0002r\u0005nQ=")).append(string);
            }
            while (object2.hasMoreElements()) {
                object = (sprlem)object2.nextElement();
                sprrdm sprrdm2 = sprhgm2.cfr_renamed_5024((sprlem)object);
                if (sprrdm2.cfr_renamed_103() != null) {
                    byte[] byArray2 = sprrdm2.cfr_renamed_103().cfr_renamed_186();
                    sprrzm sprrzm2 = new sprrzm(byArray2);
                    stringBuffer.append(sprizda.cfr_renamed_9("\"`\"`\"`\"`\"`\"`\"`\"`\"`\"`\"`\"#p)v)a!nh")).append(sprrdm2.cfr_renamed_101()).append(sprrwja.cfr_renamed_9("B="));
                    try {
                        if (((sprxgf)object).cfr_renamed_5078(sprrdm.cfr_renamed_128)) {
                            stringBuffer.append(new sprvzl(sprktm.cfr_renamed_23(sprrzm2.cfr_renamed_24()).cfr_renamed_162())).append(string);
                            continue;
                        }
                        if (((sprxgf)object).cfr_renamed_5078(sprrdm.cfr_renamed_4)) {
                            stringBuffer.append(new StringBuilder().insert(0, sprizda.cfr_renamed_9("@!q%\"\u0003P\f8`")).append(new sprvzl(sprktm.cfr_renamed_23(sprrzm2.cfr_renamed_24()).cfr_renamed_162())).toString()).append(string);
                            continue;
                        }
                        if (((sprxgf)object).cfr_renamed_5078(sprrdm.cfr_renamed_96)) {
                            stringBuffer.append(sprwzl.cfr_renamed_23(sprrzm2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        if (((sprxgf)object).cfr_renamed_5078(sprrdm.cfr_renamed_79)) {
                            stringBuffer.append(sprvcm.cfr_renamed_23(sprrzm2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        StringBuffer stringBuffer2 = stringBuffer;
                        if (((sprxgf)object).cfr_renamed_5078(sprrdm.cfr_renamed_957)) {
                            stringBuffer2.append(sprvcm.cfr_renamed_23(sprrzm2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        stringBuffer2.append(((sprlem)object).cfr_renamed_19());
                        stringBuffer.append(sprrwja.cfr_renamed_9("=\u001d|\u0007h\u000e=V=")).append(spregm.cfr_renamed_2138(sprrzm2.cfr_renamed_24())).append(string);
                    }
                    catch (Exception exception) {
                        stringBuffer.append(((sprlem)object).cfr_renamed_19());
                        stringBuffer.append(sprizda.cfr_renamed_9("`t!n5g`?`")).append(sprrwja.cfr_renamed_9("7A7A7")).append(string);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getExtensionValue(String arg0) {
        sprhgm sprhgm2 = this.cfr_renamed_1.cfr_renamed_2134().cfr_renamed_98();
        if (sprhgm2 != null) {
            sprrdm sprrdm2 = sprhgm2.cfr_renamed_5024(new sprlem(arg0));
            if (sprrdm2 != null) {
                try {
                    return sprrdm2.cfr_renamed_103().cfr_renamed_91();
                }
                catch (Exception exception) {
                    throw new IllegalStateException(new StringBuilder().insert(0, sprizda.cfr_renamed_9("g2p/p`r!p3k.e`")).append(exception.toString()).toString());
                }
            }
        }
        return null;
    }

    @Override
    public X509CRLEntry getRevokedCertificate(BigInteger arg0) {
        Enumeration enumeration = this.cfr_renamed_1.cfr_renamed_2135();
        sprnbm sprnbm2 = null;
        while (enumeration.hasMoreElements()) {
            sprrdm sprrdm2;
            sprpim sprpim2 = (sprpim)enumeration.nextElement();
            if (sprpim2.cfr_renamed_2136().cfr_renamed_5103(arg0)) {
                return new sprsth(sprpim2, this.cfr_renamed_4, sprnbm2);
            }
            if (!this.cfr_renamed_4 || !sprpim2.cfr_renamed_663() || (sprrdm2 = sprpim2.cfr_renamed_98().cfr_renamed_5024(sprrdm.cfr_renamed_119)) == null) continue;
            sprnbm2 = sprnbm.cfr_renamed_23(spraem.cfr_renamed_23(sprrdm2.cfr_renamed_372()).cfr_renamed_289()[0].cfr_renamed_313());
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprhyh(sprffm sprffm2) throws CRLException {
        sprhyh sprhyh2 = this;
        sprhyh2.cfr_renamed_0 = false;
        sprhyh2.cfr_renamed_1 = sprffm2;
        try {
            sprhyh sprhyh3;
            void arg0;
            this.cfr_renamed_2 = sprkph.cfr_renamed_9057(arg0.cfr_renamed_89());
            if (arg0.cfr_renamed_89().cfr_renamed_284() != null) {
                sprhyh3 = this;
                this.cfr_renamed_3 = arg0.cfr_renamed_89().cfr_renamed_284().cfr_renamed_119().cfr_renamed_104("DER");
            } else {
                sprhyh3 = this;
                this.cfr_renamed_3 = null;
            }
            sprhyh3.cfr_renamed_4 = sprhyh.cfr_renamed_2130(this);
            return;
        }
        catch (Exception exception) {
            throw new CRLException(new StringBuilder().insert(0, sprrwja.cfr_renamed_9("(O'=\br\u0005i\u000es\u001fnKt\u0005k\nq\u0002yQ=")).append(exception).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() throws CRLException {
        try {
            return this.cfr_renamed_1.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new CRLException(iOException.toString());
        }
    }

    private /* synthetic */ Set cfr_renamed_78(boolean arg0) {
        sprhgm sprhgm2;
        if (this.getVersion() == 2 && (sprhgm2 = this.cfr_renamed_1.cfr_renamed_2134().cfr_renamed_98()) != null) {
            HashSet<String> hashSet = new HashSet<String>();
            Enumeration enumeration = sprhgm2.cfr_renamed_99();
            while (enumeration.hasMoreElements()) {
                sprlem sprlem2 = (sprlem)enumeration.nextElement();
                sprrdm sprrdm2 = sprhgm2.cfr_renamed_5024(sprlem2);
                if (arg0 != sprrdm2.cfr_renamed_101()) continue;
                hashSet.add(sprlem2.cfr_renamed_19());
            }
            return hashSet;
        }
        return null;
    }

    public Set getCriticalExtensionOIDs() {
        return this.cfr_renamed_78(true);
    }

    @Override
    public void verify(PublicKey arg0, Provider arg1) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Signature signature;
        sprhyh sprhyh2;
        if (arg1 != null) {
            sprhyh sprhyh3 = this;
            sprhyh2 = sprhyh3;
            signature = Signature.getInstance(sprhyh3.getSigAlgName(), arg1);
        } else {
            sprhyh sprhyh4 = this;
            sprhyh2 = sprhyh4;
            signature = Signature.getInstance(sprhyh4.getSigAlgName());
        }
        sprhyh2.cfr_renamed_9060(arg0, signature);
    }

    @Override
    public Date getNextUpdate() {
        if (this.cfr_renamed_1.cfr_renamed_2133() != null) {
            return this.cfr_renamed_1.cfr_renamed_2133().cfr_renamed_110();
        }
        return null;
    }

    @Override
    public String getSigAlgName() {
        return this.cfr_renamed_2;
    }

    @Override
    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (!(arg0 instanceof X509CRL)) {
            return false;
        }
        if (arg0 instanceof sprhyh) {
            sprhyh sprhyh2 = (sprhyh)arg0;
            if (this.cfr_renamed_0 && sprhyh2.cfr_renamed_0 && sprhyh2.cfr_renamed_91 != this.cfr_renamed_91) {
                return false;
            }
            return this.cfr_renamed_1.equals(sprhyh2.cfr_renamed_1);
        }
        return super.equals(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.cfr_renamed_1.cfr_renamed_102().cfr_renamed_91());
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprizda.cfr_renamed_9("a!lgv`g.a/f%\")q3w%p`F\u000e"));
        }
    }

    @Override
    public byte[] getSignature() {
        return this.cfr_renamed_1.cfr_renamed_79().cfr_renamed_186();
    }
}

