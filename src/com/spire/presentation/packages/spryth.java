/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spranj;
import com.spire.presentation.packages.sprbjy;
import com.spire.presentation.packages.sprgai;
import com.spire.presentation.packages.sprgv;
import com.spire.presentation.packages.spritj;
import com.spire.presentation.packages.sprivj;
import com.spire.presentation.packages.sprlhi;
import com.spire.presentation.packages.sprmdk;
import com.spire.presentation.packages.sprnve;
import com.spire.presentation.packages.sprpre;
import com.spire.presentation.packages.sprpsh;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprvxja;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class spryth
extends CertPathBuilderSpi {
    private Exception cfr_renamed_3;
    private final boolean cfr_renamed_4;

    public spryth() {
        this(false);
    }

    public spryth(boolean bl) {
        this.cfr_renamed_4 = bl;
    }

    @Override
    public CertPathBuilderResult engineBuild(CertPathParameters arg0) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        sprivj sprivj2;
        Object object;
        Object object2;
        Cloneable cloneable;
        Object object3;
        if (arg0 instanceof PKIXBuilderParameters) {
            Object object4;
            object3 = new sprmdk((PKIXBuilderParameters)arg0);
            if (arg0 instanceof sprpre) {
                cloneable = (sprnve)arg0;
                Object object5 = object2 = ((sprpre)cloneable).cfr_renamed_377().iterator();
                while (object5.hasNext()) {
                    ((sprmdk)object3).cfr_renamed_9143((sprgv)object2.next());
                    object5 = object2;
                }
                Object object6 = object = new spritj(((sprmdk)object3).cfr_renamed_1451());
                ((spritj)object).cfr_renamed_9144(((sprnve)cloneable).cfr_renamed_399());
                object4 = object6;
                ((spritj)object6).cfr_renamed_400(((sprnve)cloneable).cfr_renamed_401());
            } else {
                object4 = object = new spritj((PKIXBuilderParameters)arg0);
            }
            sprivj2 = ((spritj)object4).cfr_renamed_1451();
        } else if (arg0 instanceof sprivj) {
            sprivj2 = (sprivj)arg0;
        } else {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprbjy.cfr_renamed_9("j,H,W(N(H>\u001a O>NmX(\u001a,TmS#I9[#Y(\u001a\"\\m")).append(PKIXBuilderParameters.class.getName()).append(sprvxja.cfr_renamed_9("1ac.")).append(sprivj.class.getName()).append(".").toString());
        }
        cloneable = new ArrayList();
        object3 = sprgai.cfr_renamed_9145(sprivj2);
        CertPathBuilderResult certPathBuilderResult = null;
        Object object7 = object = object3.iterator();
        while (object7.hasNext() && certPathBuilderResult == null) {
            object2 = (X509Certificate)object.next();
            certPathBuilderResult = this.cfr_renamed_9138((X509Certificate)object2, sprivj2, (List)((Object)cloneable));
            object7 = object;
        }
        if (certPathBuilderResult == null && this.cfr_renamed_3 != null) {
            if (this.cfr_renamed_3 instanceof sprlhi) {
                throw new CertPathBuilderException(this.cfr_renamed_3.getMessage(), this.cfr_renamed_3.getCause());
            }
            throw new CertPathBuilderException(sprbjy.cfr_renamed_9("j\"I>S/V(\u001a._?N$\\$Y,N(\u001a.R,S#\u001a.U8V)\u001a#U9\u001a/_mL,V$^,N(^c"), this.cfr_renamed_3);
        }
        if (certPathBuilderResult == null && this.cfr_renamed_3 == null) {
            throw new CertPathBuilderException(sprvxja.cfr_renamed_9("[\u007fosbt.ea1hx`u.rkczxhxmpzt.rfpg\u007f "));
        }
        return certPathBuilderResult;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 1;
        int cfr_ignored_0 = 5 << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = 3 << 3 ^ 4;
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

    public CertPathBuilderResult cfr_renamed_9138(X509Certificate arg0, sprivj arg1, List arg2) {
        sprpsh sprpsh2;
        spranj spranj2;
        if (arg2.contains(arg0)) {
            return null;
        }
        if (arg1.cfr_renamed_399().contains(arg0)) {
            return null;
        }
        if (arg1.cfr_renamed_401() != -1 && arg2.size() - 1 > arg1.cfr_renamed_401()) {
            return null;
        }
        arg2.add(arg0);
        CertPathBuilderResult certPathBuilderResult = null;
        try {
            spranj2 = new spranj();
            sprpsh2 = new sprpsh(this.cfr_renamed_4);
        }
        catch (Exception exception) {
            throw new RuntimeException(sprbjy.cfr_renamed_9("\bB._=N$U#\u001a.H([9S#]mI8J=U?NmY![>I(Ic"));
        }
        {
            if (sprgai.cfr_renamed_9139(arg0, arg1.cfr_renamed_9128().cfr_renamed_9129(), arg1.cfr_renamed_9128().cfr_renamed_9097())) {
                CertPath certPath = null;
                PKIXCertPathValidatorResult pKIXCertPathValidatorResult = null;
                try {
                    certPath = spranj2.engineGenerateCertPath(arg2);
                }
                catch (Exception exception) {
                    throw new sprlhi(sprvxja.cfr_renamed_9("Rkczxhxmpzxa\u007f.aoef1m~{}j1`~z1lt.ra\u007f}e|dmeku.w|~c1mt|egwgroek1bx}e "), exception);
                }
                {
                    pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult)sprpsh2.engineValidate(certPath, arg1);
                }
                return new PKIXCertPathBuilderResult(certPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
            }
            ArrayList<sprgv> arrayList = new ArrayList<sprgv>();
            arrayList.addAll(arg1.cfr_renamed_9128().cfr_renamed_7309());
            try {
                arrayList.addAll(sprgai.cfr_renamed_9140(arg0.getExtensionValue(sprrdm.cfr_renamed_3.cfr_renamed_19()), arg1.cfr_renamed_9128().cfr_renamed_9141()));
            }
            catch (CertificateParsingException certificateParsingException) {
                throw new sprlhi(sprvxja.cfr_renamed_9("@~.pjugeg~`pb1V?;!71}eackb.ro\u007f.sk1oujtj1hca|.rkczxhxmpzt.}aroeg~`b "), certificateParsingException);
            }
            HashSet hashSet = new HashSet();
            try {
                hashSet.addAll(sprgai.cfr_renamed_9142(arg0, arg1.cfr_renamed_9128().cfr_renamed_2283(), arrayList));
            }
            catch (sprlhi sprlhi2) {
                throw new sprlhi(sprbjy.cfr_renamed_9("\u000e[#T\"Nm\\$T)\u001a$I>O(HmY(H9S+S.[9_m\\\"HmY(H9S+S.[9_mS#\u001a._?N$\\$Y,N$U#\u001a=[9Rc"), sprlhi2);
            }
            if (hashSet.isEmpty()) {
                throw new sprlhi(sprvxja.cfr_renamed_9("_a1gb}dkc.rkczxhxmpzt.wac.rkczxhxmpzt.x`1mt|egwgroeg~`1~pzy.wad`u "));
            }
            Iterator iterator = hashSet.iterator();
            while (iterator.hasNext() && certPathBuilderResult == null) {
                X509Certificate x509Certificate = (X509Certificate)iterator.next();
                certPathBuilderResult = this.cfr_renamed_9138(x509Certificate, arg1, arg2);
            }
        }
        if (certPathBuilderResult == null) {
            arg2.remove(arg0);
        }
        return certPathBuilderResult;
    }
}

