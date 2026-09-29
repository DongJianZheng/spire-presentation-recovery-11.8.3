/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcje;
import com.spire.presentation.packages.sprege;
import com.spire.presentation.packages.sprfje;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprldz;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprnuba;
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

public class sprcpc
extends X509CRLEntry {
    private int cfr_renamed_1;
    private spruhe cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprege cfr_renamed_4;

    private /* synthetic */ sprtie cfr_renamed_100(sprtzd arg0) {
        sprszd sprszd2 = this.cfr_renamed_4.cfr_renamed_98();
        if (sprszd2 != null) {
            return sprszd2.cfr_renamed_100(arg0);
        }
        return null;
    }

    @Override
    public String toString() {
        Enumeration enumeration;
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprnuba.cfr_renamed_9(",\u0011.\u001dn\u000b%\b!\n!\f/\n"));
        stringBuffer.append(sprldz.cfr_renamed_9("ososos: *!\f6='&5&0.'*io")).append(this.getSerialNumber()).append(string);
        stringBuffer.append(sprnuba.cfr_renamed_9("X`X`X`X2\u001d6\u0017#\u00194\u0011/\u0016\u0004\u00194\u001dzX")).append(this.getRevocationDate()).append(string);
        stringBuffer.append(sprldz.cfr_renamed_9("sososos,6='&5&0.'*\u001a< :6=io")).append(this.getCertificateIssuer()).append(string);
        sprszd sprszd2 = this.cfr_renamed_4.cfr_renamed_98();
        if (sprszd2 != null && (enumeration = sprszd2.cfr_renamed_99()).hasMoreElements()) {
            stringBuffer.append(sprnuba.cfr_renamed_9("`X`\u001b2\u0014\u0005\u00164\n9=8\f%\u00163\u0011/\u00163B")).append(string);
            while (enumeration.hasMoreElements()) {
                sprtzd sprtzd2 = (sprtzd)enumeration.nextElement();
                sprtie sprtie2 = sprszd2.cfr_renamed_100(sprtzd2);
                if (sprtie2.cfr_renamed_103() != null) {
                    byte[] byArray = sprtie2.cfr_renamed_103().cfr_renamed_186();
                    sprgle sprgle2 = new sprgle(byArray);
                    stringBuffer.append(sprldz.cfr_renamed_9("sososososososososososos,!&'&0.?g")).append(sprtie2.cfr_renamed_101()).append(sprnuba.cfr_renamed_9("iX"));
                    try {
                        if (sprtzd2.equals(sprfje.cfr_renamed_145)) {
                            stringBuffer.append(sprwke.cfr_renamed_23(sprune.cfr_renamed_23(sprgle2.cfr_renamed_24()))).append(string);
                            continue;
                        }
                        if (sprtzd2.equals(sprfje.cfr_renamed_126)) {
                            stringBuffer.append(sprldz.cfr_renamed_9("\u0010*!;:):,2;6o:< :6=io")).append(spryee.cfr_renamed_23(sprgle2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        stringBuffer.append(sprtzd2.cfr_renamed_19());
                        stringBuffer.append(sprnuba.cfr_renamed_9("X6\u0019,\r%X}X")).append(sprcje.cfr_renamed_2138(sprgle2.cfr_renamed_24())).append(string);
                    }
                    catch (Exception exception) {
                        stringBuffer.append(sprtzd2.cfr_renamed_19());
                        stringBuffer.append(sprldz.cfr_renamed_9("o%.?:6ono")).append(sprnuba.cfr_renamed_9("RjRjR")).append(string);
                    }
                    continue;
                }
                stringBuffer.append(string);
            }
        }
        return stringBuffer.toString();
    }

    @Override
    public int hashCode() {
        if (!this.cfr_renamed_3) {
            this.cfr_renamed_1 = super.hashCode();
            this.cfr_renamed_3 = true;
        }
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprcpc(sprege sprege2) {
        void arg0;
        sprcpc sprcpc2 = this;
        sprcpc2.cfr_renamed_4 = arg0;
        sprcpc2.cfr_renamed_2 = null;
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

    public Set getNonCriticalExtensionOIDs() {
        return this.cfr_renamed_78(false);
    }

    @Override
    public Date getRevocationDate() {
        return this.cfr_renamed_4.cfr_renamed_2139().cfr_renamed_110();
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

    public Set getCriticalExtensionOIDs() {
        return this.cfr_renamed_78(true);
    }

    @Override
    public BigInteger getSerialNumber() {
        return this.cfr_renamed_4.cfr_renamed_2136().cfr_renamed_97();
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
            throw new RuntimeException(new StringBuilder().insert(0, sprldz.cfr_renamed_9("*!=<=s*=,<+:!4o")).append(exception.toString()).toString());
        }
    }

    @Override
    public boolean hasExtensions() {
        return this.cfr_renamed_4.cfr_renamed_98() != null;
    }

    /*
     * WARNING - void declaration
     */
    public sprcpc(sprege sprege2, boolean bl, spruhe spruhe2) {
        void arg2;
        void arg0;
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_2 = this.cfr_renamed_2140(bl, (spruhe)arg2);
    }

    @Override
    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprcpc) {
            sprcpc sprcpc2 = (sprcpc)arg0;
            return this.cfr_renamed_4.equals(sprcpc2.cfr_renamed_4);
        }
        sprcpc sprcpc3 = this;
        return super.equals(sprcpc3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public X500Principal getCertificateIssuer() {
        if (this.cfr_renamed_2 == null) {
            return null;
        }
        try {
            return new X500Principal(this.cfr_renamed_2.cfr_renamed_91());
        }
        catch (IOException iOException) {
            return null;
        }
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

    @Override
    public boolean hasUnsupportedCriticalExtension() {
        Set set = this.getCriticalExtensionOIDs();
        return set != null && !set.isEmpty();
    }
}

