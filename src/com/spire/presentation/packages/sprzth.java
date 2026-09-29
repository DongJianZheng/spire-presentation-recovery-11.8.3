/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbcm;
import com.spire.presentation.packages.sprbdd;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdzh;
import com.spire.presentation.packages.spregm;
import com.spire.presentation.packages.sprfam;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprkdm;
import com.spire.presentation.packages.sprkkm;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkph;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprmuh;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnqm;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sprow;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtlj;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprunm;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxxy;
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

public class sprzth
extends X509Certificate
implements sprof {
    private sprof cfr_renamed_91;
    private boolean[] cfr_renamed_0;
    private sprndm cfr_renamed_1;
    private int cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprbcm cfr_renamed_4;

    @Override
    public byte[] getSignature() {
        return this.cfr_renamed_1.cfr_renamed_79().cfr_renamed_186();
    }

    public Collection getSubjectAlternativeNames() throws CertificateParsingException {
        return sprzth.cfr_renamed_368(this.cfr_renamed_2145(sprrdm.cfr_renamed_137.cfr_renamed_19()));
    }

    public Collection getIssuerAlternativeNames() throws CertificateParsingException {
        return sprzth.cfr_renamed_368(this.cfr_renamed_2145(sprrdm.cfr_renamed_3.cfr_renamed_19()));
    }

    @Override
    public int getBasicConstraints() {
        if (this.cfr_renamed_4 == null || !this.cfr_renamed_4.cfr_renamed_296()) {
            return -1;
        }
        sprktm sprktm2 = this.cfr_renamed_4.cfr_renamed_5086();
        if (sprktm2 == null) {
            return Integer.MAX_VALUE;
        }
        return sprktm2.cfr_renamed_5087();
    }

    @Override
    public BigInteger getSerialNumber() {
        return this.cfr_renamed_1.cfr_renamed_114().cfr_renamed_97();
    }

    private /* synthetic */ boolean cfr_renamed_9062(sprddm arg0, sprddm arg1) {
        if (!arg0.cfr_renamed_593().cfr_renamed_5078(arg1.cfr_renamed_593())) {
            return false;
        }
        if (arg0.cfr_renamed_284() == null) {
            return arg1.cfr_renamed_284() == null || arg1.cfr_renamed_284().equals(sprpen.cfr_renamed_4);
        }
        if (arg1.cfr_renamed_284() == null) {
            return arg0.cfr_renamed_284() == null || arg0.cfr_renamed_284().equals(sprpen.cfr_renamed_4);
        }
        return arg0.cfr_renamed_284().equals(arg1.cfr_renamed_284());
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
            Enumeration enumeration2 = enumeration = sprszm.cfr_renamed_23(arg0).cfr_renamed_329();
            block11: while (enumeration2.hasMoreElements()) {
                ArrayList arrayList2;
                sprigm sprigm2 = sprigm.cfr_renamed_23(enumeration.nextElement());
                ArrayList<Object> arrayList3 = new ArrayList<Object>();
                sprigm sprigm3 = sprigm2;
                arrayList3.add(spruaf.cfr_renamed_279(sprigm3.cfr_renamed_312()));
                switch (sprigm3.cfr_renamed_312()) {
                    case 0: 
                    case 3: 
                    case 5: {
                        arrayList3.add(sprigm2.cfr_renamed_91());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 4: {
                        arrayList3.add(sprnbm.cfr_renamed_9063(sprkdm.cfr_renamed_952, sprigm2.cfr_renamed_313()).toString());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 6: {
                        arrayList3.add(((sprml)((Object)sprigm2.cfr_renamed_313())).cfr_renamed_314());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 8: {
                        arrayList3.add(sprlem.cfr_renamed_23(sprigm2.cfr_renamed_313()).cfr_renamed_19());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 7: {
                        String string;
                        byte[] byArray = sprfvg.cfr_renamed_23(sprigm2.cfr_renamed_313()).cfr_renamed_186();
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
                        throw new IOException(new StringBuilder().insert(0, sprbdd.cfr_renamed_9("\u0006\u0005 D0\u0005#D*\u0011)\u0006!\u0016~D")).append(sprigm2.cfr_renamed_312()).toString());
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
            return this.cfr_renamed_1.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new CertificateEncodingException(iOException.toString());
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
            return new X500Principal(this.cfr_renamed_1.cfr_renamed_1485().cfr_renamed_91());
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprxxy.cfr_renamed_9("\u007f7rqhvy8\u007f9x3<?o%i3nvX\u0018"));
        }
    }

    @Override
    public boolean[] getSubjectUniqueID() {
        sprgbf sprgbf2 = this.cfr_renamed_1.cfr_renamed_2151().cfr_renamed_2156();
        if (sprgbf2 != null) {
            int n;
            byte[] byArray = sprgbf2.cfr_renamed_81();
            boolean[] blArray = new boolean[byArray.length * 8 - sprgbf2.cfr_renamed_106()];
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
    public synchronized int hashCode() {
        if (!this.cfr_renamed_3) {
            this.cfr_renamed_2 = this.cfr_renamed_2154();
            this.cfr_renamed_3 = true;
        }
        return this.cfr_renamed_2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getSigAlgParams() {
        if (this.cfr_renamed_1.cfr_renamed_89().cfr_renamed_284() == null) {
            return null;
        }
        try {
            return this.cfr_renamed_1.cfr_renamed_89().cfr_renamed_284().cfr_renamed_119().cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public final void verify(PublicKey arg0, String arg1) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        sprzth sprzth2;
        Signature signature;
        String string = sprkph.cfr_renamed_9057(this.cfr_renamed_1.cfr_renamed_89());
        if (arg1 != null) {
            signature = Signature.getInstance(string, arg1);
            sprzth2 = this;
        } else {
            signature = Signature.getInstance(string);
            sprzth2 = this;
        }
        sprzth2.cfr_renamed_2155(arg0, signature);
    }

    @Override
    public Principal getSubjectDN() {
        return new sprdzh(this.cfr_renamed_1.cfr_renamed_1485());
    }

    @Override
    public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        this.checkValidity(new Date());
    }

    @Override
    public boolean[] getKeyUsage() {
        return this.cfr_renamed_0;
    }

    @Override
    public String getSigAlgOID() {
        return this.cfr_renamed_1.cfr_renamed_89().cfr_renamed_593().cfr_renamed_19();
    }

    @Override
    public void checkValidity(Date arg0) throws CertificateExpiredException, CertificateNotYetValidException {
        if (arg0.getTime() > this.getNotAfter().getTime()) {
            throw new CertificateExpiredException(new StringBuilder().insert(0, sprbdd.cfr_renamed_9("\u0007!\u00160\r\"\r'\u00050\u0001d\u0001<\u0014-\u0016!\u0000d\u000b*D")).append(this.cfr_renamed_1.cfr_renamed_2146().cfr_renamed_2147()).toString());
        }
        if (arg0.getTime() < this.getNotBefore().getTime()) {
            throw new CertificateNotYetValidException(new StringBuilder().insert(0, sprxxy.cfr_renamed_9("5y$h?z?\u007f7h3<8s\"< }:u2<\"u:pv")).append(this.cfr_renamed_1.cfr_renamed_2148().cfr_renamed_2147()).toString());
        }
    }

    @Override
    public sprco cfr_renamed_9064(sprlem arg0) {
        return this.cfr_renamed_91.cfr_renamed_9064(arg0);
    }

    @Override
    public final void verify(PublicKey arg0, Provider arg1) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        sprzth sprzth2;
        Signature signature;
        String string = sprkph.cfr_renamed_9057(this.cfr_renamed_1.cfr_renamed_89());
        if (arg1 != null) {
            signature = Signature.getInstance(string, arg1);
            sprzth2 = this;
        } else {
            signature = Signature.getInstance(string);
            sprzth2 = this;
        }
        sprzth2.cfr_renamed_2155(arg0, signature);
    }

    private /* synthetic */ byte[] cfr_renamed_2145(String arg0) {
        sprhgm sprhgm2 = this.cfr_renamed_1.cfr_renamed_2151().cfr_renamed_98();
        if (sprhgm2 != null) {
            sprrdm sprrdm2 = sprhgm2.cfr_renamed_5024(new sprlem(arg0));
            if (sprrdm2 != null) {
                return sprrdm2.cfr_renamed_103().cfr_renamed_186();
            }
        }
        return null;
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_91.cfr_renamed_2158();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PublicKey getPublicKey() {
        try {
            return sprsci.cfr_renamed_5726(this.cfr_renamed_1.cfr_renamed_1489());
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public Principal getIssuerDN() {
        return new sprdzh(this.cfr_renamed_1.cfr_renamed_102());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void verify(PublicKey arg0) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        sprzth sprzth2;
        Signature signature;
        String string = sprkph.cfr_renamed_9057(this.cfr_renamed_1.cfr_renamed_89());
        try {
            signature = Signature.getInstance(string, "BC");
            sprzth2 = this;
        }
        catch (Exception exception) {
            signature = Signature.getInstance(string);
            sprzth2 = this;
        }
        sprzth2.cfr_renamed_2155(arg0, signature);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        stringBuffer.append(sprbdd.cfr_renamed_9("Dd?t9dDdDdDdDd2!\u00167\r+\n~D")).append(this.getVersion()).append(string);
        stringBuffer.append(sprxxy.cfr_renamed_9("v<v<v<v<vO3n?}:R#q4y$&v")).append(this.getSerialNumber()).append(string);
        stringBuffer.append(sprbdd.cfr_renamed_9("DdDdDdDdDdDdD\r\u00177\u0011!\u0016\u0000*~D")).append(this.getIssuerDN()).append(string);
        stringBuffer.append(sprxxy.cfr_renamed_9("v<v<v<v<v<vO\"}$hvX7h3&v")).append(this.getNotBefore()).append(string);
        stringBuffer.append(sprbdd.cfr_renamed_9("DdDdDdDdDdD\u0002\r*\u0005(D\u0000\u00050\u0001~D")).append(this.getNotAfter()).append(string);
        stringBuffer.append(sprxxy.cfr_renamed_9("v<v<v<v<v<v<\u0005i4v3\u007f\"X\u0018&v")).append(this.getSubjectDN()).append(string);
        stringBuffer.append(sprbdd.cfr_renamed_9("DdDdDdDdDdD\u0014\u0011&\b-\u0007d/!\u001d~D")).append(this.getPublicKey()).append(string);
        stringBuffer.append(sprxxy.cfr_renamed_9("v<\u0005u1r7h#n3<\u0017p1s$u\"t;&v")).append(this.getSigAlgName()).append(string);
        byte[] byArray = this.getSignature();
        stringBuffer.append(sprbdd.cfr_renamed_9("DdDdDdDdDdDd7-\u0003*\u00050\u00116\u0001~D")).append(new String(sprfqe.cfr_renamed_502(byArray, 0, 20))).append(string);
        int n = 20;
        int n2 = n;
        while (n2 < byArray.length) {
            if (n < byArray.length - 20) {
                stringBuffer.append(sprxxy.cfr_renamed_9("v<v<v<v<v<v<v<v<v<v<v<v")).append(new String(sprfqe.cfr_renamed_502(byArray, n, 20))).append(string);
            } else {
                stringBuffer.append(sprbdd.cfr_renamed_9("DdDdDdDdDdDdDdDdDdDdDdD")).append(new String(sprfqe.cfr_renamed_502(byArray, n, byArray.length - n))).append(string);
            }
            n2 = n += 20;
        }
        sprhgm sprhgm2 = this.cfr_renamed_1.cfr_renamed_2151().cfr_renamed_98();
        if (sprhgm2 != null) {
            Enumeration enumeration = sprhgm2.cfr_renamed_99();
            if (enumeration.hasMoreElements()) {
                stringBuffer.append(sprxxy.cfr_renamed_9("<v<v<v<\u0013d\"y8o?s8ol<\\"));
            }
            while (enumeration.hasMoreElements()) {
                sprlem sprlem2 = (sprlem)enumeration.nextElement();
                sprrdm sprrdm2 = sprhgm2.cfr_renamed_5024(sprlem2);
                if (sprrdm2.cfr_renamed_103() != null) {
                    byte[] byArray2 = sprrdm2.cfr_renamed_103().cfr_renamed_186();
                    sprrzm sprrzm2 = new sprrzm(byArray2);
                    stringBuffer.append(sprbdd.cfr_renamed_9("dDdDdDdDdDdDdDdDdDdDdDd\u00076\r0\r'\u0005(L")).append(sprrdm2.cfr_renamed_101()).append(sprxxy.cfr_renamed_9("5v"));
                    try {
                        if (sprlem2.cfr_renamed_5078(sprrdm.cfr_renamed_133)) {
                            stringBuffer.append(sprbcm.cfr_renamed_23(sprrzm2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        if (sprlem2.cfr_renamed_5078(sprrdm.cfr_renamed_272)) {
                            stringBuffer.append(sprfam.cfr_renamed_23(sprrzm2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        if (sprlem2.cfr_renamed_5078(sprow.cfr_renamed_114)) {
                            stringBuffer.append(new sprunm((sprgbf)sprrzm2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        if (sprlem2.cfr_renamed_5078(sprow.cfr_renamed_951)) {
                            stringBuffer.append(new sprnqm((sprupm)sprrzm2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        StringBuffer stringBuffer2 = stringBuffer;
                        if (sprlem2.cfr_renamed_5078(sprow.cfr_renamed_31)) {
                            stringBuffer2.append(new sprkkm((sprupm)sprrzm2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        stringBuffer2.append(sprlem2.cfr_renamed_19());
                        stringBuffer.append(sprbdd.cfr_renamed_9("D2\u0005(\u0011!DyD")).append(spregm.cfr_renamed_2138(sprrzm2.cfr_renamed_24())).append(string);
                    }
                    catch (Exception exception) {
                        stringBuffer.append(sprlem2.cfr_renamed_19());
                        stringBuffer.append(sprxxy.cfr_renamed_9("vj7p#yv!v")).append(sprbdd.cfr_renamed_9("NnNnN")).append(string);
                    }
                    continue;
                }
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
    public sprzth(sprndm sprndm2) throws CertificateParsingException {
        byte[] byArray;
        sprzth sprzth2 = this;
        this.cfr_renamed_91 = new sprtlj();
        this.cfr_renamed_1 = sprndm2;
        try {
            byArray = this.cfr_renamed_2145("2.5.29.19");
            if (byArray != null) {
                this.cfr_renamed_4 = sprbcm.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray));
            }
        }
        catch (Exception exception) {
            throw new CertificateParsingException(new StringBuilder().insert(0, sprxxy.cfr_renamed_9("5}8r9hv\u007f9r%h$i5hv^7o?\u007f\u0015s8o\"n7u8h%&v")).append(exception).toString());
        }
        try {
            int n;
            byArray = this.cfr_renamed_2145("2.5.29.15");
            if (byArray == null) {
                this.cfr_renamed_0 = null;
                return;
            }
            sprgbf sprgbf2 = sprgbf.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray));
            int n2 = (byArray = sprgbf2.cfr_renamed_81()).length * 8 - sprgbf2.cfr_renamed_106();
            this.cfr_renamed_0 = new boolean[n2 < 9 ? 9 : n2];
            int n3 = n = 0;
            while (n3 != n2) {
                int n4 = n;
                this.cfr_renamed_0[n4] = (byArray[n / 8] & 128 >>> n4 % 8) != 0;
                n3 = ++n;
            }
            return;
        }
        catch (Exception exception) {
            throw new CertificateParsingException(new StringBuilder().insert(0, sprbdd.cfr_renamed_9("\u0007%\n*\u000b0D'\u000b*\u00170\u00161\u00070D\u000f\u0001=17\u0005#\u0001~D")).append(exception).toString());
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
            return new X500Principal(this.cfr_renamed_1.cfr_renamed_102().cfr_renamed_91());
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprxxy.cfr_renamed_9("\u007f7rqhvy8\u007f9x3<?o%i3nvX\u0018"));
        }
    }

    @Override
    public Date getNotBefore() {
        return this.cfr_renamed_1.cfr_renamed_2148().cfr_renamed_110();
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
            return sproze.cfr_renamed_92(byArray, byArray2);
        }
        catch (CertificateEncodingException certificateEncodingException) {
            return false;
        }
    }

    @Override
    public int getVersion() {
        return this.cfr_renamed_1.cfr_renamed_569();
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
            sprrzm sprrzm2 = new sprrzm(byArray);
            sprszm sprszm2 = (sprszm)sprrzm2.cfr_renamed_24();
            ArrayList<String> arrayList = new ArrayList<String>();
            int n2 = n = 0;
            while (true) {
                if (n2 == sprszm2.cfr_renamed_84()) {
                    return Collections.unmodifiableList(arrayList);
                }
                sprco sprco2 = sprszm2.cfr_renamed_85(n);
                arrayList.add(((sprlem)sprco2).cfr_renamed_19());
                n2 = ++n;
            }
        }
        catch (Exception exception) {
            throw new CertificateParsingException(sprbdd.cfr_renamed_9("\u00016\u0016+\u0016d\u00146\u000b'\u00017\u0017-\n#D!\u001c0\u0001*\u0000!\u0000d\u000f!\u001dd\u00117\u0005#\u0001d\u0001<\u0010!\n7\r+\n"));
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
            return this.cfr_renamed_1.cfr_renamed_2151().cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new CertificateEncodingException(iOException.toString());
        }
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

    public Set getCriticalExtensionOIDs() {
        if (this.getVersion() == 3) {
            HashSet<String> hashSet = new HashSet<String>();
            sprhgm sprhgm2 = this.cfr_renamed_1.cfr_renamed_2151().cfr_renamed_98();
            if (sprhgm2 != null) {
                Enumeration enumeration = sprhgm2.cfr_renamed_99();
                while (enumeration.hasMoreElements()) {
                    sprlem sprlem2 = (sprlem)enumeration.nextElement();
                    if (!sprhgm2.cfr_renamed_5024(sprlem2).cfr_renamed_101()) continue;
                    hashSet.add(sprlem2.cfr_renamed_19());
                }
                return hashSet;
            }
        }
        return null;
    }

    @Override
    public void cfr_renamed_9065(sprlem arg0, sprco arg1) {
        this.cfr_renamed_91.cfr_renamed_9065(arg0, arg1);
    }

    @Override
    public String getSigAlgName() {
        int n;
        Object object;
        Provider provider = Security.getProvider("BC");
        if (provider != null) {
            object = provider.getProperty(sprxxy.cfr_renamed_9("]:{x]:u7oxO?{8}\"i$yx") + this.getSigAlgOID());
            if (object != null) {
                return object;
            }
        }
        object = Security.getProviders();
        int n2 = n = 0;
        while (n2 != ((Provider[])object).length) {
            String string = object[n].getProperty(new StringBuilder().insert(0, sprbdd.cfr_renamed_9("\u0005\b#J\u0005\b-\u00057J\u0017\r#\n%\u00101\u0016!J")).append(this.getSigAlgOID()).toString());
            if (string != null) {
                return string;
            }
            n2 = ++n;
        }
        return this.getSigAlgOID();
    }

    @Override
    public boolean[] getIssuerUniqueID() {
        sprgbf sprgbf2 = this.cfr_renamed_1.cfr_renamed_2151().cfr_renamed_2153();
        if (sprgbf2 != null) {
            int n;
            byte[] byArray = sprgbf2.cfr_renamed_81();
            boolean[] blArray = new boolean[byArray.length * 8 - sprgbf2.cfr_renamed_106()];
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
        sprzth sprzth2 = this;
        if (!sprzth2.cfr_renamed_9062(this.cfr_renamed_1.cfr_renamed_89(), sprzth2.cfr_renamed_1.cfr_renamed_2151().cfr_renamed_79())) {
            throw new CertificateException(sprxxy.cfr_renamed_9("o?{8}\"i$yv}:{9n?h>qvu8<\u0002^\u0005<5y$hvr9hvo7q3<7ovs#h3nv\u007f3n\""));
        }
        sprco sprco2 = this.cfr_renamed_1.cfr_renamed_89().cfr_renamed_284();
        void v1 = arg1;
        void v2 = arg1;
        sprkph.cfr_renamed_9056((Signature)v2, sprco2);
        v2.initVerify((PublicKey)arg0);
        v1.update(this.getTBSCertificate());
        if (!v1.verify(this.getSignature())) {
            throw new SignatureException(sprbdd.cfr_renamed_9("\u0007!\u00160\r\"\r'\u00050\u0001d\u0000+\u00017D*\u000b0D2\u00016\r\"\u001dd\u0013-\u0010,D7\u00114\u0014(\r!\u0000d\u000f!\u001d"));
        }
    }

    public Set getNonCriticalExtensionOIDs() {
        if (this.getVersion() == 3) {
            HashSet<String> hashSet = new HashSet<String>();
            sprhgm sprhgm2 = this.cfr_renamed_1.cfr_renamed_2151().cfr_renamed_98();
            if (sprhgm2 != null) {
                Enumeration enumeration = sprhgm2.cfr_renamed_99();
                while (enumeration.hasMoreElements()) {
                    sprlem sprlem2 = (sprlem)enumeration.nextElement();
                    if (sprhgm2.cfr_renamed_5024(sprlem2).cfr_renamed_101()) continue;
                    hashSet.add(sprlem2.cfr_renamed_19());
                }
                return hashSet;
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean hasUnsupportedCriticalExtension() {
        sprhgm sprhgm2;
        if (this.getVersion() != 3 || (sprhgm2 = this.cfr_renamed_1.cfr_renamed_2151().cfr_renamed_98()) == null) return false;
        Enumeration enumeration = sprhgm2.cfr_renamed_99();
        block0: while (true) {
            Enumeration enumeration2 = enumeration;
            while (enumeration2.hasMoreElements()) {
                sprlem sprlem2 = (sprlem)enumeration.nextElement();
                String string = sprlem2.cfr_renamed_19();
                if (string.equals(sprmuh.cfr_renamed_91) || string.equals(sprmuh.cfr_renamed_2) || string.equals(sprmuh.cfr_renamed_114) || string.equals(sprmuh.cfr_renamed_132) || string.equals(sprmuh.cfr_renamed_137) || string.equals(sprmuh.cfr_renamed_152) || string.equals(sprmuh.cfr_renamed_112) || string.equals(sprmuh.cfr_renamed_4) || string.equals(sprmuh.cfr_renamed_79) || string.equals(sprmuh.cfr_renamed_107)) continue block0;
                if (string.equals(sprmuh.cfr_renamed_105)) {
                    enumeration2 = enumeration;
                    continue;
                }
                if (sprhgm2.cfr_renamed_5024(sprlem2).cfr_renamed_101()) return true;
                continue block0;
            }
            break;
        }
        return false;
    }

    @Override
    public Date getNotAfter() {
        return this.cfr_renamed_1.cfr_renamed_2146().cfr_renamed_110();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getExtensionValue(String arg0) {
        sprhgm sprhgm2 = this.cfr_renamed_1.cfr_renamed_2151().cfr_renamed_98();
        if (sprhgm2 != null) {
            sprrdm sprrdm2 = sprhgm2.cfr_renamed_5024(new sprlem(arg0));
            if (sprrdm2 != null) {
                try {
                    return sprrdm2.cfr_renamed_103().cfr_renamed_91();
                }
                catch (Exception exception) {
                    throw new IllegalStateException(new StringBuilder().insert(0, sprxxy.cfr_renamed_9("y$n9nvl7n%u8{v")).append(exception.toString()).toString());
                }
            }
        }
        return null;
    }
}

