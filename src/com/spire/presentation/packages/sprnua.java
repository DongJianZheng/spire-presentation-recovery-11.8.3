/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprabl;
import com.spire.presentation.packages.sprawc;
import com.spire.presentation.packages.spreva;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprhie;
import com.spire.presentation.packages.sprpua;
import com.spire.presentation.packages.sprrua;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
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

public class sprnua {
    private static Set cfr_renamed_2 = Collections.unmodifiableSet(new HashSet());
    private sprhie cfr_renamed_3;
    private sprszd cfr_renamed_4;

    public Set cfr_renamed_662() {
        if (this.cfr_renamed_4 == null) {
            return cfr_renamed_2;
        }
        return Collections.unmodifiableSet(new HashSet<sprtzd>(Arrays.asList(this.cfr_renamed_4.cfr_renamed_662())));
    }

    public List cfr_renamed_583() {
        return sprpua.cfr_renamed_582(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprnua(byte[] byArray) throws IOException {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    public boolean cfr_renamed_663() {
        return this.cfr_renamed_4 != null;
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_91();
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_3.cfr_renamed_3().cfr_renamed_97().intValue();
    }

    public sprszd cfr_renamed_98() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprnua(sprhie sprhie2) {
        void arg0;
        sprnua sprnua2 = this;
        sprnua2.cfr_renamed_3 = arg0;
        sprnua2.cfr_renamed_4 = sprhie2.cfr_renamed_98();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprhie cfr_renamed_664(InputStream arg0) throws IOException {
        try {
            return sprhie.cfr_renamed_23(new sprgle(arg0).cfr_renamed_24());
        }
        catch (ClassCastException classCastException) {
            throw new IOException(new StringBuilder().insert(0, sprabl.cfr_renamed_9("F=G:D.F9O|Y9Z)N/_f\u000b")).append(classCastException).toString());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException(new StringBuilder().insert(0, sprawc.cfr_renamed_9("lBmEnQlFe\u0003sFpVdPu\u0019!")).append(illegalArgumentException).toString());
        }
    }

    public sprtie cfr_renamed_100(sprtzd arg0) {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_100(arg0);
        }
        return null;
    }

    public BigInteger cfr_renamed_596() {
        if (this.cfr_renamed_3.cfr_renamed_596() != null) {
            return this.cfr_renamed_3.cfr_renamed_596().cfr_renamed_97();
        }
        return null;
    }

    public boolean cfr_renamed_609() {
        if (this.cfr_renamed_3.cfr_renamed_609() != null) {
            return this.cfr_renamed_3.cfr_renamed_609().cfr_renamed_587();
        }
        return false;
    }

    public sprtzd cfr_renamed_591() {
        return this.cfr_renamed_3.cfr_renamed_592().cfr_renamed_579().cfr_renamed_593();
    }

    public void cfr_renamed_639(Set arg0, Set arg1, Set arg2) throws sprrua {
        int n;
        sprnua sprnua2 = this;
        arg0 = sprnua2.cfr_renamed_645(arg0);
        arg1 = sprnua2.cfr_renamed_645(arg1);
        arg2 = sprnua2.cfr_renamed_645(arg2);
        if (!arg0.contains(this.cfr_renamed_591())) {
            throw new spreva(sprabl.cfr_renamed_9("Y9Z)N/_|H3E(J5E/\u000b)E7E3\\2\u000b=G;D.B(C1\u0005"), 128);
        }
        if (arg1 != null && this.cfr_renamed_608() != null && !arg1.contains(this.cfr_renamed_608())) {
            throw new spreva(sprawc.cfr_renamed_9("QdRtFrW!@nMuBhMr\u0003tMjMnTo\u0003qLmJbZ/"), 256);
        }
        if (this.cfr_renamed_98() != null && arg2 != null) {
            Enumeration enumeration = this.cfr_renamed_98().cfr_renamed_99();
            while (enumeration.hasMoreElements()) {
                String string = ((sprtzd)enumeration.nextElement()).cfr_renamed_19();
                if (arg2.contains(string)) continue;
                throw new spreva(sprabl.cfr_renamed_9("Y9Z)N/_|H3E(J5E/\u000b)E7E3\\2\u000b9S(N2X5D2\u0005"), 0x800000);
            }
        }
        if ((n = sprpua.cfr_renamed_572(this.cfr_renamed_591().cfr_renamed_19())) != this.cfr_renamed_581().length) {
            throw new spreva(sprawc.cfr_renamed_9("JlSsJoW!GhDdPu\u0003uKd\u0003vQnMf\u0003mFoDuK/"), 4);
        }
    }

    public sprtzd cfr_renamed_608() {
        if (this.cfr_renamed_3.cfr_renamed_608() != null) {
            return this.cfr_renamed_3.cfr_renamed_608();
        }
        return null;
    }

    public sprnua(InputStream arg0) throws IOException {
        this(sprnua.cfr_renamed_664(arg0));
    }

    private /* synthetic */ Set cfr_renamed_645(Set arg0) {
        if (arg0 == null) {
            return arg0;
        }
        HashSet<sprtzd> hashSet = new HashSet<sprtzd>(arg0.size());
        for (Object e : arg0) {
            if (e instanceof String) {
                hashSet.add(new sprtzd((String)e));
                continue;
            }
            hashSet.add((sprtzd)e);
        }
        return hashSet;
    }

    public byte[] cfr_renamed_581() {
        return this.cfr_renamed_3.cfr_renamed_592().cfr_renamed_595();
    }

    public Set cfr_renamed_665() {
        if (this.cfr_renamed_4 == null) {
            return cfr_renamed_2;
        }
        return Collections.unmodifiableSet(new HashSet<sprtzd>(Arrays.asList(this.cfr_renamed_4.cfr_renamed_665())));
    }
}

