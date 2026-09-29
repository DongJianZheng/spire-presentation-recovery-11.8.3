/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrz;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.spreyd;
import com.spire.presentation.packages.sprfcs;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprja;
import com.spire.presentation.packages.sprjza;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprlxa;
import com.spire.presentation.packages.sprohb;
import com.spire.presentation.packages.sprqxa;
import com.spire.presentation.packages.sprrwd;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class sprncb {
    private sprlxa cfr_renamed_4;

    public sprja cfr_renamed_1559(PublicKey arg0) throws sprfya {
        return new sprjza(this, arg0);
    }

    public sprja cfr_renamed_1560(sprcyd arg0) throws sprfya, CertificateException {
        sprncb sprncb2 = this;
        return sprncb2.cfr_renamed_1561(sprncb2.cfr_renamed_4.cfr_renamed_1549(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprqxa cfr_renamed_1562(sprije arg0, PublicKey arg1) throws sprfya {
        try {
            Signature signature = this.cfr_renamed_4.cfr_renamed_1548(arg0);
            signature.initVerify(arg1);
            return new sprqxa(this, signature);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprfya(new StringBuilder().insert(0, sprbrz.cfr_renamed_9("\tC\u000f^\u001cO\u0005T\u0002\u001b\u0003ULH\tO\u0019KV\u001b")).append(generalSecurityException).toString(), generalSecurityException);
        }
    }

    public static /* synthetic */ sprlxa cfr_renamed_1563(sprncb arg0) {
        return arg0.cfr_renamed_4;
    }

    public static /* synthetic */ sprqxa cfr_renamed_1564(sprncb arg0, sprije arg1, PublicKey arg2) throws sprfya {
        return arg0.cfr_renamed_1562(arg1, arg2);
    }

    public static /* synthetic */ Signature cfr_renamed_1565(sprncb arg0, sprije arg1, PublicKey arg2) {
        return arg0.cfr_renamed_1566(arg1, arg2);
    }

    public sprja cfr_renamed_1567(sprdce arg0) throws sprfya {
        sprncb sprncb2 = this;
        return sprncb2.cfr_renamed_1559(sprncb2.cfr_renamed_4.cfr_renamed_1543(arg0));
    }

    /*
     * WARNING - void declaration
     */
    public sprncb cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprlxa(new spritd((Provider)arg0));
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprja cfr_renamed_1561(X509Certificate arg0) throws sprfya {
        try {
            spreyd spreyd2 = new spreyd(arg0);
            return new sprohb(this, spreyd2, arg0);
        }
        catch (CertificateEncodingException certificateEncodingException) {
            throw new sprfya(new StringBuilder().insert(0, sprfcs.cfr_renamed_9("\u0007\u0001\n\u000e\u000b\u0014D\u0010\u0016\u000f\u0007\u0005\u0017\u0013D\u0003\u0001\u0012\u0010\t\u0002\t\u0007\u0001\u0010\u0005^@")).append(certificateEncodingException.getMessage()).toString(), certificateEncodingException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Signature cfr_renamed_1566(sprije arg0, PublicKey arg1) {
        try {
            Signature signature = this.cfr_renamed_4.cfr_renamed_1537(arg0);
            if (signature == null) return signature;
            signature.initVerify(arg1);
            return signature;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprncb cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprlxa(new sprrwd((String)arg0));
        return this;
    }

    public sprncb() {
        sprncb sprncb2 = this;
        sprncb2.cfr_renamed_4 = new sprlxa(new sprkvd());
    }
}

