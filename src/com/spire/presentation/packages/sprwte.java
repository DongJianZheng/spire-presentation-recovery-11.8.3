/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprbcm;
import com.spire.presentation.packages.sprbre;
import com.spire.presentation.packages.sprbrh;
import com.spire.presentation.packages.sprckk;
import com.spire.presentation.packages.sprdcm;
import com.spire.presentation.packages.spream;
import com.spire.presentation.packages.spredm;
import com.spire.presentation.packages.sprerh;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprhhm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprixh;
import com.spire.presentation.packages.sprjgm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlhi;
import com.spire.presentation.packages.sprmle;
import com.spire.presentation.packages.sprmye;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprokk;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpxo;
import com.spire.presentation.packages.sprqdm;
import com.spire.presentation.packages.sprqvg;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrme;
import com.spire.presentation.packages.sprrzl;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprsem;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprufm;
import com.spire.presentation.packages.sprule;
import com.spire.presentation.packages.sprulk;
import com.spire.presentation.packages.sprupm;
import com.spire.presentation.packages.sprvcm;
import com.spire.presentation.packages.sprwek;
import com.spire.presentation.packages.sprwhk;
import com.spire.presentation.packages.sprwzl;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxvc;
import com.spire.presentation.packages.sprygm;
import com.spire.presentation.packages.sprzne;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;

