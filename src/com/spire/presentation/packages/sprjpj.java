/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcrj;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdzh;
import com.spire.presentation.packages.spregm;
import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprijj;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkp;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.spronj;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpim;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrxj;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvcm;
import com.spire.presentation.packages.sprvnj;
import com.spire.presentation.packages.sprvzl;
import com.spire.presentation.packages.sprvzs;
import com.spire.presentation.packages.sprwbk;
import com.spire.presentation.packages.sprwzl;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxmj;
import com.spire.presentation.packages.sprxnj;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
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
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public abstract class sprjpj
extends X509CRL {
    public String cfr_renamed_0;
    public sprffm cfr_renamed_1;
    public sprrr cfr_renamed_2;
    public boolean cfr_renamed_3;
    public byte[] cfr_renamed_4;

    @Override
    public void verify(PublicKey arg0) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.cfr_renamed_9345(arg0, new sprijj(this));
    }

    @Override
    public String getSigAlgOID() {
        return this.cfr_renamed_1.cfr_renamed_89().cfr_renamed_593().cfr_renamed_19();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getTBSCertList() throws CRLException {
        try {
            return this.cfr_renamed_1.cfr_renamed_2134().cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new CRLException(iOException.toString());
        }
    }

    private /* synthetic */ Set cfr_renamed_2137() {
        HashSet<spronj> hashSet = new HashSet<spronj>();
        Enumeration enumeration = this.cfr_renamed_1.cfr_renamed_2135();
        sprnbm sprnbm2 = null;
        while (enumeration.hasMoreElements()) {
            sprrdm sprrdm2;
            sprpim sprpim2 = (sprpim)enumeration.nextElement();
            spronj spronj2 = new spronj(sprpim2, this.cfr_renamed_3, sprnbm2);
            hashSet.add(spronj2);
            if (!this.cfr_renamed_3 || !sprpim2.cfr_renamed_663() || (sprrdm2 = sprpim2.cfr_renamed_98().cfr_renamed_5024(sprrdm.cfr_renamed_119)) == null) continue;
            sprnbm2 = sprnbm.cfr_renamed_23(spraem.cfr_renamed_23(sprrdm2.cfr_renamed_372()).cfr_renamed_289()[0].cfr_renamed_313());
        }
        return hashSet;
    }

    @Override
    public Date getNextUpdate() {
        sprrcm sprrcm2 = this.cfr_renamed_1.cfr_renamed_2133();
        if (null == sprrcm2) {
            return null;
        }
        return sprrcm2.cfr_renamed_110();
    }

    public Set getCriticalExtensionOIDs() {
        return this.cfr_renamed_78(true);
    }

    @Override
    public X509CRLEntry getRevokedCertificate(BigInteger arg0) {
        Enumeration enumeration = this.cfr_renamed_1.cfr_renamed_2135();
        sprnbm sprnbm2 = null;
        while (enumeration.hasMoreElements()) {
            sprrdm sprrdm2;
            sprpim sprpim2 = (sprpim)enumeration.nextElement();
            if (sprpim2.cfr_renamed_2136().cfr_renamed_5103(arg0)) {
                return new spronj(sprpim2, this.cfr_renamed_3, sprnbm2);
            }
            if (!this.cfr_renamed_3 || !sprpim2.cfr_renamed_663() || (sprrdm2 = sprpim2.cfr_renamed_98().cfr_renamed_5024(sprrdm.cfr_renamed_119)) == null) continue;
            sprnbm2 = sprnbm.cfr_renamed_23(spraem.cfr_renamed_23(sprrdm2.cfr_renamed_372()).cfr_renamed_289()[0].cfr_renamed_313());
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void verify(PublicKey arg0, Provider arg1) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        try {
            this.cfr_renamed_9345(arg0, new sprxmj(this, arg1));
            return;
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprvnj.cfr_renamed_9("x^gZaHm^(E{_}I2\f")).append(noSuchProviderException.getMessage()).toString());
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
            throw new IllegalStateException(sprvzs.cfr_renamed_9("6\t;O!H0\u00066\u00071\ru\u0001&\u001b \r'H\u0011&"));
        }
    }

    @Override
    public byte[] getSigAlgParams() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprjpj(sprrr sprrr2, sprffm sprffm2, String string, byte[] byArray, boolean bl) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprjpj sprjpj2 = this;
        sprjpj sprjpj3 = this;
        this.cfr_renamed_2 = arg0;
        sprjpj3.cfr_renamed_1 = arg1;
        sprjpj3.cfr_renamed_0 = arg2;
        sprjpj2.cfr_renamed_4 = arg3;
        sprjpj2.cfr_renamed_3 = bl;
    }

    public Set getNonCriticalExtensionOIDs() {
        return this.cfr_renamed_78(false);
    }

    @Override
    public boolean hasUnsupportedCriticalExtension() {
        Set set = this.getCriticalExtensionOIDs();
        if (set == null) {
            return false;
        }
        Set set2 = set;
        set2.remove(sprrdm.cfr_renamed_96.cfr_renamed_19());
        set.remove(sprrdm.cfr_renamed_4.cfr_renamed_19());
        return !set2.isEmpty();
    }

    public static byte[] cfr_renamed_9344(sprffm arg0, String arg1) {
        sproug sproug2 = sprjpj.cfr_renamed_9346(arg0, arg1);
        if (null != sproug2) {
            return sproug2.cfr_renamed_186();
        }
        return null;
    }

    @Override
    public Date getThisUpdate() {
        return this.cfr_renamed_1.cfr_renamed_2132().cfr_renamed_110();
    }

    private /* synthetic */ Set cfr_renamed_78(boolean arg0) {
        sprhgm sprhgm2;
        if (this.getVersion() == 2 && (sprhgm2 = this.cfr_renamed_1.cfr_renamed_2134().cfr_renamed_98()) != null) {
            HashSet<String> hashSet = new HashSet<String>();
            Enumeration enumeration = sprhgm2.cfr_renamed_99();
            while (enumeration.hasMoreElements()) {
                sprlem sprlem2 = (sprlem)enumeration.nextElement();
                sprrdm sprrdm2 = sprhgm2.cfr_renamed_5024(sprlem2);
                if (arg0 != sprrdm2.cfr_renamed_101()) continue;
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
    private /* synthetic */ void cfr_renamed_9347(PublicKey arg0, Signature arg1, sprco arg2, byte[] arg3) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException {
        if (arg2 != null) {
            sprcrj.cfr_renamed_9056(arg1, arg2);
        }
        arg1.initVerify(arg0);
        try {
            BufferedOutputStream bufferedOutputStream;
            BufferedOutputStream bufferedOutputStream2 = bufferedOutputStream = new BufferedOutputStream(sprrxj.cfr_renamed_7467(arg1), 512);
            this.cfr_renamed_1.cfr_renamed_2134().cfr_renamed_8489(bufferedOutputStream2, "DER");
            ((OutputStream)bufferedOutputStream2).close();
        }
        catch (IOException iOException) {
            throw new CRLException(iOException.toString());
        }
        if (!arg1.verify(arg3)) {
            throw new SignatureException(sprvnj.cfr_renamed_9("oZ`(HgI{\ffC|\f~IzEnU([aX`\f{Yx\\dEmH(\\}NdEk\fcIq\u0002"));
        }
    }

    @Override
    public Principal getIssuerDN() {
        return new sprdzh(sprnbm.cfr_renamed_23(this.cfr_renamed_1.cfr_renamed_102().cfr_renamed_119()));
    }

    public Set getRevokedCertificates() {
        Set set = this.cfr_renamed_2137();
        if (!set.isEmpty()) {
            return Collections.unmodifiableSet(set);
        }
        return null;
    }

    @Override
    public byte[] getSignature() {
        return this.cfr_renamed_1.cfr_renamed_79().cfr_renamed_186();
    }

    @Override
    public String getSigAlgName() {
        return this.cfr_renamed_0;
    }

    public static sproug cfr_renamed_9346(sprffm arg0, String arg1) {
        sprhgm sprhgm2 = arg0.cfr_renamed_2134().cfr_renamed_98();
        if (null != sprhgm2) {
            sprrdm sprrdm2 = sprhgm2.cfr_renamed_5024(new sprlem(arg1));
            if (null != sprrdm2) {
                return sprrdm2.cfr_renamed_103();
            }
        }
        return null;
    }

    @Override
    public int getVersion() {
        return this.cfr_renamed_1.cfr_renamed_569();
    }

    @Override
    public String toString() {
        Object object;
        Object object2;
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        stringBuffer.append(sprvzs.cfr_renamed_9("HuHuHuHuHuHuHu>0\u001a&\u0001:\u0006oH")).append(this.getVersion()).append(string);
        stringBuffer.append(sprvnj.cfr_renamed_9("\f(\f(\f(\f(\f(\f(\fA_{Ym^Lb2\f")).append(this.getIssuerDN()).append(string);
        stringBuffer.append(sprvzs.cfr_renamed_9("HuHuHuHuHu<=\u0001&H \u00181\t!\roH")).append(this.getThisUpdate()).append(string);
        stringBuffer.append(sprvnj.cfr_renamed_9("\f(\f(\f(\f(\f(bmT|\f}\\lM|I2\f")).append(this.getNextUpdate()).append(string);
        stringBuffer.append(sprvzs.cfr_renamed_9("Hu;<\u000f;\t!\u001d'\ru)9\u000f:\u001a<\u001c=\u0005oH")).append(this.getSigAlgName()).append(string);
        sprjpj sprjpj2 = this;
        sprcrj.cfr_renamed_9339(sprjpj2.getSignature(), stringBuffer, string);
        sprhgm sprhgm2 = sprjpj2.cfr_renamed_1.cfr_renamed_2134().cfr_renamed_98();
        if (sprhgm2 != null) {
            object2 = sprhgm2.cfr_renamed_99();
            if (object2.hasMoreElements()) {
                stringBuffer.append(sprvnj.cfr_renamed_9("\f(\f(\f(\f(\f(\fMT|If_aCf_2\f")).append(string);
            }
            while (object2.hasMoreElements()) {
                object = (sprlem)object2.nextElement();
                sprrdm sprrdm2 = sprhgm2.cfr_renamed_5024((sprlem)object);
                if (sprrdm2.cfr_renamed_103() != null) {
                    byte[] byArray = sprrdm2.cfr_renamed_103().cfr_renamed_186();
                    sprrzm sprrzm2 = new sprrzm(byArray);
                    stringBuffer.append(sprvzs.cfr_renamed_9("uHuHuHuHuHuHuHuHuHuHuHu\u000b'\u0001!\u00016\t9@")).append(sprrdm2.cfr_renamed_101()).append(sprvnj.cfr_renamed_9("!\f"));
                    try {
                        if (((sprxgf)object).cfr_renamed_5078(sprrdm.cfr_renamed_128)) {
                            stringBuffer.append(new sprvzl(sprktm.cfr_renamed_23(sprrzm2.cfr_renamed_24()).cfr_renamed_162())).append(string);
                            continue;
                        }
                        if (((sprxgf)object).cfr_renamed_5078(sprrdm.cfr_renamed_4)) {
                            stringBuffer.append(new StringBuilder().insert(0, sprvzs.cfr_renamed_9("\u0017\t&\ru+\u0007$oH")).append(new sprvzl(sprktm.cfr_renamed_23(sprrzm2.cfr_renamed_24()).cfr_renamed_162())).toString()).append(string);
                            continue;
                        }
                        if (((sprxgf)object).cfr_renamed_5078(sprrdm.cfr_renamed_96)) {
                            stringBuffer.append(sprwzl.cfr_renamed_23(sprrzm2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        if (((sprxgf)object).cfr_renamed_5078(sprrdm.cfr_renamed_79)) {
                            stringBuffer.append(sprvcm.cfr_renamed_23(sprrzm2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        StringBuffer stringBuffer2 = stringBuffer;
                        if (((sprxgf)object).cfr_renamed_5078(sprrdm.cfr_renamed_957)) {
                            stringBuffer2.append(sprvcm.cfr_renamed_23(sprrzm2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        stringBuffer2.append(((sprlem)object).cfr_renamed_19());
                        stringBuffer.append(sprvnj.cfr_renamed_9("\f~MdYm\f5\f")).append(spregm.cfr_renamed_2138(sprrzm2.cfr_renamed_24())).append(string);
                    }
                    catch (Exception exception) {
                        stringBuffer.append(((sprlem)object).cfr_renamed_19());
                        stringBuffer.append(sprvzs.cfr_renamed_9("H#\t9\u001d0HhH")).append(sprvnj.cfr_renamed_9("\u0006\"\u0006\"\u0006")).append(string);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getExtensionValue(String arg0) {
        sproug sproug2 = sprjpj.cfr_renamed_9346(this.cfr_renamed_1, arg0);
        if (null == sproug2) {
            return null;
        }
        try {
            return sproug2.cfr_renamed_91();
        }
        catch (Exception exception) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprvzs.cfr_renamed_9("0\u001a'\u0007'H%\t'\u001b<\u00062H")).append(exception.toString()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_9345(PublicKey arg0, sprkp arg1) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException, NoSuchProviderException {
        int n;
        int n2;
        boolean bl;
        sprszm sprszm2;
        sprszm sprszm3;
        block21: {
            int n3;
            int n4;
            boolean bl2;
            sprszm sprszm4;
            sprszm sprszm5;
            List<PublicKey> list;
            if (!this.cfr_renamed_1.cfr_renamed_89().equals(this.cfr_renamed_1.cfr_renamed_2134().cfr_renamed_79())) {
                throw new CRLException(sprvnj.cfr_renamed_9("[EoBiX}^m\fi@oCzE|De\fgB(om^|EnEkM|IDE{X(HgI{\ffC|\feM|O`\f\\n[om^|`a_|\u0002"));
            }
            if (arg0 instanceof sprwbk && sprcrj.cfr_renamed_9338(this.cfr_renamed_1.cfr_renamed_89())) {
                list = ((sprwbk)arg0).cfr_renamed_7458();
                sprjpj sprjpj2 = this;
                sprszm5 = sprszm.cfr_renamed_23(sprjpj2.cfr_renamed_1.cfr_renamed_89().cfr_renamed_284());
                sprszm4 = sprszm.cfr_renamed_23(sprgbf.cfr_renamed_23(sprjpj2.cfr_renamed_1.cfr_renamed_79()).cfr_renamed_81());
                bl2 = false;
                n3 = n4 = 0;
            } else if (sprcrj.cfr_renamed_9338(this.cfr_renamed_1.cfr_renamed_89())) {
                sprjpj sprjpj3 = this;
                sprszm3 = sprszm.cfr_renamed_23(sprjpj3.cfr_renamed_1.cfr_renamed_89().cfr_renamed_284());
                sprszm2 = sprszm.cfr_renamed_23(sprgbf.cfr_renamed_23(sprjpj3.cfr_renamed_1.cfr_renamed_79()).cfr_renamed_81());
                bl = false;
                n = n2 = 0;
                break block21;
            } else {
                Signature signature = arg1.cfr_renamed_1539(this.getSigAlgName());
                if (this.cfr_renamed_4 == null) {
                    this.cfr_renamed_9347(arg0, signature, null, this.getSignature());
                    return;
                }
                try {
                    this.cfr_renamed_9347(arg0, signature, sprxgf.cfr_renamed_184(this.cfr_renamed_4), this.getSignature());
                    return;
                }
                catch (IOException iOException) {
                    throw new SignatureException(new StringBuilder().insert(0, sprvzs.cfr_renamed_9("6\t;\u0006:\u001cu\f0\u000b:\f0H&\u00012\u00064\u001c \u001a0H%\t'\t8\r!\r'\u001boH")).append(iOException.getMessage()).toString());
                }
            }
            while (n3 != list.size()) {
                if (list.get(n4) != null) {
                    SignatureException signatureException;
                    sprddm sprddm2 = sprddm.cfr_renamed_23(sprszm5.cfr_renamed_85(n4));
                    String string = sprcrj.cfr_renamed_9057(sprddm2);
                    Signature signature = arg1.cfr_renamed_1539(string);
                    SignatureException signatureException2 = null;
                    try {
                        this.cfr_renamed_9347(list.get(n4), signature, sprddm2.cfr_renamed_284(), sprgbf.cfr_renamed_23(sprszm4.cfr_renamed_85(n4)).cfr_renamed_81());
                        bl2 = true;
                        signatureException = signatureException2;
                    }
                    catch (SignatureException signatureException3) {
                        signatureException = signatureException2 = signatureException3;
                    }
                    if (signatureException != null) {
                        throw signatureException2;
                    }
                }
                n3 = ++n4;
            }
            if (bl2) return;
            throw new InvalidKeyException(sprvzs.cfr_renamed_9("\u0006:H8\t!\u000b=\u0001;\u000fu\u00030\u0011u\u000e:\u001d;\f"));
        }
        while (n != sprszm2.cfr_renamed_84()) {
            SignatureException signatureException;
            sprddm sprddm3 = sprddm.cfr_renamed_23(sprszm3.cfr_renamed_85(n2));
            String string = sprcrj.cfr_renamed_9057(sprddm3);
            SignatureException signatureException4 = null;
            try {
                Signature signature = arg1.cfr_renamed_1539(string);
                this.cfr_renamed_9347(arg0, signature, sprddm3.cfr_renamed_284(), sprgbf.cfr_renamed_23(sprszm2.cfr_renamed_85(n2)).cfr_renamed_81());
                bl = true;
                signatureException = signatureException4;
            }
            catch (InvalidKeyException invalidKeyException) {
                signatureException = signatureException4;
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                signatureException = signatureException4;
            }
            catch (SignatureException signatureException5) {
                signatureException = signatureException4 = signatureException5;
            }
            if (signatureException != null) {
                throw signatureException4;
            }
            n = ++n2;
        }
        if (bl) return;
        throw new InvalidKeyException(sprvnj.cfr_renamed_9("Bg\feM|O`EfK(GmU(JgYfH"));
    }

    @Override
    public void verify(PublicKey arg0, String arg1) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.cfr_renamed_9345(arg0, new sprxnj(this, arg1));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean isRevoked(Certificate arg0) {
        if (!arg0.getType().equals(sprvnj.cfr_renamed_9("t&\u00198\u0015"))) {
            throw new IllegalArgumentException(sprvzs.cfr_renamed_9("\rF`XlH\u0016:\u0019H \u001b0\fu\u001f<\u001c=H;\u0007;H\rF`XlH\u0016\r'\u001c"));
        }
        sprjpj sprjpj2 = this;
        Enumeration enumeration = sprjpj2.cfr_renamed_1.cfr_renamed_2135();
        sprnbm sprnbm2 = sprjpj2.cfr_renamed_1.cfr_renamed_102();
        if (!enumeration.hasMoreElements()) return false;
        BigInteger bigInteger = ((X509Certificate)arg0).getSerialNumber();
        while (enumeration.hasMoreElements()) {
            sprnbm sprnbm3;
            sprqqe sprqqe2;
            sprpim sprpim2 = sprpim.cfr_renamed_23(enumeration.nextElement());
            if (this.cfr_renamed_3 && sprpim2.cfr_renamed_663() && (sprqqe2 = sprpim2.cfr_renamed_98().cfr_renamed_5024(sprrdm.cfr_renamed_119)) != null) {
                sprnbm2 = sprnbm.cfr_renamed_23(spraem.cfr_renamed_23(sprqqe2.cfr_renamed_372()).cfr_renamed_289()[0].cfr_renamed_313());
            }
            if (!sprpim2.cfr_renamed_2136().cfr_renamed_5103(bigInteger)) continue;
            if (arg0 instanceof X509Certificate) {
                sprqqe2 = sprnbm.cfr_renamed_23(((X509Certificate)arg0).getIssuerX500Principal().getEncoded());
                sprnbm3 = sprnbm2;
                return sprnbm3.equals(sprqqe2);
            }
            try {
                sprqqe2 = sprndm.cfr_renamed_23(arg0.getEncoded()).cfr_renamed_102();
                sprnbm3 = sprnbm2;
                return sprnbm3.equals(sprqqe2);
            }
            catch (CertificateEncodingException certificateEncodingException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprvnj.cfr_renamed_9("KMfBgX(\\zCkI{_(Om^|EnEkM|I2\f")).append(certificateEncodingException.getMessage()).toString());
            }
        }
        return false;
    }
}

