/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.charts.entity.ChartTextArea;
import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprcje;
import com.spire.presentation.packages.sprdbe;
import com.spire.presentation.packages.sprfjb;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprhge;
import com.spire.presentation.packages.sprhnc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sprmra;
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
import com.spire.presentation.packages.sprvzy;
import com.spire.presentation.packages.sprwb;
import com.spire.presentation.packages.sprwge;
import com.spire.presentation.packages.sprwmb;
import com.spire.presentation.packages.sprx;
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

public class sprrkc
extends X509Certificate
implements sprwb {
    private sprwge cfr_renamed_91;
    private sprcge cfr_renamed_0;
    private sprwb cfr_renamed_1;
    private boolean cfr_renamed_2;
    private int cfr_renamed_3;
    private boolean[] cfr_renamed_4;

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
    @Override
    public Principal getIssuerDN() {
        try {
            return new sprfjb(spruhe.cfr_renamed_23(this.cfr_renamed_0.cfr_renamed_102().cfr_renamed_91()));
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public Set getCriticalExtensionOIDs() {
        if (this.getVersion() == 3) {
            HashSet<String> hashSet = new HashSet<String>();
            sprszd sprszd2 = this.cfr_renamed_0.cfr_renamed_2151().cfr_renamed_98();
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
    public byte[] getSignature() {
        return this.cfr_renamed_0.cfr_renamed_79().cfr_renamed_81();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(ChartTextArea.cfr_renamed_9("n\u0012l\u001e,\bg\u000bc\tc\u000fm\t"));
        stringBuffer.append(sprvzy.cfr_renamed_9("\u000e#u3s#\u000e#\u000e#\u000e#\u000e#xf\\pGl@9\u000e")).append(this.getVersion()).append(string);
        stringBuffer.append(ChartTextArea.cfr_renamed_9("[\"[\"[\"[\"[Q\u001ep\u0012c\u0017L\u000eo\u0019g\t8[")).append(this.getSerialNumber()).append(string);
        stringBuffer.append(sprvzy.cfr_renamed_9("\u000e#\u000e#\u000e#\u000e#\u000e#\u000e#\u000eJ]p[f\\G`9\u000e")).append(this.getIssuerDN()).append(string);
        stringBuffer.append(ChartTextArea.cfr_renamed_9("[\"[\"[\"[\"[\"[Q\u000fc\tv[F\u001av\u001e8[")).append(this.getNotBefore()).append(string);
        stringBuffer.append(sprvzy.cfr_renamed_9("\u000e#\u000e#\u000e#\u000e#\u000e#\u000eEGmOo\u000eGOwK9\u000e")).append(this.getNotAfter()).append(string);
        stringBuffer.append(ChartTextArea.cfr_renamed_9("[\"[\"[\"[\"[\"[\"(w\u0019h\u001ea\u000fF58[")).append(this.getSubjectDN()).append(string);
        stringBuffer.append(sprvzy.cfr_renamed_9("\u000e#\u000e#\u000e#\u000e#\u000e#\u000eS[aBjM#efW9\u000e")).append(this.getPublicKey()).append(string);
        stringBuffer.append(ChartTextArea.cfr_renamed_9("[\"(k\u001cl\u001av\u000ep\u001e\":n\u001cm\tk\u000fj\u00168[")).append(this.getSigAlgName()).append(string);
        byte[] byArray = this.getSignature();
        stringBuffer.append(sprvzy.cfr_renamed_9("\u000e#\u000e#\u000e#\u000e#\u000e#\u000e#}jImOw[qK9\u000e")).append(new String(sprmma.cfr_renamed_502(byArray, 0, 20))).append(string);
        int n = 20;
        int n2 = n;
        while (n2 < byArray.length) {
            if (n < byArray.length - 20) {
                stringBuffer.append(ChartTextArea.cfr_renamed_9("[\"[\"[\"[\"[\"[\"[\"[\"[\"[\"[\"[")).append(new String(sprmma.cfr_renamed_502(byArray, n, 20))).append(string);
            } else {
                stringBuffer.append(sprvzy.cfr_renamed_9("\u000e#\u000e#\u000e#\u000e#\u000e#\u000e#\u000e#\u000e#\u000e#\u000e#\u000e#\u000e")).append(new String(sprmma.cfr_renamed_502(byArray, n, byArray.length - n))).append(string);
            }
            n2 = n += 20;
        }
        sprszd sprszd2 = this.cfr_renamed_0.cfr_renamed_2151().cfr_renamed_98();
        if (sprszd2 != null) {
            Enumeration enumeration = sprszd2.cfr_renamed_99();
            if (enumeration.hasMoreElements()) {
                stringBuffer.append(ChartTextArea.cfr_renamed_9("\"[\"[\"[\">z\u000fg\u0015q\u0012m\u0015qA\"q"));
            }
            while (enumeration.hasMoreElements()) {
                sprtzd sprtzd2 = (sprtzd)enumeration.nextElement();
                sprtie sprtie2 = sprszd2.cfr_renamed_100(sprtzd2);
                if (sprtie2.cfr_renamed_103() != null) {
                    byte[] byArray2 = sprtie2.cfr_renamed_103().cfr_renamed_186();
                    sprgle sprgle2 = new sprgle(byArray2);
                    stringBuffer.append(sprvzy.cfr_renamed_9("#\u000e#\u000e#\u000e#\u000e#\u000e#\u000e#\u000e#\u000e#\u000e#\u000e#\u000e#MqGwG`Oo\u0006")).append(sprtie2.cfr_renamed_101()).append(ChartTextArea.cfr_renamed_9("+["));
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
                        stringBuffer.append(sprvzy.cfr_renamed_9("\u000euOo[f\u000e>\u000e")).append(sprcje.cfr_renamed_2138(sprgle2.cfr_renamed_24())).append(string);
                    }
                    catch (Exception exception) {
                        stringBuffer.append(sprtzd2.cfr_renamed_19());
                        stringBuffer.append(ChartTextArea.cfr_renamed_9("[t\u001an\u000eg[?[")).append(sprvzy.cfr_renamed_9("\u0004)\u0004)\u0004")).append(string);
                    }
                    continue;
                }
                stringBuffer.append(string);
            }
        }
        return stringBuffer.toString();
    }

    private /* synthetic */ byte[] cfr_renamed_2145(String arg0) {
        sprszd sprszd2 = this.cfr_renamed_0.cfr_renamed_2151().cfr_renamed_98();
        if (sprszd2 != null) {
            sprtie sprtie2 = sprszd2.cfr_renamed_100(new sprtzd(arg0));
            if (sprtie2 != null) {
                return sprtie2.cfr_renamed_103().cfr_renamed_186();
            }
        }
        return null;
    }

    public Collection getSubjectAlternativeNames() throws CertificateParsingException {
        return sprrkc.cfr_renamed_368(this.cfr_renamed_2145(sprtie.cfr_renamed_107.cfr_renamed_19()));
    }

    @Override
    public Date getNotBefore() {
        return this.cfr_renamed_0.cfr_renamed_2148().cfr_renamed_110();
    }

    @Override
    public void checkValidity(Date arg0) throws CertificateExpiredException, CertificateNotYetValidException {
        if (arg0.getTime() > this.getNotAfter().getTime()) {
            throw new CertificateExpiredException(new StringBuilder().insert(0, ChartTextArea.cfr_renamed_9("\u0018g\tv\u0012d\u0012a\u001av\u001e\"\u001ez\u000bk\tg\u001f\"\u0014l[")).append(this.cfr_renamed_0.cfr_renamed_2146().cfr_renamed_2147()).toString());
        }
        if (arg0.getTime() < this.getNotBefore().getTime()) {
            throw new CertificateNotYetValidException(new StringBuilder().insert(0, sprvzy.cfr_renamed_9("Mf\\wGeG`OwK#@lZ#XbBjJ#ZjBo\u000e")).append(this.cfr_renamed_0.cfr_renamed_2148().cfr_renamed_2147()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.cfr_renamed_0.cfr_renamed_2151().cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new CertificateEncodingException(iOException.toString());
        }
    }

    @Override
    public boolean[] getKeyUsage() {
        return this.cfr_renamed_4;
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
    public final void verify(PublicKey arg0) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        sprrkc sprrkc2;
        Signature signature;
        String string = sprhnc.cfr_renamed_1538(this.cfr_renamed_0.cfr_renamed_89());
        try {
            signature = Signature.getInstance(string, "BC");
            sprrkc2 = this;
        }
        catch (Exception exception) {
            signature = Signature.getInstance(string);
            sprrkc2 = this;
        }
        sprrkc2.cfr_renamed_2155(arg0, signature);
    }

    @Override
    public spra cfr_renamed_1510(sprtzd arg0) {
        return this.cfr_renamed_1.cfr_renamed_1510(arg0);
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_1.cfr_renamed_2158();
    }

    @Override
    public int getVersion() {
        return this.cfr_renamed_0.cfr_renamed_569();
    }

    public Set getNonCriticalExtensionOIDs() {
        if (this.getVersion() == 3) {
            HashSet<String> hashSet = new HashSet<String>();
            sprszd sprszd2 = this.cfr_renamed_0.cfr_renamed_2151().cfr_renamed_98();
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

    @Override
    public synchronized int hashCode() {
        if (!this.cfr_renamed_2) {
            this.cfr_renamed_3 = this.cfr_renamed_2154();
            this.cfr_renamed_2 = true;
        }
        return this.cfr_renamed_3;
    }

    @Override
    public final void verify(PublicKey arg0, String arg1) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        sprrkc sprrkc2 = this;
        Signature signature = Signature.getInstance(sprhnc.cfr_renamed_1538(sprrkc2.cfr_renamed_0.cfr_renamed_89()), arg1);
        sprrkc2.cfr_renamed_2155(arg0, signature);
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
            new sprope(byteArrayOutputStream).cfr_renamed_2149(this.cfr_renamed_0.cfr_renamed_1485());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        }
        catch (IOException iOException) {
            throw new IllegalStateException(ChartTextArea.cfr_renamed_9("a\u001al\\v[g\u0015a\u0014f\u001e\"\u0012q\bw\u001ep[F5"));
        }
    }

    @Override
    public boolean[] getIssuerUniqueID() {
        sprmra sprmra2 = this.cfr_renamed_0.cfr_renamed_2151().cfr_renamed_2153();
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

    public Collection getIssuerAlternativeNames() throws CertificateParsingException {
        return sprrkc.cfr_renamed_368(this.cfr_renamed_2145(sprtie.cfr_renamed_82.cfr_renamed_19()));
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
                        throw new IOException(new StringBuilder().insert(0, sprvzy.cfr_renamed_9("AOg\u000ewOd\u000em[nLf\\9\u000e")).append(sprmee2.cfr_renamed_312()).toString());
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
    public byte[] getEncoded() throws CertificateEncodingException {
        try {
            return this.cfr_renamed_0.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new CertificateEncodingException(iOException.toString());
        }
    }

    @Override
    public Principal getSubjectDN() {
        return new sprfjb(spruhe.cfr_renamed_23(this.cfr_renamed_0.cfr_renamed_1485().cfr_renamed_119()));
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
    public int getBasicConstraints() {
        if (this.cfr_renamed_91 != null) {
            if (this.cfr_renamed_91.cfr_renamed_296()) {
                if (this.cfr_renamed_91.cfr_renamed_299() == null) {
                    return Integer.MAX_VALUE;
                }
                return this.cfr_renamed_91.cfr_renamed_299().intValue();
            }
            return -1;
        }
        return -1;
    }

    @Override
    public String getSigAlgName() {
        int n;
        Object object;
        Provider provider = Security.getProvider("BC");
        if (provider != null) {
            object = provider.getProperty(ChartTextArea.cfr_renamed_9("C\u0017eUC\u0017k\u001aqUQ\u0012e\u0015c\u000fw\tgU") + this.getSigAlgOID());
            if (object != null) {
                return object;
            }
        }
        object = Security.getProviders();
        int n2 = n = 0;
        while (n2 != ((Provider[])object).length) {
            String string = object[n].getProperty(new StringBuilder().insert(0, sprvzy.cfr_renamed_9("BBd\u0000BBjOp\u0000PGd@bZv\\f\u0000")).append(this.getSigAlgOID()).toString());
            if (string != null) {
                return string;
            }
            n2 = ++n;
        }
        return this.getSigAlgOID();
    }

    @Override
    public BigInteger getSerialNumber() {
        return this.cfr_renamed_0.cfr_renamed_114().cfr_renamed_97();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PublicKey getPublicKey() {
        try {
            return sprbrb.cfr_renamed_1255(this.cfr_renamed_0.cfr_renamed_1489());
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getExtensionValue(String arg0) {
        sprszd sprszd2 = this.cfr_renamed_0.cfr_renamed_2151().cfr_renamed_98();
        if (sprszd2 != null) {
            sprtie sprtie2 = sprszd2.cfr_renamed_100(new sprtzd(arg0));
            if (sprtie2 != null) {
                try {
                    return sprtie2.cfr_renamed_103().cfr_renamed_91();
                }
                catch (Exception exception) {
                    throw new IllegalStateException(new StringBuilder().insert(0, ChartTextArea.cfr_renamed_9("g\tp\u0014p[r\u001ap\bk\u0015e[")).append(exception.toString()).toString());
                }
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2155(PublicKey publicKey, Signature signature) throws CertificateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        void arg0;
        void arg1;
        sprrkc sprrkc2 = this;
        if (!sprrkc2.cfr_renamed_2157(this.cfr_renamed_0.cfr_renamed_89(), sprrkc2.cfr_renamed_0.cfr_renamed_2151().cfr_renamed_79())) {
            throw new CertificateException(sprvzy.cfr_renamed_9("pGd@bZv\\f\u000ebBdAqGwFn\u000ej@#zA}#Mf\\w\u000emAw\u000epOnK#Op\u000el[wKq\u000e`KqZ"));
        }
        spra spra2 = this.cfr_renamed_0.cfr_renamed_89().cfr_renamed_284();
        void v1 = arg1;
        void v2 = arg1;
        sprhnc.cfr_renamed_2120((Signature)v2, spra2);
        v2.initVerify((PublicKey)arg0);
        v1.update(this.getTBSCertificate());
        if (!v1.verify(this.getSignature())) {
            throw new SignatureException(ChartTextArea.cfr_renamed_9("\u0018g\tv\u0012d\u0012a\u001av\u001e\"\u001fm\u001eq[l\u0014v[t\u001ep\u0012d\u0002\"\fk\u000fj[q\u000er\u000bn\u0012g\u001f\"\u0010g\u0002"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getSigAlgParams() {
        if (this.cfr_renamed_0.cfr_renamed_89().cfr_renamed_284() == null) {
            return null;
        }
        try {
            return this.cfr_renamed_0.cfr_renamed_89().cfr_renamed_284().cfr_renamed_119().cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public boolean[] getSubjectUniqueID() {
        sprmra sprmra2 = this.cfr_renamed_0.cfr_renamed_2151().cfr_renamed_2156();
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

    @Override
    public void cfr_renamed_2152(sprtzd arg0, spra arg1) {
        this.cfr_renamed_1.cfr_renamed_2152(arg0, arg1);
    }

    @Override
    public Date getNotAfter() {
        return this.cfr_renamed_0.cfr_renamed_2146().cfr_renamed_110();
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
            throw new CertificateParsingException(sprvzy.cfr_renamed_9("Kq\\l\\#^qA`Kp]j@d\u000efVwKmJfJ#EfW#[pOdK#K{Zf@pGl@"));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean hasUnsupportedCriticalExtension() {
        sprszd sprszd2;
        if (this.getVersion() != 3 || (sprszd2 = this.cfr_renamed_0.cfr_renamed_2151().cfr_renamed_98()) == null) return false;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public X500Principal getIssuerX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new sprope(byteArrayOutputStream).cfr_renamed_2149(this.cfr_renamed_0.cfr_renamed_102());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        }
        catch (IOException iOException) {
            throw new IllegalStateException(ChartTextArea.cfr_renamed_9("a\u001al\\v[g\u0015a\u0014f\u001e\"\u0012q\bw\u001ep[F5"));
        }
    }

    @Override
    public String getSigAlgOID() {
        return this.cfr_renamed_0.cfr_renamed_89().cfr_renamed_593().cfr_renamed_19();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprrkc(sprcge sprcge2) throws CertificateParsingException {
        byte[] byArray;
        sprrkc sprrkc2 = this;
        this.cfr_renamed_1 = new sprooc();
        this.cfr_renamed_0 = sprcge2;
        try {
            byArray = this.cfr_renamed_2145("2.5.29.19");
            if (byArray != null) {
                this.cfr_renamed_91 = sprwge.cfr_renamed_23(sprvva.cfr_renamed_184(byArray));
            }
        }
        catch (Exception exception) {
            throw new CertificateParsingException(new StringBuilder().insert(0, sprvzy.cfr_renamed_9("Mb@mAw\u000e`Am]w\\vMw\u000eAOpG`ml@pZqOj@w]9\u000e")).append(exception).toString());
        }
        try {
            int n;
            byArray = this.cfr_renamed_2145("2.5.29.15");
            if (byArray == null) {
                this.cfr_renamed_4 = null;
                return;
            }
            sprmra sprmra2 = sprmra.cfr_renamed_23(sprvva.cfr_renamed_184(byArray));
            int n2 = (byArray = sprmra2.cfr_renamed_81()).length * 8 - sprmra2.cfr_renamed_106();
            this.cfr_renamed_4 = new boolean[n2 < 9 ? 9 : n2];
            int n3 = n = 0;
            while (n3 != n2) {
                int n4 = n;
                this.cfr_renamed_4[n4] = (byArray[n / 8] & 128 >>> n4 % 8) != 0;
                n3 = ++n;
            }
            return;
        }
        catch (Exception exception) {
            throw new CertificateParsingException(new StringBuilder().insert(0, ChartTextArea.cfr_renamed_9("\u0018c\u0015l\u0014v[a\u0014l\bv\tw\u0018v[I\u001e{.q\u001ae\u001e8[")).append(exception).toString());
        }
    }
}

