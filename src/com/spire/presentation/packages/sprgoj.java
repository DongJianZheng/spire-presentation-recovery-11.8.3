/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbcm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcrj;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdmj;
import com.spire.presentation.packages.sprdzh;
import com.spire.presentation.packages.sprdzl;
import com.spire.presentation.packages.spregm;
import com.spire.presentation.packages.sprfam;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprjjj;
import com.spire.presentation.packages.sprkdm;
import com.spire.presentation.packages.sprkkm;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkp;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnqm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprow;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrxj;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtw;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprunm;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprvhf;
import com.spire.presentation.packages.sprvij;
import com.spire.presentation.packages.sprwbk;
import com.spire.presentation.packages.sprwyy;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxxda;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public abstract class sprgoj
extends X509Certificate
implements sprtw {
    public boolean[] cfr_renamed_91;
    public String cfr_renamed_0;
    public sprrr cfr_renamed_1;
    public sprbcm cfr_renamed_2;
    public byte[] cfr_renamed_3;
    public sprndm cfr_renamed_4;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean hasUnsupportedCriticalExtension() {
        sprhgm sprhgm2;
        if (this.getVersion() != 3 || (sprhgm2 = this.cfr_renamed_4.cfr_renamed_2151().cfr_renamed_98()) == null) return false;
        Enumeration enumeration = sprhgm2.cfr_renamed_99();
        block0: while (true) {
            Enumeration enumeration2 = enumeration;
            while (enumeration2.hasMoreElements()) {
                sprlem sprlem2 = (sprlem)enumeration.nextElement();
                if (sprlem2.cfr_renamed_5078(sprrdm.cfr_renamed_272) || sprlem2.cfr_renamed_5078(sprrdm.cfr_renamed_723) || sprlem2.cfr_renamed_5078(sprrdm.cfr_renamed_31) || sprlem2.cfr_renamed_5078(sprrdm.cfr_renamed_145) || sprlem2.cfr_renamed_5078(sprrdm.cfr_renamed_79) || sprlem2.cfr_renamed_5078(sprrdm.cfr_renamed_96) || sprlem2.cfr_renamed_5078(sprrdm.cfr_renamed_4) || sprlem2.cfr_renamed_5078(sprrdm.cfr_renamed_82) || sprlem2.cfr_renamed_5078(sprrdm.cfr_renamed_133) || sprlem2.cfr_renamed_5078(sprrdm.cfr_renamed_137)) continue block0;
                if (sprlem2.cfr_renamed_5078(sprrdm.spr\ufe34)) {
                    enumeration2 = enumeration;
                    continue;
                }
                if (sprhgm2.cfr_renamed_5024(sprlem2).cfr_renamed_101()) return true;
                continue block0;
            }
            break;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.cfr_renamed_4.cfr_renamed_2151().cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new CertificateEncodingException(iOException.toString());
        }
    }

    @Override
    public boolean[] getKeyUsage() {
        return sproze.cfr_renamed_5267(this.cfr_renamed_91);
    }

    public List getExtendedKeyUsage() throws CertificateParsingException {
        byte[] byArray = sprgoj.cfr_renamed_9349(this.cfr_renamed_4, "2.5.29.37");
        if (null == byArray) {
            return null;
        }
        try {
            int n;
            sprszm sprszm2 = sprszm.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray));
            ArrayList<String> arrayList = new ArrayList<String>();
            int n2 = n = 0;
            while (n2 != sprszm2.cfr_renamed_84()) {
                sprco sprco2 = sprszm2.cfr_renamed_85(n);
                arrayList.add(((sprlem)sprco2).cfr_renamed_19());
                n2 = ++n;
            }
            return Collections.unmodifiableList(arrayList);
        }
        catch (Exception exception) {
            throw new CertificateParsingException(sprwyy.cfr_renamed_9("F|QaQ.S|LmF}PgMi\u0003k[zF`GkG.HkZ.V}BiF.FvWkM}JaM"));
        }
    }

    @Override
    public void checkValidity(Date arg0) throws CertificateExpiredException, CertificateNotYetValidException {
        if (arg0.getTime() > this.getNotAfter().getTime()) {
            throw new CertificateExpiredException(new StringBuilder().insert(0, sprxxda.cfr_renamed_9("7\u0004&\u0015=\u0007=\u00025\u00151A1\u0019$\b&\u00040A;\u000ft")).append(this.cfr_renamed_4.cfr_renamed_2146().cfr_renamed_2147()).toString());
        }
        if (arg0.getTime() < this.getNotBefore().getTime()) {
            throw new CertificateNotYetValidException(new StringBuilder().insert(0, sprwyy.cfr_renamed_9("@kQzJhJmBzF.MaW.UoOgG.WgOb\u0003")).append(this.cfr_renamed_4.cfr_renamed_2148().cfr_renamed_2147()).toString());
        }
    }

    public Collection getIssuerAlternativeNames() throws CertificateParsingException {
        return sprgoj.cfr_renamed_9356(this.cfr_renamed_4, sprrdm.cfr_renamed_3.cfr_renamed_19());
    }

    @Override
    public sprnbm cfr_renamed_9122() {
        return this.cfr_renamed_4.cfr_renamed_1485();
    }

    @Override
    public final void verify(PublicKey arg0) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.cfr_renamed_9345(arg0, new sprdmj(this));
    }

    @Override
    public String getSigAlgOID() {
        return this.cfr_renamed_4.cfr_renamed_89().cfr_renamed_593().cfr_renamed_19();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_9345(PublicKey arg0, sprkp arg1) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException, NoSuchProviderException {
        int n;
        Signature signature;
        block22: {
            int n2;
            int n3;
            boolean bl;
            sprszm sprszm2;
            sprszm sprszm3;
            block21: {
                int n4;
                int n5;
                boolean bl2;
                sprszm sprszm4;
                sprszm sprszm5;
                List<PublicKey> list;
                block19: {
                    block20: {
                        block18: {
                            if (!(arg0 instanceof sprwbk) || !sprcrj.cfr_renamed_9338(this.cfr_renamed_4.cfr_renamed_89())) break block18;
                            list = ((sprwbk)arg0).cfr_renamed_7458();
                            sprgoj sprgoj2 = this;
                            sprszm5 = sprszm.cfr_renamed_23(sprgoj2.cfr_renamed_4.cfr_renamed_89().cfr_renamed_284());
                            sprszm4 = sprszm.cfr_renamed_23(sprgbf.cfr_renamed_23(sprgoj2.cfr_renamed_4.cfr_renamed_79()).cfr_renamed_81());
                            bl2 = false;
                            n4 = n5 = 0;
                            break block19;
                        }
                        if (!sprcrj.cfr_renamed_9338(this.cfr_renamed_4.cfr_renamed_89())) break block20;
                        sprgoj sprgoj3 = this;
                        sprszm3 = sprszm.cfr_renamed_23(sprgoj3.cfr_renamed_4.cfr_renamed_89().cfr_renamed_284());
                        sprszm2 = sprszm.cfr_renamed_23(sprgbf.cfr_renamed_23(sprgoj3.cfr_renamed_4.cfr_renamed_79()).cfr_renamed_81());
                        bl = false;
                        n2 = n3 = 0;
                        break block21;
                    }
                    String string = sprcrj.cfr_renamed_9057(this.cfr_renamed_4.cfr_renamed_89());
                    signature = arg1.cfr_renamed_1539(string);
                    if (!(arg0 instanceof sprwbk)) {
                        this.cfr_renamed_9347(arg0, signature, this.cfr_renamed_4.cfr_renamed_89().cfr_renamed_284(), this.getSignature());
                        return;
                    }
                    break block22;
                }
                while (n4 != list.size()) {
                    if (list.get(n5) != null) {
                        SignatureException signatureException;
                        sprddm sprddm2 = sprddm.cfr_renamed_23(sprszm5.cfr_renamed_85(n5));
                        String string = sprcrj.cfr_renamed_9057(sprddm2);
                        Signature signature2 = arg1.cfr_renamed_1539(string);
                        SignatureException signatureException2 = null;
                        try {
                            this.cfr_renamed_9347(list.get(n5), signature2, sprddm2.cfr_renamed_284(), sprgbf.cfr_renamed_23(sprszm4.cfr_renamed_85(n5)).cfr_renamed_81());
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
                    n4 = ++n5;
                }
                if (bl2) return;
                throw new InvalidKeyException(sprxxda.cfr_renamed_9(":\u000et\f5\u00157\t=\u000f3A?\u0004-A2\u000e!\u000f0"));
            }
            while (n2 != sprszm2.cfr_renamed_84()) {
                SignatureException signatureException;
                sprddm sprddm3 = sprddm.cfr_renamed_23(sprszm3.cfr_renamed_85(n3));
                String string = sprcrj.cfr_renamed_9057(sprddm3);
                SignatureException signatureException4 = null;
                try {
                    Signature signature3 = arg1.cfr_renamed_1539(string);
                    this.cfr_renamed_9347(arg0, signature3, sprddm3.cfr_renamed_284(), sprgbf.cfr_renamed_23(sprszm2.cfr_renamed_85(n3)).cfr_renamed_81());
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
                n2 = ++n3;
            }
            if (bl) return;
            throw new InvalidKeyException(sprwyy.cfr_renamed_9("Ma\u0003cBz@fJ`D.HkZ.EaV`G"));
        }
        List<PublicKey> list = ((sprwbk)arg0).cfr_renamed_7458();
        int n6 = n = 0;
        while (true) {
            if (n6 == list.size()) {
                throw new InvalidKeyException(sprxxda.cfr_renamed_9(":\u000et\f5\u00157\t=\u000f3A'\b3\u000f5\u0015!\u00131A2\u000e!\u000f0"));
            }
            try {
                this.cfr_renamed_9347(list.get(n), signature, this.cfr_renamed_4.cfr_renamed_89().cfr_renamed_284(), this.getSignature());
                return;
            }
            catch (InvalidKeyException invalidKeyException) {
                n6 = ++n;
                continue;
            }
            break;
        }
    }

    @Override
    public sprdzl cfr_renamed_9137() {
        return this.cfr_renamed_4.cfr_renamed_2151();
    }

    @Override
    public Date getNotBefore() {
        return this.cfr_renamed_4.cfr_renamed_2148().cfr_renamed_110();
    }

    public Collection getSubjectAlternativeNames() throws CertificateParsingException {
        return sprgoj.cfr_renamed_9356(this.cfr_renamed_4, sprrdm.cfr_renamed_137.cfr_renamed_19());
    }

    public static sproug cfr_renamed_9357(sprndm arg0, String arg1) {
        sprhgm sprhgm2 = arg0.cfr_renamed_2151().cfr_renamed_98();
        if (null != sprhgm2) {
            sprrdm sprrdm2 = sprhgm2.cfr_renamed_5024(new sprlem(arg1));
            if (null != sprrdm2) {
                return sprrdm2.cfr_renamed_103();
            }
        }
        return null;
    }

    @Override
    public final void verify(PublicKey arg0, String arg1) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.cfr_renamed_9345(arg0, new sprvij(this, arg1));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public X500Principal getIssuerX500Principal() {
        try {
            byte[] byArray = this.cfr_renamed_4.cfr_renamed_102().cfr_renamed_104("DER");
            return new X500Principal(byArray);
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprwyy.cfr_renamed_9("mB`\u0004z\u0003kMmLjF.J}P{F|\u0003Jm"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Collection cfr_renamed_9356(sprndm arg0, String arg1) throws CertificateParsingException {
        byte[] byArray = sprgoj.cfr_renamed_9349(arg0, arg1);
        if (byArray == null) {
            return null;
        }
        try {
            Enumeration enumeration;
            ArrayList arrayList = new ArrayList();
            Enumeration enumeration2 = enumeration = sprszm.cfr_renamed_23(byArray).cfr_renamed_329();
            block11: while (enumeration2.hasMoreElements()) {
                ArrayList arrayList2;
                sprigm sprigm2 = sprigm.cfr_renamed_23(enumeration.nextElement());
                ArrayList<Object> arrayList3 = new ArrayList<Object>();
                sprigm sprigm3 = sprigm2;
                arrayList3.add(spruaf.cfr_renamed_279(sprigm3.cfr_renamed_312()));
                switch (sprigm3.cfr_renamed_312()) {
                    case 0: 
                    case 3: 
                    case 5: {
                        arrayList3.add(sprigm2.cfr_renamed_91());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 4: {
                        arrayList3.add(sprnbm.cfr_renamed_9063(sprkdm.cfr_renamed_952, sprigm2.cfr_renamed_313()).toString());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 6: {
                        arrayList3.add(((sprml)((Object)sprigm2.cfr_renamed_313())).cfr_renamed_314());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 8: {
                        arrayList3.add(sprlem.cfr_renamed_23(sprigm2.cfr_renamed_313()).cfr_renamed_19());
                        arrayList2 = arrayList;
                        break;
                    }
                    case 7: {
                        String string;
                        byte[] byArray2 = sprfvg.cfr_renamed_23(sprigm2.cfr_renamed_313()).cfr_renamed_186();
                        try {
                            string = InetAddress.getByAddress(byArray2).getHostAddress();
                        }
                        catch (UnknownHostException unknownHostException) {
                            enumeration2 = enumeration;
                            continue block11;
                        }
                        arrayList3.add(string);
                        arrayList2 = arrayList;
                        break;
                    }
                    default: {
                        throw new IOException(new StringBuilder().insert(0, sprxxda.cfr_renamed_9("#5\u0005t\u00155\u0006t\u000f!\f6\u0004&[t")).append(sprigm2.cfr_renamed_312()).toString());
                    }
                }
                arrayList2.add(Collections.unmodifiableList(arrayList3));
                enumeration2 = enumeration;
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return Collections.unmodifiableCollection(arrayList);
        }
        catch (Exception exception) {
            throw new CertificateParsingException(exception.getMessage());
        }
    }

    @Override
    public String getSigAlgName() {
        return this.cfr_renamed_0;
    }

    private /* synthetic */ boolean cfr_renamed_9062(sprddm arg0, sprddm arg1) {
        if (!arg0.cfr_renamed_593().cfr_renamed_5078(arg1.cfr_renamed_593())) {
            return false;
        }
        if (sprjcf.cfr_renamed_5159(sprwyy.cfr_renamed_9("@aN P~J|F S}NaGkO Pk@{QgWw\rv\u0016>\u001a BbOaTQBlPkMz|kR{Jx|@vBo"))) {
            if (arg0.cfr_renamed_284() == null) {
                return arg1.cfr_renamed_284() == null || arg1.cfr_renamed_284().equals(sprpen.cfr_renamed_4);
            }
            if (arg1.cfr_renamed_284() == null) {
                return arg0.cfr_renamed_284() == null || arg0.cfr_renamed_284().equals(sprpen.cfr_renamed_4);
            }
        }
        if (arg0.cfr_renamed_284() != null) {
            return arg0.cfr_renamed_284().equals(arg1.cfr_renamed_284());
        }
        if (arg1.cfr_renamed_284() != null) {
            return arg1.cfr_renamed_284().equals(arg0.cfr_renamed_284());
        }
        return true;
    }

    @Override
    public boolean[] getSubjectUniqueID() {
        sprgbf sprgbf2 = this.cfr_renamed_4.cfr_renamed_2151().cfr_renamed_2156();
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

    /*
     * WARNING - void declaration
     */
    public sprgoj(sprrr sprrr2, sprndm sprndm2, sprbcm sprbcm2, boolean[] blArray, String string, byte[] byArray) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprgoj sprgoj2 = this;
        sprgoj sprgoj3 = this;
        sprgoj sprgoj4 = this;
        sprgoj4.cfr_renamed_1 = arg0;
        sprgoj4.cfr_renamed_4 = arg1;
        sprgoj3.cfr_renamed_2 = arg2;
        sprgoj3.cfr_renamed_91 = arg3;
        sprgoj2.cfr_renamed_0 = arg4;
        sprgoj2.cfr_renamed_3 = byArray;
    }

    public static byte[] cfr_renamed_9349(sprndm arg0, String arg1) {
        sproug sproug2 = sprgoj.cfr_renamed_9357(arg0, arg1);
        if (null != sproug2) {
            return sproug2.cfr_renamed_186();
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        stringBuffer.append(sprxxda.cfr_renamed_9("tA\u000fQ\tAtAtAtAtA\u0002\u0004&\u0012=\u000e:[t")).append(this.getVersion()).append(string);
        stringBuffer.append(sprwyy.cfr_renamed_9("\u0003.\u0003.\u0003.\u0003.\u0003]F|JoO@VcAkQ4\u0003")).append(this.getSerialNumber()).append(string);
        stringBuffer.append(sprxxda.cfr_renamed_9("tAtAtAtAtAtAt('\u0012!\u0004&%\u001a[t")).append(this.getIssuerDN()).append(string);
        stringBuffer.append(sprwyy.cfr_renamed_9("\u0003.\u0003.\u0003.\u0003.\u0003.\u0003]WoQz\u0003JBzF4\u0003")).append(this.getNotBefore()).append(string);
        stringBuffer.append(sprxxda.cfr_renamed_9("tAtAtAtAtAt'=\u000f5\rt%5\u00151[t")).append(this.getNotAfter()).append(string);
        stringBuffer.append(sprwyy.cfr_renamed_9("\u0003.\u0003.\u0003.\u0003.\u0003.\u0003.p{AdFmWJm4\u0003")).append(this.getSubjectDN()).append(string);
        stringBuffer.append(sprxxda.cfr_renamed_9("tAtAtAtAtAt1!\u00038\b7A\u001f\u0004-[t")).append(this.getPublicKey()).append(string);
        stringBuffer.append(sprwyy.cfr_renamed_9("\u0003.pgD`BzV|F.bbDaQgWfN4\u0003")).append(this.getSigAlgName()).append(string);
        sprgoj sprgoj2 = this;
        sprcrj.cfr_renamed_9339(sprgoj2.getSignature(), stringBuffer, string);
        sprhgm sprhgm2 = sprgoj2.cfr_renamed_4.cfr_renamed_2151().cfr_renamed_98();
        if (sprhgm2 != null) {
            Enumeration enumeration = sprhgm2.cfr_renamed_99();
            if (enumeration.hasMoreElements()) {
                stringBuffer.append(sprxxda.cfr_renamed_9("AtAtAtA\u0011\u0019 \u0004:\u0012=\u000e:\u0012nA^"));
            }
            while (enumeration.hasMoreElements()) {
                sprlem sprlem2 = (sprlem)enumeration.nextElement();
                sprrdm sprrdm2 = sprhgm2.cfr_renamed_5024(sprlem2);
                if (sprrdm2.cfr_renamed_103() != null) {
                    byte[] byArray = sprrdm2.cfr_renamed_103().cfr_renamed_186();
                    sprrzm sprrzm2 = new sprrzm(byArray);
                    stringBuffer.append(sprwyy.cfr_renamed_9(".\u0003.\u0003.\u0003.\u0003.\u0003.\u0003.\u0003.\u0003.\u0003.\u0003.\u0003.@|JzJmBb\u000b")).append(sprrdm2.cfr_renamed_101()).append(sprxxda.cfr_renamed_9("Ht"));
                    try {
                        if (sprlem2.cfr_renamed_5078(sprrdm.cfr_renamed_133)) {
                            stringBuffer.append(sprbcm.cfr_renamed_23(sprrzm2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        if (sprlem2.cfr_renamed_5078(sprrdm.cfr_renamed_272)) {
                            stringBuffer.append(sprfam.cfr_renamed_23(sprrzm2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        if (sprlem2.cfr_renamed_5078(sprow.cfr_renamed_114)) {
                            stringBuffer.append(new sprunm(sprgbf.cfr_renamed_23(sprrzm2.cfr_renamed_24()))).append(string);
                            continue;
                        }
                        if (sprlem2.cfr_renamed_5078(sprow.cfr_renamed_951)) {
                            stringBuffer.append(new sprnqm(sprupm.cfr_renamed_23(sprrzm2.cfr_renamed_24()))).append(string);
                            continue;
                        }
                        StringBuffer stringBuffer2 = stringBuffer;
                        if (sprlem2.cfr_renamed_5078(sprow.cfr_renamed_31)) {
                            stringBuffer2.append(new sprkkm(sprupm.cfr_renamed_23(sprrzm2.cfr_renamed_24()))).append(string);
                            continue;
                        }
                        stringBuffer2.append(sprlem2.cfr_renamed_19());
                        stringBuffer.append(sprwyy.cfr_renamed_9("\u0003xBbVk\u00033\u0003")).append(spregm.cfr_renamed_2138(sprrzm2.cfr_renamed_24())).append(string);
                    }
                    catch (Exception exception) {
                        stringBuffer.append(sprlem2.cfr_renamed_19());
                        stringBuffer.append(sprxxda.cfr_renamed_9("t\u00175\r!\u0004t\\t")).append(sprwyy.cfr_renamed_9("\t$\t$\t")).append(string);
                    }
                    continue;
                }
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
    public final void verify(PublicKey arg0, Provider arg1) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        try {
            this.cfr_renamed_9345(arg0, new sprjjj(this, arg1));
            return;
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprxxda.cfr_renamed_9("\u0011&\u000e\"\b0\u0004&A=\u0012'\u00141[t")).append(noSuchProviderException.getMessage()).toString());
        }
    }

    @Override
    public byte[] getSigAlgParams() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    @Override
    public sprnbm cfr_renamed_9118() {
        return this.cfr_renamed_4.cfr_renamed_102();
    }

    @Override
    public BigInteger getSerialNumber() {
        return this.cfr_renamed_4.cfr_renamed_114().cfr_renamed_97();
    }

    @Override
    public boolean[] getIssuerUniqueID() {
        sprgbf sprgbf2 = this.cfr_renamed_4.cfr_renamed_2151().cfr_renamed_2153();
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

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_9347(PublicKey publicKey, Signature signature, sprco sprco2, byte[] byArray) throws CertificateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        void arg3;
        void arg0;
        void arg2;
        void arg1;
        sprgoj sprgoj2 = this;
        if (!sprgoj2.cfr_renamed_9062(this.cfr_renamed_4.cfr_renamed_89(), sprgoj2.cfr_renamed_4.cfr_renamed_2151().cfr_renamed_79())) {
            throw new CertificateException(sprwyy.cfr_renamed_9("}JiMoW{Qk\u0003oOiL|JzKc\u0003gM.wLp.@kQz\u0003`Lz\u0003}BcF.B}\u0003aVzF|\u0003mF|W"));
        }
        sprcrj.cfr_renamed_9056((Signature)arg1, (sprco)arg2);
        arg1.initVerify((PublicKey)arg0);
        try {
            BufferedOutputStream bufferedOutputStream;
            BufferedOutputStream bufferedOutputStream2 = bufferedOutputStream = new BufferedOutputStream(sprrxj.cfr_renamed_7467((Signature)arg1), 512);
            this.cfr_renamed_4.cfr_renamed_2151().cfr_renamed_8489(bufferedOutputStream2, "DER");
            ((OutputStream)bufferedOutputStream2).close();
        }
        catch (IOException iOException) {
            throw new CertificateEncodingException(iOException.toString());
        }
        if (!arg1.verify((byte[])arg3)) {
            throw new SignatureException(sprxxda.cfr_renamed_9("7\u0004&\u0015=\u0007=\u00025\u00151A0\u000e1\u0012t\u000f;\u0015t\u00171\u0013=\u0007-A#\b \tt\u0012!\u0011$\r=\u00040A?\u0004-"));
        }
    }

    @Override
    public int getBasicConstraints() {
        if (this.cfr_renamed_2 == null || !this.cfr_renamed_2.cfr_renamed_296()) {
            return -1;
        }
        sprktm sprktm2 = this.cfr_renamed_2.cfr_renamed_5086();
        if (sprktm2 == null) {
            return Integer.MAX_VALUE;
        }
        return sprktm2.cfr_renamed_5087();
    }

    @Override
    public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        this.checkValidity(new Date());
    }

    @Override
    public Principal getSubjectDN() {
        return new sprdzh(this.cfr_renamed_4.cfr_renamed_1485());
    }

    public Set getCriticalExtensionOIDs() {
        if (this.getVersion() == 3) {
            HashSet<String> hashSet = new HashSet<String>();
            sprhgm sprhgm2 = this.cfr_renamed_4.cfr_renamed_2151().cfr_renamed_98();
            if (sprhgm2 != null) {
                Enumeration enumeration = sprhgm2.cfr_renamed_99();
                while (enumeration.hasMoreElements()) {
                    sprlem sprlem2 = (sprlem)enumeration.nextElement();
                    if (!sprhgm2.cfr_renamed_5024(sprlem2).cfr_renamed_101()) continue;
                    hashSet.add(sprlem2.cfr_renamed_19());
                }
                return hashSet;
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public X500Principal getSubjectX500Principal() {
        try {
            byte[] byArray = this.cfr_renamed_4.cfr_renamed_1485().cfr_renamed_104("DER");
            return new X500Principal(byArray);
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprwyy.cfr_renamed_9("@oM)W.F`@aGk\u0003}VlIk@z\u0003Jm"));
        }
    }

    @Override
    public int getVersion() {
        return this.cfr_renamed_4.cfr_renamed_569();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PublicKey getPublicKey() {
        try {
            return sprsci.cfr_renamed_5726(this.cfr_renamed_4.cfr_renamed_1489());
        }
        catch (IOException iOException) {
            throw sprvhf.cfr_renamed_5211(new StringBuilder().insert(0, sprxxda.cfr_renamed_9("\u00075\b8\u00040A \u000et\u00131\u0002;\u00171\u0013t\u0011!\u00038\b7A?\u0004-[t")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public Set getNonCriticalExtensionOIDs() {
        if (this.getVersion() == 3) {
            HashSet<String> hashSet = new HashSet<String>();
            sprhgm sprhgm2 = this.cfr_renamed_4.cfr_renamed_2151().cfr_renamed_98();
            if (sprhgm2 != null) {
                Enumeration enumeration = sprhgm2.cfr_renamed_99();
                while (enumeration.hasMoreElements()) {
                    sprlem sprlem2 = (sprlem)enumeration.nextElement();
                    if (sprhgm2.cfr_renamed_5024(sprlem2).cfr_renamed_101()) continue;
                    hashSet.add(sprlem2.cfr_renamed_19());
                }
                return hashSet;
            }
        }
        return null;
    }

    @Override
    public Principal getIssuerDN() {
        return new sprdzh(this.cfr_renamed_4.cfr_renamed_102());
    }

    @Override
    public Date getNotAfter() {
        return this.cfr_renamed_4.cfr_renamed_2146().cfr_renamed_110();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getExtensionValue(String arg0) {
        sproug sproug2 = sprgoj.cfr_renamed_9357(this.cfr_renamed_4, arg0);
        if (null == sproug2) {
            return null;
        }
        try {
            return sproug2.cfr_renamed_91();
        }
        catch (Exception exception) {
            throw sprvhf.cfr_renamed_5211(new StringBuilder().insert(0, sprwyy.cfr_renamed_9("kQ|L|\u0003~B|PgMi\u0003")).append(exception.getMessage()).toString(), exception);
        }
    }

    @Override
    public byte[] getSignature() {
        return this.cfr_renamed_4.cfr_renamed_79().cfr_renamed_186();
    }
}

