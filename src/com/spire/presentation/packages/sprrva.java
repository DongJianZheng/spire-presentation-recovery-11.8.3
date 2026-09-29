/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdhe;
import com.spire.presentation.packages.sprfjb;
import com.spire.presentation.packages.sprfrb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjra;
import com.spire.presentation.packages.sprjvz;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprnhe;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqee;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruib;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.sprzra;
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

public class sprrva
implements CertSelector,
sprb {
    public final sprdhe cfr_renamed_4;

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
                    if (this.cfr_renamed_4.cfr_renamed_404().cfr_renamed_405().cfr_renamed_97().equals(x509Certificate.getSerialNumber())) {
                        sprrva sprrva2 = this;
                        if (sprrva2.cfr_renamed_406(sprfrb.cfr_renamed_373(x509Certificate), sprrva2.cfr_renamed_4.cfr_renamed_404().cfr_renamed_102())) {
                            return true;
                        }
                    }
                    return false;
                }
                if (this.cfr_renamed_4.cfr_renamed_407() != null) {
                    sprrva sprrva3 = this;
                    if (sprrva3.cfr_renamed_406(sprfrb.cfr_renamed_408(x509Certificate), sprrva3.cfr_renamed_4.cfr_renamed_407())) {
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
                if (!sprzra.cfr_renamed_92(messageDigest.digest(), this.cfr_renamed_412())) {
                    return false;
                }
            }
            catch (CertificateEncodingException certificateEncodingException) {
                return false;
            }
        }
        return false;
    }

    public Principal[] cfr_renamed_102() {
        if (this.cfr_renamed_4.cfr_renamed_404() != null) {
            sprrva sprrva2 = this;
            return sprrva2.cfr_renamed_413(sprrva2.cfr_renamed_4.cfr_renamed_404().cfr_renamed_102());
        }
        return null;
    }

    private /* synthetic */ Principal[] cfr_renamed_413(spryee arg0) {
        int n;
        Object[] objectArray = this.cfr_renamed_414(arg0.cfr_renamed_289());
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

    public BigInteger cfr_renamed_114() {
        if (this.cfr_renamed_4.cfr_renamed_404() != null) {
            return this.cfr_renamed_4.cfr_renamed_404().cfr_renamed_405().cfr_renamed_97();
        }
        return null;
    }

    public sprrva(X500Principal arg0) {
        this(sprjra.cfr_renamed_124(arg0));
    }

    public int cfr_renamed_411() {
        if (this.cfr_renamed_4.cfr_renamed_409() != null) {
            return this.cfr_renamed_4.cfr_renamed_409().cfr_renamed_411().cfr_renamed_97().intValue();
        }
        return -1;
    }

    public byte[] cfr_renamed_412() {
        if (this.cfr_renamed_4.cfr_renamed_409() != null) {
            return this.cfr_renamed_4.cfr_renamed_409().cfr_renamed_412().cfr_renamed_81();
        }
        return null;
    }

    public Principal[] cfr_renamed_238() {
        if (this.cfr_renamed_4.cfr_renamed_407() != null) {
            sprrva sprrva2 = this;
            return sprrva2.cfr_renamed_413(sprrva2.cfr_renamed_4.cfr_renamed_407());
        }
        return null;
    }

    @Override
    public Object clone() {
        return new sprrva((sprbne)this.cfr_renamed_4.cfr_renamed_94());
    }

    /*
     * WARNING - void declaration
     */
    public sprrva(sprfjb sprfjb2) {
        void arg0;
        sprrva sprrva2 = this;
        this.cfr_renamed_4 = new sprdhe(this.cfr_renamed_416((sprfjb)arg0));
    }

    /*
     * WARNING - void declaration
     */
    public sprrva(int n, String string, String string2, byte[] byArray) {
        void arg3;
        void arg1;
        void arg2;
        void arg0;
        sprrva sprrva2 = this;
        sprrva2.cfr_renamed_4 = new sprdhe(new sprqee((int)arg0, new sprtzd((String)arg2), new sprije((String)arg1), sprzra.cfr_renamed_158((byte[])arg3)));
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprrva)) {
            return false;
        }
        sprrva sprrva2 = (sprrva)arg0;
        return this.cfr_renamed_4.equals(sprrva2.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprrva(sprfjb sprfjb2, BigInteger bigInteger) {
        void arg1;
        void arg0;
        sprrva sprrva2 = this;
        sprrva2.cfr_renamed_4 = new sprdhe(new sprnhe(spryee.cfr_renamed_23(new sprpse(new sprmee((spruib)arg0))), new sprooe((BigInteger)arg1)));
    }

    public String cfr_renamed_410() {
        if (this.cfr_renamed_4.cfr_renamed_409() != null) {
            return this.cfr_renamed_4.cfr_renamed_409().cfr_renamed_410().cfr_renamed_90().cfr_renamed_19();
        }
        return null;
    }

    private /* synthetic */ spryee cfr_renamed_416(sprfjb arg0) {
        return spryee.cfr_renamed_23(new sprpse(new sprmee(arg0)));
    }

    public sprrva(X500Principal arg0, BigInteger arg1) {
        this(sprjra.cfr_renamed_124(arg0), arg1);
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Object[] cfr_renamed_414(sprmee[] arg0) {
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
                    throw new RuntimeException(sprjvz.cfr_renamed_9("QHWEJ\tUFADVM\u0013gRDV\t\\KYLP]"));
                }
            }
            n2 = ++n;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprrva(X509Certificate arg0) throws CertificateParsingException {
        sprfjb sprfjb2;
        try {
            sprfjb2 = sprfrb.cfr_renamed_373(arg0);
        }
        catch (Exception exception) {
            throw new CertificateParsingException(exception.getMessage());
        }
        this.cfr_renamed_4 = new sprdhe(new sprnhe(this.cfr_renamed_416(sprfjb2), new sprooe(arg0.getSerialNumber())));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ boolean cfr_renamed_406(sprfjb arg0, spryee arg1) {
        int n;
        sprmee[] sprmeeArray = arg1.cfr_renamed_289();
        int n2 = n = 0;
        while (n2 != sprmeeArray.length) {
            sprmee sprmee2 = sprmeeArray[n];
            if (sprmee2.cfr_renamed_312() == 4) {
                try {
                    if (new sprfjb(sprmee2.cfr_renamed_313().cfr_renamed_119().cfr_renamed_91()).equals(arg0)) {
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

    @Override
    public boolean cfr_renamed_132(Object arg0) {
        if (!(arg0 instanceof X509Certificate)) {
            return false;
        }
        return this.match((Certificate)arg0);
    }

    public sprrva(sprbne sprbne2) {
        this.cfr_renamed_4 = sprdhe.cfr_renamed_23(sprbne2);
    }
}

