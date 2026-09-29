/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprem;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprfve;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprggb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprn;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprqa;
import com.spire.presentation.packages.sprqqd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruva;
import com.spire.presentation.packages.sprvte;
import com.spire.presentation.packages.sprwme;
import com.spire.presentation.packages.sprxky;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprza;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class sprbod {
    private sprcyd cfr_renamed_152;
    private final sprem cfr_renamed_112;
    private final sprn cfr_renamed_119;
    private final sprqa cfr_renamed_91;
    private final sprpa cfr_renamed_0;
    private final sprn cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private final sprza cfr_renamed_3;
    private final sprwme cfr_renamed_4;

    public byte[] cfr_renamed_3984() {
        if (this.cfr_renamed_2 != null) {
            return sprzra.cfr_renamed_158(this.cfr_renamed_2);
        }
        return null;
    }

    public sprn cfr_renamed_3985() {
        return this.cfr_renamed_119;
    }

    public OutputStream cfr_renamed_3986() {
        if (this.cfr_renamed_0 != null) {
            if (this.cfr_renamed_119 == null) {
                return new spruva(this.cfr_renamed_0.cfr_renamed_470(), this.cfr_renamed_91.cfr_renamed_470());
            }
            return this.cfr_renamed_0.cfr_renamed_470();
        }
        return this.cfr_renamed_91.cfr_renamed_470();
    }

    /*
     * WARNING - void declaration
     */
    public sprbod(sprwme sprwme2, sprqa sprqa2, spraa spraa2, sprem sprem2, sprn sprn2, sprn sprn3) throws sprfya {
        void arg3;
        void arg5;
        void arg4;
        sprbod sprbod2;
        void arg1;
        void arg0;
        sprbod sprbod3 = this;
        sprbod sprbod4 = this;
        this.cfr_renamed_3 = new sprggb();
        this.cfr_renamed_2 = null;
        sprbod3.cfr_renamed_4 = arg0;
        sprbod3.cfr_renamed_91 = arg1;
        if (spraa2 != null) {
            void arg2;
            sprbod sprbod5 = this;
            sprbod2 = sprbod5;
            sprbod5.cfr_renamed_0 = arg2.cfr_renamed_578(sprbod5.cfr_renamed_3.cfr_renamed_1572(arg1.cfr_renamed_615()));
        } else {
            sprbod2 = this;
            this.cfr_renamed_0 = null;
        }
        sprbod2.cfr_renamed_119 = arg4;
        sprbod sprbod6 = this;
        sprbod6.cfr_renamed_1 = arg5;
        sprbod6.cfr_renamed_112 = arg3;
    }

    public int cfr_renamed_3987() {
        if (this.cfr_renamed_4.cfr_renamed_3972()) {
            return 3;
        }
        return 1;
    }

    public sprcyd cfr_renamed_614() {
        return this.cfr_renamed_152;
    }

    public sprfve cfr_renamed_3988(sprtzd arg0) throws sprlqd {
        try {
            Object object;
            Object object2;
            Object object3;
            sprbod sprbod2;
            sprere sprere2 = null;
            sprije sprije2 = null;
            if (this.cfr_renamed_119 != null) {
                sprbod sprbod3 = this;
                sprbod2 = sprbod3;
                sprije2 = sprbod3.cfr_renamed_0.cfr_renamed_615();
                sprbod3.cfr_renamed_2 = sprbod3.cfr_renamed_0.cfr_renamed_580();
                object3 = sprbod3.cfr_renamed_3989(arg0, this.cfr_renamed_0.cfr_renamed_615(), this.cfr_renamed_2);
                object2 = sprbod3.cfr_renamed_119.cfr_renamed_134(Collections.unmodifiableMap(object3));
                sprere2 = sprbod3.cfr_renamed_3990((sprvte)object2);
                object = sprbod3.cfr_renamed_91.cfr_renamed_470();
                ((OutputStream)object).write(sprere2.cfr_renamed_104("DER"));
                ((OutputStream)object).close();
            } else if (this.cfr_renamed_0 != null) {
                sprbod sprbod4 = this;
                sprbod2 = sprbod4;
                sprije2 = sprbod4.cfr_renamed_0.cfr_renamed_615();
                sprbod4.cfr_renamed_2 = sprbod4.cfr_renamed_0.cfr_renamed_580();
            } else {
                sprbod sprbod5 = this;
                sprbod2 = sprbod5;
                sprije2 = sprbod5.cfr_renamed_3.cfr_renamed_1572(this.cfr_renamed_91.cfr_renamed_615());
                this.cfr_renamed_2 = null;
            }
            object3 = sprbod2.cfr_renamed_91.cfr_renamed_79();
            object2 = null;
            if (this.cfr_renamed_1 != null) {
                sprbod sprbod6 = this;
                object = sprbod6.cfr_renamed_3989(arg0, sprije2, sprbod6.cfr_renamed_2);
                object.put("encryptedDigest", sprzra.cfr_renamed_158(object3));
                sprbod sprbod7 = this;
                object2 = sprbod7.cfr_renamed_3990(sprbod7.cfr_renamed_1.cfr_renamed_134(Collections.unmodifiableMap(object)));
            }
            sprbod sprbod8 = this;
            object = sprbod8.cfr_renamed_112.cfr_renamed_3991(sprbod8.cfr_renamed_91.cfr_renamed_615());
            return new sprfve(this.cfr_renamed_4, sprije2, sprere2, (sprije)object, (sprxue)new sprlqe((byte[])object3), (sprere)object2);
        }
        catch (IOException iOException) {
            throw new sprlqd(sprxky.cfr_renamed_9("tar`uf\u007fh1jc}~}?"), iOException);
        }
    }

    public void cfr_renamed_3982(sprcyd arg0) {
        this.cfr_renamed_152 = arg0;
    }

    public sprbod(sprwme arg0, sprqa arg1, spraa arg2, sprem arg3) throws sprfya {
        this(arg0, arg1, arg2, arg3, false);
    }

    /*
     * WARNING - void declaration
     */
    public sprbod(sprbod sprbod2, sprn sprn2, sprn sprn3) {
        void arg1;
        void arg0;
        sprbod sprbod3 = this;
        sprbod sprbod4 = this;
        void v2 = arg0;
        sprbod sprbod5 = this;
        sprbod sprbod6 = this;
        sprbod6.cfr_renamed_3 = new sprggb();
        sprbod5.cfr_renamed_2 = null;
        sprbod5.cfr_renamed_4 = arg0.cfr_renamed_4;
        this.cfr_renamed_91 = v2.cfr_renamed_91;
        sprbod4.cfr_renamed_0 = v2.cfr_renamed_0;
        sprbod4.cfr_renamed_112 = arg0.cfr_renamed_112;
        sprbod3.cfr_renamed_119 = arg1;
        sprbod3.cfr_renamed_1 = sprn3;
    }

    /*
     * WARNING - void declaration
     */
    public sprbod(sprwme sprwme2, sprqa sprqa2, spraa spraa2, sprem sprem2, boolean bl) throws sprfya {
        void arg3;
        sprbod sprbod2;
        void v2;
        void arg4;
        void arg1;
        void arg0;
        sprbod sprbod3 = this;
        sprbod sprbod4 = this;
        this.cfr_renamed_3 = new sprggb();
        this.cfr_renamed_2 = null;
        sprbod3.cfr_renamed_4 = arg0;
        sprbod3.cfr_renamed_91 = arg1;
        if (spraa2 != null) {
            void arg2;
            v2 = arg4;
            this.cfr_renamed_0 = arg2.cfr_renamed_578(this.cfr_renamed_3.cfr_renamed_1572(arg1.cfr_renamed_615()));
        } else {
            this.cfr_renamed_0 = null;
            v2 = arg4;
        }
        if (v2 != false) {
            sprbod2 = this;
            this.cfr_renamed_119 = null;
            this.cfr_renamed_1 = null;
        } else {
            sprbod2 = this;
            sprbod sprbod5 = this;
            sprbod5.cfr_renamed_119 = new sprqqd();
            sprbod5.cfr_renamed_1 = null;
        }
        sprbod2.cfr_renamed_112 = arg3;
    }

    private /* synthetic */ sprere cfr_renamed_3990(sprvte arg0) {
        if (arg0 != null) {
            return new sprcwe(arg0.cfr_renamed_3968());
        }
        return null;
    }

    public sprn cfr_renamed_616() {
        return this.cfr_renamed_1;
    }

    public sprwme cfr_renamed_634() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ Map cfr_renamed_3989(sprtzd arg0, sprije arg1, byte[] arg2) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        if (arg0 != null) {
            hashMap.put("contentType", arg0);
        }
        HashMap<String, Object> hashMap2 = hashMap;
        hashMap2.put("digestAlgID", arg1);
        hashMap.put("digest", sprzra.cfr_renamed_158(arg2));
        return hashMap2;
    }

    public boolean cfr_renamed_613() {
        return this.cfr_renamed_152 != null;
    }

    public sprije cfr_renamed_410() {
        if (this.cfr_renamed_0 != null) {
            return this.cfr_renamed_0.cfr_renamed_615();
        }
        sprbod sprbod2 = this;
        return sprbod2.cfr_renamed_3.cfr_renamed_1572(sprbod2.cfr_renamed_91.cfr_renamed_615());
    }
}

