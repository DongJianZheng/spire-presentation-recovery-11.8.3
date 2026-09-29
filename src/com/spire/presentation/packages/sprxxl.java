/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprak;
import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spret;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprium;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmve;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsbj;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprtu;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxmm;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class sprxxl {
    private final sprxmm cfr_renamed_152;
    private final sprddm cfr_renamed_112;
    private sprtpl cfr_renamed_119;
    private final sprak cfr_renamed_91;
    private final sprcf cfr_renamed_0;
    private final sprjj cfr_renamed_1;
    private final spret cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private final sprak cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprxxl(sprxmm sprxmm2, sprcf sprcf2, sprjj sprjj2, spret spret2, sprak sprak2, sprak sprak3) {
        void arg5;
        void arg4;
        void arg1;
        void arg0;
        void arg2;
        sprxxl sprxxl2 = this;
        sprxxl sprxxl3 = this;
        void v2 = arg2;
        sprxxl sprxxl4 = this;
        this.cfr_renamed_3 = null;
        sprxxl4.cfr_renamed_152 = arg0;
        sprxxl4.cfr_renamed_0 = arg1;
        this.cfr_renamed_112 = v2.cfr_renamed_615();
        sprxxl3.cfr_renamed_1 = v2;
        sprxxl3.cfr_renamed_91 = arg4;
        sprxxl2.cfr_renamed_4 = arg5;
        sprxxl2.cfr_renamed_2 = spret2;
    }

    public byte[] cfr_renamed_3984() {
        if (this.cfr_renamed_3 != null) {
            return sproze.cfr_renamed_158(this.cfr_renamed_3);
        }
        return null;
    }

    public OutputStream cfr_renamed_3986() {
        if (this.cfr_renamed_1 != null) {
            if (this.cfr_renamed_91 == null) {
                return new sprmve(this.cfr_renamed_1.cfr_renamed_470(), this.cfr_renamed_0.cfr_renamed_470());
            }
            return this.cfr_renamed_1.cfr_renamed_470();
        }
        return this.cfr_renamed_0.cfr_renamed_470();
    }

    public boolean cfr_renamed_613() {
        return this.cfr_renamed_119 != null;
    }

    public void cfr_renamed_10656(sprtpl arg0) {
        this.cfr_renamed_119 = arg0;
    }

    public sprak cfr_renamed_3985() {
        return this.cfr_renamed_91;
    }

    public sprak cfr_renamed_616() {
        return this.cfr_renamed_4;
    }

    public sprtpl cfr_renamed_614() {
        return this.cfr_renamed_119;
    }

    public sprddm cfr_renamed_410() {
        return this.cfr_renamed_112;
    }

    private /* synthetic */ Map cfr_renamed_10657(sprlem arg0, sprddm arg1, sprddm arg2, byte[] arg3) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        if (arg0 != null) {
            hashMap.put("contentType", arg0);
        }
        HashMap<String, Object> hashMap2 = hashMap;
        hashMap2.put("digestAlgID", arg1);
        hashMap.put("signatureAlgID", arg2);
        hashMap.put("digest", sproze.cfr_renamed_158(arg3));
        return hashMap2;
    }

    /*
     * WARNING - void declaration
     */
    public sprxxl(sprxmm sprxmm2, sprcf sprcf2, sprddm sprddm2, spret spret2) {
        void arg2;
        void arg1;
        void arg0;
        sprxxl sprxxl2 = this;
        sprxxl sprxxl3 = this;
        sprxxl sprxxl4 = this;
        sprxxl sprxxl5 = this;
        sprxxl5.cfr_renamed_3 = null;
        sprxxl5.cfr_renamed_152 = arg0;
        sprxxl4.cfr_renamed_0 = arg1;
        sprxxl4.cfr_renamed_112 = arg2;
        sprxxl3.cfr_renamed_1 = null;
        sprxxl3.cfr_renamed_91 = null;
        sprxxl2.cfr_renamed_4 = null;
        sprxxl2.cfr_renamed_2 = spret2;
    }

    public int cfr_renamed_3987() {
        if (this.cfr_renamed_152.cfr_renamed_3972()) {
            return 3;
        }
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    public sprxxl(sprxxl sprxxl2, sprak sprak2, sprak sprak3) {
        void arg1;
        void arg0;
        sprxxl sprxxl3 = this;
        sprxxl sprxxl4 = this;
        void v2 = arg0;
        sprxxl sprxxl5 = this;
        this.cfr_renamed_3 = null;
        sprxxl5.cfr_renamed_152 = arg0.cfr_renamed_152;
        sprxxl5.cfr_renamed_0 = arg0.cfr_renamed_0;
        this.cfr_renamed_112 = v2.cfr_renamed_112;
        sprxxl4.cfr_renamed_1 = v2.cfr_renamed_1;
        sprxxl4.cfr_renamed_2 = arg0.cfr_renamed_2;
        sprxxl3.cfr_renamed_91 = arg1;
        sprxxl3.cfr_renamed_4 = sprak3;
    }

    public sprium cfr_renamed_10658(sprlem arg0) throws sprlyl {
        try {
            Object object;
            Object object2;
            Object object3;
            sprxxl sprxxl2;
            spridn spridn2 = null;
            sprxxl sprxxl3 = this;
            sprddm sprddm2 = this.cfr_renamed_2.cfr_renamed_10659(sprxxl3.cfr_renamed_0.cfr_renamed_615());
            sprddm sprddm3 = null;
            if (sprxxl3.cfr_renamed_91 != null) {
                sprxxl sprxxl4 = this;
                sprxxl2 = sprxxl4;
                sprddm3 = sprxxl4.cfr_renamed_1.cfr_renamed_615();
                sprxxl4.cfr_renamed_3 = sprxxl4.cfr_renamed_1.cfr_renamed_580();
                object3 = sprxxl4.cfr_renamed_10657(arg0, this.cfr_renamed_1.cfr_renamed_615(), sprddm2, this.cfr_renamed_3);
                object2 = sprxxl4.cfr_renamed_91.cfr_renamed_134(Collections.unmodifiableMap(object3));
                spridn2 = sprxxl4.cfr_renamed_10660((sprjpm)object2);
                object = sprxxl4.cfr_renamed_0.cfr_renamed_470();
                ((OutputStream)object).write(spridn2.cfr_renamed_104("DER"));
                ((OutputStream)object).close();
            } else {
                sprxxl sprxxl5 = this;
                sprddm3 = sprxxl5.cfr_renamed_112;
                if (sprxxl5.cfr_renamed_1 != null) {
                    sprxxl sprxxl6 = this;
                    sprxxl2 = sprxxl6;
                    sprxxl6.cfr_renamed_3 = sprxxl6.cfr_renamed_1.cfr_renamed_580();
                } else {
                    sprxxl2 = this;
                    this.cfr_renamed_3 = null;
                }
            }
            object3 = sprxxl2.cfr_renamed_0.cfr_renamed_79();
            object2 = null;
            if (this.cfr_renamed_4 != null) {
                object = this.cfr_renamed_10657(arg0, sprddm3, sprddm2, this.cfr_renamed_3);
                object.put("encryptedDigest", sproze.cfr_renamed_158(object3));
                sprxxl sprxxl7 = this;
                object2 = sprxxl7.cfr_renamed_10660(sprxxl7.cfr_renamed_4.cfr_renamed_134(Collections.unmodifiableMap(object)));
            }
            if (this.cfr_renamed_91 == null && sprtu.cfr_renamed_2.cfr_renamed_5078(sprddm2.cfr_renamed_593())) {
                sprddm3 = new sprddm(sprwr.spr\ufe34);
            }
            return new sprium(this.cfr_renamed_152, sprddm3, spridn2, sprddm2, (sproug)new sprfvg((byte[])object3), (spridn)object2);
        }
        catch (IOException iOException) {
            throw new sprlyl(sprsbj.cfr_renamed_9("zF|G{AqO?MmZpZ1"), iOException);
        }
    }

    private /* synthetic */ spridn cfr_renamed_10660(sprjpm arg0) {
        if (arg0 != null) {
            return new sprocn(arg0.cfr_renamed_3968());
        }
        return null;
    }

    public sprxmm cfr_renamed_634() {
        return this.cfr_renamed_152;
    }
}

