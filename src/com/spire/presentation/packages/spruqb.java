/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.SaveToImageOption;
import com.spire.presentation.packages.sprcje;
import com.spire.presentation.packages.sprege;
import com.spire.presentation.packages.sprfje;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprppba;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprune;
import com.spire.presentation.packages.sprwke;
import com.spire.presentation.packages.spryee;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public class spruqb
extends X509CRLEntry {
    private int cfr_renamed_1;
    private boolean cfr_renamed_2;
    private spruhe cfr_renamed_3;
    private sprege cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public X500Principal getCertificateIssuer() {
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        try {
            return new X500Principal(this.cfr_renamed_3.cfr_renamed_91());
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public int hashCode() {
        if (!this.cfr_renamed_2) {
            this.cfr_renamed_1 = super.hashCode();
            this.cfr_renamed_2 = true;
        }
        return this.cfr_renamed_1;
    }

    @Override
    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof spruqb) {
            spruqb spruqb2 = (spruqb)arg0;
            return this.cfr_renamed_4.equals(spruqb2.cfr_renamed_4);
        }
        spruqb spruqb3 = this;
        return super.equals(spruqb3);
    }

    @Override
    public Date getRevocationDate() {
        return this.cfr_renamed_4.cfr_renamed_2139().cfr_renamed_110();
    }

    /*
     * WARNING - void declaration
     */
    public spruqb(sprege sprege2, boolean bl, spruhe spruhe2) {
        void arg2;
        void arg0;
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = this.cfr_renamed_2140(bl, (spruhe)arg2);
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

    @Override
    public String toString() {
        Enumeration enumeration;
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprppba.cfr_renamed_9(",}.qng%d!f!`/f"));
        stringBuffer.append(SaveToImageOption.cfr_renamed_9(")G)G)G|\u0014l\u0015J\u0002{\u0013`\u0001`\u0004h\u0013l])")).append(this.getSerialNumber()).append(string);
        stringBuffer.append(sprppba.cfr_renamed_9("4`4`4`42q6{#u4}/z\u0004u4qz4")).append(this.getRevocationDate()).append(string);
        stringBuffer.append(SaveToImageOption.cfr_renamed_9("G)G)G)Gj\u0002{\u0013`\u0001`\u0004h\u0013l.z\u0014|\u0002{])")).append(this.getCertificateIssuer()).append(string);
        sprszd sprszd2 = this.cfr_renamed_4.cfr_renamed_98();
        if (sprszd2 != null && (enumeration = sprszd2.cfr_renamed_99()).hasMoreElements()) {
            stringBuffer.append(sprppba.cfr_renamed_9("`4`w2x\u0005z4f9Q8`%z3}/z3.")).append(string);
            while (enumeration.hasMoreElements()) {
                sprtzd sprtzd2 = (sprtzd)enumeration.nextElement();
                sprtie sprtie2 = sprszd2.cfr_renamed_100(sprtzd2);
                if (sprtie2.cfr_renamed_103() != null) {
                    byte[] byArray = sprtie2.cfr_renamed_103().cfr_renamed_186();
                    sprgle sprgle2 = new sprgle(byArray);
                    stringBuffer.append(SaveToImageOption.cfr_renamed_9("G)G)G)G)G)G)G)G)G)G)G)Gj\u0015`\u0013`\u0004h\u000b!")).append(sprtie2.cfr_renamed_101()).append(sprppba.cfr_renamed_9("i4"));
                    try {
                        if (sprtzd2.equals(sprfje.cfr_renamed_145)) {
                            stringBuffer.append(sprwke.cfr_renamed_23(sprune.cfr_renamed_23(sprgle2.cfr_renamed_24()))).append(string);
                            continue;
                        }
                        if (sprtzd2.equals(sprfje.cfr_renamed_126)) {
                            stringBuffer.append(SaveToImageOption.cfr_renamed_9("$l\u0015}\u000eo\u000ej\u0006}\u0002)\u000ez\u0014|\u0002{])")).append(spryee.cfr_renamed_23(sprgle2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        stringBuffer.append(sprtzd2.cfr_renamed_19());
                        stringBuffer.append(sprppba.cfr_renamed_9("46u,a%4}4")).append(sprcje.cfr_renamed_2138(sprgle2.cfr_renamed_24())).append(string);
                    }
                    catch (Exception exception) {
                        stringBuffer.append(sprtzd2.cfr_renamed_19());
                        stringBuffer.append(SaveToImageOption.cfr_renamed_9(")\u0011h\u000b|\u0002)Z)")).append(sprppba.cfr_renamed_9(">j>j>")).append(string);
                    }
                    continue;
                }
                stringBuffer.append(string);
            }
        }
        return stringBuffer.toString();
    }

    public Set getNonCriticalExtensionOIDs() {
        return this.cfr_renamed_78(false);
    }

    private /* synthetic */ sprtie cfr_renamed_100(sprtzd arg0) {
        sprszd sprszd2 = this.cfr_renamed_4.cfr_renamed_98();
        if (sprszd2 != null) {
            return sprszd2.cfr_renamed_100(arg0);
        }
        return null;
    }

    public Set getCriticalExtensionOIDs() {
        return this.cfr_renamed_78(true);
    }

    private /* synthetic */ spruhe cfr_renamed_2140(boolean arg0, spruhe arg1) {
        if (!arg0) {
            return null;
        }
        sprtie sprtie2 = this.cfr_renamed_100(sprtie.cfr_renamed_105);
        if (sprtie2 == null) {
            return arg1;
        }
        try {
            int n;
            sprmee[] sprmeeArray = spryee.cfr_renamed_23(sprtie2.cfr_renamed_372()).cfr_renamed_289();
            int n2 = n = 0;
            while (n2 < sprmeeArray.length) {
                if (sprmeeArray[n].cfr_renamed_312() == 4) {
                    return spruhe.cfr_renamed_23(sprmeeArray[n].cfr_renamed_313());
                }
                n2 = ++n;
            }
            return null;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public spruqb(sprege sprege2) {
        void arg0;
        spruqb spruqb2 = this;
        spruqb2.cfr_renamed_4 = arg0;
        spruqb2.cfr_renamed_3 = null;
    }

    @Override
    public BigInteger getSerialNumber() {
        return this.cfr_renamed_4.cfr_renamed_2136().cfr_renamed_97();
    }

    @Override
    public boolean hasExtensions() {
        return this.cfr_renamed_4.cfr_renamed_98() != null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getExtensionValue(String string) {
        void arg0;
        sprtie sprtie2 = this.cfr_renamed_100(new sprtzd((String)arg0));
        if (sprtie2 == null) {
            return null;
        }
        try {
            return sprtie2.cfr_renamed_103().cfr_renamed_91();
        }
        catch (Exception exception) {
            throw new RuntimeException(new StringBuilder().insert(0, SaveToImageOption.cfr_renamed_9("l\u0015{\b{Gl\tj\bm\u000eg\u0000)")).append(exception.toString()).toString());
        }
    }

    @Override
    public boolean hasUnsupportedCriticalExtension() {
        Set set = this.getCriticalExtensionOIDs();
        return set != null && !set.isEmpty();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 4 << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = 4 << 4 ^ (2 << 2 ^ 1);
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

    private /* synthetic */ Set cfr_renamed_78(boolean arg0) {
        sprszd sprszd2 = this.cfr_renamed_4.cfr_renamed_98();
        if (sprszd2 != null) {
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
}

