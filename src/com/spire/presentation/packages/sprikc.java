/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprdcka;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprkbb;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sproce;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprozd;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprpva;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwkh;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;

public class sprikc
extends CertPath {
    private List cfr_renamed_3;
    public static final List cfr_renamed_4;

    public Iterator getEncodings() {
        return cfr_renamed_4.iterator();
    }

    static {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(sprwkh.cfr_renamed_9("~3G\bO,F"));
        arrayList.add(sprdcka.cfr_renamed_9("\u0019c\u0004"));
        arrayList.add("PKCS7");
        cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }

    public sprikc(InputStream arg0, String arg1) throws CertificateException {
        block8: {
            super(sprwkh.cfr_renamed_9("vv\u001bh\u0017"));
            try {
                if (arg1.equalsIgnoreCase(sprdcka.cfr_renamed_9("\u0019M v(R!"))) {
                    sprgle sprgle2 = new sprgle(arg0);
                    sprvva sprvva2 = sprgle2.cfr_renamed_24();
                    if (!(sprvva2 instanceof sprbne)) {
                        throw new CertificateException(sprwkh.cfr_renamed_9("G6^-Zx],\\=O5\u000e<A=]x@7ZxM7@,O1@xOxo\u000b`i\u000e\u000bk\t{\u001d`\u001bkxY0G4Kx\\=O<G6Ix~3G\bO,FxK6M7J=JxJ9Z9\u000e,AxB7O<\u000e\u001bK*Z\bO,F"));
                    }
                    Enumeration enumeration = ((sprbne)sprvva2).cfr_renamed_329();
                    sprikc sprikc2 = this;
                    sprikc2.cfr_renamed_3 = new ArrayList();
                    CertificateFactory certificateFactory = CertificateFactory.getInstance(sprdcka.cfr_renamed_9("\u0011\b|\u0016p"), "BC");
                    Enumeration enumeration2 = enumeration;
                    while (enumeration2.hasMoreElements()) {
                        byte[] byArray = ((spra)enumeration.nextElement()).cfr_renamed_119().cfr_renamed_104("DER");
                        enumeration2 = enumeration;
                        this.cfr_renamed_3.add(0, certificateFactory.generateCertificate(new ByteArrayInputStream(byArray)));
                    }
                    break block8;
                }
                if (arg1.equalsIgnoreCase("PKCS7") || arg1.equalsIgnoreCase(sprwkh.cfr_renamed_9("~\u001dc"))) {
                    Certificate certificate;
                    CertificateFactory certificateFactory;
                    arg0 = new BufferedInputStream(arg0);
                    this.cfr_renamed_3 = new ArrayList();
                    CertificateFactory certificateFactory2 = certificateFactory = CertificateFactory.getInstance(sprdcka.cfr_renamed_9("\u0011\b|\u0016p"), "BC");
                    while ((certificate = certificateFactory2.generateCertificate(arg0)) != null) {
                        certificateFactory2 = certificateFactory;
                        this.cfr_renamed_3.add(certificate);
                    }
                    break block8;
                }
                throw new CertificateException(new StringBuilder().insert(0, sprwkh.cfr_renamed_9("-@+[(^7\\,K<\u000e=@;A<G6Ib\u000e")).append(arg1).toString());
            }
            catch (IOException iOException) {
                throw new CertificateException(new StringBuilder().insert(0, sprdcka.cfr_renamed_9("\u0000i\f^*C9R I'\u0006=N;I>\u0006>N J,\u0006-C*I-O'Aie,T=v(R!\u001cC")).append(iOException.toString()).toString());
            }
            catch (NoSuchProviderException noSuchProviderException) {
                throw new CertificateException(new StringBuilder().insert(0, sprwkh.cfr_renamed_9("\u001aA-@;W\u001bO+Z4Kx^*A.G<K*\u000e6A,\u000e>A-@<\u000e/F1B=\u000e,\\!G6IxZ7\u000e?K,\u000e9\u000e\u001bK*Z1H1M9Z=h9M,A*Wb$")).append(noSuchProviderException.toString()).toString());
            }
        }
        sprikc sprikc3 = this;
        sprikc3.cfr_renamed_3 = sprikc3.cfr_renamed_2464(sprikc3.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprikc(List list) {
        void arg0;
        sprikc sprikc2 = this;
        super(sprdcka.cfr_renamed_9("\u0011\b|\u0016p"));
        sprikc sprikc3 = this;
        sprikc3.cfr_renamed_3 = sprikc2.cfr_renamed_2464(new ArrayList(arg0));
    }

    public List getCertificates() {
        return Collections.unmodifiableList(new ArrayList(this.cfr_renamed_3));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprvva cfr_renamed_2465(X509Certificate arg0) throws CertificateEncodingException {
        try {
            return new sprgle(arg0.getEncoded()).cfr_renamed_24();
        }
        catch (Exception exception) {
            throw new CertificateEncodingException(new StringBuilder().insert(0, sprwkh.cfr_renamed_9("\u001dV;K(Z1A6\u000e/F1B=\u000e=@;A<G6IxM=\\,G>G;O,Kb\u000e")).append(exception.toString()).toString());
        }
    }

    @Override
    public byte[] getEncoded() throws CertificateEncodingException {
        Object e;
        Iterator iterator = this.getEncodings();
        if (iterator.hasNext() && (e = iterator.next()) instanceof String) {
            return this.getEncoded((String)e);
        }
        return null;
    }

    private /* synthetic */ List cfr_renamed_2464(List arg0) {
        int n;
        boolean bl;
        Serializable serializable;
        X500Principal x500Principal;
        block13: {
            int n2;
            if (arg0.size() < 2) {
                return arg0;
            }
            x500Principal = ((X509Certificate)arg0.get(0)).getIssuerX500Principal();
            boolean bl2 = true;
            int n3 = n2 = 1;
            while (n3 != arg0.size()) {
                serializable = (X509Certificate)arg0.get(n2);
                if (!x500Principal.equals(serializable.getSubjectX500Principal())) {
                    bl = bl2 = false;
                    break block13;
                }
                x500Principal = ((X509Certificate)arg0.get(n2)).getIssuerX500Principal();
                n3 = ++n2;
            }
            bl = bl2;
        }
        if (bl) {
            return arg0;
        }
        ArrayList<X509Certificate> arrayList = new ArrayList<X509Certificate>(arg0.size());
        serializable = new ArrayList(arg0);
        int n4 = n = 0;
        while (n4 < arg0.size()) {
            boolean bl3;
            X509Certificate x509Certificate;
            block14: {
                int n5;
                x509Certificate = (X509Certificate)arg0.get(n);
                boolean bl4 = false;
                X500Principal x500Principal2 = x509Certificate.getSubjectX500Principal();
                int n6 = n5 = 0;
                while (n6 != arg0.size()) {
                    if (((X509Certificate)arg0.get(n5)).getIssuerX500Principal().equals(x500Principal2)) {
                        bl3 = bl4 = true;
                        break block14;
                    }
                    n6 = ++n5;
                }
                bl3 = bl4;
            }
            if (!bl3) {
                arrayList.add(x509Certificate);
                arg0.remove(n);
            }
            n4 = ++n;
        }
        if (arrayList.size() > 1) {
            return serializable;
        }
        int n7 = n = 0;
        while (n7 != arrayList.size()) {
            int n8;
            x500Principal = ((X509Certificate)arrayList.get(n)).getIssuerX500Principal();
            int n9 = n8 = 0;
            while (n9 < arg0.size()) {
                X509Certificate x509Certificate = (X509Certificate)arg0.get(n8);
                if (x500Principal.equals(x509Certificate.getSubjectX500Principal())) {
                    arrayList.add(x509Certificate);
                    arg0.remove(n8);
                    break;
                }
                n9 = ++n8;
            }
            n7 = ++n;
        }
        if (arg0.size() > 0) {
            return serializable;
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_2466(spra arg0) throws CertificateEncodingException {
        try {
            return arg0.cfr_renamed_119().cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new CertificateEncodingException(new StringBuilder().insert(0, sprdcka.cfr_renamed_9("c1E,V=O&HiR!T&Q'\u001ci")).append(iOException).toString());
        }
    }

    @Override
    public byte[] getEncoded(String arg0) throws CertificateEncodingException {
        if (arg0.equalsIgnoreCase(sprwkh.cfr_renamed_9("~3G\bO,F"))) {
            ListIterator listIterator;
            sprlre sprlre2 = new sprlre();
            sprikc sprikc2 = this;
            ListIterator listIterator2 = listIterator = sprikc2.cfr_renamed_3.listIterator(sprikc2.cfr_renamed_3.size());
            while (listIterator2.hasPrevious()) {
                sprlre2.cfr_renamed_49(this.cfr_renamed_2465((X509Certificate)listIterator.previous()));
                listIterator2 = listIterator;
            }
            return this.cfr_renamed_2466(new sprpse(sprlre2));
        }
        if (arg0.equalsIgnoreCase("PKCS7")) {
            int n;
            sproce sproce2 = new sproce(sprm.cfr_renamed_1223, null);
            sprlre sprlre3 = new sprlre();
            int n2 = n = 0;
            while (n2 != this.cfr_renamed_3.size()) {
                sprikc sprikc3 = this;
                Object e = sprikc3.cfr_renamed_3.get(n);
                sprlre3.cfr_renamed_49(sprikc3.cfr_renamed_2465((X509Certificate)e));
                n2 = ++n;
            }
            sprozd sprozd2 = new sprozd(new sprooe(1L), new sprcwe(), sproce2, new sprcwe(sprlre3), null, new sprcwe());
            return this.cfr_renamed_2466(new sproce(sprm.cfr_renamed_1397, sprozd2));
        }
        if (arg0.equalsIgnoreCase(sprdcka.cfr_renamed_9("\u0019c\u0004"))) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            sprkbb sprkbb2 = new sprkbb(new OutputStreamWriter(byteArrayOutputStream));
            try {
                int n;
                int n3 = n = 0;
                while (n3 != this.cfr_renamed_3.size()) {
                    X509Certificate x509Certificate = (X509Certificate)this.cfr_renamed_3.get(n);
                    sprkbb2.cfr_renamed_481(new sprpva("CERTIFICATE", x509Certificate.getEncoded()));
                    n3 = ++n;
                }
                sprkbb2.close();
            }
            catch (Exception exception) {
                throw new CertificateEncodingException(sprwkh.cfr_renamed_9("M9@\u007fZxK6M7J=\u000e;K*Z1H1M9Z=\u000e>A*\u000e\bk\u0015\u000e=@;A<K<\u000e(O,F"));
            }
            return byteArrayOutputStream.toByteArray();
        }
        throw new CertificateEncodingException(new StringBuilder().insert(0, sprdcka.cfr_renamed_9("S'U<V9I;R,BiC'E&B H.\u001ci")).append(arg0).toString());
    }
}

