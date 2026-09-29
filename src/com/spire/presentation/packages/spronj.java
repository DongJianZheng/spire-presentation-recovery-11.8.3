/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.spregm;
import com.spire.presentation.packages.sprfzl;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprjas;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprpgp;
import com.spire.presentation.packages.sprpim;
import com.spire.presentation.packages.sprqvg;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrzm;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public class spronj
extends X509CRLEntry {
    private volatile boolean cfr_renamed_1;
    private sprnbm cfr_renamed_2;
    private sprpim cfr_renamed_3;
    private volatile int cfr_renamed_4;

    @Override
    public Date getRevocationDate() {
        return this.cfr_renamed_3.cfr_renamed_2139().cfr_renamed_110();
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
        sprrdm sprrdm2 = this.cfr_renamed_5024(new sprlem((String)arg0));
        if (sprrdm2 == null) {
            return null;
        }
        try {
            return sprrdm2.cfr_renamed_103().cfr_renamed_91();
        }
        catch (Exception exception) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprjas.cfr_renamed_9("F]`@sQjJm\u0005fK`JgLmB9\u0005")).append(exception.toString()).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public spronj(sprpim sprpim2) {
        void arg0;
        spronj spronj2 = this;
        spronj2.cfr_renamed_3 = arg0;
        spronj2.cfr_renamed_2 = null;
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

    @Override
    public int hashCode() {
        if (!this.cfr_renamed_1) {
            this.cfr_renamed_4 = super.hashCode();
            this.cfr_renamed_1 = true;
        }
        return this.cfr_renamed_4;
    }

    private /* synthetic */ sprrdm cfr_renamed_5024(sprlem arg0) {
        sprhgm sprhgm2 = this.cfr_renamed_3.cfr_renamed_98();
        if (sprhgm2 != null) {
            return sprhgm2.cfr_renamed_5024(arg0);
        }
        return null;
    }

    @Override
    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof spronj) {
            spronj spronj2 = (spronj)arg0;
            if (this.cfr_renamed_1 && spronj2.cfr_renamed_1 && this.cfr_renamed_4 != spronj2.cfr_renamed_4) {
                return false;
            }
            return this.cfr_renamed_3.equals(spronj2.cfr_renamed_3);
        }
        spronj spronj3 = this;
        return super.equals(spronj3);
    }

    @Override
    public BigInteger getSerialNumber() {
        return this.cfr_renamed_3.cfr_renamed_2136().cfr_renamed_97();
    }

    private /* synthetic */ Set cfr_renamed_78(boolean arg0) {
        sprhgm sprhgm2 = this.cfr_renamed_3.cfr_renamed_98();
        if (sprhgm2 != null) {
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

    public Set getNonCriticalExtensionOIDs() {
        return this.cfr_renamed_78(false);
    }

    /*
     * WARNING - void declaration
     */
    public spronj(sprpim sprpim2, boolean bl, sprnbm sprnbm2) {
        void arg2;
        void arg0;
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_2 = this.cfr_renamed_9061(bl, (sprnbm)arg2);
    }

    public Set getCriticalExtensionOIDs() {
        return this.cfr_renamed_78(true);
    }

    @Override
    public String toString() {
        Enumeration enumeration;
        StringBuffer stringBuffer = new StringBuffer();
        String string = sprkoe.cfr_renamed_5114();
        stringBuffer.append(sprpgp.cfr_renamed_9("g\u0012g\u0012g\u00122A\"@\u0004W5F.T.Q&F\"\bg")).append(this.getSerialNumber()).append(string);
        stringBuffer.append(sprjas.cfr_renamed_9("\u0005#\u0005#\u0005#\u0005q@uJ`DwLlKGDw@9\u0005")).append(this.getRevocationDate()).append(string);
        stringBuffer.append(sprpgp.cfr_renamed_9("\u0012g\u0012g\u0012g\u0012$W5F.T.Q&F\"{4A2W5\bg")).append(this.getCertificateIssuer()).append(string);
        sprhgm sprhgm2 = this.cfr_renamed_3.cfr_renamed_98();
        if (sprhgm2 != null && (enumeration = sprhgm2.cfr_renamed_99()).hasMoreElements()) {
            stringBuffer.append(sprjas.cfr_renamed_9("#\u0005#FqIFKwWz`{QfKpLlKp\u001f")).append(string);
            while (enumeration.hasMoreElements()) {
                sprlem sprlem2 = (sprlem)enumeration.nextElement();
                sprrdm sprrdm2 = sprhgm2.cfr_renamed_5024(sprlem2);
                if (sprrdm2.cfr_renamed_103() != null) {
                    byte[] byArray = sprrdm2.cfr_renamed_103().cfr_renamed_186();
                    sprrzm sprrzm2 = new sprrzm(byArray);
                    stringBuffer.append(sprpgp.cfr_renamed_9("\u0012g\u0012g\u0012g\u0012g\u0012g\u0012g\u0012g\u0012g\u0012g\u0012g\u0012g\u0012$@.F.Q&^o")).append(sprrdm2.cfr_renamed_101()).append(sprjas.cfr_renamed_9("*\u0005"));
                    try {
                        if (sprlem2.cfr_renamed_5078(sprrdm.cfr_renamed_953)) {
                            stringBuffer.append(sprfzl.cfr_renamed_23(sprqvg.cfr_renamed_23(sprrzm2.cfr_renamed_24()))).append(string);
                            continue;
                        }
                        if (sprlem2.cfr_renamed_5078(sprrdm.cfr_renamed_119)) {
                            stringBuffer.append(sprpgp.cfr_renamed_9("q\"@3[![$S3Wg[4A2W5\bg")).append(spraem.cfr_renamed_23(sprrzm2.cfr_renamed_24())).append(string);
                            continue;
                        }
                        stringBuffer.append(sprlem2.cfr_renamed_19());
                        stringBuffer.append(sprjas.cfr_renamed_9("\u0005uDoPf\u0005>\u0005")).append(spregm.cfr_renamed_2138(sprrzm2.cfr_renamed_24())).append(string);
                    }
                    catch (Exception exception) {
                        stringBuffer.append(sprlem2.cfr_renamed_19());
                        stringBuffer.append(sprpgp.cfr_renamed_9("gD&^2Wg\u000fg")).append(sprjas.cfr_renamed_9("\u000f)\u000f)\u000f")).append(string);
                    }
                    continue;
                }
                stringBuffer.append(string);
            }
        }
        return stringBuffer.toString();
    }

    private /* synthetic */ sprnbm cfr_renamed_9061(boolean arg0, sprnbm arg1) {
        if (!arg0) {
            return null;
        }
        sprrdm sprrdm2 = this.cfr_renamed_5024(sprrdm.cfr_renamed_119);
        if (sprrdm2 == null) {
            return arg1;
        }
        try {
            int n;
            sprigm[] sprigmArray = spraem.cfr_renamed_23(sprrdm2.cfr_renamed_372()).cfr_renamed_289();
            int n2 = n = 0;
            while (n2 < sprigmArray.length) {
                if (sprigmArray[n].cfr_renamed_312() == 4) {
                    return sprnbm.cfr_renamed_23(sprigmArray[n].cfr_renamed_313());
                }
                n2 = ++n;
            }
            return null;
        }
        catch (Exception exception) {
            return null;
        }
    }

    @Override
    public boolean hasExtensions() {
        return this.cfr_renamed_3.cfr_renamed_98() != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() throws CRLException {
        try {
            return this.cfr_renamed_3.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new CRLException(iOException.toString());
        }
    }
}

