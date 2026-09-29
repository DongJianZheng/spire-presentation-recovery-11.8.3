/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.sprbsa;
import com.spire.presentation.packages.sprbva;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprgre;
import com.spire.presentation.packages.sprjua;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprpwa;
import com.spire.presentation.packages.sprsfy;
import com.spire.presentation.packages.spruua;
import com.spire.presentation.packages.sprvpe;
import com.spire.presentation.packages.sprvte;
import com.spire.presentation.packages.sprzyo;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

public class spruwa
extends spruua {
    private sprvpe cfr_renamed_3;
    private sprpwa cfr_renamed_4;

    public void cfr_renamed_677(sprpa arg0) throws sprlqd {
        this.cfr_renamed_4.cfr_renamed_677(arg0);
    }

    public spruwa(InputStream arg0) throws sprlqd {
        spruwa spruwa2 = this;
        super(arg0);
        spruwa2.cfr_renamed_693((sprgre)((Object)spruwa2.cfr_renamed_4));
    }

    public void cfr_renamed_673(spraa arg0, byte[] arg1) throws sprjua, sprlqd {
        spruwa spruwa2 = this;
        spruwa2.cfr_renamed_694();
        spruwa2.cfr_renamed_4.cfr_renamed_673(arg0, arg1);
    }

    public String cfr_renamed_675() {
        return this.cfr_renamed_4.cfr_renamed_675();
    }

    public void cfr_renamed_682(spraa arg0, byte[] arg1, sprbva arg2) throws sprjua, sprlqd {
        spruwa spruwa2 = this;
        spruwa2.cfr_renamed_694();
        spruwa2.cfr_renamed_4.cfr_renamed_682(arg0, arg1, arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_694() throws sprlqd {
        try {
            if (this.cfr_renamed_4 != null) return;
            InputStream inputStream = this.cfr_renamed_480();
            if (inputStream != null) {
                sprbsa.cfr_renamed_477(inputStream);
            }
            this.cfr_renamed_4 = new sprpwa(this.cfr_renamed_3);
            return;
        }
        catch (IOException iOException) {
            throw new sprlqd(new StringBuilder().insert(0, sprsfy.cfr_renamed_9("2\u001b&\u0017+\u0010g\u0001(U7\u00145\u0006\"U\"\u0003.\u0011\"\u001b$\u0010g\u0017+\u001a$\u001e}U")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public byte[] cfr_renamed_679(sprpa arg0) throws sprlqd {
        return this.cfr_renamed_4.cfr_renamed_679(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprpa cfr_renamed_680(spraa arg0) throws sprfya {
        try {
            this.cfr_renamed_694();
            return this.cfr_renamed_4.cfr_renamed_680(arg0);
        }
        catch (sprlqd sprlqd2) {
            throw new sprfya(new StringBuilder().insert(0, sprzyo.cfr_renamed_9("[!O-B*\u000e;AoK7Z=O,ZoO#I \\&Z'Cog\u000b\u0014o")).append(sprlqd2.getMessage()).toString(), sprlqd2);
        }
    }

    public URI cfr_renamed_695() throws URISyntaxException {
        sprcae sprcae2 = this.cfr_renamed_3.cfr_renamed_695();
        if (sprcae2 != null) {
            return new URI(sprcae2.cfr_renamed_314());
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public spruwa(byte[] byArray) throws sprlqd {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_693(sprgre arg0) throws sprlqd {
        try {
            if (sprgl.cfr_renamed_93.equals(arg0.cfr_renamed_696())) {
                this.cfr_renamed_3 = sprvpe.cfr_renamed_23(arg0.cfr_renamed_697(16));
                return;
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprsfy.cfr_renamed_9("8&\u0019!\u001a5\u0018\"\u0011g\u0016(\u001b3\u0010)\u0001gXg\u0001>\u0005\"U*\u00004\u0001g\u0017\"U")).append(sprgl.cfr_renamed_93.cfr_renamed_19()).toString());
        }
        catch (IOException iOException) {
            throw new sprlqd(new StringBuilder().insert(0, sprzyo.cfr_renamed_9("?O=]&@(\u000e*V,K?Z&A!\u0014o")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public String cfr_renamed_678() {
        return this.cfr_renamed_4.cfr_renamed_678();
    }

    public InputStream cfr_renamed_480() {
        if (this.cfr_renamed_3.cfr_renamed_480() != null) {
            return this.cfr_renamed_3.cfr_renamed_480().cfr_renamed_698();
        }
        return null;
    }

    public sprvte cfr_renamed_671() {
        return this.cfr_renamed_4.cfr_renamed_671();
    }

    public sprbva[] cfr_renamed_681() throws sprlqd {
        spruwa spruwa2 = this;
        spruwa2.cfr_renamed_694();
        return spruwa2.cfr_renamed_4.cfr_renamed_681();
    }
}

