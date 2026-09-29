/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.ShapeAlignmentEnum;
import com.spire.presentation.packages.spraee;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprcje;
import com.spire.presentation.packages.sprefe;
import com.spire.presentation.packages.sprege;
import com.spire.presentation.packages.sprfjb;
import com.spire.presentation.packages.sprfkb;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sprnge;
import com.spire.presentation.packages.sprnpb;
import com.spire.presentation.packages.sproje;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spruqb;
import com.spire.presentation.packages.sprvhb;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwmb;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryee;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public class sprgtb
extends X509CRL {
    private String cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private boolean cfr_renamed_1;
    private boolean cfr_renamed_2;
    private int cfr_renamed_3;
    private sproje cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 5 << 1;
        int cfr_ignored_0 = 3 << 3 ^ 5;
        int n4 = n2;
        int n5 = 3;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean cfr_renamed_2130(X509CRL arg0) throws CRLException {
        try {
            byte[] byArray = arg0.getExtensionValue(sprtie.cfr_renamed_0.cfr_renamed_19());
            return byArray != null && sprnge.cfr_renamed_23(sprxue.cfr_renamed_23(byArray).cfr_renamed_186()).cfr_renamed_2131();
        }
        catch (Exception exception) {
            throw new sprfkb(ShapeAlignmentEnum.cfr_renamed_9("ssUnF\u007f_dX+DnWo_eQ+\u007fxE~_eQO_xBy_iC\u007f_dX[YbX\u007f"), exception);
        }
    }

    @Override
    public Principal getIssuerDN() {
        return new sprfjb(spruhe.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_102().cfr_renamed_119()));
    }

    @Override
    public int getVersion() {
        return this.cfr_renamed_4.cfr_renamed_569();
    }

    @Override
    public String getSigAlgName() {
        return this.cfr_renamed_91;
    }

    @Override
    public void verify(PublicKey arg0) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.verify(arg0, "BC");
    }

    public Set getCriticalExtensionOIDs() {
        return this.cfr_renamed_78(true);
    }

    @Override
    public Date getThisUpdate() {
        return this.cfr_renamed_4.cfr_renamed_2132().cfr_renamed_110();
    }

    @Override
    public Date getNextUpdate() {
        if (this.cfr_renamed_4.cfr_renamed_2133() != null) {
            return this.cfr_renamed_4.cfr_renamed_2133().cfr_renamed_110();
        }
        return null;
    }

    @Override
    public boolean hasUnsupportedCriticalExtension() {
        Set set = this.getCriticalExtensionOIDs();
        if (set == null) {
            return false;
        }
        Set set2 = set;
        set2.remove(sprwmb.cfr_renamed_102);
        set.remove(sprwmb.cfr_renamed_0);
        return !set2.isEmpty();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() throws CRLException {
        try {
            return this.cfr_renamed_4.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new CRLException(iOException.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getTBSCertList() throws CRLException {
        try {
            return this.cfr_renamed_4.cfr_renamed_2134().cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new CRLException(iOException.toString());
        }
    }

    @Override
    public byte[] getSignature() {
        return this.cfr_renamed_4.cfr_renamed_79().cfr_renamed_81();
    }

    @Override
    public X509CRLEntry getRevokedCertificate(BigInteger arg0) {
        Enumeration enumeration = this.cfr_renamed_4.cfr_renamed_2135();
        spruhe spruhe2 = null;
        while (enumeration.hasMoreElements()) {
            sprtie sprtie2;
            sprege sprege2 = (sprege)enumeration.nextElement();
            if (arg0.equals(sprege2.cfr_renamed_2136().cfr_renamed_97())) {
                return new spruqb(sprege2, this.cfr_renamed_1, spruhe2);
            }
            if (!this.cfr_renamed_1 || !sprege2.cfr_renamed_663() || (sprtie2 = sprege2.cfr_renamed_98().cfr_renamed_100(sprtie.cfr_renamed_105)) == null) continue;
            spruhe2 = spruhe.cfr_renamed_23(spryee.cfr_renamed_23(sprtie2.cfr_renamed_372()).cfr_renamed_289()[0].cfr_renamed_313());
        }
        return null;
    }

    @Override
    public String getSigAlgOID() {
        return this.cfr_renamed_4.cfr_renamed_89().cfr_renamed_593().cfr_renamed_19();
    }

    public Set getRevokedCertificates() {
        Set set = this.cfr_renamed_2137();
        if (!set.isEmpty()) {
            return Collections.unmodifiableSet(set);
        }
        return null;
    }

    @Override
    public int hashCode() {
        if (!this.cfr_renamed_2) {
            this.cfr_renamed_2 = true;
            this.cfr_renamed_3 = super.hashCode();
        }
        return this.cfr_renamed_3;
    }

    public Set getNonCriticalExtensionOIDs() {
        return this.cfr_renamed_78(false);
    }

    @Override
    public void verify(PublicKey arg0, String arg1) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        Signature signature;
        if (!this.cfr_renamed_4.cfr_renamed_89().equals(this.cfr_renamed_4.cfr_renamed_2134().cfr_renamed_79())) {
            throw new CRLException(sprvhb.cfr_renamed_9("v\u000bB\fD\u0016P\u0010@BD\u000eB\rW\u000bQ\nHBJ\f\u0005!@\u0010Q\u000bC\u000bF\u0003Q\u0007i\u000bV\u0016\u0005\u0006J\u0007VBK\rQBH\u0003Q\u0001MBq v!@\u0010Q.L\u0011QL"));
        }
        (arg1 != null ? (signature = Signature.getInstance(this.getSigAlgName(), arg1)) : (signature = Signature.getInstance(this.getSigAlgName()))).initVerify(arg0);
        Signature signature2 = signature;
        signature2.update(this.getTBSCertList());
        if (!signature2.verify(this.getSignature())) {
            throw new SignatureException(ShapeAlignmentEnum.cfr_renamed_9("HdG\u0016oYnE+XdB+@nDbPr\u0016|_\u007f^+E~F{ZbSo\u0016{CiZbU+]nO%"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean isRevoked(Certificate arg0) {
        if (!arg0.getType().equals(sprvhb.cfr_renamed_9(":\u000bW\u0015["))) {
            throw new RuntimeException(ShapeAlignmentEnum.cfr_renamed_9("n%\u0003;\u000f+uYz+CxSo\u0016|_\u007f^+XdX+n%\u0003;\u000f+unD\u007f"));
        }
        sprgtb sprgtb2 = this;
        Enumeration enumeration = sprgtb2.cfr_renamed_4.cfr_renamed_2135();
        spruhe spruhe2 = sprgtb2.cfr_renamed_4.cfr_renamed_102();
        if (enumeration == null) return false;
        BigInteger bigInteger = ((X509Certificate)arg0).getSerialNumber();
        while (enumeration.hasMoreElements()) {
            spruhe spruhe3;
            sprkra sprkra2;
            sprege sprege2 = sprege.cfr_renamed_23(enumeration.nextElement());
            if (this.cfr_renamed_1 && sprege2.cfr_renamed_663() && (sprkra2 = sprege2.cfr_renamed_98().cfr_renamed_100(sprtie.cfr_renamed_105)) != null) {
                spruhe2 = spruhe.cfr_renamed_23(spryee.cfr_renamed_23(sprkra2.cfr_renamed_372()).cfr_renamed_289()[0].cfr_renamed_313());
            }
            if (!sprege2.cfr_renamed_2136().cfr_renamed_97().equals(bigInteger)) continue;
            if (arg0 instanceof X509Certificate) {
                sprkra2 = spruhe.cfr_renamed_23(((X509Certificate)arg0).getIssuerX500Principal().getEncoded());
                spruhe3 = spruhe2;
                return spruhe3.equals(sprkra2);
            }
            try {
                sprkra2 = sprcge.cfr_renamed_23(arg0.getEncoded()).cfr_renamed_102();
                spruhe3 = spruhe2;
                return spruhe3.equals(sprkra2);
            }
            catch (CertificateEncodingException certificateEncodingException) {
                throw new RuntimeException(sprvhb.cfr_renamed_9("f\u0003K\fJ\u0016\u0005\u0012W\rF\u0007V\u0011\u0005\u0001@\u0010Q\u000bC\u000bF\u0003Q\u0007"));
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getExtensionValue(String arg0) {
        sprszd sprszd2 = this.cfr_renamed_4.cfr_renamed_2134().cfr_renamed_98();
        if (sprszd2 != null) {
            sprtie sprtie2 = sprszd2.cfr_renamed_100(new sprtzd(arg0));
            if (sprtie2 != null) {
                try {
                    return sprtie2.cfr_renamed_103().cfr_renamed_91();
                }
                catch (Exception exception) {
                    throw new IllegalStateException(new StringBuilder().insert(0, ShapeAlignmentEnum.cfr_renamed_9("SyDdD+FjDx_eQ+")).append(exception.toString()).toString());
                }
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprgtb(sproje sproje2) throws CRLException {
        sprgtb sprgtb2 = this;
        sprgtb2.cfr_renamed_2 = false;
        sprgtb2.cfr_renamed_4 = sproje2;
        try {
            sprgtb sprgtb3;
            void arg0;
            this.cfr_renamed_91 = sprnpb.cfr_renamed_1538(arg0.cfr_renamed_89());
            if (arg0.cfr_renamed_89().cfr_renamed_284() != null) {
                sprgtb3 = this;
                this.cfr_renamed_0 = arg0.cfr_renamed_89().cfr_renamed_284().cfr_renamed_119().cfr_renamed_104("DER");
            } else {
                sprgtb3 = this;
                this.cfr_renamed_0 = null;
            }
            sprgtb3.cfr_renamed_1 = sprgtb.cfr_renamed_2130(this);
            return;
        }
        catch (Exception exception) {
            throw new CRLException(new StringBuilder().insert(0, sprvhb.cfr_renamed_9("f0iBF\rK\u0016@\fQ\u0011\u0005\u000bK\u0014D\u000eL\u0006\u001fB")).append(exception).toString());
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
            return new X500Principal(this.cfr_renamed_4.cfr_renamed_102().cfr_renamed_91());
        }
        catch (IOException iOException) {
            throw new IllegalStateException(ShapeAlignmentEnum.cfr_renamed_9("UjX,B+SeUdRn\u0016bExCnD+rE"));
        }
    }

    @Override
    public byte[] getSigAlgParams() {
        if (this.cfr_renamed_0 != null) {
            byte[] byArray = new byte[this.cfr_renamed_0.length];
            System.arraycopy(this.cfr_renamed_0, 0, byArray, 0, byArray.length);
            return byArray;
        }
        return null;
    }

    @Override
    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (!(arg0 instanceof X509CRL)) {
            return false;
        }
        if (arg0 instanceof sprgtb) {
            sprgtb sprgtb2 = (sprgtb)arg0;
            if (this.cfr_renamed_2 && sprgtb2.cfr_renamed_2 && sprgtb2.cfr_renamed_3 != this.cfr_renamed_3) {
                return false;
            }
            return this.cfr_renamed_4.equals(sprgtb2.cfr_renamed_4);
        }
        return super.equals(arg0);
    }

    private /* synthetic */ Set cfr_renamed_2137() {
        HashSet<spruqb> hashSet = new HashSet<spruqb>();
        Enumeration enumeration = this.cfr_renamed_4.cfr_renamed_2135();
        spruhe spruhe2 = null;
        while (enumeration.hasMoreElements()) {
            sprtie sprtie2;
            sprege sprege2 = (sprege)enumeration.nextElement();
            spruqb spruqb2 = new spruqb(sprege2, this.cfr_renamed_1, spruhe2);
            hashSet.add(spruqb2);
            if (!this.cfr_renamed_1 || !sprege2.cfr_renamed_663() || (sprtie2 = sprege2.cfr_renamed_98().cfr_renamed_100(sprtie.cfr_renamed_105)) == null) continue;
            spruhe2 = spruhe.cfr_renamed_23(spryee.cfr_renamed_23(sprtie2.cfr_renamed_372()).cfr_renamed_289()[0].cfr_renamed_313());
        }
        return hashSet;
    }

    private /* synthetic */ Set cfr_renamed_78(boolean arg0) {
        sprszd sprszd2;
        if (this.getVersion() == 2 && (sprszd2 = this.cfr_renamed_4.cfr_renamed_2134().cfr_renamed_98()) != null) {
            HashSet<String> hashSet = new HashSet<String>();
            Enumeration enumeration = sprszd2.cfr_renamed_99();
            while (enumeration.hasMoreElements()) {
                sprtzd sprtzd2 = (sprtzd)enumeration.nextElement();
                sprtie sprtie2 = sprszd2.cfr_renamed_100(sprtzd2);
                if (arg0 != sprtie2.cfr_renamed_101()) continue;
                hashSet.add(sprtzd2.cfr_renamed_19());
            }
            return hashSet;
        }
        return null;
    }

    @Override
    public String toString() {
        Object object;
        Object object2;
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprvhb.cfr_renamed_9("I\u000bK\u0007\u000b\u0011@\u0012D\u0010D\u0016J\u0010"));
        stringBuffer.append(ShapeAlignmentEnum.cfr_renamed_9("+\u0016+\u0016+\u0016+\u0016+\u0016+\u0016+\u0016]SyEbYe\f+")).append(this.getVersion()).append(string);
        stringBuffer.append(sprvhb.cfr_renamed_9("B\u0005B\u0005B\u0005B\u0005B\u0005B\u0005Bl\u0011V\u0017@\u0010a,\u001fB")).append(this.getIssuerDN()).append(string);
        stringBuffer.append(ShapeAlignmentEnum.cfr_renamed_9("+\u0016+\u0016+\u0016+\u0016+\u0016_^bE+C{RjBn\f+")).append(this.getThisUpdate()).append(string);
        stringBuffer.append(sprvhb.cfr_renamed_9("B\u0005B\u0005B\u0005B\u0005B\u0005,@\u001aQBP\u0012A\u0003Q\u0007\u001fB")).append(this.getNextUpdate()).append(string);
        stringBuffer.append(ShapeAlignmentEnum.cfr_renamed_9("+\u0016X_lXjB~Dn\u0016JZlYy_\u007f^f\f+")).append(this.getSigAlgName()).append(string);
        byte[] byArray = this.getSignature();
        stringBuffer.append(sprvhb.cfr_renamed_9("B\u0005B\u0005B\u0005B\u0005B\u0005B\u00051L\u0005K\u0003Q\u0017W\u0007\u001fB")).append(new String(sprmma.cfr_renamed_502(byArray, 0, 20))).append(string);
        int n = 20;
        int n2 = n;
        while (n2 < byArray.length) {
            if (n < byArray.length - 20) {
                stringBuffer.append(ShapeAlignmentEnum.cfr_renamed_9("+\u0016+\u0016+\u0016+\u0016+\u0016+\u0016+\u0016+\u0016+\u0016+\u0016+\u0016+")).append(new String(sprmma.cfr_renamed_502(byArray, n, 20))).append(string);
            } else {
                stringBuffer.append(sprvhb.cfr_renamed_9("B\u0005B\u0005B\u0005B\u0005B\u0005B\u0005B\u0005B\u0005B\u0005B\u0005B\u0005B")).append(new String(sprmma.cfr_renamed_502(byArray, n, byArray.length - n))).append(string);
            }
            n2 = n += 20;
        }
        sprszd sprszd2 = this.cfr_renamed_4.cfr_renamed_2134().cfr_renamed_98();
        if (sprszd2 != null) {
            object2 = sprszd2.cfr_renamed_99();
            if (object2.hasMoreElements()) {
                stringBuffer.append(ShapeAlignmentEnum.cfr_renamed_9("+\u0016+\u0016+\u0016+\u0016+\u0016+ssBnXx_dXx\f+")).append(string);
            }
            while (object2.hasMoreElements()) {
                object = (sprtzd)object2.nextElement();
                sprtie sprtie2 = sprszd2.cfr_renamed_100((sprtzd)object);
                if (sprtie2.cfr_renamed_103() != null) {
                    byte[] byArray2 = sprtie2.cfr_renamed_103().cfr_renamed_186();
                    sprgle sprgle2 = new sprgle(byArray2);
                    stringBuffer.append(sprvhb.cfr_renamed_9("\u0005B\u0005B\u0005B\u0005B\u0005B\u0005B\u0005B\u0005B\u0005B\u0005B\u0005B\u0005\u0001W\u000bQ\u000bF\u0003IJ")).append(sprtie2.cfr_renamed_101()).append(ShapeAlignmentEnum.cfr_renamed_9("\u001f+"));
                    try {
                        if (((sprvva)object).equals(sprtie.cfr_renamed_132)) {
                            stringBuffer.append(new spraee(sprooe.cfr_renamed_23(sprgle2.cfr_renamed_24()).cfr_renamed_162())).append(string);
                            continue;
                        }
                        if (((sprvva)object).equals(sprtie.cfr_renamed_185)) {
                            stringBuffer.append(new StringBuilder().insert(0, sprvhb.cfr_renamed_9("g\u0003V\u0007\u0005!w.\u001fB")).append(new spraee(sprooe.cfr_renamed_23(sprgle2.cfr_renamed_24()).cfr_renamed_162())).toString()).append(string);
                            continue;
                        }
                        if (((sprvva)object).equals(sprtie.cfr_renamed_0)) {
                            stringBuffer.append(sprnge.cfr_renamed_23(sprgle2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        if (((sprvva)object).equals(sprtie.spr\ufe34)) {
                            stringBuffer.append(sprefe.cfr_renamed_23(sprgle2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        StringBuffer stringBuffer2 = stringBuffer;
                        if (((sprvva)object).equals(sprtie.cfr_renamed_79)) {
                            stringBuffer2.append(sprefe.cfr_renamed_23(sprgle2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        stringBuffer2.append(((sprtzd)object).cfr_renamed_19());
                        stringBuffer.append(ShapeAlignmentEnum.cfr_renamed_9("+@jZ~S+\u000b+")).append(sprcje.cfr_renamed_2138(sprgle2.cfr_renamed_24())).append(string);
                    }
                    catch (Exception exception) {
                        stringBuffer.append(((sprtzd)object).cfr_renamed_19());
                        stringBuffer.append(sprvhb.cfr_renamed_9("BS\u0003I\u0017@B\u0018B")).append(ShapeAlignmentEnum.cfr_renamed_9("!\u001c!\u001c!")).append(string);
                    }
                    continue;
                }
                stringBuffer.append(string);
            }
        }
        if ((object2 = this.getRevokedCertificates()) != null) {
            Object object3 = object = object2.iterator();
            while (object3.hasNext()) {
                Object object4 = object;
                object3 = object4;
                stringBuffer.append(object4.next());
                stringBuffer.append(string);
            }
        }
        return stringBuffer.toString();
    }
}

