/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbme;
import com.spire.presentation.packages.sprege;
import com.spire.presentation.packages.sprexd;
import com.spire.presentation.packages.sprfxd;
import com.spire.presentation.packages.sprga;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprja;
import com.spire.presentation.packages.sprlod;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprnge;
import com.spire.presentation.packages.sprnlaa;
import com.spire.presentation.packages.sproje;
import com.spire.presentation.packages.sprpve;
import com.spire.presentation.packages.sprqwd;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprxbe;
import com.spire.presentation.packages.spryee;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;

public class spreud {
    private sproje cfr_renamed_1;
    private sprszd cfr_renamed_2;
    private boolean cfr_renamed_3;
    private spryee cfr_renamed_4;

    public List cfr_renamed_583() {
        return sprlod.cfr_renamed_582(this.cfr_renamed_2);
    }

    public sprtie cfr_renamed_100(sprtzd arg0) {
        if (this.cfr_renamed_2 != null) {
            return this.cfr_renamed_2.cfr_renamed_100(arg0);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_1488(sprja arg0) throws sprexd {
        sprxbe sprxbe2 = this.cfr_renamed_1.cfr_renamed_2134();
        if (!sprlod.cfr_renamed_2157(sprxbe2.cfr_renamed_79(), this.cfr_renamed_1.cfr_renamed_89())) {
            throw new sprexd(sprbme.cfr_renamed_9("9\u0006-\u0001+\u001b?\u001d/O#\u0001<\u000e&\u0006.OgO+\u0003-\u00008\u0006>\u0007'O#\u000b/\u0001>\u0006,\u0006/\u001dj\u0002#\u001c'\u000e>\f\""));
        }
        try {
            sprga sprga2 = arg0.cfr_renamed_578(sprxbe2.cfr_renamed_79());
            OutputStream outputStream = sprga2.cfr_renamed_470();
            new sprpve(outputStream).cfr_renamed_2149(sprxbe2);
            outputStream.close();
            return sprga2.cfr_renamed_1435(this.cfr_renamed_1.cfr_renamed_79().cfr_renamed_81());
        }
        catch (Exception exception) {
            throw new sprexd(new StringBuilder().insert(0, sprnlaa.cfr_renamed_9("f\tr\u0005\u007f\u00023\u0013|Gc\u0015|\u0004v\u0014`G`\u000et\tr\u0013f\u0015v]3")).append(exception.getMessage()).toString(), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sproje cfr_renamed_4230(InputStream arg0) throws IOException {
        try {
            return sproje.cfr_renamed_23(new sprgle(arg0, true).cfr_renamed_24());
        }
        catch (ClassCastException classCastException) {
            throw new sprqwd(new StringBuilder().insert(0, sprbme.cfr_renamed_9("\u0002+\u0003,\u00008\u0002/\u000bj\u000b+\u001b+Uj")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprqwd(new StringBuilder().insert(0, sprnlaa.cfr_renamed_9("\nr\u000bu\ba\nv\u00033\u0003r\u0013r]3")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
    }

    public int hashCode() {
        return this.cfr_renamed_1.hashCode();
    }

    public spreud(sproje arg0) {
        spreud spreud2 = this;
        this.cfr_renamed_1 = arg0;
        spreud2.cfr_renamed_2 = arg0.cfr_renamed_2134().cfr_renamed_98();
        spreud2.cfr_renamed_3 = spreud.cfr_renamed_4231(this.cfr_renamed_2);
        spreud spreud3 = this;
        spreud2.cfr_renamed_4 = new spryee(new sprmee(arg0.cfr_renamed_102()));
    }

    private static /* synthetic */ boolean cfr_renamed_4231(sprszd arg0) {
        if (arg0 == null) {
            return false;
        }
        sprtie sprtie2 = arg0.cfr_renamed_100(sprtie.cfr_renamed_0);
        return sprtie2 != null && sprnge.cfr_renamed_23(sprtie2.cfr_renamed_372()).cfr_renamed_2131();
    }

    public spruhe cfr_renamed_102() {
        return spruhe.cfr_renamed_23(this.cfr_renamed_1.cfr_renamed_102());
    }

    public boolean cfr_renamed_663() {
        return this.cfr_renamed_2 != null;
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_1.cfr_renamed_91();
    }

    public sprszd cfr_renamed_98() {
        return this.cfr_renamed_2;
    }

    public Collection cfr_renamed_4232() {
        Enumeration enumeration;
        sprege[] spregeArray = this.cfr_renamed_1.cfr_renamed_4232();
        ArrayList<sprfxd> arrayList = new ArrayList<sprfxd>(spregeArray.length);
        spreud spreud2 = this;
        spryee spryee2 = spreud2.cfr_renamed_4;
        Enumeration enumeration2 = enumeration = spreud2.cfr_renamed_1.cfr_renamed_2135();
        while (enumeration2.hasMoreElements()) {
            sprege sprege2 = (sprege)enumeration.nextElement();
            sprfxd sprfxd2 = new sprfxd(sprege2, this.cfr_renamed_3, spryee2);
            arrayList.add(sprfxd2);
            spryee2 = sprfxd2.cfr_renamed_4233();
            enumeration2 = enumeration;
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public spreud(byte[] byArray) throws IOException {
        this(spreud.cfr_renamed_4230(new ByteArrayInputStream((byte[])arg0)));
        void arg0;
    }

    public Set cfr_renamed_665() {
        return sprlod.cfr_renamed_4234(this.cfr_renamed_2);
    }

    public sprfxd cfr_renamed_4235(BigInteger arg0) {
        spreud spreud2 = this;
        spryee spryee2 = spreud2.cfr_renamed_4;
        Enumeration enumeration = spreud2.cfr_renamed_1.cfr_renamed_2135();
        while (enumeration.hasMoreElements()) {
            sprtie sprtie2;
            sprege sprege2 = (sprege)enumeration.nextElement();
            if (sprege2.cfr_renamed_2136().cfr_renamed_97().equals(arg0)) {
                return new sprfxd(sprege2, this.cfr_renamed_3, spryee2);
            }
            if (!this.cfr_renamed_3 || !sprege2.cfr_renamed_663() || (sprtie2 = sprege2.cfr_renamed_98().cfr_renamed_100(sprtie.cfr_renamed_105)) == null) continue;
            spryee2 = spryee.cfr_renamed_23(sprtie2.cfr_renamed_372());
        }
        return null;
    }

    public spreud(InputStream arg0) throws IOException {
        this(spreud.cfr_renamed_4230(arg0));
    }

    public Set cfr_renamed_662() {
        return sprlod.cfr_renamed_4236(this.cfr_renamed_2);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof spreud)) {
            return false;
        }
        spreud spreud2 = (spreud)arg0;
        return this.cfr_renamed_1.equals(spreud2.cfr_renamed_1);
    }

    public sproje cfr_renamed_568() {
        return this.cfr_renamed_1;
    }
}

