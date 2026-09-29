/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraua;
import com.spire.presentation.packages.sprawa;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprnek;
import com.spire.presentation.packages.sprnfe;
import com.spire.presentation.packages.sprrva;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprylaa;
import com.spire.presentation.packages.sprz;
import com.spire.presentation.packages.sprzra;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

public class sprfra
implements sprz {
    private Date cfr_renamed_2;
    private Date cfr_renamed_3;
    private sprnfe cfr_renamed_4;

    public Set getNonCriticalExtensionOIDs() {
        return this.cfr_renamed_78(false);
    }

    @Override
    public byte[] cfr_renamed_79() {
        return this.cfr_renamed_4.cfr_renamed_80().cfr_renamed_81();
    }

    @Override
    public sprawa[] cfr_renamed_82() {
        int n;
        sprbne sprbne2 = this.cfr_renamed_4.cfr_renamed_83().cfr_renamed_82();
        sprawa[] sprawaArray = new sprawa[sprbne2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprbne2.cfr_renamed_84()) {
            int n3 = n;
            sprawa sprawa2 = new sprawa(sprbne2.cfr_renamed_85(n));
            sprawaArray[n3] = sprawa2;
            n2 = ++n;
        }
        return sprawaArray;
    }

    @Override
    public Date cfr_renamed_86() {
        return this.cfr_renamed_2;
    }

    public sprfra(InputStream arg0) throws IOException {
        this(sprfra.cfr_renamed_87(arg0));
    }

    /*
     * WARNING - void declaration
     */
    public sprfra(byte[] byArray) throws IOException {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void cfr_renamed_88(PublicKey arg0, String arg1) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        Signature signature = null;
        if (!this.cfr_renamed_4.cfr_renamed_89().equals(this.cfr_renamed_4.cfr_renamed_83().cfr_renamed_79())) {
            throw new CertificateException(sprnek.cfr_renamed_9("(n\u001ci\u001as\u000eu\u001e'\u001ak\u001ch\tn\u000fo\u0016'\u0012i[d\u001eu\u000fn\u001dn\u0018f\u000fb[n\u0015a\u0014'\u0015h\u000f'\bf\u0016b[f\b'\u0014r\u000fb\t'\u0018b\ts\u0012a\u0012d\u001as\u001e"));
        }
        signature = Signature.getInstance(this.cfr_renamed_4.cfr_renamed_89().cfr_renamed_90().cfr_renamed_19(), arg1);
        signature.initVerify(arg0);
        try {
            signature.update(this.cfr_renamed_4.cfr_renamed_83().cfr_renamed_91());
        }
        catch (IOException iOException) {
            throw new SignatureException(sprylaa.cfr_renamed_9("NJhW{Fb]e\u0012n\\h]o[eU+Qn@\u007f[m[hS\u007fW+[eTd\u0012dPaWhF"));
        }
        if (!signature.verify(this.cfr_renamed_79())) {
            throw new InvalidKeyException(sprnek.cfr_renamed_9("W\u000ee\u0017n\u0018'\u0010b\u0002'\u000bu\u001et\u001ei\u000fb\u001f'\u0015h\u000f'\u001dh\t'\u0018b\ts\u0012a\u0012d\u001as\u001e'\bn\u001ci\u001as\u000eu\u001e"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprnfe cfr_renamed_87(InputStream arg0) throws IOException {
        try {
            return sprnfe.cfr_renamed_23(new sprgle(arg0).cfr_renamed_24());
        }
        catch (IOException iOException) {
            throw iOException;
        }
        catch (Exception exception) {
            throw new IOException(new StringBuilder().insert(0, sprylaa.cfr_renamed_9("nJhW{Fb]e\u0012oWh]o[eU+Qn@\u007f[m[hS\u007fW+A\u007f@~Q\u007fGyW1\u0012")).append(exception.toString()).toString());
        }
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprz)) {
            return false;
        }
        sprz sprz2 = (sprz)arg0;
        try {
            byte[] byArray = this.cfr_renamed_91();
            byte[] byArray2 = sprz2.cfr_renamed_91();
            return sprzra.cfr_renamed_92(byArray, byArray2);
        }
        catch (IOException iOException) {
            return false;
        }
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_91();
    }

    @Override
    public sprrva cfr_renamed_93() {
        return new sprrva((sprbne)this.cfr_renamed_4.cfr_renamed_83().cfr_renamed_93().cfr_renamed_94());
    }

    @Override
    public boolean hasUnsupportedCriticalExtension() {
        Set set = this.getCriticalExtensionOIDs();
        return set != null && !set.isEmpty();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int hashCode() {
        try {
            return sprzra.cfr_renamed_95(this.cfr_renamed_91());
        }
        catch (IOException iOException) {
            return 0;
        }
    }

    public Set getCriticalExtensionOIDs() {
        return this.cfr_renamed_78(true);
    }

    @Override
    public Date cfr_renamed_0() {
        return this.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_96(Date arg0) throws CertificateExpiredException, CertificateNotYetValidException {
        if (arg0.after(this.cfr_renamed_86())) {
            throw new CertificateExpiredException(new StringBuilder().insert(0, sprnek.cfr_renamed_9("\u0018b\ts\u0012a\u0012d\u001as\u001e'\u001e\u007f\u000bn\tb\u001f'\u0014i[")).append(this.cfr_renamed_86()).toString());
        }
        if (arg0.before(this.cfr_renamed_0())) {
            throw new CertificateNotYetValidException(new StringBuilder().insert(0, sprylaa.cfr_renamed_9("Qn@\u007f[m[hS\u007fW+\\dF+Dj^bV+Fb^g\u0012")).append(this.cfr_renamed_0()).toString());
        }
    }

    @Override
    public int cfr_renamed_3() {
        return this.cfr_renamed_4.cfr_renamed_83().cfr_renamed_3().cfr_renamed_97().intValue() + 1;
    }

    private /* synthetic */ Set cfr_renamed_78(boolean arg0) {
        sprszd sprszd2 = this.cfr_renamed_4.cfr_renamed_83().cfr_renamed_98();
        if (sprszd2 != null) {
            HashSet<String> hashSet = new HashSet<String>();
            Enumeration enumeration = sprszd2.cfr_renamed_99();
            while (enumeration.hasMoreElements()) {
                sprtzd sprtzd2 = (sprtzd)enumeration.nextElement();
                if (sprszd2.cfr_renamed_100(sprtzd2).cfr_renamed_101() != arg0) continue;
                hashSet.add(sprtzd2.cfr_renamed_19());
            }
            return hashSet;
        }
        return null;
    }

    @Override
    public spraua cfr_renamed_102() {
        return new spraua(this.cfr_renamed_4.cfr_renamed_83().cfr_renamed_102());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getExtensionValue(String arg0) {
        sprszd sprszd2 = this.cfr_renamed_4.cfr_renamed_83().cfr_renamed_98();
        if (sprszd2 != null) {
            sprtie sprtie2 = sprszd2.cfr_renamed_100(new sprtzd(arg0));
            if (sprtie2 != null) {
                try {
                    return sprtie2.cfr_renamed_103().cfr_renamed_104("DER");
                }
                catch (Exception exception) {
                    throw new RuntimeException(new StringBuilder().insert(0, sprnek.cfr_renamed_9("\u001eu\th\t'\u001ei\u0018h\u001fn\u0015`[")).append(exception.toString()).toString());
                }
            }
        }
        return null;
    }

    @Override
    public boolean[] cfr_renamed_105() {
        sprmra sprmra2 = this.cfr_renamed_4.cfr_renamed_83().cfr_renamed_105();
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
    public void cfr_renamed_107() throws CertificateExpiredException, CertificateNotYetValidException {
        this.cfr_renamed_96(new Date());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprfra(sprnfe sprnfe2) throws IOException {
        this.cfr_renamed_4 = sprnfe2;
        try {
            void arg0;
            sprfra sprfra2 = this;
            void v1 = arg0;
            sprfra2.cfr_renamed_2 = v1.cfr_renamed_83().cfr_renamed_108().cfr_renamed_109().cfr_renamed_110();
            sprfra2.cfr_renamed_3 = v1.cfr_renamed_83().cfr_renamed_108().cfr_renamed_111().cfr_renamed_110();
            return;
        }
        catch (ParseException parseException) {
            throw new IOException(sprylaa.cfr_renamed_9("b\\}Sg[o\u0012oS\u007fS+A\u007f@~Q\u007fGyW+[e\u0012hWyFbTbQjFn\u0013"));
        }
    }

    @Override
    public sprawa[] cfr_renamed_112(String arg0) {
        int n;
        sprbne sprbne2 = this.cfr_renamed_4.cfr_renamed_83().cfr_renamed_82();
        ArrayList<sprawa> arrayList = new ArrayList<sprawa>();
        int n2 = n = 0;
        while (n2 != sprbne2.cfr_renamed_84()) {
            sprawa sprawa2 = new sprawa(sprbne2.cfr_renamed_85(n));
            if (sprawa2.cfr_renamed_113().equals(arg0)) {
                arrayList.add(sprawa2);
            }
            n2 = ++n;
        }
        if (arrayList.size() == 0) {
            return null;
        }
        ArrayList<sprawa> arrayList2 = arrayList;
        return arrayList2.toArray(new sprawa[arrayList2.size()]);
    }

    @Override
    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_4.cfr_renamed_83().cfr_renamed_114().cfr_renamed_97();
    }
}

