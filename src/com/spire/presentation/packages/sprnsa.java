/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.sprbva;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprdve;
import com.spire.presentation.packages.sprdwe;
import com.spire.presentation.packages.spreqe;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprjua;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprpwa;
import com.spire.presentation.packages.sprqre;
import com.spire.presentation.packages.sprtma;
import com.spire.presentation.packages.sprvte;
import com.spire.presentation.packages.sprvub;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

public class sprnsa {
    private sprpwa cfr_renamed_2;
    private sprdve cfr_renamed_3;
    private sprnte cfr_renamed_4;

    public byte[] cfr_renamed_679(sprpa arg0) throws sprlqd {
        return this.cfr_renamed_2.cfr_renamed_679(arg0);
    }

    public String cfr_renamed_675() {
        return this.cfr_renamed_2.cfr_renamed_675();
    }

    public void cfr_renamed_677(sprpa arg0) throws sprlqd {
        this.cfr_renamed_2.cfr_renamed_677(arg0);
    }

    private /* synthetic */ void cfr_renamed_702(sprnte arg0) {
        this.cfr_renamed_4 = arg0;
        if (!sprgl.cfr_renamed_93.equals(arg0.cfr_renamed_696())) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprtma.cfr_renamed_9("\u0017l6k5\u007f7h>-9b4y?c.-w-.t*hz`/~.-8hz")).append(sprgl.cfr_renamed_93.cfr_renamed_19()).toString());
        }
        sprnsa sprnsa2 = this;
        sprnsa2.cfr_renamed_3 = sprdve.cfr_renamed_23(arg0.cfr_renamed_480());
        sprnsa2.cfr_renamed_2 = new sprpwa(this.cfr_renamed_3);
    }

    public String cfr_renamed_678() {
        return this.cfr_renamed_2.cfr_renamed_678();
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_91();
    }

    public void cfr_renamed_682(spraa arg0, byte[] arg1, sprbva arg2) throws sprjua, sprlqd {
        this.cfr_renamed_2.cfr_renamed_682(arg0, arg1, arg2);
    }

    public sprbva[] cfr_renamed_681() throws sprlqd {
        return this.cfr_renamed_2.cfr_renamed_681();
    }

    public sprpa cfr_renamed_680(spraa arg0) throws sprfya {
        return this.cfr_renamed_2.cfr_renamed_680(arg0);
    }

    public byte[] cfr_renamed_480() {
        if (this.cfr_renamed_3.cfr_renamed_480() != null) {
            return this.cfr_renamed_3.cfr_renamed_480().cfr_renamed_186();
        }
        return null;
    }

    public void cfr_renamed_673(spraa arg0, byte[] arg1) throws sprjua, sprlqd {
        this.cfr_renamed_2.cfr_renamed_673(arg0, arg1);
    }

    public sprvte cfr_renamed_671() {
        return this.cfr_renamed_2.cfr_renamed_671();
    }

    /*
     * WARNING - void declaration
     */
    public sprnsa(byte[] byArray) throws IOException {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprnsa(InputStream arg0) throws IOException {
        try {
            this.cfr_renamed_702(sprnte.cfr_renamed_23(new sprgle(arg0).cfr_renamed_24()));
            return;
        }
        catch (ClassCastException classCastException) {
            throw new IOException(new StringBuilder().insert(0, sprvub.cfr_renamed_9("\u001c\n=\r>\u0019<\u000e5K2\u0004?\u001f4\u0005%Qq")).append(classCastException).toString());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException(new StringBuilder().insert(0, sprtma.cfr_renamed_9("\u0017l6k5\u007f7h>-9b4y?c.7z")).append(illegalArgumentException).toString());
        }
    }

    public sprnsa cfr_renamed_703(sprbva arg0) throws sprlqd {
        sprdwe[] sprdweArray = this.cfr_renamed_2.cfr_renamed_676();
        sprdwe[] sprdweArray2 = new sprdwe[sprdweArray.length + 1];
        System.arraycopy(sprdweArray, 0, sprdweArray2, 0, sprdweArray.length);
        sprdweArray2[sprdweArray.length] = new sprdwe(arg0.cfr_renamed_637().cfr_renamed_568());
        return new sprnsa(new sprnte(sprgl.cfr_renamed_93, new sprdve(this.cfr_renamed_3.cfr_renamed_695(), this.cfr_renamed_3.cfr_renamed_683(), this.cfr_renamed_3.cfr_renamed_480(), new sprqre(new spreqe(sprdweArray2)))));
    }

    public URI cfr_renamed_695() throws URISyntaxException {
        sprcae sprcae2 = this.cfr_renamed_3.cfr_renamed_695();
        if (sprcae2 != null) {
            return new URI(sprcae2.cfr_renamed_314());
        }
        return null;
    }

    public sprnsa(sprnte sprnte2) {
        sprnsa sprnsa2 = this;
        sprnsa2.cfr_renamed_702(sprnte2);
    }
}

