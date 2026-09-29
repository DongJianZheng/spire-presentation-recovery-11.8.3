/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprcje;
import com.spire.presentation.packages.sprdbe;
import com.spire.presentation.packages.sprfjb;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprgmg;
import com.spire.presentation.packages.sprhge;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprnpb;
import com.spire.presentation.packages.sprooc;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprpge;
import com.spire.presentation.packages.sprqce;
import com.spire.presentation.packages.sprrf;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwb;
import com.spire.presentation.packages.sprwge;
import com.spire.presentation.packages.sprwmb;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.sprzeo;
import com.spire.presentation.packages.sprzfe;
import com.spire.presentation.packages.sprzra;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public class sprbnb
extends X509Certificate
implements sprwb {
    private sprcge cfr_renamed_91;
    private sprwge cfr_renamed_0;
    private boolean[] cfr_renamed_1;
    private sprwb cfr_renamed_2;
    private int cfr_renamed_3;
    private boolean cfr_renamed_4;

    public Collection getSubjectAlternativeNames() throws CertificateParsingException {
        return sprbnb.cfr_renamed_368(this.cfr_renamed_2145(sprtie.cfr_renamed_107.cfr_renamed_19()));
    }

    @Override
    public void checkValidity(Date arg0) throws CertificateExpiredException, CertificateNotYetValidException {
        if (arg0.getTime() > this.getNotAfter().getTime()) {
            throw new CertificateExpiredException(new StringBuilder().insert(0, sprgmg.cfr_renamed_9("G>V/M=M8E/A{A#T2V>@{K5\u0004")).append(this.cfr_renamed_91.cfr_renamed_2146().cfr_renamed_2147()).toString());
        }
        if (arg0.getTime() < this.getNotBefore().getTime()) {
            throw new CertificateNotYetValidException(new StringBuilder().insert(0, sprzeo.cfr_renamed_9("\tm\u0018|\u0003n\u0003k\u000b|\u000f(\u0004g\u001e(\u001ci\u0006a\u000e(\u001ea\u0006dJ")).append(this.cfr_renamed_91.cfr_renamed_2148().cfr_renamed_2147()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public X500Principal getSubjectX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new sprope(byteArrayOutputStream).cfr_renamed_2149(this.cfr_renamed_91.cfr_renamed_1485());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprgmg.cfr_renamed_9("8E5\u0003/\u0004>J8K?A{M(W.A)\u0004\u001fj"));
        }
    }

    @Override
    public String getSigAlgOID() {
        return this.cfr_renamed_91.cfr_renamed_89().cfr_renamed_593().cfr_renamed_19();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Collection cfr_renamed_368(byte[] arg0) throws CertificateParsingException {
        if (arg0 == null) {
            return null;
        }
        try {
            Enumeration enumeration;
            ArrayList arrayList = new ArrayList();
            Enumeration enumeration2 = enumeration = sprbne.cfr_renamed_23(arg0).cfr_renamed_329();
            block11: while (enumeration2.hasMoreElements()) {
                ArrayList arrayList2;
                sprmee sprmee2 = sprmee.cfr_renamed_23(enumeration.nextElement());
                ArrayList<Object> arrayList3 = new ArrayList<Object>();
                sprmee sprmee3 = sprmee2;
                arrayList3.add(spriwa.cfr_renamed_279(sprmee3.cfr_renamed_312()));
                switch (sprmee3.cfr_renamed_312()) {
                    case 0: 
                    case 3: 
                    case 5: {
                        arrayList3.add(sprmee2.cfr_renamed_91());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 4: {
                        arrayList3.add(spruhe.cfr_renamed_2150(sprqce.cfr_renamed_287, sprmee2.cfr_renamed_313()).toString());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 6: {
                        arrayList3.add(((sprx)((Object)sprmee2.cfr_renamed_313())).cfr_renamed_314());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 8: {
                        arrayList3.add(sprtzd.cfr_renamed_23(sprmee2.cfr_renamed_313()).cfr_renamed_19());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 7: {
                        String string;
                        byte[] byArray = sprlqe.cfr_renamed_23(sprmee2.cfr_renamed_313()).cfr_renamed_186();
                        try {
                            string = InetAddress.getByAddress(byArray).getHostAddress();
                        }
                        catch (UnknownHostException unknownHostException) {
                            enumeration2 = enumeration;
                            continue block11;
                        }
                        arrayList3.add(string);
                        arrayList2 = arrayList;
                        break;
                    }
                    default: {
                        throw new IOException(new StringBuilder().insert(0, sprzeo.cfr_renamed_9("J\u000blJ|\u000boJf\u001fe\bm\u00182J")).append(sprmee2.cfr_renamed_312()).toString());
                    }
                }
                arrayList2.add(Collections.unmodifiableList(arrayList3));
                enumeration2 = enumeration;
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return Collections.unmodifiableCollection(arrayList);
        }
        catch (Exception exception) {
            throw new CertificateParsingException(exception.getMessage());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getExtensionValue(String arg0) {
        sprszd sprszd2 = this.cfr_renamed_91.cfr_renamed_2151().cfr_renamed_98();
        if (sprszd2 != null) {
            sprtie sprtie2 = sprszd2.cfr_renamed_100(new sprtzd(arg0));
            if (sprtie2 != null) {
                try {
                    return sprtie2.cfr_renamed_103().cfr_renamed_91();
                }
                catch (Exception exception) {
                    throw new IllegalStateException(new StringBuilder().insert(0, sprgmg.cfr_renamed_9(">V)K)\u0004+E)W2J<\u0004")).append(exception.toString()).toString());
                }
            }
        }
        return null;
    }

    private /* synthetic */ byte[] cfr_renamed_2145(String arg0) {
        sprszd sprszd2 = this.cfr_renamed_91.cfr_renamed_2151().cfr_renamed_98();
        if (sprszd2 != null) {
            sprtie sprtie2 = sprszd2.cfr_renamed_100(new sprtzd(arg0));
            if (sprtie2 != null) {
                return sprtie2.cfr_renamed_103().cfr_renamed_186();
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PublicKey getPublicKey() {
        try {
            return sprbrb.cfr_renamed_1255(this.cfr_renamed_91.cfr_renamed_1489());
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public void cfr_renamed_2152(sprtzd arg0, spra arg1) {
        this.cfr_renamed_2.cfr_renamed_2152(arg0, arg1);
    }

    @Override
    public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        this.checkValidity(new Date());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getSigAlgParams() {
        if (this.cfr_renamed_91.cfr_renamed_89().cfr_renamed_284() == null) {
            return null;
        }
        try {
            return this.cfr_renamed_91.cfr_renamed_89().cfr_renamed_284().cfr_renamed_119().cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean hasUnsupportedCriticalExtension() {
        sprszd sprszd2;
        if (this.getVersion() != 3 || (sprszd2 = this.cfr_renamed_91.cfr_renamed_2151().cfr_renamed_98()) == null) return false;
        Enumeration enumeration = sprszd2.cfr_renamed_99();
        block0: while (true) {
            Enumeration enumeration2 = enumeration;
            while (enumeration2.hasMoreElements()) {
                sprtzd sprtzd2 = (sprtzd)enumeration.nextElement();
                String string = sprtzd2.cfr_renamed_19();
                if (string.equals(sprwmb.cfr_renamed_79) || string.equals(sprwmb.cfr_renamed_119) || string.equals(sprwmb.cfr_renamed_1) || string.equals(sprwmb.cfr_renamed_93) || string.equals(sprwmb.cfr_renamed_112) || string.equals(sprwmb.cfr_renamed_102) || string.equals(sprwmb.cfr_renamed_0) || string.equals(sprwmb.cfr_renamed_96) || string.equals(sprwmb.cfr_renamed_3) || string.equals(sprwmb.cfr_renamed_107)) continue block0;
                if (string.equals(sprwmb.cfr_renamed_105)) {
                    enumeration2 = enumeration;
                    continue;
                }
                if (sprszd2.cfr_renamed_100(sprtzd2).cfr_renamed_101()) return true;
                continue block0;
            }
            break;
        }
        return false;
    }

    @Override
    public boolean[] getIssuerUniqueID() {
        sprmra sprmra2 = this.cfr_renamed_91.cfr_renamed_2151().cfr_renamed_2153();
        if (sprmra2 != null) {
            int n;
            byte[] byArray = sprmra2.cfr_renamed_81();
            boolean[] blArray = new boolean[byArray.length * 8 - sprmra2.cfr_renamed_106()];
            int n2 = n = 0;
            while (n2 != blArray.length) {
                int n3 = n;
                blArray[n3] = (byArray[n / 8] & 128 >>> n3 % 8) != 0;
                n2 = ++n;
            }
            return blArray;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List getExtendedKeyUsage() throws CertificateParsingException {
        byte[] byArray = this.cfr_renamed_2145("2.5.29.37");
        if (byArray == null) {
            return null;
        }
        try {
            int n;
            sprgle sprgle2 = new sprgle(byArray);
            sprbne sprbne2 = (sprbne)sprgle2.cfr_renamed_24();
            ArrayList<String> arrayList = new ArrayList<String>();
            int n2 = n = 0;
            while (true) {
                if (n2 == sprbne2.cfr_renamed_84()) {
                    return Collections.unmodifiableList(arrayList);
                }
                spra spra2 = sprbne2.cfr_renamed_85(n);
                arrayList.add(((sprtzd)spra2).cfr_renamed_19());
                n2 = ++n;
            }
        }
        catch (Exception exception) {
            throw new CertificateParsingException(sprzeo.cfr_renamed_9("\u000fz\u0018g\u0018(\u001az\u0005k\u000f{\u0019a\u0004oJm\u0012|\u000ff\u000em\u000e(\u0001m\u0013(\u001f{\u000bo\u000f(\u000fp\u001em\u0004{\u0003g\u0004"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public X500Principal getIssuerX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new sprope(byteArrayOutputStream).cfr_renamed_2149(this.cfr_renamed_91.cfr_renamed_102());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprgmg.cfr_renamed_9("8E5\u0003/\u0004>J8K?A{M(W.A)\u0004\u001fj"));
        }
    }

    @Override
    public String getSigAlgName() {
        int n;
        Object object;
        Provider provider = Security.getProvider("BC");
        if (provider != null) {
            object = provider.getProperty(sprzeo.cfr_renamed_9("I\u0006oDI\u0006a\u000b{D[\u0003o\u0004i\u001e}\u0018mD") + this.getSigAlgOID());
            if (object != null) {
                return object;
            }
        }
        object = Security.getProviders();
        int n2 = n = 0;
        while (n2 != ((Provider[])object).length) {
            String string = object[n].getProperty(new StringBuilder().insert(0, sprgmg.cfr_renamed_9("\u001aH<\n\u001aH2E(\n\bM<J:P.V>\n")).append(this.getSigAlgOID()).toString());
            if (string != null) {
                return string;
            }
            n2 = ++n;
        }
        return this.getSigAlgOID();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Principal getIssuerDN() {
        try {
            return new sprfjb(spruhe.cfr_renamed_23(this.cfr_renamed_91.cfr_renamed_102().cfr_renamed_91()));
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public Collection getIssuerAlternativeNames() throws CertificateParsingException {
        return sprbnb.cfr_renamed_368(this.cfr_renamed_2145(sprtie.cfr_renamed_82.cfr_renamed_19()));
    }

    @Override
    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof Certificate)) {
            return false;
        }
        Certificate certificate = (Certificate)arg0;
        try {
            byte[] byArray = this.getEncoded();
            byte[] byArray2 = certificate.getEncoded();
            return sprzra.cfr_renamed_92(byArray, byArray2);
        }
        catch (CertificateEncodingException certificateEncodingException) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprbnb(sprcge sprcge2) throws CertificateParsingException {
        byte[] byArray;
        sprbnb sprbnb2 = this;
        this.cfr_renamed_2 = new sprooc();
        this.cfr_renamed_91 = sprcge2;
        try {
            byArray = this.cfr_renamed_2145("2.5.29.19");
            if (byArray != null) {
                this.cfr_renamed_0 = sprwge.cfr_renamed_23(sprvva.cfr_renamed_184(byArray));
            }
        }
        catch (Exception exception) {
            throw new CertificateParsingException(new StringBuilder().insert(0, sprzeo.cfr_renamed_9("\ti\u0004f\u0005|Jk\u0005f\u0019|\u0018}\t|JJ\u000b{\u0003k)g\u0004{\u001ez\u000ba\u0004|\u00192J")).append(exception).toString());
        }
        try {
            int n;
            byArray = this.cfr_renamed_2145("2.5.29.15");
            if (byArray == null) {
                this.cfr_renamed_1 = null;
                return;
            }
            sprmra sprmra2 = sprmra.cfr_renamed_23(sprvva.cfr_renamed_184(byArray));
            int n2 = (byArray = sprmra2.cfr_renamed_81()).length * 8 - sprmra2.cfr_renamed_106();
            this.cfr_renamed_1 = new boolean[n2 < 9 ? 9 : n2];
            int n3 = n = 0;
            while (n3 != n2) {
                int n4 = n;
                this.cfr_renamed_1[n4] = (byArray[n / 8] & 128 >>> n4 % 8) != 0;
                n3 = ++n;
            }
            return;
        }
        catch (Exception exception) {
            throw new CertificateParsingException(new StringBuilder().insert(0, sprgmg.cfr_renamed_9("G:J5K/\u00048K5W/V.G/\u0004\u0010A\"q(E<Aa\u0004")).append(exception).toString());
        }
    }

    @Override
    public int getBasicConstraints() {
        if (this.cfr_renamed_0 != null) {
            if (this.cfr_renamed_0.cfr_renamed_296()) {
                if (this.cfr_renamed_0.cfr_renamed_299() == null) {
                    return Integer.MAX_VALUE;
                }
                return this.cfr_renamed_0.cfr_renamed_299().intValue();
            }
            return -1;
        }
        return -1;
    }

    @Override
    public synchronized int hashCode() {
        if (!this.cfr_renamed_4) {
            this.cfr_renamed_3 = this.cfr_renamed_2154();
            this.cfr_renamed_4 = true;
        }
        return this.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void verify(PublicKey arg0) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        sprbnb sprbnb2;
        Signature signature;
        String string = sprnpb.cfr_renamed_1538(this.cfr_renamed_91.cfr_renamed_89());
        try {
            signature = Signature.getInstance(string, "BC");
            sprbnb2 = this;
        }
        catch (Exception exception) {
            signature = Signature.getInstance(string);
            sprbnb2 = this;
        }
        sprbnb2.cfr_renamed_2155(arg0, signature);
    }

    @Override
    public boolean[] getSubjectUniqueID() {
        sprmra sprmra2 = this.cfr_renamed_91.cfr_renamed_2151().cfr_renamed_2156();
        if (sprmra2 != null) {
            int n;
            byte[] byArray = sprmra2.cfr_renamed_81();
            boolean[] blArray = new boolean[byArray.length * 8 - sprmra2.cfr_renamed_106()];
            int n2 = n = 0;
            while (n2 != blArray.length) {
                int n3 = n;
                blArray[n3] = (byArray[n / 8] & 128 >>> n3 % 8) != 0;
                n2 = ++n;
            }
            return blArray;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2155(PublicKey publicKey, Signature signature) throws CertificateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        void arg0;
        void arg1;
        sprbnb sprbnb2 = this;
        if (!sprbnb2.cfr_renamed_2157(this.cfr_renamed_91.cfr_renamed_89(), sprbnb2.cfr_renamed_91.cfr_renamed_2151().cfr_renamed_79())) {
            throw new CertificateException(sprzeo.cfr_renamed_9("{\u0003o\u0004i\u001e}\u0018mJi\u0006o\u0005z\u0003|\u0002eJa\u0004(>J9(\tm\u0018|Jf\u0005|J{\u000be\u000f(\u000b{Jg\u001f|\u000fzJk\u000fz\u001e"));
        }
        spra spra2 = this.cfr_renamed_91.cfr_renamed_89().cfr_renamed_284();
        void v1 = arg1;
        void v2 = arg1;
        sprnpb.cfr_renamed_2120((Signature)v2, spra2);
        v2.initVerify((PublicKey)arg0);
        v1.update(this.getTBSCertificate());
        if (!v1.verify(this.getSignature())) {
            throw new SignatureException(sprgmg.cfr_renamed_9("G>V/M=M8E/A{@4A(\u00045K/\u0004-A)M=]{S2P3\u0004(Q+T7M>@{O>]"));
        }
    }

    @Override
    public byte[] getSignature() {
        return this.cfr_renamed_91.cfr_renamed_79().cfr_renamed_81();
    }

    @Override
    public spra cfr_renamed_1510(sprtzd arg0) {
        return this.cfr_renamed_2.cfr_renamed_1510(arg0);
    }

    @Override
    public Date getNotBefore() {
        return this.cfr_renamed_91.cfr_renamed_2148().cfr_renamed_110();
    }

    public Set getNonCriticalExtensionOIDs() {
        if (this.getVersion() == 3) {
            HashSet<String> hashSet = new HashSet<String>();
            sprszd sprszd2 = this.cfr_renamed_91.cfr_renamed_2151().cfr_renamed_98();
            if (sprszd2 != null) {
                Enumeration enumeration = sprszd2.cfr_renamed_99();
                while (enumeration.hasMoreElements()) {
                    sprtzd sprtzd2 = (sprtzd)enumeration.nextElement();
                    if (sprszd2.cfr_renamed_100(sprtzd2).cfr_renamed_101()) continue;
                    hashSet.add(sprtzd2.cfr_renamed_19());
                }
                return hashSet;
            }
        }
        return null;
    }

    private /* synthetic */ boolean cfr_renamed_2157(sprije arg0, sprije arg1) {
        if (!arg0.cfr_renamed_593().equals(arg1.cfr_renamed_593())) {
            return false;
        }
        if (arg0.cfr_renamed_284() == null) {
            return arg1.cfr_renamed_284() == null || arg1.cfr_renamed_284().equals(sprume.cfr_renamed_3);
        }
        if (arg1.cfr_renamed_284() == null) {
            return arg0.cfr_renamed_284() == null || arg0.cfr_renamed_284().equals(sprume.cfr_renamed_3);
        }
        return arg0.cfr_renamed_284().equals(arg1.cfr_renamed_284());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() throws CertificateEncodingException {
        try {
            return this.cfr_renamed_91.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new CertificateEncodingException(iOException.toString());
        }
    }

    @Override
    public int getVersion() {
        return this.cfr_renamed_91.cfr_renamed_569();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprzeo.cfr_renamed_9("d\u0003f\u000f&\u0019m\u001ai\u0018i\u001eg\u0018"));
        stringBuffer.append(sprgmg.cfr_renamed_9("\u0004{\u007fky{\u0004{\u0004{\u0004{\u0004{r>V(M4Ja\u0004")).append(this.getVersion()).append(string);
        stringBuffer.append(sprzeo.cfr_renamed_9("J(J(J(J(J[\u000fz\u0003i\u0006F\u001fe\bm\u00182J")).append(this.getSerialNumber()).append(string);
        stringBuffer.append(sprgmg.cfr_renamed_9("\u0004{\u0004{\u0004{\u0004{\u0004{\u0004{\u0004\u0012W(Q>V\u001fja\u0004")).append(this.getIssuerDN()).append(string);
        stringBuffer.append(sprzeo.cfr_renamed_9("J(J(J(J(J(J[\u001ei\u0018|JL\u000b|\u000f2J")).append(this.getNotBefore()).append(string);
        stringBuffer.append(sprgmg.cfr_renamed_9("\u0004{\u0004{\u0004{\u0004{\u0004{\u0004\u001dM5E7\u0004\u001fE/Aa\u0004")).append(this.getNotAfter()).append(string);
        stringBuffer.append(sprzeo.cfr_renamed_9("J(J(J(J(J(J(9}\bb\u000fk\u001eL$2J")).append(this.getSubjectDN()).append(string);
        stringBuffer.append(sprgmg.cfr_renamed_9("\u0004{\u0004{\u0004{\u0004{\u0004{\u0004\u000bQ9H2G{o>]a\u0004")).append(this.getPublicKey()).append(string);
        stringBuffer.append(sprzeo.cfr_renamed_9("J(9a\rf\u000b|\u001fz\u000f(+d\rg\u0018a\u001e`\u00072J")).append(this.getSigAlgName()).append(string);
        byte[] byArray = this.getSignature();
        stringBuffer.append(sprgmg.cfr_renamed_9("\u0004{\u0004{\u0004{\u0004{\u0004{\u0004{w2C5E/Q)Aa\u0004")).append(new String(sprmma.cfr_renamed_502(byArray, 0, 20))).append(string);
        int n = 20;
        int n2 = n;
        while (n2 < byArray.length) {
            if (n < byArray.length - 20) {
                stringBuffer.append(sprzeo.cfr_renamed_9("J(J(J(J(J(J(J(J(J(J(J(J")).append(new String(sprmma.cfr_renamed_502(byArray, n, 20))).append(string);
            } else {
                stringBuffer.append(sprgmg.cfr_renamed_9("\u0004{\u0004{\u0004{\u0004{\u0004{\u0004{\u0004{\u0004{\u0004{\u0004{\u0004{\u0004")).append(new String(sprmma.cfr_renamed_502(byArray, n, byArray.length - n))).append(string);
            }
            n2 = n += 20;
        }
        sprszd sprszd2 = this.cfr_renamed_91.cfr_renamed_2151().cfr_renamed_98();
        if (sprszd2 != null) {
            Enumeration enumeration = sprszd2.cfr_renamed_99();
            if (enumeration.hasMoreElements()) {
                stringBuffer.append(sprzeo.cfr_renamed_9("(J(J(J(/p\u001em\u0004{\u0003g\u0004{P(`"));
            }
            while (enumeration.hasMoreElements()) {
                sprtzd sprtzd2 = (sprtzd)enumeration.nextElement();
                sprtie sprtie2 = sprszd2.cfr_renamed_100(sprtzd2);
                if (sprtie2.cfr_renamed_103() != null) {
                    byte[] byArray2 = sprtie2.cfr_renamed_103().cfr_renamed_186();
                    sprgle sprgle2 = new sprgle(byArray2);
                    stringBuffer.append(sprgmg.cfr_renamed_9("{\u0004{\u0004{\u0004{\u0004{\u0004{\u0004{\u0004{\u0004{\u0004{\u0004{\u0004{G)M/M8E7\f")).append(sprtie2.cfr_renamed_101()).append(sprzeo.cfr_renamed_9("!J"));
                    try {
                        if (sprtzd2.equals(sprtie.cfr_renamed_272)) {
                            stringBuffer.append(sprwge.cfr_renamed_23(sprgle2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        if (sprtzd2.equals(sprtie.cfr_renamed_953)) {
                            stringBuffer.append(sprzfe.cfr_renamed_23(sprgle2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        if (sprtzd2.equals(sprrf.cfr_renamed_107)) {
                            stringBuffer.append(new sprpge((sprmra)sprgle2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        if (sprtzd2.equals(sprrf.cfr_renamed_1)) {
                            stringBuffer.append(new sprhge((sprcae)sprgle2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        StringBuffer stringBuffer2 = stringBuffer;
                        if (sprtzd2.equals(sprrf.cfr_renamed_93)) {
                            stringBuffer2.append(new sprdbe((sprcae)sprgle2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        stringBuffer2.append(sprtzd2.cfr_renamed_19());
                        stringBuffer.append(sprgmg.cfr_renamed_9("\u0004-E7Q>\u0004f\u0004")).append(sprcje.cfr_renamed_2138(sprgle2.cfr_renamed_24())).append(string);
                    }
                    catch (Exception exception) {
                        stringBuffer.append(sprtzd2.cfr_renamed_19());
                        stringBuffer.append(sprzeo.cfr_renamed_9("J~\u000bd\u001fmJ5J")).append(sprgmg.cfr_renamed_9("\u000eq\u000eq\u000e")).append(string);
                    }
                    continue;
                }
                stringBuffer.append(string);
            }
        }
        return stringBuffer.toString();
    }

    @Override
    public BigInteger getSerialNumber() {
        return this.cfr_renamed_91.cfr_renamed_114().cfr_renamed_97();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ int cfr_renamed_2154() {
        try {
            int n;
            int n2 = 0;
            byte[] byArray = this.getEncoded();
            int n3 = n = 1;
            while (true) {
                if (n3 >= byArray.length) {
                    return n2;
                }
                n2 += byArray[n] * n++;
                n3 = n;
            }
        }
        catch (CertificateEncodingException certificateEncodingException) {
            return 0;
        }
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_2.cfr_renamed_2158();
    }

    @Override
    public Date getNotAfter() {
        return this.cfr_renamed_91.cfr_renamed_2146().cfr_renamed_110();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.cfr_renamed_91.cfr_renamed_2151().cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new CertificateEncodingException(iOException.toString());
        }
    }

    public Set getCriticalExtensionOIDs() {
        if (this.getVersion() == 3) {
            HashSet<String> hashSet = new HashSet<String>();
            sprszd sprszd2 = this.cfr_renamed_91.cfr_renamed_2151().cfr_renamed_98();
            if (sprszd2 != null) {
                Enumeration enumeration = sprszd2.cfr_renamed_99();
                while (enumeration.hasMoreElements()) {
                    sprtzd sprtzd2 = (sprtzd)enumeration.nextElement();
                    if (!sprszd2.cfr_renamed_100(sprtzd2).cfr_renamed_101()) continue;
                    hashSet.add(sprtzd2.cfr_renamed_19());
                }
                return hashSet;
            }
        }
        return null;
    }

    @Override
    public boolean[] getKeyUsage() {
        return this.cfr_renamed_1;
    }

    @Override
    public final void verify(PublicKey arg0, String arg1) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        sprbnb sprbnb2 = this;
        Signature signature = Signature.getInstance(sprnpb.cfr_renamed_1538(sprbnb2.cfr_renamed_91.cfr_renamed_89()), arg1);
        sprbnb2.cfr_renamed_2155(arg0, signature);
    }

    @Override
    public Principal getSubjectDN() {
        return new sprfjb(spruhe.cfr_renamed_23(this.cfr_renamed_91.cfr_renamed_1485().cfr_renamed_119()));
    }
}