public class sprwte
extends sprmle {
    public List[] cfr_renamed_185;
    public TrustAnchor spr\ufe34;
    public PublicKey cfr_renamed_82;
    private static final String cfr_renamed_126;
    public Date cfr_renamed_88;
    public CertPath cfr_renamed_31;
    public PolicyNode cfr_renamed_272;
    public int cfr_renamed_145;
    public PKIXParameters cfr_renamed_114;
    private boolean cfr_renamed_96;
    public Date cfr_renamed_105;
    public List cfr_renamed_137;
    private static final String cfr_renamed_79;
    public List[] cfr_renamed_119;
    private static final String cfr_renamed_91 = "com.spire.psmodel.security.x509.CertPathReviewerMessages";
    private static final String cfr_renamed_1;

    public Vector cfr_renamed_5064(sprvcm arg0) {
        Vector<String> vector = new Vector<String>();
        if (arg0 != null) {
            int n;
            sprjgm[] sprjgmArray = arg0.cfr_renamed_322();
            int n2 = n = 0;
            while (n2 < sprjgmArray.length) {
                sprhhm sprhhm2 = sprjgmArray[n].cfr_renamed_323();
                if (sprhhm2.cfr_renamed_324() == 0) {
                    int n3;
                    sprigm[] sprigmArray = spraem.cfr_renamed_23(sprhhm2.cfr_renamed_313()).cfr_renamed_289();
                    int n4 = n3 = 0;
                    while (n4 < sprigmArray.length) {
                        if (sprigmArray[n3].cfr_renamed_312() == 6) {
                            String string = ((sprupm)sprigmArray[n3].cfr_renamed_313()).cfr_renamed_314();
                            vector.add(string);
                        }
                        n4 = ++n3;
                    }
                }
                n2 = ++n;
            }
        }
        return vector;
    }

    public void cfr_renamed_5065(sprulk arg0, int arg1) {
        if (arg1 < -1 || arg1 >= this.cfr_renamed_145) {
            throw new IndexOutOfBoundsException();
        }
        this.cfr_renamed_185[arg1 + 1].add(arg0);
    }

    public TrustAnchor cfr_renamed_352() {
        sprwte sprwte2 = this;
        sprwte2.cfr_renamed_317();
        return sprwte2.spr\ufe34;
    }

    public PolicyNode cfr_renamed_354() {
        sprwte sprwte2 = this;
        sprwte2.cfr_renamed_317();
        return sprwte2.cfr_renamed_272;
    }

    public void cfr_renamed_317() {
        if (!this.cfr_renamed_96) {
            throw new IllegalStateException(sprpxo.cfr_renamed_9("+z\u000e}\u0007lDv\u000blDq\nq\u0010q\u0005t\rb\u0001|J8'y\btDq\nq\u00100M8\u0002q\u0016k\u00106"));
        }
        if (this.cfr_renamed_185 == null) {
            int n;
            this.cfr_renamed_185 = new List[this.cfr_renamed_145 + 1];
            this.cfr_renamed_119 = new List[this.cfr_renamed_145 + 1];
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_185.length) {
                sprwte sprwte2 = this;
                sprwte2.cfr_renamed_185[n] = new ArrayList();
                sprwte2.cfr_renamed_119[n++] = new ArrayList();
                n2 = n;
            }
            sprwte sprwte3 = this;
            sprwte3.cfr_renamed_276();
            sprwte3.cfr_renamed_343();
            sprwte3.cfr_renamed_298();
            sprwte3.cfr_renamed_328();
            sprwte3.cfr_renamed_318();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_343() {
        X509Certificate x509Certificate = null;
        sprerh sprerh2 = new sprerh();
        try {
            for (int i = this.cfr_renamed_137.size() - 1; i > 0; --i) {
                int n;
                Object object;
                sprsem[] sprsemArray;
                Object object2;
                Object object3;
                sprwte sprwte2 = this;
                int n2 = sprwte2.cfr_renamed_145 - i;
                x509Certificate = (X509Certificate)sprwte2.cfr_renamed_137.get(i);
                if (!sprwte.cfr_renamed_286(x509Certificate)) {
                    object3 = sprwte.cfr_renamed_282(x509Certificate);
                    object2 = new sprrzm(new ByteArrayInputStream(((X500Principal)object3).getEncoded()));
                    try {
                        sprsemArray = (sprszm)((sprrzm)object2).cfr_renamed_24();
                    }
                    catch (IOException iOException) {
                        Object[] objectArray = new Object[1];
                        objectArray[0] = new sprwhk(object3);
                        sprulk sprulk2 = new sprulk(cfr_renamed_91, sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#1?|\u0002j3u4|%Q0r4Z#m>m"), objectArray);
                        throw new sprbre(sprulk2, (Throwable)iOException, this.cfr_renamed_31, i);
                    }
                    {
                        sprerh2.cfr_renamed_5066((sprszm)sprsemArray);
                    }
                    {
                        sprerh2.cfr_renamed_5067((sprszm)sprsemArray);
                    }
                    {
                        object = (sprszm)sprwte.cfr_renamed_292(x509Certificate, cfr_renamed_2);
                    }
                    if (object != null) {
                        int n3 = n = 0;
                        while (n3 < ((sprszm)object).cfr_renamed_84()) {
                            sprigm sprigm2 = sprigm.cfr_renamed_23(((sprszm)object).cfr_renamed_85(n));
                            try {
                                sprerh sprerh3 = sprerh2;
                                sprigm sprigm3 = sprigm2;
                                sprerh3.cfr_renamed_5068(sprigm3);
                                sprerh3.cfr_renamed_5069(sprigm3);
                            }
                            catch (sprixh sprixh2) {
                                Object[] objectArray = new Object[1];
                                objectArray[0] = new sprwhk(sprigm2);
                                sprulk sprulk3 = new sprulk(cfr_renamed_91, sprxvc.cfr_renamed_9("\u0012z#k\u0001~%w\u0003z'v4h4m\u007fq>k\u0001z#r8k%z5Z<~8s"), objectArray);
                                throw new sprbre(sprulk3, (Throwable)sprixh2, this.cfr_renamed_31, i);
                            }
                            n3 = ++n;
                        }
                    }
                }
                try {
                    object3 = (sprszm)sprwte.cfr_renamed_292(x509Certificate, cfr_renamed_4);
                }
                catch (sprlhi sprlhi2) {
                    sprsemArray = new sprulk(cfr_renamed_91, sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\n{!`\u0010]\u0016j\u000bj"));
                    throw new sprbre((sprulk)sprsemArray, (Throwable)sprlhi2, this.cfr_renamed_31, i);
                }
                if (object3 == null) continue;
                object2 = sprygm.cfr_renamed_23(object3);
                sprsemArray = ((sprygm)object2).cfr_renamed_348();
                if (sprsemArray != null) {
                    sprerh2.cfr_renamed_5070(sprsemArray);
                }
                if ((object = ((sprygm)object2).cfr_renamed_350()) == null) continue;
                int n4 = n = 0;
                while (n4 != ((sprsem[])object).length) {
                    sprerh2.cfr_renamed_5071(object[n++]);
                    n4 = n;
                }
            }
            return;
        }
        catch (sprbre sprbre2) {
            this.cfr_renamed_5072(sprbre2.cfr_renamed_281(), sprbre2.cfr_renamed_320());
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_274(PKIXParameters arg0, X509Certificate arg1, Date arg2, X509Certificate arg3, PublicKey arg4, Vector arg5, int arg6) throws sprbre {
        block51: {
            block52: {
                block53: {
                    block50: {
                        block49: {
                            block48: {
                                var8_8 = new sprrme();
                                try {
                                    var8_8.addIssuerName(sprwte.cfr_renamed_302(arg1).getEncoded());
                                }
                                catch (IOException var9_9) {
                                    var10_11 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#12m=V\"l$z#Z)|4o%v>q"));
                                    throw new sprbre(var10_11, (Throwable)var9_9);
                                }
                                var8_8.setCertificateChecking(arg1);
                                try {
                                    var10_12 = sprule.cfr_renamed_5062(var8_8, arg0);
                                    var9_10 = var10_12.iterator();
                                    if (var10_12.isEmpty()) {
                                        var10_12 = sprule.cfr_renamed_5062(new sprrme(), arg0);
                                        var11_15 = var10_12.iterator();
                                        var12_16 = new ArrayList<E>();
                                        v0 = var11_15;
                                        while (v0.hasNext()) {
                                            var12_16.add(((X509CRL)var11_15.next()).getIssuerX500Principal());
                                            v0 = var11_15;
                                        }
                                        var13_17 = var12_16.size();
                                        v1 = new Object[3];
                                        v1[0] = new sprwhk(var8_8.getIssuerNames());
                                        v1[1] = new sprwhk(var12_16);
                                        v1[2] = spruaf.cfr_renamed_279(var13_17);
                                        var14_25 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\nw'j\bQ\n[\u0001j\u0010k\u0010w\u0016}"), v1);
                                        this.cfr_renamed_5065((sprulk)var14_25, arg6);
                                    }
                                }
                                catch (sprlhi var10_13) {
                                    v2 = new Object[3];
                                    v2[0] = var10_13.getCause().getMessage();
                                    v2[1] = var10_13.getCause();
                                    v2[2] = var10_13.getCause().getClass().getName();
                                    var11_15 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#12m=Z)k#~2k8p?Z#m>m"), v2);
                                    this.cfr_renamed_5072((sprulk)var11_15, arg6);
                                    var9_10 = new ArrayList<E>().iterator();
                                }
                                var10_14 = false;
                                var11_15 = null;
                                v3 = var9_10;
                                while (v3.hasNext()) {
                                    var11_15 = (X509CRL)var9_10.next();
                                    var12_16 = var11_15.getThisUpdate();
                                    var13_18 = var11_15.getNextUpdate();
                                    v4 = new Object[2];
                                    v4[0] = new sprokk(var12_16);
                                    v4[1] = new sprokk(var13_18);
                                    var14_25 = v4;
                                    if (var13_18 == null || arg2.before(var13_18)) {
                                        var10_14 = true;
                                        var15_26 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJt\u000b{\u0005t2y\bq\u0000[6T"), (Object[])var14_25);
                                        v5 = var10_14;
                                        this.cfr_renamed_5065((sprulk)var15_26, arg6);
                                        break block48;
                                    }
                                    var15_26 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\u0012z#k\u0001~%w\u0003z'v4h4m\u007fs>|0s\u0018q'~=v5\\\u0003S"), (Object[])var14_25);
                                    v3 = var9_10;
                                    this.cfr_renamed_5065((sprulk)var15_26, arg6);
                                }
                                v5 = var10_14;
                            }
                            if (!v5) {
                                var12_16 = arg1.getIssuerX500Principal();
                                var13_19 = null;
                                var14_25 = arg5.iterator();
                                block25: while (true) {
                                    v6 = var14_25;
                                    while (v6.hasNext()) {
                                        try {
                                            var15_26 = (String)var14_25.next();
                                            var13_19 = this.cfr_renamed_304((String)var15_26);
                                            if (var13_19 == null) continue block25;
                                            var16_30 = var13_19.getIssuerX500Principal();
                                            if (!var12_16.equals(var16_30)) {
                                                v7 = new Object[3];
                                                v7[0] = new sprwhk(var16_30.getName());
                                                v7[1] = new sprwhk(var12_16.getName());
                                                v7[2] = new sprckk(var15_26);
                                                var17_31 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\u000bv\bq\n}'J(O\u0016w\n\u007f'Y"), v7);
                                                this.cfr_renamed_5065((sprulk)var17_31, arg6);
                                                v6 = var14_25;
                                                continue;
                                            }
                                            v8 = var13_19;
                                            var17_31 = v8.getThisUpdate();
                                            var18_37 = v8.getNextUpdate();
                                            v9 = new Object[3];
                                            v9[0] = new sprokk(var17_31);
                                            v9[1] = new sprokk(var18_37);
                                            v9[2] = new sprckk(var15_26);
                                            var19_39 /* !! */  = v9;
                                            if (var18_37 == null || arg2.before((Date)var18_37)) {
                                                var10_14 = true;
                                                var20_41 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#1>q=v?z\u0007~=v5\\\u0003S"), var19_39 /* !! */ );
                                                this.cfr_renamed_5065((sprulk)var20_41, arg6);
                                                v10 = var11_15 = var13_19;
                                                break block49;
                                            }
                                            var20_41 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\u000bv\bq\n}-v\u0012y\bq\u0000[6T"), var19_39 /* !! */ );
                                            this.cfr_renamed_5065((sprulk)var20_41, arg6);
                                        }
                                        catch (sprbre var15_27) {
                                            v6 = var14_25;
                                            this.cfr_renamed_5065(var15_27.cfr_renamed_281(), arg6);
                                            continue;
                                        }
                                        continue block25;
                                    }
                                    break;
                                }
                            }
                            v10 = var11_15;
                        }
                        if (v10 == null) break block51;
                        if (!(arg3 == null || (var13_20 = arg3.getKeyUsage()) == null || var13_20.length > 6 && var13_20[6])) {
                            var14_25 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#1?p\u0012m=L8x?v?x\u0001z#r8k4{"));
                            throw new sprbre((sprulk)var14_25);
                        }
                        if (arg4 == null) {
                            var13_22 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#12m=Q>V\"l$z#O$}=v2T4f"));
                            throw new sprbre(var13_22);
                        }
                        try {
                            var11_15.verify(arg4, "BC");
                        }
                        catch (Exception var13_21) {
                            var14_25 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJ{\u0016t2}\u0016q\u0002a\"y\rt\u0001|"));
                            throw new sprbre((sprulk)var14_25, (Throwable)var13_21);
                        }
                        var12_16 = var11_15.getRevokedCertificate(arg1.getSerialNumber());
                        if (var12_16 != null) {
                            var13_23 = null;
                            if (var12_16.hasExtensions()) {
                                try {
                                    var14_25 = sprqvg.cfr_renamed_23(sprwte.cfr_renamed_292((X509Extension)var12_16, sprrdm.cfr_renamed_953.cfr_renamed_19()));
                                }
                                catch (sprlhi var15_28) {
                                    var16_30 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJ{\u0016t6}\u0005k\u000bv!`\u0010]\u0016j\u000bj"));
                                    throw new sprbre((sprulk)var16_30, (Throwable)var15_28);
                                }
                                if (var14_25 != null) {
                                    var13_23 = sprwte.cfr_renamed_91[var14_25.cfr_renamed_5023()];
                                }
                            }
                            if (var13_23 == null) {
                                var13_23 = sprwte.cfr_renamed_91[7];
                            }
                            var14_25 = new sprwek("com.spire.psmodel.security.x509.CertPathReviewerMessages", (String)var13_23);
                            if (!arg2.before(var12_16.getRevocationDate())) {
                                v11 = new Object[2];
                                v11[0] = new sprokk(var12_16.getRevocationDate());
                                v11[1] = var14_25;
                                var15_26 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\u0012z#k\u0001~%w\u0003z'v4h4m\u007f|4m%M4i>t4{"), v11);
                                throw new sprbre((sprulk)var15_26);
                            }
                            v12 = new Object[2];
                            v12[0] = new sprokk(var12_16.getRevocationDate());
                            v12[1] = var14_25;
                            var15_26 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\u0016}\u0012w\u000f}\u0000Y\u0002l\u0001j2y\bq\u0000y\u0010q\u000bv"), v12);
                            v13 = var11_15;
                            this.cfr_renamed_5065((sprulk)var15_26, arg6);
                        } else {
                            var13_23 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#1?p%M4i>t4{"));
                            v13 = var11_15;
                            this.cfr_renamed_5065((sprulk)var13_23, arg6);
                        }
                        var13_23 = v13.getNextUpdate();
                        if (var13_23 != null && !arg2.before((Date)var13_23)) {
                            v14 = new Object[1];
                            v14[0] = new sprokk(var13_23);
                            var14_25 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\u0007j\bM\u0014|\u0005l\u0001Y\u0012y\rt\u0005z\b}"), v14);
                            this.cfr_renamed_5065((sprulk)var14_25, arg6);
                        }
                        try {
                            var14_25 = sprwte.cfr_renamed_292((X509Extension)var11_15, sprwte.cfr_renamed_102);
                        }
                        catch (sprlhi var15_29) {
                            var16_30 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\u0012z#k\u0001~%w\u0003z'v4h4m\u007f{8l%m\u0001k\u0014g%Z#m>m"));
                            throw new sprbre((sprulk)var16_30);
                        }
                        {
                            var15_26 = sprwte.cfr_renamed_292((X509Extension)var11_15, sprwte.cfr_renamed_132);
                        }
                        if (var15_26 == null) break block52;
                        var16_30 = new sprrme();
                        try {
                            var16_30.addIssuerName(sprwte.cfr_renamed_305((X509CRL)var11_15).getEncoded());
                        }
                        catch (IOException var17_32) {
                            var18_37 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#12m=V\"l$z#Z)|4o%v>q"));
                            throw new sprbre((sprulk)var18_37, (Throwable)var17_32);
                        }
                        var16_30.setMinCRLNumber(((sprktm)var15_26).cfr_renamed_162());
                        try {
                            var16_30.setMaxCRLNumber(((sprktm)sprwte.cfr_renamed_292((X509Extension)var11_15, sprwte.cfr_renamed_0)).cfr_renamed_162().subtract(BigInteger.valueOf(1L)));
                        }
                        catch (sprlhi var17_33) {
                            var18_37 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\u0007j\bV\u0006j!`\u0010]\u0016j\u000bj"));
                            throw new sprbre((sprulk)var18_37, (Throwable)var17_33);
                        }
                        var17_34 = false;
                        try {
                            v15 = var18_37 = sprule.cfr_renamed_5062((sprrme)var16_30, arg0).iterator();
                            if (true) ** GOTO lbl206
                        }
                        catch (sprlhi var19_40) {
                            var20_41 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#12m=Z)k#~2k8p?Z#m>m"));
                            throw new sprbre((sprulk)var20_41, (Throwable)var19_40);
                        }
                        do {
                            v15 = var18_37;
lbl206:
                            // 2 sources

                            if (!v15.hasNext()) break block50;
                            var19_39 /* !! */  = (X509CRL)var18_37.next();
                            try {
                                var20_41 = sprwte.cfr_renamed_292((X509Extension)var19_39 /* !! */ , sprwte.cfr_renamed_102);
                            }
                            catch (sprlhi var21_42) {
                                var22_43 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJ|\rk\u0010j4l!`\u0010]\u0016j\u000bj"));
                                throw new sprbre(var22_43, (Throwable)var21_42);
                            }
                        } while (!sprmye.cfr_renamed_5073(var14_25, var20_41));
                        v16 = var17_34 = true;
                        break block53;
                    }
                    v16 = var17_34;
                }
                if (!v16) {
                    var19_39 /* !! */  = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\u0012z#k\u0001~%w\u0003z'v4h4m\u007fq>]0l4\\\u0003S"));
                    throw new sprbre((sprulk)var19_39 /* !! */ );
                }
            }
            if (var14_25 != null) {
                var16_30 = sprwzl.cfr_renamed_23(var14_25);
                var17_36 = null;
                try {
                    var17_36 = sprbcm.cfr_renamed_23(sprwte.cfr_renamed_292(arg1, sprwte.cfr_renamed_107));
                }
                catch (sprlhi var18_38) {
                    var19_39 /* !! */  = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJ{\u0016t&[!`\u0010]\u0016j\u000bj"));
                    throw new sprbre((sprulk)var19_39 /* !! */ , (Throwable)var18_38);
                }
                if (var16_30.cfr_renamed_306() && var17_36 != null && var17_36.cfr_renamed_296()) {
                    var18_37 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\u0012z#k\u0001~%w\u0003z'v4h4m\u007f|#s\u001eq=f\u0004l4m\u0012z#k"));
                    throw new sprbre((sprulk)var18_37);
                }
                if (var16_30.cfr_renamed_307() && (var17_36 == null || !var17_36.cfr_renamed_296())) {
                    var18_37 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJ{\u0016t+v\ba'y'}\u0016l"));
                    throw new sprbre((sprulk)var18_37);
                }
                if (var16_30.cfr_renamed_308()) {
                    var18_37 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\u0012z#k\u0001~%w\u0003z'v4h4m\u007f|#s\u001eq=f\u0010k%m\u0012z#k"));
                    throw new sprbre((sprulk)var18_37);
                }
            }
        }
        if (!var10_14) {
            var13_24 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJv\u000bN\u0005t\r|'j\b^\u000bm\n|"));
            throw new sprbre(var13_24);
        }
    }

    public boolean cfr_renamed_176() {
        int n;
        this.cfr_renamed_317();
        boolean bl = true;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_119.length) {
            if (!this.cfr_renamed_119[n].isEmpty()) {
                bl = false;
                return false;
            }
            n2 = ++n;
        }
        return bl;
    }

    public List[] cfr_renamed_326() {
        sprwte sprwte2 = this;
        sprwte2.cfr_renamed_317();
        return sprwte2.cfr_renamed_185;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ void cfr_renamed_276() {
        block51: {
            block52: {
                block48: {
                    block47: {
                        var1_1 = null;
                        var2_2 = null;
                        v0 = new Object[2];
                        v0[0] = new sprokk(this.cfr_renamed_105);
                        v0[1] = new sprokk(this.cfr_renamed_88);
                        var3_3 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\u0012z#k\u0001~%w\u0003z'v4h4m\u007f|4m%O0k9I0s8{\u0015~%z"), v0);
                        this.cfr_renamed_5074((sprulk)var3_3);
                        try {
                            block50: {
                                v1 = this;
                                var3_3 = (X509Certificate)v1.cfr_renamed_137.get(v1.cfr_renamed_137.size() - 1);
                                v2 = this;
                                var4_6 = v2.cfr_renamed_278((X509Certificate)var3_3, v2.cfr_renamed_114.getTrustAnchors());
                                if (var4_6.size() > 1) {
                                    v3 = new Object[2];
                                    v3[0] = spruaf.cfr_renamed_279(var4_6.size());
                                    v3[1] = new sprwhk(var3_3.getIssuerX500Principal());
                                    var5_8 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJ{\u000bv\u0002t\r{\u0010q\n\u007f0j\u0011k\u0010Y\n{\fw\u0016k"), v3);
                                    this.cfr_renamed_5075((sprulk)var5_8);
                                    break block47;
                                }
                                if (var4_6.isEmpty()) {
                                    v4 = new Object[2];
                                    v4[0] = new sprwhk(var3_3.getIssuerX500Principal());
                                    v4[1] = spruaf.cfr_renamed_279(this.cfr_renamed_114.getTrustAnchors().size());
                                    var5_8 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#1?p\u0005m$l%^?|9p#Y>j?{"), v4);
                                    this.cfr_renamed_5075((sprulk)var5_8);
                                    break block47;
                                }
                                v5 = var1_1 = (TrustAnchor)var4_6.iterator().next();
                                if (var1_1.getTrustedCert() == null) break block50;
                                var5_8 = v5.getTrustedCert().getPublicKey();
                                v6 = var3_3;
                                ** GOTO lbl44
                            }
                            var5_8 = v5.getCAPublicKey();
                            try {
                                v6 = var3_3;
lbl44:
                                // 2 sources

                                sprmle.cfr_renamed_280((X509Certificate)v6, (PublicKey)var5_8, this.cfr_renamed_114.getSigProvider());
                            }
                            catch (SignatureException var6_9) {
                                var7_12 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJl\u0016m\u0017l&m\u0010Q\nn\u0005t\r|'}\u0016l"));
                                this.cfr_renamed_5075((sprulk)var7_12);
                            }
                            catch (Exception var6_10) {}
                        }
                        catch (sprbre var3_4) {
                            v7 = var1_1;
                            this.cfr_renamed_5075(var3_4.cfr_renamed_281());
                            break block48;
                        }
                        catch (Throwable var3_5) {
                            v8 = new Object[2];
                            v8[0] = new sprwhk(var3_5.getMessage());
                            v8[1] = new sprwhk(var3_5);
                            var4_6 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\u0012z#k\u0001~%w\u0003z'v4h4m\u007fj?t?p&q"), v8);
                            this.cfr_renamed_5075((sprulk)var4_6);
                        }
                    }
                    v7 = var1_1;
                }
                if (v7 != null) {
                    var3_3 = var1_1.getTrustedCert();
                    try {
                        var2_2 = var3_3 != null ? sprwte.cfr_renamed_282((X509Certificate)var3_3) : new X500Principal(var1_1.getCAName());
                    }
                    catch (IllegalArgumentException var4_7) {
                        v9 = new Object[1];
                        v9[0] = new sprwhk(var1_1.getCAName());
                        var5_8 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\u0010j\u0011k\u0010\\*Q\nn\u0005t\r|"), v9);
                        this.cfr_renamed_5075((sprulk)var5_8);
                    }
                    if (var3_3 != null) {
                        v10 = var3_3.getKeyUsage();
                        var4_6 = v10;
                        if (v10 != null && (((Object)var4_6).length <= 5 || var4_6[5] == false)) {
                            var5_8 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\u0012z#k\u0001~%w\u0003z'v4h4m\u007fk#j\"k\u001az(J\"~6z"));
                            this.cfr_renamed_5074((sprulk)var5_8);
                        }
                    }
                }
                var3_3 = null;
                var4_6 = var2_2;
                var5_8 = null;
                var6_11 = null;
                var7_12 = null;
                var8_13 = null;
                if (var1_1 == null) break block51;
                var5_8 = var1_1.getTrustedCert();
                if (var5_8 == null) break block52;
                v11 = var3_3 = var5_8.getPublicKey();
                ** GOTO lbl100
            }
            var3_3 = var1_1.getCAPublicKey();
            try {
                v11 = var3_3;
lbl100:
                // 2 sources

                var6_11 = sprwte.cfr_renamed_283((PublicKey)v11);
                var7_12 = var6_11.cfr_renamed_593();
                var8_13 = var6_11.cfr_renamed_284();
            }
            catch (CertPathValidatorException var9_14) {
                var10_16 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\u0010j\u0011k\u0010H\u0011z/}\u001d]\u0016j\u000bj"));
                this.cfr_renamed_5075(var10_16);
                var6_11 = null;
            }
        }
        var9_15 = null;
        v12 = var11_18 = this.cfr_renamed_137.size() - 1;
        while (v12 >= 0) {
            block49: {
                block54: {
                    block53: {
                        v13 = this;
                        var10_17 = v13.cfr_renamed_145 - var11_18;
                        var9_15 = (X509Certificate)v13.cfr_renamed_137.get(var11_18);
                        if (var3_3 == null) break block53;
                        try {
                            sprmle.cfr_renamed_280(var9_15, (PublicKey)var3_3, this.cfr_renamed_114.getSigProvider());
                            v14 = var9_15;
                        }
                        catch (GeneralSecurityException var12_20) {
                            v15 = new Object[3];
                            v15[0] = var12_20.getMessage();
                            v15[1] = var12_20;
                            v15[2] = var12_20.getClass().getName();
                            var13_25 /* !! */  = (byte[])new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#1\"v6q0k$m4Q>k\u0007z#v7v4{"), v15);
                            v14 = var9_15;
                            this.cfr_renamed_5072((sprulk)var13_25 /* !! */ , var11_18);
                        }
                        ** GOTO lbl173
                    }
                    if (!sprwte.cfr_renamed_286(var9_15)) break block54;
                    try {
                        v16 = var9_15;
                        sprmle.cfr_renamed_280(v16, v16.getPublicKey(), this.cfr_renamed_114.getSigProvider());
                        var12_19 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\u0016w\u000bl/}\u001dQ\u0017N\u0005t\r|&m\u0010V\u000bl%L\u0016m\u0017l%v\u0007p\u000bj"));
                        this.cfr_renamed_5072((sprulk)var12_19, var11_18);
                        v14 = var9_15;
                    }
                    catch (GeneralSecurityException var12_21) {
                        v17 = new Object[3];
                        v17[0] = var12_21.getMessage();
                        v17[1] = var12_21;
                        v17[2] = var12_21.getClass().getName();
                        var13_25 /* !! */  = (byte[])new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#1\"v6q0k$m4Q>k\u0007z#v7v4{"), v17);
                        v14 = var9_15;
                        this.cfr_renamed_5072((sprulk)var13_25 /* !! */ , var11_18);
                    }
                    ** GOTO lbl173
                }
                var12_19 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJV\u000bQ\u0017k\u0011}\u0016H\u0011z\bq\u0007S\u0001a"));
                var13_25 /* !! */  = var9_15.getExtensionValue(sprrdm.cfr_renamed_105.cfr_renamed_19());
                if (var13_25 /* !! */  != null && (var15_30 = (var14_28 = sprzne.cfr_renamed_23(sprfvg.cfr_renamed_23(var13_25 /* !! */ ).cfr_renamed_186())).cfr_renamed_288()) != null) {
                    var16_31 = var15_30.cfr_renamed_289()[0];
                    var17_32 = var14_28.cfr_renamed_290();
                    if (var17_32 != null) {
                        v18 = new Object[7];
                        v18[0] = new sprwek("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("r8l\"v?x\u0018l\"j4m"));
                        v18[1] = sprpxo.cfr_renamed_9("D:");
                        v18[2] = var16_31;
                        v18[3] = sprxvc.cfr_renamed_9("s?");
                        v18[4] = new sprwek("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("u\rk\u0017q\n\u007f7}\u0016q\u0005t"));
                        v18[5] = " ";
                        v18[6] = var17_32;
                        var18_34 = v18;
                        var12_19.cfr_renamed_291(var18_34);
                    }
                }
                this.cfr_renamed_5072((sprulk)var12_19, var11_18);
                try {
                    v14 = var9_15;
lbl173:
                    // 5 sources

                    v14.checkValidity(this.cfr_renamed_105);
                    v19 = this;
                }
                catch (CertificateNotYetValidException var12_22) {
                    v20 = new Object[1];
                    v20[0] = new sprokk(var9_15.getNotBefore());
                    var13_25 /* !! */  = (byte[])new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#12z#k8y8|0k4Q>k\bz%I0s8{"), v20);
                    v21 = this;
                    v19 = v21;
                    v21.cfr_renamed_5072((sprulk)var13_25 /* !! */ , var11_18);
                }
                catch (CertificateExpiredException var12_23) {
                    v22 = new Object[1];
                    v22[0] = new sprokk(var9_15.getNotAfter());
                    var13_25 /* !! */  = (byte[])new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\u0007}\u0016l\r~\r{\u0005l\u0001]\u001ch\rj\u0001|"), v22);
                    v23 = this;
                    v19 = v23;
                    v23.cfr_renamed_5072((sprulk)var13_25 /* !! */ , var11_18);
                }
                if (v19.cfr_renamed_114.isRevocationEnabled()) {
                    var12_19 = null;
                    try {
                        v24 = sprwte.cfr_renamed_292(var9_15, sprwte.cfr_renamed_126);
                        var13_25 /* !! */  = (byte[])v24;
                        if (v24 != null) {
                            var12_19 = sprvcm.cfr_renamed_23(var13_25 /* !! */ );
                        }
                    }
                    catch (sprlhi var13_26) {
                        var14_28 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\u0012z#k\u0001~%w\u0003z'v4h4m\u007f|#s\u0015v\"k\u0001k\u0014g%Z#m>m"));
                        this.cfr_renamed_5072((sprulk)var14_28, var11_18);
                    }
                    var13_25 /* !! */  = null;
                    try {
                        var14_28 = sprwte.cfr_renamed_292(var9_15, sprwte.cfr_renamed_79);
                        if (var14_28 != null) {
                            var13_25 /* !! */  = (byte[])spream.cfr_renamed_23(var14_28);
                        }
                    }
                    catch (sprlhi var14_29) {
                        var15_30 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJ{\u0016t%m\u0010p-v\u0002w%{\u0007]\u0016j\u000bj"));
                        this.cfr_renamed_5072((sprulk)var15_30, var11_18);
                    }
                    v25 = this;
                    var14_28 = v25.cfr_renamed_5064((sprvcm)var12_19);
                    var15_30 = v25.cfr_renamed_5076((spream)var13_25 /* !! */ );
                    var16_31 = var14_28.iterator();
                    v26 = var16_31;
                    while (v26.hasNext()) {
                        v27 = new Object[1];
                        v27[0] = new sprckk(var16_31.next());
                        var17_32 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#12m=[8l%O>v?k"), v27);
                        v26 = var16_31;
                        this.cfr_renamed_5065((sprulk)var17_32, var11_18);
                    }
                    v28 = var16_31 = var15_30.iterator();
                    while (v28.hasNext()) {
                        v29 = new Object[1];
                        v29[0] = new sprckk(var16_31.next());
                        var17_32 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\u000b{\u0017h(w\u0007y\u0010q\u000bv"), v29);
                        v28 = var16_31;
                        this.cfr_renamed_5065((sprulk)var17_32, var11_18);
                    }
                    try {
                        v30 = this;
                        v30.cfr_renamed_273(v30.cfr_renamed_114, var9_15, this.cfr_renamed_105, (X509Certificate)var5_8, (PublicKey)var3_3, (Vector)var14_28, (Vector)var15_30, var11_18);
                        v31 = var4_6;
                        break block49;
                    }
                    catch (sprbre var17_33) {
                        this.cfr_renamed_5072(var17_33.cfr_renamed_281(), var11_18);
                    }
                }
                v31 = var4_6;
            }
            if (v31 != null && !var9_15.getIssuerX500Principal().equals(var4_6)) {
                v32 = new Object[2];
                v32[0] = var4_6.getName();
                v32[1] = var9_15.getIssuerX500Principal().getName();
                var12_19 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\u0012z#k\u0001~%w\u0003z'v4h4m\u007f|4m%H#p?x\u0018l\"j4m"), v32);
                this.cfr_renamed_5072((sprulk)var12_19, var11_18);
            }
            if (var10_17 != this.cfr_renamed_145) {
                if (var9_15 != null && var9_15.getVersion() == 1) {
                    var12_19 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\nw'Y'}\u0016l"));
                    this.cfr_renamed_5072((sprulk)var12_19, var11_18);
                }
                try {
                    var12_19 = sprbcm.cfr_renamed_23(sprwte.cfr_renamed_292(var9_15, sprwte.cfr_renamed_107));
                    if (var12_19 != null) {
                        if (!var12_19.cfr_renamed_296()) {
                            var13_25 /* !! */  = (byte[])new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#1?p\u0012^\u0012z#k"));
                            this.cfr_renamed_5072((sprulk)var13_25 /* !! */ , var11_18);
                        }
                    } else {
                        var13_25 /* !! */  = (byte[])new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\nw&y\u0017q\u0007[\u000bv\u0017l\u0016y\rv\u0010k"));
                        this.cfr_renamed_5072((sprulk)var13_25 /* !! */ , var11_18);
                    }
                }
                catch (sprlhi var13_27) {
                    var14_28 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#14m#p#O#p2z\"v?x\u0013\\"));
                    this.cfr_renamed_5072((sprulk)var14_28, var11_18);
                }
                v33 = var9_15.getKeyUsage();
                var13_25 /* !! */  = (byte[])v33;
                if (v33 != null && (var13_25 /* !! */ .length <= 5 || var13_25 /* !! */ [5] == 0)) {
                    var14_28 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\nw'}\u0016l7q\u0003v"));
                    this.cfr_renamed_5072((sprulk)var14_28, var11_18);
                }
            }
            var5_8 = var9_15;
            var4_6 = var5_8.getSubjectX500Principal();
            try {
                var3_3 = sprwte.cfr_renamed_297(this.cfr_renamed_137, var11_18);
                var6_11 = sprwte.cfr_renamed_283((PublicKey)var3_3);
                var7_12 = var6_11.cfr_renamed_593();
                var8_13 = var6_11.cfr_renamed_284();
            }
            catch (CertPathValidatorException var12_24) {
                var13_25 /* !! */  = (byte[])new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\u0012z#k\u0001~%w\u0003z'v4h4m\u007fo$}\u001az(Z#m>m"));
                this.cfr_renamed_5072((sprulk)var13_25 /* !! */ , var11_18);
                var6_11 = null;
                var7_12 = null;
                var8_13 = null;
            }
            v12 = --var11_18;
        }
        this.spr\ufe34 = var1_1;
        this.cfr_renamed_82 = var3_3;
    }

    static {
        cfr_renamed_1 = sprrdm.cfr_renamed_185.cfr_renamed_19();
        cfr_renamed_126 = sprrdm.cfr_renamed_79.cfr_renamed_19();
        cfr_renamed_79 = sprrdm.cfr_renamed_102.cfr_renamed_19();
    }

    public int cfr_renamed_300() {
        return this.cfr_renamed_145;
    }

    public PublicKey cfr_renamed_321() {
        sprwte sprwte2 = this;
        sprwte2.cfr_renamed_317();
        return sprwte2.cfr_renamed_82;
    }

    public void cfr_renamed_273(PKIXParameters arg0, X509Certificate arg1, Date arg2, X509Certificate arg3, PublicKey arg4, Vector arg5, Vector arg6, int arg7) throws sprbre {
        this.cfr_renamed_274(arg0, arg1, arg2, arg3, arg4, arg5, arg7);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ String cfr_renamed_301(byte[] arg0) {
        try {
            return InetAddress.getByAddress(arg0).getHostAddress();
        }
        catch (Exception exception) {
            int n;
            StringBuffer stringBuffer = new StringBuffer();
            int n2 = n = 0;
            while (true) {
                if (n2 == arg0.length) {
                    return stringBuffer.toString();
                }
                stringBuffer.append(Integer.toHexString(arg0[n] & 0xFF));
                stringBuffer.append(' ');
                n2 = ++n;
            }
        }
    }

    public sprwte() {
    }

    public List cfr_renamed_325(int arg0) {
        sprwte sprwte2 = this;
        sprwte2.cfr_renamed_317();
        return sprwte2.cfr_renamed_185[arg0 + 1];
    }

    public void cfr_renamed_5072(sprulk arg0, int arg1) {
        if (arg1 < -1 || arg1 >= this.cfr_renamed_145) {
            throw new IndexOutOfBoundsException();
        }
        this.cfr_renamed_119[arg1 + 1].add(arg0);
    }

    public void cfr_renamed_355(CertPath arg0, PKIXParameters arg1) throws sprbre {
        sprwte sprwte2;
        if (this.cfr_renamed_96) {
            throw new IllegalStateException(sprpxo.cfr_renamed_9("\u000bz\u000e}\u0007lDq\u00178\u0005t\u0016}\u0005|\u001d8\rv\rl\ry\bq\u001e}\u00009"));
        }
        this.cfr_renamed_96 = true;
        if (arg0 == null) {
            throw new NullPointerException(sprxvc.cfr_renamed_9("|4m%O0k9?&~\"??j=s"));
        }
        List<? extends Certificate> list = arg0.getCertificates();
        if (list.size() != 1) {
            int n;
            Object object;
            HashSet<X509Certificate> hashSet = new HashSet<X509Certificate>();
            Object object2 = object = arg1.getTrustAnchors().iterator();
            while (object2.hasNext()) {
                TrustAnchor trustAnchor = object.next();
                object2 = object;
                hashSet.add(trustAnchor.getTrustedCert());
            }
            object = new ArrayList();
            int n2 = n = 0;
            while (n2 != list.size()) {
                if (!hashSet.contains(list.get(n))) {
                    object.add(list.get(n));
                }
                n2 = ++n;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(sprpxo.cfr_renamed_9("@J-T!"), "BC");
                this.cfr_renamed_31 = certificateFactory.generateCertPath((List<? extends Certificate>)object);
            }
            catch (GeneralSecurityException generalSecurityException) {
                throw new IllegalStateException(sprxvc.cfr_renamed_9("$q0}=zqk>?#z3j8s5?2z#k!~%w"));
            }
            this.cfr_renamed_137 = object;
            sprwte2 = this;
        } else {
            sprwte2 = this;
            sprwte sprwte3 = this;
            sprwte3.cfr_renamed_31 = arg0;
            sprwte3.cfr_renamed_137 = arg0.getCertificates();
        }
        sprwte2.cfr_renamed_145 = this.cfr_renamed_137.size();
        if (this.cfr_renamed_137.isEmpty()) {
            throw new sprbre(new sprulk(cfr_renamed_91, sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJ}\th\u0010a'}\u0016l4y\u0010p")));
        }
        this.cfr_renamed_114 = (PKIXParameters)arg1.clone();
        sprwte sprwte4 = this;
        sprwte sprwte5 = this;
        sprwte sprwte6 = this;
        sprwte6.cfr_renamed_88 = new Date();
        this.cfr_renamed_105 = sprwte.cfr_renamed_5077(this.cfr_renamed_114, this.cfr_renamed_88);
        this.cfr_renamed_185 = null;
        sprwte5.cfr_renamed_119 = null;
        sprwte5.spr\ufe34 = null;
        sprwte4.cfr_renamed_82 = null;
        sprwte4.cfr_renamed_272 = null;
    }

    private /* synthetic */ boolean cfr_renamed_319(X509Certificate arg0, int arg1) {
        try {
            int n;
            boolean bl = false;
            sprszm sprszm2 = (sprszm)sprwte.cfr_renamed_292(arg0, cfr_renamed_1);
            int n2 = n = 0;
            while (n2 < sprszm2.cfr_renamed_84()) {
                Object object;
                sprrzl sprrzl2 = sprrzl.cfr_renamed_23(sprszm2.cfr_renamed_85(n));
                if (sprrzl.cfr_renamed_112.cfr_renamed_5078(sprrzl2.cfr_renamed_356())) {
                    object = new sprulk(cfr_renamed_91, sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#1\u0000|\u0014j\u0012p<o=v0q2z"));
                    this.cfr_renamed_5065((sprulk)object, arg1);
                } else if (!sprrzl.cfr_renamed_86.cfr_renamed_5078(sprrzl2.cfr_renamed_356())) {
                    if (sprrzl.cfr_renamed_152.cfr_renamed_5078(sprrzl2.cfr_renamed_356())) {
                        object = new sprulk(cfr_renamed_91, sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u001665{7K'\\"));
                        this.cfr_renamed_5065((sprulk)object, arg1);
                    } else if (sprrzl.cfr_renamed_2.cfr_renamed_5078(sprrzl2.cfr_renamed_356())) {
                        sprwte sprwte2;
                        sprulk sprulk2;
                        sprulk sprulk3;
                        object = sprqdm.cfr_renamed_23(sprrzl2.cfr_renamed_357());
                        spredm spredm2 = ((sprqdm)object).cfr_renamed_358();
                        double d = ((sprqdm)object).cfr_renamed_359().doubleValue() * Math.pow(10.0, ((sprqdm)object).cfr_renamed_360().doubleValue());
                        if (((sprqdm)object).cfr_renamed_358().cfr_renamed_361()) {
                            Object[] objectArray = new Object[3];
                            objectArray[0] = ((sprqdm)object).cfr_renamed_358().cfr_renamed_362();
                            objectArray[1] = new sprokk(new Double(d));
                            objectArray[2] = object;
                            sprulk3 = new sprulk(cfr_renamed_91, sprxvc.cfr_renamed_9("\u0012z#k\u0001~%w\u0003z'v4h4m\u007fN2S8r8k\u0007~=j4^=o9~"), objectArray);
                            sprulk2 = sprulk3;
                            sprwte2 = this;
                        } else {
                            Object[] objectArray = new Object[3];
                            objectArray[0] = spruaf.cfr_renamed_279(((sprqdm)object).cfr_renamed_358().cfr_renamed_363());
                            objectArray[1] = new sprokk(new Double(d));
                            objectArray[2] = object;
                            sprulk3 = new sprulk(cfr_renamed_91, sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJI\u0007T\ru\rl2y\bm\u0001V\u0011u"), objectArray);
                            sprulk2 = sprulk3;
                            sprwte2 = this;
                        }
                        sprwte2.cfr_renamed_5065(sprulk2, arg1);
                    } else {
                        Object[] objectArray = new Object[2];
                        objectArray[0] = sprrzl2.cfr_renamed_356();
                        objectArray[1] = new sprwhk(sprrzl2);
                        object = new sprulk(cfr_renamed_91, sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#1\u0000|\u0004q:q>h?L%~%z<z?k"), objectArray);
                        this.cfr_renamed_5065((sprulk)object, arg1);
                        bl = true;
                    }
                }
                n2 = ++n;
            }
            return !bl;
        }
        catch (sprlhi sprlhi2) {
            sprulk sprulk4 = new sprulk(cfr_renamed_91, sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJI\u0007K\u0010y\u0010}\t}\nl!`\u0010]\u0016j\u000bj"));
            this.cfr_renamed_5072(sprulk4, arg1);
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_318() {
        List<PKIXCertPathChecker> list = this.cfr_renamed_114.getCertPathCheckers();
        Iterator<PKIXCertPathChecker> iterator = list.iterator();
        try {
            try {
                while (iterator.hasNext()) {
                    iterator.next().init(false);
                }
            }
            catch (CertPathValidatorException certPathValidatorException) {
                Object[] objectArray = new Object[3];
                objectArray[0] = certPathValidatorException.getMessage();
                objectArray[1] = certPathValidatorException;
                objectArray[2] = certPathValidatorException.getClass().getName();
                sprulk sprulk2 = new sprulk(cfr_renamed_91, sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#12z#k\u0001~%w\u0012w4|:z#Z#m>m"), objectArray);
                throw new sprbre(sprulk2, (Throwable)certPathValidatorException);
            }
            X509Certificate x509Certificate = null;
            for (int i = this.cfr_renamed_137.size() - 1; i >= 0; --i) {
                sprulk sprulk3;
                x509Certificate = (X509Certificate)this.cfr_renamed_137.get(i);
                Set<String> set = x509Certificate.getCriticalExtensionOIDs();
                if (set == null || set.isEmpty()) continue;
                set.remove(cfr_renamed_93);
                set.remove(cfr_renamed_3);
                set.remove(cfr_renamed_86);
                set.remove(cfr_renamed_112);
                set.remove(cfr_renamed_102);
                set.remove(cfr_renamed_132);
                set.remove(cfr_renamed_119);
                set.remove(cfr_renamed_107);
                set.remove(cfr_renamed_2);
                set.remove(cfr_renamed_4);
                if (i == 0) {
                    set.remove(sprrdm.cfr_renamed_114.cfr_renamed_19());
                }
                if (set.contains(cfr_renamed_1) && this.cfr_renamed_319(x509Certificate, i)) {
                    set.remove(cfr_renamed_1);
                }
                Iterator<PKIXCertPathChecker> iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                    try {
                        Iterator<PKIXCertPathChecker> iterator3;
                        iterator3.next().check(x509Certificate, set);
                        iterator2 = iterator3;
                    }
                    catch (CertPathValidatorException certPathValidatorException) {
                        Object[] objectArray = new Object[3];
                        objectArray[0] = certPathValidatorException.getMessage();
                        objectArray[1] = certPathValidatorException;
                        objectArray[2] = certPathValidatorException.getClass().getName();
                        sprulk3 = new sprulk(cfr_renamed_91, sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\u0007j\rl\r{\u0005t!`\u0010}\nk\rw\n]\u0016j\u000bj"), objectArray);
                        throw new sprbre(sprulk3, certPathValidatorException.getCause(), this.cfr_renamed_31, i);
                    }
                }
                if (set.isEmpty()) continue;
                Object object = set.iterator();
                while (object.hasNext()) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = new sprlem(sprulk3.next());
                    sprulk sprulk4 = new sprulk(cfr_renamed_91, sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#1$q:q>h?\\#v%v2~=Z)k"), objectArray);
                    object = sprulk3;
                    this.cfr_renamed_5072(sprulk4, i);
                }
            }
            return;
        }
        catch (sprbre sprbre2) {
            this.cfr_renamed_5072(sprbre2.cfr_renamed_281(), sprbre2.cfr_renamed_320());
        }
    }

    public void cfr_renamed_5074(sprulk arg0) {
        this.cfr_renamed_185[0].add(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Collection cfr_renamed_278(X509Certificate arg0, Set arg1) throws sprbre {
        Object object;
        Object object2;
        Object object3;
        X509CertSelector x509CertSelector;
        Iterator iterator;
        ArrayList<Object> arrayList;
        block7: {
            arrayList = new ArrayList<Object>();
            iterator = arg1.iterator();
            x509CertSelector = new X509CertSelector();
            try {
                x509CertSelector.setSubject(sprwte.cfr_renamed_302(arg0).getEncoded());
                object3 = arg0.getExtensionValue(sprrdm.cfr_renamed_105.cfr_renamed_19());
                if (object3 == null) break block7;
                object2 = (sproug)sprxgf.cfr_renamed_184((byte[])object3);
                object = sprzne.cfr_renamed_23(sprxgf.cfr_renamed_184(((sproug)object2).cfr_renamed_186()));
                if (((sprzne)object).cfr_renamed_290() != null) {
                    x509CertSelector.setSerialNumber(((sprzne)object).cfr_renamed_290());
                    break block7;
                }
                byte[] byArray = ((sprzne)object).cfr_renamed_327();
                if (byArray != null) {
                    x509CertSelector.setSubjectKeyIdentifier(new sprfvg(byArray).cfr_renamed_91());
                }
            }
            catch (IOException iOException) {
                sprulk sprulk2 = new sprulk(cfr_renamed_91, sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\u0010j\u0011k\u0010Y\n{\fw\u0016Q\u0017k\u0011}\u0016]\u0016j\u000bj"));
                throw new sprbre(sprulk2);
            }
        }
        while (iterator.hasNext()) {
            TrustAnchor trustAnchor = (TrustAnchor)iterator.next();
            object3 = trustAnchor;
            if (trustAnchor.getTrustedCert() != null) {
                if (!x509CertSelector.match(((TrustAnchor)object3).getTrustedCert())) continue;
                arrayList.add(object3);
                continue;
            }
            if (((TrustAnchor)object3).getCAName() == null || ((TrustAnchor)object3).getCAPublicKey() == null || !((X500Principal)(object2 = sprwte.cfr_renamed_302(arg0))).equals(object = new X500Principal(((TrustAnchor)object3).getCAName()))) continue;
            arrayList.add(object3);
        }
        return arrayList;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_328() {
        v0 = this;
        var1_1 = v0.cfr_renamed_114.getInitialPolicies();
        var2_2 = new ArrayList[v0.cfr_renamed_145 + 1];
        v1 = var3_3 = 0;
        while (v1 < var2_2.length) {
            var2_2[var3_3++] = new ArrayList<E>();
            v1 = var3_3;
        }
        var3_4 = new HashSet<String>();
        var3_4.add("2.5.29.32.0");
        var4_5 = new sprbrh(new ArrayList<E>(), 0, var3_4, null, new HashSet<E>(), "2.5.29.32.0", false);
        var2_2[0].add(var4_5);
        if (this.cfr_renamed_114.isExplicitPolicyRequired()) {
            var5_6 = 0;
            v2 = this;
        } else {
            v3 = this;
            v2 = v3;
            var5_6 = v3.cfr_renamed_145 + 1;
        }
        if (v2.cfr_renamed_114.isAnyPolicyInhibited()) {
            var6_7 = 0;
            v4 = this;
        } else {
            v5 = this;
            v4 = v5;
            var6_7 = v5.cfr_renamed_145 + 1;
        }
        var7_8 = v4.cfr_renamed_114.isPolicyMappingInhibited() != false ? 0 : this.cfr_renamed_145 + 1;
        var8_9 = null;
        var9_10 = null;
        try {
            block98: {
                v6 = var10_11 = this.cfr_renamed_137.size() - 1;
                while (v6 >= 0) {
                    v7 = this;
                    var11_12 = v7.cfr_renamed_145 - var10_11;
                    var9_10 = (X509Certificate)v7.cfr_renamed_137.get(var10_11);
                    try {
                        var12_13 = (sprszm)sprwte.cfr_renamed_292(var9_10, sprwte.cfr_renamed_3);
                    }
                    catch (sprlhi var13_17) {
                        var14_18 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#1!p=v2f\u0014g%Z#m>m"));
                        throw new sprbre((sprulk)var14_18, (Throwable)var13_17, this.cfr_renamed_31, var10_11);
                    }
                    if (var12_13 != null && var4_5 != null) {
                        var13_16 = var12_13.cfr_renamed_329();
                        var14_18 = new HashSet<E>();
                        while (var13_16.hasMoreElements()) {
                            var15_26 = sprdcm.cfr_renamed_23(var13_16.nextElement());
                            var16_43 = var15_26.cfr_renamed_330();
                            var14_18.add(var16_43.cfr_renamed_19());
                            if ("2.5.29.32.0".equals(var16_43.cfr_renamed_19())) continue;
                            try {
                                var17_54 /* !! */  = sprwte.cfr_renamed_5079(var15_26.cfr_renamed_332());
                            }
                            catch (CertPathValidatorException var18_66) {
                                var19_78 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\u0014w\bq\u0007a5m\u0005t\r~\r}\u0016]\u0016j\u000bj"));
                                throw new sprbre((sprulk)var19_78, (Throwable)var18_66, this.cfr_renamed_31, var10_11);
                            }
                            var18_67 = sprwte.cfr_renamed_5080(var11_12, var2_2, (sprlem)var16_43, var17_54 /* !! */ );
                            if (var18_67 != 0) continue;
                            sprwte.cfr_renamed_5081(var11_12, var2_2, (sprlem)var16_43, var17_54 /* !! */ );
                        }
                        if (var8_9 == null || var8_9.contains("2.5.29.32.0")) {
                            var8_9 = var14_18;
                            v8 = var6_7;
                        } else {
                            var15_26 = var8_9.iterator();
                            var16_43 = new HashSet<E>();
                            while (var15_26.hasNext()) {
                                var17_54 /* !! */  = var15_26.next();
                                if (!var14_18.contains(var17_54 /* !! */ )) continue;
                                var16_43.add(var17_54 /* !! */ );
                            }
                            var8_9 = var16_43;
                            v8 = var6_7;
                        }
                        if (v8 > 0 || var11_12 < this.cfr_renamed_145 && sprwte.cfr_renamed_286(var9_10)) {
                            var13_16 = var12_13.cfr_renamed_329();
                            while (var13_16.hasMoreElements()) {
                                var15_26 = sprdcm.cfr_renamed_23(var13_16.nextElement());
                                if (!"2.5.29.32.0".equals(var15_26.cfr_renamed_330().cfr_renamed_19())) continue;
                                try {
                                    var16_43 = sprwte.cfr_renamed_5079(var15_26.cfr_renamed_332());
                                }
                                catch (CertPathValidatorException var17_55) {
                                    var18_68 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#1!p=v2f\u0000j0s8y8z#Z#m>m"));
                                    throw new sprbre(var18_68, (Throwable)var17_55, this.cfr_renamed_31, var10_11);
                                }
                                var17_54 /* !! */  = var2_2[var11_12 - 1];
                                v9 = var18_67 = 0;
                                while (v9 < var17_54 /* !! */ .size()) {
                                    var19_78 = (sprbrh)var17_54 /* !! */ .get(var18_67);
                                    var20_81 = var19_78.getExpectedPolicies().iterator();
                                    while (var20_81.hasNext()) {
                                        v10 /* !! */  = var21_82 /* !! */  = var20_81.next();
                                        if (var21_82 /* !! */  instanceof String) {
                                            var22_83 = (String)v10 /* !! */ ;
                                        } else {
                                            if (!(v10 /* !! */  instanceof sprlem)) continue;
                                            var22_83 = ((sprlem)var21_82 /* !! */ ).cfr_renamed_19();
                                        }
                                        var23_84 = false;
                                        var24_85 = var19_78.getChildren();
                                        while (var24_85.hasNext()) {
                                            var25_86 = (sprbrh)var24_85.next();
                                            if (!var22_83.equals(var25_86.getValidPolicy())) continue;
                                            var23_84 = true;
                                        }
                                        if (var23_84) continue;
                                        var25_86 = new HashSet<String>();
                                        var25_86.add(var22_83);
                                        var26_87 = new sprbrh(new ArrayList<E>(), var11_12, (Set)var25_86, (PolicyNode)var19_78, (Set)var16_43, var22_83, false);
                                        var19_78.cfr_renamed_5082(var26_87);
                                        var2_2[var11_12].add(var26_87);
                                    }
                                    v9 = ++var18_67;
                                }
                                break block30;
                            }
                        }
                        v11 = var11_12 - 1;
                        while (v11 >= 0) {
                            var16_43 = var2_2[var15_27];
                            v12 = var17_56 = 0;
                            while (v12 < var16_43.size() && ((var18_69 = (sprbrh)var16_43.get(var17_56)).cfr_renamed_336() || (var4_5 = sprwte.cfr_renamed_5083((sprbrh)var4_5, var2_2, var18_69)) != null)) {
                                v12 = ++var17_56;
                            }
                            v11 = --var15_27;
                        }
                        var15_28 = var9_10.getCriticalExtensionOIDs();
                        if (var15_28 != null) {
                            var16_44 = var15_28.contains(sprwte.cfr_renamed_3);
                            var17_57 = var2_2[var11_12];
                            v13 = var18_70 = 0;
                            while (v13 < var17_57.size()) {
                                v14 = (sprbrh)var17_57.get(var18_70);
                                var19_78 = v14;
                                v14.cfr_renamed_338(var16_44);
                                v13 = ++var18_70;
                            }
                        }
                    }
                    if (var12_13 == null) {
                        var4_5 = null;
                    }
                    if (var5_6 <= 0 && var4_5 == null) {
                        var13_16 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJv\u000bN\u0005t\r|4w\bq\u0007a0j\u0001}"));
                        throw new sprbre((sprulk)var13_16);
                    }
                    if (var11_12 != this.cfr_renamed_145) {
                        try {
                            var13_16 = sprwte.cfr_renamed_292(var9_10, sprwte.cfr_renamed_86);
                        }
                        catch (sprlhi var14_19) {
                            var15_29 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\u0012z#k\u0001~%w\u0003z'v4h4m\u007fo>s8|(R0o\u0014g%Z#m>m"));
                            throw new sprbre(var15_29, (Throwable)var14_19, this.cfr_renamed_31, var10_11);
                        }
                        if (var13_16 != null) {
                            var14_18 = (sprszm)var13_16;
                            v15 = var15_30 = 0;
                            while (v15 < var14_18.cfr_renamed_84()) {
                                var16_45 = (sprszm)var14_18.cfr_renamed_85(var15_30);
                                var17_58 = (sprlem)var16_45.cfr_renamed_85(0);
                                var18_71 = (sprlem)var16_45.cfr_renamed_85(1);
                                if ("2.5.29.32.0".equals(var17_58.cfr_renamed_19())) {
                                    var19_78 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\rv\u0012y\bq\u0000H\u000bt\r{\u001dU\u0005h\u0014q\n\u007f"));
                                    throw new sprbre((sprulk)var19_78, this.cfr_renamed_31, var10_11);
                                }
                                if ("2.5.29.32.0".equals(var18_71.cfr_renamed_19())) {
                                    var19_78 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#18q'~=v5O>s8|(R0o!v?x"));
                                    throw new sprbre((sprulk)var19_78, this.cfr_renamed_31, var10_11);
                                }
                                v15 = ++var15_30;
                            }
                        }
                        if (var13_16 != null) {
                            var14_18 = (sprszm)var13_16;
                            var15_31 = new HashMap<Object, HashSet<E>>();
                            var16_46 = new HashSet<Object>();
                            v16 = var17_59 = 0;
                            while (v16 < var14_18.cfr_renamed_84()) {
                                var18_72 = (sprszm)var14_18.cfr_renamed_85(var17_59);
                                var19_78 = ((sprlem)var18_72.cfr_renamed_85(0)).cfr_renamed_19();
                                var20_81 = ((sprlem)var18_72.cfr_renamed_85(1)).cfr_renamed_19();
                                if (!var15_31.containsKey(var19_78)) {
                                    var21_82 /* !! */  = new HashSet<Iterator<E>>();
                                    var21_82 /* !! */ .add(var20_81);
                                    var15_31.put(var19_78, var21_82 /* !! */ );
                                    var16_46.add(var19_78);
                                } else {
                                    var21_82 /* !! */  = (Set)var15_31.get(var19_78);
                                    var21_82 /* !! */ .add(var20_81);
                                }
                                v16 = ++var17_59;
                            }
                            for (String var18_73 : var16_46) {
                                if (var7_8 > 0) {
                                    try {
                                        sprwte.cfr_renamed_339(var11_12, var2_2, var18_73, var15_31, var9_10);
                                        continue;
                                    }
                                    catch (sprlhi var19_79) {
                                        var20_81 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\u0014w\bq\u0007a!`\u0010]\u0016j\u000bj"));
                                        throw new sprbre((sprulk)var20_81, (Throwable)var19_79, this.cfr_renamed_31, var10_11);
                                    }
                                    catch (CertPathValidatorException var19_80) {
                                        var20_81 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#1!p=v2f\u0000j0s8y8z#Z#m>m"));
                                        throw new sprbre((sprulk)var20_81, (Throwable)var19_80, this.cfr_renamed_31, var10_11);
                                    }
                                }
                                if (var7_8 > 0) continue;
                                var4_5 = sprwte.cfr_renamed_5084(var11_12, var2_2, var18_73, (sprbrh)var4_5);
                            }
                        }
                        if (!sprwte.cfr_renamed_286(var9_10)) {
                            if (var5_6 != 0) {
                                --var5_6;
                            }
                            if (var7_8 != 0) {
                                --var7_8;
                            }
                            if (var6_7 != 0) {
                                --var6_7;
                            }
                        }
                        try {
                            var14_18 = (sprszm)sprwte.cfr_renamed_292(var9_10, (String)sprwte.cfr_renamed_119);
                            if (var14_18 != null) {
                                var15_32 = var14_18.cfr_renamed_329();
                                while (var15_32.hasMoreElements()) {
                                    var16_47 = (sprnvm)var15_32.nextElement();
                                    switch (var16_47.cfr_renamed_312()) {
                                        case 0: {
                                            while (false) {
                                            }
                                            var17_61 = sprktm.cfr_renamed_5085(var16_47, false).cfr_renamed_5023();
                                            if (var17_61 >= var5_6) break;
                                            var5_6 = var17_61;
                                            break;
                                        }
                                        case 1: {
                                            var17_61 = sprktm.cfr_renamed_5085(var16_47, false).cfr_renamed_5023();
                                            if (var17_61 >= var7_8) break;
                                            var7_8 = var17_61;
                                        }
                                    }
                                }
                            }
                        }
                        catch (sprlhi var14_20) {
                            var15_33 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJh\u000bt\r{\u001d[\u000bv\u0017l!`\u0010]\u0016j\u000bj"));
                            throw new sprbre(var15_33, this.cfr_renamed_31, var10_11);
                        }
                        try {
                            var14_18 = (sprktm)sprwte.cfr_renamed_292(var9_10, sprwte.cfr_renamed_112);
                            if (var14_18 != null && (var15_34 = var14_18.cfr_renamed_5023()) < var6_7) {
                                var6_7 = var15_34;
                            }
                        }
                        catch (sprlhi var14_21) {
                            var15_35 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\u0012z#k\u0001~%w\u0003z'v4h4m\u007fo>s8|(V?w8}8k\u0014g%Z#m>m"));
                            throw new sprbre(var15_35, this.cfr_renamed_31, var10_11);
                        }
                    }
                    v6 = --var10_11;
                }
                if (!sprwte.cfr_renamed_286(var9_10) && var5_6 > 0) {
                    --var5_6;
                }
                try {
                    var12_13 = (sprszm)sprwte.cfr_renamed_292(var9_10, (String)sprwte.cfr_renamed_119);
                    if (var12_13 == null) break block98;
                    var13_16 = var12_13.cfr_renamed_329();
                    while (var13_16.hasMoreElements()) {
                        var14_18 = (sprnvm)var13_16.nextElement();
                        switch (var14_18.cfr_renamed_312()) lbl-1000:
                        // 2 sources

                        {
                            case 0: {
                                if (false) ** GOTO lbl-1000
                                var15_36 = sprktm.cfr_renamed_5085(var14_18, false).cfr_renamed_5023();
                                if (var15_36 != 0) break;
                                var5_6 = 0;
                            }
                        }
                    }
                }
                catch (sprlhi var12_14) {
                    var13_16 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJh\u000bt\r{\u001d[\u000bv\u0017l!`\u0010]\u0016j\u000bj"));
                    throw new sprbre((sprulk)var13_16, this.cfr_renamed_31, var10_11);
                }
            }
            if (var4_5 == null) {
                if (this.cfr_renamed_114.isExplicitPolicyRequired()) {
                    var13_16 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\\4m%O0k9M4i8z&z#14g!s8|8k\u0001p=v2f"));
                    throw new sprbre((sprulk)var13_16, this.cfr_renamed_31, var10_11);
                }
                var12_13 = null;
                v17 = var5_6;
            } else if (sprwte.cfr_renamed_342(var1_1)) {
                if (this.cfr_renamed_114.isExplicitPolicyRequired()) {
                    if (var8_9.isEmpty()) {
                        var13_16 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\u0001`\u0014t\r{\rl4w\bq\u0007a"));
                        throw new sprbre((sprulk)var13_16, this.cfr_renamed_31, var10_11);
                    }
                    var13_16 = new HashSet<E>();
                    v18 = var14_22 = 0;
                    while (v18 < var2_2.length) {
                        var15_37 = var2_2[var14_22];
                        v19 = var16_48 = 0;
                        while (v19 < var15_37.size()) {
                            var17_62 = (sprbrh)var15_37.get(var16_48);
                            if ("2.5.29.32.0".equals(var17_62.getValidPolicy())) {
                                v20 = var17_62.getChildren();
                                while (v20.hasNext()) {
                                    v21 = var18_74;
                                    v20 = v21;
                                    var13_16.add(v21.next());
                                }
                            }
                            v19 = ++var16_48;
                        }
                        v18 = ++var14_22;
                    }
                    var14_23 = var13_16.iterator();
                    while (var14_23.hasNext()) {
                        var15_38 = (sprbrh)var14_23.next();
                        var16_49 = var15_38.getValidPolicy();
                        if (var8_9.contains(var16_49)) continue;
                    }
                    if (var4_5 != null) {
                        v22 = var15_39 = this.cfr_renamed_145 - 1;
                        while (v22 >= 0) {
                            var16_50 = var2_2[var15_39];
                            v23 = var17_63 = 0;
                            while (v23 < var16_50.size()) {
                                var18_75 = (sprbrh)var16_50.get(var17_63);
                                if (!var18_75.cfr_renamed_336()) {
                                    var4_5 = sprwte.cfr_renamed_5083((sprbrh)var4_5, var2_2, var18_75);
                                }
                                v23 = ++var17_63;
                            }
                            v22 = --var15_39;
                        }
                    }
                }
                var12_13 = var4_5;
                v17 = var5_6;
            } else {
                var13_16 = new HashSet<E>();
                v24 = var14_24 = 0;
                while (v24 < var2_2.length) {
                    var15_40 = var2_2[var14_24];
                    v25 = var16_51 = 0;
                    while (v25 < var15_40.size()) {
                        var17_64 = (sprbrh)var15_40.get(var16_51);
                        if ("2.5.29.32.0".equals(var17_64.getValidPolicy())) {
                            var18_76 = var17_64.getChildren();
                            while (var18_76.hasNext()) {
                                var19_78 = (sprbrh)var18_76.next();
                                if ("2.5.29.32.0".equals(var19_78.getValidPolicy())) continue;
                                var13_16.add(var19_78);
                            }
                        }
                        v25 = ++var16_51;
                    }
                    v24 = ++var14_24;
                }
                var14_25 = var13_16.iterator();
                while (var14_25.hasNext()) {
                    var15_41 = (sprbrh)var14_25.next();
                    var16_52 = var15_41.getValidPolicy();
                    if (var1_1.contains(var16_52)) continue;
                    var4_5 = sprwte.cfr_renamed_5083((sprbrh)var4_5, var2_2, var15_41);
                }
                if (var4_5 != null) {
                    v26 = var15_42 = this.cfr_renamed_145 - 1;
                    while (v26 >= 0) {
                        var16_53 = var2_2[var15_42];
                        v27 = var17_65 = 0;
                        while (v27 < var16_53.size()) {
                            var18_77 = (sprbrh)var16_53.get(var17_65);
                            if (!var18_77.cfr_renamed_336()) {
                                var4_5 = sprwte.cfr_renamed_5083((sprbrh)var4_5, var2_2, var18_77);
                            }
                            v27 = ++var17_65;
                        }
                        v26 = --var15_42;
                    }
                }
                var12_13 = var4_5;
                v17 = var5_6;
            }
            if (v17 <= 0 && var12_13 == null) {
                var13_16 = new sprulk("com.spire.psmodel.security.x509.CertPathReviewerMessages", sprxvc.cfr_renamed_9("\u0012z#k\u0001~%w\u0003z'v4h4m\u007fv?i0s8{\u0001p=v2f"));
                throw new sprbre((sprulk)var13_16);
            }
            var4_5 = var12_13;
            return;
        }
        catch (sprbre var12_15) {
            this.cfr_renamed_5072(var12_15.cfr_renamed_281(), var12_15.cfr_renamed_320());
            var4_5 = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_298() {
        int n;
        sprwte sprwte2 = this;
        int n2 = sprwte2.cfr_renamed_145;
        int n3 = 0;
        X509Certificate x509Certificate = null;
        int n4 = n = sprwte2.cfr_renamed_137.size() - 1;
        while (true) {
            sprktm sprktm2;
            Object object;
            Object object2;
            if (n4 <= 0) {
                Object[] objectArray = new Object[1];
                objectArray[0] = spruaf.cfr_renamed_279(n3);
                sprulk sprulk2 = new sprulk(cfr_renamed_91, sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJl\u000bl\u0005t4y\u0010p(}\n\u007f\u0010p"), objectArray);
                this.cfr_renamed_5074(sprulk2);
                return;
            }
            x509Certificate = (X509Certificate)this.cfr_renamed_137.get(n);
            if (!sprwte.cfr_renamed_286(x509Certificate)) {
                if (n2 <= 0) {
                    object2 = new sprulk(cfr_renamed_91, sprpxo.cfr_renamed_9("[\u0001j\u0010H\u0005l\fJ\u0001n\r}\u0013}\u00166\u0014y\u0010p(}\n\u007f\u0010p!`\u0010}\n|\u0001|"));
                    this.cfr_renamed_5075((sprulk)object2);
                }
                --n2;
                ++n3;
            }
            try {
                object = object2 = sprbcm.cfr_renamed_23(sprwte.cfr_renamed_292(x509Certificate, cfr_renamed_107));
            }
            catch (sprlhi sprlhi2) {
                sprulk sprulk3 = new sprulk(cfr_renamed_91, sprxvc.cfr_renamed_9("\u0012z#k\u0001~%w\u0003z'v4h4m\u007fo#p2z\"l\u001dz?x%w\u0012p?l%Z#m>m"));
                this.cfr_renamed_5072(sprulk3, n);
                object = object2 = null;
            }
            if (object != null && ((sprbcm)object2).cfr_renamed_296() && (sprktm2 = ((sprbcm)object2).cfr_renamed_5086()) != null) {
                n2 = Math.min(n2, sprktm2.cfr_renamed_5087());
            }
            n4 = --n;
        }
    }

    public Vector cfr_renamed_5076(spream arg0) {
        Vector<String> vector = new Vector<String>();
        if (arg0 != null) {
            int n;
            sprufm[] sprufmArray = arg0.cfr_renamed_309();
            int n2 = n = 0;
            while (n2 < sprufmArray.length) {
                sprigm sprigm2;
                if (sprufmArray[n].cfr_renamed_310().cfr_renamed_5078(sprufm.cfr_renamed_4) && (sprigm2 = sprufmArray[n].cfr_renamed_311()).cfr_renamed_312() == 6) {
                    String string = ((sprupm)sprigm2.cfr_renamed_313()).cfr_renamed_314();
                    vector.add(string);
                }
                n2 = ++n;
            }
        }
        return vector;
    }

    /*
     * WARNING - void declaration
     */
    public sprwte(CertPath certPath, PKIXParameters pKIXParameters) throws sprbre {
        void arg1;
        sprwte sprwte2 = this;
        sprwte2.cfr_renamed_355(certPath, (PKIXParameters)arg1);
    }

    public List[] cfr_renamed_316() {
        sprwte sprwte2 = this;
        sprwte2.cfr_renamed_317();
        return sprwte2.cfr_renamed_119;
    }

    public List cfr_renamed_353(int arg0) {
        sprwte sprwte2 = this;
        sprwte2.cfr_renamed_317();
        return sprwte2.cfr_renamed_119[arg0 + 1];
    }

    public void cfr_renamed_5075(sprulk arg0) {
        this.cfr_renamed_119[0].add(arg0);
    }

    public CertPath cfr_renamed_315() {
        return this.cfr_renamed_31;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ X509CRL cfr_renamed_304(String arg0) throws sprbre {
        X509CRL x509CRL = null;
        try {
            HttpURLConnection httpURLConnection;
            URL uRL = new URL(arg0);
            if (!uRL.getProtocol().equals("http")) {
                if (!uRL.getProtocol().equals("https")) return x509CRL;
            }
            HttpURLConnection httpURLConnection2 = httpURLConnection = (HttpURLConnection)uRL.openConnection();
            httpURLConnection2.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection2.connect();
            if (httpURLConnection.getResponseCode() != 200) throw new Exception(httpURLConnection.getResponseMessage());
            return (X509CRL)CertificateFactory.getInstance(sprxvc.cfr_renamed_9("G\u007f*a&"), "BC").generateCRL(httpURLConnection.getInputStream());
        }
        catch (Exception exception) {
            Object[] objectArray = new Object[4];
            objectArray[0] = new sprwhk(arg0);
            objectArray[1] = exception.getMessage();
            objectArray[2] = exception;
            objectArray[3] = exception.getClass().getName();
            sprulk sprulk2 = new sprulk(cfr_renamed_91, sprpxo.cfr_renamed_9("'}\u0016l4y\u0010p6}\u0012q\u0001o\u0001jJt\u000by\u0000[\u0016t q\u0017l4w\rv\u0010]\u0016j\u000bj"), objectArray);
            throw new sprbre(sprulk2);
        }
    }
}

