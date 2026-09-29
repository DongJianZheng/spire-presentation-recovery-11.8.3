/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahf;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdem;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprkye;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprsff;
import com.spire.presentation.packages.sprtbz;
import com.spire.presentation.packages.sprywe;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sprfbf {
    private sprhgm cfr_renamed_2;
    private static Set cfr_renamed_3 = Collections.unmodifiableSet(new HashSet());
    private sprdem cfr_renamed_4;

    public List cfr_renamed_583() {
        return sprkye.cfr_renamed_5274(this.cfr_renamed_2);
    }

    public BigInteger cfr_renamed_596() {
        if (this.cfr_renamed_4.cfr_renamed_596() != null) {
            return this.cfr_renamed_4.cfr_renamed_596().cfr_renamed_97();
        }
        return null;
    }

    private /* synthetic */ Set cfr_renamed_645(Set arg0) {
        if (arg0 == null) {
            return arg0;
        }
        HashSet<sprlem> hashSet = new HashSet<sprlem>(arg0.size());
        for (Object e : arg0) {
            if (e instanceof String) {
                hashSet.add(new sprlem((String)e));
                continue;
            }
            hashSet.add((sprlem)e);
        }
        return hashSet;
    }

    public sprhgm cfr_renamed_98() {
        return this.cfr_renamed_2;
    }

    public boolean cfr_renamed_609() {
        if (this.cfr_renamed_4.cfr_renamed_609() != null) {
            return this.cfr_renamed_4.cfr_renamed_609().cfr_renamed_587();
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprdem cfr_renamed_664(InputStream arg0) throws IOException {
        try {
            return sprdem.cfr_renamed_23(new sprrzm(arg0).cfr_renamed_24());
        }
        catch (ClassCastException classCastException) {
            throw new IOException(new StringBuilder().insert(0, sprtbz.cfr_renamed_9(" H!O\"[ L)\t?L<\\(Z9\u0013m")).append(classCastException).toString());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException(new StringBuilder().insert(0, sprywe.cfr_renamed_9(">8??<+><7y!<\",6*'cs")).append(illegalArgumentException).toString());
        }
    }

    public sprlem cfr_renamed_608() {
        if (this.cfr_renamed_4.cfr_renamed_608() != null) {
            return this.cfr_renamed_4.cfr_renamed_608();
        }
        return null;
    }

    public sprddm cfr_renamed_5282() {
        return this.cfr_renamed_4.cfr_renamed_592().cfr_renamed_579();
    }

    /*
     * WARNING - void declaration
     */
    public sprfbf(byte[] byArray) throws IOException {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    public void cfr_renamed_639(Set arg0, Set arg1, Set arg2) throws sprahf {
        int n;
        sprfbf sprfbf2 = this;
        arg0 = sprfbf2.cfr_renamed_645(arg0);
        arg1 = sprfbf2.cfr_renamed_645(arg1);
        arg2 = sprfbf2.cfr_renamed_645(arg2);
        if (!arg0.contains(this.cfr_renamed_591())) {
            throw new sprsff(sprtbz.cfr_renamed_9("[(X8L>]mJ\"G9H$G>\t8G&G\"^#\t,E*F?@9A "), 128);
        }
        if (arg1 != null && this.cfr_renamed_608() != null && !arg1.contains(this.cfr_renamed_608())) {
            throw new sprsff(sprywe.cfr_renamed_9("!<\",6*'y06=-20=*s,=2=6$7s)<5::*"), 256);
        }
        if (this.cfr_renamed_98() != null && arg2 != null) {
            Enumeration enumeration = this.cfr_renamed_98().cfr_renamed_99();
            while (enumeration.hasMoreElements()) {
                sprlem sprlem2 = (sprlem)enumeration.nextElement();
                if (arg2.contains(sprlem2)) continue;
                throw new sprsff(sprtbz.cfr_renamed_9("[(X8L>]mJ\"G9H$G>\t8G&G\"^#\t(Q9L#Z$F#"), 0x800000);
            }
        }
        if ((n = sprkye.cfr_renamed_572(this.cfr_renamed_591().cfr_renamed_19())) != this.cfr_renamed_581().length) {
            throw new sprsff(sprywe.cfr_renamed_9(":4#+:7'y704< -s-;<s.!6=>s5674-;"), 4);
        }
    }

    public sprlem cfr_renamed_591() {
        return this.cfr_renamed_4.cfr_renamed_592().cfr_renamed_579().cfr_renamed_593();
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_4.cfr_renamed_3().cfr_renamed_5023();
    }

    public Set cfr_renamed_665() {
        if (this.cfr_renamed_2 == null) {
            return cfr_renamed_3;
        }
        return Collections.unmodifiableSet(new HashSet<sprlem>(Arrays.asList(this.cfr_renamed_2.cfr_renamed_665())));
    }

    /*
     * WARNING - void declaration
     */
    public sprfbf(sprdem sprdem2) {
        void arg0;
        sprfbf sprfbf2 = this;
        sprfbf2.cfr_renamed_4 = arg0;
        sprfbf2.cfr_renamed_2 = sprdem2.cfr_renamed_98();
    }

    public sprrdm cfr_renamed_5024(sprlem arg0) {
        if (this.cfr_renamed_2 != null) {
            return this.cfr_renamed_2.cfr_renamed_5024(arg0);
        }
        return null;
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_91();
    }

    public Set cfr_renamed_662() {
        if (this.cfr_renamed_2 == null) {
            return cfr_renamed_3;
        }
        return Collections.unmodifiableSet(new HashSet<sprlem>(Arrays.asList(this.cfr_renamed_2.cfr_renamed_662())));
    }

    public boolean cfr_renamed_663() {
        return this.cfr_renamed_2 != null;
    }

    public byte[] cfr_renamed_581() {
        return this.cfr_renamed_4.cfr_renamed_592().cfr_renamed_595();
    }

    public sprfbf(InputStream arg0) throws IOException {
        this(sprfbf.cfr_renamed_664(arg0));
    }
}

