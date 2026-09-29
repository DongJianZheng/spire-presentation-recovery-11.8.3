/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprccm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.sprge;
import com.spire.presentation.packages.sprgkaa;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhk;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprnfm;
import com.spire.presentation.packages.sprpim;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprssa;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtfm;
import com.spire.presentation.packages.sprunl;
import com.spire.presentation.packages.sprwzl;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxsl;
import com.spire.presentation.packages.sprznl;
import com.spire.presentation.packages.sprzxl;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;

public class sprpxl
implements sprjn,
Serializable {
    private static final long cfr_renamed_0 = 20170722001L;
    private transient spraem cfr_renamed_1;
    private transient sprhgm cfr_renamed_2;
    private transient sprffm cfr_renamed_3;
    private transient boolean cfr_renamed_4;

    public Date cfr_renamed_2132() {
        return this.cfr_renamed_3.cfr_renamed_2132().cfr_renamed_110();
    }

    public sprffm cfr_renamed_568() {
        return this.cfr_renamed_3;
    }

    public Collection cfr_renamed_4232() {
        Enumeration enumeration;
        sprpim[] sprpimArray = this.cfr_renamed_3.cfr_renamed_4232();
        ArrayList<sprxsl> arrayList = new ArrayList<sprxsl>(sprpimArray.length);
        sprpxl sprpxl2 = this;
        spraem spraem2 = sprpxl2.cfr_renamed_1;
        Enumeration enumeration2 = enumeration = sprpxl2.cfr_renamed_3.cfr_renamed_2135();
        while (enumeration2.hasMoreElements()) {
            sprpim sprpim2 = (sprpim)enumeration.nextElement();
            sprxsl sprxsl2 = new sprxsl(sprpim2, this.cfr_renamed_4, spraem2);
            arrayList.add(sprxsl2);
            spraem2 = sprxsl2.cfr_renamed_4233();
            enumeration2 = enumeration;
        }
        return arrayList;
    }

    private /* synthetic */ void cfr_renamed_10875(sprffm arg0) {
        sprpxl sprpxl2 = this;
        this.cfr_renamed_3 = arg0;
        sprpxl2.cfr_renamed_2 = arg0.cfr_renamed_2134().cfr_renamed_98();
        sprpxl2.cfr_renamed_4 = sprpxl.cfr_renamed_10876(this.cfr_renamed_2);
        sprpxl sprpxl3 = this;
        sprpxl2.cfr_renamed_1 = new spraem(new sprigm(arg0.cfr_renamed_102()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_10877(sprhk arg0) throws sprunl {
        sprtfm sprtfm2 = this.cfr_renamed_3.cfr_renamed_2134();
        sprccm sprccm2 = sprccm.cfr_renamed_5322(sprtfm2.cfr_renamed_98());
        sprnfm sprnfm2 = sprnfm.cfr_renamed_5322(sprtfm2.cfr_renamed_98());
        try {
            int n;
            sprge sprge2 = arg0.cfr_renamed_5279(sprddm.cfr_renamed_23(sprccm2.cfr_renamed_119()));
            OutputStream outputStream = sprge2.cfr_renamed_470();
            sprszm sprszm2 = sprszm.cfr_renamed_23(sprtfm2.cfr_renamed_119());
            sprrvm sprrvm2 = new sprrvm();
            int n2 = 1;
            if (sprszm2.cfr_renamed_85(0) instanceof sprktm) {
                sprrvm2.cfr_renamed_5004(sprszm2.cfr_renamed_85(0));
            }
            int n3 = n = ++n2;
            while (true) {
                if (n3 == sprszm2.cfr_renamed_84() - 1) {
                    sprrvm2.cfr_renamed_5004(sprzxl.cfr_renamed_10878(0, sprtfm2.cfr_renamed_98()));
                    new sprcen(sprrvm2).cfr_renamed_8489(outputStream, "DER");
                    outputStream.close();
                    return sprge2.cfr_renamed_1435(sprnfm2.cfr_renamed_79().cfr_renamed_186());
                }
                sprrvm2.cfr_renamed_5004(sprszm2.cfr_renamed_85(n++));
                n3 = n;
            }
        }
        catch (Exception exception) {
            throw new sprunl(new StringBuilder().insert(0, sprssa.cfr_renamed_9("54!8,?`./z0(/9%)3z33'4!.5(%``")).append(exception.getMessage()).toString(), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_7374(sprhk arg0) throws sprunl {
        sprtfm sprtfm2 = this.cfr_renamed_3.cfr_renamed_2134();
        if (!sprzxl.cfr_renamed_9062(sprtfm2.cfr_renamed_79(), this.cfr_renamed_3.cfr_renamed_89())) {
            throw new sprunl(sprgkaa.cfr_renamed_9("\\&H!N;Z=JoF!Y.C&Ko\u0002oN#H ]&['BoF+J![&I&J=\u000f\"F<B.[,G"));
        }
        try {
            OutputStream outputStream;
            sprge sprge2 = arg0.cfr_renamed_5279(sprtfm2.cfr_renamed_79());
            OutputStream outputStream2 = outputStream = sprge2.cfr_renamed_470();
            sprtfm2.cfr_renamed_8489(outputStream2, "DER");
            outputStream2.close();
            return sprge2.cfr_renamed_1435(this.cfr_renamed_3.cfr_renamed_79().cfr_renamed_186());
        }
        catch (Exception exception) {
            throw new sprunl(new StringBuilder().insert(0, sprssa.cfr_renamed_9("54!8,?`./z0(/9%)3z33'4!.5(%``")).append(exception.getMessage()).toString(), exception);
        }
    }

    private static /* synthetic */ boolean cfr_renamed_10876(sprhgm arg0) {
        if (arg0 == null) {
            return false;
        }
        sprrdm sprrdm2 = arg0.cfr_renamed_5024(sprrdm.cfr_renamed_96);
        return sprrdm2 != null && sprwzl.cfr_renamed_23(sprrdm2.cfr_renamed_372()).cfr_renamed_2131();
    }

    public sprnbm cfr_renamed_102() {
        return sprnbm.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_102());
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_91();
    }

    public sprpxl(sprffm sprffm2) {
        sprpxl sprpxl2 = this;
        sprpxl2.cfr_renamed_10875(sprffm2);
    }

    public sprrdm cfr_renamed_5024(sprlem arg0) {
        if (this.cfr_renamed_2 != null) {
            return this.cfr_renamed_2.cfr_renamed_5024(arg0);
        }
        return null;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprpxl)) {
            return false;
        }
        sprpxl sprpxl2 = (sprpxl)arg0;
        return this.cfr_renamed_3.equals(sprpxl2.cfr_renamed_3);
    }

    public boolean cfr_renamed_663() {
        return this.cfr_renamed_2 != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprffm cfr_renamed_4230(InputStream arg0) throws IOException {
        try {
            sprxgf sprxgf2 = new sprrzm(arg0, true).cfr_renamed_24();
            if (sprxgf2 == null) {
                throw new IOException(sprgkaa.cfr_renamed_9("!@oL A;J![oI Z!K"));
            }
            return sprffm.cfr_renamed_23(sprxgf2);
        }
        catch (ClassCastException classCastException) {
            throw new sprznl(new StringBuilder().insert(0, sprssa.cfr_renamed_9("7!6&527%>`>!.!``")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprznl(new StringBuilder().insert(0, sprgkaa.cfr_renamed_9("\"N#I ]\"J+\u000f+N;Nu\u000f")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        v0.defaultWriteObject();
        v0.writeObject(this.cfr_renamed_91());
    }

    public List cfr_renamed_583() {
        return sprzxl.cfr_renamed_5274(this.cfr_renamed_2);
    }

    public Set cfr_renamed_665() {
        return sprzxl.cfr_renamed_10879(this.cfr_renamed_2);
    }

    public sprpxl(InputStream arg0) throws IOException {
        this(sprpxl.cfr_renamed_4230(arg0));
    }

    public sprhgm cfr_renamed_98() {
        return this.cfr_renamed_2;
    }

    public Date cfr_renamed_2133() {
        sprrcm sprrcm2 = this.cfr_renamed_3.cfr_renamed_2133();
        if (sprrcm2 != null) {
            return sprrcm2.cfr_renamed_110();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprpxl(byte[] byArray) throws IOException {
        this(sprpxl.cfr_renamed_4230(new ByteArrayInputStream((byte[])arg0)));
        void arg0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        void arg0;
        void v0 = arg0;
        v0.defaultReadObject();
        this.cfr_renamed_10875(sprffm.cfr_renamed_23(v0.readObject()));
    }

    public int hashCode() {
        return this.cfr_renamed_3.hashCode();
    }

    public Set cfr_renamed_662() {
        return sprzxl.cfr_renamed_10880(this.cfr_renamed_2);
    }

    public sprxsl cfr_renamed_4235(BigInteger arg0) {
        sprpxl sprpxl2 = this;
        spraem spraem2 = sprpxl2.cfr_renamed_1;
        Enumeration enumeration = sprpxl2.cfr_renamed_3.cfr_renamed_2135();
        while (enumeration.hasMoreElements()) {
            sprrdm sprrdm2;
            sprpim sprpim2 = (sprpim)enumeration.nextElement();
            if (sprpim2.cfr_renamed_2136().cfr_renamed_5103(arg0)) {
                return new sprxsl(sprpim2, this.cfr_renamed_4, spraem2);
            }
            if (!this.cfr_renamed_4 || !sprpim2.cfr_renamed_663() || (sprrdm2 = sprpim2.cfr_renamed_98().cfr_renamed_5024(sprrdm.cfr_renamed_119)) == null) continue;
            spraem2 = spraem.cfr_renamed_23(sprrdm2.cfr_renamed_372());
        }
        return null;
    }
}

