/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbd;
import com.spire.presentation.packages.sprbve;
import com.spire.presentation.packages.sprfle;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhhf;
import com.spire.presentation.packages.sprkim;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnne;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spryffa;
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

public class sprkle
implements sprbd {
    private Date cfr_renamed_2;
    private sprkim cfr_renamed_3;
    private Date cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprkle(sprkim sprkim2) throws IOException {
        this.cfr_renamed_3 = sprkim2;
        try {
            void arg0;
            sprkle sprkle2 = this;
            void v1 = arg0;
            sprkle2.cfr_renamed_2 = v1.cfr_renamed_83().cfr_renamed_108().cfr_renamed_109().cfr_renamed_110();
            sprkle2.cfr_renamed_4 = v1.cfr_renamed_83().cfr_renamed_108().cfr_renamed_111().cfr_renamed_110();
            return;
        }
        catch (ParseException parseException) {
            throw new IOException(sprhhf.cfr_renamed_9("(t7{-s%:%{5{ai5h4y5o3\u007fas/:\"\u007f3n(|(y n$;"));
        }
    }

    @Override
    public boolean hasUnsupportedCriticalExtension() {
        Set set = this.getCriticalExtensionOIDs();
        return set != null && !set.isEmpty();
    }

    @Override
    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_114().cfr_renamed_97();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void cfr_renamed_88(PublicKey arg0, String arg1) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        Signature signature = null;
        if (!this.cfr_renamed_3.cfr_renamed_89().equals(this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_79())) {
            throw new CertificateException(spryffa.cfr_renamed_9(".\u007f\u001ax\u001cb\bd\u00186\u001cz\u001ay\u000f\u007f\t~\u00106\u0014x]u\u0018d\t\u007f\u001b\u007f\u001ew\ts]\u007f\u0013p\u00126\u0013y\t6\u000ew\u0010s]w\u000e6\u0012c\ts\u000f6\u001es\u000fb\u0014p\u0014u\u001cb\u0018"));
        }
        signature = Signature.getInstance(this.cfr_renamed_3.cfr_renamed_89().cfr_renamed_593().cfr_renamed_19(), arg1);
        signature.initVerify(arg0);
        try {
            signature.update(this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_91());
        }
        catch (IOException iOException) {
            throw new SignatureException(sprhhf.cfr_renamed_9("\u0004b\"\u007f1n(u/:$t\"u%s/}ay$h5s's\"{5\u007fas/|.:.x+\u007f\"n"));
        }
        if (!signature.verify(this.cfr_renamed_79())) {
            throw new InvalidKeyException(spryffa.cfr_renamed_9("F\bt\u0011\u007f\u001e6\u0016s\u00046\rd\u0018e\u0018x\ts\u00196\u0013y\t6\u001by\u000f6\u001es\u000fb\u0014p\u0014u\u001cb\u00186\u000e\u007f\u001ax\u001cb\bd\u0018"));
        }
    }

    @Override
    public byte[] cfr_renamed_79() {
        return this.cfr_renamed_3.cfr_renamed_80().cfr_renamed_186();
    }

    @Override
    public sprnne cfr_renamed_93() {
        return new sprnne((sprszm)this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_93().cfr_renamed_119());
    }

    @Override
    public void cfr_renamed_96(Date arg0) throws CertificateExpiredException, CertificateNotYetValidException {
        if (arg0.after(this.cfr_renamed_86())) {
            throw new CertificateExpiredException(new StringBuilder().insert(0, sprhhf.cfr_renamed_9("y$h5s's\"{5\u007fa\u007f9j(h$~au/:")).append(this.cfr_renamed_86()).toString());
        }
        if (arg0.before(this.cfr_renamed_0())) {
            throw new CertificateNotYetValidException(new StringBuilder().insert(0, spryffa.cfr_renamed_9("\u001es\u000fb\u0014p\u0014u\u001cb\u00186\u0013y\t6\u000bw\u0011\u007f\u00196\t\u007f\u0011z]")).append(this.cfr_renamed_0()).toString());
        }
    }

    @Override
    public Date cfr_renamed_86() {
        return this.cfr_renamed_2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprkim cfr_renamed_87(InputStream arg0) throws IOException {
        try {
            return sprkim.cfr_renamed_23(new sprrzm(arg0).cfr_renamed_24());
        }
        catch (IOException iOException) {
            throw iOException;
        }
        catch (Exception exception) {
            throw new IOException(new StringBuilder().insert(0, sprhhf.cfr_renamed_9("$b\"\u007f1n(u/:%\u007f\"u%s/}ay$h5s's\"{5\u007fai5h4y5o3\u007f{:")).append(exception.toString()).toString());
        }
    }

    @Override
    public sprbve cfr_renamed_102() {
        return new sprbve(this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_102());
    }

    @Override
    public int cfr_renamed_3() {
        return this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_3().cfr_renamed_5023() + 1;
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_91();
    }

    @Override
    public Date cfr_renamed_0() {
        return this.cfr_renamed_4;
    }

    public Set getCriticalExtensionOIDs() {
        return this.cfr_renamed_78(true);
    }

    private /* synthetic */ Set cfr_renamed_78(boolean arg0) {
        sprhgm sprhgm2 = this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_98();
        if (sprhgm2 != null) {
            HashSet<String> hashSet = new HashSet<String>();
            Enumeration enumeration = sprhgm2.cfr_renamed_99();
            while (enumeration.hasMoreElements()) {
                sprlem sprlem2 = (sprlem)enumeration.nextElement();
                if (sprhgm2.cfr_renamed_5024(sprlem2).cfr_renamed_101() != arg0) continue;
                hashSet.add(sprlem2.cfr_renamed_19());
            }
            return hashSet;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getExtensionValue(String arg0) {
        sprhgm sprhgm2 = this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_98();
        if (sprhgm2 != null) {
            sprrdm sprrdm2 = sprhgm2.cfr_renamed_5024(new sprlem(arg0));
            if (sprrdm2 != null) {
                try {
                    return sprrdm2.cfr_renamed_103().cfr_renamed_104("DER");
                }
                catch (Exception exception) {
                    throw new RuntimeException(new StringBuilder().insert(0, spryffa.cfr_renamed_9("\u0018d\u000fy\u000f6\u0018x\u001ey\u0019\u007f\u0013q]")).append(exception.toString()).toString());
                }
            }
        }
        return null;
    }

    public sprkle(InputStream arg0) throws IOException {
        this(sprkle.cfr_renamed_87(arg0));
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprbd)) {
            return false;
        }
        sprbd sprbd2 = (sprbd)arg0;
        try {
            byte[] byArray = this.cfr_renamed_91();
            byte[] byArray2 = sprbd2.cfr_renamed_91();
            return sproze.cfr_renamed_92(byArray, byArray2);
        }
        catch (IOException iOException) {
            return false;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprkle(byte[] byArray) throws IOException {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    @Override
    public boolean[] cfr_renamed_105() {
        sprgbf sprgbf2 = this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_105();
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
    public void cfr_renamed_107() throws CertificateExpiredException, CertificateNotYetValidException {
        this.cfr_renamed_96(new Date());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int hashCode() {
        try {
            return sproze.cfr_renamed_95(this.cfr_renamed_91());
        }
        catch (IOException iOException) {
            return 0;
        }
    }

    @Override
    public sprfle[] cfr_renamed_82() {
        int n;
        sprszm sprszm2 = this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_82();
        sprfle[] sprfleArray = new sprfle[sprszm2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprszm2.cfr_renamed_84()) {
            int n3 = n;
            sprfle sprfle2 = new sprfle(sprszm2.cfr_renamed_85(n));
            sprfleArray[n3] = sprfle2;
            n2 = ++n;
        }
        return sprfleArray;
    }

    @Override
    public sprfle[] cfr_renamed_112(String arg0) {
        int n;
        sprszm sprszm2 = this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_82();
        ArrayList<sprfle> arrayList = new ArrayList<sprfle>();
        int n2 = n = 0;
        while (n2 != sprszm2.cfr_renamed_84()) {
            sprfle sprfle2 = new sprfle(sprszm2.cfr_renamed_85(n));
            if (sprfle2.cfr_renamed_113().equals(arg0)) {
                arrayList.add(sprfle2);
            }
            n2 = ++n;
        }
        if (arrayList.size() == 0) {
            return null;
        }
        ArrayList<sprfle> arrayList2 = arrayList;
        return arrayList2.toArray(new sprfle[arrayList2.size()]);
    }

    public Set getNonCriticalExtensionOIDs() {
        return this.cfr_renamed_78(false);
    }
}

