/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcle;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlfg;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprpcba;
import com.spire.presentation.packages.sprqyl;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtbq;
import com.spire.presentation.packages.spruom;
import com.spire.presentation.packages.sprxgf;
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

public class sprbnj
extends CertPath {
    private final sprrr cfr_renamed_2;
    public static final List cfr_renamed_3;
    private List cfr_renamed_4;

    static {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(sprpcba.cfr_renamed_9("Z)c\u0012k6b"));
        arrayList.add(sprtbq.cfr_renamed_9("O\u0002R"));
        arrayList.add("PKCS7");
        cfr_renamed_3 = Collections.unmodifiableList(arrayList);
    }

    public List getCertificates() {
        return Collections.unmodifiableList(new ArrayList(this.cfr_renamed_4));
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

    public sprbnj(List arg0) {
        super(sprpcba.cfr_renamed_9("Rl?r3"));
        this.cfr_renamed_2 = new sprdki();
        this.cfr_renamed_4 = this.cfr_renamed_2464(new ArrayList(arg0));
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

    public Iterator getEncodings() {
        return cfr_renamed_3.iterator();
    }

    @Override
    public byte[] getEncoded(String arg0) throws CertificateEncodingException {
        if (arg0.equalsIgnoreCase(sprtbq.cfr_renamed_9("O,v\u0017~3w"))) {
            ListIterator listIterator;
            sprrvm sprrvm2 = new sprrvm();
            sprbnj sprbnj2 = this;
            ListIterator listIterator2 = listIterator = sprbnj2.cfr_renamed_4.listIterator(sprbnj2.cfr_renamed_4.size());
            while (listIterator2.hasPrevious()) {
                sprrvm2.cfr_renamed_5004(this.cfr_renamed_2465((X509Certificate)listIterator.previous()));
                listIterator2 = listIterator;
            }
            return this.cfr_renamed_9358(new sprcen(sprrvm2));
        }
        if (arg0.equalsIgnoreCase("PKCS7")) {
            int n;
            spruom spruom2 = new spruom(sprdl.cfr_renamed_287, null);
            sprrvm sprrvm3 = new sprrvm();
            int n2 = n = 0;
            while (n2 != this.cfr_renamed_4.size()) {
                sprbnj sprbnj3 = this;
                Object e = sprbnj3.cfr_renamed_4.get(n);
                sprrvm3.cfr_renamed_5004(sprbnj3.cfr_renamed_2465((X509Certificate)e));
                n2 = ++n;
            }
            sprqyl sprqyl2 = new sprqyl(new sprktm(1L), new sprocn(), spruom2, new sprocn(sprrvm3), null, new sprocn());
            return this.cfr_renamed_9358(new spruom(sprdl.cfr_renamed_128, sprqyl2));
        }
        if (arg0.equalsIgnoreCase(sprpcba.cfr_renamed_9("Z\u0007G"))) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            sprlfg sprlfg2 = new sprlfg(new OutputStreamWriter(byteArrayOutputStream));
            try {
                int n;
                int n3 = n = 0;
                while (n3 != this.cfr_renamed_4.size()) {
                    X509Certificate x509Certificate = (X509Certificate)this.cfr_renamed_4.get(n);
                    sprlfg2.cfr_renamed_5198(new sprcle("CERTIFICATE", x509Certificate.getEncoded()));
                    n3 = ++n;
                }
                sprlfg2.close();
            }
            catch (Exception exception) {
                throw new CertificateEncodingException(sprtbq.cfr_renamed_9("|&q`kgz)|({\"?$z5k.y.|&k\"?!p5?\u0017Z\n?\"q$p#z#?7~3w"));
            }
            return byteArrayOutputStream.toByteArray();
        }
        throw new CertificateEncodingException(new StringBuilder().insert(0, sprpcba.cfr_renamed_9("7d1\u007f2z-x6o&*'d!e&c,mx*")).append(arg0).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprbnj(InputStream inputStream, String string) throws CertificateException {
        block8: {
            super(sprtbq.cfr_renamed_9("Gi*w&"));
            sprbnj sprbnj2 = this;
            sprbnj2.cfr_renamed_2 = new sprdki();
            try {
                BufferedInputStream arg0;
                void arg1;
                if (arg1.equalsIgnoreCase(sprpcba.cfr_renamed_9("Z)c\u0012k6b"))) {
                    sprrzm sprrzm2 = new sprrzm(arg0);
                    sprxgf sprxgf2 = sprrzm2.cfr_renamed_24();
                    if (!(sprxgf2 instanceof sprszm)) {
                        throw new CertificateException(sprtbq.cfr_renamed_9("v)o2kgl3m\"~*?#p\"lgq(kg|(q3~.qg~g^\u0014Qv?\u0014Z\u0016J\u0002Q\u0004Zgh/v+zgm\"~#v)xgO,v\u0017~3wgz)|({\"{g{&k&?3pgs(~#?\u0004z5k\u0017~3w"));
                    }
                    Enumeration enumeration = ((sprszm)sprxgf2).cfr_renamed_329();
                    this.cfr_renamed_4 = new ArrayList();
                    CertificateFactory certificateFactory = this.cfr_renamed_2.cfr_renamed_1550(sprpcba.cfr_renamed_9("Rl?r3"));
                    Enumeration enumeration2 = enumeration;
                    while (enumeration2.hasMoreElements()) {
                        byte[] byArray = ((sprco)enumeration.nextElement()).cfr_renamed_119().cfr_renamed_104("DER");
                        enumeration2 = enumeration;
                        this.cfr_renamed_4.add(0, certificateFactory.generateCertificate(new ByteArrayInputStream(byArray)));
                    }
                    break block8;
                }
                if (arg1.equalsIgnoreCase("PKCS7") || arg1.equalsIgnoreCase(sprtbq.cfr_renamed_9("O\u0002R"))) {
                    Certificate certificate;
                    CertificateFactory certificateFactory;
                    arg0 = new BufferedInputStream(arg0);
                    this.cfr_renamed_4 = new ArrayList();
                    CertificateFactory certificateFactory2 = certificateFactory = this.cfr_renamed_2.cfr_renamed_1550(sprpcba.cfr_renamed_9("Rl?r3"));
                    while ((certificate = certificateFactory2.generateCertificate(arg0)) != null) {
                        certificateFactory2 = certificateFactory;
                        this.cfr_renamed_4.add(certificate);
                    }
                    break block8;
                }
                throw new CertificateException(new StringBuilder().insert(0, sprtbq.cfr_renamed_9("2q4j7o(m3z#?\"q$p#v)x}?")).append((String)arg1).toString());
            }
            catch (IOException iOException) {
                throw new CertificateException(new StringBuilder().insert(0, sprpcba.cfr_renamed_9("C\rO:i'z6c-db~*x-}b}*c.obn'i-n+d%*\u0001o0~\u0012k6bx\u0000")).append(iOException.toString()).toString());
            }
            catch (NoSuchProviderException noSuchProviderException) {
                throw new CertificateException(new StringBuilder().insert(0, sprtbq.cfr_renamed_9("\u0005p2q$f\u0004~4k+zgo5p1v#z5?)p3?!p2q#?0w.s\"?3m>v)xgk(? z3?&?\u0004z5k.y.|&k\"Y&|3p5f}\u0015")).append(noSuchProviderException.toString()).toString());
            }
        }
        sprbnj sprbnj3 = this;
        sprbnj3.cfr_renamed_4 = sprbnj3.cfr_renamed_2464(sprbnj3.cfr_renamed_4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_9358(sprco arg0) throws CertificateEncodingException {
        try {
            return arg0.cfr_renamed_119().cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new CertificateEncodingException(new StringBuilder().insert(0, sprpcba.cfr_renamed_9("\u0007r!o2~+e,*6b0e5dx*")).append(iOException).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprxgf cfr_renamed_2465(X509Certificate arg0) throws CertificateEncodingException {
        try {
            return new sprrzm(arg0.getEncoded()).cfr_renamed_24();
        }
        catch (Exception exception) {
            throw new CertificateEncodingException(new StringBuilder().insert(0, sprtbq.cfr_renamed_9("\u0002g$z7k.p)?0w.s\"?\"q$p#v)xg|\"m3v!v$~3z}?")).append(exception.toString()).toString());
        }
    }
}

