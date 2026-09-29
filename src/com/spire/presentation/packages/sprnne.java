/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdzh;
import com.spire.presentation.packages.sprefm;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.spriue;
import com.spire.presentation.packages.sprjhm;
import com.spire.presentation.packages.sprjii;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwdi;
import com.spire.presentation.packages.sprwgs;
import com.spire.presentation.packages.spryjm;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;

public class sprnne
implements CertSelector,
sprhd {
    public final spryjm cfr_renamed_4;

    @Override
    public Object clone() {
        return new sprnne((sprszm)this.cfr_renamed_4.cfr_renamed_119());
    }

    public sprnne(X500Principal arg0, BigInteger arg1) {
        this(spriue.cfr_renamed_124(arg0), arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprnne(sprdzh sprdzh2, BigInteger bigInteger) {
        void arg1;
        void arg0;
        sprnne sprnne2 = this;
        sprnne2.cfr_renamed_4 = new spryjm(new sprjhm(spraem.cfr_renamed_23(new sprcen(new sprigm((sprjii)arg0))), new sprktm((BigInteger)arg1)));
    }

    public sprnne(sprszm sprszm2) {
        this.cfr_renamed_4 = spryjm.cfr_renamed_23(sprszm2);
    }

    private /* synthetic */ Principal[] cfr_renamed_5105(spraem arg0) {
        int n;
        Object[] objectArray = this.cfr_renamed_5106(arg0.cfr_renamed_289());
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n2 = n = 0;
        while (n2 != objectArray.length) {
            if (objectArray[n] instanceof Principal) {
                arrayList.add(objectArray[n]);
            }
            n2 = ++n;
        }
        ArrayList<Object> arrayList2 = arrayList;
        return arrayList2.toArray(new Principal[arrayList2.size()]);
    }

    public String cfr_renamed_415() {
        if (this.cfr_renamed_4.cfr_renamed_409() != null) {
            this.cfr_renamed_4.cfr_renamed_409().cfr_renamed_415().cfr_renamed_19();
        }
        return null;
    }

    public Principal[] cfr_renamed_102() {
        if (this.cfr_renamed_4.cfr_renamed_404() != null) {
            sprnne sprnne2 = this;
            return sprnne2.cfr_renamed_5105(sprnne2.cfr_renamed_4.cfr_renamed_404().cfr_renamed_102());
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprnne(X509Certificate arg0) throws CertificateParsingException {
        sprdzh sprdzh2;
        try {
            sprdzh2 = sprwdi.cfr_renamed_373(arg0);
        }
        catch (Exception exception) {
            throw new CertificateParsingException(exception.getMessage());
        }
        this.cfr_renamed_4 = new spryjm(new sprjhm(this.cfr_renamed_5107(sprdzh2), new sprktm(arg0.getSerialNumber())));
    }

    public boolean cfr_renamed_132(Object arg0) {
        if (!(arg0 instanceof X509Certificate)) {
            return false;
        }
        return this.match((Certificate)arg0);
    }

    public String cfr_renamed_410() {
        if (this.cfr_renamed_4.cfr_renamed_409() != null) {
            return this.cfr_renamed_4.cfr_renamed_409().cfr_renamed_410().cfr_renamed_593().cfr_renamed_19();
        }
        return null;
    }

    @Override
    public boolean match(Certificate arg0) {
        block16: {
            if (!(arg0 instanceof X509Certificate)) {
                return false;
            }
            X509Certificate x509Certificate = (X509Certificate)arg0;
            try {
                MessageDigest messageDigest;
                if (this.cfr_renamed_4.cfr_renamed_404() != null) {
                    if (this.cfr_renamed_4.cfr_renamed_404().cfr_renamed_405().cfr_renamed_5103(x509Certificate.getSerialNumber())) {
                        sprnne sprnne2 = this;
                        if (sprnne2.cfr_renamed_5108(sprwdi.cfr_renamed_373(x509Certificate), sprnne2.cfr_renamed_4.cfr_renamed_404().cfr_renamed_102())) {
                            return true;
                        }
                    }
                    return false;
                }
                if (this.cfr_renamed_4.cfr_renamed_407() != null) {
                    sprnne sprnne3 = this;
                    if (sprnne3.cfr_renamed_5108(sprwdi.cfr_renamed_408(x509Certificate), sprnne3.cfr_renamed_4.cfr_renamed_407())) {
                        return true;
                    }
                }
                if (this.cfr_renamed_4.cfr_renamed_409() == null) break block16;
                MessageDigest messageDigest2 = null;
                try {
                    messageDigest2 = MessageDigest.getInstance(this.cfr_renamed_410(), "BC");
                }
                catch (Exception exception) {
                    return false;
                }
                switch (this.cfr_renamed_411()) {
                    case 0: {
                        MessageDigest messageDigest3 = messageDigest2;
                        while (false) {
                        }
                        messageDigest = messageDigest3;
                        messageDigest3.update(arg0.getPublicKey().getEncoded());
                        break;
                    }
                    case 1: {
                        messageDigest2.update(arg0.getEncoded());
                    }
                    default: {
                        messageDigest = messageDigest2;
                    }
                }
                if (!sproze.cfr_renamed_92(messageDigest.digest(), this.cfr_renamed_412())) {
                    return false;
                }
            }
            catch (CertificateEncodingException certificateEncodingException) {
                return false;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ boolean cfr_renamed_5108(sprdzh arg0, spraem arg1) {
        int n;
        sprigm[] sprigmArray = arg1.cfr_renamed_289();
        int n2 = n = 0;
        while (n2 != sprigmArray.length) {
            sprigm sprigm2 = sprigmArray[n];
            if (sprigm2.cfr_renamed_312() == 4) {
                try {
                    if (new sprdzh(sprigm2.cfr_renamed_313().cfr_renamed_119().cfr_renamed_91()).equals(arg0)) {
                        return true;
                    }
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            n2 = ++n;
        }
        return false;
    }

    public sprnne(X500Principal arg0) {
        this(spriue.cfr_renamed_124(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Object[] cfr_renamed_5106(sprigm[] arg0) {
        int n;
        ArrayList<X500Principal> arrayList = new ArrayList<X500Principal>(arg0.length);
        int n2 = n = 0;
        while (true) {
            if (n2 == arg0.length) {
                ArrayList<X500Principal> arrayList2 = arrayList;
                return arrayList2.toArray(new Object[arrayList2.size()]);
            }
            if (arg0[n].cfr_renamed_312() == 4) {
                try {
                    arrayList.add(new X500Principal(arg0[n].cfr_renamed_313().cfr_renamed_119().cfr_renamed_91()));
                }
                catch (IOException iOException) {
                    throw new RuntimeException(sprwgs.cfr_renamed_9("\u0017f\u0011k\f'\u0013h\u0007j\u0010cUI\u0014j\u0010'\u001ae\u001fb\u0016s"));
                }
            }
            n2 = ++n;
        }
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprnne)) {
            return false;
        }
        sprnne sprnne2 = (sprnne)arg0;
        return this.cfr_renamed_4.equals(sprnne2.cfr_renamed_4);
    }

    public Principal[] cfr_renamed_238() {
        if (this.cfr_renamed_4.cfr_renamed_407() != null) {
            sprnne sprnne2 = this;
            return sprnne2.cfr_renamed_5105(sprnne2.cfr_renamed_4.cfr_renamed_407());
        }
        return null;
    }

    public BigInteger cfr_renamed_114() {
        if (this.cfr_renamed_4.cfr_renamed_404() != null) {
            return this.cfr_renamed_4.cfr_renamed_404().cfr_renamed_405().cfr_renamed_97();
        }
        return null;
    }

    public int cfr_renamed_411() {
        if (this.cfr_renamed_4.cfr_renamed_409() != null) {
            return this.cfr_renamed_4.cfr_renamed_409().cfr_renamed_411().cfr_renamed_5023();
        }
        return -1;
    }

    public byte[] cfr_renamed_412() {
        if (this.cfr_renamed_4.cfr_renamed_409() != null) {
            return this.cfr_renamed_4.cfr_renamed_409().cfr_renamed_412().cfr_renamed_81();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprnne(sprdzh sprdzh2) {
        void arg0;
        sprnne sprnne2 = this;
        this.cfr_renamed_4 = new spryjm(this.cfr_renamed_5107((sprdzh)arg0));
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    private /* synthetic */ spraem cfr_renamed_5107(sprdzh arg0) {
        return spraem.cfr_renamed_23(new sprcen(new sprigm(arg0)));
    }

    /*
     * WARNING - void declaration
     */
    public sprnne(int n, String string, String string2, byte[] byArray) {
        void arg3;
        void arg1;
        void arg2;
        void arg0;
        sprnne sprnne2 = this;
        sprnne2.cfr_renamed_4 = new spryjm(new sprefm((int)arg0, new sprlem((String)arg2), new sprddm(new sprlem((String)arg1)), sproze.cfr_renamed_158((byte[])arg3)));
    }
}

