/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbcm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcrj;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprgoj;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnhj;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtlj;
import com.spire.presentation.packages.sprvgp;
import com.spire.presentation.packages.sprvkj;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzxk;
import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.util.Date;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

@sprtea
public class sprjqj
extends sprgoj
implements sprof {
    private long[] cfr_renamed_152;
    private final Object cfr_renamed_112;
    private X500Principal cfr_renamed_119;
    private volatile boolean cfr_renamed_91;
    private volatile int cfr_renamed_0;
    private X500Principal cfr_renamed_1;
    private PublicKey cfr_renamed_2;
    private sprnhj cfr_renamed_3;
    private sprof cfr_renamed_4;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprbcm cfr_renamed_9348(sprndm arg0) throws CertificateParsingException {
        try {
            byte[] byArray = sprjqj.cfr_renamed_9349(arg0, "2.5.29.19");
            if (null != byArray) return sprbcm.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray));
            return null;
        }
        catch (Exception exception) {
            throw new CertificateParsingException(new StringBuilder().insert(0, sprvgp.cfr_renamed_9("\t\u000f\u0004\u0000\u0005\u001aJ\r\u0005\u0000\u0019\u001a\u0018\u001b\t\u001aJ,\u000b\u001d\u0003\r)\u0001\u0004\u001d\u001e\u001c\u000b\u0007\u0004\u001a\u0019TJ")).append(exception).toString());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public X500Principal getSubjectX500Principal() {
        Object object = this.cfr_renamed_112;
        synchronized (object) {
            if (null != this.cfr_renamed_119) {
                return this.cfr_renamed_119;
            }
        }
        object = super.getSubjectX500Principal();
        Object object2 = this.cfr_renamed_112;
        synchronized (object2) {
            if (null == this.cfr_renamed_119) {
                this.cfr_renamed_119 = object;
            }
            return this.cfr_renamed_119;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        long[] lArray;
        void arg0;
        long l = arg0.getTime();
        if (l > (lArray = this.cfr_renamed_9350())[1]) {
            throw new CertificateExpiredException(new StringBuilder().insert(0, sprzxk.cfr_renamed_9("HPYABSBVJAN\u0015NM[\\YPO\u0015D[\u000b")).append(((sprndm)((Object)this.cfr_renamed_4)).cfr_renamed_2146().cfr_renamed_2147()).toString());
        }
        if (l < lArray[0]) {
            throw new CertificateNotYetValidException(new StringBuilder().insert(0, sprvgp.cfr_renamed_9("\t\u000b\u0018\u001a\u0003\b\u0003\r\u000b\u001a\u000fN\u0004\u0001\u001eN\u001c\u000f\u0006\u0007\u000eN\u001e\u0007\u0006\u0002J")).append(((sprndm)((Object)this.cfr_renamed_4)).cfr_renamed_2148().cfr_renamed_2147()).toString());
        }
    }

    @Override
    public void cfr_renamed_9065(sprlem arg0, sprco arg1) {
        this.cfr_renamed_4.cfr_renamed_9065(arg0, arg1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long[] cfr_renamed_9350() {
        Object object = this.cfr_renamed_112;
        synchronized (object) {
            if (null != this.cfr_renamed_152) {
                return this.cfr_renamed_152;
            }
        }
        long[] lArray = new long[2];
        lArray[0] = super.getNotBefore().getTime();
        lArray[1] = super.getNotAfter().getTime();
        object = lArray;
        Object object2 = this.cfr_renamed_112;
        synchronized (object2) {
            if (null == this.cfr_renamed_152) {
                this.cfr_renamed_152 = (long[])object;
            }
            return this.cfr_renamed_152;
        }
    }

    @Override
    public int hashCode() {
        if (!this.cfr_renamed_91) {
            this.cfr_renamed_0 = this.cfr_renamed_9351().hashCode();
            this.cfr_renamed_91 = true;
        }
        return this.cfr_renamed_0;
    }

    @Override
    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprjqj) {
            sprgbf sprgbf2;
            sprjqj sprjqj2 = (sprjqj)arg0;
            if (this.cfr_renamed_91 && sprjqj2.cfr_renamed_91 ? this.cfr_renamed_0 != sprjqj2.cfr_renamed_0 : (null == this.cfr_renamed_3 || null == sprjqj2.cfr_renamed_3) && null != (sprgbf2 = ((sprndm)((Object)this.cfr_renamed_4)).cfr_renamed_79()) && !sprgbf2.cfr_renamed_5078(((sprndm)((Object)sprjqj2.cfr_renamed_4)).cfr_renamed_79())) {
                return false;
            }
            return this.cfr_renamed_9351().equals(sprjqj2.cfr_renamed_9351());
        }
        return this.cfr_renamed_9351().equals(arg0);
    }

    @Override
    public sprco cfr_renamed_9064(sprlem arg0) {
        return this.cfr_renamed_4.cfr_renamed_9064(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ String cfr_renamed_9352(sprndm arg0) throws CertificateParsingException {
        try {
            return sprcrj.cfr_renamed_9057(arg0.cfr_renamed_89());
        }
        catch (Exception exception) {
            throw new CertificateParsingException(new StringBuilder().insert(0, sprzxk.cfr_renamed_9("HTE[DA\u000bVD[XAY@HA\u000bfBRjYL{JXN\u000f\u000b")).append(exception).toString());
        }
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_4.cfr_renamed_2158();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprnhj cfr_renamed_9351() {
        Object object = this.cfr_renamed_112;
        synchronized (object) {
            if (null != this.cfr_renamed_3) {
                return this.cfr_renamed_3;
            }
        }
        object = null;
        sprvkj sprvkj2 = null;
        try {
            object = ((sprqqe)((Object)this.cfr_renamed_4)).cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            sprvkj2 = new sprvkj(iOException);
        }
        sprjqj sprjqj2 = this;
        sprjqj sprjqj3 = this;
        sprjqj sprjqj4 = this;
        sprnhj sprnhj2 = new sprnhj((sprrr)((Object)sprjqj2.cfr_renamed_1), (sprndm)((Object)sprjqj2.cfr_renamed_4), (sprbcm)((Object)sprjqj3.cfr_renamed_2), (boolean[])sprjqj3.cfr_renamed_91, (String)sprjqj4.cfr_renamed_0, (byte[])sprjqj4.cfr_renamed_3, (byte[])object, sprvkj2);
        Object object2 = this.cfr_renamed_112;
        synchronized (object2) {
            if (null == this.cfr_renamed_3) {
                this.cfr_renamed_3 = sprnhj2;
            }
            return this.cfr_renamed_3;
        }
    }

    public sprjqj(sprrr sprrr2, sprndm sprndm2) throws CertificateParsingException {
        sprndm sprndm3 = sprndm2;
        super(sprrr2, sprndm3, sprjqj.cfr_renamed_9348(sprndm2), sprjqj.cfr_renamed_9353(sprndm2), sprjqj.cfr_renamed_9352(sprndm3), sprjqj.cfr_renamed_9354(sprndm2));
        sprjqj sprjqj2 = this;
        this.cfr_renamed_112 = new Object();
        sprjqj2.cfr_renamed_4 = new sprtlj();
    }

    private static /* synthetic */ boolean[] cfr_renamed_9353(sprndm arg0) throws CertificateParsingException {
        byte[] byArray;
        block4: {
            byArray = sprjqj.cfr_renamed_9349(arg0, "2.5.29.15");
            if (null != byArray) break block4;
            return null;
        }
        try {
            int n;
            sprgbf sprgbf2 = sprgbf.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray));
            byte[] byArray2 = sprgbf2.cfr_renamed_81();
            int n2 = byArray2.length * 8 - sprgbf2.cfr_renamed_106();
            boolean[] blArray = new boolean[n2 < 9 ? 9 : n2];
            int n3 = n = 0;
            while (n3 != n2) {
                int n4 = n;
                blArray[n4] = (byArray2[n / 8] & 128 >>> n4 % 8) != 0;
                n3 = ++n;
            }
            return blArray;
        }
        catch (Exception exception) {
            throw new CertificateParsingException(new StringBuilder().insert(0, sprvgp.cfr_renamed_9("\t\u000f\u0004\u0000\u0005\u001aJ\r\u0005\u0000\u0019\u001a\u0018\u001b\t\u001aJ%\u000f\u0017?\u001d\u000b\t\u000fTJ")).append(exception).toString());
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ byte[] cfr_renamed_9354(sprndm arg0) throws CertificateParsingException {
        try {
            sprco sprco2 = arg0.cfr_renamed_89().cfr_renamed_284();
            if (null != sprco2) return sprco2.cfr_renamed_119().cfr_renamed_104("DER");
            return null;
        }
        catch (Exception exception) {
            throw new CertificateParsingException(new StringBuilder().insert(0, sprzxk.cfr_renamed_9("HTE[DA\u000bVD[XAY@HA\u000bfBRjYLeJGJXX\u000f\u000b")).append(exception).toString());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PublicKey getPublicKey() {
        Object object = this.cfr_renamed_112;
        synchronized (object) {
            if (null != this.cfr_renamed_2) {
                return this.cfr_renamed_2;
            }
        }
        object = super.getPublicKey();
        if (null == object) {
            return null;
        }
        Object object2 = this.cfr_renamed_112;
        synchronized (object2) {
            if (null == this.cfr_renamed_2) {
                this.cfr_renamed_2 = object;
            }
            return this.cfr_renamed_2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public X500Principal getIssuerX500Principal() {
        Object object = this.cfr_renamed_112;
        synchronized (object) {
            if (null != this.cfr_renamed_1) {
                return this.cfr_renamed_1;
            }
        }
        object = super.getIssuerX500Principal();
        Object object2 = this.cfr_renamed_112;
        synchronized (object2) {
            if (null == this.cfr_renamed_1) {
                this.cfr_renamed_1 = object;
            }
            return this.cfr_renamed_1;
        }
    }

    @Override
    public byte[] getEncoded() throws CertificateEncodingException {
        return sproze.cfr_renamed_158(this.cfr_renamed_9351().getEncoded());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int cfr_renamed_9355() {
        try {
            int n;
            int n2 = 0;
            byte[] byArray = this.cfr_renamed_9351().getEncoded();
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
}

